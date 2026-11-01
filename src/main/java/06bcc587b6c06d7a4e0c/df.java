package moom;


public class df extends moom.dd {

public static final moom.fx R;

private static final long T;

public df() {
super();
    (this).a__Void(((this.M).a__fE()).a__fE(moom.df.R, moom.bs.NORTH));
}


static {
T = (moom._c.a(8469529181046973255L, 5380939389660889729L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(121560727622597L);
    R = moom.fx.a("facing", net.minecraft.util.EnumFacing$Plane.HORIZONTAL);
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public int b(net.minecraft.block.state.IBlockState p0) {
return ((moom.bs)(((moom.bs)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.df.R))))))).a();
}


public net.minecraft.block.state.IBlockState b__fE(int p0) {
moom.bs forwardValue3308_16_0;
    int[] spill3308_0;
    moom.bs spill3308_1;
    long life2_3;
    moom.bs life5_7;
    int[] life4_8;
    forward_join_17: {
    forward_join_16: {
    life2_3 = (moom.df.T ^ 72972265900723L);
    spill3308_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life5_7 = moom.bs.a(((int)(p0)));
    life4_8 = spill3308_0;
    spill3308_1 = life5_7;
    if (!((life4_8 != null))) {
        forwardValue3308_16_0 = spill3308_1;
        break forward_join_16;
    }
    if (!((((moom.bs)(spill3308_1)).a__bt() == net.minecraft.util.EnumFacing$Axis.Y))) {
        break forward_join_17;
    }
    forwardValue3308_16_0 = moom.bs.NORTH;
    }
    life5_7 = forwardValue3308_16_0;
    }
    return ((net.minecraft.block.state.IBlockState)(((moom.df)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.df.R)), ((java.lang.Comparable)(life5_7)));
}


public void a__Void(net.minecraft.world.IBlockAccess p0, moom.DT p1) {
int[] spill331_0;
    long life3_3;
    moom.bs life6_10;
    float life7_12;
    float life8_14;
    float life9_17;
    float life10_19;
    float life11_21;
    int[] life5_22;
    forward_join_80: {
    forward_join_72: {
    forward_join_60: {
    forward_join_50: {
    forward_join_48: {
    forward_join_38: {
    life3_3 = (moom.df.T ^ 82232103715388L);
    life6_10 = ((moom.bs)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(p1))))).a(((net.minecraft.block.properties.IProperty)(moom.df.R)))));
    life7_12 = 0x1.2p-2f;
    life8_14 = 0x1.9p-1f;
    spill331_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life9_17 = 0x0.0p0f;
    life10_19 = 0x1.0p0f;
    life11_21 = 0x1.0p-3f;
    life5_22 = spill331_0;
    ((moom.df)(this)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    if (!((life5_22 != null))) {
        break forward_join_48;
    }
    switch ((moom.fi.a)[((moom.bs)(life6_10)).ordinal()]) {
case 1:
{
        break forward_join_38;
    }
case 2:
{
        break forward_join_50;
    }
case 3:
{
        break forward_join_60;
    }
case 4:
{
        break forward_join_72;
    }
default:
{
        break forward_join_80;
    }
}
    }
    ((moom.df)(this)).a(((float)(life9_17)), ((float)(life7_12)), ((float)((0x1.0p0f - life11_21))), ((float)(life10_19)), ((float)(life8_14)), ((float)(0x1.0p0f)));
    }
    if (!((life5_22 == null))) {
        break forward_join_80;
    }
    }
    ((moom.df)(this)).a(((float)(life9_17)), ((float)(life7_12)), ((float)(0x0.0p0f)), ((float)(life10_19)), ((float)(life8_14)), ((float)(life11_21)));
    if (!((life5_22 == null))) {
        break forward_join_80;
    }
    }
    ((moom.df)(this)).a(((float)((0x1.0p0f - life11_21))), ((float)(life7_12)), ((float)(life9_17)), ((float)(0x1.0p0f)), ((float)(life8_14)), ((float)(life10_19)));
    if (!((life5_22 == null))) {
        break forward_join_80;
    }
    }
    ((moom.df)(this)).a(((float)(0x0.0p0f)), ((float)(life7_12)), ((float)(life9_17)), ((float)(life11_21)), ((float)(life8_14)), ((float)(life10_19)));
    }
    return;
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.block.Block p3) {
long life5_3;
    moom.bs life8_9;
    int[] life7_10;
    life5_3 = (moom.df.T ^ 133985176999141L);
    int[] spill6149_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life8_9 = ((moom.bs)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.df.R)))));
    life7_10 = spill6149_0;
    if ((life7_10 != null)) {
        if ((!((moom.fn)(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).a(((moom.bs)(((moom.bs)(life8_9)).a__bs())))))))).a__ch())).a__fn())).b__Boolean())) {
        ((moom.df)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((int)(0)));
        ((net.minecraft.world.World)(p0)).d__Boolean(((moom.DT)(p1)));
    }
        super.a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((net.minecraft.block.Block)(p3)));
    }
    return;
}


protected moom.fA a__fA() {
return new moom.fA(this, new net.minecraft.block.properties.IProperty[] {moom.df.R});
}

}
