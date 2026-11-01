package com.moon;


public class fQ extends com.moon.e2<com.moon.module.impl.NoFall> {

private static final long e;

public fQ() {
super(com.moon.module.impl.NoFall.class);
}


static {
com.moon.fQ.e = (moom._c.a(-8050507800624374056L, -1963039245807494644L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(137411160836022L);
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public void a(com.moon.event.MoveEvent p0) {
long life2_3;
    double life4_25;
    moom.DT life6_38;
    net.minecraft.item.ItemStack life7_44;
    life2_3 = (com.moon.fQ.e ^ 96738031739540L);
    if ((((com.moon.event.MoveEvent)(p0)).getPhase() == com.moon.event.MovePhase.PRE)) {
        if ((((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fQ.a)).K)).L >= 0x1.0p1f)) {
        life4_25 = (((double) java.lang.Math.round(((double)((((com.moon.event.MoveEvent)(p0)).getY() / 0x1.0p-2d))))) * 0x1.0p-2d);
        life6_38 = new moom.DT(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fQ.a)).K)).n, ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fQ.a)).K)).o, ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fQ.a)).K)).p);
        life7_44 = new net.minecraft.item.ItemStack(net.minecraft.item.Item.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b))));
        ((net.minecraft.client.network.NetHandlerPlayClient)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fQ.a)).K)).cm)).a(((moom.yK)(new moom.zb(life6_38, 1, life7_44, 0x1.0p-1f, 0x1.0p-1f, 0x1.0p-1f))));
        ((net.minecraft.client.network.NetHandlerPlayClient)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fQ.a)).K)).cm)).a(((moom.yK)(new moom.y8(((com.moon.event.MoveEvent)(p0)).getX(), life4_25, ((com.moon.event.MoveEvent)(p0)).getZ(), true))));
        ((com.moon.event.MoveEvent)(p0)).setCancelled(((boolean)(true)));
    }
    }
    return;
}

}
