package moom;


public class dV extends net.minecraft.block.Block {

public static final moom.fv Q;

public static final moom.fv R;

public static final moom.fv S;

public static final moom.fv T;

private final boolean U;

private static final long W;

protected dV(moom.fn p0, boolean p1) {
super(p0);
    (this).a__Void((((((this.M).a__fE()).a__fE(moom.dV.Q, java.lang.Boolean.FALSE)).a__fE(moom.dV.R, java.lang.Boolean.FALSE)).a__fE(moom.dV.S, java.lang.Boolean.FALSE)).a__fE(moom.dV.T, java.lang.Boolean.FALSE));
    this.U = p1;
    (this).a(net.minecraft.creativetab.CreativeTabs.c);
}


static {
moom.dV.W = (moom._c.a(7410170709283141711L, -259688437189684164L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(27946472341207L);
    moom.dV.Q = moom.fv.a("north");
    moom.dV.R = moom.fv.a("east");
    moom.dV.S = moom.fv.a("south");
    moom.dV.T = moom.fv.a("west");
}


public final boolean b(net.minecraft.block.Block p0) {
net.minecraft.block.Block forwardValue3280_17_0;
    net.minecraft.block.Block forwardValue3280_22_0;
    net.minecraft.block.Block forwardValue3280_27_0;
    int forwardValue3280_32_0;
    int forwardValue3280_34_0;
    boolean spill3280_0;
    net.minecraft.block.Block spill3280_1;
    int spill3280_2;
    long life2_3;
    int[] life4_5;
    forward_join_34: {
    forward_join_33: {
    forward_join_32: {
    forward_join_31: {
    forward_join_27: {
    forward_join_22: {
    forward_join_17: {
    life2_3 = (moom.dV.W ^ 128633592507668L);
    life4_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3280_0 = ((net.minecraft.block.Block)(p0)).a__Boolean();
    if (!((life4_5 != null))) {
        forwardValue3280_32_0 = ((spill3280_0) ? 1 : 0);
        break forward_join_32;
    }
    if (!((!spill3280_0))) {
        break forward_join_31;
    }
    spill3280_1 = p0;
    if (!((life4_5 != null))) {
        forwardValue3280_17_0 = spill3280_1;
        break forward_join_17;
    }
    if (!((spill3280_1 != net.minecraft.init.Blocks.w))) {
        break forward_join_31;
    }
    forwardValue3280_17_0 = p0;
    }
    if (!((life4_5 != null))) {
        forwardValue3280_22_0 = forwardValue3280_17_0;
        break forward_join_22;
    }
    if (!((forwardValue3280_17_0 != net.minecraft.init.Blocks.ck))) {
        break forward_join_31;
    }
    forwardValue3280_22_0 = p0;
    }
    if (!((life4_5 != null))) {
        forwardValue3280_27_0 = forwardValue3280_22_0;
        break forward_join_27;
    }
    if (!((forwardValue3280_22_0 != net.minecraft.init.Blocks.cl))) {
        break forward_join_31;
    }
    forwardValue3280_27_0 = p0;
    }
    spill3280_2 = ((forwardValue3280_27_0 instanceof moom.dV) ? 1 : 0);
    if (!((life4_5 != null))) {
        forwardValue3280_32_0 = spill3280_2;
        break forward_join_32;
    }
    if (!((spill3280_2 != 0))) {
        break forward_join_33;
    }
    }
    forwardValue3280_32_0 = 1;
    }
    forwardValue3280_34_0 = forwardValue3280_32_0;
    break forward_join_34;
    }
    forwardValue3280_34_0 = 0;
    }
    return ((forwardValue3280_34_0) != 0);
}


public int b(net.minecraft.block.state.IBlockState p0) {
return 0;
}


public void a__Void(net.minecraft.world.IBlockAccess p0, moom.DT p1) {
int forwardValue3279_55_0;
    int forwardValue3279_71_0;
    int forwardValue3279_79_0;
    int forwardValue3279_91_0;
    int forwardValue3279_99_0;
    int forwardValue3279_115_0;
    int forwardValue3279_123_0;
    int[] spill3279_0;
    int spill3279_1;
    int spill3279_2;
    int spill3279_3;
    int spill3279_4;
    int spill3279_5;
    int spill3279_6;
    int spill3279_7;
    int spill3279_8;
    int spill3279_9;
    long life3_3;
    float life6_5;
    float life7_8;
    float life8_10;
    float life9_12;
    int life10_20;
    int life11_28;
    int life12_36;
    int[] life5_37;
    int life13_45;
    forward_join_132: {
    forward_join_128: {
    forward_join_123: {
    forward_join_122: {
    forward_join_115: {
    forward_join_114: {
    forward_join_99: {
    forward_join_98: {
    forward_join_91: {
    forward_join_90: {
    forward_join_86: {
    forward_join_79: {
    forward_join_78: {
    forward_join_71: {
    forward_join_70: {
    forward_join_55: {
    forward_join_54: {
    life3_3 = (moom.dV.W ^ 140605228405316L);
    life6_5 = 0x1.cp-2f;
    spill3279_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life7_8 = 0x1.2p-1f;
    life8_10 = 0x1.cp-2f;
    life9_12 = 0x1.2p-1f;
    life10_20 = ((((moom.dV)(this)).b(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).c__DT()))))).a__ch())))) ? 1 : 0);
    life11_28 = ((((moom.dV)(this)).b(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).d__DT()))))).a__ch())))) ? 1 : 0);
    life12_36 = ((((moom.dV)(this)).b(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).e()))))).a__ch())))) ? 1 : 0);
    life5_37 = spill3279_0;
    life13_45 = ((((moom.dV)(this)).b(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).f()))))).a__ch())))) ? 1 : 0);
    spill3279_1 = life12_36;
    if (!((life5_37 != null))) {
        forwardValue3279_55_0 = spill3279_1;
        break forward_join_55;
    }
    if (!((spill3279_1 != 0))) {
        break forward_join_54;
    }
    spill3279_2 = life13_45;
    if (!((life5_37 != null))) {
        forwardValue3279_55_0 = spill3279_2;
        break forward_join_55;
    }
    if (!((spill3279_2 == 0))) {
        break forward_join_86;
    }
    }
    forwardValue3279_55_0 = life12_36;
    }
    if (!((life5_37 != null))) {
        forwardValue3279_71_0 = forwardValue3279_55_0;
        break forward_join_71;
    }
    if (!((forwardValue3279_55_0 == 0))) {
        break forward_join_70;
    }
    spill3279_3 = life13_45;
    if (!((life5_37 != null))) {
        forwardValue3279_71_0 = spill3279_3;
        break forward_join_71;
    }
    if (!((spill3279_3 == 0))) {
        break forward_join_70;
    }
    spill3279_4 = life10_20;
    if (!((life5_37 != null))) {
        forwardValue3279_71_0 = spill3279_4;
        break forward_join_71;
    }
    if (!((spill3279_4 == 0))) {
        break forward_join_70;
    }
    spill3279_5 = life11_28;
    if (!((life5_37 != null))) {
        forwardValue3279_71_0 = spill3279_5;
        break forward_join_71;
    }
    if (!((spill3279_5 != 0))) {
        break forward_join_86;
    }
    }
    forwardValue3279_71_0 = life12_36;
    }
    if (!((life5_37 != null))) {
        forwardValue3279_79_0 = forwardValue3279_71_0;
        break forward_join_79;
    }
    if (!((forwardValue3279_71_0 != 0))) {
        break forward_join_78;
    }
    life6_5 = 0x0.0p0f;
    if (!((life5_37 == null))) {
        break forward_join_90;
    }
    }
    forwardValue3279_79_0 = life13_45;
    }
    if (!((life5_37 != null))) {
        forwardValue3279_91_0 = forwardValue3279_79_0;
        break forward_join_91;
    }
    if (!((forwardValue3279_79_0 != 0))) {
        break forward_join_90;
    }
    life7_8 = 0x1.0p0f;
    if (!((life5_37 == null))) {
        break forward_join_90;
    }
    }
    life6_5 = 0x0.0p0f;
    life7_8 = 0x1.0p0f;
    }
    forwardValue3279_91_0 = life10_20;
    }
    if (!((life5_37 != null))) {
        forwardValue3279_99_0 = forwardValue3279_91_0;
        break forward_join_99;
    }
    if (!((forwardValue3279_91_0 != 0))) {
        break forward_join_98;
    }
    spill3279_6 = life11_28;
    if (!((life5_37 != null))) {
        forwardValue3279_99_0 = spill3279_6;
        break forward_join_99;
    }
    if (!((spill3279_6 == 0))) {
        break forward_join_128;
    }
    }
    forwardValue3279_99_0 = life12_36;
    }
    if (!((life5_37 != null))) {
        forwardValue3279_115_0 = forwardValue3279_99_0;
        break forward_join_115;
    }
    if (!((forwardValue3279_99_0 == 0))) {
        break forward_join_114;
    }
    spill3279_7 = life13_45;
    if (!((life5_37 != null))) {
        forwardValue3279_115_0 = spill3279_7;
        break forward_join_115;
    }
    if (!((spill3279_7 == 0))) {
        break forward_join_114;
    }
    spill3279_8 = life10_20;
    if (!((life5_37 != null))) {
        forwardValue3279_115_0 = spill3279_8;
        break forward_join_115;
    }
    if (!((spill3279_8 == 0))) {
        break forward_join_114;
    }
    spill3279_9 = life11_28;
    if (!((life5_37 != null))) {
        forwardValue3279_115_0 = spill3279_9;
        break forward_join_115;
    }
    if (!((spill3279_9 != 0))) {
        break forward_join_128;
    }
    }
    forwardValue3279_115_0 = life10_20;
    }
    if (!((life5_37 != null))) {
        forwardValue3279_123_0 = forwardValue3279_115_0;
        break forward_join_123;
    }
    if (!((forwardValue3279_115_0 != 0))) {
        break forward_join_122;
    }
    life8_10 = 0x0.0p0f;
    if (!((life5_37 == null))) {
        break forward_join_132;
    }
    }
    forwardValue3279_123_0 = life11_28;
    }
    if (!((forwardValue3279_123_0 != 0))) {
        break forward_join_132;
    }
    life9_12 = 0x1.0p0f;
    if (!((life5_37 == null))) {
        break forward_join_132;
    }
    }
    life8_10 = 0x0.0p0f;
    life9_12 = 0x1.0p0f;
    }
    ((moom.dV)(this)).a(((float)(life6_5)), ((float)(0x0.0p0f)), ((float)(life8_10)), ((float)(life7_8)), ((float)(0x1.0p0f)), ((float)(life9_12)));
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public net.minecraft.util.EnumWorldBlockLayer a__bx() {
return net.minecraft.util.EnumWorldBlockLayer.CUTOUT_MIPPED;
}


protected moom.fA a__fA() {
return new moom.fA(this, new net.minecraft.block.properties.IProperty[] {moom.dV.Q, moom.dV.R, moom.dV.T, moom.dV.S});
}


public net.minecraft.item.Item a(net.minecraft.block.state.IBlockState p0, java.util.Random p1, int p2) {
moom.dV forwardValue3276_14_0;
    net.minecraft.item.Item forwardValue3276_18_0;
    moom.dV spill3276_0;
    long life4_3;
    int[] life6_5;
    forward_join_18: {
    forward_join_14: {
    forward_join_13: {
    life4_3 = (moom.dV.W ^ 39665295116112L);
    life6_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3276_0 = this;
    if (!((life6_5 != null))) {
        forwardValue3276_14_0 = spill3276_0;
        break forward_join_14;
    }
    if (!((!((moom.dV)(spill3276_0)).U))) {
        break forward_join_13;
    }
    forwardValue3276_18_0 = null;
    break forward_join_18;
    }
    forwardValue3276_14_0 = this;
    }
    forwardValue3276_18_0 = __sourceIntrinsic_0611ab0e6a18_call3276_3(forwardValue3276_14_0, p0, p1, p2);
    }
    return forwardValue3276_18_0;
}


public net.minecraft.block.state.IBlockState a(net.minecraft.block.state.IBlockState p0, net.minecraft.world.IBlockAccess p1, moom.DT p2) {
return ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(p0)).a__fE(((net.minecraft.block.properties.IProperty)(moom.dV.Q)), ((java.lang.Comparable)(java.lang.Boolean.valueOf(((boolean)(((moom.dV)(this)).b(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.IBlockAccess)(p1)).a__fE(((moom.DT)(((moom.DT)(p2)).c__DT()))))).a__ch()))))))))))).a__fE(((net.minecraft.block.properties.IProperty)(moom.dV.S)), ((java.lang.Comparable)(java.lang.Boolean.valueOf(((boolean)(((moom.dV)(this)).b(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.IBlockAccess)(p1)).a__fE(((moom.DT)(((moom.DT)(p2)).d__DT()))))).a__ch()))))))))))).a__fE(((net.minecraft.block.properties.IProperty)(moom.dV.T)), ((java.lang.Comparable)(java.lang.Boolean.valueOf(((boolean)(((moom.dV)(this)).b(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.IBlockAccess)(p1)).a__fE(((moom.DT)(((moom.DT)(p2)).e()))))).a__ch()))))))))))).a__fE(((net.minecraft.block.properties.IProperty)(moom.dV.R)), ((java.lang.Comparable)(java.lang.Boolean.valueOf(((boolean)(((moom.dV)(this)).b(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.IBlockAccess)(p1)).a__fE(((moom.DT)(((moom.DT)(p2)).f()))))).a__ch())))))))));
}


public boolean a__Boolean(net.minecraft.world.IBlockAccess p0, moom.DT p1, moom.bs p2) {
int forwardValue3278_21_0;
    int forwardValue3278_23_0;
    boolean spill3278_0;
    long life4_3;
    int[] life6_5;
    forward_join_23: {
    forward_join_22: {
    forward_join_21: {
    life4_3 = (moom.dV.W ^ 74427207332200L);
    life6_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    if (!((((net.minecraft.block.state.IBlockState)(((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(p1))))).a__ch() != this))) {
        break forward_join_22;
    }
    spill3278_0 = super.a__Boolean(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(p1)), ((moom.bs)(p2)));
    if (!((life6_5 != null))) {
        forwardValue3278_21_0 = ((spill3278_0) ? 1 : 0);
        break forward_join_21;
    }
    if (!(spill3278_0)) {
        break forward_join_22;
    }
    forwardValue3278_21_0 = 1;
    }
    forwardValue3278_23_0 = forwardValue3278_21_0;
    break forward_join_23;
    }
    forwardValue3278_23_0 = 0;
    }
    return ((forwardValue3278_23_0) != 0);
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, moom.CA p3, java.util.List<moom.CA> p4, net.minecraft.entity.Entity p5) {
int forwardValue3277_47_0;
    int forwardValue3277_63_0;
    int forwardValue3277_85_0;
    int forwardValue3277_123_0;
    int forwardValue3277_131_0;
    int forwardValue3277_147_0;
    int forwardValue3277_169_0;
    int[] spill3277_0;
    int spill3277_1;
    int spill3277_2;
    int spill3277_3;
    int spill3277_4;
    int spill3277_5;
    int spill3277_6;
    int spill3277_7;
    int spill3277_8;
    int spill3277_9;
    long life7_3;
    int life10_11;
    int life11_20;
    int[] life9_21;
    int life12_29;
    int life13_37;
    forward_join_204: {
    forward_join_188: {
    forward_join_169: {
    forward_join_168: {
    forward_join_147: {
    forward_join_146: {
    forward_join_131: {
    forward_join_130: {
    forward_join_123: {
    forward_join_122: {
    forward_join_106: {
    forward_join_85: {
    forward_join_84: {
    forward_join_63: {
    forward_join_62: {
    forward_join_47: {
    forward_join_46: {
    life7_3 = (moom.dV.W ^ 114806040632676L);
    life10_11 = ((((moom.dV)(this)).b(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).c__DT()))))).a__ch())))) ? 1 : 0);
    spill3277_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life11_20 = ((((moom.dV)(this)).b(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).d__DT()))))).a__ch())))) ? 1 : 0);
    life9_21 = spill3277_0;
    life12_29 = ((((moom.dV)(this)).b(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).e()))))).a__ch())))) ? 1 : 0);
    life13_37 = ((((moom.dV)(this)).b(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).f()))))).a__ch())))) ? 1 : 0);
    spill3277_1 = life12_29;
    if (!((life9_21 != null))) {
        forwardValue3277_47_0 = spill3277_1;
        break forward_join_47;
    }
    if (!((spill3277_1 != 0))) {
        break forward_join_46;
    }
    spill3277_2 = life13_37;
    if (!((life9_21 != null))) {
        forwardValue3277_47_0 = spill3277_2;
        break forward_join_47;
    }
    if (!((spill3277_2 == 0))) {
        break forward_join_106;
    }
    }
    forwardValue3277_47_0 = life12_29;
    }
    if (!((life9_21 != null))) {
        forwardValue3277_63_0 = forwardValue3277_47_0;
        break forward_join_63;
    }
    if (!((forwardValue3277_47_0 == 0))) {
        break forward_join_62;
    }
    spill3277_3 = life13_37;
    if (!((life9_21 != null))) {
        forwardValue3277_63_0 = spill3277_3;
        break forward_join_63;
    }
    if (!((spill3277_3 == 0))) {
        break forward_join_62;
    }
    spill3277_4 = life10_11;
    if (!((life9_21 != null))) {
        forwardValue3277_63_0 = spill3277_4;
        break forward_join_63;
    }
    if (!((spill3277_4 == 0))) {
        break forward_join_62;
    }
    spill3277_5 = life11_20;
    if (!((life9_21 != null))) {
        forwardValue3277_63_0 = spill3277_5;
        break forward_join_63;
    }
    if (!((spill3277_5 != 0))) {
        break forward_join_106;
    }
    }
    forwardValue3277_63_0 = life12_29;
    }
    if (!((life9_21 != null))) {
        forwardValue3277_85_0 = forwardValue3277_63_0;
        break forward_join_85;
    }
    if (!((forwardValue3277_63_0 != 0))) {
        break forward_join_84;
    }
    ((moom.dV)(this)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.cp-2f)), ((float)(0x1.0p-1f)), ((float)(0x1.0p0f)), ((float)(0x1.2p-1f)));
    super.a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((moom.CA)(p3)), ((java.util.List)(p4)), ((net.minecraft.entity.Entity)(p5)));
    if (!((life9_21 == null))) {
        break forward_join_122;
    }
    }
    forwardValue3277_85_0 = life13_37;
    }
    if (!((life9_21 != null))) {
        forwardValue3277_123_0 = forwardValue3277_85_0;
        break forward_join_123;
    }
    if (!((forwardValue3277_85_0 != 0))) {
        break forward_join_122;
    }
    ((moom.dV)(this)).a(((float)(0x1.0p-1f)), ((float)(0x0.0p0f)), ((float)(0x1.cp-2f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.2p-1f)));
    super.a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((moom.CA)(p3)), ((java.util.List)(p4)), ((net.minecraft.entity.Entity)(p5)));
    if (!((life9_21 == null))) {
        break forward_join_122;
    }
    }
    ((moom.dV)(this)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.cp-2f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.2p-1f)));
    super.a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((moom.CA)(p3)), ((java.util.List)(p4)), ((net.minecraft.entity.Entity)(p5)));
    }
    forwardValue3277_123_0 = life10_11;
    }
    if (!((life9_21 != null))) {
        forwardValue3277_131_0 = forwardValue3277_123_0;
        break forward_join_131;
    }
    if (!((forwardValue3277_123_0 != 0))) {
        break forward_join_130;
    }
    spill3277_6 = life11_20;
    if (!((life9_21 != null))) {
        forwardValue3277_131_0 = spill3277_6;
        break forward_join_131;
    }
    if (!((spill3277_6 == 0))) {
        break forward_join_188;
    }
    }
    forwardValue3277_131_0 = life12_29;
    }
    if (!((life9_21 != null))) {
        forwardValue3277_147_0 = forwardValue3277_131_0;
        break forward_join_147;
    }
    if (!((forwardValue3277_131_0 == 0))) {
        break forward_join_146;
    }
    spill3277_7 = life13_37;
    if (!((life9_21 != null))) {
        forwardValue3277_147_0 = spill3277_7;
        break forward_join_147;
    }
    if (!((spill3277_7 == 0))) {
        break forward_join_146;
    }
    spill3277_8 = life10_11;
    if (!((life9_21 != null))) {
        forwardValue3277_147_0 = spill3277_8;
        break forward_join_147;
    }
    if (!((spill3277_8 == 0))) {
        break forward_join_146;
    }
    spill3277_9 = life11_20;
    if (!((life9_21 != null))) {
        forwardValue3277_147_0 = spill3277_9;
        break forward_join_147;
    }
    if (!((spill3277_9 != 0))) {
        break forward_join_188;
    }
    }
    forwardValue3277_147_0 = life10_11;
    }
    if (!((life9_21 != null))) {
        forwardValue3277_169_0 = forwardValue3277_147_0;
        break forward_join_169;
    }
    if (!((forwardValue3277_147_0 != 0))) {
        break forward_join_168;
    }
    ((moom.dV)(this)).a(((float)(0x1.cp-2f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.2p-1f)), ((float)(0x1.0p0f)), ((float)(0x1.0p-1f)));
    super.a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((moom.CA)(p3)), ((java.util.List)(p4)), ((net.minecraft.entity.Entity)(p5)));
    if (!((life9_21 == null))) {
        break forward_join_204;
    }
    }
    forwardValue3277_169_0 = life11_20;
    }
    if (!((forwardValue3277_169_0 != 0))) {
        break forward_join_204;
    }
    ((moom.dV)(this)).a(((float)(0x1.cp-2f)), ((float)(0x0.0p0f)), ((float)(0x1.0p-1f)), ((float)(0x1.2p-1f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    super.a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((moom.CA)(p3)), ((java.util.List)(p4)), ((net.minecraft.entity.Entity)(p5)));
    if (!((life9_21 == null))) {
        break forward_join_204;
    }
    }
    ((moom.dV)(this)).a(((float)(0x1.cp-2f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.2p-1f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    super.a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((moom.CA)(p3)), ((java.util.List)(p4)), ((net.minecraft.entity.Entity)(p5)));
    }
    return;
}


public void a__Void() {
((moom.dV)(this)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    return;
}


protected boolean m() {
return ((1) != 0);
}


public boolean g() {
return ((0) != 0);
}


public boolean j() {
return ((0) != 0);
}


private static native <E extends Throwable> net.minecraft.item.Item __sourceIntrinsic_0611ab0e6a18_call3276_3(moom.dV a0, net.minecraft.block.state.IBlockState a1, java.util.Random a2, int a3) throws E;
}
