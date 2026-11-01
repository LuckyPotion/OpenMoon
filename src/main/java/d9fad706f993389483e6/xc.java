package moom;


public class xc extends net.minecraft.item.Item {

private final net.minecraft.block.Block n;

private static final long o;

public xc(net.minecraft.block.Block p0) {
super();
    this.n = p0;
    (this).a(net.minecraft.creativetab.CreativeTabs.d);
}


static {
o = (moom._c.a(4355863855322588412L, -2034756246867608695L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(13650771416871L);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public static void a(net.minecraft.world.World p0, moom.DT p1, moom.bs p2, net.minecraft.block.Block p3) {
int forwardValue4509_25_0;
    int forwardValue4509_27_0;
    int forwardValue4509_37_0;
    int forwardValue4509_37_1;
    int forwardValue4509_38_0;
    int forwardValue4509_39_0;
    int forwardValue4509_39_1;
    int forwardValue4509_50_0;
    int forwardValue4509_52_0;
    int forwardValue4509_62_0;
    int forwardValue4509_62_1;
    int forwardValue4509_63_0;
    int forwardValue4509_64_0;
    int forwardValue4509_64_1;
    net.minecraft.block.Block forwardValue4509_80_0;
    net.minecraft.block.Block forwardValue4509_80_1;
    int forwardValue4509_84_0;
    net.minecraft.block.Block forwardValue4509_99_0;
    net.minecraft.block.Block forwardValue4509_99_1;
    int forwardValue4509_103_0;
    int forwardValue4509_113_0;
    int forwardValue4509_118_0;
    int forwardValue4509_120_0;
    net.minecraft.block.state.IBlockState forwardValue4509_134_0;
    moom.fw forwardValue4509_134_1;
    net.minecraft.block.state.IBlockState forwardValue4509_135_0;
    moom.fw forwardValue4509_135_1;
    moom.J forwardValue4509_135_2;
    boolean spill4509_0;
    boolean spill4509_1;
    boolean spill4509_2;
    boolean spill4509_3;
    boolean spill4509_4;
    net.minecraft.block.Block spill4509_5;
    net.minecraft.block.Block spill4509_6;
    net.minecraft.block.Block spill4509_7;
    net.minecraft.block.Block spill4509_8;
    int spill4509_9;
    int spill4509_10;
    net.minecraft.block.state.IBlockState spill4509_11;
    moom.fw spill4509_12;
    long life4_3;
    moom.DT life7_8;
    moom.DT life8_14;
    int life6_15;
    int life9_46;
    int life10_77;
    int life11_104;
    int life12_131;
    int life13_163;
    moom.DT life14_166;
    net.minecraft.block.state.IBlockState life15_181;
    forward_join_135: {
    forward_join_134: {
    forward_join_120: {
    forward_join_119: {
    forward_join_118: {
    forward_join_117: {
    forward_join_113: {
    forward_join_112: {
    forward_join_103: {
    forward_join_102: {
    forward_join_100: {
    forward_join_99: {
    forward_join_84: {
    forward_join_83: {
    forward_join_81: {
    forward_join_80: {
    forward_join_64: {
    forward_join_63: {
    forward_join_62: {
    forward_join_52: {
    forward_join_51: {
    forward_join_50: {
    forward_join_39: {
    forward_join_38: {
    forward_join_37: {
    forward_join_27: {
    forward_join_26: {
    forward_join_25: {
    life4_3 = (moom.xc.o ^ 87320093558381L);
    life7_8 = ((moom.DT)(p1)).a(((moom.bs)(((moom.bs)(p2)).b__bs())));
    spill4509_0 = net.minecraft.item.ItemStack.l();
    life8_14 = ((moom.DT)(p1)).a(((moom.bs)(((moom.bs)(p2)).e__bs())));
    life6_15 = ((spill4509_0) ? 1 : 0);
    spill4509_1 = ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life8_14))))).a__ch())).e__Boolean();
    if (!((life6_15 == 0))) {
        forwardValue4509_25_0 = ((spill4509_1) ? 1 : 0);
        break forward_join_25;
    }
    if (!(spill4509_1)) {
        break forward_join_26;
    }
    forwardValue4509_25_0 = 1;
    }
    forwardValue4509_27_0 = forwardValue4509_25_0;
    break forward_join_27;
    }
    forwardValue4509_27_0 = 0;
    }
    spill4509_2 = ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(life8_14)).a__DT()))))).a__ch())).e__Boolean();
    if (!((life6_15 == 0))) {
        forwardValue4509_37_0 = forwardValue4509_27_0;
        forwardValue4509_37_1 = ((spill4509_2) ? 1 : 0);
        break forward_join_37;
    }
    if (!(spill4509_2)) {
        forwardValue4509_38_0 = forwardValue4509_27_0;
        break forward_join_38;
    }
    forwardValue4509_37_0 = forwardValue4509_27_0;
    forwardValue4509_37_1 = 1;
    }
    forwardValue4509_39_0 = forwardValue4509_37_0;
    forwardValue4509_39_1 = forwardValue4509_37_1;
    break forward_join_39;
    }
    forwardValue4509_39_0 = forwardValue4509_38_0;
    forwardValue4509_39_1 = 0;
    }
    life9_46 = (forwardValue4509_39_0 + forwardValue4509_39_1);
    spill4509_3 = ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life7_8))))).a__ch())).e__Boolean();
    if (!((life6_15 == 0))) {
        forwardValue4509_50_0 = ((spill4509_3) ? 1 : 0);
        break forward_join_50;
    }
    if (!(spill4509_3)) {
        break forward_join_51;
    }
    forwardValue4509_50_0 = 1;
    }
    forwardValue4509_52_0 = forwardValue4509_50_0;
    break forward_join_52;
    }
    forwardValue4509_52_0 = 0;
    }
    spill4509_4 = ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(life7_8)).a__DT()))))).a__ch())).e__Boolean();
    if (!((life6_15 == 0))) {
        forwardValue4509_62_0 = forwardValue4509_52_0;
        forwardValue4509_62_1 = ((spill4509_4) ? 1 : 0);
        break forward_join_62;
    }
    if (!(spill4509_4)) {
        forwardValue4509_63_0 = forwardValue4509_52_0;
        break forward_join_63;
    }
    forwardValue4509_62_0 = forwardValue4509_52_0;
    forwardValue4509_62_1 = 1;
    }
    forwardValue4509_64_0 = forwardValue4509_62_0;
    forwardValue4509_64_1 = forwardValue4509_62_1;
    break forward_join_64;
    }
    forwardValue4509_64_0 = forwardValue4509_63_0;
    forwardValue4509_64_1 = 0;
    }
    life10_77 = (forwardValue4509_64_0 + forwardValue4509_64_1);
    spill4509_5 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life8_14))))).a__ch();
    spill4509_6 = p3;
    if (!((life6_15 == 0))) {
        forwardValue4509_80_0 = spill4509_5;
        forwardValue4509_80_1 = spill4509_6;
        break forward_join_80;
    }
    if (!((spill4509_5 != spill4509_6))) {
        break forward_join_81;
    }
    forwardValue4509_80_0 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(life8_14)).a__DT()))))).a__ch();
    forwardValue4509_80_1 = p3;
    }
    if (!((forwardValue4509_80_0 == forwardValue4509_80_1))) {
        break forward_join_83;
    }
    }
    forwardValue4509_84_0 = 1;
    break forward_join_84;
    }
    forwardValue4509_84_0 = 0;
    }
    life11_104 = forwardValue4509_84_0;
    spill4509_7 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life7_8))))).a__ch();
    spill4509_8 = p3;
    if (!((life6_15 == 0))) {
        forwardValue4509_99_0 = spill4509_7;
        forwardValue4509_99_1 = spill4509_8;
        break forward_join_99;
    }
    if (!((spill4509_7 != spill4509_8))) {
        break forward_join_100;
    }
    forwardValue4509_99_0 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(life7_8)).a__DT()))))).a__ch();
    forwardValue4509_99_1 = p3;
    }
    if (!((forwardValue4509_99_0 == forwardValue4509_99_1))) {
        break forward_join_102;
    }
    }
    forwardValue4509_103_0 = 1;
    break forward_join_103;
    }
    forwardValue4509_103_0 = 0;
    }
    life12_131 = forwardValue4509_103_0;
    spill4509_9 = life11_104;
    if (!((life6_15 == 0))) {
        forwardValue4509_113_0 = spill4509_9;
        break forward_join_113;
    }
    if (!((spill4509_9 != 0))) {
        break forward_join_112;
    }
    spill4509_10 = life12_131;
    if (!((life6_15 == 0))) {
        forwardValue4509_118_0 = spill4509_10;
        break forward_join_118;
    }
    if (!((spill4509_10 != 0))) {
        break forward_join_117;
    }
    }
    forwardValue4509_113_0 = life10_77;
    }
    if (!((life6_15 == 0))) {
        forwardValue4509_118_0 = forwardValue4509_113_0;
        break forward_join_118;
    }
    if (!((forwardValue4509_113_0 > life9_46))) {
        break forward_join_119;
    }
    }
    forwardValue4509_118_0 = 1;
    }
    forwardValue4509_120_0 = forwardValue4509_118_0;
    break forward_join_120;
    }
    forwardValue4509_120_0 = 0;
    }
    life13_163 = forwardValue4509_120_0;
    life14_166 = ((moom.DT)(p1)).a__DT();
    spill4509_11 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(p3)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockDoor.Q)), ((java.lang.Comparable)(p2)));
    spill4509_12 = net.minecraft.block.BlockDoor.S;
    if (!((life13_163 != 0))) {
        forwardValue4509_134_0 = spill4509_11;
        forwardValue4509_134_1 = spill4509_12;
        break forward_join_134;
    }
    forwardValue4509_135_0 = spill4509_11;
    forwardValue4509_135_1 = spill4509_12;
    forwardValue4509_135_2 = moom.J.RIGHT;
    break forward_join_135;
    }
    forwardValue4509_135_0 = forwardValue4509_134_0;
    forwardValue4509_135_1 = forwardValue4509_134_1;
    forwardValue4509_135_2 = moom.J.LEFT;
    }
    life15_181 = ((net.minecraft.block.state.IBlockState)(forwardValue4509_135_0)).a__fE(((net.minecraft.block.properties.IProperty)(forwardValue4509_135_1)), ((java.lang.Comparable)(forwardValue4509_135_2)));
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(life15_181)).a__fE(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockDoor.U)), ((java.lang.Comparable)(moom.I.LOWER))))), ((int)(2)));
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(life14_166)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(life15_181)).a__fE(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockDoor.U)), ((java.lang.Comparable)(moom.I.UPPER))))), ((int)(2)));
    ((net.minecraft.world.World)(p0)).b(((moom.DT)(p1)), ((net.minecraft.block.Block)(p3)));
    ((net.minecraft.world.World)(p0)).b(((moom.DT)(life14_166)), ((net.minecraft.block.Block)(p3)));
    return;
}


public boolean a(net.minecraft.item.ItemStack p0, net.minecraft.entity.player.EntityPlayer p1, net.minecraft.world.World p2, moom.DT p3, moom.bs p4, float p5, float p6, float p7) {
int forwardValue4508_34_0;
    int forwardValue4508_44_0;
    int forwardValue4508_65_0;
    boolean spill4508_0;
    long life9_3;
    int life11_5;
    net.minecraft.block.state.IBlockState life12_16;
    net.minecraft.block.Block life13_19;
    forward_join_65: {
    forward_join_49: {
    forward_join_44: {
    forward_join_39: {
    forward_join_34: {
    forward_join_29: {
    forward_join_11: {
    life9_3 = (moom.xc.o ^ 110951972701358L);
    life11_5 = ((net.minecraft.item.ItemStack.l()) ? 1 : 0);
    if (!((p4 != moom.bs.UP))) {
        break forward_join_11;
    }
    return ((0) != 0);
    }
    life12_16 = ((net.minecraft.world.World)(p2)).a__fE(((moom.DT)(p3)));
    life13_19 = ((net.minecraft.block.state.IBlockState)(life12_16)).a__ch();
    spill4508_0 = ((net.minecraft.block.Block)(life13_19)).a__Boolean(((net.minecraft.world.World)(p2)), ((moom.DT)(p3)));
    if (!((life11_5 == 0))) {
        forwardValue4508_34_0 = ((spill4508_0) ? 1 : 0);
        break forward_join_34;
    }
    if (!((!spill4508_0))) {
        break forward_join_29;
    }
    p3 = ((moom.DT)(p3)).a(((moom.bs)(p4)));
    }
    forwardValue4508_34_0 = ((((net.minecraft.entity.player.EntityPlayer)(p1)).a(((moom.DT)(p3)), ((moom.bs)(p4)), ((net.minecraft.item.ItemStack)(p0)))) ? 1 : 0);
    }
    if (!((life11_5 == 0))) {
        forwardValue4508_44_0 = forwardValue4508_34_0;
        break forward_join_44;
    }
    if (!((forwardValue4508_34_0 == 0))) {
        break forward_join_39;
    }
    return ((0) != 0);
    }
    forwardValue4508_44_0 = ((((net.minecraft.block.Block)(this.n)).b__Boolean(((net.minecraft.world.World)(p2)), ((moom.DT)(p3)))) ? 1 : 0);
    }
    if (!((life11_5 == 0))) {
        forwardValue4508_65_0 = forwardValue4508_44_0;
        break forward_join_65;
    }
    if (!((forwardValue4508_44_0 == 0))) {
        break forward_join_49;
    }
    return ((0) != 0);
    }
    moom.xc.a(((net.minecraft.world.World)(p2)), ((moom.DT)(p3)), ((moom.bs)(moom.bs.a(((double)(((double) ((net.minecraft.entity.player.EntityPlayer)(p1)).w)))))), ((net.minecraft.block.Block)(this.n)));
    net.minecraft.item.ItemStack __stackOp4508_21_0 = p0;
    ((net.minecraft.item.ItemStack)(__stackOp4508_21_0)).b = ((int)((((net.minecraft.item.ItemStack)(__stackOp4508_21_0)).b - 1)));
    forwardValue4508_65_0 = 1;
    }
    return ((forwardValue4508_65_0) != 0);
}

}
