package moom;


public class mW<T extends net.minecraft.entity.EntityLiving> extends moom.mU<T> {

private static final moom.DD C;

protected moom.iT D;

protected float E;

public mW(net.minecraft.client.renderer.entity.RenderManager p0, moom.iT p1, float p2) {
this(p0, p1, p2, 0x1.0000000000000p+0f);
    (this).a(new moom.nQ(this));
}


public mW(net.minecraft.client.renderer.entity.RenderManager p0, moom.iT p1, float p2, float p3) {
super(p0, p1, p2);
    this.D = p1;
    this.E = p3;
    (this).a(new moom.nK(p1.i));
}


static {
moom.mW.C = new moom.DD("textures/entity/steve.png");
}


protected moom.DD a__sourceReturn_d8840f73cc(T p0) {
return moom.mW.C;
}


public void a__Void() {
moom.kZ.b(((float)(0x0.0p0f)), ((float)(0x1.8p-3f)), ((float)(0x0.0p0f)));
    return;
}


protected moom.DD a__sourceBridge_fb93f4301e(net.minecraft.entity.Entity p0) {
return ((moom.mW)(this)).a__sourceReturn_d8840f73cc(((net.minecraft.entity.EntityLiving)(((net.minecraft.entity.EntityLiving)(p0)))));
}

public moom.DD a(T __bridgeParam0) { return this.a__sourceBridge_fb93f4301e(((net.minecraft.entity.Entity)(__bridgeParam0))); }
}
