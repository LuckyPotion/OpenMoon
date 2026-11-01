package moom;


public class ey extends net.minecraft.block.Block {

public static final moom.fw<net.minecraft.block.BlockStoneBrick$EnumType> Q;

public static final int R;

public static final int S;

public static final int T;

public static final int U;

private static final long V;

public ey() {
super(moom.fn.e);
    (this).a__Void(((this.M).a__fE()).a__fE(moom.ey.Q, net.minecraft.block.BlockStoneBrick$EnumType.DEFAULT));
    (this).a(net.minecraft.creativetab.CreativeTabs.b);
}


static {
V = (moom._c.a(-2652215202957788625L, 5749863620852108261L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(94422581868245L);
    Q = moom.fw.a("variant", net.minecraft.block.BlockStoneBrick$EnumType.class);
    R = (net.minecraft.block.BlockStoneBrick$EnumType.DEFAULT).a();
    S = (net.minecraft.block.BlockStoneBrick$EnumType.MOSSY).a();
    T = (net.minecraft.block.BlockStoneBrick$EnumType.CRACKED).a();
    U = (net.minecraft.block.BlockStoneBrick$EnumType.CHISELED).a();
}


public net.minecraft.block.state.IBlockState b__fE(int p0) {
return ((net.minecraft.block.state.IBlockState)(((moom.ey)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.ey.Q)), ((java.lang.Comparable)(net.minecraft.block.BlockStoneBrick$EnumType.a(((int)(p0))))));
}


public int b(net.minecraft.block.state.IBlockState p0) {
return ((net.minecraft.block.BlockStoneBrick$EnumType)(((net.minecraft.block.BlockStoneBrick$EnumType)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.ey.Q))))))).a();
}


public int c(net.minecraft.block.state.IBlockState p0) {
return ((net.minecraft.block.BlockStoneBrick$EnumType)(((net.minecraft.block.BlockStoneBrick$EnumType)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.ey.Q))))))).a();
}


public void a(net.minecraft.item.Item p0, net.minecraft.creativetab.CreativeTabs p1, java.util.List<net.minecraft.item.ItemStack> p2) {
int[] spill1157_0;
    long life4_3;
    net.minecraft.block.BlockStoneBrick$EnumType[] life7_6;
    int[] life6_7;
    int life8_10;
    int life9_12;
    net.minecraft.block.BlockStoneBrick$EnumType life10_19;
    lexical_join_33: {
    life4_3 = (moom.ey.V ^ 656485154400L);
    spill1157_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life7_6 = net.minecraft.block.BlockStoneBrick$EnumType.values();
    life6_7 = spill1157_0;
    life8_10 = (life7_6).length;
    life9_12 = 0;
    lexical_cycle_13: while (true) {
    if (!((life9_12 < life8_10))) {
        break lexical_join_33;
    }
    life10_19 = (life7_6)[life9_12];
    ((java.util.List)(p2)).add(((java.lang.Object)(new net.minecraft.item.ItemStack(p0, 1, ((net.minecraft.block.BlockStoneBrick$EnumType)(life10_19)).a()))));
    life9_12 += 1;
    if (!((life6_7 == null))) { continue lexical_cycle_13; }
    break lexical_cycle_13;
    }
    }
    return;
}


protected moom.fA a__fA() {
return new moom.fA(this, new net.minecraft.block.properties.IProperty[] {moom.ey.Q});
}

}
