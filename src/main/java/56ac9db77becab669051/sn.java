package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class sn extends net.minecraft.client.particle.EntityFX {

private static moom.DD aV;

private static moom.oD aW;

private int aX;

private int aY;

private net.minecraft.client.renderer.texture.TextureManager aZ;

private float a0;

private static long bb;

private static long[] hb;

private static java.lang.Integer[] ib;

private static java.util.Map jb;

protected sn(net.minecraft.client.renderer.texture.TextureManager p0, net.minecraft.world.World p1, double p2, double p3, double p4, double p5, double p6, double p7) { super((net.minecraft.world.World)null, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D); }


private static void __sourceConstructorBody_d095e1e301a687c9(moom.sn receiver, net.minecraft.client.renderer.texture.TextureManager p0, net.minecraft.world.World p1, double p2, double p3, double p4, double p5, double p6, double p7) throws Throwable {

moom.sn spill502_0;

    moom.sn spill502_1;

    float spill502_2;

    float spill502_3;

    long life15_3;

    life15_3 = (moom.sn.bb ^ 7386649389811L);

    moom.sn.__sourceConstructorInit_d095e1e301a687c9_0(((moom.sn)(receiver)), ((net.minecraft.world.World)(p1)), ((double)(p2)), ((double)(p3)), ((double)(p4)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)));

    ((moom.sn)(receiver)).aZ = ((net.minecraft.client.renderer.texture.TextureManager)(p0));

    ((moom.sn)(receiver)).aY = ((int)((__sourceIntrinsic_d095e1e301a687c9_invokedynamic502_3(4992, (3401430204441698158L ^ life15_3)) + ((java.util.Random)(((moom.sn)(receiver)).ah)).nextInt(((int)(4))))));

    spill502_0 = receiver;

    spill502_1 = receiver;

    moom.sn __stackOp502_9_0 = receiver;

    float __stackOp502_9_1 = ((((java.util.Random)(((moom.sn)(receiver)).ah)).nextFloat() * 0x1.333334p-1f) + 0x1.99999ap-2f);

    spill502_2 = __stackOp502_9_1;

    ((moom.sn)(__stackOp502_9_0)).aO = ((float)(__stackOp502_9_1));

    moom.sn __stackOp502_11_0 = spill502_1;

    float __stackOp502_11_1 = spill502_2;

    spill502_3 = __stackOp502_11_1;

    ((moom.sn)(__stackOp502_11_0)).aN = ((float)(__stackOp502_11_1));

    ((moom.sn)(spill502_0)).aM = ((float)(spill502_3));

    ((moom.sn)(receiver)).a0 = ((float)((0x1.0p0f - (((float) p5) * 0x1.0p-1f))));

    return;

}



static {
bb = ((long)(((moom._a)(moom._c.a(((long)(-7220450722272877362L)), ((long)(-7079671751799336811L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(50921747690397L)))));
    jb = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.sn.bb ^ 117736251443767L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1539_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1539_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1539_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1539_14 = new byte[8];
    (__sourceSpill1539_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1539_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1539_16 = __sourceSpill1539_14;
    ((javax.crypto.Cipher)(__sourceSpill1539_11)).init(((int)(__sourceSpill1539_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1539_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1539_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[6];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "±*uÝÓü\nÈÃéÝð¨ôår7k@ÁQÈd\025D"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1539_25 = local6_life21;
        int __sourceSpill1539_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1539_25)).substring(((int)(__sourceSpill1539_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1539_30 = local8_life19;
        int __sourceSpill1539_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1539_33 = new byte[8];
        (__sourceSpill1539_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1539_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1539_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1539_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1539_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1539_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1539_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1539_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1539_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1539_34)).doFinal(((byte[])(__sourceSpill1539_33)));
        (__sourceSpill1539_30)[__sourceSpill1539_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "ùéWêªoV/b1o¶3v¢Ù"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1539_38 = local6_life21;
        int __sourceSpill1539_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1539_38)).substring(((int)(__sourceSpill1539_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1539_43 = local8_life19;
        int __sourceSpill1539_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1539_46 = new byte[8];
        (__sourceSpill1539_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1539_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1539_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1539_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1539_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1539_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1539_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1539_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1539_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1539_47)).doFinal(((byte[])(__sourceSpill1539_46)));
        (__sourceSpill1539_43)[__sourceSpill1539_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    hb = ((long[])(local8_life19));
    ib = ((java.lang.Integer[])(new java.lang.Integer[6]));
    aV = ((moom.DD)(new moom.DD("textures/entity/explosion.png")));
    aW = ((moom.oD)(((moom.oD)(((moom.oD)(((moom.oD)(((moom.oD)(((moom.oD)(((moom.oD)(new moom.oD())).a(((moom.oF)(moom.oB.o))))).a(((moom.oF)(moom.oB.q))))).a(((moom.oF)(moom.oB.p))))).a(((moom.oF)(moom.oB.r))))).a(((moom.oF)(moom.oB.s))))).a(((moom.oF)(moom.oB.t)))));
}

private static native <E extends Throwable> void __sourceConstructorInit_d095e1e301a687c9_0(moom.sn a0, net.minecraft.world.World a1, double a2, double a3, double a4, double a5, double a6, double a7) throws E;

private static int c(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 19083;
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
            throw new RuntimeException("moom/sn", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         ib[var3] = var15;
      }

      return ib[var3];
}


private static int c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.sn.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral9079_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/sn"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public int a__Int(float p0) {
long local2 = (moom.sn.bb ^ 111844435023552L);
    return __sourceIntrinsic_dbecb07edf7c_originalDynamicSite1643_1(9608, (6505653811798054224L ^ local2));
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(moom.lw p0, net.minecraft.entity.Entity p1, float p2, float p3, float p4, float p5, float p6, float p7) {
long life9_3;
    int life11_16;
    float life12_34;
    float life13_38;
    float life14_45;
    float life15_49;
    float life16_54;
    float life17_69;
    float life18_84;
    float life19_99;
    life9_3 = (moom.sn.bb ^ 38499427336978L);
    life11_16 = ((int) (((((float) this.aX) + p2) * 0x1.ep3f) / ((float) this.aY)));
    if ((life11_16 <= __sourceIntrinsic_54c23c7634ff_invokedynamic7375_3(24439, (8621896594094946939L ^ life9_3)))) {
        ((net.minecraft.client.renderer.texture.TextureManager)(this.aZ)).a__Void(((moom.DD)(moom.sn.aV)));
        life12_34 = (((float) (life11_16 % 4)) / 0x1.0p2f);
        life13_38 = (life12_34 + 0x1.ff7ceep-3f);
        life14_45 = (((float) (life11_16 / 4)) / 0x1.0p2f);
        life15_49 = (life14_45 + 0x1.ff7ceep-3f);
        life16_54 = (0x1.0p1f * this.a0);
        life17_69 = ((float) ((this.k + ((this.n - this.k) * ((double) p2))) - moom.sn.aR));
        life18_84 = ((float) ((this.l + ((this.o - this.l) * ((double) p2))) - moom.sn.aS));
        life19_99 = ((float) ((this.m + ((this.p - this.m) * ((double) p2))) - moom.sn.aT));
        moom.kZ.c(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
        moom.kZ.f();
        moom.lt.a();
        ((moom.lw)(p0)).a(((int)(__sourceIntrinsic_54c23c7634ff_invokedynamic7375_23(13987, (7918199064658351016L ^ life9_3)))), ((moom.oD)(moom.sn.aW)));
        ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(p0)).a(((double)(((double) ((life17_69 - (p3 * life16_54)) - (p6 * life16_54))))), ((double)(((double) (life18_84 - (p4 * life16_54))))), ((double)(((double) ((life19_99 - (p5 * life16_54)) - (p7 * life16_54)))))))).a(((double)(((double) life13_38))), ((double)(((double) life15_49)))))).a(((float)(this.aM)), ((float)(this.aN)), ((float)(this.aO)), ((float)(0x1.0p0f))))).a(((int)(0)), ((int)(__sourceIntrinsic_54c23c7634ff_invokedynamic7375_32(17843, (5748932806553526462L ^ life9_3))))))).a(((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f))))).c__Void();
        ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(p0)).a(((double)(((double) ((life17_69 - (p3 * life16_54)) + (p6 * life16_54))))), ((double)(((double) (life18_84 + (p4 * life16_54))))), ((double)(((double) ((life19_99 - (p5 * life16_54)) + (p7 * life16_54)))))))).a(((double)(((double) life13_38))), ((double)(((double) life14_45)))))).a(((float)(this.aM)), ((float)(this.aN)), ((float)(this.aO)), ((float)(0x1.0p0f))))).a(((int)(0)), ((int)(__sourceIntrinsic_54c23c7634ff_invokedynamic7375_42(29077, (5261320558158566555L ^ life9_3))))))).a(((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f))))).c__Void();
        ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(p0)).a(((double)(((double) ((life17_69 + (p3 * life16_54)) + (p6 * life16_54))))), ((double)(((double) (life18_84 + (p4 * life16_54))))), ((double)(((double) ((life19_99 + (p5 * life16_54)) + (p7 * life16_54)))))))).a(((double)(((double) life12_34))), ((double)(((double) life14_45)))))).a(((float)(this.aM)), ((float)(this.aN)), ((float)(this.aO)), ((float)(0x1.0p0f))))).a(((int)(0)), ((int)(__sourceIntrinsic_54c23c7634ff_invokedynamic7375_52(29077, (5261320558158566555L ^ life9_3))))))).a(((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f))))).c__Void();
        ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(p0)).a(((double)(((double) ((life17_69 + (p3 * life16_54)) - (p6 * life16_54))))), ((double)(((double) (life18_84 - (p4 * life16_54))))), ((double)(((double) ((life19_99 + (p5 * life16_54)) - (p7 * life16_54)))))))).a(((double)(((double) life12_34))), ((double)(((double) life15_49)))))).a(((float)(this.aM)), ((float)(this.aN)), ((float)(this.aO)), ((float)(0x1.0p0f))))).a(((int)(0)), ((int)(__sourceIntrinsic_54c23c7634ff_invokedynamic7375_62(29077, (5261320558158566555L ^ life9_3))))))).a(((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f))))).c__Void();
        ((net.minecraft.client.renderer.Tessellator)(net.minecraft.client.renderer.Tessellator.a())).a__Void();
        moom.kZ.e();
    }
    return;
}


public int a__Int() {
return 3;
}


public void g__Void() {
this.k = ((double)(this.n));
    this.l = ((double)(this.o));
    this.m = ((double)(this.p));
    moom.sn __stackOp4003_6_0 = this;
    ((moom.sn)(__stackOp4003_6_0)).aX = ((int)((((moom.sn)(__stackOp4003_6_0)).aX + 1)));
    if ((this.aX == this.aY)) {
        ((moom.sn)(this)).f__Void();
    }
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_d095e1e301a687c9_invokedynamic502_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_54c23c7634ff_invokedynamic7375_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_54c23c7634ff_invokedynamic7375_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_54c23c7634ff_invokedynamic7375_32(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_54c23c7634ff_invokedynamic7375_42(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_54c23c7634ff_invokedynamic7375_52(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_54c23c7634ff_invokedynamic7375_62(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_dbecb07edf7c_originalDynamicSite1643_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral9079_0() throws E;
}
