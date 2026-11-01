package moom;


public class xs extends moom.xp {

private final net.minecraft.block.Block w;

private final net.minecraft.block.Block x;

private static final long A;

public xs(int p0, float p1, net.minecraft.block.Block p2, net.minecraft.block.Block p3) {
super(p0, p1, false);
    this.w = p2;
    this.x = p3;
}


static {
A = (moom._c.a(4424270065654554823L, -5444018235782277991L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(47192283796842L);
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public boolean a(net.minecraft.item.ItemStack p0, net.minecraft.entity.player.EntityPlayer p1, net.minecraft.world.World p2, moom.DT p3, moom.bs p4, float p5, float p6, float p7) {
int forwardValue4541_22_0;
    net.minecraft.world.World forwardValue4541_35_0;
    moom.DT forwardValue4541_35_1;
    int forwardValue4541_56_0;
    boolean spill4541_0;
    net.minecraft.world.World spill4541_1;
    moom.DT spill4541_2;
    boolean spill4541_3;
    long life9_3;
    int life11_5;
    forward_join_56: {
    forward_join_55: {
    forward_join_35: {
    forward_join_23: {
    forward_join_22: {
    forward_join_11: {
    life9_3 = (moom.xs.A ^ 73469807884032L);
    life11_5 = ((net.minecraft.item.ItemStack.m()) ? 1 : 0);
    if (!((p4 != moom.bs.UP))) {
        break forward_join_11;
    }
    return ((0) != 0);
    }
    spill4541_0 = ((net.minecraft.entity.player.EntityPlayer)(p1)).a(((moom.DT)(((moom.DT)(p3)).a(((moom.bs)(p4))))), ((moom.bs)(p4)), ((net.minecraft.item.ItemStack)(p0)));
    if (!((life11_5 != 0))) {
        forwardValue4541_22_0 = ((spill4541_0) ? 1 : 0);
        break forward_join_22;
    }
    if (!((!spill4541_0))) {
        break forward_join_23;
    }
    forwardValue4541_22_0 = 0;
    }
    return ((forwardValue4541_22_0) != 0);
    }
    spill4541_1 = p2;
    spill4541_2 = p3;
    if (!((life11_5 != 0))) {
        forwardValue4541_35_0 = spill4541_1;
        forwardValue4541_35_1 = spill4541_2;
        break forward_join_35;
    }
    if (!((((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(spill4541_1)).a__fE(((moom.DT)(spill4541_2))))).a__ch() == this.x))) {
        break forward_join_55;
    }
    forwardValue4541_35_0 = p2;
    forwardValue4541_35_1 = ((moom.DT)(p3)).a__DT();
    }
    spill4541_3 = ((net.minecraft.world.World)(forwardValue4541_35_0)).a__Boolean(((moom.DT)(forwardValue4541_35_1)));
    if (!((life11_5 != 0))) {
        forwardValue4541_56_0 = ((spill4541_3) ? 1 : 0);
        break forward_join_56;
    }
    if (!(spill4541_3)) {
        break forward_join_55;
    }
    ((net.minecraft.world.World)(p2)).a(((moom.DT)(((moom.DT)(p3)).a__DT())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(this.w)).a__fE())));
    net.minecraft.item.ItemStack __stackOp4541_19_0 = p0;
    ((net.minecraft.item.ItemStack)(__stackOp4541_19_0)).b = ((int)((((net.minecraft.item.ItemStack)(__stackOp4541_19_0)).b - 1)));
    return ((1) != 0);
    }
    forwardValue4541_56_0 = 0;
    }
    return ((forwardValue4541_56_0) != 0);
}

}
