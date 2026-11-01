package com.moon;


public class hE implements java.lang.Runnable {

private final com.moon.gT a;

private static boolean b;

public hE(com.moon.gT p0) {
super();
    this.a = p0;
}


static {
if ((!com.moon.hE.b())) {
        com.moon.hE.b(((boolean)(true)));
    }
}


public void run() {
terminal_cycle_0: while (true) {
        ((com.moon.gT)(this.a)).run();
        continue terminal_cycle_0;
    }
}


public static boolean b() {
return ((((com.moon.hE.b) ? 1 : 0)) != 0);
}


public static void b(boolean p0) {
com.moon.hE.b = ((boolean)(p0));
    return;
}


public static boolean c() {
int local0 = __sourceIntrinsic_booleanToInteger(com.moon.hE.b());
    if ((local0 == 0)) {
        return ((1) != 0);
    }
    return ((0) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static native int __sourceIntrinsic_booleanToInteger(boolean value);
}
