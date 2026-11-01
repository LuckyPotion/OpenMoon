package com.moon;


class rI extends org.luaj.vm2.lib.ZeroArgFunction {

com.moon.jU a;

rI(com.moon.jU p0) { super(); }


private static void __sourceConstructorBody_6723d17a5755733a(com.moon.rI receiver, com.moon.jU p0) throws Throwable {

((com.moon.rI)(receiver)).a = ((com.moon.jU)(p0));

    com.moon.rI.__sourceConstructorInit_6723d17a5755733a_0(((com.moon.rI)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_6723d17a5755733a_0(com.moon.rI a0) throws E;

public org.luaj.vm2.LuaValue call() {
return org.luaj.vm2.LuaValue.valueOf(((double)(((com.moon.j3)(((com.moon.jU)(this.a)).c)).get_motion_x())));
}

}
