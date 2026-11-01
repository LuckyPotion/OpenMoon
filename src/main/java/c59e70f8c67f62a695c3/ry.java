package com.moon;


class ry extends org.luaj.vm2.lib.ZeroArgFunction {

com.moon.jP a;

ry(com.moon.jP p0) { super(); }


private static void __sourceConstructorBody_24247a4bb68dce96(com.moon.ry receiver, com.moon.jP p0) throws Throwable {

((com.moon.ry)(receiver)).a = ((com.moon.jP)(p0));

    com.moon.ry.__sourceConstructorInit_24247a4bb68dce96_0(((com.moon.ry)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_24247a4bb68dce96_0(com.moon.ry a0) throws E;

public org.luaj.vm2.LuaValue call() {
((com.moon.jY)(((com.moon.jP)(this.a)).c)).force_effects_redraw();
    return org.luaj.vm2.LuaValue.NIL;
}

}
