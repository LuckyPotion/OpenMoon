package moom;


public abstract class Dh<T> {

private T a;

private boolean b;

private static final long c;

public Dh() {
super();
    this.b = false;
}


static {
c = (moom._c.a(543600872373038497L, 6991660452866652988L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(84510625243321L);
}


protected abstract T b();

public T a() {
java.lang.Object forwardValue1738_20_0;
    moom.Dh spill1738_0;
    long life1_3;
    int life3_5;
    forward_join_20: {
    forward_join_18: {
    life1_3 = (moom.Dh.c ^ 105350448321767L);
    life3_5 = ((moom.DS.c__Boolean()) ? 1 : 0);
    spill1738_0 = this;
    if (!((life3_5 != 0))) {
        forwardValue1738_20_0 = spill1738_0;
        break forward_join_20;
    }
    if (!((!((moom.Dh)(spill1738_0)).b))) {
        break forward_join_18;
    }
    this.b = ((boolean)(true));
    this.a = (((T)((java.lang.Object)(this.b()))));
    }
    forwardValue1738_20_0 = this.a;
    }
    return ((T)(forwardValue1738_20_0));
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}

}
