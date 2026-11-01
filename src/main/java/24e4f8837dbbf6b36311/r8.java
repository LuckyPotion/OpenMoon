package moom;


public class r8 extends net.minecraft.client.particle.EntityFX {

private static long bb;

private static long hb;

protected r8(net.minecraft.world.World p0, double p1, double p2, double p3, double p4, double p5, double p6) { super((net.minecraft.world.World)null, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D); }


private static void __sourceConstructorBody_ff9007a9aec2d8fa(moom.r8 receiver, net.minecraft.world.World p0, double p1, double p2, double p3, double p4, double p5, double p6) throws Throwable {

long local14_life1 = (moom.r8.bb ^ 76625671861006L);

    moom.r8.__sourceConstructorInit_ff9007a9aec2d8fa_0(((moom.r8)(receiver)), ((net.minecraft.world.World)(p0)), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((double)(p4)), ((double)(p5)), ((double)(p6)));

    ((moom.r8)(receiver)).aM = ((float)(0x1.0p0f));

    ((moom.r8)(receiver)).aN = ((float)(0x1.0p0f));

    ((moom.r8)(receiver)).aO = ((float)(0x1.0p0f));

    ((moom.r8)(receiver)).g(((int)(((int) moom.r8.hb))));

    ((moom.r8)(receiver)).a__Void(((float)(0x1.47ae14p-6f)), ((float)(0x1.47ae14p-6f)));

    receiver.aK *= ((((java.util.Random)(((moom.r8)(receiver)).ah)).nextFloat() * 0x1.333334p-1f) + 0x1.99999ap-3f);

    ((moom.r8)(receiver)).t = ((double)(((p4 * 0x1.99999ap-3d) + (((java.lang.Math.random() * 0x1.0p1d) - 0x1.0p0d) * 0x1.47ae14p-6d))));

    ((moom.r8)(receiver)).u = ((double)(((p5 * 0x1.99999ap-3d) + (((java.lang.Math.random() * 0x1.0p1d) - 0x1.0p0d) * 0x1.47ae14p-6d))));

    ((moom.r8)(receiver)).v = ((double)(((p6 * 0x1.99999ap-3d) + (((java.lang.Math.random() * 0x1.0p1d) - 0x1.0p0d) * 0x1.47ae14p-6d))));

    ((moom.r8)(receiver)).aJ = ((int)(((int) (0x1.0p3d / ((java.lang.Math.random() * 0x1.999999999999ap-1d) + 0x1.999999999999ap-3d)))));

    return;

}



static {
bb = ((long)(((moom._a)(moom._c.a(((long)(6431623801090290072L)), ((long)(-8637442214969243935L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(89819472554709L)))));
    long local0_life6 = (moom.r8.bb ^ 14264701672878L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill980_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill980_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill980_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill980_13 = new byte[8];
    (__sourceSpill980_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill980_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation980_15 = __sourceSpill980_13;
    ((javax.crypto.Cipher)(__sourceSpill980_10)).init(((int)(__sourceSpill980_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill980_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation980_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -3617332829312445877L;
    byte[] __sourceSpill980_19 = new byte[8];
    (__sourceSpill980_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill980_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill980_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill980_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill980_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill980_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill980_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill980_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill980_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill980_20)).doFinal(((byte[])(__sourceSpill980_19)));
    hb = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}

private static native <E extends Throwable> void __sourceConstructorInit_ff9007a9aec2d8fa_0(moom.r8 a0, net.minecraft.world.World a1, double a2, double a3, double a4, double a5, double a6, double a7) throws E;

private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void g__Void() {
this.k = ((double)(this.n));
    this.l = ((double)(this.o));
    this.m = ((double)(this.p));
    moom.r8 __stackOp3891_6_0 = this;
    ((moom.r8)(__stackOp3891_6_0)).u = ((double)((((moom.r8)(__stackOp3891_6_0)).u + 0x1.0624dd2f1a9fcp-9d)));
    ((moom.r8)(this)).b__Void(((double)(this.t)), ((double)(this.u)), ((double)(this.v)));
    moom.r8 __stackOp3891_13_0 = this;
    ((moom.r8)(__stackOp3891_13_0)).t = ((double)((((moom.r8)(__stackOp3891_13_0)).t * 0x1.b33334p-1d)));
    moom.r8 __stackOp3891_16_0 = this;
    ((moom.r8)(__stackOp3891_16_0)).u = ((double)((((moom.r8)(__stackOp3891_16_0)).u * 0x1.b33334p-1d)));
    moom.r8 __stackOp3891_19_0 = this;
    ((moom.r8)(__stackOp3891_19_0)).v = ((double)((((moom.r8)(__stackOp3891_19_0)).v * 0x1.b33334p-1d)));
    if ((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(this.i)).a__fE(((moom.DT)(new moom.DT(this)))))).a__ch())).a__fn() != moom.fn.h)) {
        ((moom.r8)(this)).f__Void();
    }
    moom.r8 __stackOp3891_28_0 = this;
    moom.r8 __stackOp3891_30_0 = __stackOp3891_28_0;
    int __stackOp3891_30_1 = ((moom.r8)(__stackOp3891_28_0)).aJ;
    int spill3891_0 = __stackOp3891_30_1;
    ((moom.r8)(__stackOp3891_30_0)).aJ = ((int)((__stackOp3891_30_1 - 1)));
    if ((spill3891_0 <= 0)) {
        ((moom.r8)(this)).f__Void();
    }
    return;
}

}
