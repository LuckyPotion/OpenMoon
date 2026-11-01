package moom;


public class cV extends moom.cU {

private static final long U;

public cV() {
super();
    (this).a__Void(((this.M).a__fE()).a__fE(moom.cV.R, moom.bs.NORTH));
}


static {
U = (moom._c.a(-7829625186086578673L, -2685498024905014471L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(22315013261850L);
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public int b(net.minecraft.block.state.IBlockState p0) {
return ((moom.bs)(((moom.bs)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.cV.R))))))).a();
}


public net.minecraft.block.state.IBlockState b__fE(int p0) {
moom.bs forwardValue3094_16_0;
    int[] spill3094_0;
    moom.bs spill3094_1;
    long life2_3;
    moom.bs life5_7;
    int[] life4_8;
    forward_join_17: {
    forward_join_16: {
    life2_3 = (moom.cV.U ^ 78754226398718L);
    spill3094_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life5_7 = moom.bs.a(((int)(p0)));
    life4_8 = spill3094_0;
    spill3094_1 = life5_7;
    if (!((life4_8 != null))) {
        forwardValue3094_16_0 = spill3094_1;
        break forward_join_16;
    }
    if (!((((moom.bs)(spill3094_1)).a__bt() == net.minecraft.util.EnumFacing$Axis.Y))) {
        break forward_join_17;
    }
    forwardValue3094_16_0 = moom.bs.NORTH;
    }
    life5_7 = forwardValue3094_16_0;
    }
    return ((net.minecraft.block.state.IBlockState)(((moom.cV)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.cV.R)), ((java.lang.Comparable)(life5_7)));
}


public void a__Void(net.minecraft.world.IBlockAccess p0, moom.DT p1) {
moom.cV forestValue826_79_0;
    float forestValue826_79_1;
    float forestValue826_79_2;
    float forestValue826_79_3;
    float forestValue826_79_4;
    float forestValue826_79_5;
    float forestValue826_79_6;
    int[] spill826_0;
    moom.cV spill826_1;
    float spill826_2;
    float spill826_3;
    float spill826_4;
    float spill826_5;
    float spill826_6;
    float spill826_7;
    long life3_3;
    moom.bs life6_11;
    int[] life5_12;
    float life7_14;
    float life8_16;
    float life9_18;
    float life10_20;
    float life11_22;
    forest_join_80: {
    forest_join_79: {
    forest_join_72: {
    forest_join_60: {
    forest_join_50: {
    forest_join_38: {
    life3_3 = (moom.cV.U ^ 87086620765553L);
    spill826_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life6_11 = ((moom.bs)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(p1))))).a(((net.minecraft.block.properties.IProperty)(moom.cV.R)))));
    life5_12 = spill826_0;
    life7_14 = 0x0.0p0f;
    life8_16 = 0x1.9p-1f;
    life9_18 = 0x0.0p0f;
    life10_20 = 0x1.0p0f;
    life11_22 = 0x1.0p-3f;
    spill826_1 = this;
    spill826_2 = 0x0.0p0f;
    spill826_3 = 0x0.0p0f;
    spill826_4 = 0x0.0p0f;
    spill826_5 = 0x1.0p0f;
    spill826_6 = 0x1.0p0f;
    spill826_7 = 0x1.0p0f;
    if (!((life5_12 != null))) {
        forestValue826_79_0 = spill826_1;
        forestValue826_79_1 = spill826_2;
        forestValue826_79_2 = spill826_3;
        forestValue826_79_3 = spill826_4;
        forestValue826_79_4 = spill826_5;
        forestValue826_79_5 = spill826_6;
        forestValue826_79_6 = spill826_7;
        break forest_join_79;
    }
    ((moom.cV)(spill826_1)).a(((float)(spill826_2)), ((float)(spill826_3)), ((float)(spill826_4)), ((float)(spill826_5)), ((float)(spill826_6)), ((float)(spill826_7)));
    switch ((moom.eP.a)[((moom.bs)(life6_11)).ordinal()]) {
case 1:
default:
{
        break forest_join_38;
    }
case 2:
{
        break forest_join_50;
    }
case 3:
{
        break forest_join_60;
    }
case 4:
{
        break forest_join_72;
    }
}
    }
    ((moom.cV)(this)).a(((float)(life9_18)), ((float)(life7_14)), ((float)((0x1.0p0f - life11_22))), ((float)(life10_20)), ((float)(life8_16)), ((float)(0x1.0p0f)));
    if (!((life5_12 == null))) {
        break forest_join_80;
    }
    }
    ((moom.cV)(this)).a(((float)(life9_18)), ((float)(life7_14)), ((float)(0x0.0p0f)), ((float)(life10_20)), ((float)(life8_16)), ((float)(life11_22)));
    if (!((life5_12 == null))) {
        break forest_join_80;
    }
    }
    ((moom.cV)(this)).a(((float)((0x1.0p0f - life11_22))), ((float)(life7_14)), ((float)(life9_18)), ((float)(0x1.0p0f)), ((float)(life8_16)), ((float)(life10_20)));
    if (!((life5_12 == null))) {
        break forest_join_80;
    }
    }
    forestValue826_79_0 = this;
    forestValue826_79_1 = 0x0.0p0f;
    forestValue826_79_2 = life7_14;
    forestValue826_79_3 = life9_18;
    forestValue826_79_4 = life11_22;
    forestValue826_79_5 = life8_16;
    forestValue826_79_6 = life10_20;
    }
    ((moom.cV)(forestValue826_79_0)).a(((float)(forestValue826_79_1)), ((float)(forestValue826_79_2)), ((float)(forestValue826_79_3)), ((float)(forestValue826_79_4)), ((float)(forestValue826_79_5)), ((float)(forestValue826_79_6)));
    }
    return;
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.block.Block p3) {
long life5_3;
    moom.bs life8_9;
    int[] life7_10;
    life5_3 = (moom.cV.U ^ 136500816509864L);
    int[] spill5931_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life8_9 = ((moom.bs)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.cV.R)))));
    life7_10 = spill5931_0;
    if ((life7_10 != null)) {
        if ((!((moom.fn)(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).a(((moom.bs)(((moom.bs)(life8_9)).a__bs())))))))).a__ch())).a__fn())).b__Boolean())) {
        ((moom.cV)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((int)(0)));
        ((net.minecraft.world.World)(p0)).d__Boolean(((moom.DT)(p1)));
    }
        super.a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((net.minecraft.block.Block)(p3)));
    }
    return;
}


protected moom.fA a__fA() {
return new moom.fA(this, new net.minecraft.block.properties.IProperty[] {moom.cV.R});
}

}
