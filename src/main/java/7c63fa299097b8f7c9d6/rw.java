package moom;


class rw extends moom.rd {

private final moom.rd c;

private static final long d;

private static final long f;

rw() {
super();
    this.c = new moom.rd();
}


static {
d = ((long)(((moom._a)(moom._c.a(((long)(-994748142610589511L)), ((long)(-805561887913892271L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(134583973728268L)))));
    long local0_life6 = (moom.rw.d ^ 66634419729629L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill1005_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1005_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1005_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1005_13 = new byte[8];
    (__sourceSpill1005_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill1005_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation1005_15 = __sourceSpill1005_13;
    ((javax.crypto.Cipher)(__sourceSpill1005_10)).init(((int)(__sourceSpill1005_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1005_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1005_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -8022837461618612733L;
    byte[] __sourceSpill1005_19 = new byte[8];
    (__sourceSpill1005_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill1005_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill1005_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill1005_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill1005_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill1005_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill1005_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill1005_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill1005_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill1005_20)).doFinal(((byte[])(__sourceSpill1005_19)));
    f = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public net.minecraft.item.ItemStack b(moom.ry p0, net.minecraft.item.ItemStack p1) {
net.minecraft.block.state.IBlockState forwardValue3934_55_0;
    net.minecraft.block.BlockRailBase$EnumRailDirection forwardValue3934_63_0;
    net.minecraft.block.state.IBlockState forwardValue3934_81_0;
    net.minecraft.block.state.IBlockState forwardValue3934_91_0;
    net.minecraft.block.state.IBlockState forwardValue3934_105_0;
    net.minecraft.block.state.IBlockState forwardValue3934_113_0;
    net.minecraft.block.BlockRailBase$EnumRailDirection forwardValue3934_121_0;
    int forwardValue3934_158_0;
    boolean spill3934_0;
    net.minecraft.block.state.IBlockState spill3934_1;
    net.minecraft.block.state.IBlockState spill3934_2;
    net.minecraft.block.state.IBlockState spill3934_3;
    boolean spill3934_4;
    long life3_3;
    moom.bs life6_7;
    net.minecraft.world.World life7_11;
    double life8_20;
    int life5_21;
    double life10_29;
    double life12_38;
    moom.DT life14_43;
    net.minecraft.block.state.IBlockState life15_47;
    net.minecraft.block.BlockRailBase$EnumRailDirection life16_69;
    double life17_85;
    net.minecraft.block.state.IBlockState life19_131;
    net.minecraft.block.BlockRailBase$EnumRailDirection life20_153;
    net.minecraft.entity.item.EntityMinecart life19_180;
    forward_join_158: {
    forward_join_155: {
    forward_join_134: {
    forward_join_132: {
    forward_join_121: {
    forward_join_120: {
    forward_join_113: {
    forward_join_105: {
    forward_join_101: {
    forward_join_95: {
    forward_join_91: {
    forward_join_81: {
    forward_join_80: {
    forward_join_76: {
    forward_join_63: {
    forward_join_62: {
    forward_join_55: {
    life3_3 = (moom.rw.d ^ 58445517197903L);
    life6_7 = __sourceExactCall_b9f266c58b58a2(((int)(((moom.ry)(p0)).a__Int())));
    spill3934_0 = net.minecraft.item.ItemStack.m();
    life7_11 = ((moom.ry)(p0)).a__Eu();
    life8_20 = (((moom.ry)(p0)).a() + (((double) ((moom.bs)(life6_7)).c()) * 0x1.2p0d));
    life5_21 = ((spill3934_0) ? 1 : 0);
    life10_29 = (java.lang.Math.floor(((double)(((moom.ry)(p0)).b()))) + ((double) ((moom.bs)(life6_7)).d()));
    life12_38 = (((moom.ry)(p0)).c() + (((double) ((moom.bs)(life6_7)).e()) * 0x1.2p0d));
    life14_43 = ((moom.DT)(((moom.ry)(p0)).a__DT())).a(((moom.bs)(life6_7)));
    life15_47 = ((net.minecraft.world.World)(life7_11)).a__fE(((moom.DT)(life14_43)));
    spill3934_1 = life15_47;
    if (!((life5_21 != 0))) {
        forwardValue3934_55_0 = spill3934_1;
        break forward_join_55;
    }
    if (!((((((net.minecraft.block.state.IBlockState)(spill3934_1)).a__ch() instanceof moom.d2) ? 1 : 0) != 0))) {
        break forward_join_62;
    }
    forwardValue3934_55_0 = life15_47;
    }
    forwardValue3934_63_0 = ((net.minecraft.block.BlockRailBase$EnumRailDirection)(((net.minecraft.block.state.IBlockState)(forwardValue3934_55_0)).a(((net.minecraft.block.properties.IProperty)(((moom.d2)(((moom.d2)(((net.minecraft.block.state.IBlockState)(life15_47)).a__ch())))).a__ft())))));
    break forward_join_63;
    }
    forwardValue3934_63_0 = net.minecraft.block.BlockRailBase$EnumRailDirection.NORTH_SOUTH;
    }
    life16_69 = forwardValue3934_63_0;
    spill3934_2 = life15_47;
    if (!((life5_21 != 0))) {
        forwardValue3934_81_0 = spill3934_2;
        break forward_join_81;
    }
    if (!(__sourceExactCall_2e6b3bd58a1006(((net.minecraft.block.state.IBlockState)(spill3934_2))))) {
        break forward_join_80;
    }
    if (!(((net.minecraft.block.BlockRailBase$EnumRailDirection)(life16_69)).a__Boolean())) {
        break forward_join_76;
    }
    life17_85 = 0x1.3333333333333p-1d;
    if (!((life5_21 == 0))) {
        break forward_join_134;
    }
    }
    life17_85 = 0x1.999999999999ap-4d;
    if (!((life5_21 == 0))) {
        break forward_join_134;
    }
    }
    forwardValue3934_81_0 = life15_47;
    }
    if (!((life5_21 != 0))) {
        forwardValue3934_91_0 = forwardValue3934_81_0;
        break forward_join_91;
    }
    if (!((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(forwardValue3934_81_0)).a__ch())).a__fn() == moom.fn.a))) {
        break forward_join_95;
    }
    forwardValue3934_91_0 = ((net.minecraft.world.World)(life7_11)).a__fE(((moom.DT)(((moom.DT)(life14_43)).b__DT())));
    }
    if (!((life5_21 != 0))) {
        forwardValue3934_105_0 = forwardValue3934_91_0;
        break forward_join_105;
    }
    if (!((!__sourceExactCall_2e6b3bd58a1006(((net.minecraft.block.state.IBlockState)(forwardValue3934_91_0)))))) {
        break forward_join_101;
    }
    }
    return ((moom.rd)(this.c)).a(((moom.ry)(p0)), ((net.minecraft.item.ItemStack)(p1)));
    }
    forwardValue3934_105_0 = ((net.minecraft.world.World)(life7_11)).a__fE(((moom.DT)(((moom.DT)(life14_43)).b__DT())));
    }
    life19_131 = forwardValue3934_105_0;
    spill3934_3 = life19_131;
    if (!((life5_21 != 0))) {
        forwardValue3934_113_0 = spill3934_3;
        break forward_join_113;
    }
    if (!((((((net.minecraft.block.state.IBlockState)(spill3934_3)).a__ch() instanceof moom.d2) ? 1 : 0) != 0))) {
        break forward_join_120;
    }
    forwardValue3934_113_0 = life19_131;
    }
    forwardValue3934_121_0 = ((net.minecraft.block.BlockRailBase$EnumRailDirection)(((net.minecraft.block.state.IBlockState)(forwardValue3934_113_0)).a(((net.minecraft.block.properties.IProperty)(((moom.d2)(((moom.d2)(((net.minecraft.block.state.IBlockState)(life19_131)).a__ch())))).a__ft())))));
    break forward_join_121;
    }
    forwardValue3934_121_0 = net.minecraft.block.BlockRailBase$EnumRailDirection.NORTH_SOUTH;
    }
    life20_153 = forwardValue3934_121_0;
    if (!((life6_7 != moom.bs.DOWN))) {
        break forward_join_132;
    }
    if (!(((net.minecraft.block.BlockRailBase$EnumRailDirection)(life20_153)).a__Boolean())) {
        break forward_join_132;
    }
    life17_85 = -0x1.999999999999ap-2d;
    if (!((life5_21 == 0))) {
        break forward_join_134;
    }
    }
    life17_85 = -0x1.ccccccccccccdp-1d;
    }
    life19_180 = __sourceExactCall_6772ded07d3a74(((net.minecraft.world.World)(life7_11)), ((double)(life8_20)), ((double)((life10_29 + life17_85))), ((double)(life12_38)), ((net.minecraft.entity.item.EntityMinecart$EnumMinecartType)(((moom.xB)(((moom.xB)(((net.minecraft.item.ItemStack)(p1)).a__wQ())))).o)));
    spill3934_4 = ((net.minecraft.item.ItemStack)(p1)).f__Boolean();
    if (!((life5_21 != 0))) {
        forwardValue3934_158_0 = ((spill3934_4) ? 1 : 0);
        break forward_join_158;
    }
    if (!(spill3934_4)) {
        break forward_join_155;
    }
    ((net.minecraft.entity.item.EntityMinecart)(life19_180)).a(((java.lang.String)(((net.minecraft.item.ItemStack)(p1)).b__String())));
    }
    forwardValue3934_158_0 = ((((net.minecraft.world.World)(life7_11)).b__Boolean(((net.minecraft.entity.Entity)(life19_180)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue3934_158_0);
    ((net.minecraft.item.ItemStack)(p1)).a(((int)(1)));
    return p1;
}


protected void a(moom.ry p0) {
long local2 = (moom.rw.d ^ 68991242320209L);
    ((net.minecraft.world.World)(((moom.ry)(p0)).a__Eu())).b(((int)(((int) moom.rw.f))), ((moom.DT)(((moom.ry)(p0)).a__DT())), ((int)(0)));
    return;
}


private static native moom.bs __sourceExactCall_b9f266c58b58a2(int p0);
private static native boolean __sourceExactCall_2e6b3bd58a1006(net.minecraft.block.state.IBlockState p0);
private static native net.minecraft.entity.item.EntityMinecart __sourceExactCall_6772ded07d3a74(net.minecraft.world.World p0, double p1, double p2, double p3, net.minecraft.entity.item.EntityMinecart$EnumMinecartType p4);
}
