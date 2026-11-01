package moom;


public class c0 extends moom.cT {

public static final moom.fv R;

private static final long S;

public c0() {
super(moom.fn.f, moom.fm.q);
    (this).a__Void(((this.M).a__fE()).a__fE(moom.c0.R, java.lang.Boolean.FALSE));
}


static {
S = (moom._c.a(3950445558717519068L, 5166097268612292736L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(184637116416839L);
    R = moom.fv.a("triggered");
}


public int b(net.minecraft.block.state.IBlockState p0) {
int forwardValue2999_21_0;
    int[] spill2999_0;
    boolean spill2999_1;
    long life2_3;
    int life5_6;
    int[] life4_7;
    forward_join_21: {
    forward_join_20: {
    life2_3 = (moom.c0.S ^ 88435360410147L);
    spill2999_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life5_6 = 0;
    life4_7 = spill2999_0;
    spill2999_1 = ((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.c0.R))))))).booleanValue();
    if (!((life4_7 != null))) {
        forwardValue2999_21_0 = ((spill2999_1) ? 1 : 0);
        break forward_join_21;
    }
    if (!(spill2999_1)) {
        break forward_join_20;
    }
    life5_6 = (life5_6 | 1);
    }
    forwardValue2999_21_0 = life5_6;
    }
    return forwardValue2999_21_0;
}


public int b(net.minecraft.world.World p0, moom.DT p1) {
int forwardValue3000_19_0;
    int forwardValue3000_21_0;
    int[] spill3000_0;
    int spill3000_1;
    long life3_3;
    net.minecraft.tileentity.TileEntity life6_8;
    int[] life5_9;
    forward_join_21: {
    forward_join_20: {
    forward_join_19: {
    life3_3 = (moom.c0.S ^ 47491386240478L);
    spill3000_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life6_8 = ((net.minecraft.world.World)(p0)).a__B9(((moom.DT)(p1)));
    life5_9 = spill3000_0;
    spill3000_1 = ((life6_8 instanceof net.minecraft.tileentity.TileEntityCommandBlock) ? 1 : 0);
    if (!((life5_9 != null))) {
        forwardValue3000_19_0 = spill3000_1;
        break forward_join_19;
    }
    if (!((spill3000_1 != 0))) {
        break forward_join_20;
    }
    forwardValue3000_19_0 = ((moom.qV)(((net.minecraft.tileentity.TileEntityCommandBlock)(((net.minecraft.tileentity.TileEntityCommandBlock)(life6_8)))).a__qV())).a();
    }
    forwardValue3000_21_0 = forwardValue3000_19_0;
    break forward_join_21;
    }
    forwardValue3000_21_0 = 0;
    }
    return forwardValue3000_21_0;
}


public void b(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, java.util.Random p3) {
net.minecraft.tileentity.TileEntity forwardValue3001_16_0;
    int[] spill3001_0;
    net.minecraft.tileentity.TileEntity spill3001_1;
    long life5_3;
    net.minecraft.tileentity.TileEntity life8_8;
    int[] life7_9;
    forward_join_24: {
    forward_join_16: {
    life5_3 = (moom.c0.S ^ 125531568288766L);
    spill3001_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life8_8 = ((net.minecraft.world.World)(p0)).a__B9(((moom.DT)(p1)));
    life7_9 = spill3001_0;
    spill3001_1 = life8_8;
    if (!((life7_9 != null))) {
        forwardValue3001_16_0 = spill3001_1;
        break forward_join_16;
    }
    if (!((((spill3001_1 instanceof net.minecraft.tileentity.TileEntityCommandBlock) ? 1 : 0) != 0))) {
        break forward_join_24;
    }
    forwardValue3001_16_0 = life8_8;
    }
    ((moom.qV)(((net.minecraft.tileentity.TileEntityCommandBlock)(((net.minecraft.tileentity.TileEntityCommandBlock)(forwardValue3001_16_0)))).a__qV())).a(((net.minecraft.world.World)(p0)));
    ((net.minecraft.world.World)(p0)).d(((moom.DT)(p1)), ((net.minecraft.block.Block)(this)));
    }
    return;
}


public net.minecraft.block.state.IBlockState b__fE(int p0) {
net.minecraft.block.state.IBlockState forwardValue3002_16_0;
    moom.fv forwardValue3002_16_1;
    int forwardValue3002_16_2;
    net.minecraft.block.state.IBlockState forwardValue3002_17_0;
    moom.fv forwardValue3002_17_1;
    net.minecraft.block.state.IBlockState forwardValue3002_18_0;
    moom.fv forwardValue3002_18_1;
    int forwardValue3002_18_2;
    net.minecraft.block.state.IBlockState spill3002_0;
    moom.fv spill3002_1;
    int spill3002_2;
    long life2_3;
    int[] life4_5;
    forward_join_18: {
    forward_join_17: {
    forward_join_16: {
    life2_3 = (moom.c0.S ^ 102092839997737L);
    life4_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3002_0 = ((moom.c0)(this)).a__fE();
    spill3002_1 = moom.c0.R;
    spill3002_2 = (p0 & 1);
    if (!((life4_5 != null))) {
        forwardValue3002_16_0 = spill3002_0;
        forwardValue3002_16_1 = spill3002_1;
        forwardValue3002_16_2 = spill3002_2;
        break forward_join_16;
    }
    if (!((spill3002_2 > 0))) {
        forwardValue3002_17_0 = spill3002_0;
        forwardValue3002_17_1 = spill3002_1;
        break forward_join_17;
    }
    forwardValue3002_16_0 = spill3002_0;
    forwardValue3002_16_1 = spill3002_1;
    forwardValue3002_16_2 = 1;
    }
    forwardValue3002_18_0 = forwardValue3002_16_0;
    forwardValue3002_18_1 = forwardValue3002_16_1;
    forwardValue3002_18_2 = forwardValue3002_16_2;
    break forward_join_18;
    }
    forwardValue3002_18_0 = forwardValue3002_17_0;
    forwardValue3002_18_1 = forwardValue3002_17_1;
    forwardValue3002_18_2 = 0;
    }
    return ((net.minecraft.block.state.IBlockState)(forwardValue3002_18_0)).a__fE(((net.minecraft.block.properties.IProperty)(forwardValue3002_18_1)), ((java.lang.Comparable)(java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue3002_18_2)))))));
}


public int c__Int() {
return 3;
}


protected moom.fA a__fA() {
return new moom.fA(this, new net.minecraft.block.properties.IProperty[] {moom.c0.R});
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public net.minecraft.block.state.IBlockState a(net.minecraft.world.World p0, moom.DT p1, moom.bs p2, float p3, float p4, float p5, int p6, net.minecraft.entity.EntityLivingBase p7) {
return ((net.minecraft.block.state.IBlockState)(((moom.c0)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.c0.R)), ((java.lang.Comparable)(java.lang.Boolean.FALSE)));
}


public boolean a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.entity.player.EntityPlayer p3, moom.bs p4, float p5, float p6, float p7) {
int forwardValue2998_20_0;
    int forwardValue2998_24_0;
    int forwardValue2998_26_0;
    int[] spill2998_0;
    int spill2998_1;
    long life9_3;
    net.minecraft.tileentity.TileEntity life12_8;
    int[] life11_9;
    forward_join_26: {
    forward_join_25: {
    forward_join_24: {
    forward_join_20: {
    life9_3 = (moom.c0.S ^ 20770328971881L);
    spill2998_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life12_8 = ((net.minecraft.world.World)(p0)).a__B9(((moom.DT)(p1)));
    life11_9 = spill2998_0;
    spill2998_1 = ((life12_8 instanceof net.minecraft.tileentity.TileEntityCommandBlock) ? 1 : 0);
    if (!((life11_9 != null))) {
        forwardValue2998_20_0 = spill2998_1;
        break forward_join_20;
    }
    if (!((spill2998_1 != 0))) {
        break forward_join_25;
    }
    forwardValue2998_20_0 = ((((moom.qV)(((net.minecraft.tileentity.TileEntityCommandBlock)(((net.minecraft.tileentity.TileEntityCommandBlock)(life12_8)))).a__qV())).a(((net.minecraft.entity.player.EntityPlayer)(p3)))) ? 1 : 0);
    }
    if (!((life11_9 != null))) {
        forwardValue2998_24_0 = forwardValue2998_20_0;
        break forward_join_24;
    }
    if (!((forwardValue2998_20_0 != 0))) {
        break forward_join_25;
    }
    forwardValue2998_24_0 = 1;
    }
    forwardValue2998_26_0 = forwardValue2998_24_0;
    break forward_join_26;
    }
    forwardValue2998_26_0 = 0;
    }
    return ((forwardValue2998_26_0) != 0);
}


public int a(net.minecraft.world.World p0) {
return 1;
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.block.Block p3) {
int forwardValue2996_14_0;
    int forwardValue2996_48_0;
    int forwardValue2996_52_0;
    int forwardValue2996_63_0;
    boolean spill2996_0;
    int spill2996_1;
    int spill2996_2;
    long life5_3;
    int[] life7_5;
    int life8_20;
    int life9_26;
    forward_join_64: {
    forward_join_63: {
    forward_join_52: {
    forward_join_48: {
    forward_join_47: {
    forward_join_14: {
    life5_3 = (moom.c0.S ^ 113660410974079L);
    life7_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill2996_0 = ((net.minecraft.world.World)(p0)).G;
    if (!((life7_5 != null))) {
        forwardValue2996_14_0 = ((spill2996_0) ? 1 : 0);
        break forward_join_14;
    }
    if (!((!spill2996_0))) {
        break forward_join_64;
    }
    forwardValue2996_14_0 = ((((net.minecraft.world.World)(p0)).l(((moom.DT)(p1)))) ? 1 : 0);
    }
    life8_20 = forwardValue2996_14_0;
    life9_26 = ((((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.c0.R))))))).booleanValue()) ? 1 : 0);
    spill2996_1 = life8_20;
    if (!((life7_5 != null))) {
        forwardValue2996_48_0 = spill2996_1;
        break forward_join_48;
    }
    if (!((spill2996_1 != 0))) {
        break forward_join_47;
    }
    spill2996_2 = life9_26;
    if (!((life7_5 != null))) {
        forwardValue2996_48_0 = spill2996_2;
        break forward_join_48;
    }
    if (!((spill2996_2 == 0))) {
        break forward_join_47;
    }
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(p2)).a__fE(((net.minecraft.block.properties.IProperty)(moom.c0.R)), ((java.lang.Comparable)(java.lang.Boolean.TRUE))))), ((int)(4)));
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.Block)(this)), ((int)(((moom.c0)(this)).a(((net.minecraft.world.World)(p0))))));
    if (!((life7_5 == null))) {
        break forward_join_64;
    }
    }
    forwardValue2996_48_0 = life8_20;
    }
    if (!((life7_5 != null))) {
        forwardValue2996_52_0 = forwardValue2996_48_0;
        break forward_join_52;
    }
    if (!((forwardValue2996_48_0 == 0))) {
        break forward_join_64;
    }
    forwardValue2996_52_0 = life9_26;
    }
    if (!((life7_5 != null))) {
        forwardValue2996_63_0 = forwardValue2996_52_0;
        break forward_join_63;
    }
    if (!((forwardValue2996_52_0 != 0))) {
        break forward_join_64;
    }
    forwardValue2996_63_0 = ((((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(p2)).a__fE(((net.minecraft.block.properties.IProperty)(moom.c0.R)), ((java.lang.Comparable)(java.lang.Boolean.FALSE))))), ((int)(4)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue2996_63_0);
    }
    return;
}


public net.minecraft.tileentity.TileEntity a(net.minecraft.world.World p0, int p1) {
return new net.minecraft.tileentity.TileEntityCommandBlock();
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.entity.EntityLivingBase p3, net.minecraft.item.ItemStack p4) {
net.minecraft.tileentity.TileEntity forwardValue2997_16_0;
    int forwardValue2997_30_0;
    int[] spill2997_0;
    net.minecraft.tileentity.TileEntity spill2997_1;
    boolean spill2997_2;
    long life6_3;
    net.minecraft.tileentity.TileEntity life9_8;
    int[] life8_9;
    moom.qV life10_24;
    forward_join_37: {
    forward_join_30: {
    forward_join_28: {
    forward_join_16: {
    life6_3 = (moom.c0.S ^ 9805865631674L);
    spill2997_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life9_8 = ((net.minecraft.world.World)(p0)).a__B9(((moom.DT)(p1)));
    life8_9 = spill2997_0;
    spill2997_1 = life9_8;
    if (!((life8_9 != null))) {
        forwardValue2997_16_0 = spill2997_1;
        break forward_join_16;
    }
    if (!((((spill2997_1 instanceof net.minecraft.tileentity.TileEntityCommandBlock) ? 1 : 0) != 0))) {
        break forward_join_37;
    }
    forwardValue2997_16_0 = life9_8;
    }
    life10_24 = ((net.minecraft.tileentity.TileEntityCommandBlock)(((net.minecraft.tileentity.TileEntityCommandBlock)(forwardValue2997_16_0)))).a__qV();
    spill2997_2 = ((net.minecraft.item.ItemStack)(p4)).f__Boolean();
    if (!((life8_9 != null))) {
        forwardValue2997_30_0 = ((spill2997_2) ? 1 : 0);
        break forward_join_30;
    }
    if (!(spill2997_2)) {
        break forward_join_28;
    }
    ((moom.qV)(life10_24)).b(((java.lang.String)(((net.minecraft.item.ItemStack)(p4)).b__String())));
    }
    forwardValue2997_30_0 = ((((net.minecraft.world.World)(p0)).G) ? 1 : 0);
    }
    if (!((forwardValue2997_30_0 == 0))) {
        break forward_join_37;
    }
    ((moom.qV)(life10_24)).a(((boolean)(((net.minecraft.world.GameRules)(((net.minecraft.world.World)(p0)).a__Ej())).a__Boolean(((java.lang.String)("sendCommandFeedback"))))));
    }
    return;
}


public int a(java.util.Random p0) {
return 0;
}


public boolean r() {
return ((1) != 0);
}


private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
