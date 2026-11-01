package com.moon;


public class fF extends com.moon.e2<com.moon.module.impl.Speed> {

private int e;

private double f;

private double g;

private int h;

private static final long i;

public fF() {
super(com.moon.module.impl.Speed.class);
}


static {
i = (moom._c.a(-8137615648984739326L, -3220921074295487535L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(94734026939863L);
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public void a(com.moon.dW p0) {
int forwardValue106_27_0;
    boolean spill106_0;
    int spill106_1;
    long life2_3;
    com.moon.n5 life5_6;
    double life6_9;
    double life8_12;
    double life10_17;
    int life4_18;
    forward_join_38: {
    forward_join_27: {
    life2_3 = (com.moon.fF.i ^ 44148103886386L);
    life5_6 = ((com.moon.dW)(p0)).a__sourceReturn_821aa26535();
    life6_9 = ((com.moon.n5)(life5_6)).e();
    life8_12 = ((com.moon.n5)(life5_6)).g();
    spill106_0 = moom.DD.b__Boolean();
    life10_17 = java.lang.Math.hypot(((double)(life6_9)), ((double)(life8_12)));
    life4_18 = ((spill106_0) ? 1 : 0);
    spill106_1 = recovery.source.CarrierOps.dcmpl(((double)(life10_17)), ((double)(0x1.999999999999ap-4d)));
    if (!((life4_18 == 0))) {
        forwardValue106_27_0 = spill106_1;
        break forward_join_27;
    }
    if (!((spill106_1 > 0))) {
        break forward_join_38;
    }
    forwardValue106_27_0 = ((((com.moon.dW)(p0)).b__sourceReturn_aae029aa0a()) ? 1 : 0);
    }
    if (!((forwardValue106_27_0 == 0))) {
        break forward_join_38;
    }
    this.f = ((double)((0x1.ba5e353f7ced9p-3d + life10_17)));
    this.h = ((int)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fF.a)).K)).S));
    }
    return;
}


public void a(com.moon.event.MoveEvent p0) {
long life2_3;
    double life4_15;
    double life6_23;
    life2_3 = (com.moon.fF.i ^ 3214554262118L);
    if ((((com.moon.event.MoveEvent)(p0)).getPhase() == com.moon.event.MovePhase.PRE)) {
        life4_15 = (((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fF.a)).K)).n - ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fF.a)).K)).M);
        life6_23 = (((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fF.a)).K)).p - ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fF.a)).K)).O);
        this.g = ((double)(java.lang.Math.sqrt(((double)(((life4_15 * life4_15) + (life6_23 * life6_23)))))));
    }
    return;
}


public void a(com.moon.dQ p0) {
((com.moon.dQ)(p0)).setCancelled(((boolean)(true)));
    return;
}


public void a(com.moon.event.MotionEvent p0) {
int forestValue50_20_0;
    int forestValue50_27_0;
    int forestValue50_31_0;
    int forestValue50_33_0;
    int forestValue50_41_0;
    int forestValue50_43_0;
    int forestValue50_68_0;
    int forestValue50_186_0;
    int forestValue50_198_0;
    int forestValue50_211_0;
    int forestValue50_217_0;
    int forestValue50_223_0;
    int forestValue50_235_0;
    com.moon.fF forestValue50_264_0;
    boolean spill50_0;
    int spill50_1;
    int spill50_2;
    boolean spill50_3;
    boolean spill50_4;
    com.moon.event.MotionEvent spill50_5;
    double spill50_6;
    int spill50_7;
    int spill50_8;
    int spill50_9;
    com.moon.fF spill50_10;
    long life2_3;
    int life4_5;
    int life5_38;
    int life6_50;
    float life7_52;
    float life8_123;
    moom.CA life9_181;
    int life10_185;
    int life8_220;
    forest_join_274: {
    forest_join_270: {
    forest_join_264: {
    forest_join_263: {
    forest_join_235: {
    forest_join_223: {
    forest_join_217: {
    forest_join_211: {
    forest_join_198: {
    forest_join_192: {
    forest_join_186: {
    forest_join_184: {
    forest_join_156: {
    forest_join_154: {
    forest_join_143: {
    forest_join_111: {
    forest_join_108: {
    forest_join_102: {
    forest_join_68: {
    forest_join_67: {
    forest_join_43: {
    forest_join_42: {
    forest_join_41: {
    forest_join_33: {
    forest_join_32: {
    forest_join_31: {
    forest_join_27: {
    forest_join_20: {
    life2_3 = (com.moon.fF.i ^ 19837537677701L);
    life4_5 = ((moom.DD.a__Boolean()) ? 1 : 0);
    spill50_0 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fF.a)).K)).ae();
    if (!((life4_5 != 0))) {
        forestValue50_20_0 = ((spill50_0) ? 1 : 0);
        break forest_join_20;
    }
    if (!(spill50_0)) {
        break forest_join_274;
    }
    com.moon.fF __stackOp50_7_0 = this;
    ((com.moon.fF)(__stackOp50_7_0)).e = ((int)((((com.moon.fF)(__stackOp50_7_0)).e + 1)));
    forestValue50_20_0 = this.e;
    }
    if (!((life4_5 != 0))) {
        forestValue50_27_0 = forestValue50_20_0;
        break forest_join_27;
    }
    if (!((forestValue50_20_0 == 1))) {
        break forest_join_32;
    }
    forestValue50_27_0 = ((((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fF.a)).K)).A) ? 1 : 0);
    }
    if (!((life4_5 != 0))) {
        forestValue50_31_0 = forestValue50_27_0;
        break forest_join_31;
    }
    if (!((forestValue50_27_0 != 0))) {
        break forest_join_32;
    }
    forestValue50_31_0 = 1;
    }
    forestValue50_33_0 = forestValue50_31_0;
    break forest_join_33;
    }
    forestValue50_33_0 = 0;
    }
    life5_38 = forestValue50_33_0;
    spill50_1 = this.e;
    if (!((life4_5 != 0))) {
        forestValue50_41_0 = spill50_1;
        break forest_join_41;
    }
    if (!((spill50_1 == 2))) {
        break forest_join_42;
    }
    forestValue50_41_0 = 1;
    }
    forestValue50_43_0 = forestValue50_41_0;
    break forest_join_43;
    }
    forestValue50_43_0 = 0;
    }
    life6_50 = forestValue50_43_0;
    life7_52 = 0x1.333334p-1f;
    this.f = ((double)(this.g));
    com.moon.fF __stackOp50_18_0 = this;
    ((com.moon.fF)(__stackOp50_18_0)).f = ((double)((((com.moon.fF)(__stackOp50_18_0)).f * 0x1.d1eb86p-1d)));
    spill50_2 = life6_50;
    if (!((life4_5 != 0))) {
        forestValue50_68_0 = spill50_2;
        break forest_join_68;
    }
    if (!((spill50_2 != 0))) {
        break forest_join_67;
    }
    com.moon.fF __stackOp50_21_0 = this;
    ((com.moon.fF)(__stackOp50_21_0)).f = ((double)((((com.moon.fF)(__stackOp50_21_0)).f * ((double) life7_52))));
    }
    forestValue50_68_0 = life5_38;
    }
    if (!((forestValue50_68_0 != 0))) {
        break forest_join_102;
    }
    com.moon.fF __stackOp50_24_0 = this;
    ((com.moon.fF)(__stackOp50_24_0)).f = ((double)((((com.moon.fF)(__stackOp50_24_0)).f + 0x1.99999ap-3d)));
    com.moon.fF __stackOp50_27_0 = this;
    ((com.moon.fF)(__stackOp50_27_0)).f = ((double)((((com.moon.fF)(__stackOp50_27_0)).f + ((double) ((((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fF.a)).K)).i__sourceReturn_bc607678b6() * 0x1.4d5b12p-3f) / ((float) java.lang.Math.pow(((double)(((double) (0x1.d1eb86p-1f * life7_52)))), ((double)(0x1.8p1d)))))))));
    com.moon.fF __stackOp50_34_0 = this;
    ((com.moon.fF)(__stackOp50_34_0)).f = ((double)((((com.moon.fF)(__stackOp50_34_0)).f * 0x1.f5c29p-1d)));
    if (!((life4_5 == 0))) {
        break forest_join_108;
    }
    }
    com.moon.fF __stackOp50_37_0 = this;
    ((com.moon.fF)(__stackOp50_37_0)).f = ((double)((((com.moon.fF)(__stackOp50_37_0)).f + 0x1.a9fbe6p-6d)));
    }
    switch (this.e) {
case 1:
{
        break forest_join_111;
    }
case 2:
{
        break forest_join_154;
    }
default:
{
        break forest_join_156;
    }
}
    }
    life8_123 = 0x1.99999ap-2f;
    spill50_3 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fF.a)).K)).A;
    if (!((life4_5 != 0))) {
        forestValue50_198_0 = ((spill50_3) ? 1 : 0);
        break forest_join_198;
    }
    if (!(spill50_3)) {
        break forest_join_192;
    }
    spill50_4 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fF.a)).K)).ae();
    if (!((life4_5 != 0))) {
        forestValue50_198_0 = ((spill50_4) ? 1 : 0);
        break forest_join_198;
    }
    if (!(spill50_4)) {
        break forest_join_192;
    }
    if (!(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fF.a)).K)).a__Boolean(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.k))))) {
        break forest_join_143;
    }
    life8_123 = (life8_123 + (((float) (((net.minecraft.potion.PotionEffect)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fF.a)).K)).a(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.k))))).c() + 1)) * 0x1.99999ap-4f));
    }
    spill50_5 = p0;
    net.minecraft.client.entity.EntityPlayerSP __stackOp50_60_0 = ((net.minecraft.client.Minecraft)(com.moon.fF.a)).K;
    double __stackOp50_60_1 = ((double) life8_123);
    spill50_6 = __stackOp50_60_1;
    ((net.minecraft.client.entity.EntityPlayerSP)(__stackOp50_60_0)).u = ((double)(__stackOp50_60_1));
    ((com.moon.event.MotionEvent)(spill50_5)).setMotionY(((double)(spill50_6)));
    if (!((life4_5 == 0))) {
        break forest_join_192;
    }
    }
    if (!((life4_5 == 0))) {
        break forest_join_192;
    }
    }
    life9_181 = ((moom.CA)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fF.a)).K)).b())).c(((double)(0x0.0p0d)), ((double)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fF.a)).K)).u)), ((double)(0x0.0p0d)));
    life10_185 = ((((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fF.a)).K)).C) ? 1 : 0);
    spill50_7 = ((java.util.List)(((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(com.moon.fF.a)).I)).a(((net.minecraft.entity.Entity)(((net.minecraft.client.Minecraft)(com.moon.fF.a)).K)), ((moom.CA)(life9_181))))).size();
    if (!((life4_5 != 0))) {
        forestValue50_186_0 = spill50_7;
        break forest_join_186;
    }
    if (!((spill50_7 <= 0))) {
        break forest_join_184;
    }
    spill50_8 = life10_185;
    if (!((life4_5 != 0))) {
        forestValue50_198_0 = spill50_8;
        break forest_join_198;
    }
    if (!((spill50_8 != 0))) {
        break forest_join_192;
    }
    }
    forestValue50_186_0 = this.e;
    }
    if (!((life4_5 != 0))) {
        forestValue50_198_0 = forestValue50_186_0;
        break forest_join_198;
    }
    if (!((forestValue50_186_0 > 0))) {
        break forest_join_192;
    }
    this.e = ((int)(0));
    }
    forestValue50_198_0 = (((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fF.a)).K)).S - this.h);
    }
    life8_220 = forestValue50_198_0;
    if (!((life4_5 != 0))) {
        break forest_join_270;
    }
    if (!((life8_220 > 0))) {
        break forest_join_263;
    }
    spill50_9 = life8_220;
    if (!((life4_5 != 0))) {
        forestValue50_211_0 = spill50_9;
        break forest_join_211;
    }
    if (!((spill50_9 < 5))) {
        break forest_join_263;
    }
    forestValue50_211_0 = ((((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fF.a)).K)).r__Boolean()) ? 1 : 0);
    }
    if (!((life4_5 != 0))) {
        forestValue50_217_0 = forestValue50_211_0;
        break forest_join_217;
    }
    if (!((forestValue50_211_0 == 0))) {
        break forest_join_263;
    }
    forestValue50_217_0 = ((((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fF.a)).K)).l__Boolean()) ? 1 : 0);
    }
    if (!((life4_5 != 0))) {
        forestValue50_223_0 = forestValue50_217_0;
        break forest_join_223;
    }
    if (!((forestValue50_217_0 == 0))) {
        break forest_join_263;
    }
    forestValue50_223_0 = ((((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fF.a)).K)).j__Boolean()) ? 1 : 0);
    }
    if (!((life4_5 != 0))) {
        forestValue50_235_0 = forestValue50_223_0;
        break forest_join_235;
    }
    if (!((forestValue50_223_0 == 0))) {
        break forest_join_263;
    }
    spill50_10 = this;
    if (!((life4_5 != 0))) {
        forestValue50_264_0 = spill50_10;
        break forest_join_264;
    }
    forestValue50_235_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.Speed)(((com.moon.module.impl.Speed)(((com.moon.fF)(spill50_10)).a())))).A)).getValue())))).booleanValue()) ? 1 : 0);
    }
    if (!((forestValue50_235_0 != 0))) {
        break forest_join_263;
    }
    ((com.moon.event.MotionEvent)(p0)).applyMotionSpeed(((double)((com.moon.nJ.b() * ((double) java.lang.Math.max(((float)((((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(((com.moon.module.impl.Speed)(((com.moon.module.impl.Speed)(((com.moon.fF)(this)).a())))).B)).getValue())))).floatValue() - (((float) life8_220) * 0x1.47ae14p-4f)))), ((float)(0x1.0p0f))))))));
    com.moon.fF __stackOp50_114_0 = this;
    ((com.moon.fF)(__stackOp50_114_0)).f = ((double)((((com.moon.fF)(__stackOp50_114_0)).f * 0x1.99999ap-1d)));
    if (!((life4_5 == 0))) {
        break forest_join_274;
    }
    }
    forestValue50_264_0 = this;
    }
    ((com.moon.fF)(forestValue50_264_0)).f = ((double)(java.lang.Math.max(((double)(this.f)), ((double)(com.moon.nJ.a(((double)(0x1.47ae14p-7d))))))));
    }
    ((com.moon.event.MotionEvent)(p0)).applyMotionSpeed(((double)(this.f)));
    }
    return;
}

}
