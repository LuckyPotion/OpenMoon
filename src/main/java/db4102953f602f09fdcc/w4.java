package moom;


public class w4 extends moom.wU {

private final moom.ei o;

private final moom.ei p;

private static final long r;

public w4(net.minecraft.block.Block p0, moom.ei p1, moom.ei p2) {
super(p0);
    this.o = p1;
    this.p = p2;
    (this).c(0);
    (this).a(true);
}


static {
r = (moom._c.a(3113679671486008586L, 6159703169544305889L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(146932143797265L);
}


public java.lang.String b__String(net.minecraft.item.ItemStack p0) {
return ((moom.ei)(this.o)).a__sourceReturn_b52d34d971(((int)(((net.minecraft.item.ItemStack)(p0)).c())));
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private boolean a(net.minecraft.item.ItemStack p0, net.minecraft.world.World p1, moom.DT p2, java.lang.Object p3) {
net.minecraft.block.state.IBlockState forwardValue4341_18_0;
    int forwardValue4341_99_0;
    boolean spill4341_0;
    net.minecraft.block.state.IBlockState spill4341_1;
    boolean spill4341_2;
    boolean spill4341_3;
    long life5_3;
    net.minecraft.block.state.IBlockState life8_8;
    int life7_9;
    java.lang.Comparable life9_28;
    net.minecraft.block.state.IBlockState life10_40;
    forward_join_100: {
    forward_join_99: {
    forward_join_98: {
    forward_join_18: {
    life5_3 = (moom.w4.r ^ 35645032448088L);
    spill4341_0 = net.minecraft.item.ItemStack.m();
    life8_8 = ((net.minecraft.world.World)(p1)).a__fE(((moom.DT)(p2)));
    life7_9 = ((spill4341_0) ? 1 : 0);
    spill4341_1 = life8_8;
    if (!((life7_9 != 0))) {
        forwardValue4341_18_0 = spill4341_1;
        break forward_join_18;
    }
    if (!((((net.minecraft.block.state.IBlockState)(spill4341_1)).a__ch() == this.o))) {
        break forward_join_100;
    }
    forwardValue4341_18_0 = life8_8;
    }
    life9_28 = ((net.minecraft.block.state.IBlockState)(forwardValue4341_18_0)).a(((net.minecraft.block.properties.IProperty)(((moom.ei)(this.o)).a__ft())));
    if (!((life9_28 == p3))) {
        break forward_join_100;
    }
    life10_40 = ((net.minecraft.block.state.IBlockState)(((moom.ei)(this.p)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(((moom.ei)(this.o)).a__ft())), ((java.lang.Comparable)(life9_28)));
    spill4341_2 = ((net.minecraft.world.World)(p1)).a__Boolean(((moom.CA)(((moom.ei)(this.p)).a(((net.minecraft.world.World)(p1)), ((moom.DT)(p2)), ((net.minecraft.block.state.IBlockState)(life10_40))))));
    if (!((life7_9 != 0))) {
        forwardValue4341_99_0 = ((spill4341_2) ? 1 : 0);
        break forward_join_99;
    }
    if (!(spill4341_2)) {
        break forward_join_98;
    }
    spill4341_3 = ((net.minecraft.world.World)(p1)).a(((moom.DT)(p2)), ((net.minecraft.block.state.IBlockState)(life10_40)), ((int)(3)));
    if (!((life7_9 != 0))) {
        forwardValue4341_99_0 = ((spill4341_3) ? 1 : 0);
        break forward_join_99;
    }
    if (!(spill4341_3)) {
        break forward_join_98;
    }
    ((net.minecraft.world.World)(p1)).a(((double)(((double) (((float) ((moom.DT)(p2)).a()) + 0x1.0p-1f)))), ((double)(((double) (((float) ((moom.DT)(p2)).b()) + 0x1.0p-1f)))), ((double)(((double) (((float) ((moom.DT)(p2)).c()) + 0x1.0p-1f)))), ((java.lang.String)(((moom.eJ)(((moom.ei)(this.p)).H)).c())), ((float)(((((moom.eJ)(((moom.ei)(this.p)).H)).a() + 0x1.0p0f) / 0x1.0p1f))), ((float)((((moom.eJ)(((moom.ei)(this.p)).H)).b() * 0x1.99999ap-1f))));
    net.minecraft.item.ItemStack __stackOp4341_33_0 = p0;
    ((net.minecraft.item.ItemStack)(__stackOp4341_33_0)).b = ((int)((((net.minecraft.item.ItemStack)(__stackOp4341_33_0)).b - 1)));
    }
    forwardValue4341_99_0 = 1;
    }
    return ((forwardValue4341_99_0) != 0);
    }
    return ((0) != 0);
}


public boolean a(net.minecraft.world.World p0, moom.DT p1, moom.bs p2, net.minecraft.entity.player.EntityPlayer p3, net.minecraft.item.ItemStack p4) {
int forwardValue4342_36_0;
    moom.bs forwardValue4342_46_0;
    moom.bs forwardValue4342_46_1;
    net.minecraft.block.state.IBlockState forwardValue4342_63_0;
    java.lang.Object forwardValue4342_72_0;
    int forwardValue4342_87_0;
    int forwardValue4342_89_0;
    boolean spill4342_0;
    net.minecraft.block.state.IBlockState spill4342_1;
    moom.bs spill4342_2;
    moom.bs spill4342_3;
    net.minecraft.block.Block spill4342_4;
    boolean spill4342_5;
    long life6_3;
    moom.DT life9_5;
    net.minecraft.block.properties.IProperty life10_9;
    java.lang.Object life11_15;
    int life8_16;
    net.minecraft.block.state.IBlockState life12_20;
    int life13_44;
    moom.DT life2_84;
    net.minecraft.block.state.IBlockState life13_88;
    forward_join_89: {
    forward_join_88: {
    forward_join_87: {
    forward_join_86: {
    forward_join_76: {
    forward_join_72: {
    forward_join_63: {
    forward_join_56: {
    forward_join_49: {
    forward_join_46: {
    forward_join_44: {
    forward_join_36: {
    forward_join_35: {
    life6_3 = (moom.w4.r ^ 9134222351224L);
    life9_5 = p1;
    life10_9 = ((moom.ei)(this.o)).a__ft();
    spill4342_0 = net.minecraft.item.ItemStack.m();
    life11_15 = ((moom.ei)(this.o)).a(((net.minecraft.item.ItemStack)(p4)));
    life8_16 = ((spill4342_0) ? 1 : 0);
    life12_20 = ((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(p1)));
    spill4342_1 = life12_20;
    if (!((life8_16 != 0))) {
        forwardValue4342_63_0 = spill4342_1;
        break forward_join_63;
    }
    if (!((((net.minecraft.block.state.IBlockState)(spill4342_1)).a__ch() == this.o))) {
        break forward_join_56;
    }
    if (!((((net.minecraft.block.state.IBlockState)(life12_20)).a(((net.minecraft.block.properties.IProperty)(moom.ei.Q))) == moom.ak.TOP))) {
        break forward_join_35;
    }
    forwardValue4342_36_0 = 1;
    break forward_join_36;
    }
    forwardValue4342_36_0 = 0;
    }
    life13_44 = forwardValue4342_36_0;
    spill4342_2 = p2;
    spill4342_3 = moom.bs.UP;
    if (!((life8_16 != 0))) {
        forwardValue4342_46_0 = spill4342_2;
        forwardValue4342_46_1 = spill4342_3;
        break forward_join_46;
    }
    if (!((spill4342_2 == spill4342_3))) {
        break forward_join_44;
    }
    if (!((life13_44 != 0))) {
        break forward_join_49;
    }
    }
    forwardValue4342_46_0 = p2;
    forwardValue4342_46_1 = moom.bs.DOWN;
    }
    if (!((forwardValue4342_46_0 == forwardValue4342_46_1))) {
        break forward_join_56;
    }
    if (!((life13_44 != 0))) {
        break forward_join_56;
    }
    }
    if (!((life11_15 == ((net.minecraft.block.state.IBlockState)(life12_20)).a(((net.minecraft.block.properties.IProperty)(life10_9)))))) {
        break forward_join_56;
    }
    return ((1) != 0);
    }
    life2_84 = ((moom.DT)(p1)).a(((moom.bs)(p2)));
    forwardValue4342_63_0 = ((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life2_84)));
    }
    life13_88 = forwardValue4342_63_0;
    spill4342_4 = ((net.minecraft.block.state.IBlockState)(life13_88)).a__ch();
    if (!((life8_16 != 0))) {
        forwardValue4342_72_0 = spill4342_4;
        break forward_join_72;
    }
    if (!((spill4342_4 == this.o))) {
        break forward_join_76;
    }
    forwardValue4342_72_0 = life11_15;
    }
    if (!((forwardValue4342_72_0 != ((net.minecraft.block.state.IBlockState)(life13_88)).a(((net.minecraft.block.properties.IProperty)(life10_9)))))) {
        break forward_join_86;
    }
    }
    spill4342_5 = super.a(((net.minecraft.world.World)(p0)), ((moom.DT)(life9_5)), ((moom.bs)(p2)), ((net.minecraft.entity.player.EntityPlayer)(p3)), ((net.minecraft.item.ItemStack)(p4)));
    if (!((life8_16 != 0))) {
        forwardValue4342_87_0 = ((spill4342_5) ? 1 : 0);
        break forward_join_87;
    }
    if (!(spill4342_5)) {
        break forward_join_88;
    }
    }
    forwardValue4342_87_0 = 1;
    }
    forwardValue4342_89_0 = forwardValue4342_87_0;
    break forward_join_89;
    }
    forwardValue4342_89_0 = 0;
    }
    return ((forwardValue4342_89_0) != 0);
}


public boolean a(net.minecraft.item.ItemStack p0, net.minecraft.entity.player.EntityPlayer p1, net.minecraft.world.World p2, moom.DT p3, moom.bs p4, float p5, float p6, float p7) {
int forwardValue4340_22_0;
    java.lang.Object forwardValue4340_29_0;
    moom.bs forwardValue4340_64_0;
    moom.bs forwardValue4340_64_1;
    java.lang.Comparable forwardValue4340_72_0;
    java.lang.Object forwardValue4340_72_1;
    int forwardValue4340_144_0;
    int forwardValue4340_170_0;
    int forwardValue4340_172_0;
    int spill4340_0;
    net.minecraft.entity.player.EntityPlayer spill4340_1;
    moom.bs spill4340_2;
    moom.bs spill4340_3;
    moom.ak spill4340_4;
    moom.ak spill4340_5;
    moom.ak spill4340_6;
    moom.ak spill4340_7;
    boolean spill4340_8;
    boolean spill4340_9;
    boolean spill4340_10;
    boolean spill4340_11;
    long life9_3;
    int life11_5;
    java.lang.Object life12_39;
    net.minecraft.block.state.IBlockState life13_43;
    net.minecraft.block.properties.IProperty life14_52;
    java.lang.Comparable life15_56;
    moom.ak life16_61;
    net.minecraft.block.state.IBlockState life17_110;
    forward_join_172: {
    forward_join_171: {
    forward_join_170: {
    forward_join_169: {
    forward_join_145: {
    forward_join_144: {
    forward_join_143: {
    forward_join_72: {
    forward_join_70: {
    forward_join_64: {
    forward_join_62: {
    forward_join_29: {
    forward_join_25: {
    forward_join_22: {
    forward_join_13: {
    life9_3 = (moom.w4.r ^ 69073109501194L);
    life11_5 = ((net.minecraft.item.ItemStack.l()) ? 1 : 0);
    spill4340_0 = ((net.minecraft.item.ItemStack)(p0)).b;
    if (!((life11_5 == 0))) {
        forwardValue4340_22_0 = spill4340_0;
        break forward_join_22;
    }
    if (!((spill4340_0 == 0))) {
        break forward_join_13;
    }
    return ((0) != 0);
    }
    spill4340_1 = p1;
    if (!((life11_5 == 0))) {
        forwardValue4340_29_0 = spill4340_1;
        break forward_join_29;
    }
    forwardValue4340_22_0 = ((((net.minecraft.entity.player.EntityPlayer)(spill4340_1)).a(((moom.DT)(((moom.DT)(p3)).a(((moom.bs)(p4))))), ((moom.bs)(p4)), ((net.minecraft.item.ItemStack)(p0)))) ? 1 : 0);
    }
    if (!((forwardValue4340_22_0 == 0))) {
        break forward_join_25;
    }
    return ((0) != 0);
    }
    forwardValue4340_29_0 = ((moom.ei)(this.o)).a(((net.minecraft.item.ItemStack)(p0)));
    }
    life12_39 = forwardValue4340_29_0;
    life13_43 = ((net.minecraft.world.World)(p2)).a__fE(((moom.DT)(p3)));
    if (!((((net.minecraft.block.state.IBlockState)(life13_43)).a__ch() == this.o))) {
        break forward_join_145;
    }
    life14_52 = ((moom.ei)(this.o)).a__ft();
    life15_56 = ((net.minecraft.block.state.IBlockState)(life13_43)).a(((net.minecraft.block.properties.IProperty)(life14_52)));
    life16_61 = ((moom.ak)(((net.minecraft.block.state.IBlockState)(life13_43)).a(((net.minecraft.block.properties.IProperty)(moom.ei.Q)))));
    spill4340_2 = p4;
    spill4340_3 = moom.bs.UP;
    if (!((life11_5 == 0))) {
        forwardValue4340_64_0 = spill4340_2;
        forwardValue4340_64_1 = spill4340_3;
        break forward_join_64;
    }
    if (!((spill4340_2 == spill4340_3))) {
        break forward_join_62;
    }
    spill4340_4 = life16_61;
    spill4340_5 = moom.ak.BOTTOM;
    if (!((life11_5 == 0))) {
        forwardValue4340_72_0 = spill4340_4;
        forwardValue4340_72_1 = spill4340_5;
        break forward_join_72;
    }
    if (!((spill4340_4 != spill4340_5))) {
        break forward_join_70;
    }
    }
    forwardValue4340_64_0 = p4;
    forwardValue4340_64_1 = moom.bs.DOWN;
    }
    if (!((forwardValue4340_64_0 == forwardValue4340_64_1))) {
        break forward_join_145;
    }
    spill4340_6 = life16_61;
    spill4340_7 = moom.ak.TOP;
    if (!((life11_5 == 0))) {
        forwardValue4340_72_0 = spill4340_6;
        forwardValue4340_72_1 = spill4340_7;
        break forward_join_72;
    }
    if (!((spill4340_6 == spill4340_7))) {
        break forward_join_145;
    }
    }
    forwardValue4340_72_0 = life15_56;
    forwardValue4340_72_1 = life12_39;
    }
    if (!((forwardValue4340_72_0 == forwardValue4340_72_1))) {
        break forward_join_145;
    }
    life17_110 = ((net.minecraft.block.state.IBlockState)(((moom.ei)(this.p)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(life14_52)), ((java.lang.Comparable)(life15_56)));
    spill4340_8 = ((net.minecraft.world.World)(p2)).a__Boolean(((moom.CA)(((moom.ei)(this.p)).a(((net.minecraft.world.World)(p2)), ((moom.DT)(p3)), ((net.minecraft.block.state.IBlockState)(life17_110))))));
    if (!((life11_5 == 0))) {
        forwardValue4340_144_0 = ((spill4340_8) ? 1 : 0);
        break forward_join_144;
    }
    if (!(spill4340_8)) {
        break forward_join_143;
    }
    spill4340_9 = ((net.minecraft.world.World)(p2)).a(((moom.DT)(p3)), ((net.minecraft.block.state.IBlockState)(life17_110)), ((int)(3)));
    if (!((life11_5 == 0))) {
        forwardValue4340_144_0 = ((spill4340_9) ? 1 : 0);
        break forward_join_144;
    }
    if (!(spill4340_9)) {
        break forward_join_143;
    }
    ((net.minecraft.world.World)(p2)).a(((double)(((double) (((float) ((moom.DT)(p3)).a()) + 0x1.0p-1f)))), ((double)(((double) (((float) ((moom.DT)(p3)).b()) + 0x1.0p-1f)))), ((double)(((double) (((float) ((moom.DT)(p3)).c()) + 0x1.0p-1f)))), ((java.lang.String)(((moom.eJ)(((moom.ei)(this.p)).H)).c())), ((float)(((((moom.eJ)(((moom.ei)(this.p)).H)).a() + 0x1.0p0f) / 0x1.0p1f))), ((float)((((moom.eJ)(((moom.ei)(this.p)).H)).b() * 0x1.99999ap-1f))));
    net.minecraft.item.ItemStack __stackOp4340_46_0 = p0;
    ((net.minecraft.item.ItemStack)(__stackOp4340_46_0)).b = ((int)((((net.minecraft.item.ItemStack)(__stackOp4340_46_0)).b - 1)));
    }
    forwardValue4340_144_0 = 1;
    }
    return ((forwardValue4340_144_0) != 0);
    }
    spill4340_10 = ((moom.w4)(this)).a(((net.minecraft.item.ItemStack)(p0)), ((net.minecraft.world.World)(p2)), ((moom.DT)(((moom.DT)(p3)).a(((moom.bs)(p4))))), ((java.lang.Object)(life12_39)));
    if (!((life11_5 == 0))) {
        forwardValue4340_170_0 = ((spill4340_10) ? 1 : 0);
        break forward_join_170;
    }
    if (!((!spill4340_10))) {
        break forward_join_169;
    }
    spill4340_11 = super.a(((net.minecraft.item.ItemStack)(p0)), ((net.minecraft.entity.player.EntityPlayer)(p1)), ((net.minecraft.world.World)(p2)), ((moom.DT)(p3)), ((moom.bs)(p4)), ((float)(p5)), ((float)(p6)), ((float)(p7)));
    if (!((life11_5 == 0))) {
        forwardValue4340_170_0 = ((spill4340_11) ? 1 : 0);
        break forward_join_170;
    }
    if (!(spill4340_11)) {
        break forward_join_171;
    }
    }
    forwardValue4340_170_0 = 1;
    }
    forwardValue4340_172_0 = forwardValue4340_170_0;
    break forward_join_172;
    }
    forwardValue4340_172_0 = 0;
    }
    return ((forwardValue4340_172_0) != 0);
}


public int a(int p0) {
return p0;
}

}
