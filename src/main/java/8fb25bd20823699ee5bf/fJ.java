package com.moon;


public class fJ extends com.moon.e2<com.moon.module.impl.Speed> {

private float e;

private float f;

private float g;

private int h;

private int i;

private int j;

private double k;

private static final long l;

public fJ() {
super(com.moon.module.impl.Speed.class);
    this.h = 0;
    this.i = 0;
    this.j = 0;
}


static {
l = (moom._c.a(-8017657014168170472L, 9180301015111011164L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(76265504312364L);
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public void b() {
super.b();
    this.j = ((int)(0));
    return;
}


private void a(float p0, float p1, float p2) {
int forwardValue113_24_0;
    int forwardValue113_32_0;
    boolean spill113_0;
    int spill113_1;
    long life4_3;
    float life7_7;
    float life8_11;
    int life6_12;
    forward_join_39: {
    forward_join_33: {
    forward_join_32: {
    forward_join_24: {
    life4_3 = (com.moon.fJ.l ^ 130985475583789L);
    spill113_0 = moom.DD.b__Boolean();
    life7_7 = java.lang.Math.abs(((float)(p2)));
    life8_11 = java.lang.Math.abs(((float)(this.g)));
    life6_12 = ((spill113_0) ? 1 : 0);
    spill113_1 = recovery.source.CarrierOps.fcmpl(((float)(p0)), ((float)(this.e)));
    if (!((life6_12 == 0))) {
        forwardValue113_24_0 = spill113_1;
        break forward_join_24;
    }
    if (!((spill113_1 == 0))) {
        break forward_join_33;
    }
    forwardValue113_24_0 = recovery.source.CarrierOps.fcmpl(((float)(p1)), ((float)(this.f)));
    }
    if (!((life6_12 == 0))) {
        forwardValue113_32_0 = forwardValue113_24_0;
        break forward_join_32;
    }
    if (!((forwardValue113_24_0 == 0))) {
        break forward_join_33;
    }
    forwardValue113_32_0 = recovery.source.CarrierOps.fcmpl(((float)((life7_7 - life8_11))), ((float)(0x1.9p4f)));
    }
    if (!((forwardValue113_32_0 >= 0))) {
        break forward_join_39;
    }
    }
    com.moon.fJ __stackOp113_11_0 = this;
    ((com.moon.fJ)(__stackOp113_11_0)).k = ((double)((((com.moon.fJ)(__stackOp113_11_0)).k * 0x1.d1eb86p-1d)));
    }
    this.e = ((float)(p0));
    this.f = ((float)(p1));
    this.g = ((float)(p2));
    return;
}


private double a__sourceReturn_fedcb3e4d3() {
long local1 = (com.moon.fJ.l ^ 101621477046868L);
    double local3 = ((__sourceIntrinsic_booleanComparison(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fJ.a)).K)).u__Boolean()) != 0) ? 0x1.2631f8a0902dep-2d : 0x1.ba5e353f7ced9p-3d);
    if ((__sourceIntrinsic_booleanComparison(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fJ.a)).K)).a__Boolean(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.d)))) != 0)) {
        local3 = (local3 * (0x1.0p0d + (0x1.999999999999ap-3d * ((double) ((net.minecraft.potion.PotionEffect)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fJ.a)).K)).a(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.d))))).c()))));
    }
    return local3;
}


public void a(com.moon.dW p0) {
int forwardValue114_27_0;
    boolean spill114_0;
    int spill114_1;
    long life2_3;
    com.moon.n5 life5_7;
    double life6_10;
    double life8_13;
    int life4_14;
    double life10_18;
    forward_join_38: {
    forward_join_27: {
    life2_3 = (com.moon.fJ.l ^ 125720439667444L);
    spill114_0 = moom.DD.b__Boolean();
    life5_7 = ((com.moon.dW)(p0)).a__sourceReturn_821aa26535();
    life6_10 = ((com.moon.n5)(life5_7)).e();
    life8_13 = ((com.moon.n5)(life5_7)).g();
    life4_14 = ((spill114_0) ? 1 : 0);
    life10_18 = java.lang.Math.hypot(((double)(life6_10)), ((double)(life8_13)));
    spill114_1 = recovery.source.CarrierOps.dcmpl(((double)(life10_18)), ((double)(0x1.999999999999ap-4d)));
    if (!((life4_14 == 0))) {
        forwardValue114_27_0 = spill114_1;
        break forward_join_27;
    }
    if (!((spill114_1 > 0))) {
        break forward_join_38;
    }
    forwardValue114_27_0 = ((((com.moon.dW)(p0)).b__sourceReturn_aae029aa0a()) ? 1 : 0);
    }
    if (!((forwardValue114_27_0 == 0))) {
        break forward_join_38;
    }
    this.k = ((double)((0x1.ba5e353f7ced9p-3d + life10_18)));
    this.i = ((int)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fJ.a)).K)).S));
    }
    return;
}


public void a(com.moon.event.MoveEvent p0) {
com.moon.fJ forwardValue116_18_0;
    int forwardValue116_18_1;
    com.moon.fJ forwardValue116_19_0;
    com.moon.fJ forwardValue116_26_0;
    int forwardValue116_26_1;
    int forwardValue116_36_0;
    int forwardValue116_40_0;
    int forwardValue116_42_0;
    int forwardValue116_53_0;
    int forwardValue116_60_0;
    double forwardValue116_66_0;
    int forwardValue116_84_0;
    com.moon.fJ spill116_0;
    boolean spill116_1;
    int spill116_2;
    boolean spill116_3;
    boolean spill116_4;
    int spill116_5;
    int spill116_6;
    long life2_3;
    int life4_5;
    int life5_57;
    int life6_87;
    double life7_95;
    int life9_108;
    com.moon.eo life9_145;
    forward_join_132: {
    forward_join_126: {
    forward_join_98: {
    forward_join_84: {
    forward_join_83: {
    forward_join_66: {
    forward_join_65: {
    forward_join_60: {
    forward_join_53: {
    forward_join_42: {
    forward_join_41: {
    forward_join_40: {
    forward_join_36: {
    forward_join_26: {
    forward_join_19: {
    forward_join_18: {
    life2_3 = (com.moon.fJ.l ^ 70155659733215L);
    life4_5 = ((moom.DD.a__Boolean()) ? 1 : 0);
    if (!((((com.moon.event.MoveEvent)(p0)).getPhase() == com.moon.event.MovePhase.PRE))) {
        break forward_join_132;
    }
    spill116_0 = this;
    spill116_1 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fJ.a)).K)).A;
    if (!((life4_5 != 0))) {
        forwardValue116_18_0 = spill116_0;
        forwardValue116_18_1 = ((spill116_1) ? 1 : 0);
        break forward_join_18;
    }
    if (!(spill116_1)) {
        forwardValue116_19_0 = spill116_0;
        break forward_join_19;
    }
    forwardValue116_18_0 = spill116_0;
    forwardValue116_18_1 = 0;
    }
    forwardValue116_26_0 = forwardValue116_18_0;
    forwardValue116_26_1 = forwardValue116_18_1;
    break forward_join_26;
    }
    com.moon.fJ __stackOp116_9_0 = this;
    com.moon.fJ __stackOp116_11_0 = __stackOp116_9_0;
    int __stackOp116_11_1 = (((com.moon.fJ)(__stackOp116_9_0)).h + 1);
    spill116_2 = __stackOp116_11_1;
    ((com.moon.fJ)(__stackOp116_11_0)).h = ((int)(__stackOp116_11_1));
    forwardValue116_26_0 = forwardValue116_19_0;
    forwardValue116_26_1 = spill116_2;
    }
    ((com.moon.fJ)(forwardValue116_26_0)).h = ((int)(forwardValue116_26_1));
    spill116_3 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fJ.a)).K)).ae();
    if (!((life4_5 != 0))) {
        forwardValue116_36_0 = ((spill116_3) ? 1 : 0);
        break forward_join_36;
    }
    if (!(spill116_3)) {
        break forward_join_132;
    }
    forwardValue116_36_0 = ((((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fJ.a)).K)).j__Boolean()) ? 1 : 0);
    }
    if (!((life4_5 != 0))) {
        forwardValue116_40_0 = forwardValue116_36_0;
        break forward_join_40;
    }
    if (!((forwardValue116_36_0 == 0))) {
        break forward_join_41;
    }
    forwardValue116_40_0 = 1;
    }
    forwardValue116_42_0 = forwardValue116_40_0;
    break forward_join_42;
    }
    forwardValue116_42_0 = 0;
    }
    life5_57 = forwardValue116_42_0;
    spill116_4 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fJ.a)).K)).A;
    if (!((life4_5 != 0))) {
        forwardValue116_53_0 = ((spill116_4) ? 1 : 0);
        break forward_join_53;
    }
    if (!(spill116_4)) {
        break forward_join_132;
    }
    ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fJ.a)).K)).D__sourceReturn_da8c82d5d4();
    forwardValue116_53_0 = life5_57;
    }
    if (!((life4_5 != 0))) {
        forwardValue116_60_0 = forwardValue116_53_0;
        break forward_join_60;
    }
    if (!((forwardValue116_53_0 != 0))) {
        break forward_join_126;
    }
    forwardValue116_60_0 = ((((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fJ.a)).K)).a__Boolean(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.d)))) ? 1 : 0);
    }
    life6_87 = forwardValue116_60_0;
    if (!((life6_87 != 0))) {
        break forward_join_65;
    }
    forwardValue116_66_0 = 0x1.ccccccccccccdp0d;
    break forward_join_66;
    }
    forwardValue116_66_0 = 0x1.ae147ae147ae1p0d;
    }
    life7_95 = forwardValue116_66_0;
    spill116_5 = life6_87;
    if (!((life4_5 != 0))) {
        forwardValue116_84_0 = spill116_5;
        break forward_join_84;
    }
    if (!((spill116_5 != 0))) {
        break forward_join_83;
    }
    life9_108 = ((net.minecraft.potion.PotionEffect)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fJ.a)).K)).a(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.d))))).c();
    spill116_6 = life9_108;
    if (!((life4_5 != 0))) {
        forwardValue116_84_0 = spill116_6;
        break forward_join_84;
    }
    if (!((spill116_6 > 0))) {
        break forward_join_83;
    }
    life7_95 = 0x1.999999999999ap0d;
    }
    forwardValue116_84_0 = life6_87;
    }
    if (!((forwardValue116_84_0 != 0))) {
        break forward_join_98;
    }
    life7_95 = (life7_95 * (0x1.0p0d + (0x1.1eb851eb851ecp-4d * ((double) ((net.minecraft.potion.PotionEffect)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fJ.a)).K)).a(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.d))))).c()))));
    }
    life9_145 = new com.moon.eo(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fJ.a)).K)).bk, ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fJ.a)).K)).bj, ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fJ.a)).K)).w);
    ((com.moon.events.EventBus)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).getEventBus())).publish(((java.lang.Object)(life9_145)));
    com.moon.nJ.a(((double)((((com.moon.fJ)(this)).a__sourceReturn_fedcb3e4d3() * life7_95))), ((float)(((com.moon.eo)(life9_145)).c())), ((float)(((com.moon.eo)(life9_145)).a())), ((float)(((com.moon.eo)(life9_145)).b__sourceReturn_bc607678b6())));
    }
    com.moon.fJ __stackOp116_61_0 = this;
    ((com.moon.fJ)(__stackOp116_61_0)).j = ((int)((((com.moon.fJ)(__stackOp116_61_0)).j + 1)));
    }
    return;
}


public void a(com.moon.event.MotionEvent p0) {
int forwardValue115_29_0;
    int forwardValue115_35_0;
    int forwardValue115_41_0;
    int forwardValue115_53_0;
    com.moon.fJ forwardValue115_75_0;
    boolean spill115_0;
    int spill115_1;
    com.moon.fJ spill115_2;
    long life2_3;
    int life5_10;
    int life4_20;
    forward_join_80: {
    forward_join_75: {
    forward_join_53: {
    forward_join_41: {
    forward_join_35: {
    forward_join_29: {
    life2_3 = (com.moon.fJ.l ^ 29581587725312L);
    life5_10 = (((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fJ.a)).K)).S - this.i);
    spill115_0 = moom.DD.a__Boolean();
    ((com.moon.fJ)(this)).a(((float)(((com.moon.event.MotionEvent)(p0)).a())), ((float)(((com.moon.event.MotionEvent)(p0)).b__sourceReturn_bc607678b6())), ((float)(((com.moon.event.MotionEvent)(p0)).c())));
    life4_20 = ((spill115_0) ? 1 : 0);
    spill115_1 = life5_10;
    if (!((life4_20 != 0))) {
        forwardValue115_29_0 = spill115_1;
        break forward_join_29;
    }
    if (!((spill115_1 == 1))) {
        break forward_join_80;
    }
    forwardValue115_29_0 = ((((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fJ.a)).K)).r__Boolean()) ? 1 : 0);
    }
    if (!((life4_20 != 0))) {
        forwardValue115_35_0 = forwardValue115_29_0;
        break forward_join_35;
    }
    if (!((forwardValue115_29_0 == 0))) {
        break forward_join_80;
    }
    forwardValue115_35_0 = ((((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fJ.a)).K)).l__Boolean()) ? 1 : 0);
    }
    if (!((life4_20 != 0))) {
        forwardValue115_41_0 = forwardValue115_35_0;
        break forward_join_41;
    }
    if (!((forwardValue115_35_0 == 0))) {
        break forward_join_80;
    }
    forwardValue115_41_0 = ((((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fJ.a)).K)).j__Boolean()) ? 1 : 0);
    }
    if (!((life4_20 != 0))) {
        forwardValue115_53_0 = forwardValue115_41_0;
        break forward_join_53;
    }
    if (!((forwardValue115_41_0 == 0))) {
        break forward_join_80;
    }
    spill115_2 = this;
    if (!((life4_20 != 0))) {
        forwardValue115_75_0 = spill115_2;
        break forward_join_75;
    }
    forwardValue115_53_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.Speed)(((com.moon.module.impl.Speed)(((com.moon.fJ)(spill115_2)).a())))).u)).getValue())))).booleanValue()) ? 1 : 0);
    }
    if (!((forwardValue115_53_0 != 0))) {
        break forward_join_80;
    }
    ((com.moon.event.MotionEvent)(p0)).applyMotionSpeed(((double)((((com.moon.fJ)(this)).a__sourceReturn_fedcb3e4d3() * ((double) java.lang.Math.max(((float)((((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(((com.moon.module.impl.Speed)(((com.moon.module.impl.Speed)(((com.moon.fJ)(this)).a())))).v)).getValue())))).floatValue() - (((float) life5_10) * 0x1.47ae14p-4f)))), ((float)(0x1.0p0f))))))));
    forwardValue115_75_0 = this;
    }
    com.moon.fJ __stackOp115_39_0 = forwardValue115_75_0;
    ((com.moon.fJ)(__stackOp115_39_0)).k = ((double)((((com.moon.fJ)(__stackOp115_39_0)).k * 0x1.99999ap-1d)));
    }
    return;
}


public void a(com.moon.eF p0) {
long life2_3;
    com.moon.eo life5_17;
    int life4_18;
    life2_3 = (com.moon.fJ.l ^ 38708244721705L);
    boolean spill938_0 = moom.DD.a__Boolean();
    life5_17 = new com.moon.eo(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fJ.a)).K)).bk, ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fJ.a)).K)).bj, ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fJ.a)).K)).w);
    life4_18 = ((spill938_0) ? 1 : 0);
    ((com.moon.events.EventBus)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).getEventBus())).publish(((java.lang.Object)(life5_17)));
    ((com.moon.eF)(p0)).a(((float)(((com.moon.eo)(life5_17)).c())));
    if ((net.minecraft.entity.Entity.b__ArrayString() != null)) {
        moom.DD.b(((boolean)__sourceIntrinsic_integerToBoolean((((life4_18 != 0) ? 0 : 1)))));
    }
    return;
}


public void a(com.moon.dQ p0) {
((com.moon.dQ)(p0)).setCancelled(((boolean)(true)));
    return;
}


private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
