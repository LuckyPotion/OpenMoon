package com.moon;


class sa extends org.luaj.vm2.lib.ZeroArgFunction {

com.moon.jU a;

sa(com.moon.jU p0) { super(); }


private static void __sourceConstructorBody_707f1b20aefcd56b(com.moon.sa receiver, com.moon.jU p0) throws Throwable {

((com.moon.sa)(receiver)).a = ((com.moon.jU)(p0));

    com.moon.sa.__sourceConstructorInit_707f1b20aefcd56b_0(((com.moon.sa)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_707f1b20aefcd56b_0(com.moon.sa a0) throws E;

public org.luaj.vm2.LuaValue call() {
return org.luaj.vm2.LuaValue.valueOf(((double)(((com.moon.j3)(((com.moon.jU)(this.a)).c)).get_speed())));
}

}
