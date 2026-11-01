package moom;


public class cq extends moom.co {

private static final long R;

private static final long T;

public cq() {
super(moom.fn.w, false);
    this.L = 0x1.f5c2900000000p-1f;
    (this).a(true);
    (this).a(net.minecraft.creativetab.CreativeTabs.b);
}


static {
R = ((long)(((moom._a)(moom._c.a(((long)(231166039161432453L)), ((long)(4410623658187064908L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(218943945824152L)))));
    long local0_life6 = (moom.cq.R ^ 130613124630205L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill797_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill797_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill797_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill797_13 = new byte[8];
    (__sourceSpill797_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill797_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation797_15 = __sourceSpill797_13;
    ((javax.crypto.Cipher)(__sourceSpill797_10)).init(((int)(__sourceSpill797_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill797_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation797_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -7488024838541645519L;
    byte[] __sourceSpill797_19 = new byte[8];
    (__sourceSpill797_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill797_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill797_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill797_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill797_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill797_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill797_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill797_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill797_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill797_20)).doFinal(((byte[])(__sourceSpill797_19)));
    T = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public void b(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, java.util.Random p3) {
int forwardValue3136_21_0;
    int forwardValue3136_43_0;
    int spill3136_0;
    long life5_3;
    int[] life7_5;
    forward_join_44: {
    forward_join_43: {
    forward_join_30: {
    forward_join_21: {
    life5_3 = (moom.cq.R ^ 101442282549052L);
    life7_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3136_0 = ((net.minecraft.world.World)(p0)).b(((net.minecraft.world.EnumSkyBlock)(net.minecraft.world.EnumSkyBlock.BLOCK)), ((moom.DT)(p1)));
    if (!((life7_5 != null))) {
        forwardValue3136_21_0 = spill3136_0;
        break forward_join_21;
    }
    if (!((spill3136_0 > (((int) moom.cq.T) - ((moom.cq)(this)).a__Int())))) {
        break forward_join_44;
    }
    forwardValue3136_21_0 = ((((moom.EA)(((net.minecraft.world.World)(p0)).v)).d()) ? 1 : 0);
    }
    if (!((life7_5 != null))) {
        forwardValue3136_43_0 = forwardValue3136_21_0;
        break forward_join_43;
    }
    if (!((forwardValue3136_21_0 != 0))) {
        break forward_join_30;
    }
    ((net.minecraft.world.World)(p0)).d__Boolean(((moom.DT)(p1)));
    if (!((life7_5 == null))) {
        break forward_join_44;
    }
    }
    ((moom.cq)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(p1))))), ((int)(0)));
    forwardValue3136_43_0 = ((((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(((moom.dN)(net.minecraft.init.Blocks.j)).a__fE())))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue3136_43_0);
    }
    return;
}


public int e__Int() {
return 0;
}


public net.minecraft.util.EnumWorldBlockLayer a__bx() {
return net.minecraft.util.EnumWorldBlockLayer.TRANSLUCENT;
}


public void a(net.minecraft.world.World p0, net.minecraft.entity.player.EntityPlayer p1, moom.DT p2, net.minecraft.block.state.IBlockState p3, net.minecraft.tileentity.TileEntity p4) {
int forwardValue3135_40_0;
    int forwardValue3135_50_0;
    int forwardValue3135_79_0;
    int[] spill3135_0;
    boolean spill3135_1;
    boolean spill3135_2;
    boolean spill3135_3;
    boolean spill3135_4;
    long life6_3;
    int[] life8_14;
    net.minecraft.item.ItemStack life9_37;
    int life9_70;
    moom.fn life10_83;
    forward_join_80: {
    forward_join_79: {
    forward_join_74: {
    forward_join_50: {
    forward_join_48: {
    forward_join_40: {
    forward_join_37: {
    forward_join_35: {
    life6_3 = (moom.cq.R ^ 36454015643504L);
    spill3135_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    ((net.minecraft.entity.player.EntityPlayer)(p1)).a(((moom.BY)((net.minecraft.stats.StatList.ab)[net.minecraft.block.Block.a(((net.minecraft.block.Block)(this)))])));
    ((net.minecraft.entity.player.EntityPlayer)(p1)).h(((float)(0x1.99999ap-6f)));
    life8_14 = spill3135_0;
    spill3135_1 = ((moom.cq)(this)).m();
    if (!((life8_14 != null))) {
        forwardValue3135_40_0 = ((spill3135_1) ? 1 : 0);
        break forward_join_40;
    }
    if (!(spill3135_1)) {
        break forward_join_37;
    }
    spill3135_2 = moom.rV.a__Boolean(((net.minecraft.entity.EntityLivingBase)(p1)));
    if (!((life8_14 != null))) {
        forwardValue3135_40_0 = ((spill3135_2) ? 1 : 0);
        break forward_join_40;
    }
    if (!(spill3135_2)) {
        break forward_join_37;
    }
    life9_37 = ((moom.cq)(this)).a__xW(((net.minecraft.block.state.IBlockState)(p3)));
    if (!((life9_37 != null))) {
        break forward_join_35;
    }
    moom.cq.a(((net.minecraft.world.World)(p0)), ((moom.DT)(p2)), ((net.minecraft.item.ItemStack)(life9_37)));
    }
    if (!((life8_14 == null))) {
        break forward_join_80;
    }
    }
    forwardValue3135_40_0 = ((((moom.EA)(((net.minecraft.world.World)(p0)).v)).d()) ? 1 : 0);
    }
    if (!((life8_14 != null))) {
        forwardValue3135_50_0 = forwardValue3135_40_0;
        break forward_join_50;
    }
    if (!((forwardValue3135_40_0 != 0))) {
        break forward_join_48;
    }
    ((net.minecraft.world.World)(p0)).d__Boolean(((moom.DT)(p2)));
    return;
    }
    forwardValue3135_50_0 = moom.rV.d(((net.minecraft.entity.EntityLivingBase)(p1)));
    }
    life9_70 = forwardValue3135_50_0;
    ((moom.cq)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(p2)), ((net.minecraft.block.state.IBlockState)(p3)), ((int)(life9_70)));
    life10_83 = ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p2)).b__DT()))))).a__ch())).a__fn();
    spill3135_3 = ((moom.fn)(life10_83)).d__Boolean();
    if (!((life8_14 != null))) {
        forwardValue3135_79_0 = ((spill3135_3) ? 1 : 0);
        break forward_join_79;
    }
    if (!((!spill3135_3))) {
        break forward_join_74;
    }
    spill3135_4 = ((moom.fn)(life10_83)).a__Boolean();
    if (!((life8_14 != null))) {
        forwardValue3135_79_0 = ((spill3135_4) ? 1 : 0);
        break forward_join_79;
    }
    if (!(spill3135_4)) {
        break forward_join_80;
    }
    }
    forwardValue3135_79_0 = ((((net.minecraft.world.World)(p0)).a(((moom.DT)(p2)), ((net.minecraft.block.state.IBlockState)(((moom.dM)(net.minecraft.init.Blocks.i)).a__fE())))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue3135_79_0);
    }
    return;
}


public int a(java.util.Random p0) {
return 0;
}

}
