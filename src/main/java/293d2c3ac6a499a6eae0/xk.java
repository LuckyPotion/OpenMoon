package moom;


public class xk extends net.minecraft.item.Item {

private static final long n;

public xk() {
super();
    (this).a(net.minecraft.creativetab.CreativeTabs.f);
}


static {
n = (moom._c.a(8437222405914656231L, -480098559393299903L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(99592450886559L);
}


public boolean a(net.minecraft.item.ItemStack p0, net.minecraft.entity.player.EntityPlayer p1, net.minecraft.world.World p2, moom.DT p3, moom.bs p4, float p5, float p6, float p7) {
int forwardValue4525_22_0;
    int forwardValue4525_26_0;
    net.minecraft.world.World forwardValue4525_66_0;
    moom.DT forwardValue4525_66_1;
    int forwardValue4525_83_0;
    boolean spill4525_0;
    net.minecraft.world.World spill4525_1;
    moom.DT spill4525_2;
    boolean spill4525_3;
    long life9_3;
    int life11_5;
    forward_join_83: {
    forward_join_82: {
    forward_join_70: {
    forward_join_66: {
    forward_join_27: {
    forward_join_26: {
    forward_join_22: {
    forward_join_13: {
    life9_3 = (moom.xk.n ^ 68864358394532L);
    life11_5 = ((net.minecraft.item.ItemStack.m()) ? 1 : 0);
    spill4525_0 = ((net.minecraft.world.World)(p2)).G;
    if (!((life11_5 != 0))) {
        forwardValue4525_22_0 = ((spill4525_0) ? 1 : 0);
        break forward_join_22;
    }
    if (!(spill4525_0)) {
        break forward_join_13;
    }
    return ((1) != 0);
    }
    p3 = ((moom.DT)(p3)).a(((moom.bs)(p4)));
    forwardValue4525_22_0 = ((((net.minecraft.entity.player.EntityPlayer)(p1)).a(((moom.DT)(p3)), ((moom.bs)(p4)), ((net.minecraft.item.ItemStack)(p0)))) ? 1 : 0);
    }
    if (!((life11_5 != 0))) {
        forwardValue4525_26_0 = forwardValue4525_22_0;
        break forward_join_26;
    }
    if (!((forwardValue4525_22_0 == 0))) {
        break forward_join_27;
    }
    forwardValue4525_26_0 = 0;
    }
    return ((forwardValue4525_26_0) != 0);
    }
    spill4525_1 = p2;
    spill4525_2 = p3;
    if (!((life11_5 != 0))) {
        forwardValue4525_66_0 = spill4525_1;
        forwardValue4525_66_1 = spill4525_2;
        break forward_join_66;
    }
    if (!((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(spill4525_1)).a__fE(((moom.DT)(spill4525_2))))).a__ch())).a__fn() == moom.fn.a))) {
        break forward_join_70;
    }
    ((net.minecraft.world.World)(p2)).a(((double)((((double) ((moom.DT)(p3)).a()) + 0x1.0p-1d))), ((double)((((double) ((moom.DT)(p3)).b()) + 0x1.0p-1d))), ((double)((((double) ((moom.DT)(p3)).c()) + 0x1.0p-1d))), ((java.lang.String)("item.fireCharge.use")), ((float)(0x1.0p0f)), ((float)((((((java.util.Random)(moom.xk.e)).nextFloat() - ((java.util.Random)(moom.xk.e)).nextFloat()) * 0x1.99999ap-3f) + 0x1.0p0f))));
    forwardValue4525_66_0 = p2;
    forwardValue4525_66_1 = p3;
    }
    ((net.minecraft.world.World)(forwardValue4525_66_0)).a(((moom.DT)(forwardValue4525_66_1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.BlockFire)(net.minecraft.init.Blocks.ab)).a__fE())));
    }
    spill4525_3 = ((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.entity.player.EntityPlayer)(p1)).b1)).d;
    if (!((life11_5 != 0))) {
        forwardValue4525_83_0 = ((spill4525_3) ? 1 : 0);
        break forward_join_83;
    }
    if (!((!spill4525_3))) {
        break forward_join_82;
    }
    net.minecraft.item.ItemStack __stackOp4525_28_0 = p0;
    ((net.minecraft.item.ItemStack)(__stackOp4525_28_0)).b = ((int)((((net.minecraft.item.ItemStack)(__stackOp4525_28_0)).b - 1)));
    }
    forwardValue4525_83_0 = 1;
    }
    return ((forwardValue4525_83_0) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}

}
