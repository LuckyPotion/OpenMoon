package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class mr {

private static final int a;

private long b;

private static final long c;

private static final long[] d;

private static final java.lang.Integer[] e;

private static final java.util.Map f;

private static final long[] g;

private static final java.lang.Long[] h;

private static final java.util.Map i;

public mr() {
super();
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(162702366097254001L)), ((long)(1907797437679999729L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(129195075721783L)))));
    f = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (moom.mr.c ^ 120570150245102L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill935_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill935_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill935_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill935_14 = new byte[8];
    (__sourceSpill935_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill935_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation935_16 = __sourceSpill935_14;
    ((javax.crypto.Cipher)(__sourceSpill935_11)).init(((int)(__sourceSpill935_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill935_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation935_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local19_life19 = new long[6];
    int local16_life20 = 0;
    java.lang.String local17_life21;
    int local18_life23 = ((java.lang.String)((local17_life21 = "Ê¸Gó&K1ÃÙZçj\004ÈQE]NØ ö/ÅL¾á­"))).length();
    int local15_life24 = 0;
    do {
        java.lang.String __sourceSpill935_25 = local17_life21;
        int __sourceSpill935_26 = local15_life24;
        local15_life24 += 8;
        byte[] local20_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill935_25)).substring(((int)(__sourceSpill935_26)), ((int)(local15_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill935_30 = local19_life19;
        int __sourceSpill935_31 = local16_life20;
        local16_life20 += 1;
        long local21_life32 = (((((((((((long) (local20_life29)[0]) & 255L) << 56) | ((((long) (local20_life29)[1]) & 255L) << 48)) | ((((long) (local20_life29)[2]) & 255L) << 40)) | ((((long) (local20_life29)[3]) & 255L) << 32)) | ((((long) (local20_life29)[4]) & 255L) << 24)) | ((((long) (local20_life29)[5]) & 255L) << 16)) | ((((long) (local20_life29)[6]) & 255L) << 8)) | (((long) (local20_life29)[7]) & 255L));
        byte[] __sourceSpill935_33 = new byte[8];
        (__sourceSpill935_33)[0] = ((byte) ((int) (local21_life32 >>> 56)));
        (__sourceSpill935_33)[1] = ((byte) ((int) (local21_life32 >>> 48)));
        (__sourceSpill935_33)[2] = ((byte) ((int) (local21_life32 >>> 40)));
        (__sourceSpill935_33)[3] = ((byte) ((int) (local21_life32 >>> 32)));
        (__sourceSpill935_33)[4] = ((byte) ((int) (local21_life32 >>> 24)));
        (__sourceSpill935_33)[5] = ((byte) ((int) (local21_life32 >>> 16)));
        (__sourceSpill935_33)[6] = ((byte) ((int) (local21_life32 >>> 8)));
        (__sourceSpill935_33)[7] = ((byte) ((int) local21_life32));
        javax.crypto.Cipher __sourceSpill935_34 = local13_life9;
        byte[] local23_life36 = ((javax.crypto.Cipher)(__sourceSpill935_34)).doFinal(((byte[])(__sourceSpill935_33)));
        (__sourceSpill935_30)[__sourceSpill935_31] = (((((((((((long) (local23_life36)[0]) & 255L) << 56) | ((((long) (local23_life36)[1]) & 255L) << 48)) | ((((long) (local23_life36)[2]) & 255L) << 40)) | ((((long) (local23_life36)[3]) & 255L) << 32)) | ((((long) (local23_life36)[4]) & 255L) << 24)) | ((((long) (local23_life36)[5]) & 255L) << 16)) | ((((long) (local23_life36)[6]) & 255L) << 8)) | (((long) (local23_life36)[7]) & 255L));
    } while ((!(local15_life24 >= local18_life23)));
    local18_life23 = ((java.lang.String)((local17_life21 = "Ã­XÖum³9Ñý\nË0¨\"î"))).length();
    local15_life24 = 0;
    do {
        java.lang.String __sourceSpill935_38 = local17_life21;
        int __sourceSpill935_39 = local15_life24;
        local15_life24 += 8;
        byte[] local20_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill935_38)).substring(((int)(__sourceSpill935_39)), ((int)(local15_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill935_43 = local19_life19;
        int __sourceSpill935_44 = local16_life20;
        local16_life20 += 1;
        long local21_life45 = (((((((((((long) (local20_life42)[0]) & 255L) << 56) | ((((long) (local20_life42)[1]) & 255L) << 48)) | ((((long) (local20_life42)[2]) & 255L) << 40)) | ((((long) (local20_life42)[3]) & 255L) << 32)) | ((((long) (local20_life42)[4]) & 255L) << 24)) | ((((long) (local20_life42)[5]) & 255L) << 16)) | ((((long) (local20_life42)[6]) & 255L) << 8)) | (((long) (local20_life42)[7]) & 255L));
        byte[] __sourceSpill935_46 = new byte[8];
        (__sourceSpill935_46)[0] = ((byte) ((int) (local21_life45 >>> 56)));
        (__sourceSpill935_46)[1] = ((byte) ((int) (local21_life45 >>> 48)));
        (__sourceSpill935_46)[2] = ((byte) ((int) (local21_life45 >>> 40)));
        (__sourceSpill935_46)[3] = ((byte) ((int) (local21_life45 >>> 32)));
        (__sourceSpill935_46)[4] = ((byte) ((int) (local21_life45 >>> 24)));
        (__sourceSpill935_46)[5] = ((byte) ((int) (local21_life45 >>> 16)));
        (__sourceSpill935_46)[6] = ((byte) ((int) (local21_life45 >>> 8)));
        (__sourceSpill935_46)[7] = ((byte) ((int) local21_life45));
        javax.crypto.Cipher __sourceSpill935_47 = local13_life9;
        byte[] local23_life49 = ((javax.crypto.Cipher)(__sourceSpill935_47)).doFinal(((byte[])(__sourceSpill935_46)));
        (__sourceSpill935_43)[__sourceSpill935_44] = (((((((((((long) (local23_life49)[0]) & 255L) << 56) | ((((long) (local23_life49)[1]) & 255L) << 48)) | ((((long) (local23_life49)[2]) & 255L) << 40)) | ((((long) (local23_life49)[3]) & 255L) << 32)) | ((((long) (local23_life49)[4]) & 255L) << 24)) | ((((long) (local23_life49)[5]) & 255L) << 16)) | ((((long) (local23_life49)[6]) & 255L) << 8)) | (((long) (local23_life49)[7]) & 255L));
    } while ((!(local15_life24 >= local18_life23)));
    d = ((long[])(local19_life19));
    e = ((java.lang.Integer[])(new java.lang.Integer[6]));
    i = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life54;
    javax.crypto.Cipher __sourceSpill935_56 = (local0_life54 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill935_57 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill935_58 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill935_59 = new byte[8];
    (__sourceSpill935_59)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life60 = 1;
    while ((local1_life60 < 8)) {
        (__sourceSpill935_59)[local1_life60] = ((byte) ((int) ((local11_life7 << (local1_life60 * 8)) >>> 56)));
        local1_life60 += 1;
    }
    byte[] __sourcePreallocation935_61 = __sourceSpill935_59;
    ((javax.crypto.Cipher)(__sourceSpill935_56)).init(((int)(__sourceSpill935_57)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill935_58)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation935_61)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life64 = new long[2];
    int local3_life65 = 0;
    java.lang.String local4_life66;
    int local5_life68 = ((java.lang.String)((local4_life66 = "ÿ\017JpTØ¡\007Ê¬ã©|@"))).length();
    int local2_life69 = 0;
    do {
        java.lang.String __sourceSpill935_70 = local4_life66;
        int __sourceSpill935_71 = local2_life69;
        local2_life69 += 8;
        byte[] local7_life74 = ((java.lang.String)(((java.lang.String)(__sourceSpill935_70)).substring(((int)(__sourceSpill935_71)), ((int)(local2_life69))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill935_75 = local6_life64;
        int __sourceSpill935_76 = local3_life65;
        local3_life65 += 1;
        long local8_life77 = (((((((((((long) (local7_life74)[0]) & 255L) << 56) | ((((long) (local7_life74)[1]) & 255L) << 48)) | ((((long) (local7_life74)[2]) & 255L) << 40)) | ((((long) (local7_life74)[3]) & 255L) << 32)) | ((((long) (local7_life74)[4]) & 255L) << 24)) | ((((long) (local7_life74)[5]) & 255L) << 16)) | ((((long) (local7_life74)[6]) & 255L) << 8)) | (((long) (local7_life74)[7]) & 255L));
        byte[] __sourceSpill935_78 = new byte[8];
        (__sourceSpill935_78)[0] = ((byte) ((int) (local8_life77 >>> 56)));
        (__sourceSpill935_78)[1] = ((byte) ((int) (local8_life77 >>> 48)));
        (__sourceSpill935_78)[2] = ((byte) ((int) (local8_life77 >>> 40)));
        (__sourceSpill935_78)[3] = ((byte) ((int) (local8_life77 >>> 32)));
        (__sourceSpill935_78)[4] = ((byte) ((int) (local8_life77 >>> 24)));
        (__sourceSpill935_78)[5] = ((byte) ((int) (local8_life77 >>> 16)));
        (__sourceSpill935_78)[6] = ((byte) ((int) (local8_life77 >>> 8)));
        (__sourceSpill935_78)[7] = ((byte) ((int) local8_life77));
        javax.crypto.Cipher __sourceSpill935_79 = local0_life54;
        byte[] local10_life81 = ((javax.crypto.Cipher)(__sourceSpill935_79)).doFinal(((byte[])(__sourceSpill935_78)));
        (__sourceSpill935_75)[__sourceSpill935_76] = (((((((((((long) (local10_life81)[0]) & 255L) << 56) | ((((long) (local10_life81)[1]) & 255L) << 48)) | ((((long) (local10_life81)[2]) & 255L) << 40)) | ((((long) (local10_life81)[3]) & 255L) << 32)) | ((((long) (local10_life81)[4]) & 255L) << 24)) | ((((long) (local10_life81)[5]) & 255L) << 16)) | ((((long) (local10_life81)[6]) & 255L) << 8)) | (((long) (local10_life81)[7]) & 255L));
    } while ((!(local2_life69 >= local5_life68)));
    g = ((long[])(local6_life64));
    h = ((java.lang.Long[])(new java.lang.Long[2]));
    a = ((int)((moom.bs.values()).length));
}


public java.lang.String toString() {
long life1_3;
    java.lang.StringBuilder life3_7;
    moom.bs[] life4_17;
    int life5_20;
    int life6_22;
    moom.bs life7_29;
    moom.bs[] life4_55;
    int life5_58;
    int life6_60;
    moom.bs life7_67;
    moom.bs[] life8_77;
    int life9_80;
    int life10_82;
    moom.bs life11_89;
    int life12_104;
    life1_3 = (moom.mr.c ^ 60851081051990L);
    life3_7 = new java.lang.StringBuilder();
    ((java.lang.StringBuilder)(life3_7)).append(((char)(__sourceIntrinsic_a86c261fcdee_invokedynamic6894_1(9526, (4867686679899893338L ^ life1_3)))));
    life4_17 = moom.bs.values();
    life5_20 = (life4_17).length;
    life6_22 = 0;
    while ((life6_22 < life5_20)) {
        life7_29 = (life4_17)[life6_22];
        ((java.lang.StringBuilder)(((java.lang.StringBuilder)(life3_7)).append(((char)(__sourceIntrinsic_a86c261fcdee_invokedynamic6894_4(26956, (5944582726931653153L ^ life1_3))))))).append(((char)(((java.lang.String)(((java.lang.String)(((moom.bs)(life7_29)).toString())).toUpperCase())).charAt(((int)(0))))));
        life6_22 += 1;
    }
    ((java.lang.StringBuilder)(life3_7)).append(((char)(__sourceIntrinsic_a86c261fcdee_invokedynamic6894_10(8140, (7200987105283134631L ^ life1_3)))));
    life4_55 = moom.bs.values();
    life5_58 = (life4_55).length;
    life6_60 = 0;
    while ((life6_60 < life5_58)) {
        life7_67 = (life4_55)[life6_60];
        ((java.lang.StringBuilder)(life3_7)).append(((char)(((java.lang.String)(((java.lang.String)(((moom.bs)(life7_67)).toString())).toUpperCase())).charAt(((int)(0))))));
        life8_77 = moom.bs.values();
        life9_80 = (life8_77).length;
        life10_82 = 0;
        while ((life10_82 < life9_80)) {
        life11_89 = (life8_77)[life10_82];
        if ((life7_67 == life11_89)) {
        ((java.lang.StringBuilder)(life3_7)).append(((java.lang.String)("  ")));
    } else {
        life12_104 = ((this.a(((moom.bs)(life7_67)), ((moom.bs)(life11_89)))) ? 1 : 0);
        java.lang.StringBuilder spill6894_0 = ((java.lang.StringBuilder)(life3_7)).append(((char)(__sourceIntrinsic_a86c261fcdee_invokedynamic6894_21(26956, (5944582726931653153L ^ life1_3)))));
        ((java.lang.StringBuilder)(spill6894_0)).append(((char)(((life12_104 != 0) ? __sourceIntrinsic_a86c261fcdee_invokedynamic6894_23(28199, (6422359684368966989L ^ life1_3)) : __sourceIntrinsic_a86c261fcdee_invokedynamic6894_24(11620, (2473608669900826124L ^ life1_3))))));
    }
        life10_82 += 1;
    }
        ((java.lang.StringBuilder)(life3_7)).append(((char)(__sourceIntrinsic_a86c261fcdee_invokedynamic6894_26(10580, (8881754545771242045L ^ life1_3)))));
        life6_60 += 1;
    }
    return ((java.lang.StringBuilder)(life3_7)).toString();
}


private void b(int p0) {
long local2_life1 = (moom.mr.c ^ 97683843810120L);
    this.b &= ((1L << p0) ^ __sourceIntrinsic_8dbec06774c4_originalDynamicSite879_3(208, (927503533235049256L ^ local2_life1)));
    return;
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
    life3_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 9072);
    if (((moom.mr.h)[life3_8] == null)) {
        life4_77 = new byte[] {((byte) ((int) (p1 >>> 56))), ((byte) ((int) (p1 >>> 48))), ((byte) ((int) (p1 >>> 40))), ((byte) ((int) (p1 >>> 32))), ((byte) ((int) (p1 >>> 24))), ((byte) ((int) (p1 >>> 16))), ((byte) ((int) (p1 >>> 8))), ((byte) ((int) p1))};
        life5_81 = (moom.mr.g)[life3_8];
        life7_146 = new byte[] {((byte) ((int) (life5_81 >>> 56))), ((byte) ((int) (life5_81 >>> 48))), ((byte) ((int) (life5_81 >>> 40))), ((byte) ((int) (life5_81 >>> 32))), ((byte) ((int) (life5_81 >>> 24))), ((byte) ((int) (life5_81 >>> 16))), ((byte) ((int) (life5_81 >>> 8))), ((byte) ((int) life5_81))};
        life8_150 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life9_155 = ((java.lang.Object[])(((java.util.Map)(moom.mr.i)).get(((java.lang.Object)(life8_150)))));
        try {
        if ((life9_155 == null)) {
        life9_155 = new java.lang.Object[3];
        (life9_155)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding")));
        (life9_155)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life9_155)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.mr.i)).put(((java.lang.Object)(life8_150)), ((java.lang.Object)(life9_155)));
    }
        life11_188 = new javax.crypto.spec.DESKeySpec(life4_77);
        life12_195 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life9_155)[1])))).generateSecret(((java.security.spec.KeySpec)(life11_188)));
        life13_200 = ((javax.crypto.Cipher)((life9_155)[0]));
        ((javax.crypto.Cipher)(life13_200)).init(((int)(2)), ((java.security.Key)(life12_195)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life9_155)[2])))));
        life10_212 = ((javax.crypto.Cipher)(life13_200)).doFinal(((byte[])(life7_146)));
    } catch (java.lang.Exception life11_214) {
        throw new java.lang.RuntimeException("moom/mr", life11_214);
    }
        life11_290 = (((((((((((long) (life10_212)[0]) & 255L) << 56) | ((((long) (life10_212)[1]) & 255L) << 48)) | ((((long) (life10_212)[2]) & 255L) << 40)) | ((((long) (life10_212)[3]) & 255L) << 32)) | ((((long) (life10_212)[4]) & 255L) << 24)) | ((((long) (life10_212)[5]) & 255L) << 16)) | ((((long) (life10_212)[6]) & 255L) << 8)) | (((long) (life10_212)[7]) & 255L));
        (moom.mr.h)[life3_8] = java.lang.Long.valueOf(((long)(life11_290)));
    }
    return ((java.lang.Long)((moom.mr.h)[life3_8])).longValue();
}


private static long b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    long local7 = moom.mr.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local9 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Long.TYPE)), ((java.lang.Object)(java.lang.Long.valueOf(((long)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local9)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8454_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/mr"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 2047;
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
            throw new RuntimeException("moom/mr", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         e[var3] = var15;
      }

      return e[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.mr.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral8455_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/mr"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(boolean p0) {
long local2 = (moom.mr.c ^ 124068388934407L);
    if (p0) {
        this.b = ((long)(__sourceIntrinsic_de95174e7612_invokedynamic8456_1(447, (5737024786507694601L ^ local2))));
    } else {
        this.b = ((long)(0L));
    }
    return;
}


public void a(moom.bs p0, moom.bs p1, boolean p2) {
this.a(((int)((((moom.bs)(p0)).ordinal() + (((moom.bs)(p1)).ordinal() * moom.mr.a)))), ((boolean)(p2)));
    this.a(((int)((((moom.bs)(p1)).ordinal() + (((moom.bs)(p0)).ordinal() * moom.mr.a)))), ((boolean)(p2)));
    return;
}


public void a(java.util.Set<moom.bs> p0) {
java.util.Iterator life2_2;
    moom.bs life3_9;
    java.util.Iterator life4_12;
    moom.bs life5_19;
    forest_join_27: {
    life2_2 = ((java.util.Set)(p0)).iterator();
    forest_cycle_3: while (true) {
    forest_join_26: {
    if (!(((java.util.Iterator)(life2_2)).hasNext())) {
        break forest_join_27;
    }
    life3_9 = ((moom.bs)(((java.util.Iterator)(life2_2)).next()));
    life4_12 = ((java.util.Set)(p0)).iterator();
    forest_cycle_13: while (true) {
    if (!(((java.util.Iterator)(life4_12)).hasNext())) {
        break forest_join_26;
    }
    life5_19 = ((moom.bs)(((java.util.Iterator)(life4_12)).next()));
    this.a(((moom.bs)(life3_9)), ((moom.bs)(life5_19)), ((boolean)(true)));
    continue forest_cycle_13;
    }
    }
    continue forest_cycle_3;
    }
    }
    return;
}


private void a(int p0, boolean p1) {
if ((__sourceIntrinsic_booleanComparison(p1) != 0)) {
        this.a(((int)(p0)));
    } else {
        this.b(((int)(p0)));
    }
    return;
}


private void a(int p0) {
this.b |= (1L << p0);
    return;
}


private boolean a__Boolean(int p0) {
return (((this.b & (1L << p0)) != 0L) ? true : false);
}


public boolean a(moom.bs p0, moom.bs p1) {
return (__sourceIntrinsic_booleanComparison((((moom.mr)(this)).a__Boolean(((int)((((moom.bs)(p0)).ordinal() + (((moom.bs)(p1)).ordinal() * moom.mr.a))))))) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral8455_0() throws E;

private static native <E extends Throwable> long __sourceIntrinsic_de95174e7612_invokedynamic8456_1(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_8dbec06774c4_originalDynamicSite879_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8454_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a86c261fcdee_invokedynamic6894_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a86c261fcdee_invokedynamic6894_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a86c261fcdee_invokedynamic6894_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a86c261fcdee_invokedynamic6894_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a86c261fcdee_invokedynamic6894_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a86c261fcdee_invokedynamic6894_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a86c261fcdee_invokedynamic6894_26(int a0, long a1) throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
