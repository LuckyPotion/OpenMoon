package moom;


class Io implements moom.Ik {

private static final long a;

private Io() {
super();
}


static {
a = (moom._c.a(-3792634578068737203L, -3738202315555128427L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(273499208199249L);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public moom.Hs a(moom.bs p0, moom.Il p1, java.util.Random p2) {
((moom.Il)(p1)).d = ((boolean)(true));
    ((moom.Il)((((moom.Il)(p1)).b)[((moom.bs)(moom.bs.UP)).a()])).d = ((boolean)(true));
    return new moom.Hv(p0, p1, p2);
}


public boolean a(moom.Il p0) {
int forwardValue2210_20_0;
    int forwardValue2210_24_0;
    int forwardValue2210_26_0;
    boolean spill2210_0;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_26: {
    forward_join_25: {
    forward_join_24: {
    forward_join_20: {
    life2_3 = (moom.Io.a ^ 53868671329897L);
    life4_5 = moom.G4.b();
    spill2210_0 = (((moom.Il)(p0)).c)[((moom.bs)(moom.bs.UP)).a()];
    if (!((life4_5 != null))) {
        forwardValue2210_20_0 = ((spill2210_0) ? 1 : 0);
        break forward_join_20;
    }
    if (!(spill2210_0)) {
        break forward_join_25;
    }
    forwardValue2210_20_0 = ((((moom.Il)((((moom.Il)(p0)).b)[((moom.bs)(moom.bs.UP)).a()])).d) ? 1 : 0);
    }
    if (!((life4_5 != null))) {
        forwardValue2210_24_0 = forwardValue2210_20_0;
        break forward_join_24;
    }
    if (!((forwardValue2210_20_0 == 0))) {
        break forward_join_25;
    }
    forwardValue2210_24_0 = 1;
    }
    forwardValue2210_26_0 = forwardValue2210_24_0;
    break forward_join_26;
    }
    forwardValue2210_26_0 = 0;
    }
    return ((forwardValue2210_26_0) != 0);
}

}
