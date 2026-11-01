package moom;


public class mV extends moom.mU<net.minecraft.entity.passive.EntityBat> {

private static final moom.DD C;

public mV(net.minecraft.client.renderer.entity.RenderManager p0) {
super(p0, new moom.iS(), 0x1.0000000000000p-2f);
}


static {
moom.mV.C = new moom.DD("textures/entity/bat.png");
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


protected moom.DD a__sourceBridge_fb93f4301e(net.minecraft.entity.Entity p0) {
return ((moom.mV)(this)).a__sourceReturn_9894eeae02(((net.minecraft.entity.passive.EntityBat)(((net.minecraft.entity.passive.EntityBat)(p0)))));
}


protected void a__sourceBridge_e093c470d2(net.minecraft.entity.EntityLivingBase p0, float p1, float p2, float p3) {
((moom.mV)(this)).a(((net.minecraft.entity.passive.EntityBat)(((net.minecraft.entity.passive.EntityBat)(p0)))), ((float)(p1)), ((float)(p2)), ((float)(p3)));
}


protected moom.DD a__sourceReturn_9894eeae02(net.minecraft.entity.passive.EntityBat p0) {
return moom.mV.C;
}


protected void a__sourceReturn_2e4bb58c78(net.minecraft.entity.passive.EntityBat p0, float p1) {
moom.kZ.a(((float)(0x1.666666p-2f)), ((float)(0x1.666666p-2f)), ((float)(0x1.666666p-2f)));
    return;
}


protected void a(net.minecraft.entity.passive.EntityBat p0, float p1, float p2, float p3) {
if ((__sourceIntrinsic_booleanComparison(((net.minecraft.entity.passive.EntityBat)(p0)).Y()) == 0)) {
        moom.kZ.b(((float)(0x0.0p0f)), ((float)((moom.Dr.b(((float)((p1 * 0x1.333334p-2f)))) * 0x1.99999ap-4f))), ((float)(0x0.0p0f)));
    } else {
        moom.kZ.b(((float)(0x0.0p0f)), ((float)(-0x1.99999ap-4f)), ((float)(0x0.0p0f)));
    }
    __sourceExactCall_f1b687094b3988(this, ((net.minecraft.entity.EntityLivingBase)(p0)), ((float)(p1)), ((float)(p2)), ((float)(p3)));
    return;
}


protected void a__Void__sourceBridge_7f50c316df(net.minecraft.entity.EntityLivingBase p0, float p1) {
((moom.mV)(this)).a__sourceReturn_2e4bb58c78(((net.minecraft.entity.passive.EntityBat)(((net.minecraft.entity.passive.EntityBat)(p0)))), ((float)(p1)));
}


private static native int __sourceIntrinsic_booleanComparison(boolean value);

public void a__Void(net.minecraft.entity.passive.EntityBat __bridgeParam0, float __bridgeParam1) { this.a__Void__sourceBridge_7f50c316df(((net.minecraft.entity.EntityLivingBase)(__bridgeParam0)), ((float)(__bridgeParam1))); }

public moom.DD a(net.minecraft.entity.passive.EntityBat __bridgeParam0) { return ((moom.DD)(this.a__sourceBridge_fb93f4301e(((net.minecraft.entity.Entity)(__bridgeParam0))))); }

private static native void __sourceExactCall_f1b687094b3988(moom.mU p0, net.minecraft.entity.EntityLivingBase p1, float p2, float p3, float p4);
}
