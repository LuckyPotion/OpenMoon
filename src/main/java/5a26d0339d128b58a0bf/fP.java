package com.moon;


public class fP extends com.moon.e2<com.moon.module.impl.NoFall> {

private static final long e;

public fP() {
super(com.moon.module.impl.NoFall.class);
}


static {
e = (moom._c.a(-8378487770721283824L, 8235856984728529964L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(213569871165743L);
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public void a(com.moon.event.MoveEvent p0) {
net.minecraft.client.entity.EntityPlayerSP forwardValue129_25_0;
    net.minecraft.client.entity.EntityPlayerSP spill129_0;
    long life2_3;
    java.lang.String life4_5;
    forward_join_27: {
    forward_join_25: {
    life2_3 = (com.moon.fP.e ^ 80405652525391L);
    life4_5 = net.minecraft.init.Items.b();
    if (!((((com.moon.event.MoveEvent)(p0)).getPhase() == com.moon.event.MovePhase.PRE))) {
        break forward_join_27;
    }
    spill129_0 = ((net.minecraft.client.Minecraft)(com.moon.fP.a)).K;
    if (!((life4_5 == null))) {
        forwardValue129_25_0 = spill129_0;
        break forward_join_25;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(((double) ((net.minecraft.client.entity.EntityPlayerSP)(spill129_0)).L))), ((double)(0x1.7333333333333p1d))) >= 0))) {
        break forward_join_27;
    }
    ((com.moon.event.MoveEvent)(p0)).a(((boolean)(true)));
    forwardValue129_25_0 = ((net.minecraft.client.Minecraft)(com.moon.fP.a)).K;
    }
    ((net.minecraft.client.entity.EntityPlayerSP)(forwardValue129_25_0)).L = ((float)(0x0.0p0f));
    }
    return;
}

}
