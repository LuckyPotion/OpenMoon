package moom;


public class d3 extends moom.d2 {

public static final moom.fw<net.minecraft.block.BlockRailBase$EnumRailDirection> R;

private static final long S;

protected d3() {
super(false);
    (this).a__Void(((this.M).a__fE()).a__fE(moom.d3.R, net.minecraft.block.BlockRailBase$EnumRailDirection.NORTH_SOUTH));
}


static {
S = (moom._c.a(3807784412181107399L, -7395853856651410072L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(160313206820033L);
    R = moom.fw.a("shape", net.minecraft.block.BlockRailBase$EnumRailDirection.class);
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public int b(net.minecraft.block.state.IBlockState p0) {
return ((net.minecraft.block.BlockRailBase$EnumRailDirection)(((net.minecraft.block.BlockRailBase$EnumRailDirection)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.d3.R))))))).a();
}


protected void b(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.block.Block p3) {
int forwardValue3186_19_0;
    boolean spill3186_0;
    long life5_3;
    int[] life7_5;
    forward_join_28: {
    forward_join_19: {
    life5_3 = (moom.d3.S ^ 97214201460842L);
    life7_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3186_0 = ((net.minecraft.block.Block)(p3)).l();
    if (!((life7_5 != null))) {
        forwardValue3186_19_0 = ((spill3186_0) ? 1 : 0);
        break forward_join_19;
    }
    if (!(spill3186_0)) {
        break forward_join_28;
    }
    forwardValue3186_19_0 = ((moom.e8)(new moom.e8(this, p0, p1, p2))).a();
    }
    if (!((forwardValue3186_19_0 == 3))) {
        break forward_join_28;
    }
    ((moom.d3)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((boolean)(false)));
    }
    return;
}


public net.minecraft.block.state.IBlockState b__fE(int p0) {
return ((net.minecraft.block.state.IBlockState)(((moom.d3)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.d3.R)), ((java.lang.Comparable)(net.minecraft.block.BlockRailBase$EnumRailDirection.a(((int)(p0))))));
}


protected moom.fA a__fA() {
return new moom.fA(this, new net.minecraft.block.properties.IProperty[] {moom.d3.R});
}


public net.minecraft.block.properties.IProperty<net.minecraft.block.BlockRailBase$EnumRailDirection> a__ft() {
return moom.d3.R;
}

}
