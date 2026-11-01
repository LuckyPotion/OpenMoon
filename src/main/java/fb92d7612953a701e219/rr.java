package com.moon;


class rr extends org.luaj.vm2.lib.ZeroArgFunction {

com.moon.jJ a;

rr(com.moon.jJ p0) { super(); }


private static void __sourceConstructorBody_d235912c3b7950ea(com.moon.rr receiver, com.moon.jJ p0) throws Throwable {

((com.moon.rr)(receiver)).a = ((com.moon.jJ)(p0));

    com.moon.rr.__sourceConstructorInit_d235912c3b7950ea_0(((com.moon.rr)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_d235912c3b7950ea_0(com.moon.rr a0) throws E;

public org.luaj.vm2.LuaValue call() {
return org.luaj.vm2.lib.jse.CoerceJavaToLua.coerce(((java.lang.Object)(new com.moon.scripting.api.types.Vec3i())));
}

}
