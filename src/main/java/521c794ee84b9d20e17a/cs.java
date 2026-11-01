package com.moon;


public class cs {

private final java.util.List<com.moon.cq> a;

private com.v b;

private static int[] c;

public cs() {
super();
    this.a = ((java.util.List)(new java.util.ArrayList()));
    this.b = ((com.v)(__sourceExactCall_f61d11b8decb1d(((int)(-1)))));
    return;
}


static {
if ((com.moon.cs.b() == null)) {
        com.moon.cs.b(((int[])(new int[3])));
    }
}


public static int[] b() {
return com.moon.cs.c;
}


public static void b(int[] p0) {
com.moon.cs.c = ((int[])(p0));
    return;
}


public com.v a() {
return this.b;
}


public void a(int p0) {
this.b = ((com.v)(__sourceExactCall_f61d11b8decb1d(((int)(p0)))));
    return;
}


public void a(com.moon.cq p0) {
((java.util.List)(this.a)).add(((java.lang.Object)(p0)));
    return;
}


public java.util.List<com.moon.cq> a__List() {
return this.a;
}


private static native com.v __sourceExactCall_f61d11b8decb1d(int p0);
}
