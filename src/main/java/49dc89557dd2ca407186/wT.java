package moom;


public class wT extends net.minecraft.item.Item {

private static final long n;

public wT() {
super();
    (this).a(net.minecraft.creativetab.CreativeTabs.c);
}


static {
n = (moom._c.a(8798779928475060480L, -2135313166801940420L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(238244923597255L);
}


public boolean a(net.minecraft.item.ItemStack p0, net.minecraft.entity.player.EntityPlayer p1, net.minecraft.world.World p2, moom.DT p3, moom.bs p4, float p5, float p6, float p7) {
int forwardValue4378_12_0;
    int forwardValue4378_49_0;
    int forwardValue4378_92_0;
    int forwardValue4378_94_0;
    int forwardValue4378_106_0;
    int forwardValue4378_108_0;
    int forwardValue4378_169_0;
    int forwardValue4378_171_0;
    int forwardValue4378_173_0;
    boolean spill4378_0;
    int spill4378_1;
    boolean spill4378_2;
    boolean spill4378_3;
    int spill4378_4;
    boolean spill4378_5;
    int spill4378_6;
    boolean spill4378_7;
    int spill4378_8;
    int spill4378_9;
    boolean spill4378_10;
    boolean spill4378_11;
    boolean spill4378_12;
    long life9_3;
    int life11_5;
    net.minecraft.block.state.IBlockState life12_26;
    net.minecraft.block.Block life13_29;
    int life14_34;
    int life15_57;
    moom.bs life16_60;
    moom.DT life17_64;
    int life18_97;
    int life19_120;
    int life20_143;
    net.minecraft.block.state.IBlockState life21_198;
    net.minecraft.block.state.IBlockState life22_214;
    forward_join_173: {
    forward_join_172: {
    forward_join_171: {
    forward_join_170: {
    forward_join_169: {
    forward_join_162: {
    forward_join_108: {
    forward_join_107: {
    forward_join_106: {
    forward_join_105: {
    forward_join_94: {
    forward_join_93: {
    forward_join_92: {
    forward_join_91: {
    forward_join_49: {
    forward_join_37: {
    forward_join_18: {
    forward_join_13: {
    forward_join_12: {
    life9_3 = (moom.wT.n ^ 89181653089947L);
    life11_5 = ((net.minecraft.item.ItemStack.l()) ? 1 : 0);
    spill4378_0 = ((net.minecraft.world.World)(p2)).G;
    if (!((life11_5 == 0))) {
        forwardValue4378_12_0 = ((spill4378_0) ? 1 : 0);
        break forward_join_12;
    }
    if (!(spill4378_0)) {
        break forward_join_13;
    }
    forwardValue4378_12_0 = 1;
    }
    return ((forwardValue4378_12_0) != 0);
    }
    if (!((p4 != moom.bs.UP))) {
        break forward_join_18;
    }
    return ((0) != 0);
    }
    life12_26 = ((net.minecraft.world.World)(p2)).a__fE(((moom.DT)(p3)));
    life13_29 = ((net.minecraft.block.state.IBlockState)(life12_26)).a__ch();
    life14_34 = ((((net.minecraft.block.Block)(life13_29)).a__Boolean(((net.minecraft.world.World)(p2)), ((moom.DT)(p3)))) ? 1 : 0);
    spill4378_1 = life14_34;
    if (!((life11_5 == 0))) {
        forwardValue4378_49_0 = spill4378_1;
        break forward_join_49;
    }
    if (!((spill4378_1 == 0))) {
        break forward_join_37;
    }
    p3 = ((moom.DT)(p3)).a__DT();
    }
    forwardValue4378_49_0 = (moom.Dr.b__Int(((double)((((double) ((((net.minecraft.entity.player.EntityPlayer)(p1)).w * 0x1.0p2f) / 0x1.68p8f)) + 0x1.0p-1d)))) & 3);
    }
    life15_57 = forwardValue4378_49_0;
    life16_60 = moom.bs.b(((int)(life15_57)));
    life17_64 = ((moom.DT)(p3)).a(((moom.bs)(life16_60)));
    spill4378_2 = ((net.minecraft.entity.player.EntityPlayer)(p1)).a(((moom.DT)(p3)), ((moom.bs)(p4)), ((net.minecraft.item.ItemStack)(p0)));
    if (!((life11_5 == 0))) {
        forwardValue4378_173_0 = ((spill4378_2) ? 1 : 0);
        break forward_join_173;
    }
    if (!(spill4378_2)) {
        break forward_join_172;
    }
    spill4378_3 = ((net.minecraft.entity.player.EntityPlayer)(p1)).a(((moom.DT)(life17_64)), ((moom.bs)(p4)), ((net.minecraft.item.ItemStack)(p0)));
    if (!((life11_5 == 0))) {
        forwardValue4378_173_0 = ((spill4378_3) ? 1 : 0);
        break forward_join_173;
    }
    if (!(spill4378_3)) {
        break forward_join_172;
    }
    life18_97 = ((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p2)).a__fE(((moom.DT)(life17_64))))).a__ch())).a__Boolean(((net.minecraft.world.World)(p2)), ((moom.DT)(life17_64)))) ? 1 : 0);
    spill4378_4 = life14_34;
    if (!((life11_5 == 0))) {
        forwardValue4378_92_0 = spill4378_4;
        break forward_join_92;
    }
    if (!((spill4378_4 == 0))) {
        break forward_join_91;
    }
    spill4378_5 = ((net.minecraft.world.World)(p2)).a__Boolean(((moom.DT)(p3)));
    if (!((life11_5 == 0))) {
        forwardValue4378_92_0 = ((spill4378_5) ? 1 : 0);
        break forward_join_92;
    }
    if (!(spill4378_5)) {
        break forward_join_93;
    }
    }
    forwardValue4378_92_0 = 1;
    }
    forwardValue4378_94_0 = forwardValue4378_92_0;
    break forward_join_94;
    }
    forwardValue4378_94_0 = 0;
    }
    life19_120 = forwardValue4378_94_0;
    spill4378_6 = life18_97;
    if (!((life11_5 == 0))) {
        forwardValue4378_106_0 = spill4378_6;
        break forward_join_106;
    }
    if (!((spill4378_6 == 0))) {
        break forward_join_105;
    }
    spill4378_7 = ((net.minecraft.world.World)(p2)).a__Boolean(((moom.DT)(life17_64)));
    if (!((life11_5 == 0))) {
        forwardValue4378_106_0 = ((spill4378_7) ? 1 : 0);
        break forward_join_106;
    }
    if (!(spill4378_7)) {
        break forward_join_107;
    }
    }
    forwardValue4378_106_0 = 1;
    }
    forwardValue4378_108_0 = forwardValue4378_106_0;
    break forward_join_108;
    }
    forwardValue4378_108_0 = 0;
    }
    life20_143 = forwardValue4378_108_0;
    spill4378_8 = life19_120;
    if (!((life11_5 == 0))) {
        forwardValue4378_171_0 = spill4378_8;
        break forward_join_171;
    }
    if (!((spill4378_8 != 0))) {
        break forward_join_170;
    }
    spill4378_9 = life20_143;
    if (!((life11_5 == 0))) {
        forwardValue4378_171_0 = spill4378_9;
        break forward_join_171;
    }
    if (!((spill4378_9 != 0))) {
        break forward_join_170;
    }
    spill4378_10 = net.minecraft.world.World.a(((net.minecraft.world.IBlockAccess)(p2)), ((moom.DT)(((moom.DT)(p3)).b__DT())));
    if (!((life11_5 == 0))) {
        forwardValue4378_171_0 = ((spill4378_10) ? 1 : 0);
        break forward_join_171;
    }
    if (!(spill4378_10)) {
        break forward_join_170;
    }
    spill4378_11 = net.minecraft.world.World.a(((net.minecraft.world.IBlockAccess)(p2)), ((moom.DT)(((moom.DT)(life17_64)).b__DT())));
    if (!((life11_5 == 0))) {
        forwardValue4378_171_0 = ((spill4378_11) ? 1 : 0);
        break forward_join_171;
    }
    if (!(spill4378_11)) {
        break forward_join_170;
    }
    life21_198 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.C)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockBed.S)), ((java.lang.Comparable)(java.lang.Boolean.FALSE))))).a__fE(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockBed.Q)), ((java.lang.Comparable)(life16_60))))).a__fE(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockBed.R)), ((java.lang.Comparable)(net.minecraft.block.BlockBed$EnumPartType.FOOT)));
    spill4378_12 = ((net.minecraft.world.World)(p2)).a(((moom.DT)(p3)), ((net.minecraft.block.state.IBlockState)(life21_198)), ((int)(3)));
    if (!((life11_5 == 0))) {
        forwardValue4378_169_0 = ((spill4378_12) ? 1 : 0);
        break forward_join_169;
    }
    if (!(spill4378_12)) {
        break forward_join_162;
    }
    life22_214 = ((net.minecraft.block.state.IBlockState)(life21_198)).a__fE(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockBed.R)), ((java.lang.Comparable)(net.minecraft.block.BlockBed$EnumPartType.HEAD)));
    ((net.minecraft.world.World)(p2)).a(((moom.DT)(life17_64)), ((net.minecraft.block.state.IBlockState)(life22_214)), ((int)(3)));
    }
    net.minecraft.item.ItemStack __stackOp4378_51_0 = p0;
    ((net.minecraft.item.ItemStack)(__stackOp4378_51_0)).b = ((int)((((net.minecraft.item.ItemStack)(__stackOp4378_51_0)).b - 1)));
    forwardValue4378_169_0 = 1;
    }
    return ((forwardValue4378_169_0) != 0);
    }
    forwardValue4378_171_0 = 0;
    }
    return ((forwardValue4378_171_0) != 0);
    }
    forwardValue4378_173_0 = 0;
    }
    return ((forwardValue4378_173_0) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}

}
