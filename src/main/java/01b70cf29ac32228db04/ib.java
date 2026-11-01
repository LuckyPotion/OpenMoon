package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class ib extends moom.h5 {

private final net.minecraft.client.gui.GuiMultiplayer y;

private final java.util.List<moom.iu> z;

private final java.util.List<moom.is> A;

private final moom.hO B;

private int C;

private static final long D;

private static final long[] E;

private static final java.lang.Integer[] F;

private static final java.util.Map H;

public ib(net.minecraft.client.gui.GuiMultiplayer p0, net.minecraft.client.Minecraft p1, int p2, int p3, int p4, int p5, int p6) {
super(p1, p2, p3, p4, p5, p6);
    this.z = com.google.common.collect.Lists.newArrayList();
    this.A = com.google.common.collect.Lists.newArrayList();
    this.B = new moom.it();
    this.C = -1;
    this.y = p0;
}


static {
D = ((long)(((moom._a)(moom._c.a(((long)(-1836993259411226171L)), ((long)(-5018664882346858019L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(42074032627237L)))));
    H = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.ib.D ^ 39029003860866L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill882_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill882_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill882_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill882_14 = new byte[8];
    (__sourceSpill882_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill882_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation882_16 = __sourceSpill882_14;
    ((javax.crypto.Cipher)(__sourceSpill882_11)).init(((int)(__sourceSpill882_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill882_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation882_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "6~\0030\030ö÷î­\036ÃY\fòh"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill882_25 = local6_life21;
        int __sourceSpill882_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill882_25)).substring(((int)(__sourceSpill882_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill882_30 = local8_life19;
        int __sourceSpill882_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill882_33 = new byte[8];
        (__sourceSpill882_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill882_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill882_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill882_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill882_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill882_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill882_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill882_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill882_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill882_34)).doFinal(((byte[])(__sourceSpill882_33)));
        (__sourceSpill882_30)[__sourceSpill882_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    E = ((long[])(local8_life19));
    F = ((java.lang.Integer[])(new java.lang.Integer[2]));
}


public int e() {
long local1 = (moom.ib.D ^ 117182615435521L);
    return (super.e() + __sourceIntrinsic_c4b63a62bb23_originalDynamicSite1515_2(14972, (6672808785776696224L ^ local1)));
}


private static moom.Oo c(moom.Oo p0) {
return p0;
}


public void c(int p0) {
this.C = ((int)(p0));
    return;
}


public int h() {
return this.C;
}


protected int f() {
long local1 = (moom.ib.D ^ 36908012987561L);
    return (super.f() + __sourceIntrinsic_d5f736cb4191_originalDynamicSite1516_2(19818, (5872578680912539935L ^ local1)));
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 10790;
      if (F[var3] == null) {
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
         long var5 = E[var3];
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
         Object[] var9 = (Object[])H.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               H.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/ib", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         F[var3] = var15;
      }

      return F[var3];
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral8039_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/ib"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.ib.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public moom.hO a__hO(int p0) {
if ((p0 < ((java.util.List)(this.z)).size())) {
        return ((moom.hO)(((java.util.List)(this.z)).get(((int)(p0)))));
    }
    p0 = (p0 - ((java.util.List)(this.z)).size());
    if ((p0 == 0)) {
        return this.B;
    }
    p0 += -1;
    return ((moom.hO)(((java.util.List)(this.A)).get(((int)(p0)))));
}


protected int a() {
return ((((java.util.List)(this.z)).size() + 1) + ((java.util.List)(this.A)).size());
}


protected boolean a__Boolean(int p0) {
return ((((p0 == this.C) ? 1 : 0)) != 0);
}


public void a(moom.jM p0) {
((java.util.List)(this.z)).clear();
    int local2 = 0;
    while ((local2 < ((moom.jM)(p0)).a())) {
        ((java.util.List)(this.z)).add(((java.lang.Object)(new moom.iu(this.y, ((moom.jM)(p0)).a(((int)(local2)))))));
        local2 += 1;
    }
    return;
}


public void a(java.util.List<moom.jO> p0) {
java.util.Iterator life2_5;
    moom.jO life3_12;
    ((java.util.List)(this.A)).clear();
    life2_5 = ((java.util.List)(p0)).iterator();
    while (((java.util.Iterator)(life2_5)).hasNext()) {
        life3_12 = ((moom.jO)(((java.util.Iterator)(life2_5)).next()));
        ((java.util.List)(this.A)).add(((java.lang.Object)(new moom.is(this.y, life3_12))));
    }
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_c4b63a62bb23_originalDynamicSite1515_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d5f736cb4191_originalDynamicSite1516_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral8039_0() throws E;
}
