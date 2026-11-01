package com.moon;


class si extends org.luaj.vm2.lib.ZeroArgFunction {

com.moon.jU a;

si(com.moon.jU p0) { super(); }


private static void __sourceConstructorBody_e034ab623a6ce17b(com.moon.si receiver, com.moon.jU p0) throws Throwable {

((com.moon.si)(receiver)).a = ((com.moon.jU)(p0));

    com.moon.si.__sourceConstructorInit_e034ab623a6ce17b_0(((com.moon.si)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_e034ab623a6ce17b_0(com.moon.si a0) throws E;

public org.luaj.vm2.LuaValue call() {
return org.luaj.vm2.LuaValue.valueOf(((int)(((com.moon.j3)(((com.moon.jU)(this.a)).c)).get_hurt_time())));
}

}
