package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class si extends net.minecraft.client.particle.EntityFX {

private static long bb;

private static long[] hb;

private static java.lang.Integer[] ib;

private static java.util.Map jb;

protected si(net.minecraft.world.World p0, double p1, double p2, double p3, double p4, double p5, double p6) { super((net.minecraft.world.World)null, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D); }


private static void __sourceConstructorBody_3609bc2b18763f43(moom.si receiver, net.minecraft.world.World p0, double p1, double p2, double p3, double p4, double p5, double p6) throws Throwable {

long local14_life1 = (moom.si.bb ^ 108675635093854L);

    moom.si.__sourceConstructorInit_3609bc2b18763f43_0(((moom.si)(receiver)), ((net.minecraft.world.World)(p0)), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)));

    receiver.t *= 0x1.333334p-2d;

    ((moom.si)(receiver)).u = ((double)(((java.lang.Math.random() * 0x1.99999ap-3d) + 0x1.99999ap-4d)));

    receiver.v *= 0x1.333334p-2d;

    ((moom.si)(receiver)).aM = ((float)(0x1.0p0f));

    ((moom.si)(receiver)).aN = ((float)(0x1.0p0f));

    ((moom.si)(receiver)).aO = ((float)(0x1.0p0f));

    ((moom.si)(receiver)).g(((int)(__sourceIntrinsic_3609bc2b18763f43_originalDynamicSite922_10(15473, (3063973260172528303L ^ local14_life1)))));

    ((moom.si)(receiver)).a__Void(((float)(0x1.47ae14p-7f)), ((float)(0x1.47ae14p-7f)));

    ((moom.si)(receiver)).aJ = ((int)(((int) (0x1.0p3d / ((java.lang.Math.random() * 0x1.999999999999ap-1d) + 0x1.999999999999ap-3d)))));

    ((moom.si)(receiver)).aL = ((float)(0x0.0p0f));

    ((moom.si)(receiver)).t = ((double)(p4));

    ((moom.si)(receiver)).u = ((double)(p5));

    ((moom.si)(receiver)).v = ((double)(p6));

    return;

}



static {
bb = ((long)(((moom._a)(moom._c.a(((long)(1567558635759195195L)), ((long)(-6821274172288425387L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(77597187857741L)))));
    jb = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.si.bb ^ 134812409231888L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1014_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1014_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1014_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1014_14 = new byte[8];
    (__sourceSpill1014_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1014_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1014_16 = __sourceSpill1014_14;
    ((javax.crypto.Cipher)(__sourceSpill1014_11)).init(((int)(__sourceSpill1014_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1014_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1014_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[3];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "\025Yrÿ¯ÀÃÄs8&\t\025\f&½¾\037áîé"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1014_25 = local6_life21;
        int __sourceSpill1014_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1014_25)).substring(((int)(__sourceSpill1014_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1014_30 = local8_life19;
        int __sourceSpill1014_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1014_33 = new byte[8];
        (__sourceSpill1014_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1014_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1014_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1014_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1014_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1014_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1014_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1014_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1014_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1014_34)).doFinal(((byte[])(__sourceSpill1014_33)));
        (__sourceSpill1014_30)[__sourceSpill1014_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    hb = ((long[])(local8_life19));
    ib = ((java.lang.Integer[])(new java.lang.Integer[3]));
}

private static native <E extends Throwable> void __sourceConstructorInit_3609bc2b18763f43_0(moom.si a0, net.minecraft.world.World a1, double a2, double a3, double a4, double a5, double a6, double a7) throws E;

private static int c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.si.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int c(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 2004;
      if (ib[var3] == null) {
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
         long var5 = hb[var3];
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
         Object[] var9 = (Object[])jb.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               jb.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/si", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         ib[var3] = var15;
      }

      return ib[var3];
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral9067_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/si"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void g__Void() {
long life1_3;
    int life3_58;
    float life4_63;
    life1_3 = (moom.si.bb ^ 118361753616831L);
    this.k = ((double)(this.n));
    this.l = ((double)(this.o));
    this.m = ((double)(this.p));
    moom.si __stackOp3998_7_0 = this;
    ((moom.si)(__stackOp3998_7_0)).u = ((double)((((moom.si)(__stackOp3998_7_0)).u - ((double) this.aL))));
    ((moom.si)(this)).b__Void(((double)(this.t)), ((double)(this.u)), ((double)(this.v)));
    moom.si __stackOp3998_15_0 = this;
    ((moom.si)(__stackOp3998_15_0)).t = ((double)((((moom.si)(__stackOp3998_15_0)).t * 0x1.f5c29p-1d)));
    moom.si __stackOp3998_18_0 = this;
    ((moom.si)(__stackOp3998_18_0)).u = ((double)((((moom.si)(__stackOp3998_18_0)).u * 0x1.f5c29p-1d)));
    moom.si __stackOp3998_21_0 = this;
    ((moom.si)(__stackOp3998_21_0)).v = ((double)((((moom.si)(__stackOp3998_21_0)).v * 0x1.f5c29p-1d)));
    life3_58 = (__sourceIntrinsic_736a66cda11e_invokedynamic3998_24(30512, (7576178097604944141L ^ life1_3)) - this.aJ);
    life4_63 = (((float) life3_58) * 0x1.0624dep-10f);
    ((moom.si)(this)).a__Void(((float)(life4_63)), ((float)(life4_63)));
    ((moom.si)(this)).g(((int)((__sourceIntrinsic_736a66cda11e_invokedynamic3998_27(11867, (2733801428041119847L ^ life1_3)) + (life3_58 % 4)))));
    moom.si __stackOp3998_29_0 = this;
    moom.si __stackOp3998_31_0 = __stackOp3998_29_0;
    int __stackOp3998_31_1 = ((moom.si)(__stackOp3998_29_0)).aJ;
    int spill3998_0 = __stackOp3998_31_1;
    ((moom.si)(__stackOp3998_31_0)).aJ = ((int)((__stackOp3998_31_1 - 1)));
    if ((spill3998_0 <= 0)) {
        ((moom.si)(this)).f__Void();
    }
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_3609bc2b18763f43_originalDynamicSite922_10(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral9067_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_736a66cda11e_invokedynamic3998_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_736a66cda11e_invokedynamic3998_27(int a0, long a1) throws E;
}
