package com.moon;


class pF extends org.luaj.vm2.lib.OneArgFunction {

com.moon.jP a;

pF(com.moon.jP p0) { super(); }


private static void __sourceConstructorBody_198bb9244feff501(com.moon.pF receiver, com.moon.jP p0) throws Throwable {

((com.moon.pF)(receiver)).a = ((com.moon.jP)(p0));

    com.moon.pF.__sourceConstructorInit_198bb9244feff501_0(((com.moon.pF)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_198bb9244feff501_0(com.moon.pF a0) throws E;

public org.luaj.vm2.LuaValue call(org.luaj.vm2.LuaValue p0) {
((com.moon.jY)(((com.moon.jP)(this.a)).c)).print(((java.lang.String)(__sourceExactCall_493d0f6dce2b6e(((com.moon.jP)(this.a)), ((org.luaj.vm2.LuaValue)(p0))))));
    return org.luaj.vm2.LuaValue.NIL;
}


private static native java.lang.String __sourceExactCall_493d0f6dce2b6e(com.moon.jP p0, org.luaj.vm2.LuaValue p1);
}
