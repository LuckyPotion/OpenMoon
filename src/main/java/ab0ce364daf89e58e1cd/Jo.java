package moom;


class Jo implements moom.Jr {

private static final long a;

Jo() {
super();
}


static {
a = (moom._c.a(2515728601635533149L, -4533536846322104064L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(188539117464000L);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public boolean a__Boolean() {
long local1 = (moom.Jo.a ^ 82411055975248L);
    return ((((moom.Jl.c == null) ? 1 : 0)) != 0);
}


public int a(net.minecraft.block.state.IBlockState p0, net.minecraft.world.IBlockAccess p1, moom.DT p2) {
moom.Jk forwardValue2390_11_0;
    int forwardValue2390_16_0;
    moom.Jk spill2390_0;
    long life4_3;
    net.minecraft.entity.Entity[] life6_5;
    forward_join_16: {
    forward_join_15: {
    forward_join_11: {
    life4_3 = (moom.Jo.a ^ 61227951714842L);
    life6_5 = moom.JM.b__Arrayr3();
    spill2390_0 = moom.Jl.c;
    if (!((life6_5 != null))) {
        forwardValue2390_11_0 = spill2390_0;
        break forward_join_11;
    }
    if (!((spill2390_0 != null))) {
        break forward_join_15;
    }
    forwardValue2390_11_0 = moom.Jl.c;
    }
    forwardValue2390_16_0 = ((moom.Jk)(forwardValue2390_11_0)).a(((net.minecraft.world.IBlockAccess)(p1)), ((moom.DT)(p2)));
    break forward_join_16;
    }
    forwardValue2390_16_0 = moom.Ef.a();
    }
    return forwardValue2390_16_0;
}

}
