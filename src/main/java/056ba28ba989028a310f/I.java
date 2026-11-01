package moom;


public class I extends sourcebuild.EnumConstructor<moom.I> implements net.minecraft.util.IStringSerializable {

public static moom.I UPPER;

public static moom.I LOWER;

private static moom.I[] a;

private static long b;

private I(java.lang.String p0, int p1) {
super(p0, p1);
}


private static void initialize() {
b = ((long)(((moom._a)(moom._c.a(((long)(-1089746033448538207L)), ((long)(2999250698594532137L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(82604271056078L)))));
    UPPER = ((moom.I)(new moom.I("UPPER", 0)));
    LOWER = ((moom.I)(new moom.I("LOWER", 1)));
    a = ((moom.I[])(moom.I.a__ArrayI()));
}


public java.lang.String toString() {
return ((moom.I)(this)).a__String();
}


public static moom.I[] values() {
return ((moom.I[])(((moom.I[])(moom.I.a)).clone()));
}


public static moom.I valueOf(java.lang.String p0) {
return ((moom.I)(java.lang.Enum.valueOf(((java.lang.Class)(moom.I.class)), ((java.lang.String)(p0)))));
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static moom.I[] a__ArrayI() {
return new moom.I[] {moom.I.UPPER, moom.I.LOWER};
}


public java.lang.String a__String() {
long local1 = (moom.I.b ^ 23496476265096L);
    return ((this == moom.I.UPPER) ? "upper" : "lower");
}

}
