package com.moon;


public class fq extends com.moon.e2<com.moon.module.impl.Flight> {

private static final long e;

public fq() {
super(com.moon.module.impl.Flight.class);
}


static {
e = (moom._c.a(9053085270499402877L, 6551514972176843561L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(30277501667682L);
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public void a(com.moon.event.MoveEvent p0) {
net.minecraft.client.entity.EntityPlayerSP forwardValue180_34_0;
    net.minecraft.client.entity.EntityPlayerSP forwardValue180_38_0;
    int forwardValue180_38_1;
    net.minecraft.client.entity.EntityPlayerSP forwardValue180_42_0;
    net.minecraft.client.entity.EntityPlayerSP forwardValue180_43_0;
    double forwardValue180_43_1;
    java.lang.String[] spill180_0;
    net.minecraft.client.entity.EntityPlayerSP spill180_1;
    boolean spill180_2;
    long life2_3;
    float life5_12;
    java.lang.String[] life4_20;
    forward_join_49: {
    forward_join_43: {
    forward_join_42: {
    forward_join_38: {
    forward_join_34: {
    life2_3 = (com.moon.fq.e ^ 73467581335934L);
    spill180_0 = moom.Dr.b();
    life5_12 = ((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(((com.moon.module.impl.Flight)(((com.moon.module.impl.Flight)(((com.moon.fq)(this)).a())))).t)).getValue())))).floatValue();
    ((com.moon.event.MoveEvent)(p0)).setY(((double)((((com.moon.event.MoveEvent)(p0)).getY() - 0x1.3498f1b1336fp-12d))));
    life4_20 = spill180_0;
    spill180_1 = ((net.minecraft.client.Minecraft)(com.moon.fq.a)).K;
    spill180_2 = ((moom.pz)(((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(com.moon.fq.a)).W)).aq)).a__Boolean();
    if (!((life4_20 != null))) {
        forwardValue180_38_0 = spill180_1;
        forwardValue180_38_1 = ((spill180_2) ? 1 : 0);
        break forward_join_38;
    }
    if (!(spill180_2)) {
        forwardValue180_34_0 = spill180_1;
        break forward_join_34;
    }
    forwardValue180_43_0 = spill180_1;
    forwardValue180_43_1 = ((double) (-life5_12));
    break forward_join_43;
    }
    forwardValue180_38_0 = forwardValue180_34_0;
    forwardValue180_38_1 = ((((moom.pz)(((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(com.moon.fq.a)).W)).ap)).a__Boolean()) ? 1 : 0);
    }
    if (!((forwardValue180_38_1 != 0))) {
        forwardValue180_42_0 = forwardValue180_38_0;
        break forward_join_42;
    }
    forwardValue180_43_0 = forwardValue180_38_0;
    forwardValue180_43_1 = ((double) life5_12);
    break forward_join_43;
    }
    forwardValue180_43_0 = forwardValue180_42_0;
    forwardValue180_43_1 = 0x0.0p0d;
    }
    ((net.minecraft.client.entity.EntityPlayerSP)(forwardValue180_43_0)).u = ((double)(forwardValue180_43_1));
    if (!((net.minecraft.entity.Entity.b__ArrayString() != null))) {
        break forward_join_49;
    }
    moom.Dr.b(((java.lang.String[])(new java.lang.String[1])));
    }
    return;
}


public void a(com.moon.event.MotionEvent p0) {
long local2 = (com.moon.fq.e ^ 102303765179259L);
    if ((__sourceIntrinsic_booleanComparison(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fq.a)).K)).ae()) != 0)) {
        ((com.moon.event.MotionEvent)(p0)).applyMotionSpeed(((double)(0x1.a3d70ap-1d)));
    }
    return;
}


private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
