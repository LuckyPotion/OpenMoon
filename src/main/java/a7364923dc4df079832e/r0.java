package com.moon;


class r0 extends org.luaj.vm2.lib.ZeroArgFunction {

com.moon.jU a;

r0(com.moon.jU p0) { super(); }


private static void __sourceConstructorBody_6b203bcb24b4e1c2(com.moon.r0 receiver, com.moon.jU p0) throws Throwable {

((com.moon.r0)(receiver)).a = ((com.moon.jU)(p0));

    com.moon.r0.__sourceConstructorInit_6b203bcb24b4e1c2_0(((com.moon.r0)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_6b203bcb24b4e1c2_0(com.moon.r0 a0) throws E;

public org.luaj.vm2.LuaValue call() {
return org.luaj.vm2.LuaValue.valueOf(((boolean)(((com.moon.j3)(((com.moon.jU)(this.a)).c)).is_in_lava())));
}

}
