package moom;


public abstract class F0 extends moom.FY {

private static final long p;

public F0(boolean p0) {
super(p0);
}


static {
p = (moom._c.a(-4800354220967690792L, 5812494763308883716L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(5166251249507L);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


protected void a(net.minecraft.world.World p0, moom.DT p1) {
long local3 = (moom.F0.p ^ 34780887204236L);
    if ((((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(p1))))).a__ch() != net.minecraft.init.Blocks.d)) {
        ((moom.F0)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.d)).a__fE())));
    }
    return;
}


public void a(net.minecraft.world.World p0, java.util.Random p1, moom.DT p2) {
return;
}


protected boolean a(net.minecraft.block.Block p0) {
moom.fn forwardValue1853_16_0;
    moom.fn forwardValue1853_16_1;
    net.minecraft.block.Block forwardValue1853_24_0;
    net.minecraft.block.Block forwardValue1853_24_1;
    net.minecraft.block.Block forwardValue1853_29_0;
    net.minecraft.block.Block forwardValue1853_29_1;
    net.minecraft.block.Block forwardValue1853_34_0;
    net.minecraft.block.Block forwardValue1853_34_1;
    net.minecraft.block.Block forwardValue1853_39_0;
    net.minecraft.block.Block forwardValue1853_39_1;
    net.minecraft.block.Block forwardValue1853_44_0;
    net.minecraft.block.Block forwardValue1853_44_1;
    int forwardValue1853_48_0;
    int[] spill1853_0;
    moom.fn spill1853_1;
    moom.fn spill1853_2;
    net.minecraft.block.Block spill1853_3;
    moom.dC spill1853_4;
    long life2_3;
    moom.fn life5_7;
    int[] life4_8;
    forward_join_48: {
    forward_join_47: {
    forward_join_45: {
    forward_join_44: {
    forward_join_39: {
    forward_join_34: {
    forward_join_29: {
    forward_join_24: {
    forward_join_16: {
    life2_3 = (moom.F0.p ^ 126296592707004L);
    spill1853_0 = moom.FY.b();
    life5_7 = ((net.minecraft.block.Block)(p0)).a__fn();
    life4_8 = spill1853_0;
    spill1853_1 = life5_7;
    spill1853_2 = moom.fn.a;
    if (!((life4_8 != null))) {
        forwardValue1853_16_0 = spill1853_1;
        forwardValue1853_16_1 = spill1853_2;
        break forward_join_16;
    }
    if (!((spill1853_1 != spill1853_2))) {
        break forward_join_45;
    }
    forwardValue1853_16_0 = life5_7;
    forwardValue1853_16_1 = moom.fn.j;
    }
    if (!((forwardValue1853_16_0 != forwardValue1853_16_1))) {
        break forward_join_45;
    }
    spill1853_3 = p0;
    spill1853_4 = net.minecraft.init.Blocks.c;
    if (!((life4_8 != null))) {
        forwardValue1853_24_0 = spill1853_3;
        forwardValue1853_24_1 = spill1853_4;
        break forward_join_24;
    }
    if (!((spill1853_3 != spill1853_4))) {
        break forward_join_45;
    }
    forwardValue1853_24_0 = p0;
    forwardValue1853_24_1 = net.minecraft.init.Blocks.d;
    }
    if (!((life4_8 != null))) {
        forwardValue1853_29_0 = forwardValue1853_24_0;
        forwardValue1853_29_1 = forwardValue1853_24_1;
        break forward_join_29;
    }
    if (!((forwardValue1853_24_0 != forwardValue1853_24_1))) {
        break forward_join_45;
    }
    forwardValue1853_29_0 = p0;
    forwardValue1853_29_1 = net.minecraft.init.Blocks.r;
    }
    if (!((life4_8 != null))) {
        forwardValue1853_34_0 = forwardValue1853_29_0;
        forwardValue1853_34_1 = forwardValue1853_29_1;
        break forward_join_34;
    }
    if (!((forwardValue1853_29_0 != forwardValue1853_29_1))) {
        break forward_join_45;
    }
    forwardValue1853_34_0 = p0;
    forwardValue1853_34_1 = net.minecraft.init.Blocks.s;
    }
    if (!((life4_8 != null))) {
        forwardValue1853_39_0 = forwardValue1853_34_0;
        forwardValue1853_39_1 = forwardValue1853_34_1;
        break forward_join_39;
    }
    if (!((forwardValue1853_34_0 != forwardValue1853_34_1))) {
        break forward_join_45;
    }
    forwardValue1853_39_0 = p0;
    forwardValue1853_39_1 = net.minecraft.init.Blocks.g;
    }
    if (!((life4_8 != null))) {
        forwardValue1853_44_0 = forwardValue1853_39_0;
        forwardValue1853_44_1 = forwardValue1853_39_1;
        break forward_join_44;
    }
    if (!((forwardValue1853_39_0 != forwardValue1853_39_1))) {
        break forward_join_45;
    }
    forwardValue1853_44_0 = p0;
    forwardValue1853_44_1 = net.minecraft.init.Blocks.bc;
    }
    if (!((forwardValue1853_44_0 == forwardValue1853_44_1))) {
        break forward_join_47;
    }
    }
    forwardValue1853_48_0 = 1;
    break forward_join_48;
    }
    forwardValue1853_48_0 = 0;
    }
    return ((forwardValue1853_48_0) != 0);
}

}
