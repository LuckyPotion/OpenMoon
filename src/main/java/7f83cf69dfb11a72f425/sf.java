package com.moon;


class sf extends org.luaj.vm2.lib.ZeroArgFunction {

com.moon.jU a;

sf(com.moon.jU p0) { super(); }


private static void __sourceConstructorBody_ef6371fdc80a088c(com.moon.sf receiver, com.moon.jU p0) throws Throwable {

((com.moon.sf)(receiver)).a = ((com.moon.jU)(p0));

    com.moon.sf.__sourceConstructorInit_ef6371fdc80a088c_0(((com.moon.sf)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_ef6371fdc80a088c_0(com.moon.sf a0) throws E;

public org.luaj.vm2.LuaValue call() {
return org.luaj.vm2.LuaValue.valueOf(((double)(((com.moon.j3)(((com.moon.jU)(this.a)).c)).get_max_health())));
}

}
