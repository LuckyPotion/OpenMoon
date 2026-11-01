package com.moon;


class rD extends org.luaj.vm2.lib.ZeroArgFunction {

com.moon.jS a;

rD(com.moon.jS p0) { super(); }


private static void __sourceConstructorBody_34952fcdca412d34(com.moon.rD receiver, com.moon.jS p0) throws Throwable {

((com.moon.rD)(receiver)).a = ((com.moon.jS)(p0));

    com.moon.rD.__sourceConstructorInit_34952fcdca412d34_0(((com.moon.rD)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_34952fcdca412d34_0(com.moon.rD a0) throws E;

public org.luaj.vm2.LuaValue call() {
return org.luaj.vm2.LuaValue.valueOf(((int)(((com.moon.j1)(((com.moon.jS)(this.a)).c)).player_inventory_id())));
}

}
