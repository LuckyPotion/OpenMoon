package moom;


public class xH extends net.minecraft.item.Item {

private final net.minecraft.block.Block n;

private static final long o;

public xH(net.minecraft.block.Block p0) {
super();
    this.n = p0;
}


static {
o = (moom._c.a(-6515082643054326756L, -5436782054800812128L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(120487880840943L);
}


public boolean a(net.minecraft.item.ItemStack p0, net.minecraft.entity.player.EntityPlayer p1, net.minecraft.world.World p2, moom.DT p3, moom.bs p4, float p5, float p6, float p7) {
net.minecraft.block.Block forwardValue4488_32_0;
    int forwardValue4488_35_0;
    int forwardValue4488_47_0;
    int forwardValue4488_54_0;
    int forwardValue4488_68_0;
    int forwardValue4488_163_0;
    boolean spill4488_0;
    net.minecraft.block.Block spill4488_1;
    int spill4488_2;
    boolean spill4488_3;
    long life9_3;
    net.minecraft.block.state.IBlockState life12_8;
    net.minecraft.block.Block life13_11;
    int life11_12;
    net.minecraft.block.state.IBlockState life14_110;
    net.minecraft.block.state.IBlockState life14_125;
    forward_join_163: {
    forward_join_162: {
    forward_join_160: {
    forward_join_116: {
    forward_join_68: {
    forward_join_59: {
    forward_join_54: {
    forward_join_52: {
    forward_join_47: {
    forward_join_42: {
    forward_join_35: {
    forward_join_32: {
    forward_join_31: {
    life9_3 = (moom.xH.o ^ 109700714255811L);
    spill4488_0 = net.minecraft.item.ItemStack.l();
    life12_8 = ((net.minecraft.world.World)(p2)).a__fE(((moom.DT)(p3)));
    life13_11 = ((net.minecraft.block.state.IBlockState)(life12_8)).a__ch();
    life11_12 = ((spill4488_0) ? 1 : 0);
    spill4488_1 = life13_11;
    if (!((life11_12 == 0))) {
        forwardValue4488_32_0 = spill4488_1;
        break forward_join_32;
    }
    if (!((spill4488_1 == net.minecraft.init.Blocks.aH))) {
        break forward_join_31;
    }
    spill4488_2 = ((java.lang.Integer)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(life12_8)).a(((net.minecraft.block.properties.IProperty)(moom.es.Q))))))).intValue();
    if (!((life11_12 == 0))) {
        forwardValue4488_35_0 = spill4488_2;
        break forward_join_35;
    }
    if (!((spill4488_2 < 1))) {
        break forward_join_31;
    }
    p4 = moom.bs.UP;
    if (!((life11_12 != 0))) {
        break forward_join_42;
    }
    }
    forwardValue4488_32_0 = life13_11;
    }
    forwardValue4488_35_0 = ((((net.minecraft.block.Block)(forwardValue4488_32_0)).a__Boolean(((net.minecraft.world.World)(p2)), ((moom.DT)(p3)))) ? 1 : 0);
    }
    if (!((life11_12 == 0))) {
        forwardValue4488_47_0 = forwardValue4488_35_0;
        break forward_join_47;
    }
    if (!((forwardValue4488_35_0 == 0))) {
        break forward_join_42;
    }
    p3 = ((moom.DT)(p3)).a(((moom.bs)(p4)));
    }
    forwardValue4488_47_0 = ((((net.minecraft.entity.player.EntityPlayer)(p1)).a(((moom.DT)(p3)), ((moom.bs)(p4)), ((net.minecraft.item.ItemStack)(p0)))) ? 1 : 0);
    }
    if (!((life11_12 == 0))) {
        forwardValue4488_54_0 = forwardValue4488_47_0;
        break forward_join_54;
    }
    if (!((forwardValue4488_47_0 == 0))) {
        break forward_join_52;
    }
    return ((0) != 0);
    }
    forwardValue4488_54_0 = ((net.minecraft.item.ItemStack)(p0)).b;
    }
    if (!((life11_12 == 0))) {
        forwardValue4488_68_0 = forwardValue4488_54_0;
        break forward_join_68;
    }
    if (!((forwardValue4488_54_0 == 0))) {
        break forward_join_59;
    }
    return ((0) != 0);
    }
    forwardValue4488_68_0 = ((((net.minecraft.world.World)(p2)).a(((net.minecraft.block.Block)(this.n)), ((moom.DT)(p3)), ((boolean)(false)), ((moom.bs)(p4)), ((net.minecraft.entity.Entity)(null)), ((net.minecraft.item.ItemStack)(p0)))) ? 1 : 0);
    }
    if (!((life11_12 == 0))) {
        forwardValue4488_163_0 = forwardValue4488_68_0;
        break forward_join_163;
    }
    if (!((forwardValue4488_68_0 != 0))) {
        break forward_join_162;
    }
    life14_110 = ((net.minecraft.block.Block)(this.n)).a(((net.minecraft.world.World)(p2)), ((moom.DT)(p3)), ((moom.bs)(p4)), ((float)(p5)), ((float)(p6)), ((float)(p7)), ((int)(0)), ((net.minecraft.entity.EntityLivingBase)(p1)));
    spill4488_3 = ((net.minecraft.world.World)(p2)).a(((moom.DT)(p3)), ((net.minecraft.block.state.IBlockState)(life14_110)), ((int)(3)));
    if (!((life11_12 == 0))) {
        forwardValue4488_163_0 = ((spill4488_3) ? 1 : 0);
        break forward_join_163;
    }
    if (!(spill4488_3)) {
        break forward_join_162;
    }
    life14_125 = ((net.minecraft.world.World)(p2)).a__fE(((moom.DT)(p3)));
    if (!((life11_12 == 0))) {
        break forward_join_160;
    }
    if (!((((net.minecraft.block.state.IBlockState)(life14_125)).a__ch() == this.n))) {
        break forward_join_116;
    }
    moom.wU.a(((net.minecraft.world.World)(p2)), ((net.minecraft.entity.player.EntityPlayer)(p1)), ((moom.DT)(p3)), ((net.minecraft.item.ItemStack)(p0)));
    ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(life14_125)).a__ch())).a(((net.minecraft.world.World)(p2)), ((moom.DT)(p3)), ((net.minecraft.block.state.IBlockState)(life14_125)), ((net.minecraft.entity.EntityLivingBase)(p1)), ((net.minecraft.item.ItemStack)(p0)));
    }
    ((net.minecraft.world.World)(p2)).a(((double)(((double) (((float) ((moom.DT)(p3)).a()) + 0x1.0p-1f)))), ((double)(((double) (((float) ((moom.DT)(p3)).b()) + 0x1.0p-1f)))), ((double)(((double) (((float) ((moom.DT)(p3)).c()) + 0x1.0p-1f)))), ((java.lang.String)(((moom.eJ)(((net.minecraft.block.Block)(this.n)).H)).c())), ((float)(((((moom.eJ)(((net.minecraft.block.Block)(this.n)).H)).a() + 0x1.0p0f) / 0x1.0p1f))), ((float)((((moom.eJ)(((net.minecraft.block.Block)(this.n)).H)).b() * 0x1.99999ap-1f))));
    net.minecraft.item.ItemStack __stackOp4488_45_0 = p0;
    ((net.minecraft.item.ItemStack)(__stackOp4488_45_0)).b = ((int)((((net.minecraft.item.ItemStack)(__stackOp4488_45_0)).b - 1)));
    }
    return ((1) != 0);
    }
    forwardValue4488_163_0 = 0;
    }
    return ((forwardValue4488_163_0) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}

}
