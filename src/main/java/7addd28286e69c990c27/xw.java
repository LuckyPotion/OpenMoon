package moom;


public class xw extends net.minecraft.item.Item {

protected moom.a4 n;

private static final long o;

public xw(moom.a4 p0) {
super();
    this.n = p0;
    this.f = 1;
    (this).c((p0).a__Int());
    (this).a(net.minecraft.creativetab.CreativeTabs.i);
}


static {
o = (moom._c.a(-5666728399164432644L, -7792322959277369400L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(12260324261781L);
}


public java.lang.String b__sourceReturn_0e30dfc966() {
return ((moom.a4)(this.n)).toString();
}


public boolean c__Boolean() {
return ((1) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public boolean a(net.minecraft.item.ItemStack p0, net.minecraft.entity.player.EntityPlayer p1, net.minecraft.world.World p2, moom.DT p3, moom.bs p4, float p5, float p6, float p7) {
int forwardValue427_17_0;
    net.minecraft.block.Block forwardValue427_39_0;
    net.minecraft.block.Block forwardValue427_54_0;
    net.minecraft.block.Block forwardValue427_54_1;
    int forwardValue427_87_0;
    boolean spill427_0;
    net.minecraft.block.Block spill427_1;
    moom.dC spill427_2;
    int spill427_3;
    long life9_3;
    int life11_5;
    net.minecraft.block.state.IBlockState life12_24;
    net.minecraft.block.Block life13_27;
    forward_join_87: {
    forward_join_86: {
    forward_join_74: {
    forward_join_65: {
    forward_join_54: {
    forward_join_52: {
    forward_join_39: {
    forward_join_18: {
    forward_join_17: {
    life9_3 = (moom.xw.o ^ 66309439462378L);
    life11_5 = ((net.minecraft.item.ItemStack.m()) ? 1 : 0);
    spill427_0 = ((net.minecraft.entity.player.EntityPlayer)(p1)).a(((moom.DT)(((moom.DT)(p3)).a(((moom.bs)(p4))))), ((moom.bs)(p4)), ((net.minecraft.item.ItemStack)(p0)));
    if (!((life11_5 != 0))) {
        forwardValue427_17_0 = ((spill427_0) ? 1 : 0);
        break forward_join_17;
    }
    if (!((!spill427_0))) {
        break forward_join_18;
    }
    forwardValue427_17_0 = 0;
    }
    return ((forwardValue427_17_0) != 0);
    }
    life12_24 = ((net.minecraft.world.World)(p2)).a__fE(((moom.DT)(p3)));
    life13_27 = ((net.minecraft.block.state.IBlockState)(life12_24)).a__ch();
    if (!((p4 != moom.bs.DOWN))) {
        break forward_join_86;
    }
    spill427_1 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p2)).a__fE(((moom.DT)(((moom.DT)(p3)).a__DT()))))).a__ch();
    if (!((life11_5 != 0))) {
        forwardValue427_39_0 = spill427_1;
        break forward_join_39;
    }
    if (!((((net.minecraft.block.Block)(spill427_1)).a__fn() == moom.fn.a))) {
        break forward_join_86;
    }
    forwardValue427_39_0 = life13_27;
    }
    spill427_2 = net.minecraft.init.Blocks.c;
    if (!((life11_5 != 0))) {
        forwardValue427_54_0 = forwardValue427_39_0;
        forwardValue427_54_1 = spill427_2;
        break forward_join_54;
    }
    if (!((forwardValue427_39_0 == spill427_2))) {
        break forward_join_52;
    }
    return ((moom.xw)(this)).a(((net.minecraft.item.ItemStack)(p0)), ((net.minecraft.entity.player.EntityPlayer)(p1)), ((net.minecraft.world.World)(p2)), ((moom.DT)(p3)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ak)).a__fE())));
    }
    forwardValue427_54_0 = life13_27;
    forwardValue427_54_1 = net.minecraft.init.Blocks.d;
    }
    if (!((forwardValue427_54_0 == forwardValue427_54_1))) {
        break forward_join_86;
    }
    spill427_3 = (moom.xV.a)[((net.minecraft.block.BlockDirt$DirtType)(((net.minecraft.block.BlockDirt$DirtType)(((net.minecraft.block.state.IBlockState)(life12_24)).a(((net.minecraft.block.properties.IProperty)(moom.dq.Q))))))).ordinal()];
    if (!((life11_5 != 0))) {
        forwardValue427_87_0 = spill427_3;
        break forward_join_87;
    }
    switch (spill427_3) {
case 1:
{
        break forward_join_65;
    }
case 2:
{
        break forward_join_74;
    }
default:
{
        break forward_join_86;
    }
}
    }
    return ((moom.xw)(this)).a(((net.minecraft.item.ItemStack)(p0)), ((net.minecraft.entity.player.EntityPlayer)(p1)), ((net.minecraft.world.World)(p2)), ((moom.DT)(p3)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ak)).a__fE())));
    }
    return ((moom.xw)(this)).a(((net.minecraft.item.ItemStack)(p0)), ((net.minecraft.entity.player.EntityPlayer)(p1)), ((net.minecraft.world.World)(p2)), ((moom.DT)(p3)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.d)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.dq.Q)), ((java.lang.Comparable)(net.minecraft.block.BlockDirt$DirtType.DIRT))))));
    }
    forwardValue427_87_0 = 0;
    }
    return ((forwardValue427_87_0) != 0);
}


protected boolean a(net.minecraft.item.ItemStack p0, net.minecraft.entity.player.EntityPlayer p1, net.minecraft.world.World p2, moom.DT p3, net.minecraft.block.state.IBlockState p4) {
int forwardValue4546_59_0;
    boolean spill4546_0;
    boolean spill4546_1;
    long life6_3;
    int life8_43;
    forward_join_59: {
    forward_join_58: {
    life6_3 = (moom.xw.o ^ 115173725711376L);
    spill4546_0 = net.minecraft.item.ItemStack.m();
    ((net.minecraft.world.World)(p2)).a(((double)(((double) (((float) ((moom.DT)(p3)).a()) + 0x1.0p-1f)))), ((double)(((double) (((float) ((moom.DT)(p3)).b()) + 0x1.0p-1f)))), ((double)(((double) (((float) ((moom.DT)(p3)).c()) + 0x1.0p-1f)))), ((java.lang.String)(((moom.eJ)(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(p4)).a__ch())).H)).b__String())), ((float)(((((moom.eJ)(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(p4)).a__ch())).H)).a() + 0x1.0p0f) / 0x1.0p1f))), ((float)((((moom.eJ)(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(p4)).a__ch())).H)).b() * 0x1.99999ap-1f))));
    life8_43 = ((spill4546_0) ? 1 : 0);
    spill4546_1 = ((net.minecraft.world.World)(p2)).G;
    if (!((life8_43 != 0))) {
        forwardValue4546_59_0 = ((spill4546_1) ? 1 : 0);
        break forward_join_59;
    }
    if (!((!spill4546_1))) {
        break forward_join_58;
    }
    ((net.minecraft.world.World)(p2)).a(((moom.DT)(p3)), ((net.minecraft.block.state.IBlockState)(p4)));
    ((net.minecraft.item.ItemStack)(p0)).a(((int)(1)), ((net.minecraft.entity.EntityLivingBase)(p1)));
    }
    forwardValue4546_59_0 = 1;
    }
    return ((forwardValue4546_59_0) != 0);
}


public moom.a4 a__sourceReturn_fdbc2aadd1() {
return this.n;
}

}
