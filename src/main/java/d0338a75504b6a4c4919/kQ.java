package com.moon;


public class kQ extends com.moon.kL<com.moon.scripting.api.types.templates.TriangleTemplate> {

private static net.minecraft.entity.Entity[] a;

private static final long c;

public kQ() {
super();
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(1823042464034886025L)), ((long)(-3558689863379573352L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(97815891091423L)))));
    if ((com.moon.kQ.a() == null)) {
        com.moon.kQ.b(((net.minecraft.entity.Entity[])(new net.minecraft.entity.Entity[4])));
    }
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public static void b(net.minecraft.entity.Entity[] p0) {
a = ((net.minecraft.entity.Entity[])(p0));
    return;
}


public static net.minecraft.entity.Entity[] a() {
return com.moon.kQ.a;
}


public com.moon.iX a__sourceBridge_d7debd5984(com.moon.scripting.api.types.templates.RenderTemplate p0) {
return ((com.moon.kQ)(this)).a(((com.moon.scripting.api.types.templates.TriangleTemplate)(((com.moon.scripting.api.types.templates.TriangleTemplate)(p0)))));
}


public com.moon.iX a(com.moon.scripting.api.types.templates.TriangleTemplate p0) {
long local2 = (com.moon.kQ.c ^ 122250149897454L);
    net.minecraft.entity.Entity[] local4 = com.moon.kQ.a();
    com.moon.i8 spill1731_0 = com.moon.i8.a(((float)(((com.moon.scripting.api.types.templates.TriangleTemplate)(p0)).top_x)), ((float)(((com.moon.scripting.api.types.templates.TriangleTemplate)(p0)).top_y)), ((float)(((com.moon.scripting.api.types.templates.TriangleTemplate)(p0)).left_x)), ((float)(((com.moon.scripting.api.types.templates.TriangleTemplate)(p0)).left_x)), ((float)(((com.moon.scripting.api.types.templates.TriangleTemplate)(p0)).right_x)), ((float)(((com.moon.scripting.api.types.templates.TriangleTemplate)(p0)).right_y)), ((int)(((com.moon.scripting.api.types.templates.TriangleTemplate)(p0)).color)));
    if ((net.minecraft.entity.Entity.b__ArrayString() != null)) {
        com.moon.kQ.b(((net.minecraft.entity.Entity[])(new net.minecraft.entity.Entity[4])));
    }
    return spill1731_0;
}



}
