package com.moon;


class rY extends org.luaj.vm2.lib.ZeroArgFunction {

com.moon.jU a;

rY(com.moon.jU p0) { super(); }


private static void __sourceConstructorBody_67176ef7028e112b(com.moon.rY receiver, com.moon.jU p0) throws Throwable {

((com.moon.rY)(receiver)).a = ((com.moon.jU)(p0));

    com.moon.rY.__sourceConstructorInit_67176ef7028e112b_0(((com.moon.rY)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_67176ef7028e112b_0(com.moon.rY a0) throws E;

public org.luaj.vm2.LuaValue call() {
return org.luaj.vm2.LuaValue.valueOf(((boolean)(((com.moon.j3)(((com.moon.jU)(this.a)).c)).is_blocking())));
}

}
