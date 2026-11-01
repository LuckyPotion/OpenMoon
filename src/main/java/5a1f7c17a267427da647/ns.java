package moom;


public class ns extends net.minecraft.client.renderer.entity.Render<moom.tw> {

private static final moom.DD h;

public moom.iQ i;

public ns(net.minecraft.client.renderer.entity.RenderManager p0) {
super(p0);
    this.i = new moom.i9(0x0.0p+0f, true);
    this.c = 0x1.0000000000000p-1f;
}


static {
moom.ns.h = new moom.DD("textures/entity/endercrystal/endercrystal.png");
}


protected moom.DD a__sourceBridge_fb93f4301e(net.minecraft.entity.Entity p0) {
return ((moom.ns)(this)).a(((moom.tw)(((moom.tw)(p0)))));
}


public void a__sourceBridge_01f3c9ade5(net.minecraft.entity.Entity p0, double p1, double p2, double p3, float p4, float p5) {
((moom.ns)(this)).a(((moom.tw)(((moom.tw)(p0)))), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((float)(p4)), ((float)(p5)));
}


public void a(moom.tw p0, double p1, double p2, double p3, float p4, float p5) {
float local10 = (((float) ((moom.tw)(p0)).aE) + p5);
    moom.kZ.B();
    moom.kZ.b(((float)(((float) p1))), ((float)(((float) p2))), ((float)(((float) p3))));
    ((moom.ns)(this)).b(((moom.DD)(moom.ns.h)));
    float local11 = ((moom.Dr.a(((float)((local10 * 0x1.99999ap-3f)))) / 0x1.0p1f) + 0x1.0p-1f);
    local11 = ((local11 * local11) + local11);
    ((moom.iQ)(this.i)).a(((net.minecraft.entity.Entity)(p0)), ((float)(0x0.0p0f)), ((float)((local10 * 0x1.8p1f))), ((float)((local11 * 0x1.99999ap-3f))), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p-4f)));
    moom.kZ.C();
    super.a(((p0)), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((float)(p4)), ((float)(p5)));
    return;
}


protected moom.DD a(moom.tw p0) {
return moom.ns.h;
}



}
