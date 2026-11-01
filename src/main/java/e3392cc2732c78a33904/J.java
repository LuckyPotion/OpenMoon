package moom;


public class J extends sourcebuild.EnumConstructor<moom.J> implements net.minecraft.util.IStringSerializable {

public static moom.J LEFT;

public static moom.J RIGHT;

private static moom.J[] a;

private static long b;

private J(java.lang.String p0, int p1) {
super(p0, p1);
}


private static void initialize() {
b = ((long)(((moom._a)(moom._c.a(((long)(4692461953258418144L)), ((long)(7833050907132063377L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(72986032512109L)))));
    LEFT = ((moom.J)(new moom.J("LEFT", 0)));
    RIGHT = ((moom.J)(new moom.J("RIGHT", 1)));
    a = ((moom.J[])(moom.J.a__ArrayJ()));
}


public java.lang.String toString() {
return ((moom.J)(this)).a__String();
}


public static moom.J[] values() {
return ((moom.J[])(((moom.J[])(moom.J.a)).clone()));
}


public static moom.J valueOf(java.lang.String p0) {
return ((moom.J)(java.lang.Enum.valueOf(((java.lang.Class)(moom.J.class)), ((java.lang.String)(p0)))));
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static moom.J[] a__ArrayJ() {
return new moom.J[] {moom.J.LEFT, moom.J.RIGHT};
}


public java.lang.String a__String() {
long local1 = (moom.J.b ^ 26275374124770L);
    return ((this == moom.J.LEFT) ? "left" : "right");
}

}
