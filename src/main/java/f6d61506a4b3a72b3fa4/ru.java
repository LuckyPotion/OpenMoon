package com.moon;


class ru extends org.luaj.vm2.lib.ZeroArgFunction {

com.moon.jP a;

ru(com.moon.jP p0) { super(); }


private static void __sourceConstructorBody_c93ab6b59b480565(com.moon.ru receiver, com.moon.jP p0) throws Throwable {

((com.moon.ru)(receiver)).a = ((com.moon.jP)(p0));

    com.moon.ru.__sourceConstructorInit_c93ab6b59b480565_0(((com.moon.ru)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_c93ab6b59b480565_0(com.moon.ru a0) throws E;

public org.luaj.vm2.LuaValue call() {
return org.luaj.vm2.LuaValue.valueOf(((double)(((double) ((com.moon.jY)(((com.moon.jP)(this.a)).c)).get_scaled_width()))));
}

}
