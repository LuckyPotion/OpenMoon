package com.moon;


public class fT extends com.moon.e2<com.moon.module.impl.Timer> {

private static final long e;

public fT() {
super(com.moon.module.impl.Timer.class);
}


static {
e = (moom._c.a(-6530489282349011841L, 780947493042011369L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(226694957011704L);
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public void c() {
((moom.DM)(((net.minecraft.client.Minecraft)(com.moon.fT.a)).l)).c = ((float)(0x1.0p0f));
    return;
}


public void a(com.moon.event.MoveEvent p0) {
moom.DM forwardValue142_39_0;
    moom.DM forwardValue142_44_0;
    java.lang.Object forwardValue142_44_1;
    moom.DM forwardValue142_46_0;
    float forwardValue142_46_1;
    moom.DM forwardValue142_47_0;
    moom.DM forwardValue142_48_0;
    float forwardValue142_48_1;
    moom.DM spill142_0;
    float spill142_1;
    java.lang.Boolean spill142_2;
    long life2_3;
    int life4_5;
    forward_join_49: {
    forward_join_48: {
    forward_join_47: {
    forward_join_46: {
    forward_join_44: {
    forward_join_39: {
    life2_3 = (com.moon.fT.e ^ 23633880254287L);
    life4_5 = ((moom.sJ.ac()) ? 1 : 0);
    if (!((((com.moon.event.MoveEvent)(p0)).getPhase() == com.moon.event.MovePhase.PRE))) {
        break forward_join_49;
    }
    spill142_0 = ((net.minecraft.client.Minecraft)(com.moon.fT.a)).l;
    spill142_1 = (((float) ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fT.a)).K)).S) % ((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(((com.moon.module.impl.Timer)(((com.moon.module.impl.Timer)(((com.moon.fT)(this)).a())))).c__kZ())).getValue())))).floatValue());
    if (!((life4_5 != 0))) {
        forwardValue142_46_0 = spill142_0;
        forwardValue142_46_1 = spill142_1;
        break forward_join_46;
    }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(spill142_1)), ((float)(0x0.0p0f))) != 0))) {
        forwardValue142_39_0 = spill142_0;
        break forward_join_39;
    }
    spill142_2 = ((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.Timer)(((com.moon.module.impl.Timer)(((com.moon.fT)(this)).a())))).a__kV())).getValue()));
    if (!((life4_5 != 0))) {
        forwardValue142_44_0 = spill142_0;
        forwardValue142_44_1 = spill142_2;
        break forward_join_44;
    }
    if (!((!((java.lang.Boolean)(spill142_2)).booleanValue()))) {
        forwardValue142_47_0 = spill142_0;
        break forward_join_47;
    }
    forwardValue142_39_0 = spill142_0;
    }
    forwardValue142_44_0 = forwardValue142_39_0;
    forwardValue142_44_1 = ((com.moon.setting.FloatSetting)(((com.moon.module.impl.Timer)(((com.moon.module.impl.Timer)(((com.moon.fT)(this)).a())))).a__kZ())).getValue();
    }
    forwardValue142_46_0 = forwardValue142_44_0;
    forwardValue142_46_1 = ((java.lang.Float)(((java.lang.Float)(forwardValue142_44_1)))).floatValue();
    }
    forwardValue142_48_0 = forwardValue142_46_0;
    forwardValue142_48_1 = forwardValue142_46_1;
    break forward_join_48;
    }
    forwardValue142_48_0 = forwardValue142_47_0;
    forwardValue142_48_1 = 0x1.0p0f;
    }
    ((moom.DM)(forwardValue142_48_0)).c = ((float)(forwardValue142_48_1));
    }
    return;
}

}
