package com.moon;


public class gE {

static final net.minecraft.client.Minecraft a;

private int b;

private double c;

private static final long d;

public gE() {
super();
}


static {
d = (moom._c.a(-2487112007090334624L, 2274836227397525113L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(8737692300536L);
    a = net.minecraft.client.Minecraft.a__fM();
}


public void b() {
this.b = ((int)(0));
    this.c = ((double)(0x0.0p0d));
    ((com.moon.gE)(this)).a__Void();
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a__Void() {
int forestValue200003_29_0;
    int forestValue200003_33_0;
    int forestValue200003_35_0;
    boolean spill200003_0;
    boolean spill200003_1;
    int spill200003_2;
    long life1_3;
    int life4_9;
    int life3_10;
    int life5_39;
    forest_join_53: {
    forest_join_45: {
    forest_join_43: {
    forest_join_35: {
    forest_join_34: {
    forest_join_33: {
    forest_join_32: {
    forest_join_29: {
    forest_join_22: {
    life1_3 = (com.moon.gE.d ^ 126696157957199L);
    spill200003_0 = com.moon.gD.c__Boolean();
    life4_9 = ((moom.pz)(((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(com.moon.gE.a)).W)).aq)).b();
    life3_10 = ((spill200003_0) ? 1 : 0);
    spill200003_1 = org.lwjgl.input.Keyboard.isKeyDown(((int)(((moom.pz)(((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(com.moon.gE.a)).W)).aq)).b())));
    if (!((life3_10 == 0))) {
        forestValue200003_29_0 = ((spill200003_1) ? 1 : 0);
        break forest_join_29;
    }
    if (!(spill200003_1)) {
        break forest_join_22;
    }
    if (!((((net.minecraft.client.Minecraft)(com.moon.gE.a)).P != null))) {
        break forest_join_32;
    }
    }
    com.moon.gE __stackOp200003_15_0 = this;
    com.moon.gE __stackOp200003_17_0 = __stackOp200003_15_0;
    int __stackOp200003_17_1 = ((com.moon.gE)(__stackOp200003_15_0)).b;
    spill200003_2 = __stackOp200003_17_1;
    ((com.moon.gE)(__stackOp200003_17_0)).b = ((int)((__stackOp200003_17_1 - 1)));
    forestValue200003_29_0 = spill200003_2;
    }
    if (!((life3_10 == 0))) {
        forestValue200003_33_0 = forestValue200003_29_0;
        break forest_join_33;
    }
    if (!((forestValue200003_29_0 > 0))) {
        break forest_join_34;
    }
    }
    forestValue200003_33_0 = 1;
    }
    forestValue200003_35_0 = forestValue200003_33_0;
    break forest_join_35;
    }
    forestValue200003_35_0 = 0;
    }
    life5_39 = forestValue200003_35_0;
    if (!((life3_10 == 0))) {
        break forest_join_43;
    }
    if (!((life5_39 != 0))) {
        break forest_join_45;
    }
    this.c = ((double)(0x0.0p0d));
    }
    if (!((life3_10 != 0))) {
        break forest_join_53;
    }
    }
    com.moon.gE __stackOp200003_20_0 = this;
    ((com.moon.gE)(__stackOp200003_20_0)).c = ((double)((((com.moon.gE)(__stackOp200003_20_0)).c + ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.gE.a)).K)).j)));
    }
    moom.pz.a(((int)(life4_9)), ((boolean)__sourceIntrinsic_integerToBoolean((life5_39))));
    return;
}


public double a() {
return this.c;
}


public void a(int p0) {
this.b = ((int)(java.lang.Math.max(((int)(this.b)), ((int)(p0)))));
    return;
}


private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
