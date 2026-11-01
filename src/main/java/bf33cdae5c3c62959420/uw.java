package moom;


public class uw extends moom.uc {

net.minecraft.entity.EntityLiving c;

net.minecraft.entity.EntityLivingBase d;

float e;

private static final long f;

public uw(net.minecraft.entity.EntityLiving p0, float p1) {
super();
    this.c = p0;
    this.e = p1;
    (this).a(5);
}


static {
f = (moom._c.a(8334191328581418684L, 1250639758663933372L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(98674893441668L);
}


public boolean b__Boolean() {
int forwardValue4248_13_0;
    int forwardValue4248_15_0;
    boolean spill4248_0;
    long life1_3;
    int life3_5;
    forward_join_15: {
    forward_join_14: {
    forward_join_13: {
    life1_3 = (moom.uw.f ^ 63923689094762L);
    life3_5 = ((moom.uc.e()) ? 1 : 0);
    spill4248_0 = ((net.minecraft.entity.EntityLiving)(this.c)).A;
    if (!((life3_5 == 0))) {
        forwardValue4248_13_0 = ((spill4248_0) ? 1 : 0);
        break forward_join_13;
    }
    if (!((!spill4248_0))) {
        break forward_join_14;
    }
    forwardValue4248_13_0 = 1;
    }
    forwardValue4248_15_0 = forwardValue4248_13_0;
    break forward_join_15;
    }
    forwardValue4248_15_0 = 0;
    }
    return ((forwardValue4248_15_0) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a__Void() {
long life1_3;
    double life4_11;
    double life6_20;
    int life3_21;
    float life8_30;
    life1_3 = (moom.uw.f ^ 93168233590471L);
    life4_11 = (((net.minecraft.entity.EntityLivingBase)(this.d)).n - ((net.minecraft.entity.EntityLiving)(this.c)).n);
    boolean spill4247_0 = moom.uc.e();
    life6_20 = (((net.minecraft.entity.EntityLivingBase)(this.d)).p - ((net.minecraft.entity.EntityLiving)(this.c)).p);
    life3_21 = ((spill4247_0) ? 1 : 0);
    life8_30 = moom.Dr.a__Float(((double)(((life4_11 * life4_11) + (life6_20 * life6_20)))));
    net.minecraft.entity.EntityLiving __stackOp4247_13_0 = this.c;
    ((net.minecraft.entity.EntityLiving)(__stackOp4247_13_0)).t = ((double)((((net.minecraft.entity.EntityLiving)(__stackOp4247_13_0)).t + ((((life4_11 / ((double) life8_30)) * 0x1.0p-1d) * 0x1.99999ap-1d) + (((net.minecraft.entity.EntityLiving)(this.c)).t * 0x1.99999ap-3d)))));
    net.minecraft.entity.EntityLiving __stackOp4247_19_0 = this.c;
    ((net.minecraft.entity.EntityLiving)(__stackOp4247_19_0)).v = ((double)((((net.minecraft.entity.EntityLiving)(__stackOp4247_19_0)).v + ((((life6_20 / ((double) life8_30)) * 0x1.0p-1d) * 0x1.99999ap-1d) + (((net.minecraft.entity.EntityLiving)(this.c)).v * 0x1.99999ap-3d)))));
    ((net.minecraft.entity.EntityLiving)(this.c)).u = ((double)(((double) this.e)));
    if ((net.minecraft.entity.Entity.b__ArrayString() != null)) {
        moom.uc.b(((boolean)__sourceIntrinsic_integerToBoolean((((life3_21 != 0) ? 0 : 1)))));
    }
    return;
}


public boolean a__Boolean() {
moom.uw forwardValue4246_19_0;
    int forwardValue4246_33_0;
    int forwardValue4246_39_0;
    int forwardValue4246_47_0;
    int forwardValue4246_51_0;
    int forwardValue4246_53_0;
    boolean spill4246_0;
    moom.uw spill4246_1;
    int spill4246_2;
    long life1_3;
    int life3_10;
    double life4_28;
    forward_join_53: {
    forward_join_52: {
    forward_join_51: {
    forward_join_47: {
    forward_join_39: {
    forward_join_33: {
    forward_join_19: {
    forward_join_18: {
    life1_3 = (moom.uw.f ^ 90778776442619L);
    spill4246_0 = moom.uc.e();
    this.d = ((net.minecraft.entity.EntityLivingBase)(((net.minecraft.entity.EntityLiving)(this.c)).d__sourceReturn_d30556f370()));
    life3_10 = ((spill4246_0) ? 1 : 0);
    spill4246_1 = this;
    if (!((life3_10 == 0))) {
        forwardValue4246_19_0 = spill4246_1;
        break forward_join_19;
    }
    if (!((((moom.uw)(spill4246_1)).d == null))) {
        break forward_join_18;
    }
    return ((0) != 0);
    }
    forwardValue4246_19_0 = this;
    }
    life4_28 = ((net.minecraft.entity.EntityLiving)(((moom.uw)(forwardValue4246_19_0)).c)).a(((net.minecraft.entity.Entity)(this.d)));
    spill4246_2 = recovery.source.CarrierOps.dcmpl(((double)(life4_28)), ((double)(0x1.0p2d)));
    if (!((life3_10 == 0))) {
        forwardValue4246_33_0 = spill4246_2;
        break forward_join_33;
    }
    if (!((spill4246_2 >= 0))) {
        break forward_join_52;
    }
    forwardValue4246_33_0 = recovery.source.CarrierOps.dcmpg(((double)(life4_28)), ((double)(0x1.0p4d)));
    }
    if (!((life3_10 == 0))) {
        forwardValue4246_39_0 = forwardValue4246_33_0;
        break forward_join_39;
    }
    if (!((forwardValue4246_33_0 <= 0))) {
        break forward_join_52;
    }
    forwardValue4246_39_0 = ((((net.minecraft.entity.EntityLiving)(this.c)).A) ? 1 : 0);
    }
    if (!((life3_10 == 0))) {
        forwardValue4246_47_0 = forwardValue4246_39_0;
        break forward_join_47;
    }
    if (!((forwardValue4246_39_0 != 0))) {
        break forward_join_52;
    }
    forwardValue4246_47_0 = ((java.util.Random)(((net.minecraft.entity.EntityLiving)(this.c)).a__Random())).nextInt(((int)(5)));
    }
    if (!((life3_10 == 0))) {
        forwardValue4246_51_0 = forwardValue4246_47_0;
        break forward_join_51;
    }
    if (!((forwardValue4246_47_0 == 0))) {
        break forward_join_52;
    }
    forwardValue4246_51_0 = 1;
    }
    forwardValue4246_53_0 = forwardValue4246_51_0;
    break forward_join_53;
    }
    forwardValue4246_53_0 = 0;
    }
    return ((forwardValue4246_53_0) != 0);
}


private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
