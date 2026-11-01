package com.moon;


class su extends org.luaj.vm2.lib.ZeroArgFunction {

com.moon.jV a;

su(com.moon.jV p0) { super(); }


private static void __sourceConstructorBody_ca36cb944a8ab599(com.moon.su receiver, com.moon.jV p0) throws Throwable {

((com.moon.su)(receiver)).a = ((com.moon.jV)(p0));

    com.moon.su.__sourceConstructorInit_ca36cb944a8ab599_0(((com.moon.su)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_ca36cb944a8ab599_0(com.moon.su a0) throws E;

public org.luaj.vm2.LuaValue call() {
((com.moon.j4)(((com.moon.jV)(this.a)).c)).enable_depth();
    return com.moon.su.NIL;
}

}
