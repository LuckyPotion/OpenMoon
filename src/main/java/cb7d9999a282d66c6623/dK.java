package com.moon;


public class dK extends com.moon.event.CancellableEvent {

private java.lang.String c;

private static boolean e;

public dK(java.lang.String p0) {
super();
    this.c = p0;
}


static {
if ((!com.moon.dK.c())) {
        com.moon.dK.b(((boolean)(true)));
    }
}


public static void b(boolean p0) {
e = ((boolean)(p0));
    return;
}


public static boolean c() {
return ((((com.moon.dK.e) ? 1 : 0)) != 0);
}


public static boolean d() {
int local0 = __sourceIntrinsic_booleanToInteger(com.moon.dK.c());
    if ((local0 == 0)) {
        return ((1) != 0);
    }
    return ((0) != 0);
}


public java.lang.String a__sourceReturn_0e30dfc966() {
return this.c;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public com.moon.dK a(java.lang.String p0) {
this.c = ((java.lang.String)(p0));
    return this;
}


private static native int __sourceIntrinsic_booleanToInteger(boolean value);
}
