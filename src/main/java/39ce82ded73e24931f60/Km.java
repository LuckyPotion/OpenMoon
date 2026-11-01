package moom;


public abstract class Km {

private final java.lang.Class a;

private final java.lang.String b;

private final float c;

private java.lang.String[] d;

private static int[] e;

private static final long g;

public Km(java.lang.Class p0, java.lang.String p1, float p2) {
super();
    this.a = p0;
    this.b = p1;
    this.c = p2;
}


public Km(java.lang.Class p0, java.lang.String p1, float p2, java.lang.String[] p3) {
super();
    this.a = p0;
    this.b = p1;
    this.c = p2;
    this.d = p3;
}


static {
g = ((long)(((moom._a)(moom._c.a(((long)(-5032232360536107447L)), ((long)(-2895413045925175667L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(82346457717514L)))));
    if ((moom.Km.b() == null)) {
        moom.Km.b(((int[])(new int[5])));
    }
}


public abstract java.lang.String[] b__ArrayString();

public static void b(int[] p0) {
moom.Km.e = ((int[])(p0));
    return;
}


public static int[] b() {
return moom.Km.e;
}


private static moom.Oo c(moom.Oo p0) {
return p0;
}


public java.lang.String[] a__ArrayString() {
return this.d;
}


public java.lang.String a__String() {
return this.b;
}


public java.lang.Class a__Class() {
return this.a;
}


public abstract moom.jD a(moom.iQ p0, java.lang.String p1);

public abstract moom.iQ a__iQ();

public float a() {
return this.c;
}


public abstract moom.Kl a(moom.iQ p0, float p1);

public moom.jD[] a(moom.iQ p0) {
java.lang.Object[] lexicalValue904_49_0;
    int[] spill904_0;
    java.lang.String[] spill904_1;
    long life2_3;
    java.lang.String[] life5_6;
    java.util.ArrayList life6_11;
    int[] life4_12;
    java.lang.String[] life7_14;
    int life8_17;
    int life9_19;
    java.lang.String life10_28;
    moom.jD life11_33;
    lexical_join_49: {
    lexical_join_45: {
    life2_3 = (moom.Km.g ^ 112438745707077L);
    life5_6 = ((moom.Km)(this)).b__ArrayString();
    spill904_0 = moom.Km.b();
    life6_11 = new java.util.ArrayList();
    life4_12 = spill904_0;
    life7_14 = life5_6;
    life8_17 = (life7_14).length;
    life9_19 = 0;
    lexical_cycle_20: while (true) {
    lexical_join_43: {
    lexical_join_42: {
    if (!((life9_19 < life8_17))) {
        break lexical_join_45;
    }
    spill904_1 = life7_14;
    if (!((life4_12 != null))) {
        lexicalValue904_49_0 = spill904_1;
        break lexical_join_49;
    }
    life10_28 = (spill904_1)[life9_19];
    life11_33 = this.a(((moom.iQ)(p0)), ((java.lang.String)(life10_28)));
    if (!((life4_12 != null))) {
        break lexical_join_43;
    }
    if (!((life11_33 != null))) {
        break lexical_join_42;
    }
    ((java.util.List)(life6_11)).add(((java.lang.Object)(life11_33)));
    }
    life9_19 += 1;
    }
    if (!((life4_12 == null))) { continue lexical_cycle_20; }
    break lexical_cycle_20;
    }
    }
    lexicalValue904_49_0 = ((java.util.List)(life6_11)).toArray(((java.lang.Object[])(new moom.jD[0])));
    }
    return ((moom.jD[])(lexicalValue904_49_0));
}

}
