package moom;


public class xB extends net.minecraft.item.Item {

private static final moom.rx n;

private final net.minecraft.entity.item.EntityMinecart$EnumMinecartType o;

private static final long p;

public xB(net.minecraft.entity.item.EntityMinecart$EnumMinecartType p0) {
super();
    this.f = 1;
    this.o = p0;
    (this).a(net.minecraft.creativetab.CreativeTabs.e);
    (moom.c2.T).a(this, moom.xB.n);
}


static {
p = (moom._c.a(-466417604705673125L, 8824848343972356441L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(9793290975392L);
    n = new moom.rw();
}


public boolean a(net.minecraft.item.ItemStack p0, net.minecraft.entity.player.EntityPlayer p1, net.minecraft.world.World p2, moom.DT p3, moom.bs p4, float p5, float p6, float p7) {
net.minecraft.block.state.IBlockState forwardValue4478_27_0;
    net.minecraft.block.BlockRailBase$EnumRailDirection forwardValue4478_35_0;
    int forwardValue4478_77_0;
    int forwardValue4478_85_0;
    int forwardValue4478_87_0;
    boolean spill4478_0;
    boolean spill4478_1;
    boolean spill4478_2;
    net.minecraft.block.state.IBlockState spill4478_3;
    boolean spill4478_4;
    long life9_3;
    net.minecraft.block.state.IBlockState life12_8;
    int life11_9;
    net.minecraft.block.BlockRailBase$EnumRailDirection life13_53;
    double life14_55;
    net.minecraft.entity.item.EntityMinecart life16_82;
    forward_join_87: {
    forward_join_86: {
    forward_join_85: {
    forward_join_78: {
    forward_join_77: {
    forward_join_74: {
    forward_join_43: {
    forward_join_35: {
    forward_join_34: {
    forward_join_27: {
    life9_3 = (moom.xB.p ^ 44426683228644L);
    spill4478_0 = net.minecraft.item.ItemStack.l();
    life12_8 = ((net.minecraft.world.World)(p2)).a__fE(((moom.DT)(p3)));
    life11_9 = ((spill4478_0) ? 1 : 0);
    spill4478_1 = __sourceIntrinsic_integerToBoolean(moom.d2.a(((net.minecraft.block.state.IBlockState)(life12_8))));
    if (!((life11_9 == 0))) {
        forwardValue4478_87_0 = ((spill4478_1) ? 1 : 0);
        break forward_join_87;
    }
    if (!(spill4478_1)) {
        break forward_join_86;
    }
    spill4478_2 = ((net.minecraft.world.World)(p2)).G;
    if (!((life11_9 == 0))) {
        forwardValue4478_85_0 = ((spill4478_2) ? 1 : 0);
        break forward_join_85;
    }
    if (!((!spill4478_2))) {
        break forward_join_78;
    }
    spill4478_3 = life12_8;
    if (!((life11_9 == 0))) {
        forwardValue4478_27_0 = spill4478_3;
        break forward_join_27;
    }
    if (!((((((net.minecraft.block.state.IBlockState)(spill4478_3)).a__ch() instanceof moom.d2) ? 1 : 0) != 0))) {
        break forward_join_34;
    }
    forwardValue4478_27_0 = life12_8;
    }
    forwardValue4478_35_0 = ((net.minecraft.block.BlockRailBase$EnumRailDirection)(((net.minecraft.block.state.IBlockState)(forwardValue4478_27_0)).a(((net.minecraft.block.properties.IProperty)(((moom.d2)(((moom.d2)(((net.minecraft.block.state.IBlockState)(life12_8)).a__ch())))).a__ft())))));
    break forward_join_35;
    }
    forwardValue4478_35_0 = net.minecraft.block.BlockRailBase$EnumRailDirection.NORTH_SOUTH;
    }
    life13_53 = forwardValue4478_35_0;
    life14_55 = 0x0.0p0d;
    if (!(((net.minecraft.block.BlockRailBase$EnumRailDirection)(life13_53)).a__Boolean())) {
        break forward_join_43;
    }
    life14_55 = 0x1.0p-1d;
    }
    life16_82 = net.minecraft.entity.item.EntityMinecart.a(((net.minecraft.world.World)(p2)), ((double)((((double) ((moom.DT)(p3)).a()) + 0x1.0p-1d))), ((double)(((((double) ((moom.DT)(p3)).b()) + 0x1.0p-4d) + life14_55))), ((double)((((double) ((moom.DT)(p3)).c()) + 0x1.0p-1d))), ((net.minecraft.entity.item.EntityMinecart$EnumMinecartType)(this.o)));
    spill4478_4 = ((net.minecraft.item.ItemStack)(p0)).f__Boolean();
    if (!((life11_9 == 0))) {
        forwardValue4478_77_0 = ((spill4478_4) ? 1 : 0);
        break forward_join_77;
    }
    if (!(spill4478_4)) {
        break forward_join_74;
    }
    ((net.minecraft.entity.item.EntityMinecart)(life16_82)).a(((java.lang.String)(((net.minecraft.item.ItemStack)(p0)).b__String())));
    }
    forwardValue4478_77_0 = ((((net.minecraft.world.World)(p2)).b__Boolean(((net.minecraft.entity.Entity)(life16_82)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue4478_77_0);
    }
    net.minecraft.item.ItemStack __stackOp4478_29_0 = p0;
    ((net.minecraft.item.ItemStack)(__stackOp4478_29_0)).b = ((int)((((net.minecraft.item.ItemStack)(__stackOp4478_29_0)).b - 1)));
    forwardValue4478_85_0 = 1;
    }
    return ((forwardValue4478_85_0) != 0);
    }
    forwardValue4478_87_0 = 0;
    }
    return ((forwardValue4478_87_0) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
