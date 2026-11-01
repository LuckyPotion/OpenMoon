package com.moon;


public class ic<T> {

private static final java.util.Map<com.moon.ca, com.moon.ig> a;

private final com.moon.pp<T> b;

private final com.moon.id c;

private static final long d;

public ic(com.moon.pp<T> p0) {
super();
    this.c = new com.moon.id();
    this.b = p0;
}


static {
d = (moom._c.a(9074688132031673505L, -976147269701178512L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(228048736158408L);
    a = new com.moon.pA();
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public java.util.List<com.moon.pq> a() {
long life1_3;
    java.lang.String life3_7;
    java.lang.String[] life4_11;
    java.lang.String[] life5_13;
    int life6_16;
    int life7_18;
    java.lang.String life8_25;
    char[] life9_28;
    char[] life10_30;
    int life11_33;
    int life12_35;
    int life13_42;
    com.moon.ca life14_45;
    com.moon.ig life15_52;
    java.lang.String life10_91;
    java.util.List life10_122;
    life1_3 = (com.moon.ic.d ^ 36361412141659L);
    life3_7 = ((com.moon.pp)(this.b)).d();
    life4_11 = ((java.lang.String)(life3_7)).split(((java.lang.String)("\n")));
    life5_13 = life4_11;
    life6_16 = (life5_13).length;
    life7_18 = 0;
    loop_region_19: while ((life7_18 < life6_16)) {
        life8_25 = (life5_13)[life7_18];
        life9_28 = ((java.lang.String)(life8_25)).toCharArray();
        life10_30 = life9_28;
        life11_33 = (life10_30).length;
        life12_35 = 0;
        loop_region_36: while ((life12_35 < life11_33)) {
        life13_42 = ((int)((life10_30)[life12_35]));
        life14_45 = com.moon.ca.a(((char)(life13_42)));
        if ((life14_45 != null)) {
        life15_52 = ((com.moon.ig)(((java.util.Map)(com.moon.ic.a)).get(((java.lang.Object)(life14_45)))));
        ((com.moon.ig)(life15_52)).a(((com.moon.id)(this.c)), ((char)(life13_42)));
    } else {
        com.moon.id __stackOp91_13_0 = this.c;
        ((com.moon.id)(__stackOp91_13_0)).k = ((java.lang.String)(__sourceIntrinsic_4adeefca06d1_invokedynamic91_15(((com.moon.id)(__stackOp91_13_0)).k, life13_42)));
    }
        life12_35 += 1;
    }
        if (((com.moon.id)(this.c)).f) {
        life10_91 = (((com.moon.id)(this.c)).g ? ((com.moon.id)(this.c)).k : ((java.lang.String)(((com.moon.id)(this.c)).k)).replace(((java.lang.CharSequence)(" ")), ((java.lang.CharSequence)(""))));
        ((java.util.List)(((com.moon.pt)(((com.moon.id)(this.c)).j)).k())).add(((java.lang.Object)(new com.moon.pu(((com.moon.id)(this.c)).l, life10_91))));
        ((com.moon.id)(this.c)).f = ((boolean)(false));
        ((com.moon.id)(this.c)).l = ((java.lang.String)(""));
    }
        if (this.a(((com.moon.id)(this.c)))) {
        life10_122 = ((com.moon.pr)(((com.moon.id)(this.c)).i)).h();
        ((java.util.List)(life10_122)).add(((java.lang.Object)(new com.moon.ps(((com.moon.id)(this.c)).k))));
    }
        ((com.moon.id)(this.c)).k = ((java.lang.String)(""));
        life7_18 += 1;
    }
    return ((com.moon.id)(this.c)).a;
}


private boolean a(com.moon.id p0) {
int forwardValue421_20_0;
    long life2_3;
    forward_join_20: {
    forward_join_19: {
    life2_3 = (com.moon.ic.d ^ 133667833577189L);
    if (!(((com.moon.id)(p0)).c)) {
        break forward_join_19;
    }
    if (!((!((com.moon.id)(p0)).g))) {
        break forward_join_19;
    }
    if (!((!((java.lang.String)(((com.moon.id)(p0)).k)).isBlank()))) {
        break forward_join_19;
    }
    if (!((!((com.moon.id)(p0)).d))) {
        break forward_join_19;
    }
    forwardValue421_20_0 = 1;
    break forward_join_20;
    }
    forwardValue421_20_0 = 0;
    }
    return ((forwardValue421_20_0) != 0);
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_4adeefca06d1_invokedynamic91_15(java.lang.String a0, int a1) throws E;
}
