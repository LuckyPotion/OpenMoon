package moom;


public class cR extends net.minecraft.block.Block {

public static final moom.fw<net.minecraft.item.EnumDyeColor> Q;

private static final long R;

public cR(moom.fn p0) {
super(p0);
    (this).a__Void(((this.M).a__fE()).a__fE(moom.cR.Q, net.minecraft.item.EnumDyeColor.WHITE));
    (this).a(net.minecraft.creativetab.CreativeTabs.b);
}


static {
R = (moom._c.a(-1129714953975490905L, -3549086366951500075L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(258759199206134L);
    Q = moom.fw.a("color", net.minecraft.item.EnumDyeColor.class);
}


public net.minecraft.block.state.IBlockState b__fE(int p0) {
return ((net.minecraft.block.state.IBlockState)(((moom.cR)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.cR.Q)), ((java.lang.Comparable)(net.minecraft.item.EnumDyeColor.b(((int)(p0))))));
}


public int b(net.minecraft.block.state.IBlockState p0) {
return ((net.minecraft.item.EnumDyeColor)(((net.minecraft.item.EnumDyeColor)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.cR.Q))))))).a();
}


public int c(net.minecraft.block.state.IBlockState p0) {
return ((net.minecraft.item.EnumDyeColor)(((net.minecraft.item.EnumDyeColor)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.cR.Q))))))).a();
}


protected moom.fA a__fA() {
return new moom.fA(this, new net.minecraft.block.properties.IProperty[] {moom.cR.Q});
}


public void a(net.minecraft.item.Item p0, net.minecraft.creativetab.CreativeTabs p1, java.util.List<net.minecraft.item.ItemStack> p2) {
int[] spill1078_0;
    long life4_3;
    net.minecraft.item.EnumDyeColor[] life7_6;
    int life8_9;
    int[] life6_10;
    int life9_12;
    net.minecraft.item.EnumDyeColor life10_19;
    lexical_join_33: {
    life4_3 = (moom.cR.R ^ 139125559234556L);
    spill1078_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life7_6 = net.minecraft.item.EnumDyeColor.values();
    life8_9 = (life7_6).length;
    life6_10 = spill1078_0;
    life9_12 = 0;
    lexical_cycle_13: while (true) {
    if (!((life9_12 < life8_9))) {
        break lexical_join_33;
    }
    life10_19 = (life7_6)[life9_12];
    ((java.util.List)(p2)).add(((java.lang.Object)(new net.minecraft.item.ItemStack(p0, 1, ((net.minecraft.item.EnumDyeColor)(life10_19)).a()))));
    life9_12 += 1;
    if (!((life6_10 == null))) { continue lexical_cycle_13; }
    break lexical_cycle_13;
    }
    }
    return;
}


public moom.fm a__fm(net.minecraft.block.state.IBlockState p0) {
return ((net.minecraft.item.EnumDyeColor)(((net.minecraft.item.EnumDyeColor)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.cR.Q))))))).a__fm();
}

}
