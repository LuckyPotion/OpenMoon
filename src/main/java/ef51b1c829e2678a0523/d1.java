package moom;


public class d1 extends net.minecraft.block.Block {

public static final moom.fw<net.minecraft.block.BlockQuartz$EnumType> Q;

private static final long R;

public d1() {
super(moom.fn.e);
    (this).a__Void(((this.M).a__fE()).a__fE(moom.d1.Q, net.minecraft.block.BlockQuartz$EnumType.DEFAULT));
    (this).a(net.minecraft.creativetab.CreativeTabs.b);
}


static {
R = (moom._c.a(-1600401261951947819L, 612314775362009765L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(221214976539038L);
    Q = moom.fw.a("variant", net.minecraft.block.BlockQuartz$EnumType.class);
}


public net.minecraft.block.state.IBlockState b__fE(int p0) {
return ((net.minecraft.block.state.IBlockState)(((moom.d1)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.d1.Q)), ((java.lang.Comparable)(net.minecraft.block.BlockQuartz$EnumType.a(((int)(p0))))));
}


public int b(net.minecraft.block.state.IBlockState p0) {
return ((net.minecraft.block.BlockQuartz$EnumType)(((net.minecraft.block.BlockQuartz$EnumType)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.d1.Q))))))).a();
}


public int c(net.minecraft.block.state.IBlockState p0) {
net.minecraft.block.BlockQuartz$EnumType forwardValue3180_25_0;
    int forwardValue3180_26_0;
    int[] spill3180_0;
    net.minecraft.block.BlockQuartz$EnumType spill3180_1;
    net.minecraft.block.BlockQuartz$EnumType spill3180_2;
    long life2_3;
    net.minecraft.block.BlockQuartz$EnumType life5_9;
    int[] life4_10;
    forward_join_26: {
    forward_join_25: {
    forward_join_24: {
    life2_3 = (moom.d1.R ^ 99675820317268L);
    spill3180_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life5_9 = ((net.minecraft.block.BlockQuartz$EnumType)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.d1.Q)))));
    life4_10 = spill3180_0;
    spill3180_1 = life5_9;
    if (!((life4_10 != null))) {
        forwardValue3180_25_0 = spill3180_1;
        break forward_join_25;
    }
    if (!((spill3180_1 != net.minecraft.block.BlockQuartz$EnumType.LINES_X))) {
        break forward_join_24;
    }
    spill3180_2 = life5_9;
    if (!((life4_10 != null))) {
        forwardValue3180_25_0 = spill3180_2;
        break forward_join_25;
    }
    if (!((spill3180_2 != net.minecraft.block.BlockQuartz$EnumType.LINES_Z))) {
        break forward_join_24;
    }
    forwardValue3180_26_0 = ((net.minecraft.block.BlockQuartz$EnumType)(life5_9)).a();
    break forward_join_26;
    }
    forwardValue3180_25_0 = net.minecraft.block.BlockQuartz$EnumType.LINES_Y;
    }
    forwardValue3180_26_0 = ((net.minecraft.block.BlockQuartz$EnumType)(forwardValue3180_25_0)).a();
    }
    return forwardValue3180_26_0;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


protected moom.fA a__fA() {
return new moom.fA(this, new net.minecraft.block.properties.IProperty[] {moom.d1.Q});
}


public net.minecraft.block.state.IBlockState a(net.minecraft.world.World p0, moom.DT p1, moom.bs p2, float p3, float p4, float p5, int p6, net.minecraft.entity.EntityLivingBase p7) {
int forestValue403_39_0;
    int forestValue403_39_1;
    net.minecraft.block.state.IBlockState forestValue403_51_0;
    int spill403_0;
    int spill403_1;
    long life9_3;
    int[] life11_5;
    forest_join_51: {
    forest_join_46: {
    forest_join_39: {
    forest_join_36: {
    forest_join_30: {
    forest_join_24: {
    forest_join_18: {
    life9_3 = (moom.d1.R ^ 103716868624027L);
    life11_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill403_0 = p6;
    spill403_1 = ((net.minecraft.block.BlockQuartz$EnumType)(net.minecraft.block.BlockQuartz$EnumType.LINES_Y)).a();
    if (!((life11_5 != null))) {
        forestValue403_39_0 = spill403_0;
        forestValue403_39_1 = spill403_1;
        break forest_join_39;
    }
    if (!((spill403_0 == spill403_1))) {
        break forest_join_36;
    }
    switch ((moom.e6.a)[((net.minecraft.util.EnumFacing$Axis)(((moom.bs)(p2)).a__bt())).ordinal()]) {
case 1:
{
        break forest_join_18;
    }
case 2:
{
        break forest_join_24;
    }
case 3:
default:
{
        break forest_join_30;
    }
}
    }
    return ((net.minecraft.block.state.IBlockState)(((moom.d1)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.d1.Q)), ((java.lang.Comparable)(net.minecraft.block.BlockQuartz$EnumType.LINES_Z)));
    }
    return ((net.minecraft.block.state.IBlockState)(((moom.d1)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.d1.Q)), ((java.lang.Comparable)(net.minecraft.block.BlockQuartz$EnumType.LINES_X)));
    }
    return ((net.minecraft.block.state.IBlockState)(((moom.d1)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.d1.Q)), ((java.lang.Comparable)(net.minecraft.block.BlockQuartz$EnumType.LINES_Y)));
    }
    forestValue403_39_0 = p6;
    forestValue403_39_1 = ((net.minecraft.block.BlockQuartz$EnumType)(net.minecraft.block.BlockQuartz$EnumType.CHISELED)).a();
    }
    if (!((forestValue403_39_0 == forestValue403_39_1))) {
        break forest_join_46;
    }
    forestValue403_51_0 = ((net.minecraft.block.state.IBlockState)(((moom.d1)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.d1.Q)), ((java.lang.Comparable)(net.minecraft.block.BlockQuartz$EnumType.CHISELED)));
    break forest_join_51;
    }
    forestValue403_51_0 = ((net.minecraft.block.state.IBlockState)(((moom.d1)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.d1.Q)), ((java.lang.Comparable)(net.minecraft.block.BlockQuartz$EnumType.DEFAULT)));
    }
    return forestValue403_51_0;
}


protected net.minecraft.item.ItemStack a__xW(net.minecraft.block.state.IBlockState p0) {
net.minecraft.block.BlockQuartz$EnumType forwardValue3179_18_0;
    net.minecraft.block.BlockQuartz$EnumType forwardValue3179_18_1;
    net.minecraft.item.ItemStack forwardValue3179_31_0;
    int[] spill3179_0;
    net.minecraft.block.BlockQuartz$EnumType spill3179_1;
    net.minecraft.block.BlockQuartz$EnumType spill3179_2;
    long life2_3;
    net.minecraft.block.BlockQuartz$EnumType life5_9;
    int[] life4_10;
    forward_join_31: {
    forward_join_23: {
    forward_join_18: {
    life2_3 = (moom.d1.R ^ 56079134933446L);
    spill3179_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life5_9 = ((net.minecraft.block.BlockQuartz$EnumType)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.d1.Q)))));
    life4_10 = spill3179_0;
    spill3179_1 = life5_9;
    spill3179_2 = net.minecraft.block.BlockQuartz$EnumType.LINES_X;
    if (!((life4_10 != null))) {
        forwardValue3179_18_0 = spill3179_1;
        forwardValue3179_18_1 = spill3179_2;
        break forward_join_18;
    }
    if (!((spill3179_1 != spill3179_2))) {
        break forward_join_23;
    }
    forwardValue3179_18_0 = life5_9;
    forwardValue3179_18_1 = net.minecraft.block.BlockQuartz$EnumType.LINES_Z;
    }
    if (!((forwardValue3179_18_0 != forwardValue3179_18_1))) {
        break forward_join_23;
    }
    forwardValue3179_31_0 = super.a__xW(((net.minecraft.block.state.IBlockState)(p0)));
    break forward_join_31;
    }
    forwardValue3179_31_0 = new net.minecraft.item.ItemStack(net.minecraft.item.Item.a(((net.minecraft.block.Block)(this))), 1, ((net.minecraft.block.BlockQuartz$EnumType)(net.minecraft.block.BlockQuartz$EnumType.LINES_Y)).a());
    }
    return forwardValue3179_31_0;
}


public void a(net.minecraft.item.Item p0, net.minecraft.creativetab.CreativeTabs p1, java.util.List<net.minecraft.item.ItemStack> p2) {
((java.util.List)(p2)).add(((java.lang.Object)(new net.minecraft.item.ItemStack(p0, 1, ((net.minecraft.block.BlockQuartz$EnumType)(net.minecraft.block.BlockQuartz$EnumType.DEFAULT)).a()))));
    ((java.util.List)(p2)).add(((java.lang.Object)(new net.minecraft.item.ItemStack(p0, 1, ((net.minecraft.block.BlockQuartz$EnumType)(net.minecraft.block.BlockQuartz$EnumType.CHISELED)).a()))));
    ((java.util.List)(p2)).add(((java.lang.Object)(new net.minecraft.item.ItemStack(p0, 1, ((net.minecraft.block.BlockQuartz$EnumType)(net.minecraft.block.BlockQuartz$EnumType.LINES_Y)).a()))));
    return;
}


public moom.fm a__fm(net.minecraft.block.state.IBlockState p0) {
return moom.fm.p;
}

}
