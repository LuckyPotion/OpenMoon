package moom;


public class Mb {

private int a;

private moom.jD b;

private static final long c;

public Mb(int p0, moom.jD p1) {
super();
    this.a = 0;
    this.b = null;
    this.a = p0;
    this.b = p1;
}


static {
c = (moom._c.a(-2438985131756971063L, -2170609858081968688L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(242743194189420L);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(moom.iT p0, float p1) {
moom.jD forwardValue2710_20_0;
    java.lang.String spill2710_0;
    moom.jD spill2710_1;
    long life3_3;
    moom.jD life6_9;
    java.lang.String life5_10;
    forward_join_20: {
    forward_join_18: {
    life3_3 = (moom.Mb.c ^ 76178928453090L);
    spill2710_0 = moom.L_.b();
    life6_9 = moom.L_.a(((moom.iT)(p0)), ((int)(this.a)));
    life5_10 = spill2710_0;
    spill2710_1 = life6_9;
    if (!((life5_10 == null))) {
        forwardValue2710_20_0 = spill2710_1;
        break forward_join_20;
    }
    if (!((spill2710_1 != null))) {
        break forward_join_18;
    }
    ((moom.jD)(life6_9)).c(((float)(p1)));
    }
    forwardValue2710_20_0 = this.b;
    }
    ((moom.jD)(forwardValue2710_20_0)).a(((float)(p1)));
    return;
}


public moom.jD a() {
return this.b;
}

}
