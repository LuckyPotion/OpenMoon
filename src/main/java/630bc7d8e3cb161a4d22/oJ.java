package moom;


public class oJ {

private static final moom.DD a;

private static final moom.DD b;

private static final long c;

public oJ() {
super();
}


static {
c = (moom._c.a(5990578322857699821L, -7304323638249014231L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(45724666903421L);
    a = new moom.DD("textures/entity/steve.png");
    b = new moom.DD("textures/entity/alex.png");
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static boolean a__Boolean(java.util.UUID p0) {
int forwardValue3807_15_0;
    int forwardValue3807_17_0;
    int spill3807_0;
    long life1_3;
    java.lang.String[] life3_5;
    forward_join_17: {
    forward_join_16: {
    forward_join_15: {
    life1_3 = (moom.oJ.c ^ 51049390637277L);
    life3_5 = moom.oO.b();
    spill3807_0 = (((java.util.UUID)(p0)).hashCode() & 1);
    if (!((life3_5 != null))) {
        forwardValue3807_15_0 = spill3807_0;
        break forward_join_15;
    }
    if (!((spill3807_0 == 1))) {
        break forward_join_16;
    }
    forwardValue3807_15_0 = 1;
    }
    forwardValue3807_17_0 = forwardValue3807_15_0;
    break forward_join_17;
    }
    forwardValue3807_17_0 = 0;
    }
    return ((forwardValue3807_17_0) != 0);
}


public static java.lang.String a(java.util.UUID p0) {
long local1 = (moom.oJ.c ^ 119377573476185L);
    return ((__sourceIntrinsic_booleanComparison(moom.oJ.a__Boolean(((java.util.UUID)(p0)))) != 0) ? "slim" : "default");
}


public static moom.DD a__DD(java.util.UUID p0) {
long local1 = (moom.oJ.c ^ 78057864617617L);
    return ((__sourceIntrinsic_booleanComparison(moom.oJ.a__Boolean(((java.util.UUID)(p0)))) != 0) ? moom.oJ.b : moom.oJ.a);
}


public static moom.DD a() {
return moom.oJ.a;
}


private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
