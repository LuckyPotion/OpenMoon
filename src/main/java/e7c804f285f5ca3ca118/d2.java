package moom;


public abstract class d2 extends net.minecraft.block.Block {

protected final boolean Q;

private static final long T;

protected d2(boolean p0) {
super(moom.fn.q);
    this.Q = p0;
    (this).a(0x0.0p+0f, 0x0.0p+0f, 0x0.0p+0f, 0x1.0000000000000p+0f, 0x1.0000000000000p-3f, 0x1.0000000000000p+0f);
    (this).a(net.minecraft.creativetab.CreativeTabs.e);
}


static {
T = (moom._c.a(-142860207579700804L, -3189216236653050075L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(21515669396410L);
}


public boolean b__Boolean(net.minecraft.world.World p0, moom.DT p1) {
return (__sourceIntrinsic_booleanComparison((net.minecraft.world.World.a(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(((moom.DT)(p1)).b__DT()))))) != 0);
}


protected void b(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.block.Block p3) {
return;
}


public void b__Void(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
int forwardValue3184_22_0;
    moom.d2 forwardValue3184_24_0;
    boolean spill3184_0;
    moom.d2 spill3184_1;
    long life4_3;
    int[] life6_5;
    forward_join_29: {
    forward_join_24: {
    forward_join_22: {
    life4_3 = (moom.d2.T ^ 68060692478753L);
    life6_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3184_0 = ((net.minecraft.world.World)(p0)).G;
    if (!((life6_5 != null))) {
        forwardValue3184_22_0 = ((spill3184_0) ? 1 : 0);
        break forward_join_22;
    }
    if (!((!spill3184_0))) {
        break forward_join_29;
    }
    p2 = ((moom.d2)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((boolean)(true)));
    spill3184_1 = this;
    if (!((life6_5 != null))) {
        forwardValue3184_24_0 = spill3184_1;
        break forward_join_24;
    }
    forwardValue3184_22_0 = ((((moom.d2)(spill3184_1)).Q) ? 1 : 0);
    }
    if (!((forwardValue3184_22_0 != 0))) {
        break forward_join_29;
    }
    forwardValue3184_24_0 = this;
    }
    ((moom.d2)(forwardValue3184_24_0)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((net.minecraft.block.Block)(this)));
    }
    return;
}


public int e__Int() {
return 0;
}


public void c(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
int forwardValue3185_27_0;
    int[] spill3185_0;
    boolean spill3185_1;
    long life4_3;
    int[] life6_10;
    forward_join_37: {
    forward_join_27: {
    forward_join_25: {
    life4_3 = (moom.d2.T ^ 98952434823811L);
    spill3185_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    super.c(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)));
    life6_10 = spill3185_0;
    spill3185_1 = ((net.minecraft.block.BlockRailBase$EnumRailDirection)(((net.minecraft.block.BlockRailBase$EnumRailDirection)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(((moom.d2)(this)).a__ft()))))))).a__Boolean();
    if (!((life6_10 != null))) {
        forwardValue3185_27_0 = ((spill3185_1) ? 1 : 0);
        break forward_join_27;
    }
    if (!(spill3185_1)) {
        break forward_join_25;
    }
    ((net.minecraft.world.World)(p0)).b(((moom.DT)(((moom.DT)(p1)).a__DT())), ((net.minecraft.block.Block)(this)));
    }
    forwardValue3185_27_0 = ((this.Q) ? 1 : 0);
    }
    if (!((forwardValue3185_27_0 != 0))) {
        break forward_join_37;
    }
    ((net.minecraft.world.World)(p0)).b(((moom.DT)(p1)), ((net.minecraft.block.Block)(this)));
    ((net.minecraft.world.World)(p0)).b(((moom.DT)(((moom.DT)(p1)).b__DT())), ((net.minecraft.block.Block)(this)));
    }
    return;
}


public static boolean c(net.minecraft.world.World p0, moom.DT p1) {
return ((moom.d2.a(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(p1))))))) != 0);
}


protected net.minecraft.block.state.IBlockState a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, boolean p3) {
long local5 = (moom.d2.T ^ 92813644670505L);
    return (((net.minecraft.world.World)(p0)).G ? p2 : ((moom.e8)(((moom.e8)(new moom.e8(this, p0, p1, p2))).a(((boolean)(((net.minecraft.world.World)(p0)).l(((moom.DT)(p1))))), ((boolean)(p3))))).a__fE());
}


public static boolean a__sourceReturn_ca116c2731(net.minecraft.block.state.IBlockState p0) {
net.minecraft.block.Block forwardValue3181_16_0;
    net.minecraft.block.Block forwardValue3181_16_1;
    net.minecraft.block.Block forwardValue3181_21_0;
    net.minecraft.block.Block forwardValue3181_21_1;
    net.minecraft.block.Block forwardValue3181_26_0;
    net.minecraft.block.Block forwardValue3181_26_1;
    int forwardValue3181_30_0;
    int[] spill3181_0;
    net.minecraft.block.Block spill3181_1;
    net.minecraft.block.Block spill3181_2;
    long life1_3;
    net.minecraft.block.Block life4_7;
    int[] life3_8;
    forward_join_30: {
    forward_join_29: {
    forward_join_27: {
    forward_join_26: {
    forward_join_21: {
    forward_join_16: {
    life1_3 = (moom.d2.T ^ 136581381056431L);
    spill3181_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life4_7 = ((net.minecraft.block.state.IBlockState)(p0)).a__ch();
    life3_8 = spill3181_0;
    spill3181_1 = life4_7;
    spill3181_2 = net.minecraft.init.Blocks.av;
    if (!((life3_8 != null))) {
        forwardValue3181_16_0 = spill3181_1;
        forwardValue3181_16_1 = spill3181_2;
        break forward_join_16;
    }
    if (!((spill3181_1 != spill3181_2))) {
        break forward_join_27;
    }
    forwardValue3181_16_0 = life4_7;
    forwardValue3181_16_1 = net.minecraft.init.Blocks.D;
    }
    if (!((life3_8 != null))) {
        forwardValue3181_21_0 = forwardValue3181_16_0;
        forwardValue3181_21_1 = forwardValue3181_16_1;
        break forward_join_21;
    }
    if (!((forwardValue3181_16_0 != forwardValue3181_16_1))) {
        break forward_join_27;
    }
    forwardValue3181_21_0 = life4_7;
    forwardValue3181_21_1 = net.minecraft.init.Blocks.E;
    }
    if (!((life3_8 != null))) {
        forwardValue3181_26_0 = forwardValue3181_21_0;
        forwardValue3181_26_1 = forwardValue3181_21_1;
        break forward_join_26;
    }
    if (!((forwardValue3181_21_0 != forwardValue3181_21_1))) {
        break forward_join_27;
    }
    forwardValue3181_26_0 = life4_7;
    forwardValue3181_26_1 = net.minecraft.init.Blocks.b7;
    }
    if (!((forwardValue3181_26_0 == forwardValue3181_26_1))) {
        break forward_join_29;
    }
    }
    forwardValue3181_30_0 = 1;
    break forward_join_30;
    }
    forwardValue3181_30_0 = 0;
    }
    return ((forwardValue3181_30_0) != 0);
}


public net.minecraft.util.EnumWorldBlockLayer a__bx() {
return net.minecraft.util.EnumWorldBlockLayer.CUTOUT;
}


public moom.CA a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
return null;
}


public abstract net.minecraft.block.properties.IProperty<net.minecraft.block.BlockRailBase$EnumRailDirection> a__ft();

private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a__Void(net.minecraft.world.IBlockAccess p0, moom.DT p1) {
net.minecraft.block.state.IBlockState forwardValue3183_17_0;
    net.minecraft.block.BlockRailBase$EnumRailDirection forwardValue3183_23_0;
    net.minecraft.block.BlockRailBase$EnumRailDirection forwardValue3183_29_0;
    int[] spill3183_0;
    net.minecraft.block.state.IBlockState spill3183_1;
    net.minecraft.block.BlockRailBase$EnumRailDirection spill3183_2;
    long life3_3;
    net.minecraft.block.state.IBlockState life6_8;
    int[] life5_9;
    net.minecraft.block.BlockRailBase$EnumRailDirection life7_29;
    forward_join_49: {
    forward_join_41: {
    forward_join_29: {
    forward_join_23: {
    forward_join_22: {
    forward_join_17: {
    life3_3 = (moom.d2.T ^ 25912325918392L);
    spill3183_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life6_8 = ((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(p1)));
    life5_9 = spill3183_0;
    spill3183_1 = life6_8;
    if (!((life5_9 != null))) {
        forwardValue3183_17_0 = spill3183_1;
        break forward_join_17;
    }
    if (!((((net.minecraft.block.state.IBlockState)(spill3183_1)).a__ch() == this))) {
        break forward_join_22;
    }
    forwardValue3183_17_0 = life6_8;
    }
    forwardValue3183_23_0 = ((net.minecraft.block.BlockRailBase$EnumRailDirection)(((net.minecraft.block.state.IBlockState)(forwardValue3183_17_0)).a(((net.minecraft.block.properties.IProperty)(((moom.d2)(this)).a__ft())))));
    break forward_join_23;
    }
    forwardValue3183_23_0 = null;
    }
    life7_29 = forwardValue3183_23_0;
    spill3183_2 = life7_29;
    if (!((life5_9 != null))) {
        forwardValue3183_29_0 = spill3183_2;
        break forward_join_29;
    }
    if (!((spill3183_2 != null))) {
        break forward_join_41;
    }
    forwardValue3183_29_0 = life7_29;
    }
    if (!(((net.minecraft.block.BlockRailBase$EnumRailDirection)(forwardValue3183_29_0)).a__Boolean())) {
        break forward_join_41;
    }
    ((moom.d2)(this)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.4p-1f)), ((float)(0x1.0p0f)));
    if (!((life5_9 == null))) {
        break forward_join_49;
    }
    }
    ((moom.d2)(this)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p-3f)), ((float)(0x1.0p0f)));
    }
    return;
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.block.Block p3) {
int forwardValue3182_23_0;
    int forwardValue3182_25_0;
    int forwardValue3182_39_0;
    net.minecraft.block.BlockRailBase$EnumRailDirection forwardValue3182_44_0;
    net.minecraft.block.BlockRailBase$EnumRailDirection forwardValue3182_44_1;
    int forwardValue3182_55_0;
    net.minecraft.block.BlockRailBase$EnumRailDirection forwardValue3182_60_0;
    net.minecraft.block.BlockRailBase$EnumRailDirection forwardValue3182_60_1;
    int forwardValue3182_71_0;
    net.minecraft.block.BlockRailBase$EnumRailDirection forwardValue3182_76_0;
    net.minecraft.block.BlockRailBase$EnumRailDirection forwardValue3182_76_1;
    int forwardValue3182_87_0;
    int forwardValue3182_99_0;
    boolean spill3182_0;
    net.minecraft.block.BlockRailBase$EnumRailDirection spill3182_1;
    net.minecraft.block.BlockRailBase$EnumRailDirection spill3182_2;
    boolean spill3182_3;
    boolean spill3182_4;
    boolean spill3182_5;
    boolean spill3182_6;
    long life5_3;
    int[] life7_5;
    net.minecraft.block.BlockRailBase$EnumRailDirection life8_14;
    int life9_28;
    forward_join_108: {
    forward_join_102: {
    forward_join_99: {
    forward_join_87: {
    forward_join_86: {
    forward_join_76: {
    forward_join_74: {
    forward_join_71: {
    forward_join_60: {
    forward_join_58: {
    forward_join_55: {
    forward_join_44: {
    forward_join_42: {
    forward_join_39: {
    forward_join_25: {
    forward_join_24: {
    forward_join_23: {
    life5_3 = (moom.d2.T ^ 40135719573601L);
    life7_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    if (!((!((net.minecraft.world.World)(p0)).G))) {
        break forward_join_108;
    }
    life8_14 = ((net.minecraft.block.BlockRailBase$EnumRailDirection)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(((moom.d2)(this)).a__ft())))));
    spill3182_0 = net.minecraft.world.World.a(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(((moom.DT)(p1)).b__DT())));
    if (!((life7_5 != null))) {
        forwardValue3182_23_0 = ((spill3182_0) ? 1 : 0);
        break forward_join_23;
    }
    if (!((!spill3182_0))) {
        break forward_join_24;
    }
    forwardValue3182_23_0 = 1;
    }
    forwardValue3182_25_0 = forwardValue3182_23_0;
    break forward_join_25;
    }
    forwardValue3182_25_0 = 0;
    }
    life9_28 = forwardValue3182_25_0;
    spill3182_1 = life8_14;
    spill3182_2 = net.minecraft.block.BlockRailBase$EnumRailDirection.ASCENDING_EAST;
    if (!((life7_5 != null))) {
        forwardValue3182_44_0 = spill3182_1;
        forwardValue3182_44_1 = spill3182_2;
        break forward_join_44;
    }
    if (!((spill3182_1 == spill3182_2))) {
        break forward_join_42;
    }
    spill3182_3 = net.minecraft.world.World.a(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(((moom.DT)(p1)).f())));
    if (!((life7_5 != null))) {
        forwardValue3182_39_0 = ((spill3182_3) ? 1 : 0);
        break forward_join_39;
    }
    if (!((!spill3182_3))) {
        break forward_join_42;
    }
    forwardValue3182_39_0 = 1;
    }
    life9_28 = forwardValue3182_39_0;
    if (!((life7_5 == null))) {
        break forward_join_86;
    }
    }
    forwardValue3182_44_0 = life8_14;
    forwardValue3182_44_1 = net.minecraft.block.BlockRailBase$EnumRailDirection.ASCENDING_WEST;
    }
    if (!((life7_5 != null))) {
        forwardValue3182_60_0 = forwardValue3182_44_0;
        forwardValue3182_60_1 = forwardValue3182_44_1;
        break forward_join_60;
    }
    if (!((forwardValue3182_44_0 == forwardValue3182_44_1))) {
        break forward_join_58;
    }
    spill3182_4 = net.minecraft.world.World.a(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(((moom.DT)(p1)).e())));
    if (!((life7_5 != null))) {
        forwardValue3182_55_0 = ((spill3182_4) ? 1 : 0);
        break forward_join_55;
    }
    if (!((!spill3182_4))) {
        break forward_join_58;
    }
    forwardValue3182_55_0 = 1;
    }
    life9_28 = forwardValue3182_55_0;
    if (!((life7_5 == null))) {
        break forward_join_86;
    }
    }
    forwardValue3182_60_0 = life8_14;
    forwardValue3182_60_1 = net.minecraft.block.BlockRailBase$EnumRailDirection.ASCENDING_NORTH;
    }
    if (!((life7_5 != null))) {
        forwardValue3182_76_0 = forwardValue3182_60_0;
        forwardValue3182_76_1 = forwardValue3182_60_1;
        break forward_join_76;
    }
    if (!((forwardValue3182_60_0 == forwardValue3182_60_1))) {
        break forward_join_74;
    }
    spill3182_5 = net.minecraft.world.World.a(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(((moom.DT)(p1)).c__DT())));
    if (!((life7_5 != null))) {
        forwardValue3182_71_0 = ((spill3182_5) ? 1 : 0);
        break forward_join_71;
    }
    if (!((!spill3182_5))) {
        break forward_join_74;
    }
    forwardValue3182_71_0 = 1;
    }
    life9_28 = forwardValue3182_71_0;
    if (!((life7_5 == null))) {
        break forward_join_86;
    }
    }
    forwardValue3182_76_0 = life8_14;
    forwardValue3182_76_1 = net.minecraft.block.BlockRailBase$EnumRailDirection.ASCENDING_SOUTH;
    }
    if (!((forwardValue3182_76_0 == forwardValue3182_76_1))) {
        break forward_join_86;
    }
    spill3182_6 = net.minecraft.world.World.a(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(((moom.DT)(p1)).d__DT())));
    if (!((life7_5 != null))) {
        forwardValue3182_87_0 = ((spill3182_6) ? 1 : 0);
        break forward_join_87;
    }
    if (!((!spill3182_6))) {
        break forward_join_86;
    }
    life9_28 = 1;
    }
    forwardValue3182_87_0 = life9_28;
    }
    if (!((life7_5 != null))) {
        forwardValue3182_99_0 = forwardValue3182_87_0;
        break forward_join_99;
    }
    if (!((forwardValue3182_87_0 != 0))) {
        break forward_join_102;
    }
    ((moom.d2)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((int)(0)));
    forwardValue3182_99_0 = ((((net.minecraft.world.World)(p0)).d__Boolean(((moom.DT)(p1)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue3182_99_0);
    if (!((life7_5 == null))) {
        break forward_join_108;
    }
    }
    ((moom.d2)(this)).b(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((net.minecraft.block.Block)(p3)));
    }
    return;
}


public net.minecraft.util.MovingObjectPosition a(net.minecraft.world.World p0, moom.DT p1, moom.DR p2, moom.DR p3) {
((moom.d2)(this)).a__Void(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(p1)));
    return super.a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((moom.DR)(p2)), ((moom.DR)(p3)));
}


public boolean g() {
return ((0) != 0);
}


public boolean j() {
return ((0) != 0);
}


private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
