package com.moon;


public class cL {

private java.lang.String[] a;

private java.lang.String b;

private static boolean c;

public cL(java.lang.String[] p0, java.lang.String p1) {
super();
    this.a = p0;
    this.b = p1;
}


static {
if ((!com.moon.cL.c())) {
        com.moon.cL.b(((boolean)(true)));
    }
}


public static boolean b() {
return ((((com.moon.cL.c) ? 1 : 0)) != 0);
}


public static void b(boolean p0) {
c = ((boolean)(p0));
    return;
}


public static boolean c() {
int local0 = __sourceIntrinsic_booleanToInteger(com.moon.cL.b());
    if ((local0 == 0)) {
        return ((1) != 0);
    }
    return ((0) != 0);
}


public com.moon.cL a(java.lang.String p0) {
this.b = ((java.lang.String)(p0));
    return this;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public java.lang.String[] a__ArrayString() {
return this.a;
}


public java.lang.String a() {
return this.b;
}


public com.moon.cL a(java.lang.String[] p0) {
this.a = ((java.lang.String[])(p0));
    return this;
}


private static native int __sourceIntrinsic_booleanToInteger(boolean value);
}
