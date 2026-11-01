package moom;


public class oU implements java.lang.Comparable<moom.oU> {

private final java.lang.String a;

private final java.lang.String b;

private final java.lang.String c;

private final boolean d;

private static final long e;

public oU(java.lang.String p0, java.lang.String p1, java.lang.String p2, boolean p3) {
super();
    this.a = p0;
    this.b = p1;
    this.c = p2;
    this.d = p3;
}


static {
moom.oU.e = (moom._c.a(2891016551170431348L, 8576070019626602752L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(266538802717314L);
}


public boolean equals(java.lang.Object p0) {
java.lang.Object forwardValue3811_12_0;
    int forwardValue3811_22_0;
    int forwardValue3811_26_0;
    int forwardValue3811_28_0;
    moom.oU spill3811_0;
    int spill3811_1;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_28: {
    forward_join_27: {
    forward_join_26: {
    forward_join_25: {
    forward_join_22: {
    forward_join_12: {
    life2_3 = (moom.oU.e ^ 12745977061193L);
    life4_5 = moom.oO.b();
    spill3811_0 = this;
    if (!((life4_5 != null))) {
        forwardValue3811_12_0 = spill3811_0;
        break forward_join_12;
    }
    if (!((spill3811_0 != p0))) {
        break forward_join_25;
    }
    forwardValue3811_12_0 = p0;
    }
    spill3811_1 = ((forwardValue3811_12_0 instanceof moom.oU) ? 1 : 0);
    if (!((life4_5 != null))) {
        forwardValue3811_22_0 = spill3811_1;
        break forward_join_22;
    }
    if (!((spill3811_1 != 0))) {
        break forward_join_27;
    }
    forwardValue3811_22_0 = ((((java.lang.String)(this.a)).equals(((java.lang.Object)(((moom.oU)(((moom.oU)(p0)))).a)))) ? 1 : 0);
    }
    if (!((life4_5 != null))) {
        forwardValue3811_26_0 = forwardValue3811_22_0;
        break forward_join_26;
    }
    if (!((forwardValue3811_22_0 != 0))) {
        break forward_join_27;
    }
    }
    forwardValue3811_26_0 = 1;
    }
    forwardValue3811_28_0 = forwardValue3811_26_0;
    break forward_join_28;
    }
    forwardValue3811_28_0 = 0;
    }
    return ((forwardValue3811_28_0) != 0);
}


public java.lang.String toString() {
return java.lang.String.format(((java.lang.String)("%s (%s)")), ((java.lang.Object[])(new java.lang.Object[] {this.c, this.b})));
}


public int hashCode() {
return ((java.lang.String)(this.a)).hashCode();
}


public int compareTo__sourceBridge_e47da4afb6(java.lang.Object p0) {
return ((moom.oU)(this)).a(((moom.oU)(((moom.oU)(p0)))));
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public java.lang.String a() {
return this.a;
}


public boolean a__Boolean() {
return ((((this.d) ? 1 : 0)) != 0);
}


public int a(moom.oU p0) {
return ((java.lang.String)(this.a)).compareTo(((java.lang.String)(((moom.oU)(p0)).a)));
}


public int compareTo(moom.oU __bridgeParam0) { return this.compareTo__sourceBridge_e47da4afb6(((java.lang.Object)(__bridgeParam0))); }
}
