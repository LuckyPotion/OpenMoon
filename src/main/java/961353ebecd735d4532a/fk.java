package com.moon;


public class fk extends com.moon.fj {

private static final long e;

public fk() {
super();
}


static {
e = (moom._c.a(-6324660603334614412L, 6232374831162412688L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(254186189697136L);
}


private static moom.Oo c(moom.Oo p0) {
return p0;
}


public void a(com.moon.event.MoveEvent p0) {
int forwardValue174_26_0;
    int spill174_0;
    long life2_3;
    int[] life4_5;
    forward_join_49: {
    forward_join_26: {
    life2_3 = (com.moon.fk.e ^ 98808147067628L);
    life4_5 = moom.bs.b__ArrayInt();
    if (!((((com.moon.event.MoveEvent)(p0)).getPhase() == com.moon.event.MovePhase.PRE))) {
        break forward_join_49;
    }
    spill174_0 = recovery.source.CarrierOps.fcmpl(((float)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fk.a)).K)).L)), ((float)(((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(((com.moon.module.impl.AntiVoid)(((com.moon.module.impl.AntiVoid)(((com.moon.fk)(this)).a())))).a__kZ())).getValue())))).floatValue())));
    if (!((life4_5 == null))) {
        forwardValue174_26_0 = spill174_0;
        break forward_join_26;
    }
    if (!((spill174_0 > 0))) {
        break forward_join_49;
    }
    forwardValue174_26_0 = ((__sourceExactCall_5fe1f3ee664019(((com.moon.fk)(this)))) ? 1 : 0);
    }
    if (!((forwardValue174_26_0 == 0))) {
        break forward_join_49;
    }
    ((net.minecraft.client.network.NetHandlerPlayClient)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fk.a)).K)).cm)).b(((moom.yK)(new moom.y8(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fk.a)).K)).n, (((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fk.a)).K)).o + ((double) ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fk.a)).K)).L)), ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fk.a)).K)).p, false))));
    }
    return;
}


private static native boolean __sourceExactCall_5fe1f3ee664019(com.moon.fk p0);
}
