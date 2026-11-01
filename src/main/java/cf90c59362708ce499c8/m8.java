package com.moon;


public class m8 extends com.moon.m5 {

private final com.moon.nX n;

private final com.moon.setting.ButtonSetting o;

private static final long p;

public m8(com.moon.nh p0, com.moon.setting.ButtonSetting p1, float p2, float p3, float p4, float p5) {
super(p0, p2, p3, p4, p5);
    this.n = new com.moon.nX();
    this.o = p1;
}


static {
com.moon.m8.p = (moom._c.a(-1227546027420568221L, -5607894646149677652L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(213338769025024L);
}


public boolean c__Boolean() {
return (__sourceIntrinsic_booleanComparison((((com.moon.setting.ButtonSetting)(this.o)).isAvailable())) != 0);
}


public void c(int p0, int p1) {
long local3 = (com.moon.m8.p ^ 127042958135632L);
    float local5 = (((com.moon.m8)(this)).a() + 0x1.0p3f);
    float local6 = (((com.moon.m8)(this)).b() + 0x1.2p2f);
    float local7 = (((com.moon.m8)(this)).c() - 0x1.0p4f);
    com.moon.jm local8 = ((com.moon.jo)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__jo())).a(((com.moon.ce)(com.moon.ce.INTER_MEDIUM)));
    com.moon.hW local9 = ((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.ROUNDED_RECTANGLE))))).a();
    com.moon.hW local10 = ((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.MSDF))))).a(((com.moon.jm)(local8))))).a();
    ((com.moon.hW)(local9)).a(((com.moon.iX)(com.moon.i3.a(((float)(local5)), ((float)(local6)), ((float)(local7)), ((float)(0x1.5p4f)), ((float)(0x1.8p2f)), ((int)(((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.ColorSetting)(((com.moon.module.impl.ClickGUI)(((com.moon.m8)(this)).a__lS())).a__kX())).getValue())))).intValue()))))));
    ((com.moon.hW)(local9)).a(((com.moon.iX)(com.moon.i3.a(((float)(local5)), ((float)(local6)), ((float)(local7)), ((float)(0x1.5p4f)), ((float)(0x1.8p2f)), ((int)(((com.moon.aO)(((com.moon.aO)(((com.moon.aO)(new com.moon.aO(((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.ColorSetting)(((com.moon.module.impl.ClickGUI)(((com.moon.m8)(this)).a__lS())).a__kX())).getValue())))).intValue()))).b())).a(((float)(((com.moon.nX)(this.n)).b()))))).getRGB()))))));
    ((com.moon.jm)(local8)).b(((com.moon.hW)(local10)), ((java.lang.String)(((com.moon.setting.ButtonSetting)(this.o)).getDisplayName())), ((float)(0x1.ep2f)), ((float)(((local5 + (local7 / 0x1.0p1f)) - (((com.moon.jm)(local8)).a(((java.lang.String)(((com.moon.setting.ButtonSetting)(this.o)).getDisplayName())), ((float)(0x1.ep2f))) / 0x1.0p1f)))), ((float)((((local6 + 0x1.5p3f) - (((com.moon.jm)(local8)).a(((float)(0x1.ep2f))) / 0x1.0p1f)) + 0x1.0p-1f))), ((int)(-1)));
    ((com.moon.hW)(local9)).b();
    ((com.moon.hW)(local10)).b();
    ((com.moon.nX)(this.n)).a(((float)((((com.moon.m8)(this)).a(((int)(p0)), ((int)(p1)), ((float)(local5)), ((float)(local6)), ((float)(local7)), ((float)(0x1.5p4f))) ? 0x1.0p0f : 0x0.0p0f))), ((double)(0x1.333334p-2d)));
    this.k = ((float)(0x1.98p4f));
    super.c(((int)(p0)), ((int)(p1)));
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(int p0, int p1, int p2) {
com.moon.m8 forwardValue674_43_0;
    int forwardValue674_43_1;
    int forwardValue674_43_2;
    net.minecraft.entity.Entity[] spill674_0;
    com.moon.m8 spill674_1;
    int spill674_2;
    int spill674_3;
    long life4_3;
    float life7_9;
    float life8_14;
    net.minecraft.entity.Entity[] life6_15;
    float life9_20;
    forward_join_43: {
    forward_join_40: {
    life4_3 = (com.moon.m8.p ^ 97614938233102L);
    spill674_0 = moom.lw.b__Arrayr3();
    life7_9 = (((com.moon.m8)(this)).a() + 0x1.0p3f);
    life8_14 = (((com.moon.m8)(this)).b() + 0x1.2p2f);
    life6_15 = spill674_0;
    life9_20 = (((com.moon.m8)(this)).c() - 0x1.0p4f);
    spill674_1 = this;
    spill674_2 = p0;
    spill674_3 = p1;
    if (!((life6_15 == null))) {
        forwardValue674_43_0 = spill674_1;
        forwardValue674_43_1 = spill674_2;
        forwardValue674_43_2 = spill674_3;
        break forward_join_43;
    }
    if (!(((com.moon.m8)(spill674_1)).a(((int)(spill674_2)), ((int)(spill674_3)), ((float)(life7_9)), ((float)(life8_14)), ((float)(life9_20)), ((float)(0x1.5p4f))))) {
        break forward_join_40;
    }
    if (!((p2 == 0))) {
        break forward_join_40;
    }
    ((com.moon.kR)(((com.moon.setting.ButtonSetting)(this.o)).getChangeListener())).accept(((java.lang.Object)(null)), ((java.lang.Object)(null)));
    }
    forwardValue674_43_0 = this;
    forwardValue674_43_1 = p0;
    forwardValue674_43_2 = p1;
    }
    __sourceIntrinsic_e4d4f5a69301_call674_9(forwardValue674_43_0, forwardValue674_43_1, forwardValue674_43_2, p2);
    return;
}


public com.moon.setting.Setting a__sourceReturn_7d3c444d39() {
return this.o;
}


private static native <E extends Throwable> void __sourceIntrinsic_e4d4f5a69301_call674_9(com.moon.m8 a0, int a1, int a2, int a3) throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
