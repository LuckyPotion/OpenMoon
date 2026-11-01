package moom;


class Ia extends moom.H9 {

private static final long b;

private Ia() {
super();
}


static {
b = (moom._c.a(2745296087454482945L, 5301094259599405152L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(258954320354270L);
}


public void a(java.util.Random p0, int p1, int p2, int p3, boolean p4) {
int forwardValue2200_27_0;
    int forwardValue2200_40_0;
    int spill2200_0;
    long life6_3;
    net.minecraft.entity.Entity[] life8_5;
    float life9_10;
    forward_join_59: {
    forward_join_55: {
    forward_join_53: {
    forward_join_49: {
    forward_join_40: {
    forward_join_37: {
    forward_join_27: {
    forward_join_24: {
    life6_3 = (moom.Ia.b ^ 109452585131060L);
    life8_5 = moom.G4.b();
    if (!(p4)) {
        break forward_join_55;
    }
    life9_10 = ((java.util.Random)(p0)).nextFloat();
    spill2200_0 = recovery.source.CarrierOps.fcmpg(((float)(life9_10)), ((float)(0x1.99999ap-3f)));
    if (!((life8_5 != null))) {
        forwardValue2200_27_0 = spill2200_0;
        break forward_join_27;
    }
    if (!((spill2200_0 < 0))) {
        break forward_join_24;
    }
    ((moom.Ia)(this)).a = ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a5)).b__fE(((int)(moom.ey.T)))));
    if (!((life8_5 == null))) {
        break forward_join_53;
    }
    }
    forwardValue2200_27_0 = recovery.source.CarrierOps.fcmpg(((float)(life9_10)), ((float)(0x1.0p-1f)));
    }
    if (!((life8_5 != null))) {
        forwardValue2200_40_0 = forwardValue2200_27_0;
        break forward_join_40;
    }
    if (!((forwardValue2200_27_0 < 0))) {
        break forward_join_37;
    }
    ((moom.Ia)(this)).a = ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a5)).b__fE(((int)(moom.ey.S)))));
    if (!((life8_5 == null))) {
        break forward_join_53;
    }
    }
    forwardValue2200_40_0 = recovery.source.CarrierOps.fcmpg(((float)(life9_10)), ((float)(0x1.19999ap-1f)));
    }
    if (!((forwardValue2200_40_0 < 0))) {
        break forward_join_49;
    }
    ((moom.Ia)(this)).a = ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a4)).b__fE(((int)(((net.minecraft.block.BlockSilverfish$EnumType)(net.minecraft.block.BlockSilverfish$EnumType.STONEBRICK)).a())))));
    if (!((life8_5 == null))) {
        break forward_join_53;
    }
    }
    ((moom.Ia)(this)).a = ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a5)).a__fE()));
    }
    if (!((life8_5 == null))) {
        break forward_join_59;
    }
    }
    ((moom.Ia)(this)).a = ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE()));
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}

}
