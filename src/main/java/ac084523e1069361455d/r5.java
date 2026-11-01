package com.moon;


class r5 extends org.luaj.vm2.lib.ZeroArgFunction {

com.moon.jU a;

r5(com.moon.jU p0) { super(); }


private static void __sourceConstructorBody_96d07ab60401755b(com.moon.r5 receiver, com.moon.jU p0) throws Throwable {

((com.moon.r5)(receiver)).a = ((com.moon.jU)(p0));

    com.moon.r5.__sourceConstructorInit_96d07ab60401755b_0(((com.moon.r5)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_96d07ab60401755b_0(com.moon.r5 a0) throws E;

public org.luaj.vm2.LuaValue call() {
return org.luaj.vm2.LuaValue.valueOf(((boolean)(((com.moon.j3)(((com.moon.jU)(this.a)).c)).is_dead())));
}

}
