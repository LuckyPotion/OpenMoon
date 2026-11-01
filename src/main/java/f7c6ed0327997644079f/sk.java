package com.moon;


class sk extends org.luaj.vm2.lib.ZeroArgFunction {

com.moon.jU a;

sk(com.moon.jU p0) { super(); }


private static void __sourceConstructorBody_3da3d5fcf04ce94d(com.moon.sk receiver, com.moon.jU p0) throws Throwable {

((com.moon.sk)(receiver)).a = ((com.moon.jU)(p0));

    com.moon.sk.__sourceConstructorInit_3da3d5fcf04ce94d_0(((com.moon.sk)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_3da3d5fcf04ce94d_0(com.moon.sk a0) throws E;

public org.luaj.vm2.LuaValue call() {
return org.luaj.vm2.LuaValue.valueOf(((java.lang.String)(((com.moon.j3)(((com.moon.jU)(this.a)).c)).get_name())));
}

}
