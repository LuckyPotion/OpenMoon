package moom;


class Ij implements moom.Ik {

private static final long a;

private Ij() {
super();
}


static {
a = (moom._c.a(5256973630266096964L, -4859236996499989103L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(207144262576328L);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public moom.Hs a(moom.bs p0, moom.Il p1, java.util.Random p2) {
((moom.Il)(p1)).d = ((boolean)(true));
    return new moom.HD(p0, p1, p2);
}


public boolean a(moom.Il p0) {
int forwardValue2203_19_0;
    int forwardValue2203_27_0;
    int forwardValue2203_35_0;
    int forwardValue2203_43_0;
    int forwardValue2203_47_0;
    int forwardValue2203_49_0;
    boolean spill2203_0;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_49: {
    forward_join_48: {
    forward_join_47: {
    forward_join_43: {
    forward_join_35: {
    forward_join_27: {
    forward_join_19: {
    life2_3 = (moom.Ij.a ^ 131535245866353L);
    life4_5 = moom.G4.b();
    spill2203_0 = (((moom.Il)(p0)).c)[((moom.bs)(moom.bs.WEST)).a()];
    if (!((life4_5 != null))) {
        forwardValue2203_19_0 = ((spill2203_0) ? 1 : 0);
        break forward_join_19;
    }
    if (!((!spill2203_0))) {
        break forward_join_48;
    }
    forwardValue2203_19_0 = (((((moom.Il)(p0)).c)[((moom.bs)(moom.bs.EAST)).a()]) ? 1 : 0);
    }
    if (!((life4_5 != null))) {
        forwardValue2203_27_0 = forwardValue2203_19_0;
        break forward_join_27;
    }
    if (!((forwardValue2203_19_0 == 0))) {
        break forward_join_48;
    }
    forwardValue2203_27_0 = (((((moom.Il)(p0)).c)[((moom.bs)(moom.bs.NORTH)).a()]) ? 1 : 0);
    }
    if (!((life4_5 != null))) {
        forwardValue2203_35_0 = forwardValue2203_27_0;
        break forward_join_35;
    }
    if (!((forwardValue2203_27_0 == 0))) {
        break forward_join_48;
    }
    forwardValue2203_35_0 = (((((moom.Il)(p0)).c)[((moom.bs)(moom.bs.SOUTH)).a()]) ? 1 : 0);
    }
    if (!((life4_5 != null))) {
        forwardValue2203_43_0 = forwardValue2203_35_0;
        break forward_join_43;
    }
    if (!((forwardValue2203_35_0 == 0))) {
        break forward_join_48;
    }
    forwardValue2203_43_0 = (((((moom.Il)(p0)).c)[((moom.bs)(moom.bs.UP)).a()]) ? 1 : 0);
    }
    if (!((life4_5 != null))) {
        forwardValue2203_47_0 = forwardValue2203_43_0;
        break forward_join_47;
    }
    if (!((forwardValue2203_43_0 == 0))) {
        break forward_join_48;
    }
    forwardValue2203_47_0 = 1;
    }
    forwardValue2203_49_0 = forwardValue2203_47_0;
    break forward_join_49;
    }
    forwardValue2203_49_0 = 0;
    }
    return ((forwardValue2203_49_0) != 0);
}

}
