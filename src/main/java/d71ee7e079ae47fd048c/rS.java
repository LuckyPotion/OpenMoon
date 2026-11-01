package com.moon;


class rS extends org.luaj.vm2.lib.ZeroArgFunction {

com.moon.jU a;

rS(com.moon.jU p0) { super(); }


private static void __sourceConstructorBody_d72dbe3afc10e8bc(com.moon.rS receiver, com.moon.jU p0) throws Throwable {

((com.moon.rS)(receiver)).a = ((com.moon.jU)(p0));

    com.moon.rS.__sourceConstructorInit_d72dbe3afc10e8bc_0(((com.moon.rS)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_d72dbe3afc10e8bc_0(com.moon.rS a0) throws E;

public org.luaj.vm2.LuaValue call() {
return org.luaj.vm2.LuaValue.valueOf(((double)(((com.moon.j3)(((com.moon.jU)(this.a)).c)).get_prev_position_z())));
}

}
