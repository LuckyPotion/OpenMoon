package com.moon;


class ss extends org.luaj.vm2.lib.ZeroArgFunction {

com.moon.jU a;

ss(com.moon.jU p0) { super(); }


private static void __sourceConstructorBody_c627adab1fd36b8b(com.moon.ss receiver, com.moon.jU p0) throws Throwable {

((com.moon.ss)(receiver)).a = ((com.moon.jU)(p0));

    com.moon.ss.__sourceConstructorInit_c627adab1fd36b8b_0(((com.moon.ss)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_c627adab1fd36b8b_0(com.moon.ss a0) throws E;

public org.luaj.vm2.LuaValue call() {
return org.luaj.vm2.LuaValue.valueOf(((double)(((double) ((com.moon.j3)(((com.moon.jU)(this.a)).c)).get_yaw()))));
}

}
