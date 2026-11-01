package moom;


public class ex extends net.minecraft.block.Block {

public static final moom.fw<net.minecraft.block.BlockStone$EnumType> Q;

private static final long R;

public ex() {
super(moom.fn.e);
    (this).a__Void(((this.M).a__fE()).a__fE(moom.ex.Q, net.minecraft.block.BlockStone$EnumType.STONE));
    (this).a(net.minecraft.creativetab.CreativeTabs.b);
}


static {
R = (moom._c.a(1350912577650804383L, -6967527834241936328L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(125204389213805L);
    Q = moom.fw.a("variant", net.minecraft.block.BlockStone$EnumType.class);
}


public int b(net.minecraft.block.state.IBlockState p0) {
return ((net.minecraft.block.BlockStone$EnumType)(((net.minecraft.block.BlockStone$EnumType)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.ex.Q))))))).a();
}


public net.minecraft.block.state.IBlockState b__fE(int p0) {
return ((net.minecraft.block.state.IBlockState)(((moom.ex)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.ex.Q)), ((java.lang.Comparable)(net.minecraft.block.BlockStone$EnumType.a(((int)(p0))))));
}


public int c(net.minecraft.block.state.IBlockState p0) {
return ((net.minecraft.block.BlockStone$EnumType)(((net.minecraft.block.BlockStone$EnumType)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.ex.Q))))))).a();
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


protected moom.fA a__fA() {
return new moom.fA(this, new net.minecraft.block.properties.IProperty[] {moom.ex.Q});
}


public java.lang.String a__String() {
return net.minecraft.util.StatCollector.a(((java.lang.String)(__sourceIntrinsic_64ccfb84e285_originalDynamicSite1432_3(((moom.ex)(this)).b__String(), ((net.minecraft.block.BlockStone$EnumType)(net.minecraft.block.BlockStone$EnumType.STONE)).b()))));
}


public moom.fm a__fm(net.minecraft.block.state.IBlockState p0) {
return ((net.minecraft.block.BlockStone$EnumType)(((net.minecraft.block.BlockStone$EnumType)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.ex.Q))))))).a__fm();
}


public net.minecraft.item.Item a(net.minecraft.block.state.IBlockState p0, java.util.Random p1, int p2) {
long local4 = (moom.ex.R ^ 139578050538434L);
    return ((((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.ex.Q))) == net.minecraft.block.BlockStone$EnumType.STONE) ? net.minecraft.item.Item.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e))) : net.minecraft.item.Item.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b))));
}


public void a(net.minecraft.item.Item p0, net.minecraft.creativetab.CreativeTabs p1, java.util.List<net.minecraft.item.ItemStack> p2) {
int[] spill1156_0;
    long life4_3;
    net.minecraft.block.BlockStone$EnumType[] life7_6;
    int[] life6_7;
    int life8_10;
    int life9_12;
    net.minecraft.block.BlockStone$EnumType life10_19;
    lexical_join_33: {
    life4_3 = (moom.ex.R ^ 50182168236036L);
    spill1156_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life7_6 = net.minecraft.block.BlockStone$EnumType.values();
    life6_7 = spill1156_0;
    life8_10 = (life7_6).length;
    life9_12 = 0;
    lexical_cycle_13: while (true) {
    if (!((life9_12 < life8_10))) {
        break lexical_join_33;
    }
    life10_19 = (life7_6)[life9_12];
    ((java.util.List)(p2)).add(((java.lang.Object)(new net.minecraft.item.ItemStack(p0, 1, ((net.minecraft.block.BlockStone$EnumType)(life10_19)).a()))));
    life9_12 += 1;
    if (!((life6_7 == null))) { continue lexical_cycle_13; }
    break lexical_cycle_13;
    }
    }
    return;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_64ccfb84e285_originalDynamicSite1432_3(java.lang.String a0, java.lang.String a1) throws E;
}
