package com.moon;


public class fr extends com.moon.e2<com.moon.module.impl.Flight> {

private static final long e;

public fr() {
super(com.moon.module.impl.Flight.class);
}


static {
e = (moom._c.a(-6869075977686533200L, -8097443862680668543L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(145472743339747L);
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public void a(com.moon.event.MoveEvent p0) {
net.minecraft.client.entity.EntityPlayerSP forwardValue182_27_0;
    net.minecraft.client.entity.EntityPlayerSP forwardValue182_31_0;
    int forwardValue182_31_1;
    net.minecraft.client.entity.EntityPlayerSP forwardValue182_35_0;
    net.minecraft.client.entity.EntityPlayerSP forwardValue182_36_0;
    double forwardValue182_36_1;
    java.lang.String[] spill182_0;
    net.minecraft.client.entity.EntityPlayerSP spill182_1;
    boolean spill182_2;
    long life2_3;
    float life5_12;
    java.lang.String[] life4_13;
    forward_join_36: {
    forward_join_35: {
    forward_join_31: {
    forward_join_27: {
    life2_3 = (com.moon.fr.e ^ 70987734319246L);
    spill182_0 = moom.Dr.b();
    life5_12 = ((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(((com.moon.module.impl.Flight)(((com.moon.module.impl.Flight)(((com.moon.fr)(this)).a())))).t)).getValue())))).floatValue();
    life4_13 = spill182_0;
    spill182_1 = ((net.minecraft.client.Minecraft)(com.moon.fr.a)).K;
    spill182_2 = ((moom.pz)(((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(com.moon.fr.a)).W)).aq)).a__Boolean();
    if (!((life4_13 != null))) {
        forwardValue182_31_0 = spill182_1;
        forwardValue182_31_1 = ((spill182_2) ? 1 : 0);
        break forward_join_31;
    }
    if (!(spill182_2)) {
        forwardValue182_27_0 = spill182_1;
        break forward_join_27;
    }
    forwardValue182_36_0 = spill182_1;
    forwardValue182_36_1 = ((double) (-life5_12));
    break forward_join_36;
    }
    forwardValue182_31_0 = forwardValue182_27_0;
    forwardValue182_31_1 = ((((moom.pz)(((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(com.moon.fr.a)).W)).ap)).a__Boolean()) ? 1 : 0);
    }
    if (!((forwardValue182_31_1 != 0))) {
        forwardValue182_35_0 = forwardValue182_31_0;
        break forward_join_35;
    }
    forwardValue182_36_0 = forwardValue182_31_0;
    forwardValue182_36_1 = ((double) life5_12);
    break forward_join_36;
    }
    forwardValue182_36_0 = forwardValue182_35_0;
    forwardValue182_36_1 = 0x0.0p0d;
    }
    ((net.minecraft.client.entity.EntityPlayerSP)(forwardValue182_36_0)).u = ((double)(forwardValue182_36_1));
    return;
}


public void a(com.moon.event.MotionEvent p0) {
java.lang.Object forwardValue181_17_0;
    net.minecraft.client.entity.EntityPlayerSP spill181_0;
    long life2_3;
    java.lang.String[] life4_5;
    float life5_25;
    forward_join_29: {
    forward_join_26: {
    forward_join_17: {
    life2_3 = (com.moon.fr.e ^ 6567881031326L);
    life4_5 = moom.Dr.b();
    spill181_0 = ((net.minecraft.client.Minecraft)(com.moon.fr.a)).K;
    if (!((life4_5 != null))) {
        forwardValue181_17_0 = spill181_0;
        break forward_join_17;
    }
    if (!(((net.minecraft.client.entity.EntityPlayerSP)(spill181_0)).ae())) {
        break forward_join_26;
    }
    forwardValue181_17_0 = ((com.moon.setting.FloatSetting)(((com.moon.module.impl.Flight)(((com.moon.module.impl.Flight)(((com.moon.fr)(this)).a())))).u)).getValue();
    }
    life5_25 = ((java.lang.Float)(((java.lang.Float)(forwardValue181_17_0)))).floatValue();
    ((com.moon.event.MotionEvent)(p0)).applyMotionSpeed(((double)(((double) life5_25))));
    if (!((life4_5 == null))) {
        break forward_join_29;
    }
    }
    ((com.moon.event.MotionEvent)(p0)).applyMotionSpeed(((double)(0x0.0p0d)));
    }
    return;
}

}
