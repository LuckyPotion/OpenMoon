package com.moon;


public class hO {

private final java.util.List<com.moon.hN> a;

private static int[] b;

private static final long c;

public hO() {
super();
    this.a = new java.util.ArrayList();
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(6208609558543569648L)), ((long)(4605373589869905441L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(201007730879093L)))));
    if ((com.moon.hO.b() == null)) {
        com.moon.hO.b(((int[])(new int[2])));
    }
}


public static void b(int[] p0) {
com.moon.hO.b = ((int[])(p0));
    return;
}


public static int[] b() {
return com.moon.hO.b;
}


public void a() {
long local1 = (com.moon.hO.c ^ 40060687918309L);
    int[] spill1213_0 = com.moon.hO.b();
    ((java.util.List)(this.a)).add(((java.lang.Object)(new com.moon.hP())));
    int[] local3 = spill1213_0;
    if ((net.minecraft.entity.Entity.b__ArrayString() != null)) {
        com.moon.hO.b(((int[])(new int[4])));
    }
    return;
}


public void a(com.moon.eT p0) {
int[] spill65_0;
    long life2_3;
    java.util.Iterator life5_8;
    int[] life4_9;
    com.moon.hN life6_16;
    lexical_join_24: {
    life2_3 = (com.moon.hO.c ^ 43182373358724L);
    spill65_0 = com.moon.hO.b();
    life5_8 = ((java.util.List)(this.a)).iterator();
    life4_9 = spill65_0;
    lexical_cycle_10: while (true) {
    if (!(((java.util.Iterator)(life5_8)).hasNext())) {
        break lexical_join_24;
    }
    life6_16 = ((com.moon.hN)(((java.util.Iterator)(life5_8)).next()));
    ((com.moon.hN)(life6_16)).a();
    if (!((life4_9 == null))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[5])));
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}

}
