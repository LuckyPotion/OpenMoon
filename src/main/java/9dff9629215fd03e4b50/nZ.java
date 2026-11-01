package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class nZ implements net.minecraft.client.renderer.entity.layers.LayerRenderer<moom.s9> {

private static final moom.DD a;

private final moom.nk b;

private static final long c;

private static final long[] d;

private static final java.lang.Integer[] e;

private static final java.util.Map f;

public nZ(moom.nk p0) {
super();
    this.b = p0;
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(-3860701388809293811L)), ((long)(5987878867024354568L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(135396802566265L)))));
    f = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.nZ.c ^ 5561975581939L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill945_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill945_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill945_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill945_14 = new byte[8];
    (__sourceSpill945_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill945_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation945_16 = __sourceSpill945_14;
    ((javax.crypto.Cipher)(__sourceSpill945_11)).init(((int)(__sourceSpill945_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill945_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation945_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[3];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "»Z<yC\025õC¦Lk}%¦õnþ!sß"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill945_25 = local6_life21;
        int __sourceSpill945_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill945_25)).substring(((int)(__sourceSpill945_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill945_30 = local8_life19;
        int __sourceSpill945_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill945_33 = new byte[8];
        (__sourceSpill945_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill945_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill945_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill945_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill945_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill945_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill945_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill945_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill945_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill945_34)).doFinal(((byte[])(__sourceSpill945_33)));
        (__sourceSpill945_30)[__sourceSpill945_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    d = ((long[])(local8_life19));
    e = ((java.lang.Integer[])(new java.lang.Integer[3]));
    a = ((moom.DD)(new moom.DD("textures/entity/spider_eyes.png")));
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 25488;
      if (e[var3] == null) {
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
         long var5 = d[var3];
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
         Object[] var9 = (Object[])f.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               f.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/nZ", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         e[var3] = var15;
      }

      return e[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.nZ.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral8506_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/nZ"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(moom.s9 p0, float p1, float p2, float p3, float p4, float p5, float p6, float p7) {
long local9 = (moom.nZ.c ^ 112237295472036L);
    if (((net.minecraft.client.renderer.entity.RenderManager)(((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).a__nw())).c__Boolean()) {
        return;
    }
    ((moom.nk)(this.b)).b(((moom.DD)(moom.nZ.a)));
    moom.kZ.l();
    moom.kZ.c__Void();
    moom.kZ.b(((int)(1)), ((int)(1)));
    moom.kZ.a(((boolean)__sourceIntrinsic_integerToBoolean((((!((moom.s9)(p0)).v__Boolean()) ? 1 : 0)))));
    int local11 = __sourceIntrinsic_b2b46ea1df15_invokedynamic8507_12(14518, (5942202815362539331L ^ local9));
    int local12 = (local11 % __sourceIntrinsic_b2b46ea1df15_invokedynamic8507_13(20051, (8384290644907682213L ^ local9)));
    int local13 = (local11 / __sourceIntrinsic_b2b46ea1df15_invokedynamic8507_14(23650, (5502911190765796245L ^ local9)));
    net.minecraft.client.renderer.OpenGlHelper.a(((int)(net.minecraft.client.renderer.OpenGlHelper.r)), ((float)(((float) local12))), ((float)(((float) local13))));
    moom.kZ.c(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    if (moom.BU.ap()) {
        moom.MP.Q();
    }
    ((net.minecraft.client.renderer.RenderGlobal)(moom.BU.a__lq())).H = ((boolean)(true));
    ((moom.iQ)(((moom.nk)(this.b)).a__iQ())).a(((net.minecraft.entity.Entity)(p0)), ((float)(p1)), ((float)(p2)), ((float)(p4)), ((float)(p5)), ((float)(p6)), ((float)(p7)));
    ((net.minecraft.client.renderer.RenderGlobal)(moom.BU.a__lq())).H = ((boolean)(false));
    if (moom.BU.ap()) {
        moom.MP.R();
    }
    local11 = ((moom.s9)(p0)).a__Int(((float)(p3)));
    local12 = (local11 % __sourceIntrinsic_b2b46ea1df15_invokedynamic8507_30(23650, (5502911190765796245L ^ local9)));
    local13 = (local11 / __sourceIntrinsic_b2b46ea1df15_invokedynamic8507_31(23650, (5502911190765796245L ^ local9)));
    net.minecraft.client.renderer.OpenGlHelper.a(((int)(net.minecraft.client.renderer.OpenGlHelper.r)), ((float)(((float) local12))), ((float)(((float) local13))));
    ((moom.nk)(this.b)).a__sourceReturn_cba3585c6d(((net.minecraft.entity.EntityLiving)(p0)), ((float)(p3)));
    moom.kZ.k();
    moom.kZ.d__Void();
    return;
}


public void a__sourceBridge_a569c1ca8a(net.minecraft.entity.EntityLivingBase p0, float p1, float p2, float p3, float p4, float p5, float p6, float p7) {
((moom.nZ)(this)).a(((moom.s9)(((moom.s9)(p0)))), ((float)(p1)), ((float)(p2)), ((float)(p3)), ((float)(p4)), ((float)(p5)), ((float)(p6)), ((float)(p7)));
}


public boolean a__Boolean() {
return ((0) != 0);
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral8506_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b2b46ea1df15_invokedynamic8507_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b2b46ea1df15_invokedynamic8507_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b2b46ea1df15_invokedynamic8507_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b2b46ea1df15_invokedynamic8507_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b2b46ea1df15_invokedynamic8507_31(int a0, long a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);


}
