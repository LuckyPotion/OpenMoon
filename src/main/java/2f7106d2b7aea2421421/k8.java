package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
class k8 {

public moom.k3 a;

public int b;

public int c;

private static long d;

private static long[] e;

private static java.lang.Integer[] f;

private static java.util.Map g;

private k8() { super(); }


private static void __sourceConstructorBody_dd36c5cf63d70146(moom.k8 receiver) throws Throwable {

long local1 = (moom.k8.d ^ 87489351118881L);

    moom.k8.__sourceConstructorInit_dd36c5cf63d70146_0(((moom.k8)(receiver)));

    ((moom.k8)(receiver)).a = ((moom.k3)(new moom.k3(__sourceIntrinsic_dd36c5cf63d70146_originalDynamicSite3028_2(3992, (2337808610905256875L ^ local1)))));

    ((moom.k8)(receiver)).b = ((int)(__sourceIntrinsic_dd36c5cf63d70146_originalDynamicSite3028_4(1919, (5695039487890750287L ^ local1))));

    ((moom.k8)(receiver)).c = ((int)(__sourceIntrinsic_dd36c5cf63d70146_originalDynamicSite3028_6(26697, (2780792193033213051L ^ local1))));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_dd36c5cf63d70146_0(moom.k8 a0) throws E;

static {
d = ((long)(((moom._a)(moom._c.a(((long)(7161263400859712296L)), ((long)(-8117143700206563619L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(183838045041230L)))));
    g = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.k8.d ^ 117360031308066L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill903_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill903_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill903_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill903_14 = new byte[8];
    (__sourceSpill903_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill903_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation903_16 = __sourceSpill903_14;
    ((javax.crypto.Cipher)(__sourceSpill903_11)).init(((int)(__sourceSpill903_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill903_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation903_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[3];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "s»É¬\022\bH\013vE3\bOµeH\000´]Ì"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill903_25 = local6_life21;
        int __sourceSpill903_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill903_25)).substring(((int)(__sourceSpill903_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill903_30 = local8_life19;
        int __sourceSpill903_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill903_33 = new byte[8];
        (__sourceSpill903_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill903_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill903_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill903_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill903_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill903_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill903_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill903_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill903_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill903_34)).doFinal(((byte[])(__sourceSpill903_33)));
        (__sourceSpill903_30)[__sourceSpill903_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    e = ((long[])(local8_life19));
    f = ((java.lang.Integer[])(new java.lang.Integer[3]));
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.k8.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral8208_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/k8"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 18578;
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
            throw new RuntimeException("moom/k8", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f[var3] = var15;
      }

      return f[var3];
}


private static native <E extends Throwable> int __sourceIntrinsic_dd36c5cf63d70146_originalDynamicSite3028_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_dd36c5cf63d70146_originalDynamicSite3028_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_dd36c5cf63d70146_originalDynamicSite3028_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral8208_0() throws E;
}
