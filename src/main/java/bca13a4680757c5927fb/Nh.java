package moom;


public class Nh {

private java.lang.String a;

private final java.util.Map<java.lang.String, java.lang.String> b;

private final java.util.Set<java.lang.String> c;

private static final long d;

public Nh(java.lang.String p0) {
super();
    this.a = null;
    this.b = new java.util.LinkedHashMap();
    this.c = new java.util.LinkedHashSet();
    this.a = p0;
}


static {
d = (moom._c.a(9134358721379129828L, -8821870143689257660L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(158843369552515L);
}


public void b(java.lang.String p0) {
((java.util.Set)(this.c)).remove(((java.lang.Object)(p0)));
    return;
}


public void a__Void(java.lang.String p0) {
((java.util.Set)(this.c)).add(((java.lang.Object)(p0)));
    return;
}


public java.util.Collection<java.lang.String> a__Collection() {
return new java.util.LinkedHashSet(this.c);
}


public void a(java.util.Collection<java.lang.String> p0) {
((java.util.Set)(this.c)).addAll(((java.util.Collection)(p0)));
    return;
}


public boolean a__Boolean(java.lang.String p0) {
return (__sourceIntrinsic_booleanComparison((((java.util.Set)(this.c)).contains(((java.lang.Object)(p0))))) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public java.lang.String a() {
return this.a;
}


public void a(java.lang.String p0, java.lang.String p1) {
((java.util.Map)(this.b)).put(((java.lang.Object)(p0)), ((java.lang.Object)(p1)));
    return;
}


public void a(moom.Nh p0) {
moom.Nh forwardValue2855_11_0;
    moom.Nh spill2855_0;
    long life2_3;
    int[] life4_5;
    forward_join_15: {
    forward_join_11: {
    life2_3 = (moom.Nh.d ^ 91274617030918L);
    life4_5 = moom.M7.b__ArrayInt();
    spill2855_0 = p0;
    if (!((life4_5 == null))) {
        forwardValue2855_11_0 = spill2855_0;
        break forward_join_11;
    }
    if (!((spill2855_0 != null))) {
        break forward_join_15;
    }
    forwardValue2855_11_0 = this;
    }
    ((java.util.Map)(((moom.Nh)(forwardValue2855_11_0)).b)).putAll(((java.util.Map)(((moom.Nh)(p0)).b)));
    }
    return;
}


public void a(moom.M7[] p0) {
int[] spill1008_0;
    long life2_3;
    moom.M7[] life5_6;
    int[] life4_7;
    int life6_10;
    int life7_12;
    moom.M7 life8_19;
    java.lang.String life9_22;
    java.lang.String life10_28;
    lexical_join_40: {
    life2_3 = (moom.Nh.d ^ 29397941675780L);
    spill1008_0 = moom.M7.b__ArrayInt();
    life5_6 = p0;
    life4_7 = spill1008_0;
    life6_10 = (life5_6).length;
    life7_12 = 0;
    lexical_cycle_13: while (true) {
    lexical_join_38: {
    lexical_join_37: {
    if (!((life7_12 < life6_10))) {
        break lexical_join_40;
    }
    life8_19 = (life5_6)[life7_12];
    life9_22 = ((moom.M7)(life8_19)).a__String();
    life10_28 = ((java.lang.String)(((java.util.Map)(this.b)).get(((java.lang.Object)(life9_22)))));
    if (!((life4_7 == null))) {
        break lexical_join_38;
    }
    if (!((life10_28 != null))) {
        break lexical_join_37;
    }
    ((moom.M7)(life8_19)).a__Boolean(((java.lang.String)(life10_28)));
    }
    life7_12 += 1;
    }
    if (!((life4_7 != null))) { continue lexical_cycle_13; }
    break lexical_cycle_13;
    }
    }
    return;
}


public java.lang.String[] a__ArrayString() {
java.util.Set local1 = ((java.util.Map)(this.b)).keySet();
    return ((java.lang.String[])(((java.util.Set)(local1)).toArray(((java.lang.Object[])(new java.lang.String[0])))));
}


public java.lang.String a(java.lang.String p0) {
return ((java.lang.String)(((java.util.Map)(this.b)).get(((java.lang.Object)(p0)))));
}


private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
