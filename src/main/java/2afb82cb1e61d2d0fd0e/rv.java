package com.moon;


class rv extends org.luaj.vm2.lib.ZeroArgFunction {

com.moon.jP a;

rv(com.moon.jP p0) { super(); }


private static void __sourceConstructorBody_82e59d96f4c27eb4(com.moon.rv receiver, com.moon.jP p0) throws Throwable {

((com.moon.rv)(receiver)).a = ((com.moon.jP)(p0));

    com.moon.rv.__sourceConstructorInit_82e59d96f4c27eb4_0(((com.moon.rv)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_82e59d96f4c27eb4_0(com.moon.rv a0) throws E;

public org.luaj.vm2.LuaValue call() {
return org.luaj.vm2.LuaValue.valueOf(((double)(((double) ((com.moon.jY)(((com.moon.jP)(this.a)).c)).get_scaled_height()))));
}

}
