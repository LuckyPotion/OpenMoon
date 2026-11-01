package moom;


public class eA extends net.minecraft.block.Block {

public static final moom.fx Q;

private static final long U;

protected eA() {
super(moom.fn.q);
    (this).a__Void(((this.M).a__fE()).a__fE(moom.eA.Q, moom.bs.UP));
    (this).a(true);
    (this).a(net.minecraft.creativetab.CreativeTabs.c);
}


static {
U = ((long)(((moom._a)(moom._c.a(((long)(4773921332467780066L)), ((long)(7024481314788413164L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(69907925710920L)))));
    Q = ((moom.fx)(moom.fx.a(((java.lang.String)("facing")), ((com.google.common.base.Predicate)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite4276_5())))));
}


private boolean b(net.minecraft.world.World p0, moom.DT p1, moom.bs p2) {
int forwardValue3385_29_0;
    int forwardValue3385_36_0;
    int forwardValue3385_40_0;
    int forwardValue3385_42_0;
    int[] spill3385_0;
    int spill3385_1;
    boolean spill3385_2;
    long life4_3;
    moom.DT life7_9;
    int life8_13;
    int[] life6_14;
    forward_join_42: {
    forward_join_41: {
    forward_join_40: {
    forward_join_39: {
    forward_join_36: {
    forward_join_29: {
    forward_join_26: {
    life4_3 = (moom.eA.U ^ 133897763794196L);
    spill3385_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life7_9 = ((moom.DT)(p1)).a(((moom.bs)(((moom.bs)(p2)).a__bs())));
    life8_13 = ((((net.minecraft.util.EnumFacing$Axis)(((moom.bs)(p2)).a__bt())).b__Boolean()) ? 1 : 0);
    life6_14 = spill3385_0;
    spill3385_1 = life8_13;
    if (!((life6_14 != null))) {
        forwardValue3385_29_0 = spill3385_1;
        break forward_join_29;
    }
    if (!((spill3385_1 != 0))) {
        break forward_join_26;
    }
    spill3385_2 = ((net.minecraft.world.World)(p0)).c(((moom.DT)(life7_9)), ((boolean)(true)));
    if (!((life6_14 != null))) {
        forwardValue3385_40_0 = ((spill3385_2) ? 1 : 0);
        break forward_join_40;
    }
    if (!((!spill3385_2))) {
        break forward_join_39;
    }
    }
    forwardValue3385_29_0 = ((((moom.bs)(p2)).equals(((java.lang.Object)(moom.bs.UP)))) ? 1 : 0);
    }
    if (!((life6_14 != null))) {
        forwardValue3385_36_0 = forwardValue3385_29_0;
        break forward_join_36;
    }
    if (!((forwardValue3385_29_0 != 0))) {
        break forward_join_41;
    }
    forwardValue3385_36_0 = ((((moom.eA)(this)).c(((net.minecraft.world.World)(p0)), ((moom.DT)(life7_9)))) ? 1 : 0);
    }
    if (!((life6_14 != null))) {
        forwardValue3385_40_0 = forwardValue3385_36_0;
        break forward_join_40;
    }
    if (!((forwardValue3385_36_0 != 0))) {
        break forward_join_41;
    }
    }
    forwardValue3385_40_0 = 1;
    }
    forwardValue3385_42_0 = forwardValue3385_40_0;
    break forward_join_42;
    }
    forwardValue3385_42_0 = 0;
    }
    return ((forwardValue3385_42_0) != 0);
}


public int b(net.minecraft.block.state.IBlockState p0) {
int forestValue830_45_0;
    int[] spill830_0;
    int spill830_1;
    long life2_3;
    int life5_6;
    int[] life4_7;
    forest_join_46: {
    forest_join_45: {
    forest_join_42: {
    forest_join_36: {
    forest_join_30: {
    forest_join_24: {
    forest_join_18: {
    life2_3 = (moom.eA.U ^ 96925989938837L);
    spill830_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life5_6 = 0;
    life4_7 = spill830_0;
    spill830_1 = (moom.fe.a)[((moom.bs)(((moom.bs)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.eA.Q))))))).ordinal()];
    if (!((life4_7 != null))) {
        forestValue830_45_0 = spill830_1;
        break forest_join_45;
    }
    switch (spill830_1) {
case 1:
{
        break forest_join_18;
    }
case 2:
{
        break forest_join_24;
    }
case 3:
{
        break forest_join_30;
    }
case 4:
{
        break forest_join_36;
    }
case 5:
case 6:
default:
{
        break forest_join_42;
    }
}
    }
    life5_6 = (life5_6 | 1);
    if (!((life4_7 == null))) {
        break forest_join_46;
    }
    }
    life5_6 = (life5_6 | 2);
    if (!((life4_7 == null))) {
        break forest_join_46;
    }
    }
    life5_6 = (life5_6 | 3);
    if (!((life4_7 == null))) {
        break forest_join_46;
    }
    }
    life5_6 = (life5_6 | 4);
    if (!((life4_7 == null))) {
        break forest_join_46;
    }
    }
    forestValue830_45_0 = (life5_6 | 5);
    }
    life5_6 = forestValue830_45_0;
    }
    return life5_6;
}


public void b__Void(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
((moom.eA)(this)).b__Boolean(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)));
    return;
}


public net.minecraft.block.state.IBlockState b__fE(int p0) {
int[] spill346_0;
    long life2_3;
    net.minecraft.block.state.IBlockState life5_7;
    int[] life4_8;
    forward_join_46: {
    forward_join_41: {
    forward_join_34: {
    forward_join_27: {
    forward_join_20: {
    forward_join_18: {
    forward_join_13: {
    life2_3 = (moom.eA.U ^ 92992324722079L);
    spill346_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life5_7 = ((moom.eA)(this)).a__fE();
    life4_8 = spill346_0;
    if (!((life4_8 != null))) {
        break forward_join_18;
    }
    switch (p0) {
case 1:
{
        break forward_join_13;
    }
case 2:
{
        break forward_join_20;
    }
case 3:
{
        break forward_join_27;
    }
case 4:
{
        break forward_join_34;
    }
case 5:
default:
{
        break forward_join_41;
    }
}
    }
    life5_7 = ((net.minecraft.block.state.IBlockState)(life5_7)).a__fE(((net.minecraft.block.properties.IProperty)(moom.eA.Q)), ((java.lang.Comparable)(moom.bs.EAST)));
    }
    if (!((life4_8 == null))) {
        break forward_join_46;
    }
    }
    life5_7 = ((net.minecraft.block.state.IBlockState)(life5_7)).a__fE(((net.minecraft.block.properties.IProperty)(moom.eA.Q)), ((java.lang.Comparable)(moom.bs.WEST)));
    if (!((life4_8 == null))) {
        break forward_join_46;
    }
    }
    life5_7 = ((net.minecraft.block.state.IBlockState)(life5_7)).a__fE(((net.minecraft.block.properties.IProperty)(moom.eA.Q)), ((java.lang.Comparable)(moom.bs.SOUTH)));
    if (!((life4_8 == null))) {
        break forward_join_46;
    }
    }
    life5_7 = ((net.minecraft.block.state.IBlockState)(life5_7)).a__fE(((net.minecraft.block.properties.IProperty)(moom.eA.Q)), ((java.lang.Comparable)(moom.bs.NORTH)));
    if (!((life4_8 == null))) {
        break forward_join_46;
    }
    }
    life5_7 = ((net.minecraft.block.state.IBlockState)(life5_7)).a__fE(((net.minecraft.block.properties.IProperty)(moom.eA.Q)), ((java.lang.Comparable)(moom.bs.UP)));
    }
    return life5_7;
}


protected boolean b__Boolean(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
net.minecraft.block.Block forwardValue3387_31_0;
    net.minecraft.block.Block forwardValue3387_32_0;
    moom.eA forwardValue3387_32_1;
    net.minecraft.world.World forwardValue3387_41_0;
    moom.DT forwardValue3387_41_1;
    net.minecraft.block.Block spill3387_0;
    moom.eA spill3387_1;
    moom.eA spill3387_2;
    net.minecraft.world.World spill3387_3;
    moom.DT spill3387_4;
    long life4_3;
    int[] life6_5;
    forward_join_43: {
    forward_join_41: {
    forward_join_32: {
    forward_join_31: {
    forward_join_25: {
    life4_3 = (moom.eA.U ^ 110447714114190L);
    life6_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3387_0 = ((net.minecraft.block.state.IBlockState)(p2)).a__ch();
    spill3387_1 = this;
    if (!((life6_5 != null))) {
        forwardValue3387_32_0 = spill3387_0;
        forwardValue3387_32_1 = spill3387_1;
        break forward_join_32;
    }
    if (!((spill3387_0 == spill3387_1))) {
        break forward_join_25;
    }
    spill3387_2 = this;
    if (!((life6_5 != null))) {
        forwardValue3387_31_0 = spill3387_2;
        break forward_join_31;
    }
    if (!(((moom.eA)(spill3387_2)).b(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((moom.bs)(((moom.bs)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.eA.Q)))))))))) {
        break forward_join_25;
    }
    return ((1) != 0);
    }
    spill3387_3 = p0;
    spill3387_4 = p1;
    if (!((life6_5 != null))) {
        forwardValue3387_41_0 = spill3387_3;
        forwardValue3387_41_1 = spill3387_4;
        break forward_join_41;
    }
    forwardValue3387_31_0 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(spill3387_3)).a__fE(((moom.DT)(spill3387_4))))).a__ch();
    }
    forwardValue3387_32_0 = forwardValue3387_31_0;
    forwardValue3387_32_1 = this;
    }
    if (!((forwardValue3387_32_0 == forwardValue3387_32_1))) {
        break forward_join_43;
    }
    ((moom.eA)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((int)(0)));
    forwardValue3387_41_0 = p0;
    forwardValue3387_41_1 = p1;
    }
    ((net.minecraft.world.World)(forwardValue3387_41_0)).d__Boolean(((moom.DT)(forwardValue3387_41_1)));
    }
    return ((0) != 0);
}


public boolean b__Boolean(net.minecraft.world.World p0, moom.DT p1) {
int lexicalValue1135_28_0;
    int lexicalValue1135_32_0;
    int[] spill1135_0;
    boolean spill1135_1;
    long life3_3;
    java.util.Iterator life6_8;
    int[] life5_9;
    moom.bs life7_16;
    lexical_join_32: {
    lexical_join_31: {
    life3_3 = (moom.eA.U ^ 98402124154045L);
    spill1135_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life6_8 = ((java.util.Collection)(((moom.fx)(moom.eA.Q)).a__Collection())).iterator();
    life5_9 = spill1135_0;
    lexical_cycle_10: while (true) {
    lexical_join_29: {
    lexical_join_28: {
    if (!(((java.util.Iterator)(life6_8)).hasNext())) {
        break lexical_join_31;
    }
    life7_16 = ((moom.bs)(((java.util.Iterator)(life6_8)).next()));
    spill1135_1 = ((moom.eA)(this)).b(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((moom.bs)(life7_16)));
    if (!((life5_9 != null))) {
        lexicalValue1135_32_0 = ((spill1135_1) ? 1 : 0);
        break lexical_join_32;
    }
    if (!((life5_9 != null))) {
        lexicalValue1135_28_0 = ((spill1135_1) ? 1 : 0);
        break lexical_join_28;
    }
    if (!(spill1135_1)) {
        break lexical_join_29;
    }
    lexicalValue1135_28_0 = 1;
    }
    return ((lexicalValue1135_28_0) != 0);
    }
    if (!((life5_9 == null))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    lexicalValue1135_32_0 = 0;
    }
    return ((lexicalValue1135_32_0) != 0);
}


public void c(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, java.util.Random p3) {
long life5_3;
    moom.bs life8_9;
    int[] life7_10;
    double life9_16;
    double life11_22;
    double life13_28;
    double life15_30;
    double life17_32;
    moom.bs life19_44;
    forward_join_116: {
    forward_join_105: {
    forward_join_94: {
    life5_3 = (moom.eA.U ^ 56103377815848L);
    int[] spill3950_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life8_9 = ((moom.bs)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.eA.Q)))));
    life7_10 = spill3950_0;
    life9_16 = (((double) ((moom.DT)(p1)).a()) + 0x1.0p-1d);
    life11_22 = (((double) ((moom.DT)(p1)).b()) + 0x1.6666666666666p-1d);
    life13_28 = (((double) ((moom.DT)(p1)).c()) + 0x1.0p-1d);
    life15_30 = 0x1.c28f5c28f5c29p-3d;
    life17_32 = 0x1.147ae147ae148p-2d;
    if (!((life7_10 != null))) { break forward_join_105; }
    if (!(((net.minecraft.util.EnumFacing$Axis)(((moom.bs)(life8_9)).a__bt())).b__Boolean())) { break forward_join_94; }
    life19_44 = ((moom.bs)(life8_9)).a__bs();
    ((net.minecraft.world.World)(p0)).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.SMOKE_NORMAL)), ((double)((life9_16 + (life17_32 * ((double) ((moom.bs)(life19_44)).c()))))), ((double)((life11_22 + life15_30))), ((double)((life13_28 + (life17_32 * ((double) ((moom.bs)(life19_44)).e()))))), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((int[])(new int[0])));
    ((net.minecraft.world.World)(p0)).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.FLAME)), ((double)((life9_16 + (life17_32 * ((double) ((moom.bs)(life19_44)).c()))))), ((double)((life11_22 + life15_30))), ((double)((life13_28 + (life17_32 * ((double) ((moom.bs)(life19_44)).e()))))), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((int[])(new int[0])));
    if (!((life7_10 == null))) { break forward_join_116; }
    }
    ((net.minecraft.world.World)(p0)).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.SMOKE_NORMAL)), ((double)(life9_16)), ((double)(life11_22)), ((double)(life13_28)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((int[])(new int[0])));
    }
    ((net.minecraft.world.World)(p0)).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.FLAME)), ((double)(life9_16)), ((double)(life11_22)), ((double)(life13_28)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((int[])(new int[0])));
    }
    return;
}


private boolean c(net.minecraft.world.World p0, moom.DT p1) {
net.minecraft.world.World forwardValue3389_16_0;
    moom.DT forwardValue3389_16_1;
    net.minecraft.block.Block forwardValue3389_33_0;
    net.minecraft.block.Block forwardValue3389_33_1;
    net.minecraft.block.Block forwardValue3389_35_0;
    int forwardValue3389_38_0;
    int forwardValue3389_40_0;
    net.minecraft.world.World spill3389_0;
    moom.DT spill3389_1;
    int spill3389_2;
    net.minecraft.block.Block spill3389_3;
    net.minecraft.block.Block spill3389_4;
    net.minecraft.block.Block spill3389_5;
    long life3_3;
    int[] life5_5;
    net.minecraft.block.Block life6_23;
    forward_join_40: {
    forward_join_39: {
    forward_join_38: {
    forward_join_37: {
    forward_join_35: {
    forward_join_33: {
    forward_join_16: {
    forward_join_14: {
    life3_3 = (moom.eA.U ^ 62487545348558L);
    life5_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3389_0 = p0;
    spill3389_1 = p1;
    if (!((life5_5 != null))) {
        forwardValue3389_16_0 = spill3389_0;
        forwardValue3389_16_1 = spill3389_1;
        break forward_join_16;
    }
    if (!(net.minecraft.world.World.a(((net.minecraft.world.IBlockAccess)(spill3389_0)), ((moom.DT)(spill3389_1))))) {
        break forward_join_14;
    }
    return ((1) != 0);
    }
    forwardValue3389_16_0 = p0;
    forwardValue3389_16_1 = p1;
    }
    life6_23 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(forwardValue3389_16_0)).a__fE(((moom.DT)(forwardValue3389_16_1))))).a__ch();
    spill3389_2 = ((life6_23 instanceof moom.dz) ? 1 : 0);
    if (!((life5_5 != null))) {
        forwardValue3389_38_0 = spill3389_2;
        break forward_join_38;
    }
    if (!((spill3389_2 == 0))) {
        break forward_join_37;
    }
    spill3389_3 = life6_23;
    spill3389_4 = net.minecraft.init.Blocks.w;
    if (!((life5_5 != null))) {
        forwardValue3389_33_0 = spill3389_3;
        forwardValue3389_33_1 = spill3389_4;
        break forward_join_33;
    }
    if (!((spill3389_3 != spill3389_4))) {
        break forward_join_37;
    }
    spill3389_5 = life6_23;
    if (!((life5_5 != null))) {
        forwardValue3389_35_0 = spill3389_5;
        break forward_join_35;
    }
    forwardValue3389_33_0 = spill3389_5;
    forwardValue3389_33_1 = net.minecraft.init.Blocks.bO;
    }
    if (!((forwardValue3389_33_0 != forwardValue3389_33_1))) {
        break forward_join_37;
    }
    forwardValue3389_35_0 = life6_23;
    }
    if (!((forwardValue3389_35_0 == net.minecraft.init.Blocks.ck))) {
        break forward_join_39;
    }
    }
    forwardValue3389_38_0 = 1;
    }
    forwardValue3389_40_0 = forwardValue3389_38_0;
    break forward_join_40;
    }
    forwardValue3389_40_0 = 0;
    }
    return ((forwardValue3389_40_0) != 0);
}


public net.minecraft.util.EnumWorldBlockLayer a__bx() {
return net.minecraft.util.EnumWorldBlockLayer.CUTOUT;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


protected moom.fA a__fA() {
return new moom.fA(this, new net.minecraft.block.properties.IProperty[] {moom.eA.Q});
}


public moom.CA a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
return null;
}


public net.minecraft.block.state.IBlockState a(net.minecraft.world.World p0, moom.DT p1, moom.bs p2, float p3, float p4, float p5, int p6, net.minecraft.entity.EntityLivingBase p7) {
moom.eA lexicalValue1134_15_0;
    moom.eA spill1134_0;
    long life9_3;
    int[] life11_5;
    java.util.Iterator life12_28;
    moom.bs life13_35;
    lexical_join_46: {
    lexical_join_20: {
    lexical_join_15: {
    life9_3 = (moom.eA.U ^ 128474337092354L);
    life11_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill1134_0 = this;
    if (!((life11_5 != null))) {
        lexicalValue1134_15_0 = spill1134_0;
        break lexical_join_15;
    }
    if (!(((moom.eA)(spill1134_0)).b(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((moom.bs)(p2))))) {
        break lexical_join_20;
    }
    lexicalValue1134_15_0 = this;
    }
    return ((net.minecraft.block.state.IBlockState)(((moom.eA)(lexicalValue1134_15_0)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.eA.Q)), ((java.lang.Comparable)(p2)));
    }
    life12_28 = ((net.minecraft.util.EnumFacing$Plane)(net.minecraft.util.EnumFacing$Plane.HORIZONTAL)).iterator();
    lexical_cycle_23: while (true) {
    lexical_join_44: {
    if (!(((java.util.Iterator)(life12_28)).hasNext())) {
        break lexical_join_46;
    }
    life13_35 = ((moom.bs)(((java.util.Iterator)(life12_28)).next()));
    if (!(((net.minecraft.world.World)(p0)).c(((moom.DT)(((moom.DT)(p1)).a(((moom.bs)(((moom.bs)(life13_35)).a__bs()))))), ((boolean)(true))))) {
        break lexical_join_44;
    }
    return ((net.minecraft.block.state.IBlockState)(((moom.eA)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.eA.Q)), ((java.lang.Comparable)(life13_35)));
    }
    if (!((life11_5 == null))) { continue lexical_cycle_23; }
    break lexical_cycle_23;
    }
    }
    return ((moom.eA)(this)).a__fE();
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.block.Block p3) {
((moom.eA)(this)).a__Boolean(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)));
    return;
}


protected boolean a__Boolean(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
int forwardValue3383_15_0;
    int forwardValue3383_49_0;
    int forwardValue3383_64_0;
    int forwardValue3383_80_0;
    boolean spill3383_0;
    boolean spill3383_1;
    boolean spill3383_2;
    boolean spill3383_3;
    long life4_3;
    int[] life6_5;
    moom.bs life7_23;
    net.minecraft.util.EnumFacing$Axis life8_26;
    moom.bs life9_29;
    int life10_31;
    forward_join_80: {
    forward_join_79: {
    forward_join_64: {
    forward_join_63: {
    forward_join_49: {
    forward_join_47: {
    forward_join_16: {
    forward_join_15: {
    life4_3 = (moom.eA.U ^ 86444905516435L);
    life6_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3383_0 = ((moom.eA)(this)).b__Boolean(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)));
    if (!((life6_5 != null))) {
        forwardValue3383_15_0 = ((spill3383_0) ? 1 : 0);
        break forward_join_15;
    }
    if (!((!spill3383_0))) {
        break forward_join_16;
    }
    forwardValue3383_15_0 = 1;
    }
    return ((forwardValue3383_15_0) != 0);
    }
    life7_23 = ((moom.bs)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.eA.Q)))));
    life8_26 = ((moom.bs)(life7_23)).a__bt();
    life9_29 = ((moom.bs)(life7_23)).a__bs();
    life10_31 = 0;
    spill3383_1 = ((net.minecraft.util.EnumFacing$Axis)(life8_26)).b__Boolean();
    if (!((life6_5 != null))) {
        forwardValue3383_49_0 = ((spill3383_1) ? 1 : 0);
        break forward_join_49;
    }
    if (!(spill3383_1)) {
        break forward_join_47;
    }
    spill3383_2 = ((net.minecraft.world.World)(p0)).c(((moom.DT)(((moom.DT)(p1)).a(((moom.bs)(life9_29))))), ((boolean)(true)));
    if (!((life6_5 != null))) {
        forwardValue3383_49_0 = ((spill3383_2) ? 1 : 0);
        break forward_join_49;
    }
    if (!((!spill3383_2))) {
        break forward_join_47;
    }
    life10_31 = 1;
    if (!((life6_5 == null))) {
        break forward_join_63;
    }
    }
    forwardValue3383_49_0 = ((((net.minecraft.util.EnumFacing$Axis)(life8_26)).a__Boolean()) ? 1 : 0);
    }
    if (!((life6_5 != null))) {
        forwardValue3383_64_0 = forwardValue3383_49_0;
        break forward_join_64;
    }
    if (!((forwardValue3383_49_0 != 0))) {
        break forward_join_63;
    }
    spill3383_3 = ((moom.eA)(this)).c(((net.minecraft.world.World)(p0)), ((moom.DT)(((moom.DT)(p1)).a(((moom.bs)(life9_29))))));
    if (!((life6_5 != null))) {
        forwardValue3383_64_0 = ((spill3383_3) ? 1 : 0);
        break forward_join_64;
    }
    if (!((!spill3383_3))) {
        break forward_join_63;
    }
    life10_31 = 1;
    }
    forwardValue3383_64_0 = life10_31;
    }
    if (!((life6_5 != null))) {
        forwardValue3383_80_0 = forwardValue3383_64_0;
        break forward_join_80;
    }
    if (!((forwardValue3383_64_0 != 0))) {
        break forward_join_79;
    }
    ((moom.eA)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((int)(0)));
    ((net.minecraft.world.World)(p0)).d__Boolean(((moom.DT)(p1)));
    return ((1) != 0);
    }
    forwardValue3383_80_0 = 0;
    }
    return ((forwardValue3383_80_0) != 0);
}


public net.minecraft.util.MovingObjectPosition a(net.minecraft.world.World p0, moom.DT p1, moom.DR p2, moom.DR p3) {
moom.bs forwardValue3381_38_0;
    moom.bs forwardValue3381_38_1;
    moom.bs forwardValue3381_61_0;
    moom.bs forwardValue3381_61_1;
    moom.bs forwardValue3381_82_0;
    moom.bs forwardValue3381_82_1;
    int[] spill3381_0;
    moom.bs spill3381_1;
    moom.bs spill3381_2;
    long life5_3;
    moom.bs life8_11;
    float life9_13;
    int[] life7_14;
    float life9_132;
    forward_join_119: {
    forward_join_101: {
    forward_join_82: {
    forward_join_80: {
    forward_join_61: {
    forward_join_59: {
    forward_join_38: {
    forward_join_36: {
    life5_3 = (moom.eA.U ^ 11270091998111L);
    spill3381_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life8_11 = ((moom.bs)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(p1))))).a(((net.minecraft.block.properties.IProperty)(moom.eA.Q)))));
    life9_13 = 0x1.333334p-3f;
    life7_14 = spill3381_0;
    spill3381_1 = life8_11;
    spill3381_2 = moom.bs.EAST;
    if (!((life7_14 != null))) {
        forwardValue3381_38_0 = spill3381_1;
        forwardValue3381_38_1 = spill3381_2;
        break forward_join_38;
    }
    if (!((spill3381_1 == spill3381_2))) {
        break forward_join_36;
    }
    ((moom.eA)(this)).a(((float)(0x0.0p0f)), ((float)(0x1.99999ap-3f)), ((float)((0x1.0p-1f - life9_13))), ((float)((life9_13 * 0x1.0p1f))), ((float)(0x1.99999ap-1f)), ((float)((0x1.0p-1f + life9_13))));
    if (!((life7_14 == null))) {
        break forward_join_119;
    }
    }
    forwardValue3381_38_0 = life8_11;
    forwardValue3381_38_1 = moom.bs.WEST;
    }
    if (!((life7_14 != null))) {
        forwardValue3381_61_0 = forwardValue3381_38_0;
        forwardValue3381_61_1 = forwardValue3381_38_1;
        break forward_join_61;
    }
    if (!((forwardValue3381_38_0 == forwardValue3381_38_1))) {
        break forward_join_59;
    }
    ((moom.eA)(this)).a(((float)((0x1.0p0f - (life9_13 * 0x1.0p1f)))), ((float)(0x1.99999ap-3f)), ((float)((0x1.0p-1f - life9_13))), ((float)(0x1.0p0f)), ((float)(0x1.99999ap-1f)), ((float)((0x1.0p-1f + life9_13))));
    if (!((life7_14 == null))) {
        break forward_join_119;
    }
    }
    forwardValue3381_61_0 = life8_11;
    forwardValue3381_61_1 = moom.bs.SOUTH;
    }
    if (!((life7_14 != null))) {
        forwardValue3381_82_0 = forwardValue3381_61_0;
        forwardValue3381_82_1 = forwardValue3381_61_1;
        break forward_join_82;
    }
    if (!((forwardValue3381_61_0 == forwardValue3381_61_1))) {
        break forward_join_80;
    }
    ((moom.eA)(this)).a(((float)((0x1.0p-1f - life9_13))), ((float)(0x1.99999ap-3f)), ((float)(0x0.0p0f)), ((float)((0x1.0p-1f + life9_13))), ((float)(0x1.99999ap-1f)), ((float)((life9_13 * 0x1.0p1f))));
    if (!((life7_14 == null))) {
        break forward_join_119;
    }
    }
    forwardValue3381_82_0 = life8_11;
    forwardValue3381_82_1 = moom.bs.NORTH;
    }
    if (!((forwardValue3381_82_0 == forwardValue3381_82_1))) {
        break forward_join_101;
    }
    ((moom.eA)(this)).a(((float)((0x1.0p-1f - life9_13))), ((float)(0x1.99999ap-3f)), ((float)((0x1.0p0f - (life9_13 * 0x1.0p1f)))), ((float)((0x1.0p-1f + life9_13))), ((float)(0x1.99999ap-1f)), ((float)(0x1.0p0f)));
    if (!((life7_14 == null))) {
        break forward_join_119;
    }
    }
    life9_132 = 0x1.99999ap-4f;
    ((moom.eA)(this)).a(((float)((0x1.0p-1f - life9_132))), ((float)(0x0.0p0f)), ((float)((0x1.0p-1f - life9_132))), ((float)((0x1.0p-1f + life9_132))), ((float)(0x1.333334p-1f)), ((float)((0x1.0p-1f + life9_132))));
    }
    return super.a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((moom.DR)(p2)), ((moom.DR)(p3)));
}


public boolean g() {
return ((0) != 0);
}


public boolean j() {
return ((0) != 0);
}


private static boolean lambda$static$0(moom.bs p0) {
long local1 = (moom.eA.U ^ 104626078871584L);
    return ((((p0 != moom.bs.DOWN) ? 1 : 0)) != 0);
}


private static native <E extends Throwable> com.google.common.base.Predicate __sourceIntrinsic_eb8803ad1f63_originalDynamicSite4276_5() throws E;
}
