package moom;


public class MD {

private final java.util.List<moom.MB> a;

private final moom.MB b;

private static final long c;

public MD() {
super();
    this.a = new java.util.ArrayList();
    this.b = (this).a("", moom.bV.NONE, true);
}


static {
c = (moom._c.a(-3346668482564382356L, -1547424311947068863L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(265034290236443L);
}


public java.lang.String toString() {
return ((java.lang.Object)(this.a)).toString();
}


public moom.MB b(java.lang.String p0) {
return this.a(((java.lang.String)(p0)), ((moom.bV)(moom.bV.DEFERRED)), ((moom.MB)(this.b)));
}


public moom.MB b(java.lang.String p0, moom.MB p1) {
return this.a(((java.lang.String)(p0)), ((moom.bV)(moom.bV.SHADOW)), ((moom.MB)(p1)));
}


public moom.MB[] b(java.lang.String p0, int p1) {
long local3 = (moom.MD.c ^ 116887471137231L);
    moom.MB[] local5 = new moom.MB[p1];
    int local6 = 0;
    while ((local6 < p1)) {
        java.lang.String local7 = ((local6 == 0) ? p0 : __sourceIntrinsic_87e2dee1a876_invokedynamic5131_1(p0, local6));
        (local5)[local6] = this.b(((java.lang.String)(local7)));
        local6 += 1;
    }
    return local5;
}


public moom.MB c(java.lang.String p0) {
return this.a(((java.lang.String)(p0)), ((moom.bV)(moom.bV.NONE)), ((boolean)(true)));
}


public moom.MB d(java.lang.String p0) {
long life2_3;
    int life4_5;
    java.util.Iterator life5_11;
    moom.MB life6_18;
    java.lang.String life7_21;
    lexical_join_30: {
    life2_3 = (moom.MD.c ^ 14218029643830L);
    life4_5 = moom.MS.b();
    if (!((p0 != null))) {
        break lexical_join_30;
    }
    life5_11 = ((java.util.List)(this.a)).iterator();
    lexical_cycle_12: while (true) {
    lexical_join_28: {
    if (!(((java.util.Iterator)(life5_11)).hasNext())) {
        break lexical_join_30;
    }
    life6_18 = ((moom.MB)(((java.util.Iterator)(life5_11)).next()));
    life7_21 = ((moom.MB)(life6_18)).a__String();
    if (!(((java.lang.String)(life7_21)).equals(((java.lang.Object)(p0))))) {
        break lexical_join_28;
    }
    return life6_18;
    }
    if (!((life4_5 != 0))) { continue lexical_cycle_12; }
    break lexical_cycle_12;
    }
    }
    return null;
}


public moom.MB[] a__ArrayMB() {
return ((moom.MB[])(((java.util.List)(this.a)).toArray(((java.lang.Object[])(new moom.MB[0])))));
}


public moom.MB[] a(moom.MB p0, moom.MB p1) {
int lexicalValue949_27_0;
    int lexicalValue949_27_1;
    moom.MB[] lexicalValue949_52_0;
    int spill949_0;
    int spill949_1;
    int spill949_2;
    moom.MB[] spill949_3;
    long life3_3;
    int life6_6;
    int life7_10;
    int life5_11;
    int life8_21;
    moom.MB[] life8_32;
    int life9_34;
    lexical_join_52: {
    lexical_join_51: {
    lexical_join_27: {
    lexical_join_23: {
    life3_3 = (moom.MD.c ^ 108901272895782L);
    life6_6 = ((moom.MB)(p0)).a();
    spill949_0 = moom.MS.b();
    life7_10 = ((moom.MB)(p1)).a();
    life5_11 = spill949_0;
    spill949_1 = life6_6;
    spill949_2 = life7_10;
    if (!((life5_11 == 0))) {
        lexicalValue949_27_0 = spill949_1;
        lexicalValue949_27_1 = spill949_2;
        break lexical_join_27;
    }
    if (!((spill949_1 > spill949_2))) {
        break lexical_join_23;
    }
    life8_21 = life6_6;
    life6_6 = life7_10;
    life7_10 = life8_21;
    }
    lexicalValue949_27_0 = (life7_10 - life6_6);
    lexicalValue949_27_1 = 1;
    }
    life8_32 = new moom.MB[(lexicalValue949_27_0 + lexicalValue949_27_1)];
    life9_34 = 0;
    lexical_cycle_32: while (true) {
    if (!((life9_34 < (life8_32).length))) {
        break lexical_join_51;
    }
    spill949_3 = life8_32;
    if (!((life5_11 == 0))) {
        lexicalValue949_52_0 = spill949_3;
        break lexical_join_52;
    }
    (spill949_3)[life9_34] = ((moom.MB)(((java.util.List)(this.a)).get(((int)((life6_6 + life9_34))))));
    life9_34 += 1;
    if (!((life5_11 != 0))) { continue lexical_cycle_32; }
    break lexical_cycle_32;
    }
    }
    lexicalValue949_52_0 = life8_32;
    }
    return lexicalValue949_52_0;
}


public java.lang.String[] a__ArrayString() {
java.lang.String[] lexicalValue950_32_0;
    int spill950_0;
    java.lang.String[] spill950_1;
    long life1_3;
    java.lang.String[] life4_9;
    int life5_11;
    int life3_12;
    lexical_join_32: {
    lexical_join_31: {
    life1_3 = (moom.MD.c ^ 107870925302604L);
    spill950_0 = moom.MS.c();
    life4_9 = new java.lang.String[((java.util.List)(this.a)).size()];
    life5_11 = 0;
    life3_12 = spill950_0;
    lexical_cycle_13: while (true) {
    if (!((life5_11 < (life4_9).length))) {
        break lexical_join_31;
    }
    spill950_1 = life4_9;
    if (!((life3_12 != 0))) {
        lexicalValue950_32_0 = spill950_1;
        break lexical_join_32;
    }
    (spill950_1)[life5_11] = ((moom.MB)(((moom.MB)(((java.util.List)(this.a)).get(((int)(life5_11))))))).a__String();
    life5_11 += 1;
    if (!((life3_12 == 0))) { continue lexical_cycle_13; }
    break lexical_cycle_13;
    }
    }
    lexicalValue950_32_0 = life4_9;
    }
    return lexicalValue950_32_0;
}


private moom.MB a(java.lang.String p0, moom.bV p1, boolean p2) {
int local4 = ((java.util.List)(this.a)).size();
    moom.MB local5 = new moom.MB(local4, p0, p1, p2);
    ((java.util.List)(this.a)).add(((java.lang.Object)(local5)));
    return local5;
}


public moom.MB a(java.lang.String p0, moom.bV p1, moom.MB p2) {
int local4 = ((java.util.List)(this.a)).size();
    moom.MB local5 = new moom.MB(local4, p0, p1, p2);
    ((java.util.List)(this.a)).add(((java.lang.Object)(local5)));
    return local5;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public moom.MB[] a(java.lang.String p0, int p1) {
long local3 = (moom.MD.c ^ 66296032399765L);
    moom.MB[] local5 = new moom.MB[p1];
    int local6 = 0;
    while ((local6 < p1)) {
        java.lang.String local7 = ((local6 == 0) ? p0 : __sourceIntrinsic_9cf7392e266b_invokedynamic5135_1(p0, local6));
        (local5)[local6] = this.a(((java.lang.String)(local7)));
        local6 += 1;
    }
    return local5;
}


public moom.MB a(java.lang.String p0, moom.MB p1) {
return this.a(((java.lang.String)(p0)), ((moom.bV)(moom.bV.GBUFFERS)), ((moom.MB)(p1)));
}


public moom.MB a__MB() {
return this.b;
}


public int a() {
return ((java.util.List)(this.a)).size();
}


public moom.MB a(java.lang.String p0) {
return this.a(((java.lang.String)(p0)), ((moom.bV)(moom.bV.COMPOSITE)), ((moom.MB)(this.b)));
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_87e2dee1a876_invokedynamic5131_1(java.lang.String a0, int a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9cf7392e266b_invokedynamic5135_1(java.lang.String a0, int a1) throws E;
}
