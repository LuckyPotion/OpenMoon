package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class sf extends net.minecraft.client.particle.EntityFX {

private static long bb;

private static long[] hb;

private static java.lang.Integer[] ib;

private static java.util.Map jb;

protected sf(net.minecraft.world.World p0, double p1, double p2, double p3) { super((net.minecraft.world.World)null, 0.0D, 0.0D, 0.0D); }


private static void __sourceConstructorBody_f385da9e150a41a2(moom.sf receiver, net.minecraft.world.World p0, double p1, double p2, double p3) throws Throwable {

long local8 = (moom.sf.bb ^ 136218059398465L);

    moom.sf.__sourceConstructorInit_f385da9e150a41a2_0(((moom.sf)(receiver)), ((net.minecraft.world.World)(p0)), ((double)(p1)), ((double)(p2)), ((double)(p3)));

    ((moom.sf)(receiver)).aJ = ((int)(__sourceIntrinsic_f385da9e150a41a2_originalDynamicSite3297_2(3758, (8330468669598161821L ^ local8))));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_f385da9e150a41a2_0(moom.sf a0, net.minecraft.world.World a1, double a2, double a3, double a4) throws E;

static {
bb = ((long)(((moom._a)(moom._c.a(((long)(5985459442961070828L)), ((long)(1230083085734186005L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(160752104638944L)))));
    jb = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.sf.bb ^ 82077721772023L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1532_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1532_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1532_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1532_14 = new byte[8];
    (__sourceSpill1532_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1532_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1532_16 = __sourceSpill1532_14;
    ((javax.crypto.Cipher)(__sourceSpill1532_11)).init(((int)(__sourceSpill1532_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1532_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1532_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[4];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "Ëe4üÂÏé\0302gC\f\032R \f"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1532_25 = local6_life21;
        int __sourceSpill1532_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1532_25)).substring(((int)(__sourceSpill1532_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1532_30 = local8_life19;
        int __sourceSpill1532_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1532_33 = new byte[8];
        (__sourceSpill1532_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1532_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1532_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1532_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1532_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1532_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1532_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1532_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1532_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1532_34)).doFinal(((byte[])(__sourceSpill1532_33)));
        (__sourceSpill1532_30)[__sourceSpill1532_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "ÐÖ ©er¬ð\020 rölo"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1532_38 = local6_life21;
        int __sourceSpill1532_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1532_38)).substring(((int)(__sourceSpill1532_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1532_43 = local8_life19;
        int __sourceSpill1532_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1532_46 = new byte[8];
        (__sourceSpill1532_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1532_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1532_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1532_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1532_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1532_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1532_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1532_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1532_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1532_47)).doFinal(((byte[])(__sourceSpill1532_46)));
        (__sourceSpill1532_43)[__sourceSpill1532_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    hb = ((long[])(local8_life19));
    ib = ((java.lang.Integer[])(new java.lang.Integer[4]));
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral9063_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/sf"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.sf.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int c(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 3800;
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
            throw new RuntimeException("moom/sf", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         ib[var3] = var15;
      }

      return ib[var3];
}


public void a(moom.lw p0, net.minecraft.entity.Entity p1, float p2, float p3, float p4, float p5, float p6, float p7) {
long local9 = (moom.sf.bb ^ 28840424237357L);
    float local11 = 0x1.0p-2f;
    float local12 = 0x1.0p-1f;
    float local13 = 0x1.0p-3f;
    float local14 = 0x1.8p-2f;
    float local15 = (0x1.c66666p2f * moom.Dr.a(((float)(((((((float) this.aI) + p2) - 0x1.0p0f) * 0x1.0p-2f) * 0x1.921fb6p1f)))));
    this.aP = ((float)((0x1.333334p-1f - ((((((float) this.aI) + p2) - 0x1.0p0f) * 0x1.0p-2f) * 0x1.0p-1f))));
    float local16 = ((float) ((this.k + ((this.n - this.k) * ((double) p2))) - moom.sf.aR));
    float local17 = ((float) ((this.l + ((this.o - this.l) * ((double) p2))) - moom.sf.aS));
    float local18 = ((float) ((this.m + ((this.p - this.m) * ((double) p2))) - moom.sf.aT));
    int local19 = ((moom.sf)(this)).a__Int(((float)(p2)));
    int local20 = ((local19 >> __sourceIntrinsic_54c23c7634ff_originalDynamicSite1639_18(24277, (8073736828095152008L ^ local9))) & __sourceIntrinsic_54c23c7634ff_originalDynamicSite1639_19(17617, (3116244375970686349L ^ local9)));
    int local21 = (local19 & __sourceIntrinsic_54c23c7634ff_originalDynamicSite1639_20(15222, (4244570625512823336L ^ local9)));
    ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(p0)).a(((double)(((double) ((local16 - (p3 * local15)) - (p6 * local15))))), ((double)(((double) (local17 - (p4 * local15))))), ((double)(((double) ((local18 - (p5 * local15)) - (p7 * local15)))))))).a(((double)(0x1.0p-1d)), ((double)(0x1.8p-2d))))).a(((float)(this.aM)), ((float)(this.aN)), ((float)(this.aO)), ((float)(this.aP))))).a(((int)(local20)), ((int)(local21))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(p0)).a(((double)(((double) ((local16 - (p3 * local15)) + (p6 * local15))))), ((double)(((double) (local17 + (p4 * local15))))), ((double)(((double) ((local18 - (p5 * local15)) + (p7 * local15)))))))).a(((double)(0x1.0p-1d)), ((double)(0x1.0p-3d))))).a(((float)(this.aM)), ((float)(this.aN)), ((float)(this.aO)), ((float)(this.aP))))).a(((int)(local20)), ((int)(local21))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(p0)).a(((double)(((double) ((local16 + (p3 * local15)) + (p6 * local15))))), ((double)(((double) (local17 + (p4 * local15))))), ((double)(((double) ((local18 + (p5 * local15)) + (p7 * local15)))))))).a(((double)(0x1.0p-2d)), ((double)(0x1.0p-3d))))).a(((float)(this.aM)), ((float)(this.aN)), ((float)(this.aO)), ((float)(this.aP))))).a(((int)(local20)), ((int)(local21))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(p0)).a(((double)(((double) ((local16 + (p3 * local15)) - (p6 * local15))))), ((double)(((double) (local17 - (p4 * local15))))), ((double)(((double) ((local18 + (p5 * local15)) - (p7 * local15)))))))).a(((double)(0x1.0p-2d)), ((double)(0x1.8p-2d))))).a(((float)(this.aM)), ((float)(this.aN)), ((float)(this.aO)), ((float)(this.aP))))).a(((int)(local20)), ((int)(local21))))).c__Void();
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_f385da9e150a41a2_originalDynamicSite3297_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral9063_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_54c23c7634ff_originalDynamicSite1639_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_54c23c7634ff_originalDynamicSite1639_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_54c23c7634ff_originalDynamicSite1639_20(int a0, long a1) throws E;
}
