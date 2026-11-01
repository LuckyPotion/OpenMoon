package moom;


public class Jj {

private moom.DR a;

private long b;

private static final long c;

public Jj() {
super();
    this.a = null;
    this.b = java.lang.System.currentTimeMillis();
}


static {
c = (moom._c.a(6844665803559506348L, 5438857616307609581L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(272262640605303L);
}


public moom.DR a(double p0, double p1, double p2) {
moom.DR forwardValue2385_21_0;
    int forwardValue2385_48_0;
    double forwardValue2385_74_0;
    double forwardValue2385_74_1;
    moom.DR spill2385_0;
    int spill2385_1;
    double spill2385_2;
    double spill2385_3;
    double spill2385_4;
    double spill2385_5;
    double spill2385_6;
    double spill2385_7;
    long life7_3;
    net.minecraft.entity.Entity[] life9_5;
    long life10_29;
    long life12_34;
    double life14_105;
    double life14_110;
    double life16_116;
    double life18_122;
    double life20_128;
    double life22_136;
    double life24_144;
    double life26_152;
    forward_join_131: {
    forward_join_74: {
    forward_join_71: {
    forward_join_48: {
    forward_join_22: {
    forward_join_21: {
    life7_3 = (moom.Jj.c ^ 316832216035L);
    life9_5 = moom.JM.b__Arrayr3();
    spill2385_0 = this.a;
    if (!((life9_5 != null))) {
        forwardValue2385_21_0 = spill2385_0;
        break forward_join_21;
    }
    if (!((spill2385_0 == null))) {
        break forward_join_22;
    }
    this.a = ((moom.DR)(new moom.DR(p0, p1, p2)));
    forwardValue2385_21_0 = this.a;
    }
    return forwardValue2385_21_0;
    }
    life10_29 = java.lang.System.currentTimeMillis();
    life12_34 = (life10_29 - this.b);
    spill2385_1 = recovery.source.CarrierOps.lcmp(((long)(life12_34)), ((long)(0L)));
    if (!((life9_5 != null))) {
        forwardValue2385_48_0 = spill2385_1;
        break forward_join_48;
    }
    if (!((spill2385_1 != 0))) {
        break forward_join_131;
    }
    this.b = ((long)(life10_29));
    spill2385_2 = java.lang.Math.abs(((double)((p0 - ((moom.DR)(this.a)).a))));
    spill2385_3 = 0x1.0624dd2f1a9fcp-8d;
    if (!((life9_5 != null))) {
        forwardValue2385_74_0 = spill2385_2;
        forwardValue2385_74_1 = spill2385_3;
        break forward_join_74;
    }
    forwardValue2385_48_0 = recovery.source.CarrierOps.dcmpg(((double)(spill2385_2)), ((double)(spill2385_3)));
    }
    if (!((forwardValue2385_48_0 < 0))) {
        break forward_join_71;
    }
    spill2385_4 = java.lang.Math.abs(((double)((p1 - ((moom.DR)(this.a)).b))));
    spill2385_5 = 0x1.0624dd2f1a9fcp-8d;
    if (!((life9_5 != null))) {
        forwardValue2385_74_0 = spill2385_4;
        forwardValue2385_74_1 = spill2385_5;
        break forward_join_74;
    }
    if (!((recovery.source.CarrierOps.dcmpg(((double)(spill2385_4)), ((double)(spill2385_5))) < 0))) {
        break forward_join_71;
    }
    spill2385_6 = java.lang.Math.abs(((double)((p2 - ((moom.DR)(this.a)).c))));
    spill2385_7 = 0x1.0624dd2f1a9fcp-8d;
    if (!((life9_5 != null))) {
        forwardValue2385_74_0 = spill2385_6;
        forwardValue2385_74_1 = spill2385_7;
        break forward_join_74;
    }
    if (!((recovery.source.CarrierOps.dcmpg(((double)(spill2385_6)), ((double)(spill2385_7))) >= 0))) {
        break forward_join_131;
    }
    }
    forwardValue2385_74_0 = ((double) life12_34);
    forwardValue2385_74_1 = 0x1.0624dd2f1a9fcp-10d;
    }
    life14_105 = (forwardValue2385_74_0 * forwardValue2385_74_1);
    life14_110 = moom.BU.a(((double)(life14_105)), ((double)(0x0.0p0d)), ((double)(0x1.0p0d)));
    life16_116 = (p0 - ((moom.DR)(this.a)).a);
    life18_122 = (p1 - ((moom.DR)(this.a)).b);
    life20_128 = (p2 - ((moom.DR)(this.a)).c);
    life22_136 = (((moom.DR)(this.a)).a + (life16_116 * life14_110));
    life24_144 = (((moom.DR)(this.a)).b + (life18_122 * life14_110));
    life26_152 = (((moom.DR)(this.a)).c + (life20_128 * life14_110));
    this.a = ((moom.DR)(new moom.DR(life22_136, life24_144, life26_152)));
    }
    return this.a;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}

}
