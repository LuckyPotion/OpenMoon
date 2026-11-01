package net.minecraft.entity.ai;


public class EntityMoveHelper {

protected net.minecraft.entity.EntityLiving a;

protected double b;

protected double c;

protected double d;

protected double e;

protected boolean f;

private static final long k;

public EntityMoveHelper(net.minecraft.entity.EntityLiving p0) {
super();
    this.a = p0;
    this.b = p0.n;
    this.c = p0.o;
    this.d = p0.p;
}


static {
k = (moom._c.a(2461526170057547181L, -9160611985833113048L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(66250514127035L);
}


public double b() {
return this.b;
}


public double c() {
return this.c;
}


public double d() {
return this.d;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public boolean a__Boolean() {
return ((((this.f) ? 1 : 0)) != 0);
}


public double a() {
return this.e;
}


public void a(double p0, double p1, double p2, double p3) {
this.b = ((double)(p0));
    this.c = ((double)(p1));
    this.d = ((double)(p2));
    this.e = ((double)(p3));
    this.f = ((boolean)(true));
    return;
}


public void a__Void() {
int forwardValue4994_25_0;
    double forwardValue4994_70_0;
    double forwardValue4994_70_1;
    int forwardValue4994_112_0;
    boolean spill4994_0;
    boolean spill4994_1;
    double spill4994_2;
    double spill4994_3;
    int spill4994_4;
    long life1_3;
    int life3_9;
    int life4_31;
    double life5_38;
    double life7_45;
    double life9_51;
    double life11_63;
    float life13_86;
    forward_join_117: {
    forward_join_112: {
    forward_join_70: {
    forward_join_25: {
    life1_3 = (net.minecraft.entity.ai.EntityMoveHelper.k ^ 48953465518583L);
    spill4994_0 = moom.uc.e();
    ((net.minecraft.entity.EntityLiving)(this.a)).h(((float)(0x0.0p0f)));
    life3_9 = ((spill4994_0) ? 1 : 0);
    spill4994_1 = this.f;
    if (!((life3_9 == 0))) {
        forwardValue4994_25_0 = ((spill4994_1) ? 1 : 0);
        break forward_join_25;
    }
    if (!(spill4994_1)) {
        break forward_join_117;
    }
    this.f = ((boolean)(false));
    forwardValue4994_25_0 = moom.Dr.b__Int(((double)((((moom.CA)(((net.minecraft.entity.EntityLiving)(this.a)).b())).c + 0x1.0p-1d))));
    }
    life4_31 = forwardValue4994_25_0;
    life5_38 = (this.b - ((net.minecraft.entity.EntityLiving)(this.a)).n);
    life7_45 = (this.d - ((net.minecraft.entity.EntityLiving)(this.a)).p);
    life9_51 = (this.c - ((double) life4_31));
    life11_63 = (((life5_38 * life5_38) + (life9_51 * life9_51)) + (life7_45 * life7_45));
    spill4994_2 = life11_63;
    spill4994_3 = 0x1.0c6f7cp-22d;
    if (!((life3_9 == 0))) {
        forwardValue4994_70_0 = spill4994_2;
        forwardValue4994_70_1 = spill4994_3;
        break forward_join_70;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(spill4994_2)), ((double)(spill4994_3))) >= 0))) {
        break forward_join_117;
    }
    forwardValue4994_70_0 = (moom.Dr.b(((double)(life7_45)), ((double)(life5_38))) * 0x1.68p7d);
    forwardValue4994_70_1 = 0x1.921fb54442d18p1d;
    }
    life13_86 = (((float) (forwardValue4994_70_0 / forwardValue4994_70_1)) - 0x1.68p6f);
    ((net.minecraft.entity.EntityLiving)(this.a)).w = ((float)(this.a(((float)(((net.minecraft.entity.EntityLiving)(this.a)).w)), ((float)(life13_86)), ((float)(0x1.ep4f)))));
    ((net.minecraft.entity.EntityLiving)(this.a)).f(((float)(((float) (this.e * ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((net.minecraft.entity.EntityLiving)(this.a)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.e))))).b())))));
    spill4994_4 = recovery.source.CarrierOps.dcmpl(((double)(life9_51)), ((double)(0x0.0p0d)));
    if (!((life3_9 == 0))) {
        forwardValue4994_112_0 = spill4994_4;
        break forward_join_112;
    }
    if (!((spill4994_4 > 0))) {
        break forward_join_117;
    }
    forwardValue4994_112_0 = recovery.source.CarrierOps.dcmpg(((double)(((life5_38 * life5_38) + (life7_45 * life7_45)))), ((double)(0x1.0p0d)));
    }
    if (!((forwardValue4994_112_0 < 0))) {
        break forward_join_117;
    }
    ((net.minecraft.entity.ai.EntityJumpHelper)(((net.minecraft.entity.EntityLiving)(this.a)).a__vr())).a();
    }
    return;
}


protected float a(float p0, float p1, float p2) {
int forwardValue4993_25_0;
    float forwardValue4993_31_0;
    float forwardValue4993_31_1;
    int forwardValue4993_50_0;
    float forwardValue4993_56_0;
    boolean spill4993_0;
    int spill4993_1;
    float spill4993_2;
    float spill4993_3;
    int spill4993_4;
    float spill4993_5;
    long life4_3;
    float life7_9;
    int life6_10;
    float life8_38;
    forward_join_56: {
    forward_join_55: {
    forward_join_50: {
    forward_join_45: {
    forward_join_31: {
    forward_join_29: {
    forward_join_25: {
    forward_join_19: {
    life4_3 = (net.minecraft.entity.ai.EntityMoveHelper.k ^ 27909780585868L);
    spill4993_0 = moom.uc.d();
    life7_9 = moom.Dr.e(((float)((p1 - p0))));
    life6_10 = ((spill4993_0) ? 1 : 0);
    spill4993_1 = recovery.source.CarrierOps.fcmpl(((float)(life7_9)), ((float)(p2)));
    if (!((life6_10 != 0))) {
        forwardValue4993_25_0 = spill4993_1;
        break forward_join_25;
    }
    if (!((spill4993_1 > 0))) {
        break forward_join_19;
    }
    life7_9 = p2;
    }
    spill4993_2 = life7_9;
    spill4993_3 = (-p2);
    if (!((life6_10 != 0))) {
        forwardValue4993_31_0 = spill4993_2;
        forwardValue4993_31_1 = spill4993_3;
        break forward_join_31;
    }
    forwardValue4993_25_0 = recovery.source.CarrierOps.fcmpg(((float)(spill4993_2)), ((float)(spill4993_3)));
    }
    if (!((forwardValue4993_25_0 < 0))) {
        break forward_join_29;
    }
    life7_9 = (-p2);
    }
    forwardValue4993_31_0 = p0;
    forwardValue4993_31_1 = life7_9;
    }
    life8_38 = (forwardValue4993_31_0 + forwardValue4993_31_1);
    spill4993_4 = recovery.source.CarrierOps.fcmpg(((float)(life8_38)), ((float)(0x0.0p0f)));
    if (!((life6_10 != 0))) {
        forwardValue4993_50_0 = spill4993_4;
        break forward_join_50;
    }
    if (!((spill4993_4 < 0))) {
        break forward_join_45;
    }
    life8_38 = (life8_38 + 0x1.68p8f);
    if (!((life6_10 == 0))) {
        break forward_join_55;
    }
    }
    spill4993_5 = life8_38;
    if (!((life6_10 != 0))) {
        forwardValue4993_56_0 = spill4993_5;
        break forward_join_56;
    }
    forwardValue4993_50_0 = recovery.source.CarrierOps.fcmpl(((float)(spill4993_5)), ((float)(0x1.68p8f)));
    }
    if (!((forwardValue4993_50_0 > 0))) {
        break forward_join_55;
    }
    life8_38 = (life8_38 - 0x1.68p8f);
    }
    forwardValue4993_56_0 = life8_38;
    }
    return forwardValue4993_56_0;
}

}
