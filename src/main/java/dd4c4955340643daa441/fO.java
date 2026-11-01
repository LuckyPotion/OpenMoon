package com.moon;


public class fO extends com.moon.e2<com.moon.module.impl.NoFall> {

private boolean e;

private static final long f;

public fO() {
super(com.moon.module.impl.NoFall.class);
}


static {
f = (moom._c.a(-7269988158193049191L, -7410128445784127608L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(149480616443759L);
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public void a(com.moon.event.MoveEvent p0) {
int forwardValue128_25_0;
    int forwardValue128_31_0;
    int spill128_0;
    long life2_3;
    java.lang.String life4_5;
    forward_join_46: {
    forward_join_31: {
    forward_join_25: {
    forward_join_23: {
    life2_3 = (com.moon.fO.f ^ 93260064963227L);
    life4_5 = net.minecraft.init.Items.b();
    if (!((((com.moon.event.MoveEvent)(p0)).getPhase() == com.moon.event.MovePhase.PRE))) {
        break forward_join_46;
    }
    spill128_0 = recovery.source.CarrierOps.fcmpl(((float)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fO.a)).K)).L)), ((float)(0x1.8p1f)));
    if (!((life4_5 == null))) {
        forwardValue128_25_0 = spill128_0;
        break forward_join_25;
    }
    if (!((spill128_0 > 0))) {
        break forward_join_23;
    }
    this.e = ((boolean)(true));
    if (!((life4_5 != null))) {
        break forward_join_46;
    }
    }
    forwardValue128_25_0 = ((this.e) ? 1 : 0);
    }
    if (!((life4_5 == null))) {
        forwardValue128_31_0 = forwardValue128_25_0;
        break forward_join_31;
    }
    if (!((forwardValue128_25_0 != 0))) {
        break forward_join_46;
    }
    forwardValue128_31_0 = ((((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fO.a)).K)).A) ? 1 : 0);
    }
    if (!((forwardValue128_31_0 != 0))) {
        break forward_join_46;
    }
    ((com.moon.event.MoveEvent)(p0)).setY(((double)((((com.moon.event.MoveEvent)(p0)).getY() - 0x1.0p-3d))));
    ((com.moon.event.MoveEvent)(p0)).a(((boolean)(false)));
    this.e = ((boolean)(false));
    }
    return;
}

}
