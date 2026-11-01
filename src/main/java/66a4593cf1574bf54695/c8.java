package moom;


public class c8 extends moom.cT {

public static final moom.fx R;

private final boolean S;

private static boolean T;

private static final long U;

protected c8(boolean p0) {
super(moom.fn.e);
    (this).a__Void(((this.M).a__fE()).a__fE(moom.c8.R, moom.bs.NORTH));
    this.S = p0;
}


static {
U = (moom._c.a(-3963307634278843679L, 8575658857045443201L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(62812286709790L);
    R = moom.fx.a("facing", net.minecraft.util.EnumFacing$Plane.HORIZONTAL);
}


public net.minecraft.block.state.IBlockState b__fE(int p0) {
moom.bs forwardValue3025_16_0;
    int[] spill3025_0;
    moom.bs spill3025_1;
    long life2_3;
    moom.bs life5_7;
    int[] life4_8;
    forward_join_17: {
    forward_join_16: {
    life2_3 = (moom.c8.U ^ 27735846058338L);
    spill3025_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life5_7 = moom.bs.a(((int)(p0)));
    life4_8 = spill3025_0;
    spill3025_1 = life5_7;
    if (!((life4_8 != null))) {
        forwardValue3025_16_0 = spill3025_1;
        break forward_join_16;
    }
    if (!((((moom.bs)(spill3025_1)).a__bt() == net.minecraft.util.EnumFacing$Axis.Y))) {
        break forward_join_17;
    }
    forwardValue3025_16_0 = moom.bs.NORTH;
    }
    life5_7 = forwardValue3025_16_0;
    }
    return ((net.minecraft.block.state.IBlockState)(((moom.c8)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.c8.R)), ((java.lang.Comparable)(life5_7)));
}


public int b(net.minecraft.world.World p0, moom.DT p1) {
return moom.v8.a(((net.minecraft.tileentity.TileEntity)(((net.minecraft.world.World)(p0)).a__B9(((moom.DT)(p1))))));
}


public void b__Void(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
((moom.c8)(this)).d(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)));
    return;
}


public int b(net.minecraft.block.state.IBlockState p0) {
return ((moom.bs)(((moom.bs)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.c8.R))))))).a();
}


public int c__Int() {
return 3;
}


public void c(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
long life4_3;
    int[] life6_5;
    net.minecraft.tileentity.TileEntity life7_16;
    forward_join_33: {
    forward_join_28: {
    life4_3 = (moom.c8.U ^ 105294573669846L);
    life6_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    if (!((life6_5 != null))) { break forward_join_33; }
    if (!((!moom.c8.T))) { break forward_join_28; }
    life7_16 = ((net.minecraft.world.World)(p0)).a__B9(((moom.DT)(p1)));
    if (!((life6_5 != null))) { break forward_join_33; }
    if (!((((life7_16 instanceof net.minecraft.tileentity.TileEntityFurnace) ? 1 : 0) != 0))) { break forward_join_28; }
    moom.wy.a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.inventory.IInventory)(((net.minecraft.tileentity.TileEntityFurnace)(life7_16)))));
    ((net.minecraft.world.World)(p0)).d(((moom.DT)(p1)), ((net.minecraft.block.Block)(this)));
    }
    super.c(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)));
    }
    return;
}


public void c(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, java.util.Random p3) {
long life5_3;
    int[] life7_5;
    moom.bs life8_13;
    double life9_19;
    double life11_30;
    double life13_36;
    double life15_38;
    double life17_45;
    forward_join_179: {
    forward_join_149: {
    forward_join_117: {
    forward_join_85: {
    forward_join_83: {
    forward_join_53: {
    life5_3 = (moom.c8.U ^ 139277784378837L);
    life7_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    if (!(this.S)) {
        break forward_join_179;
    }
    life8_13 = ((moom.bs)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.c8.R)))));
    life9_19 = (((double) ((moom.DT)(p1)).a()) + 0x1.0p-1d);
    life11_30 = (((double) ((moom.DT)(p1)).b()) + ((((java.util.Random)(p3)).nextDouble() * 0x1.8p2d) / 0x1.0p4d));
    life13_36 = (((double) ((moom.DT)(p1)).c()) + 0x1.0p-1d);
    life15_38 = 0x1.0a3d70a3d70a4p-1d;
    life17_45 = ((((java.util.Random)(p3)).nextDouble() * 0x1.3333333333333p-1d) - 0x1.3333333333333p-2d);
    if (!((life7_5 != null))) {
        break forward_join_83;
    }
    switch ((moom.eV.a)[((moom.bs)(life8_13)).ordinal()]) {
case 1:
{
        break forward_join_53;
    }
case 2:
{
        break forward_join_85;
    }
case 3:
{
        break forward_join_117;
    }
case 4:
{
        break forward_join_149;
    }
default:
{
        break forward_join_179;
    }
}
    }
    ((net.minecraft.world.World)(p0)).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.SMOKE_NORMAL)), ((double)((life9_19 - life15_38))), ((double)(life11_30)), ((double)((life13_36 + life17_45))), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((int[])(new int[0])));
    ((net.minecraft.world.World)(p0)).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.FLAME)), ((double)((life9_19 - life15_38))), ((double)(life11_30)), ((double)((life13_36 + life17_45))), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((int[])(new int[0])));
    }
    if (!((life7_5 == null))) {
        break forward_join_179;
    }
    }
    ((net.minecraft.world.World)(p0)).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.SMOKE_NORMAL)), ((double)((life9_19 + life15_38))), ((double)(life11_30)), ((double)((life13_36 + life17_45))), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((int[])(new int[0])));
    ((net.minecraft.world.World)(p0)).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.FLAME)), ((double)((life9_19 + life15_38))), ((double)(life11_30)), ((double)((life13_36 + life17_45))), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((int[])(new int[0])));
    if (!((life7_5 == null))) {
        break forward_join_179;
    }
    }
    ((net.minecraft.world.World)(p0)).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.SMOKE_NORMAL)), ((double)((life9_19 + life17_45))), ((double)(life11_30)), ((double)((life13_36 - life15_38))), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((int[])(new int[0])));
    ((net.minecraft.world.World)(p0)).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.FLAME)), ((double)((life9_19 + life17_45))), ((double)(life11_30)), ((double)((life13_36 - life15_38))), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((int[])(new int[0])));
    if (!((life7_5 == null))) {
        break forward_join_179;
    }
    }
    ((net.minecraft.world.World)(p0)).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.SMOKE_NORMAL)), ((double)((life9_19 + life17_45))), ((double)(life11_30)), ((double)((life13_36 + life15_38))), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((int[])(new int[0])));
    ((net.minecraft.world.World)(p0)).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.FLAME)), ((double)((life9_19 + life17_45))), ((double)(life11_30)), ((double)((life13_36 + life15_38))), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((int[])(new int[0])));
    }
    return;
}


private void d(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
net.minecraft.world.World forwardValue3027_12_0;
    int forwardValue3027_52_0;
    moom.bs forwardValue3027_59_0;
    moom.bs forwardValue3027_59_1;
    int forwardValue3027_69_0;
    moom.bs forwardValue3027_76_0;
    moom.bs forwardValue3027_76_1;
    int forwardValue3027_86_0;
    moom.bs forwardValue3027_93_0;
    moom.bs forwardValue3027_93_1;
    int forwardValue3027_114_0;
    net.minecraft.world.World spill3027_0;
    moom.bs spill3027_1;
    moom.bs spill3027_2;
    boolean spill3027_3;
    boolean spill3027_4;
    boolean spill3027_5;
    boolean spill3027_6;
    boolean spill3027_7;
    long life4_3;
    int[] life6_5;
    net.minecraft.block.Block life7_22;
    net.minecraft.block.Block life8_28;
    net.minecraft.block.Block life9_34;
    net.minecraft.block.Block life10_40;
    moom.bs life11_45;
    forward_join_115: {
    forward_join_114: {
    forward_join_106: {
    forward_join_93: {
    forward_join_91: {
    forward_join_86: {
    forward_join_76: {
    forward_join_74: {
    forward_join_69: {
    forward_join_59: {
    forward_join_57: {
    forward_join_52: {
    forward_join_12: {
    life4_3 = (moom.c8.U ^ 133579979101171L);
    life6_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3027_0 = p0;
    if (!((life6_5 != null))) {
        forwardValue3027_12_0 = spill3027_0;
        break forward_join_12;
    }
    if (!((!((net.minecraft.world.World)(spill3027_0)).G))) {
        break forward_join_115;
    }
    forwardValue3027_12_0 = p0;
    }
    life7_22 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(forwardValue3027_12_0)).a__fE(((moom.DT)(((moom.DT)(p1)).c__DT()))))).a__ch();
    life8_28 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).d__DT()))))).a__ch();
    life9_34 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).e()))))).a__ch();
    life10_40 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).f()))))).a__ch();
    life11_45 = ((moom.bs)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.c8.R)))));
    spill3027_1 = life11_45;
    spill3027_2 = moom.bs.NORTH;
    if (!((life6_5 != null))) {
        forwardValue3027_59_0 = spill3027_1;
        forwardValue3027_59_1 = spill3027_2;
        break forward_join_59;
    }
    if (!((spill3027_1 == spill3027_2))) {
        break forward_join_57;
    }
    spill3027_3 = ((net.minecraft.block.Block)(life7_22)).a__Boolean();
    if (!((life6_5 != null))) {
        forwardValue3027_52_0 = ((spill3027_3) ? 1 : 0);
        break forward_join_52;
    }
    if (!(spill3027_3)) {
        break forward_join_57;
    }
    forwardValue3027_52_0 = ((((net.minecraft.block.Block)(life8_28)).a__Boolean()) ? 1 : 0);
    }
    if (!((forwardValue3027_52_0 == 0))) {
        break forward_join_57;
    }
    life11_45 = moom.bs.SOUTH;
    if (!((life6_5 == null))) {
        break forward_join_106;
    }
    }
    forwardValue3027_59_0 = life11_45;
    forwardValue3027_59_1 = moom.bs.SOUTH;
    }
    if (!((life6_5 != null))) {
        forwardValue3027_76_0 = forwardValue3027_59_0;
        forwardValue3027_76_1 = forwardValue3027_59_1;
        break forward_join_76;
    }
    if (!((forwardValue3027_59_0 == forwardValue3027_59_1))) {
        break forward_join_74;
    }
    spill3027_4 = ((net.minecraft.block.Block)(life8_28)).a__Boolean();
    if (!((life6_5 != null))) {
        forwardValue3027_69_0 = ((spill3027_4) ? 1 : 0);
        break forward_join_69;
    }
    if (!(spill3027_4)) {
        break forward_join_74;
    }
    forwardValue3027_69_0 = ((((net.minecraft.block.Block)(life7_22)).a__Boolean()) ? 1 : 0);
    }
    if (!((forwardValue3027_69_0 == 0))) {
        break forward_join_74;
    }
    life11_45 = moom.bs.NORTH;
    if (!((life6_5 == null))) {
        break forward_join_106;
    }
    }
    forwardValue3027_76_0 = life11_45;
    forwardValue3027_76_1 = moom.bs.WEST;
    }
    if (!((life6_5 != null))) {
        forwardValue3027_93_0 = forwardValue3027_76_0;
        forwardValue3027_93_1 = forwardValue3027_76_1;
        break forward_join_93;
    }
    if (!((forwardValue3027_76_0 == forwardValue3027_76_1))) {
        break forward_join_91;
    }
    spill3027_5 = ((net.minecraft.block.Block)(life9_34)).a__Boolean();
    if (!((life6_5 != null))) {
        forwardValue3027_86_0 = ((spill3027_5) ? 1 : 0);
        break forward_join_86;
    }
    if (!(spill3027_5)) {
        break forward_join_91;
    }
    forwardValue3027_86_0 = ((((net.minecraft.block.Block)(life10_40)).a__Boolean()) ? 1 : 0);
    }
    if (!((forwardValue3027_86_0 == 0))) {
        break forward_join_91;
    }
    life11_45 = moom.bs.EAST;
    if (!((life6_5 == null))) {
        break forward_join_106;
    }
    }
    forwardValue3027_93_0 = life11_45;
    forwardValue3027_93_1 = moom.bs.EAST;
    }
    if (!((forwardValue3027_93_0 == forwardValue3027_93_1))) {
        break forward_join_106;
    }
    spill3027_6 = ((net.minecraft.block.Block)(life10_40)).a__Boolean();
    if (!((life6_5 != null))) {
        forwardValue3027_114_0 = ((spill3027_6) ? 1 : 0);
        break forward_join_114;
    }
    if (!(spill3027_6)) {
        break forward_join_106;
    }
    spill3027_7 = ((net.minecraft.block.Block)(life9_34)).a__Boolean();
    if (!((life6_5 != null))) {
        forwardValue3027_114_0 = ((spill3027_7) ? 1 : 0);
        break forward_join_114;
    }
    if (!((!spill3027_7))) {
        break forward_join_106;
    }
    life11_45 = moom.bs.WEST;
    }
    forwardValue3027_114_0 = ((((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(p2)).a__fE(((net.minecraft.block.properties.IProperty)(moom.c8.R)), ((java.lang.Comparable)(life11_45))))), ((int)(2)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue3027_114_0);
    }
    return;
}


public boolean a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.entity.player.EntityPlayer p3, moom.bs p4, float p5, float p6, float p7) {
int forwardValue3023_28_0;
    boolean spill3023_0;
    int spill3023_1;
    long life9_3;
    int[] life11_5;
    net.minecraft.tileentity.TileEntity life12_17;
    forward_join_28: {
    forward_join_27: {
    life9_3 = (moom.c8.U ^ 95659359380002L);
    life11_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3023_0 = ((net.minecraft.world.World)(p0)).G;
    if (!((life11_5 != null))) {
        forwardValue3023_28_0 = ((spill3023_0) ? 1 : 0);
        break forward_join_28;
    }
    if (!((!spill3023_0))) {
        break forward_join_27;
    }
    life12_17 = ((net.minecraft.world.World)(p0)).a__B9(((moom.DT)(p1)));
    spill3023_1 = ((life12_17 instanceof net.minecraft.tileentity.TileEntityFurnace) ? 1 : 0);
    if (!((life11_5 != null))) {
        forwardValue3023_28_0 = spill3023_1;
        break forward_join_28;
    }
    if (!((spill3023_1 != 0))) {
        break forward_join_27;
    }
    ((net.minecraft.entity.player.EntityPlayer)(p3)).a(((net.minecraft.inventory.IInventory)(((net.minecraft.tileentity.TileEntityFurnace)(life12_17)))));
    ((net.minecraft.entity.player.EntityPlayer)(p3)).a(((moom.BY)(net.minecraft.stats.StatList.Y)));
    }
    forwardValue3023_28_0 = 1;
    }
    return ((forwardValue3023_28_0) != 0);
}


public net.minecraft.block.state.IBlockState a__fE(net.minecraft.block.state.IBlockState p0) {
return ((net.minecraft.block.state.IBlockState)(((moom.c8)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.c8.R)), ((java.lang.Comparable)(moom.bs.SOUTH)));
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


protected moom.fA a__fA() {
return new moom.fA(this, new net.minecraft.block.properties.IProperty[] {moom.c8.R});
}


public net.minecraft.item.Item a(net.minecraft.block.state.IBlockState p0, java.util.Random p1, int p2) {
return net.minecraft.item.Item.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.al)));
}


public net.minecraft.block.state.IBlockState a(net.minecraft.world.World p0, moom.DT p1, moom.bs p2, float p3, float p4, float p5, int p6, net.minecraft.entity.EntityLivingBase p7) {
return ((net.minecraft.block.state.IBlockState)(((moom.c8)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.c8.R)), ((java.lang.Comparable)(((moom.bs)(((net.minecraft.entity.EntityLivingBase)(p7)).b__bs())).a__bs())));
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.entity.EntityLivingBase p3, net.minecraft.item.ItemStack p4) {
net.minecraft.world.World forwardValue3022_24_0;
    moom.DT forwardValue3022_24_1;
    net.minecraft.tileentity.TileEntity forwardValue3022_32_0;
    net.minecraft.world.World spill3022_0;
    moom.DT spill3022_1;
    net.minecraft.tileentity.TileEntity spill3022_2;
    long life6_3;
    int[] life8_5;
    net.minecraft.tileentity.TileEntity life9_31;
    forward_join_36: {
    forward_join_32: {
    forward_join_24: {
    life6_3 = (moom.c8.U ^ 84699122046961L);
    life8_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3022_0 = p0;
    spill3022_1 = p1;
    if (!((life8_5 != null))) {
        forwardValue3022_24_0 = spill3022_0;
        forwardValue3022_24_1 = spill3022_1;
        break forward_join_24;
    }
    ((net.minecraft.world.World)(spill3022_0)).a(((moom.DT)(spill3022_1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(p2)).a__fE(((net.minecraft.block.properties.IProperty)(moom.c8.R)), ((java.lang.Comparable)(((moom.bs)(((net.minecraft.entity.EntityLivingBase)(p3)).b__bs())).a__bs()))))), ((int)(2)));
    if (!(((net.minecraft.item.ItemStack)(p4)).f__Boolean())) {
        break forward_join_36;
    }
    forwardValue3022_24_0 = p0;
    forwardValue3022_24_1 = p1;
    }
    life9_31 = ((net.minecraft.world.World)(forwardValue3022_24_0)).a__B9(((moom.DT)(forwardValue3022_24_1)));
    spill3022_2 = life9_31;
    if (!((life8_5 != null))) {
        forwardValue3022_32_0 = spill3022_2;
        break forward_join_32;
    }
    if (!((((spill3022_2 instanceof net.minecraft.tileentity.TileEntityFurnace) ? 1 : 0) != 0))) {
        break forward_join_36;
    }
    forwardValue3022_32_0 = life9_31;
    }
    ((net.minecraft.tileentity.TileEntityFurnace)(((net.minecraft.tileentity.TileEntityFurnace)(forwardValue3022_32_0)))).a(((java.lang.String)(((net.minecraft.item.ItemStack)(p4)).b__String())));
    }
    return;
}


public net.minecraft.tileentity.TileEntity a(net.minecraft.world.World p0, int p1) {
return new net.minecraft.tileentity.TileEntityFurnace();
}


public static void a(boolean p0, net.minecraft.world.World p1, moom.DT p2) {
int forwardValue3024_73_0;
    net.minecraft.tileentity.TileEntity forwardValue3024_81_0;
    int[] spill3024_0;
    boolean spill3024_1;
    net.minecraft.tileentity.TileEntity spill3024_2;
    long life3_3;
    net.minecraft.block.state.IBlockState life6_7;
    net.minecraft.tileentity.TileEntity life7_12;
    int[] life5_15;
    forward_join_86: {
    forward_join_81: {
    forward_join_74: {
    forward_join_73: {
    forward_join_48: {
    life3_3 = (moom.c8.U ^ 44480433944628L);
    life6_7 = ((net.minecraft.world.World)(p1)).a__fE(((moom.DT)(p2)));
    spill3024_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life7_12 = ((net.minecraft.world.World)(p1)).a__B9(((moom.DT)(p2)));
    moom.c8.T = ((boolean)(true));
    life5_15 = spill3024_0;
    spill3024_1 = p0;
    if (!((life5_15 != null))) {
        forwardValue3024_73_0 = ((spill3024_1) ? 1 : 0);
        break forward_join_73;
    }
    if (!(spill3024_1)) {
        break forward_join_48;
    }
    ((net.minecraft.world.World)(p1)).a(((moom.DT)(p2)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.am)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.c8.R)), ((java.lang.Comparable)(((moom.bs)(((net.minecraft.block.state.IBlockState)(life6_7)).a(((net.minecraft.block.properties.IProperty)(moom.c8.R)))))))))), ((int)(3)));
    ((net.minecraft.world.World)(p1)).a(((moom.DT)(p2)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.am)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.c8.R)), ((java.lang.Comparable)(((moom.bs)(((net.minecraft.block.state.IBlockState)(life6_7)).a(((net.minecraft.block.properties.IProperty)(moom.c8.R)))))))))), ((int)(3)));
    if (!((life5_15 == null))) {
        break forward_join_74;
    }
    }
    ((net.minecraft.world.World)(p1)).a(((moom.DT)(p2)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.al)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.c8.R)), ((java.lang.Comparable)(((moom.bs)(((net.minecraft.block.state.IBlockState)(life6_7)).a(((net.minecraft.block.properties.IProperty)(moom.c8.R)))))))))), ((int)(3)));
    forwardValue3024_73_0 = ((((net.minecraft.world.World)(p1)).a(((moom.DT)(p2)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.al)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.c8.R)), ((java.lang.Comparable)(((moom.bs)(((net.minecraft.block.state.IBlockState)(life6_7)).a(((net.minecraft.block.properties.IProperty)(moom.c8.R)))))))))), ((int)(3)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue3024_73_0);
    }
    moom.c8.T = ((boolean)(false));
    spill3024_2 = life7_12;
    if (!((life5_15 != null))) {
        forwardValue3024_81_0 = spill3024_2;
        break forward_join_81;
    }
    if (!((spill3024_2 != null))) {
        break forward_join_86;
    }
    forwardValue3024_81_0 = life7_12;
    }
    ((net.minecraft.tileentity.TileEntity)(forwardValue3024_81_0)).e__Void();
    ((net.minecraft.world.World)(p1)).a(((moom.DT)(p2)), ((net.minecraft.tileentity.TileEntity)(life7_12)));
    }
    return;
}


public net.minecraft.item.Item a__wQ(net.minecraft.world.World p0, moom.DT p1) {
return net.minecraft.item.Item.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.al)));
}


public boolean r() {
return ((1) != 0);
}

}
