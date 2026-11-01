package com.moon;


public class hK {

private final java.lang.String a;

private final java.lang.String b;

private final com.moon.hL c;

private long d;

private static int[] e;

private hK(java.lang.String p0, java.lang.String p1) {
super();
    this.c = com.moon.hL.a__hL();
    this.a = p0;
    this.b = p1;
}


static {
if ((com.moon.hK.b__ArrayInt() != null)) {
        com.moon.hK.b(((int[])(new int[1])));
    }
}


public static void b(int[] p0) {
com.moon.hK.e = ((int[])(p0));
    return;
}


public java.lang.String b() {
return this.b;
}


public void b__Void() {
((com.moon.hL)(this.c)).a__Void(((long)((java.lang.System.nanoTime() - this.d))));
    return;
}


public static int[] b__ArrayInt() {
return com.moon.hK.e;
}


public void c() {
((com.moon.hL)(this.c)).b__Void();
    return;
}


public void a__Void() {
this.d = ((long)(java.lang.System.nanoTime()));
    return;
}


public static com.moon.hK a(java.lang.String p0, java.lang.String p1) {
return new com.moon.hK(p0, p1);
}


public java.lang.String a__String() {
return this.a;
}


public com.moon.hL a__hL() {
return this.c;
}


public long a() {
return this.d;
}


public com.moon.hK a(long p0) {
this.d = ((long)(p0));
    return this;
}

}
