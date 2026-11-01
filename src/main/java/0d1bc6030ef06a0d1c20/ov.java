package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class ov {

private java.security.SecureRandom a;

private byte[] b;

private java.lang.String c;

private java.lang.String d;

private javax.crypto.Cipher e;

private javax.crypto.Cipher f;

private static java.lang.String[] g;

private static long h;

private static java.lang.String[] i;

private static java.lang.String[] j;

private static java.util.Map k;

private static long[] l;

private static java.lang.Integer[] m;

private static java.util.Map n;

public ov(java.lang.String p0, java.lang.String p1) { super(); }

private static void __sourceConstructorBody_4a0862dc6c4102c9(com.moon.ov receiver, java.lang.String p0, java.lang.String p1) throws Throwable {
long local3_life1 = (com.moon.ov.h ^ 119351803324305L);
    java.lang.String[] __sourceSpill277_3 = com.moon.ov.b__ArrayString();
    com.moon.ov.__sourceConstructorInit_4a0862dc6c4102c9_0(((com.moon.ov)(receiver)));
    ((com.moon.ov)(receiver)).a = ((java.security.SecureRandom)(new java.security.SecureRandom()));
    java.lang.String[] local5_life6 = __sourceSpill277_3;
    ((com.moon.ov)(receiver)).b = ((byte[])(((com.moon.ov)(receiver)).a__ArrayByte()));
    ((com.moon.ov)(receiver)).c = ((java.lang.String)(p0));
    ((com.moon.ov)(receiver)).d = ((java.lang.String)(p1));
    if ((local5_life6 == null)) {
        net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[2])));
    }
    return;
}


static {
h = ((long)(((moom._a)(moom._c.a(((long)(-5211916003921118587L)), ((long)(-549186114617598403L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(249191590741140L)))));
    java.lang.String[] __sourceSpill333_6 = new java.lang.String[1];
    k = ((java.util.Map)(new java.util.HashMap(13)));
    com.moon.ov.b(((java.lang.String[])(__sourceSpill333_6)));
    long local11_life9 = (com.moon.ov.h ^ 119336745960821L);
    javax.crypto.Cipher local13_life11;
    javax.crypto.Cipher __sourceSpill333_13 = (local13_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill333_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill333_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill333_16 = new byte[8];
    (__sourceSpill333_16)[0] = ((byte) ((int) (local11_life9 >>> 56)));
    int local14_life17 = 1;
    while ((local14_life17 < 8)) {
        (__sourceSpill333_16)[local14_life17] = ((byte) ((int) ((local11_life9 << (local14_life17 * 8)) >>> 56)));
        local14_life17 += 1;
    }
    byte[] __sourcePreallocation333_18 = __sourceSpill333_16;
    ((javax.crypto.Cipher)(__sourceSpill333_13)).init(((int)(__sourceSpill333_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill333_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation333_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local20_life21 = new java.lang.String[3];
    int local18_life22 = 0;
    java.lang.String local17_life23;
    int local19_life25 = ((java.lang.String)((local17_life23 = "ÑßÛíkiO,·B$ð(} ¿}¾¤µ¶\f\033±ÖÃ é)pJ|KrL\036?\004_Å\013¬/ k\006ö]Ë(Ü1FC(¬H:Û\033\rløÁæ\016.ª*ãH+É\0000è\026<æ/zj"))).length();
    int local16_life26 = 16;
    int local15_life27 = -1;
    while (true) {
        local15_life27 += 1;
        byte[] __sourceSpill333_30 = ((java.lang.String)(((java.lang.String)(local17_life23)).substring(((int)(local15_life27)), ((int)((local15_life27 + local16_life26)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill333_31 = local13_life11;
        byte[] local21_life33 = ((javax.crypto.Cipher)(__sourceSpill333_31)).doFinal(((byte[])(__sourceSpill333_30)));
        java.lang.String __sourceSpill333_36 = ((java.lang.String)(com.moon.ov.c(((byte[])(local21_life33))))).intern();
        java.lang.String[] __sourceSpill333_37 = local20_life21;
        int __sourceSpill333_38 = local18_life22;
        local18_life22 += 1;
        (__sourceSpill333_37)[__sourceSpill333_38] = __sourceSpill333_36;
        if (!(((local15_life27 = (local15_life27 + local16_life26)) < local19_life25))) { break; }
        local16_life26 = ((java.lang.String)(local17_life23)).charAt(((int)(local15_life27)));
    }
    i = ((java.lang.String[])(local20_life21));
    j = ((java.lang.String[])(new java.lang.String[3]));
    n = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life44;
    javax.crypto.Cipher __sourceSpill333_46 = (local0_life44 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill333_47 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill333_48 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill333_49 = new byte[8];
    (__sourceSpill333_49)[0] = ((byte) ((int) (local11_life9 >>> 56)));
    int local1_life50 = 1;
    while ((local1_life50 < 8)) {
        (__sourceSpill333_49)[local1_life50] = ((byte) ((int) ((local11_life9 << (local1_life50 * 8)) >>> 56)));
        local1_life50 += 1;
    }
    byte[] __sourcePreallocation333_51 = __sourceSpill333_49;
    ((javax.crypto.Cipher)(__sourceSpill333_46)).init(((int)(__sourceSpill333_47)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill333_48)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation333_51)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life54 = new long[5];
    int local3_life55 = 0;
    java.lang.String local4_life56;
    int local5_life58 = ((java.lang.String)((local4_life56 = "äÅ½\033¨¯X_ð\016Ø¿W8ÐjnÉ[ò¤"))).length();
    int local2_life59 = 0;
    do {
        java.lang.String __sourceSpill333_60 = local4_life56;
        int __sourceSpill333_61 = local2_life59;
        local2_life59 += 8;
        byte[] local7_life64 = ((java.lang.String)(((java.lang.String)(__sourceSpill333_60)).substring(((int)(__sourceSpill333_61)), ((int)(local2_life59))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill333_65 = local6_life54;
        int __sourceSpill333_66 = local3_life55;
        local3_life55 += 1;
        long local8_life67 = (((((((((((long) (local7_life64)[0]) & 255L) << 56) | ((((long) (local7_life64)[1]) & 255L) << 48)) | ((((long) (local7_life64)[2]) & 255L) << 40)) | ((((long) (local7_life64)[3]) & 255L) << 32)) | ((((long) (local7_life64)[4]) & 255L) << 24)) | ((((long) (local7_life64)[5]) & 255L) << 16)) | ((((long) (local7_life64)[6]) & 255L) << 8)) | (((long) (local7_life64)[7]) & 255L));
        byte[] __sourceSpill333_68 = new byte[8];
        (__sourceSpill333_68)[0] = ((byte) ((int) (local8_life67 >>> 56)));
        (__sourceSpill333_68)[1] = ((byte) ((int) (local8_life67 >>> 48)));
        (__sourceSpill333_68)[2] = ((byte) ((int) (local8_life67 >>> 40)));
        (__sourceSpill333_68)[3] = ((byte) ((int) (local8_life67 >>> 32)));
        (__sourceSpill333_68)[4] = ((byte) ((int) (local8_life67 >>> 24)));
        (__sourceSpill333_68)[5] = ((byte) ((int) (local8_life67 >>> 16)));
        (__sourceSpill333_68)[6] = ((byte) ((int) (local8_life67 >>> 8)));
        (__sourceSpill333_68)[7] = ((byte) ((int) local8_life67));
        javax.crypto.Cipher __sourceSpill333_69 = local0_life44;
        byte[] local10_life71 = ((javax.crypto.Cipher)(__sourceSpill333_69)).doFinal(((byte[])(__sourceSpill333_68)));
        (__sourceSpill333_65)[__sourceSpill333_66] = (((((((((((long) (local10_life71)[0]) & 255L) << 56) | ((((long) (local10_life71)[1]) & 255L) << 48)) | ((((long) (local10_life71)[2]) & 255L) << 40)) | ((((long) (local10_life71)[3]) & 255L) << 32)) | ((((long) (local10_life71)[4]) & 255L) << 24)) | ((((long) (local10_life71)[5]) & 255L) << 16)) | ((((long) (local10_life71)[6]) & 255L) << 8)) | (((long) (local10_life71)[7]) & 255L));
    } while ((!(local2_life59 >= local5_life58)));
    local5_life58 = ((java.lang.String)((local4_life56 = "éâÁ¹ÓÊó­\002º|§©"))).length();
    local2_life59 = 0;
    do {
        java.lang.String __sourceSpill333_73 = local4_life56;
        int __sourceSpill333_74 = local2_life59;
        local2_life59 += 8;
        byte[] local7_life77 = ((java.lang.String)(((java.lang.String)(__sourceSpill333_73)).substring(((int)(__sourceSpill333_74)), ((int)(local2_life59))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill333_78 = local6_life54;
        int __sourceSpill333_79 = local3_life55;
        local3_life55 += 1;
        long local8_life80 = (((((((((((long) (local7_life77)[0]) & 255L) << 56) | ((((long) (local7_life77)[1]) & 255L) << 48)) | ((((long) (local7_life77)[2]) & 255L) << 40)) | ((((long) (local7_life77)[3]) & 255L) << 32)) | ((((long) (local7_life77)[4]) & 255L) << 24)) | ((((long) (local7_life77)[5]) & 255L) << 16)) | ((((long) (local7_life77)[6]) & 255L) << 8)) | (((long) (local7_life77)[7]) & 255L));
        byte[] __sourceSpill333_81 = new byte[8];
        (__sourceSpill333_81)[0] = ((byte) ((int) (local8_life80 >>> 56)));
        (__sourceSpill333_81)[1] = ((byte) ((int) (local8_life80 >>> 48)));
        (__sourceSpill333_81)[2] = ((byte) ((int) (local8_life80 >>> 40)));
        (__sourceSpill333_81)[3] = ((byte) ((int) (local8_life80 >>> 32)));
        (__sourceSpill333_81)[4] = ((byte) ((int) (local8_life80 >>> 24)));
        (__sourceSpill333_81)[5] = ((byte) ((int) (local8_life80 >>> 16)));
        (__sourceSpill333_81)[6] = ((byte) ((int) (local8_life80 >>> 8)));
        (__sourceSpill333_81)[7] = ((byte) ((int) local8_life80));
        javax.crypto.Cipher __sourceSpill333_82 = local0_life44;
        byte[] local10_life84 = ((javax.crypto.Cipher)(__sourceSpill333_82)).doFinal(((byte[])(__sourceSpill333_81)));
        (__sourceSpill333_78)[__sourceSpill333_79] = (((((((((((long) (local10_life84)[0]) & 255L) << 56) | ((((long) (local10_life84)[1]) & 255L) << 48)) | ((((long) (local10_life84)[2]) & 255L) << 40)) | ((((long) (local10_life84)[3]) & 255L) << 32)) | ((((long) (local10_life84)[4]) & 255L) << 24)) | ((((long) (local10_life84)[5]) & 255L) << 16)) | ((((long) (local10_life84)[6]) & 255L) << 8)) | (((long) (local10_life84)[7]) & 255L));
    } while ((!(local2_life59 >= local5_life58)));
    l = ((long[])(local6_life54));
    m = ((java.lang.Integer[])(new java.lang.Integer[5]));
}

private static native <E extends Throwable> void __sourceConstructorInit_4a0862dc6c4102c9_0(com.moon.ov a0) throws E;
private static native <E extends Throwable> javax.crypto.Cipher __sourceHandlerCall_e2351aa9852cd2419657(com.moon.ov a0, int a1, byte[] a2, byte[] a3) throws E;
private static final class __SourceHandler_e2351aa9852cd2419657 {

public static javax.crypto.Cipher f74(com.moon.ov receiver, int p0, byte[] p1, byte[] p2) throws Throwable {
    long life4_3;
    javax.crypto.Cipher life6_10;
    life4_3 = (__fieldRead74_0() ^ 101292184321439L);
    life6_10 = __call74_2(__invokedynamic74_1(31001, (3278734793288933909L ^ life4_3)));
    __call74_5(life6_10, p0, __call74_3(receiver, p1), new javax.crypto.spec.GCMParameterSpec(__invokedynamic74_4(16657, (5787982199608131915L ^ life4_3)), p2));
    return life6_10;
}
public static javax.crypto.Cipher h74_0(java.security.GeneralSecurityException p0) throws Throwable {
    java.security.GeneralSecurityException local1 = p0;
    __call2007400_0(local1);
    return null;
}
private static native long __fieldRead74_0() throws Throwable;
private static native java.lang.String __invokedynamic74_1(int a0, long a1) throws Throwable;
private static native javax.crypto.Cipher __call74_2(java.lang.String a0) throws Throwable;
private static native javax.crypto.SecretKey __call74_3(com.moon.ov a0, byte[] a1) throws Throwable;
private static native int __invokedynamic74_4(int a0, long a1) throws Throwable;
private static native void __call74_5(javax.crypto.Cipher a0, int a1, javax.crypto.SecretKey a2, javax.crypto.spec.GCMParameterSpec a3) throws Throwable;
private static native void __call2007400_0(java.security.GeneralSecurityException a0) throws Throwable;

}

private static native <E extends Throwable> javax.crypto.SecretKey __sourceHandlerCall_f2c2bcecce7977225f9c(com.moon.ov a0, byte[] a1) throws E;
private static final class __SourceHandler_f2c2bcecce7977225f9c {

public static javax.crypto.SecretKey f75(com.moon.ov receiver, byte[] p0) throws Throwable {
    long life2_3;
    javax.crypto.SecretKeyFactory life4_10;
    javax.crypto.spec.PBEKeySpec life5_28;
    life2_3 = (__fieldRead75_0() ^ 136389901207828L);
    life4_10 = __call75_2(__invokedynamic75_1(30687, (6235830564168538203L ^ life2_3)));
    life5_28 = new javax.crypto.spec.PBEKeySpec(__call75_4(__fieldRead75_3(receiver)), p0, __invokedynamic75_5(9241, (8762762754939539658L ^ life2_3)), __invokedynamic75_6(31163, (5592590489647648110L ^ life2_3)));
    return new javax.crypto.spec.SecretKeySpec(__call75_8(__call75_7(life4_10, life5_28)), __invokedynamic75_9(16530, (2094317627474620183L ^ life2_3)));
}
public static javax.crypto.SecretKey h75_0(java.security.GeneralSecurityException p0) throws Throwable {
    java.security.GeneralSecurityException local1 = p0;
    __call2007500_0(local1);
    return null;
}
private static native long __fieldRead75_0() throws Throwable;
private static native java.lang.String __invokedynamic75_1(int a0, long a1) throws Throwable;
private static native javax.crypto.SecretKeyFactory __call75_2(java.lang.String a0) throws Throwable;
private static native java.lang.String __fieldRead75_3(com.moon.ov a0) throws Throwable;
private static native char[] __call75_4(java.lang.String a0) throws Throwable;
private static native int __invokedynamic75_5(int a0, long a1) throws Throwable;
private static native int __invokedynamic75_6(int a0, long a1) throws Throwable;
private static native javax.crypto.SecretKey __call75_7(javax.crypto.SecretKeyFactory a0, javax.crypto.spec.PBEKeySpec a1) throws Throwable;
private static native byte[] __call75_8(javax.crypto.SecretKey a0) throws Throwable;
private static native java.lang.String __invokedynamic75_9(int a0, long a1) throws Throwable;
private static native void __call2007500_0(java.security.GeneralSecurityException a0) throws Throwable;

}

private static native <E extends Throwable> byte[] __sourceHandlerCall_bf0f23f64c3f108944ab(com.moon.ov a0, byte[] a1) throws E;
private static final class __SourceHandler_bf0f23f64c3f108944ab {

public static byte[] f76(com.moon.ov receiver, byte[] p0) throws Throwable {
    byte[] life2_14;
    __fieldWrite76_4(receiver, __call76_3(receiver, 1, __fieldRead76_0(receiver), __call76_2(__fieldRead76_1(receiver))));
    life2_14 = __call76_6(__fieldRead76_5(receiver), p0);
    return __call76_12(__call76_11(__call76_10(__call76_8(((__fieldRead76_7(receiver)).length + (life2_14).length)), __fieldRead76_9(receiver)), life2_14));
}
public static byte[] h76_0(java.security.GeneralSecurityException p0) throws Throwable {
    java.security.GeneralSecurityException local1 = p0;
    return new byte[0];
}
private static native byte[] __fieldRead76_0(com.moon.ov a0) throws Throwable;
private static native java.lang.String __fieldRead76_1(com.moon.ov a0) throws Throwable;
private static native byte[] __call76_2(java.lang.String a0) throws Throwable;
private static native javax.crypto.Cipher __call76_3(com.moon.ov a0, int a1, byte[] a2, byte[] a3) throws Throwable;
private static native void __fieldWrite76_4(com.moon.ov a0, javax.crypto.Cipher a1) throws Throwable;
private static native javax.crypto.Cipher __fieldRead76_5(com.moon.ov a0) throws Throwable;
private static native byte[] __call76_6(javax.crypto.Cipher a0, byte[] a1) throws Throwable;
private static native byte[] __fieldRead76_7(com.moon.ov a0) throws Throwable;
private static native java.nio.ByteBuffer __call76_8(int a0) throws Throwable;
private static native byte[] __fieldRead76_9(com.moon.ov a0) throws Throwable;
private static native java.nio.ByteBuffer __call76_10(java.nio.ByteBuffer a0, byte[] a1) throws Throwable;
private static native java.nio.ByteBuffer __call76_11(java.nio.ByteBuffer a0, byte[] a1) throws Throwable;
private static native byte[] __call76_12(java.nio.ByteBuffer a0) throws Throwable;

}

private static native <E extends Throwable> byte[] __sourceHandlerCall_2fc2856fa0c18eb978e6(com.moon.ov a0, byte[] a1) throws E;
private static final class __SourceHandler_2fc2856fa0c18eb978e6 {

public static byte[] f77(com.moon.ov receiver, byte[] p0) throws Throwable {
    long life2_3;
    java.nio.ByteBuffer life4_6;
    byte[] life5_13;
    byte[] life6_21;
    life2_3 = (__fieldRead77_0() ^ 59533260963640L);
    life4_6 = __call77_1(p0);
    life5_13 = new byte[__invokedynamic77_2(28464, (8934576499929443790L ^ life2_3))];
    __call77_3(life4_6, life5_13);
    life6_21 = new byte[__call77_4(life4_6)];
    __call77_5(life4_6, life6_21);
    __fieldWrite77_9(receiver, __call77_8(receiver, 2, life5_13, __call77_7(__fieldRead77_6(receiver))));
    return __call77_11(__fieldRead77_10(receiver), life6_21);
}
public static byte[] h77_0(java.security.GeneralSecurityException p0) throws Throwable {
    java.security.GeneralSecurityException local1 = p0;
    return new byte[0];
}
private static native long __fieldRead77_0() throws Throwable;
private static native java.nio.ByteBuffer __call77_1(byte[] a0) throws Throwable;
private static native int __invokedynamic77_2(int a0, long a1) throws Throwable;
private static native java.nio.ByteBuffer __call77_3(java.nio.ByteBuffer a0, byte[] a1) throws Throwable;
private static native int __call77_4(java.nio.ByteBuffer a0) throws Throwable;
private static native java.nio.ByteBuffer __call77_5(java.nio.ByteBuffer a0, byte[] a1) throws Throwable;
private static native java.lang.String __fieldRead77_6(com.moon.ov a0) throws Throwable;
private static native byte[] __call77_7(java.lang.String a0) throws Throwable;
private static native javax.crypto.Cipher __call77_8(com.moon.ov a0, int a1, byte[] a2, byte[] a3) throws Throwable;
private static native void __fieldWrite77_9(com.moon.ov a0, javax.crypto.Cipher a1) throws Throwable;
private static native javax.crypto.Cipher __fieldRead77_10(com.moon.ov a0) throws Throwable;
private static native byte[] __call77_11(javax.crypto.Cipher a0, byte[] a1) throws Throwable;

}


public static void b(java.lang.String[] p0) {
g = ((java.lang.String[])(p0));
    return;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral3099_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/ov"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public java.lang.String b() {
return this.d;
}


public javax.crypto.Cipher b__Cipher() {
return this.f;
}


public static java.lang.String[] b__ArrayString() {
return com.moon.ov.g;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 10874;
      if (m[var3] == null) {
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
         long var5 = l[var3];
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
         Object[] var9 = (Object[])n.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               n.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/ov", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         m[var3] = var15;
      }

      return m[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.ov.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public byte[] b(byte[] p0) { return __sourceHandlerCall_2fc2856fa0c18eb978e6(this, p0); }


public byte[] b__ArrayByte() {
return this.b;
}


private static java.lang.String c(byte[] p0) {
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
        byte[] spill1462_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1462_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1462_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1462_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1462_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1462_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static java.lang.String a(int p0, long p1) {
int life5_8;
    java.lang.Long life3_16;
    java.lang.Object[] life4_21;
    byte[] life6_60;
    int life7_70;
    javax.crypto.spec.DESKeySpec life7_92;
    javax.crypto.SecretKey life8_99;
    byte[] life9_116;
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 12590);
    if (((com.moon.ov.j)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.ov.k)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.ov.k)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/ov", life9_51);
    }
        life6_60 = new byte[8];
        (life6_60)[0] = ((byte) ((int) (p1 >>> 56)));
        life7_70 = 1;
        loop_region_71: while ((life7_70 < 8)) {
        (life6_60)[life7_70] = ((byte) ((int) ((p1 << (life7_70 * 8)) >>> 56)));
        life7_70 += 1;
    }
        life7_92 = new javax.crypto.spec.DESKeySpec(life6_60);
        life8_99 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life4_21)[1])))).generateSecret(((java.security.spec.KeySpec)(life7_92)));
        ((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).init(((int)(2)), ((java.security.Key)(life8_99)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life4_21)[2])))));
        life9_116 = ((java.lang.String)((com.moon.ov.i)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.ov.j)[life5_8] = com.moon.ov.c(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.ov.j)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.ov.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral3103_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/ov"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public javax.crypto.Cipher a(int p0, byte[] p1, byte[] p2) { return __sourceHandlerCall_e2351aa9852cd2419657(this, p0, p1, p2); }


public byte[] a__ArrayByte(byte[] p0) { return __sourceHandlerCall_bf0f23f64c3f108944ab(this, p0); }


public java.lang.String a() {
return this.c;
}


public java.security.SecureRandom a__SecureRandom() {
return this.a;
}


public byte[] a__ArrayByte() {
long life1_3;
    byte[] life4_11;
    java.lang.String[] life3_16;
    life1_3 = (com.moon.ov.h ^ 25851894197639L);
    java.lang.String[] spill2570_0 = com.moon.ov.b__ArrayString();
    life4_11 = new byte[__sourceIntrinsic_853112ae7929_invokedynamic2570_2(18745, (5482530293982140794L ^ life1_3))];
    ((java.security.SecureRandom)(this.a)).nextBytes(((byte[])(life4_11)));
    life3_16 = spill2570_0;
    byte[] spill2570_1 = life4_11;
    if ((net.minecraft.entity.Entity.b__ArrayString() != null)) {
        com.moon.ov.b(((java.lang.String[])(new java.lang.String[5])));
    }
    return spill2570_1;
}


public javax.crypto.SecretKey a(byte[] p0) { return __sourceHandlerCall_f2c2bcecce7977225f9c(this, p0); }


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public javax.crypto.Cipher a__Cipher() {
return this.e;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral3103_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_853112ae7929_invokedynamic2570_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral3099_0() throws E;
}
