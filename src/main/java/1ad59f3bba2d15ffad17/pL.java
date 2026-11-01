package com.moon;


class pL extends org.luaj.vm2.lib.OneArgFunction {

com.moon.jP a;

pL(com.moon.jP p0) { super(); }


private static void __sourceConstructorBody_699cd439d0800f20(com.moon.pL receiver, com.moon.jP p0) throws Throwable {

((com.moon.pL)(receiver)).a = ((com.moon.jP)(p0));

    com.moon.pL.__sourceConstructorInit_699cd439d0800f20_0(((com.moon.pL)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_699cd439d0800f20_0(com.moon.pL a0) throws E;

public org.luaj.vm2.LuaValue call(org.luaj.vm2.LuaValue p0) {
return org.luaj.vm2.LuaValue.valueOf(((double)(((double) ((com.moon.jY)(((com.moon.jP)(this.a)).c)).time()))));
}

}
