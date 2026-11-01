package com.moon;


public class fl extends com.moon.fj {

private static final long e;

public fl() {
super();
}


static {
e = (moom._c.a(-5676414227077893245L, 3191659507246122205L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(219696295835208L);
}


private static moom.Oo c(moom.Oo p0) {
return p0;
}


public void a(com.moon.event.MoveEvent p0) {
int forwardValue175_26_0;
    int spill175_0;
    long life2_3;
    int[] life4_5;
    forward_join_38: {
    forward_join_26: {
    life2_3 = (com.moon.fl.e ^ 44101147297585L);
    life4_5 = moom.bs.b__ArrayInt();
    if (!((((com.moon.event.MoveEvent)(p0)).getPhase() == com.moon.event.MovePhase.PRE))) {
        break forward_join_38;
    }
    spill175_0 = recovery.source.CarrierOps.fcmpl(((float)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fl.a)).K)).L)), ((float)(((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(((com.moon.module.impl.AntiVoid)(((com.moon.module.impl.AntiVoid)(((com.moon.fl)(this)).a())))).a__kZ())).getValue())))).floatValue())));
    if (!((life4_5 == null))) {
        forwardValue175_26_0 = spill175_0;
        break forward_join_26;
    }
    if (!((spill175_0 > 0))) {
        break forward_join_38;
    }
    forwardValue175_26_0 = ((__sourceExactCall_29ebc27ec30390(((com.moon.fl)(this)))) ? 1 : 0);
    }
    if (!((forwardValue175_26_0 == 0))) {
        break forward_join_38;
    }
    ((com.moon.event.MoveEvent)(p0)).setY(((double)((((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fl.a)).K)).o + ((double) ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fl.a)).K)).L)))));
    }
    return;
}


private static native boolean __sourceExactCall_29ebc27ec30390(com.moon.fl p0);
}
