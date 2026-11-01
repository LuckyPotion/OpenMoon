package moom;


public class nj extends moom.mU<moom.sY> {

private static final moom.DD C;

public nj(net.minecraft.client.renderer.entity.RenderManager p0) {
super(p0, new moom.jt(), 0x1.0000000000000p-1f);
    (this).a(new net.minecraft.client.renderer.entity.layers.LayerSnowmanHead(this));
}


static {
moom.nj.C = new moom.DD("textures/entity/snowman.png");
}


public moom.iQ a__iQ() {
return ((moom.nj)(this)).a__jt();
}


protected moom.DD a__sourceBridge_fb93f4301e(net.minecraft.entity.Entity p0) {
return ((moom.nj)(this)).a(((moom.sY)(((moom.sY)(p0)))));
}


protected moom.DD a__sourceReturn_e19e5a64c4(moom.sY p0) {
return moom.nj.C;
}


public moom.jt a__jt() {
return ((moom.jt)(super.a__iQ()));
}


public moom.DD a(moom.sY __bridgeParam0) { return ((moom.DD)(this.a__sourceBridge_fb93f4301e(((net.minecraft.entity.Entity)(__bridgeParam0))))); }
}
