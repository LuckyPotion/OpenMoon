package com.moon;


public class f7 extends com.moon.f0 {

private boolean c;

private static final long d;

public f7() {
super();
}


static {
d = (moom._c.a(1584196704288787551L, 4723410712922749497L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(112369701716870L);
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public void b() {
long local1 = (com.moon.f7.d ^ 38810195199384L);
    if (this.c) {
        ((net.minecraft.client.network.NetHandlerPlayClient)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.f7.a)).K)).cm)).a(((moom.yK)(new moom.za(net.minecraft.network.play.client.C07PacketPlayerDigging$Action.RELEASE_USE_ITEM, moom.zb.a, moom.bs.DOWN))));
    }
    return;
}


public void c() {
int forwardValue92_19_0;
    com.moon.f7 forwardValue92_34_0;
    boolean spill92_0;
    com.moon.f7 spill92_1;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_36: {
    forward_join_34: {
    forward_join_19: {
    life1_3 = (com.moon.f7.d ^ 100966749610518L);
    life3_5 = moom.DT.a__Arrayr3();
    spill92_0 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.KillAura)(((com.moon.f7)(this)).b)).o())).getValue())))).booleanValue();
    if (!((life3_5 != null))) {
        forwardValue92_19_0 = ((spill92_0) ? 1 : 0);
        break forward_join_19;
    }
    if (!(spill92_0)) {
        break forward_join_36;
    }
    spill92_1 = this;
    if (!((life3_5 != null))) {
        forwardValue92_34_0 = spill92_1;
        break forward_join_34;
    }
    forwardValue92_19_0 = ((((com.moon.f7)(spill92_1)).c) ? 1 : 0);
    }
    if (!((forwardValue92_19_0 != 0))) {
        break forward_join_36;
    }
    ((moom.jI)(((net.minecraft.client.Minecraft)(com.moon.f7.a)).F)).c();
    ((net.minecraft.client.network.NetHandlerPlayClient)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.f7.a)).K)).cm)).a(((moom.yK)(new moom.za(net.minecraft.network.play.client.C07PacketPlayerDigging$Action.RELEASE_USE_ITEM, moom.zb.a, moom.bs.DOWN))));
    forwardValue92_34_0 = this;
    }
    ((com.moon.f7)(forwardValue92_34_0)).c = ((boolean)(false));
    }
    return;
}


public void d() {
int forwardValue93_17_0;
    int forwardValue93_22_0;
    int forwardValue93_35_0;
    boolean spill93_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_39: {
    forward_join_35: {
    forward_join_22: {
    forward_join_17: {
    life1_3 = (com.moon.f7.d ^ 24483240703815L);
    life3_5 = moom.DT.a__Arrayr3();
    spill93_0 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.KillAura)(((com.moon.f7)(this)).b)).o())).getValue())))).booleanValue();
    if (!((life3_5 != null))) {
        forwardValue93_17_0 = ((spill93_0) ? 1 : 0);
        break forward_join_17;
    }
    if (!(spill93_0)) {
        break forward_join_39;
    }
    forwardValue93_17_0 = ((this.c) ? 1 : 0);
    }
    if (!((life3_5 != null))) {
        forwardValue93_22_0 = forwardValue93_17_0;
        break forward_join_22;
    }
    if (!((forwardValue93_17_0 == 0))) {
        break forward_join_39;
    }
    forwardValue93_22_0 = ((((com.moon.f7)(this)).a__Boolean()) ? 1 : 0);
    }
    if (!((life3_5 != null))) {
        forwardValue93_35_0 = forwardValue93_22_0;
        break forward_join_35;
    }
    if (!((forwardValue93_22_0 != 0))) {
        break forward_join_39;
    }
    forwardValue93_35_0 = ((((moom.jI)(((net.minecraft.client.Minecraft)(com.moon.f7.a)).F)).a(((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.client.Minecraft)(com.moon.f7.a)).K)), ((net.minecraft.world.World)(((net.minecraft.client.Minecraft)(com.moon.f7.a)).I)), ((net.minecraft.item.ItemStack)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.f7.a)).K)).a__xW())))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue93_35_0);
    this.c = ((boolean)(true));
    }
    return;
}


public void a(com.moon.event.MoveEvent p0) {
int forwardValue91_19_0;
    int forwardValue91_32_0;
    boolean spill91_0;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_36: {
    forward_join_32: {
    forward_join_19: {
    life2_3 = (com.moon.f7.d ^ 45436870243678L);
    life4_5 = moom.DT.a__Arrayr3();
    if (!((((com.moon.event.MoveEvent)(p0)).getPhase() == com.moon.event.MovePhase.POST))) {
        break forward_join_36;
    }
    spill91_0 = ((com.moon.gd)(((com.moon.module.impl.KillAura)(((com.moon.f7)(this)).b)).a__gd())).a__Boolean();
    if (!((life4_5 != null))) {
        forwardValue91_19_0 = ((spill91_0) ? 1 : 0);
        break forward_join_19;
    }
    if (!(spill91_0)) {
        break forward_join_36;
    }
    forwardValue91_19_0 = ((((com.moon.f7)(this)).a__Boolean()) ? 1 : 0);
    }
    if (!((life4_5 != null))) {
        forwardValue91_32_0 = forwardValue91_19_0;
        break forward_join_32;
    }
    if (!((forwardValue91_19_0 != 0))) {
        break forward_join_36;
    }
    forwardValue91_32_0 = ((((moom.jI)(((net.minecraft.client.Minecraft)(com.moon.f7.a)).F)).a(((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.client.Minecraft)(com.moon.f7.a)).K)), ((net.minecraft.world.World)(((net.minecraft.client.Minecraft)(com.moon.f7.a)).I)), ((net.minecraft.item.ItemStack)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.f7.a)).K)).a__xW())))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue91_32_0);
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
