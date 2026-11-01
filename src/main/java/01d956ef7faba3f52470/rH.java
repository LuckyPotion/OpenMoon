package com.moon;


class rH extends org.luaj.vm2.lib.ZeroArgFunction {

com.moon.jU a;

rH(com.moon.jU p0) { super(); }


private static void __sourceConstructorBody_7da8ccf2c834b7d8(com.moon.rH receiver, com.moon.jU p0) throws Throwable {

((com.moon.rH)(receiver)).a = ((com.moon.jU)(p0));

    com.moon.rH.__sourceConstructorInit_7da8ccf2c834b7d8_0(((com.moon.rH)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_7da8ccf2c834b7d8_0(com.moon.rH a0) throws E;

public org.luaj.vm2.LuaValue call() {
return org.luaj.vm2.LuaValue.valueOf(((double)(((double) ((com.moon.j3)(((com.moon.jU)(this.a)).c)).get_prev_pitch()))));
}

}
