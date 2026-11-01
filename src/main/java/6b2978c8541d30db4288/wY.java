package moom;


public class wY extends moom.wX {

private static final long s;

public wY(net.minecraft.block.Block p0) {
super(p0, false);
}


static {
s = (moom._c.a(3176109442176490577L, -3838328403520081507L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(266842306738271L);
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public net.minecraft.item.ItemStack a(net.minecraft.item.ItemStack p0, net.minecraft.world.World p1, net.minecraft.entity.player.EntityPlayer p2) {
net.minecraft.util.MovingObjectPosition forwardValue4388_17_0;
    net.minecraft.util.MovingObjectPosition forwardValue4388_23_0;
    int forwardValue4388_43_0;
    net.minecraft.block.state.IBlockState forwardValue4388_61_0;
    int forwardValue4388_71_0;
    int forwardValue4388_85_0;
    net.minecraft.entity.player.EntityPlayer forwardValue4388_93_0;
    boolean spill4388_0;
    net.minecraft.util.MovingObjectPosition spill4388_1;
    boolean spill4388_2;
    net.minecraft.block.state.IBlockState spill4388_3;
    int spill4388_4;
    net.minecraft.entity.player.EntityPlayer spill4388_5;
    long life4_3;
    net.minecraft.util.MovingObjectPosition life7_10;
    int life6_11;
    moom.DT life8_33;
    moom.DT life9_64;
    net.minecraft.block.state.IBlockState life10_68;
    forward_join_98: {
    forward_join_93: {
    forward_join_92: {
    forward_join_85: {
    forward_join_71: {
    forward_join_61: {
    forward_join_46: {
    forward_join_43: {
    forward_join_34: {
    forward_join_23: {
    forward_join_17: {
    life4_3 = (moom.wY.s ^ 103282111201663L);
    spill4388_0 = net.minecraft.item.ItemStack.l();
    life7_10 = ((moom.wY)(this)).a(((net.minecraft.world.World)(p1)), ((net.minecraft.entity.player.EntityPlayer)(p2)), ((boolean)(true)));
    life6_11 = ((spill4388_0) ? 1 : 0);
    spill4388_1 = life7_10;
    if (!((life6_11 == 0))) {
        forwardValue4388_17_0 = spill4388_1;
        break forward_join_17;
    }
    if (!((spill4388_1 != null))) {
        break forward_join_98;
    }
    forwardValue4388_17_0 = life7_10;
    }
    if (!((life6_11 == 0))) {
        forwardValue4388_23_0 = forwardValue4388_17_0;
        break forward_join_23;
    }
    if (!((((net.minecraft.util.MovingObjectPosition)(forwardValue4388_17_0)).b == net.minecraft.util.MovingObjectPosition$MovingObjectType.BLOCK))) {
        break forward_join_98;
    }
    forwardValue4388_23_0 = life7_10;
    }
    life8_33 = ((net.minecraft.util.MovingObjectPosition)(forwardValue4388_23_0)).a();
    spill4388_2 = ((net.minecraft.world.World)(p1)).a(((net.minecraft.entity.player.EntityPlayer)(p2)), ((moom.DT)(life8_33)));
    if (!((life6_11 == 0))) {
        forwardValue4388_43_0 = ((spill4388_2) ? 1 : 0);
        break forward_join_43;
    }
    if (!((!spill4388_2))) {
        break forward_join_34;
    }
    return p0;
    }
    forwardValue4388_43_0 = ((((net.minecraft.entity.player.EntityPlayer)(p2)).a(((moom.DT)(((moom.DT)(life8_33)).a(((moom.bs)(((net.minecraft.util.MovingObjectPosition)(life7_10)).c))))), ((moom.bs)(((net.minecraft.util.MovingObjectPosition)(life7_10)).c)), ((net.minecraft.item.ItemStack)(p0)))) ? 1 : 0);
    }
    if (!((forwardValue4388_43_0 == 0))) {
        break forward_join_46;
    }
    return p0;
    }
    life9_64 = ((moom.DT)(life8_33)).a__DT();
    life10_68 = ((net.minecraft.world.World)(p1)).a__fE(((moom.DT)(life8_33)));
    spill4388_3 = life10_68;
    if (!((life6_11 == 0))) {
        forwardValue4388_61_0 = spill4388_3;
        break forward_join_61;
    }
    if (!((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(spill4388_3)).a__ch())).a__fn() == moom.fn.h))) {
        break forward_join_98;
    }
    forwardValue4388_61_0 = life10_68;
    }
    spill4388_4 = ((java.lang.Integer)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(forwardValue4388_61_0)).a(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockLiquid.Q))))))).intValue();
    if (!((life6_11 == 0))) {
        forwardValue4388_71_0 = spill4388_4;
        break forward_join_71;
    }
    if (!((spill4388_4 == 0))) {
        break forward_join_98;
    }
    forwardValue4388_71_0 = ((((net.minecraft.world.World)(p1)).a__Boolean(((moom.DT)(life9_64)))) ? 1 : 0);
    }
    if (!((life6_11 == 0))) {
        forwardValue4388_85_0 = forwardValue4388_71_0;
        break forward_join_85;
    }
    if (!((forwardValue4388_71_0 != 0))) {
        break forward_join_98;
    }
    ((net.minecraft.world.World)(p1)).a(((moom.DT)(life9_64)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bm)).a__fE())));
    spill4388_5 = p2;
    if (!((life6_11 == 0))) {
        forwardValue4388_93_0 = spill4388_5;
        break forward_join_93;
    }
    forwardValue4388_85_0 = ((((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.entity.player.EntityPlayer)(spill4388_5)).b1)).d) ? 1 : 0);
    }
    if (!((forwardValue4388_85_0 == 0))) {
        break forward_join_92;
    }
    net.minecraft.item.ItemStack __stackOp4388_31_0 = p0;
    ((net.minecraft.item.ItemStack)(__stackOp4388_31_0)).b = ((int)((((net.minecraft.item.ItemStack)(__stackOp4388_31_0)).b - 1)));
    }
    forwardValue4388_93_0 = p2;
    }
    ((net.minecraft.entity.player.EntityPlayer)(forwardValue4388_93_0)).a(((moom.BY)((net.minecraft.stats.StatList.ad)[net.minecraft.item.Item.a(((net.minecraft.item.Item)(this)))])));
    }
    return p0;
}


public int a(net.minecraft.item.ItemStack p0, int p1) {
return ((net.minecraft.block.Block)(net.minecraft.init.Blocks.bm)).d(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bm)).b__fE(((int)(((net.minecraft.item.ItemStack)(p0)).c()))))));
}

}
