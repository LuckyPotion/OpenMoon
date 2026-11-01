package com.moon;


public class ej extends com.moon.event.Event {

private final boolean a;

private static int[] c;

public ej(boolean p0) {
super();
    this.a = p0;
}


static {
if ((com.moon.ej.a__ArrayInt() == null)) {
        com.moon.ej.b(((int[])(new int[2])));
    }
}


public static void b(int[] p0) {
com.moon.ej.c = ((int[])(p0));
    return;
}


public static int[] a__ArrayInt() {
return com.moon.ej.c;
}


public boolean a() {
return ((((this.a) ? 1 : 0)) != 0);
}

}
