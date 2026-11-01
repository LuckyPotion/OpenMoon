package moom;


public class HQ extends moom.HP {

public moom.IA g;

public moom.HM h;

public java.util.List<moom.G4> i;

private static final long k;

public HQ() {
super();
    this.i = com.google.common.collect.Lists.newArrayList();
}


public HQ(int p0, java.util.Random p1, int p2, int p3) {
super(0, p1, p2, p3);
    this.i = com.google.common.collect.Lists.newArrayList();
}


static {
moom.HQ.k = (moom._c.a(3403592663763907924L, -5901270275001712080L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(95797314075675L);
}


private static moom.Oo c(moom.Oo p0) {
return p0;
}


public moom.DT a__DT() {
moom.HQ forwardValue2086_16_0;
    moom.DT forwardValue2086_17_0;
    moom.HQ spill2086_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_17: {
    forward_join_16: {
    forward_join_15: {
    life1_3 = (moom.HQ.k ^ 95882522549806L);
    life3_5 = moom.G4.b();
    spill2086_0 = this;
    if (!((life3_5 != null))) {
        forwardValue2086_16_0 = spill2086_0;
        break forward_join_16;
    }
    if (!((((moom.HQ)(spill2086_0)).h != null))) {
        break forward_join_15;
    }
    forwardValue2086_17_0 = ((moom.HM)(this.h)).a__DT();
    break forward_join_17;
    }
    forwardValue2086_16_0 = this;
    }
    forwardValue2086_17_0 = __sourceIntrinsic_47f181ab3bf8_call2086_5(forwardValue2086_16_0);
    }
    return forwardValue2086_17_0;
}


private static native <E extends Throwable> moom.DT __sourceIntrinsic_47f181ab3bf8_call2086_5(moom.HQ a0) throws E;
}
