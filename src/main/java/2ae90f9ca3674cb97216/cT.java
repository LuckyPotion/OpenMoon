package moom;


public abstract class cT extends net.minecraft.block.Block implements net.minecraft.block.ITileEntityProvider {

private static java.lang.String Q;

private static final long W;

protected cT(moom.fn p0) {
this(p0, (p0).a__fm());
}


protected cT(moom.fn p0, moom.fm p1) {
super(p0, p1);
    this.A = true;
}


static {
W = ((long)(((moom._a)(moom._c.a(((long)(-7747707805203811904L)), ((long)(5901594402479484013L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(91436886723484L)))));
    if ((__sourceExactCall_c05bc3acb05fa3() != null)) {
        __sourceExactCall_bc9945e5814d8c(((java.lang.String)("wxpZfb")));
    }
}


public static void b__sourceReturn_a7421bf54c(java.lang.String p0) {
moom.cT.Q = ((java.lang.String)(p0));
    return;
}


protected boolean b(net.minecraft.world.World p0, moom.DT p1, moom.bs p2) {
long local4 = (moom.cT.W ^ 85914322875345L);
    return ((((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).a(((moom.bs)(p2)))))))).a__ch())).a__fn() == moom.fn.A) ? 1 : 0)) != 0);
}


public static java.lang.String c__String() {
return moom.cT.Q;
}


private static moom.Oo c(moom.Oo p0) {
return p0;
}


protected boolean c(net.minecraft.world.World p0, moom.DT p1) {
int forwardValue3090_39_0;
    int forwardValue3090_41_0;
    boolean spill3090_0;
    boolean spill3090_1;
    boolean spill3090_2;
    boolean spill3090_3;
    long life3_3;
    int[] life5_5;
    forward_join_41: {
    forward_join_40: {
    forward_join_39: {
    forward_join_38: {
    life3_3 = (moom.cT.W ^ 105833229857647L);
    life5_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3090_0 = ((moom.cT)(this)).b(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((moom.bs)(moom.bs.NORTH)));
    if (!((life5_5 != null))) {
        forwardValue3090_39_0 = ((spill3090_0) ? 1 : 0);
        break forward_join_39;
    }
    if (!((!spill3090_0))) {
        break forward_join_38;
    }
    spill3090_1 = ((moom.cT)(this)).b(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((moom.bs)(moom.bs.SOUTH)));
    if (!((life5_5 != null))) {
        forwardValue3090_39_0 = ((spill3090_1) ? 1 : 0);
        break forward_join_39;
    }
    if (!((!spill3090_1))) {
        break forward_join_38;
    }
    spill3090_2 = ((moom.cT)(this)).b(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((moom.bs)(moom.bs.WEST)));
    if (!((life5_5 != null))) {
        forwardValue3090_39_0 = ((spill3090_2) ? 1 : 0);
        break forward_join_39;
    }
    if (!((!spill3090_2))) {
        break forward_join_38;
    }
    spill3090_3 = ((moom.cT)(this)).b(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((moom.bs)(moom.bs.EAST)));
    if (!((life5_5 != null))) {
        forwardValue3090_39_0 = ((spill3090_3) ? 1 : 0);
        break forward_join_39;
    }
    if (!(spill3090_3)) {
        break forward_join_40;
    }
    }
    forwardValue3090_39_0 = 1;
    }
    forwardValue3090_41_0 = forwardValue3090_39_0;
    break forward_join_41;
    }
    forwardValue3090_41_0 = 0;
    }
    return ((forwardValue3090_41_0) != 0);
}


public void c(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
super.c(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)));
    ((net.minecraft.world.World)(p0)).c__Void(((moom.DT)(p1)));
    return;
}


public int c__Int() {
return -1;
}


public boolean a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, int p3, int p4) {
net.minecraft.tileentity.TileEntity forwardValue3089_23_0;
    int forwardValue3089_30_0;
    int forwardValue3089_32_0;
    int[] spill3089_0;
    net.minecraft.tileentity.TileEntity spill3089_1;
    boolean spill3089_2;
    long life6_3;
    int[] life8_13;
    net.minecraft.tileentity.TileEntity life9_17;
    forward_join_32: {
    forward_join_31: {
    forward_join_30: {
    forward_join_23: {
    life6_3 = (moom.cT.W ^ 433703906369L);
    spill3089_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    super.a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((int)(p3)), ((int)(p4)));
    life8_13 = spill3089_0;
    life9_17 = ((net.minecraft.world.World)(p0)).a__B9(((moom.DT)(p1)));
    spill3089_1 = life9_17;
    if (!((life8_13 != null))) {
        forwardValue3089_23_0 = spill3089_1;
        break forward_join_23;
    }
    if (!((spill3089_1 != null))) {
        break forward_join_31;
    }
    forwardValue3089_23_0 = life9_17;
    }
    spill3089_2 = ((net.minecraft.tileentity.TileEntity)(forwardValue3089_23_0)).a__Boolean(((int)(p3)), ((int)(p4)));
    if (!((life8_13 != null))) {
        forwardValue3089_30_0 = ((spill3089_2) ? 1 : 0);
        break forward_join_30;
    }
    if (!(spill3089_2)) {
        break forward_join_31;
    }
    forwardValue3089_30_0 = 1;
    }
    forwardValue3089_32_0 = forwardValue3089_30_0;
    break forward_join_32;
    }
    forwardValue3089_32_0 = 0;
    }
    return ((forwardValue3089_32_0) != 0);
}


private static native java.lang.String __sourceExactCall_c05bc3acb05fa3();
private static native void __sourceExactCall_bc9945e5814d8c(java.lang.String p0);
}
