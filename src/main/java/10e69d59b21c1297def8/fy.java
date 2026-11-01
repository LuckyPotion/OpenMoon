package com.moon;


public class fy extends com.moon.e2<com.moon.module.impl.NoSlowDown> {

private com.moon.module.impl.KillAura e;

private static final long f;

private static final long g;

public fy() {
super(com.moon.module.impl.NoSlowDown.class);
}


static {
f = ((long)(((moom._a)(moom._c.a(((long)(2977136454946945304L)), ((long)(1095030040676866600L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(81337071767861L)))));
    long local0_life6 = (com.moon.fy.f ^ 70487974905828L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill103_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill103_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill103_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill103_13 = new byte[8];
    (__sourceSpill103_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill103_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation103_15 = __sourceSpill103_13;
    ((javax.crypto.Cipher)(__sourceSpill103_10)).init(((int)(__sourceSpill103_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill103_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation103_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -828957637388334595L;
    byte[] __sourceSpill103_19 = new byte[8];
    (__sourceSpill103_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill103_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill103_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill103_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill103_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill103_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill103_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill103_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill103_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill103_20)).doFinal(((byte[])(__sourceSpill103_19)));
    g = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


private void d() {
com.moon.fy forwardValue202_12_0;
    com.moon.fy spill202_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_18: {
    forward_join_12: {
    life1_3 = (com.moon.fy.f ^ 17555694944611L);
    life3_5 = moom.fn.b__Arrayr3();
    spill202_0 = this;
    if (!((life3_5 == null))) {
        forwardValue202_12_0 = spill202_0;
        break forward_join_12;
    }
    if (!((((com.moon.fy)(spill202_0)).e == null))) {
        break forward_join_18;
    }
    forwardValue202_12_0 = this;
    }
    ((com.moon.fy)(forwardValue202_12_0)).e = ((com.moon.module.impl.KillAura)(((com.moon.module.impl.KillAura)(((com.moon.fU)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__fU())).a(((java.lang.Class)(com.moon.module.impl.KillAura.class)))))));
    }
    return;
}


public void a(com.moon.event.MoveEvent p0) {
int forwardValue201_22_0;
    int forwardValue201_24_0;
    int forwardValue201_38_0;
    int forwardValue201_40_0;
    int forwardValue201_48_0;
    int forwardValue201_52_0;
    net.minecraft.client.network.NetHandlerPlayClient forwardValue201_96_0;
    net.minecraft.entity.Entity[] spill201_0;
    boolean spill201_1;
    boolean spill201_2;
    boolean spill201_3;
    boolean spill201_4;
    net.minecraft.client.network.NetHandlerPlayClient spill201_5;
    long life2_3;
    net.minecraft.entity.Entity[] life4_7;
    net.minecraft.entity.EntityLivingBase life5_12;
    int life6_30;
    int life7_55;
    int life8_85;
    forward_join_108: {
    forward_join_103: {
    forward_join_96: {
    forward_join_52: {
    forward_join_48: {
    forward_join_40: {
    forward_join_39: {
    forward_join_38: {
    forward_join_37: {
    forward_join_24: {
    forward_join_23: {
    forward_join_22: {
    forward_join_21: {
    life2_3 = (com.moon.fy.f ^ 11655046656385L);
    spill201_0 = moom.fn.b__Arrayr3();
    ((com.moon.fy)(this)).d();
    life4_7 = spill201_0;
    life5_12 = ((com.moon.gd)(((com.moon.module.impl.KillAura)(this.e)).a__gd())).a__sG();
    if (!((life5_12 != null))) {
        break forward_join_21;
    }
    spill201_1 = ((com.moon.module.impl.KillAura)(this.e)).isEnabled();
    if (!((life4_7 == null))) {
        forwardValue201_22_0 = ((spill201_1) ? 1 : 0);
        break forward_join_22;
    }
    if (!((!spill201_1))) {
        break forward_join_23;
    }
    }
    forwardValue201_22_0 = 1;
    }
    forwardValue201_24_0 = forwardValue201_22_0;
    break forward_join_24;
    }
    forwardValue201_24_0 = 0;
    }
    life6_30 = forwardValue201_24_0;
    spill201_2 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fy.a)).K)).M();
    if (!((life4_7 == null))) {
        forwardValue201_38_0 = ((spill201_2) ? 1 : 0);
        break forward_join_38;
    }
    if (!((!spill201_2))) {
        break forward_join_37;
    }
    spill201_3 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fy.a)).K)).N__Boolean();
    if (!((life4_7 == null))) {
        forwardValue201_38_0 = ((spill201_3) ? 1 : 0);
        break forward_join_38;
    }
    if (!(spill201_3)) {
        break forward_join_39;
    }
    }
    forwardValue201_38_0 = 1;
    }
    forwardValue201_40_0 = forwardValue201_38_0;
    break forward_join_40;
    }
    forwardValue201_40_0 = 0;
    }
    life7_55 = forwardValue201_40_0;
    spill201_4 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fy.a)).K)).ae();
    if (!((life4_7 == null))) {
        forwardValue201_48_0 = ((spill201_4) ? 1 : 0);
        break forward_join_48;
    }
    if (!(spill201_4)) {
        break forward_join_103;
    }
    forwardValue201_48_0 = life7_55;
    }
    if (!((life4_7 == null))) {
        forwardValue201_52_0 = forwardValue201_48_0;
        break forward_join_52;
    }
    if (!((forwardValue201_48_0 != 0))) {
        break forward_join_103;
    }
    forwardValue201_52_0 = life6_30;
    }
    if (!((forwardValue201_52_0 != 0))) {
        break forward_join_103;
    }
    if (!((((com.moon.event.MoveEvent)(p0)).getPhase() == com.moon.event.MovePhase.PRE))) {
        break forward_join_103;
    }
    life8_85 = ((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fy.a)).K)).bD)).c;
    ((net.minecraft.client.network.NetHandlerPlayClient)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fy.a)).K)).cm)).a(((moom.yK)(new moom.zc(((life8_85 % ((int) com.moon.fy.g)) + 1)))));
    spill201_5 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fy.a)).K)).cm;
    if (!((life4_7 == null))) {
        forwardValue201_96_0 = spill201_5;
        break forward_join_96;
    }
    ((net.minecraft.client.network.NetHandlerPlayClient)(spill201_5)).a(((moom.yK)(new moom.zc(life8_85))));
    if (!(((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.NoSlowDown)(((com.moon.module.impl.NoSlowDown)(((com.moon.fy)(this)).a())))).u)).getValue())))).booleanValue())) {
        break forward_join_103;
    }
    forwardValue201_96_0 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fy.a)).K)).cm;
    }
    ((net.minecraft.client.network.NetHandlerPlayClient)(forwardValue201_96_0)).a(((moom.yK)(new moom.zb(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fy.a)).K)).c__xW()))));
    }
    if (!((life4_7 != null))) {
        break forward_join_108;
    }
    net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[2])));
    }
    return;
}

}
