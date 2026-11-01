package moom;


public class nl extends moom.nk<moom.s_> {

private static final moom.DD D;

public nl(net.minecraft.client.renderer.entity.RenderManager p0) {
super(((net.minecraft.client.renderer.entity.RenderManager)(p0)));
    this.c *= 0x1.666666p-1f;
    return;
}


static {
moom.nl.D = new moom.DD("textures/entity/spider/cave_spider.png");
}


protected moom.DD a__DD__sourceBridge_6956695e68(moom.s9 p0) {
return ((moom.nl)(this)).a(((moom.s_)(((moom.s_)(p0)))));
}


protected moom.DD a__sourceBridge_fb93f4301e(net.minecraft.entity.Entity p0) {
return ((moom.nl)(this)).a(((moom.s_)(((moom.s_)(p0)))));
}


protected void a__Void__sourceBridge_7f50c316df(net.minecraft.entity.EntityLivingBase p0, float p1) {
((moom.nl)(this)).a__sourceReturn_6d76b71e85(((moom.s_)(((moom.s_)(p0)))), ((float)(p1)));
}


protected void a__sourceReturn_6d76b71e85(moom.s_ p0, float p1) {
moom.kZ.a(((float)(0x1.666666p-1f)), ((float)(0x1.666666p-1f)), ((float)(0x1.666666p-1f)));
    return;
}


protected moom.DD a(moom.s_ p0) {
return moom.nl.D;
}


public moom.DD a__DD(moom.s_ __bridgeParam0) { return this.a__DD__sourceBridge_6956695e68(((moom.s9)(__bridgeParam0))); }
public void a__Void(moom.s_ __bridgeParam0, float __bridgeParam1) { this.a__Void__sourceBridge_7f50c316df(((net.minecraft.entity.EntityLivingBase)(__bridgeParam0)), ((float)(__bridgeParam1))); }
}
