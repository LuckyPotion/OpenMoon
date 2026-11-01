package com.moon;


public abstract class ig {

private final com.moon.ca a;

private static int b;

private static final long d;

public ig(com.moon.ca p0) {
super();
    this.a = p0;
}


static {
d = ((long)(((moom._a)(moom._c.a(((long)(-2984727310033669176L)), ((long)(1717496936873108569L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(138354484812366L)))));
    if ((com.moon.ig.b() != 0)) {
        com.moon.ig.b(((int)(30)));
    }
}


public static int b() {
return com.moon.ig.b;
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public static void b(int p0) {
com.moon.ig.b = ((int)(p0));
    return;
}


public static int c() {
int local0 = com.moon.ig.b();
    if ((local0 == 0)) {
        return 9;
    }
    return 0;
}


public abstract void a(com.moon.id p0, char p1);

public com.moon.ca a() {
return this.a;
}


protected boolean a(com.moon.id p0) {
int forwardValue422_13_0;
    int forwardValue422_19_0;
    int forwardValue422_24_0;
    int forwardValue422_28_0;
    int forwardValue422_30_0;
    boolean spill422_0;
    long life2_3;
    int life4_5;
    forward_join_30: {
    forward_join_29: {
    forward_join_28: {
    forward_join_24: {
    forward_join_19: {
    forward_join_13: {
    life2_3 = (com.moon.ig.d ^ 57796425226076L);
    life4_5 = com.moon.ig.c();
    spill422_0 = ((com.moon.id)(p0)).c;
    if (!((life4_5 != 0))) {
        forwardValue422_13_0 = ((spill422_0) ? 1 : 0);
        break forward_join_13;
    }
    if (!(spill422_0)) {
        break forward_join_29;
    }
    forwardValue422_13_0 = ((((com.moon.id)(p0)).g) ? 1 : 0);
    }
    if (!((life4_5 != 0))) {
        forwardValue422_19_0 = forwardValue422_13_0;
        break forward_join_19;
    }
    if (!((forwardValue422_13_0 == 0))) {
        break forward_join_29;
    }
    forwardValue422_19_0 = ((((java.lang.String)(((com.moon.id)(p0)).k)).isBlank()) ? 1 : 0);
    }
    if (!((life4_5 != 0))) {
        forwardValue422_24_0 = forwardValue422_19_0;
        break forward_join_24;
    }
    if (!((forwardValue422_19_0 == 0))) {
        break forward_join_29;
    }
    forwardValue422_24_0 = ((((com.moon.id)(p0)).d) ? 1 : 0);
    }
    if (!((life4_5 != 0))) {
        forwardValue422_28_0 = forwardValue422_24_0;
        break forward_join_28;
    }
    if (!((forwardValue422_24_0 == 0))) {
        break forward_join_29;
    }
    forwardValue422_28_0 = 1;
    }
    forwardValue422_30_0 = forwardValue422_28_0;
    break forward_join_30;
    }
    forwardValue422_30_0 = 0;
    }
    return ((forwardValue422_30_0) != 0);
}

}
