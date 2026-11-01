package moom;


class Jp implements moom.Jr {

private static final long a;

Jp() {
super();
}


static {
a = (moom._c.a(-2451250544131004559L, 2708152480638276328L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(249131721698191L);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public boolean a__Boolean() {
long local1 = (moom.Jp.a ^ 2388605109861L);
    return ((((moom.Jl.d == null) ? 1 : 0)) != 0);
}


public int a(net.minecraft.block.state.IBlockState p0, net.minecraft.world.IBlockAccess p1, moom.DT p2) {
moom.Jk forwardValue2391_11_0;
    int forwardValue2391_16_0;
    moom.Jk spill2391_0;
    long life4_3;
    net.minecraft.entity.Entity[] life6_5;
    forward_join_16: {
    forward_join_15: {
    forward_join_11: {
    life4_3 = (moom.Jp.a ^ 140120289050415L);
    life6_5 = moom.JM.b__Arrayr3();
    spill2391_0 = moom.Jl.d;
    if (!((life6_5 != null))) {
        forwardValue2391_11_0 = spill2391_0;
        break forward_join_11;
    }
    if (!((spill2391_0 != null))) {
        break forward_join_15;
    }
    forwardValue2391_11_0 = moom.Jl.d;
    }
    forwardValue2391_16_0 = ((moom.Jk)(forwardValue2391_11_0)).a(((net.minecraft.world.IBlockAccess)(p1)), ((moom.DT)(p2)));
    break forward_join_16;
    }
    forwardValue2391_16_0 = moom.Ef.b();
    }
    return forwardValue2391_16_0;
}

}
