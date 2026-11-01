package com.moon;


class sx extends org.luaj.vm2.lib.ZeroArgFunction {

com.moon.jV a;

sx(com.moon.jV p0) { super(); }


private static void __sourceConstructorBody_3383b5f609f2eb2c(com.moon.sx receiver, com.moon.jV p0) throws Throwable {

((com.moon.sx)(receiver)).a = ((com.moon.jV)(p0));

    com.moon.sx.__sourceConstructorInit_3383b5f609f2eb2c_0(((com.moon.sx)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_3383b5f609f2eb2c_0(com.moon.sx a0) throws E;

public org.luaj.vm2.LuaValue call() {
((com.moon.j4)(((com.moon.jV)(this.a)).c)).disable_blend();
    return com.moon.sx.NIL;
}

}
