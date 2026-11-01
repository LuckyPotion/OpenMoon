package net.minecraft.client.particle;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class EntityFX extends net.minecraft.entity.Entity {

protected int aE;

protected int aF;

protected float aG;

protected float aH;

protected int aI;

protected int aJ;

protected float aK;

protected float aL;

protected float aM;

protected float aN;

protected float aO;

protected float aP;

protected net.minecraft.client.renderer.texture.TextureAtlasSprite aQ;

public static double aR;

public static double aS;

public static double aT;

private static net.minecraft.entity.Entity[] aU;

private static long cb;

private static long[] db;

private static java.lang.Integer[] eb;

private static java.util.Map gb;

protected EntityFX(net.minecraft.world.World p0, double p1, double p2, double p3) { super((net.minecraft.world.World)null); }


private static void __sourceConstructorBody_0f47084f3b36c024(net.minecraft.client.particle.EntityFX receiver, net.minecraft.world.World p0, double p1, double p2, double p3) throws Throwable {

net.minecraft.client.particle.EntityFX spill536_0;

    double spill536_1;

    net.minecraft.client.particle.EntityFX spill536_2;

    double spill536_3;

    net.minecraft.client.particle.EntityFX spill536_4;

    double spill536_5;

    net.minecraft.client.particle.EntityFX spill536_6;

    net.minecraft.client.particle.EntityFX spill536_7;

    float spill536_8;

    float spill536_9;

    net.minecraft.client.particle.EntityFX.__sourceConstructorInit_0f47084f3b36c024_0(((net.minecraft.client.particle.EntityFX)(receiver)), ((net.minecraft.world.World)(p0)));

    ((net.minecraft.client.particle.EntityFX)(receiver)).aP = ((float)(0x1.0p0f));

    ((net.minecraft.client.particle.EntityFX)(receiver)).a__Void(((float)(0x1.99999ap-3f)), ((float)(0x1.99999ap-3f)));

    ((net.minecraft.client.particle.EntityFX)(receiver)).a__Void(((double)(p1)), ((double)(p2)), ((double)(p3)));

    spill536_0 = receiver;

    net.minecraft.client.particle.EntityFX __stackOp536_4_0 = receiver;

    double __stackOp536_4_1 = p1;

    spill536_1 = __stackOp536_4_1;

    ((net.minecraft.client.particle.EntityFX)(__stackOp536_4_0)).k = ((double)(__stackOp536_4_1));

    ((net.minecraft.client.particle.EntityFX)(spill536_0)).M = ((double)(spill536_1));

    spill536_2 = receiver;

    net.minecraft.client.particle.EntityFX __stackOp536_7_0 = receiver;

    double __stackOp536_7_1 = p2;

    spill536_3 = __stackOp536_7_1;

    ((net.minecraft.client.particle.EntityFX)(__stackOp536_7_0)).l = ((double)(__stackOp536_7_1));

    ((net.minecraft.client.particle.EntityFX)(spill536_2)).N = ((double)(spill536_3));

    spill536_4 = receiver;

    net.minecraft.client.particle.EntityFX __stackOp536_10_0 = receiver;

    double __stackOp536_10_1 = p3;

    spill536_5 = __stackOp536_10_1;

    ((net.minecraft.client.particle.EntityFX)(__stackOp536_10_0)).m = ((double)(__stackOp536_10_1));

    ((net.minecraft.client.particle.EntityFX)(spill536_4)).O = ((double)(spill536_5));

    spill536_6 = receiver;

    spill536_7 = receiver;

    net.minecraft.client.particle.EntityFX __stackOp536_13_0 = receiver;

    float __stackOp536_13_1 = 0x1.0p0f;

    spill536_8 = __stackOp536_13_1;

    ((net.minecraft.client.particle.EntityFX)(__stackOp536_13_0)).aO = ((float)(__stackOp536_13_1));

    net.minecraft.client.particle.EntityFX __stackOp536_15_0 = spill536_7;

    float __stackOp536_15_1 = spill536_8;

    spill536_9 = __stackOp536_15_1;

    ((net.minecraft.client.particle.EntityFX)(__stackOp536_15_0)).aN = ((float)(__stackOp536_15_1));

    ((net.minecraft.client.particle.EntityFX)(spill536_6)).aM = ((float)(spill536_9));

    ((net.minecraft.client.particle.EntityFX)(receiver)).aG = ((float)((((java.util.Random)(((net.minecraft.client.particle.EntityFX)(receiver)).ah)).nextFloat() * 0x1.8p1f)));

    ((net.minecraft.client.particle.EntityFX)(receiver)).aH = ((float)((((java.util.Random)(((net.minecraft.client.particle.EntityFX)(receiver)).ah)).nextFloat() * 0x1.8p1f)));

    ((net.minecraft.client.particle.EntityFX)(receiver)).aK = ((float)((((((java.util.Random)(((net.minecraft.client.particle.EntityFX)(receiver)).ah)).nextFloat() * 0x1.0p-1f) + 0x1.0p-1f) * 0x1.0p1f)));

    ((net.minecraft.client.particle.EntityFX)(receiver)).aJ = ((int)(((int) (0x1.0p2f / ((((java.util.Random)(((net.minecraft.client.particle.EntityFX)(receiver)).ah)).nextFloat() * 0x1.ccccccp-1f) + 0x1.99999ap-4f)))));

    ((net.minecraft.client.particle.EntityFX)(receiver)).aI = ((int)(0));

    return;

}



public EntityFX(net.minecraft.world.World p0, double p1, double p2, double p3, double p4, double p5, double p6) {
this(((net.minecraft.world.World)(p0)), ((double)(p1)), ((double)(p2)), ((double)(p3)));
    this.t = ((double)((p4 + (((java.lang.Math.random() * 0x1.0p1d) - 0x1.0p0d) * 0x1.99999ap-2d))));
    this.u = ((double)((p5 + (((java.lang.Math.random() * 0x1.0p1d) - 0x1.0p0d) * 0x1.99999ap-2d))));
    this.v = ((double)((p6 + (((java.lang.Math.random() * 0x1.0p1d) - 0x1.0p0d) * 0x1.99999ap-2d))));
    float local14_life9 = (((float) ((java.lang.Math.random() + java.lang.Math.random()) + 0x1.0p0d)) * 0x1.333334p-3f);
    float local15_life17 = moom.Dr.a__Float(((double)((((this.t * this.t) + (this.u * this.u)) + (this.v * this.v)))));
    this.t = ((double)((((this.t / ((double) local15_life17)) * ((double) local14_life9)) * 0x1.99999ap-2d)));
    this.u = ((double)(((((this.u / ((double) local15_life17)) * ((double) local14_life9)) * 0x1.99999ap-2d) + 0x1.99999ap-4d)));
    this.v = ((double)((((this.v / ((double) local15_life17)) * ((double) local14_life9)) * 0x1.99999ap-2d)));
    return;
}


static {
cb = ((long)(((moom._a)(moom._c.a(((long)(1286639189433108974L)), ((long)(9020737268677170140L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(24727793437262L)))));
    gb = ((java.util.Map)(new java.util.HashMap(13)));
    java.lang.Object __sourceSpill1800_7 = null;
    long local0_life8 = (net.minecraft.client.particle.EntityFX.cb ^ 72285530439450L);
    net.minecraft.client.particle.EntityFX.b(((net.minecraft.entity.Entity[])(__sourceSpill1800_7)));
    javax.crypto.Cipher local2_life11;
    javax.crypto.Cipher __sourceSpill1800_13 = (local2_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1800_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1800_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1800_16 = new byte[8];
    (__sourceSpill1800_16)[0] = ((byte) ((int) (local0_life8 >>> 56)));
    int local3_life17 = 1;
    while ((local3_life17 < 8)) {
        (__sourceSpill1800_16)[local3_life17] = ((byte) ((int) ((local0_life8 << (local3_life17 * 8)) >>> 56)));
        local3_life17 += 1;
    }
    byte[] __sourcePreallocation1800_18 = __sourceSpill1800_16;
    ((javax.crypto.Cipher)(__sourceSpill1800_13)).init(((int)(__sourceSpill1800_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1800_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1800_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life21 = new long[5];
    int local5_life22 = 0;
    java.lang.String local6_life23;
    int local7_life25 = ((java.lang.String)((local6_life23 = "ÀºÎ¤*\005Ù¨\013CäÁÑfÇ~S_ò\b"))).length();
    int local4_life26 = 0;
    do {
        java.lang.String __sourceSpill1800_27 = local6_life23;
        int __sourceSpill1800_28 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life31 = ((java.lang.String)(((java.lang.String)(__sourceSpill1800_27)).substring(((int)(__sourceSpill1800_28)), ((int)(local4_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1800_32 = local8_life21;
        int __sourceSpill1800_33 = local5_life22;
        local5_life22 += 1;
        long local10_life34 = (((((((((((long) (local9_life31)[0]) & 255L) << 56) | ((((long) (local9_life31)[1]) & 255L) << 48)) | ((((long) (local9_life31)[2]) & 255L) << 40)) | ((((long) (local9_life31)[3]) & 255L) << 32)) | ((((long) (local9_life31)[4]) & 255L) << 24)) | ((((long) (local9_life31)[5]) & 255L) << 16)) | ((((long) (local9_life31)[6]) & 255L) << 8)) | (((long) (local9_life31)[7]) & 255L));
        byte[] __sourceSpill1800_35 = new byte[8];
        (__sourceSpill1800_35)[0] = ((byte) ((int) (local10_life34 >>> 56)));
        (__sourceSpill1800_35)[1] = ((byte) ((int) (local10_life34 >>> 48)));
        (__sourceSpill1800_35)[2] = ((byte) ((int) (local10_life34 >>> 40)));
        (__sourceSpill1800_35)[3] = ((byte) ((int) (local10_life34 >>> 32)));
        (__sourceSpill1800_35)[4] = ((byte) ((int) (local10_life34 >>> 24)));
        (__sourceSpill1800_35)[5] = ((byte) ((int) (local10_life34 >>> 16)));
        (__sourceSpill1800_35)[6] = ((byte) ((int) (local10_life34 >>> 8)));
        (__sourceSpill1800_35)[7] = ((byte) ((int) local10_life34));
        javax.crypto.Cipher __sourceSpill1800_36 = local2_life11;
        byte[] local12_life38 = ((javax.crypto.Cipher)(__sourceSpill1800_36)).doFinal(((byte[])(__sourceSpill1800_35)));
        (__sourceSpill1800_32)[__sourceSpill1800_33] = (((((((((((long) (local12_life38)[0]) & 255L) << 56) | ((((long) (local12_life38)[1]) & 255L) << 48)) | ((((long) (local12_life38)[2]) & 255L) << 40)) | ((((long) (local12_life38)[3]) & 255L) << 32)) | ((((long) (local12_life38)[4]) & 255L) << 24)) | ((((long) (local12_life38)[5]) & 255L) << 16)) | ((((long) (local12_life38)[6]) & 255L) << 8)) | (((long) (local12_life38)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    local7_life25 = ((java.lang.String)((local6_life23 = "ÛajàyÞ\001WÓLH)ëäâ"))).length();
    local4_life26 = 0;
    do {
        java.lang.String __sourceSpill1800_40 = local6_life23;
        int __sourceSpill1800_41 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life44 = ((java.lang.String)(((java.lang.String)(__sourceSpill1800_40)).substring(((int)(__sourceSpill1800_41)), ((int)(local4_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1800_45 = local8_life21;
        int __sourceSpill1800_46 = local5_life22;
        local5_life22 += 1;
        long local10_life47 = (((((((((((long) (local9_life44)[0]) & 255L) << 56) | ((((long) (local9_life44)[1]) & 255L) << 48)) | ((((long) (local9_life44)[2]) & 255L) << 40)) | ((((long) (local9_life44)[3]) & 255L) << 32)) | ((((long) (local9_life44)[4]) & 255L) << 24)) | ((((long) (local9_life44)[5]) & 255L) << 16)) | ((((long) (local9_life44)[6]) & 255L) << 8)) | (((long) (local9_life44)[7]) & 255L));
        byte[] __sourceSpill1800_48 = new byte[8];
        (__sourceSpill1800_48)[0] = ((byte) ((int) (local10_life47 >>> 56)));
        (__sourceSpill1800_48)[1] = ((byte) ((int) (local10_life47 >>> 48)));
        (__sourceSpill1800_48)[2] = ((byte) ((int) (local10_life47 >>> 40)));
        (__sourceSpill1800_48)[3] = ((byte) ((int) (local10_life47 >>> 32)));
        (__sourceSpill1800_48)[4] = ((byte) ((int) (local10_life47 >>> 24)));
        (__sourceSpill1800_48)[5] = ((byte) ((int) (local10_life47 >>> 16)));
        (__sourceSpill1800_48)[6] = ((byte) ((int) (local10_life47 >>> 8)));
        (__sourceSpill1800_48)[7] = ((byte) ((int) local10_life47));
        javax.crypto.Cipher __sourceSpill1800_49 = local2_life11;
        byte[] local12_life51 = ((javax.crypto.Cipher)(__sourceSpill1800_49)).doFinal(((byte[])(__sourceSpill1800_48)));
        (__sourceSpill1800_45)[__sourceSpill1800_46] = (((((((((((long) (local12_life51)[0]) & 255L) << 56) | ((((long) (local12_life51)[1]) & 255L) << 48)) | ((((long) (local12_life51)[2]) & 255L) << 40)) | ((((long) (local12_life51)[3]) & 255L) << 32)) | ((((long) (local12_life51)[4]) & 255L) << 24)) | ((((long) (local12_life51)[5]) & 255L) << 16)) | ((((long) (local12_life51)[6]) & 255L) << 8)) | (((long) (local12_life51)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    db = ((long[])(local8_life21));
    eb = ((java.lang.Integer[])(new java.lang.Integer[5]));
}

private static native <E extends Throwable> void __sourceConstructorInit_0f47084f3b36c024_0(net.minecraft.client.particle.EntityFX a0, net.minecraft.world.World a1) throws E;

public java.lang.String toString() {
return __sourceIntrinsic_a86c261fcdee_originalDynamicSite1814_10(((java.lang.Class)(((java.lang.Object)(this)).getClass())).getSimpleName(), this.n, this.o, this.p, this.aM, this.aN, this.aO, this.aP, this.aI);
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral10524_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/r4"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public boolean b__Boolean() {
return ((1) != 0);
}


public static void b(net.minecraft.entity.Entity[] p0) {
aU = ((net.minecraft.entity.Entity[])(p0));
    return;
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.client.particle.EntityFX.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 32223;
      if (eb[var3] == null) {
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
         long var5 = db[var3];
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
         Object[] var9 = (Object[])gb.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               gb.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/r4", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         eb[var3] = var15;
      }

      return eb[var3];
}


public void b(float p0, float p1, float p2) {
this.aM = ((float)(p0));
    this.aN = ((float)(p1));
    this.aO = ((float)(p2));
    return;
}


public net.minecraft.client.particle.EntityFX b__sourceReturn_89111cbc68(float p0) {
((net.minecraft.client.particle.EntityFX)(this)).a__Void(((float)((0x1.99999ap-3f * p0))), ((float)((0x1.99999ap-3f * p0))));
    this.aK *= p0;
    return this;
}


public float b__sourceReturn_bc607678b6() {
return this.aN;
}


public boolean x__Boolean() {
return ((0) != 0);
}


public void c(net.minecraft.nbt.NBTTagCompound p0) {
return;
}


public static net.minecraft.entity.Entity[] c__sourceReturn_95e22b2e1a() {
return net.minecraft.client.particle.EntityFX.aU;
}


public void c(float p0) {
forward_join_27: {
    forward_join_14: {
    if (!((recovery.source.CarrierOps.fcmpl(((float)(this.aP)), ((float)(0x1.0p0f))) == 0))) { break forward_join_14; }
    if (!((recovery.source.CarrierOps.fcmpg(((float)(p0)), ((float)(0x1.0p0f))) < 0))) { break forward_join_14; }
    ((net.minecraft.client.particle.EffectRenderer)(((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).M)).c(((net.minecraft.client.particle.EntityFX)(this)));
    break forward_join_27;
    }
    if (!((recovery.source.CarrierOps.fcmpg(((float)(this.aP)), ((float)(0x1.0p0f))) < 0))) { break forward_join_27; }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(p0)), ((float)(0x1.0p0f))) == 0))) { break forward_join_27; }
    ((net.minecraft.client.particle.EffectRenderer)(((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).M)).d(((net.minecraft.client.particle.EntityFX)(this)));
    }
    this.aP = ((float)(p0));
    return;
}


public float f__sourceReturn_bc607678b6() {
return this.aO;
}


public void d(net.minecraft.nbt.NBTTagCompound p0) {
return;
}


protected void d__Void() {
return;
}


private static java.lang.RuntimeException a(java.lang.RuntimeException p0) {
return p0;
}


public net.minecraft.client.particle.EntityFX a__sourceReturn_89111cbc68(float p0) {
this.t *= ((double) p0);
    this.u = ((double)((((this.u - 0x1.99999ap-4d) * ((double) p0)) + 0x1.99999ap-4d)));
    this.v *= ((double) p0);
    return this;
}


public float a() {
return this.aM;
}


public void a(moom.lw p0, net.minecraft.entity.Entity p1, float p2, float p3, float p4, float p5, float p6, float p7) {
long local9 = (net.minecraft.client.particle.EntityFX.cb ^ 134825858683001L);
    float local11 = (((float) this.aE) / 0x1.0p4f);
    float local12 = (local11 + 0x1.ff7ceep-5f);
    float local13 = (((float) this.aF) / 0x1.0p4f);
    float local14 = (local13 + 0x1.ff7ceep-5f);
    float local15 = (0x1.99999ap-4f * this.aK);
    if ((this.aQ != null)) {
        local11 = ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(this.aQ)).a();
        local12 = ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(this.aQ)).b();
        local13 = ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(this.aQ)).c();
        local14 = ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(this.aQ)).d();
    }
    float local16 = ((float) ((this.k + ((this.n - this.k) * ((double) p2))) - net.minecraft.client.particle.EntityFX.aR));
    float local17 = ((float) ((this.l + ((this.o - this.l) * ((double) p2))) - net.minecraft.client.particle.EntityFX.aS));
    float local18 = ((float) ((this.m + ((this.p - this.m) * ((double) p2))) - net.minecraft.client.particle.EntityFX.aT));
    if ((net.minecraft.client.particle.EntityFX.aB == null)) {
        aB = ((com.moon.module.impl.Camera)(((com.moon.module.impl.Camera)(((com.moon.fU)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__fU())).a(((java.lang.Class)(com.moon.module.impl.Camera.class)))))));
    }
    int local19 = (((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.Camera)(net.minecraft.client.particle.EntityFX.aB)).y)).getValue())))).booleanValue() ? __sourceIntrinsic_54c23c7634ff_invokedynamic8777_37(1072, (1656496491003418219L ^ local9)) : ((net.minecraft.client.particle.EntityFX)(this)).a__Int(((float)(p2))));
    int local20 = ((local19 >> __sourceIntrinsic_54c23c7634ff_invokedynamic8777_39(9889, (3723859394814522617L ^ local9))) & __sourceIntrinsic_54c23c7634ff_invokedynamic8777_40(28532, (3543723535837887790L ^ local9)));
    int local21 = (local19 & __sourceIntrinsic_54c23c7634ff_invokedynamic8777_41(19011, (65812857283762205L ^ local9)));
    ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(p0)).a(((double)(((double) ((local16 - (p3 * local15)) - (p6 * local15))))), ((double)(((double) (local17 - (p4 * local15))))), ((double)(((double) ((local18 - (p5 * local15)) - (p7 * local15)))))))).a(((double)(((double) local12))), ((double)(((double) local14)))))).a(((float)(this.aM)), ((float)(this.aN)), ((float)(this.aO)), ((float)(this.aP))))).a(((int)(local20)), ((int)(local21))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(p0)).a(((double)(((double) ((local16 - (p3 * local15)) + (p6 * local15))))), ((double)(((double) (local17 + (p4 * local15))))), ((double)(((double) ((local18 - (p5 * local15)) + (p7 * local15)))))))).a(((double)(((double) local12))), ((double)(((double) local13)))))).a(((float)(this.aM)), ((float)(this.aN)), ((float)(this.aO)), ((float)(this.aP))))).a(((int)(local20)), ((int)(local21))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(p0)).a(((double)(((double) ((local16 + (p3 * local15)) + (p6 * local15))))), ((double)(((double) (local17 + (p4 * local15))))), ((double)(((double) ((local18 + (p5 * local15)) + (p7 * local15)))))))).a(((double)(((double) local11))), ((double)(((double) local13)))))).a(((float)(this.aM)), ((float)(this.aN)), ((float)(this.aO)), ((float)(this.aP))))).a(((int)(local20)), ((int)(local21))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(p0)).a(((double)(((double) ((local16 + (p3 * local15)) - (p6 * local15))))), ((double)(((double) (local17 - (p4 * local15))))), ((double)(((double) ((local18 + (p5 * local15)) - (p7 * local15)))))))).a(((double)(((double) local11))), ((double)(((double) local14)))))).a(((float)(this.aM)), ((float)(this.aN)), ((float)(this.aO)), ((float)(this.aP))))).a(((int)(local20)), ((int)(local21))))).c__Void();
    return;
}


public int a__Int() {
return 0;
}


public void a(net.minecraft.client.renderer.texture.TextureAtlasSprite p0) {
int local2 = ((net.minecraft.client.particle.EntityFX)(this)).a__Int();
    if ((local2 == 1)) {
        this.aQ = ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(p0));
    } else {
        throw new java.lang.RuntimeException("Invalid call to Particle.setTex, use coordinate methods");
    }
    return;
}


public void a__Void() {
this.aE += 1;
    return;
}


public float g__sourceReturn_bc607678b6() {
return this.aP;
}


protected boolean g__Boolean() {
return ((0) != 0);
}


public void g__Void() {
this.k = ((double)(this.n));
    this.l = ((double)(this.o));
    this.m = ((double)(this.p));
    net.minecraft.client.particle.EntityFX __stackOp4805_6_0 = this;
    net.minecraft.client.particle.EntityFX __stackOp4805_8_0 = __stackOp4805_6_0;
    int __stackOp4805_8_1 = ((net.minecraft.client.particle.EntityFX)(__stackOp4805_6_0)).aI;
    int spill4805_0 = __stackOp4805_8_1;
    ((net.minecraft.client.particle.EntityFX)(__stackOp4805_8_0)).aI = ((int)((__stackOp4805_8_1 + 1)));
    if ((spill4805_0 >= this.aJ)) {
        ((net.minecraft.client.particle.EntityFX)(this)).f__Void();
    }
    net.minecraft.client.particle.EntityFX __stackOp4805_12_0 = this;
    ((net.minecraft.client.particle.EntityFX)(__stackOp4805_12_0)).u = ((double)((((net.minecraft.client.particle.EntityFX)(__stackOp4805_12_0)).u - (0x1.47ae147ae147bp-5d * ((double) this.aL)))));
    ((net.minecraft.client.particle.EntityFX)(this)).b__Void(((double)(this.t)), ((double)(this.u)), ((double)(this.v)));
    net.minecraft.client.particle.EntityFX __stackOp4805_20_0 = this;
    ((net.minecraft.client.particle.EntityFX)(__stackOp4805_20_0)).t = ((double)((((net.minecraft.client.particle.EntityFX)(__stackOp4805_20_0)).t * 0x1.f5c29p-1d)));
    net.minecraft.client.particle.EntityFX __stackOp4805_23_0 = this;
    ((net.minecraft.client.particle.EntityFX)(__stackOp4805_23_0)).u = ((double)((((net.minecraft.client.particle.EntityFX)(__stackOp4805_23_0)).u * 0x1.f5c29p-1d)));
    net.minecraft.client.particle.EntityFX __stackOp4805_26_0 = this;
    ((net.minecraft.client.particle.EntityFX)(__stackOp4805_26_0)).v = ((double)((((net.minecraft.client.particle.EntityFX)(__stackOp4805_26_0)).v * 0x1.f5c29p-1d)));
    if (this.A) {
        net.minecraft.client.particle.EntityFX __stackOp4805_30_0 = this;
        ((net.minecraft.client.particle.EntityFX)(__stackOp4805_30_0)).t = ((double)((((net.minecraft.client.particle.EntityFX)(__stackOp4805_30_0)).t * 0x1.666666p-1d)));
        net.minecraft.client.particle.EntityFX __stackOp4805_33_0 = this;
        ((net.minecraft.client.particle.EntityFX)(__stackOp4805_33_0)).v = ((double)((((net.minecraft.client.particle.EntityFX)(__stackOp4805_33_0)).v * 0x1.666666p-1d)));
    }
    return;
}


public void g(int p0) {
long local2 = (net.minecraft.client.particle.EntityFX.cb ^ 34667096434603L);
    if ((((net.minecraft.client.particle.EntityFX)(this)).a__Int() != 0)) {
        throw new java.lang.RuntimeException("Invalid call to Particle.setMiscTex");
    }
    this.aE = ((int)((p0 % __sourceIntrinsic_a08a1913beb2_invokedynamic10529_2(12858, (1121042543354910641L ^ local2)))));
    this.aF = ((int)((p0 / __sourceIntrinsic_a08a1913beb2_invokedynamic10529_4(9889, (3723821015398449963L ^ local2)))));
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_54c23c7634ff_invokedynamic8777_37(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_54c23c7634ff_invokedynamic8777_39(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_54c23c7634ff_invokedynamic8777_40(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_54c23c7634ff_invokedynamic8777_41(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral10524_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a08a1913beb2_invokedynamic10529_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a08a1913beb2_invokedynamic10529_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite1814_10(java.lang.String a0, double a1, double a2, double a3, float a4, float a5, float a6, float a7, int a8) throws E;
}
