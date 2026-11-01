package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class i5 extends moom.i4 {

private static long m;

private static long[] q;

private static java.lang.Integer[] r;

private static java.util.Map s;

public i5() { super(); }


private static void __sourceConstructorBody_2118915291fa8396(moom.i5 receiver) throws Throwable {

long local1 = (moom.i5.m ^ 88950382211599L);

    moom.i5.__sourceConstructorInit_2118915291fa8396_0(((moom.i5)(receiver)));

    ((moom.i5)(receiver)).i = ((moom.jD)(((moom.jD)(new moom.jD(receiver, 0, 0))).b(((int)(__sourceIntrinsic_2118915291fa8396_originalDynamicSite2864_2(3916, (126772658846482902L ^ local1)))), ((int)(__sourceIntrinsic_2118915291fa8396_originalDynamicSite2864_3(706, (7624805156845833307L ^ local1)))))));

    ((moom.jD)(((moom.i5)(receiver)).i)).a(((float)(0x0.0p0f)), ((float)(-0x1.4p2f)), ((float)(-0x1.cp3f)), ((int)(__sourceIntrinsic_2118915291fa8396_originalDynamicSite2864_7(12060, (7179913739835990401L ^ local1)))), ((int)(5)), ((int)(__sourceIntrinsic_2118915291fa8396_originalDynamicSite2864_8(9677, (8027654066009893717L ^ local1)))), ((float)(0x0.0p0f)));

    ((moom.jD)(((moom.i5)(receiver)).i)).e = ((float)(0x1.0p0f));

    ((moom.jD)(((moom.i5)(receiver)).i)).f = ((float)(0x1.cp2f));

    ((moom.jD)(((moom.i5)(receiver)).i)).g = ((float)(0x1.ep3f));

    ((moom.i5)(receiver)).k = ((moom.jD)(((moom.jD)(new moom.jD(receiver, 0, 0))).b(((int)(__sourceIntrinsic_2118915291fa8396_originalDynamicSite2864_16(23117, (3411549379562050769L ^ local1)))), ((int)(__sourceIntrinsic_2118915291fa8396_originalDynamicSite2864_17(1291, (7179110282880437140L ^ local1)))))));

    ((moom.jD)(((moom.i5)(receiver)).k)).a(((float)(-0x1.0p0f)), ((float)(-0x1.0p1f)), ((float)(-0x1.ep3f)), ((int)(2)), ((int)(4)), ((int)(1)), ((float)(0x0.0p0f)));

    ((moom.jD)(((moom.i5)(receiver)).k)).e = ((float)(0x1.0p4f));

    ((moom.jD)(((moom.i5)(receiver)).k)).f = ((float)(0x1.cp2f));

    ((moom.jD)(((moom.i5)(receiver)).k)).g = ((float)(0x1.ep3f));

    ((moom.i5)(receiver)).j = ((moom.jD)(((moom.jD)(new moom.jD(receiver, 0, __sourceIntrinsic_2118915291fa8396_originalDynamicSite2864_28(25498, (8629891780446989578L ^ local1))))).b(((int)(__sourceIntrinsic_2118915291fa8396_originalDynamicSite2864_29(23117, (3411549379562050769L ^ local1)))), ((int)(__sourceIntrinsic_2118915291fa8396_originalDynamicSite2864_30(1291, (7179110282880437140L ^ local1)))))));

    ((moom.jD)(((moom.i5)(receiver)).j)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((int)(__sourceIntrinsic_2118915291fa8396_originalDynamicSite2864_34(14985, (6012503197597627410L ^ local1)))), ((int)(__sourceIntrinsic_2118915291fa8396_originalDynamicSite2864_35(31415, (4659973156638209065L ^ local1)))), ((int)(__sourceIntrinsic_2118915291fa8396_originalDynamicSite2864_36(22440, (7120554012117375289L ^ local1)))), ((float)(0x0.0p0f)));

    ((moom.jD)(((moom.i5)(receiver)).j)).e = ((float)(0x1.0p0f));

    ((moom.jD)(((moom.i5)(receiver)).j)).f = ((float)(0x1.8p2f));

    ((moom.jD)(((moom.i5)(receiver)).j)).g = ((float)(0x1.0p0f));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_2118915291fa8396_0(moom.i5 a0) throws E;

static {
m = ((long)(((moom._a)(moom._c.a(((long)(3788379609226529948L)), ((long)(962385585295844085L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(173978643068751L)))));
    s = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.i5.m ^ 61156268018677L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1280_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1280_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1280_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1280_14 = new byte[8];
    (__sourceSpill1280_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1280_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1280_16 = __sourceSpill1280_14;
    ((javax.crypto.Cipher)(__sourceSpill1280_11)).init(((int)(__sourceSpill1280_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1280_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1280_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[10];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "øÎÎÄp\026ß°\032iïËX\013î^a.o¡ãLC\036®öµñ\\Þ¾ý%ñ\000ôx\030?ä!´nÛ'çu\bý¤Gõ²ô"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1280_25 = local6_life21;
        int __sourceSpill1280_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1280_25)).substring(((int)(__sourceSpill1280_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1280_30 = local8_life19;
        int __sourceSpill1280_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1280_33 = new byte[8];
        (__sourceSpill1280_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1280_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1280_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1280_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1280_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1280_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1280_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1280_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1280_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1280_34)).doFinal(((byte[])(__sourceSpill1280_33)));
        (__sourceSpill1280_30)[__sourceSpill1280_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "Ö~Vb¡­aB¡é@æÎ"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1280_38 = local6_life21;
        int __sourceSpill1280_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1280_38)).substring(((int)(__sourceSpill1280_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1280_43 = local8_life19;
        int __sourceSpill1280_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1280_46 = new byte[8];
        (__sourceSpill1280_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1280_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1280_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1280_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1280_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1280_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1280_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1280_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1280_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1280_47)).doFinal(((byte[])(__sourceSpill1280_46)));
        (__sourceSpill1280_43)[__sourceSpill1280_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    q = ((long[])(local8_life19));
    r = ((java.lang.Integer[])(new java.lang.Integer[10]));
}


private static int c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.i5.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral7991_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/i5"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int c(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 28919;
      if (r[var3] == null) {
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
         long var5 = q[var3];
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
         Object[] var9 = (Object[])s.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               s.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/i5", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         r[var3] = var15;
      }

      return r[var3];
}


private static native <E extends Throwable> int __sourceIntrinsic_2118915291fa8396_originalDynamicSite2864_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2118915291fa8396_originalDynamicSite2864_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2118915291fa8396_originalDynamicSite2864_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2118915291fa8396_originalDynamicSite2864_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2118915291fa8396_originalDynamicSite2864_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2118915291fa8396_originalDynamicSite2864_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2118915291fa8396_originalDynamicSite2864_28(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2118915291fa8396_originalDynamicSite2864_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2118915291fa8396_originalDynamicSite2864_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2118915291fa8396_originalDynamicSite2864_34(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2118915291fa8396_originalDynamicSite2864_35(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2118915291fa8396_originalDynamicSite2864_36(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral7991_0() throws E;
}
