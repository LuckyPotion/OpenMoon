package com.moon;


class rV extends org.luaj.vm2.lib.ZeroArgFunction {

com.moon.jU a;

rV(com.moon.jU p0) { super(); }


private static void __sourceConstructorBody_a73e63c4425c6ada(com.moon.rV receiver, com.moon.jU p0) throws Throwable {

((com.moon.rV)(receiver)).a = ((com.moon.jU)(p0));

    com.moon.rV.__sourceConstructorInit_a73e63c4425c6ada_0(((com.moon.rV)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_a73e63c4425c6ada_0(com.moon.rV a0) throws E;

public org.luaj.vm2.LuaValue call() {
return org.luaj.vm2.LuaValue.valueOf(((boolean)(((com.moon.j3)(((com.moon.jU)(this.a)).c)).is_on_ground())));
}

}
