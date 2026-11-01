package com.moon;


class rG extends org.luaj.vm2.lib.ZeroArgFunction {

com.moon.jU a;

rG(com.moon.jU p0) { super(); }


private static void __sourceConstructorBody_0eaaecf02fe3dba6(com.moon.rG receiver, com.moon.jU p0) throws Throwable {

((com.moon.rG)(receiver)).a = ((com.moon.jU)(p0));

    com.moon.rG.__sourceConstructorInit_0eaaecf02fe3dba6_0(((com.moon.rG)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_0eaaecf02fe3dba6_0(com.moon.rG a0) throws E;

public org.luaj.vm2.LuaValue call() {
return org.luaj.vm2.LuaValue.valueOf(((double)(((double) ((com.moon.j3)(((com.moon.jU)(this.a)).c)).get_prev_yaw()))));
}

}
