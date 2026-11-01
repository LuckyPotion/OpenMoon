package com.moon;


public class jX implements com.moon.scripting.api.functions.render.BatchedRenderFunctions {

private static final long a;

public jX() {
super();
}


static {
a = (moom._c.a(4570396480390074320L, -4015466743473978211L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(128564978136329L);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public com.moon.scripting.api.types.render.RenderBatch prepare_batch(com.moon.scripting.api.enums.TemplateType p0) {
return new com.moon.aG(com.moon.kI.a(((com.moon.scripting.api.enums.TemplateType)(p0))));
}


public void render_batch(com.moon.scripting.api.enums.TemplateType p0, com.moon.scripting.api.types.templates.RenderTemplate[] p1) {
int lexicalValue117_43_0;
    boolean spill117_0;
    long life3_3;
    com.moon.aG life6_9;
    com.moon.scripting.api.types.templates.RenderTemplate[] life7_11;
    int life8_15;
    int life9_17;
    int life5_18;
    com.moon.scripting.api.types.templates.RenderTemplate life10_25;
    lexical_join_44: {
    lexical_join_43: {
    lexical_join_42: {
    lexical_join_36: {
    lexical_join_34: {
    life3_3 = (com.moon.jX.a ^ 4176166012921L);
    life6_9 = new com.moon.aG(com.moon.kI.a(((com.moon.scripting.api.enums.TemplateType)(p0))));
    life7_11 = p1;
    spill117_0 = com.moon.j2.c();
    life8_15 = (life7_11).length;
    life9_17 = 0;
    life5_18 = ((spill117_0) ? 1 : 0);
    lexical_cycle_19: while (true) {
    if (!((life9_17 < life8_15))) {
        break lexical_join_34;
    }
    life10_25 = (life7_11)[life9_17];
    ((com.moon.aG)(life6_9)).add(((com.moon.scripting.api.types.templates.RenderTemplate)(life10_25)));
    life9_17 += 1;
    if (!((life5_18 == 0))) {
        break lexical_join_36;
    }
    if (!((life5_18 != 0))) { continue lexical_cycle_19; }
    break lexical_cycle_19;
    }
    }
    ((com.moon.aG)(life6_9)).render();
    }
    if (!((net.minecraft.entity.Entity.b__ArrayString() != null))) {
        break lexical_join_44;
    }
    if (!((life5_18 != 0))) {
        break lexical_join_42;
    }
    lexicalValue117_43_0 = 0;
    break lexical_join_43;
    }
    lexicalValue117_43_0 = 1;
    }
    com.moon.j2.b(((boolean)__sourceIntrinsic_integerToBoolean((lexicalValue117_43_0))));
    }
    return;
}


private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
