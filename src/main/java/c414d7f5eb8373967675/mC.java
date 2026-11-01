package moom;


public class mC extends net.minecraft.client.renderer.entity.Render<moom.tv> {

private static final moom.DD h;

public moom.iQ i;

public mC(net.minecraft.client.renderer.entity.RenderManager p0) {
super(p0);
    this.i = new moom.i2();
    this.c = 0x1.0000000000000p-1f;
}


static {
moom.mC.h = new moom.DD("textures/entity/boat.png");
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a__sourceBridge_01f3c9ade5(net.minecraft.entity.Entity p0, double p1, double p2, double p3, float p4, float p5) {
((moom.mC)(this)).a(((moom.tv)(((moom.tv)(p0)))), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((float)(p4)), ((float)(p5)));
}


protected moom.DD a__sourceBridge_fb93f4301e(net.minecraft.entity.Entity p0) {
return ((moom.mC)(this)).a(((moom.tv)(((moom.tv)(p0)))));
}


protected moom.DD a(moom.tv p0) {
return moom.mC.h;
}


public void a(moom.tv p0, double p1, double p2, double p3, float p4, float p5) {
moom.kZ.B();
    __sourceExactCall_f6b60eb6b2432b(((float)(((float) p1))), ((float)((((float) p2) + 0x1.0p-2f))), ((float)(((float) p3))));
    __sourceExactCall_1335870edf69d2(((float)((0x1.68p7f - p4))), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)));
    float local10 = (((float) ((moom.tv)(p0)).a__Int()) - p5);
    float local11 = (__sourceExactCall_2bdb388816c73f(((moom.tv)(p0))) - p5);
    if ((local11 < 0x0.0p0f)) {
        local11 = 0x0.0p0f;
    }
    if ((local10 > 0x0.0p0f)) {
        __sourceExactCall_1335870edf69d2(((float)(((((__sourceExactCall_91a54ea3c9ba57(((float)(local10))) * local10) * local11) / 0x1.4p3f) * ((float) ((moom.tv)(p0)).b__sourceReturn_8abf5c6871())))), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)));
    }
    float local12 = 0x1.8p-1f;
    __sourceExactCall_c87cfdff997c62(((float)(local12)), ((float)(local12)), ((float)(local12)));
    __sourceExactCall_c87cfdff997c62(((float)((0x1.0p0f / local12))), ((float)((0x1.0p0f / local12))), ((float)((0x1.0p0f / local12))));
    __sourceExactCall_22a85532fce0be(((moom.mC)(this)), ((net.minecraft.entity.Entity)(p0)));
    __sourceExactCall_c87cfdff997c62(((float)(-0x1.0p0f)), ((float)(-0x1.0p0f)), ((float)(0x1.0p0f)));
    __sourceExactCall_f8da34d2aa6235(((moom.iQ)(this.i)), ((net.minecraft.entity.Entity)(p0)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(-0x1.99999ap-4f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p-4f)));
    moom.kZ.C();
    __sourceExactCall_76ed68570395ae(this, ((net.minecraft.entity.Entity)(p0)), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((float)(p4)), ((float)(p5)));
    return;
}




private static native void __sourceExactCall_f6b60eb6b2432b(float p0, float p1, float p2);
private static native void __sourceExactCall_1335870edf69d2(float p0, float p1, float p2, float p3);
private static native float __sourceExactCall_2bdb388816c73f(moom.tv p0);
private static native float __sourceExactCall_91a54ea3c9ba57(float p0);
private static native void __sourceExactCall_c87cfdff997c62(float p0, float p1, float p2);
private static native boolean __sourceExactCall_22a85532fce0be(moom.mC p0, net.minecraft.entity.Entity p1);
private static native void __sourceExactCall_f8da34d2aa6235(moom.iQ p0, net.minecraft.entity.Entity p1, float p2, float p3, float p4, float p5, float p6, float p7);
private static native void __sourceExactCall_76ed68570395ae(net.minecraft.client.renderer.entity.Render p0, net.minecraft.entity.Entity p1, double p2, double p3, double p4, float p5, float p6);
}
