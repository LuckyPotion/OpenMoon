package net.minecraft.client.renderer.entity;


public class RenderWolf extends moom.mU<net.minecraft.entity.passive.EntityWolf> {

private static final moom.DD C;

private static final moom.DD D;

private static final moom.DD E;

public RenderWolf(net.minecraft.client.renderer.entity.RenderManager p0, moom.iQ p1, float p2) {
super(p0, p1, p2);
    (this).a(new net.minecraft.client.renderer.entity.layers.LayerWolfCollar(this));
}


static {
net.minecraft.client.renderer.entity.RenderWolf.C = new moom.DD("textures/entity/wolf/wolf.png");
    net.minecraft.client.renderer.entity.RenderWolf.D = new moom.DD("textures/entity/wolf/wolf_tame.png");
    net.minecraft.client.renderer.entity.RenderWolf.E = new moom.DD("textures/entity/wolf/wolf_angry.png");
}


protected float b__sourceBridge_ae86d2a76c(net.minecraft.entity.EntityLivingBase p0, float p1) {
return ((net.minecraft.client.renderer.entity.RenderWolf)(this)).a__sourceReturn_d0087e7937(((net.minecraft.entity.passive.EntityWolf)(((net.minecraft.entity.passive.EntityWolf)(p0)))), ((float)(p1)));
}


protected moom.DD a__sourceBridge_fb93f4301e(net.minecraft.entity.Entity p0) {
return ((net.minecraft.client.renderer.entity.RenderWolf)(this)).a__sourceReturn_26cabfd56f(((net.minecraft.entity.passive.EntityWolf)(((net.minecraft.entity.passive.EntityWolf)(p0)))));
}


public void a__sourceBridge_01f3c9ade5(net.minecraft.entity.Entity p0, double p1, double p2, double p3, float p4, float p5) {
((net.minecraft.client.renderer.entity.RenderWolf)(this)).a(((net.minecraft.entity.passive.EntityWolf)(((net.minecraft.entity.passive.EntityWolf)(p0)))), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((float)(p4)), ((float)(p5)));
}


protected float a__sourceReturn_d0087e7937(net.minecraft.entity.passive.EntityWolf p0, float p1) {
return ((net.minecraft.entity.passive.EntityWolf)(p0)).m__sourceReturn_bc607678b6();
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


protected moom.DD a__sourceReturn_26cabfd56f(net.minecraft.entity.passive.EntityWolf p0) {
return ((__sourceIntrinsic_booleanComparison(((net.minecraft.entity.passive.EntityWolf)(p0)).ae()) != 0) ? net.minecraft.client.renderer.entity.RenderWolf.D : ((__sourceIntrinsic_booleanComparison(((net.minecraft.entity.passive.EntityWolf)(p0)).ah()) != 0) ? net.minecraft.client.renderer.entity.RenderWolf.E : net.minecraft.client.renderer.entity.RenderWolf.C));
}


public void a__sourceBridge_36abde8bbd(net.minecraft.entity.EntityLiving p0, double p1, double p2, double p3, float p4, float p5) {
((net.minecraft.client.renderer.entity.RenderWolf)(this)).a(((net.minecraft.entity.passive.EntityWolf)(((net.minecraft.entity.passive.EntityWolf)(p0)))), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((float)(p4)), ((float)(p5)));
}


public void a(net.minecraft.entity.passive.EntityWolf p0, double p1, double p2, double p3, float p4, float p5) {
float life10_10;
    if (((net.minecraft.entity.passive.EntityWolf)(p0)).ag()) {
        life10_10 = (__sourceExactCall_656e880a8db4d6(((net.minecraft.entity.passive.EntityWolf)(p0)), ((float)(p5))) * ((net.minecraft.entity.passive.EntityWolf)(p0)).c__sourceReturn_f6c4892e39(((float)(p5))));
        moom.kZ.c(((float)(life10_10)), ((float)(life10_10)), ((float)(life10_10)));
    }
    __sourceExactCall_dc1b8554f2e929(this, ((net.minecraft.entity.EntityLiving)(p0)), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((float)(p4)), ((float)(p5)));
    return;
}


public void a__sourceBridge_e7b4e99e7e(net.minecraft.entity.EntityLivingBase p0, double p1, double p2, double p3, float p4, float p5) {
((net.minecraft.client.renderer.entity.RenderWolf)(this)).a(((net.minecraft.entity.passive.EntityWolf)(((net.minecraft.entity.passive.EntityWolf)(p0)))), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((float)(p4)), ((float)(p5)));
}


private static native int __sourceIntrinsic_booleanComparison(boolean value);

public float b(net.minecraft.entity.passive.EntityWolf __bridgeParam0, float __bridgeParam1) { return this.b__sourceBridge_ae86d2a76c(((net.minecraft.entity.EntityLivingBase)(__bridgeParam0)), ((float)(__bridgeParam1))); }

public moom.DD a(net.minecraft.entity.passive.EntityWolf __bridgeParam0) { return ((moom.DD)(this.a__sourceBridge_fb93f4301e(((net.minecraft.entity.Entity)(__bridgeParam0))))); }

private static native float __sourceExactCall_656e880a8db4d6(net.minecraft.entity.passive.EntityWolf p0, float p1);
private static native void __sourceExactCall_dc1b8554f2e929(moom.mU p0, net.minecraft.entity.EntityLiving p1, double p2, double p3, double p4, float p5, float p6);
}
