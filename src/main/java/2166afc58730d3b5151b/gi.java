package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class gi extends moom.gc {

private net.minecraft.client.settings.GameSettings$Options r;

private static long t;

private static long[] u;

private static java.lang.Integer[] v;

private static java.util.Map w;

public gi(int p0, int p1, int p2, net.minecraft.client.settings.GameSettings$Options p3, java.lang.String p4) { super(0, 0, 0, 0, 0, (java.lang.String)null); }


private static void __sourceConstructorBody_e4d8bdcb7d5dc39a(moom.gi receiver, int p0, int p1, int p2, net.minecraft.client.settings.GameSettings$Options p3, java.lang.String p4) throws Throwable {

long local6 = (moom.gi.t ^ 50521703362232L);

    moom.gi.__sourceConstructorInit_e4d8bdcb7d5dc39a_0(((moom.gi)(receiver)), ((int)(p0)), ((int)(p1)), ((int)(p2)), ((int)(__sourceIntrinsic_e4d8bdcb7d5dc39a_originalDynamicSite2773_1(17755, (8216692899773173232L ^ local6)))), ((int)(__sourceIntrinsic_e4d8bdcb7d5dc39a_originalDynamicSite2773_2(6579, (7165970553849254169L ^ local6)))), ((java.lang.String)(p4)));

    ((moom.gi)(receiver)).r = ((net.minecraft.client.settings.GameSettings$Options)(p3));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_e4d8bdcb7d5dc39a_0(moom.gi a0, int a1, int a2, int a3, int a4, int a5, java.lang.String a6) throws E;

public gi(int p0, int p1, int p2, int p3, int p4, java.lang.String p5) {
super(p0, p1, p2, p3, p4, p5);
    this.r = null;
}


public gi(int p0, int p1, int p2, java.lang.String p3) {
this(((int)(p0)), ((int)(p1)), ((int)(p2)), ((net.minecraft.client.settings.GameSettings$Options)(null)), ((java.lang.String)(p3)));
    return;
}


static {
t = ((long)(((moom._a)(moom._c.a(((long)(6781103091206328251L)), ((long)(-4634555402263021339L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(150510387516137L)))));
    w = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.gi.t ^ 134854218076118L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill852_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill852_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill852_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill852_14 = new byte[8];
    (__sourceSpill852_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill852_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation852_16 = __sourceSpill852_14;
    ((javax.crypto.Cipher)(__sourceSpill852_11)).init(((int)(__sourceSpill852_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill852_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation852_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "CA6{fa¯<§v\025D_f"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill852_25 = local6_life21;
        int __sourceSpill852_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill852_25)).substring(((int)(__sourceSpill852_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill852_30 = local8_life19;
        int __sourceSpill852_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill852_33 = new byte[8];
        (__sourceSpill852_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill852_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill852_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill852_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill852_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill852_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill852_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill852_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill852_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill852_34)).doFinal(((byte[])(__sourceSpill852_33)));
        (__sourceSpill852_30)[__sourceSpill852_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    u = ((long[])(local8_life19));
    v = ((java.lang.Integer[])(new java.lang.Integer[2]));
}


public net.minecraft.client.settings.GameSettings$Options b() {
return this.r;
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral7761_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/gi"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.gi.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int c(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 8814;
      if (v[var3] == null) {
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
         long var5 = u[var3];
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
         Object[] var9 = (Object[])w.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               w.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/gi", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         v[var3] = var15;
      }

      return v[var3];
}


private static native <E extends Throwable> int __sourceIntrinsic_e4d8bdcb7d5dc39a_originalDynamicSite2773_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e4d8bdcb7d5dc39a_originalDynamicSite2773_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral7761_0() throws E;
}
