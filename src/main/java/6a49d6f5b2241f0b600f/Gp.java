package moom;


public class Gp extends moom.FY {

private final net.minecraft.block.Block c;

private final int d;

private static final long e;

public Gp(int p0) {
super();
    this.c = net.minecraft.init.Blocks.cf;
    this.d = p0;
}


static {
e = (moom._c.a(1543395495268352939L, 7033244392049860260L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(75912356262505L);
}


public boolean a__Boolean(net.minecraft.world.World p0, java.util.Random p1, moom.DT p2) {
moom.DT forestValue273_20_0;
    int forestValue273_38_0;
    int forestValue273_38_1;
    int forestValue273_52_0;
    int forestValue273_52_1;
    net.minecraft.block.Block forestValue273_123_0;
    net.minecraft.block.Block forestValue273_123_1;
    net.minecraft.block.Block forestValue273_128_0;
    net.minecraft.block.Block forestValue273_128_1;
    int forestValue273_147_0;
    moom.DT spill273_0;
    int spill273_1;
    int spill273_2;
    int spill273_3;
    int spill273_4;
    int spill273_5;
    net.minecraft.block.Block spill273_6;
    net.minecraft.block.Block spill273_7;
    long life4_3;
    int[] life6_5;
    int life7_42;
    int life8_44;
    int life9_49;
    int life10_62;
    int life11_73;
    int life12_78;
    int life13_99;
    moom.DT life14_112;
    net.minecraft.block.Block life15_117;
    forest_join_147: {
    forest_join_146: {
    forest_join_38: {
    forest_join_31: {
    forest_join_23: {
    life4_3 = (moom.Gp.e ^ 109656453500291L);
    life6_5 = moom.FY.b();
    forest_cycle_6: while (true) {
    forest_join_20: {
    if (!(((net.minecraft.world.World)(p0)).a__Boolean(((moom.DT)(p2))))) {
        break forest_join_23;
    }
    spill273_0 = p2;
    if (!((life6_5 != null))) {
        forestValue273_20_0 = spill273_0;
        break forest_join_20;
    }
    spill273_1 = ((moom.DT)(spill273_0)).b();
    spill273_2 = 2;
    if (!((life6_5 != null))) {
        forestValue273_38_0 = spill273_1;
        forestValue273_38_1 = spill273_2;
        break forest_join_38;
    }
    if (!((spill273_1 > spill273_2))) {
        break forest_join_23;
    }
    forestValue273_20_0 = ((moom.DT)(p2)).b__DT();
    }
    p2 = forestValue273_20_0;
    if (!((life6_5 == null))) {
        continue forest_cycle_6;
    }
    break forest_cycle_6;
    }
    }
    if (!((((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(p2))))).a__ch() != net.minecraft.init.Blocks.aJ))) {
        break forest_join_31;
    }
    return ((0) != 0);
    }
    forestValue273_38_0 = ((java.util.Random)(p1)).nextInt(((int)((this.d - 2))));
    forestValue273_38_1 = 2;
    }
    life7_42 = (forestValue273_38_0 + forestValue273_38_1);
    life8_44 = 1;
    life9_49 = (((moom.DT)(p2)).a() - life7_42);
    forest_cycle_47: while (true) {
    forest_join_143: {
    forestValue273_52_0 = life9_49;
    forestValue273_52_1 = (((moom.DT)(p2)).a() + life7_42);
    forest_cycle_52: while (true) {
    if (!((forestValue273_52_0 <= forestValue273_52_1))) {
        break forest_join_146;
    }
    spill273_3 = (((moom.DT)(p2)).c() - life7_42);
    if (!((life6_5 != null))) {
        forestValue273_147_0 = spill273_3;
        break forest_join_147;
    }
    life10_62 = spill273_3;
    forest_cycle_60: while (true) {
    forest_join_141: {
    forest_join_140: {
    if (!((life10_62 <= (((moom.DT)(p2)).c() + life7_42)))) {
        break forest_join_143;
    }
    life11_73 = (life9_49 - ((moom.DT)(p2)).a());
    life12_78 = (life10_62 - ((moom.DT)(p2)).c());
    if (!((life6_5 != null))) {
        break forest_join_141;
    }
    spill273_4 = ((life11_73 * life11_73) + (life12_78 * life12_78));
    spill273_5 = (life7_42 * life7_42);
    if (!((life6_5 != null))) {
        forestValue273_52_0 = spill273_4;
        forestValue273_52_1 = spill273_5;
        continue forest_cycle_52;
    }
    if (!((spill273_4 <= spill273_5))) {
        break forest_join_140;
    }
    life13_99 = (((moom.DT)(p2)).b() - life8_44);
    forest_cycle_96: while (true) {
    forest_join_137: {
    forest_join_129: {
    forest_join_128: {
    forest_join_123: {
    if (!((life13_99 <= (((moom.DT)(p2)).b() + life8_44)))) {
        break forest_join_140;
    }
    life14_112 = new moom.DT(life9_49, life13_99, life10_62);
    life15_117 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life14_112))))).a__ch();
    if (!((life6_5 != null))) {
        break forest_join_141;
    }
    spill273_6 = life15_117;
    spill273_7 = net.minecraft.init.Blocks.d;
    if (!((life6_5 != null))) {
        forestValue273_123_0 = spill273_6;
        forestValue273_123_1 = spill273_7;
        break forest_join_123;
    }
    if (!((spill273_6 != spill273_7))) {
        break forest_join_129;
    }
    forestValue273_123_0 = life15_117;
    forestValue273_123_1 = net.minecraft.init.Blocks.aJ;
    }
    if (!((life6_5 != null))) {
        forestValue273_128_0 = forestValue273_123_0;
        forestValue273_128_1 = forestValue273_123_1;
        break forest_join_128;
    }
    if (!((forestValue273_123_0 != forestValue273_123_1))) {
        break forest_join_129;
    }
    forestValue273_128_0 = life15_117;
    forestValue273_128_1 = net.minecraft.init.Blocks.aI;
    }
    if (!((forestValue273_128_0 == forestValue273_128_1))) {
        break forest_join_137;
    }
    }
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(life14_112)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(this.c)).a__fE())), ((int)(2)));
    }
    life13_99 += 1;
    if (!((life6_5 == null))) {
        continue forest_cycle_96;
    }
    break forest_cycle_96;
    }
    }
    life10_62 += 1;
    }
    if (!((life6_5 == null))) {
        continue forest_cycle_60;
    }
    break forest_cycle_60;
    }
    break forest_cycle_52;
    }
    }
    life9_49 += 1;
    if (!((life6_5 == null))) {
        continue forest_cycle_47;
    }
    break forest_cycle_47;
    }
    }
    forestValue273_147_0 = 1;
    }
    return ((forestValue273_147_0) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}

}
