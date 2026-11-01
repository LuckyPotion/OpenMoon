package com.moon;


class r4 extends org.luaj.vm2.lib.ZeroArgFunction {

com.moon.jU a;

r4(com.moon.jU p0) { super(); }


private static void __sourceConstructorBody_34d483f1cef777e6(com.moon.r4 receiver, com.moon.jU p0) throws Throwable {

((com.moon.r4)(receiver)).a = ((com.moon.jU)(p0));

    com.moon.r4.__sourceConstructorInit_34d483f1cef777e6_0(((com.moon.r4)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_34d483f1cef777e6_0(com.moon.r4 a0) throws E;

public org.luaj.vm2.LuaValue call() {
return org.luaj.vm2.LuaValue.valueOf(((boolean)(((com.moon.j3)(((com.moon.jU)(this.a)).c)).is_in_cobweb())));
}

}
