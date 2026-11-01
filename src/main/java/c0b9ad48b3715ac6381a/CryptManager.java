package net.minecraft.util;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class CryptManager {

private static org.apache.logging.log4j.Logger a;

private static long b;

private static long[] c;

private static java.lang.Integer[] d;

private static java.util.Map e;

public CryptManager() {
super();
}


static {
b = ((long)(((moom._a)(moom._c.a(((long)(7295174332499029665L)), ((long)(1788099482898680641L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(167326926158185L)))));
    e = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (net.minecraft.util.CryptManager.b ^ 116355570797194L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1211_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1211_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1211_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1211_14 = new byte[8];
    (__sourceSpill1211_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1211_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1211_16 = __sourceSpill1211_14;
    ((javax.crypto.Cipher)(__sourceSpill1211_11)).init(((int)(__sourceSpill1211_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1211_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1211_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "hg3j,\r\f¬o÷Z;×z"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1211_25 = local6_life21;
        int __sourceSpill1211_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1211_25)).substring(((int)(__sourceSpill1211_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1211_30 = local8_life19;
        int __sourceSpill1211_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1211_33 = new byte[8];
        (__sourceSpill1211_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1211_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1211_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1211_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1211_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1211_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1211_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1211_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1211_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1211_34)).doFinal(((byte[])(__sourceSpill1211_33)));
        (__sourceSpill1211_30)[__sourceSpill1211_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    c = ((long[])(local8_life19));
    d = ((java.lang.Integer[])(new java.lang.Integer[2]));
    a = ((org.apache.logging.log4j.Logger)(org.apache.logging.log4j.LogManager.getLogger()));
}

private static native <E extends Throwable> javax.crypto.Cipher __sourceHandlerCall_ba888227b44cf6e847e6(int a0, java.lang.String a1, java.security.Key a2) throws E;
private static final class __SourceHandler_ba888227b44cf6e847e6 {

public static javax.crypto.Cipher f266(int p0, java.lang.String p1, java.security.Key p2) throws Throwable {
    javax.crypto.Cipher life3_2;
    life3_2 = __call266_0(p1);
    __call266_1(life3_2, p0, p2);
    return life3_2;
}
public static javax.crypto.Cipher h266_0(java.security.GeneralSecurityException p0) throws Throwable {
    java.security.GeneralSecurityException local1 = p0;
    __call2026600_0(local1);
    __call2026600_2(__fieldRead2026600_1(), "Cipher creation failed!");
    return null;
}
private static native javax.crypto.Cipher __call266_0(java.lang.String a0) throws Throwable;
private static native void __call266_1(javax.crypto.Cipher a0, int a1, java.security.Key a2) throws Throwable;
private static native void __call2026600_0(java.security.GeneralSecurityException a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead2026600_1() throws Throwable;
private static native void __call2026600_2(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;

}

private static native <E extends Throwable> byte[] __sourceHandlerCall_d620e04c4e5f5f47724b(int a0, java.security.Key a1, byte[] a2) throws E;
private static final class __SourceHandler_d620e04c4e5f5f47724b {

public static byte[] f267(int p0, java.security.Key p1, byte[] p2) throws Throwable {
    return __call267_2(__call267_1(p0, __call267_0(p1), p1), p2);
}
public static byte[] h267_0(java.security.GeneralSecurityException p0) throws Throwable {
    java.security.GeneralSecurityException local1 = p0;
    __call2026700_0(local1);
    __call2026700_2(__fieldRead2026700_1(), "Cipher data failed!");
    return null;
}
private static native java.lang.String __call267_0(java.security.Key a0) throws Throwable;
private static native javax.crypto.Cipher __call267_1(int a0, java.lang.String a1, java.security.Key a2) throws Throwable;
private static native byte[] __call267_2(javax.crypto.Cipher a0, byte[] a1) throws Throwable;
private static native void __call2026700_0(java.security.GeneralSecurityException a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead2026700_1() throws Throwable;
private static native void __call2026700_2(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;

}

private static native <E extends Throwable> byte[] __sourceHandlerCall_c6123a9b97855435670f(java.lang.String a0, byte[][] a1) throws E;
private static final class __SourceHandler_c6123a9b97855435670f {

public static byte[] f627(java.lang.String p0, byte[][] p1) throws Throwable {
    java.security.MessageDigest lexicalValue627_32_0;
    java.security.MessageDigest spill627_0;
    long life2_3;
    int life4_5;
    java.security.MessageDigest life5_8;
    byte[][] life6_10;
    int life7_13;
    int life8_15;
    byte[] life9_22;
    lexical_join_32: {
    lexical_join_31: {
    life2_3 = (__fieldRead627_0() ^ 9881324490875L);
    life4_5 = __integerCategory627_2(__call627_1());
    life5_8 = __call627_3(p0);
    life6_10 = p1;
    life7_13 = (life6_10).length;
    life8_15 = 0;
    lexical_cycle_16: while (true) {
    if (!((life8_15 < life7_13))) {
        break lexical_join_31;
    }
    life9_22 = (life6_10)[life8_15];
    spill627_0 = life5_8;
    if (!((life4_5 != 0))) {
        lexicalValue627_32_0 = spill627_0;
        break lexical_join_32;
    }
    __call627_4(spill627_0, life9_22);
    life8_15 += 1;
    if (!((life4_5 == 0))) { continue lexical_cycle_16; }
    break lexical_cycle_16;
    }
    }
    lexicalValue627_32_0 = life5_8;
    }
    return __call627_5(lexicalValue627_32_0);
}
public static byte[] h627_0(java.security.NoSuchAlgorithmException p0) throws Throwable {
    throw __call2062700_0(p0);
}
public static byte[] h627_1(java.security.NoSuchAlgorithmException p0) throws Throwable {
    java.security.NoSuchAlgorithmException local1 = p0;
    __call2062701_0(local1);
    return null;
}
private static native long __fieldRead627_0() throws Throwable;
private static native boolean __call627_1() throws Throwable;
private static native int __integerCategory627_2(boolean value) throws Throwable;
private static native java.security.MessageDigest __call627_3(java.lang.String a0) throws Throwable;
private static native void __call627_4(java.security.MessageDigest a0, byte[] a1) throws Throwable;
private static native byte[] __call627_5(java.security.MessageDigest a0) throws Throwable;
private static native java.security.NoSuchAlgorithmException __call2062700_0(java.security.NoSuchAlgorithmException a0) throws Throwable;
private static native void __call2062701_0(java.security.NoSuchAlgorithmException a0) throws Throwable;

}

private static native <E extends Throwable> java.security.PublicKey __sourceHandlerCall_08527af9f8ed891fc65a(byte[] a0) throws E;
private static final class __SourceHandler_08527af9f8ed891fc65a {

public static java.security.PublicKey f268(byte[] p0) throws Throwable {
    java.security.spec.X509EncodedKeySpec life1_4;
    java.security.KeyFactory life2_7;
    life1_4 = new java.security.spec.X509EncodedKeySpec(p0);
    life2_7 = __call268_0("RSA");
    return __call268_1(life2_7, life1_4);
}
public static java.security.PublicKey h268_0(java.security.GeneralSecurityException p0) throws Throwable {
    java.security.GeneralSecurityException local1 = p0;
    __call2026800_1(__fieldRead2026800_0(), "Public key reconstitute failed!");
    return null;
}
private static native java.security.KeyFactory __call268_0(java.lang.String a0) throws Throwable;
private static native java.security.PublicKey __call268_1(java.security.KeyFactory a0, java.security.spec.X509EncodedKeySpec a1) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead2026800_0() throws Throwable;
private static native void __call2026800_1(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;

}


public static byte[] b(java.security.Key p0, byte[] p1) {
return net.minecraft.util.CryptManager.a(((int)(2)), ((java.security.Key)(p0)), ((byte[])(p1)));
}


private static java.security.NoSuchAlgorithmException a(java.security.NoSuchAlgorithmException p0) {
return p0;
}


public static javax.crypto.SecretKey a__SecretKey() {
long local0 = (net.minecraft.util.CryptManager.b ^ 22415985174140L);
    try {
        javax.crypto.KeyGenerator local2 = javax.crypto.KeyGenerator.getInstance(((java.lang.String)("AES")));
        ((javax.crypto.KeyGenerator)(local2)).init(((int)(__sourceIntrinsic_fb30563887c8_invokedynamic12347_2(8522, (5643937818853659325L ^ local0)))));
        return ((javax.crypto.KeyGenerator)(local2)).generateKey();
    } catch (java.security.NoSuchAlgorithmException caught2) {
        throw new java.lang.Error(caught2);
    }
}


public static javax.crypto.Cipher a(int p0, java.security.Key p1) {
try {
        javax.crypto.Cipher local2 = javax.crypto.Cipher.getInstance(((java.lang.String)("AES/CFB8/NoPadding")));
        ((javax.crypto.Cipher)(local2)).init(((int)(p0)), ((java.security.Key)(p1)), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(((java.security.Key)(p1)).getEncoded()))));
        return local2;
    } catch (java.security.GeneralSecurityException caught2) {
        throw new java.lang.RuntimeException(caught2);
    }
}


private static javax.crypto.Cipher a(int p0, java.lang.String p1, java.security.Key p2) { return __sourceHandlerCall_ba888227b44cf6e847e6(p0, p1, p2); }


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 27201;
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
            throw new RuntimeException("moom/CT", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         d[var3] = var15;
      }

      return d[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.util.CryptManager.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral12350_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/CT"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public static javax.crypto.SecretKey a(java.security.PrivateKey p0, byte[] p1) {
return new javax.crypto.spec.SecretKeySpec(net.minecraft.util.CryptManager.b(((java.security.Key)(p0)), ((byte[])(p1))), "AES");
}


public static java.security.PublicKey a(byte[] p0) { return __sourceHandlerCall_08527af9f8ed891fc65a(p0); }


private static byte[] a(java.lang.String p0, byte[][] p1) { return __sourceHandlerCall_c6123a9b97855435670f(p0, p1); }


public static byte[] a(java.lang.String p0, java.security.PublicKey p1, javax.crypto.SecretKey p2) {
try {
        return net.minecraft.util.CryptManager.a(((java.lang.String)("SHA-1")), ((byte[][])(new byte[][] {((java.lang.String)(p0)).getBytes(((java.lang.String)("ISO_8859_1"))), ((javax.crypto.SecretKey)(p2)).getEncoded(), ((java.security.PublicKey)(p1)).getEncoded()})));
    } catch (java.io.UnsupportedEncodingException caught3) {
        ((java.io.UnsupportedEncodingException)(caught3)).printStackTrace();
        return null;
    }
}


public static byte[] a(java.security.Key p0, byte[] p1) {
return net.minecraft.util.CryptManager.a(((int)(1)), ((java.security.Key)(p0)), ((byte[])(p1)));
}


public static java.security.KeyPair a() {
long local0 = (net.minecraft.util.CryptManager.b ^ 42429280727607L);
    try {
        java.security.KeyPairGenerator local2 = java.security.KeyPairGenerator.getInstance(((java.lang.String)("RSA")));
        ((java.security.KeyPairGenerator)(local2)).initialize(((int)(__sourceIntrinsic_4a6139138957_invokedynamic12354_2(4845, (8165154249746167120L ^ local0)))));
        return ((java.security.KeyPairGenerator)(local2)).generateKeyPair();
    } catch (java.security.NoSuchAlgorithmException caught2) {
        ((java.security.NoSuchAlgorithmException)(caught2)).printStackTrace();
        ((org.apache.logging.log4j.Logger)(net.minecraft.util.CryptManager.a)).error(((java.lang.String)("Key pair generation failed!")));
        return null;
    }
}


private static byte[] a(int p0, java.security.Key p1, byte[] p2) { return __sourceHandlerCall_d620e04c4e5f5f47724b(p0, p1, p2); }


private static native <E extends Throwable> int __sourceIntrinsic_4a6139138957_invokedynamic12354_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral12350_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fb30563887c8_invokedynamic12347_2(int a0, long a1) throws E;
}
