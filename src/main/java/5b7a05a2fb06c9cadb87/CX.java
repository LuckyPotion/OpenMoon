package moom;


public class CX {

private static final moom.CX a;

private final java.util.Random b;

private final java.lang.String[] c;

private static final long d;

public CX() {
super();
    this.b = new java.util.Random();
    this.c = ("the elder scrolls klaatu berata niktu xyzzy bless curse light darkness fire air earth water hot dry cold wet ignite snuff embiggen twist shorten stretch fiddle destroy imbue galvanize enchant free limited range of towards inside sphere cube self other ball mental physical grow shrink demon elemental spirit animal creature beast humanoid undead fresh stale ").split(" ");
}


static {
d = ((long)(((moom._a)(moom._c.a(((long)(-6105722384536201820L)), ((long)(-5306581880752943336L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(202445363532356L)))));
    a = ((moom.CX)(new moom.CX()));
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(long p0) {
((java.util.Random)(this.b)).setSeed(((long)(p0)));
    return;
}


public java.lang.String a() {
boolean spill531_0;
    long life1_3;
    int life4_11;
    int life3_12;
    java.lang.StringBuilder life5_16;
    int life6_18;
    lexical_join_43: {
    life1_3 = (moom.CX.d ^ 114204405505645L);
    spill531_0 = moom.DS.b__Boolean();
    life4_11 = (((java.util.Random)(this.b)).nextInt(((int)(2))) + 3);
    life3_12 = ((spill531_0) ? 1 : 0);
    life5_16 = new java.lang.StringBuilder();
    life6_18 = 0;
    lexical_cycle_19: while (true) {
    lexical_join_28: {
    if (!((life6_18 < life4_11))) {
        break lexical_join_43;
    }
    if (!((life6_18 > 0))) {
        break lexical_join_28;
    }
    ((java.lang.StringBuilder)(life5_16)).append(((java.lang.String)(" ")));
    }
    ((java.lang.StringBuilder)(life5_16)).append(((java.lang.String)((this.c)[((java.util.Random)(this.b)).nextInt(((int)((this.c).length)))])));
    life6_18 += 1;
    if (!((life3_12 != 0))) { continue lexical_cycle_19; }
    break lexical_cycle_19;
    }
    }
    return ((java.lang.StringBuilder)(life5_16)).toString();
}


public static moom.CX a__CX() {
return moom.CX.a;
}

}
