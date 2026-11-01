package moom;


public class m6 extends moom.mU<net.minecraft.entity.monster.EntityEndermite> {

private static final moom.DD C;

public m6(net.minecraft.client.renderer.entity.RenderManager p0) {
super(p0, new moom.i_(), 0x1.3333340000000p-2f);
}


static {
moom.m6.C = new moom.DD("textures/entity/endermite.png");
}


protected float a__sourceReturn_fe6e998144_cacdb4b1(net.minecraft.entity.EntityLivingBase p0) {
return __sourceExactCall_93c83d98451a82(((moom.m6)(this)), ((net.minecraft.entity.monster.EntityEndermite)(((net.minecraft.entity.monster.EntityEndermite)(p0)))));
}


protected moom.DD a__sourceBridge_fb93f4301e(net.minecraft.entity.Entity p0) {
return ((moom.m6)(this)).a__DD(((net.minecraft.entity.monster.EntityEndermite)(((net.minecraft.entity.monster.EntityEndermite)(p0)))));
}


protected float a__sourceReturn_7e6ab2ef34(net.minecraft.entity.monster.EntityEndermite p0) {
return 0x1.68p7f;
}


protected moom.DD a__DD(net.minecraft.entity.monster.EntityEndermite p0) {
return moom.m6.C;
}


public moom.DD a(net.minecraft.entity.monster.EntityEndermite __bridgeParam0) { return ((moom.DD)(this.a__sourceBridge_fb93f4301e(((net.minecraft.entity.Entity)(__bridgeParam0))))); }

private static native float __sourceExactCall_93c83d98451a82(moom.m6 p0, net.minecraft.entity.monster.EntityEndermite p1);
}
