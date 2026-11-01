package com.moon;


public class f3 extends com.moon.f0 {

private static final long c;

public f3() {
super();
}


static {
c = (moom._c.a(4129181703031484139L, -7431593198513637980L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(46109508129349L);
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public void b() {
((com.moon.f3)(this)).f();
    return;
}


public void c() {
return;
}


public void d() {
long local1 = (com.moon.f3.c ^ 60786560143766L);
    int local3 = __sourceIntrinsic_booleanToInteger(((com.moon.gd)(((com.moon.module.impl.KillAura)(((com.moon.f3)(this)).b)).a__gd())).a__Boolean());
    if ((local3 != 0)) {
        ((com.moon.f3)(this)).e();
    }
    return;
}


public void a(com.moon.event.MoveEvent p0) {
int forwardValue85_19_0;
    boolean spill85_0;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    int life5_28;
    forward_join_30: {
    forward_join_28: {
    forward_join_26: {
    forward_join_19: {
    life2_3 = (com.moon.f3.c ^ 9206582006671L);
    life4_5 = moom.DT.a__Arrayr3();
    if (!((((com.moon.event.MoveEvent)(p0)).getPhase() == com.moon.event.MovePhase.PRE))) {
        break forward_join_30;
    }
    spill85_0 = ((com.moon.f3)(this)).a__Boolean();
    if (!((life4_5 != null))) {
        forwardValue85_19_0 = ((spill85_0) ? 1 : 0);
        break forward_join_19;
    }
    if (!(spill85_0)) {
        break forward_join_30;
    }
    forwardValue85_19_0 = ((((com.moon.gd)(((com.moon.module.impl.KillAura)(((com.moon.f3)(this)).b)).a__gd())).a__Boolean()) ? 1 : 0);
    }
    life5_28 = forwardValue85_19_0;
    if (!((life4_5 != null))) {
        break forward_join_26;
    }
    if (!((life5_28 != 0))) {
        break forward_join_28;
    }
    ((com.moon.f3)(this)).e();
    }
    if (!((life4_5 == null))) {
        break forward_join_30;
    }
    }
    ((com.moon.f3)(this)).f();
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
