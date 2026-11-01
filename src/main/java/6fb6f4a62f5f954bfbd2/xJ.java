package moom;


public class xJ extends net.minecraft.item.Item {

private final net.minecraft.block.Block n;

private final net.minecraft.block.Block o;

private static final long p;

public xJ(net.minecraft.block.Block p0, net.minecraft.block.Block p1) {
super();
    this.n = p0;
    this.o = p1;
    (this).a(net.minecraft.creativetab.CreativeTabs.l);
}


static {
p = (moom._c.a(-3118503889655999784L, 7475648993698828673L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(203878365320709L);
}


public boolean a(net.minecraft.item.ItemStack p0, net.minecraft.entity.player.EntityPlayer p1, net.minecraft.world.World p2, moom.DT p3, moom.bs p4, float p5, float p6, float p7) {
int forwardValue4490_22_0;
    net.minecraft.world.World forwardValue4490_35_0;
    moom.DT forwardValue4490_35_1;
    int forwardValue4490_56_0;
    boolean spill4490_0;
    net.minecraft.world.World spill4490_1;
    moom.DT spill4490_2;
    boolean spill4490_3;
    long life9_3;
    int life11_5;
    forward_join_56: {
    forward_join_55: {
    forward_join_35: {
    forward_join_23: {
    forward_join_22: {
    forward_join_11: {
    life9_3 = (moom.xJ.p ^ 118873099215953L);
    life11_5 = ((net.minecraft.item.ItemStack.m()) ? 1 : 0);
    if (!((p4 != moom.bs.UP))) {
        break forward_join_11;
    }
    return ((0) != 0);
    }
    spill4490_0 = ((net.minecraft.entity.player.EntityPlayer)(p1)).a(((moom.DT)(((moom.DT)(p3)).a(((moom.bs)(p4))))), ((moom.bs)(p4)), ((net.minecraft.item.ItemStack)(p0)));
    if (!((life11_5 != 0))) {
        forwardValue4490_22_0 = ((spill4490_0) ? 1 : 0);
        break forward_join_22;
    }
    if (!((!spill4490_0))) {
        break forward_join_23;
    }
    forwardValue4490_22_0 = 0;
    }
    return ((forwardValue4490_22_0) != 0);
    }
    spill4490_1 = p2;
    spill4490_2 = p3;
    if (!((life11_5 != 0))) {
        forwardValue4490_35_0 = spill4490_1;
        forwardValue4490_35_1 = spill4490_2;
        break forward_join_35;
    }
    if (!((((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(spill4490_1)).a__fE(((moom.DT)(spill4490_2))))).a__ch() == this.o))) {
        break forward_join_55;
    }
    forwardValue4490_35_0 = p2;
    forwardValue4490_35_1 = ((moom.DT)(p3)).a__DT();
    }
    spill4490_3 = ((net.minecraft.world.World)(forwardValue4490_35_0)).a__Boolean(((moom.DT)(forwardValue4490_35_1)));
    if (!((life11_5 != 0))) {
        forwardValue4490_56_0 = ((spill4490_3) ? 1 : 0);
        break forward_join_56;
    }
    if (!(spill4490_3)) {
        break forward_join_55;
    }
    ((net.minecraft.world.World)(p2)).a(((moom.DT)(((moom.DT)(p3)).a__DT())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(this.n)).a__fE())));
    net.minecraft.item.ItemStack __stackOp4490_19_0 = p0;
    ((net.minecraft.item.ItemStack)(__stackOp4490_19_0)).b = ((int)((((net.minecraft.item.ItemStack)(__stackOp4490_19_0)).b - 1)));
    return ((1) != 0);
    }
    forwardValue4490_56_0 = 0;
    }
    return ((forwardValue4490_56_0) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}

}
