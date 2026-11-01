package moom;


public class co extends net.minecraft.block.Block {

private final boolean Q;

private static final long S;

protected co(moom.fn p0, boolean p1) {
this(p0, p1, (p0).a__fm());
}


protected co(moom.fn p0, boolean p1, moom.fm p2) {
super(p0, p2);
    this.Q = p1;
}


static {
S = (moom._c.a(-7414080866802682742L, -8205457014604893815L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(58052975647593L);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public boolean a__Boolean(net.minecraft.world.IBlockAccess p0, moom.DT p1, moom.bs p2) {
moom.co forwardValue3134_19_0;
    moom.co forwardValue3134_39_0;
    int forwardValue3134_51_0;
    int forwardValue3134_55_0;
    int forwardValue3134_57_0;
    int[] spill3134_0;
    moom.co spill3134_1;
    boolean spill3134_2;
    long life4_3;
    net.minecraft.block.state.IBlockState life7_8;
    int[] life6_9;
    net.minecraft.block.Block life8_12;
    forward_join_57: {
    forward_join_56: {
    forward_join_55: {
    forward_join_51: {
    forward_join_46: {
    forward_join_39: {
    forward_join_38: {
    forward_join_33: {
    forward_join_23: {
    forward_join_19: {
    life4_3 = (moom.co.S ^ 17686923481456L);
    spill3134_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life7_8 = ((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(p1)));
    life6_9 = spill3134_0;
    life8_12 = ((net.minecraft.block.state.IBlockState)(life7_8)).a__ch();
    spill3134_1 = this;
    if (!((life6_9 != null))) {
        forwardValue3134_19_0 = spill3134_1;
        break forward_join_19;
    }
    if (!((spill3134_1 != net.minecraft.init.Blocks.w))) {
        break forward_join_23;
    }
    forwardValue3134_19_0 = this;
    }
    if (!((life6_9 != null))) {
        forwardValue3134_39_0 = forwardValue3134_19_0;
        break forward_join_39;
    }
    if (!((forwardValue3134_19_0 == net.minecraft.init.Blocks.ck))) {
        break forward_join_38;
    }
    }
    if (!((((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).a(((moom.bs)(((moom.bs)(p2)).a__bs())))))) != life7_8))) {
        break forward_join_33;
    }
    return ((1) != 0);
    }
    if (!((life8_12 == this))) {
        break forward_join_38;
    }
    return ((0) != 0);
    }
    forwardValue3134_39_0 = this;
    }
    spill3134_2 = ((moom.co)(forwardValue3134_39_0)).Q;
    if (!((life6_9 != null))) {
        forwardValue3134_51_0 = ((spill3134_2) ? 1 : 0);
        break forward_join_51;
    }
    if (!((!spill3134_2))) {
        break forward_join_46;
    }
    if (!((life8_12 != this))) {
        break forward_join_56;
    }
    }
    forwardValue3134_51_0 = ((super.a__Boolean(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(p1)), ((moom.bs)(p2)))) ? 1 : 0);
    }
    if (!((life6_9 != null))) {
        forwardValue3134_55_0 = forwardValue3134_51_0;
        break forward_join_55;
    }
    if (!((forwardValue3134_51_0 != 0))) {
        break forward_join_56;
    }
    forwardValue3134_55_0 = 1;
    }
    forwardValue3134_57_0 = forwardValue3134_55_0;
    break forward_join_57;
    }
    forwardValue3134_57_0 = 0;
    }
    return ((forwardValue3134_57_0) != 0);
}


public boolean j() {
return ((0) != 0);
}

}
