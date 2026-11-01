package moom;


public class pJ {

private java.lang.String a;

private final java.util.List<java.lang.String> b;

private static final long c;

private pJ() {
super();
    this.a = null;
    this.b = com.google.common.collect.Lists.newArrayList();
}


static {
c = (moom._c.a(2137406359813633768L, -476695641624382907L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(36040780732683L);
}


public java.lang.String toString() {
moom.pJ forwardValue3833_24_0;
    moom.pJ forwardValue3833_27_0;
    moom.pJ forwardValue3833_33_0;
    java.lang.String forwardValue3833_37_0;
    moom.pJ spill3833_0;
    moom.pJ spill3833_1;
    long life1_3;
    int[] life3_5;
    forward_join_37: {
    forward_join_36: {
    forward_join_33: {
    forward_join_27: {
    forward_join_26: {
    forward_join_24: {
    forward_join_23: {
    life1_3 = (moom.pJ.c ^ 44100983643535L);
    life3_5 = moom.D.b();
    spill3833_0 = this;
    if (!((life3_5 == null))) {
        forwardValue3833_27_0 = spill3833_0;
        break forward_join_27;
    }
    if (!((((moom.pJ)(spill3833_0)).a != null))) {
        break forward_join_26;
    }
    spill3833_1 = this;
    if (!((life3_5 == null))) {
        forwardValue3833_24_0 = spill3833_1;
        break forward_join_24;
    }
    if (!((!((java.util.List)(((moom.pJ)(spill3833_1)).b)).isEmpty()))) {
        break forward_join_23;
    }
    forwardValue3833_37_0 = __sourceIntrinsic_a86c261fcdee_invokedynamic3833_7(this.a, this.a());
    break forward_join_37;
    }
    forwardValue3833_24_0 = this;
    }
    forwardValue3833_37_0 = ((moom.pJ)(forwardValue3833_24_0)).a;
    break forward_join_37;
    }
    forwardValue3833_27_0 = this;
    }
    if (!((life3_5 == null))) {
        forwardValue3833_33_0 = forwardValue3833_27_0;
        break forward_join_33;
    }
    if (!((!((java.util.List)(((moom.pJ)(forwardValue3833_27_0)).b)).isEmpty()))) {
        break forward_join_36;
    }
    forwardValue3833_33_0 = this;
    }
    forwardValue3833_37_0 = __sourceIntrinsic_a86c261fcdee_invokedynamic3833_12(((moom.pJ)(forwardValue3833_33_0)).a());
    break forward_join_37;
    }
    forwardValue3833_37_0 = "(Unknown file)";
    }
    return forwardValue3833_37_0;
}


public java.lang.String a() {
return org.apache.commons.lang3.StringUtils.join(((java.lang.Iterable)(this.b)), ((java.lang.String)("->")));
}


private void a(java.lang.String p0) {
((java.util.List)(this.b)).add(((int)(0)), ((java.lang.Object)(p0)));
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_invokedynamic3833_7(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_invokedynamic3833_12(java.lang.String a0) throws E;
}
