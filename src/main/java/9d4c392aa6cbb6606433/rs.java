package com.moon;


class rs extends org.luaj.vm2.lib.ZeroArgFunction {

com.moon.jJ a;

rs(com.moon.jJ p0) { super(); }


private static void __sourceConstructorBody_fc11e5a6c771852d(com.moon.rs receiver, com.moon.jJ p0) throws Throwable {

((com.moon.rs)(receiver)).a = ((com.moon.jJ)(p0));

    com.moon.rs.__sourceConstructorInit_fc11e5a6c771852d_0(((com.moon.rs)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_fc11e5a6c771852d_0(com.moon.rs a0) throws E;

public org.luaj.vm2.LuaValue call() {
return org.luaj.vm2.lib.jse.CoerceJavaToLua.coerce(((java.lang.Object)(new com.moon.scripting.api.types.Vec2f())));
}

}
