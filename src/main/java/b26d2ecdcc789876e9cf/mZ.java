package moom;


public class mZ extends moom.mW<net.minecraft.entity.monster.EntityZombie> {

private static final moom.DD F;

private static final moom.DD G;

private final moom.iT H;

private final moom.i0 I;

private final java.util.List<net.minecraft.client.renderer.entity.layers.LayerRenderer<net.minecraft.entity.monster.EntityZombie>> J;

private final java.util.List<net.minecraft.client.renderer.entity.layers.LayerRenderer<net.minecraft.entity.monster.EntityZombie>> K;

public mZ(net.minecraft.client.renderer.entity.RenderManager p0) {
super(((net.minecraft.client.renderer.entity.RenderManager)(p0)), ((moom.iT)(new moom.iY())), ((float)(1056964608)), ((float)(0x1.0p0f)));
    net.minecraft.client.renderer.entity.layers.LayerRenderer local2_life5 = ((net.minecraft.client.renderer.entity.layers.LayerRenderer)(((java.util.List)(this.w)).get(((int)(0)))));
    this.H = ((moom.iT)(this.D));
    this.I = ((moom.i0)(new moom.i0()));
    ((moom.mZ)(this)).a(((net.minecraft.client.renderer.entity.layers.LayerRenderer)(new moom.nQ(((moom.mS) this)))));
    moom.nE local3_life10 = new moom.nE(this, ((moom.mS) this));
    ((moom.mZ)(this)).a(((net.minecraft.client.renderer.entity.layers.LayerRenderer)(local3_life10)));
    this.K = ((java.util.List)(com.google.common.collect.Lists.newArrayList(((java.lang.Iterable)(this.w)))));
    if ((((local2_life5 instanceof moom.nK) ? 1 : 0) != 0)) {
        ((moom.mZ)(this)).b(((net.minecraft.client.renderer.entity.layers.LayerRenderer)(local2_life5)));
        ((moom.mZ)(this)).a(((net.minecraft.client.renderer.entity.layers.LayerRenderer)(new moom.nK(((moom.i0)(this.I)).i))));
    }
    ((moom.mZ)(this)).b(((net.minecraft.client.renderer.entity.layers.LayerRenderer)(local3_life10)));
    ((moom.mZ)(this)).a(((net.minecraft.client.renderer.entity.layers.LayerRenderer)(new net.minecraft.client.renderer.entity.layers.LayerVillagerArmor(((moom.mS) this)))));
    this.J = ((java.util.List)(com.google.common.collect.Lists.newArrayList(((java.lang.Iterable)(this.w)))));
    return;
}


static {
moom.mZ.F = new moom.DD("textures/entity/zombie/zombie.png");
    moom.mZ.G = new moom.DD("textures/entity/zombie/zombie_villager.png");
}


protected void a__sourceBridge_e093c470d2(net.minecraft.entity.EntityLivingBase p0, float p1, float p2, float p3) {
((moom.mZ)(this)).a(((net.minecraft.entity.monster.EntityZombie)(((net.minecraft.entity.monster.EntityZombie)(p0)))), ((float)(p1)), ((float)(p2)), ((float)(p3)));
}


public void a__sourceBridge_e7b4e99e7e(net.minecraft.entity.EntityLivingBase p0, double p1, double p2, double p3, float p4, float p5) {
((moom.mZ)(this)).a(((net.minecraft.entity.monster.EntityZombie)(((net.minecraft.entity.monster.EntityZombie)(p0)))), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((float)(p4)), ((float)(p5)));
}


protected moom.DD a__sourceBridge_fb93f4301e(net.minecraft.entity.Entity p0) {
return ((moom.mZ)(this)).a(((net.minecraft.entity.monster.EntityZombie)(((net.minecraft.entity.monster.EntityZombie)(p0)))));
}


public void a__sourceBridge_01f3c9ade5(net.minecraft.entity.Entity p0, double p1, double p2, double p3, float p4, float p5) {
((moom.mZ)(this)).a(((net.minecraft.entity.monster.EntityZombie)(((net.minecraft.entity.monster.EntityZombie)(p0)))), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((float)(p4)), ((float)(p5)));
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(net.minecraft.entity.monster.EntityZombie p0, double p1, double p2, double p3, float p4, float p5) {
((moom.mZ)(this)).a__Void(((net.minecraft.entity.monster.EntityZombie)(p0)));
    __sourceExactCall_3c9f9104f7ca54(this, ((net.minecraft.entity.EntityLiving)(p0)), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((float)(p4)), ((float)(p5)));
    return;
}


protected moom.DD a(net.minecraft.entity.monster.EntityZombie p0) {
return ((__sourceIntrinsic_booleanComparison(((net.minecraft.entity.monster.EntityZombie)(p0)).ad()) != 0) ? moom.mZ.G : moom.mZ.F);
}


private void a__Void(net.minecraft.entity.monster.EntityZombie p0) {
if ((__sourceIntrinsic_booleanComparison(((net.minecraft.entity.monster.EntityZombie)(p0)).ad()) != 0)) {
        this.m = ((moom.iQ)(this.I));
        this.w = ((java.util.List)(this.J));
    } else {
        this.m = ((moom.iQ)(this.H));
        this.w = ((java.util.List)(this.K));
    }
    this.D = ((moom.iT)(((moom.iT)(this.m))));
    return;
}


protected void a(net.minecraft.entity.monster.EntityZombie p0, float p1, float p2, float p3) {
if ((__sourceIntrinsic_booleanComparison(((net.minecraft.entity.monster.EntityZombie)(p0)).ae()) != 0)) {
        p2 = (p2 + ((float) ((java.lang.Math.cos(((double)((((double) ((net.minecraft.entity.monster.EntityZombie)(p0)).S) * 0x1.ap1d)))) * 0x1.921fb54442d18p1d) * 0x1.0p-2d)));
    }
    __sourceExactCall_fba67a07efdb59(this, ((net.minecraft.entity.EntityLivingBase)(p0)), ((float)(p1)), ((float)(p2)), ((float)(p3)));
    return;
}


protected moom.DD a__sourceReturn_d8840f73cc_b26d2ecd(net.minecraft.entity.EntityLiving p0) {
return ((moom.mZ)(this)).a(((net.minecraft.entity.monster.EntityZombie)(((net.minecraft.entity.monster.EntityZombie)(p0)))));
}


public void a__sourceBridge_36abde8bbd(net.minecraft.entity.EntityLiving p0, double p1, double p2, double p3, float p4, float p5) {
((moom.mZ)(this)).a(((net.minecraft.entity.monster.EntityZombie)(((net.minecraft.entity.monster.EntityZombie)(p0)))), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((float)(p4)), ((float)(p5)));
}


private static native int __sourceIntrinsic_booleanComparison(boolean value);



private static native void __sourceExactCall_3c9f9104f7ca54(moom.mW p0, net.minecraft.entity.EntityLiving p1, double p2, double p3, double p4, float p5, float p6);
private static native void __sourceExactCall_fba67a07efdb59(moom.mW p0, net.minecraft.entity.EntityLivingBase p1, float p2, float p3, float p4);
}
