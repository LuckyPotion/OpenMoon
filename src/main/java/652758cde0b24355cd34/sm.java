package com.moon;


class sm extends org.luaj.vm2.lib.ZeroArgFunction {

com.moon.jU a;

sm(com.moon.jU p0) { super(); }


private static void __sourceConstructorBody_f7783e418bee3b2e(com.moon.sm receiver, com.moon.jU p0) throws Throwable {

((com.moon.sm)(receiver)).a = ((com.moon.jU)(p0));

    com.moon.sm.__sourceConstructorInit_f7783e418bee3b2e_0(((com.moon.sm)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_f7783e418bee3b2e_0(com.moon.sm a0) throws E;

public org.luaj.vm2.LuaValue call() {
((com.moon.j3)(((com.moon.jU)(this.a)).c)).use_item();
    return org.luaj.vm2.LuaValue.NIL;
}

}
