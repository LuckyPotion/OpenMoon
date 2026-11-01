package com.moon;


public class j6 {

private static final java.util.Map<java.lang.Class<?>, com.moon.j7<?>> a;

private static final long b;

public j6() {
super();
}


static {
b = (moom._c.a(-5619511025301500271L, 7637040197137349260L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(246263944243654L);
    a = new java.util.HashMap();
    (com.moon.j6.a).put(com.moon.scripting.api.types.Block.class, new com.moon.kc());
    (com.moon.j6.a).put(com.moon.scripting.api.types.Potion.class, new com.moon.j_());
    (com.moon.j6.a).put(com.moon.scripting.api.types.RayCastResult.class, new com.moon.ka());
    (com.moon.j6.a).put(com.moon.scripting.api.types.Item.class, new com.moon.j9());
    (com.moon.j6.a).put(com.moon.scripting.api.types.Enchantment.class, new com.moon.j8());
    (com.moon.j6.a).put(com.moon.aG.class, new com.moon.kb());
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static <T> T a(java.lang.Object p0) {
try {
        return ((T)(p0));
    } catch (java.lang.Exception caught1) {
        ((java.lang.Exception)(caught1)).printStackTrace();
        return null;
    }
}


public static org.luaj.vm2.LuaValue a__LuaValue(java.lang.Object p0) {
java.lang.Object forwardValue564_16_0;
    com.moon.j7 forwardValue564_25_0;
    java.lang.Object spill564_0;
    com.moon.j7 spill564_1;
    long life1_3;
    int life3_5;
    com.moon.j7 life4_22;
    forward_join_25: {
    forward_join_24: {
    forward_join_16: {
    forward_join_12: {
    life1_3 = (com.moon.j6.b ^ 41750389732622L);
    life3_5 = com.moon.j7.c();
    spill564_0 = p0;
    if (!((life3_5 == 0))) {
        forwardValue564_16_0 = spill564_0;
        break forward_join_16;
    }
    if (!((spill564_0 == null))) {
        break forward_join_12;
    }
    return org.luaj.vm2.LuaTable.NIL;
    }
    forwardValue564_16_0 = ((java.util.Map)(com.moon.j6.a)).get(((java.lang.Object)(((java.lang.Object)(p0)).getClass())));
    }
    life4_22 = ((com.moon.j7)(forwardValue564_16_0));
    spill564_1 = life4_22;
    if (!((life3_5 == 0))) {
        forwardValue564_25_0 = spill564_1;
        break forward_join_25;
    }
    if (!((spill564_1 == null))) {
        break forward_join_24;
    }
    return org.luaj.vm2.LuaTable.NIL;
    }
    forwardValue564_25_0 = life4_22;
    }
    return ((com.moon.j7)(forwardValue564_25_0)).a(((java.lang.Object)(com.moon.j6.a(((java.lang.Object)(p0))))));
}

}
