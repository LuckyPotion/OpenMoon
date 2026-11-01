package moom;


public class Gb extends moom.Ga {

private final net.minecraft.block.state.IBlockState i;

private final net.minecraft.block.state.IBlockState j;

private static final long k;

public Gb(net.minecraft.block.state.IBlockState p0, net.minecraft.block.state.IBlockState p1) {
super(false);
    this.j = p0;
    this.i = p1;
}


static {
k = (moom._c.a(4749880054220106605L, 2107613930103208396L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(227138087681103L);
}


private static moom.Oo c(moom.Oo p0) {
return p0;
}


public boolean a__Boolean(net.minecraft.world.World p0, java.util.Random p1, moom.DT p2) {
moom.DT forestValue269_30_0;
    net.minecraft.block.Block forestValue269_37_0;
    int forestValue269_59_0;
    int forestValue269_85_0;
    int forestValue269_85_1;
    int forestValue269_122_0;
    int forestValue269_122_1;
    int forestValue269_126_0;
    int forestValue269_158_0;
    net.minecraft.block.Block spill269_0;
    moom.DT spill269_1;
    int spill269_2;
    int spill269_3;
    int spill269_4;
    int spill269_5;
    int spill269_6;
    long life4_3;
    int[] life6_5;
    net.minecraft.block.Block life7_11;
    net.minecraft.block.Block life8_42;
    int life9_64;
    int life10_75;
    int life11_79;
    int life12_86;
    int life13_97;
    int life14_104;
    int life15_115;
    moom.DT life16_144;
    forest_join_158: {
    forest_join_157: {
    forest_join_55: {
    forest_join_46: {
    forest_join_37: {
    forest_join_33: {
    life4_3 = (moom.Gb.k ^ 113162050488564L);
    life6_5 = moom.FY.b();
    forest_cycle_6: while (true) {
    forest_join_30: {
    forest_join_23: {
    if (!((((net.minecraft.block.Block)((life7_11 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(p2))))).a__ch()))).a__fn() != moom.fn.a))) {
        break forest_join_23;
    }
    spill269_0 = life7_11;
    if (!((life6_5 != null))) {
        forestValue269_37_0 = spill269_0;
        break forest_join_37;
    }
    if (!((life6_5 != null))) {
        forestValue269_37_0 = spill269_0;
        break forest_join_37;
    }
    if (!((((net.minecraft.block.Block)(spill269_0)).a__fn() == moom.fn.j))) {
        break forest_join_33;
    }
    }
    spill269_1 = p2;
    if (!((life6_5 != null))) {
        forestValue269_30_0 = spill269_1;
        break forest_join_30;
    }
    if (!((((moom.DT)(spill269_1)).b() > 0))) {
        break forest_join_33;
    }
    forestValue269_30_0 = ((moom.DT)(p2)).b__DT();
    }
    p2 = forestValue269_30_0;
    if (!((life6_5 == null))) {
        continue forest_cycle_6;
    }
    break forest_cycle_6;
    }
    }
    forestValue269_37_0 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(p2))))).a__ch();
    }
    life8_42 = forestValue269_37_0;
    if (!((life6_5 != null))) {
        break forest_join_55;
    }
    if (!((life8_42 != net.minecraft.init.Blocks.d))) {
        break forest_join_46;
    }
    if (!((life8_42 == net.minecraft.init.Blocks.c))) {
        break forest_join_157;
    }
    }
    p2 = ((moom.DT)(p2)).a__DT();
    ((moom.Gb)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(p2)), ((net.minecraft.block.state.IBlockState)(this.j)));
    }
    life9_64 = ((moom.DT)(p2)).b();
    forest_cycle_58: while (true) {
    forest_join_154: {
    forestValue269_59_0 = life9_64;
    forest_cycle_59: while (true) {
    if (!((forestValue269_59_0 <= (((moom.DT)(p2)).b() + 2)))) {
        break forest_join_157;
    }
    life10_75 = (life9_64 - ((moom.DT)(p2)).b());
    life11_79 = (2 - life10_75);
    spill269_2 = (((moom.DT)(p2)).a() - life11_79);
    if (!((life6_5 != null))) {
        forestValue269_158_0 = spill269_2;
        break forest_join_158;
    }
    life12_86 = spill269_2;
    forest_cycle_80: while (true) {
    forest_join_151: {
    forestValue269_85_0 = life12_86;
    forestValue269_85_1 = (((moom.DT)(p2)).a() + life11_79);
    forest_cycle_85: while (true) {
    if (!((forestValue269_85_0 <= forestValue269_85_1))) {
        break forest_join_154;
    }
    life13_97 = (life12_86 - ((moom.DT)(p2)).a());
    spill269_3 = (((moom.DT)(p2)).c() - life11_79);
    if (!((life6_5 != null))) {
        forestValue269_59_0 = spill269_3;
        continue forest_cycle_59;
    }
    life14_104 = spill269_3;
    forest_cycle_98: while (true) {
    forest_join_149: {
    forest_join_148: {
    forest_join_127: {
    forest_join_126: {
    forest_join_122: {
    if (!((life14_104 <= (((moom.DT)(p2)).c() + life11_79)))) {
        break forest_join_151;
    }
    life15_115 = (life14_104 - ((moom.DT)(p2)).c());
    spill269_4 = java.lang.Math.abs(((int)(life13_97)));
    spill269_5 = life11_79;
    if (!((life6_5 != null))) {
        forestValue269_85_0 = spill269_4;
        forestValue269_85_1 = spill269_5;
        continue forest_cycle_85;
    }
    if (!((life6_5 != null))) {
        forestValue269_122_0 = spill269_4;
        forestValue269_122_1 = spill269_5;
        break forest_join_122;
    }
    if (!((spill269_4 == spill269_5))) {
        break forest_join_127;
    }
    spill269_6 = java.lang.Math.abs(((int)(life15_115)));
    if (!((life6_5 != null))) {
        forestValue269_126_0 = spill269_6;
        break forest_join_126;
    }
    forestValue269_122_0 = spill269_6;
    forestValue269_122_1 = life11_79;
    }
    if (!((forestValue269_122_0 == forestValue269_122_1))) {
        break forest_join_127;
    }
    forestValue269_126_0 = ((java.util.Random)(p1)).nextInt(((int)(2)));
    }
    if (!((forestValue269_126_0 != 0))) {
        break forest_join_148;
    }
    }
    life16_144 = new moom.DT(life12_86, life9_64, life14_104);
    if (!((life6_5 != null))) {
        break forest_join_149;
    }
    if (!((!((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life16_144))))).a__ch())).a__Boolean()))) {
        break forest_join_148;
    }
    ((moom.Gb)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(life16_144)), ((net.minecraft.block.state.IBlockState)(this.i)));
    }
    life14_104 += 1;
    }
    if (!((life6_5 == null))) {
        continue forest_cycle_98;
    }
    break forest_cycle_98;
    }
    break forest_cycle_85;
    }
    }
    life12_86 += 1;
    if (!((life6_5 == null))) {
        continue forest_cycle_80;
    }
    break forest_cycle_80;
    }
    break forest_cycle_59;
    }
    }
    life9_64 += 1;
    if (!((life6_5 == null))) {
        continue forest_cycle_58;
    }
    break forest_cycle_58;
    }
    }
    forestValue269_158_0 = 1;
    }
    return ((forestValue269_158_0) != 0);
}

}
