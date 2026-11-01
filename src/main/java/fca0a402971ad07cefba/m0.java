package moom;


public class m0 extends moom.mU<net.minecraft.entity.monster.EntityBlaze> {

private static final moom.DD C;

public m0(net.minecraft.client.renderer.entity.RenderManager p0) {
super(p0, new moom.i1(), 0x1.0000000000000p-1f);
}


static {
moom.m0.C = new moom.DD("textures/entity/blaze.png");
}


protected moom.DD a(net.minecraft.entity.monster.EntityBlaze p0) {
return moom.m0.C;
}


protected moom.DD a__sourceBridge_fb93f4301e(net.minecraft.entity.Entity p0) {
return ((moom.m0)(this)).a(((net.minecraft.entity.monster.EntityBlaze)(((net.minecraft.entity.monster.EntityBlaze)(p0)))));
}

}
