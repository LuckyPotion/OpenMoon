package com.moon;


public abstract class kL<T extends com.moon.scripting.api.types.templates.RenderTemplate> {

private static boolean b;

public kL() {
super();
}


static {
if (com.moon.kL.b()) {
        com.moon.kL.b(((boolean)(true)));
    }
}


public static boolean b() {
return ((((com.moon.kL.b) ? 1 : 0)) != 0);
}


public static void b(boolean p0) {
b = ((boolean)(p0));
    return;
}


public static boolean c() {
int local0 = __sourceIntrinsic_booleanToInteger(com.moon.kL.b());
    if ((local0 == 0)) {
        return ((1) != 0);
    }
    return ((0) != 0);
}


public abstract com.moon.iX a(T p0);

private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static native int __sourceIntrinsic_booleanToInteger(boolean value);
}
