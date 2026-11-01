package moom;


public class dF extends net.minecraft.block.Block {

public static final moom.fx Q;

private static final long R;

protected dF() {
super(moom.fn.q);
    (this).a__Void(((this.M).a__fE()).a__fE(moom.dF.Q, moom.bs.NORTH));
    (this).a(net.minecraft.creativetab.CreativeTabs.c);
}


static {
moom.dF.R = (moom._c.a(-5479782152093439906L, 6088896722008936620L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(177920959433577L);
    moom.dF.Q = moom.fx.a("facing", net.minecraft.util.EnumFacing$Plane.HORIZONTAL);
}


protected boolean b(net.minecraft.world.World p0, moom.DT p1, moom.bs p2) {
return (__sourceIntrinsic_booleanComparison((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).a(((moom.bs)(((moom.bs)(p2)).a__bs())))))))).a__ch())).e__Boolean())) != 0);
}


public boolean b__Boolean(net.minecraft.world.World p0, moom.DT p1) {
int forwardValue3228_43_0;
    int forwardValue3228_45_0;
    boolean spill3228_0;
    boolean spill3228_1;
    boolean spill3228_2;
    boolean spill3228_3;
    long life3_3;
    int[] life5_5;
    forward_join_45: {
    forward_join_44: {
    forward_join_43: {
    forward_join_42: {
    life3_3 = (moom.dF.R ^ 93549336827109L);
    life5_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3228_0 = ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).e()))))).a__ch())).e__Boolean();
    if (!((life5_5 != null))) {
        forwardValue3228_43_0 = ((spill3228_0) ? 1 : 0);
        break forward_join_43;
    }
    if (!((!spill3228_0))) {
        break forward_join_42;
    }
    spill3228_1 = ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).f()))))).a__ch())).e__Boolean();
    if (!((life5_5 != null))) {
        forwardValue3228_43_0 = ((spill3228_1) ? 1 : 0);
        break forward_join_43;
    }
    if (!((!spill3228_1))) {
        break forward_join_42;
    }
    spill3228_2 = ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).c__DT()))))).a__ch())).e__Boolean();
    if (!((life5_5 != null))) {
        forwardValue3228_43_0 = ((spill3228_2) ? 1 : 0);
        break forward_join_43;
    }
    if (!((!spill3228_2))) {
        break forward_join_42;
    }
    spill3228_3 = ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).d__DT()))))).a__ch())).e__Boolean();
    if (!((life5_5 != null))) {
        forwardValue3228_43_0 = ((spill3228_3) ? 1 : 0);
        break forward_join_43;
    }
    if (!(spill3228_3)) {
        break forward_join_44;
    }
    }
    forwardValue3228_43_0 = 1;
    }
    forwardValue3228_45_0 = forwardValue3228_43_0;
    break forward_join_45;
    }
    forwardValue3228_45_0 = 0;
    }
    return ((forwardValue3228_45_0) != 0);
}


public net.minecraft.block.state.IBlockState b__fE(int p0) {
moom.bs forwardValue3229_16_0;
    int[] spill3229_0;
    moom.bs spill3229_1;
    long life2_3;
    moom.bs life5_7;
    int[] life4_8;
    forward_join_17: {
    forward_join_16: {
    life2_3 = (moom.dF.R ^ 97827931884999L);
    spill3229_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life5_7 = moom.bs.a(((int)(p0)));
    life4_8 = spill3229_0;
    spill3229_1 = life5_7;
    if (!((life4_8 != null))) {
        forwardValue3229_16_0 = spill3229_1;
        break forward_join_16;
    }
    if (!((((moom.bs)(spill3229_1)).a__bt() == net.minecraft.util.EnumFacing$Axis.Y))) {
        break forward_join_17;
    }
    forwardValue3229_16_0 = moom.bs.NORTH;
    }
    life5_7 = forwardValue3229_16_0;
    }
    return ((net.minecraft.block.state.IBlockState)(((moom.dF)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.dF.Q)), ((java.lang.Comparable)(life5_7)));
}


public int b(net.minecraft.block.state.IBlockState p0) {
return ((moom.bs)(((moom.bs)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.dF.Q))))))).a();
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public net.minecraft.util.EnumWorldBlockLayer a__bx() {
return net.minecraft.util.EnumWorldBlockLayer.CUTOUT;
}


protected moom.fA a__fA() {
return new moom.fA(this, new net.minecraft.block.properties.IProperty[] {moom.dF.Q});
}


public moom.CA a__CA(net.minecraft.world.World p0, moom.DT p1) {
((moom.dF)(this)).a__Void(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(p1)));
    return super.a__CA(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)));
}


public void a__Void(net.minecraft.world.IBlockAccess p0, moom.DT p1) {
int[] spill323_0;
    long life3_3;
    net.minecraft.block.state.IBlockState life6_8;
    int[] life5_9;
    float life7_15;
    forward_join_68: {
    forward_join_60: {
    forward_join_48: {
    forward_join_38: {
    forward_join_36: {
    forward_join_26: {
    life3_3 = (moom.dF.R ^ 88430650918216L);
    spill323_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life6_8 = ((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(p1)));
    life5_9 = spill323_0;
    if (!((((net.minecraft.block.state.IBlockState)(life6_8)).a__ch() == this))) {
        break forward_join_68;
    }
    life7_15 = 0x1.0p-3f;
    if (!((life5_9 != null))) {
        break forward_join_36;
    }
    switch ((moom.eX.a)[((moom.bs)(((moom.bs)(((net.minecraft.block.state.IBlockState)(life6_8)).a(((net.minecraft.block.properties.IProperty)(moom.dF.Q))))))).ordinal()]) {
case 1:
{
        break forward_join_26;
    }
case 2:
{
        break forward_join_38;
    }
case 3:
{
        break forward_join_48;
    }
case 4:
default:
{
        break forward_join_60;
    }
}
    }
    ((moom.dF)(this)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)((0x1.0p0f - life7_15))), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    }
    if (!((life5_9 == null))) {
        break forward_join_68;
    }
    }
    ((moom.dF)(this)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(life7_15)));
    if (!((life5_9 == null))) {
        break forward_join_68;
    }
    }
    ((moom.dF)(this)).a(((float)((0x1.0p0f - life7_15))), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    if (!((life5_9 == null))) {
        break forward_join_68;
    }
    }
    ((moom.dF)(this)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(life7_15)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    }
    return;
}


public moom.CA a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
((moom.dF)(this)).a__Void(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(p1)));
    return super.a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)));
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.block.Block p3) {
moom.dF forwardValue3226_32_0;
    net.minecraft.world.World forwardValue3226_32_1;
    moom.DT forwardValue3226_32_2;
    int[] spill3226_0;
    moom.dF spill3226_1;
    net.minecraft.world.World spill3226_2;
    moom.DT spill3226_3;
    long life5_3;
    moom.bs life8_9;
    int[] life7_10;
    forward_join_32: {
    forward_join_29: {
    life5_3 = (moom.dF.R ^ 109386915419025L);
    spill3226_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life8_9 = ((moom.bs)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.dF.Q)))));
    life7_10 = spill3226_0;
    spill3226_1 = this;
    spill3226_2 = p0;
    spill3226_3 = p1;
    if (!((life7_10 != null))) {
        forwardValue3226_32_0 = spill3226_1;
        forwardValue3226_32_1 = spill3226_2;
        forwardValue3226_32_2 = spill3226_3;
        break forward_join_32;
    }
    if (!((!((moom.dF)(spill3226_1)).b(((net.minecraft.world.World)(spill3226_2)), ((moom.DT)(spill3226_3)), ((moom.bs)(life8_9)))))) {
        break forward_join_29;
    }
    ((moom.dF)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((int)(0)));
    ((net.minecraft.world.World)(p0)).d__Boolean(((moom.DT)(p1)));
    }
    forwardValue3226_32_0 = this;
    forwardValue3226_32_1 = p0;
    forwardValue3226_32_2 = p1;
    }
    __sourceIntrinsic_ae5eabbf4271_call3226_8(forwardValue3226_32_0, forwardValue3226_32_1, forwardValue3226_32_2, p2, p3);
    return;
}


public net.minecraft.block.state.IBlockState a(net.minecraft.world.World p0, moom.DT p1, moom.bs p2, float p3, float p4, float p5, int p6, net.minecraft.entity.EntityLivingBase p7) {
int lexicalValue1103_19_0;
    moom.dF lexicalValue1103_21_0;
    moom.dF lexicalValue1103_47_0;
    moom.dF lexicalValue1103_55_0;
    boolean spill1103_0;
    moom.dF spill1103_1;
    moom.dF spill1103_2;
    long life9_3;
    int[] life11_5;
    java.util.Iterator life12_37;
    moom.bs life13_44;
    lexical_join_55: {
    lexical_join_54: {
    lexical_join_26: {
    lexical_join_21: {
    lexical_join_19: {
    life9_3 = (moom.dF.R ^ 132709697712986L);
    life11_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill1103_0 = ((net.minecraft.util.EnumFacing$Axis)(((moom.bs)(p2)).a__bt())).b__Boolean();
    if (!((life11_5 != null))) {
        lexicalValue1103_19_0 = ((spill1103_0) ? 1 : 0);
        break lexical_join_19;
    }
    if (!(spill1103_0)) {
        break lexical_join_26;
    }
    spill1103_1 = this;
    if (!((life11_5 != null))) {
        lexicalValue1103_21_0 = spill1103_1;
        break lexical_join_21;
    }
    lexicalValue1103_19_0 = ((((moom.dF)(spill1103_1)).b(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((moom.bs)(p2)))) ? 1 : 0);
    }
    if (!((lexicalValue1103_19_0 != 0))) {
        break lexical_join_26;
    }
    lexicalValue1103_21_0 = this;
    }
    return ((net.minecraft.block.state.IBlockState)(((moom.dF)(lexicalValue1103_21_0)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.dF.Q)), ((java.lang.Comparable)(p2)));
    }
    life12_37 = ((net.minecraft.util.EnumFacing$Plane)(net.minecraft.util.EnumFacing$Plane.HORIZONTAL)).iterator();
    lexical_cycle_29: while (true) {
    lexical_join_52: {
    lexical_join_47: {
    if (!(((java.util.Iterator)(life12_37)).hasNext())) {
        break lexical_join_54;
    }
    life13_44 = ((moom.bs)(((java.util.Iterator)(life12_37)).next()));
    spill1103_2 = this;
    if (!((life11_5 != null))) {
        lexicalValue1103_55_0 = spill1103_2;
        break lexical_join_55;
    }
    if (!((life11_5 != null))) {
        lexicalValue1103_47_0 = spill1103_2;
        break lexical_join_47;
    }
    if (!(((moom.dF)(spill1103_2)).b(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((moom.bs)(life13_44))))) {
        break lexical_join_52;
    }
    lexicalValue1103_47_0 = this;
    }
    return ((net.minecraft.block.state.IBlockState)(((moom.dF)(lexicalValue1103_47_0)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.dF.Q)), ((java.lang.Comparable)(life13_44)));
    }
    if (!((life11_5 == null))) { continue lexical_cycle_29; }
    break lexical_cycle_29;
    }
    }
    lexicalValue1103_55_0 = this;
    }
    return ((moom.dF)(lexicalValue1103_55_0)).a__fE();
}


public boolean g() {
return ((0) != 0);
}


public boolean j() {
return ((0) != 0);
}


private static native <E extends Throwable> void __sourceIntrinsic_ae5eabbf4271_call3226_8(moom.dF a0, net.minecraft.world.World a1, moom.DT a2, net.minecraft.block.state.IBlockState a3, net.minecraft.block.Block a4) throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
