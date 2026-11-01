package moom;


public class d6 extends net.minecraft.block.Block {

public static final moom.fw<moom.Y> Q;

private static final long R;

public d6() {
super(moom.fn.e, (moom.ab.RED_SAND).a__fm());
    (this).a__Void(((this.M).a__fE()).a__fE(moom.d6.Q, moom.Y.DEFAULT));
    (this).a(net.minecraft.creativetab.CreativeTabs.b);
}


static {
R = (moom._c.a(-336928641403382356L, 951869519263949344L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(21533327795984L);
    Q = moom.fw.a("type", moom.Y.class);
}


public net.minecraft.block.state.IBlockState b__fE(int p0) {
return ((net.minecraft.block.state.IBlockState)(((moom.d6)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.d6.Q)), ((java.lang.Comparable)(moom.Y.a(((int)(p0))))));
}


public int b(net.minecraft.block.state.IBlockState p0) {
return ((moom.Y)(((moom.Y)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.d6.Q))))))).a();
}


public int c(net.minecraft.block.state.IBlockState p0) {
return ((moom.Y)(((moom.Y)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.d6.Q))))))).a();
}


public void a(net.minecraft.item.Item p0, net.minecraft.creativetab.CreativeTabs p1, java.util.List<net.minecraft.item.ItemStack> p2) {
int[] spill1093_0;
    long life4_3;
    moom.Y[] life7_5;
    int life8_9;
    int life9_11;
    int[] life6_12;
    moom.Y life10_19;
    lexical_join_33: {
    life4_3 = (moom.d6.R ^ 18591356524164L);
    life7_5 = moom.Y.values();
    spill1093_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life8_9 = (life7_5).length;
    life9_11 = 0;
    life6_12 = spill1093_0;
    lexical_cycle_13: while (true) {
    if (!((life9_11 < life8_9))) {
        break lexical_join_33;
    }
    life10_19 = (life7_5)[life9_11];
    ((java.util.List)(p2)).add(((java.lang.Object)(new net.minecraft.item.ItemStack(p0, 1, ((moom.Y)(life10_19)).a()))));
    life9_11 += 1;
    if (!((life6_12 == null))) { continue lexical_cycle_13; }
    break lexical_cycle_13;
    }
    }
    return;
}


protected moom.fA a__fA() {
return new moom.fA(this, new net.minecraft.block.properties.IProperty[] {moom.d6.Q});
}

}
