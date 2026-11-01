package com.moon;


class rN extends org.luaj.vm2.lib.ZeroArgFunction {

com.moon.jU a;

rN(com.moon.jU p0) { super(); }


private static void __sourceConstructorBody_91715861ae2ba511(com.moon.rN receiver, com.moon.jU p0) throws Throwable {

((com.moon.rN)(receiver)).a = ((com.moon.jU)(p0));

    com.moon.rN.__sourceConstructorInit_91715861ae2ba511_0(((com.moon.rN)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_91715861ae2ba511_0(com.moon.rN a0) throws E;

public org.luaj.vm2.LuaValue call() {
return org.luaj.vm2.LuaValue.valueOf(((double)(((com.moon.j3)(((com.moon.jU)(this.a)).c)).get_position_y())));
}

}
