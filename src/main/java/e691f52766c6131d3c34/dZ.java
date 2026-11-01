package moom;


public class dZ extends net.minecraft.block.Block {

public static final moom.fw<net.minecraft.block.BlockPlanks$EnumType> Q;

private static final long R;

public dZ() {
super(moom.fn.d);
    (this).a__Void(((this.M).a__fE()).a__fE(moom.dZ.Q, net.minecraft.block.BlockPlanks$EnumType.OAK));
    (this).a(net.minecraft.creativetab.CreativeTabs.b);
}


static {
R = (moom._c.a(5828287728505476849L, -7411970405903777164L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(28976641423800L);
    Q = moom.fw.a("variant", net.minecraft.block.BlockPlanks$EnumType.class);
}


public int b(net.minecraft.block.state.IBlockState p0) {
return ((net.minecraft.block.BlockPlanks$EnumType)(((net.minecraft.block.BlockPlanks$EnumType)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.dZ.Q))))))).a();
}


public net.minecraft.block.state.IBlockState b__fE(int p0) {
return ((net.minecraft.block.state.IBlockState)(((moom.dZ)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.dZ.Q)), ((java.lang.Comparable)(net.minecraft.block.BlockPlanks$EnumType.a(((int)(p0))))));
}


public int c(net.minecraft.block.state.IBlockState p0) {
return ((net.minecraft.block.BlockPlanks$EnumType)(((net.minecraft.block.BlockPlanks$EnumType)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.dZ.Q))))))).a();
}


public moom.fm a__fm(net.minecraft.block.state.IBlockState p0) {
return ((net.minecraft.block.BlockPlanks$EnumType)(((net.minecraft.block.BlockPlanks$EnumType)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.dZ.Q))))))).a__fm();
}


protected moom.fA a__fA() {
return new moom.fA(this, new net.minecraft.block.properties.IProperty[] {moom.dZ.Q});
}


public void a(net.minecraft.item.Item p0, net.minecraft.creativetab.CreativeTabs p1, java.util.List<net.minecraft.item.ItemStack> p2) {
int[] spill1115_0;
    long life4_3;
    net.minecraft.block.BlockPlanks$EnumType[] life7_5;
    int life8_9;
    int[] life6_10;
    int life9_12;
    net.minecraft.block.BlockPlanks$EnumType life10_19;
    lexical_join_33: {
    life4_3 = (moom.dZ.R ^ 8557000644621L);
    life7_5 = net.minecraft.block.BlockPlanks$EnumType.values();
    spill1115_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life8_9 = (life7_5).length;
    life6_10 = spill1115_0;
    life9_12 = 0;
    lexical_cycle_13: while (true) {
    if (!((life9_12 < life8_9))) {
        break lexical_join_33;
    }
    life10_19 = (life7_5)[life9_12];
    ((java.util.List)(p2)).add(((java.lang.Object)(new net.minecraft.item.ItemStack(p0, 1, ((net.minecraft.block.BlockPlanks$EnumType)(life10_19)).a()))));
    life9_12 += 1;
    if (!((life6_10 == null))) { continue lexical_cycle_13; }
    break lexical_cycle_13;
    }
    }
    return;
}

}
