package com.moon;


public class fD extends com.moon.e2<com.moon.module.impl.Speed> {

private float e;

private float f;

private float g;

private boolean h;

private double i;

private int j;

private static final long k;

public fD() {
super(com.moon.module.impl.Speed.class);
}


static {
k = (moom._c.a(2146562920851714265L, 3455339167897741581L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(188508210575605L);
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public void b() {
this.i = ((double)(0x0.0p0d));
    this.j = ((int)(0));
    super.b();
    return;
}


public void c() {
super.c();
    return;
}


private boolean a(float p0, float p1, float p2) {
int forwardValue102_36_0;
    int forwardValue102_38_0;
    int forwardValue102_61_0;
    boolean spill102_0;
    int spill102_1;
    int spill102_2;
    int spill102_3;
    int spill102_4;
    long life4_3;
    float life7_6;
    float life8_11;
    int life6_12;
    int life9_53;
    forward_join_61: {
    forward_join_51: {
    forward_join_38: {
    forward_join_37: {
    forward_join_36: {
    forward_join_35: {
    life4_3 = (com.moon.fD.k ^ 136252011512273L);
    life7_6 = java.lang.Math.abs(((float)(p2)));
    spill102_0 = moom.DD.a__Boolean();
    life8_11 = java.lang.Math.abs(((float)(this.g)));
    life6_12 = ((spill102_0) ? 1 : 0);
    spill102_1 = recovery.source.CarrierOps.fcmpl(((float)(p0)), ((float)(this.e)));
    if (!((life6_12 != 0))) {
        forwardValue102_36_0 = spill102_1;
        break forward_join_36;
    }
    if (!((spill102_1 == 0))) {
        break forward_join_35;
    }
    spill102_2 = recovery.source.CarrierOps.fcmpl(((float)(p1)), ((float)(this.f)));
    if (!((life6_12 != 0))) {
        forwardValue102_36_0 = spill102_2;
        break forward_join_36;
    }
    if (!((spill102_2 == 0))) {
        break forward_join_35;
    }
    spill102_3 = recovery.source.CarrierOps.fcmpl(((float)((life7_6 - life8_11))), ((float)(0x1.68p5f)));
    if (!((life6_12 != 0))) {
        forwardValue102_36_0 = spill102_3;
        break forward_join_36;
    }
    if (!((spill102_3 >= 0))) {
        break forward_join_37;
    }
    }
    forwardValue102_36_0 = 1;
    }
    forwardValue102_38_0 = forwardValue102_36_0;
    break forward_join_38;
    }
    forwardValue102_38_0 = 0;
    }
    life9_53 = forwardValue102_38_0;
    spill102_4 = life9_53;
    if (!((life6_12 != 0))) {
        forwardValue102_61_0 = spill102_4;
        break forward_join_61;
    }
    if (!((spill102_4 != 0))) {
        break forward_join_51;
    }
    this.i = ((double)(((this.i * 0x1.d1eb86p-1d) + 0x1.a9fbe8p-6d)));
    }
    this.e = ((float)(p0));
    this.f = ((float)(p1));
    this.g = ((float)(p2));
    forwardValue102_61_0 = life9_53;
    }
    return ((forwardValue102_61_0) != 0);
}


private double a__sourceReturn_fedcb3e4d3() {
long local1 = (com.moon.fD.k ^ 68194859387389L);
    double local3 = ((__sourceIntrinsic_booleanComparison(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fD.a)).K)).u__Boolean()) != 0) ? 0x1.2631f8a0902dep-2d : 0x1.ba5e353f7ced9p-3d);
    if ((__sourceIntrinsic_booleanComparison(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fD.a)).K)).a__Boolean(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.d)))) != 0)) {
        local3 = (local3 * (0x1.0p0d + (0x1.999999999999ap-3d * ((double) ((net.minecraft.potion.PotionEffect)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fD.a)).K)).a(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.d))))).c()))));
    }
    return local3;
}


public void a(com.moon.event.MotionEvent p0) {
double forwardValue103_55_0;
    double forwardValue103_72_0;
    int forwardValue103_114_0;
    double forwardValue103_123_0;
    com.moon.fD forwardValue103_138_0;
    boolean spill103_0;
    boolean spill103_1;
    boolean spill103_2;
    com.moon.event.MotionEvent spill103_3;
    double spill103_4;
    com.moon.fD spill103_5;
    long life2_3;
    int life5_8;
    float life6_12;
    float life7_17;
    float life8_21;
    int life4_22;
    double life9_26;
    double life11_33;
    double life13_69;
    double life15_88;
    double life13_153;
    double life15_159;
    forward_join_149: {
    forward_join_145: {
    forward_join_138: {
    forward_join_137: {
    forward_join_123: {
    forward_join_122: {
    forward_join_114: {
    forward_join_110: {
    forward_join_105: {
    forward_join_94: {
    forward_join_72: {
    forward_join_71: {
    forward_join_55: {
    forward_join_54: {
    life2_3 = (com.moon.fD.k ^ 35136872210258L);
    life5_8 = ((((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fD.a)).K)).a__Boolean(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.d)))) ? 1 : 0);
    life6_12 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fD.a)).K)).bk;
    spill103_0 = moom.DD.a__Boolean();
    life7_17 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fD.a)).K)).bj;
    life8_21 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fD.a)).K)).w;
    life4_22 = ((spill103_0) ? 1 : 0);
    life9_26 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fD.a)).K)).j;
    if (!(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fD.a)).K)).ae())) {
        break forward_join_149;
    }
    life11_33 = ((com.moon.fD)(this)).a__sourceReturn_fedcb3e4d3();
    spill103_1 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fD.a)).K)).A;
    if (!((life4_22 != 0))) {
        forwardValue103_114_0 = ((spill103_1) ? 1 : 0);
        break forward_join_114;
    }
    if (!(spill103_1)) {
        break forward_join_110;
    }
    spill103_2 = this.h;
    if (!((life4_22 != 0))) {
        forwardValue103_114_0 = ((spill103_2) ? 1 : 0);
        break forward_join_114;
    }
    if (!((!spill103_2))) {
        break forward_join_110;
    }
    this.j = ((int)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fD.a)).K)).S));
    if (!((life5_8 != 0))) {
        break forward_join_54;
    }
    forwardValue103_55_0 = 0x1.0a3d70a3d70a4p1d;
    break forward_join_55;
    }
    forwardValue103_55_0 = 0x1.11eb851eb851fp1d;
    }
    life13_69 = forwardValue103_55_0;
    this.i = ((double)((life11_33 * life13_69)));
    if (!((!((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.Speed)(((com.moon.module.impl.Speed)(((com.moon.fD)(this)).a())))).a__kV())).getValue())))).booleanValue()))) {
        break forward_join_71;
    }
    forwardValue103_72_0 = 0x1.ae147ap-2d;
    break forward_join_72;
    }
    forwardValue103_72_0 = 0x1.99999ap-2d;
    }
    life15_88 = forwardValue103_72_0;
    if (!((life4_22 != 0))) {
        break forward_join_105;
    }
    if (!(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fD.a)).K)).a__Boolean(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.k))))) {
        break forward_join_94;
    }
    life15_88 = (life15_88 + ((double) (((float) (((net.minecraft.potion.PotionEffect)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fD.a)).K)).a(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.k))))).c() + 1)) * 0x1.9db22ep-4f)));
    }
    spill103_3 = p0;
    net.minecraft.client.entity.EntityPlayerSP __stackOp103_52_0 = ((net.minecraft.client.Minecraft)(com.moon.fD.a)).K;
    double __stackOp103_52_1 = life15_88;
    spill103_4 = __stackOp103_52_1;
    ((net.minecraft.client.entity.EntityPlayerSP)(__stackOp103_52_0)).u = ((double)(__stackOp103_52_1));
    ((com.moon.event.MotionEvent)(spill103_3)).setMotionY(((double)(spill103_4)));
    this.h = ((boolean)(true));
    }
    if (!((life4_22 == 0))) {
        break forward_join_145;
    }
    net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[1])));
    }
    spill103_5 = this;
    if (!((life4_22 != 0))) {
        forwardValue103_138_0 = spill103_5;
        break forward_join_138;
    }
    forwardValue103_114_0 = ((((com.moon.fD)(spill103_5)).h) ? 1 : 0);
    }
    if (!((forwardValue103_114_0 != 0))) {
        break forward_join_137;
    }
    this.h = ((boolean)(false));
    if (!((life5_8 != 0))) {
        break forward_join_122;
    }
    forwardValue103_123_0 = 0x1.31a9fbe76c8b4p-1d;
    break forward_join_123;
    }
    forwardValue103_123_0 = 0x1.8f5c28f5c28f6p-1d;
    }
    life13_153 = forwardValue103_123_0;
    life15_159 = (life13_153 * (life9_26 - life11_33));
    this.i = ((double)((life9_26 - life15_159)));
    if (!((life4_22 == 0))) {
        break forward_join_145;
    }
    }
    forwardValue103_138_0 = this;
    }
    ((com.moon.fD)(forwardValue103_138_0)).i = ((double)(((this.i * 0x1.d1eb86p-1d) + 0x1.a9fbe8p-6d)));
    }
    ((com.moon.event.MotionEvent)(p0)).applyMotionSpeed(((double)(this.i)));
    }
    return;
}


private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
