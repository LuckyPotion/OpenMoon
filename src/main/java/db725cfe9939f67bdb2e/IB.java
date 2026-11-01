package moom;


class IB extends moom.IA {

private static final long e;

IB(java.lang.Class p0, int p1, int p2) {
super(p0, p1, p2);
}


static {
e = (moom._c.a(649108065894853106L, 5037203847249148157L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(15637900754576L);
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public boolean a(int p0) {
int forwardValue2179_13_0;
    int forwardValue2179_18_0;
    int forwardValue2179_20_0;
    boolean spill2179_0;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_20: {
    forward_join_19: {
    forward_join_18: {
    forward_join_13: {
    life2_3 = (moom.IB.e ^ 107524406288638L);
    life4_5 = moom.G4.b();
    spill2179_0 = super.a(((int)(p0)));
    if (!((life4_5 != null))) {
        forwardValue2179_13_0 = ((spill2179_0) ? 1 : 0);
        break forward_join_13;
    }
    if (!(spill2179_0)) {
        break forward_join_19;
    }
    forwardValue2179_13_0 = p0;
    }
    if (!((life4_5 != null))) {
        forwardValue2179_18_0 = forwardValue2179_13_0;
        break forward_join_18;
    }
    if (!((forwardValue2179_13_0 > 4))) {
        break forward_join_19;
    }
    forwardValue2179_18_0 = 1;
    }
    forwardValue2179_20_0 = forwardValue2179_18_0;
    break forward_join_20;
    }
    forwardValue2179_20_0 = 0;
    }
    return ((forwardValue2179_20_0) != 0);
}

}
