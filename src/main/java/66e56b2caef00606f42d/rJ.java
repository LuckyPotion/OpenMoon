package com.moon;


class rJ extends org.luaj.vm2.lib.ZeroArgFunction {

com.moon.jU a;

rJ(com.moon.jU p0) { super(); }


private static void __sourceConstructorBody_8dc28d3f3d91b0b3(com.moon.rJ receiver, com.moon.jU p0) throws Throwable {

((com.moon.rJ)(receiver)).a = ((com.moon.jU)(p0));

    com.moon.rJ.__sourceConstructorInit_8dc28d3f3d91b0b3_0(((com.moon.rJ)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_8dc28d3f3d91b0b3_0(com.moon.rJ a0) throws E;

public org.luaj.vm2.LuaValue call() {
return org.luaj.vm2.LuaValue.valueOf(((double)(((com.moon.j3)(((com.moon.jU)(this.a)).c)).get_motion_y())));
}

}
