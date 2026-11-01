package com.moon;


class sg extends org.luaj.vm2.lib.ZeroArgFunction {

com.moon.jU a;

sg(com.moon.jU p0) { super(); }


private static void __sourceConstructorBody_dcaf2d0d8a637bd9(com.moon.sg receiver, com.moon.jU p0) throws Throwable {

((com.moon.sg)(receiver)).a = ((com.moon.jU)(p0));

    com.moon.sg.__sourceConstructorInit_dcaf2d0d8a637bd9_0(((com.moon.sg)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_dcaf2d0d8a637bd9_0(com.moon.sg a0) throws E;

public org.luaj.vm2.LuaValue call() {
return org.luaj.vm2.LuaValue.valueOf(((double)(((com.moon.j3)(((com.moon.jU)(this.a)).c)).get_absorption())));
}

}
