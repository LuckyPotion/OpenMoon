package com.moon;


public class fc extends com.moon.e2<com.moon.module.impl.Disabler> {

private static final long e;

public fc() {
super(com.moon.module.impl.Disabler.class);
}


static {
e = (moom._c.a(1306619110630349530L, -1376774175872970884L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(42589694815588L);
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public void a(com.moon.event.PacketEvent p0) {
moom.yK forwardValue153_15_0;
    int spill153_0;
    moom.yK spill153_1;
    long life2_3;
    moom.yK life6_7;
    int life4_8;
    moom.y7 life5_22;
    double life6_32;
    moom.DT life8_43;
    forward_join_59: {
    forward_join_15: {
    life2_3 = (com.moon.fc.e ^ 34767443587511L);
    spill153_0 = __sourceExactCall_3aeb6b5647b550();
    life6_7 = ((com.moon.event.PacketEvent)(p0)).getPacket();
    life4_8 = spill153_0;
    spill153_1 = life6_7;
    if (!((life4_8 == 0))) {
        forwardValue153_15_0 = spill153_1;
        break forward_join_15;
    }
    if (!((((spill153_1 instanceof moom.y7) ? 1 : 0) != 0))) {
        break forward_join_59;
    }
    forwardValue153_15_0 = life6_7;
    }
    life5_22 = ((moom.y7)(forwardValue153_15_0));
    life6_32 = (((double) java.lang.Math.round(((double)((((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fc.a)).K)).o / 0x1.0p-6d))))) * 0x1.0p-6d);
    life8_43 = new moom.DT(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fc.a)).K)).n, 0x1.fep7d, ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fc.a)).K)).p);
    ((net.minecraft.client.network.NetHandlerPlayClient)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fc.a)).K)).cm)).b(((moom.yK)(new moom.zb(life8_43, 4, null, 0x0.0p0f, 0x1.0p0f, 0x0.0p0f))));
    ((moom.y7)(life5_22)).b(((double)(life6_32)));
    ((moom.y7)(life5_22)).a(((boolean)(true)));
    }
    return;
}


private static native int __sourceExactCall_3aeb6b5647b550();
}
