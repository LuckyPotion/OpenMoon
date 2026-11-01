package com.moon;


class rT extends org.luaj.vm2.lib.ZeroArgFunction {

com.moon.jU a;

rT(com.moon.jU p0) { super(); }


private static void __sourceConstructorBody_24a355acebf4915f(com.moon.rT receiver, com.moon.jU p0) throws Throwable {

((com.moon.rT)(receiver)).a = ((com.moon.jU)(p0));

    com.moon.rT.__sourceConstructorInit_24a355acebf4915f_0(((com.moon.rT)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_24a355acebf4915f_0(com.moon.rT a0) throws E;

public org.luaj.vm2.LuaValue call() {
return org.luaj.vm2.lib.jse.CoerceJavaToLua.coerce(((java.lang.Object)(((com.moon.j3)(((com.moon.jU)(this.a)).c)).get_position())));
}

}
