package com.moon;


class rX extends org.luaj.vm2.lib.ZeroArgFunction {

com.moon.jU a;

rX(com.moon.jU p0) { super(); }


private static void __sourceConstructorBody_0e39f0738781474c(com.moon.rX receiver, com.moon.jU p0) throws Throwable {

((com.moon.rX)(receiver)).a = ((com.moon.jU)(p0));

    com.moon.rX.__sourceConstructorInit_0e39f0738781474c_0(((com.moon.rX)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_0e39f0738781474c_0(com.moon.rX a0) throws E;

public org.luaj.vm2.LuaValue call() {
return org.luaj.vm2.LuaValue.valueOf(((boolean)(((com.moon.j3)(((com.moon.jU)(this.a)).c)).is_using_item())));
}

}
