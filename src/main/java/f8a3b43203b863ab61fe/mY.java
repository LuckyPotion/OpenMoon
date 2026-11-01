package moom;


public class mY extends moom.mW<net.minecraft.entity.monster.EntitySkeleton> {

private static final moom.DD F;

private static final moom.DD G;

public mY(net.minecraft.client.renderer.entity.RenderManager p0) {
super(p0, new moom.iZ(), 0x1.0000000000000p-1f);
    (this).a(new moom.nQ(this));
    (this).a(new moom.nD(this, this));
}


static {
moom.mY.F = new moom.DD("textures/entity/skeleton/skeleton.png");
    moom.mY.G = new moom.DD("textures/entity/skeleton/wither_skeleton.png");
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


protected moom.DD a__sourceBridge_fb93f4301e(net.minecraft.entity.Entity p0) {
return ((moom.mY)(this)).a(((net.minecraft.entity.monster.EntitySkeleton)(((net.minecraft.entity.monster.EntitySkeleton)(p0)))));
}


protected void a__Void__sourceBridge_7f50c316df(net.minecraft.entity.EntityLivingBase p0, float p1) {
((moom.mY)(this)).a__sourceReturn_255854e926(((net.minecraft.entity.monster.EntitySkeleton)(((net.minecraft.entity.monster.EntitySkeleton)(p0)))), ((float)(p1)));
}


protected void a__sourceReturn_255854e926(net.minecraft.entity.monster.EntitySkeleton p0, float p1) {
if ((((net.minecraft.entity.monster.EntitySkeleton)(p0)).s() == 1)) {
        moom.kZ.a(((float)(0x1.333334p0f)), ((float)(0x1.333334p0f)), ((float)(0x1.333334p0f)));
    }
    return;
}


public void a__Void() {
moom.kZ.b(((float)(0x1.8p-4f)), ((float)(0x1.8p-3f)), ((float)(0x0.0p0f)));
    return;
}


protected moom.DD a(net.minecraft.entity.monster.EntitySkeleton p0) {
return ((((net.minecraft.entity.monster.EntitySkeleton)(p0)).s() == 1) ? moom.mY.G : moom.mY.F);
}


protected moom.DD a__sourceReturn_d8840f73cc_f8a3b432(net.minecraft.entity.EntityLiving p0) {
return ((moom.mY)(this)).a(((net.minecraft.entity.monster.EntitySkeleton)(((net.minecraft.entity.monster.EntitySkeleton)(p0)))));
}


public void a__Void(net.minecraft.entity.monster.EntitySkeleton __bridgeParam0, float __bridgeParam1) { this.a__Void__sourceBridge_7f50c316df(((net.minecraft.entity.EntityLivingBase)(__bridgeParam0)), ((float)(__bridgeParam1))); }
}
