package moom;


class Jq implements moom.Jr {

private static final long a;

Jq() {
super();
}


static {
a = (moom._c.a(226811366053492588L, 1471430665202727645L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(163419865898358L);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public boolean a__Boolean() {
return ((0) != 0);
}


public int a(net.minecraft.block.state.IBlockState p0, net.minecraft.world.IBlockAccess p1, moom.DT p2) {
moom.Jk forwardValue2392_15_0;
    int forwardValue2392_21_0;
    net.minecraft.entity.Entity[] spill2392_0;
    moom.Jk spill2392_1;
    long life4_3;
    net.minecraft.world.biome.BiomeGenBase life7_8;
    net.minecraft.entity.Entity[] life6_9;
    forward_join_21: {
    forward_join_19: {
    forward_join_15: {
    life4_3 = (moom.Jq.a ^ 107918647425367L);
    spill2392_0 = moom.JM.b__Arrayr3();
    life7_8 = moom.Jl.a__ES(((net.minecraft.world.IBlockAccess)(p1)), ((moom.DT)(p2)));
    life6_9 = spill2392_0;
    spill2392_1 = moom.Jl.b;
    if (!((life6_9 != null))) {
        forwardValue2392_15_0 = spill2392_1;
        break forward_join_15;
    }
    if (!((spill2392_1 != null))) {
        break forward_join_19;
    }
    forwardValue2392_15_0 = moom.Jl.b;
    }
    forwardValue2392_21_0 = ((moom.Jk)(forwardValue2392_15_0)).a(((net.minecraft.world.biome.BiomeGenBase)(life7_8)), ((moom.DT)(p2)));
    break forward_join_21;
    }
    forwardValue2392_21_0 = ((net.minecraft.world.biome.BiomeGenBase)(life7_8)).at;
    }
    return forwardValue2392_21_0;
}

}
