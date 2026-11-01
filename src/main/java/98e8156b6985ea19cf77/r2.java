package com.moon;


class r2 extends org.luaj.vm2.lib.ZeroArgFunction {

com.moon.jU a;

r2(com.moon.jU p0) { super(); }


private static void __sourceConstructorBody_b91e0b84c43a68d5(com.moon.r2 receiver, com.moon.jU p0) throws Throwable {

((com.moon.r2)(receiver)).a = ((com.moon.jU)(p0));

    com.moon.r2.__sourceConstructorInit_b91e0b84c43a68d5_0(((com.moon.r2)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_b91e0b84c43a68d5_0(com.moon.r2 a0) throws E;

public org.luaj.vm2.LuaValue call() {
return org.luaj.vm2.LuaValue.valueOf(((boolean)(((com.moon.j3)(((com.moon.jU)(this.a)).c)).is_burning())));
}

}
