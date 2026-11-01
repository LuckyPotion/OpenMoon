package com.moon;


class sc extends org.luaj.vm2.lib.ZeroArgFunction {

com.moon.jU a;

sc(com.moon.jU p0) { super(); }


private static void __sourceConstructorBody_f2c32c08394b63e0(com.moon.sc receiver, com.moon.jU p0) throws Throwable {

((com.moon.sc)(receiver)).a = ((com.moon.jU)(p0));

    com.moon.sc.__sourceConstructorInit_f2c32c08394b63e0_0(((com.moon.sc)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_f2c32c08394b63e0_0(com.moon.sc a0) throws E;

public org.luaj.vm2.LuaValue call() {
return org.luaj.vm2.LuaValue.valueOf(((double)(((com.moon.j3)(((com.moon.jU)(this.a)).c)).get_base_move_speed())));
}

}
