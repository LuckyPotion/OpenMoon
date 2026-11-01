package com.moon;


public class hM {

private final java.lang.String a;

private final java.lang.String b;

private final java.util.Map<java.lang.String, com.moon.hK> c;

private static final long d;

private hM(java.lang.String p0, java.lang.String p1) {
super();
    this.c = new java.util.HashMap();
    this.a = p0;
    this.b = p1;
}


static {
d = (moom._c.a(5600427033568216100L, -4731548765849904152L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(122113134765669L);
}


public java.lang.String b() {
return this.b;
}


public java.util.Map<java.lang.String, com.moon.hK> a__Map() {
return this.c;
}


public static com.moon.hM a(java.lang.String p0, java.lang.String p1) {
return new com.moon.hM(p0, p1);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public com.moon.hK a(java.lang.String p0) {
java.lang.Object forwardValue318_23_0;
    int[] spill318_0;
    java.util.Optional spill318_1;
    long life2_3;
    java.util.Optional life5_8;
    int[] life4_9;
    forward_join_23: {
    forward_join_17: {
    life2_3 = (com.moon.hM.d ^ 121717506259071L);
    spill318_0 = com.moon.hK.b__ArrayInt();
    life5_8 = ((com.moon.hM)(this)).a__Optional(((java.lang.String)(p0)));
    life4_9 = spill318_0;
    spill318_1 = life5_8;
    if (!((life4_9 == null))) {
        forwardValue318_23_0 = spill318_1;
        break forward_join_23;
    }
    if (!(((java.util.Optional)(spill318_1)).isEmpty())) {
        break forward_join_17;
    }
    return null;
    }
    ((com.moon.hK)(((com.moon.hK)(((java.util.Optional)(life5_8)).get())))).a__Void();
    forwardValue318_23_0 = ((java.util.Optional)(life5_8)).get();
    }
    return ((com.moon.hK)(forwardValue318_23_0));
}


public void a__Void() {
int[] spill64_0;
    long life1_3;
    java.util.Iterator life4_9;
    int[] life3_10;
    com.moon.hK life5_17;
    lexical_join_22: {
    life1_3 = (com.moon.hM.d ^ 33945200870803L);
    spill64_0 = com.moon.hK.b__ArrayInt();
    life4_9 = ((java.util.Collection)(((java.util.Map)(this.c)).values())).iterator();
    life3_10 = spill64_0;
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


public void a(com.moon.hK p0) {
((java.util.Map)(this.c)).put(((java.lang.Object)(((com.moon.hK)(p0)).a__String())), ((java.lang.Object)(p0)));
    return;
}


public java.lang.String a() {
return this.a;
}


public java.util.Optional<com.moon.hK> a__Optional(java.lang.String p0) {
return java.util.Optional.ofNullable(((((com.moon.hK)(((java.util.Map)(this.c)).get(((p0))))))));
}

}
