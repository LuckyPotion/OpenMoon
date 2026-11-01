package moom;


class Jm implements moom.Jr {

private static final long a;

Jm() {
super();
}


static {
a = (moom._c.a(2785493260511194509L, -5357826638632743935L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(254662096339849L);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public boolean a__Boolean() {
return ((0) != 0);
}


public int a(net.minecraft.block.state.IBlockState p0, net.minecraft.world.IBlockAccess p1, moom.DT p2) {
net.minecraft.world.biome.BiomeGenBase forwardValue2388_23_0;
    int forwardValue2388_25_0;
    net.minecraft.entity.Entity[] spill2388_0;
    net.minecraft.world.biome.BiomeGenBase spill2388_1;
    long life4_3;
    net.minecraft.world.biome.BiomeGenBase life7_8;
    net.minecraft.entity.Entity[] life6_9;
    forward_join_25: {
    forward_join_23: {
    forward_join_22: {
    life4_3 = (moom.Jm.a ^ 76782963158164L);
    spill2388_0 = moom.JM.b__Arrayr3();
    life7_8 = moom.Jl.a__ES(((net.minecraft.world.IBlockAccess)(p1)), ((moom.DT)(p2)));
    life6_9 = spill2388_0;
    if (!((moom.Jl.f != null))) {
        break forward_join_22;
    }
    spill2388_1 = life7_8;
    if (!((life6_9 != null))) {
        forwardValue2388_23_0 = spill2388_1;
        break forward_join_23;
    }
    if (!((spill2388_1 == net.minecraft.world.biome.BiomeGenBase.x))) {
        break forward_join_22;
    }
    forwardValue2388_25_0 = ((moom.Jk)(moom.Jl.f)).a(((net.minecraft.world.biome.BiomeGenBase)(life7_8)), ((moom.DT)(p2)));
    break forward_join_25;
    }
    forwardValue2388_23_0 = life7_8;
    }
    forwardValue2388_25_0 = ((net.minecraft.world.biome.BiomeGenBase)(forwardValue2388_23_0)).a__Int(((moom.DT)(p2)));
    }
    return forwardValue2388_25_0;
}

}
