package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class LY {

private static final long a;

private static final java.lang.String b;

private static final long[] c;

private static final java.lang.Integer[] d;

private static final java.util.Map e;

private static final long[] f;

private static final java.lang.Long[] g;

private static final java.util.Map h;

public LY() {
super();
}


static {
a = ((long)(((moom._a)(moom._c.a(((long)(-5378746517961013847L)), ((long)(-2481262773383357412L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(227140759818592L)))));
    long local22_life6 = (moom.LY.a ^ 121713443248206L);
    javax.crypto.Cipher local24_life8;
    javax.crypto.Cipher __sourceSpill675_10 = (local24_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill675_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill675_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill675_13 = new byte[8];
    (__sourceSpill675_13)[0] = ((byte) ((int) (local22_life6 >>> 56)));
    int local25_life14 = 1;
    while ((local25_life14 < 8)) {
        (__sourceSpill675_13)[local25_life14] = ((byte) ((int) ((local22_life6 << (local25_life14 * 8)) >>> 56)));
        local25_life14 += 1;
    }
    byte[] __sourcePreallocation675_15 = __sourceSpill675_13;
    ((javax.crypto.Cipher)(__sourceSpill675_10)).init(((int)(__sourceSpill675_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill675_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation675_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    byte[] __sourceSpill675_19 = ((java.lang.String)("\002s G½ê")).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __sourceSpill675_20 = local24_life8;
    byte[] local26_life22 = ((javax.crypto.Cipher)(__sourceSpill675_20)).doFinal(((byte[])(__sourceSpill675_19)));
    b = ((java.lang.String)(((java.lang.String)(moom.LY.a(((byte[])(local26_life22))))).intern()));
    e = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local11_life28;
    javax.crypto.Cipher __sourceSpill675_30 = (local11_life28 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill675_31 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill675_32 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill675_33 = new byte[8];
    (__sourceSpill675_33)[0] = ((byte) ((int) (local22_life6 >>> 56)));
    int local12_life34 = 1;
    while ((local12_life34 < 8)) {
        (__sourceSpill675_33)[local12_life34] = ((byte) ((int) ((local22_life6 << (local12_life34 * 8)) >>> 56)));
        local12_life34 += 1;
    }
    byte[] __sourcePreallocation675_35 = __sourceSpill675_33;
    ((javax.crypto.Cipher)(__sourceSpill675_30)).init(((int)(__sourceSpill675_31)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill675_32)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation675_35)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local17_life38 = new long[3];
    int local14_life39 = 0;
    java.lang.String local15_life40;
    int local16_life42 = ((java.lang.String)((local15_life40 = "BZ¡`×\004±£Y\177[*\000\024:iXêÜoD\f"))).length();
    int local13_life43 = 0;
    do {
        java.lang.String __sourceSpill675_44 = local15_life40;
        int __sourceSpill675_45 = local13_life43;
        local13_life43 += 8;
        byte[] local18_life48 = ((java.lang.String)(((java.lang.String)(__sourceSpill675_44)).substring(((int)(__sourceSpill675_45)), ((int)(local13_life43))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill675_49 = local17_life38;
        int __sourceSpill675_50 = local14_life39;
        local14_life39 += 1;
        long local19_life51 = (((((((((((long) (local18_life48)[0]) & 255L) << 56) | ((((long) (local18_life48)[1]) & 255L) << 48)) | ((((long) (local18_life48)[2]) & 255L) << 40)) | ((((long) (local18_life48)[3]) & 255L) << 32)) | ((((long) (local18_life48)[4]) & 255L) << 24)) | ((((long) (local18_life48)[5]) & 255L) << 16)) | ((((long) (local18_life48)[6]) & 255L) << 8)) | (((long) (local18_life48)[7]) & 255L));
        byte[] __sourceSpill675_52 = new byte[8];
        (__sourceSpill675_52)[0] = ((byte) ((int) (local19_life51 >>> 56)));
        (__sourceSpill675_52)[1] = ((byte) ((int) (local19_life51 >>> 48)));
        (__sourceSpill675_52)[2] = ((byte) ((int) (local19_life51 >>> 40)));
        (__sourceSpill675_52)[3] = ((byte) ((int) (local19_life51 >>> 32)));
        (__sourceSpill675_52)[4] = ((byte) ((int) (local19_life51 >>> 24)));
        (__sourceSpill675_52)[5] = ((byte) ((int) (local19_life51 >>> 16)));
        (__sourceSpill675_52)[6] = ((byte) ((int) (local19_life51 >>> 8)));
        (__sourceSpill675_52)[7] = ((byte) ((int) local19_life51));
        javax.crypto.Cipher __sourceSpill675_53 = local11_life28;
        byte[] local21_life55 = ((javax.crypto.Cipher)(__sourceSpill675_53)).doFinal(((byte[])(__sourceSpill675_52)));
        (__sourceSpill675_49)[__sourceSpill675_50] = (((((((((((long) (local21_life55)[0]) & 255L) << 56) | ((((long) (local21_life55)[1]) & 255L) << 48)) | ((((long) (local21_life55)[2]) & 255L) << 40)) | ((((long) (local21_life55)[3]) & 255L) << 32)) | ((((long) (local21_life55)[4]) & 255L) << 24)) | ((((long) (local21_life55)[5]) & 255L) << 16)) | ((((long) (local21_life55)[6]) & 255L) << 8)) | (((long) (local21_life55)[7]) & 255L));
    } while ((!(local13_life43 >= local16_life42)));
    c = ((long[])(local17_life38));
    d = ((java.lang.Integer[])(new java.lang.Integer[3]));
    h = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life60;
    javax.crypto.Cipher __sourceSpill675_62 = (local0_life60 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill675_63 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill675_64 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill675_65 = new byte[8];
    (__sourceSpill675_65)[0] = ((byte) ((int) (local22_life6 >>> 56)));
    int local1_life66 = 1;
    while ((local1_life66 < 8)) {
        (__sourceSpill675_65)[local1_life66] = ((byte) ((int) ((local22_life6 << (local1_life66 * 8)) >>> 56)));
        local1_life66 += 1;
    }
    byte[] __sourcePreallocation675_67 = __sourceSpill675_65;
    ((javax.crypto.Cipher)(__sourceSpill675_62)).init(((int)(__sourceSpill675_63)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill675_64)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation675_67)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life70 = new long[6];
    int local3_life71 = 0;
    java.lang.String local4_life72;
    int local5_life74 = ((java.lang.String)((local4_life72 = "Tè{\025¤ô,Oªr3N\005­7\017\tº\007T¶Àa¯V"))).length();
    int local2_life75 = 0;
    do {
        java.lang.String __sourceSpill675_76 = local4_life72;
        int __sourceSpill675_77 = local2_life75;
        local2_life75 += 8;
        byte[] local7_life80 = ((java.lang.String)(((java.lang.String)(__sourceSpill675_76)).substring(((int)(__sourceSpill675_77)), ((int)(local2_life75))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill675_81 = local6_life70;
        int __sourceSpill675_82 = local3_life71;
        local3_life71 += 1;
        long local8_life83 = (((((((((((long) (local7_life80)[0]) & 255L) << 56) | ((((long) (local7_life80)[1]) & 255L) << 48)) | ((((long) (local7_life80)[2]) & 255L) << 40)) | ((((long) (local7_life80)[3]) & 255L) << 32)) | ((((long) (local7_life80)[4]) & 255L) << 24)) | ((((long) (local7_life80)[5]) & 255L) << 16)) | ((((long) (local7_life80)[6]) & 255L) << 8)) | (((long) (local7_life80)[7]) & 255L));
        byte[] __sourceSpill675_84 = new byte[8];
        (__sourceSpill675_84)[0] = ((byte) ((int) (local8_life83 >>> 56)));
        (__sourceSpill675_84)[1] = ((byte) ((int) (local8_life83 >>> 48)));
        (__sourceSpill675_84)[2] = ((byte) ((int) (local8_life83 >>> 40)));
        (__sourceSpill675_84)[3] = ((byte) ((int) (local8_life83 >>> 32)));
        (__sourceSpill675_84)[4] = ((byte) ((int) (local8_life83 >>> 24)));
        (__sourceSpill675_84)[5] = ((byte) ((int) (local8_life83 >>> 16)));
        (__sourceSpill675_84)[6] = ((byte) ((int) (local8_life83 >>> 8)));
        (__sourceSpill675_84)[7] = ((byte) ((int) local8_life83));
        javax.crypto.Cipher __sourceSpill675_85 = local0_life60;
        byte[] local10_life87 = ((javax.crypto.Cipher)(__sourceSpill675_85)).doFinal(((byte[])(__sourceSpill675_84)));
        (__sourceSpill675_81)[__sourceSpill675_82] = (((((((((((long) (local10_life87)[0]) & 255L) << 56) | ((((long) (local10_life87)[1]) & 255L) << 48)) | ((((long) (local10_life87)[2]) & 255L) << 40)) | ((((long) (local10_life87)[3]) & 255L) << 32)) | ((((long) (local10_life87)[4]) & 255L) << 24)) | ((((long) (local10_life87)[5]) & 255L) << 16)) | ((((long) (local10_life87)[6]) & 255L) << 8)) | (((long) (local10_life87)[7]) & 255L));
    } while ((!(local2_life75 >= local5_life74)));
    local5_life74 = ((java.lang.String)((local4_life72 = "f/<Z3k*9¹\f0n¨Å "))).length();
    local2_life75 = 0;
    do {
        java.lang.String __sourceSpill675_89 = local4_life72;
        int __sourceSpill675_90 = local2_life75;
        local2_life75 += 8;
        byte[] local7_life93 = ((java.lang.String)(((java.lang.String)(__sourceSpill675_89)).substring(((int)(__sourceSpill675_90)), ((int)(local2_life75))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill675_94 = local6_life70;
        int __sourceSpill675_95 = local3_life71;
        local3_life71 += 1;
        long local8_life96 = (((((((((((long) (local7_life93)[0]) & 255L) << 56) | ((((long) (local7_life93)[1]) & 255L) << 48)) | ((((long) (local7_life93)[2]) & 255L) << 40)) | ((((long) (local7_life93)[3]) & 255L) << 32)) | ((((long) (local7_life93)[4]) & 255L) << 24)) | ((((long) (local7_life93)[5]) & 255L) << 16)) | ((((long) (local7_life93)[6]) & 255L) << 8)) | (((long) (local7_life93)[7]) & 255L));
        byte[] __sourceSpill675_97 = new byte[8];
        (__sourceSpill675_97)[0] = ((byte) ((int) (local8_life96 >>> 56)));
        (__sourceSpill675_97)[1] = ((byte) ((int) (local8_life96 >>> 48)));
        (__sourceSpill675_97)[2] = ((byte) ((int) (local8_life96 >>> 40)));
        (__sourceSpill675_97)[3] = ((byte) ((int) (local8_life96 >>> 32)));
        (__sourceSpill675_97)[4] = ((byte) ((int) (local8_life96 >>> 24)));
        (__sourceSpill675_97)[5] = ((byte) ((int) (local8_life96 >>> 16)));
        (__sourceSpill675_97)[6] = ((byte) ((int) (local8_life96 >>> 8)));
        (__sourceSpill675_97)[7] = ((byte) ((int) local8_life96));
        javax.crypto.Cipher __sourceSpill675_98 = local0_life60;
        byte[] local10_life100 = ((javax.crypto.Cipher)(__sourceSpill675_98)).doFinal(((byte[])(__sourceSpill675_97)));
        (__sourceSpill675_94)[__sourceSpill675_95] = (((((((((((long) (local10_life100)[0]) & 255L) << 56) | ((((long) (local10_life100)[1]) & 255L) << 48)) | ((((long) (local10_life100)[2]) & 255L) << 40)) | ((((long) (local10_life100)[3]) & 255L) << 32)) | ((((long) (local10_life100)[4]) & 255L) << 24)) | ((((long) (local10_life100)[5]) & 255L) << 16)) | ((((long) (local10_life100)[6]) & 255L) << 8)) | (((long) (local10_life100)[7]) & 255L));
    } while ((!(local2_life75 >= local5_life74)));
    f = ((long[])(local6_life70));
    g = ((java.lang.Long[])(new java.lang.Long[6]));
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral5939_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/LY"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static long b(int p0, long p1) {
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
    life3_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 10746);
    if (((moom.LY.g)[life3_8] == null)) {
        life4_77 = new byte[] {((byte) ((int) (p1 >>> 56))), ((byte) ((int) (p1 >>> 48))), ((byte) ((int) (p1 >>> 40))), ((byte) ((int) (p1 >>> 32))), ((byte) ((int) (p1 >>> 24))), ((byte) ((int) (p1 >>> 16))), ((byte) ((int) (p1 >>> 8))), ((byte) ((int) p1))};
        life5_81 = (moom.LY.f)[life3_8];
        life7_146 = new byte[] {((byte) ((int) (life5_81 >>> 56))), ((byte) ((int) (life5_81 >>> 48))), ((byte) ((int) (life5_81 >>> 40))), ((byte) ((int) (life5_81 >>> 32))), ((byte) ((int) (life5_81 >>> 24))), ((byte) ((int) (life5_81 >>> 16))), ((byte) ((int) (life5_81 >>> 8))), ((byte) ((int) life5_81))};
        life8_150 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life9_155 = ((java.lang.Object[])(((java.util.Map)(moom.LY.h)).get(((java.lang.Object)(life8_150)))));
        try {
        if ((life9_155 == null)) {
        life9_155 = new java.lang.Object[3];
        (life9_155)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding")));
        (life9_155)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life9_155)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.LY.h)).put(((java.lang.Object)(life8_150)), ((java.lang.Object)(life9_155)));
    }
        life11_188 = new javax.crypto.spec.DESKeySpec(life4_77);
        life12_195 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life9_155)[1])))).generateSecret(((java.security.spec.KeySpec)(life11_188)));
        life13_200 = ((javax.crypto.Cipher)((life9_155)[0]));
        ((javax.crypto.Cipher)(life13_200)).init(((int)(2)), ((java.security.Key)(life12_195)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life9_155)[2])))));
        life10_212 = ((javax.crypto.Cipher)(life13_200)).doFinal(((byte[])(life7_146)));
    } catch (java.lang.Exception life11_214) {
        throw new java.lang.RuntimeException("moom/LY", life11_214);
    }
        life11_290 = (((((((((((long) (life10_212)[0]) & 255L) << 56) | ((((long) (life10_212)[1]) & 255L) << 48)) | ((((long) (life10_212)[2]) & 255L) << 40)) | ((((long) (life10_212)[3]) & 255L) << 32)) | ((((long) (life10_212)[4]) & 255L) << 24)) | ((((long) (life10_212)[5]) & 255L) << 16)) | ((((long) (life10_212)[6]) & 255L) << 8)) | (((long) (life10_212)[7]) & 255L));
        (moom.LY.g)[life3_8] = java.lang.Long.valueOf(((long)(life11_290)));
    }
    return ((java.lang.Long)((moom.LY.g)[life3_8])).longValue();
}


private static long b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    long local7 = moom.LY.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local9 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Long.TYPE)), ((java.lang.Object)(java.lang.Long.valueOf(((long)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local9)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.LY.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 13231;
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
            throw new RuntimeException("moom/LY", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         d[var3] = var15;
      }

      return d[var3];
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
        byte[] spill2575_0 = p0;
        life4_9 += 1;
        life5_44 = (spill2575_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill2575_1 = p0;
        life4_9 += 1;
        life5_76 = (spill2575_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill2575_2 = p0;
        life4_9 += 1;
        life5_91 = (spill2575_2)[life4_9];
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


public static moom.CA a(moom.CA p0, moom.F p1, moom.DT p2) {
long local3 = (moom.LY.a ^ 119185225677936L);
    int local5 = ((moom.DT)(p2)).a();
    int local6 = ((moom.DT)(p2)).c();
    long local7 = ((((long) local5) * __sourceIntrinsic_cd570c486466_invokedynamic5942_3(32095, (5811594574717516655L ^ local3))) ^ (((long) local6) * __sourceIntrinsic_cd570c486466_invokedynamic5942_4(23974, (959093103340313495L ^ local3))));
    local7 = (((local7 * local7) * __sourceIntrinsic_cd570c486466_invokedynamic5942_5(32130, (7064317708320046000L ^ local3))) + (local7 * __sourceIntrinsic_cd570c486466_invokedynamic5942_6(16634, (4543692223813600973L ^ local3))));
    double local9 = ((((double) (((float) ((local7 >> __sourceIntrinsic_cd570c486466_invokedynamic5942_7(12391, (1433620901342620672L ^ local3))) & __sourceIntrinsic_cd570c486466_invokedynamic5942_8(31857, (1656823093642558023L ^ local3)))) / 0x1.ep3f)) - 0x1.0p-1d) * 0x1.0p-1d);
    double local11 = ((((double) (((float) ((local7 >> __sourceIntrinsic_cd570c486466_invokedynamic5942_9(9521, (5325973846685628756L ^ local3))) & __sourceIntrinsic_cd570c486466_invokedynamic5942_10(1053, (6910889550571864622L ^ local3)))) / 0x1.ep3f)) - 0x1.0p-1d) * 0x1.0p-1d);
    double local13 = 0x0.0p0d;
    if ((p1 == moom.F.XYZ)) {
        local13 = ((((double) (((float) ((local7 >> __sourceIntrinsic_cd570c486466_invokedynamic5942_12(19038, (3218216576341268024L ^ local3))) & __sourceIntrinsic_cd570c486466_invokedynamic5942_13(1053, (6910889550571864622L ^ local3)))) / 0x1.ep3f)) - 0x1.0p0d) * 0x1.999999999999ap-3d);
    }
    return ((moom.CA)(p0)).c(((double)(local9)), ((double)(local13)), ((double)(local11)));
}


public static net.minecraft.client.resources.model.IBakedModel a(java.lang.String p0, int p1) {
java.lang.Object local2 = ((net.minecraft.client.renderer.texture.TextureMap)(((net.minecraft.client.Minecraft)(moom.BU.a__fM())).a__n8())).a(((java.lang.String)(p0)));
    return moom.LY.a(((net.minecraft.client.renderer.texture.TextureAtlasSprite)(local2)), ((int)(p1)));
}


public static net.minecraft.client.resources.model.IBakedModel a(net.minecraft.client.renderer.texture.TextureAtlasSprite p0, int p1) {
int[] spill924_0;
    long life2_3;
    java.util.ArrayList life5_8;
    moom.bs[] life6_10;
    java.util.ArrayList life7_14;
    moom.bs[] life8_16;
    int[] life4_17;
    int life9_20;
    int life10_22;
    moom.bs life11_29;
    java.util.ArrayList life12_33;
    lexical_join_48: {
    life2_3 = (moom.LY.a ^ 99663974213510L);
    spill924_0 = moom.LZ.b();
    life5_8 = new java.util.ArrayList();
    life6_10 = moom.bs.VALUES;
    life7_14 = new java.util.ArrayList();
    life8_16 = life6_10;
    life4_17 = spill924_0;
    life9_20 = (life8_16).length;
    life10_22 = 0;
    lexical_cycle_23: while (true) {
    if (!((life10_22 < life9_20))) {
        break lexical_join_48;
    }
    life11_29 = (life8_16)[life10_22];
    life12_33 = new java.util.ArrayList();
    ((java.util.List)(life12_33)).add(((java.lang.Object)(moom.LY.a(((moom.bs)(life11_29)), ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(p0)), ((int)(p1))))));
    ((java.util.List)(life7_14)).add(((java.lang.Object)(life12_33)));
    life10_22 += 1;
    if (!((life4_17 == null))) { continue lexical_cycle_23; }
    break lexical_cycle_23;
    }
    }
    return new moom.ps(life5_8, life7_14, true, true, p0, moom.lP.a);
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral5944_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/LY"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public static void a(org.lwjgl.util.vector.Vector3f p0) {
((org.lwjgl.util.vector.Vector3f)(p0)).setX(((float)(moom.LY.a(((float)(((org.lwjgl.util.vector.Vector3f)(p0)).getX()))))));
    ((org.lwjgl.util.vector.Vector3f)(p0)).setY(((float)(moom.LY.a(((float)(((org.lwjgl.util.vector.Vector3f)(p0)).getY()))))));
    ((org.lwjgl.util.vector.Vector3f)(p0)).setZ(((float)(moom.LY.a(((float)(((org.lwjgl.util.vector.Vector3f)(p0)).getZ()))))));
    return;
}


private static void a(java.util.List<moom.lC> p0, net.minecraft.client.renderer.texture.TextureAtlasSprite p1, net.minecraft.client.renderer.texture.TextureAtlasSprite p2) {
int[] spill48_0;
    long life3_3;
    java.util.ArrayList life6_8;
    int[] life5_9;
    java.util.Iterator life7_12;
    moom.lC life8_21;
    forest_join_46: {
    forest_join_40: {
    life3_3 = (moom.LY.a ^ 117244403250646L);
    spill48_0 = moom.LZ.b();
    life6_8 = new java.util.ArrayList();
    life5_9 = spill48_0;
    life7_12 = ((java.util.List)(p0)).iterator();
    forest_cycle_13: while (true) {
    forest_join_38: {
    forest_join_34: {
    if (!(((java.util.Iterator)(life7_12)).hasNext())) {
        break forest_join_40;
    }
    life8_21 = ((moom.lC)(((java.util.Iterator)(life7_12)).next()));
    if (!((life5_9 != null))) {
        break forest_join_46;
    }
    if (!((life5_9 != null))) {
        break forest_join_38;
    }
    if (!((((moom.lC)(life8_21)).a__oh() == p1))) {
        break forest_join_34;
    }
    life8_21 = new moom.lD(life8_21, p2);
    }
    ((java.util.List)(life6_8)).add(((java.lang.Object)(life8_21)));
    }
    if (!((life5_9 == null))) {
        continue forest_cycle_13;
    }
    break forest_cycle_13;
    }
    }
    ((java.util.List)(p0)).clear();
    ((java.util.List)(p0)).addAll(((java.util.Collection)(life6_8)));
    }
    return;
}


public static net.minecraft.client.resources.model.IBakedModel a(java.lang.String p0, net.minecraft.client.renderer.texture.TextureAtlasSprite p1, net.minecraft.client.renderer.texture.TextureAtlasSprite p2) {
net.minecraft.client.renderer.texture.TextureAtlasSprite lexicalValue922_11_0;
    net.minecraft.client.resources.model.IBakedModel lexicalValue922_33_0;
    net.minecraft.client.resources.model.IBakedModel lexicalValue922_40_0;
    java.util.List lexicalValue922_72_0;
    net.minecraft.client.renderer.texture.TextureAtlasSprite spill922_0;
    net.minecraft.client.resources.model.IBakedModel spill922_1;
    java.util.List spill922_2;
    long life3_3;
    int[] life5_5;
    net.minecraft.client.resources.model.ModelManager life6_16;
    moom.DE life7_28;
    net.minecraft.client.resources.model.IBakedModel life8_32;
    net.minecraft.client.resources.model.IBakedModel life9_54;
    moom.bs[] life10_56;
    moom.bs[] life11_58;
    int life12_61;
    int life13_63;
    moom.bs life14_70;
    java.util.List life15_74;
    java.util.List life11_89;
    lexical_join_81: {
    lexical_join_79: {
    lexical_join_72: {
    lexical_join_70: {
    lexical_join_40: {
    lexical_join_33: {
    lexical_join_18: {
    lexical_join_11: {
    life3_3 = (moom.LY.a ^ 31281053132393L);
    life5_5 = moom.LZ.b();
    spill922_0 = p1;
    if (!((life5_5 != null))) {
        lexicalValue922_11_0 = spill922_0;
        break lexical_join_11;
    }
    if (!((spill922_0 != null))) {
        break lexical_join_81;
    }
    lexicalValue922_11_0 = p2;
    }
    if (!((lexicalValue922_11_0 != null))) {
        break lexical_join_81;
    }
    life6_16 = moom.BU.a__pr();
    if (!((life6_16 == null))) {
        break lexical_join_18;
    }
    return null;
    }
    life7_28 = new moom.DE(p0, moom.LY.b);
    life8_32 = ((net.minecraft.client.resources.model.ModelManager)(life6_16)).a(((moom.DE)(life7_28)));
    spill922_1 = life8_32;
    if (!((life5_5 != null))) {
        lexicalValue922_33_0 = spill922_1;
        break lexical_join_33;
    }
    if (!((spill922_1 != null))) {
        break lexical_join_79;
    }
    lexicalValue922_33_0 = life8_32;
    }
    if (!((life5_5 != null))) {
        lexicalValue922_40_0 = lexicalValue922_33_0;
        break lexical_join_40;
    }
    if (!((lexicalValue922_33_0 != ((net.minecraft.client.resources.model.ModelManager)(life6_16)).a__pp()))) {
        break lexical_join_79;
    }
    lexicalValue922_40_0 = moom.L1.a(((net.minecraft.client.resources.model.IBakedModel)(life8_32)));
    }
    life9_54 = lexicalValue922_40_0;
    life10_56 = moom.bs.VALUES;
    life11_58 = life10_56;
    life12_61 = (life11_58).length;
    life13_63 = 0;
    lexical_cycle_50: while (true) {
    if (!((life13_63 < life12_61))) {
        break lexical_join_70;
    }
    life14_70 = (life11_58)[life13_63];
    life15_74 = ((net.minecraft.client.resources.model.IBakedModel)(life9_54)).a(((moom.bs)(life14_70)));
    spill922_2 = life15_74;
    if (!((life5_5 != null))) {
        lexicalValue922_72_0 = spill922_2;
        break lexical_join_72;
    }
    moom.LY.a(((java.util.List)(spill922_2)), ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(p1)), ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(p2)));
    life13_63 += 1;
    if (!((life5_5 == null))) { continue lexical_cycle_50; }
    break lexical_cycle_50;
    }
    }
    lexicalValue922_72_0 = ((net.minecraft.client.resources.model.IBakedModel)(life9_54)).a();
    }
    life11_89 = lexicalValue922_72_0;
    moom.LY.a(((java.util.List)(life11_89)), ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(p1)), ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(p2)));
    return life9_54;
    }
    return null;
    }
    return null;
}


public static net.minecraft.client.resources.model.IBakedModel a(java.lang.String p0, java.lang.String p1, java.lang.String p2) {
java.lang.Object local3 = ((net.minecraft.client.Minecraft)(moom.BU.a__fM())).a__n8();
    java.lang.Object local4 = ((net.minecraft.client.renderer.texture.TextureMap)(local3)).c(((java.lang.String)(p1)));
    java.lang.Object local5 = ((net.minecraft.client.renderer.texture.TextureMap)(local3)).c(((java.lang.String)(p2)));
    return moom.LY.a(((java.lang.String)(p0)), ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(local4)), ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(local5)));
}


private static float a(float p0) {
int forwardValue2570_23_0;
    int forwardValue2570_31_0;
    float forwardValue2570_33_0;
    float forwardValue2570_35_0;
    int spill2570_0;
    int spill2570_1;
    float spill2570_2;
    long life1_3;
    int[] life3_5;
    forward_join_35: {
    forward_join_34: {
    forward_join_33: {
    forward_join_31: {
    forward_join_23: {
    forward_join_20: {
    life1_3 = (moom.LY.a ^ 101603946068653L);
    life3_5 = moom.LZ.b();
    spill2570_0 = recovery.source.CarrierOps.fcmpl(((float)(p0)), ((float)(-0x1.0c6f7ap-20f)));
    if (!((life3_5 != null))) {
        forwardValue2570_23_0 = spill2570_0;
        break forward_join_23;
    }
    if (!((spill2570_0 > 0))) {
        break forward_join_20;
    }
    spill2570_1 = recovery.source.CarrierOps.fcmpg(((float)(p0)), ((float)(0x1.0c6f7ap-20f)));
    if (!((life3_5 != null))) {
        forwardValue2570_23_0 = spill2570_1;
        break forward_join_23;
    }
    if (!((spill2570_1 < 0))) {
        break forward_join_20;
    }
    forwardValue2570_35_0 = 0x0.0p0f;
    break forward_join_35;
    }
    forwardValue2570_23_0 = recovery.source.CarrierOps.fcmpl(((float)(p0)), ((float)(0x1.ffffdep-1f)));
    }
    if (!((life3_5 != null))) {
        forwardValue2570_31_0 = forwardValue2570_23_0;
        break forward_join_31;
    }
    if (!((forwardValue2570_23_0 > 0))) {
        break forward_join_34;
    }
    spill2570_2 = p0;
    if (!((life3_5 != null))) {
        forwardValue2570_33_0 = spill2570_2;
        break forward_join_33;
    }
    forwardValue2570_31_0 = recovery.source.CarrierOps.fcmpg(((float)(spill2570_2)), ((float)(0x1.00001p0f)));
    }
    if (!((forwardValue2570_31_0 < 0))) {
        break forward_join_34;
    }
    forwardValue2570_33_0 = 0x1.0p0f;
    }
    forwardValue2570_35_0 = forwardValue2570_33_0;
    break forward_join_35;
    }
    forwardValue2570_35_0 = p0;
    }
    return forwardValue2570_35_0;
}


public static moom.lC a(moom.bs p0, net.minecraft.client.renderer.texture.TextureAtlasSprite p1, int p2) {
org.lwjgl.util.vector.Vector3f local3_life0 = new org.lwjgl.util.vector.Vector3f(0x0.0p0f, 0x0.0p0f, 0x0.0p0f);
    org.lwjgl.util.vector.Vector3f local4_life4 = new org.lwjgl.util.vector.Vector3f(1098907648, 1098907648, 1098907648);
    moom.lE local5_life7 = new moom.lE(new float[] {0x0.0p0f, 0x0.0p0f, 1098907648, 1098907648}, 0);
    net.minecraft.client.renderer.block.model.BlockPartFace local6_life10 = new net.minecraft.client.renderer.block.model.BlockPartFace(p0, p2, __sourceIntrinsic_3e5c80a2a313_originalDynamicSite558_9(((moom.bs)(p0)).a__String()), local5_life7);
    net.minecraft.client.resources.model.ModelRotation local7_life12 = net.minecraft.client.resources.model.ModelRotation.X0_Y0;
    java.lang.Object local8_life13 = null;
    int local9_life14 = 0;
    int local10_life15 = 1;
    moom.lN local11_life16 = new moom.lN();
    return ((moom.lN)(local11_life16)).a(((org.lwjgl.util.vector.Vector3f)(local3_life0)), ((org.lwjgl.util.vector.Vector3f)(local4_life4)), ((net.minecraft.client.renderer.block.model.BlockPartFace)(local6_life10)), ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(p1)), ((moom.bs)(p0)), ((net.minecraft.client.resources.model.ModelRotation)(local7_life12)), ((net.minecraft.client.renderer.block.model.BlockPartRotation)(local8_life13)), ((boolean)__sourceIntrinsic_integerToBoolean((local9_life14))), ((boolean)__sourceIntrinsic_integerToBoolean((local10_life15))));
}


public static net.minecraft.client.resources.model.IBakedModel a(net.minecraft.client.resources.model.IBakedModel p0, net.minecraft.client.resources.model.IBakedModel p1) {
int lexicalValue291_67_0;
    int[] spill291_0;
    boolean spill291_1;
    long life2_3;
    java.util.ArrayList life5_7;
    moom.bs[] life6_20;
    int[] life4_21;
    java.util.ArrayList life7_25;
    moom.bs[] life8_27;
    int life9_30;
    int life10_32;
    moom.bs life11_39;
    java.util.ArrayList life12_43;
    int life8_70;
    int life9_73;
    net.minecraft.client.renderer.texture.TextureAtlasSprite life10_76;
    moom.lP life11_79;
    lexical_join_67: {
    lexical_join_65: {
    life2_3 = (moom.LY.a ^ 90551340141496L);
    life5_7 = new java.util.ArrayList();
    ((java.util.List)(life5_7)).addAll(((java.util.Collection)(((net.minecraft.client.resources.model.IBakedModel)(p0)).a())));
    ((java.util.List)(life5_7)).addAll(((java.util.Collection)(((net.minecraft.client.resources.model.IBakedModel)(p1)).a())));
    spill291_0 = moom.LZ.b();
    life6_20 = moom.bs.VALUES;
    life4_21 = spill291_0;
    life7_25 = new java.util.ArrayList();
    life8_27 = life6_20;
    life9_30 = (life8_27).length;
    life10_32 = 0;
    lexical_cycle_33: while (true) {
    if (!((life10_32 < life9_30))) {
        break lexical_join_65;
    }
    life11_39 = (life8_27)[life10_32];
    life12_43 = new java.util.ArrayList();
    ((java.util.List)(life12_43)).addAll(((java.util.Collection)(((net.minecraft.client.resources.model.IBakedModel)(p0)).a(((moom.bs)(life11_39))))));
    ((java.util.List)(life12_43)).addAll(((java.util.Collection)(((net.minecraft.client.resources.model.IBakedModel)(p1)).a(((moom.bs)(life11_39))))));
    spill291_1 = ((java.util.List)(life7_25)).add(((java.lang.Object)(life12_43)));
    if (!((life4_21 != null))) {
        lexicalValue291_67_0 = ((spill291_1) ? 1 : 0);
        break lexical_join_67;
    }
    recovery.source.CarrierOps.discard(spill291_1);
    life10_32 += 1;
    if (!((life4_21 == null))) { continue lexical_cycle_33; }
    break lexical_cycle_33;
    }
    }
    lexicalValue291_67_0 = ((((net.minecraft.client.resources.model.IBakedModel)(p0)).a__Boolean()) ? 1 : 0);
    }
    life8_70 = lexicalValue291_67_0;
    life9_73 = ((((net.minecraft.client.resources.model.IBakedModel)(p0)).c()) ? 1 : 0);
    life10_76 = ((net.minecraft.client.resources.model.IBakedModel)(p0)).a__oh();
    life11_79 = ((net.minecraft.client.resources.model.IBakedModel)(p0)).a__lP();
    return new moom.ps(life5_7, life7_25, ((life8_70) != 0), ((life9_73) != 0), life10_76, life11_79);
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral5944_0() throws E;

private static native <E extends Throwable> long __sourceIntrinsic_cd570c486466_invokedynamic5942_3(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_cd570c486466_invokedynamic5942_4(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_cd570c486466_invokedynamic5942_5(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_cd570c486466_invokedynamic5942_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_cd570c486466_invokedynamic5942_7(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_cd570c486466_invokedynamic5942_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_cd570c486466_invokedynamic5942_9(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_cd570c486466_invokedynamic5942_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_cd570c486466_invokedynamic5942_12(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_cd570c486466_invokedynamic5942_13(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3e5c80a2a313_originalDynamicSite558_9(java.lang.String a0) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral5939_0() throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
