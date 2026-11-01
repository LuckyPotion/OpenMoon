package moom;


public class m5 extends moom.mU<net.minecraft.entity.monster.EntityEnderman> {

private static final moom.DD C;

private final moom.iW D;

private final java.util.Random E;

public m5(net.minecraft.client.renderer.entity.RenderManager p0) {
super(p0, new moom.iW(0x0.0p+0f), 0x1.0000000000000p-1f);
    this.E = new java.util.Random();
    this.D = ((moom.iW) (this.m));
    (this).a(new moom.nO(this));
    (this).a(new moom.nP(this));
}


static {
moom.m5.C = new moom.DD("textures/entity/enderman/enderman.png");
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a__sourceBridge_01f3c9ade5(net.minecraft.entity.Entity p0, double p1, double p2, double p3, float p4, float p5) {
((moom.m5)(this)).a(((net.minecraft.entity.monster.EntityEnderman)(((net.minecraft.entity.monster.EntityEnderman)(p0)))), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((float)(p4)), ((float)(p5)));
}


protected moom.DD a__sourceBridge_fb93f4301e(net.minecraft.entity.Entity p0) {
return ((moom.m5)(this)).a__sourceReturn_ccd8468bfa(((net.minecraft.entity.monster.EntityEnderman)(((net.minecraft.entity.monster.EntityEnderman)(p0)))));
}


public void a(net.minecraft.entity.monster.EntityEnderman p0, double p1, double p2, double p3, float p4, float p5) {
double life10_23;
    moom.iW spill6846_0 = this.D;
    ((moom.iW)(spill6846_0)).t = ((boolean)__sourceIntrinsic_integerToBoolean((((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.entity.monster.EntityEnderman)(p0)).a__sourceReturn_474a78d617())).a__ch())).a__fn() != moom.fn.a) ? 1 : 0))));
    ((moom.iW)(this.D)).u = ((boolean)(((net.minecraft.entity.monster.EntityEnderman)(p0)).ad()));
    if (((net.minecraft.entity.monster.EntityEnderman)(p0)).ad()) {
        life10_23 = 0x1.47ae147ae147bp-6d;
        p1 = (p1 + (((java.util.Random)(this.E)).nextGaussian() * life10_23));
        p3 = (p3 + (((java.util.Random)(this.E)).nextGaussian() * life10_23));
    }
    __sourceExactCall_dc1b8554f2e929(this, ((net.minecraft.entity.EntityLiving)(p0)), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((float)(p4)), ((float)(p5)));
    return;
}


protected moom.DD a__sourceReturn_ccd8468bfa(net.minecraft.entity.monster.EntityEnderman p0) {
return moom.m5.C;
}


public void a__sourceBridge_36abde8bbd(net.minecraft.entity.EntityLiving p0, double p1, double p2, double p3, float p4, float p5) {
((moom.m5)(this)).a(((net.minecraft.entity.monster.EntityEnderman)(((net.minecraft.entity.monster.EntityEnderman)(p0)))), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((float)(p4)), ((float)(p5)));
}


public void a__sourceBridge_e7b4e99e7e(net.minecraft.entity.EntityLivingBase p0, double p1, double p2, double p3, float p4, float p5) {
((moom.m5)(this)).a(((net.minecraft.entity.monster.EntityEnderman)(((net.minecraft.entity.monster.EntityEnderman)(p0)))), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((float)(p4)), ((float)(p5)));
}


private static native boolean __sourceIntrinsic_integerToBoolean(int value);



public moom.DD a(net.minecraft.entity.monster.EntityEnderman __bridgeParam0) { return ((moom.DD)(this.a__sourceBridge_fb93f4301e(((net.minecraft.entity.Entity)(__bridgeParam0))))); }

private static native void __sourceExactCall_dc1b8554f2e929(moom.mU p0, net.minecraft.entity.EntityLiving p1, double p2, double p3, double p4, float p5, float p6);
}
