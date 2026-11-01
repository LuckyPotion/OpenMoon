package moom;


public class Gf extends moom.FY {

private final net.minecraft.block.Block c;

private final int d;

private static final long e;

public Gf(int p0) {
super();
    this.c = net.minecraft.init.Blocks.aL;
    this.d = p0;
}


static {
e = (moom._c.a(922526902556466707L, 8549580796307630972L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(164175128026545L);
}


public boolean a__Boolean(net.minecraft.world.World p0, java.util.Random p1, moom.DT p2) {
int forestValue658_36_0;
    int forestValue658_36_1;
    net.minecraft.block.Block forestValue658_107_0;
    net.minecraft.block.Block forestValue658_107_1;
    int forestValue658_126_0;
    int spill658_0;
    int spill658_1;
    int spill658_2;
    net.minecraft.block.Block spill658_3;
    net.minecraft.block.Block spill658_4;
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
    life4_3 = (moom.Gf.e ^ 57491974233908L);
    life6_5 = moom.FY.b();
    if (!((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(p2))))).a__ch())).a__fn() != moom.fn.h))) {
        break forest_join_15;
    }
    return ((0) != 0);
    }
    life7_23 = (((java.util.Random)(p1)).nextInt(((int)((this.d - 2)))) + 2);
    life8_25 = 1;
    life9_30 = (((moom.DT)(p2)).a() - life7_23);
    forest_cycle_31: while (true) {
    forest_join_122: {
    forestValue658_36_0 = life9_30;
    forestValue658_36_1 = (((moom.DT)(p2)).a() + life7_23);
    forest_cycle_36: while (true) {
    if (!((forestValue658_36_0 <= forestValue658_36_1))) {
        break forest_join_125;
    }
    spill658_0 = (((moom.DT)(p2)).c() - life7_23);
    if (!((life6_5 != null))) {
        forestValue658_126_0 = spill658_0;
        break forest_join_126;
    }
    life10_43 = spill658_0;
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
    spill658_1 = ((life11_54 * life11_54) + (life12_59 * life12_59));
    spill658_2 = (life7_23 * life7_23);
    if (!((life6_5 != null))) {
        forestValue658_36_0 = spill658_1;
        forestValue658_36_1 = spill658_2;
        continue forest_cycle_36;
    }
    if (!((spill658_1 <= spill658_2))) {
        break forest_join_119;
    }
    life13_80 = (((moom.DT)(p2)).b() - life8_25);
    forest_cycle_80: while (true) {
    forest_join_116: {
    forest_join_108: {
    forest_join_107: {
    if (!((life13_80 <= (((moom.DT)(p2)).b() + life8_25)))) {
        break forest_join_119;
    }
    life14_93 = new moom.DT(life9_30, life13_80, life10_43);
    life15_98 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life14_93))))).a__ch();
    if (!((life6_5 != null))) {
        break forest_join_120;
    }
    spill658_3 = life15_98;
    spill658_4 = net.minecraft.init.Blocks.d;
    if (!((life6_5 != null))) {
        forestValue658_107_0 = spill658_3;
        forestValue658_107_1 = spill658_4;
        break forest_join_107;
    }
    if (!((spill658_3 != spill658_4))) {
        break forest_join_108;
    }
    forestValue658_107_0 = life15_98;
    forestValue658_107_1 = net.minecraft.init.Blocks.aL;
    }
    if (!((forestValue658_107_0 == forestValue658_107_1))) {
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
    forestValue658_126_0 = 1;
    }
    return ((forestValue658_126_0) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}

}
