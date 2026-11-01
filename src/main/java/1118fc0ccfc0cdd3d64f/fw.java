package com.moon;


public class fw extends com.moon.e2<com.moon.module.impl.NoSlowDown> {

private com.moon.module.impl.KillAura e;

private static final long f;

private static final long g;

public fw() {
super(com.moon.module.impl.NoSlowDown.class);
}


static {
f = ((long)(((moom._a)(moom._c.a(((long)(-7858766630695567535L)), ((long)(4912700982470575481L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(37608118776723L)))));
    long local0_life6 = (com.moon.fw.f ^ 83454193376780L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill102_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill102_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill102_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill102_13 = new byte[8];
    (__sourceSpill102_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill102_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation102_15 = __sourceSpill102_13;
    ((javax.crypto.Cipher)(__sourceSpill102_10)).init(((int)(__sourceSpill102_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill102_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation102_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -4499605645719854245L;
    byte[] __sourceSpill102_19 = new byte[8];
    (__sourceSpill102_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill102_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill102_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill102_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill102_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill102_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill102_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill102_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill102_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill102_20)).doFinal(((byte[])(__sourceSpill102_19)));
    g = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


private void d() {
com.moon.fw forwardValue198_12_0;
    com.moon.fw spill198_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_18: {
    forward_join_12: {
    life1_3 = (com.moon.fw.f ^ 53335655654222L);
    life3_5 = moom.fn.b__Arrayr3();
    spill198_0 = this;
    if (!((life3_5 == null))) {
        forwardValue198_12_0 = spill198_0;
        break forward_join_12;
    }
    if (!((((com.moon.fw)(spill198_0)).e == null))) {
        break forward_join_18;
    }
    forwardValue198_12_0 = this;
    }
    ((com.moon.fw)(forwardValue198_12_0)).e = ((com.moon.module.impl.KillAura)(((com.moon.module.impl.KillAura)(((com.moon.fU)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__fU())).a(((java.lang.Class)(com.moon.module.impl.KillAura.class)))))));
    }
    return;
}


public void a(com.moon.event.MoveEvent p0) {
net.minecraft.entity.EntityLivingBase forwardValue197_18_0;
    int forwardValue197_28_0;
    int forwardValue197_30_0;
    int forwardValue197_44_0;
    int forwardValue197_46_0;
    int forwardValue197_54_0;
    int forwardValue197_58_0;
    net.minecraft.item.ItemStack forwardValue197_72_0;
    int forwardValue197_90_0;
    int forwardValue197_108_0;
    int forwardValue197_117_0;
    net.minecraft.client.entity.EntityPlayerSP spill197_0;
    boolean spill197_1;
    boolean spill197_2;
    boolean spill197_3;
    boolean spill197_4;
    net.minecraft.item.ItemStack spill197_5;
    int spill197_6;
    int spill197_7;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    net.minecraft.entity.EntityLivingBase life5_21;
    int life6_39;
    int life7_64;
    net.minecraft.item.Item life8_109;
    int life9_143;
    int life10_170;
    forward_join_139: {
    forward_join_117: {
    forward_join_109: {
    forward_join_108: {
    forward_join_102: {
    forward_join_90: {
    forward_join_88: {
    forward_join_72: {
    forward_join_58: {
    forward_join_54: {
    forward_join_46: {
    forward_join_45: {
    forward_join_44: {
    forward_join_43: {
    forward_join_30: {
    forward_join_29: {
    forward_join_28: {
    forward_join_27: {
    forward_join_18: {
    forward_join_12: {
    life2_3 = (com.moon.fw.f ^ 8628856961454L);
    life4_5 = moom.fn.b__Arrayr3();
    spill197_0 = ((net.minecraft.client.Minecraft)(com.moon.fw.a)).K;
    if (!((life4_5 == null))) {
        forwardValue197_18_0 = spill197_0;
        break forward_join_18;
    }
    if (!((spill197_0 == null))) {
        break forward_join_12;
    }
    return;
    }
    ((com.moon.fw)(this)).d();
    forwardValue197_18_0 = ((com.moon.gd)(((com.moon.module.impl.KillAura)(this.e)).a__gd())).a__sG();
    }
    life5_21 = forwardValue197_18_0;
    if (!((life5_21 != null))) {
        break forward_join_27;
    }
    spill197_1 = ((com.moon.module.impl.KillAura)(this.e)).isEnabled();
    if (!((life4_5 == null))) {
        forwardValue197_28_0 = ((spill197_1) ? 1 : 0);
        break forward_join_28;
    }
    if (!((!spill197_1))) {
        break forward_join_29;
    }
    }
    forwardValue197_28_0 = 1;
    }
    forwardValue197_30_0 = forwardValue197_28_0;
    break forward_join_30;
    }
    forwardValue197_30_0 = 0;
    }
    life6_39 = forwardValue197_30_0;
    spill197_2 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fw.a)).K)).M();
    if (!((life4_5 == null))) {
        forwardValue197_44_0 = ((spill197_2) ? 1 : 0);
        break forward_join_44;
    }
    if (!((!spill197_2))) {
        break forward_join_43;
    }
    spill197_3 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fw.a)).K)).N__Boolean();
    if (!((life4_5 == null))) {
        forwardValue197_44_0 = ((spill197_3) ? 1 : 0);
        break forward_join_44;
    }
    if (!(spill197_3)) {
        break forward_join_45;
    }
    }
    forwardValue197_44_0 = 1;
    }
    forwardValue197_46_0 = forwardValue197_44_0;
    break forward_join_46;
    }
    forwardValue197_46_0 = 0;
    }
    life7_64 = forwardValue197_46_0;
    spill197_4 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fw.a)).K)).ae();
    if (!((life4_5 == null))) {
        forwardValue197_54_0 = ((spill197_4) ? 1 : 0);
        break forward_join_54;
    }
    if (!(spill197_4)) {
        break forward_join_139;
    }
    forwardValue197_54_0 = life7_64;
    }
    if (!((life4_5 == null))) {
        forwardValue197_58_0 = forwardValue197_54_0;
        break forward_join_58;
    }
    if (!((forwardValue197_54_0 != 0))) {
        break forward_join_139;
    }
    forwardValue197_58_0 = life6_39;
    }
    if (!((forwardValue197_58_0 != 0))) {
        break forward_join_139;
    }
    if (!((((com.moon.event.MoveEvent)(p0)).getPhase() == com.moon.event.MovePhase.BEFORE))) {
        break forward_join_139;
    }
    spill197_5 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fw.a)).K)).a__xW();
    if (!((life4_5 == null))) {
        forwardValue197_72_0 = spill197_5;
        break forward_join_72;
    }
    if (!((spill197_5 != null))) {
        break forward_join_139;
    }
    forwardValue197_72_0 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fw.a)).K)).a__xW();
    }
    life8_109 = ((net.minecraft.item.ItemStack)(forwardValue197_72_0)).a__wQ();
    spill197_6 = ((life8_109 instanceof moom.xP) ? 1 : 0);
    if (!((life4_5 == null))) {
        forwardValue197_90_0 = spill197_6;
        break forward_join_90;
    }
    if (!((spill197_6 != 0))) {
        break forward_join_88;
    }
    ((net.minecraft.client.network.NetHandlerPlayClient)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fw.a)).K)).cm)).a(((moom.yK)(new moom.zb(null))));
    return;
    }
    forwardValue197_90_0 = ((life8_109 instanceof net.minecraft.item.ItemBow) ? 1 : 0);
    }
    if (!((life4_5 == null))) {
        forwardValue197_108_0 = forwardValue197_90_0;
        break forward_join_108;
    }
    if (!((forwardValue197_90_0 != 0))) {
        break forward_join_102;
    }
    life9_143 = ((((com.moon.setting.MultiSelectSetting)(((com.moon.module.impl.NoSlowDown)(((com.moon.module.impl.NoSlowDown)(((com.moon.fw)(this)).a())))).s)).isSelected(((java.lang.Enum)(com.moon.NoSlowDownOption.BOW)))) ? 1 : 0);
    if (!((life4_5 != null))) {
        break forward_join_109;
    }
    }
    forwardValue197_108_0 = ((((com.moon.setting.MultiSelectSetting)(((com.moon.module.impl.NoSlowDown)(((com.moon.module.impl.NoSlowDown)(((com.moon.fw)(this)).a())))).s)).isSelected(((java.lang.Enum)(com.moon.NoSlowDownOption.CONSUMABLE)))) ? 1 : 0);
    }
    life9_143 = forwardValue197_108_0;
    }
    spill197_7 = life9_143;
    if (!((life4_5 == null))) {
        forwardValue197_117_0 = spill197_7;
        break forward_join_117;
    }
    if (!((spill197_7 != 0))) {
        break forward_join_139;
    }
    forwardValue197_117_0 = ((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fw.a)).K)).bD)).c;
    }
    life10_170 = forwardValue197_117_0;
    ((net.minecraft.client.network.NetHandlerPlayClient)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fw.a)).K)).cm)).a(((moom.yK)(new moom.zc(((life10_170 % ((int) com.moon.fw.g)) + 1)))));
    ((net.minecraft.client.network.NetHandlerPlayClient)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fw.a)).K)).cm)).a(((moom.yK)(new moom.zc(life10_170))));
    }
    return;
}

}
