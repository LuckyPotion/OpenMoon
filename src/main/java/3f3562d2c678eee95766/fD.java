package moom;


public class fD {

private final net.minecraft.world.World a;

private final moom.DT b;

private final boolean c;

private net.minecraft.block.state.IBlockState d;

private net.minecraft.tileentity.TileEntity e;

private boolean f;

private static final long g;

public fD(net.minecraft.world.World p0, moom.DT p1, boolean p2) {
super();
    this.a = p0;
    this.b = p1;
    this.c = p2;
}


static {
g = (moom._c.a(5508314628684941709L, 8329459595062463364L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(56737486358198L);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public static com.google.common.base.Predicate<moom.fD> a(com.google.common.base.Predicate<net.minecraft.block.state.IBlockState> p0) {
return __sourceIntrinsic_111ab68dd83a_originalDynamicSite1434_0(p0);
}


public net.minecraft.block.state.IBlockState a__fE() {
moom.fD forwardValue3528_25_0;
    moom.fD forwardValue3528_32_0;
    net.minecraft.block.state.IBlockState forwardValue3528_33_0;
    net.minecraft.block.state.IBlockState spill3528_0;
    moom.fD spill3528_1;
    moom.fD spill3528_2;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_33: {
    forward_join_32: {
    forward_join_31: {
    forward_join_25: {
    forward_join_24: {
    life1_3 = (moom.fD.g ^ 115686717152634L);
    life3_5 = moom.fA.b();
    spill3528_0 = this.d;
    if (!((life3_5 == null))) {
        forwardValue3528_33_0 = spill3528_0;
        break forward_join_33;
    }
    if (!((spill3528_0 == null))) {
        break forward_join_31;
    }
    spill3528_1 = this;
    if (!((life3_5 == null))) {
        forwardValue3528_25_0 = spill3528_1;
        break forward_join_25;
    }
    if (!((!((moom.fD)(spill3528_1)).c))) {
        break forward_join_24;
    }
    spill3528_2 = this;
    if (!((life3_5 == null))) {
        forwardValue3528_32_0 = spill3528_2;
        break forward_join_32;
    }
    if (!(((net.minecraft.world.World)(((moom.fD)(spill3528_2)).a)).c__Boolean(((moom.DT)(this.b))))) {
        break forward_join_31;
    }
    }
    forwardValue3528_25_0 = this;
    }
    ((moom.fD)(forwardValue3528_25_0)).d = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(this.a)).a__fE(((moom.DT)(this.b)))));
    }
    forwardValue3528_32_0 = this;
    }
    forwardValue3528_33_0 = ((moom.fD)(forwardValue3528_32_0)).d;
    }
    return forwardValue3528_33_0;
}


public net.minecraft.tileentity.TileEntity a() {
moom.fD forwardValue3527_27_0;
    net.minecraft.tileentity.TileEntity forwardValue3527_28_0;
    net.minecraft.tileentity.TileEntity spill3527_0;
    moom.fD spill3527_1;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_28: {
    forward_join_27: {
    forward_join_26: {
    life1_3 = (moom.fD.g ^ 27181961436168L);
    life3_5 = moom.fA.b();
    spill3527_0 = this.e;
    if (!((life3_5 == null))) {
        forwardValue3527_28_0 = spill3527_0;
        break forward_join_28;
    }
    if (!((spill3527_0 == null))) {
        break forward_join_26;
    }
    spill3527_1 = this;
    if (!((life3_5 == null))) {
        forwardValue3527_27_0 = spill3527_1;
        break forward_join_27;
    }
    if (!((!((moom.fD)(spill3527_1)).f))) {
        break forward_join_26;
    }
    this.e = ((net.minecraft.tileentity.TileEntity)(((net.minecraft.world.World)(this.a)).a__B9(((moom.DT)(this.b)))));
    this.f = ((boolean)(true));
    }
    forwardValue3527_27_0 = this;
    }
    forwardValue3527_28_0 = ((moom.fD)(forwardValue3527_27_0)).e;
    }
    return forwardValue3527_28_0;
}


public moom.DT a__DT() {
return this.b;
}


private static boolean lambda$hasState$0(com.google.common.base.Predicate p0, moom.fD p1) {
int forwardValue3529_16_0;
    int forwardValue3529_18_0;
    boolean spill3529_0;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_18: {
    forward_join_17: {
    forward_join_16: {
    life2_3 = (moom.fD.g ^ 115300555932190L);
    life4_5 = moom.fA.b();
    if (!((p1 != null))) {
        break forward_join_17;
    }
    spill3529_0 = ((com.google.common.base.Predicate)(p0)).apply(((java.lang.Object)(((moom.fD)(p1)).a__fE())));
    if (!((life4_5 == null))) {
        forwardValue3529_16_0 = ((spill3529_0) ? 1 : 0);
        break forward_join_16;
    }
    if (!(spill3529_0)) {
        break forward_join_17;
    }
    forwardValue3529_16_0 = 1;
    }
    forwardValue3529_18_0 = forwardValue3529_16_0;
    break forward_join_18;
    }
    forwardValue3529_18_0 = 0;
    }
    return ((forwardValue3529_18_0) != 0);
}


private static native <E extends Throwable> com.google.common.base.Predicate __sourceIntrinsic_111ab68dd83a_originalDynamicSite1434_0(com.google.common.base.Predicate a0) throws E;
}
