package com.moon;


class qX extends org.luaj.vm2.lib.VarArgFunction {

com.moon.jJ a;

public org.luaj.vm2.Varargs invoke(org.luaj.vm2.Varargs p0) {
org.luaj.vm2.LuaValue local2_life1 = ((org.luaj.vm2.Varargs)(p0)).arg(((int)(1)));
    org.luaj.vm2.LuaValue local3_life3 = ((org.luaj.vm2.Varargs)(p0)).arg(((int)(2)));
    org.luaj.vm2.LuaValue local4_life5 = ((org.luaj.vm2.Varargs)(p0)).arg(((int)(3)));
    return org.luaj.vm2.lib.jse.CoerceJavaToLua.coerce(((java.lang.Object)(new com.moon.scripting.api.types.Vec3d(((org.luaj.vm2.LuaValue)(local2_life1)).todouble(), ((org.luaj.vm2.LuaValue)(local3_life3)).todouble(), ((org.luaj.vm2.LuaValue)(local4_life5)).todouble()))));
}


qX(com.moon.jJ p0) { super(); }


private static void __sourceConstructorBody_a00b21d47f3c02c5(com.moon.qX receiver, com.moon.jJ p0) throws Throwable {

((com.moon.qX)(receiver)).a = ((com.moon.jJ)(p0));

    com.moon.qX.__sourceConstructorInit_a00b21d47f3c02c5_0(((com.moon.qX)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_a00b21d47f3c02c5_0(com.moon.qX a0) throws E;
}
