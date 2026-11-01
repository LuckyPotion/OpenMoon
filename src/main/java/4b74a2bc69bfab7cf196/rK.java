package com.moon;


class rK extends org.luaj.vm2.lib.ZeroArgFunction {

com.moon.jU a;

rK(com.moon.jU p0) { super(); }


private static void __sourceConstructorBody_96959a61a0e3a336(com.moon.rK receiver, com.moon.jU p0) throws Throwable {

((com.moon.rK)(receiver)).a = ((com.moon.jU)(p0));

    com.moon.rK.__sourceConstructorInit_96959a61a0e3a336_0(((com.moon.rK)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_96959a61a0e3a336_0(com.moon.rK a0) throws E;

public org.luaj.vm2.LuaValue call() {
return org.luaj.vm2.LuaValue.valueOf(((double)(((com.moon.j3)(((com.moon.jU)(this.a)).c)).get_motion_z())));
}

}
