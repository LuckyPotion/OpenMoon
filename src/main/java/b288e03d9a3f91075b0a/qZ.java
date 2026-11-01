package com.moon;


class qZ extends org.luaj.vm2.lib.VarArgFunction {

com.moon.jJ a;

public org.luaj.vm2.Varargs invoke(org.luaj.vm2.Varargs p0) {
org.luaj.vm2.LuaValue local2_life1 = ((org.luaj.vm2.Varargs)(p0)).arg(((int)(1)));
    org.luaj.vm2.LuaValue local3_life3 = ((org.luaj.vm2.Varargs)(p0)).arg(((int)(2)));
    org.luaj.vm2.LuaValue local4_life5 = ((org.luaj.vm2.Varargs)(p0)).arg(((int)(3)));
    return org.luaj.vm2.lib.jse.CoerceJavaToLua.coerce(((java.lang.Object)(new com.moon.scripting.api.types.Vec3i(((org.luaj.vm2.LuaValue)(local2_life1)).toint(), ((org.luaj.vm2.LuaValue)(local3_life3)).toint(), ((org.luaj.vm2.LuaValue)(local4_life5)).toint()))));
}


qZ(com.moon.jJ p0) { super(); }


private static void __sourceConstructorBody_9901e2fdfd59f67c(com.moon.qZ receiver, com.moon.jJ p0) throws Throwable {

((com.moon.qZ)(receiver)).a = ((com.moon.jJ)(p0));

    com.moon.qZ.__sourceConstructorInit_9901e2fdfd59f67c_0(((com.moon.qZ)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_9901e2fdfd59f67c_0(com.moon.qZ a0) throws E;
}
