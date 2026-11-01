package moom;


public class D0 {

private static final long a;

public D0() {
super();
}


static {
a = (moom._c.a(8015619814999548777L, 3796001599687411056L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(128209182187563L);
}


private static java.lang.IllegalArgumentException a(java.lang.IllegalArgumentException p0) {
return p0;
}


public static <T extends moom.D1> T a(java.util.Random p0, java.util.Collection<T> p1) {
return ((T)(moom.D0.a(((java.util.Random)(p0)), ((java.util.Collection)(p1)), ((int)(moom.D0.a(((java.util.Collection)(p1))))))));
}


public static <T extends moom.D1> T a(java.util.Collection<T> p0, int p1) {
boolean spill550_0;
    long life2_3;
    java.util.Iterator life5_7;
    int life4_8;
    moom.D1 life6_15;
    lexical_join_27: {
    life2_3 = (moom.D0.a ^ 21020060359592L);
    spill550_0 = moom.DS.c__Boolean();
    life5_7 = ((java.util.Collection)(p0)).iterator();
    life4_8 = ((spill550_0) ? 1 : 0);
    lexical_cycle_9: while (true) {
    lexical_join_25: {
    if (!(((java.util.Iterator)(life5_7)).hasNext())) {
        break lexical_join_27;
    }
    life6_15 = ((moom.D1)(((java.util.Iterator)(life5_7)).next()));
    p1 = (p1 - ((moom.D1)(life6_15)).a);
    if (!((p1 < 0))) {
        break lexical_join_25;
    }
    return ((T)(life6_15));
    }
    if (!((life4_8 == 0))) { continue lexical_cycle_9; }
    break lexical_cycle_9;
    }
    }
    return null;
}


public static <T extends moom.D1> T a(java.util.Random p0, java.util.Collection<T> p1, int p2) {
int forwardValue1682_17_0;
    int spill1682_0;
    long life3_3;
    int life5_5;
    int life6_22;
    forward_join_17: {
    forward_join_14: {
    life3_3 = (moom.D0.a ^ 99509448811018L);
    life5_5 = ((moom.DS.c__Boolean()) ? 1 : 0);
    spill1682_0 = p2;
    if (!((life5_5 != 0))) {
        forwardValue1682_17_0 = spill1682_0;
        break forward_join_17;
    }
    if (!((spill1682_0 <= 0))) {
        break forward_join_14;
    }
    throw new java.lang.IllegalArgumentException();
    }
    forwardValue1682_17_0 = ((java.util.Random)(p0)).nextInt(((int)(p2)));
    }
    life6_22 = forwardValue1682_17_0;
    return ((T)(moom.D0.a(((java.util.Collection)(p1)), ((int)(life6_22)))));
}


public static int a(java.util.Collection<? extends moom.D1> p0) {
int lexicalValue549_28_0;
    boolean spill549_0;
    int spill549_1;
    long life1_3;
    int life4_6;
    int life3_7;
    java.util.Iterator life5_10;
    moom.D1 life6_17;
    lexical_join_28: {
    lexical_join_27: {
    life1_3 = (moom.D0.a ^ 119961092537883L);
    spill549_0 = moom.DS.c__Boolean();
    life4_6 = 0;
    life3_7 = ((spill549_0) ? 1 : 0);
    life5_10 = ((java.util.Collection)(p0)).iterator();
    lexical_cycle_11: while (true) {
    if (!(((java.util.Iterator)(life5_10)).hasNext())) {
        break lexical_join_27;
    }
    life6_17 = ((moom.D1)(((java.util.Iterator)(life5_10)).next()));
    spill549_1 = (life4_6 + ((moom.D1)(life6_17)).a);
    if (!((life3_7 != 0))) {
        lexicalValue549_28_0 = spill549_1;
        break lexical_join_28;
    }
    life4_6 = spill549_1;
    if (!((life3_7 == 0))) { continue lexical_cycle_11; }
    break lexical_cycle_11;
    }
    }
    lexicalValue549_28_0 = life4_6;
    }
    return lexicalValue549_28_0;
}

}
