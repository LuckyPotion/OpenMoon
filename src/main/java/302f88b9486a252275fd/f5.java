package com.moon;


public class f5 extends com.moon.f0 {

private boolean c;

private int d;

private static final long e;

private static final long g;

public f5() {
super();
}


static {
e = ((long)(((moom._a)(moom._c.a(((long)(5807799454858236460L)), ((long)(-8882277114481238684L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(125235246666894L)))));
    long local0_life6 = (com.moon.f5.e ^ 125741913048012L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill88_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill88_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill88_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill88_13 = new byte[8];
    (__sourceSpill88_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill88_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation88_15 = __sourceSpill88_13;
    ((javax.crypto.Cipher)(__sourceSpill88_10)).init(((int)(__sourceSpill88_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill88_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation88_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = 2479443471038122325L;
    byte[] __sourceSpill88_19 = new byte[8];
    (__sourceSpill88_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill88_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill88_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill88_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill88_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill88_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill88_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill88_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill88_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill88_20)).doFinal(((byte[])(__sourceSpill88_19)));
    g = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public void b() {
int forwardValue88_15_0;
    boolean spill88_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    int life4_21;
    forward_join_37: {
    forward_join_15: {
    life1_3 = (com.moon.f5.e ^ 83732505376212L);
    life3_5 = moom.DT.a__Arrayr3();
    spill88_0 = this.c;
    if (!((life3_5 != null))) {
        forwardValue88_15_0 = ((spill88_0) ? 1 : 0);
        break forward_join_15;
    }
    if (!(spill88_0)) {
        break forward_join_37;
    }
    forwardValue88_15_0 = ((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.f5.a)).K)).bD)).c;
    }
    life4_21 = forwardValue88_15_0;
    ((net.minecraft.client.network.NetHandlerPlayClient)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.f5.a)).K)).cm)).a(((moom.yK)(new moom.zc(((life4_21 % ((int) com.moon.f5.g)) + 1)))));
    ((net.minecraft.client.network.NetHandlerPlayClient)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.f5.a)).K)).cm)).a(((moom.yK)(new moom.zc(life4_21))));
    }
    return;
}


public void c() {
this.c = ((boolean)(false));
    return;
}


public void d() {
int forwardValue89_13_0;
    boolean spill89_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_25: {
    forward_join_13: {
    life1_3 = (com.moon.f5.e ^ 133243827799819L);
    life3_5 = moom.DT.a__Arrayr3();
    spill89_0 = this.c;
    if (!((life3_5 != null))) {
        forwardValue89_13_0 = ((spill89_0) ? 1 : 0);
        break forward_join_13;
    }
    if (!((!spill89_0))) {
        break forward_join_25;
    }
    forwardValue89_13_0 = this.d;
    }
    if (!((forwardValue89_13_0 != ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.f5.a)).K)).S))) {
        break forward_join_25;
    }
    ((net.minecraft.client.network.NetHandlerPlayClient)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.f5.a)).K)).cm)).b(((moom.yK)(new moom.zb(null))));
    }
    return;
}


public void a(com.moon.event.MoveEvent p0) {
com.moon.f5 forwardValue87_41_0;
    com.moon.f5 forwardValue87_46_0;
    int forwardValue87_47_0;
    com.moon.f5 forwardValue87_58_0;
    int forwardValue87_61_0;
    com.moon.f5 forwardValue87_73_0;
    boolean spill87_0;
    com.moon.f5 spill87_1;
    com.moon.f5 spill87_2;
    com.moon.f5 spill87_3;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_75: {
    forward_join_73: {
    forward_join_61: {
    forward_join_58: {
    forward_join_57: {
    forward_join_47: {
    forward_join_46: {
    forward_join_45: {
    forward_join_41: {
    forward_join_40: {
    life2_3 = (com.moon.f5.e ^ 77207764043026L);
    life4_5 = moom.DT.a__Arrayr3();
    if (!((((com.moon.event.MoveEvent)(p0)).getPhase() == com.moon.event.MovePhase.PRE))) {
        break forward_join_75;
    }
    spill87_0 = ((com.moon.f5)(this)).a__Boolean();
    if (!((life4_5 != null))) {
        forwardValue87_47_0 = ((spill87_0) ? 1 : 0);
        break forward_join_47;
    }
    if (!(spill87_0)) {
        break forward_join_45;
    }
    spill87_1 = this;
    if (!((life4_5 != null))) {
        forwardValue87_46_0 = spill87_1;
        break forward_join_46;
    }
    if (!((((com.moon.gd)(((com.moon.module.impl.KillAura)(((com.moon.f5)(spill87_1)).b)).a__gd())).a__sG() != null))) {
        break forward_join_45;
    }
    spill87_2 = this;
    if (!((life4_5 != null))) {
        forwardValue87_41_0 = spill87_2;
        break forward_join_41;
    }
    if (!((!((com.moon.f5)(spill87_2)).c))) {
        break forward_join_40;
    }
    ((net.minecraft.client.network.NetHandlerPlayClient)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.f5.a)).K)).cm)).b(((moom.yK)(new moom.zb(null))));
    this.d = ((int)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.f5.a)).K)).S));
    }
    forwardValue87_41_0 = this;
    }
    ((com.moon.f5)(forwardValue87_41_0)).c = ((boolean)(true));
    if (!((life4_5 == null))) {
        break forward_join_75;
    }
    }
    forwardValue87_46_0 = this;
    }
    forwardValue87_47_0 = ((((com.moon.f5)(forwardValue87_46_0)).a__Boolean()) ? 1 : 0);
    }
    if (!((life4_5 != null))) {
        forwardValue87_61_0 = forwardValue87_47_0;
        break forward_join_61;
    }
    if (!((forwardValue87_47_0 != 0))) {
        break forward_join_57;
    }
    spill87_3 = this;
    if (!((life4_5 != null))) {
        forwardValue87_58_0 = spill87_3;
        break forward_join_58;
    }
    if (!((((com.moon.gd)(((com.moon.module.impl.KillAura)(((com.moon.f5)(spill87_3)).b)).a__gd())).a__sG() == null))) {
        break forward_join_75;
    }
    }
    forwardValue87_58_0 = this;
    }
    if (!((life4_5 != null))) {
        forwardValue87_73_0 = forwardValue87_58_0;
        break forward_join_73;
    }
    forwardValue87_61_0 = ((((com.moon.f5)(forwardValue87_58_0)).c) ? 1 : 0);
    }
    if (!((forwardValue87_61_0 != 0))) {
        break forward_join_75;
    }
    ((net.minecraft.client.network.NetHandlerPlayClient)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.f5.a)).K)).cm)).a(((moom.yK)(new moom.za(net.minecraft.network.play.client.C07PacketPlayerDigging$Action.RELEASE_USE_ITEM, moom.DT.f, moom.bs.DOWN))));
    forwardValue87_73_0 = this;
    }
    ((com.moon.f5)(forwardValue87_73_0)).c = ((boolean)(false));
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
