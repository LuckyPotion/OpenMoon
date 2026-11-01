package com.moon;


class sh extends org.luaj.vm2.lib.ZeroArgFunction {

com.moon.jU a;

sh(com.moon.jU p0) { super(); }


private static void __sourceConstructorBody_31aeeebddbdcc610(com.moon.sh receiver, com.moon.jU p0) throws Throwable {

((com.moon.sh)(receiver)).a = ((com.moon.jU)(p0));

    com.moon.sh.__sourceConstructorInit_31aeeebddbdcc610_0(((com.moon.sh)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_31aeeebddbdcc610_0(com.moon.sh a0) throws E;

public org.luaj.vm2.LuaValue call() {
return org.luaj.vm2.LuaValue.valueOf(((double)(((com.moon.j3)(((com.moon.jU)(this.a)).c)).get_food_amount())));
}

}
