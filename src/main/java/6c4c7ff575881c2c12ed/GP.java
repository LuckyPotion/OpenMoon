package moom;


public class GP extends moom.GD {

private static final long f;

public GP(long p0, moom.GD p1) {
super(p0);
    ((moom.GD)(this)).b = ((moom.GD)(p1));
    return;
}


static {
f = (moom._c.a(-1157111800823936571L, 6350376451605461509L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(159684359297834L);
}


private int b(int p0) {
int forwardValue2003_15_0;
    int forwardValue2003_15_1;
    int forwardValue2003_18_0;
    int spill2003_0;
    int spill2003_1;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_18: {
    forward_join_17: {
    forward_join_15: {
    life2_3 = (moom.GP.f ^ 111974579665464L);
    life4_5 = moom.GD.b();
    spill2003_0 = p0;
    spill2003_1 = 2;
    if (!((life4_5 != null))) {
        forwardValue2003_15_0 = spill2003_0;
        forwardValue2003_15_1 = spill2003_1;
        break forward_join_15;
    }
    if (!((spill2003_0 >= spill2003_1))) {
        break forward_join_17;
    }
    forwardValue2003_15_0 = 2;
    forwardValue2003_15_1 = (p0 & 1);
    }
    forwardValue2003_18_0 = (forwardValue2003_15_0 + forwardValue2003_15_1);
    break forward_join_18;
    }
    forwardValue2003_18_0 = p0;
    }
    return forwardValue2003_18_0;
}


public int[] a__ArrayInt(int p0, int p1, int p2, int p3) {
int forestValue650_39_0;
    int forestValue650_39_1;
    int forestValue650_120_0;
    int forestValue650_120_1;
    int forestValue650_125_0;
    int forestValue650_125_1;
    int forestValue650_130_0;
    int forestValue650_130_1;
    net.minecraft.entity.Entity[] spill650_0;
    int spill650_1;
    int spill650_2;
    long life5_3;
    int life8_8;
    int life9_12;
    net.minecraft.entity.Entity[] life7_13;
    int life10_17;
    int life11_21;
    int[] life12_29;
    int[] life13_34;
    int life14_36;
    int life15_41;
    int life16_56;
    int life17_70;
    int life18_82;
    int life19_96;
    int life20_110;
    forest_join_156: {
    life5_3 = (moom.GP.f ^ 138523895558909L);
    spill650_0 = moom.GD.b();
    life8_8 = (p0 - 1);
    life9_12 = (p1 - 1);
    life7_13 = spill650_0;
    life10_17 = (p2 + 2);
    life11_21 = (p3 + 2);
    life12_29 = ((moom.GD)(((moom.GP)(this)).b)).a__ArrayInt(((int)(life8_8)), ((int)(life9_12)), ((int)(life10_17)), ((int)(life11_21)));
    life13_34 = moom.GY.a(((int)((p2 * p3))));
    life14_36 = 0;
    forest_cycle_37: while (true) {
    forest_join_153: {
    forestValue650_39_0 = life14_36;
    forestValue650_39_1 = p3;
    forest_cycle_39: while (true) {
    if (!((forestValue650_39_0 < forestValue650_39_1))) {
        break forest_join_156;
    }
    life15_41 = 0;
    forest_cycle_42: while (true) {
    forest_join_150: {
    forest_join_141: {
    forest_join_130: {
    forest_join_125: {
    forest_join_120: {
    if (!((life15_41 < p2))) {
        break forest_join_153;
    }
    life16_56 = ((moom.GP)(this)).b(((int)((life12_29)[(life15_41 + ((life14_36 + 1) * life10_17))])));
    life17_70 = ((moom.GP)(this)).b(((int)((life12_29)[((life15_41 + 2) + ((life14_36 + 1) * life10_17))])));
    life18_82 = ((moom.GP)(this)).b(((int)((life12_29)[((life15_41 + 1) + (life14_36 * life10_17))])));
    life19_96 = ((moom.GP)(this)).b(((int)((life12_29)[((life15_41 + 1) + ((life14_36 + 2) * life10_17))])));
    life20_110 = ((moom.GP)(this)).b(((int)((life12_29)[((life15_41 + 1) + ((life14_36 + 1) * life10_17))])));
    spill650_1 = life20_110;
    spill650_2 = life16_56;
    if (!((life7_13 != null))) {
        forestValue650_39_0 = spill650_1;
        forestValue650_39_1 = spill650_2;
        continue forest_cycle_39;
    }
    if (!((life7_13 != null))) {
        forestValue650_120_0 = spill650_1;
        forestValue650_120_1 = spill650_2;
        break forest_join_120;
    }
    if (!((spill650_1 == spill650_2))) {
        break forest_join_141;
    }
    forestValue650_120_0 = life20_110;
    forestValue650_120_1 = life18_82;
    }
    if (!((life7_13 != null))) {
        forestValue650_125_0 = forestValue650_120_0;
        forestValue650_125_1 = forestValue650_120_1;
        break forest_join_125;
    }
    if (!((forestValue650_120_0 == forestValue650_120_1))) {
        break forest_join_141;
    }
    forestValue650_125_0 = life20_110;
    forestValue650_125_1 = life17_70;
    }
    if (!((life7_13 != null))) {
        forestValue650_130_0 = forestValue650_125_0;
        forestValue650_130_1 = forestValue650_125_1;
        break forest_join_130;
    }
    if (!((forestValue650_125_0 == forestValue650_125_1))) {
        break forest_join_141;
    }
    forestValue650_130_0 = life20_110;
    forestValue650_130_1 = life19_96;
    }
    if (!((forestValue650_130_0 == forestValue650_130_1))) {
        break forest_join_141;
    }
    (life13_34)[(life15_41 + (life14_36 * p2))] = -1;
    if (!((life7_13 == null))) {
        break forest_join_150;
    }
    }
    (life13_34)[(life15_41 + (life14_36 * p2))] = ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.y)).aB;
    }
    life15_41 += 1;
    if (!((life7_13 == null))) {
        continue forest_cycle_42;
    }
    break forest_cycle_42;
    }
    break forest_cycle_39;
    }
    }
    life14_36 += 1;
    if (!((life7_13 == null))) {
        continue forest_cycle_37;
    }
    break forest_cycle_37;
    }
    }
    return life13_34;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}

}
