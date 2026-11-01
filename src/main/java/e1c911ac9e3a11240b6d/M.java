package moom;


public class M extends sourcebuild.EnumConstructor<moom.M> {

public static moom.M YELLOW;

public static moom.M RED;

private static moom.M[] a;

private static long b;

private M(java.lang.String p0, int p1) {
super(p0, p1);
}


private static void initialize() {
b = ((long)(((moom._a)(moom._c.a(((long)(-7530632772897692087L)), ((long)(-4863332920139727996L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(220251533297767L)))));
    YELLOW = ((moom.M)(new moom.M("YELLOW", 0)));
    RED = ((moom.M)(new moom.M("RED", 1)));
    a = ((moom.M[])(moom.M.a__ArrayM()));
}


public static moom.M[] values() {
return ((moom.M[])(((moom.M[])(moom.M.a)).clone()));
}


public static moom.M valueOf(java.lang.String p0) {
return ((moom.M)(java.lang.Enum.valueOf(((java.lang.Class)(moom.M.class)), ((java.lang.String)(p0)))));
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static moom.M[] a__ArrayM() {
return new moom.M[] {moom.M.YELLOW, moom.M.RED};
}


public moom.cA a() {
long local1 = (moom.M.b ^ 46066886820433L);
    return ((this == moom.M.YELLOW) ? net.minecraft.init.Blocks.N : net.minecraft.init.Blocks.O);
}

}
