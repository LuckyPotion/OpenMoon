package net.minecraft.client.renderer.tileentity;


public class RenderWitherSkull extends net.minecraft.client.renderer.entity.Render<moom.tQ> {

private static final moom.DD h;

private static final moom.DD i;

public moom.jq j;

public RenderWitherSkull(net.minecraft.client.renderer.entity.RenderManager p0) {
super(p0);
    this.j = new moom.jq();
}


static {
net.minecraft.client.renderer.tileentity.RenderWitherSkull.h = new moom.DD("textures/entity/wither/wither_invulnerable.png");
    net.minecraft.client.renderer.tileentity.RenderWitherSkull.i = new moom.DD("textures/entity/wither/wither.png");
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a__sourceBridge_01f3c9ade5(net.minecraft.entity.Entity p0, double p1, double p2, double p3, float p4, float p5) {
((net.minecraft.client.renderer.tileentity.RenderWitherSkull)(this)).a(((moom.tQ)(((moom.tQ)(p0)))), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((float)(p4)), ((float)(p5)));
}


protected moom.DD a__sourceBridge_fb93f4301e(net.minecraft.entity.Entity p0) {
return ((net.minecraft.client.renderer.tileentity.RenderWitherSkull)(this)).a(((moom.tQ)(((moom.tQ)(p0)))));
}


protected moom.DD a(moom.tQ p0) {
return ((__sourceIntrinsic_booleanComparison(((moom.tQ)(p0)).b__sourceReturn_aae029aa0a()) != 0) ? net.minecraft.client.renderer.tileentity.RenderWitherSkull.h : net.minecraft.client.renderer.tileentity.RenderWitherSkull.i);
}


public void a(moom.tQ p0, double p1, double p2, double p3, float p4, float p5) {
moom.kZ.B();
    moom.kZ.p();
    float local10 = __sourceExactCall_3f59b59ec438f8(((net.minecraft.client.renderer.tileentity.RenderWitherSkull)(this)), ((float)(((moom.tQ)(p0)).y)), ((float)(((moom.tQ)(p0)).w)), ((float)(p5)));
    float local11 = (((moom.tQ)(p0)).z + ((((moom.tQ)(p0)).x - ((moom.tQ)(p0)).z) * p5));
    __sourceExactCall_f6b60eb6b2432b(((float)(((float) p1))), ((float)(((float) p2))), ((float)(((float) p3))));
    float local12 = 0x1.0p-4f;
    moom.kZ.y();
    __sourceExactCall_c87cfdff997c62(((float)(-0x1.0p0f)), ((float)(-0x1.0p0f)), ((float)(0x1.0p0f)));
    moom.kZ.d__Void();
    __sourceExactCall_c277228c64755a(((net.minecraft.client.renderer.tileentity.RenderWitherSkull)(this)), ((net.minecraft.entity.Entity)(p0)));
    __sourceExactCall_4c17062cf14636(((moom.jq)(this.j)), ((net.minecraft.entity.Entity)(p0)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(local10)), ((float)(local11)), ((float)(local12)));
    moom.kZ.C();
    __sourceExactCall_76ed68570395ae(this, ((net.minecraft.entity.Entity)(p0)), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((float)(p4)), ((float)(p5)));
    return;
}


private float a(float p0, float p1, float p2) {
float local4 = (p1 - p0);
    while ((local4 < -0x1.68p7f)) {
        local4 = (local4 + 0x1.68p8f);
    }
    while ((local4 >= 0x1.68p7f)) {
        local4 = (local4 - 0x1.68p8f);
    }
    return (p0 + (p2 * local4));
}


private static native int __sourceIntrinsic_booleanComparison(boolean value);



private static native float __sourceExactCall_3f59b59ec438f8(net.minecraft.client.renderer.tileentity.RenderWitherSkull p0, float p1, float p2, float p3);
private static native void __sourceExactCall_f6b60eb6b2432b(float p0, float p1, float p2);
private static native void __sourceExactCall_c87cfdff997c62(float p0, float p1, float p2);
private static native boolean __sourceExactCall_c277228c64755a(net.minecraft.client.renderer.tileentity.RenderWitherSkull p0, net.minecraft.entity.Entity p1);
private static native void __sourceExactCall_4c17062cf14636(moom.jq p0, net.minecraft.entity.Entity p1, float p2, float p3, float p4, float p5, float p6, float p7);
private static native void __sourceExactCall_76ed68570395ae(net.minecraft.client.renderer.entity.Render p0, net.minecraft.entity.Entity p1, double p2, double p3, double p4, float p5, float p6);
}
