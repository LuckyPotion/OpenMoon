package com.moon;


public class dL extends com.moon.event.CancellableEvent {

private static java.lang.String[] c;

public dL() {
super();
}


static {
if ((com.moon.dL.c() == null)) {
        com.moon.dL.b(((java.lang.String[])(new java.lang.String[1])));
    }
}


public static void b(java.lang.String[] p0) {
com.moon.dL.c = ((java.lang.String[])(p0));
    return;
}


public static java.lang.String[] c() {
return com.moon.dL.c;
}

}
