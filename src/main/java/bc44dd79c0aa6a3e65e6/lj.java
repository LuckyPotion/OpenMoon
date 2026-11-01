package moom;


public class lj extends moom.li {

private moom.to d;

private final moom.DD e;

private boolean f;

private static final long h;

public lj(moom.to p0, moom.DD p1) {
super();
    this.d = p0;
    this.e = p1;
}


static {
h = (moom._c.a(-6080305537057893837L, -5326078640951020915L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(267689754166679L);
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public void b() {
this.d = ((moom.to)(null));
    return;
}


public boolean a__Boolean() {
return ((((this.f) ? 1 : 0)) != 0);
}


public void a() {
moom.lj forwardValue3755_22_0;
    moom.lj spill3755_0;
    long life1_3;
    java.lang.String life3_5;
    forward_join_22: {
    forward_join_21: {
    life1_3 = (moom.lj.h ^ 95890110515883L);
    life3_5 = moom.L_.b();
    spill3755_0 = this;
    if (!((life3_5 == null))) {
        forwardValue3755_22_0 = spill3755_0;
        break forward_join_22;
    }
    if (!((((moom.lj)(spill3755_0)).d != null))) {
        break forward_join_21;
    }
    ((moom.to)(this.d)).a(((moom.DD)(this.e)));
    ((moom.to)(this.d)).j(((boolean)(this.f)));
    }
    forwardValue3755_22_0 = this;
    }
    ((moom.lj)(forwardValue3755_22_0)).b();
    return;
}


public java.awt.image.BufferedImage a(java.awt.image.BufferedImage p0) {
java.lang.Object local2 = moom.L5.a(((java.awt.image.BufferedImage)(p0)));
    this.f = ((boolean)(moom.L5.a(((java.awt.image.BufferedImage)(p0)), ((java.awt.image.BufferedImage)(local2)))));
    return ((java.awt.image.BufferedImage)(local2));
}

}
