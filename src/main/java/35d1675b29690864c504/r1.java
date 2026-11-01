package com.moon;


class r1 extends org.luaj.vm2.lib.ZeroArgFunction {

com.moon.jU a;

r1(com.moon.jU p0) { super(); }


private static void __sourceConstructorBody_a12614a04905f087(com.moon.r1 receiver, com.moon.jU p0) throws Throwable {

((com.moon.r1)(receiver)).a = ((com.moon.jU)(p0));

    com.moon.r1.__sourceConstructorInit_a12614a04905f087_0(((com.moon.r1)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_a12614a04905f087_0(com.moon.r1 a0) throws E;

public org.luaj.vm2.LuaValue call() {
((com.moon.j3)(((com.moon.jU)(this.a)).c)).right_click();
    return org.luaj.vm2.LuaValue.NIL;
}

}
