package com.moon;


public class fI extends com.moon.e2<com.moon.module.impl.Speed> {

private int e;

private double f;

private static final long g;

public fI() {
super(com.moon.module.impl.Speed.class);
    this.f = 0x0.0p+0d;
}


static {
g = (moom._c.a(8329644482038308217L, 5205975503181195824L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(32716621265904L);
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public void c() {
long local1 = (com.moon.fI.g ^ 20968582545153L);
    int local3 = __sourceIntrinsic_booleanToInteger(moom.DD.a__Boolean());
    if ((local3 != 0)) {
        if ((((((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fI.a)).K)).A) ? 1 : 0) != 0)) {
        ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fI.a)).K)).u = ((double)(0x1.99999ap-5d));
    }
        com.moon.nJ.a__Void(((double)(0x0.0p0d)));
    }
    return;
}


public void a(com.moon.event.MoveEvent p0) {
int forwardValue112_29_0;
    net.minecraft.client.entity.EntityPlayerSP forwardValue112_39_0;
    boolean spill112_0;
    net.minecraft.client.entity.EntityPlayerSP spill112_1;
    long life2_3;
    int life4_5;
    forward_join_50: {
    forward_join_39: {
    forward_join_29: {
    forward_join_18: {
    life2_3 = (com.moon.fI.g ^ 134395535507165L);
    life4_5 = ((moom.DD.b__Boolean()) ? 1 : 0);
    if (!((life4_5 == 0))) {
        break forward_join_18;
    }
    if (!((((com.moon.event.MoveEvent)(p0)).getPhase() == com.moon.event.MovePhase.PRE))) {
        break forward_join_50;
    }
    com.moon.fI __stackOp112_5_0 = this;
    ((com.moon.fI)(__stackOp112_5_0)).e = ((int)((((com.moon.fI)(__stackOp112_5_0)).e + 1)));
    }
    spill112_0 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fI.a)).K)).A;
    if (!((life4_5 == 0))) {
        forwardValue112_29_0 = ((spill112_0) ? 1 : 0);
        break forward_join_29;
    }
    if (!(spill112_0)) {
        break forward_join_50;
    }
    spill112_1 = ((net.minecraft.client.Minecraft)(com.moon.fI.a)).K;
    if (!((life4_5 == 0))) {
        forwardValue112_39_0 = spill112_1;
        break forward_join_39;
    }
    forwardValue112_29_0 = ((((net.minecraft.client.entity.EntityPlayerSP)(spill112_1)).ae()) ? 1 : 0);
    }
    if (!((forwardValue112_29_0 != 0))) {
        break forward_join_50;
    }
    ((com.moon.event.MoveEvent)(p0)).setY(((double)((((com.moon.event.MoveEvent)(p0)).getY() + 0x1.99999ap-7d))));
    forwardValue112_39_0 = ((net.minecraft.client.Minecraft)(com.moon.fI.a)).K;
    }
    ((net.minecraft.client.entity.EntityPlayerSP)(forwardValue112_39_0)).u = ((double)(0x1.99999ap-7d));
    this.f = ((double)((com.moon.nJ.a(((double)(0x1.3333333333333p-1d))) + 0x1.3d70a3d70a3d7p-2d)));
    this.e = ((int)(0));
    }
    return;
}


public void a(com.moon.dQ p0) {
((com.moon.dQ)(p0)).setCancelled(((boolean)(true)));
    return;
}


public void a(com.moon.event.MotionEvent p0) {
int forwardValue111_20_0;
    int forwardValue111_30_0;
    int forwardValue111_32_0;
    com.moon.fI forwardValue111_40_0;
    double forwardValue111_40_1;
    com.moon.fI forwardValue111_41_0;
    double forwardValue111_41_1;
    float forwardValue111_41_2;
    boolean spill111_0;
    com.moon.fI spill111_1;
    double spill111_2;
    long life2_3;
    int life4_5;
    int life5_44;
    forward_join_49: {
    forward_join_46: {
    forward_join_41: {
    forward_join_40: {
    forward_join_32: {
    forward_join_31: {
    forward_join_30: {
    forward_join_20: {
    life2_3 = (com.moon.fI.g ^ 44062521091061L);
    life4_5 = ((moom.DD.b__Boolean()) ? 1 : 0);
    spill111_0 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fI.a)).K)).ae();
    if (!((life4_5 == 0))) {
        forwardValue111_20_0 = ((spill111_0) ? 1 : 0);
        break forward_join_20;
    }
    if (!(spill111_0)) {
        break forward_join_46;
    }
    ((com.moon.event.MotionEvent)(p0)).applyMotionSpeed(((double)(this.f)));
    forwardValue111_20_0 = ((((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fI.a)).K)).a__Boolean(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.d)))) ? 1 : 0);
    }
    if (!((life4_5 == 0))) {
        forwardValue111_30_0 = forwardValue111_20_0;
        break forward_join_30;
    }
    if (!((forwardValue111_20_0 != 0))) {
        break forward_join_31;
    }
    forwardValue111_30_0 = (((net.minecraft.potion.PotionEffect)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fI.a)).K)).a(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.d))))).c() + 1);
    }
    forwardValue111_32_0 = forwardValue111_30_0;
    break forward_join_32;
    }
    forwardValue111_32_0 = 0;
    }
    life5_44 = forwardValue111_32_0;
    spill111_1 = this;
    spill111_2 = com.moon.nJ.b();
    if (!((life5_44 >= 2))) {
        forwardValue111_40_0 = spill111_1;
        forwardValue111_40_1 = spill111_2;
        break forward_join_40;
    }
    forwardValue111_41_0 = spill111_1;
    forwardValue111_41_1 = spill111_2;
    forwardValue111_41_2 = 0x1.f3b646p-5f;
    break forward_join_41;
    }
    forwardValue111_41_0 = forwardValue111_40_0;
    forwardValue111_41_1 = forwardValue111_40_1;
    forwardValue111_41_2 = 0x0.0p0f;
    }
    ((com.moon.fI)(forwardValue111_41_0)).f = ((double)((forwardValue111_41_1 - ((double) forwardValue111_41_2))));
    if (!((life4_5 != 0))) {
        break forward_join_49;
    }
    }
    ((com.moon.event.MotionEvent)(p0)).applyMotionSpeed(((double)(0x0.0p0d)));
    }
    return;
}


private static native int __sourceIntrinsic_booleanToInteger(boolean value);
}
