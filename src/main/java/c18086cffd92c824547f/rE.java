package com.moon;


class rE extends org.luaj.vm2.lib.ZeroArgFunction {

com.moon.jS a;

rE(com.moon.jS p0) { super(); }


private static void __sourceConstructorBody_6a9f9fcb6a6a2cfb(com.moon.rE receiver, com.moon.jS p0) throws Throwable {

((com.moon.rE)(receiver)).a = ((com.moon.jS)(p0));

    com.moon.rE.__sourceConstructorInit_6a9f9fcb6a6a2cfb_0(((com.moon.rE)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_6a9f9fcb6a6a2cfb_0(com.moon.rE a0) throws E;

public org.luaj.vm2.LuaValue call() {
return org.luaj.vm2.LuaValue.valueOf(((java.lang.String)(((com.moon.j1)(((com.moon.jS)(this.a)).c)).current_inventory())));
}

}
