package com.moon;


class r6 extends org.luaj.vm2.lib.ZeroArgFunction {

com.moon.jU a;

r6(com.moon.jU p0) { super(); }


private static void __sourceConstructorBody_e535d7e4ae4329ab(com.moon.r6 receiver, com.moon.jU p0) throws Throwable {

((com.moon.r6)(receiver)).a = ((com.moon.jU)(p0));

    com.moon.r6.__sourceConstructorInit_e535d7e4ae4329ab_0(((com.moon.r6)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_e535d7e4ae4329ab_0(com.moon.r6 a0) throws E;

public org.luaj.vm2.LuaValue call() {
return org.luaj.vm2.LuaValue.valueOf(((boolean)(((com.moon.j3)(((com.moon.jU)(this.a)).c)).is_riding())));
}

}
