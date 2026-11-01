package moom;


class In implements moom.Ik {

private static final long a;

private In() {
super();
}


static {
a = (moom._c.a(254185764696727845L, 4122648192406363013L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(193394362067960L);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public moom.Hs a(moom.bs p0, moom.Il p1, java.util.Random p2) {
((moom.Il)(p1)).d = ((boolean)(true));
    ((moom.Il)((((moom.Il)(p1)).b)[((moom.bs)(moom.bs.EAST)).a()])).d = ((boolean)(true));
    ((moom.Il)((((moom.Il)(p1)).b)[((moom.bs)(moom.bs.UP)).a()])).d = ((boolean)(true));
    ((moom.Il)((((moom.Il)((((moom.Il)(p1)).b)[((moom.bs)(moom.bs.EAST)).a()])).b)[((moom.bs)(moom.bs.UP)).a()])).d = ((boolean)(true));
    return new moom.Hu(p0, p1, p2);
}


public boolean a(moom.Il p0) {
int forwardValue2209_60_0;
    int forwardValue2209_64_0;
    int forwardValue2209_66_0;
    int forwardValue2209_68_0;
    boolean spill2209_0;
    boolean spill2209_1;
    boolean spill2209_2;
    boolean spill2209_3;
    boolean spill2209_4;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    moom.Il life5_66;
    forward_join_68: {
    forward_join_67: {
    forward_join_66: {
    forward_join_65: {
    forward_join_64: {
    forward_join_60: {
    life2_3 = (moom.In.a ^ 47628636127923L);
    life4_5 = moom.G4.b();
    spill2209_0 = (((moom.Il)(p0)).c)[((moom.bs)(moom.bs.EAST)).a()];
    if (!((life4_5 != null))) {
        forwardValue2209_68_0 = ((spill2209_0) ? 1 : 0);
        break forward_join_68;
    }
    if (!(spill2209_0)) {
        break forward_join_67;
    }
    spill2209_1 = ((moom.Il)((((moom.Il)(p0)).b)[((moom.bs)(moom.bs.EAST)).a()])).d;
    if (!((life4_5 != null))) {
        forwardValue2209_68_0 = ((spill2209_1) ? 1 : 0);
        break forward_join_68;
    }
    if (!((!spill2209_1))) {
        break forward_join_67;
    }
    spill2209_2 = (((moom.Il)(p0)).c)[((moom.bs)(moom.bs.UP)).a()];
    if (!((life4_5 != null))) {
        forwardValue2209_68_0 = ((spill2209_2) ? 1 : 0);
        break forward_join_68;
    }
    if (!(spill2209_2)) {
        break forward_join_67;
    }
    spill2209_3 = ((moom.Il)((((moom.Il)(p0)).b)[((moom.bs)(moom.bs.UP)).a()])).d;
    if (!((life4_5 != null))) {
        forwardValue2209_68_0 = ((spill2209_3) ? 1 : 0);
        break forward_join_68;
    }
    if (!((!spill2209_3))) {
        break forward_join_67;
    }
    life5_66 = (((moom.Il)(p0)).b)[((moom.bs)(moom.bs.EAST)).a()];
    spill2209_4 = (((moom.Il)(life5_66)).c)[((moom.bs)(moom.bs.UP)).a()];
    if (!((life4_5 != null))) {
        forwardValue2209_60_0 = ((spill2209_4) ? 1 : 0);
        break forward_join_60;
    }
    if (!(spill2209_4)) {
        break forward_join_65;
    }
    forwardValue2209_60_0 = ((((moom.Il)((((moom.Il)(life5_66)).b)[((moom.bs)(moom.bs.UP)).a()])).d) ? 1 : 0);
    }
    if (!((life4_5 != null))) {
        forwardValue2209_64_0 = forwardValue2209_60_0;
        break forward_join_64;
    }
    if (!((forwardValue2209_60_0 == 0))) {
        break forward_join_65;
    }
    forwardValue2209_64_0 = 1;
    }
    forwardValue2209_66_0 = forwardValue2209_64_0;
    break forward_join_66;
    }
    forwardValue2209_66_0 = 0;
    }
    return ((forwardValue2209_66_0) != 0);
    }
    forwardValue2209_68_0 = 0;
    }
    return ((forwardValue2209_68_0) != 0);
}

}
