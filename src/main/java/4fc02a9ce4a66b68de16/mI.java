package com.moon;


public class mI extends com.moon.mA {

private final com.moon.nX h;

private final com.moon.setting.IntegerSetting s;

private boolean t;

private int u;

private static final long v;

public mI(com.moon.setting.IntegerSetting p0, float p1, float p2, float p3, float p4) {
super();
    this.h = new com.moon.nX();
    this.s = p0;
    this.e = p1;
    this.f = p2;
    this.g = p3;
    this.i = p4;
}


static {
v = (moom._c.a(-4552965487535575301L, -841568408660519668L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(250083120104084L);
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


private void c(int p0, int p1) {
int forwardValue707_66_0;
    boolean spill707_0;
    boolean spill707_1;
    long life3_3;
    com.moon.jC life6_13;
    float life7_21;
    float life8_23;
    float life9_29;
    float life10_35;
    float life11_53;
    int life5_59;
    com.moon.hW life12_83;
    forward_join_73: {
    forward_join_66: {
    life3_3 = (com.moon.mI.v ^ 121205561915495L);
    life6_13 = com.moon.jC.a(((float)(((com.moon.mI)(this)).l)), ((float)(((com.moon.mI)(this)).m)), ((float)(((com.moon.mI)(this)).n)), ((float)(((com.moon.mI)(this)).o)));
    life7_21 = (((com.moon.mI)(this)).d() - (((com.moon.mI)(this)).k * 0x1.0p1f));
    life8_23 = 0x1.cp1f;
    life9_29 = (((com.moon.mI)(this)).b() + ((com.moon.mI)(this)).k);
    spill707_0 = com.moon.mN.d__Boolean();
    life10_35 = (((com.moon.mI)(this)).a() + 0x1.cp3f);
    life11_53 = ((((com.moon.setting.IntegerSetting)(this.s)).getSliderValue() - ((float) ((com.moon.setting.IntegerSetting)(this.s)).getMin())) / ((float) (((com.moon.setting.IntegerSetting)(this.s)).getMax() - ((com.moon.setting.IntegerSetting)(this.s)).getMin())));
    ((com.moon.nX)(this.h)).a(((float)(life11_53)), ((double)(0x1.3333333333333p-2d)));
    life5_59 = ((spill707_0) ? 1 : 0);
    spill707_1 = this.t;
    if (!((life5_59 == 0))) {
        forwardValue707_66_0 = ((spill707_1) ? 1 : 0);
        break forward_join_66;
    }
    if (!(spill707_1)) {
        break forward_join_73;
    }
    forwardValue707_66_0 = p0;
    }
    if (!((forwardValue707_66_0 != this.u))) {
        break forward_join_73;
    }
    ((com.moon.nX)(this.h)).a(((float)(life11_53)));
    }
    life12_83 = ((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.ROUNDED_RECTANGLE))))).a();
    ((com.moon.hW)(life12_83)).a(((com.moon.iX)(com.moon.i3.a(((float)(life9_29)), ((float)(life10_35)), ((float)(life7_21)), ((float)(life8_23)), ((float)(0x1.8p-1f)), ((int)(((com.v)(((com.moon.mI)(this)).p)).u()))))));
    ((com.moon.hW)(life12_83)).a(((com.moon.iX)(com.moon.i3.a(((float)(life9_29)), ((float)(life10_35)), ((float)((life7_21 * ((com.moon.nX)(this.h)).b()))), ((float)(life8_23)), ((float)(0x1.8p-1f)), ((int)(((com.v)(((com.moon.mI)(this)).p)).a()))))));
    ((com.moon.hW)(life12_83)).a(((com.moon.iX)(com.moon.i3.a(((float)(moom.Dr.a(((float)(((life9_29 + (life7_21 * ((com.moon.nX)(this.h)).b())) - 0x1.4p2f))), ((float)((((com.moon.mI)(this)).e + ((com.moon.mI)(this)).k))), ((float)((((((com.moon.mI)(this)).e + ((com.moon.mI)(this)).g) - ((com.moon.mI)(this)).k) - 0x1.7p3f)))))), ((float)((life10_35 - 0x1.0p2f))), ((float)(0x1.7p3f)), ((float)(0x1.7p3f)), ((float)(0x1.3p2f)), ((int)(((com.v)(((com.moon.mI)(this)).p)).a()))))));
    ((com.moon.hW)(life12_83)).a(((com.moon.jA)(life6_13)));
    ((com.moon.hW)(life12_83)).b();
    return;
}


private void d__sourceReturn_da8c82d5d4() {
java.lang.Object local1 = com.moon.jC.a(((float)(((com.moon.mI)(this)).l)), ((float)(((com.moon.mI)(this)).m)), ((float)(((com.moon.mI)(this)).n)), ((float)(((com.moon.mI)(this)).o)));
    java.lang.Object local2 = ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.IntegerSetting)(this.s)).getValue())))).toString();
    float local3 = ((com.moon.jm)(((com.moon.mI)(this)).a)).a(((java.lang.String)(local2)), ((float)(0x1.0p3f)));
    java.lang.Object local4 = ((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.MSDF))))).a(((com.moon.jm)(((com.moon.mI)(this)).a))))).a();
    ((com.moon.jm)(((com.moon.mI)(this)).a)).b(((com.moon.hW)(local4)), ((java.lang.String)(((com.moon.setting.IntegerSetting)(this.s)).getDisplayName())), ((float)(0x1.0p3f)), ((float)((((com.moon.mI)(this)).b() + ((com.moon.mI)(this)).k))), ((float)(((com.moon.mI)(this)).a())), ((int)(((com.v)(((com.moon.mI)(this)).p)).v())));
    ((com.moon.jm)(((com.moon.mI)(this)).a)).b(((com.moon.hW)(local4)), ((java.lang.String)(local2)), ((float)(0x1.0p3f)), ((float)((((((com.moon.mI)(this)).b() + ((com.moon.mI)(this)).d()) - local3) - ((com.moon.mI)(this)).k))), ((float)(((com.moon.mI)(this)).a())), ((int)(((com.v)(((com.moon.mI)(this)).p)).v())));
    ((com.moon.hW)(local4)).a(((com.moon.jA)(local1)));
    ((com.moon.hW)(local4)).b();
    return;
}


public void a(int p0, int p1) {
((com.moon.mI)(this)).c__Void();
    ((com.moon.mI)(this)).d__sourceReturn_da8c82d5d4();
    ((com.moon.mI)(this)).a(((int)(p0)));
    ((com.moon.mI)(this)).c(((int)(p0)), ((int)(p1)));
    ((com.moon.mI)(this)).j = ((float)(0x1.5p4f));
    super.a(((int)(p0)), ((int)(p1)));
    return;
}


public boolean a__Boolean() {
return (__sourceIntrinsic_booleanComparison((((com.moon.setting.IntegerSetting)(this.s)).isAvailable())) != 0);
}


public void a(int p0, int p1, int p2) {
this.t = ((boolean)(false));
    super.a(((int)(p0)), ((int)(p1)), ((int)(p2)));
    return;
}


private void a(int p0) {
com.moon.mI forwardValue705_12_0;
    com.moon.mI spill705_0;
    long life2_3;
    int life4_5;
    float life5_21;
    float life6_26;
    float life7_47;
    forward_join_55: {
    forward_join_12: {
    life2_3 = (com.moon.mI.v ^ 42961111135095L);
    life4_5 = ((com.moon.mN.e__Boolean()) ? 1 : 0);
    spill705_0 = this;
    if (!((life4_5 != 0))) {
        forwardValue705_12_0 = spill705_0;
        break forward_join_12;
    }
    if (!(((com.moon.mI)(spill705_0)).t)) {
        break forward_join_55;
    }
    forwardValue705_12_0 = this;
    }
    life5_21 = (((com.moon.mI)(forwardValue705_12_0)).d() - 0x1.4p3f);
    life6_26 = (((com.moon.mI)(this)).b() + 0x1.4p2f);
    life7_47 = ((((((float) p0) - life6_26) * ((float) (((com.moon.setting.IntegerSetting)(this.s)).getMax() - ((com.moon.setting.IntegerSetting)(this.s)).getMin()))) / life5_21) + ((float) ((com.moon.setting.IntegerSetting)(this.s)).getMin()));
    ((com.moon.setting.IntegerSetting)(this.s)).setValueFromSlider(((float)(moom.Dr.a(((float)(life7_47)), ((float)(((float) ((com.moon.setting.IntegerSetting)(this.s)).getMin()))), ((float)(((float) ((com.moon.setting.IntegerSetting)(this.s)).getMax())))))));
    }
    return;
}


public boolean a__Boolean(int p0, int p1, int p2) {
int forwardValue706_49_0;
    boolean spill706_0;
    boolean spill706_1;
    long life4_3;
    float life7_12;
    int life6_13;
    float life8_15;
    float life9_21;
    float life10_26;
    forward_join_49: {
    forward_join_44: {
    life4_3 = (com.moon.mI.v ^ 69197852599398L);
    spill706_0 = com.moon.mN.d__Boolean();
    life7_12 = (((com.moon.mI)(this)).d() - (((com.moon.mI)(this)).k * 0x1.0p1f));
    life6_13 = ((spill706_0) ? 1 : 0);
    life8_15 = 0x1.8p3f;
    life9_21 = (((com.moon.mI)(this)).b() + ((com.moon.mI)(this)).k);
    life10_26 = (((com.moon.mI)(this)).a() + 0x1.4p3f);
    spill706_1 = ((com.moon.mI)(this)).a(((int)(p0)), ((int)(p1)), ((float)(life9_21)), ((float)(life10_26)), ((float)(life7_12)), ((float)(life8_15)));
    if (!((life6_13 == 0))) {
        forwardValue706_49_0 = ((spill706_1) ? 1 : 0);
        break forward_join_49;
    }
    if (!(spill706_1)) {
        break forward_join_44;
    }
    this.t = ((boolean)(true));
    this.u = ((int)(p0));
    }
    forwardValue706_49_0 = ((super.a__Boolean(((int)(p0)), ((int)(p1)), ((int)(p2)))) ? 1 : 0);
    }
    return ((forwardValue706_49_0) != 0);
}


private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
