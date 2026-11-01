package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class bM extends sourcebuild.EnumConstructor<com.moon.bM> implements com.moon.l8 {

public static com.moon.bM V1_8;

public static com.moon.bM V1_7;

public static com.moon.bM SLIDE;

public static com.moon.bM XIV;

public static com.moon.bM EXHIBITION;

public static com.moon.bM OLD_EXHIBITION;

public static com.moon.bM WINGY;

private java.lang.String a;

private static com.moon.bM[] b;

private static long c;

private static long[] d;

private static java.lang.Integer[] e;

private static java.util.Map f;

private bM(java.lang.String p0, int p1, java.lang.String p2) {
super(p0, p1);
    this.a = p2;
}


private static void initialize() {
c = ((long)(((moom._a)(moom._c.a(((long)(1988579264101764581L)), ((long)(7690646814845969841L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(279683080972487L)))));
    long local20_life6 = (com.moon.bM.c ^ 1262031957018L);
    javax.crypto.Cipher local12_life8;
    javax.crypto.Cipher __sourceSpill21_10 = (local12_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill21_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill21_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill21_13 = new byte[8];
    (__sourceSpill21_13)[0] = ((byte) ((int) (local20_life6 >>> 56)));
    int local13_life14 = 1;
    while ((local13_life14 < 8)) {
        (__sourceSpill21_13)[local13_life14] = ((byte) ((int) ((local20_life6 << (local13_life14 * 8)) >>> 56)));
        local13_life14 += 1;
    }
    byte[] __sourcePreallocation21_15 = __sourceSpill21_13;
    ((javax.crypto.Cipher)(__sourceSpill21_10)).init(((int)(__sourceSpill21_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill21_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation21_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local11_life18 = new java.lang.String[14];
    int local17_life19 = 0;
    java.lang.String local16_life20;
    int local18_life22 = ((java.lang.String)((local16_life20 = "\t\013ãvLç\b\020tÉKþAë`«\032-ëÖ¦9úS\bt÷Ûèvæ\032\bw³\021ÛµA\023\020}ÍÐ·Ç÷á$ÁÜvÒv6%\bWÈÐ¿ÍW@\020J,\026m\017°ÑZ¨Á\007òSn\bø_MJH\002Ä\bvG8Ì«Ä\bWÈÐ¿ÍW@\b~w|í+çH\020ìY\032Ñ¥#XC\"¡ÎòÕ®"))).length();
    int local15_life23 = 8;
    int local14_life24 = -1;
    while (true) {
        local14_life24 += 1;
        byte[] __sourceSpill21_27 = ((java.lang.String)(((java.lang.String)(local16_life20)).substring(((int)(local14_life24)), ((int)((local14_life24 + local15_life23)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill21_28 = local12_life8;
        byte[] local19_life30 = ((javax.crypto.Cipher)(__sourceSpill21_28)).doFinal(((byte[])(__sourceSpill21_27)));
        java.lang.String __sourceSpill21_33 = ((java.lang.String)(com.moon.bM.a(((byte[])(local19_life30))))).intern();
        java.lang.String[] __sourceSpill21_34 = local11_life18;
        int __sourceSpill21_35 = local17_life19;
        local17_life19 += 1;
        (__sourceSpill21_34)[__sourceSpill21_35] = __sourceSpill21_33;
        if (!(((local14_life24 = (local14_life24 + local15_life23)) < local18_life22))) { break; }
        local15_life23 = ((java.lang.String)(local16_life20)).charAt(((int)(local14_life24)));
    }
    local18_life22 = ((java.lang.String)((local16_life20 = "8Ù{\002Oú\b¬]ËÜï/?"))).length();
    local15_life23 = 8;
    local14_life24 = -1;
    while (true) {
        local14_life24 += 1;
        byte[] __sourceSpill21_40 = ((java.lang.String)(((java.lang.String)(local16_life20)).substring(((int)(local14_life24)), ((int)((local14_life24 + local15_life23)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill21_41 = local12_life8;
        byte[] local19_life43 = ((javax.crypto.Cipher)(__sourceSpill21_41)).doFinal(((byte[])(__sourceSpill21_40)));
        java.lang.String __sourceSpill21_46 = ((java.lang.String)(com.moon.bM.a(((byte[])(local19_life43))))).intern();
        java.lang.String[] __sourceSpill21_47 = local11_life18;
        int __sourceSpill21_48 = local17_life19;
        local17_life19 += 1;
        (__sourceSpill21_47)[__sourceSpill21_48] = __sourceSpill21_46;
        if (!(((local14_life24 = (local14_life24 + local15_life23)) < local18_life22))) { break; }
        local15_life23 = ((java.lang.String)(local16_life20)).charAt(((int)(local14_life24)));
    }
    f = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life52;
    javax.crypto.Cipher __sourceSpill21_54 = (local0_life52 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill21_55 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill21_56 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill21_57 = new byte[8];
    (__sourceSpill21_57)[0] = ((byte) ((int) (local20_life6 >>> 56)));
    int local1_life58 = 1;
    while ((local1_life58 < 8)) {
        (__sourceSpill21_57)[local1_life58] = ((byte) ((int) ((local20_life6 << (local1_life58 * 8)) >>> 56)));
        local1_life58 += 1;
    }
    byte[] __sourcePreallocation21_59 = __sourceSpill21_57;
    ((javax.crypto.Cipher)(__sourceSpill21_54)).init(((int)(__sourceSpill21_55)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill21_56)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation21_59)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life62 = new long[3];
    int local3_life63 = 0;
    java.lang.String local4_life64;
    int local5_life66 = ((java.lang.String)((local4_life64 = "\013#ïÏäsNj\001\022¬¡ÎÄV¼)"))).length();
    int local2_life67 = 0;
    do {
        java.lang.String __sourceSpill21_68 = local4_life64;
        int __sourceSpill21_69 = local2_life67;
        local2_life67 += 8;
        byte[] local7_life72 = ((java.lang.String)(((java.lang.String)(__sourceSpill21_68)).substring(((int)(__sourceSpill21_69)), ((int)(local2_life67))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill21_73 = local6_life62;
        int __sourceSpill21_74 = local3_life63;
        local3_life63 += 1;
        long local8_life75 = (((((((((((long) (local7_life72)[0]) & 255L) << 56) | ((((long) (local7_life72)[1]) & 255L) << 48)) | ((((long) (local7_life72)[2]) & 255L) << 40)) | ((((long) (local7_life72)[3]) & 255L) << 32)) | ((((long) (local7_life72)[4]) & 255L) << 24)) | ((((long) (local7_life72)[5]) & 255L) << 16)) | ((((long) (local7_life72)[6]) & 255L) << 8)) | (((long) (local7_life72)[7]) & 255L));
        byte[] __sourceSpill21_76 = new byte[8];
        (__sourceSpill21_76)[0] = ((byte) ((int) (local8_life75 >>> 56)));
        (__sourceSpill21_76)[1] = ((byte) ((int) (local8_life75 >>> 48)));
        (__sourceSpill21_76)[2] = ((byte) ((int) (local8_life75 >>> 40)));
        (__sourceSpill21_76)[3] = ((byte) ((int) (local8_life75 >>> 32)));
        (__sourceSpill21_76)[4] = ((byte) ((int) (local8_life75 >>> 24)));
        (__sourceSpill21_76)[5] = ((byte) ((int) (local8_life75 >>> 16)));
        (__sourceSpill21_76)[6] = ((byte) ((int) (local8_life75 >>> 8)));
        (__sourceSpill21_76)[7] = ((byte) ((int) local8_life75));
        javax.crypto.Cipher __sourceSpill21_77 = local0_life52;
        byte[] local10_life79 = ((javax.crypto.Cipher)(__sourceSpill21_77)).doFinal(((byte[])(__sourceSpill21_76)));
        (__sourceSpill21_73)[__sourceSpill21_74] = (((((((((((long) (local10_life79)[0]) & 255L) << 56) | ((((long) (local10_life79)[1]) & 255L) << 48)) | ((((long) (local10_life79)[2]) & 255L) << 40)) | ((((long) (local10_life79)[3]) & 255L) << 32)) | ((((long) (local10_life79)[4]) & 255L) << 24)) | ((((long) (local10_life79)[5]) & 255L) << 16)) | ((((long) (local10_life79)[6]) & 255L) << 8)) | (((long) (local10_life79)[7]) & 255L));
    } while ((!(local2_life67 >= local5_life66)));
    d = ((long[])(local6_life62));
    e = ((java.lang.Integer[])(new java.lang.Integer[3]));
    V1_8 = ((com.moon.bM)(new com.moon.bM((local11_life18)[12], 0, (local11_life18)[7])));
    V1_7 = ((com.moon.bM)(new com.moon.bM((local11_life18)[3], 1, (local11_life18)[13])));
    SLIDE = ((com.moon.bM)(new com.moon.bM((local11_life18)[0], 2, (local11_life18)[2])));
    XIV = ((com.moon.bM)(new com.moon.bM((local11_life18)[9], 3, (local11_life18)[5])));
    EXHIBITION = ((com.moon.bM)(new com.moon.bM((local11_life18)[11], 4, (local11_life18)[6])));
    OLD_EXHIBITION = ((com.moon.bM)(new com.moon.bM((local11_life18)[4], 5, (local11_life18)[1])));
    WINGY = ((com.moon.bM)(new com.moon.bM((local11_life18)[8], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite21_88(1564, (4255857449907843708L ^ local20_life6)), (local11_life18)[10])));
    b = ((com.moon.bM[])(com.moon.bM.a__ArraybM()));
}


public static com.moon.bM[] values() {
return ((com.moon.bM[])(((com.moon.bM[])(com.moon.bM.b)).clone()));
}


public static com.moon.bM valueOf(java.lang.String p0) {
return ((com.moon.bM)(java.lang.Enum.valueOf(((java.lang.Class)(com.moon.bM.class)), ((java.lang.String)(p0)))));
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 30192;
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
            throw new RuntimeException("com/moon/bM", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         e[var3] = var15;
      }

      return e[var3];
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral681_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/bM"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.bM.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
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
        byte[] spill57_0 = p0;
        life4_9 += 1;
        life5_44 = (spill57_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill57_1 = p0;
        life4_9 += 1;
        life5_76 = (spill57_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill57_2 = p0;
        life4_9 += 1;
        life5_91 = (spill57_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static com.moon.bM[] a__ArraybM() {
long local0_life1 = (com.moon.bM.c ^ 4831810151646L);
    com.moon.bM[] __sourceSharedArray15_4 = new com.moon.bM[__sourceIntrinsic_21197331614f_originalDynamicSite15_2(6274, (2082050088500061223L ^ local0_life1))];
    __sourceSharedArray15_4[0] = com.moon.bM.V1_8;
    __sourceSharedArray15_4[1] = com.moon.bM.V1_7;
    __sourceSharedArray15_4[2] = com.moon.bM.SLIDE;
    __sourceSharedArray15_4[3] = com.moon.bM.XIV;
    __sourceSharedArray15_4[4] = com.moon.bM.EXHIBITION;
    __sourceSharedArray15_4[5] = com.moon.bM.OLD_EXHIBITION;
    __sourceSharedArray15_4[__sourceIntrinsic_21197331614f_originalDynamicSite15_10(25525, (3582199232436576018L ^ local0_life1))] = com.moon.bM.WINGY;
    return __sourceSharedArray15_4;
}


public java.lang.String a__String() {
return this.a;
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite21_88(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral681_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_21197331614f_originalDynamicSite15_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_21197331614f_originalDynamicSite15_10(int a0, long a1) throws E;
}
