package com.moon;


class rW extends org.luaj.vm2.lib.ZeroArgFunction {

com.moon.jU a;

rW(com.moon.jU p0) { super(); }


private static void __sourceConstructorBody_07028c193d0a24a6(com.moon.rW receiver, com.moon.jU p0) throws Throwable {

((com.moon.rW)(receiver)).a = ((com.moon.jU)(p0));

    com.moon.rW.__sourceConstructorInit_07028c193d0a24a6_0(((com.moon.rW)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_07028c193d0a24a6_0(com.moon.rW a0) throws E;

public org.luaj.vm2.LuaValue call() {
return org.luaj.vm2.LuaValue.valueOf(((boolean)(((com.moon.j3)(((com.moon.jU)(this.a)).c)).is_sprinting())));
}

}
