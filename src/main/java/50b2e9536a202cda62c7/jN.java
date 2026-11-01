package com.moon;


public abstract class jN {

private final java.lang.String a;

private static int b;

public jN(java.lang.String p0) {
super();
    this.a = p0;
}


static {
if ((com.moon.jN.c() != 0)) {
        com.moon.jN.b(((int)(45)));
    }
}


public static int b() {
return com.moon.jN.b;
}


public static void b(int p0) {
b = ((int)(p0));
    return;
}


public static int c() {
int local0 = com.moon.jN.b();
    if ((local0 == 0)) {
        return 120;
    }
    return 0;
}


public abstract void a(org.luaj.vm2.LuaTable p0);

private static moom.Oo a(moom.Oo p0) {
return p0;
}


public java.lang.String a() {
return this.a;
}

}
