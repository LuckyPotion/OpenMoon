package moom;


public class dz extends net.minecraft.block.Block {

public static final moom.fv Q;

public static final moom.fv R;

public static final moom.fv S;

public static final moom.fv T;

private static final long U;

public dz(moom.fn p0) {
this(p0, (p0).a__fm());
}


public dz(moom.fn p0, moom.fm p1) {
super(p0, p1);
    (this).a__Void((((((this.M).a__fE()).a__fE(moom.dz.Q, java.lang.Boolean.FALSE)).a__fE(moom.dz.R, java.lang.Boolean.FALSE)).a__fE(moom.dz.S, java.lang.Boolean.FALSE)).a__fE(moom.dz.T, java.lang.Boolean.FALSE));
    (this).a(net.minecraft.creativetab.CreativeTabs.c);
}


static {
U = (moom._c.a(-7576407006709840224L, 4639885722846733421L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(8226166116094L);
    Q = moom.fv.a("north");
    R = moom.fv.a("east");
    S = moom.fv.a("south");
    T = moom.fv.a("west");
}


public int b(net.minecraft.block.state.IBlockState p0) {
return 0;
}


public boolean b__sourceReturn_b38f36a0de(net.minecraft.world.IBlockAccess p0, moom.DT p1) {
net.minecraft.block.Block forwardValue368_17_0;
    net.minecraft.block.Block forwardValue368_29_0;
    int forwardValue368_30_0;
    int forwardValue368_43_0;
    net.minecraft.block.Block forwardValue368_45_0;
    int forwardValue368_49_0;
    int forwardValue368_51_0;
    int[] spill368_0;
    net.minecraft.block.Block spill368_1;
    int spill368_2;
    net.minecraft.block.Block spill368_3;
    boolean spill368_4;
    net.minecraft.block.Block spill368_5;
    long life3_3;
    net.minecraft.block.Block life6_9;
    int[] life5_10;
    forward_join_51: {
    forward_join_50: {
    forward_join_49: {
    forward_join_48: {
    forward_join_45: {
    forward_join_43: {
    forward_join_30: {
    forward_join_29: {
    forward_join_28: {
    forward_join_17: {
    life3_3 = (moom.dz.U ^ 5223656647764L);
    spill368_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life6_9 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(p1))))).a__ch();
    life5_10 = spill368_0;
    spill368_1 = life6_9;
    if (!((life5_10 != null))) {
        forwardValue368_17_0 = spill368_1;
        break forward_join_17;
    }
    if (!((spill368_1 != net.minecraft.init.Blocks.b_))) {
        break forward_join_50;
    }
    forwardValue368_17_0 = life6_9;
    }
    spill368_2 = ((forwardValue368_17_0 instanceof moom.dz) ? 1 : 0);
    if (!((life5_10 != null))) {
        forwardValue368_30_0 = spill368_2;
        break forward_join_30;
    }
    if (!((spill368_2 != 0))) {
        break forward_join_28;
    }
    spill368_3 = life6_9;
    if (!((life5_10 != null))) {
        forwardValue368_29_0 = spill368_3;
        break forward_join_29;
    }
    if (!((((net.minecraft.block.Block)(spill368_3)).J != ((moom.dz)(this)).J))) {
        break forward_join_48;
    }
    }
    forwardValue368_29_0 = life6_9;
    }
    forwardValue368_30_0 = ((forwardValue368_29_0 instanceof moom.dk) ? 1 : 0);
    }
    if (!((life5_10 != null))) {
        forwardValue368_49_0 = forwardValue368_30_0;
        break forward_join_49;
    }
    if (!((forwardValue368_30_0 == 0))) {
        break forward_join_48;
    }
    spill368_4 = ((moom.fn)(((net.minecraft.block.Block)(life6_9)).J)).g__Boolean();
    if (!((life5_10 != null))) {
        forwardValue368_43_0 = ((spill368_4) ? 1 : 0);
        break forward_join_43;
    }
    if (!(spill368_4)) {
        break forward_join_50;
    }
    spill368_5 = life6_9;
    if (!((life5_10 != null))) {
        forwardValue368_45_0 = spill368_5;
        break forward_join_45;
    }
    forwardValue368_43_0 = ((((net.minecraft.block.Block)(spill368_5)).g()) ? 1 : 0);
    }
    if (!((forwardValue368_43_0 != 0))) {
        break forward_join_50;
    }
    forwardValue368_45_0 = life6_9;
    }
    if (!((((net.minecraft.block.Block)(forwardValue368_45_0)).J != moom.fn.C))) {
        break forward_join_50;
    }
    }
    forwardValue368_49_0 = 1;
    }
    forwardValue368_51_0 = forwardValue368_49_0;
    break forward_join_51;
    }
    forwardValue368_51_0 = 0;
    }
    return ((forwardValue368_51_0) != 0);
}


public boolean a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.entity.player.EntityPlayer p3, moom.bs p4, float p5, float p6, float p7) {
int forwardValue366_19_0;
    int forwardValue366_21_0;
    boolean spill366_0;
    boolean spill366_1;
    long life9_3;
    int[] life11_5;
    forward_join_21: {
    forward_join_20: {
    forward_join_19: {
    forward_join_18: {
    life9_3 = (moom.dz.U ^ 125362011600373L);
    life11_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill366_0 = ((net.minecraft.world.World)(p0)).G;
    if (!((life11_5 != null))) {
        forwardValue366_19_0 = ((spill366_0) ? 1 : 0);
        break forward_join_19;
    }
    if (!((!spill366_0))) {
        break forward_join_18;
    }
    spill366_1 = moom.xx.a(((net.minecraft.entity.player.EntityPlayer)(p3)), ((net.minecraft.world.World)(p0)), ((moom.DT)(p1)));
    if (!((life11_5 != null))) {
        forwardValue366_19_0 = ((spill366_1) ? 1 : 0);
        break forward_join_19;
    }
    if (!(spill366_1)) {
        break forward_join_20;
    }
    }
    forwardValue366_19_0 = 1;
    }
    forwardValue366_21_0 = forwardValue366_19_0;
    break forward_join_21;
    }
    forwardValue366_21_0 = 0;
    }
    return ((forwardValue366_21_0) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public net.minecraft.block.state.IBlockState a(net.minecraft.block.state.IBlockState p0, net.minecraft.world.IBlockAccess p1, moom.DT p2) {
return ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(p0)).a__fE(((net.minecraft.block.properties.IProperty)(moom.dz.Q)), ((java.lang.Comparable)(java.lang.Boolean.valueOf(((boolean)(((moom.dz)(this)).b__sourceReturn_b38f36a0de(((net.minecraft.world.IBlockAccess)(p1)), ((moom.DT)(((moom.DT)(p2)).c__DT()))))))))))).a__fE(((net.minecraft.block.properties.IProperty)(moom.dz.R)), ((java.lang.Comparable)(java.lang.Boolean.valueOf(((boolean)(((moom.dz)(this)).b__sourceReturn_b38f36a0de(((net.minecraft.world.IBlockAccess)(p1)), ((moom.DT)(((moom.DT)(p2)).f()))))))))))).a__fE(((net.minecraft.block.properties.IProperty)(moom.dz.S)), ((java.lang.Comparable)(java.lang.Boolean.valueOf(((boolean)(((moom.dz)(this)).b__sourceReturn_b38f36a0de(((net.minecraft.world.IBlockAccess)(p1)), ((moom.DT)(((moom.DT)(p2)).d__DT()))))))))))).a__fE(((net.minecraft.block.properties.IProperty)(moom.dz.T)), ((java.lang.Comparable)(java.lang.Boolean.valueOf(((boolean)(((moom.dz)(this)).b__sourceReturn_b38f36a0de(((net.minecraft.world.IBlockAccess)(p1)), ((moom.DT)(((moom.DT)(p2)).e())))))))));
}


protected moom.fA a__fA() {
return new moom.fA(this, new net.minecraft.block.properties.IProperty[] {moom.dz.Q, moom.dz.R, moom.dz.T, moom.dz.S});
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, moom.CA p3, java.util.List<moom.CA> p4, net.minecraft.entity.Entity p5) {
int forwardValue365_45_0;
    int forwardValue365_51_0;
    int forwardValue365_55_0;
    int forwardValue365_79_0;
    int forwardValue365_85_0;
    int forwardValue365_91_0;
    int forwardValue365_95_0;
    int forwardValue365_99_0;
    int forwardValue365_123_0;
    int forwardValue365_129_0;
    int[] spill365_0;
    int spill365_1;
    int spill365_2;
    long life7_3;
    int life10_10;
    int[] life9_11;
    int life11_17;
    int life12_23;
    int life13_29;
    float life14_31;
    float life15_33;
    float life16_35;
    float life17_37;
    forward_join_132: {
    forward_join_129: {
    forward_join_128: {
    forward_join_123: {
    forward_join_122: {
    forward_join_106: {
    forward_join_99: {
    forward_join_95: {
    forward_join_91: {
    forward_join_90: {
    forward_join_85: {
    forward_join_84: {
    forward_join_79: {
    forward_join_74: {
    forward_join_58: {
    forward_join_55: {
    forward_join_51: {
    forward_join_50: {
    forward_join_45: {
    forward_join_44: {
    life7_3 = (moom.dz.U ^ 38632460511514L);
    spill365_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life10_10 = ((((moom.dz)(this)).b__sourceReturn_b38f36a0de(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(((moom.DT)(p1)).c__DT())))) ? 1 : 0);
    life9_11 = spill365_0;
    life11_17 = ((((moom.dz)(this)).b__sourceReturn_b38f36a0de(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(((moom.DT)(p1)).d__DT())))) ? 1 : 0);
    life12_23 = ((((moom.dz)(this)).b__sourceReturn_b38f36a0de(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(((moom.DT)(p1)).e())))) ? 1 : 0);
    life13_29 = ((((moom.dz)(this)).b__sourceReturn_b38f36a0de(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(((moom.DT)(p1)).f())))) ? 1 : 0);
    life14_31 = 0x1.8p-2f;
    life15_33 = 0x1.4p-1f;
    life16_35 = 0x1.8p-2f;
    life17_37 = 0x1.4p-1f;
    spill365_1 = life10_10;
    if (!((life9_11 != null))) {
        forwardValue365_45_0 = spill365_1;
        break forward_join_45;
    }
    if (!((spill365_1 != 0))) {
        break forward_join_44;
    }
    life16_35 = 0x0.0p0f;
    }
    forwardValue365_45_0 = life11_17;
    }
    if (!((life9_11 != null))) {
        forwardValue365_51_0 = forwardValue365_45_0;
        break forward_join_51;
    }
    if (!((forwardValue365_45_0 != 0))) {
        break forward_join_50;
    }
    life17_37 = 0x1.0p0f;
    }
    forwardValue365_51_0 = life10_10;
    }
    if (!((life9_11 != null))) {
        forwardValue365_55_0 = forwardValue365_51_0;
        break forward_join_55;
    }
    if (!((forwardValue365_51_0 == 0))) {
        break forward_join_58;
    }
    forwardValue365_55_0 = life11_17;
    }
    if (!((life9_11 != null))) {
        forwardValue365_79_0 = forwardValue365_55_0;
        break forward_join_79;
    }
    if (!((forwardValue365_55_0 != 0))) {
        break forward_join_74;
    }
    }
    ((moom.dz)(this)).a(((float)(life14_31)), ((float)(0x0.0p0f)), ((float)(life16_35)), ((float)(life15_33)), ((float)(0x1.8p0f)), ((float)(life17_37)));
    super.a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((moom.CA)(p3)), ((java.util.List)(p4)), ((net.minecraft.entity.Entity)(p5)));
    }
    life16_35 = 0x1.8p-2f;
    life17_37 = 0x1.4p-1f;
    forwardValue365_79_0 = life12_23;
    }
    if (!((life9_11 != null))) {
        forwardValue365_85_0 = forwardValue365_79_0;
        break forward_join_85;
    }
    if (!((forwardValue365_79_0 != 0))) {
        break forward_join_84;
    }
    life14_31 = 0x0.0p0f;
    }
    forwardValue365_85_0 = life13_29;
    }
    if (!((life9_11 != null))) {
        forwardValue365_91_0 = forwardValue365_85_0;
        break forward_join_91;
    }
    if (!((forwardValue365_85_0 != 0))) {
        break forward_join_90;
    }
    life15_33 = 0x1.0p0f;
    }
    forwardValue365_91_0 = life12_23;
    }
    if (!((life9_11 != null))) {
        forwardValue365_95_0 = forwardValue365_91_0;
        break forward_join_95;
    }
    if (!((forwardValue365_91_0 == 0))) {
        break forward_join_106;
    }
    forwardValue365_95_0 = life13_29;
    }
    if (!((life9_11 != null))) {
        forwardValue365_99_0 = forwardValue365_95_0;
        break forward_join_99;
    }
    if (!((forwardValue365_95_0 == 0))) {
        break forward_join_106;
    }
    forwardValue365_99_0 = life10_10;
    }
    if (!((life9_11 != null))) {
        forwardValue365_123_0 = forwardValue365_99_0;
        break forward_join_123;
    }
    if (!((forwardValue365_99_0 == 0))) {
        break forward_join_122;
    }
    spill365_2 = life11_17;
    if (!((life9_11 != null))) {
        forwardValue365_123_0 = spill365_2;
        break forward_join_123;
    }
    if (!((spill365_2 == 0))) {
        break forward_join_122;
    }
    }
    ((moom.dz)(this)).a(((float)(life14_31)), ((float)(0x0.0p0f)), ((float)(life16_35)), ((float)(life15_33)), ((float)(0x1.8p0f)), ((float)(life17_37)));
    super.a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((moom.CA)(p3)), ((java.util.List)(p4)), ((net.minecraft.entity.Entity)(p5)));
    }
    forwardValue365_123_0 = life10_10;
    }
    if (!((life9_11 != null))) {
        forwardValue365_129_0 = forwardValue365_123_0;
        break forward_join_129;
    }
    if (!((forwardValue365_123_0 != 0))) {
        break forward_join_128;
    }
    life16_35 = 0x0.0p0f;
    }
    forwardValue365_129_0 = life11_17;
    }
    if (!((forwardValue365_129_0 != 0))) {
        break forward_join_132;
    }
    life17_37 = 0x1.0p0f;
    }
    ((moom.dz)(this)).a(((float)(life14_31)), ((float)(0x0.0p0f)), ((float)(life16_35)), ((float)(life15_33)), ((float)(0x1.0p0f)), ((float)(life17_37)));
    return;
}


public void a__Void(net.minecraft.world.IBlockAccess p0, moom.DT p1) {
int forwardValue367_45_0;
    int forwardValue367_51_0;
    int forwardValue367_57_0;
    int[] spill367_0;
    int spill367_1;
    long life3_3;
    int life6_9;
    int life7_16;
    int life8_22;
    int[] life5_23;
    int life9_29;
    float life10_31;
    float life11_33;
    float life12_35;
    float life13_37;
    forward_join_60: {
    forward_join_57: {
    forward_join_56: {
    forward_join_51: {
    forward_join_50: {
    forward_join_45: {
    forward_join_44: {
    life3_3 = (moom.dz.U ^ 57903606244922L);
    life6_9 = ((((moom.dz)(this)).b__sourceReturn_b38f36a0de(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(((moom.DT)(p1)).c__DT())))) ? 1 : 0);
    spill367_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life7_16 = ((((moom.dz)(this)).b__sourceReturn_b38f36a0de(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(((moom.DT)(p1)).d__DT())))) ? 1 : 0);
    life8_22 = ((((moom.dz)(this)).b__sourceReturn_b38f36a0de(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(((moom.DT)(p1)).e())))) ? 1 : 0);
    life5_23 = spill367_0;
    life9_29 = ((((moom.dz)(this)).b__sourceReturn_b38f36a0de(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(((moom.DT)(p1)).f())))) ? 1 : 0);
    life10_31 = 0x1.8p-2f;
    life11_33 = 0x1.4p-1f;
    life12_35 = 0x1.8p-2f;
    life13_37 = 0x1.4p-1f;
    spill367_1 = life6_9;
    if (!((life5_23 != null))) {
        forwardValue367_45_0 = spill367_1;
        break forward_join_45;
    }
    if (!((spill367_1 != 0))) {
        break forward_join_44;
    }
    life12_35 = 0x0.0p0f;
    }
    forwardValue367_45_0 = life7_16;
    }
    if (!((life5_23 != null))) {
        forwardValue367_51_0 = forwardValue367_45_0;
        break forward_join_51;
    }
    if (!((forwardValue367_45_0 != 0))) {
        break forward_join_50;
    }
    life13_37 = 0x1.0p0f;
    }
    forwardValue367_51_0 = life8_22;
    }
    if (!((life5_23 != null))) {
        forwardValue367_57_0 = forwardValue367_51_0;
        break forward_join_57;
    }
    if (!((forwardValue367_51_0 != 0))) {
        break forward_join_56;
    }
    life10_31 = 0x0.0p0f;
    }
    forwardValue367_57_0 = life9_29;
    }
    if (!((forwardValue367_57_0 != 0))) {
        break forward_join_60;
    }
    life11_33 = 0x1.0p0f;
    }
    ((moom.dz)(this)).a(((float)(life10_31)), ((float)(0x0.0p0f)), ((float)(life12_35)), ((float)(life11_33)), ((float)(0x1.0p0f)), ((float)(life13_37)));
    return;
}


public boolean a__Boolean(net.minecraft.world.IBlockAccess p0, moom.DT p1) {
return ((0) != 0);
}


public boolean a__Boolean(net.minecraft.world.IBlockAccess p0, moom.DT p1, moom.bs p2) {
return ((1) != 0);
}


public boolean g() {
return ((0) != 0);
}


public boolean j() {
return ((0) != 0);
}

}
