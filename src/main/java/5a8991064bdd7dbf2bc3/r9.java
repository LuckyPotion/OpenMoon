package com.moon;


class r9 extends org.luaj.vm2.lib.ZeroArgFunction {

com.moon.jU a;

r9(com.moon.jU p0) { super(); }


private static void __sourceConstructorBody_5b1dbd984d6bdf42(com.moon.r9 receiver, com.moon.jU p0) throws Throwable {

((com.moon.r9)(receiver)).a = ((com.moon.jU)(p0));

    com.moon.r9.__sourceConstructorInit_5b1dbd984d6bdf42_0(((com.moon.r9)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_5b1dbd984d6bdf42_0(com.moon.r9 a0) throws E;

public org.luaj.vm2.LuaValue call() {
return org.luaj.vm2.LuaValue.valueOf(((boolean)(((com.moon.j3)(((com.moon.jU)(this.a)).c)).collided_horizontally())));
}

}
