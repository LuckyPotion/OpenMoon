package com.moon;


class rP extends org.luaj.vm2.lib.ZeroArgFunction {

com.moon.jU a;

rP(com.moon.jU p0) { super(); }


private static void __sourceConstructorBody_ad17acada18ed0e1(com.moon.rP receiver, com.moon.jU p0) throws Throwable {

((com.moon.rP)(receiver)).a = ((com.moon.jU)(p0));

    com.moon.rP.__sourceConstructorInit_ad17acada18ed0e1_0(((com.moon.rP)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_ad17acada18ed0e1_0(com.moon.rP a0) throws E;

public org.luaj.vm2.LuaValue call() {
return org.luaj.vm2.LuaValue.valueOf(((double)(((com.moon.j3)(((com.moon.jU)(this.a)).c)).get_prev_position_x())));
}

}
