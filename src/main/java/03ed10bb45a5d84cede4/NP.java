package moom;


public class NP {

private int[] a;

private int b;

private int c;

private static final long d;

public NP(int p0) {
super();
    this.a = null;
    this.b = 0;
    this.c = 0;
    this.a = new int[p0];
}


static {
d = (moom._c.a(1153955819610498156L, -4686473064522421872L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(280985530502174L);
}


public int b() {
return this.b;
}


public void b(int p0) {
this.b = ((int)(p0));
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public int a() {
return this.c;
}


public void a__Void() {
this.b = ((int)(0));
    this.c = ((int)(0));
    return;
}


public void a__Void(int p0) {
moom.NP forwardValue2813_26_0;
    int spill2813_0;
    moom.NP spill2813_1;
    long life2_3;
    int life4_17;
    forward_join_29: {
    forward_join_26: {
    life2_3 = (moom.NP.d ^ 122377037092862L);
    (this.a)[this.b] = p0;
    spill2813_0 = moom.Ob.c();
    moom.NP __stackOp2813_4_0 = this;
    ((moom.NP)(__stackOp2813_4_0)).b = ((int)((((moom.NP)(__stackOp2813_4_0)).b + 1)));
    life4_17 = spill2813_0;
    spill2813_1 = this;
    if (!((life4_17 != 0))) {
        forwardValue2813_26_0 = spill2813_1;
        break forward_join_26;
    }
    if (!((((moom.NP)(spill2813_1)).c < this.b))) {
        break forward_join_29;
    }
    forwardValue2813_26_0 = this;
    }
    ((moom.NP)(forwardValue2813_26_0)).c = ((int)(this.b));
    }
    return;
}


public void a(int p0, int p1) {
moom.NP forwardValue2811_18_0;
    int spill2811_0;
    moom.NP spill2811_1;
    long life3_3;
    int life5_10;
    forward_join_20: {
    forward_join_18: {
    life3_3 = (moom.NP.d ^ 16489138103016L);
    spill2811_0 = moom.Ob.b();
    (this.a)[p0] = p1;
    life5_10 = spill2811_0;
    spill2811_1 = this;
    if (!((life5_10 == 0))) {
        forwardValue2811_18_0 = spill2811_1;
        break forward_join_18;
    }
    if (!((((moom.NP)(spill2811_1)).c < p0))) {
        break forward_join_20;
    }
    forwardValue2811_18_0 = this;
    }
    ((moom.NP)(forwardValue2811_18_0)).c = ((int)(p0));
    }
    return;
}


public void a(int[] p0) {
moom.NP lexicalValue1001_48_0;
    int spill1001_0;
    moom.NP spill1001_1;
    long life2_3;
    int life5_6;
    int[] life6_9;
    int life7_12;
    int life4_13;
    int life8_15;
    int life9_22;
    lexical_join_51: {
    lexical_join_48: {
    lexical_join_40: {
    life2_3 = (moom.NP.d ^ 99538764754276L);
    life5_6 = (p0).length;
    spill1001_0 = moom.Ob.c();
    life6_9 = p0;
    life7_12 = (life6_9).length;
    life4_13 = spill1001_0;
    life8_15 = 0;
    lexical_cycle_16: while (true) {
    if (!((life8_15 < life7_12))) {
        break lexical_join_40;
    }
    life9_22 = (life6_9)[life8_15];
    (this.a)[this.b] = life9_22;
    moom.NP __stackOp1001_4_0 = this;
    ((moom.NP)(__stackOp1001_4_0)).b = ((int)((((moom.NP)(__stackOp1001_4_0)).b + 1)));
    life8_15 += 1;
    if (!((life4_13 != 0))) {
        break lexical_join_51;
    }
    if (!((life4_13 == 0))) { continue lexical_cycle_16; }
    break lexical_cycle_16;
    }
    }
    spill1001_1 = this;
    if (!((life4_13 != 0))) {
        lexicalValue1001_48_0 = spill1001_1;
        break lexical_join_48;
    }
    if (!((((moom.NP)(spill1001_1)).c < this.b))) {
        break lexical_join_51;
    }
    lexicalValue1001_48_0 = this;
    }
    ((moom.NP)(lexicalValue1001_48_0)).c = ((int)(this.b));
    }
    return;
}


public int a(int p0) {
return (this.a)[p0];
}


public int[] a__ArrayInt() {
return this.a;
}

}
