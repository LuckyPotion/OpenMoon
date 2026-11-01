package com.moon;


class rZ extends org.luaj.vm2.lib.ZeroArgFunction {

com.moon.jU a;

rZ(com.moon.jU p0) { super(); }


private static void __sourceConstructorBody_38c9ed2fec207993(com.moon.rZ receiver, com.moon.jU p0) throws Throwable {

((com.moon.rZ)(receiver)).a = ((com.moon.jU)(p0));

    com.moon.rZ.__sourceConstructorInit_38c9ed2fec207993_0(((com.moon.rZ)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_38c9ed2fec207993_0(com.moon.rZ a0) throws E;

public org.luaj.vm2.LuaValue call() {
return org.luaj.vm2.LuaValue.valueOf(((boolean)(((com.moon.j3)(((com.moon.jU)(this.a)).c)).is_in_water())));
}

}
