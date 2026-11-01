package moom;


public abstract class Bj {

private static java.lang.String[] b;

private static final long n;

public Bj() {
super();
}


static {
n = ((long)(((moom._a)(moom._c.a(((long)(1353123823139930725L)), ((long)(-1956645146127220968L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(97212780052337L)))));
    if ((moom.Bj.b__ArrayString() == null)) {
        moom.Bj.b(((java.lang.String[])(new java.lang.String[2])));
    }
}


public abstract net.minecraft.scoreboard.Team$EnumVisible b__bo();

public abstract boolean b__Boolean();

public static void b(java.lang.String[] p0) {
b = ((java.lang.String[])(p0));
    return;
}


public static java.lang.String[] b__ArrayString() {
return moom.Bj.b;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public abstract java.util.Collection<java.lang.String> a__Collection();

public boolean a(moom.Bj p0) {
long local2 = (moom.Bj.n ^ 29635379959781L);
    return ((((this == p0) ? 1 : 0)) != 0);
}


public abstract java.lang.String a__String();

public abstract java.lang.String a(java.lang.String p0);

public abstract boolean a__Boolean();

public abstract net.minecraft.scoreboard.Team$EnumVisible a__bo();
}
