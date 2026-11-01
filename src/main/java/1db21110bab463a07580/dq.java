package moom;


public class dq extends net.minecraft.block.Block {

public static final moom.fw<net.minecraft.block.BlockDirt$DirtType> Q;

public static final moom.fv R;

private static final long S;

protected dq() {
super(moom.fn.c);
    (this).a__Void((((this.M).a__fE()).a__fE(moom.dq.Q, net.minecraft.block.BlockDirt$DirtType.DIRT)).a__fE(moom.dq.R, java.lang.Boolean.FALSE));
    (this).a(net.minecraft.creativetab.CreativeTabs.b);
}


static {
S = (moom._c.a(-2826870545678709704L, 1028116579284091833L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(52115830779711L);
    Q = moom.fw.a("variant", net.minecraft.block.BlockDirt$DirtType.class);
    R = moom.fv.a("snowy");
}


public net.minecraft.block.state.IBlockState b__fE(int p0) {
return ((net.minecraft.block.state.IBlockState)(((moom.dq)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.dq.Q)), ((java.lang.Comparable)(net.minecraft.block.BlockDirt$DirtType.a(((int)(p0))))));
}


public int b(net.minecraft.block.state.IBlockState p0) {
return ((net.minecraft.block.BlockDirt$DirtType)(((net.minecraft.block.BlockDirt$DirtType)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.dq.Q))))))).a();
}


public int c(net.minecraft.block.state.IBlockState p0) {
net.minecraft.block.BlockDirt$DirtType forwardValue3344_19_0;
    int[] spill3344_0;
    net.minecraft.block.BlockDirt$DirtType spill3344_1;
    long life2_3;
    net.minecraft.block.BlockDirt$DirtType life5_9;
    int[] life4_10;
    forward_join_19: {
    forward_join_18: {
    life2_3 = (moom.dq.S ^ 77387345873330L);
    spill3344_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life5_9 = ((net.minecraft.block.BlockDirt$DirtType)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.dq.Q)))));
    life4_10 = spill3344_0;
    spill3344_1 = life5_9;
    if (!((life4_10 != null))) {
        forwardValue3344_19_0 = spill3344_1;
        break forward_join_19;
    }
    if (!((spill3344_1 == net.minecraft.block.BlockDirt$DirtType.PODZOL))) {
        break forward_join_18;
    }
    life5_9 = net.minecraft.block.BlockDirt$DirtType.DIRT;
    }
    forwardValue3344_19_0 = life5_9;
    }
    return ((net.minecraft.block.BlockDirt$DirtType)(forwardValue3344_19_0)).a();
}


protected moom.fA a__fA() {
return new moom.fA(this, new net.minecraft.block.properties.IProperty[] {moom.dq.Q, moom.dq.R});
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public moom.fm a__fm(net.minecraft.block.state.IBlockState p0) {
return ((net.minecraft.block.BlockDirt$DirtType)(((net.minecraft.block.BlockDirt$DirtType)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.dq.Q))))))).a__fm();
}


public net.minecraft.block.state.IBlockState a(net.minecraft.block.state.IBlockState p0, net.minecraft.world.IBlockAccess p1, moom.DT p2) {
net.minecraft.block.state.IBlockState forwardValue3342_28_0;
    moom.fv forwardValue3342_28_1;
    net.minecraft.block.Block forwardValue3342_28_2;
    net.minecraft.block.Block forwardValue3342_28_3;
    net.minecraft.block.state.IBlockState forwardValue3342_29_0;
    moom.fv forwardValue3342_29_1;
    net.minecraft.block.state.IBlockState forwardValue3342_31_0;
    moom.fv forwardValue3342_31_1;
    net.minecraft.block.state.IBlockState forwardValue3342_32_0;
    moom.fv forwardValue3342_32_1;
    int forwardValue3342_32_2;
    net.minecraft.block.state.IBlockState forwardValue3342_36_0;
    net.minecraft.block.state.IBlockState spill3342_0;
    net.minecraft.block.state.IBlockState spill3342_1;
    moom.fv spill3342_2;
    net.minecraft.block.Block spill3342_3;
    net.minecraft.block.Block spill3342_4;
    long life4_3;
    int[] life6_5;
    net.minecraft.block.Block life7_21;
    forward_join_36: {
    forward_join_35: {
    forward_join_32: {
    forward_join_31: {
    forward_join_29: {
    forward_join_28: {
    life4_3 = (moom.dq.S ^ 63953793341820L);
    life6_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3342_0 = p0;
    if (!((life6_5 != null))) {
        forwardValue3342_36_0 = spill3342_0;
        break forward_join_36;
    }
    if (!((((net.minecraft.block.state.IBlockState)(spill3342_0)).a(((net.minecraft.block.properties.IProperty)(moom.dq.Q))) == net.minecraft.block.BlockDirt$DirtType.PODZOL))) {
        break forward_join_35;
    }
    life7_21 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.IBlockAccess)(p1)).a__fE(((moom.DT)(((moom.DT)(p2)).a__DT()))))).a__ch();
    spill3342_1 = p0;
    spill3342_2 = moom.dq.R;
    spill3342_3 = life7_21;
    spill3342_4 = net.minecraft.init.Blocks.aJ;
    if (!((life6_5 != null))) {
        forwardValue3342_28_0 = spill3342_1;
        forwardValue3342_28_1 = spill3342_2;
        forwardValue3342_28_2 = spill3342_3;
        forwardValue3342_28_3 = spill3342_4;
        break forward_join_28;
    }
    if (!((spill3342_3 != spill3342_4))) {
        forwardValue3342_29_0 = spill3342_1;
        forwardValue3342_29_1 = spill3342_2;
        break forward_join_29;
    }
    forwardValue3342_28_0 = spill3342_1;
    forwardValue3342_28_1 = spill3342_2;
    forwardValue3342_28_2 = life7_21;
    forwardValue3342_28_3 = net.minecraft.init.Blocks.aH;
    }
    if (!((forwardValue3342_28_2 == forwardValue3342_28_3))) {
        forwardValue3342_31_0 = forwardValue3342_28_0;
        forwardValue3342_31_1 = forwardValue3342_28_1;
        break forward_join_31;
    }
    forwardValue3342_29_0 = forwardValue3342_28_0;
    forwardValue3342_29_1 = forwardValue3342_28_1;
    }
    forwardValue3342_32_0 = forwardValue3342_29_0;
    forwardValue3342_32_1 = forwardValue3342_29_1;
    forwardValue3342_32_2 = 1;
    break forward_join_32;
    }
    forwardValue3342_32_0 = forwardValue3342_31_0;
    forwardValue3342_32_1 = forwardValue3342_31_1;
    forwardValue3342_32_2 = 0;
    }
    p0 = ((net.minecraft.block.state.IBlockState)(forwardValue3342_32_0)).a__fE(((net.minecraft.block.properties.IProperty)(forwardValue3342_32_1)), ((java.lang.Comparable)(java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue3342_32_2)))))));
    }
    forwardValue3342_36_0 = p0;
    }
    return forwardValue3342_36_0;
}


public void a(net.minecraft.item.Item p0, net.minecraft.creativetab.CreativeTabs p1, java.util.List<net.minecraft.item.ItemStack> p2) {
((java.util.List)(p2)).add(((java.lang.Object)(new net.minecraft.item.ItemStack(this, 1, ((net.minecraft.block.BlockDirt$DirtType)(net.minecraft.block.BlockDirt$DirtType.DIRT)).a()))));
    ((java.util.List)(p2)).add(((java.lang.Object)(new net.minecraft.item.ItemStack(this, 1, ((net.minecraft.block.BlockDirt$DirtType)(net.minecraft.block.BlockDirt$DirtType.COARSE_DIRT)).a()))));
    ((java.util.List)(p2)).add(((java.lang.Object)(new net.minecraft.item.ItemStack(this, 1, ((net.minecraft.block.BlockDirt$DirtType)(net.minecraft.block.BlockDirt$DirtType.PODZOL)).a()))));
    return;
}


public int a__Int(net.minecraft.world.World p0, moom.DT p1) {
net.minecraft.block.state.IBlockState forwardValue3343_19_0;
    int forwardValue3343_23_0;
    int[] spill3343_0;
    net.minecraft.block.state.IBlockState spill3343_1;
    long life3_3;
    net.minecraft.block.state.IBlockState life6_8;
    int[] life5_9;
    forward_join_23: {
    forward_join_19: {
    forward_join_18: {
    life3_3 = (moom.dq.S ^ 87329280253084L);
    spill3343_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life6_8 = ((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(p1)));
    life5_9 = spill3343_0;
    spill3343_1 = life6_8;
    if (!((life5_9 != null))) {
        forwardValue3343_19_0 = spill3343_1;
        break forward_join_19;
    }
    if (!((((net.minecraft.block.state.IBlockState)(spill3343_1)).a__ch() != this))) {
        break forward_join_18;
    }
    forwardValue3343_23_0 = 0;
    break forward_join_23;
    }
    forwardValue3343_19_0 = life6_8;
    }
    forwardValue3343_23_0 = ((net.minecraft.block.BlockDirt$DirtType)(((net.minecraft.block.BlockDirt$DirtType)(((net.minecraft.block.state.IBlockState)(forwardValue3343_19_0)).a(((net.minecraft.block.properties.IProperty)(moom.dq.Q))))))).a();
    }
    return forwardValue3343_23_0;
}


private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
