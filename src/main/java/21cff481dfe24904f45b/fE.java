package com.moon;


public class fE extends com.moon.e2<com.moon.module.impl.Speed> {

private int e;

private double f;

private double g;

private float h;

private float i;

private float j;

private static final long k;

private static final long l;

public fE() {
super(com.moon.module.impl.Speed.class);
}


static {
k = ((long)(((moom._a)(moom._c.a(((long)(2945710474698037570L)), ((long)(8342542623250607981L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(93188822482797L)))));
    long local0_life6 = (com.moon.fE.k ^ 63842667372142L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill91_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill91_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill91_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill91_13 = new byte[8];
    (__sourceSpill91_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill91_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation91_15 = __sourceSpill91_13;
    ((javax.crypto.Cipher)(__sourceSpill91_10)).init(((int)(__sourceSpill91_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill91_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation91_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = 5438464555930566436L;
    byte[] __sourceSpill91_19 = new byte[8];
    (__sourceSpill91_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill91_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill91_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill91_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill91_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill91_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill91_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill91_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill91_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill91_20)).doFinal(((byte[])(__sourceSpill91_19)));
    l = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public void a(com.moon.eF p0) {
net.minecraft.client.entity.EntityPlayerSP forwardValue104_30_0;
    java.lang.Object forwardValue104_62_0;
    int forwardValue104_81_0;
    boolean spill104_0;
    boolean spill104_1;
    net.minecraft.client.entity.EntityPlayerSP spill104_2;
    net.minecraft.client.entity.EntityPlayerSP spill104_3;
    long life2_3;
    int life4_5;
    float life5_56;
    forward_join_90: {
    forward_join_81: {
    forward_join_74: {
    forward_join_72: {
    forward_join_69: {
    forward_join_62: {
    forward_join_31: {
    forward_join_30: {
    life2_3 = (com.moon.fE.k ^ 2260764329640L);
    life4_5 = ((moom.DD.a__Boolean()) ? 1 : 0);
    spill104_0 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.Speed)(((com.moon.module.impl.Speed)(((com.moon.fE)(this)).a())))).c())).getValue())))).booleanValue();
    if (!((life4_5 != 0))) {
        forwardValue104_81_0 = ((spill104_0) ? 1 : 0);
        break forward_join_81;
    }
    if (!((!spill104_0))) {
        break forward_join_74;
    }
    spill104_1 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fE.a)).K)).ae();
    if (!((life4_5 != 0))) {
        forwardValue104_81_0 = ((spill104_1) ? 1 : 0);
        break forward_join_81;
    }
    if (!(spill104_1)) {
        break forward_join_74;
    }
    spill104_2 = ((net.minecraft.client.Minecraft)(com.moon.fE.a)).K;
    if (!((life4_5 != 0))) {
        forwardValue104_30_0 = spill104_2;
        break forward_join_30;
    }
    if (!(((net.minecraft.client.entity.EntityPlayerSP)(spill104_2)).A)) {
        break forward_join_31;
    }
    forwardValue104_30_0 = ((net.minecraft.client.Minecraft)(com.moon.fE.a)).K;
    }
    ((net.minecraft.client.entity.EntityPlayerSP)(forwardValue104_30_0)).D__sourceReturn_da8c82d5d4();
    }
    life5_56 = com.moon.nJ.a(((float)(this.j)), ((float)(this.h)), ((float)(this.i)));
    if (!((life4_5 != 0))) {
        break forward_join_72;
    }
    if (!(((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.Speed)(((com.moon.module.impl.Speed)(((com.moon.fE)(this)).a())))).d())).getValue())))).booleanValue())) {
        break forward_join_69;
    }
    spill104_3 = ((net.minecraft.client.Minecraft)(com.moon.fE.a)).K;
    if (!((life4_5 != 0))) {
        forwardValue104_62_0 = spill104_3;
        break forward_join_62;
    }
    if (!((((net.minecraft.client.entity.EntityPlayerSP)(spill104_3)).aO == ((int) com.moon.fE.l)))) {
        break forward_join_69;
    }
    forwardValue104_62_0 = ((com.moon.setting.FloatSetting)(((com.moon.module.impl.Speed)(((com.moon.module.impl.Speed)(((com.moon.fE)(this)).a())))).b__kZ())).getValue();
    }
    com.moon.nJ.a(((double)(((double) (((java.lang.Float)(((java.lang.Float)(forwardValue104_62_0)))).floatValue() * 0x1.99999ap-3f)))), ((float)(life5_56)));
    }
    com.moon.nJ.a(((double)(com.moon.nJ.a())), ((float)(life5_56)));
    }
    if (!((life4_5 == 0))) {
        break forward_join_90;
    }
    }
    forwardValue104_81_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.Speed)(((com.moon.module.impl.Speed)(((com.moon.fE)(this)).a())))).c())).getValue())))).booleanValue()) ? 1 : 0);
    }
    if (!((forwardValue104_81_0 == 0))) {
        break forward_join_90;
    }
    ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fE.a)).K)).t = ((double)(0x0.0p0d));
    ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fE.a)).K)).v = ((double)(0x0.0p0d));
    }
    return;
}


public void a(com.moon.event.MoveEvent p0) {
long life2_3;
    double life4_15;
    double life6_23;
    life2_3 = (com.moon.fE.k ^ 121011770628009L);
    if ((((com.moon.event.MoveEvent)(p0)).getPhase() == com.moon.event.MovePhase.PRE)) {
        life4_15 = (((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fE.a)).K)).n - ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fE.a)).K)).M);
        life6_23 = (((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fE.a)).K)).p - ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fE.a)).K)).O);
        this.g = ((double)(java.lang.Math.sqrt(((double)(((life4_15 * life4_15) + (life6_23 * life6_23)))))));
    }
    return;
}


public void a(com.moon.event.MotionEvent p0) {
int forestValue49_31_0;
    int forestValue49_42_0;
    int forestValue49_49_0;
    int forestValue49_53_0;
    int forestValue49_55_0;
    int forestValue49_63_0;
    int forestValue49_65_0;
    int forestValue49_90_0;
    int forestValue49_145_0;
    int forestValue49_204_0;
    com.moon.fE forestValue49_209_0;
    boolean spill49_0;
    boolean spill49_1;
    int spill49_2;
    int spill49_3;
    boolean spill49_4;
    com.moon.event.MotionEvent spill49_5;
    double spill49_6;
    int spill49_7;
    int spill49_8;
    com.moon.fE spill49_9;
    long life2_3;
    int life4_9;
    int life5_62;
    int life6_74;
    float life7_76;
    float life8_141;
    moom.CA life9_199;
    int life10_203;
    forest_join_219: {
    forest_join_215: {
    forest_join_209: {
    forest_join_208: {
    forest_join_204: {
    forest_join_200: {
    forest_join_172: {
    forest_join_170: {
    forest_join_159: {
    forest_join_145: {
    forest_join_127: {
    forest_join_124: {
    forest_join_118: {
    forest_join_90: {
    forest_join_89: {
    forest_join_65: {
    forest_join_64: {
    forest_join_63: {
    forest_join_55: {
    forest_join_54: {
    forest_join_53: {
    forest_join_49: {
    forest_join_42: {
    forest_join_31: {
    life2_3 = (com.moon.fE.k ^ 15648222001037L);
    spill49_0 = moom.DD.a__Boolean();
    this.h = ((float)(((com.moon.event.MotionEvent)(p0)).a()));
    life4_9 = ((spill49_0) ? 1 : 0);
    this.i = ((float)(((com.moon.event.MotionEvent)(p0)).b__sourceReturn_bc607678b6()));
    this.j = ((float)(((com.moon.event.MotionEvent)(p0)).c()));
    spill49_1 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.Speed)(((com.moon.module.impl.Speed)(((com.moon.fE)(this)).a())))).c())).getValue())))).booleanValue();
    if (!((life4_9 != 0))) {
        forestValue49_31_0 = ((spill49_1) ? 1 : 0);
        break forest_join_31;
    }
    if (!(spill49_1)) {
        break forest_join_219;
    }
    forestValue49_31_0 = ((((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fE.a)).K)).ae()) ? 1 : 0);
    }
    if (!((life4_9 != 0))) {
        forestValue49_42_0 = forestValue49_31_0;
        break forest_join_42;
    }
    if (!((forestValue49_31_0 != 0))) {
        break forest_join_219;
    }
    com.moon.fE __stackOp49_20_0 = this;
    ((com.moon.fE)(__stackOp49_20_0)).e = ((int)((((com.moon.fE)(__stackOp49_20_0)).e + 1)));
    forestValue49_42_0 = this.e;
    }
    if (!((life4_9 != 0))) {
        forestValue49_49_0 = forestValue49_42_0;
        break forest_join_49;
    }
    if (!((forestValue49_42_0 == 1))) {
        break forest_join_54;
    }
    forestValue49_49_0 = ((((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fE.a)).K)).A) ? 1 : 0);
    }
    if (!((life4_9 != 0))) {
        forestValue49_53_0 = forestValue49_49_0;
        break forest_join_53;
    }
    if (!((forestValue49_49_0 != 0))) {
        break forest_join_54;
    }
    forestValue49_53_0 = 1;
    }
    forestValue49_55_0 = forestValue49_53_0;
    break forest_join_55;
    }
    forestValue49_55_0 = 0;
    }
    life5_62 = forestValue49_55_0;
    spill49_2 = this.e;
    if (!((life4_9 != 0))) {
        forestValue49_63_0 = spill49_2;
        break forest_join_63;
    }
    if (!((spill49_2 == 2))) {
        break forest_join_64;
    }
    forestValue49_63_0 = 1;
    }
    forestValue49_65_0 = forestValue49_63_0;
    break forest_join_65;
    }
    forestValue49_65_0 = 0;
    }
    life6_74 = forestValue49_65_0;
    life7_76 = 0x1.333334p-1f;
    this.f = ((double)(this.g));
    com.moon.fE __stackOp49_31_0 = this;
    ((com.moon.fE)(__stackOp49_31_0)).f = ((double)((((com.moon.fE)(__stackOp49_31_0)).f * 0x1.d1eb86p-1d)));
    spill49_3 = life6_74;
    if (!((life4_9 != 0))) {
        forestValue49_90_0 = spill49_3;
        break forest_join_90;
    }
    if (!((spill49_3 != 0))) {
        break forest_join_89;
    }
    com.moon.fE __stackOp49_34_0 = this;
    ((com.moon.fE)(__stackOp49_34_0)).f = ((double)((((com.moon.fE)(__stackOp49_34_0)).f * ((double) life7_76))));
    }
    forestValue49_90_0 = life5_62;
    }
    if (!((forestValue49_90_0 != 0))) {
        break forest_join_118;
    }
    com.moon.fE __stackOp49_37_0 = this;
    ((com.moon.fE)(__stackOp49_37_0)).f = ((double)((((com.moon.fE)(__stackOp49_37_0)).f + 0x1.99999ap-3d)));
    com.moon.fE __stackOp49_40_0 = this;
    ((com.moon.fE)(__stackOp49_40_0)).f = ((double)((((com.moon.fE)(__stackOp49_40_0)).f + ((double) ((((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fE.a)).K)).i__sourceReturn_bc607678b6() * 0x1.4d5b12p-3f) / ((float) java.lang.Math.pow(((double)(((double) (0x1.d1eb86p-1f * life7_76)))), ((double)(0x1.8p1d)))))))));
    if (!((life4_9 == 0))) {
        break forest_join_124;
    }
    }
    com.moon.fE __stackOp49_47_0 = this;
    ((com.moon.fE)(__stackOp49_47_0)).f = ((double)((((com.moon.fE)(__stackOp49_47_0)).f + 0x1.a9fbe6p-6d)));
    }
    switch (this.e) {
case 1:
{
        break forest_join_127;
    }
case 2:
{
        break forest_join_170;
    }
default:
{
        break forest_join_172;
    }
}
    }
    life8_141 = 0x1.ae147ap-2f;
    if (!((life4_9 != 0))) {
        break forest_join_215;
    }
    if (!(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fE.a)).K)).A)) {
        break forest_join_208;
    }
    spill49_4 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fE.a)).K)).ae();
    if (!((life4_9 != 0))) {
        forestValue49_145_0 = ((spill49_4) ? 1 : 0);
        break forest_join_145;
    }
    if (!(spill49_4)) {
        break forest_join_208;
    }
    forestValue49_145_0 = ((((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fE.a)).K)).a__Boolean(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.k)))) ? 1 : 0);
    }
    if (!((forestValue49_145_0 != 0))) {
        break forest_join_159;
    }
    life8_141 = (life8_141 + (((float) (((net.minecraft.potion.PotionEffect)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fE.a)).K)).a(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.k))))).c() + 1)) * 0x1.99999ap-4f));
    }
    spill49_5 = p0;
    net.minecraft.client.entity.EntityPlayerSP __stackOp49_70_0 = ((net.minecraft.client.Minecraft)(com.moon.fE.a)).K;
    double __stackOp49_70_1 = ((double) life8_141);
    spill49_6 = __stackOp49_70_1;
    ((net.minecraft.client.entity.EntityPlayerSP)(__stackOp49_70_0)).u = ((double)(__stackOp49_70_1));
    ((com.moon.event.MotionEvent)(spill49_5)).setMotionY(((double)(spill49_6)));
    if (!((life4_9 == 0))) {
        break forest_join_208;
    }
    }
    if (!((life4_9 == 0))) {
        break forest_join_208;
    }
    }
    life9_199 = ((moom.CA)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fE.a)).K)).b())).c(((double)(0x0.0p0d)), ((double)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fE.a)).K)).u)), ((double)(0x0.0p0d)));
    life10_203 = ((((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fE.a)).K)).C) ? 1 : 0);
    spill49_7 = ((java.util.List)(((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(com.moon.fE.a)).I)).a(((net.minecraft.entity.Entity)(((net.minecraft.client.Minecraft)(com.moon.fE.a)).K)), ((moom.CA)(life9_199))))).size();
    if (!((life4_9 != 0))) {
        forestValue49_204_0 = spill49_7;
        break forest_join_204;
    }
    if (!((spill49_7 <= 0))) {
        break forest_join_200;
    }
    spill49_8 = life10_203;
    if (!((life4_9 != 0))) {
        forestValue49_204_0 = spill49_8;
        break forest_join_204;
    }
    if (!((spill49_8 != 0))) {
        break forest_join_208;
    }
    }
    spill49_9 = this;
    if (!((life4_9 != 0))) {
        forestValue49_209_0 = spill49_9;
        break forest_join_209;
    }
    forestValue49_204_0 = ((com.moon.fE)(spill49_9)).e;
    }
    if (!((forestValue49_204_0 > 0))) {
        break forest_join_208;
    }
    this.e = ((int)(0));
    }
    forestValue49_209_0 = this;
    }
    ((com.moon.fE)(forestValue49_209_0)).f = ((double)(java.lang.Math.max(((double)(this.f)), ((double)(com.moon.nJ.a(((boolean)(true))))))));
    }
    ((com.moon.event.MotionEvent)(p0)).applyMotionSpeed(((double)(this.f)));
    }
    return;
}

}
