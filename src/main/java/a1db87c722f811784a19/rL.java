package com.moon;


class rL extends org.luaj.vm2.lib.ZeroArgFunction {

com.moon.jU a;

rL(com.moon.jU p0) { super(); }


private static void __sourceConstructorBody_1d34b1f1f1dad52c(com.moon.rL receiver, com.moon.jU p0) throws Throwable {

((com.moon.rL)(receiver)).a = ((com.moon.jU)(p0));

    com.moon.rL.__sourceConstructorInit_1d34b1f1f1dad52c_0(((com.moon.rL)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_1d34b1f1f1dad52c_0(com.moon.rL a0) throws E;

public org.luaj.vm2.LuaValue call() {
return org.luaj.vm2.lib.jse.CoerceJavaToLua.coerce(((java.lang.Object)(((com.moon.j3)(((com.moon.jU)(this.a)).c)).get_motion())));
}

}
