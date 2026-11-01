package moom;


public class nm extends moom.mU<moom.tl> {

private static final moom.DD C;

public nm(net.minecraft.client.renderer.entity.RenderManager p0, moom.iQ p1, float p2) {
super(p0, p1, p2);
}


static {
moom.nm.C = new moom.DD("textures/entity/squid.png");
}


protected float b__sourceBridge_ae86d2a76c(net.minecraft.entity.EntityLivingBase p0, float p1) {
return ((moom.nm)(this)).a(((moom.tl)(((moom.tl)(p0)))), ((float)(p1)));
}


protected void a__sourceBridge_e093c470d2(net.minecraft.entity.EntityLivingBase p0, float p1, float p2, float p3) {
((moom.nm)(this)).a(((moom.tl)(((moom.tl)(p0)))), ((float)(p1)), ((float)(p2)), ((float)(p3)));
}


protected moom.DD a__sourceBridge_fb93f4301e(net.minecraft.entity.Entity p0) {
return ((moom.nm)(this)).a(((moom.tl)(((moom.tl)(p0)))));
}


protected void a(moom.tl p0, float p1, float p2, float p3) {
float local5 = (((moom.tl)(p0)).bY + ((((moom.tl)(p0)).bX - ((moom.tl)(p0)).bY) * p3));
    float local6 = (((moom.tl)(p0)).b0 + ((((moom.tl)(p0)).bZ - ((moom.tl)(p0)).b0) * p3));
    moom.kZ.b(((float)(0x0.0p0f)), ((float)(0x1.0p-1f)), ((float)(0x0.0p0f)));
    moom.kZ.b(((float)((0x1.68p7f - p2))), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)));
    moom.kZ.b(((float)(local5)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)));
    moom.kZ.b(((float)(local6)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)));
    moom.kZ.b(((float)(0x0.0p0f)), ((float)(-0x1.333334p0f)), ((float)(0x0.0p0f)));
    return;
}


protected moom.DD a__sourceReturn_da209e3dbd(moom.tl p0) {
return moom.nm.C;
}


protected float a__sourceReturn_a3f592ccf5(moom.tl p0, float p1) {
return (((moom.tl)(p0)).b4 + ((((moom.tl)(p0)).b3 - ((moom.tl)(p0)).b4) * p1));
}


public float b(moom.tl __bridgeParam0, float __bridgeParam1) { return this.b__sourceBridge_ae86d2a76c(((net.minecraft.entity.EntityLivingBase)(__bridgeParam0)), ((float)(__bridgeParam1))); }

public moom.DD a(moom.tl __bridgeParam0) { return ((moom.DD)(this.a__sourceBridge_fb93f4301e(((net.minecraft.entity.Entity)(__bridgeParam0))))); }
}
