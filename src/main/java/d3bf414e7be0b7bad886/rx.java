package com.moon;


class rx extends org.luaj.vm2.lib.ZeroArgFunction {

com.moon.jP a;

rx(com.moon.jP p0) { super(); }


private static void __sourceConstructorBody_620b5b204f51fcf0(com.moon.rx receiver, com.moon.jP p0) throws Throwable {

((com.moon.rx)(receiver)).a = ((com.moon.jP)(p0));

    com.moon.rx.__sourceConstructorInit_620b5b204f51fcf0_0(((com.moon.rx)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_620b5b204f51fcf0_0(com.moon.rx a0) throws E;

public org.luaj.vm2.LuaValue call() {
return org.luaj.vm2.LuaValue.valueOf(((double)(((double) ((com.moon.jY)(((com.moon.jP)(this.a)).c)).get_height()))));
}

}
