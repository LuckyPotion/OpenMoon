package com.moon;


public class fC extends com.moon.e2<com.moon.module.impl.Speed> {

private static final long e;

public fC() {
super(com.moon.module.impl.Speed.class);
}


static {
e = (moom._c.a(8444694195665383135L, 180813975060382673L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(107232711637289L);
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public void a(com.moon.event.TickEvent p0) {
int forwardValue101_25_0;
    net.minecraft.client.entity.EntityPlayerSP forwardValue101_28_0;
    boolean spill101_0;
    net.minecraft.client.entity.EntityPlayerSP spill101_1;
    long life2_3;
    int life4_5;
    forward_join_30: {
    forward_join_28: {
    forward_join_25: {
    forward_join_14: {
    forward_join_13: {
    life2_3 = (com.moon.fC.e ^ 50521390084924L);
    life4_5 = ((moom.DD.b__Boolean()) ? 1 : 0);
    if (!((((net.minecraft.client.Minecraft)(com.moon.fC.a)).K != null))) {
        break forward_join_13;
    }
    if (!((((com.moon.event.TickEvent)(p0)).getPhase() != com.moon.event.TickPhase.PRE))) {
        break forward_join_14;
    }
    }
    return;
    }
    spill101_0 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fC.a)).K)).A;
    if (!((life4_5 == 0))) {
        forwardValue101_25_0 = ((spill101_0) ? 1 : 0);
        break forward_join_25;
    }
    if (!(spill101_0)) {
        break forward_join_30;
    }
    spill101_1 = ((net.minecraft.client.Minecraft)(com.moon.fC.a)).K;
    if (!((life4_5 == 0))) {
        forwardValue101_28_0 = spill101_1;
        break forward_join_28;
    }
    forwardValue101_25_0 = ((((net.minecraft.client.entity.EntityPlayerSP)(spill101_1)).ae()) ? 1 : 0);
    }
    if (!((forwardValue101_25_0 != 0))) {
        break forward_join_30;
    }
    forwardValue101_28_0 = ((net.minecraft.client.Minecraft)(com.moon.fC.a)).K;
    }
    ((net.minecraft.client.entity.EntityPlayerSP)(forwardValue101_28_0)).bh = ((boolean)(true));
    }
    return;
}


public void a(com.moon.dQ p0) {
return;
}

}
