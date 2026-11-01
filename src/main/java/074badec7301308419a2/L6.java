package moom;


public class L6 {

private moom.L_[] a;

private boolean b;

private static final long c;

public L6() {
super();
    this.a = new moom.L_[0];
    this.b = false;
}


static {
c = (moom._c.a(-7991020136573090484L, -4201873502002516595L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(179629519844485L);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(moom.L_ p0) {
this.a = ((moom.L_[])(((moom.L_[])(moom.BU.a(((java.lang.Object[])(this.a)), ((java.lang.Object)(p0)))))));
    return;
}


public moom.L_[] a__ArrayL_() {
return this.a;
}


public void a(boolean p0) {
this.b = ((boolean)(p0));
    return;
}


public boolean a() {
return ((((this.b) ? 1 : 0)) != 0);
}


public void a(moom.iT p0, moom.to p1, float p2, float p3) {
moom.L6 lexicalValue912_12_0;
    moom.L6 spill912_0;
    long life5_3;
    java.lang.String life7_5;
    moom.L_[] life8_19;
    int life9_22;
    int life10_24;
    moom.L_ life11_31;
    lexical_join_35: {
    lexical_join_12: {
    life5_3 = (moom.L6.c ^ 41546345649025L);
    life7_5 = moom.L_.b();
    spill912_0 = this;
    if (!((life7_5 == null))) {
        lexicalValue912_12_0 = spill912_0;
        break lexical_join_12;
    }
    if (!(((moom.L6)(spill912_0)).b)) {
        break lexical_join_35;
    }
    lexicalValue912_12_0 = this;
    }
    life8_19 = ((moom.L6)(lexicalValue912_12_0)).a;
    life9_22 = (life8_19).length;
    life10_24 = 0;
    lexical_cycle_19: while (true) {
    if (!((life10_24 < life9_22))) {
        break lexical_join_35;
    }
    life11_31 = (life8_19)[life10_24];
    ((moom.L_)(life11_31)).a(((moom.iT)(p0)), ((moom.to)(p1)), ((float)(p2)), ((float)(p3)));
    life10_24 += 1;
    if (!((life7_5 != null))) { continue lexical_cycle_19; }
    break lexical_cycle_19;
    }
    }
    return;
}

}
