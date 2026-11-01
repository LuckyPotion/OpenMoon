package net.minecraft.client.gui;


public class MapItemRenderer {

private static final moom.DD a;

private final net.minecraft.client.renderer.texture.TextureManager b;

private final java.util.Map<java.lang.String, moom.iq> c;

public MapItemRenderer(net.minecraft.client.renderer.texture.TextureManager p0) {
super();
    this.c = com.google.common.collect.Maps.newHashMap();
    this.b = p0;
}


static {
net.minecraft.client.gui.MapItemRenderer.a = new moom.DD("textures/map/map_icons.png");
}


private moom.iq a(net.minecraft.world.storage.MapData p0) {
moom.iq local2 = ((moom.iq)(((java.util.Map)(this.c)).get(((java.lang.Object)(((net.minecraft.world.storage.MapData)(p0)).a)))));
    if ((local2 == null)) {
        local2 = new moom.iq(this, p0);
        ((java.util.Map)(this.c)).put(((java.lang.Object)(((net.minecraft.world.storage.MapData)(p0)).a)), ((java.lang.Object)(local2)));
    }
    return local2;
}


public void a() {
java.util.Iterator life1_4;
    moom.iq life2_11;
    life1_4 = ((java.util.Collection)(((java.util.Map)(this.c)).values())).iterator();
    while (((java.util.Iterator)(life1_4)).hasNext()) {
        life2_11 = ((moom.iq)(((java.util.Iterator)(life1_4)).next()));
        ((net.minecraft.client.renderer.texture.TextureManager)(this.b)).b(((moom.DD)(((moom.iq)(life2_11)).c)));
    }
    ((java.util.Map)(this.c)).clear();
    return;
}


public void a__Void(net.minecraft.world.storage.MapData p0) {
__sourceExactCall_ce21748f20ea29(((moom.iq)(__sourceExactCall_d2c7fc73c3e5bc(((net.minecraft.client.gui.MapItemRenderer)(this)), ((net.minecraft.world.storage.MapData)(p0))))));
    return;
}


public void a(net.minecraft.world.storage.MapData p0, boolean p1) {
__sourceExactCall_844480bd740779(((moom.iq)(__sourceExactCall_d2c7fc73c3e5bc(((net.minecraft.client.gui.MapItemRenderer)(this)), ((net.minecraft.world.storage.MapData)(p0))))), ((boolean)(p1)));
    return;
}


private static native void __sourceExactCall_ce21748f20ea29(moom.iq p0);
private static native moom.iq __sourceExactCall_d2c7fc73c3e5bc(net.minecraft.client.gui.MapItemRenderer p0, net.minecraft.world.storage.MapData p1);
private static native void __sourceExactCall_844480bd740779(moom.iq p0, boolean p1);
}
