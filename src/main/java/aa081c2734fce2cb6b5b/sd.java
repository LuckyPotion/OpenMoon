package com.moon;


class sd extends org.luaj.vm2.lib.ZeroArgFunction {

com.moon.jU a;

sd(com.moon.jU p0) { super(); }


private static void __sourceConstructorBody_07fe3b9734f79fcc(com.moon.sd receiver, com.moon.jU p0) throws Throwable {

((com.moon.sd)(receiver)).a = ((com.moon.jU)(p0));

    com.moon.sd.__sourceConstructorInit_07fe3b9734f79fcc_0(((com.moon.sd)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_07fe3b9734f79fcc_0(com.moon.sd a0) throws E;

public org.luaj.vm2.LuaValue call() {
return org.luaj.vm2.LuaValue.valueOf(((double)(((com.moon.j3)(((com.moon.jU)(this.a)).c)).get_fall_distance())));
}

}
