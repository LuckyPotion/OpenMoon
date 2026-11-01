package com.moon;


class sl extends org.luaj.vm2.lib.ZeroArgFunction {

com.moon.jU a;

sl(com.moon.jU p0) { super(); }


private static void __sourceConstructorBody_c2fd2763281e11e6(com.moon.sl receiver, com.moon.jU p0) throws Throwable {

((com.moon.sl)(receiver)).a = ((com.moon.jU)(p0));

    com.moon.sl.__sourceConstructorInit_c2fd2763281e11e6_0(((com.moon.sl)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_c2fd2763281e11e6_0(com.moon.sl a0) throws E;

public org.luaj.vm2.LuaValue call() {
return org.luaj.vm2.LuaValue.valueOf(((int)(((com.moon.j3)(((com.moon.jU)(this.a)).c)).get_id())));
}

}
