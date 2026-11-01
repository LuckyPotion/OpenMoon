package com.moon;


public class jM {

private java.util.List<com.moon.jL> a;

private static boolean b;

public jM() {
super();
}


public jM(java.util.List<com.moon.jL> p0) {
super();
    this.a = p0;
}


static {
if ((!com.moon.jM.b())) {
        com.moon.jM.b(((boolean)(true)));
    }
}


public static boolean b() {
return ((((com.moon.jM.b) ? 1 : 0)) != 0);
}


public static void b(boolean p0) {
b = ((boolean)(p0));
    return;
}


public static boolean c() {
int local0 = __sourceIntrinsic_booleanToInteger(com.moon.jM.b());
    if ((local0 == 0)) {
        return ((1) != 0);
    }
    return ((0) != 0);
}


public java.util.List<com.moon.jL> a() {
return this.a;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public com.moon.jM a(java.util.List<com.moon.jL> p0) {
this.a = ((java.util.List)(p0));
    return this;
}


private static native int __sourceIntrinsic_booleanToInteger(boolean value);
}
