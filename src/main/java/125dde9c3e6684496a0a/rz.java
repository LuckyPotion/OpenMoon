package com.moon;


class rz extends org.luaj.vm2.lib.ZeroArgFunction {

com.moon.jP a;

rz(com.moon.jP p0) { super(); }


private static void __sourceConstructorBody_b34d29abb3d0e258(com.moon.rz receiver, com.moon.jP p0) throws Throwable {

((com.moon.rz)(receiver)).a = ((com.moon.jP)(p0));

    com.moon.rz.__sourceConstructorInit_b34d29abb3d0e258_0(((com.moon.rz)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_b34d29abb3d0e258_0(com.moon.rz a0) throws E;

public org.luaj.vm2.LuaValue call() {
return org.luaj.vm2.LuaValue.valueOf(((int)(((com.moon.jY)(((com.moon.jP)(this.a)).c)).current_kill_aura_target())));
}

}
