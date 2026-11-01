package moom;


public class no extends moom.mU<moom.ta> {

private static final moom.DD C;

public no(net.minecraft.client.renderer.entity.RenderManager p0) {
super(p0, new moom.jx(0x0.0p+0f), 0x1.0000000000000p-1f);
    (this).a(new net.minecraft.client.renderer.entity.layers.LayerHeldItemWitch(this));
}


static {
moom.no.C = new moom.DD("textures/entity/witch.png");
}


protected void a__Void__sourceBridge_7f50c316df(net.minecraft.entity.EntityLivingBase p0, float p1) {
((moom.no)(this)).a__sourceReturn_bff610526f(((moom.ta)(((moom.ta)(p0)))), ((float)(p1)));
}


public void a__sourceBridge_e7b4e99e7e(net.minecraft.entity.EntityLivingBase p0, double p1, double p2, double p3, float p4, float p5) {
((moom.no)(this)).a(((moom.ta)(((moom.ta)(p0)))), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((float)(p4)), ((float)(p5)));
}


protected moom.DD a__sourceBridge_fb93f4301e(net.minecraft.entity.Entity p0) {
return ((moom.no)(this)).a__sourceReturn_a6c45a855f(((moom.ta)(((moom.ta)(p0)))));
}


public void a__sourceBridge_01f3c9ade5(net.minecraft.entity.Entity p0, double p1, double p2, double p3, float p4, float p5) {
((moom.no)(this)).a(((moom.ta)(((moom.ta)(p0)))), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((float)(p4)), ((float)(p5)));
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(moom.ta p0, double p1, double p2, double p3, float p4, float p5) {
((moom.jx)(((moom.jx)(this.m)))).o = ((boolean)__sourceIntrinsic_integerToBoolean((((((moom.ta)(p0)).a__xW() != null) ? 1 : 0))));
    __sourceExactCall_dc1b8554f2e929(this, ((net.minecraft.entity.EntityLiving)(p0)), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((float)(p4)), ((float)(p5)));
    return;
}


protected moom.DD a__sourceReturn_a6c45a855f(moom.ta p0) {
return moom.no.C;
}


public void a__Void() {
moom.kZ.b(((float)(0x0.0p0f)), ((float)(0x1.8p-3f)), ((float)(0x0.0p0f)));
    return;
}


protected void a__sourceReturn_bff610526f(moom.ta p0, float p1) {
float local3 = 0x1.ep-1f;
    moom.kZ.a(((float)(local3)), ((float)(local3)), ((float)(local3)));
    return;
}


public void a__sourceBridge_36abde8bbd(net.minecraft.entity.EntityLiving p0, double p1, double p2, double p3, float p4, float p5) {
((moom.no)(this)).a(((moom.ta)(((moom.ta)(p0)))), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((float)(p4)), ((float)(p5)));
}


private static native boolean __sourceIntrinsic_integerToBoolean(int value);

public void a__Void(moom.ta __bridgeParam0, float __bridgeParam1) { this.a__Void__sourceBridge_7f50c316df(((net.minecraft.entity.EntityLivingBase)(__bridgeParam0)), ((float)(__bridgeParam1))); }

public moom.DD a(moom.ta __bridgeParam0) { return ((moom.DD)(this.a__sourceBridge_fb93f4301e(((net.minecraft.entity.Entity)(__bridgeParam0))))); }

private static native void __sourceExactCall_dc1b8554f2e929(moom.mU p0, net.minecraft.entity.EntityLiving p1, double p2, double p3, double p4, float p5, float p6);
}
