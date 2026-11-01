package com.moon;


class rt extends org.luaj.vm2.lib.ZeroArgFunction {

com.moon.jJ a;

rt(com.moon.jJ p0) { super(); }


private static void __sourceConstructorBody_8d7d6fa6920ff9f9(com.moon.rt receiver, com.moon.jJ p0) throws Throwable {

((com.moon.rt)(receiver)).a = ((com.moon.jJ)(p0));

    com.moon.rt.__sourceConstructorInit_8d7d6fa6920ff9f9_0(((com.moon.rt)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_8d7d6fa6920ff9f9_0(com.moon.rt a0) throws E;

public org.luaj.vm2.LuaValue call() {
return org.luaj.vm2.lib.jse.CoerceJavaToLua.coerce(((java.lang.Object)(new com.moon.scripting.api.types.Vec3d())));
}

}
