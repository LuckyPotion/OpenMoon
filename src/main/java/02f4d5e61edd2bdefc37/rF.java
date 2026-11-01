package com.moon;


class rF extends org.luaj.vm2.lib.ZeroArgFunction {

com.moon.jU a;

rF(com.moon.jU p0) { super(); }


private static void __sourceConstructorBody_a37b93a68493912a(com.moon.rF receiver, com.moon.jU p0) throws Throwable {

((com.moon.rF)(receiver)).a = ((com.moon.jU)(p0));

    com.moon.rF.__sourceConstructorInit_a37b93a68493912a_0(((com.moon.rF)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_a37b93a68493912a_0(com.moon.rF a0) throws E;

public org.luaj.vm2.LuaValue call() {
((com.moon.j3)(((com.moon.jU)(this.a)).c)).jump();
    return org.luaj.vm2.LuaValue.NIL;
}

}
