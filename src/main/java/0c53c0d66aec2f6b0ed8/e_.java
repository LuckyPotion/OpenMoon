package com.moon;


public class e_ extends com.moon.e2<com.moon.module.impl.WTap> {

private static final long e;

private static final java.lang.String f;

public e_() {
super(com.moon.module.impl.WTap.class);
}


static {
e = ((long)(((moom._a)(moom._c.a(((long)(8154290839986991085L)), ((long)(-2232332176487014116L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(200017702145156L)))));
    long local0_life6 = (com.moon.e_.e ^ 42871923587296L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill83_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill83_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill83_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill83_13 = new byte[8];
    (__sourceSpill83_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill83_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation83_15 = __sourceSpill83_13;
    ((javax.crypto.Cipher)(__sourceSpill83_10)).init(((int)(__sourceSpill83_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill83_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation83_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    byte[] __sourceSpill83_19 = ((java.lang.String)("\023Óí\r%\b%©")).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __sourceSpill83_20 = local2_life8;
    byte[] local4_life22 = ((javax.crypto.Cipher)(__sourceSpill83_20)).doFinal(((byte[])(__sourceSpill83_19)));
    f = ((java.lang.String)(((java.lang.String)(com.moon.e_.a(((byte[])(local4_life22))))).intern()));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public void b() {
super.b();
    return;
}


public void c() {
super.c();
    return;
}


private static java.lang.String a(byte[] p0) {
int life1_1;
    int life2_5;
    char[] life3_7;
    int life4_9;
    int life5_19;
    int life6_39;
    int life5_44;
    int life6_52;
    int life6_71;
    int life5_76;
    int life6_86;
    int life5_91;
    int life6_99;
    life1_1 = 0;
    life3_7 = new char[(life2_5 = (p0).length)];
    life4_9 = 0;
    loop_region_10: while ((life4_9 < life2_5)) {
        if (((life5_19 = (255 & (p0)[life4_9])) < 192)) {
        (life3_7)[(life1_1++)] = ((char) life5_19);
    } else {
        if ((life5_19 < 224)) {
        life6_39 = ((int)(((char) (((char) (life5_19 & 31)) << 6))));
        byte[] spill203_0 = p0;
        life4_9 += 1;
        life5_44 = (spill203_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill203_1 = p0;
        life4_9 += 1;
        life5_76 = (spill203_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill203_2 = p0;
        life4_9 += 1;
        life5_91 = (spill203_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


public void a(com.moon.event.PacketEvent p0) {
moom.yK forwardValue72_20_0;
    int forwardValue72_35_0;
    int forwardValue72_67_0;
    int forwardValue72_99_0;
    net.minecraft.client.network.NetHandlerPlayClient forwardValue72_103_0;
    int spill72_0;
    moom.yK spill72_1;
    boolean spill72_2;
    int spill72_3;
    net.minecraft.client.network.NetHandlerPlayClient spill72_4;
    long life2_3;
    int life4_10;
    moom.yK life6_13;
    moom.y6 life5_27;
    int life6_50;
    forward_join_119: {
    forward_join_114: {
    forward_join_110: {
    forward_join_103: {
    forward_join_99: {
    forward_join_90: {
    forward_join_67: {
    forward_join_50: {
    forward_join_35: {
    forward_join_20: {
    life2_3 = (com.moon.e_.e ^ 55069475637151L);
    spill72_0 = net.minecraft.item.Item.d();
    ((com.moon.module.impl.WTap)(((com.moon.module.impl.WTap)(((com.moon.e_)(this)).a())))).setSuffix(((java.lang.String)(com.moon.e_.f)));
    life4_10 = spill72_0;
    life6_13 = ((com.moon.event.PacketEvent)(p0)).getPacket();
    spill72_1 = life6_13;
    if (!((life4_10 != 0))) {
        forwardValue72_20_0 = spill72_1;
        break forward_join_20;
    }
    if (!((((spill72_1 instanceof moom.y6) ? 1 : 0) != 0))) {
        break forward_join_114;
    }
    forwardValue72_20_0 = life6_13;
    }
    life5_27 = ((moom.y6)(forwardValue72_20_0));
    if (!((((moom.y6)(life5_27)).a__bc() == net.minecraft.network.play.client.C02PacketUseEntity$Action.ATTACK))) {
        break forward_join_114;
    }
    spill72_2 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.e_.a)).K)).ae();
    if (!((life4_10 != 0))) {
        forwardValue72_35_0 = ((spill72_2) ? 1 : 0);
        break forward_join_35;
    }
    if (!(spill72_2)) {
        break forward_join_114;
    }
    forwardValue72_35_0 = ((((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.e_.a)).K)).u__Boolean()) ? 1 : 0);
    }
    life6_50 = forwardValue72_35_0;
    spill72_3 = life6_50;
    if (!((life4_10 != 0))) {
        forwardValue72_67_0 = spill72_3;
        break forward_join_67;
    }
    if (!((spill72_3 != 0))) {
        break forward_join_50;
    }
    ((net.minecraft.client.network.NetHandlerPlayClient)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.e_.a)).K)).cm)).b(((moom.yK)(new moom.ze(((net.minecraft.client.Minecraft)(com.moon.e_.a)).K, net.minecraft.network.play.client.C0BPacketEntityAction$Action.STOP_SPRINTING))));
    }
    ((net.minecraft.client.network.NetHandlerPlayClient)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.e_.a)).K)).cm)).b(((moom.yK)(new moom.ze(((net.minecraft.client.Minecraft)(com.moon.e_.a)).K, net.minecraft.network.play.client.C0BPacketEntityAction$Action.START_SPRINTING))));
    forwardValue72_67_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.WTap)(((com.moon.module.impl.WTap)(((com.moon.e_)(this)).a())))).a__kV())).getValue())))).booleanValue()) ? 1 : 0);
    }
    if (!((life4_10 != 0))) {
        forwardValue72_99_0 = forwardValue72_67_0;
        break forward_join_99;
    }
    if (!((forwardValue72_67_0 != 0))) {
        break forward_join_90;
    }
    ((net.minecraft.client.network.NetHandlerPlayClient)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.e_.a)).K)).cm)).b(((moom.yK)(new moom.ze(((net.minecraft.client.Minecraft)(com.moon.e_.a)).K, net.minecraft.network.play.client.C0BPacketEntityAction$Action.STOP_SPRINTING))));
    ((net.minecraft.client.network.NetHandlerPlayClient)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.e_.a)).K)).cm)).b(((moom.yK)(new moom.ze(((net.minecraft.client.Minecraft)(com.moon.e_.a)).K, net.minecraft.network.play.client.C0BPacketEntityAction$Action.START_SPRINTING))));
    }
    spill72_4 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.e_.a)).K)).cm;
    if (!((life4_10 != 0))) {
        forwardValue72_103_0 = spill72_4;
        break forward_join_103;
    }
    ((net.minecraft.client.network.NetHandlerPlayClient)(spill72_4)).b(((moom.yK)(((com.moon.event.PacketEvent)(p0)).getPacket())));
    forwardValue72_99_0 = life6_50;
    }
    if (!((forwardValue72_99_0 == 0))) {
        break forward_join_110;
    }
    forwardValue72_103_0 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.e_.a)).K)).cm;
    }
    ((net.minecraft.client.network.NetHandlerPlayClient)(forwardValue72_103_0)).b(((moom.yK)(new moom.ze(((net.minecraft.client.Minecraft)(com.moon.e_.a)).K, net.minecraft.network.play.client.C0BPacketEntityAction$Action.STOP_SPRINTING))));
    }
    ((com.moon.event.PacketEvent)(p0)).setCancelled(((boolean)(true)));
    }
    if (!((life4_10 == 0))) {
        break forward_join_119;
    }
    net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[1])));
    }
    return;
}

}
