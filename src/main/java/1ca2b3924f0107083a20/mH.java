package com.moon;


public class mH extends com.moon.mA {

private final com.moon.nX h;

private final com.moon.setting.FloatSetting s;

private boolean t;

private float u;

private static final long v;

public mH(com.moon.setting.FloatSetting p0, float p1, float p2, float p3, float p4) {
super();
    this.h = new com.moon.nX();
    this.s = p0;
    this.e = p1;
    this.f = p2;
    this.g = p3;
    this.i = p4;
}


static {
v = (moom._c.a(-491950021812540536L, 2547911371162564296L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(12510816466288L);
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


private void c(int p0, int p1) {
int forwardValue704_68_0;
    boolean spill704_0;
    boolean spill704_1;
    long life3_3;
    com.moon.jC life6_13;
    float life7_21;
    float life8_23;
    float life9_30;
    float life10_35;
    float life11_51;
    int life5_52;
    com.moon.hW life12_86;
    forward_join_73: {
    forward_join_68: {
    life3_3 = (com.moon.mH.v ^ 61869337623715L);
    life6_13 = com.moon.jC.a(((float)(((com.moon.mH)(this)).l)), ((float)(((com.moon.mH)(this)).m)), ((float)(((com.moon.mH)(this)).n)), ((float)(((com.moon.mH)(this)).o)));
    life7_21 = (((com.moon.mH)(this)).d() - (((com.moon.mH)(this)).k * 0x1.0p1f));
    life8_23 = 0x1.cp1f;
    spill704_0 = com.moon.mN.d__Boolean();
    life9_30 = (((com.moon.mH)(this)).b() + ((com.moon.mH)(this)).k);
    life10_35 = (((com.moon.mH)(this)).a() + 0x1.cp3f);
    life11_51 = ((((com.moon.setting.FloatSetting)(this.s)).getSliderValue() - ((com.moon.setting.FloatSetting)(this.s)).getMin()) / (((com.moon.setting.FloatSetting)(this.s)).getMax() - ((com.moon.setting.FloatSetting)(this.s)).getMin()));
    life5_52 = ((spill704_0) ? 1 : 0);
    ((com.moon.nX)(this.h)).a(((float)(life11_51)), ((double)(0x1.3333333333333p-2d)));
    spill704_1 = this.t;
    if (!((life5_52 == 0))) {
        forwardValue704_68_0 = ((spill704_1) ? 1 : 0);
        break forward_join_68;
    }
    if (!(spill704_1)) {
        break forward_join_73;
    }
    forwardValue704_68_0 = recovery.source.CarrierOps.fcmpl(((float)(((float) p0))), ((float)(this.u)));
    }
    if (!((forwardValue704_68_0 != 0))) {
        break forward_join_73;
    }
    ((com.moon.nX)(this.h)).a(((float)(life11_51)));
    }
    life12_86 = ((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.ROUNDED_RECTANGLE))))).a();
    ((com.moon.hW)(life12_86)).a(((com.moon.iX)(com.moon.i3.a(((float)(life9_30)), ((float)(life10_35)), ((float)(life7_21)), ((float)(life8_23)), ((float)(0x1.8p-1f)), ((int)(((com.v)(((com.moon.mH)(this)).p)).u()))))));
    ((com.moon.hW)(life12_86)).a(((com.moon.iX)(com.moon.i3.a(((float)(life9_30)), ((float)(life10_35)), ((float)((life7_21 * ((com.moon.nX)(this.h)).b()))), ((float)(life8_23)), ((float)(0x1.8p-1f)), ((int)(((com.v)(((com.moon.mH)(this)).p)).a()))))));
    ((com.moon.hW)(life12_86)).a(((com.moon.iX)(com.moon.i3.a(((float)(moom.Dr.a(((float)(((life9_30 + (life7_21 * ((com.moon.nX)(this.h)).b())) - 0x1.4p2f))), ((float)((((com.moon.mH)(this)).e + ((com.moon.mH)(this)).k))), ((float)((((((com.moon.mH)(this)).e + ((com.moon.mH)(this)).g) - ((com.moon.mH)(this)).k) - 0x1.7p3f)))))), ((float)((life10_35 - 0x1.0p2f))), ((float)(0x1.7p3f)), ((float)(0x1.7p3f)), ((float)(0x1.3p2f)), ((int)(((com.v)(((com.moon.mH)(this)).p)).a()))))));
    ((com.moon.hW)(life12_86)).a(((com.moon.jA)(life6_13)));
    ((com.moon.hW)(life12_86)).b();
    return;
}


private void d__sourceReturn_da8c82d5d4() {
java.lang.Object local1 = com.moon.jC.a(((float)(((com.moon.mH)(this)).l)), ((float)(((com.moon.mH)(this)).m)), ((float)(((com.moon.mH)(this)).n)), ((float)(((com.moon.mH)(this)).o)));
    java.lang.Object local2 = ((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(this.s)).getValue())))).toString();
    float local3 = ((com.moon.jm)(((com.moon.mH)(this)).a)).a(((java.lang.String)(local2)), ((float)(0x1.0p3f)));
    java.lang.Object local4 = ((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.MSDF))))).a(((com.moon.jm)(((com.moon.mH)(this)).a))))).a();
    ((com.moon.jm)(((com.moon.mH)(this)).a)).b(((com.moon.hW)(local4)), ((java.lang.String)(((com.moon.setting.FloatSetting)(this.s)).getDisplayName())), ((float)(0x1.0p3f)), ((float)((((com.moon.mH)(this)).b() + ((com.moon.mH)(this)).k))), ((float)(((com.moon.mH)(this)).a())), ((int)(((com.v)(((com.moon.mH)(this)).p)).v())));
    float local5 = (((((com.moon.mH)(this)).e + ((com.moon.mH)(this)).d()) - local3) - ((com.moon.mH)(this)).k);
    ((com.moon.jm)(((com.moon.mH)(this)).a)).b(((com.moon.hW)(local4)), ((java.lang.String)(local2)), ((float)(0x1.0p3f)), ((float)(local5)), ((float)(((com.moon.mH)(this)).a())), ((int)(((com.v)(((com.moon.mH)(this)).p)).v())));
    ((com.moon.hW)(local4)).a(((com.moon.jA)(local1)));
    ((com.moon.hW)(local4)).b();
    return;
}


public void a(int p0, int p1) {
((com.moon.mH)(this)).c__Void();
    ((com.moon.mH)(this)).d__sourceReturn_da8c82d5d4();
    ((com.moon.mH)(this)).a(((int)(p0)));
    ((com.moon.mH)(this)).c(((int)(p0)), ((int)(p1)));
    ((com.moon.mH)(this)).j = ((float)(0x1.5p4f));
    super.a(((int)(p0)), ((int)(p1)));
    return;
}


public boolean a__Boolean() {
return (__sourceIntrinsic_booleanComparison((((com.moon.setting.FloatSetting)(this.s)).isAvailable())) != 0);
}


public void a(int p0, int p1, int p2) {
this.t = ((boolean)(false));
    super.a(((int)(p0)), ((int)(p1)), ((int)(p2)));
    return;
}


private void a(int p0) {
com.moon.mH forwardValue702_12_0;
    com.moon.mH spill702_0;
    long life2_3;
    int life4_5;
    float life5_21;
    float life6_26;
    float life7_45;
    forward_join_52: {
    forward_join_12: {
    life2_3 = (com.moon.mH.v ^ 35222020007500L);
    life4_5 = ((com.moon.mN.d__Boolean()) ? 1 : 0);
    spill702_0 = this;
    if (!((life4_5 == 0))) {
        forwardValue702_12_0 = spill702_0;
        break forward_join_12;
    }
    if (!(((com.moon.mH)(spill702_0)).t)) {
        break forward_join_52;
    }
    forwardValue702_12_0 = this;
    }
    life5_21 = (((com.moon.mH)(forwardValue702_12_0)).d() - 0x1.4p3f);
    life6_26 = (((com.moon.mH)(this)).b() + 0x1.4p2f);
    life7_45 = ((((((float) p0) - life6_26) * (((com.moon.setting.FloatSetting)(this.s)).getMax() - ((com.moon.setting.FloatSetting)(this.s)).getMin())) / life5_21) + ((com.moon.setting.FloatSetting)(this.s)).getMin());
    ((com.moon.setting.FloatSetting)(this.s)).setValue(((java.lang.Float)(java.lang.Float.valueOf(((float)(moom.Dr.a(((float)(life7_45)), ((float)(((com.moon.setting.FloatSetting)(this.s)).getMin())), ((float)(((com.moon.setting.FloatSetting)(this.s)).getMax())))))))));
    }
    return;
}


public boolean a__Boolean(int p0, int p1, int p2) {
int forwardValue703_50_0;
    boolean spill703_0;
    boolean spill703_1;
    long life4_3;
    float life7_12;
    int life6_13;
    float life8_15;
    float life9_21;
    float life10_26;
    forward_join_50: {
    forward_join_45: {
    life4_3 = (com.moon.mH.v ^ 63930436382705L);
    spill703_0 = com.moon.mN.e__Boolean();
    life7_12 = (((com.moon.mH)(this)).d() - (((com.moon.mH)(this)).k * 0x1.0p1f));
    life6_13 = ((spill703_0) ? 1 : 0);
    life8_15 = 0x1.8p3f;
    life9_21 = (((com.moon.mH)(this)).b() + ((com.moon.mH)(this)).k);
    life10_26 = (((com.moon.mH)(this)).a() + 0x1.4p3f);
    spill703_1 = ((com.moon.mH)(this)).a(((int)(p0)), ((int)(p1)), ((float)(life9_21)), ((float)(life10_26)), ((float)(life7_12)), ((float)(life8_15)));
    if (!((life6_13 != 0))) {
        forwardValue703_50_0 = ((spill703_1) ? 1 : 0);
        break forward_join_50;
    }
    if (!(spill703_1)) {
        break forward_join_45;
    }
    this.t = ((boolean)(true));
    this.u = ((float)(((float) p0)));
    }
    forwardValue703_50_0 = ((super.a__Boolean(((int)(p0)), ((int)(p1)), ((int)(p2)))) ? 1 : 0);
    }
    return ((forwardValue703_50_0) != 0);
}


private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
