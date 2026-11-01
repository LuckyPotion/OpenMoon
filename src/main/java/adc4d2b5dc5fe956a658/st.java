package com.moon;


class st extends org.luaj.vm2.lib.ZeroArgFunction {

com.moon.jU a;

st(com.moon.jU p0) { super(); }


private static void __sourceConstructorBody_646d89c7ddea7d16(com.moon.st receiver, com.moon.jU p0) throws Throwable {

((com.moon.st)(receiver)).a = ((com.moon.jU)(p0));

    com.moon.st.__sourceConstructorInit_646d89c7ddea7d16_0(((com.moon.st)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_646d89c7ddea7d16_0(com.moon.st a0) throws E;

public org.luaj.vm2.LuaValue call() {
return org.luaj.vm2.LuaValue.valueOf(((double)(((double) ((com.moon.j3)(((com.moon.jU)(this.a)).c)).get_pitch()))));
}

}
