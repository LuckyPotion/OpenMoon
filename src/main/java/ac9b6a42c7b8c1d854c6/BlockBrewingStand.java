package net.minecraft.block;


public class BlockBrewingStand extends moom.cT {

public static final moom.fv[] R;

private static final long S;

public BlockBrewingStand() {
super(moom.fn.f);
    ((net.minecraft.block.BlockBrewingStand)(this)).a__Void(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((moom.fA)(((net.minecraft.block.BlockBrewingStand)(this)).M)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)((net.minecraft.block.BlockBrewingStand.R)[0])), ((java.lang.Comparable)(java.lang.Boolean.FALSE))))).a__fE(((net.minecraft.block.properties.IProperty)((net.minecraft.block.BlockBrewingStand.R)[1])), ((java.lang.Comparable)(java.lang.Boolean.FALSE))))).a__fE(((net.minecraft.block.properties.IProperty)((net.minecraft.block.BlockBrewingStand.R)[2])), ((java.lang.Comparable)(java.lang.Boolean.FALSE))))));
    return;
}


static {
S = ((long)(((moom._a)(moom._c.a(((long)(5973082485199737280L)), ((long)(-7715610119241713888L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(214363230953511L)))));
    R = ((moom.fv[])(new moom.fv[] {moom.fv.a(((java.lang.String)("has_bottle_0"))), moom.fv.a(((java.lang.String)("has_bottle_1"))), moom.fv.a(((java.lang.String)("has_bottle_2")))}));
}


public net.minecraft.block.state.IBlockState b__fE(int p0) {
net.minecraft.block.state.IBlockState lexicalValue1458_29_0;
    moom.fv lexicalValue1458_29_1;
    int lexicalValue1458_29_2;
    net.minecraft.block.state.IBlockState lexicalValue1458_30_0;
    moom.fv lexicalValue1458_30_1;
    net.minecraft.block.state.IBlockState lexicalValue1458_31_0;
    moom.fv lexicalValue1458_31_1;
    int lexicalValue1458_31_2;
    net.minecraft.block.state.IBlockState lexicalValue1458_38_0;
    int[] spill1458_0;
    net.minecraft.block.state.IBlockState spill1458_1;
    moom.fv spill1458_2;
    int spill1458_3;
    long life2_3;
    net.minecraft.block.state.IBlockState life5_7;
    int life6_9;
    int[] life4_10;
    lexical_join_38: {
    lexical_join_37: {
    life2_3 = (net.minecraft.block.BlockBrewingStand.S ^ 31766046536855L);
    spill1458_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life5_7 = ((net.minecraft.block.BlockBrewingStand)(this)).a__fE();
    life6_9 = 0;
    life4_10 = spill1458_0;
    lexical_cycle_11: while (true) {
    lexical_join_31: {
    lexical_join_30: {
    lexical_join_29: {
    if (!((life6_9 < 3))) {
        break lexical_join_37;
    }
    spill1458_1 = life5_7;
    if (!((life4_10 != null))) {
        lexicalValue1458_38_0 = spill1458_1;
        break lexical_join_38;
    }
    spill1458_2 = (net.minecraft.block.BlockBrewingStand.R)[life6_9];
    spill1458_3 = (p0 & (1 << life6_9));
    if (!((life4_10 != null))) {
        lexicalValue1458_29_0 = spill1458_1;
        lexicalValue1458_29_1 = spill1458_2;
        lexicalValue1458_29_2 = spill1458_3;
        break lexical_join_29;
    }
    if (!((spill1458_3 > 0))) {
        lexicalValue1458_30_0 = spill1458_1;
        lexicalValue1458_30_1 = spill1458_2;
        break lexical_join_30;
    }
    lexicalValue1458_29_0 = spill1458_1;
    lexicalValue1458_29_1 = spill1458_2;
    lexicalValue1458_29_2 = 1;
    }
    lexicalValue1458_31_0 = lexicalValue1458_29_0;
    lexicalValue1458_31_1 = lexicalValue1458_29_1;
    lexicalValue1458_31_2 = lexicalValue1458_29_2;
    break lexical_join_31;
    }
    lexicalValue1458_31_0 = lexicalValue1458_30_0;
    lexicalValue1458_31_1 = lexicalValue1458_30_1;
    lexicalValue1458_31_2 = 0;
    }
    life5_7 = ((net.minecraft.block.state.IBlockState)(lexicalValue1458_31_0)).a__fE(((net.minecraft.block.properties.IProperty)(lexicalValue1458_31_1)), ((java.lang.Comparable)(java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((lexicalValue1458_31_2)))))));
    life6_9 += 1;
    if (!((life4_10 == null))) { continue lexical_cycle_11; }
    break lexical_cycle_11;
    }
    }
    lexicalValue1458_38_0 = life5_7;
    }
    return lexicalValue1458_38_0;
}


public int b(net.minecraft.world.World p0, moom.DT p1) {
return moom.v8.a(((net.minecraft.tileentity.TileEntity)(((net.minecraft.world.World)(p0)).a__B9(((moom.DT)(p1))))));
}


public int b(net.minecraft.block.state.IBlockState p0) {
int lexicalValue1457_30_0;
    int lexicalValue1457_35_0;
    int[] spill1457_0;
    boolean spill1457_1;
    long life2_3;
    int life5_6;
    int[] life4_7;
    int life6_9;
    lexical_join_35: {
    lexical_join_34: {
    life2_3 = (net.minecraft.block.BlockBrewingStand.S ^ 17936767192989L);
    spill1457_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life5_6 = 0;
    life4_7 = spill1457_0;
    life6_9 = 0;
    lexical_cycle_10: while (true) {
    lexical_join_31: {
    lexical_join_30: {
    if (!((life6_9 < 3))) {
        break lexical_join_34;
    }
    spill1457_1 = ((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)((net.minecraft.block.BlockBrewingStand.R)[life6_9]))))))).booleanValue();
    if (!((life4_7 != null))) {
        lexicalValue1457_35_0 = ((spill1457_1) ? 1 : 0);
        break lexical_join_35;
    }
    if (!((life4_7 != null))) {
        lexicalValue1457_30_0 = ((spill1457_1) ? 1 : 0);
        break lexical_join_30;
    }
    if (!(spill1457_1)) {
        break lexical_join_31;
    }
    lexicalValue1457_30_0 = (life5_6 | (1 << life6_9));
    }
    life5_6 = lexicalValue1457_30_0;
    }
    life6_9 += 1;
    if (!((life4_7 == null))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    lexicalValue1457_35_0 = life5_6;
    }
    return lexicalValue1457_35_0;
}


public void c(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
long life4_3;
    net.minecraft.tileentity.TileEntity life7_8;
    int[] life6_9;
    life4_3 = (net.minecraft.block.BlockBrewingStand.S ^ 99085281525795L);
    int[] spill8104_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life7_8 = ((net.minecraft.world.World)(p0)).a__B9(((moom.DT)(p1)));
    life6_9 = spill8104_0;
    if ((life6_9 != null)) {
        if ((((life7_8 instanceof net.minecraft.tileentity.TileEntityBrewingStand) ? 1 : 0) != 0)) {
        moom.wy.a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.inventory.IInventory)(((net.minecraft.tileentity.TileEntityBrewingStand)(life7_8)))));
    }
        super.c(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)));
    }
    return;
}


public void c(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, java.util.Random p3) {
double local5 = ((double) ((((float) ((moom.DT)(p1)).a()) + 0x1.99999ap-2f) + (((java.util.Random)(p3)).nextFloat() * 0x1.99999ap-3f)));
    double local7 = ((double) ((((float) ((moom.DT)(p1)).b()) + 0x1.666666p-1f) + (((java.util.Random)(p3)).nextFloat() * 0x1.333334p-2f)));
    double local9 = ((double) ((((float) ((moom.DT)(p1)).c()) + 0x1.99999ap-2f) + (((java.util.Random)(p3)).nextFloat() * 0x1.99999ap-3f)));
    ((net.minecraft.world.World)(p0)).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.SMOKE_NORMAL)), ((double)(local5)), ((double)(local7)), ((double)(local9)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((int[])(new int[0])));
    return;
}


public int c__Int() {
return 3;
}


public net.minecraft.tileentity.TileEntity a(net.minecraft.world.World p0, int p1) {
return new net.minecraft.tileentity.TileEntityBrewingStand();
}


public net.minecraft.item.Item a__wQ(net.minecraft.world.World p0, moom.DT p1) {
return net.minecraft.init.Items.bu;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public net.minecraft.util.EnumWorldBlockLayer a__bx() {
return net.minecraft.util.EnumWorldBlockLayer.CUTOUT;
}


protected moom.fA a__fA() {
return new moom.fA(this, new net.minecraft.block.properties.IProperty[] {(net.minecraft.block.BlockBrewingStand.R)[0], (net.minecraft.block.BlockBrewingStand.R)[1], (net.minecraft.block.BlockBrewingStand.R)[2]});
}


public java.lang.String a__String() {
return net.minecraft.util.StatCollector.a(((java.lang.String)("item.brewingStand.name")));
}


public boolean a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.entity.player.EntityPlayer p3, moom.bs p4, float p5, float p6, float p7) {
int forwardValue4649_28_0;
    boolean spill4649_0;
    int spill4649_1;
    long life9_3;
    int[] life11_5;
    net.minecraft.tileentity.TileEntity life12_17;
    forward_join_28: {
    forward_join_27: {
    life9_3 = (net.minecraft.block.BlockBrewingStand.S ^ 91112170172375L);
    life11_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill4649_0 = ((net.minecraft.world.World)(p0)).G;
    if (!((life11_5 != null))) {
        forwardValue4649_28_0 = ((spill4649_0) ? 1 : 0);
        break forward_join_28;
    }
    if (!((!spill4649_0))) {
        break forward_join_27;
    }
    life12_17 = ((net.minecraft.world.World)(p0)).a__B9(((moom.DT)(p1)));
    spill4649_1 = ((life12_17 instanceof net.minecraft.tileentity.TileEntityBrewingStand) ? 1 : 0);
    if (!((life11_5 != null))) {
        forwardValue4649_28_0 = spill4649_1;
        break forward_join_28;
    }
    if (!((spill4649_1 != 0))) {
        break forward_join_27;
    }
    ((net.minecraft.entity.player.EntityPlayer)(p3)).a(((net.minecraft.inventory.IInventory)(((net.minecraft.tileentity.TileEntityBrewingStand)(life12_17)))));
    ((net.minecraft.entity.player.EntityPlayer)(p3)).a(((moom.BY)(net.minecraft.stats.StatList.M)));
    }
    forwardValue4649_28_0 = 1;
    }
    return ((forwardValue4649_28_0) != 0);
}


public void a__Void() {
((net.minecraft.block.BlockBrewingStand)(this)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p-3f)), ((float)(0x1.0p0f)));
    return;
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.entity.EntityLivingBase p3, net.minecraft.item.ItemStack p4) {
net.minecraft.tileentity.TileEntity forwardValue4648_19_0;
    net.minecraft.tileentity.TileEntity spill4648_0;
    long life6_3;
    int[] life8_5;
    net.minecraft.tileentity.TileEntity life9_12;
    forward_join_23: {
    forward_join_19: {
    life6_3 = (net.minecraft.block.BlockBrewingStand.S ^ 80081137310212L);
    life8_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    if (!(((net.minecraft.item.ItemStack)(p4)).f__Boolean())) {
        break forward_join_23;
    }
    life9_12 = ((net.minecraft.world.World)(p0)).a__B9(((moom.DT)(p1)));
    spill4648_0 = life9_12;
    if (!((life8_5 != null))) {
        forwardValue4648_19_0 = spill4648_0;
        break forward_join_19;
    }
    if (!((((spill4648_0 instanceof net.minecraft.tileentity.TileEntityBrewingStand) ? 1 : 0) != 0))) {
        break forward_join_23;
    }
    forwardValue4648_19_0 = life9_12;
    }
    ((net.minecraft.tileentity.TileEntityBrewingStand)(((net.minecraft.tileentity.TileEntityBrewingStand)(forwardValue4648_19_0)))).a(((java.lang.String)(((net.minecraft.item.ItemStack)(p4)).b__String())));
    }
    return;
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, moom.CA p3, java.util.List<moom.CA> p4, net.minecraft.entity.Entity p5) {
((net.minecraft.block.BlockBrewingStand)(this)).a(((float)(0x1.cp-2f)), ((float)(0x0.0p0f)), ((float)(0x1.cp-2f)), ((float)(0x1.2p-1f)), ((float)(0x1.cp-1f)), ((float)(0x1.2p-1f)));
    super.a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((moom.CA)(p3)), ((java.util.List)(p4)), ((net.minecraft.entity.Entity)(p5)));
    ((net.minecraft.block.BlockBrewingStand)(this)).a__Void();
    super.a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((moom.CA)(p3)), ((java.util.List)(p4)), ((net.minecraft.entity.Entity)(p5)));
    return;
}


public net.minecraft.item.Item a(net.minecraft.block.state.IBlockState p0, java.util.Random p1, int p2) {
return net.minecraft.init.Items.bu;
}


public boolean g() {
return ((0) != 0);
}


public boolean j() {
return ((0) != 0);
}


public boolean r() {
return ((1) != 0);
}


private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
