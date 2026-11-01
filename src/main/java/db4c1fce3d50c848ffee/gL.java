package com.moon;


public class gL extends com.moon.gK {

private float b;

private boolean c;

private double d;

private static final long e;

public gL() {
super();
}


static {
e = (moom._c.a(2781131125933872485L, -6752831621587823648L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(205326172207287L);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a() {
this.c = ((boolean)(true));
    return;
}


public void a(com.moon.event.MotionEvent p0) {
int forwardValue250_14_0;
    boolean spill250_0;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_31: {
    forward_join_14: {
    life2_3 = (com.moon.gL.e ^ 120329212083824L);
    life4_5 = moom.BU.b__Arrayr3();
    spill250_0 = ((com.moon.gL)(this)).a__Boolean();
    if (!((life4_5 == null))) {
        forwardValue250_14_0 = ((spill250_0) ? 1 : 0);
        break forward_join_14;
    }
    if (!(spill250_0)) {
        break forward_join_31;
    }
    forwardValue250_14_0 = ((((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.gL.a)).K)).ae()) ? 1 : 0);
    }
    if (!((forwardValue250_14_0 != 0))) {
        break forward_join_31;
    }
    ((com.moon.event.MotionEvent)(p0)).a(((float)(0x1.0p0f)));
    ((com.moon.event.MotionEvent)(p0)).b(((float)(0x0.0p0f)));
    ((com.moon.event.MotionEvent)(p0)).c(((float)(this.b)));
    ((com.moon.event.MotionEvent)(p0)).applyMotionSpeed(((double)(0x1.851eb851eb852p-3d)));
    }
    return;
}


public void a(com.moon.event.MoveEvent p0) {
int forwardValue251_14_0;
    int forwardValue251_20_0;
    int forwardValue251_31_0;
    int forwardValue251_63_0;
    int forwardValue251_67_0;
    int forwardValue251_69_0;
    int forwardValue251_80_0;
    boolean spill251_0;
    boolean spill251_1;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    int life5_102;
    forward_join_88: {
    forward_join_80: {
    forward_join_69: {
    forward_join_68: {
    forward_join_67: {
    forward_join_63: {
    forward_join_52: {
    forward_join_31: {
    forward_join_28: {
    forward_join_20: {
    forward_join_14: {
    life2_3 = (com.moon.gL.e ^ 38279754710973L);
    life4_5 = moom.BU.b__Arrayr3();
    spill251_0 = ((com.moon.gL)(this)).a__Boolean();
    if (!((life4_5 == null))) {
        forwardValue251_14_0 = ((spill251_0) ? 1 : 0);
        break forward_join_14;
    }
    if (!(spill251_0)) {
        break forward_join_88;
    }
    forwardValue251_14_0 = ((((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.gL.a)).K)).ae()) ? 1 : 0);
    }
    if (!((life4_5 == null))) {
        forwardValue251_20_0 = forwardValue251_14_0;
        break forward_join_20;
    }
    if (!((forwardValue251_14_0 != 0))) {
        break forward_join_88;
    }
    forwardValue251_20_0 = ((((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.gL.a)).K)).A) ? 1 : 0);
    }
    if (!((life4_5 == null))) {
        forwardValue251_31_0 = forwardValue251_20_0;
        break forward_join_31;
    }
    if (!((forwardValue251_20_0 != 0))) {
        break forward_join_28;
    }
    this.b = ((float)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.gL.a)).K)).w));
    }
    forwardValue251_31_0 = ((((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.gL.a)).K)).A) ? 1 : 0);
    }
    if (!((life4_5 == null))) {
        forwardValue251_63_0 = forwardValue251_31_0;
        break forward_join_63;
    }
    if (!((forwardValue251_31_0 != 0))) {
        break forward_join_52;
    }
    if (!((((com.moon.event.MoveEvent)(p0)).getPhase() == com.moon.event.MovePhase.BEFORE))) {
        break forward_join_52;
    }
    ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.gL.a)).K)).u = ((double)(0x1.adf505d0fa58fp-2d));
    this.d = ((double)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.gL.a)).K)).o));
    this.c = ((boolean)(true));
    if (!((life4_5 != null))) {
        break forward_join_88;
    }
    }
    forwardValue251_63_0 = recovery.source.CarrierOps.dcmpl(((double)(com.moon.nI.a(((double)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.gL.a)).K)).o)), ((int)(2))))), ((double)(((double) java.lang.Math.round(((double)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.gL.a)).K)).o)))))));
    }
    if (!((life4_5 == null))) {
        forwardValue251_67_0 = forwardValue251_63_0;
        break forward_join_67;
    }
    if (!((forwardValue251_63_0 == 0))) {
        break forward_join_68;
    }
    forwardValue251_67_0 = 1;
    }
    forwardValue251_69_0 = forwardValue251_67_0;
    break forward_join_69;
    }
    forwardValue251_69_0 = 0;
    }
    life5_102 = forwardValue251_69_0;
    if (!((((com.moon.event.MoveEvent)(p0)).getPhase() == com.moon.event.MovePhase.PRE))) {
        break forward_join_88;
    }
    spill251_1 = this.c;
    if (!((life4_5 == null))) {
        forwardValue251_80_0 = ((spill251_1) ? 1 : 0);
        break forward_join_80;
    }
    if (!(spill251_1)) {
        break forward_join_88;
    }
    forwardValue251_80_0 = life5_102;
    }
    if (!((forwardValue251_80_0 != 0))) {
        break forward_join_88;
    }
    ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.gL.a)).K)).u = ((double)(0x0.0p0d));
    this.c = ((boolean)(false));
    }
    return;
}

}
