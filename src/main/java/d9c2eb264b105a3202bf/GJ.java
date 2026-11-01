package moom;


public class GJ extends moom.GD {

private static final long f;

public GJ(long p0, moom.GD p1) {
super(p0);
    this.b = p1;
}


static {
f = (moom._c.a(-3579970627312628385L, 8456538884138706024L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(155962775748825L);
}


public int[] a__ArrayInt(int p0, int p1, int p2, int p3) {
int forestValue643_38_0;
    int forestValue643_131_0;
    int forestValue643_136_0;
    int forestValue643_141_0;
    int forestValue643_146_0;
    int forestValue643_150_0;
    net.minecraft.entity.Entity[] spill643_0;
    int spill643_1;
    long life5_3;
    int life8_7;
    int life9_12;
    net.minecraft.entity.Entity[] life7_13;
    int life10_17;
    int life11_21;
    int[] life12_29;
    int[] life13_34;
    int life14_36;
    int life15_41;
    int life16_60;
    int life17_76;
    int life18_92;
    int life19_108;
    int life20_120;
    int life21_122;
    forest_join_177: {
    life5_3 = (moom.GJ.f ^ 102469862241956L);
    life8_7 = (p0 - 1);
    spill643_0 = moom.GD.b();
    life9_12 = (p1 - 1);
    life7_13 = spill643_0;
    life10_17 = (p2 + 2);
    life11_21 = (p3 + 2);
    life12_29 = ((moom.GD)(((moom.GJ)(this)).b)).a__ArrayInt(((int)(life8_7)), ((int)(life9_12)), ((int)(life10_17)), ((int)(life11_21)));
    life13_34 = moom.GY.a(((int)((p2 * p3))));
    life14_36 = 0;
    forest_cycle_37: while (true) {
    forest_join_174: {
    forestValue643_38_0 = life14_36;
    forest_cycle_38: while (true) {
    if (!((forestValue643_38_0 < p3))) {
        break forest_join_177;
    }
    life15_41 = 0;
    forest_cycle_42: while (true) {
    forest_join_171: {
    forest_join_163: {
    forest_join_150: {
    forest_join_146: {
    forest_join_145: {
    forest_join_141: {
    forest_join_140: {
    forest_join_136: {
    forest_join_135: {
    forest_join_131: {
    forest_join_130: {
    if (!((life15_41 < p2))) {
        break forest_join_174;
    }
    life16_60 = (life12_29)[((life15_41 + 1) + (((life14_36 + 1) - 1) * (p2 + 2)))];
    life17_76 = (life12_29)[(((life15_41 + 1) + 1) + ((life14_36 + 1) * (p2 + 2)))];
    life18_92 = (life12_29)[(((life15_41 + 1) - 1) + ((life14_36 + 1) * (p2 + 2)))];
    life19_108 = (life12_29)[((life15_41 + 1) + (((life14_36 + 1) + 1) * (p2 + 2)))];
    life20_120 = (life12_29)[((life15_41 + 1) + ((life14_36 + 1) * life10_17))];
    life21_122 = 0;
    spill643_1 = life16_60;
    if (!((life7_13 != null))) {
        forestValue643_38_0 = spill643_1;
        continue forest_cycle_38;
    }
    if (!((life7_13 != null))) {
        forestValue643_131_0 = spill643_1;
        break forest_join_131;
    }
    if (!((spill643_1 == 0))) {
        break forest_join_130;
    }
    life21_122 += 1;
    }
    forestValue643_131_0 = life17_76;
    }
    if (!((life7_13 != null))) {
        forestValue643_136_0 = forestValue643_131_0;
        break forest_join_136;
    }
    if (!((forestValue643_131_0 == 0))) {
        break forest_join_135;
    }
    life21_122 += 1;
    }
    forestValue643_136_0 = life18_92;
    }
    if (!((life7_13 != null))) {
        forestValue643_141_0 = forestValue643_136_0;
        break forest_join_141;
    }
    if (!((forestValue643_136_0 == 0))) {
        break forest_join_140;
    }
    life21_122 += 1;
    }
    forestValue643_141_0 = life19_108;
    }
    if (!((life7_13 != null))) {
        forestValue643_146_0 = forestValue643_141_0;
        break forest_join_146;
    }
    if (!((forestValue643_141_0 == 0))) {
        break forest_join_145;
    }
    life21_122 += 1;
    }
    forestValue643_146_0 = life20_120;
    }
    if (!((life7_13 != null))) {
        forestValue643_150_0 = forestValue643_146_0;
        break forest_join_150;
    }
    if (!((forestValue643_146_0 == 0))) {
        break forest_join_163;
    }
    forestValue643_150_0 = life21_122;
    }
    if (!((forestValue643_150_0 > 3))) {
        break forest_join_163;
    }
    (life13_34)[(life15_41 + (life14_36 * p2))] = ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.P)).aB;
    if (!((life7_13 == null))) {
        break forest_join_171;
    }
    }
    (life13_34)[(life15_41 + (life14_36 * p2))] = life20_120;
    }
    life15_41 += 1;
    if (!((life7_13 == null))) {
        continue forest_cycle_42;
    }
    break forest_cycle_42;
    }
    break forest_cycle_38;
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
