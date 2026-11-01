package moom;


public class d7 extends net.minecraft.block.Block {

private boolean Q;

private static long R;

public d7(boolean p0) { super((moom.fn)null); }


private static void __sourceConstructorBody_58c55ea90bf75793(moom.d7 receiver, boolean p0) throws Throwable {

net.minecraft.block.Block forwardValue437_19_0;

    int[] spill437_0;

    moom.d7 spill437_1;

    long life2_3;

    int[] life4_8;

    forward_join_20: {

    forward_join_19: {

    life2_3 = (moom.d7.R ^ 34689897667121L);

    spill437_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();

    moom.d7.__sourceConstructorInit_58c55ea90bf75793_0(((moom.d7)(receiver)), ((moom.fn)(moom.fn.t)));

    life4_8 = spill437_0;

    spill437_1 = receiver;

    if (!((life4_8 != null))) {

        forwardValue437_19_0 = spill437_1;

        break forward_join_19;

    }

    ((moom.d7)(spill437_1)).Q = ((boolean)(p0));

    if (!(p0)) {

        break forward_join_20;

    }

    forwardValue437_19_0 = ((moom.d7)(receiver)).a(((float)(0x1.0p0f)));

    }

    recovery.source.CarrierOps.discard(forwardValue437_19_0);

    }

    return;

}



static {
moom.d7.R = (moom._c.a(5270385955330900776L, 8202954422947241780L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(251019869850597L);
}

private static native <E extends Throwable> void __sourceConstructorInit_58c55ea90bf75793_0(moom.d7 a0, moom.fn a1) throws E;

public void b(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, java.util.Random p3) {
int forwardValue3204_13_0;
    int forwardValue3204_19_0;
    int forwardValue3204_28_0;
    boolean spill3204_0;
    long life5_3;
    int[] life7_5;
    forward_join_29: {
    forward_join_28: {
    forward_join_19: {
    forward_join_13: {
    life5_3 = (moom.d7.R ^ 57464745851122L);
    life7_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3204_0 = ((net.minecraft.world.World)(p0)).G;
    if (!((life7_5 != null))) {
        forwardValue3204_13_0 = ((spill3204_0) ? 1 : 0);
        break forward_join_13;
    }
    if (!((!spill3204_0))) {
        break forward_join_29;
    }
    forwardValue3204_13_0 = ((this.Q) ? 1 : 0);
    }
    if (!((life7_5 != null))) {
        forwardValue3204_19_0 = forwardValue3204_13_0;
        break forward_join_19;
    }
    if (!((forwardValue3204_13_0 != 0))) {
        break forward_join_29;
    }
    forwardValue3204_19_0 = ((((net.minecraft.world.World)(p0)).l(((moom.DT)(p1)))) ? 1 : 0);
    }
    if (!((life7_5 != null))) {
        forwardValue3204_28_0 = forwardValue3204_19_0;
        break forward_join_28;
    }
    if (!((forwardValue3204_19_0 == 0))) {
        break forward_join_29;
    }
    forwardValue3204_28_0 = ((((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.by)).a__fE())), ((int)(2)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue3204_28_0);
    }
    return;
}


public void b__Void(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
int forwardValue3205_13_0;
    int forwardValue3205_33_0;
    int forwardValue3205_39_0;
    int forwardValue3205_48_0;
    boolean spill3205_0;
    boolean spill3205_1;
    long life4_3;
    int[] life6_5;
    forward_join_49: {
    forward_join_48: {
    forward_join_39: {
    forward_join_33: {
    forward_join_31: {
    forward_join_13: {
    life4_3 = (moom.d7.R ^ 61924755285811L);
    life6_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3205_0 = ((net.minecraft.world.World)(p0)).G;
    if (!((life6_5 != null))) {
        forwardValue3205_13_0 = ((spill3205_0) ? 1 : 0);
        break forward_join_13;
    }
    if (!((!spill3205_0))) {
        break forward_join_49;
    }
    forwardValue3205_13_0 = ((this.Q) ? 1 : 0);
    }
    if (!((life6_5 != null))) {
        forwardValue3205_33_0 = forwardValue3205_13_0;
        break forward_join_33;
    }
    if (!((forwardValue3205_13_0 != 0))) {
        break forward_join_31;
    }
    spill3205_1 = ((net.minecraft.world.World)(p0)).l(((moom.DT)(p1)));
    if (!((life6_5 != null))) {
        forwardValue3205_33_0 = ((spill3205_1) ? 1 : 0);
        break forward_join_33;
    }
    if (!((!spill3205_1))) {
        break forward_join_31;
    }
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.by)).a__fE())), ((int)(2)));
    if (!((life6_5 == null))) {
        break forward_join_49;
    }
    }
    forwardValue3205_33_0 = ((this.Q) ? 1 : 0);
    }
    if (!((life6_5 != null))) {
        forwardValue3205_39_0 = forwardValue3205_33_0;
        break forward_join_39;
    }
    if (!((forwardValue3205_33_0 == 0))) {
        break forward_join_49;
    }
    forwardValue3205_39_0 = ((((net.minecraft.world.World)(p0)).l(((moom.DT)(p1)))) ? 1 : 0);
    }
    if (!((life6_5 != null))) {
        forwardValue3205_48_0 = forwardValue3205_39_0;
        break forward_join_48;
    }
    if (!((forwardValue3205_39_0 != 0))) {
        break forward_join_49;
    }
    forwardValue3205_48_0 = ((((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bz)).a__fE())), ((int)(2)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue3205_48_0);
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


protected net.minecraft.item.ItemStack a__xW(net.minecraft.block.state.IBlockState p0) {
return new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.by);
}


public net.minecraft.item.Item a__wQ(net.minecraft.world.World p0, moom.DT p1) {
return net.minecraft.item.Item.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.by)));
}


public net.minecraft.item.Item a(net.minecraft.block.state.IBlockState p0, java.util.Random p1, int p2) {
return net.minecraft.item.Item.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.by)));
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.block.Block p3) {
int forwardValue3203_13_0;
    int forwardValue3203_31_0;
    int forwardValue3203_37_0;
    int forwardValue3203_46_0;
    boolean spill3203_0;
    boolean spill3203_1;
    long life5_3;
    int[] life7_5;
    forward_join_47: {
    forward_join_46: {
    forward_join_37: {
    forward_join_31: {
    forward_join_29: {
    forward_join_13: {
    life5_3 = (moom.d7.R ^ 36523145790579L);
    life7_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3203_0 = ((net.minecraft.world.World)(p0)).G;
    if (!((life7_5 != null))) {
        forwardValue3203_13_0 = ((spill3203_0) ? 1 : 0);
        break forward_join_13;
    }
    if (!((!spill3203_0))) {
        break forward_join_47;
    }
    forwardValue3203_13_0 = ((this.Q) ? 1 : 0);
    }
    if (!((life7_5 != null))) {
        forwardValue3203_31_0 = forwardValue3203_13_0;
        break forward_join_31;
    }
    if (!((forwardValue3203_13_0 != 0))) {
        break forward_join_29;
    }
    spill3203_1 = ((net.minecraft.world.World)(p0)).l(((moom.DT)(p1)));
    if (!((life7_5 != null))) {
        forwardValue3203_31_0 = ((spill3203_1) ? 1 : 0);
        break forward_join_31;
    }
    if (!((!spill3203_1))) {
        break forward_join_29;
    }
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.Block)(this)), ((int)(4)));
    if (!((life7_5 == null))) {
        break forward_join_47;
    }
    }
    forwardValue3203_31_0 = ((this.Q) ? 1 : 0);
    }
    if (!((life7_5 != null))) {
        forwardValue3203_37_0 = forwardValue3203_31_0;
        break forward_join_37;
    }
    if (!((forwardValue3203_31_0 == 0))) {
        break forward_join_47;
    }
    forwardValue3203_37_0 = ((((net.minecraft.world.World)(p0)).l(((moom.DT)(p1)))) ? 1 : 0);
    }
    if (!((life7_5 != null))) {
        forwardValue3203_46_0 = forwardValue3203_37_0;
        break forward_join_46;
    }
    if (!((forwardValue3203_37_0 != 0))) {
        break forward_join_47;
    }
    forwardValue3203_46_0 = ((((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bz)).a__fE())), ((int)(2)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue3203_46_0);
    }
    return;
}

}
