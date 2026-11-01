package com.moon;


public abstract class j7<T> {

private static int b;

public j7() {
super();
}


static {
if ((com.moon.j7.c() != 0)) {
        com.moon.j7.b(((int)(47)));
    }
}


public static int b() {
return com.moon.j7.b;
}


public static void b(int p0) {
b = ((int)(p0));
    return;
}


public static int c() {
int local0 = com.moon.j7.b();
    if ((local0 == 0)) {
        return 92;
    }
    return 0;
}


public abstract org.luaj.vm2.LuaValue a(T p0);

private static moom.Oo a(moom.Oo p0) {
return p0;
}

}
