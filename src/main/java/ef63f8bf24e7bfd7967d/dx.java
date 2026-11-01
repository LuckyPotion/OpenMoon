package moom;


public class dx extends moom.du {

public static final moom.fw<moom.ab> R;

private static final long S;

public dx() {
super();
    (this).a__Void(((this.M).a__fE()).a__fE(moom.dx.R, moom.ab.SAND));
}


static {
S = (moom._c.a(637312915767660131L, 131422815991984473L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(227007547367585L);
    R = moom.fw.a("variant", moom.ab.class);
}


public net.minecraft.block.state.IBlockState b__fE(int p0) {
return ((net.minecraft.block.state.IBlockState)(((moom.dx)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.dx.R)), ((java.lang.Comparable)(moom.ab.a(((int)(p0))))));
}


public int b(net.minecraft.block.state.IBlockState p0) {
return ((moom.ab)(((moom.ab)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.dx.R))))))).a();
}


public int c(net.minecraft.block.state.IBlockState p0) {
return ((moom.ab)(((moom.ab)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.dx.R))))))).a();
}


protected moom.fA a__fA() {
return new moom.fA(this, new net.minecraft.block.properties.IProperty[] {moom.dx.R});
}


public void a(net.minecraft.item.Item p0, net.minecraft.creativetab.CreativeTabs p1, java.util.List<net.minecraft.item.ItemStack> p2) {
int[] spill1125_0;
    long life4_3;
    moom.ab[] life7_5;
    int life8_9;
    int[] life6_10;
    int life9_12;
    moom.ab life10_19;
    lexical_join_33: {
    life4_3 = (moom.dx.S ^ 97877390692665L);
    life7_5 = moom.ab.values();
    spill1125_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life8_9 = (life7_5).length;
    life6_10 = spill1125_0;
    life9_12 = 0;
    lexical_cycle_13: while (true) {
    if (!((life9_12 < life8_9))) {
        break lexical_join_33;
    }
    life10_19 = (life7_5)[life9_12];
    ((java.util.List)(p2)).add(((java.lang.Object)(new net.minecraft.item.ItemStack(p0, 1, ((moom.ab)(life10_19)).a()))));
    life9_12 += 1;
    if (!((life6_10 == null))) { continue lexical_cycle_13; }
    break lexical_cycle_13;
    }
    }
    return;
}


public moom.fm a__fm(net.minecraft.block.state.IBlockState p0) {
return ((moom.ab)(((moom.ab)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.dx.R))))))).a__fm();
}

}
