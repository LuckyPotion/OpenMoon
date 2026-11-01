package net.minecraft.entity.ai;


public class EntityLookHelper {

private final net.minecraft.entity.EntityLiving a;

private float b;

private float c;

private boolean d;

private double e;

private double f;

private double g;

private static final long h;

public EntityLookHelper(net.minecraft.entity.EntityLiving p0) {
super();
    this.a = p0;
}


static {
h = (moom._c.a(1820096915556435508L, 1286139292651149577L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(149111971180280L);
}


public double b() {
return this.f;
}


public double c() {
return this.g;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public double a() {
return this.e;
}


public void a(net.minecraft.entity.Entity p0, float p1, float p2) {
net.minecraft.entity.ai.EntityLookHelper forwardValue4991_35_0;
    double forwardValue4991_35_1;
    net.minecraft.entity.ai.EntityLookHelper spill4991_0;
    double spill4991_1;
    long life4_3;
    int life6_5;
    forward_join_36: {
    forward_join_35: {
    forward_join_25: {
    life4_3 = (net.minecraft.entity.ai.EntityLookHelper.h ^ 52370445777004L);
    life6_5 = ((moom.uc.d()) ? 1 : 0);
    spill4991_0 = this;
    spill4991_1 = ((net.minecraft.entity.Entity)(p0)).n;
    if (!((life6_5 != 0))) {
        forwardValue4991_35_0 = spill4991_0;
        forwardValue4991_35_1 = spill4991_1;
        break forward_join_35;
    }
    ((net.minecraft.entity.ai.EntityLookHelper)(spill4991_0)).e = ((double)(spill4991_1));
    if (!((((p0 instanceof net.minecraft.entity.EntityLivingBase) ? 1 : 0) != 0))) {
        break forward_join_25;
    }
    this.f = ((double)((((net.minecraft.entity.Entity)(p0)).o + ((double) ((net.minecraft.entity.Entity)(p0)).e__Float()))));
    if (!((life6_5 == 0))) {
        break forward_join_36;
    }
    }
    forwardValue4991_35_0 = this;
    forwardValue4991_35_1 = ((((moom.CA)(((net.minecraft.entity.Entity)(p0)).b())).c + ((moom.CA)(((net.minecraft.entity.Entity)(p0)).b())).f) / 0x1.0p1d);
    }
    ((net.minecraft.entity.ai.EntityLookHelper)(forwardValue4991_35_0)).f = ((double)(forwardValue4991_35_1));
    }
    this.g = ((double)(((net.minecraft.entity.Entity)(p0)).p));
    this.b = ((float)(p1));
    this.c = ((float)(p2));
    this.d = ((boolean)(true));
    return;
}


public void a(double p0, double p1, double p2, float p3, float p4) {
this.e = ((double)(p0));
    this.f = ((double)(p1));
    this.g = ((double)(p2));
    this.b = ((float)(p3));
    this.c = ((float)(p4));
    this.d = ((boolean)(true));
    return;
}


public void a__Void() {
net.minecraft.entity.ai.EntityLookHelper forwardValue4992_100_0;
    int forwardValue4992_130_0;
    int forwardValue4992_144_0;
    boolean spill4992_0;
    net.minecraft.entity.ai.EntityLookHelper spill4992_1;
    boolean spill4992_2;
    long life1_3;
    int life3_9;
    double life4_27;
    double life6_39;
    double life8_46;
    double life10_56;
    float life12_67;
    float life13_77;
    float life4_125;
    forward_join_153: {
    forward_join_144: {
    forward_join_141: {
    forward_join_130: {
    forward_join_111: {
    forward_join_100: {
    forward_join_99: {
    life1_3 = (net.minecraft.entity.ai.EntityLookHelper.h ^ 65832772189734L);
    spill4992_0 = moom.uc.d();
    ((net.minecraft.entity.EntityLiving)(this.a)).x = ((float)(0x0.0p0f));
    life3_9 = ((spill4992_0) ? 1 : 0);
    spill4992_1 = this;
    if (!((life3_9 != 0))) {
        forwardValue4992_100_0 = spill4992_1;
        break forward_join_100;
    }
    if (!(((net.minecraft.entity.ai.EntityLookHelper)(spill4992_1)).d)) {
        break forward_join_99;
    }
    this.d = ((boolean)(false));
    life4_27 = (this.e - ((net.minecraft.entity.EntityLiving)(this.a)).n);
    life6_39 = (this.f - (((net.minecraft.entity.EntityLiving)(this.a)).o + ((double) ((net.minecraft.entity.EntityLiving)(this.a)).e__Float())));
    life8_46 = (this.g - ((net.minecraft.entity.EntityLiving)(this.a)).p);
    life10_56 = ((double) moom.Dr.a__Float(((double)(((life4_27 * life4_27) + (life8_46 * life8_46))))));
    life12_67 = (((float) ((moom.Dr.b(((double)(life8_46)), ((double)(life4_27))) * 0x1.68p7d) / 0x1.921fb54442d18p1d)) - 0x1.68p6f);
    life13_77 = ((float) (-((moom.Dr.b(((double)(life6_39)), ((double)(life10_56))) * 0x1.68p7d) / 0x1.921fb54442d18p1d)));
    ((net.minecraft.entity.EntityLiving)(this.a)).x = ((float)(this.a(((float)(((net.minecraft.entity.EntityLiving)(this.a)).x)), ((float)(life13_77)), ((float)(this.c)))));
    ((net.minecraft.entity.EntityLiving)(this.a)).a4 = ((float)(this.a(((float)(((net.minecraft.entity.EntityLiving)(this.a)).a4)), ((float)(life12_67)), ((float)(this.b)))));
    if (!((life3_9 == 0))) {
        break forward_join_111;
    }
    }
    forwardValue4992_100_0 = this;
    }
    ((net.minecraft.entity.EntityLiving)(((net.minecraft.entity.ai.EntityLookHelper)(forwardValue4992_100_0)).a)).a4 = ((float)(this.a(((float)(((net.minecraft.entity.EntityLiving)(this.a)).a4)), ((float)(((net.minecraft.entity.EntityLiving)(this.a)).a2)), ((float)(0x1.4p3f)))));
    }
    life4_125 = moom.Dr.e(((float)((((net.minecraft.entity.EntityLiving)(this.a)).a4 - ((net.minecraft.entity.EntityLiving)(this.a)).a2))));
    spill4992_2 = ((moom.AV)(((net.minecraft.entity.EntityLiving)(this.a)).a__sourceReturn_407923443b())).a__Boolean();
    if (!((life3_9 != 0))) {
        forwardValue4992_130_0 = ((spill4992_2) ? 1 : 0);
        break forward_join_130;
    }
    if (!((!spill4992_2))) {
        break forward_join_153;
    }
    forwardValue4992_130_0 = recovery.source.CarrierOps.fcmpg(((float)(life4_125)), ((float)(-0x1.2cp6f)));
    }
    if (!((life3_9 != 0))) {
        forwardValue4992_144_0 = forwardValue4992_130_0;
        break forward_join_144;
    }
    if (!((forwardValue4992_130_0 < 0))) {
        break forward_join_141;
    }
    ((net.minecraft.entity.EntityLiving)(this.a)).a4 = ((float)((((net.minecraft.entity.EntityLiving)(this.a)).a2 - 0x1.2cp6f)));
    }
    forwardValue4992_144_0 = recovery.source.CarrierOps.fcmpl(((float)(life4_125)), ((float)(0x1.2cp6f)));
    }
    if (!((forwardValue4992_144_0 > 0))) {
        break forward_join_153;
    }
    ((net.minecraft.entity.EntityLiving)(this.a)).a4 = ((float)((((net.minecraft.entity.EntityLiving)(this.a)).a2 + 0x1.2cp6f)));
    }
    return;
}


private float a(float p0, float p1, float p2) {
int forwardValue4990_25_0;
    float forwardValue4990_31_0;
    float forwardValue4990_31_1;
    boolean spill4990_0;
    int spill4990_1;
    float spill4990_2;
    float spill4990_3;
    long life4_3;
    float life7_9;
    int life6_10;
    forward_join_31: {
    forward_join_29: {
    forward_join_25: {
    forward_join_19: {
    life4_3 = (net.minecraft.entity.ai.EntityLookHelper.h ^ 107449543725993L);
    spill4990_0 = moom.uc.d();
    life7_9 = moom.Dr.e(((float)((p1 - p0))));
    life6_10 = ((spill4990_0) ? 1 : 0);
    spill4990_1 = recovery.source.CarrierOps.fcmpl(((float)(life7_9)), ((float)(p2)));
    if (!((life6_10 != 0))) {
        forwardValue4990_25_0 = spill4990_1;
        break forward_join_25;
    }
    if (!((spill4990_1 > 0))) {
        break forward_join_19;
    }
    life7_9 = p2;
    }
    spill4990_2 = life7_9;
    spill4990_3 = (-p2);
    if (!((life6_10 != 0))) {
        forwardValue4990_31_0 = spill4990_2;
        forwardValue4990_31_1 = spill4990_3;
        break forward_join_31;
    }
    forwardValue4990_25_0 = recovery.source.CarrierOps.fcmpg(((float)(spill4990_2)), ((float)(spill4990_3)));
    }
    if (!((forwardValue4990_25_0 < 0))) {
        break forward_join_29;
    }
    life7_9 = (-p2);
    }
    forwardValue4990_31_0 = p0;
    forwardValue4990_31_1 = life7_9;
    }
    return (forwardValue4990_31_0 + forwardValue4990_31_1);
}


public boolean a__Boolean() {
return ((((this.d) ? 1 : 0)) != 0);
}

}
