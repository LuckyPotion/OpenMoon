package com.moon;


class sq extends org.luaj.vm2.lib.ZeroArgFunction {

com.moon.jU a;

sq(com.moon.jU p0) { super(); }


private static void __sourceConstructorBody_a39af8c6407ae8ed(com.moon.sq receiver, com.moon.jU p0) throws Throwable {

((com.moon.sq)(receiver)).a = ((com.moon.jU)(p0));

    com.moon.sq.__sourceConstructorInit_a39af8c6407ae8ed_0(((com.moon.sq)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_a39af8c6407ae8ed_0(com.moon.sq a0) throws E;

public org.luaj.vm2.LuaValue call() {
return org.luaj.vm2.LuaValue.valueOf(((boolean)(((com.moon.j3)(((com.moon.jU)(this.a)).c)).is_on_edge())));
}

}
