package moom;


class IC extends moom.IA {

private static final long e;

IC(java.lang.Class p0, int p1, int p2) {
super(p0, p1, p2);
}


static {
e = (moom._c.a(-2811876752055566867L, -4884749649125727187L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(81884115028331L);
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public boolean a(int p0) {
int forwardValue2180_13_0;
    int forwardValue2180_18_0;
    int forwardValue2180_20_0;
    boolean spill2180_0;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_20: {
    forward_join_19: {
    forward_join_18: {
    forward_join_13: {
    life2_3 = (moom.IC.e ^ 85533195081968L);
    life4_5 = moom.G4.b();
    spill2180_0 = super.a(((int)(p0)));
    if (!((life4_5 != null))) {
        forwardValue2180_13_0 = ((spill2180_0) ? 1 : 0);
        break forward_join_13;
    }
    if (!(spill2180_0)) {
        break forward_join_19;
    }
    forwardValue2180_13_0 = p0;
    }
    if (!((life4_5 != null))) {
        forwardValue2180_18_0 = forwardValue2180_13_0;
        break forward_join_18;
    }
    if (!((forwardValue2180_13_0 > 5))) {
        break forward_join_19;
    }
    forwardValue2180_18_0 = 1;
    }
    forwardValue2180_20_0 = forwardValue2180_18_0;
    break forward_join_20;
    }
    forwardValue2180_20_0 = 0;
    }
    return ((forwardValue2180_20_0) != 0);
}

}
