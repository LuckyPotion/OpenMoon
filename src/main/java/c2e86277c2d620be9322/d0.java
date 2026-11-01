package moom;


public class d0 extends net.minecraft.block.Block {

public static final moom.fw<net.minecraft.block.BlockPrismarine$EnumType> Q;

public static final int R;

public static final int S;

public static final int T;

private static final long U;

public d0() {
super(moom.fn.e);
    (this).a__Void(((this.M).a__fE()).a__fE(moom.d0.Q, net.minecraft.block.BlockPrismarine$EnumType.ROUGH));
    (this).a(net.minecraft.creativetab.CreativeTabs.b);
}


static {
moom.d0.U = (moom._c.a(-4023541220852740291L, -6524201922594398879L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(125545933874492L);
    moom.d0.Q = moom.fw.a("variant", net.minecraft.block.BlockPrismarine$EnumType.class);
    moom.d0.R = (net.minecraft.block.BlockPrismarine$EnumType.ROUGH).a();
    moom.d0.S = (net.minecraft.block.BlockPrismarine$EnumType.BRICKS).a();
    moom.d0.T = (net.minecraft.block.BlockPrismarine$EnumType.DARK).a();
}


public int b(net.minecraft.block.state.IBlockState p0) {
return ((net.minecraft.block.BlockPrismarine$EnumType)(((net.minecraft.block.BlockPrismarine$EnumType)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.d0.Q))))))).a();
}


public net.minecraft.block.state.IBlockState b__fE(int p0) {
return ((net.minecraft.block.state.IBlockState)(((moom.d0)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.d0.Q)), ((java.lang.Comparable)(net.minecraft.block.BlockPrismarine$EnumType.a(((int)(p0))))));
}


public int c(net.minecraft.block.state.IBlockState p0) {
return ((net.minecraft.block.BlockPrismarine$EnumType)(((net.minecraft.block.BlockPrismarine$EnumType)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.d0.Q))))))).a();
}


public void a(net.minecraft.item.Item p0, net.minecraft.creativetab.CreativeTabs p1, java.util.List<net.minecraft.item.ItemStack> p2) {
((java.util.List)(p2)).add(((java.lang.Object)(new net.minecraft.item.ItemStack(p0, 1, moom.d0.R))));
    ((java.util.List)(p2)).add(((java.lang.Object)(new net.minecraft.item.ItemStack(p0, 1, moom.d0.S))));
    ((java.util.List)(p2)).add(((java.lang.Object)(new net.minecraft.item.ItemStack(p0, 1, moom.d0.T))));
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


protected moom.fA a__fA() {
return new moom.fA(this, new net.minecraft.block.properties.IProperty[] {moom.d0.Q});
}


public moom.fm a__fm(net.minecraft.block.state.IBlockState p0) {
long local2 = (moom.d0.U ^ 67553053104012L);
    return ((((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.d0.Q))) == net.minecraft.block.BlockPrismarine$EnumType.ROUGH) ? moom.fm.y : moom.fm.G);
}


public java.lang.String a__String() {
return net.minecraft.util.StatCollector.a(((java.lang.String)(__sourceIntrinsic_64ccfb84e285_originalDynamicSite1405_3(((moom.d0)(this)).b__String(), ((net.minecraft.block.BlockPrismarine$EnumType)(net.minecraft.block.BlockPrismarine$EnumType.ROUGH)).b()))));
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_64ccfb84e285_originalDynamicSite1405_3(java.lang.String a0, java.lang.String a1) throws E;
}
