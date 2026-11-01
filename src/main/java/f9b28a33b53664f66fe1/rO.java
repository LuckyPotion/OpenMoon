package com.moon;


class rO extends org.luaj.vm2.lib.ZeroArgFunction {

com.moon.jU a;

rO(com.moon.jU p0) { super(); }


private static void __sourceConstructorBody_1e681ba8cc98d72e(com.moon.rO receiver, com.moon.jU p0) throws Throwable {

((com.moon.rO)(receiver)).a = ((com.moon.jU)(p0));

    com.moon.rO.__sourceConstructorInit_1e681ba8cc98d72e_0(((com.moon.rO)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_1e681ba8cc98d72e_0(com.moon.rO a0) throws E;

public org.luaj.vm2.LuaValue call() {
return org.luaj.vm2.LuaValue.valueOf(((double)(((com.moon.j3)(((com.moon.jU)(this.a)).c)).get_position_z())));
}

}
