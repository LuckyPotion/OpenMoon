package com.moon;


class pG extends org.luaj.vm2.lib.OneArgFunction {

com.moon.jP a;

pG(com.moon.jP p0) { super(); }


private static void __sourceConstructorBody_1c1ebe7e84c83334(com.moon.pG receiver, com.moon.jP p0) throws Throwable {

((com.moon.pG)(receiver)).a = ((com.moon.jP)(p0));

    com.moon.pG.__sourceConstructorInit_1c1ebe7e84c83334_0(((com.moon.pG)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_1c1ebe7e84c83334_0(com.moon.pG a0) throws E;

public org.luaj.vm2.LuaValue call(org.luaj.vm2.LuaValue p0) {
((com.moon.jY)(((com.moon.jP)(this.a)).c)).message(((java.lang.String)(__sourceExactCall_493d0f6dce2b6e(((com.moon.jP)(this.a)), ((org.luaj.vm2.LuaValue)(p0))))));
    return org.luaj.vm2.LuaValue.NIL;
}


private static native java.lang.String __sourceExactCall_493d0f6dce2b6e(com.moon.jP p0, org.luaj.vm2.LuaValue p1);
}
