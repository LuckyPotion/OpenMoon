package moom;


public class xG extends net.minecraft.item.Item {

private static final long n;

public xG() {
super();
    (this).a(net.minecraft.creativetab.CreativeTabs.d);
}


static {
n = (moom._c.a(-7410924745107472560L, 59809673801061924L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(8869846306778L);
}


public boolean a(net.minecraft.item.ItemStack p0, net.minecraft.entity.player.EntityPlayer p1, net.minecraft.world.World p2, moom.DT p3, moom.bs p4, float p5, float p6, float p7) {
moom.DT forwardValue4487_21_0;
    int forwardValue4487_31_0;
    int forwardValue4487_54_0;
    int forwardValue4487_72_0;
    boolean spill4487_0;
    boolean spill4487_1;
    boolean spill4487_2;
    long life9_3;
    int life12_12;
    int life11_13;
    moom.DT life13_23;
    net.minecraft.block.Block life14_41;
    forward_join_72: {
    forward_join_71: {
    forward_join_54: {
    forward_join_50: {
    forward_join_32: {
    forward_join_31: {
    forward_join_21: {
    forward_join_18: {
    life9_3 = (moom.xG.n ^ 105301489064842L);
    spill4487_0 = net.minecraft.item.ItemStack.l();
    life12_12 = ((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p2)).a__fE(((moom.DT)(p3))))).a__ch())).a__Boolean(((net.minecraft.world.World)(p2)), ((moom.DT)(p3)))) ? 1 : 0);
    life11_13 = ((spill4487_0) ? 1 : 0);
    if (!((life12_12 != 0))) {
        break forward_join_18;
    }
    forwardValue4487_21_0 = p3;
    break forward_join_21;
    }
    forwardValue4487_21_0 = ((moom.DT)(p3)).a(((moom.bs)(p4)));
    }
    life13_23 = forwardValue4487_21_0;
    spill4487_1 = ((net.minecraft.entity.player.EntityPlayer)(p1)).a(((moom.DT)(life13_23)), ((moom.bs)(p4)), ((net.minecraft.item.ItemStack)(p0)));
    if (!((life11_13 == 0))) {
        forwardValue4487_31_0 = ((spill4487_1) ? 1 : 0);
        break forward_join_31;
    }
    if (!((!spill4487_1))) {
        break forward_join_32;
    }
    forwardValue4487_31_0 = 0;
    }
    return ((forwardValue4487_31_0) != 0);
    }
    life14_41 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p2)).a__fE(((moom.DT)(life13_23))))).a__ch();
    spill4487_2 = ((net.minecraft.world.World)(p2)).a(((net.minecraft.block.Block)(life14_41)), ((moom.DT)(life13_23)), ((boolean)(false)), ((moom.bs)(p4)), ((net.minecraft.entity.Entity)(null)), ((net.minecraft.item.ItemStack)(p0)));
    if (!((life11_13 == 0))) {
        forwardValue4487_54_0 = ((spill4487_2) ? 1 : 0);
        break forward_join_54;
    }
    if (!((!spill4487_2))) {
        break forward_join_50;
    }
    return ((0) != 0);
    }
    forwardValue4487_54_0 = ((((moom.d9)(net.minecraft.init.Blocks.af)).b__Boolean(((net.minecraft.world.World)(p2)), ((moom.DT)(life13_23)))) ? 1 : 0);
    }
    if (!((life11_13 == 0))) {
        forwardValue4487_72_0 = forwardValue4487_54_0;
        break forward_join_72;
    }
    if (!((forwardValue4487_54_0 != 0))) {
        break forward_join_71;
    }
    net.minecraft.item.ItemStack __stackOp4487_19_0 = p0;
    ((net.minecraft.item.ItemStack)(__stackOp4487_19_0)).b = ((int)((((net.minecraft.item.ItemStack)(__stackOp4487_19_0)).b - 1)));
    ((net.minecraft.world.World)(p2)).a(((moom.DT)(life13_23)), ((net.minecraft.block.state.IBlockState)(((moom.d9)(net.minecraft.init.Blocks.af)).a__fE())));
    return ((1) != 0);
    }
    forwardValue4487_72_0 = 0;
    }
    return ((forwardValue4487_72_0) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}

}
