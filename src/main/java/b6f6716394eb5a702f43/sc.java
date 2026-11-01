package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class sc extends net.minecraft.client.particle.EntityFX {

private moom.fn aV;

private int aW;

private static long bb;

private static long[] hb;

private static java.lang.Integer[] ib;

private static java.util.Map jb;

protected sc(net.minecraft.world.World p0, double p1, double p2, double p3, moom.fn p4) { super((net.minecraft.world.World)null, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D); }


private static void __sourceConstructorBody_5692ad412a3eae2e(moom.sc receiver, net.minecraft.world.World p0, double p1, double p2, double p3, moom.fn p4) throws Throwable {

moom.sc spill497_0;

    moom.sc spill497_1;

    double spill497_2;

    double spill497_3;

    moom.sc spill497_4;

    moom.sc spill497_5;

    double spill497_6;

    double spill497_7;

    long life9_3;

    life9_3 = (moom.sc.bb ^ 59346163241604L);

    moom.sc.__sourceConstructorInit_5692ad412a3eae2e_0(((moom.sc)(receiver)), ((net.minecraft.world.World)(p0)), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)));

    spill497_0 = receiver;

    spill497_1 = receiver;

    moom.sc __stackOp497_2_0 = receiver;

    double __stackOp497_2_1 = 0x0.0p0d;

    spill497_2 = __stackOp497_2_1;

    ((moom.sc)(__stackOp497_2_0)).v = ((double)(__stackOp497_2_1));

    moom.sc __stackOp497_4_0 = spill497_1;

    double __stackOp497_4_1 = spill497_2;

    spill497_3 = __stackOp497_4_1;

    ((moom.sc)(__stackOp497_4_0)).u = ((double)(__stackOp497_4_1));

    ((moom.sc)(spill497_0)).t = ((double)(spill497_3));

    if ((p4 == moom.fn.h)) {

        ((moom.sc)(receiver)).aM = ((float)(0x0.0p0f));

        ((moom.sc)(receiver)).aN = ((float)(0x0.0p0f));

        ((moom.sc)(receiver)).aO = ((float)(0x1.0p0f));

    } else {

        ((moom.sc)(receiver)).aM = ((float)(0x1.0p0f));

        ((moom.sc)(receiver)).aN = ((float)(0x0.0p0f));

        ((moom.sc)(receiver)).aO = ((float)(0x0.0p0f));

    }

    ((moom.sc)(receiver)).g(((int)(__sourceIntrinsic_5692ad412a3eae2e_invokedynamic497_14(21712, (8933035549379282294L ^ life9_3)))));

    ((moom.sc)(receiver)).a__Void(((float)(0x1.47ae14p-7f)), ((float)(0x1.47ae14p-7f)));

    ((moom.sc)(receiver)).aL = ((float)(0x1.eb851ep-5f));

    ((moom.sc)(receiver)).aV = ((moom.fn)(p4));

    ((moom.sc)(receiver)).aW = ((int)(__sourceIntrinsic_5692ad412a3eae2e_invokedynamic497_19(3961, (6613986584946712282L ^ life9_3))));

    ((moom.sc)(receiver)).aJ = ((int)(((int) (0x1.0p6d / ((java.lang.Math.random() * 0x1.999999999999ap-1d) + 0x1.999999999999ap-3d)))));

    spill497_4 = receiver;

    spill497_5 = receiver;

    moom.sc __stackOp497_23_0 = receiver;

    double __stackOp497_23_1 = 0x0.0p0d;

    spill497_6 = __stackOp497_23_1;

    ((moom.sc)(__stackOp497_23_0)).v = ((double)(__stackOp497_23_1));

    moom.sc __stackOp497_25_0 = spill497_5;

    double __stackOp497_25_1 = spill497_6;

    spill497_7 = __stackOp497_25_1;

    ((moom.sc)(__stackOp497_25_0)).u = ((double)(__stackOp497_25_1));

    ((moom.sc)(spill497_4)).t = ((double)(spill497_7));

    return;

}



static {
bb = ((long)(((moom._a)(moom._c.a(((long)(-8965424508540915906L)), ((long)(2376697668576226684L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(176217830744159L)))));
    jb = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.sc.bb ^ 10077975610637L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1529_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1529_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1529_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1529_14 = new byte[8];
    (__sourceSpill1529_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1529_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1529_16 = __sourceSpill1529_14;
    ((javax.crypto.Cipher)(__sourceSpill1529_11)).init(((int)(__sourceSpill1529_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1529_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1529_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[9];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "\000\023 ½®m÷|&\n®Ù&Ûó\006øiÐ\0338³î\024\002¬(ßÜº}!FT¨3\025,¯ükÜô\035õ¦"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1529_25 = local6_life21;
        int __sourceSpill1529_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1529_25)).substring(((int)(__sourceSpill1529_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1529_30 = local8_life19;
        int __sourceSpill1529_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1529_33 = new byte[8];
        (__sourceSpill1529_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1529_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1529_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1529_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1529_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1529_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1529_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1529_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1529_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1529_34)).doFinal(((byte[])(__sourceSpill1529_33)));
        (__sourceSpill1529_30)[__sourceSpill1529_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "\023¹y\025@$s\005áêrN ®\020U"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1529_38 = local6_life21;
        int __sourceSpill1529_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1529_38)).substring(((int)(__sourceSpill1529_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1529_43 = local8_life19;
        int __sourceSpill1529_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1529_46 = new byte[8];
        (__sourceSpill1529_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1529_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1529_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1529_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1529_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1529_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1529_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1529_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1529_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1529_47)).doFinal(((byte[])(__sourceSpill1529_46)));
        (__sourceSpill1529_43)[__sourceSpill1529_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    hb = ((long[])(local8_life19));
    ib = ((java.lang.Integer[])(new java.lang.Integer[9]));
}

private static native <E extends Throwable> void __sourceConstructorInit_5692ad412a3eae2e_0(moom.sc a0, net.minecraft.world.World a1, double a2, double a3, double a4, double a5, double a6, double a7) throws E;

private static int c(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 8147;
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
            throw new RuntimeException("moom/sc", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         ib[var3] = var15;
      }

      return ib[var3];
}


private static int c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_35598b0975a875(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral9055_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/sc"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public float a__sourceReturn_f6c4892e39(float p0) {
return ((this.aV == moom.fn.h) ? super.a(((float)(p0))) : 0x1.0p0f);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public int a__Int(float p0) {
long local2 = (moom.sc.bb ^ 12714591839907L);
    return ((this.aV == moom.fn.h) ? super.a__Int(((float)(p0))) : __sourceIntrinsic_dbecb07edf7c_invokedynamic9056_4(14352, (5939146413130046870L ^ local2)));
}


public void g__Void() {
long life1_3;
    moom.DT life3_216;
    net.minecraft.block.state.IBlockState life4_221;
    moom.fn life5_225;
    double life6_236;
    double life8_257;
    forward_join_250: {
    forward_join_234: {
    forward_join_220: {
    forward_join_200: {
    forward_join_188: {
    forward_join_181: {
    forward_join_156: {
    forward_join_120: {
    forward_join_113: {
    forward_join_71: {
    forward_join_30: {
    life1_3 = (moom.sc.bb ^ 103035820084509L);
    this.k = ((double)(this.n));
    this.l = ((double)(this.o));
    this.m = ((double)(this.p));
    if (!((this.aV == moom.fn.h))) { break forward_join_30; }
    this.aM = ((float)(0x1.99999ap-3f));
    this.aN = ((float)(0x1.333334p-2f));
    this.aO = ((float)(0x1.0p0f));
    break forward_join_71;
    }
    this.aM = ((float)(0x1.0p0f));
    this.aN = ((float)((0x1.0p4f / ((float) ((__sourceIntrinsic_736a66cda11e_invokedynamic3994_13(23802, (7702616573956477636L ^ life1_3)) - this.aW) + __sourceIntrinsic_736a66cda11e_invokedynamic3994_15(28070, (3251453531854660500L ^ life1_3)))))));
    this.aO = ((float)((0x1.0p2f / ((float) ((__sourceIntrinsic_736a66cda11e_invokedynamic3994_17(23802, (7702616573956477636L ^ life1_3)) - this.aW) + __sourceIntrinsic_736a66cda11e_invokedynamic3994_19(12703, (2265082415188950948L ^ life1_3)))))));
    }
    moom.sc __stackOp3994_21_0 = this;
    ((moom.sc)(__stackOp3994_21_0)).u = ((double)((((moom.sc)(__stackOp3994_21_0)).u - ((double) this.aL))));
    moom.sc __stackOp3994_25_0 = this;
    moom.sc __stackOp3994_27_0 = __stackOp3994_25_0;
    int __stackOp3994_27_1 = ((moom.sc)(__stackOp3994_25_0)).aW;
    int spill3994_0 = __stackOp3994_27_1;
    ((moom.sc)(__stackOp3994_27_0)).aW = ((int)((__stackOp3994_27_1 - 1)));
    if (!((spill3994_0 > 0))) { break forward_join_113; }
    moom.sc __stackOp3994_29_0 = this;
    ((moom.sc)(__stackOp3994_29_0)).t = ((double)((((moom.sc)(__stackOp3994_29_0)).t * 0x1.47ae147ae147bp-6d)));
    moom.sc __stackOp3994_32_0 = this;
    ((moom.sc)(__stackOp3994_32_0)).u = ((double)((((moom.sc)(__stackOp3994_32_0)).u * 0x1.47ae147ae147bp-6d)));
    moom.sc __stackOp3994_35_0 = this;
    ((moom.sc)(__stackOp3994_35_0)).v = ((double)((((moom.sc)(__stackOp3994_35_0)).v * 0x1.47ae147ae147bp-6d)));
    ((moom.sc)(this)).g(((int)(__sourceIntrinsic_736a66cda11e_invokedynamic3994_38(8965, (2273454972586011960L ^ life1_3)))));
    break forward_join_120;
    }
    ((moom.sc)(this)).g(((int)(__sourceIntrinsic_736a66cda11e_invokedynamic3994_40(32157, (3147740358877213601L ^ life1_3)))));
    }
    ((moom.sc)(this)).b__Void(((double)(this.t)), ((double)(this.u)), ((double)(this.v)));
    moom.sc __stackOp3994_46_0 = this;
    ((moom.sc)(__stackOp3994_46_0)).t = ((double)((((moom.sc)(__stackOp3994_46_0)).t * 0x1.f5c29p-1d)));
    moom.sc __stackOp3994_49_0 = this;
    ((moom.sc)(__stackOp3994_49_0)).u = ((double)((((moom.sc)(__stackOp3994_49_0)).u * 0x1.f5c29p-1d)));
    moom.sc __stackOp3994_52_0 = this;
    ((moom.sc)(__stackOp3994_52_0)).v = ((double)((((moom.sc)(__stackOp3994_52_0)).v * 0x1.f5c29p-1d)));
    moom.sc __stackOp3994_55_0 = this;
    moom.sc __stackOp3994_57_0 = __stackOp3994_55_0;
    int __stackOp3994_57_1 = ((moom.sc)(__stackOp3994_55_0)).aJ;
    int spill3994_1 = __stackOp3994_57_1;
    ((moom.sc)(__stackOp3994_57_0)).aJ = ((int)((__stackOp3994_57_1 - 1)));
    if (!((spill3994_1 <= 0))) { break forward_join_156; }
    ((moom.sc)(this)).f__Void();
    }
    if (!(this.A)) { break forward_join_200; }
    if (!((this.aV == moom.fn.h))) { break forward_join_181; }
    ((moom.sc)(this)).f__Void();
    ((net.minecraft.world.World)(this.i)).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.WATER_SPLASH)), ((double)(this.n)), ((double)(this.o)), ((double)(this.p)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((int[])(new int[0])));
    break forward_join_188;
    }
    ((moom.sc)(this)).g(((int)(__sourceIntrinsic_736a66cda11e_invokedynamic3994_70(20036, (7693226989613662333L ^ life1_3)))));
    }
    moom.sc __stackOp3994_72_0 = this;
    ((moom.sc)(__stackOp3994_72_0)).t = ((double)((((moom.sc)(__stackOp3994_72_0)).t * 0x1.666666p-1d)));
    moom.sc __stackOp3994_75_0 = this;
    ((moom.sc)(__stackOp3994_75_0)).v = ((double)((((moom.sc)(__stackOp3994_75_0)).v * 0x1.666666p-1d)));
    }
    life3_216 = new moom.DT(this);
    life4_221 = ((net.minecraft.world.World)(this.i)).a__fE(((moom.DT)(life3_216)));
    life5_225 = ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(life4_221)).a__ch())).a__fn();
    if (!((!((moom.fn)(life5_225)).a__Boolean()))) { break forward_join_220; }
    if (!(((moom.fn)(life5_225)).b__Boolean())) { break forward_join_250; }
    }
    life6_236 = 0x0.0p0d;
    if (!((((((net.minecraft.block.state.IBlockState)(life4_221)).a__ch() instanceof net.minecraft.block.BlockLiquid) ? 1 : 0) != 0))) { break forward_join_234; }
    life6_236 = ((double) __sourceExactCall_47df7ec8ca7351(((int)(((java.lang.Integer)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(life4_221)).a(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockLiquid.Q))))))).intValue()))));
    }
    life8_257 = (((double) (moom.Dr.b__Int(((double)(this.o))) + 1)) - life6_236);
    if (!((recovery.source.CarrierOps.dcmpg(((double)(this.o)), ((double)(life8_257))) < 0))) { break forward_join_250; }
    ((moom.sc)(this)).f__Void();
    }
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_5692ad412a3eae2e_invokedynamic497_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5692ad412a3eae2e_invokedynamic497_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_dbecb07edf7c_invokedynamic9056_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral9055_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_736a66cda11e_invokedynamic3994_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_736a66cda11e_invokedynamic3994_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_736a66cda11e_invokedynamic3994_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_736a66cda11e_invokedynamic3994_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_736a66cda11e_invokedynamic3994_38(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_736a66cda11e_invokedynamic3994_40(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_736a66cda11e_invokedynamic3994_70(int a0, long a1) throws E;

private static native int __sourceExactCall_35598b0975a875(int p0, long p1);
private static native float __sourceExactCall_47df7ec8ca7351(int p0);
}
