package net.minecraft.client.renderer.entity;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class RenderDragon extends moom.mU<net.minecraft.entity.boss.EntityDragon> {

private static final moom.DD C;

private static final moom.DD D;

private static final moom.DD E;

protected net.minecraft.client.model.ModelDragon F;

private static final long G;

private static final long[] H;

private static final java.lang.Integer[] I;

private static final java.util.Map J;

public RenderDragon(net.minecraft.client.renderer.entity.RenderManager p0) {
super(p0, new net.minecraft.client.model.ModelDragon(0x0.0p+0f), 0x1.0000000000000p-1f);
    this.F = ((net.minecraft.client.model.ModelDragon) (this.m));
    (this).a(new moom.nN(this));
    (this).a(new moom.nM());
}


static {
G = ((long)(((moom._a)(moom._c.a(((long)(-3387668454293775443L)), ((long)(-724252859147047556L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(269906502713738L)))));
    J = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (net.minecraft.client.renderer.entity.RenderDragon.G ^ 139628457651965L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1816_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1816_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1816_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1816_14 = new byte[8];
    (__sourceSpill1816_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1816_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1816_16 = __sourceSpill1816_14;
    ((javax.crypto.Cipher)(__sourceSpill1816_11)).init(((int)(__sourceSpill1816_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1816_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1816_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[16];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "\036=$;\030Q\003à´Bärü\002ëÙD¸/AtßOðÖü\b\036)t÷!±à'|æ1|eß|½\006¢\033düÝS\\a;!%\fÔäï¥ïrB\013ý\000¢¯I\rÔ\002Ü>Ú \023ÚbOÖ\\Ì\fVòS¿¤@)®ë\027s'B¦"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1816_25 = local6_life21;
        int __sourceSpill1816_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1816_25)).substring(((int)(__sourceSpill1816_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1816_30 = local8_life19;
        int __sourceSpill1816_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1816_33 = new byte[8];
        (__sourceSpill1816_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1816_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1816_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1816_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1816_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1816_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1816_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1816_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1816_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1816_34)).doFinal(((byte[])(__sourceSpill1816_33)));
        (__sourceSpill1816_30)[__sourceSpill1816_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "©Ö\024ãÌVÄù4æÑÄ"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1816_38 = local6_life21;
        int __sourceSpill1816_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1816_38)).substring(((int)(__sourceSpill1816_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1816_43 = local8_life19;
        int __sourceSpill1816_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1816_46 = new byte[8];
        (__sourceSpill1816_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1816_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1816_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1816_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1816_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1816_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1816_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1816_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1816_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1816_47)).doFinal(((byte[])(__sourceSpill1816_46)));
        (__sourceSpill1816_43)[__sourceSpill1816_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    H = ((long[])(local8_life19));
    I = ((java.lang.Integer[])(new java.lang.Integer[16]));
    C = ((moom.DD)(new moom.DD("textures/entity/endercrystal/endercrystal_beam.png")));
    D = ((moom.DD)(new moom.DD("textures/entity/enderdragon/dragon_exploding.png")));
    E = ((moom.DD)(new moom.DD("textures/entity/enderdragon/dragon.png")));
}


private static java.lang.invoke.CallSite d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral10758_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/m4"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int d(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 8512;
      if (I[var3] == null) {
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
         long var5 = H[var3];
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
         Object[] var9 = (Object[])J.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               J.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/m4", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         I[var3] = var15;
      }

      return I[var3];
}


private static int d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.client.renderer.entity.RenderDragon.d(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public void a__sourceBridge_01f3c9ade5(net.minecraft.entity.Entity p0, double p1, double p2, double p3, float p4, float p5) {
((net.minecraft.client.renderer.entity.RenderDragon)(this)).a(((net.minecraft.entity.boss.EntityDragon)(((net.minecraft.entity.boss.EntityDragon)(p0)))), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((float)(p4)), ((float)(p5)));
}


public void a(net.minecraft.entity.boss.EntityDragon p0, double p1, double p2, double p3, float p4, float p5) {
moom.vJ.a(((net.minecraft.entity.boss.IBossDisplayData)(p0)), ((boolean)(false)));
    __sourceExactCall_dc1b8554f2e929(this, ((net.minecraft.entity.EntityLiving)(p0)), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((float)(p4)), ((float)(p5)));
    if ((((net.minecraft.entity.boss.EntityDragon)(p0)).cf != null)) {
        __sourceExactCall_6dd2b640c1da58(((net.minecraft.client.renderer.entity.RenderDragon)(this)), ((net.minecraft.entity.boss.EntityDragon)(p0)), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((float)(p5)));
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


protected void a(net.minecraft.entity.boss.EntityDragon p0, float p1, float p2, float p3, float p4, float p5, float p6) {
long life8_3;
    float life10_12;
    life8_3 = (net.minecraft.client.renderer.entity.RenderDragon.G ^ 102924650672589L);
    if ((((net.minecraft.entity.boss.EntityDragon)(p0)).ce > 0)) {
        life10_12 = (((float) ((net.minecraft.entity.boss.EntityDragon)(p0)).ce) / 0x1.9p7f);
        moom.kZ.c(((int)(__sourceIntrinsic_c47f78d26284_invokedynamic5466_3(4230, (8588330053957361075L ^ life8_3)))));
        int spill5466_0 = 25557;
        moom.kZ.d__Void();
        moom.kZ.a(((int)(__sourceIntrinsic_c47f78d26284_invokedynamic5466_6(spill5466_0, (5959843564885077732L ^ life8_3)))), ((float)(life10_12)));
        int spill5466_1 = 27130;
        __sourceExactCall_a0085d071f807d(((net.minecraft.client.renderer.entity.RenderDragon)(this)), ((moom.DD)(net.minecraft.client.renderer.entity.RenderDragon.D)));
        long spill5466_2 = (1589044508110808266L ^ life8_3);
        ((moom.iQ)(this.m)).a(((net.minecraft.entity.Entity)(p0)), ((float)(p1)), ((float)(p2)), ((float)(p3)), ((float)(p4)), ((float)(p5)), ((float)(p6)));
        moom.kZ.a(((int)(__sourceIntrinsic_c47f78d26284_invokedynamic5466_12(spill5466_1, spill5466_2))), ((float)(0x1.99999ap-4f)));
        moom.kZ.c(((int)(__sourceIntrinsic_c47f78d26284_invokedynamic5466_14(30488, (2901561501178362401L ^ life8_3)))));
    }
    __sourceExactCall_aa15e119600a22(((net.minecraft.client.renderer.entity.RenderDragon)(this)), ((net.minecraft.entity.Entity)(p0)));
    ((moom.iQ)(this.m)).a(((net.minecraft.entity.Entity)(p0)), ((float)(p1)), ((float)(p2)), ((float)(p3)), ((float)(p4)), ((float)(p5)), ((float)(p6)));
    if ((((net.minecraft.entity.boss.EntityDragon)(p0)).aO > 0)) {
        moom.kZ.c(((int)(__sourceIntrinsic_c47f78d26284_invokedynamic5466_20(22218, (7629242829860363261L ^ life8_3)))));
        int spill5466_3 = 24331;
        moom.kZ.v();
        long spill5466_4 = (3023434650552783412L ^ life8_3);
        moom.kZ.l();
        __sourceExactCall_b81ed7f8f640c1(((int)(__sourceIntrinsic_c47f78d26284_invokedynamic5466_24(spill5466_3, spill5466_4))), ((int)(__sourceIntrinsic_c47f78d26284_invokedynamic5466_25(8294, (5938138889346624856L ^ life8_3)))));
        int spill5466_5 = 8822;
        moom.kZ.c(((float)(0x1.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p-1f)));
        long spill5466_6 = (4175558352772181838L ^ life8_3);
        ((moom.iQ)(this.m)).a(((net.minecraft.entity.Entity)(p0)), ((float)(p1)), ((float)(p2)), ((float)(p3)), ((float)(p4)), ((float)(p5)), ((float)(p6)));
        moom.kZ.u();
        moom.kZ.k();
        moom.kZ.c(((int)(__sourceIntrinsic_c47f78d26284_invokedynamic5466_32(spill5466_5, spill5466_6))));
    }
    return;
}


protected void a(net.minecraft.entity.boss.EntityDragon p0, float p1, float p2, float p3) {
long life5_3;
    float life7_15;
    float life8_34;
    float life9_66;
    float life9_69;
    life5_3 = (net.minecraft.client.renderer.entity.RenderDragon.G ^ 102865931793944L);
    life7_15 = ((float) (((net.minecraft.entity.boss.EntityDragon)(p0)).a__sourceReturn_59e90b7c78(((int)(__sourceIntrinsic_1795dca64495_invokedynamic8797_1(24852, (6170822871762627581L ^ life5_3)))), ((float)(p3))))[0]);
    life8_34 = ((float) ((((net.minecraft.entity.boss.EntityDragon)(p0)).a__sourceReturn_59e90b7c78(((int)(5)), ((float)(p3))))[1] - (((net.minecraft.entity.boss.EntityDragon)(p0)).a__sourceReturn_59e90b7c78(((int)(__sourceIntrinsic_1795dca64495_invokedynamic8797_4(3237, (3579453410043889222L ^ life5_3)))), ((float)(p3))))[1]));
    moom.kZ.b(((float)((-life7_15))), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)));
    moom.kZ.b(((float)((life8_34 * 0x1.4p3f))), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)));
    moom.kZ.b(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)));
    if ((((net.minecraft.entity.boss.EntityDragon)(p0)).aR > 0)) {
        life9_66 = ((((((float) ((net.minecraft.entity.boss.EntityDragon)(p0)).aR) + p3) - 0x1.0p0f) / 0x1.4p4f) * 0x1.99999ap0f);
        life9_69 = moom.Dr.c(((float)(life9_66)));
        if ((life9_69 > 0x1.0p0f)) {
        life9_69 = 0x1.0p0f;
    }
        __sourceExactCall_1335870edf69d2(((float)((life9_69 * ((net.minecraft.client.renderer.entity.RenderDragon)(this)).a__sourceReturn_fe6e998144(((p0)))))), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)));
    }
    return;
}


protected void a__sourceBridge_798e0ba395(net.minecraft.entity.EntityLivingBase p0, float p1, float p2, float p3, float p4, float p5, float p6) {
((net.minecraft.client.renderer.entity.RenderDragon)(this)).a(((net.minecraft.entity.boss.EntityDragon)(((net.minecraft.entity.boss.EntityDragon)(p0)))), ((float)(p1)), ((float)(p2)), ((float)(p3)), ((float)(p4)), ((float)(p5)), ((float)(p6)));
}


protected moom.DD a(net.minecraft.entity.boss.EntityDragon p0) {
return net.minecraft.client.renderer.entity.RenderDragon.E;
}


public void a__sourceBridge_36abde8bbd(net.minecraft.entity.EntityLiving p0, double p1, double p2, double p3, float p4, float p5) {
((net.minecraft.client.renderer.entity.RenderDragon)(this)).a(((net.minecraft.entity.boss.EntityDragon)(((net.minecraft.entity.boss.EntityDragon)(p0)))), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((float)(p4)), ((float)(p5)));
}


protected void a__sourceBridge_e093c470d2(net.minecraft.entity.EntityLivingBase p0, float p1, float p2, float p3) {
((net.minecraft.client.renderer.entity.RenderDragon)(this)).a(((net.minecraft.entity.boss.EntityDragon)(((net.minecraft.entity.boss.EntityDragon)(p0)))), ((float)(p1)), ((float)(p2)), ((float)(p3)));
}


protected void a(net.minecraft.entity.boss.EntityDragon p0, double p1, double p2, double p3, float p4) {
long life9_3;
    float life11_10;
    float life12_19;
    float life12_27;
    float life13_46;
    float life14_70;
    float life15_89;
    float life16_98;
    float life17_111;
    net.minecraft.client.renderer.Tessellator life18_157;
    moom.lw life19_160;
    float life20_181;
    float life21_204;
    int life22_214;
    int life23_216;
    float life24_241;
    float life25_259;
    float life26_270;
    life9_3 = (net.minecraft.client.renderer.entity.RenderDragon.G ^ 129427096794425L);
    life11_10 = (((float) ((moom.tw)(((net.minecraft.entity.boss.EntityDragon)(p0)).cf)).aE) + p4);
    life12_19 = ((moom.Dr.a(((float)((life11_10 * 0x1.99999ap-3f)))) / 0x1.0p1f) + 0x1.0p-1f);
    life12_27 = (((life12_19 * life12_19) + life12_19) * 0x1.99999ap-3f);
    life13_46 = ((float) ((((moom.tw)(((net.minecraft.entity.boss.EntityDragon)(p0)).cf)).n - ((net.minecraft.entity.boss.EntityDragon)(p0)).n) - ((((net.minecraft.entity.boss.EntityDragon)(p0)).k - ((net.minecraft.entity.boss.EntityDragon)(p0)).n) * ((double) (0x1.0p0f - p4)))));
    life14_70 = ((float) ((((((double) life12_27) + ((moom.tw)(((net.minecraft.entity.boss.EntityDragon)(p0)).cf)).o) - 0x1.0p0d) - ((net.minecraft.entity.boss.EntityDragon)(p0)).o) - ((((net.minecraft.entity.boss.EntityDragon)(p0)).l - ((net.minecraft.entity.boss.EntityDragon)(p0)).o) * ((double) (0x1.0p0f - p4)))));
    life15_89 = ((float) ((((moom.tw)(((net.minecraft.entity.boss.EntityDragon)(p0)).cf)).p - ((net.minecraft.entity.boss.EntityDragon)(p0)).p) - ((((net.minecraft.entity.boss.EntityDragon)(p0)).m - ((net.minecraft.entity.boss.EntityDragon)(p0)).p) * ((double) (0x1.0p0f - p4)))));
    life16_98 = moom.Dr.c(((float)(((life13_46 * life13_46) + (life15_89 * life15_89)))));
    life17_111 = moom.Dr.c(((float)((((life13_46 * life13_46) + (life14_70 * life14_70)) + (life15_89 * life15_89)))));
    moom.kZ.B();
    moom.kZ.b(((float)(((float) p1))), ((float)((((float) p2) + 0x1.0p1f))), ((float)(((float) p3))));
    moom.kZ.b(((float)((((((float) (-java.lang.Math.atan2(((double)(((double) life15_89))), ((double)(((double) life13_46)))))) * 0x1.68p7f) / 0x1.921fb6p1f) - 0x1.68p6f))), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)));
    moom.kZ.b(((float)((((((float) (-java.lang.Math.atan2(((double)(((double) life16_98))), ((double)(((double) life14_70)))))) * 0x1.68p7f) / 0x1.921fb6p1f) - 0x1.68p6f))), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)));
    life18_157 = net.minecraft.client.renderer.Tessellator.a();
    life19_160 = ((net.minecraft.client.renderer.Tessellator)(life18_157)).a__lw();
    moom.lt.a();
    moom.kZ.p();
    ((net.minecraft.client.renderer.entity.RenderDragon)(this)).b(((moom.DD)(net.minecraft.client.renderer.entity.RenderDragon.C)));
    moom.kZ.j(((int)(__sourceIntrinsic_d4edf98a5490_invokedynamic8798_33(13878, (4738396806499811313L ^ life9_3)))));
    life20_181 = (0x0.0p0f - ((((float) ((net.minecraft.entity.boss.EntityDragon)(p0)).S) + p4) * 0x1.47ae14p-7f));
    life21_204 = ((moom.Dr.c(((float)((((life13_46 * life13_46) + (life14_70 * life14_70)) + (life15_89 * life15_89))))) / 0x1.0p5f) - ((((float) ((net.minecraft.entity.boss.EntityDragon)(p0)).S) + p4) * 0x1.47ae14p-7f));
    ((moom.lw)(life19_160)).a(((int)(5)), ((moom.oD)(moom.oB.k)));
    life22_214 = __sourceIntrinsic_d4edf98a5490_invokedynamic8798_40(32513, (8116162467660625607L ^ life9_3));
    life23_216 = 0;
    while ((life23_216 <= __sourceIntrinsic_d4edf98a5490_invokedynamic8798_41(19156, (8722304876654314266L ^ life9_3)))) {
        life24_241 = (moom.Dr.a(((float)((((((float) (life23_216 % __sourceIntrinsic_d4edf98a5490_invokedynamic8798_42(19156, (8722304876654314266L ^ life9_3)))) * 0x1.921fb6p1f) * 0x1.0p1f) / 0x1.0p3f)))) * 0x1.8p-1f);
        life25_259 = (moom.Dr.b(((float)((((((float) (life23_216 % __sourceIntrinsic_d4edf98a5490_invokedynamic8798_44(19156, (8722304876654314266L ^ life9_3)))) * 0x1.921fb6p1f) * 0x1.0p1f) / 0x1.0p3f)))) * 0x1.8p-1f);
        life26_270 = (((float) (life23_216 % __sourceIntrinsic_d4edf98a5490_invokedynamic8798_46(19156, (8722304876654314266L ^ life9_3)))) / 0x1.0p3f);
        ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(life19_160)).a(((double)(((double) (life24_241 * 0x1.99999ap-3f)))), ((double)(((double) (life25_259 * 0x1.99999ap-3f)))), ((double)(0x0.0p0d))))).a(((double)(((double) life26_270))), ((double)(((double) life21_204)))))).a(((int)(0)), ((int)(0)), ((int)(0)), ((int)(__sourceIntrinsic_d4edf98a5490_invokedynamic8798_49(1799, (4437908476325334734L ^ life9_3))))))).c__Void();
        ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(life19_160)).a(((double)(((double) life24_241))), ((double)(((double) life25_259))), ((double)(((double) life17_111)))))).a(((double)(((double) life26_270))), ((double)(((double) life20_181)))))).a(((int)(__sourceIntrinsic_d4edf98a5490_invokedynamic8798_54(2487, (7691382271127158904L ^ life9_3)))), ((int)(__sourceIntrinsic_d4edf98a5490_invokedynamic8798_55(2487, (7691382271127158904L ^ life9_3)))), ((int)(__sourceIntrinsic_d4edf98a5490_invokedynamic8798_56(2487, (7691382271127158904L ^ life9_3)))), ((int)(__sourceIntrinsic_d4edf98a5490_invokedynamic8798_57(2487, (7691382271127158904L ^ life9_3))))))).c__Void();
        life23_216 += 1;
    }
    ((net.minecraft.client.renderer.Tessellator)(life18_157)).a__Void();
    int spill8798_0 = 27234;
    moom.kZ.o();
    moom.kZ.j(((int)(__sourceIntrinsic_d4edf98a5490_invokedynamic8798_62(spill8798_0, (3795154250409862050L ^ life9_3)))));
    moom.lt.b();
    moom.kZ.C();
    return;
}


public void a__sourceBridge_e7b4e99e7e(net.minecraft.entity.EntityLivingBase p0, double p1, double p2, double p3, float p4, float p5) {
((net.minecraft.client.renderer.entity.RenderDragon)(this)).a(((net.minecraft.entity.boss.EntityDragon)(((net.minecraft.entity.boss.EntityDragon)(p0)))), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((float)(p4)), ((float)(p5)));
}


protected moom.DD a__sourceBridge_fb93f4301e(net.minecraft.entity.Entity p0) {
return ((net.minecraft.client.renderer.entity.RenderDragon)(this)).a(((net.minecraft.entity.boss.EntityDragon)(((net.minecraft.entity.boss.EntityDragon)(p0)))));
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral10758_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c47f78d26284_invokedynamic5466_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c47f78d26284_invokedynamic5466_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c47f78d26284_invokedynamic5466_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c47f78d26284_invokedynamic5466_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c47f78d26284_invokedynamic5466_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c47f78d26284_invokedynamic5466_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c47f78d26284_invokedynamic5466_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c47f78d26284_invokedynamic5466_32(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1795dca64495_invokedynamic8797_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1795dca64495_invokedynamic8797_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d4edf98a5490_invokedynamic8798_33(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d4edf98a5490_invokedynamic8798_40(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d4edf98a5490_invokedynamic8798_41(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d4edf98a5490_invokedynamic8798_42(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d4edf98a5490_invokedynamic8798_44(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d4edf98a5490_invokedynamic8798_46(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d4edf98a5490_invokedynamic8798_49(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d4edf98a5490_invokedynamic8798_54(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d4edf98a5490_invokedynamic8798_55(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d4edf98a5490_invokedynamic8798_56(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d4edf98a5490_invokedynamic8798_57(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d4edf98a5490_invokedynamic8798_62(int a0, long a1) throws E;



private static native void __sourceExactCall_dc1b8554f2e929(moom.mU p0, net.minecraft.entity.EntityLiving p1, double p2, double p3, double p4, float p5, float p6);
private static native void __sourceExactCall_6dd2b640c1da58(net.minecraft.client.renderer.entity.RenderDragon p0, net.minecraft.entity.boss.EntityDragon p1, double p2, double p3, double p4, float p5);
private static native void __sourceExactCall_a0085d071f807d(net.minecraft.client.renderer.entity.RenderDragon p0, moom.DD p1);
private static native boolean __sourceExactCall_aa15e119600a22(net.minecraft.client.renderer.entity.RenderDragon p0, net.minecraft.entity.Entity p1);
private static native void __sourceExactCall_b81ed7f8f640c1(int p0, int p1);

private static native void __sourceExactCall_1335870edf69d2(float p0, float p1, float p2, float p3);
}
