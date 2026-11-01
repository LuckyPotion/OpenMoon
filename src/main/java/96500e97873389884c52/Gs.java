package moom;


public class Gs extends moom.FY {

private final net.minecraft.block.Block c;

private static final long d;

public Gs(net.minecraft.block.Block p0) {
super();
    this.c = p0;
}


static {
d = (moom._c.a(-8883269129556890014L, -3857153380839668831L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(276528607564598L);
}


public boolean a__Boolean(net.minecraft.world.World p0, java.util.Random p1, moom.DT p2) {
net.minecraft.block.Block forwardValue2037_25_0;
    net.minecraft.block.Block forwardValue2037_25_1;
    net.minecraft.block.Block forwardValue2037_32_0;
    net.minecraft.block.Block forwardValue2037_41_0;
    net.minecraft.block.Block forwardValue2037_63_0;
    net.minecraft.block.Block forwardValue2037_63_1;
    net.minecraft.block.Block forwardValue2037_73_0;
    net.minecraft.block.Block forwardValue2037_73_1;
    net.minecraft.block.Block forwardValue2037_83_0;
    net.minecraft.block.Block forwardValue2037_83_1;
    int forwardValue2037_99_0;
    int forwardValue2037_107_0;
    int forwardValue2037_115_0;
    int forwardValue2037_120_0;
    int forwardValue2037_144_0;
    net.minecraft.block.Block spill2037_0;
    net.minecraft.block.Block spill2037_1;
    net.minecraft.block.Block spill2037_2;
    net.minecraft.block.Block spill2037_3;
    net.minecraft.block.Block spill2037_4;
    boolean spill2037_5;
    int spill2037_6;
    long life4_3;
    int[] life6_5;
    int life7_64;
    int life8_113;
    forward_join_144: {
    forward_join_143: {
    forward_join_120: {
    forward_join_119: {
    forward_join_115: {
    forward_join_111: {
    forward_join_107: {
    forward_join_103: {
    forward_join_99: {
    forward_join_95: {
    forward_join_85: {
    forward_join_83: {
    forward_join_77: {
    forward_join_73: {
    forward_join_67: {
    forward_join_63: {
    forward_join_57: {
    forward_join_45: {
    forward_join_41: {
    forward_join_32: {
    forward_join_28: {
    forward_join_25: {
    forward_join_17: {
    life4_3 = (moom.Gs.d ^ 45863284382479L);
    life6_5 = moom.FY.b();
    spill2037_0 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p2)).a__DT()))))).a__ch();
    spill2037_1 = net.minecraft.init.Blocks.b;
    if (!((life6_5 != null))) {
        forwardValue2037_25_0 = spill2037_0;
        forwardValue2037_25_1 = spill2037_1;
        break forward_join_25;
    }
    if (!((spill2037_0 != spill2037_1))) {
        break forward_join_17;
    }
    return ((0) != 0);
    }
    spill2037_2 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p2)).b__DT()))))).a__ch();
    if (!((life6_5 != null))) {
        forwardValue2037_32_0 = spill2037_2;
        break forward_join_32;
    }
    forwardValue2037_25_0 = spill2037_2;
    forwardValue2037_25_1 = net.minecraft.init.Blocks.b;
    }
    if (!((forwardValue2037_25_0 != forwardValue2037_25_1))) {
        break forward_join_28;
    }
    return ((0) != 0);
    }
    forwardValue2037_32_0 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(p2))))).a__ch();
    }
    if (!((life6_5 != null))) {
        forwardValue2037_41_0 = forwardValue2037_32_0;
        break forward_join_41;
    }
    if (!((((net.minecraft.block.Block)(forwardValue2037_32_0)).a__fn() != moom.fn.a))) {
        break forward_join_45;
    }
    forwardValue2037_41_0 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(p2))))).a__ch();
    }
    if (!((forwardValue2037_41_0 != net.minecraft.init.Blocks.b))) {
        break forward_join_45;
    }
    return ((0) != 0);
    }
    life7_64 = 0;
    spill2037_3 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p2)).e()))))).a__ch();
    spill2037_4 = net.minecraft.init.Blocks.b;
    if (!((life6_5 != null))) {
        forwardValue2037_63_0 = spill2037_3;
        forwardValue2037_63_1 = spill2037_4;
        break forward_join_63;
    }
    if (!((spill2037_3 == spill2037_4))) {
        break forward_join_57;
    }
    life7_64 += 1;
    }
    forwardValue2037_63_0 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p2)).f()))))).a__ch();
    forwardValue2037_63_1 = net.minecraft.init.Blocks.b;
    }
    if (!((life6_5 != null))) {
        forwardValue2037_73_0 = forwardValue2037_63_0;
        forwardValue2037_73_1 = forwardValue2037_63_1;
        break forward_join_73;
    }
    if (!((forwardValue2037_63_0 == forwardValue2037_63_1))) {
        break forward_join_67;
    }
    life7_64 += 1;
    }
    forwardValue2037_73_0 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p2)).c__DT()))))).a__ch();
    forwardValue2037_73_1 = net.minecraft.init.Blocks.b;
    }
    if (!((life6_5 != null))) {
        forwardValue2037_83_0 = forwardValue2037_73_0;
        forwardValue2037_83_1 = forwardValue2037_73_1;
        break forward_join_83;
    }
    if (!((forwardValue2037_73_0 == forwardValue2037_73_1))) {
        break forward_join_77;
    }
    life7_64 += 1;
    }
    forwardValue2037_83_0 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p2)).d__DT()))))).a__ch();
    forwardValue2037_83_1 = net.minecraft.init.Blocks.b;
    }
    if (!((forwardValue2037_83_0 == forwardValue2037_83_1))) {
        break forward_join_85;
    }
    life7_64 += 1;
    }
    life8_113 = 0;
    spill2037_5 = ((net.minecraft.world.World)(p0)).a__Boolean(((moom.DT)(((moom.DT)(p2)).e())));
    if (!((life6_5 != null))) {
        forwardValue2037_99_0 = ((spill2037_5) ? 1 : 0);
        break forward_join_99;
    }
    if (!(spill2037_5)) {
        break forward_join_95;
    }
    life8_113 += 1;
    }
    forwardValue2037_99_0 = ((((net.minecraft.world.World)(p0)).a__Boolean(((moom.DT)(((moom.DT)(p2)).f())))) ? 1 : 0);
    }
    if (!((life6_5 != null))) {
        forwardValue2037_107_0 = forwardValue2037_99_0;
        break forward_join_107;
    }
    if (!((forwardValue2037_99_0 != 0))) {
        break forward_join_103;
    }
    life8_113 += 1;
    }
    forwardValue2037_107_0 = ((((net.minecraft.world.World)(p0)).a__Boolean(((moom.DT)(((moom.DT)(p2)).c__DT())))) ? 1 : 0);
    }
    if (!((life6_5 != null))) {
        forwardValue2037_115_0 = forwardValue2037_107_0;
        break forward_join_115;
    }
    if (!((forwardValue2037_107_0 != 0))) {
        break forward_join_111;
    }
    life8_113 += 1;
    }
    forwardValue2037_115_0 = ((((net.minecraft.world.World)(p0)).a__Boolean(((moom.DT)(((moom.DT)(p2)).d__DT())))) ? 1 : 0);
    }
    if (!((life6_5 != null))) {
        forwardValue2037_120_0 = forwardValue2037_115_0;
        break forward_join_120;
    }
    if (!((forwardValue2037_115_0 != 0))) {
        break forward_join_119;
    }
    life8_113 += 1;
    }
    forwardValue2037_120_0 = life7_64;
    }
    if (!((life6_5 != null))) {
        forwardValue2037_144_0 = forwardValue2037_120_0;
        break forward_join_144;
    }
    if (!((forwardValue2037_120_0 == 3))) {
        break forward_join_143;
    }
    spill2037_6 = life8_113;
    if (!((life6_5 != null))) {
        forwardValue2037_144_0 = spill2037_6;
        break forward_join_144;
    }
    if (!((spill2037_6 == 1))) {
        break forward_join_143;
    }
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(p2)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(this.c)).a__fE())), ((int)(2)));
    ((net.minecraft.world.World)(p0)).a(((net.minecraft.block.Block)(this.c)), ((moom.DT)(p2)), ((java.util.Random)(p1)));
    }
    forwardValue2037_144_0 = 1;
    }
    return ((forwardValue2037_144_0) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}

}
