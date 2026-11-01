package com.moon;


public class n7 {

private static net.minecraft.client.Minecraft a;

private java.util.ArrayList<moom.DR> b;

private net.minecraft.entity.EntityLivingBase c;

private float d;

private float e;

private double f;

private double g;

private double h;

private double i;

private double j;

private double k;

private float l;

private float m;

private float n;

private float o;

private float p;

private float q;

private boolean r;

private boolean s;

private boolean t;

private boolean u;

private boolean v;

private boolean w;

private static long x;

public n7(net.minecraft.entity.EntityLivingBase p0) { this((net.minecraft.entity.EntityLivingBase)null, 0.0F, 0.0F); }


private static void __sourceConstructorBody_c2af821b7b78cc91(com.moon.n7 receiver, net.minecraft.entity.EntityLivingBase p0) throws Throwable {

int forwardValue46_24_0;

    int forwardValue46_41_0;

    com.moon.n7 forwardValue46_51_0;

    int forwardValue46_113_0;

    com.moon.n7 forwardValue46_118_0;

    com.moon.n7 forwardValue46_128_0;

    int forwardValue46_128_1;

    com.moon.n7 forwardValue46_129_0;

    com.moon.n7 forwardValue46_130_0;

    int forwardValue46_130_1;

    com.moon.n7 forwardValue46_137_0;

    boolean spill46_0;

    boolean spill46_1;

    boolean spill46_2;

    com.moon.n7 spill46_3;

    com.moon.n7 spill46_4;

    int spill46_5;

    com.moon.n7 spill46_6;

    int spill46_7;

    com.moon.n7 spill46_8;

    long life2_3;

    float life5_11;

    int life4_12;

    float[] life6_87;

    float life7_90;

    forward_join_144: {

    forward_join_137: {

    forward_join_130: {

    forward_join_129: {

    forward_join_128: {

    forward_join_118: {

    forward_join_117: {

    forward_join_113: {

    forward_join_105: {

    forward_join_51: {

    forward_join_50: {

    forward_join_41: {

    forward_join_37: {

    forward_join_24: {

    forward_join_22: {

    life2_3 = (com.moon.n7.x ^ 120408385304614L);

    spill46_0 = moom.fw.a__Boolean();

    com.moon.n7.__sourceConstructorInit_c2af821b7b78cc91_0(((com.moon.n7)(receiver)), ((net.minecraft.entity.EntityLivingBase)(p0)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)));

    life5_11 = 0x1.f5c29p-1f;

    life4_12 = ((spill46_0) ? 1 : 0);

    spill46_1 = ((com.moon.n7)(receiver)).v;

    if (!((life4_12 == 0))) {

        forwardValue46_24_0 = ((spill46_1) ? 1 : 0);

        break forward_join_24;

    }

    if (!(spill46_1)) {

        break forward_join_22;

    }

    life5_11 = (life5_11 * 0x1.333334p-2f);

    }

    forwardValue46_24_0 = ((p0 instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0);

    }

    if (!((life4_12 == 0))) {

        forwardValue46_41_0 = forwardValue46_24_0;

        break forward_join_41;

    }

    if (!((forwardValue46_24_0 != 0))) {

        break forward_join_37;

    }

    spill46_2 = ((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.entity.player.EntityPlayer)(p0)))).M();

    if (!((life4_12 == 0))) {

        forwardValue46_41_0 = ((spill46_2) ? 1 : 0);

        break forward_join_41;

    }

    if (!(spill46_2)) {

        break forward_join_37;

    }

    life5_11 = (life5_11 * 0x1.99999ap-3f);

    }

    spill46_3 = receiver;

    if (!((life4_12 == 0))) {

        forwardValue46_51_0 = spill46_3;

        break forward_join_51;

    }

    forwardValue46_41_0 = ((((com.moon.n7)(spill46_3)).v) ? 1 : 0);

    }

    if (!((forwardValue46_41_0 == 0))) {

        break forward_join_50;

    }

    spill46_4 = receiver;

    if (!((life4_12 == 0))) {

        forwardValue46_51_0 = spill46_4;

        break forward_join_51;

    }

    if (!(((com.moon.n7)(spill46_4)).u)) {

        break forward_join_50;

    }

    ((com.moon.n7)(receiver)).w = ((boolean)(true));

    }

    forwardValue46_51_0 = receiver;

    }

    life6_87 = com.moon.n8.a(((float)((((com.moon.n7)(forwardValue46_51_0)).d * com.moon.nI.e))), ((float)(((float) ((com.moon.n7)(receiver)).i))), ((float)(((float) ((com.moon.n7)(receiver)).k))), ((float)(0x1.820c4ap-1f)), ((float)(life5_11)));

    life7_90 = com.moon.nI.a(((float[])(life6_87)));

    ((com.moon.n7)(receiver)).p = ((float)(((float) com.moon.nI.a(((double)(((double) ((life5_11 * (life6_87)[0]) / life7_90)))), ((int)(2))))));

    ((com.moon.n7)(receiver)).q = ((float)(((float) com.moon.nI.a(((double)(((double) ((life5_11 * (life6_87)[1]) / life7_90)))), ((int)(2))))));

    spill46_5 = recovery.source.CarrierOps.dcmpg(((double)(((double) java.lang.Math.abs(((float)(((com.moon.n7)(receiver)).p)))))), ((double)(0x1.999999999999ap-4d)));

    if (!((life4_12 == 0))) {

        forwardValue46_113_0 = spill46_5;

        break forward_join_113;

    }

    if (!((spill46_5 < 0))) {

        break forward_join_105;

    }

    ((com.moon.n7)(receiver)).p = ((float)(0x0.0p0f));

    }

    spill46_6 = receiver;

    if (!((life4_12 == 0))) {

        forwardValue46_118_0 = spill46_6;

        break forward_join_118;

    }

    forwardValue46_113_0 = recovery.source.CarrierOps.dcmpg(((double)(((double) java.lang.Math.abs(((float)(((com.moon.n7)(spill46_6)).q)))))), ((double)(0x1.999999999999ap-4d)));

    }

    if (!((forwardValue46_113_0 < 0))) {

        break forward_join_117;

    }

    ((com.moon.n7)(receiver)).q = ((float)(0x0.0p0f));

    }

    forwardValue46_118_0 = receiver;

    }

    spill46_7 = recovery.source.CarrierOps.dcmpl(((double)((((com.moon.n7)(receiver)).g % 0x1.0p-6d))), ((double)(0x0.0p0d)));

    if (!((life4_12 == 0))) {

        forwardValue46_128_0 = forwardValue46_118_0;

        forwardValue46_128_1 = spill46_7;

        break forward_join_128;

    }

    if (!((spill46_7 == 0))) {

        forwardValue46_129_0 = forwardValue46_118_0;

        break forward_join_129;

    }

    forwardValue46_128_0 = forwardValue46_118_0;

    forwardValue46_128_1 = 1;

    }

    forwardValue46_130_0 = forwardValue46_128_0;

    forwardValue46_130_1 = forwardValue46_128_1;

    break forward_join_130;

    }

    forwardValue46_130_0 = forwardValue46_129_0;

    forwardValue46_130_1 = 0;

    }

    ((com.moon.n7)(forwardValue46_130_0)).t = ((boolean)__sourceIntrinsic_integerToBoolean((forwardValue46_130_1)));

    spill46_8 = receiver;

    if (!((life4_12 == 0))) {

        forwardValue46_137_0 = spill46_8;

        break forward_join_137;

    }

    if (!(((com.moon.n7)(spill46_8)).t)) {

        break forward_join_144;

    }

    forwardValue46_137_0 = receiver;

    }

    ((com.moon.n7)(forwardValue46_137_0)).j = ((double)(((((com.moon.n7)(receiver)).j - 0x1.47ae14p-4d) * 0x1.f5c29p-1d)));

    }

    return;

}



public n7(net.minecraft.entity.EntityLivingBase p0, float p1, float p2) { super(); }


private static void __sourceConstructorBody_fe395df790e14061(com.moon.n7 receiver, net.minecraft.entity.EntityLivingBase p0, float p1, float p2) throws Throwable {

com.moon.n7 __initValue181_109_0;

    float __initValue181_109_1;

    com.moon.n7 __initValue181_139_0;

    int __initValue181_148_0;

    long local4_life2;

    boolean local6_life8;

    init_join_149: {

    init_join_148: {

    init_join_147: {

    init_join_139: {

    init_join_138: {

    init_join_110: {

    init_join_109: {

    init_join_106: {

    init_join_86: {

    init_join_65: {

    init_join_48: {

    init_join_44: {

    init_join_36: {

    local4_life2 = (com.moon.n7.x ^ 78024056891615L);

    boolean __sourceSpill181_4 = moom.fw.a__Boolean();

    com.moon.n7.__sourceConstructorInit_fe395df790e14061_0(((com.moon.n7)(receiver)));

    ((com.moon.n7)(receiver)).b = ((java.util.ArrayList)(new java.util.ArrayList()));

    ((com.moon.n7)(receiver)).c = ((net.minecraft.entity.EntityLivingBase)(p0));

    local6_life8 = __sourceSpill181_4;

    if (!((!local6_life8))) {

        break init_join_44;

    }

    if (!((((p0 instanceof net.minecraft.client.entity.EntityPlayerSP) ? 1 : 0) != 0))) {

        break init_join_36;

    }

    ((com.moon.n7)(receiver)).f = ((double)(((net.minecraft.entity.EntityLivingBase)(p0)).n));

    ((com.moon.n7)(receiver)).g = ((double)(((moom.CA)(((net.minecraft.entity.EntityLivingBase)(p0)).b())).c));

    ((com.moon.n7)(receiver)).h = ((double)(((net.minecraft.entity.EntityLivingBase)(p0)).p));

    if (!(local6_life8)) {

        break init_join_48;

    }

    }

    ((com.moon.n7)(receiver)).f = ((double)(((net.minecraft.entity.EntityLivingBase)(p0)).n));

    ((com.moon.n7)(receiver)).g = ((double)(((net.minecraft.entity.EntityLivingBase)(p0)).o));

    }

    ((com.moon.n7)(receiver)).h = ((double)(((net.minecraft.entity.EntityLivingBase)(p0)).p));

    }

    if (!((((p0 instanceof net.minecraft.client.entity.EntityPlayerSP) ? 1 : 0) != 0))) {

        break init_join_65;

    }

    ((com.moon.n7)(receiver)).i = ((double)(((net.minecraft.entity.EntityLivingBase)(p0)).t));

    ((com.moon.n7)(receiver)).j = ((double)(((net.minecraft.entity.EntityLivingBase)(p0)).u));

    ((com.moon.n7)(receiver)).k = ((double)(((net.minecraft.entity.EntityLivingBase)(p0)).v));

    if (!(local6_life8)) {

        break init_join_86;

    }

    }

    ((com.moon.n7)(receiver)).i = ((double)((((net.minecraft.entity.EntityLivingBase)(p0)).n - ((net.minecraft.entity.EntityLivingBase)(p0)).M)));

    ((com.moon.n7)(receiver)).j = ((double)((((net.minecraft.entity.EntityLivingBase)(p0)).o - ((net.minecraft.entity.EntityLivingBase)(p0)).N)));

    ((com.moon.n7)(receiver)).k = ((double)((((net.minecraft.entity.EntityLivingBase)(p0)).p - ((net.minecraft.entity.EntityLivingBase)(p0)).O)));

    }

    ((com.moon.n7)(receiver)).l = ((float)(((net.minecraft.entity.EntityLivingBase)(p0)).G));

    com.moon.n7 __sourceSpill181_42 = receiver;

    float __sourceSpill181_43 = ((net.minecraft.entity.EntityLivingBase)(p0)).H;

    if (!((!local6_life8))) {

        __initValue181_109_0 = __sourceSpill181_42;

        __initValue181_109_1 = __sourceSpill181_43;

        break init_join_109;

    }

    ((com.moon.n7)(__sourceSpill181_42)).m = ((float)(__sourceSpill181_43));

    if (!((((p0 instanceof net.minecraft.client.entity.EntityPlayerSP) ? 1 : 0) != 0))) {

        break init_join_106;

    }

    ((com.moon.n7)(receiver)).d = ((float)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.entity.EntityPlayerSP)(p0)))).cw));

    if (!(local6_life8)) {

        break init_join_110;

    }

    }

    __initValue181_109_0 = receiver;

    __initValue181_109_1 = ((net.minecraft.entity.EntityLivingBase)(p0)).w;

    }

    ((com.moon.n7)(__initValue181_109_0)).d = ((float)(__initValue181_109_1));

    }

    ((com.moon.n7)(receiver)).u = ((boolean)(((net.minecraft.entity.EntityLivingBase)(p0)).u__Boolean()));

    ((com.moon.n7)(receiver)).v = ((boolean)(((net.minecraft.entity.EntityLivingBase)(p0)).t__Boolean()));

    ((com.moon.n7)(receiver)).p = ((float)(p1));

    ((com.moon.n7)(receiver)).q = ((float)(p2));

    ((com.moon.n7)(receiver)).t = ((boolean)(((net.minecraft.entity.EntityLivingBase)(p0)).A));

    com.moon.n7 __sourceSpill181_59 = receiver;

    if (!((!local6_life8))) {

        __initValue181_139_0 = __sourceSpill181_59;

        break init_join_139;

    }

    if (!((recovery.source.CarrierOps.fcmpg(((float)(((com.moon.n7)(__sourceSpill181_59)).p)), ((float)(0x0.0p0f))) < 0))) {

        break init_join_138;

    }

    ((com.moon.n7)(receiver)).u = ((boolean)(false));

    }

    __initValue181_139_0 = receiver;

    }

    ((com.moon.n7)(__initValue181_139_0)).n = ((float)(1058642330));

    if (!((net.minecraft.entity.Entity.b__ArrayString() != null))) {

        break init_join_149;

    }

    if (!(local6_life8)) {

        break init_join_147;

    }

    __initValue181_148_0 = 0;

    break init_join_148;

    }

    __initValue181_148_0 = 1;

    }

    moom.fw.b(((boolean)__sourceIntrinsic_integerToBoolean((__initValue181_148_0))));

    }

    return;

}



static {
com.moon.n7.x = (moom._c.a(6019666160735962220L, -4840287549563347292L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(45131745572720L);
    com.moon.n7.a = net.minecraft.client.Minecraft.a__fM();
}

private static native <E extends Throwable> void __sourceConstructorInit_c2af821b7b78cc91_0(com.moon.n7 a0, net.minecraft.entity.EntityLivingBase a1, float a2, float a3) throws E;
private static native <E extends Throwable> void __sourceConstructorInit_fe395df790e14061_0(com.moon.n7 a0) throws E;

public boolean i() {
return ((((this.v) ? 1 : 0)) != 0);
}


public moom.DR b(int p0) {
java.lang.Object lexicalValue271_26_0;
    boolean spill271_0;
    com.moon.n7 spill271_1;
    long life2_3;
    int life5_8;
    int life4_9;
    lexical_join_26: {
    lexical_join_22: {
    life2_3 = (com.moon.n7.x ^ 5297497606539L);
    spill271_0 = moom.fw.a__Boolean();
    life5_8 = ((java.util.ArrayList)(this.b)).size();
    life4_9 = ((spill271_0) ? 1 : 0);
    lexical_cycle_10: while (true) {
    if (!((life5_8 <= (p0 + 1)))) {
        break lexical_join_22;
    }
    spill271_1 = this;
    if (!((life4_9 == 0))) {
        lexicalValue271_26_0 = spill271_1;
        break lexical_join_26;
    }
    ((com.moon.n7)(spill271_1)).a__Void();
    life5_8 += 1;
    if (!((life4_9 != 0))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    lexicalValue271_26_0 = ((java.util.ArrayList)(this.b)).get(((int)(p0)));
    }
    return ((moom.DR)(lexicalValue271_26_0));
}


private boolean b__Boolean() {
java.lang.Object local1 = ((com.moon.n7)(this)).a__CA();
    return (__sourceIntrinsic_booleanComparison((((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(com.moon.n7.a)).I)).a(((moom.CA)(((moom.CA)(local1)).b(((double)(-0x1.99999ap-4d)), ((double)(-0x1.99999ap-2d)), ((double)(-0x1.99999ap-4d))))), ((moom.fn)(moom.fn.i))))) != 0);
}


public float b__Float() {
return this.e;
}


public double b() {
return this.g;
}


private void b__Void() {
int forwardValue103_22_0;
    int forwardValue103_33_0;
    int forwardValue103_46_0;
    com.moon.n7 forwardValue103_54_0;
    com.moon.n7 forwardValue103_73_0;
    int spill103_0;
    com.moon.n7 spill103_1;
    com.moon.n7 spill103_2;
    long life1_3;
    int life3_5;
    float life4_79;
    float life5_82;
    forward_join_73: {
    forward_join_72: {
    forward_join_54: {
    forward_join_53: {
    forward_join_46: {
    forward_join_39: {
    forward_join_33: {
    forward_join_28: {
    forward_join_22: {
    forward_join_17: {
    life1_3 = (com.moon.n7.x ^ 16560500117664L);
    life3_5 = ((moom.fw.a__Boolean()) ? 1 : 0);
    spill103_0 = recovery.source.CarrierOps.dcmpg(((double)(java.lang.Math.abs(((double)(this.i))))), ((double)(0x1.47ae14p-8d)));
    if (!((life3_5 == 0))) {
        forwardValue103_22_0 = spill103_0;
        break forward_join_22;
    }
    if (!((spill103_0 < 0))) {
        break forward_join_17;
    }
    this.i = ((double)(0x0.0p0d));
    }
    forwardValue103_22_0 = recovery.source.CarrierOps.dcmpg(((double)(java.lang.Math.abs(((double)(this.j))))), ((double)(0x1.47ae14p-8d)));
    }
    if (!((life3_5 == 0))) {
        forwardValue103_33_0 = forwardValue103_22_0;
        break forward_join_33;
    }
    if (!((forwardValue103_22_0 < 0))) {
        break forward_join_28;
    }
    this.j = ((double)(0x0.0p0d));
    }
    forwardValue103_33_0 = recovery.source.CarrierOps.dcmpg(((double)(java.lang.Math.abs(((double)(this.k))))), ((double)(0x1.47ae14p-8d)));
    }
    if (!((life3_5 == 0))) {
        forwardValue103_46_0 = forwardValue103_33_0;
        break forward_join_46;
    }
    if (!((forwardValue103_33_0 < 0))) {
        break forward_join_39;
    }
    this.k = ((double)(0x0.0p0d));
    }
    this.o = ((float)(0x1.47ae14p-6f));
    spill103_1 = this;
    if (!((life3_5 == 0))) {
        forwardValue103_54_0 = spill103_1;
        break forward_join_54;
    }
    forwardValue103_46_0 = ((((com.moon.n7)(spill103_1)).u) ? 1 : 0);
    }
    if (!((forwardValue103_46_0 != 0))) {
        break forward_join_53;
    }
    com.moon.n7 __stackOp103_18_0 = this;
    ((com.moon.n7)(__stackOp103_18_0)).o = ((float)((((com.moon.n7)(__stackOp103_18_0)).o + 0x1.89374cp-8f)));
    }
    forwardValue103_54_0 = this;
    }
    life4_79 = ((com.moon.n7)(forwardValue103_54_0)).q;
    life5_82 = this.p;
    spill103_2 = this;
    if (!((life3_5 == 0))) {
        forwardValue103_73_0 = spill103_2;
        break forward_join_73;
    }
    if (!(((com.moon.n7)(spill103_2)).v)) {
        break forward_join_72;
    }
    life5_82 = (life5_82 * 0x1.99999ap-3f);
    life4_79 = (life4_79 * 0x1.99999ap-3f);
    }
    forwardValue103_73_0 = this;
    }
    ((com.moon.n7)(forwardValue103_73_0)).a(((float)(life4_79)), ((float)(life5_82)));
    return;
}


public float e__Float() {
return this.n;
}


public double e() {
return this.j;
}


public boolean e__Boolean() {
return ((((this.r) ? 1 : 0)) != 0);
}


private void c__Void() {
com.moon.n7 forwardValue1009_44_0;
    boolean spill1009_0;
    com.moon.n7 spill1009_1;
    long life1_3;
    float life4_6;
    int life3_7;
    float life5_20;
    float life6_26;
    float life7_31;
    forward_join_44: {
    forward_join_43: {
    life1_3 = (com.moon.n7.x ^ 25675512338706L);
    spill1009_0 = __sourceExactCall_947f444da39f47();
    life4_6 = 0x1.ae147ap-2f;
    life3_7 = ((spill1009_0) ? 1 : 0);
    spill1009_1 = this;
    if (!((life3_7 != 0))) {
        forwardValue1009_44_0 = spill1009_1;
        break forward_join_44;
    }
    if (!(((com.moon.n7)(spill1009_1)).u)) {
        break forward_join_43;
    }
    life5_20 = (this.d * com.moon.nI.e);
    life6_26 = ((-moom.Dr.a(((float)(life5_20)))) * 0x1.99999ap-3f);
    life7_31 = (moom.Dr.b(((float)(life5_20))) * 0x1.99999ap-3f);
    com.moon.n7 __stackOp1009_8_0 = this;
    ((com.moon.n7)(__stackOp1009_8_0)).i = ((double)((((com.moon.n7)(__stackOp1009_8_0)).i + ((double) life6_26))));
    com.moon.n7 __stackOp1009_11_0 = this;
    ((com.moon.n7)(__stackOp1009_11_0)).k = ((double)((((com.moon.n7)(__stackOp1009_11_0)).k + ((double) life7_31))));
    }
    forwardValue1009_44_0 = this;
    }
    ((com.moon.n7)(forwardValue1009_44_0)).j = ((double)(0x1.ae147ap-2d));
    return;
}


public float c__Float() {
return this.l;
}


public double c() {
return this.h;
}


private boolean c__Boolean() {
net.minecraft.block.Block forwardValue1008_32_0;
    net.minecraft.block.Block forwardValue1008_32_1;
    int forwardValue1008_36_0;
    boolean spill1008_0;
    net.minecraft.block.Block spill1008_1;
    net.minecraft.block.Block spill1008_2;
    long life1_3;
    moom.DT life4_16;
    net.minecraft.block.Block life5_23;
    int life3_24;
    forward_join_36: {
    forward_join_35: {
    forward_join_33: {
    forward_join_32: {
    life1_3 = (com.moon.n7.x ^ 99252794835714L);
    life4_16 = new moom.DT(moom.Dr.b__Int(((double)(this.f))), moom.Dr.b__Int(((double)(this.g))), moom.Dr.b__Int(((double)(this.h))));
    spill1008_0 = moom.fw.a__Boolean();
    life5_23 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(com.moon.n7.a)).I)).a__fE(((moom.DT)(life4_16))))).a__ch();
    life3_24 = ((spill1008_0) ? 1 : 0);
    spill1008_1 = life5_23;
    spill1008_2 = net.minecraft.init.Blocks.au;
    if (!((life3_24 == 0))) {
        forwardValue1008_32_0 = spill1008_1;
        forwardValue1008_32_1 = spill1008_2;
        break forward_join_32;
    }
    if (!((spill1008_1 != spill1008_2))) {
        break forward_join_33;
    }
    forwardValue1008_32_0 = life5_23;
    forwardValue1008_32_1 = net.minecraft.init.Blocks.bc;
    }
    if (!((forwardValue1008_32_0 == forwardValue1008_32_1))) {
        break forward_join_35;
    }
    }
    forwardValue1008_36_0 = 1;
    break forward_join_36;
    }
    forwardValue1008_36_0 = 0;
    }
    return ((forwardValue1008_36_0) != 0);
}


public float h() {
return this.q;
}


public boolean h__Boolean() {
return ((((this.u) ? 1 : 0)) != 0);
}


public double f() {
return this.k;
}


public float f__Float() {
return this.o;
}


public boolean f__Boolean() {
return ((((this.s) ? 1 : 0)) != 0);
}


public double d() {
return this.i;
}


private boolean d__Boolean() {
return ((0) != 0);
}


public float d__Float() {
return this.m;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private void a(double p0, double p1, double p2) {
int forestValue135_22_0;
    int forestValue135_26_0;
    int forestValue135_28_0;
    int forestValue135_72_0;
    double forestValue135_81_0;
    double forestValue135_81_1;
    int forestValue135_126_0;
    double forestValue135_135_0;
    double forestValue135_135_1;
    int forestValue135_142_0;
    int forestValue135_178_0;
    double forestValue135_187_0;
    double forestValue135_187_1;
    int forestValue135_198_0;
    int forestValue135_215_0;
    int forestValue135_238_0;
    double forestValue135_247_0;
    double forestValue135_247_1;
    int forestValue135_273_0;
    double forestValue135_282_0;
    double forestValue135_282_1;
    int forestValue135_314_0;
    int forestValue135_337_0;
    double forestValue135_346_0;
    double forestValue135_346_1;
    int forestValue135_372_0;
    double forestValue135_381_0;
    double forestValue135_381_1;
    java.util.List forestValue135_394_0;
    int forestValue135_436_0;
    int forestValue135_440_0;
    int forestValue135_442_0;
    int forestValue135_509_0;
    double forestValue135_517_0;
    double forestValue135_749_0;
    double forestValue135_800_0;
    com.moon.n7 forestValue135_804_0;
    com.moon.n7 forestValue135_816_0;
    com.moon.n7 forestValue135_817_0;
    int forestValue135_817_1;
    com.moon.n7 forestValue135_818_0;
    com.moon.n7 forestValue135_819_0;
    int forestValue135_819_1;
    com.moon.n7 forestValue135_828_0;
    int forestValue135_828_1;
    com.moon.n7 forestValue135_829_0;
    com.moon.n7 forestValue135_830_0;
    int forestValue135_830_1;
    com.moon.n7 forestValue135_841_0;
    int forestValue135_841_1;
    com.moon.n7 forestValue135_845_0;
    int forestValue135_845_1;
    com.moon.n7 forestValue135_846_0;
    com.moon.n7 forestValue135_847_0;
    int forestValue135_847_1;
    int forestValue135_860_0;
    int forestValue135_869_0;
    boolean spill135_0;
    boolean spill135_1;
    boolean spill135_2;
    int spill135_3;
    int spill135_4;
    double spill135_5;
    double spill135_6;
    boolean spill135_7;
    int spill135_8;
    int spill135_9;
    double spill135_10;
    double spill135_11;
    boolean spill135_12;
    int spill135_13;
    int spill135_14;
    double spill135_15;
    double spill135_16;
    int spill135_17;
    int spill135_18;
    java.util.List spill135_19;
    int spill135_20;
    int spill135_21;
    double spill135_22;
    double spill135_23;
    int spill135_24;
    int spill135_25;
    double spill135_26;
    double spill135_27;
    int spill135_28;
    int spill135_29;
    java.util.List spill135_30;
    int spill135_31;
    int spill135_32;
    double spill135_33;
    double spill135_34;
    int spill135_35;
    int spill135_36;
    double spill135_37;
    double spill135_38;
    boolean spill135_39;
    int spill135_40;
    com.moon.n7 spill135_41;
    int spill135_42;
    double spill135_43;
    double spill135_44;
    double spill135_45;
    double spill135_46;
    int spill135_47;
    int spill135_48;
    com.moon.n7 spill135_49;
    int spill135_50;
    com.moon.n7 spill135_51;
    boolean spill135_52;
    int spill135_53;
    long life7_3;
    moom.CA life10_6;
    double life11_8;
    double life13_11;
    double life15_13;
    int life9_14;
    int life17_37;
    double life18_42;
    java.util.List life18_559;
    moom.CA life19_561;
    java.util.Iterator life20_564;
    moom.CA life21_573;
    int life20_626;
    java.util.Iterator life21_629;
    moom.CA life22_638;
    java.util.Iterator life21_660;
    moom.CA life22_669;
    double life21_729;
    double life23_731;
    double life25_733;
    moom.CA life27_735;
    moom.CA life10_737;
    double life3_741;
    java.util.List life28_749;
    moom.CA life29_751;
    moom.CA life30_757;
    double life31_759;
    java.util.Iterator life33_762;
    moom.CA life34_771;
    double life33_792;
    java.util.Iterator life35_795;
    moom.CA life36_804;
    double life35_825;
    java.util.Iterator life37_828;
    moom.CA life38_837;
    moom.CA life37_858;
    double life38_860;
    java.util.Iterator life40_863;
    moom.CA life41_872;
    double life40_893;
    java.util.Iterator life42_896;
    moom.CA life43_905;
    double life42_926;
    java.util.Iterator life44_929;
    moom.CA life45_938;
    double life44_965;
    double life46_973;
    java.util.Iterator life48_1008;
    moom.CA life49_1017;
    forest_join_873: {
    forest_join_869: {
    forest_join_866: {
    forest_join_860: {
    forest_join_857: {
    forest_join_847: {
    forest_join_846: {
    forest_join_845: {
    forest_join_841: {
    forest_join_830: {
    forest_join_829: {
    forest_join_828: {
    forest_join_819: {
    forest_join_818: {
    forest_join_817: {
    forest_join_816: {
    forest_join_804: {
    forest_join_803: {
    forest_join_800: {
    forest_join_777: {
    forest_join_771: {
    forest_join_752: {
    forest_join_749: {
    forest_join_743: {
    forest_join_710: {
    forest_join_704: {
    forest_join_683: {
    forest_join_677: {
    forest_join_656: {
    forest_join_650: {
    forest_join_627: {
    forest_join_621: {
    forest_join_600: {
    forest_join_594: {
    forest_join_573: {
    forest_join_567: {
    forest_join_517: {
    forest_join_516: {
    forest_join_509: {
    forest_join_493: {
    forest_join_487: {
    forest_join_468: {
    forest_join_462: {
    forest_join_442: {
    forest_join_441: {
    forest_join_440: {
    forest_join_439: {
    forest_join_436: {
    forest_join_422: {
    forest_join_416: {
    forest_join_394: {
    forest_join_387: {
    forest_join_294: {
    forest_join_293: {
    forest_join_198: {
    forest_join_142: {
    forest_join_87: {
    forest_join_28: {
    forest_join_27: {
    forest_join_26: {
    forest_join_22: {
    life7_3 = (com.moon.n7.x ^ 20754257281793L);
    life10_6 = ((com.moon.n7)(this)).a__CA();
    life11_8 = p0;
    spill135_0 = __sourceExactCall_947f444da39f47();
    life13_11 = p1;
    life15_13 = p2;
    life9_14 = ((spill135_0) ? 1 : 0);
    spill135_1 = this.t;
    if (!((life9_14 != 0))) {
        forestValue135_22_0 = ((spill135_1) ? 1 : 0);
        break forest_join_22;
    }
    if (!(spill135_1)) {
        break forest_join_27;
    }
    forestValue135_22_0 = ((this.v) ? 1 : 0);
    }
    if (!((life9_14 != 0))) {
        forestValue135_26_0 = forestValue135_22_0;
        break forest_join_26;
    }
    if (!((forestValue135_22_0 != 0))) {
        break forest_join_27;
    }
    forestValue135_26_0 = 1;
    }
    forestValue135_28_0 = forestValue135_26_0;
    break forest_join_28;
    }
    forestValue135_28_0 = 0;
    }
    life17_37 = forestValue135_28_0;
    if (!((life17_37 != 0))) {
        break forest_join_387;
    }
    life18_42 = 0x1.999999999999ap-5d;
    forest_cycle_33: while (true) {
    forest_join_83: {
    forest_join_81: {
    forest_join_79: {
    forest_join_72: {
    forest_join_67: {
    if (!((recovery.source.CarrierOps.dcmpl(((double)(p0)), ((double)(0x0.0p0d))) != 0))) {
        break forest_join_87;
    }
    spill135_2 = ((java.util.List)(((com.moon.n7)(this)).a(((moom.CA)(((moom.CA)(life10_6)).c(((double)(p0)), ((double)(-0x1.0p0d)), ((double)(0x0.0p0d)))))))).isEmpty();
    if (!((life9_14 != 0))) {
        forestValue135_142_0 = ((spill135_2) ? 1 : 0);
        break forest_join_142;
    }
    if (!((life9_14 != 0))) {
        forestValue135_142_0 = ((spill135_2) ? 1 : 0);
        break forest_join_142;
    }
    if (!(spill135_2)) {
        break forest_join_87;
    }
    spill135_3 = recovery.source.CarrierOps.dcmpg(((double)(p0)), ((double)(life18_42)));
    if (!((life9_14 != 0))) {
        forestValue135_72_0 = spill135_3;
        break forest_join_72;
    }
    if (!((spill135_3 < 0))) {
        break forest_join_67;
    }
    spill135_4 = recovery.source.CarrierOps.dcmpl(((double)(p0)), ((double)((-life18_42))));
    if (!((life9_14 != 0))) {
        forestValue135_72_0 = spill135_4;
        break forest_join_72;
    }
    if (!((spill135_4 >= 0))) {
        break forest_join_67;
    }
    p0 = 0x0.0p0d;
    if (!((life9_14 == 0))) {
        break forest_join_83;
    }
    }
    spill135_5 = p0;
    spill135_6 = 0x0.0p0d;
    if (!((life9_14 != 0))) {
        forestValue135_81_0 = spill135_5;
        forestValue135_81_1 = spill135_6;
        break forest_join_81;
    }
    forestValue135_72_0 = recovery.source.CarrierOps.dcmpl(((double)(spill135_5)), ((double)(spill135_6)));
    }
    if (!((forestValue135_72_0 > 0))) {
        break forest_join_79;
    }
    p0 = (p0 - life18_42);
    if (!((life9_14 == 0))) {
        break forest_join_83;
    }
    }
    forestValue135_81_0 = p0;
    forestValue135_81_1 = life18_42;
    }
    p0 = (forestValue135_81_0 + forestValue135_81_1);
    }
    life11_8 = p0;
    if (!((life9_14 == 0))) {
        continue forest_cycle_33;
    }
    break forest_cycle_33;
    }
    }
    forest_cycle_87: while (true) {
    forest_join_137: {
    forest_join_135: {
    forest_join_133: {
    forest_join_126: {
    forest_join_121: {
    if (!((recovery.source.CarrierOps.dcmpl(((double)(p2)), ((double)(0x0.0p0d))) != 0))) {
        break forest_join_294;
    }
    spill135_7 = ((java.util.List)(((com.moon.n7)(this)).a(((moom.CA)(((moom.CA)(life10_6)).c(((double)(0x0.0p0d)), ((double)(-0x1.0p0d)), ((double)(p2)))))))).isEmpty();
    if (!((life9_14 != 0))) {
        forestValue135_198_0 = ((spill135_7) ? 1 : 0);
        break forest_join_198;
    }
    if (!((life9_14 != 0))) {
        forestValue135_198_0 = ((spill135_7) ? 1 : 0);
        break forest_join_198;
    }
    if (!(spill135_7)) {
        break forest_join_294;
    }
    spill135_8 = recovery.source.CarrierOps.dcmpg(((double)(p2)), ((double)(life18_42)));
    if (!((life9_14 != 0))) {
        forestValue135_126_0 = spill135_8;
        break forest_join_126;
    }
    if (!((spill135_8 < 0))) {
        break forest_join_121;
    }
    spill135_9 = recovery.source.CarrierOps.dcmpl(((double)(p2)), ((double)((-life18_42))));
    if (!((life9_14 != 0))) {
        forestValue135_126_0 = spill135_9;
        break forest_join_126;
    }
    if (!((spill135_9 >= 0))) {
        break forest_join_121;
    }
    p2 = 0x0.0p0d;
    if (!((life9_14 == 0))) {
        break forest_join_137;
    }
    }
    spill135_10 = p2;
    spill135_11 = 0x0.0p0d;
    if (!((life9_14 != 0))) {
        forestValue135_135_0 = spill135_10;
        forestValue135_135_1 = spill135_11;
        break forest_join_135;
    }
    forestValue135_126_0 = recovery.source.CarrierOps.dcmpl(((double)(spill135_10)), ((double)(spill135_11)));
    }
    if (!((forestValue135_126_0 > 0))) {
        break forest_join_133;
    }
    p2 = (p2 - life18_42);
    if (!((life9_14 == 0))) {
        break forest_join_137;
    }
    }
    forestValue135_135_0 = p2;
    forestValue135_135_1 = life18_42;
    }
    p2 = (forestValue135_135_0 + forestValue135_135_1);
    }
    life15_13 = p2;
    if (!((life9_14 == 0))) {
        continue forest_cycle_87;
    }
    break forest_cycle_87;
    }
    break forest_join_294;
    }
    forest_cycle_142: while (true) {
    forest_join_194: {
    forest_join_189: {
    forest_join_187: {
    forest_join_185: {
    forest_join_178: {
    forest_join_173: {
    if (!((forestValue135_142_0 != 0))) {
        break forest_join_294;
    }
    spill135_12 = ((java.util.List)(((com.moon.n7)(this)).a(((moom.CA)(((moom.CA)(life10_6)).c(((double)(0x0.0p0d)), ((double)(-0x1.0p0d)), ((double)(p2)))))))).isEmpty();
    if (!((life9_14 != 0))) {
        forestValue135_198_0 = ((spill135_12) ? 1 : 0);
        break forest_join_198;
    }
    if (!((life9_14 != 0))) {
        forestValue135_198_0 = ((spill135_12) ? 1 : 0);
        break forest_join_198;
    }
    if (!(spill135_12)) {
        break forest_join_294;
    }
    spill135_13 = recovery.source.CarrierOps.dcmpg(((double)(p2)), ((double)(life18_42)));
    if (!((life9_14 != 0))) {
        forestValue135_178_0 = spill135_13;
        break forest_join_178;
    }
    if (!((spill135_13 < 0))) {
        break forest_join_173;
    }
    spill135_14 = recovery.source.CarrierOps.dcmpl(((double)(p2)), ((double)((-life18_42))));
    if (!((life9_14 != 0))) {
        forestValue135_178_0 = spill135_14;
        break forest_join_178;
    }
    if (!((spill135_14 >= 0))) {
        break forest_join_173;
    }
    p2 = 0x0.0p0d;
    if (!((life9_14 == 0))) {
        break forest_join_189;
    }
    }
    spill135_15 = p2;
    spill135_16 = 0x0.0p0d;
    if (!((life9_14 != 0))) {
        forestValue135_187_0 = spill135_15;
        forestValue135_187_1 = spill135_16;
        break forest_join_187;
    }
    forestValue135_178_0 = recovery.source.CarrierOps.dcmpl(((double)(spill135_15)), ((double)(spill135_16)));
    }
    if (!((forestValue135_178_0 > 0))) {
        break forest_join_185;
    }
    p2 = (p2 - life18_42);
    if (!((life9_14 == 0))) {
        break forest_join_189;
    }
    }
    forestValue135_187_0 = p2;
    forestValue135_187_1 = life18_42;
    }
    p2 = (forestValue135_187_0 + forestValue135_187_1);
    }
    life15_13 = p2;
    if (!((life9_14 == 0))) {
        break forest_join_194;
    }
    break forest_join_294;
    }
    spill135_17 = recovery.source.CarrierOps.dcmpl(((double)(p2)), ((double)(0x0.0p0d)));
    forestValue135_142_0 = spill135_17;
    continue forest_cycle_142;
    }
    }
    forest_cycle_198: while (true) {
    forest_join_289: {
    forest_join_284: {
    forest_join_282: {
    forest_join_280: {
    forest_join_273: {
    forest_join_268: {
    forest_join_249: {
    forest_join_247: {
    forest_join_245: {
    forest_join_238: {
    forest_join_233: {
    forest_join_215: {
    if (!((forestValue135_198_0 != 0))) {
        break forest_join_387;
    }
    spill135_18 = recovery.source.CarrierOps.dcmpl(((double)(p2)), ((double)(0x0.0p0d)));
    if (!((life9_14 != 0))) {
        forestValue135_215_0 = spill135_18;
        break forest_join_215;
    }
    if (!((spill135_18 != 0))) {
        break forest_join_387;
    }
    spill135_19 = ((com.moon.n7)(this)).a(((moom.CA)(((moom.CA)(life10_6)).c(((double)(p0)), ((double)(-0x1.0p0d)), ((double)(p2))))));
    if (!((life9_14 != 0))) {
        forestValue135_394_0 = spill135_19;
        break forest_join_394;
    }
    forestValue135_215_0 = ((((java.util.List)(spill135_19)).isEmpty()) ? 1 : 0);
    }
    if (!((forestValue135_215_0 != 0))) {
        break forest_join_387;
    }
    spill135_20 = recovery.source.CarrierOps.dcmpg(((double)(p0)), ((double)(life18_42)));
    if (!((life9_14 != 0))) {
        forestValue135_238_0 = spill135_20;
        break forest_join_238;
    }
    if (!((spill135_20 < 0))) {
        break forest_join_233;
    }
    spill135_21 = recovery.source.CarrierOps.dcmpl(((double)(p0)), ((double)((-life18_42))));
    if (!((life9_14 != 0))) {
        forestValue135_238_0 = spill135_21;
        break forest_join_238;
    }
    if (!((spill135_21 >= 0))) {
        break forest_join_233;
    }
    p0 = 0x0.0p0d;
    if (!((life9_14 == 0))) {
        break forest_join_249;
    }
    }
    spill135_22 = p0;
    spill135_23 = 0x0.0p0d;
    if (!((life9_14 != 0))) {
        forestValue135_247_0 = spill135_22;
        forestValue135_247_1 = spill135_23;
        break forest_join_247;
    }
    forestValue135_238_0 = recovery.source.CarrierOps.dcmpl(((double)(spill135_22)), ((double)(spill135_23)));
    }
    if (!((forestValue135_238_0 > 0))) {
        break forest_join_245;
    }
    p0 = (p0 - life18_42);
    if (!((life9_14 == 0))) {
        break forest_join_249;
    }
    }
    forestValue135_247_0 = p0;
    forestValue135_247_1 = life18_42;
    }
    p0 = (forestValue135_247_0 + forestValue135_247_1);
    }
    life11_8 = p0;
    spill135_24 = recovery.source.CarrierOps.dcmpg(((double)(p2)), ((double)(life18_42)));
    if (!((life9_14 != 0))) {
        forestValue135_273_0 = spill135_24;
        break forest_join_273;
    }
    if (!((spill135_24 < 0))) {
        break forest_join_268;
    }
    spill135_25 = recovery.source.CarrierOps.dcmpl(((double)(p2)), ((double)((-life18_42))));
    if (!((life9_14 != 0))) {
        forestValue135_273_0 = spill135_25;
        break forest_join_273;
    }
    if (!((spill135_25 >= 0))) {
        break forest_join_268;
    }
    p2 = 0x0.0p0d;
    if (!((life9_14 == 0))) {
        break forest_join_284;
    }
    }
    spill135_26 = p2;
    spill135_27 = 0x0.0p0d;
    if (!((life9_14 != 0))) {
        forestValue135_282_0 = spill135_26;
        forestValue135_282_1 = spill135_27;
        break forest_join_282;
    }
    forestValue135_273_0 = recovery.source.CarrierOps.dcmpl(((double)(spill135_26)), ((double)(spill135_27)));
    }
    if (!((forestValue135_273_0 > 0))) {
        break forest_join_280;
    }
    p2 = (p2 - life18_42);
    if (!((life9_14 == 0))) {
        break forest_join_284;
    }
    }
    forestValue135_282_0 = p2;
    forestValue135_282_1 = life18_42;
    }
    p2 = (forestValue135_282_0 + forestValue135_282_1);
    }
    life15_13 = p2;
    if (!((life9_14 == 0))) {
        break forest_join_289;
    }
    break forest_join_293;
    }
    spill135_28 = recovery.source.CarrierOps.dcmpl(((double)(p0)), ((double)(0x0.0p0d)));
    forestValue135_198_0 = spill135_28;
    continue forest_cycle_198;
    }
    }
    break forest_join_387;
    }
    forest_cycle_294: while (true) {
    forest_join_383: {
    forest_join_381: {
    forest_join_379: {
    forest_join_372: {
    forest_join_367: {
    forest_join_348: {
    forest_join_346: {
    forest_join_344: {
    forest_join_337: {
    forest_join_332: {
    forest_join_314: {
    if (!((recovery.source.CarrierOps.dcmpl(((double)(p0)), ((double)(0x0.0p0d))) != 0))) {
        break forest_join_387;
    }
    spill135_29 = recovery.source.CarrierOps.dcmpl(((double)(p2)), ((double)(0x0.0p0d)));
    if (!((life9_14 != 0))) {
        forestValue135_314_0 = spill135_29;
        break forest_join_314;
    }
    if (!((spill135_29 != 0))) {
        break forest_join_387;
    }
    spill135_30 = ((com.moon.n7)(this)).a(((moom.CA)(((moom.CA)(life10_6)).c(((double)(p0)), ((double)(-0x1.0p0d)), ((double)(p2))))));
    if (!((life9_14 != 0))) {
        forestValue135_394_0 = spill135_30;
        break forest_join_394;
    }
    forestValue135_314_0 = ((((java.util.List)(spill135_30)).isEmpty()) ? 1 : 0);
    }
    if (!((forestValue135_314_0 != 0))) {
        break forest_join_387;
    }
    spill135_31 = recovery.source.CarrierOps.dcmpg(((double)(p0)), ((double)(life18_42)));
    if (!((life9_14 != 0))) {
        forestValue135_337_0 = spill135_31;
        break forest_join_337;
    }
    if (!((spill135_31 < 0))) {
        break forest_join_332;
    }
    spill135_32 = recovery.source.CarrierOps.dcmpl(((double)(p0)), ((double)((-life18_42))));
    if (!((life9_14 != 0))) {
        forestValue135_337_0 = spill135_32;
        break forest_join_337;
    }
    if (!((spill135_32 >= 0))) {
        break forest_join_332;
    }
    p0 = 0x0.0p0d;
    if (!((life9_14 == 0))) {
        break forest_join_348;
    }
    }
    spill135_33 = p0;
    spill135_34 = 0x0.0p0d;
    if (!((life9_14 != 0))) {
        forestValue135_346_0 = spill135_33;
        forestValue135_346_1 = spill135_34;
        break forest_join_346;
    }
    forestValue135_337_0 = recovery.source.CarrierOps.dcmpl(((double)(spill135_33)), ((double)(spill135_34)));
    }
    if (!((forestValue135_337_0 > 0))) {
        break forest_join_344;
    }
    p0 = (p0 - life18_42);
    if (!((life9_14 == 0))) {
        break forest_join_348;
    }
    }
    forestValue135_346_0 = p0;
    forestValue135_346_1 = life18_42;
    }
    p0 = (forestValue135_346_0 + forestValue135_346_1);
    }
    life11_8 = p0;
    spill135_35 = recovery.source.CarrierOps.dcmpg(((double)(p2)), ((double)(life18_42)));
    if (!((life9_14 != 0))) {
        forestValue135_372_0 = spill135_35;
        break forest_join_372;
    }
    if (!((spill135_35 < 0))) {
        break forest_join_367;
    }
    spill135_36 = recovery.source.CarrierOps.dcmpl(((double)(p2)), ((double)((-life18_42))));
    if (!((life9_14 != 0))) {
        forestValue135_372_0 = spill135_36;
        break forest_join_372;
    }
    if (!((spill135_36 >= 0))) {
        break forest_join_367;
    }
    p2 = 0x0.0p0d;
    if (!((life9_14 == 0))) {
        break forest_join_383;
    }
    }
    spill135_37 = p2;
    spill135_38 = 0x0.0p0d;
    if (!((life9_14 != 0))) {
        forestValue135_381_0 = spill135_37;
        forestValue135_381_1 = spill135_38;
        break forest_join_381;
    }
    forestValue135_372_0 = recovery.source.CarrierOps.dcmpl(((double)(spill135_37)), ((double)(spill135_38)));
    }
    if (!((forestValue135_372_0 > 0))) {
        break forest_join_379;
    }
    p2 = (p2 - life18_42);
    if (!((life9_14 == 0))) {
        break forest_join_383;
    }
    }
    forestValue135_381_0 = p2;
    forestValue135_381_1 = life18_42;
    }
    p2 = (forestValue135_381_0 + forestValue135_381_1);
    }
    life15_13 = p2;
    if (!((life9_14 == 0))) {
        continue forest_cycle_294;
    }
    break forest_cycle_294;
    }
    }
    forestValue135_394_0 = ((com.moon.n7)(this)).a(((moom.CA)(((moom.CA)(life10_6)).a(((double)(p0)), ((double)(p1)), ((double)(p2))))));
    }
    life18_559 = forestValue135_394_0;
    life19_561 = life10_6;
    life20_564 = ((java.util.List)(life18_559)).iterator();
    forest_cycle_400: while (true) {
    if (!(((java.util.Iterator)(life20_564)).hasNext())) {
        break forest_join_416;
    }
    life21_573 = ((moom.CA)(((java.util.Iterator)(life20_564)).next()));
    p1 = ((moom.CA)(life21_573)).b(((moom.CA)(life10_6)), ((double)(p1)));
    if (!((life9_14 != 0))) {
        break forest_join_422;
    }
    if (!((life9_14 == 0))) {
        continue forest_cycle_400;
    }
    break forest_cycle_400;
    }
    }
    life10_6 = ((moom.CA)(life10_6)).c(((double)(0x0.0p0d)), ((double)(p1)), ((double)(0x0.0p0d)));
    }
    spill135_39 = this.t;
    if (!((life9_14 != 0))) {
        forestValue135_440_0 = ((spill135_39) ? 1 : 0);
        break forest_join_440;
    }
    if (!((!spill135_39))) {
        break forest_join_439;
    }
    spill135_40 = recovery.source.CarrierOps.dcmpl(((double)(life13_11)), ((double)(p1)));
    if (!((life9_14 != 0))) {
        forestValue135_436_0 = spill135_40;
        break forest_join_436;
    }
    if (!((spill135_40 != 0))) {
        break forest_join_441;
    }
    forestValue135_436_0 = recovery.source.CarrierOps.dcmpg(((double)(life13_11)), ((double)(0x0.0p0d)));
    }
    if (!((life9_14 != 0))) {
        forestValue135_440_0 = forestValue135_436_0;
        break forest_join_440;
    }
    if (!((forestValue135_436_0 < 0))) {
        break forest_join_441;
    }
    }
    forestValue135_440_0 = 1;
    }
    forestValue135_442_0 = forestValue135_440_0;
    break forest_join_442;
    }
    forestValue135_442_0 = 0;
    }
    life20_626 = forestValue135_442_0;
    life21_629 = ((java.util.List)(life18_559)).iterator();
    forest_cycle_446: while (true) {
    if (!(((java.util.Iterator)(life21_629)).hasNext())) {
        break forest_join_462;
    }
    life22_638 = ((moom.CA)(((java.util.Iterator)(life21_629)).next()));
    p0 = ((moom.CA)(life22_638)).a(((moom.CA)(life10_6)), ((double)(p0)));
    if (!((life9_14 != 0))) {
        break forest_join_468;
    }
    if (!((life9_14 == 0))) {
        continue forest_cycle_446;
    }
    break forest_cycle_446;
    }
    }
    life10_6 = ((moom.CA)(life10_6)).c(((double)(p0)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)));
    }
    life21_660 = ((java.util.List)(life18_559)).iterator();
    forest_cycle_471: while (true) {
    if (!(((java.util.Iterator)(life21_660)).hasNext())) {
        break forest_join_487;
    }
    life22_669 = ((moom.CA)(((java.util.Iterator)(life21_660)).next()));
    p2 = ((moom.CA)(life22_669)).c(((moom.CA)(life10_6)), ((double)(p2)));
    if (!((life9_14 != 0))) {
        break forest_join_493;
    }
    if (!((life9_14 == 0))) {
        continue forest_cycle_471;
    }
    break forest_cycle_471;
    }
    }
    life10_6 = ((moom.CA)(life10_6)).c(((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((double)(p2)));
    }
    spill135_41 = this;
    if (!((life9_14 != 0))) {
        forestValue135_804_0 = spill135_41;
        break forest_join_804;
    }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(((com.moon.n7)(spill135_41)).n)), ((float)(0x0.0p0f))) > 0))) {
        break forest_join_803;
    }
    spill135_42 = life20_626;
    if (!((life9_14 != 0))) {
        forestValue135_509_0 = spill135_42;
        break forest_join_509;
    }
    if (!((spill135_42 != 0))) {
        break forest_join_803;
    }
    spill135_43 = life11_8;
    if (!((life9_14 != 0))) {
        forestValue135_517_0 = spill135_43;
        break forest_join_517;
    }
    forestValue135_509_0 = recovery.source.CarrierOps.dcmpl(((double)(spill135_43)), ((double)(p0)));
    }
    if (!((forestValue135_509_0 == 0))) {
        break forest_join_516;
    }
    spill135_44 = life15_13;
    if (!((life9_14 != 0))) {
        forestValue135_517_0 = spill135_44;
        break forest_join_517;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(spill135_44)), ((double)(p2))) != 0))) {
        break forest_join_803;
    }
    }
    forestValue135_517_0 = p0;
    }
    life21_729 = forestValue135_517_0;
    life23_731 = p1;
    life25_733 = p2;
    life27_735 = life10_6;
    life10_737 = life19_561;
    life3_741 = ((double) this.n);
    life28_749 = ((com.moon.n7)(this)).a(((moom.CA)(((moom.CA)(life10_737)).a(((double)(life11_8)), ((double)(life3_741)), ((double)(life15_13))))));
    life29_751 = life10_737;
    life30_757 = ((moom.CA)(life29_751)).a(((double)(life11_8)), ((double)(0x0.0p0d)), ((double)(life15_13)));
    life31_759 = life3_741;
    life33_762 = ((java.util.List)(life28_749)).iterator();
    forest_cycle_551: while (true) {
    if (!(((java.util.Iterator)(life33_762)).hasNext())) {
        break forest_join_567;
    }
    life34_771 = ((moom.CA)(((java.util.Iterator)(life33_762)).next()));
    life31_759 = ((moom.CA)(life34_771)).b(((moom.CA)(life30_757)), ((double)(life31_759)));
    if (!((life9_14 != 0))) {
        break forest_join_573;
    }
    if (!((life9_14 == 0))) {
        continue forest_cycle_551;
    }
    break forest_cycle_551;
    }
    }
    life29_751 = ((moom.CA)(life29_751)).c(((double)(0x0.0p0d)), ((double)(life31_759)), ((double)(0x0.0p0d)));
    }
    life33_792 = life11_8;
    life35_795 = ((java.util.List)(life28_749)).iterator();
    forest_cycle_578: while (true) {
    if (!(((java.util.Iterator)(life35_795)).hasNext())) {
        break forest_join_594;
    }
    life36_804 = ((moom.CA)(((java.util.Iterator)(life35_795)).next()));
    life33_792 = ((moom.CA)(life36_804)).a(((moom.CA)(life29_751)), ((double)(life33_792)));
    if (!((life9_14 != 0))) {
        break forest_join_600;
    }
    if (!((life9_14 == 0))) {
        continue forest_cycle_578;
    }
    break forest_cycle_578;
    }
    }
    life29_751 = ((moom.CA)(life29_751)).c(((double)(life33_792)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)));
    }
    life35_825 = life15_13;
    life37_828 = ((java.util.List)(life28_749)).iterator();
    forest_cycle_605: while (true) {
    if (!(((java.util.Iterator)(life37_828)).hasNext())) {
        break forest_join_621;
    }
    life38_837 = ((moom.CA)(((java.util.Iterator)(life37_828)).next()));
    life35_825 = ((moom.CA)(life38_837)).c(((moom.CA)(life29_751)), ((double)(life35_825)));
    if (!((life9_14 != 0))) {
        break forest_join_627;
    }
    if (!((life9_14 == 0))) {
        continue forest_cycle_605;
    }
    break forest_cycle_605;
    }
    }
    life29_751 = ((moom.CA)(life29_751)).c(((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((double)(life35_825)));
    }
    life37_858 = life10_737;
    life38_860 = life3_741;
    life40_863 = ((java.util.List)(life28_749)).iterator();
    forest_cycle_634: while (true) {
    if (!(((java.util.Iterator)(life40_863)).hasNext())) {
        break forest_join_650;
    }
    life41_872 = ((moom.CA)(((java.util.Iterator)(life40_863)).next()));
    life38_860 = ((moom.CA)(life41_872)).b(((moom.CA)(life37_858)), ((double)(life38_860)));
    if (!((life9_14 != 0))) {
        break forest_join_656;
    }
    if (!((life9_14 == 0))) {
        continue forest_cycle_634;
    }
    break forest_cycle_634;
    }
    }
    life37_858 = ((moom.CA)(life37_858)).c(((double)(0x0.0p0d)), ((double)(life38_860)), ((double)(0x0.0p0d)));
    }
    life40_893 = life11_8;
    life42_896 = ((java.util.List)(life28_749)).iterator();
    forest_cycle_661: while (true) {
    if (!(((java.util.Iterator)(life42_896)).hasNext())) {
        break forest_join_677;
    }
    life43_905 = ((moom.CA)(((java.util.Iterator)(life42_896)).next()));
    life40_893 = ((moom.CA)(life43_905)).a(((moom.CA)(life37_858)), ((double)(life40_893)));
    if (!((life9_14 != 0))) {
        break forest_join_683;
    }
    if (!((life9_14 == 0))) {
        continue forest_cycle_661;
    }
    break forest_cycle_661;
    }
    }
    life37_858 = ((moom.CA)(life37_858)).c(((double)(life40_893)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)));
    }
    life42_926 = life15_13;
    life44_929 = ((java.util.List)(life28_749)).iterator();
    forest_cycle_688: while (true) {
    if (!(((java.util.Iterator)(life44_929)).hasNext())) {
        break forest_join_704;
    }
    life45_938 = ((moom.CA)(((java.util.Iterator)(life44_929)).next()));
    life42_926 = ((moom.CA)(life45_938)).c(((moom.CA)(life37_858)), ((double)(life42_926)));
    if (!((life9_14 != 0))) {
        break forest_join_710;
    }
    if (!((life9_14 == 0))) {
        continue forest_cycle_688;
    }
    break forest_cycle_688;
    }
    }
    life37_858 = ((moom.CA)(life37_858)).c(((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((double)(life42_926)));
    }
    life44_965 = ((life33_792 * life33_792) + (life35_825 * life35_825));
    life46_973 = ((life40_893 * life40_893) + (life42_926 * life42_926));
    spill135_45 = life44_965;
    if (!((life9_14 != 0))) {
        forestValue135_749_0 = spill135_45;
        break forest_join_749;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(spill135_45)), ((double)(life46_973))) > 0))) {
        break forest_join_743;
    }
    p0 = life33_792;
    p2 = life35_825;
    p1 = (-life31_759);
    life10_6 = life29_751;
    if (!((life9_14 == 0))) {
        break forest_join_752;
    }
    }
    p0 = life40_893;
    p2 = life42_926;
    forestValue135_749_0 = (-life38_860);
    }
    p1 = forestValue135_749_0;
    life10_6 = life37_858;
    }
    life48_1008 = ((java.util.List)(life28_749)).iterator();
    forest_cycle_755: while (true) {
    if (!(((java.util.Iterator)(life48_1008)).hasNext())) {
        break forest_join_771;
    }
    life49_1017 = ((moom.CA)(((java.util.Iterator)(life48_1008)).next()));
    p1 = ((moom.CA)(life49_1017)).b(((moom.CA)(life10_6)), ((double)(p1)));
    if (!((life9_14 != 0))) {
        break forest_join_777;
    }
    if (!((life9_14 == 0))) {
        continue forest_cycle_755;
    }
    break forest_cycle_755;
    }
    }
    life10_6 = ((moom.CA)(life10_6)).c(((double)(0x0.0p0d)), ((double)(p1)), ((double)(0x0.0p0d)));
    }
    spill135_46 = ((life21_729 * life21_729) + (life25_733 * life25_733));
    if (!((life9_14 != 0))) {
        forestValue135_800_0 = spill135_46;
        break forest_join_800;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(spill135_46)), ((double)(((p0 * p0) + (p2 * p2))))) >= 0))) {
        break forest_join_803;
    }
    p0 = life21_729;
    p1 = life23_731;
    forestValue135_800_0 = life25_733;
    }
    p2 = forestValue135_800_0;
    life10_6 = life27_735;
    }
    forestValue135_804_0 = this;
    }
    spill135_47 = recovery.source.CarrierOps.dcmpl(((double)(life11_8)), ((double)(p0)));
    if (!((life9_14 != 0))) {
        forestValue135_817_0 = forestValue135_804_0;
        forestValue135_817_1 = spill135_47;
        break forest_join_817;
    }
    if (!((spill135_47 == 0))) {
        forestValue135_816_0 = forestValue135_804_0;
        break forest_join_816;
    }
    spill135_48 = recovery.source.CarrierOps.dcmpl(((double)(life15_13)), ((double)(p2)));
    if (!((life9_14 != 0))) {
        forestValue135_817_0 = forestValue135_804_0;
        forestValue135_817_1 = spill135_48;
        break forest_join_817;
    }
    if (!((spill135_48 != 0))) {
        forestValue135_818_0 = forestValue135_804_0;
        break forest_join_818;
    }
    forestValue135_816_0 = forestValue135_804_0;
    }
    forestValue135_817_0 = forestValue135_816_0;
    forestValue135_817_1 = 1;
    }
    forestValue135_819_0 = forestValue135_817_0;
    forestValue135_819_1 = forestValue135_817_1;
    break forest_join_819;
    }
    forestValue135_819_0 = forestValue135_818_0;
    forestValue135_819_1 = 0;
    }
    ((com.moon.n7)(forestValue135_819_0)).s = ((boolean)__sourceIntrinsic_integerToBoolean((forestValue135_819_1)));
    spill135_49 = this;
    spill135_50 = recovery.source.CarrierOps.dcmpl(((double)(life13_11)), ((double)(p1)));
    if (!((life9_14 != 0))) {
        forestValue135_828_0 = spill135_49;
        forestValue135_828_1 = spill135_50;
        break forest_join_828;
    }
    if (!((spill135_50 != 0))) {
        forestValue135_829_0 = spill135_49;
        break forest_join_829;
    }
    forestValue135_828_0 = spill135_49;
    forestValue135_828_1 = 1;
    }
    forestValue135_830_0 = forestValue135_828_0;
    forestValue135_830_1 = forestValue135_828_1;
    break forest_join_830;
    }
    forestValue135_830_0 = forestValue135_829_0;
    forestValue135_830_1 = 0;
    }
    ((com.moon.n7)(forestValue135_830_0)).r = ((boolean)__sourceIntrinsic_integerToBoolean((forestValue135_830_1)));
    spill135_51 = this;
    spill135_52 = this.r;
    if (!((life9_14 != 0))) {
        forestValue135_841_0 = spill135_51;
        forestValue135_841_1 = ((spill135_52) ? 1 : 0);
        break forest_join_841;
    }
    if (!(spill135_52)) {
        forestValue135_846_0 = spill135_51;
        break forest_join_846;
    }
    forestValue135_841_0 = spill135_51;
    forestValue135_841_1 = recovery.source.CarrierOps.dcmpg(((double)(this.j)), ((double)(0x0.0p0d)));
    }
    if (!((life9_14 != 0))) {
        forestValue135_845_0 = forestValue135_841_0;
        forestValue135_845_1 = forestValue135_841_1;
        break forest_join_845;
    }
    if (!((forestValue135_841_1 < 0))) {
        forestValue135_846_0 = forestValue135_841_0;
        break forest_join_846;
    }
    forestValue135_845_0 = forestValue135_841_0;
    forestValue135_845_1 = 1;
    }
    forestValue135_847_0 = forestValue135_845_0;
    forestValue135_847_1 = forestValue135_845_1;
    break forest_join_847;
    }
    forestValue135_847_0 = forestValue135_846_0;
    forestValue135_847_1 = 0;
    }
    ((com.moon.n7)(forestValue135_847_0)).t = ((boolean)__sourceIntrinsic_integerToBoolean((forestValue135_847_1)));
    spill135_53 = recovery.source.CarrierOps.dcmpl(((double)(life11_8)), ((double)(p0)));
    if (!((life9_14 != 0))) {
        forestValue135_860_0 = spill135_53;
        break forest_join_860;
    }
    if (!((spill135_53 != 0))) {
        break forest_join_857;
    }
    this.i = ((double)(0x0.0p0d));
    }
    forestValue135_860_0 = recovery.source.CarrierOps.dcmpl(((double)(life13_11)), ((double)(p1)));
    }
    if (!((life9_14 != 0))) {
        forestValue135_869_0 = forestValue135_860_0;
        break forest_join_869;
    }
    if (!((forestValue135_860_0 != 0))) {
        break forest_join_866;
    }
    this.j = ((double)(0x0.0p0d));
    }
    forestValue135_869_0 = recovery.source.CarrierOps.dcmpl(((double)(life15_13)), ((double)(p2)));
    }
    if (!((forestValue135_869_0 != 0))) {
        break forest_join_873;
    }
    this.k = ((double)(0x0.0p0d));
    }
    this.f = ((double)(((((moom.CA)(life10_6)).b + ((moom.CA)(life10_6)).e) / 0x1.0p1d)));
    this.g = ((double)(((moom.CA)(life10_6)).c));
    this.h = ((double)(((((moom.CA)(life10_6)).d + ((moom.CA)(life10_6)).g) / 0x1.0p1d)));
    return;
}


private java.util.List<moom.CA> a(moom.CA p0) {
return ((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(com.moon.n7.a)).I)).a(((moom.CA)(p0)));
}


private boolean a__Boolean() {
java.lang.Object local1 = ((com.moon.n7)(this)).a__CA();
    return (__sourceIntrinsic_booleanComparison((((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(com.moon.n7.a)).I)).a(((moom.CA)(((moom.CA)(local1)).b(((double)(-0x1.99999ap-4d)), ((double)(-0x1.99999ap-2d)), ((double)(-0x1.99999ap-4d))))), ((moom.fn)(moom.fn.h))))) != 0);
}


public moom.DR a(int p0) {
boolean spill270_0;
    long life2_3;
    int life5_6;
    int life4_7;
    lexical_join_16: {
    life2_3 = (com.moon.n7.x ^ 117365432528473L);
    spill270_0 = moom.fw.a__Boolean();
    life5_6 = 0;
    life4_7 = ((spill270_0) ? 1 : 0);
    lexical_cycle_8: while (true) {
    if (!((life5_6 < p0))) {
        break lexical_join_16;
    }
    ((com.moon.n7)(this)).a__Void();
    life5_6 += 1;
    if (!((life4_7 != 0))) { continue lexical_cycle_8; }
    break lexical_cycle_8;
    }
    }
    return new moom.DR(this.f, this.g, this.h);
}


private void a(float p0, float p1) {
int forwardValue1003_18_0;
    int forwardValue1003_25_0;
    float forwardValue1003_68_0;
    com.moon.n7 forwardValue1003_85_0;
    float forwardValue1003_86_0;
    int forwardValue1003_127_0;
    int forwardValue1003_145_0;
    com.moon.n7 forwardValue1003_170_0;
    com.moon.n7 forwardValue1003_204_0;
    com.moon.n7 forwardValue1003_239_0;
    boolean spill1003_0;
    com.moon.n7 spill1003_1;
    com.moon.n7 spill1003_2;
    float spill1003_3;
    com.moon.n7 spill1003_4;
    boolean spill1003_5;
    boolean spill1003_6;
    com.moon.n7 spill1003_7;
    com.moon.n7 spill1003_8;
    long life3_3;
    int life5_5;
    float life6_48;
    float life7_75;
    float life8_95;
    float life9_118;
    float life10_133;
    forward_join_246: {
    forward_join_239: {
    forward_join_213: {
    forward_join_204: {
    forward_join_178: {
    forward_join_170: {
    forward_join_154: {
    forward_join_145: {
    forward_join_133: {
    forward_join_127: {
    forward_join_123: {
    forward_join_86: {
    forward_join_85: {
    forward_join_84: {
    forward_join_68: {
    forward_join_67: {
    forward_join_53: {
    forward_join_26: {
    forward_join_25: {
    forward_join_18: {
    forward_join_16: {
    life3_3 = (com.moon.n7.x ^ 89107761793620L);
    life5_5 = ((moom.fw.a__Boolean()) ? 1 : 0);
    spill1003_0 = ((com.moon.n7)(this)).a__Boolean();
    if (!((life5_5 == 0))) {
        forwardValue1003_18_0 = ((spill1003_0) ? 1 : 0);
        break forward_join_18;
    }
    if (!(spill1003_0)) {
        break forward_join_16;
    }
    spill1003_1 = this;
    if (!((life5_5 == 0))) {
        forwardValue1003_239_0 = spill1003_1;
        break forward_join_239;
    }
    if (!(((com.moon.n7)(spill1003_1)).d__Boolean())) {
        break forward_join_213;
    }
    }
    forwardValue1003_18_0 = ((((com.moon.n7)(this)).b__Boolean()) ? 1 : 0);
    }
    if (!((life5_5 == 0))) {
        forwardValue1003_25_0 = forwardValue1003_18_0;
        break forward_join_25;
    }
    if (!((forwardValue1003_18_0 != 0))) {
        break forward_join_26;
    }
    spill1003_2 = this;
    if (!((life5_5 == 0))) {
        forwardValue1003_204_0 = spill1003_2;
        break forward_join_204;
    }
    forwardValue1003_25_0 = ((((com.moon.n7)(spill1003_2)).d__Boolean()) ? 1 : 0);
    }
    if (!((forwardValue1003_25_0 != 0))) {
        break forward_join_178;
    }
    }
    life6_48 = 0x1.d1eb86p-1f;
    if (!(this.t)) {
        break forward_join_53;
    }
    life6_48 = (((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(com.moon.n7.a)).I)).a__fE(((moom.DT)(new moom.DT(moom.Dr.b__Int(((double)(this.f))), (moom.Dr.b__Int(((double)(this.g))) - 1), moom.Dr.b__Int(((double)(this.h))))))))).a__ch())).L * 0x1.d1eb86p-1f);
    }
    life7_75 = 0x1.99999ap-4f;
    spill1003_3 = p1;
    if (!((life5_5 == 0))) {
        forwardValue1003_68_0 = spill1003_3;
        break forward_join_68;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(((double) spill1003_3))), ((double)(0x1.999999999999ap-4d))) > 0))) {
        break forward_join_67;
    }
    if (!(this.u)) {
        break forward_join_67;
    }
    life7_75 = 0x1.0a3d7p-3f;
    }
    forwardValue1003_68_0 = life7_75;
    }
    life8_95 = forwardValue1003_68_0;
    spill1003_4 = this;
    if (!((life5_5 == 0))) {
        forwardValue1003_85_0 = spill1003_4;
        break forward_join_85;
    }
    if (!(((com.moon.n7)(spill1003_4)).t)) {
        break forward_join_84;
    }
    forwardValue1003_86_0 = ((life8_95 * 0x1.4d5b12p-3f) / ((life6_48 * life6_48) * life6_48));
    break forward_join_86;
    }
    forwardValue1003_85_0 = this;
    }
    forwardValue1003_86_0 = ((com.moon.n7)(forwardValue1003_85_0)).o;
    }
    life9_118 = forwardValue1003_86_0;
    ((com.moon.n7)(this)).a(((float)(p0)), ((float)(p1)), ((float)(life9_118)));
    spill1003_5 = ((com.moon.n7)(this)).c__Boolean();
    if (!((life5_5 == 0))) {
        forwardValue1003_145_0 = ((spill1003_5) ? 1 : 0);
        break forward_join_145;
    }
    if (!(spill1003_5)) {
        break forward_join_133;
    }
    life10_133 = 0x1.333334p-3f;
    this.i = ((double)(moom.Dr.a(((double)(this.i)), ((double)(-0x1.333334p-3d)), ((double)(0x1.333334p-3d)))));
    this.k = ((double)(moom.Dr.a(((double)(this.k)), ((double)(-0x1.333334p-3d)), ((double)(0x1.333334p-3d)))));
    spill1003_6 = this.v;
    if (!((life5_5 == 0))) {
        forwardValue1003_127_0 = ((spill1003_6) ? 1 : 0);
        break forward_join_127;
    }
    if (!(spill1003_6)) {
        break forward_join_123;
    }
    this.j = ((double)(0x0.0p0d));
    if (!((life5_5 != 0))) {
        break forward_join_133;
    }
    }
    forwardValue1003_127_0 = recovery.source.CarrierOps.dcmpg(((double)(this.j)), ((double)(-0x1.333334p-3d)));
    }
    if (!((life5_5 == 0))) {
        forwardValue1003_145_0 = forwardValue1003_127_0;
        break forward_join_145;
    }
    if (!((forwardValue1003_127_0 < 0))) {
        break forward_join_133;
    }
    this.j = ((double)(0x1.333334p-3d));
    }
    ((com.moon.n7)(this)).a(((double)(this.i)), ((double)(this.j)), ((double)(this.k)));
    spill1003_7 = this;
    if (!((life5_5 == 0))) {
        forwardValue1003_170_0 = spill1003_7;
        break forward_join_170;
    }
    forwardValue1003_145_0 = ((((com.moon.n7)(spill1003_7)).c__Boolean()) ? 1 : 0);
    }
    if (!((forwardValue1003_145_0 != 0))) {
        break forward_join_154;
    }
    spill1003_8 = this;
    if (!((life5_5 == 0))) {
        forwardValue1003_170_0 = spill1003_8;
        break forward_join_170;
    }
    if (!(((com.moon.n7)(spill1003_8)).s)) {
        break forward_join_154;
    }
    this.j = ((double)(0x1.99999ap-3d));
    }
    this.j = ((double)(((this.j - 0x1.47ae14p-4d) * 0x1.f5c29p-1d)));
    com.moon.n7 __stackOp1003_51_0 = this;
    ((com.moon.n7)(__stackOp1003_51_0)).i = ((double)((((com.moon.n7)(__stackOp1003_51_0)).i * ((double) life6_48))));
    forwardValue1003_170_0 = this;
    }
    com.moon.n7 __stackOp1003_54_0 = forwardValue1003_170_0;
    ((com.moon.n7)(__stackOp1003_54_0)).k = ((double)((((com.moon.n7)(__stackOp1003_54_0)).k * ((double) life6_48))));
    if (!((life5_5 != 0))) {
        break forward_join_246;
    }
    }
    ((com.moon.n7)(this)).a(((float)(p0)), ((float)(p1)), ((float)(0x1.47ae14p-6f)));
    ((com.moon.n7)(this)).a(((double)(this.i)), ((double)(this.j)), ((double)(this.k)));
    com.moon.n7 __stackOp1003_62_0 = this;
    ((com.moon.n7)(__stackOp1003_62_0)).i = ((double)((((com.moon.n7)(__stackOp1003_62_0)).i * 0x1.0p-1d)));
    com.moon.n7 __stackOp1003_65_0 = this;
    ((com.moon.n7)(__stackOp1003_65_0)).k = ((double)((((com.moon.n7)(__stackOp1003_65_0)).k * 0x1.0p-1d)));
    forwardValue1003_204_0 = this;
    }
    ((com.moon.n7)(forwardValue1003_204_0)).j = ((double)(((this.j - 0x1.47ae14p-6d) * 0x1.0p-1d)));
    if (!((life5_5 != 0))) {
        break forward_join_246;
    }
    }
    ((com.moon.n7)(this)).a(((float)(p0)), ((float)(p1)), ((float)(0x1.47ae14p-6f)));
    ((com.moon.n7)(this)).a(((double)(this.i)), ((double)(this.j)), ((double)(this.k)));
    com.moon.n7 __stackOp1003_75_0 = this;
    ((com.moon.n7)(__stackOp1003_75_0)).i = ((double)((((com.moon.n7)(__stackOp1003_75_0)).i * 0x1.99999ap-1d)));
    com.moon.n7 __stackOp1003_78_0 = this;
    ((com.moon.n7)(__stackOp1003_78_0)).k = ((double)((((com.moon.n7)(__stackOp1003_78_0)).k * 0x1.99999ap-1d)));
    forwardValue1003_239_0 = this;
    }
    ((com.moon.n7)(forwardValue1003_239_0)).j = ((double)(((this.j - 0x1.47ae14p-6d) * 0x1.99999ap-1d)));
    }
    return;
}


private void a(float p0, float p1, float p2) {
int forwardValue102_28_0;
    float forwardValue102_48_0;
    float forwardValue102_48_1;
    boolean spill102_0;
    int spill102_1;
    float spill102_2;
    float spill102_3;
    long life4_3;
    float life7_12;
    int life6_13;
    float life7_40;
    float life8_56;
    float life9_64;
    forward_join_85: {
    forward_join_48: {
    forward_join_31: {
    forward_join_28: {
    life4_3 = (com.moon.n7.x ^ 107631919773765L);
    spill102_0 = moom.fw.a__Boolean();
    life7_12 = ((p0 * p0) + (p1 * p1));
    life6_13 = ((spill102_0) ? 1 : 0);
    spill102_1 = recovery.source.CarrierOps.fcmpl(((float)(life7_12)), ((float)(0x1.a36e2ep-14f)));
    if (!((life6_13 == 0))) {
        forwardValue102_28_0 = spill102_1;
        break forward_join_28;
    }
    if (!((spill102_1 >= 0))) {
        break forward_join_85;
    }
    life7_12 = moom.Dr.c(((float)(life7_12)));
    spill102_2 = life7_12;
    spill102_3 = 0x1.0p0f;
    if (!((life6_13 == 0))) {
        forwardValue102_48_0 = spill102_2;
        forwardValue102_48_1 = spill102_3;
        break forward_join_48;
    }
    forwardValue102_28_0 = recovery.source.CarrierOps.fcmpg(((float)(spill102_2)), ((float)(spill102_3)));
    }
    if (!((forwardValue102_28_0 < 0))) {
        break forward_join_31;
    }
    life7_12 = 0x1.0p0f;
    }
    life7_40 = (p2 / life7_12);
    p0 = (p0 * life7_40);
    p1 = (p1 * life7_40);
    forwardValue102_48_0 = (this.d * 0x1.921fb6p1f);
    forwardValue102_48_1 = 0x1.68p7f;
    }
    life8_56 = moom.Dr.a(((float)((forwardValue102_48_0 / forwardValue102_48_1))));
    life9_64 = moom.Dr.b(((float)(((this.d * 0x1.921fb6p1f) / 0x1.68p7f))));
    com.moon.n7 __stackOp102_10_0 = this;
    ((com.moon.n7)(__stackOp102_10_0)).i = ((double)((((com.moon.n7)(__stackOp102_10_0)).i + ((double) ((p0 * life9_64) - (p1 * life8_56))))));
    com.moon.n7 __stackOp102_13_0 = this;
    ((com.moon.n7)(__stackOp102_13_0)).k = ((double)((((com.moon.n7)(__stackOp102_13_0)).k + ((double) ((p1 * life9_64) + (p0 * life8_56))))));
    }
    return;
}


public void a__Void() {
((java.util.ArrayList)(this.b)).add(((java.lang.Object)(new moom.DR(this.f, this.g, this.h))));
    ((com.moon.n7)(this)).b__Void();
    return;
}


public float a__Float() {
return this.d;
}


public double a() {
return this.f;
}


public java.util.ArrayList<moom.DR> a__ArrayList() {
return this.b;
}


public net.minecraft.entity.EntityLivingBase a__sG() {
return this.c;
}


public moom.CA a__CA() {
return new moom.CA((this.f - ((double) (this.l / 0x1.0p1f))), this.g, (this.h - ((double) (this.l / 0x1.0p1f))), (this.f + ((double) (this.l / 0x1.0p1f))), (this.g + ((double) this.m)), (this.h + ((double) (this.l / 0x1.0p1f))));
}


public float g() {
return this.p;
}


public boolean g__Boolean() {
return ((((this.t) ? 1 : 0)) != 0);
}


public boolean j() {
return ((((this.w) ? 1 : 0)) != 0);
}


private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native int __sourceIntrinsic_booleanComparison(boolean value);

private static native boolean __sourceExactCall_947f444da39f47();
}
