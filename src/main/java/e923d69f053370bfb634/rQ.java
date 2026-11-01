package com.moon;


class rQ extends org.luaj.vm2.lib.ZeroArgFunction {

com.moon.jU a;

rQ(com.moon.jU p0) { super(); }


private static void __sourceConstructorBody_086d0905a7c48b4c(com.moon.rQ receiver, com.moon.jU p0) throws Throwable {

((com.moon.rQ)(receiver)).a = ((com.moon.jU)(p0));

    com.moon.rQ.__sourceConstructorInit_086d0905a7c48b4c_0(((com.moon.rQ)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_086d0905a7c48b4c_0(com.moon.rQ a0) throws E;

public org.luaj.vm2.LuaValue call() {
((com.moon.j3)(((com.moon.jU)(this.a)).c)).left_click();
    return org.luaj.vm2.LuaValue.NIL;
}

}
