package com.moon;


class sr extends org.luaj.vm2.lib.ZeroArgFunction {

com.moon.jU a;

sr(com.moon.jU p0) { super(); }


private static void __sourceConstructorBody_a32e4a9ac5ec08a8(com.moon.sr receiver, com.moon.jU p0) throws Throwable {

((com.moon.sr)(receiver)).a = ((com.moon.jU)(p0));

    com.moon.sr.__sourceConstructorInit_a32e4a9ac5ec08a8_0(((com.moon.sr)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_a32e4a9ac5ec08a8_0(com.moon.sr a0) throws E;

public org.luaj.vm2.LuaValue call() {
return org.luaj.vm2.lib.jse.CoerceJavaToLua.coerce(((java.lang.Object)(((com.moon.j3)(((com.moon.jU)(this.a)).c)).get_input())));
}

}
