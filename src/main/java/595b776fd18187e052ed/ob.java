package com.moon;


public class ob {

private final java.lang.String a;

private final java.util.function.Supplier<java.lang.String> b;

private static java.lang.String c;

private ob(java.lang.String p0, java.util.function.Supplier<java.lang.String> p1) {
super();
    this.a = p0;
    this.b = p1;
}


static {
if ((com.moon.ob.b() == null)) {
        com.moon.ob.b(((java.lang.String)("emz9Kb")));
    }
}


public static java.lang.String b() {
return com.moon.ob.c;
}


public static void b(java.lang.String p0) {
com.moon.ob.c = ((java.lang.String)(p0));
    return;
}


public java.lang.String a() {
return this.a;
}


public static com.moon.ob a(java.lang.String p0, java.util.function.Supplier<java.lang.String> p1) {
return new com.moon.ob(p0, p1);
}


public java.util.function.Supplier<java.lang.String> a__Supplier() {
return this.b;
}

}
