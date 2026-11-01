package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class hu extends net.minecraft.client.renderer.InventoryEffectRenderer {

private float aa;

private float ab;

private static long cb;

private static long[] sb;

private static java.lang.Integer[] tb;

private static java.util.Map ub;

public hu(net.minecraft.entity.player.EntityPlayer p0) {
super(p0.bF);
    this.o = true;
}

private static native <E extends Throwable> void __sourceHandlerCall_c90d557ecdf6efe2f5e4(moom.hu a0) throws E;
private static final class __SourceHandler_c90d557ecdf6efe2f5e4 {

public static void f1806(moom.hu receiver) throws Throwable {
    __call1806_1(__fieldRead1806_0(receiver));
    if (__call1806_4(__fieldRead1806_3(__fieldRead1806_2(receiver)))) {
        __call1806_8(__fieldRead1806_5(receiver), new moom.ht(__fieldRead1806_7(__fieldRead1806_6(receiver))));
    } else {
        __call1806_9(receiver);
    }
    return;
}
public static void h1806_0(moom.Oo p0) throws Throwable {
    throw __call1180600_0(p0);
}
private static native java.util.List __fieldRead1806_0(moom.hu a0) throws Throwable;
private static native void __call1806_1(java.util.List a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1806_2(moom.hu a0) throws Throwable;
private static native moom.jI __fieldRead1806_3(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __call1806_4(moom.jI a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1806_5(moom.hu a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1806_6(moom.hu a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead1806_7(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call1806_8(net.minecraft.client.Minecraft a0, moom.ht a1) throws Throwable;
private static native void __call1806_9(moom.hu a0) throws Throwable;
private static native java.lang.Exception __call1180600_0(moom.Oo a0) throws Throwable;

}


static {
cb = ((long)(((moom._a)(moom._c.a(((long)(-1155183977526365081L)), ((long)(-4468763239669486912L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(121500525329907L)))));
    ub = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.hu.cb ^ 89777422995794L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1269_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1269_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1269_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1269_14 = new byte[8];
    (__sourceSpill1269_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1269_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1269_16 = __sourceSpill1269_14;
    ((javax.crypto.Cipher)(__sourceSpill1269_11)).init(((int)(__sourceSpill1269_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1269_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1269_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[7];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "2¹ß\n»Äãà³ÄÛ½\020\026WÉ\027ÅÕ,_#¼ìÜµªGé\003V\tsñ"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1269_25 = local6_life21;
        int __sourceSpill1269_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1269_25)).substring(((int)(__sourceSpill1269_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1269_30 = local8_life19;
        int __sourceSpill1269_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1269_33 = new byte[8];
        (__sourceSpill1269_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1269_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1269_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1269_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1269_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1269_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1269_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1269_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1269_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1269_34)).doFinal(((byte[])(__sourceSpill1269_33)));
        (__sourceSpill1269_30)[__sourceSpill1269_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "Ó-áïÿ§Y\023uªÆBSº"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1269_38 = local6_life21;
        int __sourceSpill1269_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1269_38)).substring(((int)(__sourceSpill1269_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1269_43 = local8_life19;
        int __sourceSpill1269_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1269_46 = new byte[8];
        (__sourceSpill1269_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1269_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1269_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1269_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1269_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1269_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1269_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1269_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1269_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1269_47)).doFinal(((byte[])(__sourceSpill1269_46)));
        (__sourceSpill1269_43)[__sourceSpill1269_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    sb = ((long[])(local8_life19));
    tb = ((java.lang.Integer[])(new java.lang.Integer[7]));
}


protected void b(int p0, int p1) {
long local3 = (moom.hu.cb ^ 87753587038132L);
    ((net.minecraft.client.gui.FontRenderer)(this.p)).b(((java.lang.String)(moom.oO.a(((java.lang.String)("container.crafting")), ((java.lang.Object[])(new java.lang.Object[0]))))), ((float)(0x1.58p6f)), ((float)(0x1.0p4f)), ((int)(__sourceIntrinsic_45fde0f4e55e_originalDynamicSite1499_3(14635, (4146153611463926465L ^ local3)))));
    return;
}


private static int e(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 2610;
      if (tb[var3] == null) {
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
         long var5 = sb[var3];
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
         Object[] var9 = (Object[])ub.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               ub.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/hu", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         tb[var3] = var15;
      }

      return tb[var3];
}


private static int e(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.hu.e(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite e(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_5c8d2e4b3bac_methodHandleLiteral7953_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/hu"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void c__Void() { __sourceHandlerCall_c90d557ecdf6efe2f5e4(this); }


private static java.lang.Exception c(java.lang.Exception p0) {
return p0;
}


public static void a(int p0, int p1, int p2, float p3, float p4, net.minecraft.entity.EntityLivingBase p5) {
moom.kZ.g();
    moom.kZ.B();
    moom.kZ.b(((float)(((float) p0))), ((float)(((float) p1))), ((float)(0x1.9p5f)));
    moom.kZ.a(((float)(((float) (-p2)))), ((float)(((float) p2))), ((float)(((float) p2))));
    moom.kZ.b(((float)(0x1.68p7f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)));
    float local6 = ((net.minecraft.entity.EntityLivingBase)(p5)).a2;
    float local7 = ((net.minecraft.entity.EntityLivingBase)(p5)).w;
    float local8 = ((net.minecraft.entity.EntityLivingBase)(p5)).x;
    float local9 = ((net.minecraft.entity.EntityLivingBase)(p5)).a5;
    float local10 = ((net.minecraft.entity.EntityLivingBase)(p5)).a4;
    moom.kZ.b(((float)(0x1.0ep7f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)));
    moom.lt.b();
    moom.kZ.b(((float)(-0x1.0ep7f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)));
    moom.kZ.b(((float)(((-((float) java.lang.Math.atan(((double)(((double) (p4 / 0x1.4p5f))))))) * 0x1.4p4f))), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)));
    ((net.minecraft.entity.EntityLivingBase)(p5)).a2 = ((float)((((float) java.lang.Math.atan(((double)(((double) (p3 / 0x1.4p5f)))))) * 0x1.4p4f)));
    ((net.minecraft.entity.EntityLivingBase)(p5)).w = ((float)((((float) java.lang.Math.atan(((double)(((double) (p3 / 0x1.4p5f)))))) * 0x1.4p5f)));
    ((net.minecraft.entity.EntityLivingBase)(p5)).x = ((float)(((-((float) java.lang.Math.atan(((double)(((double) (p4 / 0x1.4p5f))))))) * 0x1.4p4f)));
    ((net.minecraft.entity.EntityLivingBase)(p5)).a4 = ((float)(((net.minecraft.entity.EntityLivingBase)(p5)).w));
    ((net.minecraft.entity.EntityLivingBase)(p5)).a5 = ((float)(((net.minecraft.entity.EntityLivingBase)(p5)).w));
    moom.kZ.b(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)));
    net.minecraft.client.renderer.entity.RenderManager local11 = ((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).a__nw();
    ((net.minecraft.client.renderer.entity.RenderManager)(local11)).a(((float)(0x1.68p7f)));
    ((net.minecraft.client.renderer.entity.RenderManager)(local11)).a__Void(((boolean)(false)));
    ((net.minecraft.client.renderer.entity.RenderManager)(local11)).a__Boolean(((net.minecraft.entity.Entity)(p5)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)));
    ((net.minecraft.client.renderer.entity.RenderManager)(local11)).a__Void(((boolean)(true)));
    ((net.minecraft.entity.EntityLivingBase)(p5)).a2 = ((float)(local6));
    ((net.minecraft.entity.EntityLivingBase)(p5)).w = ((float)(local7));
    ((net.minecraft.entity.EntityLivingBase)(p5)).x = ((float)(local8));
    ((net.minecraft.entity.EntityLivingBase)(p5)).a5 = ((float)(local9));
    ((net.minecraft.entity.EntityLivingBase)(p5)).a4 = ((float)(local10));
    moom.kZ.C();
    moom.lt.a();
    moom.kZ.z();
    moom.kZ.g(((int)(net.minecraft.client.renderer.OpenGlHelper.r)));
    moom.kZ.v();
    moom.kZ.g(((int)(net.minecraft.client.renderer.OpenGlHelper.q)));
    return;
}


protected void a(float p0, int p1, int p2) {
long local4 = (moom.hu.cb ^ 11984972856085L);
    moom.kZ.c(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    ((net.minecraft.client.renderer.texture.TextureManager)(((net.minecraft.client.Minecraft)(this.i)).a__ok())).a__Void(((moom.DD)(moom.hu.w)));
    int local6 = this.A;
    int local7 = this.B;
    ((moom.hu)(this)).b(((int)(local6)), ((int)(local7)), ((int)(0)), ((int)(0)), ((int)(this.x)), ((int)(this.y)));
    moom.hu.a(((int)((local6 + __sourceIntrinsic_3f29d380c6dd_originalDynamicSite1501_11(11106, (8944776112612580395L ^ local4))))), ((int)((local7 + __sourceIntrinsic_3f29d380c6dd_originalDynamicSite1501_12(27042, (5899991796678909674L ^ local4))))), ((int)(__sourceIntrinsic_3f29d380c6dd_originalDynamicSite1501_13(10660, (5867110974845198057L ^ local4)))), ((float)((((float) (local6 + __sourceIntrinsic_3f29d380c6dd_originalDynamicSite1501_14(1610, (9126560759563432198L ^ local4)))) - this.aa))), ((float)((((float) ((local7 + __sourceIntrinsic_3f29d380c6dd_originalDynamicSite1501_16(13208, (188301937834362071L ^ local4))) - __sourceIntrinsic_3f29d380c6dd_originalDynamicSite1501_17(21608, (7242970160222266146L ^ local4)))) - this.ab))), ((net.minecraft.entity.EntityLivingBase)(((net.minecraft.client.Minecraft)(this.i)).K)));
    return;
}


public void a(int p0, int p1, float p2) {
super.a(((int)(p0)), ((int)(p1)), ((float)(p2)));
    this.aa = ((float)(((float) p0)));
    this.ab = ((float)(((float) p1)));
    return;
}


protected void a__Void(moom.gc p0) throws java.io.IOException {
try {
        if ((((moom.gc)(p0)).l == 0)) {
        ((net.minecraft.client.Minecraft)(this.i)).a(((net.minecraft.client.gui.GuiScreen)(new net.minecraft.client.gui.achievement.GuiAchievements(this, ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(this.i)).K)).a__sourceReturn_d483ce8cb5()))));
    }
    } catch (java.io.IOException caught_rethrow_0) {
        throw moom.hu.c(((java.lang.Exception)(caught_rethrow_0)));
    }
    try {
        if ((((moom.gc)(p0)).l == 1)) {
        ((net.minecraft.client.Minecraft)(this.i)).a(((net.minecraft.client.gui.GuiScreen)(new net.minecraft.client.gui.achievement.GuiStats(this, ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(this.i)).K)).a__sourceReturn_d483ce8cb5()))));
    }
    } catch (java.io.IOException caught_rethrow_1) {
        throw moom.hu.c(((java.lang.Exception)(caught_rethrow_1)));
    }
    super.a__Void(((moom.gc)(p0)));
    return;
}


public void g() {
try {
        if (((moom.jI)(((net.minecraft.client.Minecraft)(this.i)).F)).e()) {
        ((net.minecraft.client.Minecraft)(this.i)).a(((net.minecraft.client.gui.GuiScreen)(new moom.ht(((net.minecraft.client.Minecraft)(this.i)).K))));
    }
    } catch (moom.Oo caught_rethrow_0) {
        throw moom.hu.c(((java.lang.Exception)(caught_rethrow_0)));
    }
    ((moom.hu)(this)).b__sourceReturn_da8c82d5d4();
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_45fde0f4e55e_originalDynamicSite1499_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_5c8d2e4b3bac_methodHandleLiteral7953_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3f29d380c6dd_originalDynamicSite1501_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3f29d380c6dd_originalDynamicSite1501_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3f29d380c6dd_originalDynamicSite1501_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3f29d380c6dd_originalDynamicSite1501_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3f29d380c6dd_originalDynamicSite1501_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3f29d380c6dd_originalDynamicSite1501_17(int a0, long a1) throws E;
}
