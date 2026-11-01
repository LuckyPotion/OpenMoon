package com.moon;


public class fp extends com.moon.e2<com.moon.module.impl.Flight> {

private int e;

private double f;

private boolean g;

private double h;

private boolean i;

private static final long j;

public fp() {
super(com.moon.module.impl.Flight.class);
}


static {
j = (moom._c.a(-5537107935686911301L, -4450756436525761632L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(264469953233616L);
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public void b() {
this.e = ((int)(0));
    this.f = ((double)(0x0.0p0d));
    this.h = ((double)(0x0.0p0d));
    this.i = ((boolean)(false));
    this.g = ((boolean)(false));
    return;
}


public void a(com.moon.event.MoveEvent p0) {
net.minecraft.client.entity.EntityPlayerSP forwardValue179_52_0;
    net.minecraft.client.entity.EntityPlayerSP spill179_0;
    long life2_3;
    java.lang.String[] life4_5;
    double life5_17;
    double life7_25;
    forward_join_58: {
    forward_join_54: {
    forward_join_52: {
    life2_3 = (com.moon.fp.j ^ 107949426825093L);
    life4_5 = moom.Dr.b();
    if (!((((com.moon.event.MoveEvent)(p0)).getPhase() == com.moon.event.MovePhase.PRE))) {
        break forward_join_58;
    }
    life5_17 = (((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fp.a)).K)).n - ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fp.a)).K)).k);
    life7_25 = (((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fp.a)).K)).p - ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fp.a)).K)).m);
    this.h = ((double)(java.lang.Math.sqrt(((double)(((life5_17 * life5_17) + (life7_25 * life7_25)))))));
    spill179_0 = ((net.minecraft.client.Minecraft)(com.moon.fp.a)).K;
    if (!((life4_5 != null))) {
        forwardValue179_52_0 = spill179_0;
        break forward_join_52;
    }
    if (!((!((net.minecraft.client.entity.EntityPlayerSP)(spill179_0)).A))) {
        break forward_join_54;
    }
    ((com.moon.event.MoveEvent)(p0)).setY(((double)((((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fp.a)).K)).o - 0x1.47ae147ae147bp-8d))));
    forwardValue179_52_0 = ((net.minecraft.client.Minecraft)(com.moon.fp.a)).K;
    }
    ((net.minecraft.client.entity.EntityPlayerSP)(forwardValue179_52_0)).u = ((double)(0x0.0p0d));
    }
    ((com.moon.event.MoveEvent)(p0)).a(((boolean)(true)));
    }
    return;
}


public void a(com.moon.event.MotionEvent p0) {
com.moon.fp forwardValue178_37_0;
    int forwardValue178_52_0;
    int forwardValue178_82_0;
    com.moon.fp forwardValue178_89_0;
    double forwardValue178_89_1;
    boolean spill178_0;
    com.moon.fp spill178_1;
    com.moon.event.MotionEvent spill178_2;
    double spill178_3;
    com.moon.fp spill178_4;
    double spill178_5;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_90: {
    forward_join_89: {
    forward_join_87: {
    forward_join_82: {
    forward_join_68: {
    forward_join_52: {
    forward_join_50: {
    forward_join_37: {
    forward_join_36: {
    life2_3 = (com.moon.fp.j ^ 57985267822492L);
    life4_5 = moom.Dr.b();
    spill178_0 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fp.a)).K)).A;
    if (!((life4_5 != null))) {
        forwardValue178_52_0 = ((spill178_0) ? 1 : 0);
        break forward_join_52;
    }
    if (!(spill178_0)) {
        break forward_join_50;
    }
    spill178_1 = this;
    if (!((life4_5 != null))) {
        forwardValue178_37_0 = spill178_1;
        break forward_join_37;
    }
    if (!(((com.moon.fp)(spill178_1)).g)) {
        break forward_join_36;
    }
    spill178_2 = p0;
    net.minecraft.client.entity.EntityPlayerSP __stackOp178_9_0 = ((net.minecraft.client.Minecraft)(com.moon.fp.a)).K;
    double __stackOp178_9_1 = 0x1.ae147ap-2d;
    spill178_3 = __stackOp178_9_1;
    ((net.minecraft.client.entity.EntityPlayerSP)(__stackOp178_9_0)).u = ((double)(__stackOp178_9_1));
    ((com.moon.event.MotionEvent)(spill178_2)).setMotionY(((double)(spill178_3)));
    com.moon.fp __stackOp178_12_0 = this;
    ((com.moon.fp)(__stackOp178_12_0)).f = ((double)((((com.moon.fp)(__stackOp178_12_0)).f * 0x1.128f5cp1d)));
    if (!((life4_5 == null))) {
        break forward_join_90;
    }
    net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[5])));
    }
    forwardValue178_37_0 = this;
    }
    ((com.moon.fp)(forwardValue178_37_0)).f = ((double)(((double) (0x1.25e354p-2f * ((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(((com.moon.module.impl.Flight)(((com.moon.module.impl.Flight)(((com.moon.fp)(this)).a())))).v)).getValue())))).floatValue()))));
    if (!((life4_5 == null))) {
        break forward_join_90;
    }
    }
    forwardValue178_52_0 = ((this.g) ? 1 : 0);
    }
    if (!((life4_5 != null))) {
        forwardValue178_82_0 = forwardValue178_52_0;
        break forward_join_82;
    }
    if (!((forwardValue178_52_0 != 0))) {
        break forward_join_68;
    }
    this.f = ((double)((this.h - (0x1.70a3d70a3d70ap-1d * (this.h - com.moon.nJ.b())))));
    if (!((life4_5 == null))) {
        break forward_join_90;
    }
    }
    spill178_4 = this;
    spill178_5 = (this.h - (this.h / 0x1.3ep7d));
    if (!((life4_5 != null))) {
        forwardValue178_89_0 = spill178_4;
        forwardValue178_89_1 = spill178_5;
        break forward_join_89;
    }
    ((com.moon.fp)(spill178_4)).f = ((double)(spill178_5));
    forwardValue178_82_0 = ((((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fp.a)).K)).B) ? 1 : 0);
    }
    if (!((forwardValue178_82_0 == 0))) {
        break forward_join_87;
    }
    if (!(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fp.a)).K)).C)) {
        break forward_join_90;
    }
    }
    forwardValue178_89_0 = this;
    forwardValue178_89_1 = com.moon.nJ.b();
    }
    ((com.moon.fp)(forwardValue178_89_0)).f = ((double)(forwardValue178_89_1));
    }
    this.f = ((double)(java.lang.Math.max(((double)(this.f)), ((double)(com.moon.nJ.b())))));
    this.g = ((boolean)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fp.a)).K)).A));
    ((com.moon.event.MotionEvent)(p0)).applyMotionSpeed(((double)(this.f)));
    return;
}

}
