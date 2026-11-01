package com.moon;


class sb extends org.luaj.vm2.lib.ZeroArgFunction {

com.moon.jU a;

sb(com.moon.jU p0) { super(); }


private static void __sourceConstructorBody_dc9995722e714eab(com.moon.sb receiver, com.moon.jU p0) throws Throwable {

((com.moon.sb)(receiver)).a = ((com.moon.jU)(p0));

    com.moon.sb.__sourceConstructorInit_dc9995722e714eab_0(((com.moon.sb)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_dc9995722e714eab_0(com.moon.sb a0) throws E;

public org.luaj.vm2.LuaValue call() {
((com.moon.j3)(((com.moon.jU)(this.a)).c)).swing_item();
    return org.luaj.vm2.LuaValue.NIL;
}

}
