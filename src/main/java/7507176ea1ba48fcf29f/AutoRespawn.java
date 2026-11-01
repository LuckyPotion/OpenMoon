package com.moon.module.impl;


public class AutoRespawn extends com.moon.module.Module {

private static final long s;

public AutoRespawn(java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) {
super(p0, p1, p2, p3);
}


static {
s = (moom._c.a(8599226960012131566L, -1073580888650426960L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(261729616356712L);
}


public void a(com.moon.event.TickEvent p0) {
net.minecraft.client.entity.EntityPlayerSP forwardValue785_17_0;
    net.minecraft.client.entity.EntityPlayerSP forwardValue785_31_0;
    net.minecraft.client.Minecraft forwardValue785_38_0;
    net.minecraft.client.entity.EntityPlayerSP spill785_0;
    net.minecraft.client.entity.EntityPlayerSP spill785_1;
    net.minecraft.client.Minecraft spill785_2;
    long life2_3;
    java.lang.String life4_5;
    forward_join_40: {
    forward_join_38: {
    forward_join_31: {
    forward_join_29: {
    forward_join_17: {
    life2_3 = (com.moon.module.impl.AutoRespawn.s ^ 65130303207073L);
    life4_5 = com.moon.bF.b();
    if (!((((com.moon.event.TickEvent)(p0)).getPhase() == com.moon.event.TickPhase.PRE))) {
        break forward_join_40;
    }
    spill785_0 = ((net.minecraft.client.Minecraft)(com.moon.module.impl.AutoRespawn.d)).K;
    if (!((life4_5 != null))) {
        forwardValue785_17_0 = spill785_0;
        break forward_join_17;
    }
    if (!((spill785_0 != null))) {
        break forward_join_40;
    }
    forwardValue785_17_0 = ((net.minecraft.client.Minecraft)(com.moon.module.impl.AutoRespawn.d)).K;
    }
    if (!((life4_5 != null))) {
        forwardValue785_31_0 = forwardValue785_17_0;
        break forward_join_31;
    }
    if (!((!((net.minecraft.client.entity.EntityPlayerSP)(forwardValue785_17_0)).F))) {
        break forward_join_29;
    }
    spill785_1 = ((net.minecraft.client.Minecraft)(com.moon.module.impl.AutoRespawn.d)).K;
    if (!((life4_5 != null))) {
        forwardValue785_31_0 = spill785_1;
        break forward_join_31;
    }
    if (!((recovery.source.CarrierOps.fcmpg(((float)(((net.minecraft.client.entity.EntityPlayerSP)(spill785_1)).b__sourceReturn_bc607678b6())), ((float)(0x0.0p0f))) <= 0))) {
        break forward_join_40;
    }
    }
    forwardValue785_31_0 = ((net.minecraft.client.Minecraft)(com.moon.module.impl.AutoRespawn.d)).K;
    }
    ((net.minecraft.client.entity.EntityPlayerSP)(forwardValue785_31_0)).S();
    spill785_2 = com.moon.module.impl.AutoRespawn.d;
    if (!((life4_5 != null))) {
        forwardValue785_38_0 = spill785_2;
        break forward_join_38;
    }
    if (!((((net.minecraft.client.Minecraft)(spill785_2)).P != null))) {
        break forward_join_40;
    }
    forwardValue785_38_0 = com.moon.module.impl.AutoRespawn.d;
    }
    ((net.minecraft.client.Minecraft)(forwardValue785_38_0)).a(((net.minecraft.client.gui.GuiScreen)(null)));
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}

}
