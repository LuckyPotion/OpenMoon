package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class mv {

public float[][] a;

public float[] b;

public float[] c;

public float[] d;

public boolean e;

private static java.lang.String[] f;

private static long m;

private static long[] o;

private static java.lang.Integer[] p;

private static java.util.Map q;

public mv() { super(); __sourceHandlerCall_0cb57121fc532a7b3d69(this); }


static {
m = ((long)(((moom._a)(moom._c.a(((long)(-2699082434267798344L)), ((long)(7784093517569836812L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(251820853982559L)))));
    java.lang.String[] __sourceSpill1411_6 = new java.lang.String[1];
    q = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life8 = (moom.mv.m ^ 88193154517995L);
    moom.mv.b(((java.lang.String[])(__sourceSpill1411_6)));
    javax.crypto.Cipher local2_life11;
    javax.crypto.Cipher __sourceSpill1411_13 = (local2_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1411_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1411_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1411_16 = new byte[8];
    (__sourceSpill1411_16)[0] = ((byte) ((int) (local0_life8 >>> 56)));
    int local3_life17 = 1;
    while ((local3_life17 < 8)) {
        (__sourceSpill1411_16)[local3_life17] = ((byte) ((int) ((local0_life8 << (local3_life17 * 8)) >>> 56)));
        local3_life17 += 1;
    }
    byte[] __sourcePreallocation1411_18 = __sourceSpill1411_16;
    ((javax.crypto.Cipher)(__sourceSpill1411_13)).init(((int)(__sourceSpill1411_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1411_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1411_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life21 = new long[4];
    int local5_life22 = 0;
    java.lang.String local6_life23;
    int local7_life25 = ((java.lang.String)((local6_life23 = "£Q\"·\1779<<[³·/9\004"))).length();
    int local4_life26 = 0;
    do {
        java.lang.String __sourceSpill1411_27 = local6_life23;
        int __sourceSpill1411_28 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life31 = ((java.lang.String)(((java.lang.String)(__sourceSpill1411_27)).substring(((int)(__sourceSpill1411_28)), ((int)(local4_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1411_32 = local8_life21;
        int __sourceSpill1411_33 = local5_life22;
        local5_life22 += 1;
        long local10_life34 = (((((((((((long) (local9_life31)[0]) & 255L) << 56) | ((((long) (local9_life31)[1]) & 255L) << 48)) | ((((long) (local9_life31)[2]) & 255L) << 40)) | ((((long) (local9_life31)[3]) & 255L) << 32)) | ((((long) (local9_life31)[4]) & 255L) << 24)) | ((((long) (local9_life31)[5]) & 255L) << 16)) | ((((long) (local9_life31)[6]) & 255L) << 8)) | (((long) (local9_life31)[7]) & 255L));
        byte[] __sourceSpill1411_35 = new byte[8];
        (__sourceSpill1411_35)[0] = ((byte) ((int) (local10_life34 >>> 56)));
        (__sourceSpill1411_35)[1] = ((byte) ((int) (local10_life34 >>> 48)));
        (__sourceSpill1411_35)[2] = ((byte) ((int) (local10_life34 >>> 40)));
        (__sourceSpill1411_35)[3] = ((byte) ((int) (local10_life34 >>> 32)));
        (__sourceSpill1411_35)[4] = ((byte) ((int) (local10_life34 >>> 24)));
        (__sourceSpill1411_35)[5] = ((byte) ((int) (local10_life34 >>> 16)));
        (__sourceSpill1411_35)[6] = ((byte) ((int) (local10_life34 >>> 8)));
        (__sourceSpill1411_35)[7] = ((byte) ((int) local10_life34));
        javax.crypto.Cipher __sourceSpill1411_36 = local2_life11;
        byte[] local12_life38 = ((javax.crypto.Cipher)(__sourceSpill1411_36)).doFinal(((byte[])(__sourceSpill1411_35)));
        (__sourceSpill1411_32)[__sourceSpill1411_33] = (((((((((((long) (local12_life38)[0]) & 255L) << 56) | ((((long) (local12_life38)[1]) & 255L) << 48)) | ((((long) (local12_life38)[2]) & 255L) << 40)) | ((((long) (local12_life38)[3]) & 255L) << 32)) | ((((long) (local12_life38)[4]) & 255L) << 24)) | ((((long) (local12_life38)[5]) & 255L) << 16)) | ((((long) (local12_life38)[6]) & 255L) << 8)) | (((long) (local12_life38)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    local7_life25 = ((java.lang.String)((local6_life23 = "§\024åÀ[_§{ýøZåXdË"))).length();
    local4_life26 = 0;
    do {
        java.lang.String __sourceSpill1411_40 = local6_life23;
        int __sourceSpill1411_41 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life44 = ((java.lang.String)(((java.lang.String)(__sourceSpill1411_40)).substring(((int)(__sourceSpill1411_41)), ((int)(local4_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1411_45 = local8_life21;
        int __sourceSpill1411_46 = local5_life22;
        local5_life22 += 1;
        long local10_life47 = (((((((((((long) (local9_life44)[0]) & 255L) << 56) | ((((long) (local9_life44)[1]) & 255L) << 48)) | ((((long) (local9_life44)[2]) & 255L) << 40)) | ((((long) (local9_life44)[3]) & 255L) << 32)) | ((((long) (local9_life44)[4]) & 255L) << 24)) | ((((long) (local9_life44)[5]) & 255L) << 16)) | ((((long) (local9_life44)[6]) & 255L) << 8)) | (((long) (local9_life44)[7]) & 255L));
        byte[] __sourceSpill1411_48 = new byte[8];
        (__sourceSpill1411_48)[0] = ((byte) ((int) (local10_life47 >>> 56)));
        (__sourceSpill1411_48)[1] = ((byte) ((int) (local10_life47 >>> 48)));
        (__sourceSpill1411_48)[2] = ((byte) ((int) (local10_life47 >>> 40)));
        (__sourceSpill1411_48)[3] = ((byte) ((int) (local10_life47 >>> 32)));
        (__sourceSpill1411_48)[4] = ((byte) ((int) (local10_life47 >>> 24)));
        (__sourceSpill1411_48)[5] = ((byte) ((int) (local10_life47 >>> 16)));
        (__sourceSpill1411_48)[6] = ((byte) ((int) (local10_life47 >>> 8)));
        (__sourceSpill1411_48)[7] = ((byte) ((int) local10_life47));
        javax.crypto.Cipher __sourceSpill1411_49 = local2_life11;
        byte[] local12_life51 = ((javax.crypto.Cipher)(__sourceSpill1411_49)).doFinal(((byte[])(__sourceSpill1411_48)));
        (__sourceSpill1411_45)[__sourceSpill1411_46] = (((((((((((long) (local12_life51)[0]) & 255L) << 56) | ((((long) (local12_life51)[1]) & 255L) << 48)) | ((((long) (local12_life51)[2]) & 255L) << 40)) | ((((long) (local12_life51)[3]) & 255L) << 32)) | ((((long) (local12_life51)[4]) & 255L) << 24)) | ((((long) (local12_life51)[5]) & 255L) << 16)) | ((((long) (local12_life51)[6]) & 255L) << 8)) | (((long) (local12_life51)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    o = ((long[])(local8_life21));
    p = ((java.lang.Integer[])(new java.lang.Integer[4]));
}

private static native <E extends Throwable> void __sourceHandlerCall_0cb57121fc532a7b3d69(moom.mv a0) throws E;
private static final class __SourceHandler_0cb57121fc532a7b3d69 {

public static void f706(moom.mv receiver) throws Throwable {
    long local1_life2 = (__fieldRead706_0() ^ __originalNumericLdc706_1());
    __directSuperInit706_3(receiver);
    __fieldWrite706_7(receiver, __multiArray706_6(__originalDynamicSite706_5(26633, (__originalNumericLdc706_4() ^ local1_life2)), 4));
    __fieldWrite706_10(receiver, new float[__originalDynamicSite706_9(11988, (__originalNumericLdc706_8() ^ local1_life2))]);
    __fieldWrite706_13(receiver, new float[__originalDynamicSite706_12(20001, (__originalNumericLdc706_11() ^ local1_life2))]);
    __fieldWrite706_16(receiver, new float[__originalDynamicSite706_15(20001, (__originalNumericLdc706_14() ^ local1_life2))]);
    __fieldWrite706_17(receiver, 0);
    return;
}
private static native long __fieldRead706_0() throws Throwable;
private static native long __originalNumericLdc706_1() throws Throwable;
private static native void __directSuperInit706_3(moom.mv a0) throws Throwable;
private static native long __originalNumericLdc706_4() throws Throwable;
private static native int __originalDynamicSite706_5(int a0, long a1) throws Throwable;
private static native float[][] __multiArray706_6(int a0, int a1) throws Throwable;
private static native void __fieldWrite706_7(moom.mv a0, float[][] a1) throws Throwable;
private static native long __originalNumericLdc706_8() throws Throwable;
private static native int __originalDynamicSite706_9(int a0, long a1) throws Throwable;
private static native void __fieldWrite706_10(moom.mv a0, float[] a1) throws Throwable;
private static native long __originalNumericLdc706_11() throws Throwable;
private static native int __originalDynamicSite706_12(int a0, long a1) throws Throwable;
private static native void __fieldWrite706_13(moom.mv a0, float[] a1) throws Throwable;
private static native long __originalNumericLdc706_14() throws Throwable;
private static native int __originalDynamicSite706_15(int a0, long a1) throws Throwable;
private static native void __fieldWrite706_16(moom.mv a0, float[] a1) throws Throwable;
private static native void __fieldWrite706_17(moom.mv a0, int a1) throws Throwable;

}


public static void b(java.lang.String[] p0) {
f = ((java.lang.String[])(p0));
    return;
}


public static java.lang.String[] b() {
return moom.mv.f;
}


public boolean b(double p0, double p1, double p2, double p3, double p4, double p5) {
long life13_3;
    float life15_9;
    float life16_12;
    float life17_15;
    float life18_18;
    float life19_21;
    float life20_24;
    int life21_26;
    float[] life22_38;
    float life23_42;
    float life24_46;
    float life25_50;
    float life26_54;
    lexical_join_320: {
    life13_3 = (moom.mv.m ^ 8690749930955L);
    if (!((!this.e))) {
        break lexical_join_320;
    }
    life15_9 = ((float) p0);
    life16_12 = ((float) p1);
    life17_15 = ((float) p2);
    life18_18 = ((float) p3);
    life19_21 = ((float) p4);
    life20_24 = ((float) p5);
    life21_26 = 0;
    lexical_cycle_27: while (true) {
    lexical_join_318: {
    lexical_join_188: {
    lexical_join_186: {
    if (!((life21_26 < __sourceIntrinsic_ff985a34eea6_invokedynamic1252_2(26633, (3335326104921667454L ^ life13_3))))) {
        break lexical_join_320;
    }
    life22_38 = (this.a)[life21_26];
    life23_42 = (life22_38)[0];
    life24_46 = (life22_38)[1];
    life25_50 = (life22_38)[2];
    life26_54 = (life22_38)[3];
    if (!((life21_26 < 4))) {
        break lexical_join_188;
    }
    if (!((recovery.source.CarrierOps.fcmpg(((float)(((((life23_42 * life15_9) + (life24_46 * life16_12)) + (life25_50 * life17_15)) + life26_54))), ((float)(0x0.0p0f))) > 0))) {
        break lexical_join_186;
    }
    if (!((recovery.source.CarrierOps.fcmpg(((float)(((((life23_42 * life18_18) + (life24_46 * life16_12)) + (life25_50 * life17_15)) + life26_54))), ((float)(0x0.0p0f))) > 0))) {
        break lexical_join_186;
    }
    if (!((recovery.source.CarrierOps.fcmpg(((float)(((((life23_42 * life15_9) + (life24_46 * life19_21)) + (life25_50 * life17_15)) + life26_54))), ((float)(0x0.0p0f))) > 0))) {
        break lexical_join_186;
    }
    if (!((recovery.source.CarrierOps.fcmpg(((float)(((((life23_42 * life18_18) + (life24_46 * life19_21)) + (life25_50 * life17_15)) + life26_54))), ((float)(0x0.0p0f))) > 0))) {
        break lexical_join_186;
    }
    if (!((recovery.source.CarrierOps.fcmpg(((float)(((((life23_42 * life15_9) + (life24_46 * life16_12)) + (life25_50 * life20_24)) + life26_54))), ((float)(0x0.0p0f))) > 0))) {
        break lexical_join_186;
    }
    if (!((recovery.source.CarrierOps.fcmpg(((float)(((((life23_42 * life18_18) + (life24_46 * life16_12)) + (life25_50 * life20_24)) + life26_54))), ((float)(0x0.0p0f))) > 0))) {
        break lexical_join_186;
    }
    if (!((recovery.source.CarrierOps.fcmpg(((float)(((((life23_42 * life15_9) + (life24_46 * life19_21)) + (life25_50 * life20_24)) + life26_54))), ((float)(0x0.0p0f))) > 0))) {
        break lexical_join_186;
    }
    if (!((recovery.source.CarrierOps.fcmpg(((float)(((((life23_42 * life18_18) + (life24_46 * life19_21)) + (life25_50 * life20_24)) + life26_54))), ((float)(0x0.0p0f))) <= 0))) {
        break lexical_join_318;
    }
    }
    return ((0) != 0);
    }
    if (!((recovery.source.CarrierOps.fcmpg(((float)(((((life23_42 * life15_9) + (life24_46 * life16_12)) + (life25_50 * life17_15)) + life26_54))), ((float)(0x0.0p0f))) <= 0))) {
        break lexical_join_318;
    }
    if (!((recovery.source.CarrierOps.fcmpg(((float)(((((life23_42 * life18_18) + (life24_46 * life16_12)) + (life25_50 * life17_15)) + life26_54))), ((float)(0x0.0p0f))) <= 0))) {
        break lexical_join_318;
    }
    if (!((recovery.source.CarrierOps.fcmpg(((float)(((((life23_42 * life15_9) + (life24_46 * life19_21)) + (life25_50 * life17_15)) + life26_54))), ((float)(0x0.0p0f))) <= 0))) {
        break lexical_join_318;
    }
    if (!((recovery.source.CarrierOps.fcmpg(((float)(((((life23_42 * life18_18) + (life24_46 * life19_21)) + (life25_50 * life17_15)) + life26_54))), ((float)(0x0.0p0f))) <= 0))) {
        break lexical_join_318;
    }
    if (!((recovery.source.CarrierOps.fcmpg(((float)(((((life23_42 * life15_9) + (life24_46 * life16_12)) + (life25_50 * life20_24)) + life26_54))), ((float)(0x0.0p0f))) <= 0))) {
        break lexical_join_318;
    }
    if (!((recovery.source.CarrierOps.fcmpg(((float)(((((life23_42 * life18_18) + (life24_46 * life16_12)) + (life25_50 * life20_24)) + life26_54))), ((float)(0x0.0p0f))) <= 0))) {
        break lexical_join_318;
    }
    if (!((recovery.source.CarrierOps.fcmpg(((float)(((((life23_42 * life15_9) + (life24_46 * life19_21)) + (life25_50 * life20_24)) + life26_54))), ((float)(0x0.0p0f))) <= 0))) {
        break lexical_join_318;
    }
    if (!((recovery.source.CarrierOps.fcmpg(((float)(((((life23_42 * life18_18) + (life24_46 * life19_21)) + (life25_50 * life20_24)) + life26_54))), ((float)(0x0.0p0f))) <= 0))) {
        break lexical_join_318;
    }
    return ((0) != 0);
    }
    life21_26 += 1;
    continue lexical_cycle_27;
    }
    }
    return ((1) != 0);
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 27178;
      if (p[var3] == null) {
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
         long var5 = o[var3];
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
         Object[] var9 = (Object[])q.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               q.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/mv", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         p[var3] = var15;
      }

      return p[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.mv.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral8465_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/mv"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private float a(float[] p0, float p1, float p2, float p3) {
return (((((p0)[0] * p1) + ((p0)[1] * p2)) + ((p0)[2] * p3)) + (p0)[3]);
}


public boolean a(double p0, double p1, double p2, double p3, double p4, double p5) {
long life13_3;
    float life15_9;
    float life16_12;
    float life17_15;
    float life18_18;
    float life19_21;
    float life20_24;
    int life21_26;
    float[] life22_38;
    float life23_42;
    float life24_46;
    float life25_50;
    float life26_54;
    life13_3 = (moom.mv.m ^ 41594926976331L);
    if ((!this.e)) {
        life15_9 = ((float) p0);
        life16_12 = ((float) p1);
        life17_15 = ((float) p2);
        life18_18 = ((float) p3);
        life19_21 = ((float) p4);
        life20_24 = ((float) p5);
        life21_26 = 0;
        loop_region_27: while ((life21_26 < __sourceIntrinsic_f936ece273c5_invokedynamic6700_2(14654, (8496755872344151754L ^ life13_3)))) {
        life22_38 = (this.a)[life21_26];
        life23_42 = (life22_38)[0];
        life24_46 = (life22_38)[1];
        life25_50 = (life22_38)[2];
        life26_54 = (life22_38)[3];
        if ((((((life23_42 * life15_9) + (life24_46 * life16_12)) + (life25_50 * life17_15)) + life26_54) <= 0x0.0p0f)) {
        if ((((((life23_42 * life18_18) + (life24_46 * life16_12)) + (life25_50 * life17_15)) + life26_54) <= 0x0.0p0f)) {
        if ((((((life23_42 * life15_9) + (life24_46 * life19_21)) + (life25_50 * life17_15)) + life26_54) <= 0x0.0p0f)) {
        if ((((((life23_42 * life18_18) + (life24_46 * life19_21)) + (life25_50 * life17_15)) + life26_54) <= 0x0.0p0f)) {
        if ((((((life23_42 * life15_9) + (life24_46 * life16_12)) + (life25_50 * life20_24)) + life26_54) <= 0x0.0p0f)) {
        if ((((((life23_42 * life18_18) + (life24_46 * life16_12)) + (life25_50 * life20_24)) + life26_54) <= 0x0.0p0f)) {
        if ((((((life23_42 * life15_9) + (life24_46 * life19_21)) + (life25_50 * life20_24)) + life26_54) <= 0x0.0p0f)) {
        if ((((((life23_42 * life18_18) + (life24_46 * life19_21)) + (life25_50 * life20_24)) + life26_54) <= 0x0.0p0f)) {
        return false;
    }
    }
    }
    }
    }
    }
    }
    }
        life21_26 += 1;
    }
    }
    return true;
}


private static native <E extends Throwable> int __sourceIntrinsic_7ddff02174cc_originalDynamicSite706_5(int a0, long a1) throws E;

private static native <E extends Throwable> float[][] __sourceIntrinsic_7ddff02174cc_multiArray706_6(int a0, int a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ddff02174cc_originalDynamicSite706_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ddff02174cc_originalDynamicSite706_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ddff02174cc_originalDynamicSite706_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f936ece273c5_invokedynamic6700_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral8465_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ff985a34eea6_invokedynamic1252_2(int a0, long a1) throws E;
}
