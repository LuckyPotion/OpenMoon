package com.moon;


class sB extends org.luaj.vm2.lib.ZeroArgFunction {

com.moon.scripting.api.types.render.RenderBatch a;

com.moon.kb b;

private static long c;

sB(com.moon.kb p0, com.moon.scripting.api.types.render.RenderBatch p1) { super(); }


private static void __sourceConstructorBody_a0bf0a3496df76d1(com.moon.sB receiver, com.moon.kb p0, com.moon.scripting.api.types.render.RenderBatch p1) throws Throwable {

long local3_life2 = (com.moon.sB.c ^ 32377712717052L);

    java.lang.String[] __sourceSpill321_5 = com.moon.kb.a();

    ((com.moon.sB)(receiver)).b = ((com.moon.kb)(p0));

    java.lang.String[] local5_life6 = __sourceSpill321_5;

    ((com.moon.sB)(receiver)).a = ((com.moon.scripting.api.types.render.RenderBatch)(p1));

    com.moon.sB.__sourceConstructorInit_a0bf0a3496df76d1_0(((com.moon.sB)(receiver)));

    if ((net.minecraft.entity.Entity.b__ArrayString() != null)) {

        com.moon.kb.b(((java.lang.String[])(new java.lang.String[3])));

    }

    return;

}



static {
com.moon.sB.c = (moom._c.a(-7530550803228274145L, 6854102870175491389L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(72680041621754L);
}

private static native <E extends Throwable> void __sourceConstructorInit_a0bf0a3496df76d1_0(com.moon.sB a0) throws E;

public org.luaj.vm2.LuaValue call() {
((com.moon.scripting.api.types.render.RenderBatch)(this.a)).render();
    return com.moon.sB.NIL;
}

}
