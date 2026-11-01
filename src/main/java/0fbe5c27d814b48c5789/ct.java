package moom;


public class ct extends moom.co {

public static final moom.fw<net.minecraft.item.EnumDyeColor> R;

private static final long T;

public ct(moom.fn p0) {
super(p0, false);
    (this).a__Void(((this.M).a__fE()).a__fE(moom.ct.R, net.minecraft.item.EnumDyeColor.WHITE));
    (this).a(net.minecraft.creativetab.CreativeTabs.b);
}


static {
T = (moom._c.a(-1532685308964268127L, 7017751425035888464L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(240729282743180L);
    R = moom.fw.a("color", net.minecraft.item.EnumDyeColor.class);
}


public net.minecraft.block.state.IBlockState b__fE(int p0) {
return ((net.minecraft.block.state.IBlockState)(((moom.ct)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.ct.R)), ((java.lang.Comparable)(net.minecraft.item.EnumDyeColor.b(((int)(p0))))));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public void b__Void(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
net.minecraft.world.World forwardValue3150_12_0;
    net.minecraft.world.World spill3150_0;
    long life4_3;
    int[] life6_5;
    forward_join_14: {
    forward_join_12: {
    life4_3 = (moom.ct.T ^ 62088191451754L);
    life6_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3150_0 = p0;
    if (!((life6_5 != null))) {
        forwardValue3150_12_0 = spill3150_0;
        break forward_join_12;
    }
    if (!((!((net.minecraft.world.World)(spill3150_0)).G))) {
        break forward_join_14;
    }
    forwardValue3150_12_0 = p0;
    }
    __sourceExactCall_8092b703abccaf(((net.minecraft.world.World)(forwardValue3150_12_0)), ((moom.DT)(p1)));
    }
    return;
}


public int b(net.minecraft.block.state.IBlockState p0) {
return ((net.minecraft.item.EnumDyeColor)(((net.minecraft.item.EnumDyeColor)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.ct.R))))))).a();
}


public int c(net.minecraft.block.state.IBlockState p0) {
return ((net.minecraft.item.EnumDyeColor)(((net.minecraft.item.EnumDyeColor)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.ct.R))))))).a();
}


public void c(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
net.minecraft.world.World forwardValue3151_12_0;
    net.minecraft.world.World spill3151_0;
    long life4_3;
    int[] life6_5;
    forward_join_14: {
    forward_join_12: {
    life4_3 = (moom.ct.T ^ 101574857157576L);
    life6_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3151_0 = p0;
    if (!((life6_5 != null))) {
        forwardValue3151_12_0 = spill3151_0;
        break forward_join_12;
    }
    if (!((!((net.minecraft.world.World)(spill3151_0)).G))) {
        break forward_join_14;
    }
    forwardValue3151_12_0 = p0;
    }
    __sourceExactCall_8092b703abccaf(((net.minecraft.world.World)(forwardValue3151_12_0)), ((moom.DT)(p1)));
    }
    return;
}


protected moom.fA a__fA() {
return new moom.fA(this, new net.minecraft.block.properties.IProperty[] {moom.ct.R});
}


public void a(net.minecraft.item.Item p0, net.minecraft.creativetab.CreativeTabs p1, java.util.List<net.minecraft.item.ItemStack> p2) {
int[] spill1089_0;
    long life4_3;
    net.minecraft.item.EnumDyeColor[] life7_5;
    int life8_8;
    int life9_11;
    int[] life6_12;
    net.minecraft.item.EnumDyeColor life10_19;
    lexical_join_33: {
    life4_3 = (moom.ct.T ^ 29327013263649L);
    life7_5 = net.minecraft.item.EnumDyeColor.values();
    life8_8 = (life7_5).length;
    spill1089_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life9_11 = 0;
    life6_12 = spill1089_0;
    lexical_cycle_13: while (true) {
    if (!((life9_11 < life8_8))) {
        break lexical_join_33;
    }
    life10_19 = (life7_5)[life9_11];
    ((java.util.List)(p2)).add(((java.lang.Object)(new net.minecraft.item.ItemStack(p0, 1, ((net.minecraft.item.EnumDyeColor)(life10_19)).a()))));
    life9_11 += 1;
    if (!((life6_12 == null))) { continue lexical_cycle_13; }
    break lexical_cycle_13;
    }
    }
    return;
}


public moom.fm a__fm(net.minecraft.block.state.IBlockState p0) {
return ((net.minecraft.item.EnumDyeColor)(((net.minecraft.item.EnumDyeColor)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.ct.R))))))).a__fm();
}


public net.minecraft.util.EnumWorldBlockLayer a__bx() {
return net.minecraft.util.EnumWorldBlockLayer.TRANSLUCENT;
}


public int a(java.util.Random p0) {
return 0;
}


protected boolean m() {
return ((1) != 0);
}


public boolean g() {
return ((0) != 0);
}


private static native void __sourceExactCall_8092b703abccaf(net.minecraft.world.World p0, moom.DT p1);
}
