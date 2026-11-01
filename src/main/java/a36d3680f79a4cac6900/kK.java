package com.moon;


public class kK {

private static final java.util.Map<java.lang.Class<?>, com.moon.kL<?>> a;

private static final long b;

public kK() {
super();
}


static {
b = (moom._c.a(-6979427511191974464L, -1535522366227253392L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(20552663618556L);
    a = new java.util.HashMap();
    (com.moon.kK.a).put(com.moon.scripting.api.types.templates.GradientTemplate.class, new com.moon.kM());
    (com.moon.kK.a).put(com.moon.scripting.api.types.templates.RectTemplate.class, new com.moon.kO());
    (com.moon.kK.a).put(com.moon.scripting.api.types.templates.RoundedRectTemplate.class, new com.moon.kP());
    (com.moon.kK.a).put(com.moon.scripting.api.types.templates.OutlinedRoundedRectTemplate.class, new com.moon.kN());
    (com.moon.kK.a).put(com.moon.scripting.api.types.templates.TriangleTemplate.class, new com.moon.kQ());
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


public static com.moon.iX a(com.moon.scripting.api.types.templates.RenderTemplate p0) {
java.lang.Object forwardValue623_16_0;
    com.moon.kL forwardValue623_25_0;
    com.moon.scripting.api.types.templates.RenderTemplate spill623_0;
    com.moon.kL spill623_1;
    long life1_3;
    int life3_5;
    com.moon.kL life4_22;
    forward_join_25: {
    forward_join_24: {
    forward_join_16: {
    forward_join_12: {
    life1_3 = (com.moon.kK.b ^ 78087947547822L);
    life3_5 = ((com.moon.kL.c()) ? 1 : 0);
    spill623_0 = p0;
    if (!((life3_5 != 0))) {
        forwardValue623_16_0 = spill623_0;
        break forward_join_16;
    }
    if (!((spill623_0 == null))) {
        break forward_join_12;
    }
    return null;
    }
    forwardValue623_16_0 = ((java.util.Map)(com.moon.kK.a)).get(((java.lang.Object)(((java.lang.Object)(p0)).getClass())));
    }
    life4_22 = ((com.moon.kL)(forwardValue623_16_0));
    spill623_1 = life4_22;
    if (!((life3_5 != 0))) {
        forwardValue623_25_0 = spill623_1;
        break forward_join_25;
    }
    if (!((spill623_1 == null))) {
        break forward_join_24;
    }
    return null;
    }
    forwardValue623_25_0 = life4_22;
    }
    return ((com.moon.kL)(forwardValue623_25_0)).a(((com.moon.scripting.api.types.templates.RenderTemplate)(((com.moon.scripting.api.types.templates.RenderTemplate)(com.moon.kK.a(((java.lang.Object)(p0))))))));
}

}
