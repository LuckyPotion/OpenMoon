package com.moon;


class rB extends org.luaj.vm2.lib.ZeroArgFunction {

com.moon.jS a;

rB(com.moon.jS p0) { super(); }


private static void __sourceConstructorBody_163c60afdfa97f53(com.moon.rB receiver, com.moon.jS p0) throws Throwable {

((com.moon.rB)(receiver)).a = ((com.moon.jS)(p0));

    com.moon.rB.__sourceConstructorInit_163c60afdfa97f53_0(((com.moon.rB)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_163c60afdfa97f53_0(com.moon.rB a0) throws E;

public org.luaj.vm2.LuaValue call() {
return org.luaj.vm2.LuaValue.valueOf(((int)(((com.moon.j1)(((com.moon.jS)(this.a)).c)).upper_container_id())));
}

}
