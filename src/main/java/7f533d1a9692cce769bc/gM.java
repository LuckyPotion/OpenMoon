package com.moon;


public class gM {

private final java.util.List<java.lang.String> a;

private final java.util.List<java.lang.String> b;

private java.io.File c;

private java.io.File d;

private static final long e;

public gM() {
super();
    this.a = new java.util.ArrayList();
    this.b = new java.util.ArrayList();
}


static {
e = (moom._c.a(-6986148882117809364L, 2749614505114267224L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(34825940246104L);
}


public java.util.List<java.lang.String> b__List() {
return this.b;
}


public java.io.File b() {
return this.d;
}


public void b(java.io.File p0) {
long local2 = (com.moon.gM.e ^ 96505024679189L);
    ((java.util.List)(this.b)).clear();
    int[] spill1094_0 = com.moon.gP.b();
    ((java.util.List)(this.b)).addAll(((java.util.Collection)(this.a(((java.io.File)(p0))))));
    int[] local4 = spill1094_0;
    this.d = ((java.io.File)(p0));
    if ((net.minecraft.entity.Entity.b__ArrayString() != null)) {
        com.moon.gP.b(((int[])(new int[5])));
    }
    return;
}


public java.io.File a() {
return this.c;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a__Void(java.io.File p0) {
((java.util.List)(this.a)).clear();
    ((java.util.List)(this.a)).addAll(((java.util.Collection)(this.a(((java.io.File)(p0))))));
    this.c = ((java.io.File)(p0));
    return;
}


public void a__Void() {
java.io.File forwardValue252_13_0;
    java.io.File forwardValue252_18_0;
    int forwardValue252_27_0;
    com.moon.gM forwardValue252_34_0;
    java.io.File spill252_0;
    boolean spill252_1;
    com.moon.gM spill252_2;
    long life1_3;
    int[] life3_5;
    forward_join_34: {
    forward_join_29: {
    forward_join_28: {
    forward_join_27: {
    forward_join_18: {
    forward_join_13: {
    life1_3 = (com.moon.gM.e ^ 55737153170555L);
    life3_5 = com.moon.gP.b();
    spill252_0 = this.c;
    if (!((life3_5 == null))) {
        forwardValue252_13_0 = spill252_0;
        break forward_join_13;
    }
    if (!((spill252_0 != null))) {
        break forward_join_28;
    }
    forwardValue252_13_0 = this.d;
    }
    if (!((life3_5 == null))) {
        forwardValue252_18_0 = forwardValue252_13_0;
        break forward_join_18;
    }
    if (!((forwardValue252_13_0 != null))) {
        break forward_join_28;
    }
    forwardValue252_18_0 = this.c;
    }
    spill252_1 = ((java.io.File)(forwardValue252_18_0)).exists();
    if (!((life3_5 == null))) {
        forwardValue252_27_0 = ((spill252_1) ? 1 : 0);
        break forward_join_27;
    }
    if (!(spill252_1)) {
        break forward_join_28;
    }
    spill252_2 = this;
    if (!((life3_5 == null))) {
        forwardValue252_34_0 = spill252_2;
        break forward_join_34;
    }
    forwardValue252_27_0 = ((((java.io.File)(((com.moon.gM)(spill252_2)).d)).exists()) ? 1 : 0);
    }
    if (!((forwardValue252_27_0 == 0))) {
        break forward_join_29;
    }
    }
    return;
    }
    ((com.moon.gM)(this)).a__Void(((java.io.File)(this.c)));
    forwardValue252_34_0 = this;
    }
    ((com.moon.gM)(forwardValue252_34_0)).b(((java.io.File)(this.d)));
    return;
}


private java.util.List<java.lang.String> a(java.io.File p0) {
try {
        return ((java.util.stream.Stream)(java.nio.file.Files.lines(((java.nio.file.Path)(((java.io.File)(p0)).toPath()))))).toList();
    } catch (java.io.IOException caught2) {
        return java.util.List.of();
    }
}


public java.util.List<java.lang.String> a__List() {
return this.a;
}

}
