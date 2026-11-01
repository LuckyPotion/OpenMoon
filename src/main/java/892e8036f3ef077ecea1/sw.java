package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class sw extends net.minecraft.client.particle.EntityFX {

float aV;

private static long bb;

private static long[] hb;

private static java.lang.Integer[] ib;

private static java.util.Map jb;

private sw(net.minecraft.world.World p0, double p1, double p2, double p3, double p4, double p5, double p6) {
this(((net.minecraft.world.World)(p0)), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((double)(p4)), ((double)(p5)), ((double)(p6)), ((float)(0x1.0p0f)));
    return;
}


protected sw(net.minecraft.world.World p0, double p1, double p2, double p3, double p4, double p5, double p6, float p7) { super((net.minecraft.world.World)null, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D); }


private static void __sourceConstructorBody_1abbcade7604109e(moom.sw receiver, net.minecraft.world.World p0, double p1, double p2, double p3, double p4, double p5, double p6, float p7) throws Throwable {

moom.sw spill505_0;

    moom.sw spill505_1;

    float spill505_2;

    float spill505_3;

    moom.sw.__sourceConstructorInit_1abbcade7604109e_0(((moom.sw)(receiver)), ((net.minecraft.world.World)(p0)), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)));

    moom.sw __stackOp505_1_0 = receiver;

    ((moom.sw)(__stackOp505_1_0)).t = ((double)((((moom.sw)(__stackOp505_1_0)).t * 0x1.99999ap-4d)));

    moom.sw __stackOp505_4_0 = receiver;

    ((moom.sw)(__stackOp505_4_0)).u = ((double)((((moom.sw)(__stackOp505_4_0)).u * 0x1.99999ap-4d)));

    moom.sw __stackOp505_7_0 = receiver;

    ((moom.sw)(__stackOp505_7_0)).v = ((double)((((moom.sw)(__stackOp505_7_0)).v * 0x1.99999ap-4d)));

    moom.sw __stackOp505_10_0 = receiver;

    ((moom.sw)(__stackOp505_10_0)).t = ((double)((((moom.sw)(__stackOp505_10_0)).t + p4)));

    moom.sw __stackOp505_13_0 = receiver;

    ((moom.sw)(__stackOp505_13_0)).u = ((double)((((moom.sw)(__stackOp505_13_0)).u + p5)));

    moom.sw __stackOp505_16_0 = receiver;

    ((moom.sw)(__stackOp505_16_0)).v = ((double)((((moom.sw)(__stackOp505_16_0)).v + p6)));

    spill505_0 = receiver;

    spill505_1 = receiver;

    moom.sw __stackOp505_20_0 = receiver;

    float __stackOp505_20_1 = ((float) (java.lang.Math.random() * 0x1.333334p-2d));

    spill505_2 = __stackOp505_20_1;

    ((moom.sw)(__stackOp505_20_0)).aO = ((float)(__stackOp505_20_1));

    moom.sw __stackOp505_22_0 = spill505_1;

    float __stackOp505_22_1 = spill505_2;

    spill505_3 = __stackOp505_22_1;

    ((moom.sw)(__stackOp505_22_0)).aN = ((float)(__stackOp505_22_1));

    ((moom.sw)(spill505_0)).aM = ((float)(spill505_3));

    moom.sw __stackOp505_25_0 = receiver;

    ((moom.sw)(__stackOp505_25_0)).aK = ((float)((((moom.sw)(__stackOp505_25_0)).aK * 0x1.8p-1f)));

    moom.sw __stackOp505_28_0 = receiver;

    ((moom.sw)(__stackOp505_28_0)).aK = ((float)((((moom.sw)(__stackOp505_28_0)).aK * p7)));

    ((moom.sw)(receiver)).aV = ((float)(((moom.sw)(receiver)).aK));

    ((moom.sw)(receiver)).aJ = ((int)(((int) (0x1.0p3d / ((java.lang.Math.random() * 0x1.999999999999ap-1d) + 0x1.999999999999ap-3d)))));

    ((moom.sw)(receiver)).aJ = ((int)(((int) (((float) ((moom.sw)(receiver)).aJ) * p7))));

    ((moom.sw)(receiver)).Q = ((boolean)(false));

    return;

}



static {
bb = ((long)(((moom._a)(moom._c.a(((long)(-129836487690347486L)), ((long)(-6864361684099299436L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(163364123801287L)))));
    jb = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.sw.bb ^ 74591613150121L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1022_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1022_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1022_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1022_14 = new byte[8];
    (__sourceSpill1022_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1022_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1022_16 = __sourceSpill1022_14;
    ((javax.crypto.Cipher)(__sourceSpill1022_11)).init(((int)(__sourceSpill1022_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1022_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1022_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "$IÎÖzêt\fûç}ª>\017"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1022_25 = local6_life21;
        int __sourceSpill1022_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1022_25)).substring(((int)(__sourceSpill1022_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1022_30 = local8_life19;
        int __sourceSpill1022_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1022_33 = new byte[8];
        (__sourceSpill1022_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1022_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1022_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1022_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1022_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1022_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1022_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1022_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1022_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1022_34)).doFinal(((byte[])(__sourceSpill1022_33)));
        (__sourceSpill1022_30)[__sourceSpill1022_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    hb = ((long[])(local8_life19));
    ib = ((java.lang.Integer[])(new java.lang.Integer[2]));
}

private static native <E extends Throwable> void __sourceConstructorInit_1abbcade7604109e_0(moom.sw a0, net.minecraft.world.World a1, double a2, double a3, double a4, double a5, double a6, double a7) throws E;

public boolean b__Boolean() {
return ((1) != 0);
}


private static int c(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 20706;
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
            throw new RuntimeException("moom/sw", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         ib[var3] = var15;
      }

      return ib[var3];
}


private static int c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.sw.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral9097_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/sw"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(moom.lw p0, net.minecraft.entity.Entity p1, float p2, float p3, float p4, float p5, float p6, float p7) {
float local9 = (((((float) this.aI) + p2) / ((float) this.aJ)) * 0x1.0p5f);
    local9 = moom.Dr.a(((float)(local9)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)));
    this.aK = ((float)((this.aV * local9)));
    super.a(((moom.lw)(p0)), ((net.minecraft.entity.Entity)(p1)), ((float)(p2)), ((float)(p3)), ((float)(p4)), ((float)(p5)), ((float)(p6)), ((float)(p7)));
    return;
}


public void g__Void() {
long life1_3;
    life1_3 = (moom.sw.bb ^ 349968596345L);
    this.k = ((double)(this.n));
    this.l = ((double)(this.o));
    this.m = ((double)(this.p));
    moom.sw __stackOp4011_7_0 = this;
    moom.sw __stackOp4011_9_0 = __stackOp4011_7_0;
    int __stackOp4011_9_1 = ((moom.sw)(__stackOp4011_7_0)).aI;
    int spill4011_0 = __stackOp4011_9_1;
    ((moom.sw)(__stackOp4011_9_0)).aI = ((int)((__stackOp4011_9_1 + 1)));
    if ((spill4011_0 >= this.aJ)) {
        ((moom.sw)(this)).f__Void();
    }
    ((moom.sw)(this)).g(((int)((__sourceIntrinsic_736a66cda11e_invokedynamic4011_13(19415, (7420908645156326109L ^ life1_3)) - ((this.aI * __sourceIntrinsic_736a66cda11e_invokedynamic4011_15(3114, (4638455997723069729L ^ life1_3))) / this.aJ)))));
    moom.sw __stackOp4011_18_0 = this;
    ((moom.sw)(__stackOp4011_18_0)).u = ((double)((((moom.sw)(__stackOp4011_18_0)).u + 0x1.0624dd2f1a9fcp-8d)));
    ((moom.sw)(this)).b__Void(((double)(this.t)), ((double)(this.u)), ((double)(this.v)));
    if ((recovery.source.CarrierOps.dcmpl(((double)(this.o)), ((double)(this.l))) == 0)) {
        moom.sw __stackOp4011_28_0 = this;
        ((moom.sw)(__stackOp4011_28_0)).t = ((double)((((moom.sw)(__stackOp4011_28_0)).t * 0x1.199999999999ap0d)));
        moom.sw __stackOp4011_31_0 = this;
        ((moom.sw)(__stackOp4011_31_0)).v = ((double)((((moom.sw)(__stackOp4011_31_0)).v * 0x1.199999999999ap0d)));
    }
    moom.sw __stackOp4011_34_0 = this;
    ((moom.sw)(__stackOp4011_34_0)).t = ((double)((((moom.sw)(__stackOp4011_34_0)).t * 0x1.eb851ep-1d)));
    moom.sw __stackOp4011_37_0 = this;
    ((moom.sw)(__stackOp4011_37_0)).u = ((double)((((moom.sw)(__stackOp4011_37_0)).u * 0x1.eb851ep-1d)));
    moom.sw __stackOp4011_40_0 = this;
    ((moom.sw)(__stackOp4011_40_0)).v = ((double)((((moom.sw)(__stackOp4011_40_0)).v * 0x1.eb851ep-1d)));
    if (this.A) {
        moom.sw __stackOp4011_44_0 = this;
        ((moom.sw)(__stackOp4011_44_0)).t = ((double)((((moom.sw)(__stackOp4011_44_0)).t * 0x1.666666p-1d)));
        moom.sw __stackOp4011_47_0 = this;
        ((moom.sw)(__stackOp4011_47_0)).v = ((double)((((moom.sw)(__stackOp4011_47_0)).v * 0x1.666666p-1d)));
    }
    return;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral9097_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_736a66cda11e_invokedynamic4011_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_736a66cda11e_invokedynamic4011_15(int a0, long a1) throws E;
}
