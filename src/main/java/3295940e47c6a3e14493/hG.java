package com.moon;


public class hG implements com.moon.hH {

private final int a;

private final byte[] b;

private int c;

private int d;

private int e;

private static java.lang.String f;

private static final long g;

public hG(int p0) {
super();
    this.a = (p0 * 2);
    this.b = new byte[(((this.a * this.a) * this.a) / 4)];
}


static {
g = ((long)(((moom._a)(moom._c.a(((long)(387667869948888072L)), ((long)(-4779863405493974895L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(254117979778859L)))));
    if ((com.moon.hG.b() == null)) {
        com.moon.hG.b(((java.lang.String)("GDDcc")));
    }
}


public static void b(java.lang.String p0) {
com.moon.hG.f = ((java.lang.String)(p0));
    return;
}


public void b__Void() {
byte[] __stackOp35_2_0 = this.b;
    int __stackOp35_2_1 = this.d;
    (__stackOp35_2_0)[__stackOp35_2_1] = ((byte) ((__stackOp35_2_0)[__stackOp35_2_1] | (1 << (this.e + 1))));
    return;
}


public void b(int p0, int p1, int p2) {
long life4_3;
    java.lang.String life6_27;
    life4_3 = (com.moon.hG.g ^ 10546864876327L);
    java.lang.String spill313_0 = com.moon.hG.b();
    this.c = ((int)(((p0 + (p1 * this.a)) + ((p2 * this.a) * this.a))));
    this.d = ((int)((this.c / 4)));
    life6_27 = spill313_0;
    this.e = ((int)(((this.c % 4) * 2)));
    byte[] __stackOp313_12_0 = this.b;
    int __stackOp313_12_1 = this.d;
    (__stackOp313_12_0)[__stackOp313_12_1] = ((byte) ((__stackOp313_12_0)[__stackOp313_12_1] | (1 << (this.e + 1))));
    if ((life6_27 == null)) {
        net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[1])));
    }
    return;
}


public static java.lang.String b() {
return com.moon.hG.f;
}


public void c() {
byte[] __stackOp36_2_0 = this.b;
    int __stackOp36_2_1 = this.d;
    (__stackOp36_2_0)[__stackOp36_2_1] = ((byte) ((__stackOp36_2_0)[__stackOp36_2_1] | (1 << this.e)));
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a() {
java.util.Arrays.fill(((byte[])(this.b)), ((byte)(0)));
    return;
}


public void a__Void(int p0, int p1, int p2) {
long life4_3;
    java.lang.String life6_35;
    life4_3 = (com.moon.hG.g ^ 71407984363565L);
    java.lang.String spill312_0 = com.moon.hG.b();
    this.c = ((int)(((p0 + (p1 * this.a)) + ((p2 * this.a) * this.a))));
    this.d = ((int)((this.c / 4)));
    this.e = ((int)(((this.c % 4) * 2)));
    life6_35 = spill312_0;
    byte[] __stackOp312_12_0 = this.b;
    int __stackOp312_12_1 = this.d;
    (__stackOp312_12_0)[__stackOp312_12_1] = ((byte) ((__stackOp312_12_0)[__stackOp312_12_1] | (1 << this.e)));
    if ((net.minecraft.entity.Entity.b__ArrayString() != null)) {
        com.moon.hG.b(((java.lang.String)("lcWbRc")));
    }
    return;
}


public int a(int p0, int p1, int p2) {
this.c = ((int)(((p0 + (p1 * this.a)) + ((p2 * this.a) * this.a))));
    this.d = ((int)((this.c / 4)));
    this.e = ((int)(((this.c % 4) * 2)));
    return (((this.b)[this.d] >> this.e) & 3);
}

}
