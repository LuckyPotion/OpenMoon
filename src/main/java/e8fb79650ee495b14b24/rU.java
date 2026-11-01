package com.moon;


class rU extends org.luaj.vm2.lib.ZeroArgFunction {

com.moon.jU a;

rU(com.moon.jU p0) { super(); }


private static void __sourceConstructorBody_c281f99b05356e81(com.moon.rU receiver, com.moon.jU p0) throws Throwable {

((com.moon.rU)(receiver)).a = ((com.moon.jU)(p0));

    com.moon.rU.__sourceConstructorInit_c281f99b05356e81_0(((com.moon.rU)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_c281f99b05356e81_0(com.moon.rU a0) throws E;

public org.luaj.vm2.LuaValue call() {
return org.luaj.vm2.LuaValue.valueOf(((boolean)(((com.moon.j3)(((com.moon.jU)(this.a)).c)).is_moving())));
}

}
