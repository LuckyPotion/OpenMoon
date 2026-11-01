package com.moon;


class rM extends org.luaj.vm2.lib.ZeroArgFunction {

com.moon.jU a;

rM(com.moon.jU p0) { super(); }


private static void __sourceConstructorBody_9a3b10a50f193291(com.moon.rM receiver, com.moon.jU p0) throws Throwable {

((com.moon.rM)(receiver)).a = ((com.moon.jU)(p0));

    com.moon.rM.__sourceConstructorInit_9a3b10a50f193291_0(((com.moon.rM)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_9a3b10a50f193291_0(com.moon.rM a0) throws E;

public org.luaj.vm2.LuaValue call() {
return org.luaj.vm2.LuaValue.valueOf(((double)(((com.moon.j3)(((com.moon.jU)(this.a)).c)).get_position_x())));
}

}
