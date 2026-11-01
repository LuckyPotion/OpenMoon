package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class r9 extends net.minecraft.client.particle.EntityFX {

float aV;

private static long bb;

private static long[] hb;

private static java.lang.Integer[] ib;

private static java.util.Map jb;

protected r9(net.minecraft.world.World p0, double p1, double p2, double p3, double p4, double p5, double p6) { super((net.minecraft.world.World)null, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D); }


private static void __sourceConstructorBody_3de3a7f66dda6a16(moom.r9 receiver, net.minecraft.world.World p0, double p1, double p2, double p3, double p4, double p5, double p6) throws Throwable {

moom.r9 spill493_0;

    moom.r9 spill493_1;

    float spill493_2;

    float spill493_3;

    float life14_10;

    moom.r9.__sourceConstructorInit_3de3a7f66dda6a16_0(((moom.r9)(receiver)), ((net.minecraft.world.World)(p0)), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)));

    life14_10 = 0x1.4p1f;

    moom.r9 __stackOp493_1_0 = receiver;

    ((moom.r9)(__stackOp493_1_0)).t = ((double)((((moom.r9)(__stackOp493_1_0)).t * 0x1.99999ap-4d)));

    moom.r9 __stackOp493_4_0 = receiver;

    ((moom.r9)(__stackOp493_4_0)).u = ((double)((((moom.r9)(__stackOp493_4_0)).u * 0x1.99999ap-4d)));

    moom.r9 __stackOp493_7_0 = receiver;

    ((moom.r9)(__stackOp493_7_0)).v = ((double)((((moom.r9)(__stackOp493_7_0)).v * 0x1.99999ap-4d)));

    moom.r9 __stackOp493_10_0 = receiver;

    ((moom.r9)(__stackOp493_10_0)).t = ((double)((((moom.r9)(__stackOp493_10_0)).t + p4)));

    moom.r9 __stackOp493_13_0 = receiver;

    ((moom.r9)(__stackOp493_13_0)).u = ((double)((((moom.r9)(__stackOp493_13_0)).u + p5)));

    moom.r9 __stackOp493_16_0 = receiver;

    ((moom.r9)(__stackOp493_16_0)).v = ((double)((((moom.r9)(__stackOp493_16_0)).v + p6)));

    spill493_0 = receiver;

    spill493_1 = receiver;

    moom.r9 __stackOp493_20_0 = receiver;

    float __stackOp493_20_1 = (0x1.0p0f - ((float) (java.lang.Math.random() * 0x1.333334p-2d)));

    spill493_2 = __stackOp493_20_1;

    ((moom.r9)(__stackOp493_20_0)).aO = ((float)(__stackOp493_20_1));

    moom.r9 __stackOp493_22_0 = spill493_1;

    float __stackOp493_22_1 = spill493_2;

    spill493_3 = __stackOp493_22_1;

    ((moom.r9)(__stackOp493_22_0)).aN = ((float)(__stackOp493_22_1));

    ((moom.r9)(spill493_0)).aM = ((float)(spill493_3));

    moom.r9 __stackOp493_25_0 = receiver;

    ((moom.r9)(__stackOp493_25_0)).aK = ((float)((((moom.r9)(__stackOp493_25_0)).aK * 0x1.8p-1f)));

    moom.r9 __stackOp493_28_0 = receiver;

    ((moom.r9)(__stackOp493_28_0)).aK = ((float)((((moom.r9)(__stackOp493_28_0)).aK * life14_10)));

    ((moom.r9)(receiver)).aV = ((float)(((moom.r9)(receiver)).aK));

    ((moom.r9)(receiver)).aJ = ((int)(((int) (0x1.0p3d / ((java.lang.Math.random() * 0x1.999999999999ap-1d) + 0x1.3333333333333p-2d)))));

    ((moom.r9)(receiver)).aJ = ((int)(((int) (((float) ((moom.r9)(receiver)).aJ) * life14_10))));

    ((moom.r9)(receiver)).Q = ((boolean)(false));

    return;

}



static {
bb = ((long)(((moom._a)(moom._c.a(((long)(5135313020388096461L)), ((long)(1473974209044845013L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(260165726396173L)))));
    jb = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.r9.bb ^ 88380729535770L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill981_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill981_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill981_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill981_14 = new byte[8];
    (__sourceSpill981_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill981_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation981_16 = __sourceSpill981_14;
    ((javax.crypto.Cipher)(__sourceSpill981_11)).init(((int)(__sourceSpill981_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill981_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation981_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = " \007ñl&î ÒK5j1"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill981_25 = local6_life21;
        int __sourceSpill981_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill981_25)).substring(((int)(__sourceSpill981_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill981_30 = local8_life19;
        int __sourceSpill981_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill981_33 = new byte[8];
        (__sourceSpill981_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill981_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill981_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill981_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill981_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill981_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill981_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill981_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill981_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill981_34)).doFinal(((byte[])(__sourceSpill981_33)));
        (__sourceSpill981_30)[__sourceSpill981_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    hb = ((long[])(local8_life19));
    ib = ((java.lang.Integer[])(new java.lang.Integer[2]));
}

private static native <E extends Throwable> void __sourceConstructorInit_3de3a7f66dda6a16_0(moom.r9 a0, net.minecraft.world.World a1, double a2, double a3, double a4, double a5, double a6, double a7) throws E;

public boolean b__Boolean() {
return ((1) != 0);
}


private static int c(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 25224;
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
            throw new RuntimeException("moom/r9", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         ib[var3] = var15;
      }

      return ib[var3];
}


private static int c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.r9.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral8906_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/r9"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
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
    net.minecraft.entity.player.EntityPlayer life3_81;
    life1_3 = (moom.r9.bb ^ 19413817434890L);
    this.k = ((double)(this.n));
    this.l = ((double)(this.o));
    this.m = ((double)(this.p));
    moom.r9 __stackOp3892_7_0 = this;
    moom.r9 __stackOp3892_9_0 = __stackOp3892_7_0;
    int __stackOp3892_9_1 = ((moom.r9)(__stackOp3892_7_0)).aI;
    int spill3892_0 = __stackOp3892_9_1;
    ((moom.r9)(__stackOp3892_9_0)).aI = ((int)((__stackOp3892_9_1 + 1)));
    if ((spill3892_0 >= this.aJ)) {
        ((moom.r9)(this)).f__Void();
    }
    ((moom.r9)(this)).g(((int)((__sourceIntrinsic_736a66cda11e_invokedynamic3892_13(14270, (2451712159887246559L ^ life1_3)) - ((this.aI * __sourceIntrinsic_736a66cda11e_invokedynamic3892_15(8821, (771558815179297045L ^ life1_3))) / this.aJ)))));
    ((moom.r9)(this)).b__Void(((double)(this.t)), ((double)(this.u)), ((double)(this.v)));
    moom.r9 __stackOp3892_22_0 = this;
    ((moom.r9)(__stackOp3892_22_0)).t = ((double)((((moom.r9)(__stackOp3892_22_0)).t * 0x1.eb851ep-1d)));
    moom.r9 __stackOp3892_25_0 = this;
    ((moom.r9)(__stackOp3892_25_0)).u = ((double)((((moom.r9)(__stackOp3892_25_0)).u * 0x1.eb851ep-1d)));
    moom.r9 __stackOp3892_28_0 = this;
    ((moom.r9)(__stackOp3892_28_0)).v = ((double)((((moom.r9)(__stackOp3892_28_0)).v * 0x1.eb851ep-1d)));
    life3_81 = ((net.minecraft.world.World)(this.i)).a(((net.minecraft.entity.Entity)(this)), ((double)(0x1.0p1d)));
    if ((life3_81 != null)) {
        if ((recovery.source.CarrierOps.dcmpl(((double)(this.o)), ((double)(((moom.CA)(((net.minecraft.entity.player.EntityPlayer)(life3_81)).b())).c))) > 0)) {
        moom.r9 __stackOp3892_37_0 = this;
        ((moom.r9)(__stackOp3892_37_0)).o = ((double)((((moom.r9)(__stackOp3892_37_0)).o + ((((moom.CA)(((net.minecraft.entity.player.EntityPlayer)(life3_81)).b())).c - this.o) * 0x1.999999999999ap-3d))));
        moom.r9 __stackOp3892_43_0 = this;
        ((moom.r9)(__stackOp3892_43_0)).u = ((double)((((moom.r9)(__stackOp3892_43_0)).u + ((((net.minecraft.entity.player.EntityPlayer)(life3_81)).u - this.u) * 0x1.999999999999ap-3d))));
        ((moom.r9)(this)).a__Void(((double)(this.n)), ((double)(this.o)), ((double)(this.p)));
    }
    }
    if (this.A) {
        moom.r9 __stackOp3892_53_0 = this;
        ((moom.r9)(__stackOp3892_53_0)).t = ((double)((((moom.r9)(__stackOp3892_53_0)).t * 0x1.666666p-1d)));
        moom.r9 __stackOp3892_56_0 = this;
        ((moom.r9)(__stackOp3892_56_0)).v = ((double)((((moom.r9)(__stackOp3892_56_0)).v * 0x1.666666p-1d)));
    }
    return;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral8906_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_736a66cda11e_invokedynamic3892_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_736a66cda11e_invokedynamic3892_15(int a0, long a1) throws E;
}
