package com.moon;


public class j0 implements com.moon.scripting.api.functions.render.ImmediateRenderFunctions {

private static final long a;

public j0() {
super();
}


static {
a = (moom._c.a(5823435919198024417L, -7175624296489858183L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(218060308617296L);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void text(com.moon.scripting.api.enums.CustomFontType p0, java.lang.String p1, float p2, float p3, float p4, int p5, boolean p6) {
long life8_3;
    com.moon.ce life11_6;
    com.moon.jm life12_11;
    com.moon.hW life13_19;
    int life10_20;
    forward_join_46: {
    forward_join_38: {
    forward_join_33: {
    life8_3 = (com.moon.j0.a ^ 107112207955532L);
    life11_6 = com.moon.kG.a(((com.moon.scripting.api.enums.CustomFontType)(p0)));
    life12_11 = ((com.moon.jo)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__jo())).a(((com.moon.ce)(life11_6)));
    boolean spill642_0 = com.moon.j2.c();
    life13_19 = ((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.MSDF))))).a(((com.moon.jm)(life12_11))))).a();
    life10_20 = ((spill642_0) ? 1 : 0);
    if (!((life10_20 == 0))) { break forward_join_33; }
    if (!(p6)) { break forward_join_38; }
    ((com.moon.jm)(life12_11)).a(((com.moon.hW)(life13_19)), ((java.lang.String)(p1)), ((float)(p2)), ((float)(p3)), ((float)(p4)), ((int)(p5)));
    }
    if (!((life10_20 != 0))) { break forward_join_46; }
    net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[5])));
    }
    ((com.moon.jm)(life12_11)).b(((com.moon.hW)(life13_19)), ((java.lang.String)(p1)), ((float)(p2)), ((float)(p3)), ((float)(p4)), ((int)(p5)));
    }
    ((com.moon.hW)(life13_19)).b();
    return;
}


public void rect(float p0, float p1, float p2, float p3, int p4) {
java.lang.Object local6 = ((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.RECTANGLE))))).a();
    ((com.moon.hW)(local6)).a(((com.moon.iX)(com.moon.i2.a(((float)(p0)), ((float)(p1)), ((float)(p2)), ((float)(p3)), ((int)(p4))))));
    ((com.moon.hW)(local6)).b();
    return;
}


public void outline_rounded_rect(float p0, float p1, float p2, float p3, float p4, float p5, int p6) {
java.lang.Object local8 = ((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.OUTLINE_ROUNDED_RECTANGLE))))).a();
    ((com.moon.hW)(local8)).a(((com.moon.iX)(com.moon.i1.a(((float)(p0)), ((float)(p1)), ((float)(p2)), ((float)(p3)), ((float)(p4)), ((float)(p5)), ((int)(p6))))));
    ((com.moon.hW)(local8)).b();
    return;
}


public void rounded_rect(float p0, float p1, float p2, float p3, float p4, int p5) {
java.lang.Object local7 = ((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.ROUNDED_RECTANGLE))))).a();
    ((com.moon.hW)(local7)).a(((com.moon.iX)(com.moon.i3.a(((float)(p0)), ((float)(p1)), ((float)(p2)), ((float)(p3)), ((float)(p4)), ((int)(p5))))));
    ((com.moon.hW)(local7)).b();
    return;
}


public void minecraft_text(java.lang.String p0, float p1, float p2, int p3, boolean p4) {
int forwardValue435_27_0;
    boolean spill435_0;
    long life6_3;
    int life8_5;
    forward_join_28: {
    forward_join_27: {
    forward_join_20: {
    life6_3 = (com.moon.j0.a ^ 140354817560909L);
    life8_5 = ((com.moon.j2.c()) ? 1 : 0);
    spill435_0 = p4;
    if (!((life8_5 == 0))) {
        forwardValue435_27_0 = ((spill435_0) ? 1 : 0);
        break forward_join_27;
    }
    if (!(spill435_0)) {
        break forward_join_20;
    }
    ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).N)).a(((java.lang.String)(p0)), ((float)(p1)), ((float)(p2)), ((int)(p3)));
    if (!((life8_5 != 0))) {
        break forward_join_28;
    }
    }
    forwardValue435_27_0 = ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).N)).b(((java.lang.String)(p0)), ((float)(p1)), ((float)(p2)), ((int)(p3)));
    }
    recovery.source.CarrierOps.discard(forwardValue435_27_0);
    }
    return;
}


public void triangle(float p0, float p1, float p2, float p3, float p4, float p5, int p6) {
java.lang.Object local8 = ((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.TRIANGLE))))).a();
    ((com.moon.hW)(local8)).a(((com.moon.iX)(com.moon.i8.a(((float)(p0)), ((float)(p1)), ((float)(p2)), ((float)(p3)), ((float)(p4)), ((float)(p5)), ((int)(p6))))));
    ((com.moon.hW)(local8)).b();
    return;
}


public void gradient_rect(float p0, float p1, float p2, float p3, int p4, int p5, boolean p6) {
java.lang.Object local8 = ((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.GRADIENT))))).a();
    ((com.moon.hW)(local8)).a(((com.moon.iX)(com.moon.i0.a(((float)(p0)), ((float)(p1)), ((float)(p2)), ((float)(p3)), ((int)(p4)), ((int)(p5)), ((boolean)(p6))))));
    ((com.moon.hW)(local8)).b();
    return;
}

}
