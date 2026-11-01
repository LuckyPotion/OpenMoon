package moom;


public class GI extends moom.GD {

private static final long f;

public GI(long p0, moom.GD p1) {
super(p0);
    this.b = p1;
}


static {
f = (moom._c.a(-4790432464612382686L, -5132835263220071580L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(147420246313942L);
}


private boolean b(int[] p0, int[] p1, int p2, int p3, int p4, int p5, int p6, int p7) {
int forwardValue1992_28_0;
    int forwardValue1992_86_0;
    int forwardValue1992_92_0;
    int forwardValue1992_98_0;
    int spill1992_0;
    boolean spill1992_1;
    long life9_3;
    net.minecraft.entity.Entity[] life11_5;
    int life12_33;
    int life13_49;
    int life14_65;
    int life15_81;
    forward_join_117: {
    forward_join_109: {
    forward_join_98: {
    forward_join_92: {
    forward_join_86: {
    forward_join_28: {
    forward_join_13: {
    life9_3 = (moom.GI.f ^ 38910996529993L);
    life11_5 = moom.GD.b();
    spill1992_0 = p5;
    if (!((life11_5 != null))) {
        forwardValue1992_28_0 = spill1992_0;
        break forward_join_28;
    }
    if (!((spill1992_0 != p6))) {
        break forward_join_13;
    }
    return ((0) != 0);
    }
    forwardValue1992_28_0 = (p0)[((p2 + 1) + (((p3 + 1) - 1) * (p4 + 2)))];
    }
    life12_33 = forwardValue1992_28_0;
    life13_49 = (p0)[(((p2 + 1) + 1) + ((p3 + 1) * (p4 + 2)))];
    life14_65 = (p0)[(((p2 + 1) - 1) + ((p3 + 1) * (p4 + 2)))];
    life15_81 = (p0)[((p2 + 1) + (((p3 + 1) + 1) * (p4 + 2)))];
    spill1992_1 = moom.GI.a(((int)(life12_33)), ((int)(p6)));
    if (!((life11_5 != null))) {
        forwardValue1992_86_0 = ((spill1992_1) ? 1 : 0);
        break forward_join_86;
    }
    if (!(spill1992_1)) {
        break forward_join_109;
    }
    forwardValue1992_86_0 = ((moom.GI.a(((int)(life13_49)), ((int)(p6)))) ? 1 : 0);
    }
    if (!((life11_5 != null))) {
        forwardValue1992_92_0 = forwardValue1992_86_0;
        break forward_join_92;
    }
    if (!((forwardValue1992_86_0 != 0))) {
        break forward_join_109;
    }
    forwardValue1992_92_0 = ((moom.GI.a(((int)(life14_65)), ((int)(p6)))) ? 1 : 0);
    }
    if (!((life11_5 != null))) {
        forwardValue1992_98_0 = forwardValue1992_92_0;
        break forward_join_98;
    }
    if (!((forwardValue1992_92_0 != 0))) {
        break forward_join_109;
    }
    forwardValue1992_98_0 = ((moom.GI.a(((int)(life15_81)), ((int)(p6)))) ? 1 : 0);
    }
    if (!((forwardValue1992_98_0 != 0))) {
        break forward_join_109;
    }
    (p1)[(p2 + (p3 * p4))] = p5;
    if (!((life11_5 == null))) {
        break forward_join_117;
    }
    }
    (p1)[(p2 + (p3 * p4))] = p7;
    }
    return ((1) != 0);
}


private boolean b(int p0, int p1) {
int forwardValue1991_15_0;
    net.minecraft.world.biome.BiomeGenBase forwardValue1991_25_0;
    net.minecraft.world.biome.BiomeGenBase forwardValue1991_29_0;
    moom.bF forwardValue1991_41_0;
    moom.bF forwardValue1991_41_1;
    moom.bF forwardValue1991_46_0;
    moom.bF forwardValue1991_46_1;
    int forwardValue1991_50_0;
    boolean spill1991_0;
    net.minecraft.world.biome.BiomeGenBase spill1991_1;
    moom.bF spill1991_2;
    moom.bF spill1991_3;
    long life3_3;
    net.minecraft.entity.Entity[] life5_5;
    net.minecraft.world.biome.BiomeGenBase life6_21;
    net.minecraft.world.biome.BiomeGenBase life7_24;
    moom.bF life8_41;
    moom.bF life9_44;
    forward_join_51: {
    forward_join_50: {
    forward_join_49: {
    forward_join_47: {
    forward_join_46: {
    forward_join_41: {
    forward_join_29: {
    forward_join_25: {
    forward_join_15: {
    forward_join_14: {
    life3_3 = (moom.GI.f ^ 47711234227351L);
    life5_5 = moom.GD.b();
    spill1991_0 = moom.GI.a(((int)(p0)), ((int)(p1)));
    if (!((life5_5 != null))) {
        forwardValue1991_15_0 = ((spill1991_0) ? 1 : 0);
        break forward_join_15;
    }
    if (!(spill1991_0)) {
        break forward_join_14;
    }
    return ((1) != 0);
    }
    forwardValue1991_15_0 = p0;
    }
    life6_21 = net.minecraft.world.biome.BiomeGenBase.e(((int)(forwardValue1991_15_0)));
    life7_24 = net.minecraft.world.biome.BiomeGenBase.e(((int)(p1)));
    spill1991_1 = life6_21;
    if (!((life5_5 != null))) {
        forwardValue1991_25_0 = spill1991_1;
        break forward_join_25;
    }
    if (!((spill1991_1 != null))) {
        break forward_join_51;
    }
    forwardValue1991_25_0 = life7_24;
    }
    if (!((life5_5 != null))) {
        forwardValue1991_29_0 = forwardValue1991_25_0;
        break forward_join_29;
    }
    if (!((forwardValue1991_25_0 != null))) {
        break forward_join_51;
    }
    forwardValue1991_29_0 = life6_21;
    }
    life8_41 = ((net.minecraft.world.biome.BiomeGenBase)(forwardValue1991_29_0)).a__bF();
    life9_44 = ((net.minecraft.world.biome.BiomeGenBase)(life7_24)).a__bF();
    spill1991_2 = life8_41;
    spill1991_3 = life9_44;
    if (!((life5_5 != null))) {
        forwardValue1991_41_0 = spill1991_2;
        forwardValue1991_41_1 = spill1991_3;
        break forward_join_41;
    }
    if (!((spill1991_2 != spill1991_3))) {
        break forward_join_47;
    }
    forwardValue1991_41_0 = life8_41;
    forwardValue1991_41_1 = moom.bF.MEDIUM;
    }
    if (!((life5_5 != null))) {
        forwardValue1991_46_0 = forwardValue1991_41_0;
        forwardValue1991_46_1 = forwardValue1991_41_1;
        break forward_join_46;
    }
    if (!((forwardValue1991_41_0 != forwardValue1991_41_1))) {
        break forward_join_47;
    }
    forwardValue1991_46_0 = life9_44;
    forwardValue1991_46_1 = moom.bF.MEDIUM;
    }
    if (!((forwardValue1991_46_0 == forwardValue1991_46_1))) {
        break forward_join_49;
    }
    }
    forwardValue1991_50_0 = 1;
    break forward_join_50;
    }
    forwardValue1991_50_0 = 0;
    }
    return ((forwardValue1991_50_0) != 0);
    }
    return ((0) != 0);
}


private boolean a(int[] p0, int[] p1, int p2, int p3, int p4, int p5, int p6, int p7) {
int forwardValue1989_29_0;
    int forwardValue1989_89_0;
    int forwardValue1989_96_0;
    int forwardValue1989_103_0;
    boolean spill1989_0;
    boolean spill1989_1;
    long life9_3;
    net.minecraft.entity.Entity[] life11_5;
    int life12_34;
    int life13_50;
    int life14_66;
    int life15_82;
    forward_join_122: {
    forward_join_114: {
    forward_join_103: {
    forward_join_96: {
    forward_join_89: {
    forward_join_29: {
    forward_join_14: {
    life9_3 = (moom.GI.f ^ 90422437909403L);
    life11_5 = moom.GD.b();
    spill1989_0 = moom.GI.a(((int)(p5)), ((int)(p6)));
    if (!((life11_5 != null))) {
        forwardValue1989_29_0 = ((spill1989_0) ? 1 : 0);
        break forward_join_29;
    }
    if (!((!spill1989_0))) {
        break forward_join_14;
    }
    return ((0) != 0);
    }
    forwardValue1989_29_0 = (p0)[((p2 + 1) + (((p3 + 1) - 1) * (p4 + 2)))];
    }
    life12_34 = forwardValue1989_29_0;
    life13_50 = (p0)[(((p2 + 1) + 1) + ((p3 + 1) * (p4 + 2)))];
    life14_66 = (p0)[(((p2 + 1) - 1) + ((p3 + 1) * (p4 + 2)))];
    life15_82 = (p0)[((p2 + 1) + (((p3 + 1) + 1) * (p4 + 2)))];
    spill1989_1 = ((moom.GI)(this)).b(((int)(life12_34)), ((int)(p6)));
    if (!((life11_5 != null))) {
        forwardValue1989_89_0 = ((spill1989_1) ? 1 : 0);
        break forward_join_89;
    }
    if (!(spill1989_1)) {
        break forward_join_114;
    }
    forwardValue1989_89_0 = ((((moom.GI)(this)).b(((int)(life13_50)), ((int)(p6)))) ? 1 : 0);
    }
    if (!((life11_5 != null))) {
        forwardValue1989_96_0 = forwardValue1989_89_0;
        break forward_join_96;
    }
    if (!((forwardValue1989_89_0 != 0))) {
        break forward_join_114;
    }
    forwardValue1989_96_0 = ((((moom.GI)(this)).b(((int)(life14_66)), ((int)(p6)))) ? 1 : 0);
    }
    if (!((life11_5 != null))) {
        forwardValue1989_103_0 = forwardValue1989_96_0;
        break forward_join_103;
    }
    if (!((forwardValue1989_96_0 != 0))) {
        break forward_join_114;
    }
    forwardValue1989_103_0 = ((((moom.GI)(this)).b(((int)(life15_82)), ((int)(p6)))) ? 1 : 0);
    }
    if (!((forwardValue1989_103_0 != 0))) {
        break forward_join_114;
    }
    (p1)[(p2 + (p3 * p4))] = p5;
    if (!((life11_5 == null))) {
        break forward_join_122;
    }
    }
    (p1)[(p2 + (p3 * p4))] = p7;
    }
    return ((1) != 0);
}


public int[] a__ArrayInt(int p0, int p1, int p2, int p3) {
int forestValue642_30_0;
    int forestValue642_105_0;
    int forestValue642_120_0;
    int forestValue642_124_0;
    int forestValue642_202_0;
    int forestValue642_202_1;
    int forestValue642_208_0;
    int forestValue642_208_1;
    int forestValue642_214_0;
    int forestValue642_214_1;
    int forestValue642_241_0;
    int forestValue642_241_1;
    int forestValue642_257_0;
    int forestValue642_315_0;
    int forestValue642_315_1;
    int forestValue642_321_0;
    int forestValue642_321_1;
    int forestValue642_327_0;
    int forestValue642_327_1;
    int forestValue642_333_0;
    int forestValue642_333_1;
    int forestValue642_339_0;
    int forestValue642_339_1;
    int forestValue642_345_0;
    int forestValue642_345_1;
    int forestValue642_351_0;
    int forestValue642_351_1;
    int forestValue642_357_0;
    int forestValue642_357_1;
    int forestValue642_363_0;
    int forestValue642_363_1;
    int forestValue642_369_0;
    int forestValue642_369_1;
    int forestValue642_375_0;
    int forestValue642_375_1;
    int forestValue642_381_0;
    int forestValue642_381_1;
    int forestValue642_387_0;
    int forestValue642_387_1;
    int forestValue642_393_0;
    int forestValue642_393_1;
    int forestValue642_399_0;
    int forestValue642_399_1;
    net.minecraft.entity.Entity[] spill642_0;
    boolean spill642_1;
    boolean spill642_2;
    int spill642_3;
    int spill642_4;
    int spill642_5;
    int spill642_6;
    int spill642_7;
    int spill642_8;
    long life5_3;
    int[] life8_19;
    int[] life9_25;
    net.minecraft.entity.Entity[] life7_26;
    int life10_28;
    int life11_33;
    int life12_60;
    int life13_152;
    int life14_168;
    int life15_184;
    int life16_200;
    int life13_276;
    int life14_292;
    int life15_308;
    int life16_324;
    forest_join_446: {
    life5_3 = (moom.GI.f ^ 28181542720375L);
    life8_19 = ((moom.GD)(((moom.GI)(this)).b)).a__ArrayInt(((int)((p0 - 1))), ((int)((p1 - 1))), ((int)((p2 + 2))), ((int)((p3 + 2))));
    spill642_0 = moom.GD.b();
    life9_25 = moom.GY.a(((int)((p2 * p3))));
    life7_26 = spill642_0;
    life10_28 = 0;
    forest_cycle_29: while (true) {
    forest_join_443: {
    forestValue642_30_0 = life10_28;
    forest_cycle_30: while (true) {
    if (!((forestValue642_30_0 < p3))) {
        break forest_join_446;
    }
    life11_33 = 0;
    forest_cycle_34: while (true) {
    forest_join_441: {
    forest_join_440: {
    forest_join_432: {
    forest_join_430: {
    forest_join_421: {
    forest_join_410: {
    forest_join_399: {
    forest_join_393: {
    forest_join_387: {
    forest_join_381: {
    forest_join_375: {
    forest_join_369: {
    forest_join_363: {
    forest_join_357: {
    forest_join_351: {
    forest_join_345: {
    forest_join_339: {
    forest_join_333: {
    forest_join_327: {
    forest_join_321: {
    forest_join_315: {
    forest_join_257: {
    forest_join_241: {
    forest_join_236: {
    forest_join_234: {
    forest_join_225: {
    forest_join_214: {
    forest_join_208: {
    forest_join_202: {
    forest_join_124: {
    forest_join_120: {
    forest_join_105: {
    if (!((life11_33 < p2))) {
        break forest_join_443;
    }
    ((moom.GI)(this)).a(((long)(((long) (life11_33 + p0)))), ((long)(((long) (life10_28 + p1)))));
    life12_60 = (life8_19)[((life11_33 + 1) + ((life10_28 + 1) * (p2 + 2)))];
    if (!((life7_26 != null))) {
        break forest_join_441;
    }
    spill642_1 = ((moom.GI)(this)).a(((int[])(life8_19)), ((int[])(life9_25)), ((int)(life11_33)), ((int)(life10_28)), ((int)(p2)), ((int)(life12_60)), ((int)(((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.u)).aB)), ((int)(((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.L)).aB)));
    if (!((life7_26 != null))) {
        forestValue642_30_0 = ((spill642_1) ? 1 : 0);
        continue forest_cycle_30;
    }
    if (!((!spill642_1))) {
        break forest_join_440;
    }
    spill642_2 = ((moom.GI)(this)).b(((int[])(life8_19)), ((int[])(life9_25)), ((int)(life11_33)), ((int)(life10_28)), ((int)(p2)), ((int)(life12_60)), ((int)(((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.ad)).aB)), ((int)(((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.ac)).aB)));
    if (!((life7_26 != null))) {
        forestValue642_105_0 = ((spill642_2) ? 1 : 0);
        break forest_join_105;
    }
    if (!((!spill642_2))) {
        break forest_join_440;
    }
    forestValue642_105_0 = ((((moom.GI)(this)).b(((int[])(life8_19)), ((int[])(life9_25)), ((int)(life11_33)), ((int)(life10_28)), ((int)(p2)), ((int)(life12_60)), ((int)(((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.ae)).aB)), ((int)(((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.ac)).aB)))) ? 1 : 0);
    }
    if (!((life7_26 != null))) {
        forestValue642_120_0 = forestValue642_105_0;
        break forest_join_120;
    }
    if (!((forestValue642_105_0 == 0))) {
        break forest_join_440;
    }
    forestValue642_120_0 = ((((moom.GI)(this)).b(((int[])(life8_19)), ((int[])(life9_25)), ((int)(life11_33)), ((int)(life10_28)), ((int)(p2)), ((int)(life12_60)), ((int)(((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.X)).aB)), ((int)(((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.w)).aB)))) ? 1 : 0);
    }
    if (!((life7_26 != null))) {
        forestValue642_124_0 = forestValue642_120_0;
        break forest_join_124;
    }
    if (!((forestValue642_120_0 == 0))) {
        break forest_join_440;
    }
    forestValue642_124_0 = life12_60;
    }
    spill642_3 = ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.t)).aB;
    if (!((life7_26 != null))) {
        forestValue642_241_0 = forestValue642_124_0;
        forestValue642_241_1 = spill642_3;
        break forest_join_241;
    }
    if (!((forestValue642_124_0 == spill642_3))) {
        break forest_join_236;
    }
    life13_152 = (life8_19)[((life11_33 + 1) + (((life10_28 + 1) - 1) * (p2 + 2)))];
    life14_168 = (life8_19)[(((life11_33 + 1) + 1) + ((life10_28 + 1) * (p2 + 2)))];
    life15_184 = (life8_19)[(((life11_33 + 1) - 1) + ((life10_28 + 1) * (p2 + 2)))];
    life16_200 = (life8_19)[((life11_33 + 1) + (((life10_28 + 1) + 1) * (p2 + 2)))];
    spill642_4 = life13_152;
    spill642_5 = ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.D)).aB;
    if (!((life7_26 != null))) {
        forestValue642_202_0 = spill642_4;
        forestValue642_202_1 = spill642_5;
        break forest_join_202;
    }
    if (!((spill642_4 != spill642_5))) {
        break forest_join_225;
    }
    forestValue642_202_0 = life14_168;
    forestValue642_202_1 = ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.D)).aB;
    }
    if (!((life7_26 != null))) {
        forestValue642_208_0 = forestValue642_202_0;
        forestValue642_208_1 = forestValue642_202_1;
        break forest_join_208;
    }
    if (!((forestValue642_202_0 != forestValue642_202_1))) {
        break forest_join_225;
    }
    forestValue642_208_0 = life15_184;
    forestValue642_208_1 = ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.D)).aB;
    }
    if (!((life7_26 != null))) {
        forestValue642_214_0 = forestValue642_208_0;
        forestValue642_214_1 = forestValue642_208_1;
        break forest_join_214;
    }
    if (!((forestValue642_208_0 != forestValue642_208_1))) {
        break forest_join_225;
    }
    forestValue642_214_0 = life16_200;
    forestValue642_214_1 = ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.D)).aB;
    }
    if (!((forestValue642_214_0 != forestValue642_214_1))) {
        break forest_join_225;
    }
    (life9_25)[(life11_33 + (life10_28 * p2))] = life12_60;
    if (!((life7_26 == null))) {
        break forest_join_234;
    }
    }
    (life9_25)[(life11_33 + (life10_28 * p2))] = ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.Z)).aB;
    }
    if (!((life7_26 == null))) {
        break forest_join_440;
    }
    }
    spill642_6 = life12_60;
    if (!((life7_26 != null))) {
        forestValue642_257_0 = spill642_6;
        break forest_join_257;
    }
    forestValue642_241_0 = spill642_6;
    forestValue642_241_1 = ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.x)).aB;
    }
    if (!((forestValue642_241_0 == forestValue642_241_1))) {
        break forest_join_432;
    }
    forestValue642_257_0 = (life8_19)[((life11_33 + 1) + (((life10_28 + 1) - 1) * (p2 + 2)))];
    }
    life13_276 = forestValue642_257_0;
    life14_292 = (life8_19)[(((life11_33 + 1) + 1) + ((life10_28 + 1) * (p2 + 2)))];
    life15_308 = (life8_19)[(((life11_33 + 1) - 1) + ((life10_28 + 1) * (p2 + 2)))];
    life16_324 = (life8_19)[((life11_33 + 1) + (((life10_28 + 1) + 1) * (p2 + 2)))];
    spill642_7 = life13_276;
    spill642_8 = ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.t)).aB;
    if (!((life7_26 != null))) {
        forestValue642_315_0 = spill642_7;
        forestValue642_315_1 = spill642_8;
        break forest_join_315;
    }
    if (!((spill642_7 != spill642_8))) {
        break forest_join_421;
    }
    forestValue642_315_0 = life14_292;
    forestValue642_315_1 = ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.t)).aB;
    }
    if (!((life7_26 != null))) {
        forestValue642_321_0 = forestValue642_315_0;
        forestValue642_321_1 = forestValue642_315_1;
        break forest_join_321;
    }
    if (!((forestValue642_315_0 != forestValue642_315_1))) {
        break forest_join_421;
    }
    forestValue642_321_0 = life15_308;
    forestValue642_321_1 = ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.t)).aB;
    }
    if (!((life7_26 != null))) {
        forestValue642_327_0 = forestValue642_321_0;
        forestValue642_327_1 = forestValue642_321_1;
        break forest_join_327;
    }
    if (!((forestValue642_321_0 != forestValue642_321_1))) {
        break forest_join_421;
    }
    forestValue642_327_0 = life16_324;
    forestValue642_327_1 = ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.t)).aB;
    }
    if (!((life7_26 != null))) {
        forestValue642_333_0 = forestValue642_327_0;
        forestValue642_333_1 = forestValue642_327_1;
        break forest_join_333;
    }
    if (!((forestValue642_327_0 != forestValue642_327_1))) {
        break forest_join_421;
    }
    forestValue642_333_0 = life13_276;
    forestValue642_333_1 = ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.V)).aB;
    }
    if (!((life7_26 != null))) {
        forestValue642_339_0 = forestValue642_333_0;
        forestValue642_339_1 = forestValue642_333_1;
        break forest_join_339;
    }
    if (!((forestValue642_333_0 != forestValue642_333_1))) {
        break forest_join_421;
    }
    forestValue642_339_0 = life14_292;
    forestValue642_339_1 = ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.V)).aB;
    }
    if (!((life7_26 != null))) {
        forestValue642_345_0 = forestValue642_339_0;
        forestValue642_345_1 = forestValue642_339_1;
        break forest_join_345;
    }
    if (!((forestValue642_339_0 != forestValue642_339_1))) {
        break forest_join_421;
    }
    forestValue642_345_0 = life15_308;
    forestValue642_345_1 = ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.V)).aB;
    }
    if (!((life7_26 != null))) {
        forestValue642_351_0 = forestValue642_345_0;
        forestValue642_351_1 = forestValue642_345_1;
        break forest_join_351;
    }
    if (!((forestValue642_345_0 != forestValue642_345_1))) {
        break forest_join_421;
    }
    forestValue642_351_0 = life16_324;
    forestValue642_351_1 = ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.V)).aB;
    }
    if (!((life7_26 != null))) {
        forestValue642_357_0 = forestValue642_351_0;
        forestValue642_357_1 = forestValue642_351_1;
        break forest_join_357;
    }
    if (!((forestValue642_351_0 != forestValue642_351_1))) {
        break forest_join_421;
    }
    forestValue642_357_0 = life13_276;
    forestValue642_357_1 = ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.D)).aB;
    }
    if (!((life7_26 != null))) {
        forestValue642_363_0 = forestValue642_357_0;
        forestValue642_363_1 = forestValue642_357_1;
        break forest_join_363;
    }
    if (!((forestValue642_357_0 != forestValue642_357_1))) {
        break forest_join_421;
    }
    forestValue642_363_0 = life14_292;
    forestValue642_363_1 = ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.D)).aB;
    }
    if (!((life7_26 != null))) {
        forestValue642_369_0 = forestValue642_363_0;
        forestValue642_369_1 = forestValue642_363_1;
        break forest_join_369;
    }
    if (!((forestValue642_363_0 != forestValue642_363_1))) {
        break forest_join_421;
    }
    forestValue642_369_0 = life15_308;
    forestValue642_369_1 = ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.D)).aB;
    }
    if (!((life7_26 != null))) {
        forestValue642_375_0 = forestValue642_369_0;
        forestValue642_375_1 = forestValue642_369_1;
        break forest_join_375;
    }
    if (!((forestValue642_369_0 != forestValue642_369_1))) {
        break forest_join_421;
    }
    forestValue642_375_0 = life16_324;
    forestValue642_375_1 = ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.D)).aB;
    }
    if (!((life7_26 != null))) {
        forestValue642_381_0 = forestValue642_375_0;
        forestValue642_381_1 = forestValue642_375_1;
        break forest_join_381;
    }
    if (!((forestValue642_375_0 != forestValue642_375_1))) {
        break forest_join_421;
    }
    forestValue642_381_0 = life13_276;
    forestValue642_381_1 = ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.M)).aB;
    }
    if (!((life7_26 != null))) {
        forestValue642_387_0 = forestValue642_381_0;
        forestValue642_387_1 = forestValue642_381_1;
        break forest_join_387;
    }
    if (!((forestValue642_381_0 != forestValue642_381_1))) {
        break forest_join_410;
    }
    forestValue642_387_0 = life16_324;
    forestValue642_387_1 = ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.M)).aB;
    }
    if (!((life7_26 != null))) {
        forestValue642_393_0 = forestValue642_387_0;
        forestValue642_393_1 = forestValue642_387_1;
        break forest_join_393;
    }
    if (!((forestValue642_387_0 != forestValue642_387_1))) {
        break forest_join_410;
    }
    forestValue642_393_0 = life14_292;
    forestValue642_393_1 = ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.M)).aB;
    }
    if (!((life7_26 != null))) {
        forestValue642_399_0 = forestValue642_393_0;
        forestValue642_399_1 = forestValue642_393_1;
        break forest_join_399;
    }
    if (!((forestValue642_393_0 != forestValue642_393_1))) {
        break forest_join_410;
    }
    forestValue642_399_0 = life15_308;
    forestValue642_399_1 = ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.M)).aB;
    }
    if (!((forestValue642_399_0 != forestValue642_399_1))) {
        break forest_join_410;
    }
    (life9_25)[(life11_33 + (life10_28 * p2))] = life12_60;
    if (!((life7_26 == null))) {
        break forest_join_430;
    }
    }
    (life9_25)[(life11_33 + (life10_28 * p2))] = ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.O)).aB;
    if (!((life7_26 == null))) {
        break forest_join_430;
    }
    }
    (life9_25)[(life11_33 + (life10_28 * p2))] = ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.s)).aB;
    }
    if (!((life7_26 == null))) {
        break forest_join_440;
    }
    }
    (life9_25)[(life11_33 + (life10_28 * p2))] = life12_60;
    }
    life11_33 += 1;
    }
    if (!((life7_26 == null))) {
        continue forest_cycle_34;
    }
    break forest_cycle_34;
    }
    break forest_cycle_30;
    }
    }
    life10_28 += 1;
    if (!((life7_26 == null))) {
        continue forest_cycle_29;
    }
    break forest_cycle_29;
    }
    }
    return life9_25;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}

}
