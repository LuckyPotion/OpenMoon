package com.moon;


class rw extends org.luaj.vm2.lib.ZeroArgFunction {

com.moon.jP a;

rw(com.moon.jP p0) { super(); }


private static void __sourceConstructorBody_c7d0d0670d666911(com.moon.rw receiver, com.moon.jP p0) throws Throwable {

((com.moon.rw)(receiver)).a = ((com.moon.jP)(p0));

    com.moon.rw.__sourceConstructorInit_c7d0d0670d666911_0(((com.moon.rw)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_c7d0d0670d666911_0(com.moon.rw a0) throws E;

public org.luaj.vm2.LuaValue call() {
return org.luaj.vm2.LuaValue.valueOf(((double)(((double) ((com.moon.jY)(((com.moon.jP)(this.a)).c)).get_width()))));
}

}
