package com.moon;


public class hJ {

private final java.lang.String a;

private final java.lang.String b;

private final java.util.Map<java.lang.String, com.moon.hK> c;

private static java.lang.String d;

private static final long e;

private hJ(java.lang.String p0, java.lang.String p1) {
super();
    this.c = new java.util.HashMap();
    this.a = p0;
    this.b = p1;
}


static {
e = ((long)(((moom._a)(moom._c.a(((long)(-6941972012850628739L)), ((long)(-5787347041319259068L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(278012341749873L)))));
    if ((com.moon.hJ.c() != null)) {
        com.moon.hJ.b(((java.lang.String)("F7Q8Rc")));
    }
}


public static void b(java.lang.String p0) {
com.moon.hJ.d = ((java.lang.String)(p0));
    return;
}


public java.lang.String b() {
return this.b;
}


public static java.lang.String c() {
return com.moon.hJ.d;
}


public java.util.Map<java.lang.String, com.moon.hK> a__Map() {
return this.c;
}


public static com.moon.hJ a(java.lang.String p0, java.lang.String p1) {
return new com.moon.hJ(p0, p1);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a__Void() {
java.lang.String spill63_0;
    long life1_3;
    java.util.Iterator life4_9;
    java.lang.String life3_10;
    com.moon.hK life5_17;
    lexical_join_22: {
    life1_3 = (com.moon.hJ.e ^ 114190719129095L);
    spill63_0 = com.moon.hJ.c();
    life4_9 = ((java.util.Collection)(((java.util.Map)(this.c)).values())).iterator();
    life3_10 = spill63_0;
    lexical_cycle_11: while (true) {
    if (!(((java.util.Iterator)(life4_9)).hasNext())) {
        break lexical_join_22;
    }
    life5_17 = ((com.moon.hK)(((java.util.Iterator)(life4_9)).next()));
    ((com.moon.hK)(life5_17)).c();
    if (!((life3_10 != null))) { continue lexical_cycle_11; }
    break lexical_cycle_11;
    }
    }
    return;
}


public java.util.LinkedHashSet<com.moon.hK> a(boolean p0) {
long local2 = (com.moon.hJ.e ^ 129836803008315L);
    java.lang.String local4 = com.moon.hJ.c();
    java.util.LinkedHashSet spill1207_0 = ((java.util.LinkedHashSet)(((java.util.stream.Stream)(((java.util.stream.Stream)(((java.util.Collection)(((java.util.Map)(this.c)).values())).stream())).sorted(((java.util.Comparator)(java.util.Comparator.comparingLong(((java.util.function.ToLongFunction)(__sourceIntrinsic_7634dc5c8863_invokedynamic1207_5(p0))))))))).collect(((java.util.stream.Collector)(java.util.stream.Collectors.toCollection(((java.util.function.Supplier)(__sourceIntrinsic_7634dc5c8863_invokedynamic1207_8()))))))));
    if ((net.minecraft.entity.Entity.b__ArrayString() != null)) {
        com.moon.hJ.b(((java.lang.String)("J20DV")));
    }
    return spill1207_0;
}


public com.moon.hK a(java.lang.String p0) {
java.lang.Object forwardValue315_35_0;
    com.moon.hK forwardValue315_41_0;
    java.lang.String spill315_0;
    java.util.Optional spill315_1;
    com.moon.hK spill315_2;
    long life2_3;
    java.util.Optional life5_8;
    java.lang.String life4_9;
    com.moon.hK life6_21;
    forward_join_41: {
    forward_join_35: {
    forward_join_29: {
    life2_3 = (com.moon.hJ.e ^ 50511186135292L);
    spill315_0 = com.moon.hJ.c();
    life5_8 = ((com.moon.hJ)(this)).a__Optional(((java.lang.String)(p0)));
    life4_9 = spill315_0;
    spill315_1 = life5_8;
    if (!((life4_9 == null))) {
        forwardValue315_35_0 = spill315_1;
        break forward_join_35;
    }
    if (!(((java.util.Optional)(spill315_1)).isEmpty())) {
        break forward_join_29;
    }
    life6_21 = com.moon.hK.a(((java.lang.String)(p0)), ((java.lang.String)(p0)));
    ((java.util.Map)(this.c)).put(((java.lang.Object)(p0)), ((java.lang.Object)(life6_21)));
    ((com.moon.hK)(life6_21)).a__Void();
    return life6_21;
    }
    ((com.moon.hK)(((com.moon.hK)(((java.util.Optional)(life5_8)).get())))).a__Void();
    forwardValue315_35_0 = ((java.util.Optional)(life5_8)).get();
    }
    spill315_2 = ((com.moon.hK)(forwardValue315_35_0));
    if (!((life4_9 != null))) {
        forwardValue315_41_0 = spill315_2;
        break forward_join_41;
    }
    __sourceExactCall_6604345f74a40b(((java.lang.String[])(new java.lang.String[2])));
    forwardValue315_41_0 = spill315_2;
    }
    return forwardValue315_41_0;
}


public java.util.Optional<com.moon.hK> a__Optional(java.lang.String p0) {
return java.util.Optional.ofNullable(((((com.moon.hK)(((java.util.Map)(this.c)).get(((p0))))))));
}


public void a(com.moon.hK p0) {
((java.util.Map)(this.c)).put(((java.lang.Object)(((com.moon.hK)(p0)).a__String())), ((java.lang.Object)(p0)));
    return;
}


public java.lang.String a() {
return this.a;
}


private static long lambda$sectionsSortedByConsumption$0(boolean p0, com.moon.hK p1) {
long local2 = (com.moon.hJ.e ^ 112964080365768L);
    return ((__sourceIntrinsic_booleanComparison(p0) != 0) ? (-((com.moon.hL)(((com.moon.hK)(p1)).a__hL())).a__Long()) : (-((com.moon.hL)(((com.moon.hK)(p1)).a__hL())).e()));
}


private static native <E extends Throwable> java.util.function.ToLongFunction __sourceIntrinsic_7634dc5c8863_invokedynamic1207_5(boolean a0) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_7634dc5c8863_invokedynamic1207_8() throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);

private static native void __sourceExactCall_6604345f74a40b(java.lang.String[] p0);
}
