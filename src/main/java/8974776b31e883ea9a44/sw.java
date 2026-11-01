package com.moon;


class sw extends org.luaj.vm2.lib.ZeroArgFunction {

com.moon.jV a;

sw(com.moon.jV p0) { super(); }


private static void __sourceConstructorBody_78c9b6bb45dd3e28(com.moon.sw receiver, com.moon.jV p0) throws Throwable {

((com.moon.sw)(receiver)).a = ((com.moon.jV)(p0));

    com.moon.sw.__sourceConstructorInit_78c9b6bb45dd3e28_0(((com.moon.sw)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_78c9b6bb45dd3e28_0(com.moon.sw a0) throws E;

public org.luaj.vm2.LuaValue call() {
((com.moon.j4)(((com.moon.jV)(this.a)).c)).enable_blend();
    return com.moon.sw.NIL;
}

}
