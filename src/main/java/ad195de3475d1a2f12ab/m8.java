package moom;


public class m8 extends moom.mU<moom.s5> {

private static final moom.DD C;

private final float D;

public m8(net.minecraft.client.renderer.entity.RenderManager p0, moom.iQ p1, float p2, float p3) {
super(p0, p1, (p2 * p3));
    this.D = p3;
    (this).a(new moom.nQ(this));
    (this).a(new moom.nB(this, this));
}


static {
moom.m8.C = new moom.DD("textures/entity/zombie/zombie.png");
}


protected moom.DD a(moom.s5 p0) {
return moom.m8.C;
}


protected moom.DD a__sourceBridge_fb93f4301e(net.minecraft.entity.Entity p0) {
return ((moom.m8)(this)).a(((moom.s5)(((moom.s5)(p0)))));
}


protected void a__Void__sourceBridge_7f50c316df(net.minecraft.entity.EntityLivingBase p0, float p1) {
((moom.m8)(this)).a(((moom.s5)(((moom.s5)(p0)))), ((float)(p1)));
}


public void a__Void() {
moom.kZ.b(((float)(0x0.0p0f)), ((float)(0x1.8p-3f)), ((float)(0x0.0p0f)));
    return;
}


protected void a__sourceReturn_ddff7bd474(moom.s5 p0, float p1) {
moom.kZ.a(((float)(this.D)), ((float)(this.D)), ((float)(this.D)));
    return;
}


public void a__Void(moom.s5 __bridgeParam0, float __bridgeParam1) { this.a__Void__sourceBridge_7f50c316df(((net.minecraft.entity.EntityLivingBase)(__bridgeParam0)), ((float)(__bridgeParam1))); }
}
