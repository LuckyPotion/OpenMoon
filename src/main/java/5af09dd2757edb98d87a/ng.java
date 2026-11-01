package moom;


public class ng extends moom.mU<net.minecraft.entity.passive.EntitySheep> {

private static final moom.DD C;

public ng(net.minecraft.client.renderer.entity.RenderManager p0, moom.iQ p1, float p2) {
super(p0, p1, p2);
    (this).a(new moom.nW(this));
}


static {
moom.ng.C = new moom.DD("textures/entity/sheep/sheep.png");
}


protected moom.DD a(net.minecraft.entity.passive.EntitySheep p0) {
return moom.ng.C;
}


protected moom.DD a__sourceBridge_fb93f4301e(net.minecraft.entity.Entity p0) {
return ((moom.ng)(this)).a(((net.minecraft.entity.passive.EntitySheep)(((net.minecraft.entity.passive.EntitySheep)(p0)))));
}

}
