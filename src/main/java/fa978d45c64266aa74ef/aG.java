package com.moon;


public class aG extends com.moon.scripting.api.types.render.RenderBatch {

private com.moon.cb a;

private java.util.List<com.moon.scripting.api.types.templates.RenderTemplate> b;

private static int c;

private static long d;

public aG(com.moon.cb p0) { super(); }


private static void __sourceConstructorBody_a2c984c8672b4439(com.moon.aG receiver, com.moon.cb p0) throws Throwable {

long local2_life1 = (com.moon.aG.d ^ 61863770532882L);

    com.moon.aG.__sourceConstructorInit_a2c984c8672b4439_0(((com.moon.aG)(receiver)));

    ((com.moon.aG)(receiver)).b = ((java.util.List)(new java.util.ArrayList()));

    int __sourceSpill0_6 = com.moon.aG.c();

    ((com.moon.aG)(receiver)).a = ((com.moon.cb)(p0));

    int local4_life7 = __sourceSpill0_6;

    if ((local4_life7 == 0)) {

        net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[1])));

    }

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_a2c984c8672b4439_0(com.moon.aG a0) throws E;

static {
d = ((long)(((moom._a)(moom._c.a(((long)(-7417193446453494427L)), ((long)(-4877573813079353983L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(133365264786151L)))));
    if ((com.moon.aG.c() == 0)) {
        com.moon.aG.b(((int)(9)));
    }
}


public void add(com.moon.scripting.api.types.templates.RenderTemplate p0) {
((java.util.List)(this.b)).add(((java.lang.Object)(p0)));
    return;
}


public static int b() {
return com.moon.aG.c;
}


public static void b(int p0) {
c = ((int)(p0));
    return;
}


public static int c() {
int local0 = com.moon.aG.b();
    if ((local0 == 0)) {
        return 61;
    }
    return 0;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private com.moon.hW a(com.moon.scripting.api.types.templates.RenderTemplate p0) {
com.moon.scripting.api.types.templates.RenderTemplate forwardValue4_12_0;
    com.moon.scripting.api.types.templates.RenderTemplate spill4_0;
    long life2_3;
    int life4_5;
    com.moon.scripting.api.types.templates.TextTemplate life5_19;
    com.moon.ce life6_23;
    com.moon.jm life7_28;
    forward_join_30: {
    forward_join_12: {
    life2_3 = (com.moon.aG.d ^ 62189036105863L);
    life4_5 = com.moon.aG.c();
    spill4_0 = p0;
    if (!((life4_5 != 0))) {
        forwardValue4_12_0 = spill4_0;
        break forward_join_12;
    }
    if (!((((spill4_0 instanceof com.moon.scripting.api.types.templates.TextTemplate) ? 1 : 0) != 0))) {
        break forward_join_30;
    }
    forwardValue4_12_0 = p0;
    }
    life5_19 = ((com.moon.scripting.api.types.templates.TextTemplate)(forwardValue4_12_0));
    life6_23 = com.moon.kG.a(((com.moon.scripting.api.enums.CustomFontType)(((com.moon.scripting.api.types.templates.TextTemplate)(life5_19)).font_type)));
    life7_28 = ((com.moon.jo)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__jo())).a(((com.moon.ce)(life6_23)));
    return ((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.MSDF))))).a(((com.moon.jm)(life7_28))))).a();
    }
    return ((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(this.a))))).a();
}


public void render() {
java.lang.Object lexicalValue0_17_0;
    com.moon.scripting.api.types.templates.RenderTemplate lexicalValue0_91_0;
    java.util.List spill0_0;
    com.moon.scripting.api.types.templates.RenderTemplate spill0_1;
    long life1_3;
    int life3_5;
    com.moon.scripting.api.types.templates.RenderTemplate life4_23;
    com.moon.hW life5_27;
    com.moon.jm life6_29;
    java.util.Iterator life7_33;
    com.moon.scripting.api.types.templates.RenderTemplate life8_40;
    com.moon.scripting.api.types.templates.TextTemplate life9_56;
    com.moon.ce life10_62;
    com.moon.iX life10_112;
    lexical_join_102: {
    lexical_join_100: {
    lexical_join_17: {
    lexical_join_13: {
    life1_3 = (com.moon.aG.d ^ 19551720721153L);
    life3_5 = com.moon.aG.b();
    spill0_0 = this.b;
    if (!((life3_5 == 0))) {
        lexicalValue0_17_0 = spill0_0;
        break lexical_join_17;
    }
    if (!(((java.util.List)(spill0_0)).isEmpty())) {
        break lexical_join_13;
    }
    return;
    }
    lexicalValue0_17_0 = ((java.util.List)(this.b)).get(((int)(0)));
    }
    life4_23 = ((com.moon.scripting.api.types.templates.RenderTemplate)(lexicalValue0_17_0));
    life5_27 = ((com.moon.aG)(this)).a(((com.moon.scripting.api.types.templates.RenderTemplate)(life4_23)));
    life6_29 = null;
    life7_33 = ((java.util.List)(this.b)).iterator();
    lexical_cycle_29: while (true) {
    lexical_join_98: {
    lexical_join_91: {
    lexical_join_90: {
    lexical_join_75: {
    lexical_join_57: {
    if (!(((java.util.Iterator)(life7_33)).hasNext())) {
        break lexical_join_100;
    }
    life8_40 = ((com.moon.scripting.api.types.templates.RenderTemplate)(((java.util.Iterator)(life7_33)).next()));
    if (!((life3_5 == 0))) {
        break lexical_join_102;
    }
    spill0_1 = life8_40;
    if (!((life3_5 == 0))) {
        lexicalValue0_91_0 = spill0_1;
        break lexical_join_91;
    }
    if (!((((spill0_1 instanceof com.moon.scripting.api.types.templates.TextTemplate) ? 1 : 0) != 0))) {
        break lexical_join_90;
    }
    life9_56 = ((com.moon.scripting.api.types.templates.TextTemplate)(life8_40));
    if (!((life6_29 == null))) {
        break lexical_join_57;
    }
    life10_62 = com.moon.kG.a(((com.moon.scripting.api.enums.CustomFontType)(((com.moon.scripting.api.types.templates.TextTemplate)(life9_56)).font_type)));
    life6_29 = ((com.moon.jo)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__jo())).a(((com.moon.ce)(life10_62)));
    }
    if (!(((com.moon.scripting.api.types.templates.TextTemplate)(life9_56)).shadow)) {
        break lexical_join_75;
    }
    ((com.moon.jm)(life6_29)).a(((com.moon.hW)(life5_27)), ((java.lang.String)(((com.moon.scripting.api.types.templates.TextTemplate)(life9_56)).text)), ((float)(((com.moon.scripting.api.types.templates.TextTemplate)(life9_56)).size)), ((float)(((com.moon.scripting.api.types.templates.TextTemplate)(life9_56)).x)), ((float)(((com.moon.scripting.api.types.templates.TextTemplate)(life9_56)).y)), ((int)(((com.moon.scripting.api.types.templates.TextTemplate)(life9_56)).color)));
    if (!((life3_5 != 0))) {
        break lexical_join_98;
    }
    }
    ((com.moon.jm)(life6_29)).b(((com.moon.hW)(life5_27)), ((java.lang.String)(((com.moon.scripting.api.types.templates.TextTemplate)(life9_56)).text)), ((float)(((com.moon.scripting.api.types.templates.TextTemplate)(life9_56)).size)), ((float)(((com.moon.scripting.api.types.templates.TextTemplate)(life9_56)).x)), ((float)(((com.moon.scripting.api.types.templates.TextTemplate)(life9_56)).y)), ((int)(((com.moon.scripting.api.types.templates.TextTemplate)(life9_56)).color)));
    if (!((life3_5 != 0))) {
        break lexical_join_98;
    }
    }
    lexicalValue0_91_0 = life8_40;
    }
    life10_112 = com.moon.kK.a(((com.moon.scripting.api.types.templates.RenderTemplate)(lexicalValue0_91_0)));
    if (!((life10_112 != null))) {
        break lexical_join_98;
    }
    ((com.moon.hW)(life5_27)).a(((com.moon.iX)(life10_112)));
    }
    if (!((life3_5 != 0))) { continue lexical_cycle_29; }
    break lexical_cycle_29;
    }
    }
    ((com.moon.hW)(life5_27)).b();
    }
    return;
}

}
