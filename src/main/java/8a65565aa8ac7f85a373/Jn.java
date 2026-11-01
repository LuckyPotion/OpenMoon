package moom;


class Jn implements moom.Jr {

private static final long a;

Jn() {
super();
}


static {
a = (moom._c.a(-1905104672105230140L, -3075729848067286492L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(121436898813015L);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public boolean a__Boolean() {
return ((0) != 0);
}


public int a(net.minecraft.block.state.IBlockState p0, net.minecraft.world.IBlockAccess p1, moom.DT p2) {
net.minecraft.world.biome.BiomeGenBase forwardValue2389_23_0;
    int forwardValue2389_25_0;
    net.minecraft.entity.Entity[] spill2389_0;
    net.minecraft.world.biome.BiomeGenBase spill2389_1;
    long life4_3;
    net.minecraft.world.biome.BiomeGenBase life7_8;
    net.minecraft.entity.Entity[] life6_9;
    forward_join_25: {
    forward_join_23: {
    forward_join_22: {
    life4_3 = (moom.Jn.a ^ 71293989357290L);
    spill2389_0 = moom.JM.b__Arrayr3();
    life7_8 = moom.Jl.a__ES(((net.minecraft.world.IBlockAccess)(p1)), ((moom.DT)(p2)));
    life6_9 = spill2389_0;
    if (!((moom.Jl.e != null))) {
        break forward_join_22;
    }
    spill2389_1 = life7_8;
    if (!((life6_9 != null))) {
        forwardValue2389_23_0 = spill2389_1;
        break forward_join_23;
    }
    if (!((spill2389_1 == net.minecraft.world.biome.BiomeGenBase.x))) {
        break forward_join_22;
    }
    forwardValue2389_25_0 = ((moom.Jk)(moom.Jl.e)).a(((net.minecraft.world.biome.BiomeGenBase)(life7_8)), ((moom.DT)(p2)));
    break forward_join_25;
    }
    forwardValue2389_23_0 = life7_8;
    }
    forwardValue2389_25_0 = ((net.minecraft.world.biome.BiomeGenBase)(forwardValue2389_23_0)).b(((moom.DT)(p2)));
    }
    return forwardValue2389_25_0;
}

}
