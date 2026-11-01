package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class ja extends com.moon.i_ {

private java.util.Map<java.lang.String, java.lang.Float> a;

private int[] b;

private float c;

private float d;

private moom.DD e;

private com.moon.jf[] f;

private static long g;

private static java.lang.String[] h;

private static java.lang.String[] i;

private static java.util.Map j;

private static long[] k;

private static java.lang.Integer[] l;

private static java.util.Map m;

public ja(java.lang.String p0, float p1, float p2) { super(); __sourceHandlerCall_eb43a9715df16b1331fc(this, p0, p1, p2); }


static {
g = ((long)(((moom._a)(moom._c.a(((long)(3004421659285583080L)), ((long)(-7372030409314028176L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(207687618850832L)))));
    j = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (com.moon.ja.g ^ 1084392053370L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill195_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill195_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill195_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill195_14 = new byte[8];
    (__sourceSpill195_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill195_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation195_16 = __sourceSpill195_14;
    ((javax.crypto.Cipher)(__sourceSpill195_11)).init(((int)(__sourceSpill195_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill195_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation195_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local20_life19 = new java.lang.String[3];
    int local18_life20 = 0;
    java.lang.String local17_life21;
    int local19_life23 = ((java.lang.String)((local17_life21 = "µ×¨ì\rÁ\022åG\032ß0(áûÝø\000^\022D\n0\026, ¶ÛÖ\005ö³î­}'*ÜÐ®\036R\001õYº\020 ©9ÐRu»èrêäGBé\r"))).length();
    int local16_life24 = 16;
    int local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill195_28 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill195_29 = local13_life9;
        byte[] local21_life31 = ((javax.crypto.Cipher)(__sourceSpill195_29)).doFinal(((byte[])(__sourceSpill195_28)));
        java.lang.String __sourceSpill195_34 = ((java.lang.String)(com.moon.ja.a(((byte[])(local21_life31))))).intern();
        java.lang.String[] __sourceSpill195_35 = local20_life19;
        int __sourceSpill195_36 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill195_35)[__sourceSpill195_36] = __sourceSpill195_34;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    h = ((java.lang.String[])(local20_life19));
    i = ((java.lang.String[])(new java.lang.String[3]));
    m = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life42;
    javax.crypto.Cipher __sourceSpill195_44 = (local0_life42 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill195_45 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill195_46 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill195_47 = new byte[8];
    (__sourceSpill195_47)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life48 = 1;
    while ((local1_life48 < 8)) {
        (__sourceSpill195_47)[local1_life48] = ((byte) ((int) ((local11_life7 << (local1_life48 * 8)) >>> 56)));
        local1_life48 += 1;
    }
    byte[] __sourcePreallocation195_49 = __sourceSpill195_47;
    ((javax.crypto.Cipher)(__sourceSpill195_44)).init(((int)(__sourceSpill195_45)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill195_46)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation195_49)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life52 = new long[18];
    int local3_life53 = 0;
    java.lang.String local4_life54;
    int local5_life56 = ((java.lang.String)((local4_life54 = "}\006{®5Áåf9.³+3ÞG\"kR°Éï¤\031õ\nãLÍ0¨G\027÷v`CÞ«FãçW¾¬C@+Õs;ø¿\\4ÀÙ¹¥`<wî{¹2­´\bUÂ\033Ãü&qoVÜüðÿ\022ó¾¡sWdß\030º\023Èw?ûÐÙ^%Û_äÅÈ3ÉJ\035¾"))).length();
    int local2_life57 = 0;
    do {
        java.lang.String __sourceSpill195_58 = local4_life54;
        int __sourceSpill195_59 = local2_life57;
        local2_life57 += 8;
        byte[] local7_life62 = ((java.lang.String)(((java.lang.String)(__sourceSpill195_58)).substring(((int)(__sourceSpill195_59)), ((int)(local2_life57))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill195_63 = local6_life52;
        int __sourceSpill195_64 = local3_life53;
        local3_life53 += 1;
        long local8_life65 = (((((((((((long) (local7_life62)[0]) & 255L) << 56) | ((((long) (local7_life62)[1]) & 255L) << 48)) | ((((long) (local7_life62)[2]) & 255L) << 40)) | ((((long) (local7_life62)[3]) & 255L) << 32)) | ((((long) (local7_life62)[4]) & 255L) << 24)) | ((((long) (local7_life62)[5]) & 255L) << 16)) | ((((long) (local7_life62)[6]) & 255L) << 8)) | (((long) (local7_life62)[7]) & 255L));
        byte[] __sourceSpill195_66 = new byte[8];
        (__sourceSpill195_66)[0] = ((byte) ((int) (local8_life65 >>> 56)));
        (__sourceSpill195_66)[1] = ((byte) ((int) (local8_life65 >>> 48)));
        (__sourceSpill195_66)[2] = ((byte) ((int) (local8_life65 >>> 40)));
        (__sourceSpill195_66)[3] = ((byte) ((int) (local8_life65 >>> 32)));
        (__sourceSpill195_66)[4] = ((byte) ((int) (local8_life65 >>> 24)));
        (__sourceSpill195_66)[5] = ((byte) ((int) (local8_life65 >>> 16)));
        (__sourceSpill195_66)[6] = ((byte) ((int) (local8_life65 >>> 8)));
        (__sourceSpill195_66)[7] = ((byte) ((int) local8_life65));
        javax.crypto.Cipher __sourceSpill195_67 = local0_life42;
        byte[] local10_life69 = ((javax.crypto.Cipher)(__sourceSpill195_67)).doFinal(((byte[])(__sourceSpill195_66)));
        (__sourceSpill195_63)[__sourceSpill195_64] = (((((((((((long) (local10_life69)[0]) & 255L) << 56) | ((((long) (local10_life69)[1]) & 255L) << 48)) | ((((long) (local10_life69)[2]) & 255L) << 40)) | ((((long) (local10_life69)[3]) & 255L) << 32)) | ((((long) (local10_life69)[4]) & 255L) << 24)) | ((((long) (local10_life69)[5]) & 255L) << 16)) | ((((long) (local10_life69)[6]) & 255L) << 8)) | (((long) (local10_life69)[7]) & 255L));
    } while ((!(local2_life57 >= local5_life56)));
    local5_life56 = ((java.lang.String)((local4_life54 = "(2×\001øãhc\031ìg¼Ü"))).length();
    local2_life57 = 0;
    do {
        java.lang.String __sourceSpill195_71 = local4_life54;
        int __sourceSpill195_72 = local2_life57;
        local2_life57 += 8;
        byte[] local7_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill195_71)).substring(((int)(__sourceSpill195_72)), ((int)(local2_life57))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill195_76 = local6_life52;
        int __sourceSpill195_77 = local3_life53;
        local3_life53 += 1;
        long local8_life78 = (((((((((((long) (local7_life75)[0]) & 255L) << 56) | ((((long) (local7_life75)[1]) & 255L) << 48)) | ((((long) (local7_life75)[2]) & 255L) << 40)) | ((((long) (local7_life75)[3]) & 255L) << 32)) | ((((long) (local7_life75)[4]) & 255L) << 24)) | ((((long) (local7_life75)[5]) & 255L) << 16)) | ((((long) (local7_life75)[6]) & 255L) << 8)) | (((long) (local7_life75)[7]) & 255L));
        byte[] __sourceSpill195_79 = new byte[8];
        (__sourceSpill195_79)[0] = ((byte) ((int) (local8_life78 >>> 56)));
        (__sourceSpill195_79)[1] = ((byte) ((int) (local8_life78 >>> 48)));
        (__sourceSpill195_79)[2] = ((byte) ((int) (local8_life78 >>> 40)));
        (__sourceSpill195_79)[3] = ((byte) ((int) (local8_life78 >>> 32)));
        (__sourceSpill195_79)[4] = ((byte) ((int) (local8_life78 >>> 24)));
        (__sourceSpill195_79)[5] = ((byte) ((int) (local8_life78 >>> 16)));
        (__sourceSpill195_79)[6] = ((byte) ((int) (local8_life78 >>> 8)));
        (__sourceSpill195_79)[7] = ((byte) ((int) local8_life78));
        javax.crypto.Cipher __sourceSpill195_80 = local0_life42;
        byte[] local10_life82 = ((javax.crypto.Cipher)(__sourceSpill195_80)).doFinal(((byte[])(__sourceSpill195_79)));
        (__sourceSpill195_76)[__sourceSpill195_77] = (((((((((((long) (local10_life82)[0]) & 255L) << 56) | ((((long) (local10_life82)[1]) & 255L) << 48)) | ((((long) (local10_life82)[2]) & 255L) << 40)) | ((((long) (local10_life82)[3]) & 255L) << 32)) | ((((long) (local10_life82)[4]) & 255L) << 24)) | ((((long) (local10_life82)[5]) & 255L) << 16)) | ((((long) (local10_life82)[6]) & 255L) << 8)) | (((long) (local10_life82)[7]) & 255L));
    } while ((!(local2_life57 >= local5_life56)));
    k = ((long[])(local6_life52));
    l = ((java.lang.Integer[])(new java.lang.Integer[18]));
}

private static native <E extends Throwable> void __sourceHandlerCall_eb43a9715df16b1331fc(com.moon.ja a0, java.lang.String a1, float a2, float a3) throws E;
private static final class __SourceHandler_eb43a9715df16b1331fc {

public static void f2(com.moon.ja receiver, java.lang.String p0, float p1, float p2) throws Throwable {
    int spill2_0;
    long life4_3;
    com.moon.jg life7_56;
    com.moon.jf[] life8_59;
    int life6_60;
    int life9_63;
    int life10_65;
    com.moon.jf life11_72;
    lexical_join_89: {
    lexical_join_87: {
    life4_3 = (__fieldRead2_0() ^ 63339651464670L);
    spill2_0 = __call2_1();
    __directSuperInit2_2(receiver);
    __fieldWrite2_3(receiver, new java.util.HashMap());
    __fieldWrite2_5(receiver, new int[__invokedynamic2_4(9188, (3265493067713368233L ^ life4_3))]);
    __fieldWrite2_7(receiver, new com.moon.jf[__invokedynamic2_6(3582, (7766595689479569082L ^ life4_3))]);
    java.lang.Object __inlineStack2_9Token;
    __fieldWrite2_12(receiver, new moom.DD(__invokedynamic2_11(__inlineStack2_9Output0((__inlineStack2_9Token = __inlineStack2_9Pack(p0, __invokedynamic2_8(13669, (6313648683051570781L ^ life4_3))))), __inlineStack2_9Output1(__inlineStack2_9Token), __invokedynamic2_10(4837, (6727217360216256991L ^ life4_3)))));
    __fieldWrite2_13(receiver, (p1 * p2));
    __fieldWrite2_14(receiver, p2);
    life7_56 = __call2_15(p0);
    life8_59 = __call2_16(life7_56);
    life6_60 = spill2_0;
    life9_63 = (life8_59).length;
    life10_65 = 0;
    lexical_cycle_66: while (true) {
    if (!((life10_65 < life9_63))) {
        break lexical_join_87;
    }
    life11_72 = (life8_59)[life10_65];
    (__fieldRead2_17(receiver))[__call2_18(life11_72)] = life11_72;
    life10_65 += 1;
    if (!((life6_60 == 0))) {
        break lexical_join_89;
    }
    if (!((life6_60 != 0))) { continue lexical_cycle_66; }
    break lexical_cycle_66;
    }
    __call2_19(new java.lang.String[3]);
    }
    __call2_20(receiver);
    }
    return;
}
private static native long __fieldRead2_0() throws Throwable;
private static native int __call2_1() throws Throwable;
private static native void __directSuperInit2_2(com.moon.ja a0) throws Throwable;
private static native void __fieldWrite2_3(com.moon.ja a0, java.util.HashMap a1) throws Throwable;
private static native int __invokedynamic2_4(int a0, long a1) throws Throwable;
private static native void __fieldWrite2_5(com.moon.ja a0, int[] a1) throws Throwable;
private static native int __invokedynamic2_6(int a0, long a1) throws Throwable;
private static native void __fieldWrite2_7(com.moon.ja a0, com.moon.jf[] a1) throws Throwable;
private static native java.lang.String __invokedynamic2_8(int a0, long a1) throws Throwable;
private static native java.lang.Object __inlineStack2_9Pack(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __inlineStack2_9Output0(java.lang.Object token) throws Throwable;
private static native java.lang.String __inlineStack2_9Output1(java.lang.Object token) throws Throwable;
private static native java.lang.String __invokedynamic2_10(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic2_11(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native void __fieldWrite2_12(com.moon.ja a0, moom.DD a1) throws Throwable;
private static native void __fieldWrite2_13(com.moon.ja a0, float a1) throws Throwable;
private static native void __fieldWrite2_14(com.moon.ja a0, float a1) throws Throwable;
private static native com.moon.jg __call2_15(java.lang.String a0) throws Throwable;
private static native com.moon.jf[] __call2_16(com.moon.jg a0) throws Throwable;
private static native com.moon.jf[] __fieldRead2_17(com.moon.ja a0) throws Throwable;
private static native int __call2_18(com.moon.jf a0) throws Throwable;
private static native void __call2_19(java.lang.String[] a0) throws Throwable;
private static native void __call2_20(com.moon.ja a0) throws Throwable;

}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.ja.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral1947_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/ja"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 14808;
      if (l[var3] == null) {
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
         long var5 = k[var3];
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
         Object[] var9 = (Object[])m.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               m.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/ja", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         l[var3] = var15;
      }

      return l[var3];
}


public void b(org.lwjgl.util.vector.Matrix4f p0) {
moom.kZ.i(((int)(0)));
    ((org.lwjgl.util.vector.Matrix4f)(p0)).scale(((org.lwjgl.util.vector.Vector3f)(new org.lwjgl.util.vector.Vector3f(this.d, this.d, 0x1.0p0f))));
    return;
}


public void a(com.moon.hW p0, java.lang.String p1, float p2, float p3, int p4, boolean p5) {
int lexicalValue120_52_0;
    int lexicalValue120_52_1;
    int lexicalValue120_67_0;
    int lexicalValue120_67_1;
    int lexicalValue120_77_0;
    int lexicalValue120_77_1;
    int lexicalValue120_79_0;
    int lexicalValue120_93_0;
    int lexicalValue120_117_0;
    int lexicalValue120_172_0;
    int lexicalValue120_172_1;
    int lexicalValue120_201_0;
    int spill120_0;
    int spill120_1;
    int spill120_2;
    int spill120_3;
    int spill120_4;
    int spill120_5;
    int spill120_6;
    int spill120_7;
    long life7_3;
    float life10_7;
    float life3_11;
    float life4_15;
    int life9_16;
    float life11_18;
    float[] life12_21;
    char[] life13_24;
    int life14_26;
    int life15_34;
    int life16_123;
    int life17_156;
    com.moon.jf life16_257;
    float life17_270;
    float life18_276;
    float life19_282;
    float life20_288;
    float life21_297;
    float life22_306;
    lexical_join_284: {
    lexical_join_279: {
    life7_3 = (com.moon.ja.g ^ 75113705142619L);
    spill120_0 = com.moon.jg.c();
    life10_7 = this.d;
    life3_11 = (p2 * life10_7);
    life4_15 = (p3 * life10_7);
    life9_16 = spill120_0;
    life11_18 = life3_11;
    life12_21 = com.moon.nD.a(((int)(p4)));
    life13_24 = ((java.lang.String)(p1)).toCharArray();
    life14_26 = 0;
    lexical_cycle_27: while (true) {
    lexical_join_276: {
    lexical_join_214: {
    lexical_join_205: {
    lexical_join_202: {
    lexical_join_201: {
    lexical_join_172: {
    lexical_join_164: {
    lexical_join_117: {
    lexical_join_113: {
    lexical_join_93: {
    lexical_join_79: {
    lexical_join_77: {
    lexical_join_67: {
    lexical_join_61: {
    lexical_join_52: {
    lexical_join_46: {
    if (!((life14_26 < (life13_24).length))) {
        break lexical_join_279;
    }
    life15_34 = ((int)(((java.lang.String)(p1)).charAt(((int)(life14_26)))));
    spill120_1 = life15_34;
    spill120_2 = __sourceIntrinsic_30ccd5a001e4_invokedynamic120_7(3582, (7766458016112114239L ^ life7_3));
    if (!((life9_16 == 0))) {
        lexicalValue120_52_0 = spill120_1;
        lexicalValue120_52_1 = spill120_2;
        break lexical_join_52;
    }
    if (!((spill120_1 >= spill120_2))) {
        break lexical_join_46;
    }
    if (!((life9_16 != 0))) {
        break lexical_join_276;
    }
    }
    lexicalValue120_52_0 = life15_34;
    lexicalValue120_52_1 = __sourceIntrinsic_30ccd5a001e4_invokedynamic120_8(9188, (3265427967078356012L ^ life7_3));
    }
    if (!((life9_16 == 0))) {
        lexicalValue120_67_0 = lexicalValue120_52_0;
        lexicalValue120_67_1 = lexicalValue120_52_1;
        break lexical_join_67;
    }
    if (!((lexicalValue120_52_0 == lexicalValue120_52_1))) {
        break lexical_join_61;
    }
    life11_18 = (life11_18 + 0x1.8p1f);
    if (!((life9_16 != 0))) {
        break lexical_join_276;
    }
    }
    lexicalValue120_67_0 = life15_34;
    lexicalValue120_67_1 = __sourceIntrinsic_30ccd5a001e4_invokedynamic120_9(11379, (4457775559189650365L ^ life7_3));
    }
    if (!((life9_16 == 0))) {
        lexicalValue120_77_0 = lexicalValue120_67_0;
        lexicalValue120_77_1 = lexicalValue120_67_1;
        break lexical_join_77;
    }
    if (!((lexicalValue120_67_0 == lexicalValue120_67_1))) {
        break lexical_join_205;
    }
    spill120_3 = (life14_26 + 1);
    if (!((life9_16 == 0))) {
        lexicalValue120_79_0 = spill120_3;
        break lexical_join_79;
    }
    lexicalValue120_77_0 = spill120_3;
    lexicalValue120_77_1 = ((java.lang.String)(p1)).length();
    }
    if (!((lexicalValue120_77_0 < lexicalValue120_77_1))) {
        break lexical_join_205;
    }
    lexicalValue120_79_0 = ((p5) ? 1 : 0);
    }
    if (!((life9_16 == 0))) {
        lexicalValue120_93_0 = lexicalValue120_79_0;
        break lexical_join_93;
    }
    if (!((lexicalValue120_79_0 == 0))) {
        break lexical_join_202;
    }
    lexicalValue120_93_0 = ((java.lang.String)(__sourceIntrinsic_30ccd5a001e4_invokedynamic120_12(6091, (1581897068006862967L ^ life7_3)))).indexOf(((int)(((java.lang.String)(p1)).charAt(((int)((life14_26 + 1)))))));
    }
    life16_123 = lexicalValue120_93_0;
    spill120_4 = life16_123;
    spill120_5 = __sourceIntrinsic_30ccd5a001e4_invokedynamic120_15(9126, (2019342122425767017L ^ life7_3));
    if (!((life9_16 == 0))) {
        lexicalValue120_172_0 = spill120_4;
        lexicalValue120_172_1 = spill120_5;
        break lexical_join_172;
    }
    if (!((spill120_4 < spill120_5))) {
        break lexical_join_164;
    }
    spill120_6 = life16_123;
    if (!((life9_16 == 0))) {
        lexicalValue120_117_0 = spill120_6;
        break lexical_join_117;
    }
    if (!((spill120_6 < 0))) {
        break lexical_join_113;
    }
    life16_123 = __sourceIntrinsic_30ccd5a001e4_invokedynamic120_16(3152, (5634478047814187933L ^ life7_3));
    }
    lexicalValue120_117_0 = (this.b)[life16_123];
    }
    life17_156 = lexicalValue120_117_0;
    p4 = ((java.awt.Color)(new java.awt.Color(((life17_156 >> __sourceIntrinsic_30ccd5a001e4_invokedynamic120_18(9126, (2019342122425767017L ^ life7_3))) & __sourceIntrinsic_30ccd5a001e4_invokedynamic120_19(5573, (4580119617735287311L ^ life7_3))), ((life17_156 >> __sourceIntrinsic_30ccd5a001e4_invokedynamic120_20(12875, (1910364096092194203L ^ life7_3))) & __sourceIntrinsic_30ccd5a001e4_invokedynamic120_21(5573, (4580119617735287311L ^ life7_3))), (life17_156 & __sourceIntrinsic_30ccd5a001e4_invokedynamic120_22(5573, (4580119617735287311L ^ life7_3))), ((int) ((life12_21)[3] * 0x1.fep7f))))).getRGB();
    if (!((life9_16 != 0))) {
        break lexical_join_202;
    }
    }
    spill120_7 = life16_123;
    if (!((life9_16 == 0))) {
        lexicalValue120_201_0 = spill120_7;
        break lexical_join_201;
    }
    lexicalValue120_172_0 = spill120_7;
    lexicalValue120_172_1 = __sourceIntrinsic_30ccd5a001e4_invokedynamic120_24(26901, (4060647078987210460L ^ life7_3));
    }
    if (!((lexicalValue120_172_0 == lexicalValue120_172_1))) {
        break lexical_join_202;
    }
    lexicalValue120_201_0 = ((java.awt.Color)(new java.awt.Color(((int) ((life12_21)[0] * 0x1.fep7f)), ((int) ((life12_21)[1] * 0x1.fep7f)), ((int) ((life12_21)[2] * 0x1.fep7f)), ((int) ((life12_21)[3] * 0x1.fep7f))))).getRGB();
    }
    p4 = lexicalValue120_201_0;
    }
    life14_26 += 1;
    if (!((life9_16 != 0))) {
        break lexical_join_276;
    }
    }
    life16_257 = (this.f)[life15_34];
    if (!((life16_257 == null))) {
        break lexical_join_214;
    }
    if (!((life9_16 != 0))) {
        break lexical_join_276;
    }
    }
    life17_270 = (life11_18 + ((float) ((com.moon.jf)(life16_257)).d()));
    life18_276 = (life4_15 + ((float) ((com.moon.jf)(life16_257)).e()));
    life19_282 = (((float) ((com.moon.jf)(life16_257)).b()) / 0x1.0p7f);
    life20_288 = (((float) ((com.moon.jf)(life16_257)).c()) / 0x1.0p7f);
    life21_297 = (((float) (((com.moon.jf)(life16_257)).b() + ((com.moon.jf)(life16_257)).d())) / 0x1.0p7f);
    life22_306 = (((float) (((com.moon.jf)(life16_257)).c() + ((com.moon.jf)(life16_257)).e())) / 0x1.0p7f);
    ((com.moon.hW)(p0)).a(((com.moon.iX)(com.moon.i7.a(((float)(life11_18)), ((float)(life4_15)), ((float)(life17_270)), ((float)(life18_276)), ((float)(life19_282)), ((float)(life20_288)), ((float)(life21_297)), ((float)(life22_306)), ((int)(p4))))));
    life11_18 = (life11_18 + ((float) (((com.moon.jf)(life16_257)).d() + 1)));
    }
    life14_26 += 1;
    if (!((life9_16 != 0))) { continue lexical_cycle_27; }
    break lexical_cycle_27;
    }
    }
    if (!((net.minecraft.entity.Entity.b__ArrayString() != null))) {
        break lexical_join_284;
    }
    life9_16 += 1;
    com.moon.jg.b(((int)(life9_16)));
    }
    return;
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.ja.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral1949_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/ja"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private void a__Void() {
int lexicalValue123_83_0;
    int lexicalValue123_83_1;
    int lexicalValue123_96_0;
    int lexicalValue123_96_1;
    int spill123_0;
    int spill123_1;
    int spill123_2;
    long life1_3;
    int life4_6;
    int life3_7;
    int life5_26;
    int life6_40;
    int life7_54;
    int life8_66;
    lexical_join_140: {
    life1_3 = (com.moon.ja.g ^ 100736318933816L);
    spill123_0 = com.moon.jg.c();
    life4_6 = 0;
    life3_7 = spill123_0;
    lexical_cycle_8: while (true) {
    lexical_join_98: {
    lexical_join_96: {
    lexical_join_83: {
    lexical_join_77: {
    if (!((life4_6 < __sourceIntrinsic_b82a5b29b709_invokedynamic123_2(9188, (3265460066641454671L ^ life1_3))))) {
        break lexical_join_140;
    }
    life5_26 = (((life4_6 >> 3) & 1) * __sourceIntrinsic_b82a5b29b709_invokedynamic123_3(22502, (7876695241453228614L ^ life1_3)));
    life6_40 = ((((life4_6 >> 2) & 1) * __sourceIntrinsic_b82a5b29b709_invokedynamic123_4(22014, (4225294423912239190L ^ life1_3))) + life5_26);
    life7_54 = ((((life4_6 >> 1) & 1) * __sourceIntrinsic_b82a5b29b709_invokedynamic123_5(24212, (2524196796776110886L ^ life1_3))) + life5_26);
    life8_66 = (((life4_6 & 1) * __sourceIntrinsic_b82a5b29b709_invokedynamic123_6(24212, (2524196796776110886L ^ life1_3))) + life5_26);
    spill123_1 = life4_6;
    spill123_2 = __sourceIntrinsic_b82a5b29b709_invokedynamic123_7(21431, (824346172695631382L ^ life1_3));
    if (!((life3_7 == 0))) {
        lexicalValue123_83_0 = spill123_1;
        lexicalValue123_83_1 = spill123_2;
        break lexical_join_83;
    }
    if (!((spill123_1 == spill123_2))) {
        break lexical_join_77;
    }
    life6_40 += 85;
    }
    lexicalValue123_83_0 = life4_6;
    lexicalValue123_83_1 = __sourceIntrinsic_b82a5b29b709_invokedynamic123_8(11728, (3999569121257957503L ^ life1_3));
    }
    if (!((life3_7 == 0))) {
        lexicalValue123_96_0 = lexicalValue123_83_0;
        lexicalValue123_96_1 = lexicalValue123_83_1;
        break lexical_join_96;
    }
    if (!((lexicalValue123_83_0 >= lexicalValue123_83_1))) {
        break lexical_join_98;
    }
    life6_40 = (life6_40 / 4);
    life7_54 = (life7_54 / 4);
    lexicalValue123_96_0 = life8_66;
    lexicalValue123_96_1 = 4;
    }
    life8_66 = (lexicalValue123_96_0 / lexicalValue123_96_1);
    }
    (this.b)[life4_6] = ((((life6_40 & __sourceIntrinsic_b82a5b29b709_invokedynamic123_10(13827, (6836151339859620775L ^ life1_3))) << __sourceIntrinsic_b82a5b29b709_invokedynamic123_11(9126, (2019366596138247690L ^ life1_3))) | ((life7_54 & __sourceIntrinsic_b82a5b29b709_invokedynamic123_12(5573, (4580096262826561644L ^ life1_3))) << __sourceIntrinsic_b82a5b29b709_invokedynamic123_13(26594, (6169583663407718980L ^ life1_3)))) | (life8_66 & __sourceIntrinsic_b82a5b29b709_invokedynamic123_14(5573, (4580096262826561644L ^ life1_3))));
    life4_6 += 1;
    if (!((life3_7 != 0))) { continue lexical_cycle_8; }
    break lexical_cycle_8;
    }
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public float a(java.lang.String p0) {
java.util.Map lexicalValue121_16_0;
    java.lang.String lexicalValue121_16_1;
    int lexicalValue121_54_0;
    int lexicalValue121_54_1;
    int lexicalValue121_69_0;
    int lexicalValue121_69_1;
    int lexicalValue121_77_0;
    int lexicalValue121_77_1;
    java.util.Map spill121_0;
    java.lang.String spill121_1;
    int spill121_2;
    int spill121_3;
    long life2_3;
    int life4_5;
    float life5_27;
    int life6_31;
    int life7_33;
    int life8_40;
    com.moon.jf life9_118;
    lexical_join_110: {
    lexical_join_101: {
    lexical_join_20: {
    lexical_join_16: {
    life2_3 = (com.moon.ja.g ^ 58295469558471L);
    life4_5 = com.moon.jg.b();
    spill121_0 = this.a;
    spill121_1 = p0;
    if (!((life4_5 != 0))) {
        lexicalValue121_16_0 = spill121_0;
        lexicalValue121_16_1 = spill121_1;
        break lexical_join_16;
    }
    if (!(((java.util.Map)(spill121_0)).containsKey(((java.lang.Object)(spill121_1))))) {
        break lexical_join_20;
    }
    lexicalValue121_16_0 = this.a;
    lexicalValue121_16_1 = p0;
    }
    return ((java.lang.Float)(((java.lang.Float)(((java.util.Map)(lexicalValue121_16_0)).get(((java.lang.Object)(lexicalValue121_16_1))))))).floatValue();
    }
    life5_27 = 0x0.0p0f;
    life6_31 = (((java.lang.String)(p0)).toCharArray()).length;
    life7_33 = 0;
    lexical_cycle_28: while (true) {
    lexical_join_98: {
    lexical_join_90: {
    lexical_join_81: {
    lexical_join_77: {
    lexical_join_69: {
    lexical_join_63: {
    lexical_join_54: {
    lexical_join_48: {
    if (!((life7_33 < life6_31))) {
        break lexical_join_101;
    }
    life8_40 = ((int)(((java.lang.String)(p0)).charAt(((int)(life7_33)))));
    if (!((life4_5 != 0))) {
        break lexical_join_110;
    }
    spill121_2 = life8_40;
    spill121_3 = __sourceIntrinsic_26cdbb4b15ac_invokedynamic121_11(29375, (8503158439031387877L ^ life2_3));
    if (!((life4_5 != 0))) {
        lexicalValue121_54_0 = spill121_2;
        lexicalValue121_54_1 = spill121_3;
        break lexical_join_54;
    }
    if (!((spill121_2 >= spill121_3))) {
        break lexical_join_48;
    }
    if (!((life4_5 == 0))) {
        break lexical_join_98;
    }
    }
    lexicalValue121_54_0 = life8_40;
    lexicalValue121_54_1 = __sourceIntrinsic_26cdbb4b15ac_invokedynamic121_12(18392, (3077356272261432192L ^ life2_3));
    }
    if (!((life4_5 != 0))) {
        lexicalValue121_69_0 = lexicalValue121_54_0;
        lexicalValue121_69_1 = lexicalValue121_54_1;
        break lexical_join_69;
    }
    if (!((lexicalValue121_54_0 == lexicalValue121_54_1))) {
        break lexical_join_63;
    }
    life5_27 = (life5_27 + 0x1.8p1f);
    if (!((life4_5 == 0))) {
        break lexical_join_98;
    }
    }
    lexicalValue121_69_0 = life8_40;
    lexicalValue121_69_1 = __sourceIntrinsic_26cdbb4b15ac_invokedynamic121_13(23116, (8795494268491144720L ^ life2_3));
    }
    if (!((life4_5 != 0))) {
        lexicalValue121_77_0 = lexicalValue121_69_0;
        lexicalValue121_77_1 = lexicalValue121_69_1;
        break lexical_join_77;
    }
    if (!((lexicalValue121_69_0 == lexicalValue121_69_1))) {
        break lexical_join_81;
    }
    lexicalValue121_77_0 = (life7_33 + 1);
    lexicalValue121_77_1 = ((java.lang.String)(p0)).length();
    }
    if (!((lexicalValue121_77_0 < lexicalValue121_77_1))) {
        break lexical_join_81;
    }
    life7_33 += 1;
    if (!((life4_5 == 0))) {
        break lexical_join_98;
    }
    }
    life9_118 = (this.f)[life8_40];
    if (!((life9_118 == null))) {
        break lexical_join_90;
    }
    if (!((life4_5 == 0))) {
        break lexical_join_98;
    }
    }
    life5_27 = (life5_27 + ((float) (((com.moon.jf)(life9_118)).d() + 1)));
    }
    life7_33 += 1;
    if (!((life4_5 == 0))) { continue lexical_cycle_28; }
    break lexical_cycle_28;
    }
    }
    ((java.util.Map)(this.a)).put(((java.lang.Object)(p0)), ((java.lang.Object)(java.lang.Float.valueOf(((float)((life5_27 - 0x1.0p0f)))))));
    }
    return (life5_27 - 0x1.0p0f);
}


public float a() {
return (this.c / this.d);
}


public void a(org.lwjgl.util.vector.Matrix4f p0) {
moom.kZ.u();
    moom.kZ.l();
    ((net.minecraft.client.renderer.texture.TextureManager)(((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).a__ok())).a__Void(((moom.DD)(this.e)));
    float local2_life7 = this.d;
    ((org.lwjgl.util.vector.Matrix4f)(p0)).scale(((org.lwjgl.util.vector.Vector3f)(new org.lwjgl.util.vector.Vector3f((0x1.0p0f / local2_life7), (0x1.0p0f / local2_life7), 0x1.0p0f))));
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
        byte[] spill597_0 = p0;
        life4_9 += 1;
        life5_44 = (spill597_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill597_1 = p0;
        life4_9 += 1;
        life5_76 = (spill597_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill597_2 = p0;
        life4_9 += 1;
        life5_91 = (spill597_2)[life4_9];
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 10661);
    if (((com.moon.ja.i)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.ja.j)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.ja.j)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/ja", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.ja.h)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.ja.i)[life5_8] = com.moon.ja.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.ja.i)[life5_8];
}


private static native <E extends Throwable> int __sourceIntrinsic_7964a87cf095_invokedynamic2_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7964a87cf095_invokedynamic2_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_7964a87cf095_invokedynamic2_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_30ccd5a001e4_invokedynamic120_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_30ccd5a001e4_invokedynamic120_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_30ccd5a001e4_invokedynamic120_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_30ccd5a001e4_invokedynamic120_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_30ccd5a001e4_invokedynamic120_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_30ccd5a001e4_invokedynamic120_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_30ccd5a001e4_invokedynamic120_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_30ccd5a001e4_invokedynamic120_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_30ccd5a001e4_invokedynamic120_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_30ccd5a001e4_invokedynamic120_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_30ccd5a001e4_invokedynamic120_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_30ccd5a001e4_invokedynamic120_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_26cdbb4b15ac_invokedynamic121_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_26cdbb4b15ac_invokedynamic121_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_26cdbb4b15ac_invokedynamic121_13(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral1949_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic123_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic123_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic123_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic123_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic123_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic123_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic123_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic123_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic123_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic123_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic123_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic123_14(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral1947_0() throws E;
}
