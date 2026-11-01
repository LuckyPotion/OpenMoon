package moom;


public class st extends net.minecraft.client.particle.EntityFX {

private static long bb;

private static long hb;

protected st(net.minecraft.world.World p0, double p1, double p2, double p3) { super((net.minecraft.world.World)null, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D); }


private static void __sourceConstructorBody_bf5e25ed9945dd8f(moom.st receiver, net.minecraft.world.World p0, double p1, double p2, double p3) throws Throwable {

long local8_life1 = (moom.st.bb ^ 132622751032553L);

    moom.st.__sourceConstructorInit_bf5e25ed9945dd8f_0(((moom.st)(receiver)), ((net.minecraft.world.World)(p0)), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)));

    receiver.t *= 0x1.333334p-2d;

    ((moom.st)(receiver)).u = ((double)(((java.lang.Math.random() * 0x1.99999ap-3d) + 0x1.99999ap-4d)));

    receiver.v *= 0x1.333334p-2d;

    ((moom.st)(receiver)).aM = ((float)(0x1.0p0f));

    ((moom.st)(receiver)).aN = ((float)(0x1.0p0f));

    ((moom.st)(receiver)).aO = ((float)(0x1.0p0f));

    ((moom.st)(receiver)).g(((int)((((int) moom.st.hb) + ((java.util.Random)(((moom.st)(receiver)).ah)).nextInt(((int)(4)))))));

    ((moom.st)(receiver)).a__Void(((float)(0x1.47ae14p-7f)), ((float)(0x1.47ae14p-7f)));

    ((moom.st)(receiver)).aL = ((float)(0x1.eb851ep-5f));

    ((moom.st)(receiver)).aJ = ((int)(((int) (0x1.0p3d / ((java.lang.Math.random() * 0x1.999999999999ap-1d) + 0x1.999999999999ap-3d)))));

    return;

}



static {
bb = ((long)(((moom._a)(moom._c.a(((long)(-4341898379289612073L)), ((long)(-6484665002539065808L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(189365020362540L)))));
    long local0_life6 = (moom.st.bb ^ 104139002137990L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill1020_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1020_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1020_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1020_13 = new byte[8];
    (__sourceSpill1020_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill1020_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation1020_15 = __sourceSpill1020_13;
    ((javax.crypto.Cipher)(__sourceSpill1020_10)).init(((int)(__sourceSpill1020_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1020_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1020_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = 3758291705221799739L;
    byte[] __sourceSpill1020_19 = new byte[8];
    (__sourceSpill1020_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill1020_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill1020_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill1020_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill1020_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill1020_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill1020_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill1020_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill1020_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill1020_20)).doFinal(((byte[])(__sourceSpill1020_19)));
    hb = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}

private static native <E extends Throwable> void __sourceConstructorInit_bf5e25ed9945dd8f_0(moom.st a0, net.minecraft.world.World a1, double a2, double a3, double a4, double a5, double a6, double a7) throws E;

private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void g__Void() {
moom.DT life1_90;
    net.minecraft.block.state.IBlockState life2_95;
    net.minecraft.block.Block life3_98;
    moom.fn life4_107;
    double life5_118;
    double life5_132;
    double life7_143;
    forward_join_139: {
    forward_join_125: {
    forward_join_122: {
    forward_join_105: {
    forward_join_77: {
    forward_join_65: {
    forward_join_56: {
    this.k = ((double)(this.n));
    this.l = ((double)(this.o));
    this.m = ((double)(this.p));
    moom.st __stackOp4009_6_0 = this;
    ((moom.st)(__stackOp4009_6_0)).u = ((double)((((moom.st)(__stackOp4009_6_0)).u - ((double) this.aL))));
    ((moom.st)(this)).b__Void(((double)(this.t)), ((double)(this.u)), ((double)(this.v)));
    moom.st __stackOp4009_14_0 = this;
    ((moom.st)(__stackOp4009_14_0)).t = ((double)((((moom.st)(__stackOp4009_14_0)).t * 0x1.f5c29p-1d)));
    moom.st __stackOp4009_17_0 = this;
    ((moom.st)(__stackOp4009_17_0)).u = ((double)((((moom.st)(__stackOp4009_17_0)).u * 0x1.f5c29p-1d)));
    moom.st __stackOp4009_20_0 = this;
    ((moom.st)(__stackOp4009_20_0)).v = ((double)((((moom.st)(__stackOp4009_20_0)).v * 0x1.f5c29p-1d)));
    moom.st __stackOp4009_23_0 = this;
    moom.st __stackOp4009_25_0 = __stackOp4009_23_0;
    int __stackOp4009_25_1 = ((moom.st)(__stackOp4009_23_0)).aJ;
    int spill4009_0 = __stackOp4009_25_1;
    ((moom.st)(__stackOp4009_25_0)).aJ = ((int)((__stackOp4009_25_1 - 1)));
    if (!((spill4009_0 <= 0))) { break forward_join_56; }
    ((moom.st)(this)).f__Void();
    }
    if (!(this.A)) { break forward_join_77; }
    if (!((recovery.source.CarrierOps.dcmpg(((double)(java.lang.Math.random())), ((double)(0x1.0p-1d))) < 0))) { break forward_join_65; }
    ((moom.st)(this)).f__Void();
    }
    moom.st __stackOp4009_32_0 = this;
    ((moom.st)(__stackOp4009_32_0)).t = ((double)((((moom.st)(__stackOp4009_32_0)).t * 0x1.666666p-1d)));
    moom.st __stackOp4009_35_0 = this;
    ((moom.st)(__stackOp4009_35_0)).v = ((double)((((moom.st)(__stackOp4009_35_0)).v * 0x1.666666p-1d)));
    }
    life1_90 = new moom.DT(this);
    life2_95 = ((net.minecraft.world.World)(this.i)).a__fE(((moom.DT)(life1_90)));
    life3_98 = ((net.minecraft.block.state.IBlockState)(life2_95)).a__ch();
    ((net.minecraft.block.Block)(life3_98)).a__Void(((net.minecraft.world.IBlockAccess)(this.i)), ((moom.DT)(life1_90)));
    life4_107 = ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(life2_95)).a__ch())).a__fn();
    if (!((!((moom.fn)(life4_107)).a__Boolean()))) { break forward_join_105; }
    if (!(((moom.fn)(life4_107)).b__Boolean())) { break forward_join_139; }
    }
    life5_118 = 0x0.0p0d;
    if (!((((((net.minecraft.block.state.IBlockState)(life2_95)).a__ch() instanceof net.minecraft.block.BlockLiquid) ? 1 : 0) != 0))) { break forward_join_122; }
    life5_132 = ((double) (0x1.0p0f - __sourceExactCall_47df7ec8ca7351(((int)(((java.lang.Integer)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(life2_95)).a(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockLiquid.Q))))))).intValue())))));
    break forward_join_125;
    }
    life5_132 = ((net.minecraft.block.Block)(life3_98)).d();
    }
    life7_143 = (((double) moom.Dr.b__Int(((double)(this.o)))) + life5_132);
    if (!((recovery.source.CarrierOps.dcmpg(((double)(this.o)), ((double)(life7_143))) < 0))) { break forward_join_139; }
    ((moom.st)(this)).f__Void();
    }
    return;
}


private static native float __sourceExactCall_47df7ec8ca7351(int p0);
}
