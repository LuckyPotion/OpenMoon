package moom;


class Iq implements moom.Ik {

private static final long a;

private Iq() {
super();
}


static {
a = (moom._c.a(5184837151848828228L, -3196966692966020644L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(115680579746473L);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public moom.Hs a(moom.bs p0, moom.Il p1, java.util.Random p2) {
moom.Il forwardValue2213_30_0;
    moom.Il forwardValue2213_39_0;
    net.minecraft.entity.Entity[] spill2213_0;
    moom.Il spill2213_1;
    moom.Il spill2213_2;
    long life4_3;
    moom.Il life7_6;
    net.minecraft.entity.Entity[] life6_7;
    forward_join_39: {
    forward_join_31: {
    forward_join_30: {
    forward_join_25: {
    life4_3 = (moom.Iq.a ^ 68077183040002L);
    spill2213_0 = moom.G4.b();
    life7_6 = p1;
    life6_7 = spill2213_0;
    spill2213_1 = p1;
    if (!((life6_7 != null))) {
        forwardValue2213_30_0 = spill2213_1;
        break forward_join_30;
    }
    if (!((((moom.Il)(spill2213_1)).c)[((moom.bs)(moom.bs.NORTH)).a()])) {
        break forward_join_25;
    }
    spill2213_2 = (((moom.Il)(p1)).b)[((moom.bs)(moom.bs.NORTH)).a()];
    if (!((life6_7 != null))) {
        forwardValue2213_39_0 = spill2213_2;
        break forward_join_39;
    }
    if (!(((moom.Il)(spill2213_2)).d)) {
        break forward_join_31;
    }
    }
    forwardValue2213_30_0 = (((moom.Il)(p1)).b)[((moom.bs)(moom.bs.SOUTH)).a()];
    }
    life7_6 = forwardValue2213_30_0;
    }
    ((moom.Il)(life7_6)).d = ((boolean)(true));
    forwardValue2213_39_0 = (((moom.Il)(life7_6)).b)[((moom.bs)(moom.bs.NORTH)).a()];
    }
    ((moom.Il)(forwardValue2213_39_0)).d = ((boolean)(true));
    return new moom.Hx(p0, life7_6, p2);
}


public boolean a(moom.Il p0) {
int forwardValue2212_20_0;
    int forwardValue2212_24_0;
    int forwardValue2212_26_0;
    boolean spill2212_0;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_26: {
    forward_join_25: {
    forward_join_24: {
    forward_join_20: {
    life2_3 = (moom.Iq.a ^ 101498097509228L);
    life4_5 = moom.G4.b();
    spill2212_0 = (((moom.Il)(p0)).c)[((moom.bs)(moom.bs.NORTH)).a()];
    if (!((life4_5 != null))) {
        forwardValue2212_20_0 = ((spill2212_0) ? 1 : 0);
        break forward_join_20;
    }
    if (!(spill2212_0)) {
        break forward_join_25;
    }
    forwardValue2212_20_0 = ((((moom.Il)((((moom.Il)(p0)).b)[((moom.bs)(moom.bs.NORTH)).a()])).d) ? 1 : 0);
    }
    if (!((life4_5 != null))) {
        forwardValue2212_24_0 = forwardValue2212_20_0;
        break forward_join_24;
    }
    if (!((forwardValue2212_20_0 == 0))) {
        break forward_join_25;
    }
    forwardValue2212_24_0 = 1;
    }
    forwardValue2212_26_0 = forwardValue2212_24_0;
    break forward_join_26;
    }
    forwardValue2212_26_0 = 0;
    }
    return ((forwardValue2212_26_0) != 0);
}

}
