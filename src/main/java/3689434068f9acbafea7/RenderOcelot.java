package net.minecraft.client.renderer.entity;


public class RenderOcelot extends moom.mU<net.minecraft.entity.passive.EntityOcelot> {

private static final moom.DD C;

private static final moom.DD D;

private static final moom.DD E;

private static final moom.DD F;

public RenderOcelot(net.minecraft.client.renderer.entity.RenderManager p0, moom.iQ p1, float p2) {
super(p0, p1, p2);
}


static {
net.minecraft.client.renderer.entity.RenderOcelot.C = new moom.DD("textures/entity/cat/black.png");
    net.minecraft.client.renderer.entity.RenderOcelot.D = new moom.DD("textures/entity/cat/ocelot.png");
    net.minecraft.client.renderer.entity.RenderOcelot.E = new moom.DD("textures/entity/cat/red.png");
    net.minecraft.client.renderer.entity.RenderOcelot.F = new moom.DD("textures/entity/cat/siamese.png");
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


protected moom.DD a__sourceBridge_fb93f4301e(net.minecraft.entity.Entity p0) {
return ((net.minecraft.client.renderer.entity.RenderOcelot)(this)).a__sourceReturn_51863760f4(((net.minecraft.entity.passive.EntityOcelot)(((net.minecraft.entity.passive.EntityOcelot)(p0)))));
}


protected void a__Void__sourceBridge_7f50c316df(net.minecraft.entity.EntityLivingBase p0, float p1) {
((net.minecraft.client.renderer.entity.RenderOcelot)(this)).a__sourceReturn_5689423516(((net.minecraft.entity.passive.EntityOcelot)(((net.minecraft.entity.passive.EntityOcelot)(p0)))), ((float)(p1)));
}


protected void a__sourceReturn_5689423516(net.minecraft.entity.passive.EntityOcelot p0, float p1) {
__sourceExactCall_22d37e5af79856(this, ((net.minecraft.entity.EntityLivingBase)(p0)), ((float)(p1)));
    if ((__sourceIntrinsic_booleanComparison(__sourceExactCall_98d43e752926d2(((net.minecraft.entity.passive.EntityOcelot)(p0)))) != 0)) {
        moom.kZ.a(((float)(0x1.99999ap-1f)), ((float)(0x1.99999ap-1f)), ((float)(0x1.99999ap-1f)));
    }
    return;
}


protected moom.DD a__sourceReturn_51863760f4(net.minecraft.entity.passive.EntityOcelot p0) {
switch (((net.minecraft.entity.passive.EntityOcelot)(p0)).t()) {
case 0:
default:
{
        return net.minecraft.client.renderer.entity.RenderOcelot.D;
    }
case 1:
{
        return net.minecraft.client.renderer.entity.RenderOcelot.C;
    }
case 2:
{
        return net.minecraft.client.renderer.entity.RenderOcelot.E;
    }
case 3:
{
        return net.minecraft.client.renderer.entity.RenderOcelot.F;
    }
}
}


private static native int __sourceIntrinsic_booleanComparison(boolean value);

public void a__Void(net.minecraft.entity.passive.EntityOcelot __bridgeParam0, float __bridgeParam1) { this.a__Void__sourceBridge_7f50c316df(((net.minecraft.entity.EntityLivingBase)(__bridgeParam0)), ((float)(__bridgeParam1))); }

public moom.DD a(net.minecraft.entity.passive.EntityOcelot __bridgeParam0) { return ((moom.DD)(this.a__sourceBridge_fb93f4301e(((net.minecraft.entity.Entity)(__bridgeParam0))))); }

private static native void __sourceExactCall_22d37e5af79856(moom.mU p0, net.minecraft.entity.EntityLivingBase p1, float p2);
private static native boolean __sourceExactCall_98d43e752926d2(net.minecraft.entity.passive.EntityOcelot p0);
}
