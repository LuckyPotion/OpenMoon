package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class i4 extends moom.iQ {

public moom.jD i;

public moom.jD j;

public moom.jD k;

private static long l;

private static long[] n;

private static java.lang.Integer[] o;

private static java.util.Map p;

public i4() { super(); }


private static void __sourceConstructorBody_a15bc6178bb21b78(moom.i4 receiver) throws Throwable {

long local1 = (moom.i4.l ^ 33613704047347L);

    moom.i4.__sourceConstructorInit_a15bc6178bb21b78_0(((moom.i4)(receiver)));

    ((moom.i4)(receiver)).i = ((moom.jD)(((moom.jD)(new moom.jD(receiver, 0, 0))).b(((int)(__sourceIntrinsic_a15bc6178bb21b78_originalDynamicSite2862_2(458, (4307863209909746279L ^ local1)))), ((int)(__sourceIntrinsic_a15bc6178bb21b78_originalDynamicSite2862_3(2235, (5713408274542359316L ^ local1)))))));

    ((moom.jD)(((moom.i4)(receiver)).i)).a(((float)(0x0.0p0f)), ((float)(-0x1.4p2f)), ((float)(-0x1.cp3f)), ((int)(__sourceIntrinsic_a15bc6178bb21b78_originalDynamicSite2862_7(28613, (4254324605448721519L ^ local1)))), ((int)(5)), ((int)(__sourceIntrinsic_a15bc6178bb21b78_originalDynamicSite2862_8(27500, (3793261759467720896L ^ local1)))), ((float)(0x0.0p0f)));

    ((moom.jD)(((moom.i4)(receiver)).i)).e = ((float)(0x1.0p0f));

    ((moom.jD)(((moom.i4)(receiver)).i)).f = ((float)(0x1.cp2f));

    ((moom.jD)(((moom.i4)(receiver)).i)).g = ((float)(0x1.ep3f));

    ((moom.i4)(receiver)).k = ((moom.jD)(((moom.jD)(new moom.jD(receiver, 0, 0))).b(((int)(__sourceIntrinsic_a15bc6178bb21b78_originalDynamicSite2862_16(2235, (5713408274542359316L ^ local1)))), ((int)(__sourceIntrinsic_a15bc6178bb21b78_originalDynamicSite2862_17(2235, (5713408274542359316L ^ local1)))))));

    ((moom.jD)(((moom.i4)(receiver)).k)).a(((float)(-0x1.0p0f)), ((float)(-0x1.0p1f)), ((float)(-0x1.ep3f)), ((int)(2)), ((int)(4)), ((int)(1)), ((float)(0x0.0p0f)));

    ((moom.jD)(((moom.i4)(receiver)).k)).e = ((float)(0x1.0p3f));

    ((moom.jD)(((moom.i4)(receiver)).k)).f = ((float)(0x1.cp2f));

    ((moom.jD)(((moom.i4)(receiver)).k)).g = ((float)(0x1.ep3f));

    ((moom.i4)(receiver)).j = ((moom.jD)(((moom.jD)(new moom.jD(receiver, 0, __sourceIntrinsic_a15bc6178bb21b78_originalDynamicSite2862_28(24952, (5846354890944944851L ^ local1))))).b(((int)(__sourceIntrinsic_a15bc6178bb21b78_originalDynamicSite2862_29(2235, (5713408274542359316L ^ local1)))), ((int)(__sourceIntrinsic_a15bc6178bb21b78_originalDynamicSite2862_30(2235, (5713408274542359316L ^ local1)))))));

    ((moom.jD)(((moom.i4)(receiver)).j)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((int)(__sourceIntrinsic_a15bc6178bb21b78_originalDynamicSite2862_34(27500, (3793261759467720896L ^ local1)))), ((int)(__sourceIntrinsic_a15bc6178bb21b78_originalDynamicSite2862_35(1054, (699953417804251056L ^ local1)))), ((int)(__sourceIntrinsic_a15bc6178bb21b78_originalDynamicSite2862_36(27500, (3793261759467720896L ^ local1)))), ((float)(0x0.0p0f)));

    ((moom.jD)(((moom.i4)(receiver)).j)).e = ((float)(0x1.0p0f));

    ((moom.jD)(((moom.i4)(receiver)).j)).f = ((float)(0x1.8p2f));

    ((moom.jD)(((moom.i4)(receiver)).j)).g = ((float)(0x1.0p0f));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_a15bc6178bb21b78_0(moom.i4 a0) throws E;

static {
l = ((long)(((moom._a)(moom._c.a(((long)(-9141222177946302078L)), ((long)(1223549954722516760L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(98991695102149L)))));
    p = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.i4.l ^ 24292335848573L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1279_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1279_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1279_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1279_14 = new byte[8];
    (__sourceSpill1279_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1279_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1279_16 = __sourceSpill1279_14;
    ((javax.crypto.Cipher)(__sourceSpill1279_11)).init(((int)(__sourceSpill1279_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1279_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1279_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[6];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "ÁlAë]©Gò)È<\007\033Ò\031xA\021ü0²¹Û=îÁ"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1279_25 = local6_life21;
        int __sourceSpill1279_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1279_25)).substring(((int)(__sourceSpill1279_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1279_30 = local8_life19;
        int __sourceSpill1279_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1279_33 = new byte[8];
        (__sourceSpill1279_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1279_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1279_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1279_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1279_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1279_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1279_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1279_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1279_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1279_34)).doFinal(((byte[])(__sourceSpill1279_33)));
        (__sourceSpill1279_30)[__sourceSpill1279_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "\013ä\031\027¯\\º?6dª\031³1Aj"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1279_38 = local6_life21;
        int __sourceSpill1279_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1279_38)).substring(((int)(__sourceSpill1279_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1279_43 = local8_life19;
        int __sourceSpill1279_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1279_46 = new byte[8];
        (__sourceSpill1279_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1279_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1279_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1279_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1279_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1279_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1279_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1279_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1279_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1279_47)).doFinal(((byte[])(__sourceSpill1279_46)));
        (__sourceSpill1279_43)[__sourceSpill1279_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    n = ((long[])(local8_life19));
    o = ((java.lang.Integer[])(new java.lang.Integer[6]));
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7990_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/i4"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.i4.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 2329;
      if (o[var3] == null) {
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
         long var5 = n[var3];
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
         Object[] var9 = (Object[])p.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               p.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/i4", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         o[var3] = var15;
      }

      return o[var3];
}


public void a() {
((moom.jD)(this.k)).h = ((float)(((moom.jD)(this.i)).h));
    ((moom.jD)(this.i)).a(((float)(0x1.0p-4f)));
    ((moom.jD)(this.k)).a(((float)(0x1.0p-4f)));
    ((moom.jD)(this.j)).a(((float)(0x1.0p-4f)));
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_a15bc6178bb21b78_originalDynamicSite2862_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a15bc6178bb21b78_originalDynamicSite2862_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a15bc6178bb21b78_originalDynamicSite2862_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a15bc6178bb21b78_originalDynamicSite2862_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a15bc6178bb21b78_originalDynamicSite2862_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a15bc6178bb21b78_originalDynamicSite2862_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a15bc6178bb21b78_originalDynamicSite2862_28(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a15bc6178bb21b78_originalDynamicSite2862_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a15bc6178bb21b78_originalDynamicSite2862_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a15bc6178bb21b78_originalDynamicSite2862_34(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a15bc6178bb21b78_originalDynamicSite2862_35(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a15bc6178bb21b78_originalDynamicSite2862_36(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7990_0() throws E;
}
