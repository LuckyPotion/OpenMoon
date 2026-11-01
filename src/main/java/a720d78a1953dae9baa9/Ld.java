package moom;


public class Ld {

private final moom.Lg[] a;

private static final long b;

public Ld(moom.Lg[] p0) {
super();
    this.a = p0;
}


static {
b = (moom._c.a(6911403811149971884L, -3922359993383680803L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(187048346142335L);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public boolean a(moom.La p0) {
int lexicalValue930_35_0;
    int[] spill930_0;
    boolean spill930_1;
    long life2_3;
    moom.Lg[] life5_6;
    int life6_10;
    int[] life4_11;
    int life7_13;
    moom.Lg life8_20;
    lexical_join_35: {
    lexical_join_34: {
    life2_3 = (moom.Ld.b ^ 39245356785498L);
    life5_6 = this.a;
    spill930_0 = moom.Lg.b();
    life6_10 = (life5_6).length;
    life4_11 = spill930_0;
    life7_13 = 0;
    lexical_cycle_14: while (true) {
    lexical_join_32: {
    lexical_join_31: {
    if (!((life7_13 < life6_10))) {
        break lexical_join_34;
    }
    life8_20 = (life5_6)[life7_13];
    if (!((life4_11 == null))) {
        break lexical_join_32;
    }
    spill930_1 = ((moom.Lg)(life8_20)).a(((moom.La)(p0)));
    if (!((life4_11 == null))) {
        lexicalValue930_35_0 = ((spill930_1) ? 1 : 0);
        break lexical_join_35;
    }
    if (!((!spill930_1))) {
        break lexical_join_31;
    }
    return ((0) != 0);
    }
    life7_13 += 1;
    }
    if (!((life4_11 != null))) { continue lexical_cycle_14; }
    break lexical_cycle_14;
    }
    }
    lexicalValue930_35_0 = 1;
    }
    return ((lexicalValue930_35_0) != 0);
}


public void a() {
int[] spill929_0;
    long life1_3;
    moom.Lg[] life4_6;
    int life5_10;
    int[] life3_11;
    int life6_13;
    moom.Lg life7_20;
    lexical_join_26: {
    life1_3 = (moom.Ld.b ^ 53902337608212L);
    life4_6 = this.a;
    spill929_0 = moom.Lg.b();
    life5_10 = (life4_6).length;
    life3_11 = spill929_0;
    life6_13 = 0;
    lexical_cycle_14: while (true) {
    if (!((life6_13 < life5_10))) {
        break lexical_join_26;
    }
    life7_20 = (life4_6)[life6_13];
    ((moom.Lg)(life7_20)).a();
    life6_13 += 1;
    if (!((life3_11 != null))) { continue lexical_cycle_14; }
    break lexical_cycle_14;
    }
    }
    return;
}

}
