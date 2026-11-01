package moom;


public class nk<T extends moom.s9> extends moom.mU<T> {

private static final moom.DD C;

public nk(net.minecraft.client.renderer.entity.RenderManager p0) {
super(p0, new moom.ju(), 0x1.0000000000000p+0f);
    (this).a(new moom.nZ(this));
}


static {
moom.nk.C = new moom.DD("textures/entity/spider/spider.png");
}


protected float a__sourceReturn_fe6e998144_d808a017(net.minecraft.entity.EntityLivingBase p0) {
return __sourceExactCall_3c2cae0739e306(((moom.nk)(this)), ((moom.s9)(((moom.s9)(p0)))));
}


protected moom.DD a__sourceBridge_fb93f4301e(net.minecraft.entity.Entity p0) {
return ((moom.nk)(this)).a__DD(((moom.s9)(((moom.s9)(p0)))));
}


protected float a__sourceReturn_08d0c6c54f(T p0) {
return 0x1.68p7f;
}


protected moom.DD a__DD(T p0) {
return moom.nk.C;
}


public moom.DD a(T __bridgeParam0) { return ((moom.DD)(this.a__sourceBridge_fb93f4301e(((net.minecraft.entity.Entity)(__bridgeParam0))))); }

private static native float __sourceExactCall_3c2cae0739e306(moom.nk p0, moom.s9 p1);
}
