package com.moon;


class r7 extends org.luaj.vm2.lib.ZeroArgFunction {

com.moon.jU a;

r7(com.moon.jU p0) { super(); }


private static void __sourceConstructorBody_8882983f84418709(com.moon.r7 receiver, com.moon.jU p0) throws Throwable {

((com.moon.r7)(receiver)).a = ((com.moon.jU)(p0));

    com.moon.r7.__sourceConstructorInit_8882983f84418709_0(((com.moon.r7)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_8882983f84418709_0(com.moon.r7 a0) throws E;

public org.luaj.vm2.LuaValue call() {
return org.luaj.vm2.LuaValue.valueOf(((boolean)(((com.moon.j3)(((com.moon.jU)(this.a)).c)).is_on_ladder())));
}

}
