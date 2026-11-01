package com.moon;


class r_ extends org.luaj.vm2.lib.ZeroArgFunction {

com.moon.jU a;

r_(com.moon.jU p0) { super(); }


private static void __sourceConstructorBody_db24633021610d5e(com.moon.r_ receiver, com.moon.jU p0) throws Throwable {

((com.moon.r_)(receiver)).a = ((com.moon.jU)(p0));

    com.moon.r_.__sourceConstructorInit_db24633021610d5e_0(((com.moon.r_)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_db24633021610d5e_0(com.moon.r_ a0) throws E;

public org.luaj.vm2.LuaValue call() {
return org.luaj.vm2.LuaValue.valueOf(((int)(((com.moon.j3)(((com.moon.jU)(this.a)).c)).get_ticks_existed())));
}

}
