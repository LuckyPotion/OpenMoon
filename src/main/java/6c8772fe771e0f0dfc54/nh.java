package moom;


public class nh extends moom.mU<moom.s7> {

private static final moom.DD C;

public nh(net.minecraft.client.renderer.entity.RenderManager p0) {
super(p0, new moom.jp(), 0x1.3333340000000p-2f);
}


static {
moom.nh.C = new moom.DD("textures/entity/silverfish.png");
}


protected float a__sourceReturn_fe6e998144_6c8772fe(net.minecraft.entity.EntityLivingBase p0) {
return __sourceExactCall_342fa03d1d54ea(((moom.nh)(this)), ((moom.s7)(((moom.s7)(p0)))));
}


protected moom.DD a__sourceBridge_fb93f4301e(net.minecraft.entity.Entity p0) {
return ((moom.nh)(this)).a__DD(((moom.s7)(((moom.s7)(p0)))));
}


protected float a__sourceReturn_9e9a1d5241(moom.s7 p0) {
return 0x1.68p7f;
}


protected moom.DD a__DD(moom.s7 p0) {
return moom.nh.C;
}


public moom.DD a(moom.s7 __bridgeParam0) { return ((moom.DD)(this.a__sourceBridge_fb93f4301e(((net.minecraft.entity.Entity)(__bridgeParam0))))); }

private static native float __sourceExactCall_342fa03d1d54ea(moom.nh p0, moom.s7 p1);
}
