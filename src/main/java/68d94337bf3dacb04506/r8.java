package com.moon;


class r8 extends org.luaj.vm2.lib.ZeroArgFunction {

com.moon.jU a;

r8(com.moon.jU p0) { super(); }


private static void __sourceConstructorBody_0189c8c74ab4941c(com.moon.r8 receiver, com.moon.jU p0) throws Throwable {

((com.moon.r8)(receiver)).a = ((com.moon.jU)(p0));

    com.moon.r8.__sourceConstructorInit_0189c8c74ab4941c_0(((com.moon.r8)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_0189c8c74ab4941c_0(com.moon.r8 a0) throws E;

public org.luaj.vm2.LuaValue call() {
return org.luaj.vm2.LuaValue.valueOf(((boolean)(((com.moon.j3)(((com.moon.jU)(this.a)).c)).collided_vertically())));
}

}
