package com.moon;


public class gA {

private static final java.util.List<float[]> a;

private static final net.minecraft.client.Minecraft b;

private final com.moon.module.impl.ScaffoldWalk c;

private final com.moon.gD d;

private static final long e;

public gA(com.moon.module.impl.ScaffoldWalk p0) {
super();
    this.d = new com.moon.gD();
    this.c = p0;
}


static {
e = ((long)(((moom._a)(moom._c.a(((long)(-4441506846113315471L)), ((long)(-7636380898919015036L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(164161277716295L)))));
    a = ((java.util.List)(new java.util.ArrayList()));
    b = ((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM()));
    float local0_life8 = 0x0.0p0f;
    float local1_life9 = 0x0.0p0f;
    while ((local1_life9 < 0x1.68p6f)) {
        float local2_life11 = ((float) ((0x1.9e3779b97f681p0d * ((double) moom.Dr.c)) * ((double) local0_life8)));
        float local3_life13 = (moom.Dr.a(((float)(local2_life11))) * local1_life9);
        float local4_life15 = (moom.Dr.b(((float)(local2_life11))) * local1_life9);
        ((java.util.List)(com.moon.gA.a)).add(((java.lang.Object)(new float[] {local3_life13, local4_life15})));
        local0_life8 = (local0_life8 + 0x1.0p0f);
        local1_life9 = moom.Dr.c(((float)(local0_life8)));
    }
}


public void b() {
return;
}


private float a(float p0, float p1, float p2) {
int forwardValue233_25_0;
    float forwardValue233_31_0;
    float forwardValue233_31_1;
    boolean spill233_0;
    int spill233_1;
    float spill233_2;
    float spill233_3;
    long life4_3;
    float life7_9;
    int life6_10;
    forward_join_31: {
    forward_join_29: {
    forward_join_25: {
    forward_join_19: {
    life4_3 = (com.moon.gA.e ^ 3844880439263L);
    spill233_0 = com.moon.gD.b__Boolean();
    life7_9 = moom.Dr.e(((float)((p1 - p0))));
    life6_10 = ((spill233_0) ? 1 : 0);
    spill233_1 = recovery.source.CarrierOps.fcmpl(((float)(life7_9)), ((float)(p2)));
    if (!((life6_10 != 0))) {
        forwardValue233_25_0 = spill233_1;
        break forward_join_25;
    }
    if (!((spill233_1 > 0))) {
        break forward_join_19;
    }
    life7_9 = p2;
    }
    spill233_2 = life7_9;
    spill233_3 = (-p2);
    if (!((life6_10 != 0))) {
        forwardValue233_31_0 = spill233_2;
        forwardValue233_31_1 = spill233_3;
        break forward_join_31;
    }
    forwardValue233_25_0 = recovery.source.CarrierOps.fcmpg(((float)(spill233_2)), ((float)(spill233_3)));
    }
    if (!((forwardValue233_25_0 < 0))) {
        break forward_join_29;
    }
    life7_9 = (-p2);
    }
    forwardValue233_31_0 = p0;
    forwardValue233_31_1 = life7_9;
    }
    return (forwardValue233_31_0 + forwardValue233_31_1);
}


public com.moon.module.impl.ScaffoldWalk a__lK() {
return this.c;
}


public com.moon.gD a() {
return this.d;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a__Void() {
long local1 = (com.moon.gA.e ^ 15309998083457L);
    ((com.moon.gD)(this.d)).a(((float)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.gA.b)).K)).w)), ((float)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.gA.b)).K)).x)));
    boolean local3 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.ScaffoldWalk)(this.c)).n())).getValue())))).booleanValue();
    ((com.moon.gD)(this.d)).c(((float)((local3 ? (((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.gA.b)).K)).w - 0x1.68p7f) : ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.gA.b)).K)).w))), ((float)((local3 ? 0x1.5p6f : ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.gA.b)).K)).x))));
    return;
}


public boolean a__Boolean(moom.DT p0, moom.bs p1) {
return (__sourceIntrinsic_booleanComparison((this.a(((moom.DT)(p0)), ((moom.bs)(p1)), ((float)(((com.moon.n4)(((com.moon.gD)(this.d)).b())).a__Float())), ((float)(((com.moon.n4)(((com.moon.gD)(this.d)).b())).b__Float())), ((float)(0x1.2p2f))))) != 0);
}


private boolean a(moom.DT p0, moom.bs p1, float p2, float p3, float p4) {
net.minecraft.util.MovingObjectPosition forwardValue235_17_0;
    net.minecraft.util.MovingObjectPosition forwardValue235_22_0;
    net.minecraft.util.MovingObjectPosition forwardValue235_27_0;
    net.minecraft.util.MovingObjectPosition forwardValue235_34_0;
    int forwardValue235_40_0;
    boolean spill235_0;
    net.minecraft.util.MovingObjectPosition spill235_1;
    long life6_3;
    net.minecraft.util.MovingObjectPosition life9_10;
    int life8_11;
    forward_join_40: {
    forward_join_39: {
    forward_join_34: {
    forward_join_27: {
    forward_join_22: {
    forward_join_17: {
    life6_3 = (com.moon.gA.e ^ 116241546632345L);
    spill235_0 = com.moon.gD.c__Boolean();
    life9_10 = com.moon.nQ.a(((float)(p2)), ((float)(p3)), ((float)(p4)), ((float)(0x1.0p0f)));
    life8_11 = ((spill235_0) ? 1 : 0);
    spill235_1 = life9_10;
    if (!((life8_11 == 0))) {
        forwardValue235_17_0 = spill235_1;
        break forward_join_17;
    }
    if (!((spill235_1 != null))) {
        break forward_join_39;
    }
    forwardValue235_17_0 = life9_10;
    }
    if (!((life8_11 == 0))) {
        forwardValue235_22_0 = forwardValue235_17_0;
        break forward_join_22;
    }
    if (!((((net.minecraft.util.MovingObjectPosition)(forwardValue235_17_0)).a() != null))) {
        break forward_join_39;
    }
    forwardValue235_22_0 = life9_10;
    }
    if (!((life8_11 == 0))) {
        forwardValue235_27_0 = forwardValue235_22_0;
        break forward_join_27;
    }
    if (!((((net.minecraft.util.MovingObjectPosition)(forwardValue235_22_0)).c != null))) {
        break forward_join_39;
    }
    forwardValue235_27_0 = life9_10;
    }
    if (!((life8_11 == 0))) {
        forwardValue235_34_0 = forwardValue235_27_0;
        break forward_join_34;
    }
    if (!(((moom.DT)(((net.minecraft.util.MovingObjectPosition)(forwardValue235_27_0)).a())).equals(((java.lang.Object)(p0))))) {
        break forward_join_39;
    }
    forwardValue235_34_0 = life9_10;
    }
    if (!((((net.minecraft.util.MovingObjectPosition)(forwardValue235_34_0)).c == p1))) {
        break forward_join_39;
    }
    forwardValue235_40_0 = 1;
    break forward_join_40;
    }
    forwardValue235_40_0 = 0;
    }
    return ((forwardValue235_40_0) != 0);
}


private void a(moom.bs p0, moom.DR p1, com.moon.pw p2) {
int forwardValue236_36_0;
    int spill236_0;
    long life4_3;
    int life6_5;
    forward_join_46: {
    forward_join_36: {
    forward_join_27: {
    life4_3 = (com.moon.gA.e ^ 114355792272163L);
    life6_5 = ((com.moon.gD.c__Boolean()) ? 1 : 0);
    spill236_0 = recovery.source.CarrierOps.dcmpg(((double)(java.lang.Math.abs(((double)((((double) ((com.moon.pw)(p2)).r()) - ((moom.DR)(p1)).c)))))), ((double)(0x1.0p-1d)));
    if (!((life6_5 == 0))) {
        forwardValue236_36_0 = spill236_0;
        break forward_join_36;
    }
    if (!((spill236_0 <= 0))) {
        break forward_join_27;
    }
    if (!((((moom.bs)(p0)).a__bt() == net.minecraft.util.EnumFacing$Axis.X))) {
        break forward_join_27;
    }
    ((moom.DR)(p1)).c = ((double)(((double) ((com.moon.pw)(p2)).r())));
    }
    forwardValue236_36_0 = recovery.source.CarrierOps.dcmpg(((double)(java.lang.Math.abs(((double)((((double) ((com.moon.pw)(p2)).p()) - ((moom.DR)(p1)).a)))))), ((double)(0x1.0p-1d)));
    }
    if (!((forwardValue236_36_0 <= 0))) {
        break forward_join_46;
    }
    if (!((((moom.bs)(p0)).a__bt() == net.minecraft.util.EnumFacing$Axis.Z))) {
        break forward_join_46;
    }
    ((moom.DR)(p1)).a = ((double)(((double) ((com.moon.pw)(p2)).p())));
    }
    return;
}


public void a(moom.DT p0, moom.bs p1) {
com.moon.gA forestValue58_49_0;
    int forestValue58_217_0;
    int forestValue58_228_0;
    int forestValue58_241_0;
    net.minecraft.client.Minecraft forestValue58_247_0;
    float forestValue58_260_0;
    float forestValue58_260_1;
    float forestValue58_262_0;
    float forestValue58_262_1;
    float forestValue58_262_2;
    float forestValue58_262_3;
    float forestValue58_263_0;
    float forestValue58_263_1;
    float forestValue58_263_2;
    float forestValue58_276_0;
    float forestValue58_276_1;
    float forestValue58_276_2;
    float forestValue58_276_3;
    float forestValue58_278_0;
    float forestValue58_278_1;
    float forestValue58_279_0;
    float forestValue58_279_1;
    float forestValue58_279_2;
    int forestValue58_411_0;
    int forestValue58_419_0;
    int forestValue58_483_0;
    int forestValue58_489_0;
    net.minecraft.util.MovingObjectPosition forestValue58_536_0;
    net.minecraft.util.MovingObjectPosition forestValue58_541_0;
    net.minecraft.util.MovingObjectPosition forestValue58_546_0;
    net.minecraft.util.MovingObjectPosition forestValue58_553_0;
    int forestValue58_571_0;
    java.lang.Object forestValue58_589_0;
    int forestValue58_591_0;
    int forestValue58_607_0;
    int forestValue58_611_0;
    int forestValue58_613_0;
    boolean spill58_0;
    com.moon.gA spill58_1;
    int spill58_2;
    int spill58_3;
    int spill58_4;
    boolean spill58_5;
    net.minecraft.client.Minecraft spill58_6;
    float spill58_7;
    float spill58_8;
    float spill58_9;
    float spill58_10;
    float spill58_11;
    float spill58_12;
    float spill58_13;
    float spill58_14;
    int spill58_15;
    int spill58_16;
    int spill58_17;
    int spill58_18;
    int spill58_19;
    net.minecraft.util.MovingObjectPosition spill58_20;
    int spill58_21;
    int spill58_22;
    long life3_3;
    com.moon.n4 life6_9;
    int life5_10;
    moom.DR life7_15;
    float life8_23;
    com.moon.pw life9_38;
    com.moon.pw life10_67;
    float[] life11_71;
    float life12_85;
    java.util.Iterator life13_99;
    float[] life14_106;
    float life15_112;
    float life16_124;
    int life17_132;
    float life13_166;
    int life14_181;
    float life13_208;
    float life14_210;
    float life15_262;
    float life16_297;
    float life17_303;
    float life18_308;
    float life19_318;
    int life20_333;
    float life13_360;
    float life14_362;
    int life15_364;
    java.util.Iterator life16_367;
    float[] life17_374;
    float life18_380;
    float life19_392;
    int life20_400;
    float life21_415;
    java.util.Iterator life16_448;
    float[] life17_455;
    float life18_461;
    float life19_473;
    int life20_481;
    float life21_492;
    float life13_522;
    float life16_527;
    int life17_529;
    java.util.Iterator life18_532;
    float[] life19_539;
    float life20_551;
    net.minecraft.util.MovingObjectPosition life21_557;
    int life13_659;
    forest_join_630: {
    forest_join_629: {
    forest_join_613: {
    forest_join_612: {
    forest_join_611: {
    forest_join_607: {
    forest_join_591: {
    forest_join_589: {
    forest_join_585: {
    forest_join_576: {
    forest_join_489: {
    forest_join_488: {
    forest_join_419: {
    forest_join_416: {
    forest_join_340: {
    forest_join_338: {
    forest_join_279: {
    forest_join_278: {
    forest_join_276: {
    forest_join_263: {
    forest_join_262: {
    forest_join_260: {
    forest_join_247: {
    forest_join_246: {
    forest_join_241: {
    forest_join_235: {
    forest_join_228: {
    forest_join_224: {
    forest_join_217: {
    forest_join_213: {
    forest_join_198: {
    forest_join_196: {
    forest_join_151: {
    forest_join_149: {
    forest_join_95: {
    forest_join_53: {
    forest_join_49: {
    life3_3 = (com.moon.gA.e ^ 14385718643247L);
    spill58_0 = com.moon.gD.c__Boolean();
    life6_9 = ((com.moon.n4)(((com.moon.gD)(this.d)).c())).a__n4();
    life5_10 = ((spill58_0) ? 1 : 0);
    life7_15 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.gA.b)).K)).b(((float)(0x1.0p0f)));
    life8_23 = ((((float) ((moom.bs)(p1)).d()) * 0x1.0p-1f) + 0x1.0p-1f);
    life9_38 = ((com.moon.pw)(com.moon.pw.a(((moom.DT)(p0))))).a(((float)((((float) ((moom.bs)(p1)).c()) * 0x1.0p-1f))), ((float)(life8_23)), ((float)((((float) ((moom.bs)(p1)).e()) * 0x1.0p-1f))));
    spill58_1 = this;
    if (!((life5_10 == 0))) {
        forestValue58_49_0 = spill58_1;
        break forest_join_49;
    }
    if (!(((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.ScaffoldWalk)(((com.moon.gA)(spill58_1)).a__lK())).q())).getValue())))).booleanValue())) {
        break forest_join_53;
    }
    forestValue58_49_0 = this;
    }
    ((com.moon.gA)(forestValue58_49_0)).a(((moom.bs)(p1)), ((moom.DR)(life7_15)), ((com.moon.pw)(life9_38)));
    }
    life10_67 = new com.moon.pw(((float) ((moom.DR)(life7_15)).a), ((float) ((moom.DR)(life7_15)).b), ((float) ((moom.DR)(life7_15)).c));
    life11_71 = com.moon.nI.a(((com.moon.pw)(life10_67)), ((com.moon.pw)(life9_38)));
    ((com.moon.gD)(this.d)).b(((float)((life11_71)[0])), ((float)((life11_71)[1])));
    life12_85 = ((com.moon.n4)(((com.moon.gD)(this.d)).a())).a__Float();
    spill58_2 = (com.moon.gB.a)[((com.moon.bF)(((com.moon.bF)(((com.moon.setting.ModeSetting)(((com.moon.module.impl.ScaffoldWalk)(this.c)).e__kY())).getValue())))).ordinal()];
    if (!((life5_10 == 0))) {
        forestValue58_591_0 = spill58_2;
        break forest_join_591;
    }
    switch (spill58_2) {
case 1:
{
        break forest_join_95;
    }
case 2:
{
        break forest_join_151;
    }
case 3:
{
        break forest_join_198;
    }
case 4:
{
        break forest_join_340;
    }
default:
{
        break forest_join_585;
    }
}
    }
    life13_99 = ((java.util.List)(com.moon.gA.a)).iterator();
    forest_cycle_98: while (true) {
    forest_join_147: {
    forest_join_142: {
    if (!(((java.util.Iterator)(life13_99)).hasNext())) {
        break forest_join_149;
    }
    life14_106 = ((float[])(((java.util.Iterator)(life13_99)).next()));
    life15_112 = (life12_85 + (life14_106)[0]);
    life16_124 = moom.Dr.a(((float)((((com.moon.n4)(((com.moon.gD)(this.d)).a())).b__Float() + (life14_106)[1]))), ((float)(-0x1.68p6f)), ((float)(0x1.68p6f)));
    life17_132 = ((this.a(((moom.DT)(p0)), ((moom.bs)(p1)), ((float)(life15_112)), ((float)(life16_124)), ((float)(0x1.2p2f)))) ? 1 : 0);
    if (!((life5_10 == 0))) {
        break forest_join_142;
    }
    spill58_3 = life17_132;
    if (!((life5_10 == 0))) {
        forestValue58_591_0 = spill58_3;
        break forest_join_591;
    }
    if (!((spill58_3 != 0))) {
        break forest_join_147;
    }
    ((com.moon.gD)(this.d)).b(((float)(life15_112)), ((float)(life16_124)));
    }
    if (!((life5_10 != 0))) {
        break forest_join_149;
    }
    net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[2])));
    }
    if (!((life5_10 != 0))) {
        continue forest_cycle_98;
    }
    break forest_cycle_98;
    }
    }
    if (!((life5_10 != 0))) {
        break forest_join_585;
    }
    }
    ((com.moon.gD)(this.d)).b(((float)((((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.gA.b)).K)).w - 0x1.68p7f))));
    life13_166 = 0x1.04p6f;
    forest_cycle_161: while (true) {
    forest_join_194: {
    forest_join_188: {
    if (!((recovery.source.CarrierOps.fcmpg(((float)(life13_166)), ((float)(0x1.5p6f))) <= 0))) {
        break forest_join_196;
    }
    life14_181 = ((this.a(((moom.DT)(p0)), ((moom.bs)(p1)), ((float)(((com.moon.n4)(((com.moon.gD)(this.d)).c())).a__Float())), ((float)(life13_166)), ((float)(0x1.2p2f)))) ? 1 : 0);
    if (!((life5_10 == 0))) {
        break forest_join_194;
    }
    spill58_4 = life14_181;
    if (!((life5_10 == 0))) {
        forestValue58_591_0 = spill58_4;
        break forest_join_591;
    }
    if (!((spill58_4 != 0))) {
        break forest_join_188;
    }
    ((com.moon.gD)(this.d)).a(((float)(life13_166)));
    if (!((life5_10 != 0))) {
        break forest_join_196;
    }
    }
    life13_166 = ((float) (((double) life13_166) + 0x1.47ae147ae147bp-8d));
    }
    if (!((life5_10 != 0))) {
        continue forest_cycle_161;
    }
    break forest_cycle_161;
    }
    }
    if (!((life5_10 != 0))) {
        break forest_join_585;
    }
    }
    life13_208 = 0x0.0p0f;
    life14_210 = 0x0.0p0f;
    spill58_5 = ((moom.pz)(((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(com.moon.gA.b)).W)).al)).a__Boolean();
    if (!((life5_10 == 0))) {
        forestValue58_217_0 = ((spill58_5) ? 1 : 0);
        break forest_join_217;
    }
    if (!(spill58_5)) {
        break forest_join_213;
    }
    life14_210 = (life14_210 + 0x1.0p0f);
    }
    forestValue58_217_0 = ((((moom.pz)(((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(com.moon.gA.b)).W)).an)).a__Boolean()) ? 1 : 0);
    }
    if (!((life5_10 == 0))) {
        forestValue58_228_0 = forestValue58_217_0;
        break forest_join_228;
    }
    if (!((forestValue58_217_0 != 0))) {
        break forest_join_224;
    }
    life14_210 = (life14_210 - 0x1.0p0f);
    }
    forestValue58_228_0 = ((((moom.pz)(((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(com.moon.gA.b)).W)).am)).a__Boolean()) ? 1 : 0);
    }
    if (!((life5_10 == 0))) {
        forestValue58_241_0 = forestValue58_228_0;
        break forest_join_241;
    }
    if (!((forestValue58_228_0 != 0))) {
        break forest_join_235;
    }
    life13_208 = (life13_208 + 0x1.0p0f);
    }
    spill58_6 = com.moon.gA.b;
    if (!((life5_10 == 0))) {
        forestValue58_247_0 = spill58_6;
        break forest_join_247;
    }
    forestValue58_241_0 = ((((moom.pz)(((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(spill58_6)).W)).ao)).a__Boolean()) ? 1 : 0);
    }
    if (!((forestValue58_241_0 != 0))) {
        break forest_join_246;
    }
    life13_208 = (life13_208 - 0x1.0p0f);
    }
    forestValue58_247_0 = com.moon.gA.b;
    }
    life15_262 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(forestValue58_247_0)).K)).w;
    spill58_7 = life15_262;
    spill58_8 = 0x1.68p7f;
    spill58_9 = life14_210;
    spill58_10 = 0x0.0p0f;
    if (!((life5_10 == 0))) {
        forestValue58_262_0 = spill58_7;
        forestValue58_262_1 = spill58_8;
        forestValue58_262_2 = spill58_9;
        forestValue58_262_3 = spill58_10;
        break forest_join_262;
    }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(spill58_9)), ((float)(spill58_10))) == 0))) {
        forestValue58_260_0 = spill58_7;
        forestValue58_260_1 = spill58_8;
        break forest_join_260;
    }
    forestValue58_263_0 = spill58_7;
    forestValue58_263_1 = spill58_8;
    forestValue58_263_2 = 0x1.0p0f;
    break forest_join_263;
    }
    forestValue58_262_0 = forestValue58_260_0;
    forestValue58_262_1 = forestValue58_260_1;
    forestValue58_262_2 = life14_210;
    forestValue58_262_3 = 0x0.0p0f;
    }
    forestValue58_263_0 = forestValue58_262_0;
    forestValue58_263_1 = forestValue58_262_1;
    forestValue58_263_2 = java.lang.Math.max(((float)(forestValue58_262_2)), ((float)(forestValue58_262_3)));
    }
    spill58_11 = (forestValue58_263_0 - (forestValue58_263_1 * forestValue58_263_2));
    spill58_12 = (0x1.68p6f * life13_208);
    spill58_13 = life14_210;
    spill58_14 = 0x0.0p0f;
    if (!((life5_10 == 0))) {
        forestValue58_276_0 = spill58_11;
        forestValue58_276_1 = spill58_12;
        forestValue58_276_2 = spill58_13;
        forestValue58_276_3 = spill58_14;
        break forest_join_276;
    }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(spill58_13)), ((float)(spill58_14))) != 0))) {
        forestValue58_278_0 = spill58_11;
        forestValue58_278_1 = spill58_12;
        break forest_join_278;
    }
    forestValue58_276_0 = spill58_11;
    forestValue58_276_1 = spill58_12;
    forestValue58_276_2 = 0x1.0p1f;
    forestValue58_276_3 = life14_210;
    }
    forestValue58_279_0 = forestValue58_276_0;
    forestValue58_279_1 = forestValue58_276_1;
    forestValue58_279_2 = (forestValue58_276_2 * forestValue58_276_3);
    break forest_join_279;
    }
    forestValue58_279_0 = forestValue58_278_0;
    forestValue58_279_1 = forestValue58_278_1;
    forestValue58_279_2 = 0x1.0p0f;
    }
    life16_297 = (forestValue58_279_0 + (forestValue58_279_1 / forestValue58_279_2));
    life17_303 = (((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.gA.b)).K)).w % 0x1.68p8f);
    life18_308 = moom.Dr.e(((float)((life17_303 - life16_297))));
    ((com.moon.gD)(this.d)).b(((float)((((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.gA.b)).K)).w + life18_308))));
    life19_318 = 0x1.04p6f;
    forest_cycle_303: while (true) {
    forest_join_336: {
    forest_join_330: {
    if (!((recovery.source.CarrierOps.fcmpg(((float)(life19_318)), ((float)(0x1.5p6f))) <= 0))) {
        break forest_join_338;
    }
    life20_333 = ((this.a(((moom.DT)(p0)), ((moom.bs)(p1)), ((float)(((com.moon.n4)(((com.moon.gD)(this.d)).c())).a__Float())), ((float)(life19_318)), ((float)(0x1.2p2f)))) ? 1 : 0);
    if (!((life5_10 == 0))) {
        break forest_join_336;
    }
    spill58_15 = life20_333;
    if (!((life5_10 == 0))) {
        forestValue58_591_0 = spill58_15;
        break forest_join_591;
    }
    if (!((spill58_15 != 0))) {
        break forest_join_330;
    }
    ((com.moon.gD)(this.d)).a(((float)(life19_318)));
    if (!((life5_10 != 0))) {
        break forest_join_338;
    }
    }
    life19_318 = ((float) (((double) life19_318) + 0x1.47ae147ae147bp-8d));
    }
    if (!((life5_10 != 0))) {
        continue forest_cycle_303;
    }
    break forest_cycle_303;
    }
    }
    if (!((life5_10 != 0))) {
        break forest_join_585;
    }
    }
    life13_360 = 0x1.fffffep127f;
    life14_362 = 0x0.0p0f;
    life15_364 = 0;
    life16_367 = ((java.util.List)(com.moon.gA.a)).iterator();
    forest_cycle_349: while (true) {
    forest_join_414: {
    forest_join_411: {
    if (!(((java.util.Iterator)(life16_367)).hasNext())) {
        break forest_join_416;
    }
    life17_374 = ((float[])(((java.util.Iterator)(life16_367)).next()));
    life18_380 = (life12_85 + (life17_374)[0]);
    life19_392 = moom.Dr.a(((float)((((com.moon.n4)(((com.moon.gD)(this.d)).a())).b__Float() + (life17_374)[1]))), ((float)(-0x1.68p6f)), ((float)(0x1.68p6f)));
    life20_400 = ((this.a(((moom.DT)(p0)), ((moom.bs)(p1)), ((float)(life18_380)), ((float)(life19_392)), ((float)(0x1.2p2f)))) ? 1 : 0);
    spill58_16 = life20_400;
    if (!((life5_10 == 0))) {
        forestValue58_419_0 = spill58_16;
        break forest_join_419;
    }
    if (!((spill58_16 != 0))) {
        break forest_join_414;
    }
    life21_415 = java.lang.Math.abs(((float)(moom.Dr.e(((float)((life18_380 - (((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.gA.b)).K)).w - 0x1.68p7f))))))));
    spill58_17 = recovery.source.CarrierOps.fcmpg(((float)(life21_415)), ((float)(life13_360)));
    if (!((life5_10 == 0))) {
        forestValue58_411_0 = spill58_17;
        break forest_join_411;
    }
    if (!((spill58_17 < 0))) {
        break forest_join_414;
    }
    life15_364 = 1;
    life14_362 = life18_380;
    life13_360 = life21_415;
    forestValue58_411_0 = recovery.source.CarrierOps.fcmpg(((float)(life21_415)), ((float)(0x1.0p0f)));
    }
    if (!((forestValue58_411_0 <= 0))) {
        break forest_join_414;
    }
    if (!((life5_10 != 0))) {
        break forest_join_416;
    }
    }
    if (!((life5_10 != 0))) {
        continue forest_cycle_349;
    }
    break forest_cycle_349;
    }
    }
    forestValue58_419_0 = recovery.source.CarrierOps.fcmpl(((float)(life13_360)), ((float)(0x1.4p2f)));
    }
    if (!((life5_10 == 0))) {
        forestValue58_489_0 = forestValue58_419_0;
        break forest_join_489;
    }
    if (!((forestValue58_419_0 > 0))) {
        break forest_join_488;
    }
    life16_448 = ((java.util.List)(com.moon.gA.a)).iterator();
    forest_cycle_425: while (true) {
    forest_join_486: {
    forest_join_483: {
    if (!(((java.util.Iterator)(life16_448)).hasNext())) {
        break forest_join_488;
    }
    life17_455 = ((float[])(((java.util.Iterator)(life16_448)).next()));
    life18_461 = (life12_85 + (life17_455)[0]);
    life19_473 = moom.Dr.a(((float)((((com.moon.n4)(((com.moon.gD)(this.d)).a())).b__Float() + (life17_455)[1]))), ((float)(-0x1.68p6f)), ((float)(0x1.68p6f)));
    life20_481 = ((this.a(((moom.DT)(p0)), ((moom.bs)(p1)), ((float)(life18_461)), ((float)(life19_473)), ((float)(0x1.2p2f)))) ? 1 : 0);
    spill58_18 = life20_481;
    if (!((life5_10 == 0))) {
        forestValue58_489_0 = spill58_18;
        break forest_join_489;
    }
    if (!((spill58_18 != 0))) {
        break forest_join_486;
    }
    life21_492 = java.lang.Math.abs(((float)(moom.Dr.e(((float)((life18_461 - life12_85)))))));
    spill58_19 = recovery.source.CarrierOps.fcmpg(((float)(life21_492)), ((float)(life13_360)));
    if (!((life5_10 == 0))) {
        forestValue58_483_0 = spill58_19;
        break forest_join_483;
    }
    if (!((spill58_19 < 0))) {
        break forest_join_486;
    }
    life15_364 = 1;
    life14_362 = life18_461;
    life13_360 = life21_492;
    forestValue58_483_0 = recovery.source.CarrierOps.fcmpg(((float)(life21_492)), ((float)(0x1.0p0f)));
    }
    if (!((forestValue58_483_0 <= 0))) {
        break forest_join_486;
    }
    if (!((life5_10 != 0))) {
        break forest_join_488;
    }
    }
    if (!((life5_10 != 0))) {
        continue forest_cycle_425;
    }
    break forest_cycle_425;
    }
    }
    forestValue58_489_0 = life15_364;
    }
    if (!((life5_10 == 0))) {
        forestValue58_591_0 = forestValue58_489_0;
        break forest_join_591;
    }
    if (!((forestValue58_489_0 != 0))) {
        break forest_join_585;
    }
    life13_522 = 0x1.fffffep127f;
    life16_527 = ((com.moon.n4)(((com.moon.gD)(this.d)).a())).b__Float();
    life17_529 = 0;
    life18_532 = ((java.util.List)(com.moon.gA.a)).iterator();
    forest_cycle_504: while (true) {
    forest_join_574: {
    forest_join_571: {
    forest_join_553: {
    forest_join_546: {
    forest_join_541: {
    forest_join_536: {
    if (!(((java.util.Iterator)(life18_532)).hasNext())) {
        break forest_join_576;
    }
    life19_539 = ((float[])(((java.util.Iterator)(life18_532)).next()));
    life20_551 = moom.Dr.a(((float)((((com.moon.n4)(((com.moon.gD)(this.d)).a())).b__Float() + (life19_539)[1]))), ((float)(-0x1.68p6f)), ((float)(0x1.68p6f)));
    life21_557 = com.moon.nQ.a(((float)(life14_362)), ((float)(life20_551)), ((float)(0x1.2p2f)), ((float)(0x1.0p0f)));
    spill58_20 = life21_557;
    if (!((life5_10 == 0))) {
        forestValue58_589_0 = spill58_20;
        break forest_join_589;
    }
    if (!((life5_10 == 0))) {
        forestValue58_536_0 = spill58_20;
        break forest_join_536;
    }
    if (!((spill58_20 != null))) {
        break forest_join_574;
    }
    forestValue58_536_0 = life21_557;
    }
    if (!((life5_10 == 0))) {
        forestValue58_541_0 = forestValue58_536_0;
        break forest_join_541;
    }
    if (!((((net.minecraft.util.MovingObjectPosition)(forestValue58_536_0)).a() != null))) {
        break forest_join_574;
    }
    forestValue58_541_0 = life21_557;
    }
    if (!((life5_10 == 0))) {
        forestValue58_546_0 = forestValue58_541_0;
        break forest_join_546;
    }
    if (!((((net.minecraft.util.MovingObjectPosition)(forestValue58_541_0)).c != null))) {
        break forest_join_574;
    }
    forestValue58_546_0 = life21_557;
    }
    if (!((life5_10 == 0))) {
        forestValue58_553_0 = forestValue58_546_0;
        break forest_join_553;
    }
    if (!(((moom.DT)(((net.minecraft.util.MovingObjectPosition)(forestValue58_546_0)).a())).equals(((java.lang.Object)(p0))))) {
        break forest_join_574;
    }
    forestValue58_553_0 = life21_557;
    }
    if (!((((net.minecraft.util.MovingObjectPosition)(forestValue58_553_0)).c == p1))) {
        break forest_join_574;
    }
    spill58_21 = recovery.source.CarrierOps.fcmpg(((float)(life20_551)), ((float)(life13_522)));
    if (!((life5_10 == 0))) {
        forestValue58_571_0 = spill58_21;
        break forest_join_571;
    }
    if (!((spill58_21 < 0))) {
        break forest_join_574;
    }
    life17_529 = 1;
    life16_527 = life20_551;
    life13_522 = life20_551;
    forestValue58_571_0 = recovery.source.CarrierOps.fcmpg(((float)(life20_551)), ((float)(0x1.44p6f)));
    }
    if (!((forestValue58_571_0 <= 0))) {
        break forest_join_574;
    }
    if (!((life5_10 != 0))) {
        break forest_join_576;
    }
    }
    if (!((life5_10 != 0))) {
        continue forest_cycle_504;
    }
    break forest_cycle_504;
    }
    }
    spill58_22 = life17_529;
    if (!((life5_10 == 0))) {
        forestValue58_591_0 = spill58_22;
        break forest_join_591;
    }
    if (!((spill58_22 != 0))) {
        break forest_join_585;
    }
    ((com.moon.gD)(this.d)).b(((float)(life14_362)), ((float)(life16_527)));
    }
    forestValue58_589_0 = ((com.moon.setting.BooleanSetting)(((com.moon.module.impl.ScaffoldWalk)(this.c)).p())).getValue();
    }
    forestValue58_591_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(forestValue58_589_0)))).booleanValue()) ? 1 : 0);
    }
    if (!((life5_10 == 0))) {
        forestValue58_607_0 = forestValue58_591_0;
        break forest_join_607;
    }
    if (!((forestValue58_591_0 != 0))) {
        break forest_join_612;
    }
    forestValue58_607_0 = ((this.a(((moom.DT)(p0)), ((moom.bs)(p1)), ((float)(((com.moon.n4)(((com.moon.gD)(this.d)).b())).a__Float())), ((float)(((com.moon.n4)(((com.moon.gD)(this.d)).b())).b__Float())), ((float)(0x1.2p2f)))) ? 1 : 0);
    }
    if (!((life5_10 == 0))) {
        forestValue58_611_0 = forestValue58_607_0;
        break forest_join_611;
    }
    if (!((forestValue58_607_0 != 0))) {
        break forest_join_612;
    }
    forestValue58_611_0 = 1;
    }
    forestValue58_613_0 = forestValue58_611_0;
    break forest_join_613;
    }
    forestValue58_613_0 = 0;
    }
    life13_659 = forestValue58_613_0;
    if (!((life5_10 == 0))) {
        break forest_join_629;
    }
    if (!((life13_659 != 0))) {
        break forest_join_630;
    }
    ((com.moon.gD)(this.d)).b(((float)(((com.moon.n4)(((com.moon.gD)(this.d)).b())).a__Float())), ((float)(((com.moon.n4)(((com.moon.gD)(this.d)).b())).b__Float())));
    }
    return;
    }
    return;
}


private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
