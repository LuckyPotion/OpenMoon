package com.moon;


class q5 extends org.luaj.vm2.lib.VarArgFunction {

com.moon.jJ a;

public org.luaj.vm2.Varargs invoke(org.luaj.vm2.Varargs p0) {
org.luaj.vm2.LuaValue local2_life1 = ((org.luaj.vm2.Varargs)(p0)).arg(((int)(1)));
    org.luaj.vm2.LuaValue local3_life3 = ((org.luaj.vm2.Varargs)(p0)).arg(((int)(2)));
    return org.luaj.vm2.lib.jse.CoerceJavaToLua.coerce(((java.lang.Object)(new com.moon.scripting.api.types.Vec2f(((org.luaj.vm2.LuaValue)(local2_life1)).tofloat(), ((org.luaj.vm2.LuaValue)(local3_life3)).tofloat()))));
}


q5(com.moon.jJ p0) { super(); }


private static void __sourceConstructorBody_6e54b8d342cc0625(com.moon.q5 receiver, com.moon.jJ p0) throws Throwable {

((com.moon.q5)(receiver)).a = ((com.moon.jJ)(p0));

    com.moon.q5.__sourceConstructorInit_6e54b8d342cc0625_0(((com.moon.q5)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_6e54b8d342cc0625_0(com.moon.q5 a0) throws E;
}
