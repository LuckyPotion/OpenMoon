package moom;


public class Gx extends moom.FY {

private final net.minecraft.block.Block c;

private final int d;

private static final long e;

public Gx(net.minecraft.block.Block p0, int p1) {
super();
    this.c = p0;
    this.d = p1;
}


static {
e = (moom._c.a(-8460067166344422510L, 6900910088672965856L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(35340253918332L);
}


public boolean a__Boolean(net.minecraft.world.World p0, java.util.Random p1, moom.DT p2) {
int forestValue664_36_0;
    int forestValue664_36_1;
    net.minecraft.block.Block forestValue664_106_0;
    int forestValue664_126_0;
    int spill664_0;
    int spill664_1;
    int spill664_2;
    net.minecraft.block.Block spill664_3;
    long life4_3;
    int[] life6_5;
    int life7_23;
    int life8_25;
    int life9_30;
    int life10_43;
    int life11_54;
    int life12_59;
    int life13_80;
    moom.DT life14_93;
    net.minecraft.block.Block life15_98;
    forest_join_126: {
    forest_join_125: {
    forest_join_15: {
    life4_3 = (moom.Gx.e ^ 39873023720968L);
    life6_5 = moom.FY.b();
    if (!((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(p2))))).a__ch())).a__fn() != moom.fn.h))) {
        break forest_join_15;
    }
    return ((0) != 0);
    }
    life7_23 = (((java.util.Random)(p1)).nextInt(((int)((this.d - 2)))) + 2);
    life8_25 = 2;
    life9_30 = (((moom.DT)(p2)).a() - life7_23);
    forest_cycle_31: while (true) {
    forest_join_122: {
    forestValue664_36_0 = life9_30;
    forestValue664_36_1 = (((moom.DT)(p2)).a() + life7_23);
    forest_cycle_36: while (true) {
    if (!((forestValue664_36_0 <= forestValue664_36_1))) {
        break forest_join_125;
    }
    spill664_0 = (((moom.DT)(p2)).c() - life7_23);
    if (!((life6_5 != null))) {
        forestValue664_126_0 = spill664_0;
        break forest_join_126;
    }
    life10_43 = spill664_0;
    forest_cycle_44: while (true) {
    forest_join_120: {
    forest_join_119: {
    if (!((life10_43 <= (((moom.DT)(p2)).c() + life7_23)))) {
        break forest_join_122;
    }
    life11_54 = (life9_30 - ((moom.DT)(p2)).a());
    life12_59 = (life10_43 - ((moom.DT)(p2)).c());
    if (!((life6_5 != null))) {
        break forest_join_120;
    }
    spill664_1 = ((life11_54 * life11_54) + (life12_59 * life12_59));
    spill664_2 = (life7_23 * life7_23);
    if (!((life6_5 != null))) {
        forestValue664_36_0 = spill664_1;
        forestValue664_36_1 = spill664_2;
        continue forest_cycle_36;
    }
    if (!((spill664_1 <= spill664_2))) {
        break forest_join_119;
    }
    life13_80 = (((moom.DT)(p2)).b() - life8_25);
    forest_cycle_80: while (true) {
    forest_join_116: {
    forest_join_108: {
    forest_join_106: {
    if (!((life13_80 <= (((moom.DT)(p2)).b() + life8_25)))) {
        break forest_join_119;
    }
    life14_93 = new moom.DT(life9_30, life13_80, life10_43);
    life15_98 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life14_93))))).a__ch();
    if (!((life6_5 != null))) {
        break forest_join_120;
    }
    spill664_3 = life15_98;
    if (!((life6_5 != null))) {
        forestValue664_106_0 = spill664_3;
        break forest_join_106;
    }
    if (!((spill664_3 != net.minecraft.init.Blocks.d))) {
        break forest_join_108;
    }
    forestValue664_106_0 = life15_98;
    }
    if (!((forestValue664_106_0 == net.minecraft.init.Blocks.c))) {
        break forest_join_116;
    }
    }
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(life14_93)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(this.c)).a__fE())), ((int)(2)));
    }
    life13_80 += 1;
    if (!((life6_5 == null))) {
        continue forest_cycle_80;
    }
    break forest_cycle_80;
    }
    }
    life10_43 += 1;
    }
    if (!((life6_5 == null))) {
        continue forest_cycle_44;
    }
    break forest_cycle_44;
    }
    break forest_cycle_36;
    }
    }
    life9_30 += 1;
    if (!((life6_5 == null))) {
        continue forest_cycle_31;
    }
    break forest_cycle_31;
    }
    }
    forestValue664_126_0 = 1;
    }
    return ((forestValue664_126_0) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}

}
