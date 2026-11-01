package com.moon;


public class fz extends com.moon.e2<com.moon.module.impl.NoSlowDown> {

private com.moon.module.impl.KillAura e;

private final java.util.List<moom.yK> f;

private boolean g;

private static final long h;

public fz() {
super(com.moon.module.impl.NoSlowDown.class);
    this.f = new java.util.concurrent.CopyOnWriteArrayList();
}


static {
h = (moom._c.a(-1364247188792401964L, -284590133343102515L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(159226785139151L);
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


private void d() {
com.moon.fz forwardValue205_12_0;
    com.moon.fz spill205_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_18: {
    forward_join_12: {
    life1_3 = (com.moon.fz.h ^ 110417546393814L);
    life3_5 = moom.fn.b__Arrayr3();
    spill205_0 = this;
    if (!((life3_5 == null))) {
        forwardValue205_12_0 = spill205_0;
        break forward_join_12;
    }
    if (!((((com.moon.fz)(spill205_0)).e == null))) {
        break forward_join_18;
    }
    forwardValue205_12_0 = this;
    }
    ((com.moon.fz)(forwardValue205_12_0)).e = ((com.moon.module.impl.KillAura)(((com.moon.module.impl.KillAura)(((com.moon.fU)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__fU())).a(((java.lang.Class)(com.moon.module.impl.KillAura.class)))))));
    }
    return;
}


public void a(com.moon.event.MoveEvent p0) {
int forwardValue203_17_0;
    int forwardValue203_23_0;
    net.minecraft.entity.Entity[] spill203_0;
    boolean spill203_1;
    long life2_3;
    net.minecraft.entity.Entity[] life4_7;
    forward_join_52: {
    forward_join_23: {
    forward_join_17: {
    life2_3 = (com.moon.fz.h ^ 10866806713927L);
    spill203_0 = moom.fn.b__Arrayr3();
    ((com.moon.fz)(this)).d();
    life4_7 = spill203_0;
    spill203_1 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fz.a)).K)).ae();
    if (!((life4_7 == null))) {
        forwardValue203_17_0 = ((spill203_1) ? 1 : 0);
        break forward_join_17;
    }
    if (!(spill203_1)) {
        break forward_join_52;
    }
    forwardValue203_17_0 = ((((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fz.a)).K)).M()) ? 1 : 0);
    }
    if (!((life4_7 == null))) {
        forwardValue203_23_0 = forwardValue203_17_0;
        break forward_join_23;
    }
    if (!((forwardValue203_17_0 != 0))) {
        break forward_join_52;
    }
    forwardValue203_23_0 = ((((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fz.a)).K)).N__Boolean()) ? 1 : 0);
    }
    if (!((forwardValue203_23_0 == 0))) {
        break forward_join_52;
    }
    if (!((((com.moon.event.MoveEvent)(p0)).getPhase() == com.moon.event.MovePhase.PRE))) {
        break forward_join_52;
    }
    ((net.minecraft.client.network.NetHandlerPlayClient)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fz.a)).K)).cm)).a(((moom.yK)(new moom.zc((((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fz.a)).K)).bD)).c + 1)))));
    ((net.minecraft.client.network.NetHandlerPlayClient)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fz.a)).K)).cm)).a(((moom.yK)(new moom.zc(((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fz.a)).K)).bD)).c))));
    }
    return;
}


public void a(com.moon.event.PacketEvent p0) {
int lexicalValue37_28_0;
    com.moon.fz lexicalValue37_104_0;
    int lexicalValue37_110_0;
    com.moon.fz lexicalValue37_173_0;
    int lexicalValue37_179_0;
    int lexicalValue37_187_0;
    net.minecraft.entity.Entity[] spill37_0;
    boolean spill37_1;
    com.moon.fz spill37_2;
    int spill37_3;
    com.moon.fz spill37_4;
    long life2_3;
    net.minecraft.entity.Entity[] life4_7;
    net.minecraft.entity.EntityLivingBase life5_12;
    int life6_89;
    moom.yK life7_100;
    int life6_189;
    moom.yK life7_200;
    lexical_join_192: {
    lexical_join_187: {
    lexical_join_179: {
    lexical_join_177: {
    lexical_join_175: {
    lexical_join_173: {
    lexical_join_172: {
    lexical_join_169: {
    lexical_join_110: {
    lexical_join_108: {
    lexical_join_104: {
    lexical_join_103: {
    lexical_join_93: {
    lexical_join_90: {
    lexical_join_28: {
    lexical_join_25: {
    life2_3 = (com.moon.fz.h ^ 122686194778321L);
    spill37_0 = moom.fn.b__Arrayr3();
    ((com.moon.fz)(this)).d();
    life4_7 = spill37_0;
    life5_12 = ((com.moon.gd)(((com.moon.module.impl.KillAura)(this.e)).a__gd())).a__sG();
    if (!((((((com.moon.event.PacketEvent)(p0)).getPacket() instanceof moom.y7) ? 1 : 0) != 0))) {
        break lexical_join_192;
    }
    if (!((life5_12 != null))) {
        break lexical_join_25;
    }
    spill37_1 = ((com.moon.module.impl.KillAura)(this.e)).isEnabled();
    if (!((life4_7 == null))) {
        lexicalValue37_28_0 = ((spill37_1) ? 1 : 0);
        break lexical_join_28;
    }
    if (!((!spill37_1))) {
        break lexical_join_192;
    }
    }
    lexicalValue37_28_0 = ((((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fz.a)).K)).N__Boolean()) ? 1 : 0);
    }
    if (!((life4_7 == null))) {
        lexicalValue37_110_0 = lexicalValue37_28_0;
        break lexical_join_110;
    }
    if (!((lexicalValue37_28_0 != 0))) {
        break lexical_join_108;
    }
    ((java.util.List)(this.f)).add(((java.lang.Object)(((com.moon.event.PacketEvent)(p0)).getPacket())));
    ((com.moon.event.PacketEvent)(p0)).setCancelled(((boolean)(true)));
    spill37_2 = this;
    if (!((life4_7 == null))) {
        lexicalValue37_104_0 = spill37_2;
        break lexical_join_104;
    }
    if (!((((java.util.List)(((com.moon.fz)(spill37_2)).f)).size() > 5))) {
        break lexical_join_103;
    }
    ((net.minecraft.client.network.NetHandlerPlayClient)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fz.a)).K)).cm)).b(((moom.yK)(((moom.yK)(((java.util.List)(this.f)).get(((int)(0))))))));
    ((net.minecraft.client.network.NetHandlerPlayClient)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fz.a)).K)).cm)).b(((moom.yK)(new moom.za(net.minecraft.network.play.client.C07PacketPlayerDigging$Action.RELEASE_USE_ITEM, moom.DT.f, moom.bs.DOWN))));
    life6_89 = 1;
    lexical_cycle_69: while (true) {
    if (!((life6_89 < ((java.util.List)(this.f)).size()))) {
        break lexical_join_90;
    }
    life7_100 = ((moom.yK)(((java.util.List)(this.f)).get(((int)(life6_89)))));
    ((net.minecraft.client.network.NetHandlerPlayClient)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fz.a)).K)).cm)).b(((moom.yK)(life7_100)));
    life6_89 += 1;
    if (!((life4_7 == null))) {
        break lexical_join_93;
    }
    if (!((life4_7 != null))) { continue lexical_cycle_69; }
    break lexical_cycle_69;
    }
    }
    ((java.util.List)(this.f)).clear();
    }
    ((net.minecraft.client.network.NetHandlerPlayClient)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fz.a)).K)).cm)).b(((moom.yK)(new moom.zb(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fz.a)).K)).a__xW()))));
    }
    lexicalValue37_104_0 = this;
    }
    ((com.moon.fz)(lexicalValue37_104_0)).g = ((boolean)(true));
    if (!((life4_7 != null))) {
        break lexical_join_192;
    }
    }
    lexicalValue37_110_0 = ((this.g) ? 1 : 0);
    }
    if (!((life4_7 == null))) {
        lexicalValue37_179_0 = lexicalValue37_110_0;
        break lexical_join_179;
    }
    if (!((lexicalValue37_110_0 != 0))) {
        break lexical_join_177;
    }
    spill37_3 = ((java.util.List)(this.f)).size();
    if (!((life4_7 == null))) {
        lexicalValue37_179_0 = spill37_3;
        break lexical_join_179;
    }
    if (!((spill37_3 > 3))) {
        break lexical_join_177;
    }
    ((net.minecraft.client.network.NetHandlerPlayClient)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fz.a)).K)).cm)).b(((moom.yK)(((moom.yK)(((java.util.List)(this.f)).get(((int)(0))))))));
    ((net.minecraft.client.network.NetHandlerPlayClient)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fz.a)).K)).cm)).a(((moom.yK)(new moom.za(net.minecraft.network.play.client.C07PacketPlayerDigging$Action.RELEASE_USE_ITEM, moom.DT.f, moom.bs.DOWN))));
    spill37_4 = this;
    if (!((life4_7 == null))) {
        lexicalValue37_173_0 = spill37_4;
        break lexical_join_173;
    }
    if (!((((java.util.List)(((com.moon.fz)(spill37_4)).f)).size() > 1))) {
        break lexical_join_172;
    }
    life6_189 = 1;
    lexical_cycle_148: while (true) {
    if (!((life6_189 < ((java.util.List)(this.f)).size()))) {
        break lexical_join_169;
    }
    life7_200 = ((moom.yK)(((java.util.List)(this.f)).get(((int)(life6_189)))));
    ((net.minecraft.client.network.NetHandlerPlayClient)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fz.a)).K)).cm)).b(((moom.yK)(life7_200)));
    life6_189 += 1;
    if (!((life4_7 == null))) {
        break lexical_join_175;
    }
    if (!((life4_7 != null))) { continue lexical_cycle_148; }
    break lexical_cycle_148;
    }
    }
    ((java.util.List)(this.f)).clear();
    }
    lexicalValue37_173_0 = this;
    }
    ((com.moon.fz)(lexicalValue37_173_0)).g = ((boolean)(false));
    }
    if (!((life4_7 != null))) {
        break lexical_join_192;
    }
    }
    lexicalValue37_179_0 = ((this.g) ? 1 : 0);
    }
    if (!((life4_7 == null))) {
        lexicalValue37_187_0 = lexicalValue37_179_0;
        break lexical_join_187;
    }
    if (!((lexicalValue37_179_0 != 0))) {
        break lexical_join_192;
    }
    lexicalValue37_187_0 = ((((java.util.List)(this.f)).add(((java.lang.Object)(((com.moon.event.PacketEvent)(p0)).getPacket())))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(lexicalValue37_187_0);
    ((com.moon.event.PacketEvent)(p0)).setCancelled(((boolean)(true)));
    }
    return;
}

}
