package com.moon;


public class n2 {

private static com.moon.module.impl.Camera a;

private static final long b;

public n2() {
super();
}


static {
b = (moom._c.a(3396859312274356577L, -6537810077299752787L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(278339199838832L);
    a = ((com.moon.module.impl.Camera) (((com.moon.runtime.ClientContext.getInstance()).a__fU()).a(com.moon.module.impl.Camera.class)));
}


public static boolean a(net.minecraft.client.particle.EntityFX p0) {
int forwardValue985_21_0;
    int forwardValue985_23_0;
    boolean spill985_0;
    boolean spill985_1;
    long life1_3;
    int life3_5;
    forward_join_23: {
    forward_join_22: {
    forward_join_21: {
    forward_join_20: {
    life1_3 = (com.moon.n2.b ^ 98696998315599L);
    life3_5 = ((com.moon.n1.c()) ? 1 : 0);
    spill985_0 = com.moon.nG.a(((moom.CA)(((net.minecraft.client.particle.EntityFX)(p0)).b())));
    if (!((life3_5 != 0))) {
        forwardValue985_21_0 = ((spill985_0) ? 1 : 0);
        break forward_join_21;
    }
    if (!((!spill985_0))) {
        break forward_join_20;
    }
    spill985_1 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.Camera)(com.moon.n2.a)).w)).getValue())))).booleanValue();
    if (!((life3_5 != 0))) {
        forwardValue985_21_0 = ((spill985_1) ? 1 : 0);
        break forward_join_21;
    }
    if (!((!spill985_1))) {
        break forward_join_22;
    }
    }
    forwardValue985_21_0 = 1;
    }
    forwardValue985_23_0 = forwardValue985_21_0;
    break forward_join_23;
    }
    forwardValue985_23_0 = 0;
    }
    return ((forwardValue985_23_0) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}

}
