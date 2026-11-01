package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class sd extends net.minecraft.client.particle.EntityFX {

private float aV;

private double aW;

private double aX;

private double aY;

private static long bb;

private static long[] hb;

private static java.lang.Integer[] ib;

private static java.util.Map jb;

protected sd(net.minecraft.world.World p0, double p1, double p2, double p3, double p4, double p5, double p6) { super((net.minecraft.world.World)null, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D); }


private static void __sourceConstructorBody_5f8805e3394530ff(moom.sd receiver, net.minecraft.world.World p0, double p1, double p2, double p3, double p4, double p5, double p6) throws Throwable {

moom.sd spill498_0;

    double spill498_1;

    moom.sd spill498_2;

    double spill498_3;

    moom.sd spill498_4;

    double spill498_5;

    moom.sd spill498_6;

    float spill498_7;

    moom.sd spill498_8;

    moom.sd spill498_9;

    float spill498_10;

    float spill498_11;

    long life14_3;

    float life16_62;

    life14_3 = (moom.sd.bb ^ 42950026133015L);

    moom.sd.__sourceConstructorInit_5f8805e3394530ff_0(((moom.sd)(receiver)), ((net.minecraft.world.World)(p0)), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((double)(p4)), ((double)(p5)), ((double)(p6)));

    ((moom.sd)(receiver)).t = ((double)(p4));

    ((moom.sd)(receiver)).u = ((double)(p5));

    ((moom.sd)(receiver)).v = ((double)(p6));

    ((moom.sd)(receiver)).aW = ((double)(p1));

    ((moom.sd)(receiver)).aX = ((double)(p2));

    ((moom.sd)(receiver)).aY = ((double)(p3));

    spill498_0 = receiver;

    moom.sd __stackOp498_8_0 = receiver;

    double __stackOp498_8_1 = (p1 + p4);

    spill498_1 = __stackOp498_8_1;

    ((moom.sd)(__stackOp498_8_0)).k = ((double)(__stackOp498_8_1));

    ((moom.sd)(spill498_0)).n = ((double)(spill498_1));

    spill498_2 = receiver;

    moom.sd __stackOp498_11_0 = receiver;

    double __stackOp498_11_1 = (p2 + p5);

    spill498_3 = __stackOp498_11_1;

    ((moom.sd)(__stackOp498_11_0)).l = ((double)(__stackOp498_11_1));

    ((moom.sd)(spill498_2)).o = ((double)(spill498_3));

    spill498_4 = receiver;

    moom.sd __stackOp498_14_0 = receiver;

    double __stackOp498_14_1 = (p3 + p6);

    spill498_5 = __stackOp498_14_1;

    ((moom.sd)(__stackOp498_14_0)).m = ((double)(__stackOp498_14_1));

    ((moom.sd)(spill498_4)).p = ((double)(spill498_5));

    life16_62 = ((((java.util.Random)(((moom.sd)(receiver)).ah)).nextFloat() * 0x1.333334p-1f) + 0x1.99999ap-2f);

    spill498_6 = receiver;

    moom.sd __stackOp498_21_0 = receiver;

    float __stackOp498_21_1 = ((((java.util.Random)(((moom.sd)(receiver)).ah)).nextFloat() * 0x1.0p-1f) + 0x1.99999ap-3f);

    spill498_7 = __stackOp498_21_1;

    ((moom.sd)(__stackOp498_21_0)).aK = ((float)(__stackOp498_21_1));

    ((moom.sd)(spill498_6)).aV = ((float)(spill498_7));

    spill498_8 = receiver;

    spill498_9 = receiver;

    moom.sd __stackOp498_24_0 = receiver;

    float __stackOp498_24_1 = life16_62;

    spill498_10 = __stackOp498_24_1;

    ((moom.sd)(__stackOp498_24_0)).aO = ((float)(__stackOp498_24_1));

    moom.sd __stackOp498_26_0 = spill498_9;

    float __stackOp498_26_1 = spill498_10;

    spill498_11 = __stackOp498_26_1;

    ((moom.sd)(__stackOp498_26_0)).aN = ((float)(__stackOp498_26_1));

    ((moom.sd)(spill498_8)).aM = ((float)(spill498_11));

    moom.sd __stackOp498_29_0 = receiver;

    ((moom.sd)(__stackOp498_29_0)).aN = ((float)((((moom.sd)(__stackOp498_29_0)).aN * 0x1.ccccccp-1f)));

    moom.sd __stackOp498_32_0 = receiver;

    ((moom.sd)(__stackOp498_32_0)).aM = ((float)((((moom.sd)(__stackOp498_32_0)).aM * 0x1.ccccccp-1f)));

    ((moom.sd)(receiver)).aJ = ((int)((((int) (java.lang.Math.random() * 0x1.4p3d)) + __sourceIntrinsic_5f8805e3394530ff_invokedynamic498_36(2887, (3327373239083183385L ^ life14_3)))));

    ((moom.sd)(receiver)).Q = ((boolean)(true));

    ((moom.sd)(receiver)).g(((int)(((int) (((java.lang.Math.random() * 0x1.ap4d) + 0x1.0p0d) + 0x1.cp7d)))));

    return;

}



static {
bb = ((long)(((moom._a)(moom._c.a(((long)(-8966287174419697551L)), ((long)(-4394541659380769840L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(246122461435435L)))));
    jb = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.sd.bb ^ 100023658218960L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1530_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1530_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1530_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1530_14 = new byte[8];
    (__sourceSpill1530_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1530_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1530_16 = __sourceSpill1530_14;
    ((javax.crypto.Cipher)(__sourceSpill1530_11)).init(((int)(__sourceSpill1530_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1530_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1530_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[7];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "ËåX\031ì%:_k\002ÛE­¤m\024\007\023<\n\031ÒÑãÈR2\006ªäo î\003ßF¦²\t"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1530_25 = local6_life21;
        int __sourceSpill1530_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1530_25)).substring(((int)(__sourceSpill1530_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1530_30 = local8_life19;
        int __sourceSpill1530_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1530_33 = new byte[8];
        (__sourceSpill1530_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1530_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1530_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1530_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1530_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1530_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1530_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1530_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1530_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1530_34)).doFinal(((byte[])(__sourceSpill1530_33)));
        (__sourceSpill1530_30)[__sourceSpill1530_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "þCÉ\020ÛüÄ\f¦ÿrîó_"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1530_38 = local6_life21;
        int __sourceSpill1530_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1530_38)).substring(((int)(__sourceSpill1530_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1530_43 = local8_life19;
        int __sourceSpill1530_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1530_46 = new byte[8];
        (__sourceSpill1530_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1530_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1530_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1530_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1530_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1530_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1530_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1530_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1530_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1530_47)).doFinal(((byte[])(__sourceSpill1530_46)));
        (__sourceSpill1530_43)[__sourceSpill1530_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    hb = ((long[])(local8_life19));
    ib = ((java.lang.Integer[])(new java.lang.Integer[7]));
}

private static native <E extends Throwable> void __sourceConstructorInit_5f8805e3394530ff_0(moom.sd a0, net.minecraft.world.World a1, double a2, double a3, double a4, double a5, double a6, double a7) throws E;

private static int c(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 14244;
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
            throw new RuntimeException("moom/sd", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         ib[var3] = var15;
      }

      return ib[var3];
}


private static int c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.sd.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral9058_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/sd"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public float a__sourceReturn_f6c4892e39(float p0) {
float local2 = super.a(((float)(p0)));
    float local3 = (((float) this.aI) / ((float) this.aJ));
    local3 = (local3 * local3);
    local3 = (local3 * local3);
    return ((local2 * (0x1.0p0f - local3)) + local3);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public int a__Int(float p0) {
long local2 = (moom.sd.bb ^ 16758901446072L);
    int local4 = super.a__Int(((float)(p0)));
    float local5 = (((float) this.aI) / ((float) this.aJ));
    local5 = (local5 * local5);
    local5 = (local5 * local5);
    int local6 = (local4 & __sourceIntrinsic_dbecb07edf7c_invokedynamic9059_4(4291, (8486000866446138675L ^ local2)));
    int local7 = ((local4 >> __sourceIntrinsic_dbecb07edf7c_invokedynamic9059_5(12229, (9011354233183658546L ^ local2))) & __sourceIntrinsic_dbecb07edf7c_invokedynamic9059_6(3983, (6011344838535856761L ^ local2)));
    local7 = (local7 + ((int) ((local5 * 0x1.ep3f) * 0x1.0p4f)));
    if ((local7 > __sourceIntrinsic_dbecb07edf7c_invokedynamic9059_7(24634, (2670860350842842569L ^ local2)))) {
        local7 = __sourceIntrinsic_dbecb07edf7c_invokedynamic9059_8(5010, (948503359717826151L ^ local2));
    }
    return (local6 | (local7 << __sourceIntrinsic_dbecb07edf7c_invokedynamic9059_9(22408, (4772870191417432698L ^ local2))));
}


public void g__Void() {
float life1_19;
    float life1_23;
    float life2_27;
    float life2_31;
    float life2_35;
    this.k = ((double)(this.n));
    this.l = ((double)(this.o));
    this.m = ((double)(this.p));
    life1_19 = (((float) this.aI) / ((float) this.aJ));
    life1_23 = (0x1.0p0f - life1_19);
    life2_27 = (0x1.0p0f - life1_23);
    life2_31 = (life2_27 * life2_27);
    life2_35 = (life2_31 * life2_31);
    this.n = ((double)((this.aW + (this.t * ((double) life1_23)))));
    this.o = ((double)(((this.aX + (this.u * ((double) life1_23))) - ((double) (life2_35 * 0x1.333334p0f)))));
    this.p = ((double)((this.aY + (this.v * ((double) life1_23)))));
    moom.sd __stackOp3995_17_0 = this;
    moom.sd __stackOp3995_19_0 = __stackOp3995_17_0;
    int __stackOp3995_19_1 = ((moom.sd)(__stackOp3995_17_0)).aI;
    int spill3995_0 = __stackOp3995_19_1;
    ((moom.sd)(__stackOp3995_19_0)).aI = ((int)((__stackOp3995_19_1 + 1)));
    if ((spill3995_0 >= this.aJ)) {
        ((moom.sd)(this)).f__Void();
    }
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_5f8805e3394530ff_invokedynamic498_36(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_dbecb07edf7c_invokedynamic9059_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_dbecb07edf7c_invokedynamic9059_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_dbecb07edf7c_invokedynamic9059_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_dbecb07edf7c_invokedynamic9059_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_dbecb07edf7c_invokedynamic9059_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_dbecb07edf7c_invokedynamic9059_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral9058_0() throws E;
}
