package net.minecraft.client.renderer.entity;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class RenderGuardian extends moom.mU<net.minecraft.entity.monster.EntityGuardian> {

private static final moom.DD C;

private static final moom.DD D;

private static final moom.DD E;

int F;

private static final long G;

private static final long[] H;

private static final java.lang.Integer[] I;

private static final java.util.Map J;

public RenderGuardian(net.minecraft.client.renderer.entity.RenderManager p0) {
super(p0, new moom.jb(), 0x1.0000000000000p-1f);
    this.F = (((moom.jb) (this.m))).a();
}


static {
G = ((long)(((moom._a)(moom._c.a(((long)(528775832330901385L)), ((long)(-1040245146001412420L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(132921066223223L)))));
    J = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (net.minecraft.client.renderer.entity.RenderGuardian.G ^ 40510659199976L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1817_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1817_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1817_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1817_14 = new byte[8];
    (__sourceSpill1817_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1817_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1817_16 = __sourceSpill1817_14;
    ((javax.crypto.Cipher)(__sourceSpill1817_11)).init(((int)(__sourceSpill1817_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1817_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1817_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[11];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "÷~géÖÿ7î¬S¨³AsVôRõT\033\"?µ{Ç\037N\007g¼\004\032¤ÉöÀÄíÉM¬1\025Úó²å²P4-×>\026ô=Äö§¬Á"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1817_25 = local6_life21;
        int __sourceSpill1817_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1817_25)).substring(((int)(__sourceSpill1817_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1817_30 = local8_life19;
        int __sourceSpill1817_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1817_33 = new byte[8];
        (__sourceSpill1817_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1817_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1817_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1817_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1817_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1817_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1817_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1817_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1817_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1817_34)).doFinal(((byte[])(__sourceSpill1817_33)));
        (__sourceSpill1817_30)[__sourceSpill1817_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "ií6z\025\030É.Ð¦«J"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1817_38 = local6_life21;
        int __sourceSpill1817_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1817_38)).substring(((int)(__sourceSpill1817_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1817_43 = local8_life19;
        int __sourceSpill1817_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1817_46 = new byte[8];
        (__sourceSpill1817_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1817_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1817_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1817_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1817_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1817_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1817_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1817_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1817_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1817_47)).doFinal(((byte[])(__sourceSpill1817_46)));
        (__sourceSpill1817_43)[__sourceSpill1817_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    H = ((long[])(local8_life19));
    I = ((java.lang.Integer[])(new java.lang.Integer[11]));
    C = ((moom.DD)(new moom.DD("textures/entity/guardian.png")));
    D = ((moom.DD)(new moom.DD("textures/entity/guardian_elder.png")));
    E = ((moom.DD)(new moom.DD("textures/entity/guardian_beam.png")));
}


private static java.lang.invoke.CallSite d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral10762_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/m9"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int d(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 24300;
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
            throw new RuntimeException("moom/m9", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         I[var3] = var15;
      }

      return I[var3];
}


private static int d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.client.renderer.entity.RenderGuardian.d(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(net.minecraft.entity.monster.EntityGuardian p0, double p1, double p2, double p3, float p4, float p5) {
long life10_3;
    net.minecraft.entity.EntityLivingBase life12_35;
    float life13_41;
    net.minecraft.client.renderer.Tessellator life14_44;
    moom.lw life15_50;
    float life16_84;
    float life17_100;
    float life18_106;
    float life19_109;
    moom.DR life20_129;
    moom.DR life21_136;
    moom.DR life22_140;
    double life23_145;
    moom.DR life22_148;
    float life25_153;
    float life26_160;
    int life27_178;
    double life28_192;
    float life30_205;
    int life31_215;
    int life32_226;
    int life33_237;
    double life34_242;
    double life36_246;
    double life38_255;
    double life40_264;
    double life42_273;
    double life44_282;
    double life46_291;
    double life48_300;
    double life50_309;
    double life52_318;
    double life54_327;
    double life56_336;
    double life58_345;
    double life60_354;
    double life62_363;
    double life64_372;
    double life66_381;
    double life68_390;
    double life70_392;
    double life72_394;
    double life74_399;
    double life76_407;
    double life78_553;
    life10_3 = (net.minecraft.client.renderer.entity.RenderGuardian.G ^ 127098348046529L);
    if ((this.F != __sourceExactCall_207db054b4b1a0(((moom.jb)(((moom.jb)(this.m))))))) {
        this.m = ((moom.iQ)(new moom.jb()));
        this.F = ((int)(__sourceExactCall_207db054b4b1a0(((moom.jb)(((moom.jb)(this.m)))))));
    }
    __sourceExactCall_dc1b8554f2e929(this, ((net.minecraft.entity.EntityLiving)(p0)), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((float)(p4)), ((float)(p5)));
    life12_35 = ((net.minecraft.entity.monster.EntityGuardian)(p0)).e__sG();
    if ((life12_35 != null)) {
        life13_41 = ((net.minecraft.entity.monster.EntityGuardian)(p0)).e__sourceReturn_f6c4892e39(((float)(p5)));
        int spill4833_0 = 11871;
        life14_44 = __sourceExactCall_607dff73cf88f9();
        long spill4833_1 = (5773656250730130046L ^ life10_3);
        life15_50 = ((net.minecraft.client.renderer.Tessellator)(life14_44)).a__lw();
        ((net.minecraft.client.renderer.entity.RenderGuardian)(this)).b(((moom.DD)(net.minecraft.client.renderer.entity.RenderGuardian.E)));
        org.lwjgl.opengl.GL11.glTexParameterf(((int)(__sourceIntrinsic_04f09b838c8a_invokedynamic4833_17(spill4833_0, spill4833_1))), ((int)(__sourceIntrinsic_04f09b838c8a_invokedynamic4833_18(819, (4602832647396591381L ^ life10_3)))), ((float)(0x1.4808p13f)));
        org.lwjgl.opengl.GL11.glTexParameterf(((int)(__sourceIntrinsic_04f09b838c8a_invokedynamic4833_20(19628, (6008105760946309254L ^ life10_3)))), ((int)(__sourceIntrinsic_04f09b838c8a_invokedynamic4833_21(14819, (8464115105980661185L ^ life10_3)))), ((float)(0x1.4808p13f)));
        int spill4833_2 = 23021;
        moom.kZ.f();
        long spill4833_3 = (3669067428279180746L ^ life10_3);
        moom.kZ.p();
        moom.kZ.k();
        moom.kZ.a(((boolean)(true)));
        life16_84 = 0x1.ep7f;
        __sourceExactCall_9d3d96a90a216c(((int)(net.minecraft.client.renderer.OpenGlHelper.r)), ((float)(life16_84)), ((float)(life16_84)));
        __sourceExactCall_1fc4ef8e9bbe89(((int)(__sourceIntrinsic_04f09b838c8a_invokedynamic4833_29(spill4833_2, spill4833_3))), ((int)(1)), ((int)(1)), ((int)(0)));
        life17_100 = (((float) ((net.minecraft.world.World)(((net.minecraft.entity.monster.EntityGuardian)(p0)).i)).b__Long()) + p5);
        life18_106 = ((life17_100 * 0x1.0p-1f) % 0x1.0p0f);
        life19_109 = ((net.minecraft.entity.monster.EntityGuardian)(p0)).e__Float();
        moom.kZ.B();
        moom.kZ.b(((float)(((float) p1))), ((float)((((float) p2) + life19_109))), ((float)(((float) p3))));
        life20_129 = __sourceExactCall_c721e4602a27e6(((net.minecraft.client.renderer.entity.RenderGuardian)(this)), ((net.minecraft.entity.EntityLivingBase)(life12_35)), ((double)((((double) ((net.minecraft.entity.EntityLivingBase)(life12_35)).H) * 0x1.0p-1d))), ((float)(p5)));
        life21_136 = __sourceExactCall_c721e4602a27e6(((net.minecraft.client.renderer.entity.RenderGuardian)(this)), ((net.minecraft.entity.EntityLivingBase)(p0)), ((double)(((double) life19_109))), ((float)(p5)));
        life22_140 = ((moom.DR)(life20_129)).c__DR(((moom.DR)(life21_136)));
        life23_145 = (__sourceExactCall_ab505880ddd882(((moom.DR)(life22_140))) + 0x1.0p0d);
        life22_148 = ((moom.DR)(life22_140)).a__DR();
        life25_153 = ((float) java.lang.Math.acos(((double)(((moom.DR)(life22_148)).b))));
        life26_160 = ((float) java.lang.Math.atan2(((double)(((moom.DR)(life22_148)).c)), ((double)(((moom.DR)(life22_148)).a))));
        moom.kZ.b(((float)(((0x1.921fb6p0f - life26_160) * 0x1.ca5dcp5f))), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)));
        moom.kZ.b(((float)((life25_153 * 0x1.ca5dcp5f))), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)));
        life27_178 = 1;
        life28_192 = ((((double) life17_100) * 0x1.999999999999ap-5d) * (0x1.0p0d - (((double) (life27_178 & 1)) * 0x1.4p1d)));
        __sourceExactCall_b6c6a7d43443b6(((moom.lw)(life15_50)), ((int)(__sourceIntrinsic_04f09b838c8a_invokedynamic4833_49(31980, (1080796602427275471L ^ life10_3)))), ((moom.oD)(moom.oB.k)));
        int spill4833_4 = 26892;
        life30_205 = (life13_41 * life13_41);
        life31_215 = (__sourceIntrinsic_04f09b838c8a_invokedynamic4833_52(spill4833_4, (686487715838586149L ^ life10_3)) + ((int) (life30_205 * 0x1.ep7f)));
        life32_226 = (__sourceIntrinsic_04f09b838c8a_invokedynamic4833_53(9305, (3517221036231106681L ^ life10_3)) + ((int) (life30_205 * 0x1.8p7f)));
        life33_237 = (__sourceIntrinsic_04f09b838c8a_invokedynamic4833_54(12474, (4563494756188927134L ^ life10_3)) - ((int) (life30_205 * 0x1.0p6f)));
        life34_242 = (((double) life27_178) * 0x1.999999999999ap-3d);
        life36_246 = (life34_242 * 0x1.68f5c28f5c28fp0d);
        life38_255 = (0x0.0p0d + (java.lang.Math.cos(((double)((life28_192 + 0x1.2d97c7f3321d2p1d)))) * life36_246));
        life40_264 = (0x0.0p0d + (java.lang.Math.sin(((double)((life28_192 + 0x1.2d97c7f3321d2p1d)))) * life36_246));
        life42_273 = (0x0.0p0d + (java.lang.Math.cos(((double)((life28_192 + 0x1.921fb54442d18p-1d)))) * life36_246));
        life44_282 = (0x0.0p0d + (java.lang.Math.sin(((double)((life28_192 + 0x1.921fb54442d18p-1d)))) * life36_246));
        life46_291 = (0x0.0p0d + (java.lang.Math.cos(((double)((life28_192 + 0x1.f6a7a2955385ep1d)))) * life36_246));
        life48_300 = (0x0.0p0d + (java.lang.Math.sin(((double)((life28_192 + 0x1.f6a7a2955385ep1d)))) * life36_246));
        life50_309 = (0x0.0p0d + (java.lang.Math.cos(((double)((life28_192 + 0x1.5fdbbe9bba775p2d)))) * life36_246));
        life52_318 = (0x0.0p0d + (java.lang.Math.sin(((double)((life28_192 + 0x1.5fdbbe9bba775p2d)))) * life36_246));
        life54_327 = (0x0.0p0d + (java.lang.Math.cos(((double)((life28_192 + 0x1.921fb54442d18p1d)))) * life34_242));
        life56_336 = (0x0.0p0d + (java.lang.Math.sin(((double)((life28_192 + 0x1.921fb54442d18p1d)))) * life34_242));
        life58_345 = (0x0.0p0d + (java.lang.Math.cos(((double)((life28_192 + 0x0.0p0d)))) * life34_242));
        life60_354 = (0x0.0p0d + (java.lang.Math.sin(((double)((life28_192 + 0x0.0p0d)))) * life34_242));
        life62_363 = (0x0.0p0d + (java.lang.Math.cos(((double)((life28_192 + 0x1.921fb54442d18p0d)))) * life34_242));
        life64_372 = (0x0.0p0d + (java.lang.Math.sin(((double)((life28_192 + 0x1.921fb54442d18p0d)))) * life34_242));
        life66_381 = (0x0.0p0d + (java.lang.Math.cos(((double)((life28_192 + 0x1.2d97c7f3321d2p2d)))) * life34_242));
        life68_390 = (0x0.0p0d + (java.lang.Math.sin(((double)((life28_192 + 0x1.2d97c7f3321d2p2d)))) * life34_242));
        life70_392 = 0x0.0p0d;
        life72_394 = 0x1.ffe5c91d14e3cp-2d;
        life74_399 = ((double) (-0x1.0p0f + life18_106));
        life76_407 = ((life23_145 * (0x1.0p-1d / life34_242)) + life74_399);
        ((moom.lw)(__sourceExactCall_5d46cad12f6a1a(((moom.lw)(__sourceExactCall_7c0370b7b41901(((moom.lw)(__sourceExactCall_217a742e4be448(((moom.lw)(life15_50)), ((double)(life54_327)), ((double)(life23_145)), ((double)(life56_336))))), ((double)(0x1.ffe5c91d14e3cp-2d)), ((double)(life76_407))))), ((int)(life31_215)), ((int)(life32_226)), ((int)(life33_237)), ((int)(__sourceIntrinsic_04f09b838c8a_invokedynamic4833_73(30067, (4887823468190658907L ^ life10_3))))))).c__Void();
        ((moom.lw)(__sourceExactCall_5d46cad12f6a1a(((moom.lw)(__sourceExactCall_7c0370b7b41901(((moom.lw)(__sourceExactCall_217a742e4be448(((moom.lw)(life15_50)), ((double)(life54_327)), ((double)(0x0.0p0d)), ((double)(life56_336))))), ((double)(0x1.ffe5c91d14e3cp-2d)), ((double)(life74_399))))), ((int)(life31_215)), ((int)(life32_226)), ((int)(life33_237)), ((int)(__sourceIntrinsic_04f09b838c8a_invokedynamic4833_78(23288, (4395363214337269469L ^ life10_3))))))).c__Void();
        ((moom.lw)(__sourceExactCall_5d46cad12f6a1a(((moom.lw)(__sourceExactCall_7c0370b7b41901(((moom.lw)(__sourceExactCall_217a742e4be448(((moom.lw)(life15_50)), ((double)(life58_345)), ((double)(0x0.0p0d)), ((double)(life60_354))))), ((double)(0x0.0p0d)), ((double)(life74_399))))), ((int)(life31_215)), ((int)(life32_226)), ((int)(life33_237)), ((int)(__sourceIntrinsic_04f09b838c8a_invokedynamic4833_83(23288, (4395363214337269469L ^ life10_3))))))).c__Void();
        ((moom.lw)(__sourceExactCall_5d46cad12f6a1a(((moom.lw)(__sourceExactCall_7c0370b7b41901(((moom.lw)(__sourceExactCall_217a742e4be448(((moom.lw)(life15_50)), ((double)(life58_345)), ((double)(life23_145)), ((double)(life60_354))))), ((double)(0x0.0p0d)), ((double)(life76_407))))), ((int)(life31_215)), ((int)(life32_226)), ((int)(life33_237)), ((int)(__sourceIntrinsic_04f09b838c8a_invokedynamic4833_88(23288, (4395363214337269469L ^ life10_3))))))).c__Void();
        ((moom.lw)(__sourceExactCall_5d46cad12f6a1a(((moom.lw)(__sourceExactCall_7c0370b7b41901(((moom.lw)(__sourceExactCall_217a742e4be448(((moom.lw)(life15_50)), ((double)(life62_363)), ((double)(life23_145)), ((double)(life64_372))))), ((double)(0x1.ffe5c91d14e3cp-2d)), ((double)(life76_407))))), ((int)(life31_215)), ((int)(life32_226)), ((int)(life33_237)), ((int)(__sourceIntrinsic_04f09b838c8a_invokedynamic4833_93(23288, (4395363214337269469L ^ life10_3))))))).c__Void();
        ((moom.lw)(__sourceExactCall_5d46cad12f6a1a(((moom.lw)(__sourceExactCall_7c0370b7b41901(((moom.lw)(__sourceExactCall_217a742e4be448(((moom.lw)(life15_50)), ((double)(life62_363)), ((double)(0x0.0p0d)), ((double)(life64_372))))), ((double)(0x1.ffe5c91d14e3cp-2d)), ((double)(life74_399))))), ((int)(life31_215)), ((int)(life32_226)), ((int)(life33_237)), ((int)(__sourceIntrinsic_04f09b838c8a_invokedynamic4833_98(23288, (4395363214337269469L ^ life10_3))))))).c__Void();
        ((moom.lw)(__sourceExactCall_5d46cad12f6a1a(((moom.lw)(__sourceExactCall_7c0370b7b41901(((moom.lw)(__sourceExactCall_217a742e4be448(((moom.lw)(life15_50)), ((double)(life66_381)), ((double)(0x0.0p0d)), ((double)(life68_390))))), ((double)(0x0.0p0d)), ((double)(life74_399))))), ((int)(life31_215)), ((int)(life32_226)), ((int)(life33_237)), ((int)(__sourceIntrinsic_04f09b838c8a_invokedynamic4833_103(23288, (4395363214337269469L ^ life10_3))))))).c__Void();
        ((moom.lw)(__sourceExactCall_5d46cad12f6a1a(((moom.lw)(__sourceExactCall_7c0370b7b41901(((moom.lw)(__sourceExactCall_217a742e4be448(((moom.lw)(life15_50)), ((double)(life66_381)), ((double)(life23_145)), ((double)(life68_390))))), ((double)(0x0.0p0d)), ((double)(life76_407))))), ((int)(life31_215)), ((int)(life32_226)), ((int)(life33_237)), ((int)(__sourceIntrinsic_04f09b838c8a_invokedynamic4833_108(23288, (4395363214337269469L ^ life10_3))))))).c__Void();
        life78_553 = 0x0.0p0d;
        if (((((net.minecraft.entity.monster.EntityGuardian)(p0)).S % 2) == 0)) {
        life78_553 = 0x1.0p-1d;
    }
        ((moom.lw)(__sourceExactCall_5d46cad12f6a1a(((moom.lw)(__sourceExactCall_7c0370b7b41901(((moom.lw)(__sourceExactCall_217a742e4be448(((moom.lw)(life15_50)), ((double)(life38_255)), ((double)(life23_145)), ((double)(life40_264))))), ((double)(0x1.0p-1d)), ((double)((life78_553 + 0x1.0p-1d)))))), ((int)(life31_215)), ((int)(life32_226)), ((int)(life33_237)), ((int)(__sourceIntrinsic_04f09b838c8a_invokedynamic4833_114(23288, (4395363214337269469L ^ life10_3))))))).c__Void();
        ((moom.lw)(__sourceExactCall_5d46cad12f6a1a(((moom.lw)(__sourceExactCall_7c0370b7b41901(((moom.lw)(__sourceExactCall_217a742e4be448(((moom.lw)(life15_50)), ((double)(life42_273)), ((double)(life23_145)), ((double)(life44_282))))), ((double)(0x1.0p0d)), ((double)((life78_553 + 0x1.0p-1d)))))), ((int)(life31_215)), ((int)(life32_226)), ((int)(life33_237)), ((int)(__sourceIntrinsic_04f09b838c8a_invokedynamic4833_119(23288, (4395363214337269469L ^ life10_3))))))).c__Void();
        ((moom.lw)(__sourceExactCall_5d46cad12f6a1a(((moom.lw)(__sourceExactCall_7c0370b7b41901(((moom.lw)(__sourceExactCall_217a742e4be448(((moom.lw)(life15_50)), ((double)(life50_309)), ((double)(life23_145)), ((double)(life52_318))))), ((double)(0x1.0p0d)), ((double)(life78_553))))), ((int)(life31_215)), ((int)(life32_226)), ((int)(life33_237)), ((int)(__sourceIntrinsic_04f09b838c8a_invokedynamic4833_124(23288, (4395363214337269469L ^ life10_3))))))).c__Void();
        ((moom.lw)(__sourceExactCall_5d46cad12f6a1a(((moom.lw)(__sourceExactCall_7c0370b7b41901(((moom.lw)(__sourceExactCall_217a742e4be448(((moom.lw)(life15_50)), ((double)(life46_291)), ((double)(life23_145)), ((double)(life48_300))))), ((double)(0x1.0p-1d)), ((double)(life78_553))))), ((int)(life31_215)), ((int)(life32_226)), ((int)(life33_237)), ((int)(__sourceIntrinsic_04f09b838c8a_invokedynamic4833_129(23288, (4395363214337269469L ^ life10_3))))))).c__Void();
        ((net.minecraft.client.renderer.Tessellator)(life14_44)).a__Void();
        moom.kZ.C();
    }
    return;
}


public boolean a__sourceBridge_1c85113431(net.minecraft.entity.Entity p0, net.minecraft.client.renderer.culling.ICamera p1, double p2, double p3, double p4) {
return ((net.minecraft.client.renderer.entity.RenderGuardian)(this)).a(((net.minecraft.entity.monster.EntityGuardian)(((net.minecraft.entity.monster.EntityGuardian)(p0)))), ((net.minecraft.client.renderer.culling.ICamera)(p1)), ((double)(p2)), ((double)(p3)), ((double)(p4)));
}


public void a__sourceBridge_01f3c9ade5(net.minecraft.entity.Entity p0, double p1, double p2, double p3, float p4, float p5) {
((net.minecraft.client.renderer.entity.RenderGuardian)(this)).a(((net.minecraft.entity.monster.EntityGuardian)(((net.minecraft.entity.monster.EntityGuardian)(p0)))), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((float)(p4)), ((float)(p5)));
}


private moom.DR a(net.minecraft.entity.EntityLivingBase p0, double p1, float p2) {
double local5 = (((net.minecraft.entity.EntityLivingBase)(p0)).M + ((((net.minecraft.entity.EntityLivingBase)(p0)).n - ((net.minecraft.entity.EntityLivingBase)(p0)).M) * ((double) p2)));
    double local7 = ((p1 + ((net.minecraft.entity.EntityLivingBase)(p0)).N) + ((((net.minecraft.entity.EntityLivingBase)(p0)).o - ((net.minecraft.entity.EntityLivingBase)(p0)).N) * ((double) p2)));
    double local9 = (((net.minecraft.entity.EntityLivingBase)(p0)).O + ((((net.minecraft.entity.EntityLivingBase)(p0)).p - ((net.minecraft.entity.EntityLivingBase)(p0)).O) * ((double) p2)));
    return new moom.DR(local5, local7, local9);
}


public boolean a(net.minecraft.entity.monster.EntityGuardian p0, net.minecraft.client.renderer.culling.ICamera p1, double p2, double p3, double p4) {
net.minecraft.entity.EntityLivingBase life9_17;
    moom.DR life10_29;
    moom.DR life11_37;
    if (__sourceExactCall_28150b6dda5019(this, ((net.minecraft.entity.EntityLiving)(p0)), ((net.minecraft.client.renderer.culling.ICamera)(p1)), ((double)(p2)), ((double)(p3)), ((double)(p4)))) {
        return true;
    }
    if (((net.minecraft.entity.monster.EntityGuardian)(p0)).ae()) {
        life9_17 = ((net.minecraft.entity.monster.EntityGuardian)(p0)).e__sG();
        if ((life9_17 != null)) {
        life10_29 = __sourceExactCall_c721e4602a27e6(((net.minecraft.client.renderer.entity.RenderGuardian)(this)), ((net.minecraft.entity.EntityLivingBase)(life9_17)), ((double)((((double) ((net.minecraft.entity.EntityLivingBase)(life9_17)).H) * 0x1.0p-1d))), ((float)(0x1.0p0f)));
        life11_37 = __sourceExactCall_c721e4602a27e6(((net.minecraft.client.renderer.entity.RenderGuardian)(this)), ((net.minecraft.entity.EntityLivingBase)(p0)), ((double)(((double) ((net.minecraft.entity.monster.EntityGuardian)(p0)).e__Float()))), ((float)(0x1.0p0f)));
        return __sourceExactCall_ea2ea12ec8b381(((net.minecraft.client.renderer.culling.ICamera)(p1)), ((moom.CA)(__sourceExactCall_44c26aa960c885(((double)(((moom.DR)(life11_37)).a)), ((double)(((moom.DR)(life11_37)).b)), ((double)(((moom.DR)(life11_37)).c)), ((double)(((moom.DR)(life10_29)).a)), ((double)(((moom.DR)(life10_29)).b)), ((double)(((moom.DR)(life10_29)).c))))));
    }
    }
    return false;
}


public void a__sourceBridge_e7b4e99e7e(net.minecraft.entity.EntityLivingBase p0, double p1, double p2, double p3, float p4, float p5) {
((net.minecraft.client.renderer.entity.RenderGuardian)(this)).a(((net.minecraft.entity.monster.EntityGuardian)(((net.minecraft.entity.monster.EntityGuardian)(p0)))), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((float)(p4)), ((float)(p5)));
}


protected moom.DD a(net.minecraft.entity.monster.EntityGuardian p0) {
return ((__sourceIntrinsic_booleanComparison(((net.minecraft.entity.monster.EntityGuardian)(p0)).ad()) != 0) ? net.minecraft.client.renderer.entity.RenderGuardian.D : net.minecraft.client.renderer.entity.RenderGuardian.C);
}


public void a__sourceBridge_36abde8bbd(net.minecraft.entity.EntityLiving p0, double p1, double p2, double p3, float p4, float p5) {
((net.minecraft.client.renderer.entity.RenderGuardian)(this)).a(((net.minecraft.entity.monster.EntityGuardian)(((net.minecraft.entity.monster.EntityGuardian)(p0)))), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((float)(p4)), ((float)(p5)));
}


public boolean a__sourceBridge_065e1f05da(net.minecraft.entity.EntityLiving p0, net.minecraft.client.renderer.culling.ICamera p1, double p2, double p3, double p4) {
return ((net.minecraft.client.renderer.entity.RenderGuardian)(this)).a(((net.minecraft.entity.monster.EntityGuardian)(((net.minecraft.entity.monster.EntityGuardian)(p0)))), ((net.minecraft.client.renderer.culling.ICamera)(p1)), ((double)(p2)), ((double)(p3)), ((double)(p4)));
}


protected void a__Void__sourceBridge_7f50c316df(net.minecraft.entity.EntityLivingBase p0, float p1) {
((net.minecraft.client.renderer.entity.RenderGuardian)(this)).a__sourceReturn_c79dc79492(((net.minecraft.entity.monster.EntityGuardian)(((net.minecraft.entity.monster.EntityGuardian)(p0)))), ((float)(p1)));
}


protected void a__sourceReturn_c79dc79492(net.minecraft.entity.monster.EntityGuardian p0, float p1) {
if ((__sourceIntrinsic_booleanComparison(((net.minecraft.entity.monster.EntityGuardian)(p0)).ad()) != 0)) {
        moom.kZ.a(((float)(0x1.2cccccp1f)), ((float)(0x1.2cccccp1f)), ((float)(0x1.2cccccp1f)));
    }
    return;
}


protected moom.DD a__sourceBridge_fb93f4301e(net.minecraft.entity.Entity p0) {
return ((net.minecraft.client.renderer.entity.RenderGuardian)(this)).a(((net.minecraft.entity.monster.EntityGuardian)(((net.minecraft.entity.monster.EntityGuardian)(p0)))));
}


private static native <E extends Throwable> int __sourceIntrinsic_04f09b838c8a_invokedynamic4833_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_04f09b838c8a_invokedynamic4833_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_04f09b838c8a_invokedynamic4833_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_04f09b838c8a_invokedynamic4833_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_04f09b838c8a_invokedynamic4833_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_04f09b838c8a_invokedynamic4833_49(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_04f09b838c8a_invokedynamic4833_52(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_04f09b838c8a_invokedynamic4833_53(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_04f09b838c8a_invokedynamic4833_54(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_04f09b838c8a_invokedynamic4833_73(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_04f09b838c8a_invokedynamic4833_78(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_04f09b838c8a_invokedynamic4833_83(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_04f09b838c8a_invokedynamic4833_88(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_04f09b838c8a_invokedynamic4833_93(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_04f09b838c8a_invokedynamic4833_98(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_04f09b838c8a_invokedynamic4833_103(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_04f09b838c8a_invokedynamic4833_108(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_04f09b838c8a_invokedynamic4833_114(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_04f09b838c8a_invokedynamic4833_119(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_04f09b838c8a_invokedynamic4833_124(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_04f09b838c8a_invokedynamic4833_129(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral10762_0() throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);

public void a__Void(net.minecraft.entity.monster.EntityGuardian __bridgeParam0, float __bridgeParam1) { this.a__Void__sourceBridge_7f50c316df(((net.minecraft.entity.EntityLivingBase)(__bridgeParam0)), ((float)(__bridgeParam1))); }

private static native int __sourceExactCall_207db054b4b1a0(moom.jb p0);
private static native void __sourceExactCall_dc1b8554f2e929(moom.mU p0, net.minecraft.entity.EntityLiving p1, double p2, double p3, double p4, float p5, float p6);
private static native net.minecraft.client.renderer.Tessellator __sourceExactCall_607dff73cf88f9();
private static native void __sourceExactCall_9d3d96a90a216c(int p0, float p1, float p2);
private static native void __sourceExactCall_1fc4ef8e9bbe89(int p0, int p1, int p2, int p3);
private static native moom.DR __sourceExactCall_c721e4602a27e6(net.minecraft.client.renderer.entity.RenderGuardian p0, net.minecraft.entity.EntityLivingBase p1, double p2, float p3);
private static native double __sourceExactCall_ab505880ddd882(moom.DR p0);
private static native void __sourceExactCall_b6c6a7d43443b6(moom.lw p0, int p1, moom.oD p2);
private static native moom.lw __sourceExactCall_5d46cad12f6a1a(moom.lw p0, int p1, int p2, int p3, int p4);
private static native moom.lw __sourceExactCall_7c0370b7b41901(moom.lw p0, double p1, double p2);
private static native moom.lw __sourceExactCall_217a742e4be448(moom.lw p0, double p1, double p2, double p3);
private static native boolean __sourceExactCall_28150b6dda5019(moom.mU p0, net.minecraft.entity.EntityLiving p1, net.minecraft.client.renderer.culling.ICamera p2, double p3, double p4, double p5);
private static native boolean __sourceExactCall_ea2ea12ec8b381(net.minecraft.client.renderer.culling.ICamera p0, moom.CA p1);
private static native moom.CA __sourceExactCall_44c26aa960c885(double p0, double p1, double p2, double p3, double p4, double p5);
}
