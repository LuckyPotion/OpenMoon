package com.moon;


class r3 extends org.luaj.vm2.lib.ZeroArgFunction {

com.moon.jU a;

r3(com.moon.jU p0) { super(); }


private static void __sourceConstructorBody_ca5088f82612b5d5(com.moon.r3 receiver, com.moon.jU p0) throws Throwable {

((com.moon.r3)(receiver)).a = ((com.moon.jU)(p0));

    com.moon.r3.__sourceConstructorInit_ca5088f82612b5d5_0(((com.moon.r3)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_ca5088f82612b5d5_0(com.moon.r3 a0) throws E;

public org.luaj.vm2.LuaValue call() {
return org.luaj.vm2.LuaValue.valueOf(((boolean)(((com.moon.j3)(((com.moon.jU)(this.a)).c)).is_sneaking())));
}

}
