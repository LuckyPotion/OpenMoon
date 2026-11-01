package com.moon;


class sp extends org.luaj.vm2.lib.ZeroArgFunction {

com.moon.jU a;

private static long b;

sp(com.moon.jU p0) { super(); }


private static void __sourceConstructorBody_4867a8ae106f8f8f(com.moon.sp receiver, com.moon.jU p0) throws Throwable {

((com.moon.sp)(receiver)).a = ((com.moon.jU)(p0));

    com.moon.sp.__sourceConstructorInit_4867a8ae106f8f8f_0(((com.moon.sp)(receiver)));

    return;

}



static {
com.moon.sp.b = (moom._c.a(3621443616809406315L, -4146204401654848116L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(143746867926003L);
}

private static native <E extends Throwable> void __sourceConstructorInit_4867a8ae106f8f8f_0(com.moon.sp a0) throws E;

private static moom.Oo a(moom.Oo p0) {
return p0;
}


public org.luaj.vm2.LuaValue call() {
org.luaj.vm2.LuaValue[] forestValue100072_34_0;
    int spill100072_0;
    org.luaj.vm2.LuaValue[] spill100072_1;
    long life1_3;
    com.moon.scripting.api.types.Potion[] life4_8;
    org.luaj.vm2.LuaValue[] life5_13;
    int life6_15;
    int life3_16;
    forest_join_34: {
    forest_join_33: {
    life1_3 = (com.moon.sp.b ^ 22106292034781L);
    life4_8 = ((com.moon.j3)(((com.moon.jU)(this.a)).c)).get_active_effects();
    spill100072_0 = com.moon.jN.c();
    life5_13 = new org.luaj.vm2.LuaValue[(life4_8).length];
    life6_15 = 0;
    life3_16 = spill100072_0;
    forest_cycle_17: while (true) {
    if (!((life6_15 < (life4_8).length))) {
        break forest_join_33;
    }
    spill100072_1 = life5_13;
    if (!((life3_16 == 0))) {
        forestValue100072_34_0 = spill100072_1;
        break forest_join_34;
    }
    (spill100072_1)[life6_15] = com.moon.j6.a__LuaValue(((java.lang.Object)((life4_8)[life6_15])));
    life6_15 += 1;
    if (!((life3_16 != 0))) {
        continue forest_cycle_17;
    }
    break forest_cycle_17;
    }
    }
    forestValue100072_34_0 = life5_13;
    }
    return org.luaj.vm2.LuaValue.listOf(((org.luaj.vm2.LuaValue[])(forestValue100072_34_0)));
}

}
