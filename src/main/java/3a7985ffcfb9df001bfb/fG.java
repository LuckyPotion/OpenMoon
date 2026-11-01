package com.moon;


public class fG extends com.moon.e2<com.moon.module.impl.Speed> {

private static final long e;

public fG() {
super(com.moon.module.impl.Speed.class);
}


static {
e = (moom._c.a(-6109232212561501913L, 8038188312389949785L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(41690286794270L);
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public void a(com.moon.event.MotionEvent p0) {
long life2_3;
    int life4_5;
    forward_join_27: {
    forward_join_24: {
    forward_join_22: {
    life2_3 = (com.moon.fG.e ^ 56971357382185L);
    life4_5 = ((moom.DD.a__Boolean()) ? 1 : 0);
    if (!((life4_5 != 0))) { break forward_join_22; }
    if (!(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fG.a)).K)).ae())) { break forward_join_24; }
    ((com.moon.event.MotionEvent)(p0)).applyMotionSpeed(((double)(((double) ((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(((com.moon.module.impl.Speed)(((com.moon.module.impl.Speed)(((com.moon.fG)(this)).a())))).D)).getValue())))).floatValue()))));
    }
    if (!((life4_5 == 0))) { break forward_join_27; }
    }
    ((com.moon.event.MotionEvent)(p0)).applyMotionSpeed(((double)(0x0.0p0d)));
    }
    return;
}


public void a(com.moon.event.MoveEvent p0) {
int forwardValue108_15_0;
    int forwardValue108_25_0;
    boolean spill108_0;
    long life2_3;
    int life4_5;
    forward_join_29: {
    forward_join_25: {
    forward_join_15: {
    life2_3 = (com.moon.fG.e ^ 131365809206466L);
    life4_5 = ((moom.DD.b__Boolean()) ? 1 : 0);
    spill108_0 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fG.a)).K)).A;
    if (!((life4_5 == 0))) {
        forwardValue108_15_0 = ((spill108_0) ? 1 : 0);
        break forward_join_15;
    }
    if (!(spill108_0)) {
        break forward_join_29;
    }
    forwardValue108_15_0 = ((((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fG.a)).K)).ae()) ? 1 : 0);
    }
    if (!((life4_5 == 0))) {
        forwardValue108_25_0 = forwardValue108_15_0;
        break forward_join_25;
    }
    if (!((forwardValue108_15_0 != 0))) {
        break forward_join_29;
    }
    forwardValue108_25_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.Speed)(((com.moon.module.impl.Speed)(((com.moon.fG)(this)).a())))).f())).getValue())))).booleanValue()) ? 1 : 0);
    }
    if (!((forwardValue108_25_0 != 0))) {
        break forward_join_29;
    }
    ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fG.a)).K)).D__sourceReturn_da8c82d5d4();
    }
    return;
}

}
