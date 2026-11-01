package moom;


public class mI extends net.minecraft.client.renderer.entity.Render<moom.sD> {

private static final moom.DD h;

public moom.je i;

public mI(net.minecraft.client.renderer.entity.RenderManager p0) {
super(p0);
    this.i = new moom.je();
}


static {
moom.mI.h = new moom.DD("textures/entity/lead_knot.png");
}


protected moom.DD a__sourceBridge_fb93f4301e(net.minecraft.entity.Entity p0) {
return ((moom.mI)(this)).a(((moom.sD)(((moom.sD)(p0)))));
}


public void a__sourceBridge_01f3c9ade5(net.minecraft.entity.Entity p0, double p1, double p2, double p3, float p4, float p5) {
((moom.mI)(this)).a(((moom.sD)(((moom.sD)(p0)))), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((float)(p4)), ((float)(p5)));
}


public void a(moom.sD p0, double p1, double p2, double p3, float p4, float p5) {
moom.kZ.B();
    moom.kZ.p();
    moom.kZ.b(((float)(((float) p1))), ((float)(((float) p2))), ((float)(((float) p3))));
    float local10 = 0x1.0p-4f;
    moom.kZ.y();
    moom.kZ.a(((float)(-0x1.0p0f)), ((float)(-0x1.0p0f)), ((float)(0x1.0p0f)));
    moom.kZ.d__Void();
    ((moom.mI)(this)).b(((p0)));
    ((moom.je)(this.i)).a(((net.minecraft.entity.Entity)(p0)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(local10)));
    moom.kZ.C();
    super.a(((p0)), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((float)(p4)), ((float)(p5)));
    return;
}


protected moom.DD a(moom.sD p0) {
return moom.mI.h;
}



}
