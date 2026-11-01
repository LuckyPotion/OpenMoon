package moom;


public class ef extends net.minecraft.block.Block {

public static final moom.fw<moom.ac> Q;

private static final long R;

public ef() {
super(moom.fn.e);
    (this).a__Void(((this.M).a__fE()).a__fE(moom.ef.Q, moom.ac.DEFAULT));
    (this).a(net.minecraft.creativetab.CreativeTabs.b);
}


static {
R = (moom._c.a(-4600549635964497830L, 2844378948628367612L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(265826363077664L);
    Q = moom.fw.a("type", moom.ac.class);
}


public net.minecraft.block.state.IBlockState b__fE(int p0) {
return ((net.minecraft.block.state.IBlockState)(((moom.ef)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.ef.Q)), ((java.lang.Comparable)(moom.ac.a(((int)(p0))))));
}


public int b(net.minecraft.block.state.IBlockState p0) {
return ((moom.ac)(((moom.ac)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.ef.Q))))))).a();
}


public int c(net.minecraft.block.state.IBlockState p0) {
return ((moom.ac)(((moom.ac)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.ef.Q))))))).a();
}


protected moom.fA a__fA() {
return new moom.fA(this, new net.minecraft.block.properties.IProperty[] {moom.ef.Q});
}


public void a(net.minecraft.item.Item p0, net.minecraft.creativetab.CreativeTabs p1, java.util.List<net.minecraft.item.ItemStack> p2) {
int[] spill1149_0;
    long life4_3;
    moom.ac[] life7_6;
    int[] life6_7;
    int life8_10;
    int life9_12;
    moom.ac life10_19;
    lexical_join_33: {
    life4_3 = (moom.ef.R ^ 26284755828752L);
    spill1149_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life7_6 = moom.ac.values();
    life6_7 = spill1149_0;
    life8_10 = (life7_6).length;
    life9_12 = 0;
    lexical_cycle_13: while (true) {
    if (!((life9_12 < life8_10))) {
        break lexical_join_33;
    }
    life10_19 = (life7_6)[life9_12];
    ((java.util.List)(p2)).add(((java.lang.Object)(new net.minecraft.item.ItemStack(p0, 1, ((moom.ac)(life10_19)).a()))));
    life9_12 += 1;
    if (!((life6_7 == null))) { continue lexical_cycle_13; }
    break lexical_cycle_13;
    }
    }
    return;
}


public moom.fm a__fm(net.minecraft.block.state.IBlockState p0) {
return moom.fm.d;
}

}
