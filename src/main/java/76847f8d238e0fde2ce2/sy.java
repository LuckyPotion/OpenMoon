package com.moon;


class sy extends org.luaj.vm2.lib.ZeroArgFunction {

com.moon.jW a;

sy(com.moon.jW p0) { super(); }


private static void __sourceConstructorBody_51b80f0055d50ce1(com.moon.sy receiver, com.moon.jW p0) throws Throwable {

((com.moon.sy)(receiver)).a = ((com.moon.jW)(p0));

    com.moon.sy.__sourceConstructorInit_51b80f0055d50ce1_0(((com.moon.sy)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_51b80f0055d50ce1_0(com.moon.sy a0) throws E;

public org.luaj.vm2.LuaValue call() {
return org.luaj.vm2.LuaValue.valueOf(((java.lang.String)(((com.moon.j5)(((com.moon.jW)(this.a)).c)).get_biome())));
}

}
