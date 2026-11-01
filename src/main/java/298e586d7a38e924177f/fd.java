package com.moon;


public class fd extends com.moon.e2<com.moon.module.impl.Disabler> {

private static final long e;

public fd() {
super(com.moon.module.impl.Disabler.class);
}


static {
e = (moom._c.a(-878302522653103604L, -8521173265556656955L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(64054562089173L);
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public void a(com.moon.event.PacketEvent p0) {
net.minecraft.client.entity.EntityPlayerSP forwardValue154_28_0;
    moom.yK forwardValue154_93_0;
    moom.yK forwardValue154_100_0;
    net.minecraft.client.entity.EntityPlayerSP forwardValue154_109_0;
    net.minecraft.client.entity.EntityPlayerSP forwardValue154_116_0;
    moom.yK spill154_0;
    net.minecraft.client.entity.EntityPlayerSP spill154_1;
    moom.yK spill154_2;
    net.minecraft.client.entity.EntityPlayerSP spill154_3;
    long life2_3;
    int life4_5;
    double life6_47;
    moom.yK life6_108;
    moom.zB life5_122;
    forward_join_136: {
    forward_join_116: {
    forward_join_114: {
    forward_join_113: {
    forward_join_109: {
    forward_join_100: {
    forward_join_93: {
    forward_join_91: {
    forward_join_28: {
    life2_3 = (com.moon.fd.e ^ 115216813711374L);
    life4_5 = __sourceExactCall_3aeb6b5647b550();
    spill154_0 = ((com.moon.event.PacketEvent)(p0)).getPacket();
    if (!((life4_5 == 0))) {
        forwardValue154_93_0 = spill154_0;
        break forward_join_93;
    }
    if (!((((spill154_0 instanceof moom.y7) ? 1 : 0) != 0))) {
        break forward_join_91;
    }
    spill154_1 = ((net.minecraft.client.Minecraft)(com.moon.fd.a)).K;
    if (!((life4_5 == 0))) {
        forwardValue154_28_0 = spill154_1;
        break forward_join_28;
    }
    if (!(((((net.minecraft.client.entity.EntityPlayerSP)(spill154_1)).S % ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.IntegerSetting)(((com.moon.module.impl.Disabler)(((com.moon.module.impl.Disabler)(((com.moon.fd)(this)).a())))).a())).getValue())))).intValue()) == 0))) {
        break forward_join_136;
    }
    forwardValue154_28_0 = ((net.minecraft.client.Minecraft)(com.moon.fd.a)).K;
    }
    life6_47 = (((double) java.lang.Math.round(((double)((((net.minecraft.client.entity.EntityPlayerSP)(forwardValue154_28_0)).o / 0x1.0p-6d))))) * 0x1.0p-6d);
    ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fd.a)).K)).a__Void(((double)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fd.a)).K)).n)), ((double)(life6_47)), ((double)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fd.a)).K)).p)));
    ((com.moon.event.PacketEvent)(p0)).setCancelled(((boolean)(true)));
    ((net.minecraft.client.network.NetHandlerPlayClient)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fd.a)).K)).cm)).b(((moom.yK)(new moom.y8(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fd.a)).K)).n, ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fd.a)).K)).o, ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fd.a)).K)).p, true))));
    ((net.minecraft.client.network.NetHandlerPlayClient)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fd.a)).K)).cm)).b(((moom.yK)(new moom.y8(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fd.a)).K)).n, (((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fd.a)).K)).o - 0x1.7733333333333p3d), ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fd.a)).K)).p, false))));
    if (!((life4_5 != 0))) {
        break forward_join_136;
    }
    __sourceExactCall_6604345f74a40b(((java.lang.String[])(new java.lang.String[3])));
    }
    forwardValue154_93_0 = ((com.moon.event.PacketEvent)(p0)).getPacket();
    }
    life6_108 = forwardValue154_93_0;
    spill154_2 = life6_108;
    if (!((life4_5 == 0))) {
        forwardValue154_100_0 = spill154_2;
        break forward_join_100;
    }
    if (!((((spill154_2 instanceof moom.zB) ? 1 : 0) != 0))) {
        break forward_join_136;
    }
    forwardValue154_100_0 = life6_108;
    }
    life5_122 = ((moom.zB)(forwardValue154_100_0));
    spill154_3 = ((net.minecraft.client.Minecraft)(com.moon.fd.a)).K;
    if (!((life4_5 == 0))) {
        forwardValue154_109_0 = spill154_3;
        break forward_join_109;
    }
    if (!((spill154_3 != null))) {
        break forward_join_113;
    }
    forwardValue154_109_0 = ((net.minecraft.client.Minecraft)(com.moon.fd.a)).K;
    }
    if (!((life4_5 == 0))) {
        forwardValue154_116_0 = forwardValue154_109_0;
        break forward_join_116;
    }
    if (!((((net.minecraft.client.entity.EntityPlayerSP)(forwardValue154_109_0)).S <= 0))) {
        break forward_join_114;
    }
    }
    return;
    }
    forwardValue154_116_0 = ((net.minecraft.client.Minecraft)(com.moon.fd.a)).K;
    }
    ((net.minecraft.client.network.NetHandlerPlayClient)(((net.minecraft.client.entity.EntityPlayerSP)(forwardValue154_116_0)).cm)).b(((moom.yK)(new moom.y_(((moom.zB)(life5_122)).a(), ((moom.zB)(life5_122)).b(), ((moom.zB)(life5_122)).c(), ((moom.zB)(life5_122)).a__Float(), ((moom.zB)(life5_122)).b__Float(), true))));
    ((com.moon.event.PacketEvent)(p0)).setCancelled(((boolean)(true)));
    }
    return;
}


private static native int __sourceExactCall_3aeb6b5647b550();
private static native void __sourceExactCall_6604345f74a40b(java.lang.String[] p0);
}
