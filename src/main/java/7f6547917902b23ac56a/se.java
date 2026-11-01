package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class se extends net.minecraft.client.particle.EntityFX {

private static long bb;

private static long[] hb;

private static java.lang.Integer[] ib;

private static java.util.Map jb;

protected se(net.minecraft.world.World p0, double p1, double p2, double p3, double p4, double p5, double p6) { super((net.minecraft.world.World)null, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D); }


private static void __sourceConstructorBody_0f56093f8615b2c7(moom.se receiver, net.minecraft.world.World p0, double p1, double p2, double p3, double p4, double p5, double p6) throws Throwable {

moom.se spill499_0;

    moom.se spill499_1;

    float spill499_2;

    float spill499_3;

    moom.se.__sourceConstructorInit_0f56093f8615b2c7_0(((moom.se)(receiver)), ((net.minecraft.world.World)(p0)), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((double)(p4)), ((double)(p5)), ((double)(p6)));

    ((moom.se)(receiver)).t = ((double)((p4 + (((java.lang.Math.random() * 0x1.0p1d) - 0x1.0p0d) * 0x1.99999ap-5d))));

    ((moom.se)(receiver)).u = ((double)((p5 + (((java.lang.Math.random() * 0x1.0p1d) - 0x1.0p0d) * 0x1.99999ap-5d))));

    ((moom.se)(receiver)).v = ((double)((p6 + (((java.lang.Math.random() * 0x1.0p1d) - 0x1.0p0d) * 0x1.99999ap-5d))));

    spill499_0 = receiver;

    spill499_1 = receiver;

    moom.se __stackOp499_9_0 = receiver;

    float __stackOp499_9_1 = ((((java.util.Random)(((moom.se)(receiver)).ah)).nextFloat() * 0x1.333334p-2f) + 0x1.666666p-1f);

    spill499_2 = __stackOp499_9_1;

    ((moom.se)(__stackOp499_9_0)).aO = ((float)(__stackOp499_9_1));

    moom.se __stackOp499_11_0 = spill499_1;

    float __stackOp499_11_1 = spill499_2;

    spill499_3 = __stackOp499_11_1;

    ((moom.se)(__stackOp499_11_0)).aN = ((float)(__stackOp499_11_1));

    ((moom.se)(spill499_0)).aM = ((float)(spill499_3));

    ((moom.se)(receiver)).aK = ((float)((((((java.util.Random)(((moom.se)(receiver)).ah)).nextFloat() * ((java.util.Random)(((moom.se)(receiver)).ah)).nextFloat()) * 0x1.8p2f) + 0x1.0p0f)));

    ((moom.se)(receiver)).aJ = ((int)((((int) (0x1.0p4d / ((((double) ((java.util.Random)(((moom.se)(receiver)).ah)).nextFloat()) * 0x1.999999999999ap-1d) + 0x1.999999999999ap-3d))) + 2)));

    return;

}



static {
bb = ((long)(((moom._a)(moom._c.a(((long)(8975161004780641506L)), ((long)(1364474509051409677L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(21881988920407L)))));
    jb = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.se.bb ^ 69075252169800L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1013_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1013_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1013_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1013_14 = new byte[8];
    (__sourceSpill1013_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1013_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1013_16 = __sourceSpill1013_14;
    ((javax.crypto.Cipher)(__sourceSpill1013_11)).init(((int)(__sourceSpill1013_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1013_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1013_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "®R6b4·\fÕ=R\025¹\025Í"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1013_25 = local6_life21;
        int __sourceSpill1013_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1013_25)).substring(((int)(__sourceSpill1013_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1013_30 = local8_life19;
        int __sourceSpill1013_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1013_33 = new byte[8];
        (__sourceSpill1013_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1013_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1013_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1013_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1013_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1013_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1013_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1013_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1013_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1013_34)).doFinal(((byte[])(__sourceSpill1013_33)));
        (__sourceSpill1013_30)[__sourceSpill1013_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    hb = ((long[])(local8_life19));
    ib = ((java.lang.Integer[])(new java.lang.Integer[2]));
}

private static native <E extends Throwable> void __sourceConstructorInit_0f56093f8615b2c7_0(moom.se a0, net.minecraft.world.World a1, double a2, double a3, double a4, double a5, double a6, double a7) throws E;

private static int c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.se.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int c(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 28795;
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
            throw new RuntimeException("moom/se", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         ib[var3] = var15;
      }

      return ib[var3];
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral9061_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/se"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void g__Void() {
long life1_3;
    life1_3 = (moom.se.bb ^ 36500758469023L);
    this.k = ((double)(this.n));
    this.l = ((double)(this.o));
    this.m = ((double)(this.p));
    moom.se __stackOp3996_7_0 = this;
    moom.se __stackOp3996_9_0 = __stackOp3996_7_0;
    int __stackOp3996_9_1 = ((moom.se)(__stackOp3996_7_0)).aI;
    int spill3996_0 = __stackOp3996_9_1;
    ((moom.se)(__stackOp3996_9_0)).aI = ((int)((__stackOp3996_9_1 + 1)));
    if ((spill3996_0 >= this.aJ)) {
        ((moom.se)(this)).f__Void();
    }
    ((moom.se)(this)).g(((int)((__sourceIntrinsic_736a66cda11e_invokedynamic3996_13(21106, (5889757359986914273L ^ life1_3)) - ((this.aI * __sourceIntrinsic_736a66cda11e_invokedynamic3996_15(23557, (2080409954715614615L ^ life1_3))) / this.aJ)))));
    moom.se __stackOp3996_18_0 = this;
    ((moom.se)(__stackOp3996_18_0)).u = ((double)((((moom.se)(__stackOp3996_18_0)).u + 0x1.0624dd2f1a9fcp-8d)));
    ((moom.se)(this)).b__Void(((double)(this.t)), ((double)(this.u)), ((double)(this.v)));
    moom.se __stackOp3996_25_0 = this;
    ((moom.se)(__stackOp3996_25_0)).t = ((double)((((moom.se)(__stackOp3996_25_0)).t * 0x1.ccccccp-1d)));
    moom.se __stackOp3996_28_0 = this;
    ((moom.se)(__stackOp3996_28_0)).u = ((double)((((moom.se)(__stackOp3996_28_0)).u * 0x1.ccccccp-1d)));
    moom.se __stackOp3996_31_0 = this;
    ((moom.se)(__stackOp3996_31_0)).v = ((double)((((moom.se)(__stackOp3996_31_0)).v * 0x1.ccccccp-1d)));
    if (this.A) {
        moom.se __stackOp3996_35_0 = this;
        ((moom.se)(__stackOp3996_35_0)).t = ((double)((((moom.se)(__stackOp3996_35_0)).t * 0x1.666666p-1d)));
        moom.se __stackOp3996_38_0 = this;
        ((moom.se)(__stackOp3996_38_0)).v = ((double)((((moom.se)(__stackOp3996_38_0)).v * 0x1.666666p-1d)));
    }
    return;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral9061_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_736a66cda11e_invokedynamic3996_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_736a66cda11e_invokedynamic3996_15(int a0, long a1) throws E;
}
