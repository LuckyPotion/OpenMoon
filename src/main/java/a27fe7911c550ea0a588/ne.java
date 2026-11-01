package moom;


public class ne extends moom.mU<net.minecraft.entity.passive.EntityPig> {

private static final moom.DD C;

public ne(net.minecraft.client.renderer.entity.RenderManager p0, moom.iQ p1, float p2) {
super(p0, p1, p2);
    (this).a(new net.minecraft.client.renderer.entity.layers.LayerSaddle(this));
}


static {
moom.ne.C = new moom.DD("textures/entity/pig/pig.png");
}


protected moom.DD a(net.minecraft.entity.passive.EntityPig p0) {
return moom.ne.C;
}


protected moom.DD a__sourceBridge_fb93f4301e(net.minecraft.entity.Entity p0) {
return ((moom.ne)(this)).a(((net.minecraft.entity.passive.EntityPig)(((net.minecraft.entity.passive.EntityPig)(p0)))));
}

}
