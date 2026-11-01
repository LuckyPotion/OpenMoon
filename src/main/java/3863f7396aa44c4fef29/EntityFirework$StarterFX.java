package net.minecraft.client.particle;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class EntityFirework$StarterFX extends net.minecraft.client.particle.EntityFX {

private int aV;

private net.minecraft.client.particle.EffectRenderer aW;

private net.minecraft.nbt.NBTTagList aX;

boolean aY;

private static long bb;

private static long[] hb;

private static java.lang.Integer[] ib;

private static java.util.Map jb;

public EntityFirework$StarterFX(net.minecraft.world.World p0, double p1, double p2, double p3, double p4, double p5, double p6, net.minecraft.client.particle.EffectRenderer p7, net.minecraft.nbt.NBTTagCompound p8) { super((net.minecraft.world.World)null, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D); }

private static void __sourceConstructorBody_619903fd5ac76136(net.minecraft.client.particle.EntityFirework$StarterFX receiver, net.minecraft.world.World p0, double p1, double p2, double p3, double p4, double p5, double p6, net.minecraft.client.particle.EffectRenderer p7, net.minecraft.nbt.NBTTagCompound p8) throws Throwable {
long life16_3;
    int life18_62;
    net.minecraft.nbt.NBTTagCompound life19_72;
    forest_join_93: {
    forest_join_80: {
    forest_join_52: {
    life16_3 = (net.minecraft.client.particle.EntityFirework$StarterFX.bb ^ 35851766397641L);
    net.minecraft.client.particle.EntityFirework$StarterFX.__sourceConstructorInit_619903fd5ac76136_0(((net.minecraft.client.particle.EntityFirework$StarterFX)(receiver)), ((net.minecraft.world.World)(p0)), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)));
    ((net.minecraft.client.particle.EntityFirework$StarterFX)(receiver)).t = ((double)(p4));
    ((net.minecraft.client.particle.EntityFirework$StarterFX)(receiver)).u = ((double)(p5));
    ((net.minecraft.client.particle.EntityFirework$StarterFX)(receiver)).v = ((double)(p6));
    ((net.minecraft.client.particle.EntityFirework$StarterFX)(receiver)).aW = ((net.minecraft.client.particle.EffectRenderer)(p7));
    ((net.minecraft.client.particle.EntityFirework$StarterFX)(receiver)).aJ = ((int)(__sourceIntrinsic_619903fd5ac76136_invokedynamic537_6(7242, (3892207347586285767L ^ life16_3))));
    if (!((p8 != null))) {
        break forest_join_93;
    }
    ((net.minecraft.client.particle.EntityFirework$StarterFX)(receiver)).aX = ((net.minecraft.nbt.NBTTagList)(((net.minecraft.nbt.NBTTagCompound)(p8)).a(((java.lang.String)("Explosions")), ((int)(__sourceIntrinsic_619903fd5ac76136_invokedynamic537_8(3879, (6409558445763842978L ^ life16_3)))))));
    if (!((((net.minecraft.nbt.NBTTagList)(((net.minecraft.client.particle.EntityFirework$StarterFX)(receiver)).aX)).a__Int() == 0))) {
        break forest_join_52;
    }
    ((net.minecraft.client.particle.EntityFirework$StarterFX)(receiver)).aX = ((net.minecraft.nbt.NBTTagList)(null));
    break forest_join_93;
    }
    ((net.minecraft.client.particle.EntityFirework$StarterFX)(receiver)).aJ = ((int)(((((net.minecraft.nbt.NBTTagList)(((net.minecraft.client.particle.EntityFirework$StarterFX)(receiver)).aX)).a__Int() * 2) - 1)));
    life18_62 = 0;
    forest_cycle_63: while (true) {
    forest_join_78: {
    if (!((life18_62 < ((net.minecraft.nbt.NBTTagList)(((net.minecraft.client.particle.EntityFirework$StarterFX)(receiver)).aX)).a__Int()))) {
        break forest_join_93;
    }
    life19_72 = ((net.minecraft.nbt.NBTTagList)(((net.minecraft.client.particle.EntityFirework$StarterFX)(receiver)).aX)).a__yw(((int)(life18_62)));
    if (!(((net.minecraft.nbt.NBTTagCompound)(life19_72)).b__Boolean(((java.lang.String)("Flicker"))))) {
        break forest_join_78;
    }
    break forest_join_80;
    }
    life18_62 += 1;
    continue forest_cycle_63;
    }
    }
    ((net.minecraft.client.particle.EntityFirework$StarterFX)(receiver)).aY = ((boolean)(true));
    net.minecraft.client.particle.EntityFirework$StarterFX __stackOp537_23_0 = receiver;
    ((net.minecraft.client.particle.EntityFirework$StarterFX)(__stackOp537_23_0)).aJ = ((int)((((net.minecraft.client.particle.EntityFirework$StarterFX)(__stackOp537_23_0)).aJ + __sourceIntrinsic_619903fd5ac76136_invokedynamic537_25(24505, (925429311812830003L ^ life16_3)))));
    }
    return;
}


static {
bb = ((long)(((moom._a)(moom._c.a(((long)(-1836890412119324768L)), ((long)(-8975141363619533299L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(12987211549386L)))));
    jb = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (net.minecraft.client.particle.EntityFirework$StarterFX.bb ^ 48334594479732L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1801_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1801_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1801_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1801_14 = new byte[8];
    (__sourceSpill1801_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1801_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1801_16 = __sourceSpill1801_14;
    ((javax.crypto.Cipher)(__sourceSpill1801_11)).init(((int)(__sourceSpill1801_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1801_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1801_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[16];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "¼â%x5l/\025ópÝ[\006o|pP[f\003È±­\024KT håÅl!\034\027\0016\035iÉTülIÔ$j°O¨û±ð£\000\030eT<K\n<ÀªþÕä(A¼yZ)\024ÿ1Ï¦DÚ®ÏÕð !c\017`&Z"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1801_25 = local6_life21;
        int __sourceSpill1801_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1801_25)).substring(((int)(__sourceSpill1801_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1801_30 = local8_life19;
        int __sourceSpill1801_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1801_33 = new byte[8];
        (__sourceSpill1801_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1801_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1801_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1801_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1801_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1801_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1801_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1801_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1801_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1801_34)).doFinal(((byte[])(__sourceSpill1801_33)));
        (__sourceSpill1801_30)[__sourceSpill1801_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "þÅå­ÉK¯?2úØ]"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1801_38 = local6_life21;
        int __sourceSpill1801_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1801_38)).substring(((int)(__sourceSpill1801_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1801_43 = local8_life19;
        int __sourceSpill1801_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1801_46 = new byte[8];
        (__sourceSpill1801_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1801_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1801_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1801_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1801_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1801_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1801_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1801_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1801_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1801_47)).doFinal(((byte[])(__sourceSpill1801_46)));
        (__sourceSpill1801_43)[__sourceSpill1801_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    hb = ((long[])(local8_life19));
    ib = ((java.lang.Integer[])(new java.lang.Integer[16]));
}

private static native <E extends Throwable> void __sourceConstructorInit_619903fd5ac76136_0(net.minecraft.client.particle.EntityFirework$StarterFX a0, net.minecraft.world.World a1, double a2, double a3, double a4, double a5, double a6, double a7) throws E;

private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral10530_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/sh"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int c(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 17033;
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
            throw new RuntimeException("moom/sh", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         ib[var3] = var15;
      }

      return ib[var3];
}


private static int c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_4c47a0a87d477c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private boolean c__sourceReturn_aae029aa0a() {
int forwardValue4806_22_0;
    net.minecraft.client.Minecraft life1_1;
    forward_join_22: {
    forward_join_21: {
    forward_join_19: {
    life1_1 = net.minecraft.client.Minecraft.a__fM();
    if (!((life1_1 != null))) {
        break forward_join_19;
    }
    if (!((((net.minecraft.client.Minecraft)(life1_1)).a__r3() != null))) {
        break forward_join_19;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(((net.minecraft.entity.Entity)(((net.minecraft.client.Minecraft)(life1_1)).a__r3())).a(((double)(this.n)), ((double)(this.o)), ((double)(this.p))))), ((double)(0x1.0p8d))) >= 0))) {
        break forward_join_21;
    }
    }
    forwardValue4806_22_0 = 1;
    break forward_join_22;
    }
    forwardValue4806_22_0 = 0;
    }
    return ((forwardValue4806_22_0) != 0);
}


private void a(double p0, int p1, int[] p2, int[] p3, boolean p4, boolean p5) {
double local8 = this.n;
    double local10 = this.o;
    double local12 = this.p;
    int local14 = (-p1);
    while ((local14 <= p1)) {
        int local15 = (-p1);
        while ((local15 <= p1)) {
        int local16 = (-p1);
        while ((local16 <= p1)) {
        double local17 = (((double) local15) + ((((java.util.Random)(this.ah)).nextDouble() - ((java.util.Random)(this.ah)).nextDouble()) * 0x1.0p-1d));
        double local19 = (((double) local14) + ((((java.util.Random)(this.ah)).nextDouble() - ((java.util.Random)(this.ah)).nextDouble()) * 0x1.0p-1d));
        double local21 = (((double) local16) + ((((java.util.Random)(this.ah)).nextDouble() - ((java.util.Random)(this.ah)).nextDouble()) * 0x1.0p-1d));
        double local23 = ((((double) moom.Dr.a__Float(((double)((((local17 * local17) + (local19 * local19)) + (local21 * local21)))))) / p0) + (((java.util.Random)(this.ah)).nextGaussian() * 0x1.999999999999ap-5d));
        ((net.minecraft.client.particle.EntityFirework$StarterFX)(this)).a(((double)(local8)), ((double)(local10)), ((double)(local12)), ((double)((local17 / local23))), ((double)((local19 / local23))), ((double)((local21 / local23))), ((int[])(p2)), ((int[])(p3)), ((boolean)(p4)), ((boolean)(p5)));
        if ((local14 != (-p1))) {
        if ((local14 != p1)) {
        if ((local15 != (-p1))) {
        if ((local15 != p1)) {
        local16 = (local16 + ((p1 * 2) - 1));
    }
    }
    }
    }
        local16 += 1;
    }
        local15 += 1;
    }
        local14 += 1;
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(moom.lw p0, net.minecraft.entity.Entity p1, float p2, float p3, float p4, float p5, float p6, float p7) {
return;
}


private void a(int[] p0, int[] p1, boolean p2, boolean p3) {
long local5 = (net.minecraft.client.particle.EntityFirework$StarterFX.bb ^ 43201043475503L);
    double local7 = (((java.util.Random)(this.ah)).nextGaussian() * 0x1.999999999999ap-5d);
    double local9 = (((java.util.Random)(this.ah)).nextGaussian() * 0x1.999999999999ap-5d);
    int local11 = 0;
    while ((local11 < __sourceIntrinsic_d5151951b3a9_invokedynamic8781_5(8676, (4529562263117671309L ^ local5)))) {
        double local12 = (((this.t * 0x1.0p-1d) + (((java.util.Random)(this.ah)).nextGaussian() * 0x1.3333333333333p-3d)) + local7);
        double local14 = (((this.v * 0x1.0p-1d) + (((java.util.Random)(this.ah)).nextGaussian() * 0x1.3333333333333p-3d)) + local9);
        double local16 = ((this.u * 0x1.0p-1d) + (((java.util.Random)(this.ah)).nextDouble() * 0x1.0p-1d));
        ((net.minecraft.client.particle.EntityFirework$StarterFX)(this)).a(((double)(this.n)), ((double)(this.o)), ((double)(this.p)), ((double)(local12)), ((double)(local16)), ((double)(local14)), ((int[])(p0)), ((int[])(p1)), ((boolean)(p2)), ((boolean)(p3)));
        local11 += 1;
    }
    return;
}


private void a(double p0, double[][] p1, int[] p2, int[] p3, boolean p4, boolean p5, boolean p6) {
double local9 = ((p1)[0])[0];
    double local11 = ((p1)[0])[1];
    ((net.minecraft.client.particle.EntityFirework$StarterFX)(this)).a(((double)(this.n)), ((double)(this.o)), ((double)(this.p)), ((double)((local9 * p0))), ((double)((local11 * p0))), ((double)(0x0.0p0d)), ((int[])(p2)), ((int[])(p3)), ((boolean)(p4)), ((boolean)(p5)));
    float local13 = (((java.util.Random)(this.ah)).nextFloat() * 0x1.921fb6p1f);
    double local14 = (p6 ? 0x1.16872b020c49cp-5d : 0x1.5c28f5c28f5c3p-2d);
    int local16 = 0;
    while ((local16 < 3)) {
        double local17 = (((double) local13) + (((double) (((float) local16) * 0x1.921fb6p1f)) * local14));
        double local19 = local9;
        double local21 = local11;
        int local23 = 1;
        while ((local23 < (p1).length)) {
        double local24 = ((p1)[local23])[0];
        double local26 = ((p1)[local23])[1];
        double local28 = 0x1.0p-2d;
        while ((local28 <= 0x1.0p0d)) {
        double local30 = ((local19 + ((local24 - local19) * local28)) * p0);
        double local32 = ((local21 + ((local26 - local21) * local28)) * p0);
        double local34 = (local30 * java.lang.Math.sin(((double)(local17))));
        local30 = (local30 * java.lang.Math.cos(((double)(local17))));
        double local36 = -0x1.0p0d;
        while ((local36 <= 0x1.0p0d)) {
        ((net.minecraft.client.particle.EntityFirework$StarterFX)(this)).a(((double)(this.n)), ((double)(this.o)), ((double)(this.p)), ((double)((local30 * local36))), ((double)(local32)), ((double)((local34 * local36))), ((int[])(p2)), ((int[])(p3)), ((boolean)(p4)), ((boolean)(p5)));
        local36 = (local36 + 0x1.0p1d);
    }
        local28 = (local28 + 0x1.0p-2d);
    }
        local19 = local24;
        local21 = local26;
        local23 += 1;
    }
        local16 += 1;
    }
    return;
}


private void a(double p0, double p1, double p2, double p3, double p4, double p5, int[] p6, int[] p7, boolean p8, boolean p9) {
moom.sg local17 = new moom.sg(this.i, p0, p1, p2, p3, p4, p5, this.aW);
    ((moom.sg)(local17)).c(((float)(0x1.fae148p-1f)));
    ((moom.sg)(local17)).h(((boolean)(p8)));
    ((moom.sg)(local17)).i(((boolean)(p9)));
    int local18 = ((java.util.Random)(this.ah)).nextInt(((int)((p6).length)));
    ((moom.sg)(local17)).h(((int)((p6)[local18])));
    if ((p7 != null)) {
        if (((p7).length > 0)) {
        ((moom.sg)(local17)).i(((int)((p7)[((java.util.Random)(this.ah)).nextInt(((int)((p7).length)))])));
    }
    }
    ((net.minecraft.client.particle.EffectRenderer)(this.aW)).a(((net.minecraft.client.particle.EntityFX)(local17)));
    return;
}


public int a__Int() {
return 0;
}


public void g__Void() {
long life1_3;
    int life3_15;
    int life4_17;
    int life5_27;
    net.minecraft.nbt.NBTTagCompound life6_37;
    java.lang.String life5_63;
    int life3_109;
    net.minecraft.nbt.NBTTagCompound life4_114;
    int life5_118;
    int life6_122;
    int life7_126;
    int[] life8_130;
    int[] life9_134;
    int life10_482;
    float life11_499;
    float life12_516;
    float life13_527;
    moom.sf life14_539;
    int life3_568;
    java.lang.String life4_577;
    life1_3 = (net.minecraft.client.particle.EntityFirework$StarterFX.bb ^ 50032817304879L);
    if ((this.aV == 0)) {
        if ((this.aX != null)) {
        life3_15 = ((__sourceExactCall_58cb4de3a1a4ab(((net.minecraft.client.particle.EntityFirework$StarterFX)(this)))) ? 1 : 0);
        life4_17 = 0;
        if ((((net.minecraft.nbt.NBTTagList)(this.aX)).a__Int() >= 3)) {
        life4_17 = 1;
    } else {
        life5_27 = 0;
        loop_region_25: while ((life5_27 < ((net.minecraft.nbt.NBTTagList)(this.aX)).a__Int())) {
        life6_37 = ((net.minecraft.nbt.NBTTagList)(this.aX)).a__yw(((int)(life5_27)));
        if ((((net.minecraft.nbt.NBTTagCompound)(life6_37)).b__sourceReturn_d4c7a9581c(((java.lang.String)("Type"))) == 1)) {
        life4_17 = 1;
        break loop_region_25;
    }
        life5_27 += 1;
    }
    }
        java.lang.String spill1490_0 = ((life4_17 != 0) ? "largeBlast" : "blast");
        life5_63 = __sourceIntrinsic_736a66cda11e_invokedynamic1490_12(spill1490_0, ((life3_15 != 0) ? "_far" : ""));
        ((net.minecraft.world.World)(this.i)).a(((double)(this.n)), ((double)(this.o)), ((double)(this.p)), ((java.lang.String)(life5_63)), ((float)(0x1.4p4f)), ((float)((0x1.e66666p-1f + (((java.util.Random)(this.ah)).nextFloat() * 0x1.99999ap-4f)))), ((boolean)(true)));
    }
    }
    if (((this.aV % 2) == 0)) {
        if ((this.aX != null)) {
        if (((this.aV / 2) < ((net.minecraft.nbt.NBTTagList)(this.aX)).a__Int())) {
        life3_109 = (this.aV / 2);
        life4_114 = ((net.minecraft.nbt.NBTTagList)(this.aX)).a__yw(((int)(life3_109)));
        life5_118 = ((net.minecraft.nbt.NBTTagCompound)(life4_114)).b__sourceReturn_d4c7a9581c(((java.lang.String)("Type")));
        life6_122 = ((((net.minecraft.nbt.NBTTagCompound)(life4_114)).b__Boolean(((java.lang.String)("Trail")))) ? 1 : 0);
        life7_126 = ((((net.minecraft.nbt.NBTTagCompound)(life4_114)).b__Boolean(((java.lang.String)("Flicker")))) ? 1 : 0);
        life8_130 = ((net.minecraft.nbt.NBTTagCompound)(life4_114)).a__ArrayInt(((java.lang.String)("Colors")));
        life9_134 = ((net.minecraft.nbt.NBTTagCompound)(life4_114)).a__ArrayInt(((java.lang.String)("FadeColors")));
        if (((life8_130).length == 0)) {
        int[] __stackOp1490_35_0 = new int[1];
        int[] spill1490_1 = __stackOp1490_35_0;
        (__stackOp1490_35_0)[0] = (moom.xd.n)[0];
        life8_130 = spill1490_1;
    }
        if ((life5_118 == 1)) {
        ((net.minecraft.client.particle.EntityFirework$StarterFX)(this)).a(((double)(0x1.0p-1d)), ((int)(4)), ((int[])(life8_130)), ((int[])(life9_134)), ((boolean)__sourceIntrinsic_integerToBoolean((life6_122))), ((boolean)__sourceIntrinsic_integerToBoolean((life7_126))));
    } else {
        if ((life5_118 == 2)) {
        net.minecraft.client.particle.EntityFirework$StarterFX spill1490_2 = this;
        double spill1490_3 = 0x1.0p-1d;
        double[][] __stackOp1490_39_0 = new double[__sourceIntrinsic_736a66cda11e_invokedynamic1490_38(6962, (1712678578424793174L ^ life1_3))][];
        double[][] spill1490_4 = __stackOp1490_39_0;
        double[][] spill1490_5 = __stackOp1490_39_0;
        int spill1490_6 = 0;
        double[] __stackOp1490_40_0 = new double[2];
        double[] spill1490_7 = __stackOp1490_40_0;
        (__stackOp1490_40_0)[0] = 0x0.0p0d;
        double[] __stackOp1490_41_0 = spill1490_7;
        double[] spill1490_8 = __stackOp1490_41_0;
        (__stackOp1490_41_0)[1] = 0x1.0p0d;
        (spill1490_5)[spill1490_6] = spill1490_8;
        double[][] __stackOp1490_42_0 = spill1490_4;
        double[][] spill1490_9 = __stackOp1490_42_0;
        double[][] spill1490_10 = __stackOp1490_42_0;
        int spill1490_11 = 1;
        double[] __stackOp1490_43_0 = new double[2];
        double[] spill1490_12 = __stackOp1490_43_0;
        (__stackOp1490_43_0)[0] = 0x1.61cac083126e9p-2d;
        double[] __stackOp1490_44_0 = spill1490_12;
        double[] spill1490_13 = __stackOp1490_44_0;
        (__stackOp1490_44_0)[1] = 0x1.3c6a7ef9db22dp-2d;
        (spill1490_10)[spill1490_11] = spill1490_13;
        double[][] __stackOp1490_45_0 = spill1490_9;
        double[][] spill1490_14 = __stackOp1490_45_0;
        double[][] spill1490_15 = __stackOp1490_45_0;
        int spill1490_16 = 2;
        double[] __stackOp1490_46_0 = new double[2];
        double[] spill1490_17 = __stackOp1490_46_0;
        (__stackOp1490_46_0)[0] = 0x1.e6f694467381dp-1d;
        double[] __stackOp1490_47_0 = spill1490_17;
        double[] spill1490_18 = __stackOp1490_47_0;
        (__stackOp1490_47_0)[1] = 0x1.3c6a7ef9db22dp-2d;
        (spill1490_15)[spill1490_16] = spill1490_18;
        double[][] __stackOp1490_48_0 = spill1490_14;
        double[][] spill1490_19 = __stackOp1490_48_0;
        double[][] spill1490_20 = __stackOp1490_48_0;
        int spill1490_21 = 3;
        double[] __stackOp1490_49_0 = new double[2];
        double[] spill1490_22 = __stackOp1490_49_0;
        (__stackOp1490_49_0)[0] = 0x1.84b3b8f26a946p-2d;
        double[] __stackOp1490_50_0 = spill1490_22;
        double[] spill1490_23 = __stackOp1490_50_0;
        (__stackOp1490_50_0)[1] = -0x1.03227b4c470d9p-3d;
        (spill1490_20)[spill1490_21] = spill1490_23;
        double[][] __stackOp1490_51_0 = spill1490_19;
        double[][] spill1490_24 = __stackOp1490_51_0;
        double[][] spill1490_25 = __stackOp1490_51_0;
        int spill1490_26 = 4;
        double[] __stackOp1490_52_0 = new double[2];
        double[] spill1490_27 = __stackOp1490_52_0;
        (__stackOp1490_52_0)[0] = 0x1.397829cbc14e6p-1d;
        double[] __stackOp1490_53_0 = spill1490_27;
        double[] spill1490_28 = __stackOp1490_53_0;
        (__stackOp1490_53_0)[1] = -0x1.9bb096771e4d5p-1d;
        (spill1490_25)[spill1490_26] = spill1490_28;
        double[][] __stackOp1490_54_0 = spill1490_24;
        double[][] spill1490_29 = __stackOp1490_54_0;
        double[][] spill1490_30 = __stackOp1490_54_0;
        int spill1490_31 = 5;
        double[] __stackOp1490_55_0 = new double[2];
        double[] spill1490_32 = __stackOp1490_55_0;
        (__stackOp1490_55_0)[0] = 0x0.0p0d;
        double[] __stackOp1490_56_0 = spill1490_32;
        double[] spill1490_33 = __stackOp1490_56_0;
        (__stackOp1490_56_0)[1] = -0x1.6fcdd84b3b8f2p-2d;
        (spill1490_30)[spill1490_31] = spill1490_33;
        ((net.minecraft.client.particle.EntityFirework$StarterFX)(spill1490_2)).a(((double)(spill1490_3)), ((double[][])(spill1490_29)), ((int[])(life8_130)), ((int[])(life9_134)), ((boolean)__sourceIntrinsic_integerToBoolean((life6_122))), ((boolean)__sourceIntrinsic_integerToBoolean((life7_126))), ((boolean)(false)));
    } else {
        if ((life5_118 == 3)) {
        net.minecraft.client.particle.EntityFirework$StarterFX spill1490_34 = this;
        double spill1490_35 = 0x1.0p-1d;
        double[][] __stackOp1490_59_0 = new double[__sourceIntrinsic_736a66cda11e_invokedynamic1490_58(25652, (5596255872308066133L ^ life1_3))][];
        double[][] spill1490_36 = __stackOp1490_59_0;
        double[][] spill1490_37 = __stackOp1490_59_0;
        int spill1490_38 = 0;
        double[] __stackOp1490_60_0 = new double[2];
        double[] spill1490_39 = __stackOp1490_60_0;
        (__stackOp1490_60_0)[0] = 0x0.0p0d;
        double[] __stackOp1490_61_0 = spill1490_39;
        double[] spill1490_40 = __stackOp1490_61_0;
        (__stackOp1490_61_0)[1] = 0x1.999999999999ap-3d;
        (spill1490_37)[spill1490_38] = spill1490_40;
        double[][] __stackOp1490_62_0 = spill1490_36;
        double[][] spill1490_41 = __stackOp1490_62_0;
        double[][] spill1490_42 = __stackOp1490_62_0;
        int spill1490_43 = 1;
        double[] __stackOp1490_63_0 = new double[2];
        double[] spill1490_44 = __stackOp1490_63_0;
        (__stackOp1490_63_0)[0] = 0x1.999999999999ap-3d;
        double[] __stackOp1490_64_0 = spill1490_44;
        double[] spill1490_45 = __stackOp1490_64_0;
        (__stackOp1490_64_0)[1] = 0x1.999999999999ap-3d;
        (spill1490_42)[spill1490_43] = spill1490_45;
        double[][] __stackOp1490_65_0 = spill1490_41;
        double[][] spill1490_46 = __stackOp1490_65_0;
        double[][] spill1490_47 = __stackOp1490_65_0;
        int spill1490_48 = 2;
        double[] __stackOp1490_66_0 = new double[2];
        double[] spill1490_49 = __stackOp1490_66_0;
        (__stackOp1490_66_0)[0] = 0x1.999999999999ap-3d;
        double[] __stackOp1490_67_0 = spill1490_49;
        double[] spill1490_50 = __stackOp1490_67_0;
        (__stackOp1490_67_0)[1] = 0x1.3333333333333p-1d;
        (spill1490_47)[spill1490_48] = spill1490_50;
        double[][] __stackOp1490_68_0 = spill1490_46;
        double[][] spill1490_51 = __stackOp1490_68_0;
        double[][] spill1490_52 = __stackOp1490_68_0;
        int spill1490_53 = 3;
        double[] __stackOp1490_69_0 = new double[2];
        double[] spill1490_54 = __stackOp1490_69_0;
        (__stackOp1490_69_0)[0] = 0x1.3333333333333p-1d;
        double[] __stackOp1490_70_0 = spill1490_54;
        double[] spill1490_55 = __stackOp1490_70_0;
        (__stackOp1490_70_0)[1] = 0x1.3333333333333p-1d;
        (spill1490_52)[spill1490_53] = spill1490_55;
        double[][] __stackOp1490_71_0 = spill1490_51;
        double[][] spill1490_56 = __stackOp1490_71_0;
        double[][] spill1490_57 = __stackOp1490_71_0;
        int spill1490_58 = 4;
        double[] __stackOp1490_72_0 = new double[2];
        double[] spill1490_59 = __stackOp1490_72_0;
        (__stackOp1490_72_0)[0] = 0x1.3333333333333p-1d;
        double[] __stackOp1490_73_0 = spill1490_59;
        double[] spill1490_60 = __stackOp1490_73_0;
        (__stackOp1490_73_0)[1] = 0x1.999999999999ap-3d;
        (spill1490_57)[spill1490_58] = spill1490_60;
        double[][] __stackOp1490_74_0 = spill1490_56;
        double[][] spill1490_61 = __stackOp1490_74_0;
        double[][] spill1490_62 = __stackOp1490_74_0;
        int spill1490_63 = 5;
        double[] __stackOp1490_75_0 = new double[2];
        double[] spill1490_64 = __stackOp1490_75_0;
        (__stackOp1490_75_0)[0] = 0x1.999999999999ap-3d;
        double[] __stackOp1490_76_0 = spill1490_64;
        double[] spill1490_65 = __stackOp1490_76_0;
        (__stackOp1490_76_0)[1] = 0x1.999999999999ap-3d;
        (spill1490_62)[spill1490_63] = spill1490_65;
        double[][] __stackOp1490_77_0 = spill1490_61;
        double[][] spill1490_66 = __stackOp1490_77_0;
        double[][] spill1490_67 = __stackOp1490_77_0;
        int spill1490_68 = __sourceIntrinsic_736a66cda11e_invokedynamic1490_78(22960, (1608616870958140126L ^ life1_3));
        double[] __stackOp1490_79_0 = new double[2];
        double[] spill1490_69 = __stackOp1490_79_0;
        (__stackOp1490_79_0)[0] = 0x1.999999999999ap-3d;
        double[] __stackOp1490_80_0 = spill1490_69;
        double[] spill1490_70 = __stackOp1490_80_0;
        (__stackOp1490_80_0)[1] = 0x0.0p0d;
        (spill1490_67)[spill1490_68] = spill1490_70;
        double[][] __stackOp1490_81_0 = spill1490_66;
        double[][] spill1490_71 = __stackOp1490_81_0;
        double[][] spill1490_72 = __stackOp1490_81_0;
        int spill1490_73 = __sourceIntrinsic_736a66cda11e_invokedynamic1490_82(7529, (3872112339964055049L ^ life1_3));
        double[] __stackOp1490_83_0 = new double[2];
        double[] spill1490_74 = __stackOp1490_83_0;
        (__stackOp1490_83_0)[0] = 0x1.999999999999ap-2d;
        double[] __stackOp1490_84_0 = spill1490_74;
        double[] spill1490_75 = __stackOp1490_84_0;
        (__stackOp1490_84_0)[1] = 0x0.0p0d;
        (spill1490_72)[spill1490_73] = spill1490_75;
        double[][] __stackOp1490_85_0 = spill1490_71;
        double[][] spill1490_76 = __stackOp1490_85_0;
        double[][] spill1490_77 = __stackOp1490_85_0;
        int spill1490_78 = __sourceIntrinsic_736a66cda11e_invokedynamic1490_86(28601, (7454319541802613980L ^ life1_3));
        double[] __stackOp1490_87_0 = new double[2];
        double[] spill1490_79 = __stackOp1490_87_0;
        (__stackOp1490_87_0)[0] = 0x1.999999999999ap-2d;
        double[] __stackOp1490_88_0 = spill1490_79;
        double[] spill1490_80 = __stackOp1490_88_0;
        (__stackOp1490_88_0)[1] = -0x1.3333333333333p-1d;
        (spill1490_77)[spill1490_78] = spill1490_80;
        double[][] __stackOp1490_89_0 = spill1490_76;
        double[][] spill1490_81 = __stackOp1490_89_0;
        double[][] spill1490_82 = __stackOp1490_89_0;
        int spill1490_83 = __sourceIntrinsic_736a66cda11e_invokedynamic1490_90(13400, (7257656069645592383L ^ life1_3));
        double[] __stackOp1490_91_0 = new double[2];
        double[] spill1490_84 = __stackOp1490_91_0;
        (__stackOp1490_91_0)[0] = 0x1.999999999999ap-3d;
        double[] __stackOp1490_92_0 = spill1490_84;
        double[] spill1490_85 = __stackOp1490_92_0;
        (__stackOp1490_92_0)[1] = -0x1.3333333333333p-1d;
        (spill1490_82)[spill1490_83] = spill1490_85;
        double[][] __stackOp1490_93_0 = spill1490_81;
        double[][] spill1490_86 = __stackOp1490_93_0;
        double[][] spill1490_87 = __stackOp1490_93_0;
        int spill1490_88 = __sourceIntrinsic_736a66cda11e_invokedynamic1490_94(210, (8729151665872884669L ^ life1_3));
        double[] __stackOp1490_95_0 = new double[2];
        double[] spill1490_89 = __stackOp1490_95_0;
        (__stackOp1490_95_0)[0] = 0x1.999999999999ap-3d;
        double[] __stackOp1490_96_0 = spill1490_89;
        double[] spill1490_90 = __stackOp1490_96_0;
        (__stackOp1490_96_0)[1] = -0x1.999999999999ap-2d;
        (spill1490_87)[spill1490_88] = spill1490_90;
        double[][] __stackOp1490_97_0 = spill1490_86;
        double[][] spill1490_91 = __stackOp1490_97_0;
        double[][] spill1490_92 = __stackOp1490_97_0;
        int spill1490_93 = __sourceIntrinsic_736a66cda11e_invokedynamic1490_98(25214, (4711957061303546134L ^ life1_3));
        double[] __stackOp1490_99_0 = new double[2];
        double[] spill1490_94 = __stackOp1490_99_0;
        (__stackOp1490_99_0)[0] = 0x0.0p0d;
        double[] __stackOp1490_100_0 = spill1490_94;
        double[] spill1490_95 = __stackOp1490_100_0;
        (__stackOp1490_100_0)[1] = -0x1.999999999999ap-2d;
        (spill1490_92)[spill1490_93] = spill1490_95;
        ((net.minecraft.client.particle.EntityFirework$StarterFX)(spill1490_34)).a(((double)(spill1490_35)), ((double[][])(spill1490_91)), ((int[])(life8_130)), ((int[])(life9_134)), ((boolean)__sourceIntrinsic_integerToBoolean((life6_122))), ((boolean)__sourceIntrinsic_integerToBoolean((life7_126))), ((boolean)(true)));
    } else {
        if ((life5_118 == 4)) {
        ((net.minecraft.client.particle.EntityFirework$StarterFX)(this)).a(((int[])(life8_130)), ((int[])(life9_134)), ((boolean)__sourceIntrinsic_integerToBoolean((life6_122))), ((boolean)__sourceIntrinsic_integerToBoolean((life7_126))));
    } else {
        ((net.minecraft.client.particle.EntityFirework$StarterFX)(this)).a(((double)(0x1.0p-2d)), ((int)(2)), ((int[])(life8_130)), ((int[])(life9_134)), ((boolean)__sourceIntrinsic_integerToBoolean((life6_122))), ((boolean)__sourceIntrinsic_integerToBoolean((life7_126))));
    }
    }
    }
    }
        life10_482 = (life8_130)[0];
        life11_499 = (((float) ((life10_482 & __sourceIntrinsic_736a66cda11e_invokedynamic1490_104(27019, (1987853067140905705L ^ life1_3))) >> __sourceIntrinsic_736a66cda11e_invokedynamic1490_105(5121, (4127877826923186027L ^ life1_3)))) / 0x1.fep7f);
        life12_516 = (((float) ((life10_482 & __sourceIntrinsic_736a66cda11e_invokedynamic1490_106(8197, (6159623564179665768L ^ life1_3))) >> __sourceIntrinsic_736a66cda11e_invokedynamic1490_107(7242, (3892210619235585825L ^ life1_3)))) / 0x1.fep7f);
        life13_527 = (((float) (life10_482 & __sourceIntrinsic_736a66cda11e_invokedynamic1490_108(12050, (3431172646187891828L ^ life1_3)))) / 0x1.fep7f);
        life14_539 = new moom.sf(this.i, this.n, this.o, this.p);
        ((moom.sf)(life14_539)).b(((float)(life11_499)), ((float)(life12_516)), ((float)(life13_527)));
        ((net.minecraft.client.particle.EffectRenderer)(this.aW)).a(((net.minecraft.client.particle.EntityFX)(life14_539)));
    }
    }
    }
    net.minecraft.client.particle.EntityFirework$StarterFX __stackOp1490_116_0 = this;
    ((net.minecraft.client.particle.EntityFirework$StarterFX)(__stackOp1490_116_0)).aV = ((int)((((net.minecraft.client.particle.EntityFirework$StarterFX)(__stackOp1490_116_0)).aV + 1)));
    if ((this.aV > this.aJ)) {
        if (this.aY) {
        life3_568 = ((__sourceExactCall_58cb4de3a1a4ab(((net.minecraft.client.particle.EntityFirework$StarterFX)(this)))) ? 1 : 0);
        life4_577 = __sourceIntrinsic_736a66cda11e_invokedynamic1490_124(((life3_568 != 0) ? "twinkle_far" : "twinkle"));
        ((net.minecraft.world.World)(this.i)).a(((double)(this.n)), ((double)(this.o)), ((double)(this.p)), ((java.lang.String)(life4_577)), ((float)(0x1.4p4f)), ((float)((0x1.ccccccp-1f + (((java.util.Random)(this.ah)).nextFloat() * 0x1.333334p-3f)))), ((boolean)(true)));
    }
        ((net.minecraft.client.particle.EntityFirework$StarterFX)(this)).f__Void();
    }
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_619903fd5ac76136_invokedynamic537_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_619903fd5ac76136_invokedynamic537_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_619903fd5ac76136_invokedynamic537_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d5151951b3a9_invokedynamic8781_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral10530_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_736a66cda11e_invokedynamic1490_12(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_736a66cda11e_invokedynamic1490_38(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_736a66cda11e_invokedynamic1490_58(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_736a66cda11e_invokedynamic1490_78(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_736a66cda11e_invokedynamic1490_82(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_736a66cda11e_invokedynamic1490_86(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_736a66cda11e_invokedynamic1490_90(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_736a66cda11e_invokedynamic1490_94(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_736a66cda11e_invokedynamic1490_98(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_736a66cda11e_invokedynamic1490_104(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_736a66cda11e_invokedynamic1490_105(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_736a66cda11e_invokedynamic1490_106(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_736a66cda11e_invokedynamic1490_107(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_736a66cda11e_invokedynamic1490_108(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_736a66cda11e_invokedynamic1490_124(java.lang.String a0) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native int __sourceExactCall_4c47a0a87d477c(int p0, long p1);
private static native boolean __sourceExactCall_58cb4de3a1a4ab(net.minecraft.client.particle.EntityFirework$StarterFX p0);
}
