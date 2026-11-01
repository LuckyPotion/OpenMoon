package moom;


public class K extends sourcebuild.EnumConstructor<moom.K> implements net.minecraft.util.IStringSerializable {

public static moom.K UPPER;

public static moom.K LOWER;

private static moom.K[] a;

private static long b;

private K(java.lang.String p0, int p1) {
super(p0, p1);
}


private static void initialize() {
b = ((long)(((moom._a)(moom._c.a(((long)(635392475327749813L)), ((long)(1750383927581627977L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(143230209215982L)))));
    UPPER = ((moom.K)(new moom.K("UPPER", 0)));
    LOWER = ((moom.K)(new moom.K("LOWER", 1)));
    a = ((moom.K[])(moom.K.a__ArrayK()));
}


public java.lang.String toString() {
return ((moom.K)(this)).a__String();
}


public static moom.K[] values() {
return ((moom.K[])(((moom.K[])(moom.K.a)).clone()));
}


public static moom.K valueOf(java.lang.String p0) {
return ((moom.K)(java.lang.Enum.valueOf(((java.lang.Class)(moom.K.class)), ((java.lang.String)(p0)))));
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static moom.K[] a__ArrayK() {
return new moom.K[] {moom.K.UPPER, moom.K.LOWER};
}


public java.lang.String a__String() {
long local1 = (moom.K.b ^ 16147798693712L);
    return ((this == moom.K.UPPER) ? "upper" : "lower");
}

}
