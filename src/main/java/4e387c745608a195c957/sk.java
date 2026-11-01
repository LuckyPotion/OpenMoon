package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class sk extends net.minecraft.client.particle.EntityFX {

private static moom.DD aV;

private int aW;

private int aX;

private net.minecraft.client.renderer.texture.TextureManager aY;

private static long bb;

private static long[] hb;

private static java.lang.Integer[] ib;

private static java.util.Map jb;

protected sk(net.minecraft.client.renderer.texture.TextureManager p0, net.minecraft.world.World p1, double p2, double p3, double p4) { super((net.minecraft.world.World)null, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D); }


private static void __sourceConstructorBody_921a6760b40d822f(moom.sk receiver, net.minecraft.client.renderer.texture.TextureManager p0, net.minecraft.world.World p1, double p2, double p3, double p4) throws Throwable {

moom.sk spill501_0;

    moom.sk spill501_1;

    double spill501_2;

    double spill501_3;

    long life9_3;

    life9_3 = (moom.sk.bb ^ 32535797007608L);

    moom.sk.__sourceConstructorInit_921a6760b40d822f_0(((moom.sk)(receiver)), ((net.minecraft.world.World)(p1)), ((double)(p2)), ((double)(p3)), ((double)(p4)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)));

    ((moom.sk)(receiver)).aY = ((net.minecraft.client.renderer.texture.TextureManager)(p0));

    spill501_0 = receiver;

    spill501_1 = receiver;

    moom.sk __stackOp501_3_0 = receiver;

    double __stackOp501_3_1 = 0x0.0p0d;

    spill501_2 = __stackOp501_3_1;

    ((moom.sk)(__stackOp501_3_0)).v = ((double)(__stackOp501_3_1));

    moom.sk __stackOp501_5_0 = spill501_1;

    double __stackOp501_5_1 = spill501_2;

    spill501_3 = __stackOp501_5_1;

    ((moom.sk)(__stackOp501_5_0)).u = ((double)(__stackOp501_5_1));

    ((moom.sk)(spill501_0)).t = ((double)(spill501_3));

    ((moom.sk)(receiver)).aX = ((int)(__sourceIntrinsic_921a6760b40d822f_invokedynamic501_8(23357, (5275204967005149037L ^ life9_3))));

    return;

}



static {
bb = ((long)(((moom._a)(moom._c.a(((long)(4438632321574595177L)), ((long)(-1052290134223306244L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(273207404640395L)))));
    jb = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.sk.bb ^ 100679634274116L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1536_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1536_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1536_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1536_14 = new byte[8];
    (__sourceSpill1536_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1536_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1536_16 = __sourceSpill1536_14;
    ((javax.crypto.Cipher)(__sourceSpill1536_11)).init(((int)(__sourceSpill1536_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1536_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1536_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[4];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "\fw|[ÒS´}x¥ÇÎì]"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1536_25 = local6_life21;
        int __sourceSpill1536_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1536_25)).substring(((int)(__sourceSpill1536_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1536_30 = local8_life19;
        int __sourceSpill1536_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1536_33 = new byte[8];
        (__sourceSpill1536_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1536_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1536_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1536_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1536_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1536_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1536_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1536_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1536_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1536_34)).doFinal(((byte[])(__sourceSpill1536_33)));
        (__sourceSpill1536_30)[__sourceSpill1536_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "ñ¡>U\fÜÙ¥3þÀ Z¸"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1536_38 = local6_life21;
        int __sourceSpill1536_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1536_38)).substring(((int)(__sourceSpill1536_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1536_43 = local8_life19;
        int __sourceSpill1536_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1536_46 = new byte[8];
        (__sourceSpill1536_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1536_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1536_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1536_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1536_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1536_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1536_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1536_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1536_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1536_47)).doFinal(((byte[])(__sourceSpill1536_46)));
        (__sourceSpill1536_43)[__sourceSpill1536_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    hb = ((long[])(local8_life19));
    ib = ((java.lang.Integer[])(new java.lang.Integer[4]));
    aV = ((moom.DD)(new moom.DD("textures/particle/footprint.png")));
}

private static native <E extends Throwable> void __sourceConstructorInit_921a6760b40d822f_0(moom.sk a0, net.minecraft.world.World a1, double a2, double a3, double a4, double a5, double a6, double a7) throws E;

public boolean b__Boolean() {
return ((0) != 0);
}


private static int c(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 509;
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
            throw new RuntimeException("moom/sk", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         ib[var3] = var15;
      }

      return ib[var3];
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral9072_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/sk"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.sk.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(moom.lw p0, net.minecraft.entity.Entity p1, float p2, float p3, float p4, float p5, float p6, float p7) {
long local9 = (moom.sk.bb ^ 91180021901011L);
    float local11 = ((((float) this.aW) + p2) / ((float) this.aX));
    local11 = (local11 * local11);
    float local12 = (0x1.0p1f - (local11 * 0x1.0p1f));
    if ((local12 > 0x1.0p0f)) {
        local12 = 0x1.0p0f;
    }
    local12 = (local12 * 0x1.99999ap-3f);
    int spill7446_0 = 18845;
    moom.kZ.f();
    long spill7446_1 = (7815734261957306343L ^ local9);
    float local13 = 0x1.0p-3f;
    float local14 = ((float) (this.n - moom.sk.aR));
    float local15 = ((float) (this.o - moom.sk.aS));
    float local16 = ((float) (this.p - moom.sk.aT));
    float local17 = ((net.minecraft.world.World)(this.i)).a(((moom.DT)(new moom.DT(this))));
    ((net.minecraft.client.renderer.texture.TextureManager)(this.aY)).a__Void(((moom.DD)(moom.sk.aV)));
    moom.kZ.l();
    moom.kZ.b(((int)(__sourceIntrinsic_54c23c7634ff_invokedynamic7446_16(spill7446_0, spill7446_1))), ((int)(__sourceIntrinsic_54c23c7634ff_invokedynamic7446_17(18863, (4779536364102199254L ^ local9)))));
    ((moom.lw)(p0)).a(((int)(__sourceIntrinsic_54c23c7634ff_invokedynamic7446_19(2646, (2668433614330651694L ^ local9)))), ((moom.oD)(moom.oB.k)));
    ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(p0)).a(((double)(((double) (local14 - 0x1.0p-3f)))), ((double)(((double) local15))), ((double)(((double) (local16 + 0x1.0p-3f))))))).a(((double)(0x0.0p0d)), ((double)(0x1.0p0d))))).a(((float)(local17)), ((float)(local17)), ((float)(local17)), ((float)(local12))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(p0)).a(((double)(((double) (local14 + 0x1.0p-3f)))), ((double)(((double) local15))), ((double)(((double) (local16 + 0x1.0p-3f))))))).a(((double)(0x1.0p0d)), ((double)(0x1.0p0d))))).a(((float)(local17)), ((float)(local17)), ((float)(local17)), ((float)(local12))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(p0)).a(((double)(((double) (local14 + 0x1.0p-3f)))), ((double)(((double) local15))), ((double)(((double) (local16 - 0x1.0p-3f))))))).a(((double)(0x1.0p0d)), ((double)(0x0.0p0d))))).a(((float)(local17)), ((float)(local17)), ((float)(local17)), ((float)(local12))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(p0)).a(((double)(((double) (local14 - 0x1.0p-3f)))), ((double)(((double) local15))), ((double)(((double) (local16 - 0x1.0p-3f))))))).a(((double)(0x0.0p0d)), ((double)(0x0.0p0d))))).a(((float)(local17)), ((float)(local17)), ((float)(local17)), ((float)(local12))))).c__Void();
    ((net.minecraft.client.renderer.Tessellator)(net.minecraft.client.renderer.Tessellator.a())).a__Void();
    moom.kZ.k();
    moom.kZ.e();
    return;
}


public int a__Int() {
return 3;
}


public void g__Void() {
moom.sk __stackOp4000_0_0 = this;
    ((moom.sk)(__stackOp4000_0_0)).aW = ((int)((((moom.sk)(__stackOp4000_0_0)).aW + 1)));
    if ((this.aW == this.aX)) {
        ((moom.sk)(this)).f__Void();
    }
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_921a6760b40d822f_invokedynamic501_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_54c23c7634ff_invokedynamic7446_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_54c23c7634ff_invokedynamic7446_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_54c23c7634ff_invokedynamic7446_19(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral9072_0() throws E;
}
