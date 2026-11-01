package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class sa extends net.minecraft.client.particle.EntityFX {

private net.minecraft.block.state.IBlockState aV;

private moom.DT aW;

private static long bb;

private static long[] hb;

private static java.lang.Integer[] ib;

private static java.util.Map jb;

protected sa(net.minecraft.world.World p0, double p1, double p2, double p3, double p4, double p5, double p6, net.minecraft.block.state.IBlockState p7) { super((net.minecraft.world.World)null, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D); }


private static void __sourceConstructorBody_3a37f42db2f2624e(moom.sa receiver, net.minecraft.world.World p0, double p1, double p2, double p3, double p4, double p5, double p6, net.minecraft.block.state.IBlockState p7) throws Throwable {

moom.sa spill496_0;

    moom.sa spill496_1;

    float spill496_2;

    float spill496_3;

    moom.sa.__sourceConstructorInit_3a37f42db2f2624e_0(((moom.sa)(receiver)), ((net.minecraft.world.World)(p0)), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((double)(p4)), ((double)(p5)), ((double)(p6)));

    ((moom.sa)(receiver)).aV = ((net.minecraft.block.state.IBlockState)(p7));

    ((moom.sa)(receiver)).a(((net.minecraft.client.renderer.texture.TextureAtlasSprite)(((net.minecraft.client.renderer.BlockModelShapes)(((net.minecraft.client.renderer.BlockRendererDispatcher)(((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).a__kP())).a__kN())).a(((net.minecraft.block.state.IBlockState)(p7))))));

    ((moom.sa)(receiver)).aL = ((float)(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(p7)).a__ch())).I));

    spill496_0 = receiver;

    spill496_1 = receiver;

    moom.sa __stackOp496_10_0 = receiver;

    float __stackOp496_10_1 = 0x1.333334p-1f;

    spill496_2 = __stackOp496_10_1;

    ((moom.sa)(__stackOp496_10_0)).aO = ((float)(__stackOp496_10_1));

    moom.sa __stackOp496_12_0 = spill496_1;

    float __stackOp496_12_1 = spill496_2;

    spill496_3 = __stackOp496_12_1;

    ((moom.sa)(__stackOp496_12_0)).aN = ((float)(__stackOp496_12_1));

    ((moom.sa)(spill496_0)).aM = ((float)(spill496_3));

    moom.sa __stackOp496_15_0 = receiver;

    ((moom.sa)(__stackOp496_15_0)).aK = ((float)((((moom.sa)(__stackOp496_15_0)).aK / 0x1.0p1f)));

    return;

}



static {
bb = ((long)(((moom._a)(moom._c.a(((long)(4215027466704776968L)), ((long)(1747530025651854200L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(181887956403667L)))));
    jb = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.sa.bb ^ 86730328974152L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1528_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1528_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1528_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1528_14 = new byte[8];
    (__sourceSpill1528_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1528_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1528_16 = __sourceSpill1528_14;
    ((javax.crypto.Cipher)(__sourceSpill1528_11)).init(((int)(__sourceSpill1528_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1528_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1528_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[8];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "\034@¥ÜQØSàê\b\021ká,\031ÉÂ\nÇ\013\004>bÈëUáÑi0beÙä'\025k:è°;e"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1528_25 = local6_life21;
        int __sourceSpill1528_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1528_25)).substring(((int)(__sourceSpill1528_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1528_30 = local8_life19;
        int __sourceSpill1528_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1528_33 = new byte[8];
        (__sourceSpill1528_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1528_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1528_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1528_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1528_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1528_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1528_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1528_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1528_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1528_34)).doFinal(((byte[])(__sourceSpill1528_33)));
        (__sourceSpill1528_30)[__sourceSpill1528_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "¦}Õ:Ív³§Ïg¾"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1528_38 = local6_life21;
        int __sourceSpill1528_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1528_38)).substring(((int)(__sourceSpill1528_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1528_43 = local8_life19;
        int __sourceSpill1528_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1528_46 = new byte[8];
        (__sourceSpill1528_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1528_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1528_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1528_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1528_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1528_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1528_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1528_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1528_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1528_47)).doFinal(((byte[])(__sourceSpill1528_46)));
        (__sourceSpill1528_43)[__sourceSpill1528_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    hb = ((long[])(local8_life19));
    ib = ((java.lang.Integer[])(new java.lang.Integer[8]));
}

private static native <E extends Throwable> void __sourceConstructorInit_3a37f42db2f2624e_0(moom.sa a0, net.minecraft.world.World a1, double a2, double a3, double a4, double a5, double a6, double a7) throws E;

public boolean b__Boolean() {
return ((1) != 0);
}


private static int c(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 26733;
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
            throw new RuntimeException("moom/sa", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         ib[var3] = var15;
      }

      return ib[var3];
}


private static int c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.sa.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral9051_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/sa"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public int a__Int() {
return 1;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(moom.lw p0, net.minecraft.entity.Entity p1, float p2, float p3, float p4, float p5, float p6, float p7) {
long local9 = (moom.sa.bb ^ 121418763313084L);
    float local11 = ((((float) this.aE) + (this.aG / 0x1.0p2f)) / 0x1.0p4f);
    float local12 = (local11 + 0x1.ff7ceep-7f);
    float local13 = ((((float) this.aF) + (this.aH / 0x1.0p2f)) / 0x1.0p4f);
    float local14 = (local13 + 0x1.ff7ceep-7f);
    float local15 = (0x1.99999ap-4f * this.aK);
    if ((this.aQ != null)) {
        local11 = ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(this.aQ)).a(((double)(((double) ((this.aG / 0x1.0p2f) * 0x1.0p4f)))));
        local12 = ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(this.aQ)).a(((double)(((double) (((this.aG + 0x1.0p0f) / 0x1.0p2f) * 0x1.0p4f)))));
        local13 = ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(this.aQ)).b(((double)(((double) ((this.aH / 0x1.0p2f) * 0x1.0p4f)))));
        local14 = ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(this.aQ)).b(((double)(((double) (((this.aH + 0x1.0p0f) / 0x1.0p2f) * 0x1.0p4f)))));
    }
    float local16 = ((float) ((this.k + ((this.n - this.k) * ((double) p2))) - moom.sa.aR));
    float local17 = ((float) ((this.l + ((this.o - this.l) * ((double) p2))) - moom.sa.aS));
    float local18 = ((float) ((this.m + ((this.p - this.m) * ((double) p2))) - moom.sa.aT));
    int local19 = ((moom.sa)(this)).a__Int(((float)(p2)));
    int local20 = ((local19 >> __sourceIntrinsic_54c23c7634ff_invokedynamic7524_32(4450, (9188375246534743688L ^ local9))) & __sourceIntrinsic_54c23c7634ff_invokedynamic7524_33(22987, (8297359476634115621L ^ local9)));
    int local21 = (local19 & __sourceIntrinsic_54c23c7634ff_invokedynamic7524_34(22352, (2092905877901529276L ^ local9)));
    ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(p0)).a(((double)(((double) ((local16 - (p3 * local15)) - (p6 * local15))))), ((double)(((double) (local17 - (p4 * local15))))), ((double)(((double) ((local18 - (p5 * local15)) - (p7 * local15)))))))).a(((double)(((double) local11))), ((double)(((double) local14)))))).a(((float)(this.aM)), ((float)(this.aN)), ((float)(this.aO)), ((float)(0x1.0p0f))))).a(((int)(local20)), ((int)(local21))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(p0)).a(((double)(((double) ((local16 - (p3 * local15)) + (p6 * local15))))), ((double)(((double) (local17 + (p4 * local15))))), ((double)(((double) ((local18 - (p5 * local15)) + (p7 * local15)))))))).a(((double)(((double) local11))), ((double)(((double) local13)))))).a(((float)(this.aM)), ((float)(this.aN)), ((float)(this.aO)), ((float)(0x1.0p0f))))).a(((int)(local20)), ((int)(local21))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(p0)).a(((double)(((double) ((local16 + (p3 * local15)) + (p6 * local15))))), ((double)(((double) (local17 + (p4 * local15))))), ((double)(((double) ((local18 + (p5 * local15)) + (p7 * local15)))))))).a(((double)(((double) local12))), ((double)(((double) local13)))))).a(((float)(this.aM)), ((float)(this.aN)), ((float)(this.aO)), ((float)(0x1.0p0f))))).a(((int)(local20)), ((int)(local21))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(p0)).a(((double)(((double) ((local16 + (p3 * local15)) - (p6 * local15))))), ((double)(((double) (local17 - (p4 * local15))))), ((double)(((double) ((local18 + (p5 * local15)) - (p7 * local15)))))))).a(((double)(((double) local12))), ((double)(((double) local14)))))).a(((float)(this.aM)), ((float)(this.aN)), ((float)(this.aO)), ((float)(0x1.0p0f))))).a(((int)(local20)), ((int)(local21))))).c__Void();
    return;
}


public int a__Int(float p0) {
int local2 = super.a__Int(((float)(p0)));
    int local3 = 0;
    if ((__sourceIntrinsic_booleanComparison(((net.minecraft.world.World)(this.i)).c__Boolean(((moom.DT)(this.aW)))) != 0)) {
        local3 = ((net.minecraft.world.World)(this.i)).a(((moom.DT)(this.aW)), ((int)(0)));
    }
    return ((local2 == 0) ? local3 : local2);
}


public moom.sa a__sa() {
long life1_3;
    net.minecraft.block.Block life3_18;
    int life4_26;
    life1_3 = (moom.sa.bb ^ 37629700149125L);
    this.aW = ((moom.DT)(new moom.DT(this.n, this.o, this.p)));
    life3_18 = ((net.minecraft.block.state.IBlockState)(this.aV)).a__ch();
    if ((life3_18 != net.minecraft.init.Blocks.c)) {
        life4_26 = ((net.minecraft.block.Block)(life3_18)).d(((net.minecraft.block.state.IBlockState)(this.aV)));
        moom.sa __stackOp3993_10_0 = this;
        ((moom.sa)(__stackOp3993_10_0)).aM = ((float)((((moom.sa)(__stackOp3993_10_0)).aM * (((float) ((life4_26 >> __sourceIntrinsic_ba0446d528ec_invokedynamic3993_12(16790, (2575452105739327042L ^ life1_3))) & __sourceIntrinsic_ba0446d528ec_invokedynamic3993_13(16877, (9202482479019185727L ^ life1_3)))) / 0x1.fep7f))));
        moom.sa __stackOp3993_15_0 = this;
        ((moom.sa)(__stackOp3993_15_0)).aN = ((float)((((moom.sa)(__stackOp3993_15_0)).aN * (((float) ((life4_26 >> __sourceIntrinsic_ba0446d528ec_invokedynamic3993_17(15918, (643348164274432511L ^ life1_3))) & __sourceIntrinsic_ba0446d528ec_invokedynamic3993_18(16877, (9202482479019185727L ^ life1_3)))) / 0x1.fep7f))));
        moom.sa __stackOp3993_20_0 = this;
        ((moom.sa)(__stackOp3993_20_0)).aO = ((float)((((moom.sa)(__stackOp3993_20_0)).aO * (((float) (life4_26 & __sourceIntrinsic_ba0446d528ec_invokedynamic3993_22(16877, (9202482479019185727L ^ life1_3)))) / 0x1.fep7f))));
    }
    return this;
}


public moom.sa a__sourceReturn_9939664860(moom.DT p0) {
long life2_3;
    int life4_23;
    life2_3 = (moom.sa.bb ^ 71290336095242L);
    this.aW = ((moom.DT)(p0));
    if ((((net.minecraft.block.state.IBlockState)(this.aV)).a__ch() == net.minecraft.init.Blocks.c)) {
        return this;
    }
    life4_23 = ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(this.aV)).a__ch())).b(((net.minecraft.world.IBlockAccess)(this.i)), ((moom.DT)(p0)));
    moom.sa __stackOp3992_9_0 = this;
    ((moom.sa)(__stackOp3992_9_0)).aM = ((float)((((moom.sa)(__stackOp3992_9_0)).aM * (((float) ((life4_23 >> __sourceIntrinsic_7774ea8e35f7_invokedynamic3992_11(16790, (2575420053316859341L ^ life2_3))) & __sourceIntrinsic_7774ea8e35f7_invokedynamic3992_12(29478, (2835877393573300095L ^ life2_3)))) / 0x1.fep7f))));
    moom.sa __stackOp3992_14_0 = this;
    ((moom.sa)(__stackOp3992_14_0)).aN = ((float)((((moom.sa)(__stackOp3992_14_0)).aN * (((float) ((life4_23 >> __sourceIntrinsic_7774ea8e35f7_invokedynamic3992_16(7659, (4873010719405746612L ^ life2_3))) & __sourceIntrinsic_7774ea8e35f7_invokedynamic3992_17(16877, (9202450396565501360L ^ life2_3)))) / 0x1.fep7f))));
    moom.sa __stackOp3992_19_0 = this;
    ((moom.sa)(__stackOp3992_19_0)).aO = ((float)((((moom.sa)(__stackOp3992_19_0)).aO * (((float) (life4_23 & __sourceIntrinsic_7774ea8e35f7_invokedynamic3992_21(16877, (9202450396565501360L ^ life2_3)))) / 0x1.fep7f))));
    return this;
}


private static native <E extends Throwable> int __sourceIntrinsic_7774ea8e35f7_invokedynamic3992_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7774ea8e35f7_invokedynamic3992_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7774ea8e35f7_invokedynamic3992_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7774ea8e35f7_invokedynamic3992_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7774ea8e35f7_invokedynamic3992_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_54c23c7634ff_invokedynamic7524_32(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_54c23c7634ff_invokedynamic7524_33(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_54c23c7634ff_invokedynamic7524_34(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ba0446d528ec_invokedynamic3993_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ba0446d528ec_invokedynamic3993_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ba0446d528ec_invokedynamic3993_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ba0446d528ec_invokedynamic3993_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ba0446d528ec_invokedynamic3993_22(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral9051_0() throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
