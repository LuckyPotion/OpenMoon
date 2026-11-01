package moom;


public class eh extends net.minecraft.block.Block {

public static final moom.fw<net.minecraft.block.BlockSilverfish$EnumType> Q;

private static final long R;

public eh() {
super(moom.fn.B);
    (this).a__Void(((this.M).a__fE()).a__fE(moom.eh.Q, net.minecraft.block.BlockSilverfish$EnumType.STONE));
    (this).c(0x0.0p+0f);
    (this).a(net.minecraft.creativetab.CreativeTabs.c);
}


static {
R = (moom._c.a(2196648104979103407L, -2167647023914487420L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(63005738924999L);
    Q = moom.fw.a("variant", net.minecraft.block.BlockSilverfish$EnumType.class);
}


public net.minecraft.block.state.IBlockState b__fE(int p0) {
return ((net.minecraft.block.state.IBlockState)(((moom.eh)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.eh.Q)), ((java.lang.Comparable)(net.minecraft.block.BlockSilverfish$EnumType.a(((int)(p0))))));
}


public int b(net.minecraft.block.state.IBlockState p0) {
return ((net.minecraft.block.BlockSilverfish$EnumType)(((net.minecraft.block.BlockSilverfish$EnumType)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.eh.Q))))))).a();
}


public void a(net.minecraft.item.Item p0, net.minecraft.creativetab.CreativeTabs p1, java.util.List<net.minecraft.item.ItemStack> p2) {
int[] spill1150_0;
    long life4_3;
    net.minecraft.block.BlockSilverfish$EnumType[] life7_6;
    int[] life6_7;
    int life8_10;
    int life9_12;
    net.minecraft.block.BlockSilverfish$EnumType life10_19;
    lexical_join_33: {
    life4_3 = (moom.eh.R ^ 4146950422218L);
    spill1150_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life7_6 = net.minecraft.block.BlockSilverfish$EnumType.values();
    life6_7 = spill1150_0;
    life8_10 = (life7_6).length;
    life9_12 = 0;
    lexical_cycle_13: while (true) {
    if (!((life9_12 < life8_10))) {
        break lexical_join_33;
    }
    life10_19 = (life7_6)[life9_12];
    ((java.util.List)(p2)).add(((java.lang.Object)(new net.minecraft.item.ItemStack(p0, 1, ((net.minecraft.block.BlockSilverfish$EnumType)(life10_19)).a()))));
    life9_12 += 1;
    if (!((life6_7 == null))) { continue lexical_cycle_13; }
    break lexical_cycle_13;
    }
    }
    return;
}


protected moom.fA a__fA() {
return new moom.fA(this, new net.minecraft.block.properties.IProperty[] {moom.eh.Q});
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public int a(java.util.Random p0) {
return 0;
}


public static boolean a__Boolean(net.minecraft.block.state.IBlockState p0) {
net.minecraft.block.Block forwardValue3463_23_0;
    net.minecraft.block.Block forwardValue3463_23_1;
    int forwardValue3463_27_0;
    int[] spill3463_0;
    net.minecraft.block.Block spill3463_1;
    net.minecraft.block.Block spill3463_2;
    long life1_3;
    net.minecraft.block.Block life4_7;
    int[] life3_8;
    forward_join_27: {
    forward_join_26: {
    forward_join_24: {
    forward_join_23: {
    life1_3 = (moom.eh.R ^ 3045810522075L);
    spill3463_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life4_7 = ((net.minecraft.block.state.IBlockState)(p0)).a__ch();
    life3_8 = spill3463_0;
    if (!((p0 != ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.ex.Q)), ((java.lang.Comparable)(net.minecraft.block.BlockStone$EnumType.STONE)))))) {
        break forward_join_24;
    }
    spill3463_1 = life4_7;
    spill3463_2 = net.minecraft.init.Blocks.e;
    if (!((life3_8 != null))) {
        forwardValue3463_23_0 = spill3463_1;
        forwardValue3463_23_1 = spill3463_2;
        break forward_join_23;
    }
    if (!((spill3463_1 != spill3463_2))) {
        break forward_join_24;
    }
    forwardValue3463_23_0 = life4_7;
    forwardValue3463_23_1 = net.minecraft.init.Blocks.a5;
    }
    if (!((forwardValue3463_23_0 == forwardValue3463_23_1))) {
        break forward_join_26;
    }
    }
    forwardValue3463_27_0 = 1;
    break forward_join_27;
    }
    forwardValue3463_27_0 = 0;
    }
    return ((forwardValue3463_27_0) != 0);
}


protected net.minecraft.item.ItemStack a__xW(net.minecraft.block.state.IBlockState p0) {
long local2 = (moom.eh.R ^ 86780630935895L);
    switch ((moom.fb.a)[((net.minecraft.block.BlockSilverfish$EnumType)(((net.minecraft.block.BlockSilverfish$EnumType)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.eh.Q))))))).ordinal()]) {
case 1:
{
        return new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.e);
    }
case 2:
{
        return new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.a5);
    }
case 3:
{
        return new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.a5, 1, ((net.minecraft.block.BlockStoneBrick$EnumType)(net.minecraft.block.BlockStoneBrick$EnumType.MOSSY)).a());
    }
case 4:
{
        return new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.a5, 1, ((net.minecraft.block.BlockStoneBrick$EnumType)(net.minecraft.block.BlockStoneBrick$EnumType.CRACKED)).a());
    }
case 5:
{
        return new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.a5, 1, ((net.minecraft.block.BlockStoneBrick$EnumType)(net.minecraft.block.BlockStoneBrick$EnumType.CHISELED)).a());
    }
default:
{
        return new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.b);
    }
}
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, float p3, int p4) {
int forwardValue3462_15_0;
    boolean spill3462_0;
    long life6_3;
    int[] life8_5;
    moom.s7 life9_26;
    forward_join_44: {
    forward_join_15: {
    life6_3 = (moom.eh.R ^ 42215005984612L);
    life8_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3462_0 = ((net.minecraft.world.World)(p0)).G;
    if (!((life8_5 != null))) {
        forwardValue3462_15_0 = ((spill3462_0) ? 1 : 0);
        break forward_join_15;
    }
    if (!((!spill3462_0))) {
        break forward_join_44;
    }
    forwardValue3462_15_0 = ((((net.minecraft.world.GameRules)(((net.minecraft.world.World)(p0)).a__Ej())).a__Boolean(((java.lang.String)("doTileDrops")))) ? 1 : 0);
    }
    if (!((forwardValue3462_15_0 != 0))) {
        break forward_join_44;
    }
    life9_26 = new moom.s7(p0);
    ((moom.s7)(life9_26)).c(((double)((((double) ((moom.DT)(p1)).a()) + 0x1.0p-1d))), ((double)(((double) ((moom.DT)(p1)).b()))), ((double)((((double) ((moom.DT)(p1)).c()) + 0x1.0p-1d))), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)));
    ((net.minecraft.world.World)(p0)).b__Boolean(((net.minecraft.entity.Entity)(life9_26)));
    ((moom.s7)(life9_26)).P();
    }
    return;
}


public int a__Int(net.minecraft.world.World p0, moom.DT p1) {
java.lang.Object local3 = ((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(p1)));
    return ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(local3)).a__ch())).b(((net.minecraft.block.state.IBlockState)(local3)));
}

}
