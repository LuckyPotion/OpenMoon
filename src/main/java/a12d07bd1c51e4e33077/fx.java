package com.moon;


public class fx extends com.moon.e2<com.moon.module.impl.NoSlowDown> {

private com.moon.module.impl.KillAura e;

private static final long f;

public fx() {
super(com.moon.module.impl.NoSlowDown.class);
}


static {
f = (moom._c.a(1020254944406903696L, 589766124052199197L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(206844257284902L);
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


private void d() {
com.moon.fx forwardValue200_12_0;
    com.moon.fx spill200_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_18: {
    forward_join_12: {
    life1_3 = (com.moon.fx.f ^ 40894304343116L);
    life3_5 = moom.fn.b__Arrayr3();
    spill200_0 = this;
    if (!((life3_5 == null))) {
        forwardValue200_12_0 = spill200_0;
        break forward_join_12;
    }
    if (!((((com.moon.fx)(spill200_0)).e == null))) {
        break forward_join_18;
    }
    forwardValue200_12_0 = this;
    }
    ((com.moon.fx)(forwardValue200_12_0)).e = ((com.moon.module.impl.KillAura)(((com.moon.module.impl.KillAura)(((com.moon.fU)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__fU())).a(((java.lang.Class)(com.moon.module.impl.KillAura.class)))))));
    }
    return;
}


public void a(com.moon.event.MoveEvent p0) {
int forwardValue199_24_0;
    net.minecraft.entity.EntityLivingBase forwardValue199_26_0;
    com.moon.event.MovePhase forwardValue199_52_0;
    com.moon.event.MovePhase forwardValue199_52_1;
    net.minecraft.entity.Entity[] spill199_0;
    boolean spill199_1;
    net.minecraft.client.entity.EntityPlayerSP spill199_2;
    com.moon.event.MovePhase spill199_3;
    com.moon.event.MovePhase spill199_4;
    long life2_3;
    net.minecraft.entity.Entity[] life4_7;
    net.minecraft.entity.EntityLivingBase life5_12;
    forward_join_63: {
    forward_join_52: {
    forward_join_49: {
    forward_join_31: {
    forward_join_26: {
    forward_join_24: {
    life2_3 = (com.moon.fx.f ^ 52214811092359L);
    spill199_0 = moom.fn.b__Arrayr3();
    ((com.moon.fx)(this)).d();
    life4_7 = spill199_0;
    life5_12 = ((com.moon.gd)(((com.moon.module.impl.KillAura)(this.e)).a__gd())).a__sG();
    spill199_1 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fx.a)).K)).ae();
    if (!((life4_7 == null))) {
        forwardValue199_24_0 = ((spill199_1) ? 1 : 0);
        break forward_join_24;
    }
    if (!(spill199_1)) {
        break forward_join_63;
    }
    spill199_2 = ((net.minecraft.client.Minecraft)(com.moon.fx.a)).K;
    if (!((life4_7 == null))) {
        forwardValue199_26_0 = spill199_2;
        break forward_join_26;
    }
    forwardValue199_24_0 = ((((net.minecraft.client.entity.EntityPlayerSP)(spill199_2)).M()) ? 1 : 0);
    }
    if (!((forwardValue199_24_0 != 0))) {
        break forward_join_63;
    }
    forwardValue199_26_0 = life5_12;
    }
    if (!((forwardValue199_26_0 != null))) {
        break forward_join_31;
    }
    if (!((!((com.moon.module.impl.KillAura)(this.e)).isEnabled()))) {
        break forward_join_63;
    }
    }
    spill199_3 = ((com.moon.event.MoveEvent)(p0)).getPhase();
    spill199_4 = com.moon.event.MovePhase.PRE;
    if (!((life4_7 == null))) {
        forwardValue199_52_0 = spill199_3;
        forwardValue199_52_1 = spill199_4;
        break forward_join_52;
    }
    if (!((spill199_3 == spill199_4))) {
        break forward_join_49;
    }
    ((net.minecraft.client.network.NetHandlerPlayClient)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fx.a)).K)).cm)).a(((moom.yK)(new moom.za(net.minecraft.network.play.client.C07PacketPlayerDigging$Action.RELEASE_USE_ITEM, moom.zb.a, moom.bs.DOWN))));
    if (!((life4_7 != null))) {
        break forward_join_63;
    }
    }
    forwardValue199_52_0 = ((com.moon.event.MoveEvent)(p0)).getPhase();
    forwardValue199_52_1 = com.moon.event.MovePhase.POST;
    }
    if (!((forwardValue199_52_0 == forwardValue199_52_1))) {
        break forward_join_63;
    }
    ((net.minecraft.client.network.NetHandlerPlayClient)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fx.a)).K)).cm)).a(((moom.yK)(new moom.zb(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fx.a)).K)).c__xW()))));
    }
    return;
}

}
