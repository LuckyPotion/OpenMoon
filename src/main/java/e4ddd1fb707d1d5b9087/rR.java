package com.moon;


class rR extends org.luaj.vm2.lib.ZeroArgFunction {

com.moon.jU a;

rR(com.moon.jU p0) { super(); }


private static void __sourceConstructorBody_6210510f85c74fb6(com.moon.rR receiver, com.moon.jU p0) throws Throwable {

((com.moon.rR)(receiver)).a = ((com.moon.jU)(p0));

    com.moon.rR.__sourceConstructorInit_6210510f85c74fb6_0(((com.moon.rR)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_6210510f85c74fb6_0(com.moon.rR a0) throws E;

public org.luaj.vm2.LuaValue call() {
return org.luaj.vm2.LuaValue.valueOf(((double)(((com.moon.j3)(((com.moon.jU)(this.a)).c)).get_prev_position_y())));
}

}
