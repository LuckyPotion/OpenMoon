package com.moon;


public class fY {

private long a;

private int b;

private double c;

private long d;

private int e;

private boolean f;

private boolean g;

private static boolean h;

private static long i;

public fY(long p0, int p1, double p2) { super(); }


private static void __sourceConstructorBody_5674541c6bfb8e4f(com.moon.fY receiver, long p0, int p1, double p2) throws Throwable {

long local6_life1 = (com.moon.fY.i ^ 80094359384981L);

    boolean __sourceSpill47_3 = com.moon.fY.d();

    com.moon.fY.__sourceConstructorInit_5674541c6bfb8e4f_0(((com.moon.fY)(receiver)));

    boolean local8_life5 = __sourceSpill47_3;

    ((com.moon.fY)(receiver)).a = ((long)(p0));

    ((com.moon.fY)(receiver)).b = ((int)(p1));

    ((com.moon.fY)(receiver)).c = ((double)(p2));

    if (local8_life5) {

        net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[5])));

    }

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_5674541c6bfb8e4f_0(com.moon.fY a0) throws E;

static {
i = ((long)(((moom._a)(moom._c.a(((long)(1022490163506162428L)), ((long)(2804345898010317196L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(199489069118882L)))));
    if (com.moon.fY.d()) {
        com.moon.fY.b(((boolean)(true)));
    }
}


public static void b(boolean p0) {
h = ((boolean)(p0));
    return;
}


public boolean b__Boolean() {
return ((((this.g) ? 1 : 0)) != 0);
}


public long b__Long() {
return this.d;
}


public int b() {
return this.e;
}


public void b__Void() {
this.f = ((boolean)(true));
    return;
}


public static boolean c__Boolean() {
return ((((com.moon.fY.h) ? 1 : 0)) != 0);
}


public void c() {
this.g = ((boolean)(true));
    return;
}


public static boolean d() {
int local0 = __sourceIntrinsic_booleanToInteger(com.moon.fY.c__Boolean());
    if ((local0 == 0)) {
        return ((1) != 0);
    }
    return ((0) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a__Void() {
long life1_3;
    int life3_11;
    life1_3 = (com.moon.fY.i ^ 80451074199512L);
    boolean spill144_0 = com.moon.fY.d();
    com.moon.fY __stackOp144_2_0 = this;
    ((com.moon.fY)(__stackOp144_2_0)).e = ((int)((((com.moon.fY)(__stackOp144_2_0)).e + 1)));
    life3_11 = ((spill144_0) ? 1 : 0);
    if ((net.minecraft.entity.Entity.b__ArrayString() != null)) {
        com.moon.fY.b(((boolean)__sourceIntrinsic_integerToBoolean((((life3_11 != 0) ? 0 : 1)))));
    }
    return;
}


public long a__Long() {
return this.a;
}


public int a__Int() {
return this.b;
}


public double a() {
return this.c;
}


public void a(long p0) {
this.d = ((long)(p0));
    return;
}


public boolean a__Boolean() {
return ((((this.f) ? 1 : 0)) != 0);
}


private static native int __sourceIntrinsic_booleanToInteger(boolean value);
private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
