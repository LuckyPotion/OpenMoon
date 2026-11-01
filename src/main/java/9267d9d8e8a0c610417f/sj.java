package com.moon;


class sj extends org.luaj.vm2.lib.ZeroArgFunction {

com.moon.jU a;

sj(com.moon.jU p0) { super(); }


private static void __sourceConstructorBody_bc1717617e91d88c(com.moon.sj receiver, com.moon.jU p0) throws Throwable {

((com.moon.sj)(receiver)).a = ((com.moon.jU)(p0));

    com.moon.sj.__sourceConstructorInit_bc1717617e91d88c_0(((com.moon.sj)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_bc1717617e91d88c_0(com.moon.sj a0) throws E;

public org.luaj.vm2.LuaValue call() {
return org.luaj.vm2.LuaValue.valueOf(((int)(((com.moon.j3)(((com.moon.jU)(this.a)).c)).get_held_item_slot())));
}

}
