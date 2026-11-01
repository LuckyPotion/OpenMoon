package com.moon;


class qY extends org.luaj.vm2.lib.VarArgFunction {

com.moon.jJ a;

public org.luaj.vm2.Varargs invoke(org.luaj.vm2.Varargs p0) {
org.luaj.vm2.LuaValue local2_life1 = ((org.luaj.vm2.Varargs)(p0)).arg(((int)(1)));
    org.luaj.vm2.LuaValue local3_life3 = ((org.luaj.vm2.Varargs)(p0)).arg(((int)(2)));
    org.luaj.vm2.LuaValue local4_life5 = ((org.luaj.vm2.Varargs)(p0)).arg(((int)(3)));
    return org.luaj.vm2.lib.jse.CoerceJavaToLua.coerce(((java.lang.Object)(new com.moon.scripting.api.types.Vec3f(((org.luaj.vm2.LuaValue)(local2_life1)).tofloat(), ((org.luaj.vm2.LuaValue)(local3_life3)).tofloat(), ((org.luaj.vm2.LuaValue)(local4_life5)).tofloat()))));
}


qY(com.moon.jJ p0) { super(); }


private static void __sourceConstructorBody_64146420557c796e(com.moon.qY receiver, com.moon.jJ p0) throws Throwable {

((com.moon.qY)(receiver)).a = ((com.moon.jJ)(p0));

    com.moon.qY.__sourceConstructorInit_64146420557c796e_0(((com.moon.qY)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_64146420557c796e_0(com.moon.qY a0) throws E;
}
