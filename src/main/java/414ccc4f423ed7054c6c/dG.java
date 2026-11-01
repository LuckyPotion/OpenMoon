package moom;


public class dG extends net.minecraft.block.Block {

protected boolean Q;

private static final long Y;

protected dG(moom.fn p0, boolean p1) {
super(p0);
    this.Q = p1;
}


static {
Y = (moom._c.a(-2158749173556858704L, 7219096202731764521L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(171455950784061L);
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public boolean a__Boolean(net.minecraft.world.IBlockAccess p0, moom.DT p1, moom.bs p2) {
int forwardValue3230_22_0;
    int forwardValue3230_26_0;
    int forwardValue3230_28_0;
    boolean spill3230_0;
    long life4_3;
    int[] life6_5;
    forward_join_28: {
    forward_join_27: {
    forward_join_26: {
    forward_join_22: {
    forward_join_17: {
    life4_3 = (moom.dG.Y ^ 30524788689484L);
    life6_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3230_0 = this.Q;
    if (!((life6_5 != null))) {
        forwardValue3230_22_0 = ((spill3230_0) ? 1 : 0);
        break forward_join_22;
    }
    if (!((!spill3230_0))) {
        break forward_join_17;
    }
    if (!((((net.minecraft.block.state.IBlockState)(((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(p1))))).a__ch() != this))) {
        break forward_join_27;
    }
    }
    forwardValue3230_22_0 = ((super.a__Boolean(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(p1)), ((moom.bs)(p2)))) ? 1 : 0);
    }
    if (!((life6_5 != null))) {
        forwardValue3230_26_0 = forwardValue3230_22_0;
        break forward_join_26;
    }
    if (!((forwardValue3230_22_0 != 0))) {
        break forward_join_27;
    }
    forwardValue3230_26_0 = 1;
    }
    forwardValue3230_28_0 = forwardValue3230_26_0;
    break forward_join_28;
    }
    forwardValue3230_28_0 = 0;
    }
    return ((forwardValue3230_28_0) != 0);
}


public boolean j() {
return ((0) != 0);
}

}
