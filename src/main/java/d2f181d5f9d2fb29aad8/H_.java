package moom;


class H_ extends moom.H9 {

private static final long b;

private H_() {
super();
}


static {
moom.H_.b = (moom._c.a(7068251423493531940L, -4369610674668181404L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(138538823236034L);
}


public void a(java.util.Random p0, int p1, int p2, int p3, boolean p4) {
long life6_3;
    net.minecraft.entity.Entity[] life8_5;
    forward_join_23: {
    forward_join_19: {
    forward_join_17: {
    life6_3 = (moom.H_.b ^ 107466982671342L);
    life8_5 = moom.G4.b();
    if (!((life8_5 != null))) { break forward_join_17; }
    if (!((recovery.source.CarrierOps.fcmpg(((float)(((java.util.Random)(p0)).nextFloat())), ((float)(0x1.99999ap-2f))) < 0))) { break forward_join_19; }
    this.a = ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE()));
    }
    if (!((life8_5 == null))) { break forward_join_23; }
    }
    this.a = ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.Y)).a__fE()));
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}

}
