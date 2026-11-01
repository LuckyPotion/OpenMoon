package com.moon;


class se extends org.luaj.vm2.lib.ZeroArgFunction {

com.moon.jU a;

se(com.moon.jU p0) { super(); }


private static void __sourceConstructorBody_d7b6ef0de12201e9(com.moon.se receiver, com.moon.jU p0) throws Throwable {

((com.moon.se)(receiver)).a = ((com.moon.jU)(p0));

    com.moon.se.__sourceConstructorInit_d7b6ef0de12201e9_0(((com.moon.se)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_d7b6ef0de12201e9_0(com.moon.se a0) throws E;

public org.luaj.vm2.LuaValue call() {
return org.luaj.vm2.LuaValue.valueOf(((double)(((com.moon.j3)(((com.moon.jU)(this.a)).c)).get_health())));
}

}
