package moom;


class CG<T> implements java.lang.Iterable<T[]> {

private final java.lang.Class<T> a;

private final java.lang.Iterable<? extends T>[] b;

private static final long c;

private CG(java.lang.Class<T> p0, java.lang.Iterable<? extends T>[] p1) {
super();
    this.a = p0;
    this.b = p1;
}


static {
c = (moom._c.a(4105689028399676520L, 3356571682530631765L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(76323187299449L);
}


public java.util.Iterator<T[]> iterator() {
java.lang.Object[] forwardValue1579_16_0;
    java.util.Iterator forwardValue1579_26_0;
    java.lang.Iterable[] spill1579_0;
    long life1_3;
    int life3_5;
    forward_join_26: {
    forward_join_19: {
    forward_join_16: {
    life1_3 = (moom.CG.c ^ 23766694879898L);
    life3_5 = ((moom.DS.c__Boolean()) ? 1 : 0);
    spill1579_0 = this.b;
    if (!((life3_5 != 0))) {
        forwardValue1579_16_0 = spill1579_0;
        break forward_join_16;
    }
    if (!(((spill1579_0).length == 0))) {
        break forward_join_19;
    }
    forwardValue1579_16_0 = __sourceExactCall_04a2a135697ed3(((java.lang.Class)(this.a)), ((int)(0)));
    }
    forwardValue1579_26_0 = ((java.util.List)(java.util.Collections.singletonList(((java.lang.Object)(forwardValue1579_16_0))))).iterator();
    break forward_join_26;
    }
    forwardValue1579_26_0 = new moom.g(this.a, this.b);
    }
    return forwardValue1579_26_0;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static native java.lang.Object[] __sourceExactCall_04a2a135697ed3(java.lang.Class p0, int p1);
}
