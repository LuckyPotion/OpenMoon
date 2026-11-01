package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class sj extends net.minecraft.client.particle.EntityFX {

private float aV;

private static long bb;

private static long[] hb;

private static java.lang.Integer[] ib;

private static java.util.Map jb;

protected sj(net.minecraft.world.World p0, double p1, double p2, double p3, double p4, double p5, double p6) { super((net.minecraft.world.World)null, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D); }


private static void __sourceConstructorBody_734369b679c42d0d(moom.sj receiver, net.minecraft.world.World p0, double p1, double p2, double p3, double p4, double p5, double p6) throws Throwable {

moom.sj spill500_0;

    moom.sj spill500_1;

    float spill500_2;

    float spill500_3;

    long life14_3;

    life14_3 = (moom.sj.bb ^ 14684465317983L);

    moom.sj.__sourceConstructorInit_734369b679c42d0d_0(((moom.sj)(receiver)), ((net.minecraft.world.World)(p0)), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((double)(p4)), ((double)(p5)), ((double)(p6)));

    ((moom.sj)(receiver)).t = ((double)(((((moom.sj)(receiver)).t * 0x1.47ae14p-7d) + p4)));

    ((moom.sj)(receiver)).u = ((double)(((((moom.sj)(receiver)).u * 0x1.47ae14p-7d) + p5)));

    ((moom.sj)(receiver)).v = ((double)(((((moom.sj)(receiver)).v * 0x1.47ae14p-7d) + p6)));

    moom.sj __stackOp500_8_0 = receiver;

    ((moom.sj)(__stackOp500_8_0)).n = ((double)((((moom.sj)(__stackOp500_8_0)).n + ((double) ((((java.util.Random)(((moom.sj)(receiver)).ah)).nextFloat() - ((java.util.Random)(((moom.sj)(receiver)).ah)).nextFloat()) * 0x1.99999ap-5f)))));

    moom.sj __stackOp500_15_0 = receiver;

    ((moom.sj)(__stackOp500_15_0)).o = ((double)((((moom.sj)(__stackOp500_15_0)).o + ((double) ((((java.util.Random)(((moom.sj)(receiver)).ah)).nextFloat() - ((java.util.Random)(((moom.sj)(receiver)).ah)).nextFloat()) * 0x1.99999ap-5f)))));

    moom.sj __stackOp500_22_0 = receiver;

    ((moom.sj)(__stackOp500_22_0)).p = ((double)((((moom.sj)(__stackOp500_22_0)).p + ((double) ((((java.util.Random)(((moom.sj)(receiver)).ah)).nextFloat() - ((java.util.Random)(((moom.sj)(receiver)).ah)).nextFloat()) * 0x1.99999ap-5f)))));

    ((moom.sj)(receiver)).aV = ((float)(((moom.sj)(receiver)).aK));

    spill500_0 = receiver;

    spill500_1 = receiver;

    moom.sj __stackOp500_31_0 = receiver;

    float __stackOp500_31_1 = 0x1.0p0f;

    spill500_2 = __stackOp500_31_1;

    ((moom.sj)(__stackOp500_31_0)).aO = ((float)(__stackOp500_31_1));

    moom.sj __stackOp500_33_0 = spill500_1;

    float __stackOp500_33_1 = spill500_2;

    spill500_3 = __stackOp500_33_1;

    ((moom.sj)(__stackOp500_33_0)).aN = ((float)(__stackOp500_33_1));

    ((moom.sj)(spill500_0)).aM = ((float)(spill500_3));

    ((moom.sj)(receiver)).aJ = ((int)((((int) (0x1.0p3d / ((java.lang.Math.random() * 0x1.999999999999ap-1d) + 0x1.999999999999ap-3d))) + 4)));

    ((moom.sj)(receiver)).Q = ((boolean)(true));

    ((moom.sj)(receiver)).g(((int)(__sourceIntrinsic_734369b679c42d0d_invokedynamic500_39(10892, (4796369460222436393L ^ life14_3)))));

    return;

}



static {
bb = ((long)(((moom._a)(moom._c.a(((long)(3885407622580244680L)), ((long)(-7181646551437367599L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(280834987604523L)))));
    jb = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.sj.bb ^ 92674480200219L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1535_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1535_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1535_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1535_14 = new byte[8];
    (__sourceSpill1535_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1535_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1535_16 = __sourceSpill1535_14;
    ((javax.crypto.Cipher)(__sourceSpill1535_11)).init(((int)(__sourceSpill1535_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1535_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1535_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[7];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "7Ýìó]®ìP¢Ê\030Ï¹Û°FcÈüÉHêdOäj\021yw8Õ[6®Ü"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1535_25 = local6_life21;
        int __sourceSpill1535_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1535_25)).substring(((int)(__sourceSpill1535_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1535_30 = local8_life19;
        int __sourceSpill1535_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1535_33 = new byte[8];
        (__sourceSpill1535_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1535_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1535_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1535_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1535_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1535_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1535_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1535_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1535_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1535_34)).doFinal(((byte[])(__sourceSpill1535_33)));
        (__sourceSpill1535_30)[__sourceSpill1535_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "\016_ÀxÁÌ®[b\036Â¬1Éï"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1535_38 = local6_life21;
        int __sourceSpill1535_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1535_38)).substring(((int)(__sourceSpill1535_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1535_43 = local8_life19;
        int __sourceSpill1535_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1535_46 = new byte[8];
        (__sourceSpill1535_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1535_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1535_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1535_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1535_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1535_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1535_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1535_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1535_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1535_47)).doFinal(((byte[])(__sourceSpill1535_46)));
        (__sourceSpill1535_43)[__sourceSpill1535_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    hb = ((long[])(local8_life19));
    ib = ((java.lang.Integer[])(new java.lang.Integer[7]));
}

private static native <E extends Throwable> void __sourceConstructorInit_734369b679c42d0d_0(moom.sj a0, net.minecraft.world.World a1, double a2, double a3, double a4, double a5, double a6, double a7) throws E;

public boolean b__Boolean() {
return ((1) != 0);
}


private static int c(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 15494;
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
            throw new RuntimeException("moom/sj", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         ib[var3] = var15;
      }

      return ib[var3];
}


private static int c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.sj.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral9069_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/sj"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public float a__sourceReturn_f6c4892e39(float p0) {
float local2 = ((((float) this.aI) + p0) / ((float) this.aJ));
    local2 = moom.Dr.a(((float)(local2)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)));
    float local3 = super.a(((float)(p0)));
    return ((local3 * local2) + (0x1.0p0f - local2));
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(moom.lw p0, net.minecraft.entity.Entity p1, float p2, float p3, float p4, float p5, float p6, float p7) {
float local9 = ((((float) this.aI) + p2) / ((float) this.aJ));
    this.aK = ((float)((this.aV * (0x1.0p0f - ((local9 * local9) * 0x1.0p-1f)))));
    super.a(((moom.lw)(p0)), ((net.minecraft.entity.Entity)(p1)), ((float)(p2)), ((float)(p3)), ((float)(p4)), ((float)(p5)), ((float)(p6)), ((float)(p7)));
    return;
}


public int a__Int(float p0) {
long local2 = (moom.sj.bb ^ 68392863170606L);
    float local4 = ((((float) this.aI) + p0) / ((float) this.aJ));
    local4 = moom.Dr.a(((float)(local4)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)));
    int local5 = super.a__Int(((float)(p0)));
    int local6 = (local5 & __sourceIntrinsic_dbecb07edf7c_invokedynamic9070_5(5540, (2233188386134250353L ^ local2)));
    int local7 = ((local5 >> __sourceIntrinsic_dbecb07edf7c_invokedynamic9070_6(1938, (4381761402698154309L ^ local2))) & __sourceIntrinsic_dbecb07edf7c_invokedynamic9070_7(30969, (6044571812663344683L ^ local2)));
    local6 = (local6 + ((int) ((local4 * 0x1.ep3f) * 0x1.0p4f)));
    if ((local6 > __sourceIntrinsic_dbecb07edf7c_invokedynamic9070_8(222, (4330037750440248847L ^ local2)))) {
        local6 = __sourceIntrinsic_dbecb07edf7c_invokedynamic9070_9(21396, (9084687437068014916L ^ local2));
    }
    return (local6 | (local7 << __sourceIntrinsic_dbecb07edf7c_invokedynamic9070_10(856, (2209251088771270027L ^ local2))));
}


public void g__Void() {
this.k = ((double)(this.n));
    this.l = ((double)(this.o));
    this.m = ((double)(this.p));
    moom.sj __stackOp3999_6_0 = this;
    moom.sj __stackOp3999_8_0 = __stackOp3999_6_0;
    int __stackOp3999_8_1 = ((moom.sj)(__stackOp3999_6_0)).aI;
    int spill3999_0 = __stackOp3999_8_1;
    ((moom.sj)(__stackOp3999_8_0)).aI = ((int)((__stackOp3999_8_1 + 1)));
    if ((spill3999_0 >= this.aJ)) {
        ((moom.sj)(this)).f__Void();
    }
    ((moom.sj)(this)).b__Void(((double)(this.t)), ((double)(this.u)), ((double)(this.v)));
    moom.sj __stackOp3999_16_0 = this;
    ((moom.sj)(__stackOp3999_16_0)).t = ((double)((((moom.sj)(__stackOp3999_16_0)).t * 0x1.eb851ep-1d)));
    moom.sj __stackOp3999_19_0 = this;
    ((moom.sj)(__stackOp3999_19_0)).u = ((double)((((moom.sj)(__stackOp3999_19_0)).u * 0x1.eb851ep-1d)));
    moom.sj __stackOp3999_22_0 = this;
    ((moom.sj)(__stackOp3999_22_0)).v = ((double)((((moom.sj)(__stackOp3999_22_0)).v * 0x1.eb851ep-1d)));
    if (this.A) {
        moom.sj __stackOp3999_26_0 = this;
        ((moom.sj)(__stackOp3999_26_0)).t = ((double)((((moom.sj)(__stackOp3999_26_0)).t * 0x1.666666p-1d)));
        moom.sj __stackOp3999_29_0 = this;
        ((moom.sj)(__stackOp3999_29_0)).v = ((double)((((moom.sj)(__stackOp3999_29_0)).v * 0x1.666666p-1d)));
    }
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_734369b679c42d0d_invokedynamic500_39(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_dbecb07edf7c_invokedynamic9070_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_dbecb07edf7c_invokedynamic9070_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_dbecb07edf7c_invokedynamic9070_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_dbecb07edf7c_invokedynamic9070_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_dbecb07edf7c_invokedynamic9070_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_dbecb07edf7c_invokedynamic9070_10(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral9069_0() throws E;
}
