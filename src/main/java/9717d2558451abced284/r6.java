package moom;


public class r6 extends net.minecraft.client.particle.EntityFX {

protected r6(net.minecraft.world.World p0, double p1, double p2, double p3, double p4, double p5, double p6) {
super(p0, p1, p2, p3, p4, p5, p6);
    float local14_life2 = ((((java.util.Random)(((moom.r6)(this)).ah)).nextFloat() * 0x1.99999ap-4f) + 0x1.99999ap-3f);
    ((moom.r6)(this)).aM = ((float)(local14_life2));
    ((moom.r6)(this)).aN = ((float)(local14_life2));
    ((moom.r6)(this)).aO = ((float)(local14_life2));
    ((moom.r6)(this)).g(((int)(0)));
    ((moom.r6)(this)).a__Void(((float)(0x1.47ae14p-6f)), ((float)(0x1.47ae14p-6f)));
    this.aK *= ((((java.util.Random)(((moom.r6)(this)).ah)).nextFloat() * 0x1.333334p-1f) + 0x1.0p-1f);
    this.t *= 0x1.47ae14p-6d;
    this.u *= 0x1.47ae14p-6d;
    this.v *= 0x1.47ae14p-6d;
    ((moom.r6)(this)).aJ = ((int)(((int) (0x1.4p4d / ((java.lang.Math.random() * 0x1.999999999999ap-1d) + 0x1.999999999999ap-3d)))));
    ((moom.r6)(this)).Q = ((boolean)(true));
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void g__Void() {
((moom.r6)(this)).k = ((double)(((moom.r6)(this)).n));
    ((moom.r6)(this)).l = ((double)(((moom.r6)(this)).o));
    ((moom.r6)(this)).m = ((double)(((moom.r6)(this)).p));
    ((moom.r6)(this)).b__Void(((double)(((moom.r6)(this)).t)), ((double)(((moom.r6)(this)).u)), ((double)(((moom.r6)(this)).v)));
    moom.r6 __stackOp3890_10_0 = this;
    ((moom.r6)(__stackOp3890_10_0)).t = ((double)((((moom.r6)(__stackOp3890_10_0)).t * 0x1.fae147ae147aep-1d)));
    moom.r6 __stackOp3890_13_0 = this;
    ((moom.r6)(__stackOp3890_13_0)).u = ((double)((((moom.r6)(__stackOp3890_13_0)).u * 0x1.fae147ae147aep-1d)));
    moom.r6 __stackOp3890_16_0 = this;
    ((moom.r6)(__stackOp3890_16_0)).v = ((double)((((moom.r6)(__stackOp3890_16_0)).v * 0x1.fae147ae147aep-1d)));
    moom.r6 __stackOp3890_19_0 = this;
    moom.r6 __stackOp3890_21_0 = __stackOp3890_19_0;
    int __stackOp3890_21_1 = ((moom.r6)(__stackOp3890_19_0)).aJ;
    int spill3890_0 = __stackOp3890_21_1;
    ((moom.r6)(__stackOp3890_21_0)).aJ = ((int)((__stackOp3890_21_1 - 1)));
    if ((spill3890_0 <= 0)) {
        ((moom.r6)(this)).f__Void();
    }
    return;
}

}
