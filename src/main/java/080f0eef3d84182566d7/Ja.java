package moom;


public class Ja implements java.util.Comparator<moom.Ee> {

private final int a;

private final int b;

private final double c;

private final double d;

private static final long e;

public Ja(int p0, int p1, double p2, double p3) {
super();
    this.a = p0;
    this.b = p1;
    this.c = p2;
    this.d = (0x1.0000000000000p+0d - moom.Dr.a((java.lang.Math.abs(p3) / 0x1.921fb54442d18p+0d), 0x0.0p+0d, 0x1.0000000000000p+0d));
}


static {
moom.Ja.e = (moom._c.a(-498006062643718072L, -7668408787523351859L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(174847919246239L);
}


public int compare__sourceBridge_3438c2120d(java.lang.Object p0, java.lang.Object p1) {
return ((moom.Ja)(this)).a(((moom.Ee)(((moom.Ee)(p0)))), ((moom.Ee)(((moom.Ee)(p1)))));
}


private int a(moom.Ee p0) {
int forwardValue2338_63_0;
    net.minecraft.entity.Entity[] spill2338_0;
    int spill2338_1;
    long life2_3;
    int life5_9;
    int life6_15;
    int life7_23;
    double life8_31;
    net.minecraft.entity.Entity[] life4_32;
    double life10_38;
    int life7_64;
    forward_join_63: {
    forward_join_49: {
    life2_3 = (moom.Ja.e ^ 945105530710L);
    life5_9 = (((moom.Ee)(p0)).a - this.a);
    life6_15 = (((moom.Ee)(p0)).b - this.b);
    life7_23 = ((life5_9 * life5_9) + (life6_15 * life6_15));
    spill2338_0 = moom.JM.b__Arrayr3();
    life8_31 = ((double) moom.Dr.a(((float)(((float) life6_15))), ((float)(((float) life5_9)))));
    life4_32 = spill2338_0;
    life10_38 = java.lang.Math.abs(((double)((life8_31 - this.c))));
    spill2338_1 = recovery.source.CarrierOps.dcmpl(((double)(life10_38)), ((double)(0x1.921fb54442d18p1d)));
    if (!((life4_32 != null))) {
        forwardValue2338_63_0 = spill2338_1;
        break forward_join_63;
    }
    if (!((spill2338_1 > 0))) {
        break forward_join_49;
    }
    life10_38 = (0x1.921fb54442d18p2d - life10_38);
    }
    life7_64 = ((int) ((((((double) life7_23) * 0x1.f4p9d) * this.d) * life10_38) * life10_38));
    forwardValue2338_63_0 = life7_64;
    }
    return forwardValue2338_63_0;
}


public int a(moom.Ee p0, moom.Ee p1) {
int local3 = ((moom.Ja)(this)).a(((moom.Ee)(p0)));
    int local4 = ((moom.Ja)(this)).a(((moom.Ee)(p1)));
    return (local3 - local4);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public int compare(moom.Ee __bridgeParam0, moom.Ee __bridgeParam1) { return this.compare__sourceBridge_3438c2120d(((java.lang.Object)(__bridgeParam0)), ((java.lang.Object)(__bridgeParam1))); }
}
