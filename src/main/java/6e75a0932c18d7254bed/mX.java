package com.moon;


public class mX {

private final java.util.function.Consumer<com.moon.n4> a;

private final boolean b;

private float c;

private float d;

private static java.lang.String[] e;

private static final long f;

public mX(java.util.function.Consumer<com.moon.n4> p0, boolean p1) {
super();
    this.a = p0;
    this.b = p1;
}


static {
f = ((long)(((moom._a)(moom._c.a(((long)(6588047963110910696L)), ((long)(3041352515160545468L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(23033675065262L)))));
    if ((com.moon.mX.b__ArrayString() == null)) {
        com.moon.mX.b(((java.lang.String[])(new java.lang.String[4])));
    }
}


public com.moon.mX b(float p0) {
this.d = ((float)(p0));
    return this;
}


public float b() {
return this.d;
}


public static void b(java.lang.String[] p0) {
com.moon.mX.e = ((java.lang.String[])(p0));
    return;
}


public static java.lang.String[] b__ArrayString() {
return com.moon.mX.e;
}


public com.moon.mX a(float p0) {
this.c = ((float)(p0));
    return this;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a__Void() {
long local1 = (com.moon.mX.f ^ 130767248978428L);
    java.lang.String[] spill1906_0 = com.moon.mX.b__ArrayString();
    ((java.util.function.Consumer)(this.a)).accept(((java.lang.Object)(new com.moon.n4(this.c, this.d))));
    java.lang.String[] local3 = spill1906_0;
    if ((net.minecraft.entity.Entity.b__ArrayString() != null)) {
        com.moon.mX.b(((java.lang.String[])(new java.lang.String[4])));
    }
    return;
}


public boolean a(int p0, int p1) {
long local3 = (com.moon.mX.f ^ 114103944298250L);
    java.lang.String[] local5 = com.moon.mX.b__ArrayString();
    boolean spill1907_0 = this.a(((int)(p0)), ((int)(p1)), ((float)((this.c - 0x1.4p3f))), ((float)((this.d - 0x1.4p3f))), ((float)(0x1.4p4f)), ((float)(0x1.4p4f)));
    if ((local5 == null)) {
        net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[3])));
    }
    return spill1907_0;
}


private boolean a(int p0, int p1, float p2, float p3, float p4, float p5) {
int forwardValue744_19_0;
    int forwardValue744_26_0;
    int forwardValue744_35_0;
    int forwardValue744_39_0;
    int forwardValue744_41_0;
    int spill744_0;
    long life7_3;
    java.lang.String[] life9_5;
    forward_join_41: {
    forward_join_40: {
    forward_join_39: {
    forward_join_35: {
    forward_join_26: {
    forward_join_19: {
    life7_3 = (com.moon.mX.f ^ 42358569089231L);
    life9_5 = com.moon.mX.b__ArrayString();
    spill744_0 = recovery.source.CarrierOps.fcmpl(((float)(((float) p0))), ((float)(p2)));
    if (!((life9_5 != null))) {
        forwardValue744_19_0 = spill744_0;
        break forward_join_19;
    }
    if (!((spill744_0 >= 0))) {
        break forward_join_40;
    }
    forwardValue744_19_0 = recovery.source.CarrierOps.fcmpg(((float)(((float) p0))), ((float)((p2 + p4))));
    }
    if (!((life9_5 != null))) {
        forwardValue744_26_0 = forwardValue744_19_0;
        break forward_join_26;
    }
    if (!((forwardValue744_19_0 <= 0))) {
        break forward_join_40;
    }
    forwardValue744_26_0 = recovery.source.CarrierOps.fcmpl(((float)(((float) p1))), ((float)(p3)));
    }
    if (!((life9_5 != null))) {
        forwardValue744_35_0 = forwardValue744_26_0;
        break forward_join_35;
    }
    if (!((forwardValue744_26_0 >= 0))) {
        break forward_join_40;
    }
    forwardValue744_35_0 = recovery.source.CarrierOps.fcmpg(((float)(((float) p1))), ((float)((p3 + p5))));
    }
    if (!((life9_5 != null))) {
        forwardValue744_39_0 = forwardValue744_35_0;
        break forward_join_39;
    }
    if (!((forwardValue744_35_0 <= 0))) {
        break forward_join_40;
    }
    forwardValue744_39_0 = 1;
    }
    forwardValue744_41_0 = forwardValue744_39_0;
    break forward_join_41;
    }
    forwardValue744_41_0 = 0;
    }
    return ((forwardValue744_41_0) != 0);
}


public java.util.function.Consumer<com.moon.n4> a__Consumer() {
return this.a;
}


public boolean a__Boolean() {
return ((((this.b) ? 1 : 0)) != 0);
}


public float a() {
return this.c;
}

}
