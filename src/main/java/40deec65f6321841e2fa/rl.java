package moom;


class rl extends moom.rd {

private final moom.rd c;

private static final long d;

rl() {
super();
    this.c = new moom.rd();
}


static {
d = (moom._c.a(-6436914279102688275L, 5501305796112306369L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(14764163443009L);
}


public net.minecraft.item.ItemStack b(moom.ry p0, net.minecraft.item.ItemStack p1) {
int forwardValue3926_52_0;
    int forwardValue3926_57_0;
    int forwardValue3926_65_0;
    int forwardValue3926_103_0;
    boolean spill3926_0;
    boolean spill3926_1;
    int spill3926_2;
    int spill3926_3;
    int spill3926_4;
    long life3_3;
    net.minecraft.world.World life6_7;
    int life5_8;
    moom.DT life7_15;
    net.minecraft.block.state.IBlockState life8_19;
    net.minecraft.block.Block life9_22;
    moom.fn life10_25;
    net.minecraft.item.Item life11_61;
    forward_join_113: {
    forward_join_103: {
    forward_join_95: {
    forward_join_73: {
    forward_join_71: {
    forward_join_66: {
    forward_join_65: {
    forward_join_57: {
    forward_join_52: {
    forward_join_49: {
    life3_3 = (moom.rl.d ^ 36854527420416L);
    spill3926_0 = moom.v5.b__Boolean();
    life6_7 = ((moom.ry)(p0)).a__Eu();
    life5_8 = ((spill3926_0) ? 1 : 0);
    life7_15 = ((moom.DT)(((moom.ry)(p0)).a__DT())).a(((moom.bs)(__sourceExactCall_b9f266c58b58a2(((int)(((moom.ry)(p0)).a__Int()))))));
    life8_19 = ((net.minecraft.world.World)(life6_7)).a__fE(((moom.DT)(life7_15)));
    life9_22 = ((net.minecraft.block.state.IBlockState)(life8_19)).a__ch();
    life10_25 = ((net.minecraft.block.Block)(life9_22)).a__fn();
    spill3926_1 = ((java.lang.Object)(moom.fn.h)).equals(((java.lang.Object)(life10_25)));
    if (!((life5_8 != 0))) {
        forwardValue3926_52_0 = ((spill3926_1) ? 1 : 0);
        break forward_join_52;
    }
    if (!(spill3926_1)) {
        break forward_join_49;
    }
    spill3926_2 = ((life9_22 instanceof net.minecraft.block.BlockLiquid) ? 1 : 0);
    if (!((life5_8 != 0))) {
        forwardValue3926_52_0 = spill3926_2;
        break forward_join_52;
    }
    if (!((spill3926_2 != 0))) {
        break forward_join_49;
    }
    spill3926_3 = ((java.lang.Integer)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(life8_19)).a(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockLiquid.Q))))))).intValue();
    if (!((life5_8 != 0))) {
        forwardValue3926_52_0 = spill3926_3;
        break forward_join_52;
    }
    if (!((spill3926_3 == 0))) {
        break forward_join_49;
    }
    life11_61 = net.minecraft.init.Items.ax;
    if (!((life5_8 == 0))) {
        break forward_join_73;
    }
    }
    forwardValue3926_52_0 = ((((java.lang.Object)(moom.fn.i)).equals(((java.lang.Object)(life10_25)))) ? 1 : 0);
    }
    if (!((life5_8 != 0))) {
        forwardValue3926_57_0 = forwardValue3926_52_0;
        break forward_join_57;
    }
    if (!((forwardValue3926_52_0 != 0))) {
        break forward_join_66;
    }
    forwardValue3926_57_0 = ((life9_22 instanceof net.minecraft.block.BlockLiquid) ? 1 : 0);
    }
    if (!((life5_8 != 0))) {
        forwardValue3926_65_0 = forwardValue3926_57_0;
        break forward_join_65;
    }
    if (!((forwardValue3926_57_0 != 0))) {
        break forward_join_66;
    }
    forwardValue3926_65_0 = ((java.lang.Integer)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(life8_19)).a(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockLiquid.Q))))))).intValue();
    }
    if (!((forwardValue3926_65_0 != 0))) {
        break forward_join_71;
    }
    }
    return super.b(((moom.ry)(p0)), ((net.minecraft.item.ItemStack)(p1)));
    }
    life11_61 = net.minecraft.init.Items.ay;
    }
    ((net.minecraft.world.World)(life6_7)).d__Boolean(((moom.DT)(life7_15)));
    net.minecraft.item.ItemStack __stackOp3926_31_0 = p1;
    net.minecraft.item.ItemStack __stackOp3926_33_0 = __stackOp3926_31_0;
    int __stackOp3926_33_1 = (((net.minecraft.item.ItemStack)(__stackOp3926_31_0)).b - 1);
    spill3926_4 = __stackOp3926_33_1;
    ((net.minecraft.item.ItemStack)(__stackOp3926_33_0)).b = ((int)(__stackOp3926_33_1));
    if (!((life5_8 != 0))) {
        forwardValue3926_103_0 = spill3926_4;
        break forward_join_103;
    }
    if (!((spill3926_4 == 0))) {
        break forward_join_95;
    }
    ((net.minecraft.item.ItemStack)(p1)).a(((net.minecraft.item.Item)(life11_61)));
    ((net.minecraft.item.ItemStack)(p1)).b = ((int)(1));
    if (!((life5_8 == 0))) {
        break forward_join_113;
    }
    }
    forwardValue3926_103_0 = ((moom.Cm)(((moom.Cm)(((moom.ry)(p0)).a__B9())))).a(((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(life11_61))));
    }
    if (!((forwardValue3926_103_0 < 0))) {
        break forward_join_113;
    }
    ((moom.rd)(this.c)).a(((moom.ry)(p0)), ((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(life11_61))));
    }
    return p1;
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


private static native moom.bs __sourceExactCall_b9f266c58b58a2(int p0);
}
