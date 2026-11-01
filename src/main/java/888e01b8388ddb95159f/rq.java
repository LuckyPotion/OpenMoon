package com.moon;


class rq extends org.luaj.vm2.lib.ZeroArgFunction {

com.moon.jJ a;

rq(com.moon.jJ p0) { super(); }


private static void __sourceConstructorBody_975919edf15be355(com.moon.rq receiver, com.moon.jJ p0) throws Throwable {

((com.moon.rq)(receiver)).a = ((com.moon.jJ)(p0));

    com.moon.rq.__sourceConstructorInit_975919edf15be355_0(((com.moon.rq)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_975919edf15be355_0(com.moon.rq a0) throws E;

public org.luaj.vm2.LuaValue call() {
return org.luaj.vm2.lib.jse.CoerceJavaToLua.coerce(((java.lang.Object)(new com.moon.scripting.api.types.Vec3f())));
}

}
