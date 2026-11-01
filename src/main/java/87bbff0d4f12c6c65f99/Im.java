package moom;


class Im implements moom.Ik {

private static final long a;

private Im() {
super();
}


static {
a = (moom._c.a(-3142555169657007860L, -4132965207230220644L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(137039620288441L);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public moom.Hs a(moom.bs p0, moom.Il p1, java.util.Random p2) {
((moom.Il)(p1)).d = ((boolean)(true));
    ((moom.Il)((((moom.Il)(p1)).b)[((moom.bs)(moom.bs.EAST)).a()])).d = ((boolean)(true));
    return new moom.Ht(p0, p1, p2);
}


public boolean a(moom.Il p0) {
int forwardValue2208_20_0;
    int forwardValue2208_24_0;
    int forwardValue2208_26_0;
    boolean spill2208_0;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_26: {
    forward_join_25: {
    forward_join_24: {
    forward_join_20: {
    life2_3 = (moom.Im.a ^ 65470907296157L);
    life4_5 = moom.G4.b();
    spill2208_0 = (((moom.Il)(p0)).c)[((moom.bs)(moom.bs.EAST)).a()];
    if (!((life4_5 != null))) {
        forwardValue2208_20_0 = ((spill2208_0) ? 1 : 0);
        break forward_join_20;
    }
    if (!(spill2208_0)) {
        break forward_join_25;
    }
    forwardValue2208_20_0 = ((((moom.Il)((((moom.Il)(p0)).b)[((moom.bs)(moom.bs.EAST)).a()])).d) ? 1 : 0);
    }
    if (!((life4_5 != null))) {
        forwardValue2208_24_0 = forwardValue2208_20_0;
        break forward_join_24;
    }
    if (!((forwardValue2208_20_0 == 0))) {
        break forward_join_25;
    }
    forwardValue2208_24_0 = 1;
    }
    forwardValue2208_26_0 = forwardValue2208_24_0;
    break forward_join_26;
    }
    forwardValue2208_26_0 = 0;
    }
    return ((forwardValue2208_26_0) != 0);
}

}
