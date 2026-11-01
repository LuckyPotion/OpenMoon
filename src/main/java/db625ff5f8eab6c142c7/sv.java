package com.moon;


class sv extends org.luaj.vm2.lib.ZeroArgFunction {

com.moon.jV a;

sv(com.moon.jV p0) { super(); }


private static void __sourceConstructorBody_e19fa6628fa2100b(com.moon.sv receiver, com.moon.jV p0) throws Throwable {

((com.moon.sv)(receiver)).a = ((com.moon.jV)(p0));

    com.moon.sv.__sourceConstructorInit_e19fa6628fa2100b_0(((com.moon.sv)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_e19fa6628fa2100b_0(com.moon.sv a0) throws E;

public org.luaj.vm2.LuaValue call() {
((com.moon.j4)(((com.moon.jV)(this.a)).c)).disable_depth();
    return com.moon.sv.NIL;
}

}
