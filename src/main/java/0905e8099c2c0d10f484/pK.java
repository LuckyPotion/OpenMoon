package com.moon;


class pK extends org.luaj.vm2.lib.OneArgFunction {

com.moon.jP a;

pK(com.moon.jP p0) { super(); }


private static void __sourceConstructorBody_06c0d4df39552c17(com.moon.pK receiver, com.moon.jP p0) throws Throwable {

((com.moon.pK)(receiver)).a = ((com.moon.jP)(p0));

    com.moon.pK.__sourceConstructorInit_06c0d4df39552c17_0(((com.moon.pK)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_06c0d4df39552c17_0(com.moon.pK a0) throws E;

public org.luaj.vm2.LuaValue call(org.luaj.vm2.LuaValue p0) {
return org.luaj.vm2.LuaValue.valueOf(((int)(((com.moon.jY)(((com.moon.jP)(this.a)).c)).fps())));
}

}
