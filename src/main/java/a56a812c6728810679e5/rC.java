package com.moon;


class rC extends org.luaj.vm2.lib.ZeroArgFunction {

com.moon.jS a;

rC(com.moon.jS p0) { super(); }


private static void __sourceConstructorBody_fb3c8b1f35b85b06(com.moon.rC receiver, com.moon.jS p0) throws Throwable {

((com.moon.rC)(receiver)).a = ((com.moon.jS)(p0));

    com.moon.rC.__sourceConstructorInit_fb3c8b1f35b85b06_0(((com.moon.rC)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_fb3c8b1f35b85b06_0(com.moon.rC a0) throws E;

public org.luaj.vm2.LuaValue call() {
return org.luaj.vm2.LuaValue.valueOf(((int)(((com.moon.j1)(((com.moon.jS)(this.a)).c)).lower_container_id())));
}

}
