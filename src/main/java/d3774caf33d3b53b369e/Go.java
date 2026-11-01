package moom;


public class Go extends moom.FY {

private final net.minecraft.block.Block c;

private final boolean d;

private static final long e;

public Go(net.minecraft.block.Block p0, boolean p1) {
super();
    this.c = p0;
    this.d = p1;
}


static {
e = (moom._c.a(7718324730995628698L, 6501131232603426029L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(138241128709607L);
}


public boolean a__Boolean(net.minecraft.world.World p0, java.util.Random p1, moom.DT p2) {
net.minecraft.block.Block forwardValue2034_21_0;
    net.minecraft.block.Block forwardValue2034_30_0;
    net.minecraft.block.Block forwardValue2034_52_0;
    net.minecraft.block.Block forwardValue2034_52_1;
    net.minecraft.block.Block forwardValue2034_62_0;
    net.minecraft.block.Block forwardValue2034_62_1;
    net.minecraft.block.Block forwardValue2034_72_0;
    net.minecraft.block.Block forwardValue2034_72_1;
    net.minecraft.block.Block forwardValue2034_82_0;
    net.minecraft.block.Block forwardValue2034_82_1;
    int forwardValue2034_98_0;
    int forwardValue2034_106_0;
    int forwardValue2034_114_0;
    int forwardValue2034_122_0;
    int forwardValue2034_128_0;
    int forwardValue2034_142_0;
    int forwardValue2034_145_0;
    int forwardValue2034_145_1;
    int forwardValue2034_153_0;
    int forwardValue2034_161_0;
    net.minecraft.block.Block spill2034_0;
    net.minecraft.block.Block spill2034_1;
    net.minecraft.block.Block spill2034_2;
    boolean spill2034_3;
    int spill2034_4;
    int spill2034_5;
    int spill2034_6;
    long life4_3;
    int[] life6_5;
    int life7_48;
    int life8_110;
    forward_join_161: {
    forward_join_160: {
    forward_join_153: {
    forward_join_146: {
    forward_join_145: {
    forward_join_142: {
    forward_join_141: {
    forward_join_128: {
    forward_join_126: {
    forward_join_122: {
    forward_join_118: {
    forward_join_114: {
    forward_join_110: {
    forward_join_106: {
    forward_join_102: {
    forward_join_98: {
    forward_join_94: {
    forward_join_84: {
    forward_join_82: {
    forward_join_76: {
    forward_join_72: {
    forward_join_66: {
    forward_join_62: {
    forward_join_56: {
    forward_join_52: {
    forward_join_46: {
    forward_join_34: {
    forward_join_30: {
    forward_join_21: {
    forward_join_17: {
    life4_3 = (moom.Go.e ^ 48944463661733L);
    life6_5 = moom.FY.b();
    spill2034_0 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p2)).a__DT()))))).a__ch();
    if (!((life6_5 != null))) {
        forwardValue2034_21_0 = spill2034_0;
        break forward_join_21;
    }
    if (!((spill2034_0 != net.minecraft.init.Blocks.aV))) {
        break forward_join_17;
    }
    return ((0) != 0);
    }
    forwardValue2034_21_0 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(p2))))).a__ch();
    }
    if (!((life6_5 != null))) {
        forwardValue2034_30_0 = forwardValue2034_21_0;
        break forward_join_30;
    }
    if (!((((net.minecraft.block.Block)(forwardValue2034_21_0)).a__fn() != moom.fn.a))) {
        break forward_join_34;
    }
    forwardValue2034_30_0 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(p2))))).a__ch();
    }
    if (!((forwardValue2034_30_0 != net.minecraft.init.Blocks.aV))) {
        break forward_join_34;
    }
    return ((0) != 0);
    }
    life7_48 = 0;
    spill2034_1 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p2)).e()))))).a__ch();
    spill2034_2 = net.minecraft.init.Blocks.aV;
    if (!((life6_5 != null))) {
        forwardValue2034_52_0 = spill2034_1;
        forwardValue2034_52_1 = spill2034_2;
        break forward_join_52;
    }
    if (!((spill2034_1 == spill2034_2))) {
        break forward_join_46;
    }
    life7_48 += 1;
    }
    forwardValue2034_52_0 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p2)).f()))))).a__ch();
    forwardValue2034_52_1 = net.minecraft.init.Blocks.aV;
    }
    if (!((life6_5 != null))) {
        forwardValue2034_62_0 = forwardValue2034_52_0;
        forwardValue2034_62_1 = forwardValue2034_52_1;
        break forward_join_62;
    }
    if (!((forwardValue2034_52_0 == forwardValue2034_52_1))) {
        break forward_join_56;
    }
    life7_48 += 1;
    }
    forwardValue2034_62_0 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p2)).c__DT()))))).a__ch();
    forwardValue2034_62_1 = net.minecraft.init.Blocks.aV;
    }
    if (!((life6_5 != null))) {
        forwardValue2034_72_0 = forwardValue2034_62_0;
        forwardValue2034_72_1 = forwardValue2034_62_1;
        break forward_join_72;
    }
    if (!((forwardValue2034_62_0 == forwardValue2034_62_1))) {
        break forward_join_66;
    }
    life7_48 += 1;
    }
    forwardValue2034_72_0 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p2)).d__DT()))))).a__ch();
    forwardValue2034_72_1 = net.minecraft.init.Blocks.aV;
    }
    if (!((life6_5 != null))) {
        forwardValue2034_82_0 = forwardValue2034_72_0;
        forwardValue2034_82_1 = forwardValue2034_72_1;
        break forward_join_82;
    }
    if (!((forwardValue2034_72_0 == forwardValue2034_72_1))) {
        break forward_join_76;
    }
    life7_48 += 1;
    }
    forwardValue2034_82_0 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p2)).b__DT()))))).a__ch();
    forwardValue2034_82_1 = net.minecraft.init.Blocks.aV;
    }
    if (!((forwardValue2034_82_0 == forwardValue2034_82_1))) {
        break forward_join_84;
    }
    life7_48 += 1;
    }
    life8_110 = 0;
    spill2034_3 = ((net.minecraft.world.World)(p0)).a__Boolean(((moom.DT)(((moom.DT)(p2)).e())));
    if (!((life6_5 != null))) {
        forwardValue2034_98_0 = ((spill2034_3) ? 1 : 0);
        break forward_join_98;
    }
    if (!(spill2034_3)) {
        break forward_join_94;
    }
    life8_110 += 1;
    }
    forwardValue2034_98_0 = ((((net.minecraft.world.World)(p0)).a__Boolean(((moom.DT)(((moom.DT)(p2)).f())))) ? 1 : 0);
    }
    if (!((life6_5 != null))) {
        forwardValue2034_106_0 = forwardValue2034_98_0;
        break forward_join_106;
    }
    if (!((forwardValue2034_98_0 != 0))) {
        break forward_join_102;
    }
    life8_110 += 1;
    }
    forwardValue2034_106_0 = ((((net.minecraft.world.World)(p0)).a__Boolean(((moom.DT)(((moom.DT)(p2)).c__DT())))) ? 1 : 0);
    }
    if (!((life6_5 != null))) {
        forwardValue2034_114_0 = forwardValue2034_106_0;
        break forward_join_114;
    }
    if (!((forwardValue2034_106_0 != 0))) {
        break forward_join_110;
    }
    life8_110 += 1;
    }
    forwardValue2034_114_0 = ((((net.minecraft.world.World)(p0)).a__Boolean(((moom.DT)(((moom.DT)(p2)).d__DT())))) ? 1 : 0);
    }
    if (!((life6_5 != null))) {
        forwardValue2034_122_0 = forwardValue2034_114_0;
        break forward_join_122;
    }
    if (!((forwardValue2034_114_0 != 0))) {
        break forward_join_118;
    }
    life8_110 += 1;
    }
    forwardValue2034_122_0 = ((((net.minecraft.world.World)(p0)).a__Boolean(((moom.DT)(((moom.DT)(p2)).b__DT())))) ? 1 : 0);
    }
    if (!((life6_5 != null))) {
        forwardValue2034_128_0 = forwardValue2034_122_0;
        break forward_join_128;
    }
    if (!((forwardValue2034_122_0 != 0))) {
        break forward_join_126;
    }
    life8_110 += 1;
    }
    forwardValue2034_128_0 = ((this.d) ? 1 : 0);
    }
    if (!((life6_5 != null))) {
        forwardValue2034_142_0 = forwardValue2034_128_0;
        break forward_join_142;
    }
    if (!((forwardValue2034_128_0 == 0))) {
        break forward_join_141;
    }
    spill2034_4 = life7_48;
    spill2034_5 = 4;
    if (!((life6_5 != null))) {
        forwardValue2034_145_0 = spill2034_4;
        forwardValue2034_145_1 = spill2034_5;
        break forward_join_145;
    }
    if (!((spill2034_4 == spill2034_5))) {
        break forward_join_141;
    }
    spill2034_6 = life8_110;
    if (!((life6_5 != null))) {
        forwardValue2034_153_0 = spill2034_6;
        break forward_join_153;
    }
    if (!((spill2034_6 != 1))) {
        break forward_join_146;
    }
    }
    forwardValue2034_142_0 = life7_48;
    }
    if (!((life6_5 != null))) {
        forwardValue2034_161_0 = forwardValue2034_142_0;
        break forward_join_161;
    }
    forwardValue2034_145_0 = forwardValue2034_142_0;
    forwardValue2034_145_1 = 5;
    }
    if (!((forwardValue2034_145_0 == forwardValue2034_145_1))) {
        break forward_join_160;
    }
    }
    forwardValue2034_153_0 = ((((net.minecraft.world.World)(p0)).a(((moom.DT)(p2)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(this.c)).a__fE())), ((int)(2)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue2034_153_0);
    ((net.minecraft.world.World)(p0)).a(((net.minecraft.block.Block)(this.c)), ((moom.DT)(p2)), ((java.util.Random)(p1)));
    }
    forwardValue2034_161_0 = 1;
    }
    return ((forwardValue2034_161_0) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}

}
