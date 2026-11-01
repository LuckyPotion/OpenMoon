package moom;


public class cX extends moom.cT {

private static final long R;

public cX() {
super(moom.fn.s, moom.fm.G);
    (this).c(0x1.8000000000000p+1f);
    (this).a(net.minecraft.creativetab.CreativeTabs.f);
}


static {
R = (moom._c.a(-270206339560488279L, 6972966429699508853L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(117430802217598L);
}


public static void b__sourceReturn_bfedcc9a42(net.minecraft.world.World p0, moom.DT p1) {
((com.google.common.util.concurrent.ListeningExecutorService)(net.minecraft.util.HttpUtil.a)).submit(((java.lang.Runnable)(__sourceIntrinsic_6d923203f1ab_originalDynamicSite1403_1(p0, p1))));
    return;
}


public int c__Int() {
return 3;
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.block.Block p3) {
net.minecraft.tileentity.TileEntity forwardValue3095_16_0;
    int[] spill3095_0;
    net.minecraft.tileentity.TileEntity spill3095_1;
    long life5_3;
    net.minecraft.tileentity.TileEntity life8_8;
    int[] life7_9;
    forward_join_24: {
    forward_join_16: {
    life5_3 = (moom.cX.R ^ 43972940091746L);
    spill3095_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life8_8 = ((net.minecraft.world.World)(p0)).a__B9(((moom.DT)(p1)));
    life7_9 = spill3095_0;
    spill3095_1 = life8_8;
    if (!((life7_9 != null))) {
        forwardValue3095_16_0 = spill3095_1;
        break forward_join_16;
    }
    if (!((((spill3095_1 instanceof net.minecraft.tileentity.TileEntityBeacon) ? 1 : 0) != 0))) {
        break forward_join_24;
    }
    forwardValue3095_16_0 = life8_8;
    }
    ((net.minecraft.tileentity.TileEntityBeacon)(((net.minecraft.tileentity.TileEntityBeacon)(forwardValue3095_16_0)))).g__sourceReturn_da8c82d5d4();
    ((net.minecraft.world.World)(p0)).c(((moom.DT)(p1)), ((net.minecraft.block.Block)(this)), ((int)(1)), ((int)(0)));
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public net.minecraft.util.EnumWorldBlockLayer a__bx() {
return net.minecraft.util.EnumWorldBlockLayer.CUTOUT;
}


public boolean a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.entity.player.EntityPlayer p3, moom.bs p4, float p5, float p6, float p7) {
int forwardValue3097_28_0;
    boolean spill3097_0;
    int spill3097_1;
    long life9_3;
    int[] life11_5;
    net.minecraft.tileentity.TileEntity life12_17;
    forward_join_28: {
    forward_join_27: {
    life9_3 = (moom.cX.R ^ 90445149770868L);
    life11_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3097_0 = ((net.minecraft.world.World)(p0)).G;
    if (!((life11_5 != null))) {
        forwardValue3097_28_0 = ((spill3097_0) ? 1 : 0);
        break forward_join_28;
    }
    if (!((!spill3097_0))) {
        break forward_join_27;
    }
    life12_17 = ((net.minecraft.world.World)(p0)).a__B9(((moom.DT)(p1)));
    spill3097_1 = ((life12_17 instanceof net.minecraft.tileentity.TileEntityBeacon) ? 1 : 0);
    if (!((life11_5 != null))) {
        forwardValue3097_28_0 = spill3097_1;
        break forward_join_28;
    }
    if (!((spill3097_1 != 0))) {
        break forward_join_27;
    }
    ((net.minecraft.entity.player.EntityPlayer)(p3)).a(((net.minecraft.inventory.IInventory)(((net.minecraft.tileentity.TileEntityBeacon)(life12_17)))));
    ((net.minecraft.entity.player.EntityPlayer)(p3)).a(((moom.BY)(net.minecraft.stats.StatList.N)));
    }
    forwardValue3097_28_0 = 1;
    }
    return ((forwardValue3097_28_0) != 0);
}


public net.minecraft.tileentity.TileEntity a(net.minecraft.world.World p0, int p1) {
return new net.minecraft.tileentity.TileEntityBeacon();
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.entity.EntityLivingBase p3, net.minecraft.item.ItemStack p4) {
net.minecraft.tileentity.TileEntity forwardValue3096_26_0;
    int[] spill3096_0;
    net.minecraft.tileentity.TileEntity spill3096_1;
    long life6_3;
    int[] life8_12;
    net.minecraft.tileentity.TileEntity life9_19;
    forward_join_30: {
    forward_join_26: {
    life6_3 = (moom.cX.R ^ 79484882624935L);
    spill3096_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    super.a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((net.minecraft.entity.EntityLivingBase)(p3)), ((net.minecraft.item.ItemStack)(p4)));
    life8_12 = spill3096_0;
    if (!(((net.minecraft.item.ItemStack)(p4)).f__Boolean())) {
        break forward_join_30;
    }
    life9_19 = ((net.minecraft.world.World)(p0)).a__B9(((moom.DT)(p1)));
    spill3096_1 = life9_19;
    if (!((life8_12 != null))) {
        forwardValue3096_26_0 = spill3096_1;
        break forward_join_26;
    }
    if (!((((spill3096_1 instanceof net.minecraft.tileentity.TileEntityBeacon) ? 1 : 0) != 0))) {
        break forward_join_30;
    }
    forwardValue3096_26_0 = life9_19;
    }
    ((net.minecraft.tileentity.TileEntityBeacon)(((net.minecraft.tileentity.TileEntityBeacon)(forwardValue3096_26_0)))).a(((java.lang.String)(((net.minecraft.item.ItemStack)(p4)).b__String())));
    }
    return;
}


public boolean g() {
return ((0) != 0);
}


public boolean j() {
return ((0) != 0);
}


private static void lambda$updateColorAsync$0(net.minecraft.world.World p0, moom.DT p1) {
net.minecraft.tileentity.TileEntity forwardValue3098_16_0;
    int[] spill3098_0;
    net.minecraft.tileentity.TileEntity spill3098_1;
    long life2_3;
    net.minecraft.tileentity.TileEntity life5_8;
    int[] life4_9;
    forward_join_24: {
    forward_join_16: {
    life2_3 = (moom.cX.R ^ 79888173042206L);
    spill3098_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life5_8 = ((net.minecraft.world.World)(p0)).a__B9(((moom.DT)(p1)));
    life4_9 = spill3098_0;
    spill3098_1 = life5_8;
    if (!((life4_9 != null))) {
        forwardValue3098_16_0 = spill3098_1;
        break forward_join_16;
    }
    if (!((((spill3098_1 instanceof net.minecraft.tileentity.TileEntityBeacon) ? 1 : 0) != 0))) {
        break forward_join_24;
    }
    forwardValue3098_16_0 = life5_8;
    }
    ((net.minecraft.tileentity.TileEntityBeacon)(((net.minecraft.tileentity.TileEntityBeacon)(forwardValue3098_16_0)))).g__sourceReturn_da8c82d5d4();
    ((net.minecraft.world.World)(p0)).c(((moom.DT)(p1)), ((net.minecraft.block.Block)(net.minecraft.init.Blocks.bN)), ((int)(1)), ((int)(0)));
    }
    return;
}


private static void lambda$updateColorAsync$1(net.minecraft.world.World p0, moom.DT p1) {
int[] spill1079_0;
    long life2_3;
    net.minecraft.world.chunk.Chunk life5_7;
    int life6_13;
    int[] life4_14;
    moom.DT life7_25;
    net.minecraft.block.state.IBlockState life8_38;
    lexical_join_52: {
    life2_3 = (moom.cX.R ^ 46871181570707L);
    life5_7 = ((net.minecraft.world.World)(p0)).a__Fk(((moom.DT)(p1)));
    spill1079_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life6_13 = (((moom.DT)(p1)).b() - 1);
    life4_14 = spill1079_0;
    lexical_cycle_15: while (true) {
    lexical_join_50: {
    lexical_join_49: {
    lexical_join_32: {
    if (!((life6_13 >= 0))) {
        break lexical_join_52;
    }
    life7_25 = new moom.DT(((moom.DT)(p1)).a(), life6_13, ((moom.DT)(p1)).c());
    if (!((!((net.minecraft.world.chunk.Chunk)(life5_7)).a__Boolean(((moom.DT)(life7_25)))))) {
        break lexical_join_32;
    }
    if (!((life4_14 == null))) {
        break lexical_join_52;
    }
    }
    life8_38 = ((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life7_25)));
    if (!((life4_14 != null))) {
        break lexical_join_50;
    }
    if (!((((net.minecraft.block.state.IBlockState)(life8_38)).a__ch() == net.minecraft.init.Blocks.bN))) {
        break lexical_join_49;
    }
    ((net.minecraft.world.WorldServer)(((net.minecraft.world.WorldServer)(p0)))).a(((java.lang.Runnable)(__sourceIntrinsic_d596e4c7f7a9_invokedynamic1079_11(p0, life7_25))));
    }
    life6_13 += -1;
    }
    if (!((life4_14 == null))) { continue lexical_cycle_15; }
    break lexical_cycle_15;
    }
    }
    return;
}


private static native <E extends Throwable> java.lang.Runnable __sourceIntrinsic_6d923203f1ab_originalDynamicSite1403_1(net.minecraft.world.World a0, moom.DT a1) throws E;

private static native <E extends Throwable> java.lang.Runnable __sourceIntrinsic_d596e4c7f7a9_invokedynamic1079_11(net.minecraft.world.World a0, moom.DT a1) throws E;
}
