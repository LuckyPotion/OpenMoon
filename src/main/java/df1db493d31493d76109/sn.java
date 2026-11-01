package com.moon;


class sn extends org.luaj.vm2.lib.ZeroArgFunction {

com.moon.jU a;

sn(com.moon.jU p0) { super(); }


private static void __sourceConstructorBody_77e44a206bbc6e19(com.moon.sn receiver, com.moon.jU p0) throws Throwable {

((com.moon.sn)(receiver)).a = ((com.moon.jU)(p0));

    com.moon.sn.__sourceConstructorInit_77e44a206bbc6e19_0(((com.moon.sn)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_77e44a206bbc6e19_0(com.moon.sn a0) throws E;

public org.luaj.vm2.LuaValue call() {
return org.luaj.vm2.lib.jse.CoerceJavaToLua.coerce(((java.lang.Object)(((com.moon.j3)(((com.moon.jU)(this.a)).c)).get_facing())));
}

}
