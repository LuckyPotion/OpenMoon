package com.moon;


public class f1 extends com.moon.f0 {

private static final long c;

public f1() {
super();
}


static {
c = (moom._c.a(7815580556729063390L, -3861837609988439923L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(154341654574399L);
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public void b() {
((com.moon.f1)(this)).f();
    return;
}


public void c() {
return;
}


public void d() {
long local1 = (com.moon.f1.c ^ 75737538218619L);
    int local3 = __sourceIntrinsic_booleanToInteger(((com.moon.gd)(((com.moon.module.impl.KillAura)(((com.moon.f1)(this)).b)).a__gd())).a__Boolean());
    if ((local3 != 0)) {
        ((com.moon.f1)(this)).e();
    }
    return;
}


public void a(com.moon.event.MoveEvent p0) {
int forwardValue84_19_0;
    int forwardValue84_40_0;
    boolean spill84_0;
    int spill84_1;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    int life5_28;
    int life6_33;
    double life7_38;
    forward_join_47: {
    forward_join_45: {
    forward_join_40: {
    forward_join_19: {
    life2_3 = (com.moon.f1.c ^ 136294064719970L);
    life4_5 = moom.DT.a__Arrayr3();
    if (!((((com.moon.event.MoveEvent)(p0)).getPhase() == com.moon.event.MovePhase.PRE))) {
        break forward_join_47;
    }
    spill84_0 = ((com.moon.f1)(this)).a__Boolean();
    if (!((life4_5 != null))) {
        forwardValue84_19_0 = ((spill84_0) ? 1 : 0);
        break forward_join_19;
    }
    if (!(spill84_0)) {
        break forward_join_47;
    }
    forwardValue84_19_0 = ((((com.moon.gd)(((com.moon.module.impl.KillAura)(((com.moon.f1)(this)).b)).a__gd())).a__Boolean()) ? 1 : 0);
    }
    life5_28 = forwardValue84_19_0;
    life6_33 = ((com.moon.ga)(((com.moon.module.impl.KillAura)(((com.moon.f1)(this)).b)).a__ga())).a__Int();
    life7_38 = ((com.moon.ga)(((com.moon.module.impl.KillAura)(((com.moon.f1)(this)).b)).a__ga())).b();
    spill84_1 = life5_28;
    if (!((life4_5 != null))) {
        forwardValue84_40_0 = spill84_1;
        break forward_join_40;
    }
    if (!((spill84_1 != 0))) {
        break forward_join_45;
    }
    forwardValue84_40_0 = recovery.source.CarrierOps.dcmpg(((double)(((double) life6_33))), ((double)((life7_38 - 0x1.0p0d))));
    }
    if (!((forwardValue84_40_0 < 0))) {
        break forward_join_45;
    }
    ((com.moon.f1)(this)).e();
    if (!((life4_5 == null))) {
        break forward_join_47;
    }
    }
    ((com.moon.f1)(this)).f();
    }
    return;
}


public void a(com.moon.event.PacketEvent p0) {
return;
}


public void a__Void() {
return;
}


private static native int __sourceIntrinsic_booleanToInteger(boolean value);
}
