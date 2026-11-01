package com.moon;


public class f8 extends com.moon.f0 {

private boolean c;

private static final long d;

public f8() {
super();
}


static {
d = (moom._c.a(36312288248341622L, -8173350875951364831L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(136081001938023L);
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public void b() {
long local1 = (com.moon.f8.d ^ 139737112403096L);
    if (this.c) {
        ((net.minecraft.client.network.NetHandlerPlayClient)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.f8.a)).K)).cm)).a(((moom.yK)(new moom.za(net.minecraft.network.play.client.C07PacketPlayerDigging$Action.RELEASE_USE_ITEM, moom.zb.a, moom.bs.DOWN))));
    }
    return;
}


public void c() {
int forwardValue95_19_0;
    com.moon.f8 forwardValue95_34_0;
    boolean spill95_0;
    com.moon.f8 spill95_1;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_36: {
    forward_join_34: {
    forward_join_19: {
    life1_3 = (com.moon.f8.d ^ 8310764534550L);
    life3_5 = moom.DT.a__Arrayr3();
    spill95_0 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.KillAura)(((com.moon.f8)(this)).b)).o())).getValue())))).booleanValue();
    if (!((life3_5 != null))) {
        forwardValue95_19_0 = ((spill95_0) ? 1 : 0);
        break forward_join_19;
    }
    if (!(spill95_0)) {
        break forward_join_36;
    }
    spill95_1 = this;
    if (!((life3_5 != null))) {
        forwardValue95_34_0 = spill95_1;
        break forward_join_34;
    }
    forwardValue95_19_0 = ((((com.moon.f8)(spill95_1)).c) ? 1 : 0);
    }
    if (!((forwardValue95_19_0 != 0))) {
        break forward_join_36;
    }
    ((moom.jI)(((net.minecraft.client.Minecraft)(com.moon.f8.a)).F)).c();
    ((net.minecraft.client.network.NetHandlerPlayClient)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.f8.a)).K)).cm)).a(((moom.yK)(new moom.za(net.minecraft.network.play.client.C07PacketPlayerDigging$Action.RELEASE_USE_ITEM, moom.zb.a, moom.bs.DOWN))));
    forwardValue95_34_0 = this;
    }
    ((com.moon.f8)(forwardValue95_34_0)).c = ((boolean)(false));
    }
    return;
}


public void d() {
int forwardValue96_17_0;
    int forwardValue96_22_0;
    int forwardValue96_35_0;
    boolean spill96_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_39: {
    forward_join_35: {
    forward_join_22: {
    forward_join_17: {
    life1_3 = (com.moon.f8.d ^ 81498443689543L);
    life3_5 = moom.DT.a__Arrayr3();
    spill96_0 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.KillAura)(((com.moon.f8)(this)).b)).o())).getValue())))).booleanValue();
    if (!((life3_5 != null))) {
        forwardValue96_17_0 = ((spill96_0) ? 1 : 0);
        break forward_join_17;
    }
    if (!(spill96_0)) {
        break forward_join_39;
    }
    forwardValue96_17_0 = ((this.c) ? 1 : 0);
    }
    if (!((life3_5 != null))) {
        forwardValue96_22_0 = forwardValue96_17_0;
        break forward_join_22;
    }
    if (!((forwardValue96_17_0 == 0))) {
        break forward_join_39;
    }
    forwardValue96_22_0 = ((((com.moon.f8)(this)).a__Boolean()) ? 1 : 0);
    }
    if (!((life3_5 != null))) {
        forwardValue96_35_0 = forwardValue96_22_0;
        break forward_join_35;
    }
    if (!((forwardValue96_22_0 != 0))) {
        break forward_join_39;
    }
    forwardValue96_35_0 = ((((moom.jI)(((net.minecraft.client.Minecraft)(com.moon.f8.a)).F)).a(((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.client.Minecraft)(com.moon.f8.a)).K)), ((net.minecraft.world.World)(((net.minecraft.client.Minecraft)(com.moon.f8.a)).I)), ((net.minecraft.item.ItemStack)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.f8.a)).K)).a__xW())))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue96_35_0);
    this.c = ((boolean)(true));
    }
    return;
}


public void a(com.moon.event.MoveEvent p0) {
int forwardValue94_19_0;
    int forwardValue94_32_0;
    boolean spill94_0;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_36: {
    forward_join_32: {
    forward_join_19: {
    life2_3 = (com.moon.f8.d ^ 128678287043678L);
    life4_5 = moom.DT.a__Arrayr3();
    if (!((((com.moon.event.MoveEvent)(p0)).getPhase() == com.moon.event.MovePhase.PRE))) {
        break forward_join_36;
    }
    spill94_0 = ((com.moon.gd)(((com.moon.module.impl.KillAura)(((com.moon.f8)(this)).b)).a__gd())).a__Boolean();
    if (!((life4_5 != null))) {
        forwardValue94_19_0 = ((spill94_0) ? 1 : 0);
        break forward_join_19;
    }
    if (!(spill94_0)) {
        break forward_join_36;
    }
    forwardValue94_19_0 = ((((com.moon.f8)(this)).a__Boolean()) ? 1 : 0);
    }
    if (!((life4_5 != null))) {
        forwardValue94_32_0 = forwardValue94_19_0;
        break forward_join_32;
    }
    if (!((forwardValue94_19_0 != 0))) {
        break forward_join_36;
    }
    forwardValue94_32_0 = ((((moom.jI)(((net.minecraft.client.Minecraft)(com.moon.f8.a)).F)).a(((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.client.Minecraft)(com.moon.f8.a)).K)), ((net.minecraft.world.World)(((net.minecraft.client.Minecraft)(com.moon.f8.a)).I)), ((net.minecraft.item.ItemStack)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.f8.a)).K)).a__xW())))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue94_32_0);
    this.c = ((boolean)(true));
    }
    return;
}


public void a(com.moon.event.PacketEvent p0) {
return;
}


public void a__Void() {
this.c = ((boolean)(false));
    return;
}

}
