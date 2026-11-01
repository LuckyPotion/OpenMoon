package moom;


public class c6 extends moom.cT {

public static final moom.fx R;

private static final long S;

private static final long T;

protected c6() {
super(moom.fn.e);
    (this).a__Void(((this.M).a__fE()).a__fE(moom.c6.R, moom.bs.NORTH));
    (this).a(net.minecraft.creativetab.CreativeTabs.c);
    (this).a(0x1.0000000000000p-4f, 0x0.0p+0f, 0x1.0000000000000p-4f, 0x1.e000000000000p-1f, 0x1.c000000000000p-1f, 0x1.e000000000000p-1f);
}


static {
S = ((long)(((moom._a)(moom._c.a(((long)(8102016112598550283L)), ((long)(-5846775793969038564L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(166866954535073L)))));
    long local0_life6 = (moom.c6.S ^ 127846489743170L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill781_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill781_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill781_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill781_13 = new byte[8];
    (__sourceSpill781_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill781_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation781_15 = __sourceSpill781_13;
    ((javax.crypto.Cipher)(__sourceSpill781_10)).init(((int)(__sourceSpill781_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill781_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation781_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -7491268886943570609L;
    byte[] __sourceSpill781_19 = new byte[8];
    (__sourceSpill781_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill781_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill781_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill781_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill781_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill781_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill781_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill781_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill781_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill781_20)).doFinal(((byte[])(__sourceSpill781_19)));
    T = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
    R = ((moom.fx)(moom.fx.a(((java.lang.String)("facing")), ((com.google.common.base.Predicate)(net.minecraft.util.EnumFacing$Plane.HORIZONTAL)))));
}


public net.minecraft.block.state.IBlockState b__fE(int p0) {
moom.bs forwardValue3020_16_0;
    int[] spill3020_0;
    moom.bs spill3020_1;
    long life2_3;
    moom.bs life5_7;
    int[] life4_8;
    forward_join_17: {
    forward_join_16: {
    life2_3 = (moom.c6.S ^ 130985148053992L);
    spill3020_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life5_7 = moom.bs.a(((int)(p0)));
    life4_8 = spill3020_0;
    spill3020_1 = life5_7;
    if (!((life4_8 != null))) {
        forwardValue3020_16_0 = spill3020_1;
        break forward_join_16;
    }
    if (!((((moom.bs)(spill3020_1)).a__bt() == net.minecraft.util.EnumFacing$Axis.Y))) {
        break forward_join_17;
    }
    forwardValue3020_16_0 = moom.bs.NORTH;
    }
    life5_7 = forwardValue3020_16_0;
    }
    return ((net.minecraft.block.state.IBlockState)(((moom.c6)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.c6.R)), ((java.lang.Comparable)(life5_7)));
}


public int b(net.minecraft.block.state.IBlockState p0) {
return ((moom.bs)(((moom.bs)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.c6.R))))))).a();
}


public void c(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, java.util.Random p3) {
int[] spill1064_0;
    long life5_3;
    int life8_6;
    int[] life7_7;
    int life9_18;
    int life10_26;
    double life11_37;
    double life13_45;
    double life15_56;
    double life17_63;
    double life19_71;
    double life21_78;
    lexical_join_93: {
    life5_3 = (moom.c6.S ^ 18368377974111L);
    spill1064_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life8_6 = 0;
    life7_7 = spill1064_0;
    lexical_cycle_8: while (true) {
    if (!((life8_6 < 3))) {
        break lexical_join_93;
    }
    life9_18 = ((((java.util.Random)(p3)).nextInt(((int)(2))) * 2) - 1);
    life10_26 = ((((java.util.Random)(p3)).nextInt(((int)(2))) * 2) - 1);
    life11_37 = ((((double) ((moom.DT)(p1)).a()) + 0x1.0p-1d) + (0x1.0p-2d * ((double) life9_18)));
    life13_45 = ((double) (((float) ((moom.DT)(p1)).b()) + ((java.util.Random)(p3)).nextFloat()));
    life15_56 = ((((double) ((moom.DT)(p1)).c()) + 0x1.0p-1d) + (0x1.0p-2d * ((double) life10_26)));
    life17_63 = ((double) (((java.util.Random)(p3)).nextFloat() * ((float) life9_18)));
    life19_71 = ((((double) ((java.util.Random)(p3)).nextFloat()) - 0x1.0p-1d) * 0x1.0p-3d);
    life21_78 = ((double) (((java.util.Random)(p3)).nextFloat() * ((float) life10_26)));
    ((net.minecraft.world.World)(p0)).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.PORTAL)), ((double)(life11_37)), ((double)(life13_45)), ((double)(life15_56)), ((double)(life17_63)), ((double)(life19_71)), ((double)(life21_78)), ((int[])(new int[0])));
    life8_6 += 1;
    if (!((life7_7 == null))) { continue lexical_cycle_8; }
    break lexical_cycle_8;
    }
    }
    return;
}


public int c__Int() {
return 2;
}


public net.minecraft.tileentity.TileEntity a(net.minecraft.world.World p0, int p1) {
return new moom.Cg();
}


public boolean a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.entity.player.EntityPlayer p3, moom.bs p4, float p5, float p6, float p7) {
int forwardValue3019_33_0;
    int forwardValue3019_49_0;
    int forwardValue3019_51_0;
    int[] spill3019_0;
    int spill3019_1;
    boolean spill3019_2;
    long life9_3;
    moom.wv life12_7;
    int[] life11_8;
    net.minecraft.tileentity.TileEntity life13_12;
    forward_join_51: {
    forward_join_50: {
    forward_join_49: {
    forward_join_38: {
    forward_join_33: {
    forward_join_31: {
    life9_3 = (moom.c6.S ^ 62779341578920L);
    spill3019_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life12_7 = ((net.minecraft.entity.player.EntityPlayer)(p3)).a__wv();
    life11_8 = spill3019_0;
    life13_12 = ((net.minecraft.world.World)(p0)).a__B9(((moom.DT)(p1)));
    if (!((life12_7 != null))) {
        break forward_join_50;
    }
    spill3019_1 = ((life13_12 instanceof moom.Cg) ? 1 : 0);
    if (!((life11_8 != null))) {
        forwardValue3019_51_0 = spill3019_1;
        break forward_join_51;
    }
    if (!((spill3019_1 != 0))) {
        break forward_join_50;
    }
    spill3019_2 = ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).a__DT()))))).a__ch())).e__Boolean();
    if (!((life11_8 != null))) {
        forwardValue3019_33_0 = ((spill3019_2) ? 1 : 0);
        break forward_join_33;
    }
    if (!(spill3019_2)) {
        break forward_join_31;
    }
    return ((1) != 0);
    }
    forwardValue3019_33_0 = ((((net.minecraft.world.World)(p0)).G) ? 1 : 0);
    }
    if (!((life11_8 != null))) {
        forwardValue3019_49_0 = forwardValue3019_33_0;
        break forward_join_49;
    }
    if (!((forwardValue3019_33_0 != 0))) {
        break forward_join_38;
    }
    return ((1) != 0);
    }
    ((moom.wv)(life12_7)).a(((moom.Cg)(((moom.Cg)(life13_12)))));
    ((net.minecraft.entity.player.EntityPlayer)(p3)).a(((net.minecraft.inventory.IInventory)(life12_7)));
    ((net.minecraft.entity.player.EntityPlayer)(p3)).a(((moom.BY)(net.minecraft.stats.StatList.V)));
    forwardValue3019_49_0 = 1;
    }
    return ((forwardValue3019_49_0) != 0);
    }
    forwardValue3019_51_0 = 1;
    }
    return ((forwardValue3019_51_0) != 0);
}


protected moom.fA a__fA() {
return new moom.fA(this, new net.minecraft.block.properties.IProperty[] {moom.c6.R});
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public net.minecraft.item.Item a(net.minecraft.block.state.IBlockState p0, java.util.Random p1, int p2) {
return net.minecraft.item.Item.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.Z)));
}


public int a(java.util.Random p0) {
long local2 = (moom.c6.S ^ 10194707427255L);
    return ((int) moom.c6.T);
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.entity.EntityLivingBase p3, net.minecraft.item.ItemStack p4) {
((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(p2)).a__fE(((net.minecraft.block.properties.IProperty)(moom.c6.R)), ((java.lang.Comparable)(((moom.bs)(((net.minecraft.entity.EntityLivingBase)(p3)).b__bs())).a__bs()))))), ((int)(2)));
    return;
}


public net.minecraft.block.state.IBlockState a(net.minecraft.world.World p0, moom.DT p1, moom.bs p2, float p3, float p4, float p5, int p6, net.minecraft.entity.EntityLivingBase p7) {
return ((net.minecraft.block.state.IBlockState)(((moom.c6)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.c6.R)), ((java.lang.Comparable)(((moom.bs)(((net.minecraft.entity.EntityLivingBase)(p7)).b__bs())).a__bs())));
}


protected boolean m() {
return ((1) != 0);
}


public boolean g() {
return ((0) != 0);
}


public boolean j() {
return ((0) != 0);
}

}
