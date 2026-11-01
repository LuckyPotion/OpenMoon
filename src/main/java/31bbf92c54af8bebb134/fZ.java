package com.moon;


public class fZ {

private double a;

private double b;

private static int c;

private static final long d;

public fZ() {
super();
}


static {
d = ((long)(((moom._a)(moom._c.a(((long)(-9002314441978417571L)), ((long)(2101051610605978797L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(169547651680191L)))));
    if ((com.moon.fZ.c__Int() != 0)) {
        com.moon.fZ.b(((int)(12)));
    }
}


public static void b(int p0) {
com.moon.fZ.c = ((int)(p0));
    return;
}


public static int b__Int() {
return com.moon.fZ.c;
}


public double b() {
return this.a;
}


public double c() {
return this.b;
}


public static int c__Int() {
int local0 = com.moon.fZ.b__Int();
    if ((local0 == 0)) {
        return 20;
    }
    return 0;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public double a(double p0) {
long life3_3;
    double life1_9;
    int life5_10;
    double life6_15;
    life3_3 = (com.moon.fZ.d ^ 30119259432283L);
    int spill145_0 = com.moon.fZ.b__Int();
    life1_9 = java.lang.Math.min(((double)(this.b)), ((double)(p0)));
    life5_10 = spill145_0;
    life6_15 = this.a(((double)(life1_9)), ((double)(0x0.0p0d)));
    com.moon.fZ __stackOp145_5_0 = this;
    ((com.moon.fZ)(__stackOp145_5_0)).b = ((double)((((com.moon.fZ)(__stackOp145_5_0)).b - life1_9)));
    double spill145_1 = life6_15;
    if ((net.minecraft.entity.Entity.b__ArrayString() != null)) {
        life5_10 += 1;
        com.moon.fZ.b(((int)(life5_10)));
    }
    return spill145_1;
}


public double a() {
double local1_life2 = java.lang.Math.floor(((double)(this.a)));
    this.a -= local1_life2;
    return local1_life2;
}


public double a(double p0, double p1) {
long life5_3;
    double life8_6;
    double life10_10;
    int life7_20;
    double life10_26;
    life5_3 = (com.moon.fZ.d ^ 1818481731819L);
    life8_6 = java.lang.Math.floor(((double)(p0)));
    life10_10 = (p0 - life8_6);
    int spill146_0 = com.moon.fZ.b__Int();
    com.moon.fZ __stackOp146_3_0 = this;
    ((com.moon.fZ)(__stackOp146_3_0)).b = ((double)((((com.moon.fZ)(__stackOp146_3_0)).b + (life10_10 * p1))));
    life7_20 = spill146_0;
    life10_26 = (life10_10 - (life10_10 * p1));
    com.moon.fZ __stackOp146_6_0 = this;
    ((com.moon.fZ)(__stackOp146_6_0)).a = ((double)((((com.moon.fZ)(__stackOp146_6_0)).a + (life10_26 * (0x1.0p0d - p1)))));
    double spill146_1 = (life8_6 + this.a());
    if ((life7_20 == 0)) {
        net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[5])));
    }
    return spill146_1;
}

}
