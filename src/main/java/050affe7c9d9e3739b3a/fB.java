package com.moon;


public class fB extends com.moon.e2<com.moon.module.impl.NoSlowDown> {

private com.moon.module.impl.KillAura e;

private int f;

private static final long g;

public fB() {
super(com.moon.module.impl.NoSlowDown.class);
}


static {
g = (moom._c.a(-3205585455162342195L, -706677113745802748L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(117278305846238L);
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


private void d() {
com.moon.fB forwardValue100_12_0;
    com.moon.fB spill100_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_18: {
    forward_join_12: {
    life1_3 = (com.moon.fB.g ^ 69602122283501L);
    life3_5 = moom.fn.b__Arrayr3();
    spill100_0 = this;
    if (!((life3_5 == null))) {
        forwardValue100_12_0 = spill100_0;
        break forward_join_12;
    }
    if (!((((com.moon.fB)(spill100_0)).e == null))) {
        break forward_join_18;
    }
    forwardValue100_12_0 = this;
    }
    ((com.moon.fB)(forwardValue100_12_0)).e = ((com.moon.module.impl.KillAura)(((com.moon.module.impl.KillAura)(((com.moon.fU)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__fU())).a(((java.lang.Class)(com.moon.module.impl.KillAura.class)))))));
    }
    return;
}


public void a(com.moon.event.MoveEvent p0) {
int forestValue24_24_0;
    net.minecraft.entity.EntityLivingBase forestValue24_26_0;
    net.minecraft.client.entity.EntityPlayerSP forestValue24_58_0;
    int forestValue24_71_0;
    int forestValue24_89_0;
    com.moon.fB forestValue24_115_0;
    net.minecraft.entity.Entity[] spill24_0;
    boolean spill24_1;
    net.minecraft.client.entity.EntityPlayerSP spill24_2;
    com.moon.fB spill24_3;
    net.minecraft.client.entity.EntityPlayerSP spill24_4;
    int spill24_5;
    long life2_3;
    net.minecraft.entity.EntityLivingBase life5_11;
    net.minecraft.entity.Entity[] life4_12;
    int life6_42;
    net.minecraft.item.Item life7_68;
    int life8_70;
    int life8_90;
    forest_join_122: {
    forest_join_117: {
    forest_join_115: {
    forest_join_114: {
    forest_join_106: {
    forest_join_90: {
    forest_join_89: {
    forest_join_83: {
    forest_join_71: {
    forest_join_69: {
    forest_join_58: {
    forest_join_56: {
    forest_join_33: {
    forest_join_26: {
    forest_join_24: {
    life2_3 = (com.moon.fB.g ^ 64122814325642L);
    ((com.moon.fB)(this)).d();
    spill24_0 = moom.fn.b__Arrayr3();
    life5_11 = ((com.moon.gd)(((com.moon.module.impl.KillAura)(this.e)).a__gd())).a__sG();
    life4_12 = spill24_0;
    spill24_1 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fB.a)).K)).ae();
    if (!((life4_12 == null))) {
        forestValue24_24_0 = ((spill24_1) ? 1 : 0);
        break forest_join_24;
    }
    if (!(spill24_1)) {
        break forest_join_114;
    }
    spill24_2 = ((net.minecraft.client.Minecraft)(com.moon.fB.a)).K;
    if (!((life4_12 == null))) {
        forestValue24_26_0 = spill24_2;
        break forest_join_26;
    }
    forestValue24_24_0 = ((((net.minecraft.client.entity.EntityPlayerSP)(spill24_2)).M()) ? 1 : 0);
    }
    if (!((forestValue24_24_0 != 0))) {
        break forest_join_114;
    }
    forestValue24_26_0 = life5_11;
    }
    if (!((forestValue24_26_0 != null))) {
        break forest_join_33;
    }
    spill24_3 = this;
    if (!((life4_12 == null))) {
        forestValue24_115_0 = spill24_3;
        break forest_join_115;
    }
    if (!((!((com.moon.module.impl.KillAura)(((com.moon.fB)(spill24_3)).e)).isEnabled()))) {
        break forest_join_114;
    }
    }
    life6_42 = ((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fB.a)).K)).bD)).c;
    spill24_4 = ((net.minecraft.client.Minecraft)(com.moon.fB.a)).K;
    if (!((life4_12 == null))) {
        forestValue24_58_0 = spill24_4;
        break forest_join_58;
    }
    if (!(((net.minecraft.client.entity.EntityPlayerSP)(spill24_4)).N__Boolean())) {
        break forest_join_56;
    }
    if (!(((com.moon.setting.MultiSelectSetting)(((com.moon.module.impl.NoSlowDown)(((com.moon.module.impl.NoSlowDown)(((com.moon.fB)(this)).a())))).s)).isSelected(((java.lang.Enum)(com.moon.NoSlowDownOption.SWORDS))))) {
        break forest_join_56;
    }
    if (!((((com.moon.event.MoveEvent)(p0)).getPhase() == com.moon.event.MovePhase.POST))) {
        break forest_join_106;
    }
    break forest_join_106;
    }
    forestValue24_58_0 = ((net.minecraft.client.Minecraft)(com.moon.fB.a)).K;
    }
    life7_68 = ((net.minecraft.item.ItemStack)(((net.minecraft.client.entity.EntityPlayerSP)(forestValue24_58_0)).a__xW())).a__wQ();
    life8_70 = 0;
    spill24_5 = ((life7_68 instanceof moom.xP) ? 1 : 0);
    if (!((life4_12 == null))) {
        forestValue24_71_0 = spill24_5;
        break forest_join_71;
    }
    if (!((spill24_5 != 0))) {
        break forest_join_69;
    }
    return;
    }
    forestValue24_71_0 = ((life7_68 instanceof net.minecraft.item.ItemBow) ? 1 : 0);
    }
    if (!((life4_12 == null))) {
        forestValue24_89_0 = forestValue24_71_0;
        break forest_join_89;
    }
    if (!((forestValue24_71_0 != 0))) {
        break forest_join_83;
    }
    life8_90 = ((((com.moon.setting.MultiSelectSetting)(((com.moon.module.impl.NoSlowDown)(((com.moon.module.impl.NoSlowDown)(((com.moon.fB)(this)).a())))).s)).isSelected(((java.lang.Enum)(com.moon.NoSlowDownOption.BOW)))) ? 1 : 0);
    if (!((life4_12 != null))) {
        break forest_join_90;
    }
    }
    forestValue24_89_0 = ((((com.moon.setting.MultiSelectSetting)(((com.moon.module.impl.NoSlowDown)(((com.moon.module.impl.NoSlowDown)(((com.moon.fB)(this)).a())))).s)).isSelected(((java.lang.Enum)(com.moon.NoSlowDownOption.CONSUMABLE)))) ? 1 : 0);
    }
    life8_90 = forestValue24_89_0;
    }
    if (!((((com.moon.event.MoveEvent)(p0)).getPhase() == com.moon.event.MovePhase.POST))) {
        break forest_join_106;
    }
    if (!((life8_90 != 0))) {
        break forest_join_106;
    }
    ((net.minecraft.client.network.NetHandlerPlayClient)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fB.a)).K)).cm)).a(((moom.yK)(new moom.zb(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fB.a)).K)).c__xW()))));
    }
    com.moon.fB __stackOp24_57_0 = this;
    ((com.moon.fB)(__stackOp24_57_0)).f = ((int)((((com.moon.fB)(__stackOp24_57_0)).f + 1)));
    if (!((life4_12 != null))) {
        break forest_join_117;
    }
    }
    forestValue24_115_0 = this;
    }
    ((com.moon.fB)(forestValue24_115_0)).f = ((int)(0));
    }
    if (!((net.minecraft.entity.Entity.b__ArrayString() != null))) {
        break forest_join_122;
    }
    moom.fn.b(((net.minecraft.entity.Entity[])(new net.minecraft.entity.Entity[5])));
    }
    return;
}

}
