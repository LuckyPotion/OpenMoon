package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class sm extends net.minecraft.client.particle.EntityFX {

private int aV;

private int aW;

private static long bb;

private static long[] hb;

private static java.lang.Integer[] ib;

private static java.util.Map jb;

protected sm(net.minecraft.world.World p0, double p1, double p2, double p3, double p4, double p5, double p6) { super((net.minecraft.world.World)null, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D); }


private static void __sourceConstructorBody_7cbb27b6c3af0ea0(moom.sm receiver, net.minecraft.world.World p0, double p1, double p2, double p3, double p4, double p5, double p6) throws Throwable {

long local14 = (moom.sm.bb ^ 74428470994955L);

    moom.sm.__sourceConstructorInit_7cbb27b6c3af0ea0_0(((moom.sm)(receiver)), ((net.minecraft.world.World)(p0)), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)));

    ((moom.sm)(receiver)).aW = ((int)(__sourceIntrinsic_7cbb27b6c3af0ea0_originalDynamicSite3310_2(20368, (7981232223776243047L ^ local14))));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_7cbb27b6c3af0ea0_0(moom.sm a0, net.minecraft.world.World a1, double a2, double a3, double a4, double a5, double a6, double a7) throws E;

static {
bb = ((long)(((moom._a)(moom._c.a(((long)(2208561719429418473L)), ((long)(7432946851230918821L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(160065650202227L)))));
    jb = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.sm.bb ^ 115607737543145L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1016_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1016_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1016_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1016_14 = new byte[8];
    (__sourceSpill1016_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1016_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1016_16 = __sourceSpill1016_14;
    ((javax.crypto.Cipher)(__sourceSpill1016_11)).init(((int)(__sourceSpill1016_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1016_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1016_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[3];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "]\037J\000\006óKÔ¨A#<r>ð(ø\021"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1016_25 = local6_life21;
        int __sourceSpill1016_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1016_25)).substring(((int)(__sourceSpill1016_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1016_30 = local8_life19;
        int __sourceSpill1016_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1016_33 = new byte[8];
        (__sourceSpill1016_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1016_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1016_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1016_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1016_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1016_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1016_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1016_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1016_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1016_34)).doFinal(((byte[])(__sourceSpill1016_33)));
        (__sourceSpill1016_30)[__sourceSpill1016_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    hb = ((long[])(local8_life19));
    ib = ((java.lang.Integer[])(new java.lang.Integer[3]));
}


private static int c(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 13067;
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
            throw new RuntimeException("moom/sm", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         ib[var3] = var15;
      }

      return ib[var3];
}


private static int c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.sm.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral9077_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/sm"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(moom.lw p0, net.minecraft.entity.Entity p1, float p2, float p3, float p4, float p5, float p6, float p7) {
return;
}


public int a__Int() {
return 1;
}


public void g__Void() {
long life1_3;
    int life3_5;
    double life4_25;
    double life6_38;
    double life8_51;
    life1_3 = (moom.sm.bb ^ 57562964899871L);
    life3_5 = 0;
    loop_region_6: while ((life3_5 < __sourceIntrinsic_736a66cda11e_invokedynamic1304_1(14753, (7943697967560825665L ^ life1_3)))) {
        life4_25 = (this.n + ((((java.util.Random)(this.ah)).nextDouble() - ((java.util.Random)(this.ah)).nextDouble()) * 0x1.0p2d));
        life6_38 = (this.o + ((((java.util.Random)(this.ah)).nextDouble() - ((java.util.Random)(this.ah)).nextDouble()) * 0x1.0p2d));
        life8_51 = (this.p + ((((java.util.Random)(this.ah)).nextDouble() - ((java.util.Random)(this.ah)).nextDouble()) * 0x1.0p2d));
        net.minecraft.world.World spill1304_0 = this.i;
        net.minecraft.util.EnumParticleTypes spill1304_1 = net.minecraft.util.EnumParticleTypes.EXPLOSION_LARGE;
        double spill1304_2 = life4_25;
        double spill1304_3 = life6_38;
        double spill1304_4 = life8_51;
        float spill1304_5 = ((float) this.aV);
        java.util.Objects.requireNonNull(((java.lang.Object)(this)));
        ((net.minecraft.world.World)(spill1304_0)).a(((net.minecraft.util.EnumParticleTypes)(spill1304_1)), ((double)(spill1304_2)), ((double)(spill1304_3)), ((double)(spill1304_4)), ((double)(((double) (spill1304_5 / 0x1.0p3f)))), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((int[])(new int[0])));
        life3_5 += 1;
    }
    moom.sm __stackOp1304_22_0 = this;
    ((moom.sm)(__stackOp1304_22_0)).aV = ((int)((((moom.sm)(__stackOp1304_22_0)).aV + 1)));
    int spill1304_6 = this.aV;
    java.util.Objects.requireNonNull(((java.lang.Object)(this)));
    if ((spill1304_6 == __sourceIntrinsic_736a66cda11e_invokedynamic1304_27(23899, (2112886238461263801L ^ life1_3)))) {
        ((moom.sm)(this)).f__Void();
    }
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_7cbb27b6c3af0ea0_originalDynamicSite3310_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral9077_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_736a66cda11e_invokedynamic1304_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_736a66cda11e_invokedynamic1304_27(int a0, long a1) throws E;
}
