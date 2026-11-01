package moom;


public class GE extends moom.GD {

private static final long f;

public GE(long p0, moom.GD p1) {
super(p0);
    this.b = p1;
}


static {
f = (moom._c.a(2355373609467520760L, 192370874963482808L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(100359730096798L);
}


public int[] a__ArrayInt(int p0, int p1, int p2, int p3) {
int forestValue639_38_0;
    int forestValue639_130_0;
    int forestValue639_134_0;
    int forestValue639_152_0;
    int forestValue639_156_0;
    int forestValue639_199_0;
    int forestValue639_216_0;
    int forestValue639_229_0;
    int forestValue639_242_0;
    int forestValue639_257_0;
    int forestValue639_271_0;
    net.minecraft.entity.Entity[] spill639_0;
    int spill639_1;
    int spill639_2;
    int spill639_3;
    int spill639_4;
    int spill639_5;
    int spill639_6;
    int spill639_7;
    int spill639_8;
    int spill639_9;
    int spill639_10;
    int spill639_11;
    int spill639_12;
    int spill639_13;
    long life5_3;
    int life8_7;
    int life9_11;
    int life10_15;
    int life11_20;
    net.minecraft.entity.Entity[] life7_21;
    int[] life12_29;
    int[] life13_34;
    int life14_36;
    int life15_41;
    int life16_52;
    int life17_62;
    int life18_72;
    int life19_84;
    int life20_96;
    int life21_223;
    int life22_225;
    forest_join_297: {
    life5_3 = (moom.GE.f ^ 7174242133398L);
    life8_7 = (p0 - 1);
    life9_11 = (p1 - 1);
    life10_15 = (p2 + 2);
    spill639_0 = moom.GD.b();
    life11_20 = (p3 + 2);
    life7_21 = spill639_0;
    life12_29 = ((moom.GD)(((moom.GE)(this)).b)).a__ArrayInt(((int)(life8_7)), ((int)(life9_11)), ((int)(life10_15)), ((int)(life11_20)));
    life13_34 = moom.GY.a(((int)((p2 * p3))));
    life14_36 = 0;
    forest_cycle_37: while (true) {
    forest_join_294: {
    forestValue639_38_0 = life14_36;
    forest_cycle_38: while (true) {
    if (!((forestValue639_38_0 < p3))) {
        break forest_join_297;
    }
    life15_41 = 0;
    forest_cycle_42: while (true) {
    forest_join_291: {
    forest_join_283: {
    forest_join_271: {
    forest_join_270: {
    forest_join_257: {
    forest_join_254: {
    forest_join_242: {
    forest_join_241: {
    forest_join_229: {
    forest_join_228: {
    forest_join_216: {
    forest_join_215: {
    forest_join_199: {
    forest_join_198: {
    forest_join_188: {
    forest_join_178: {
    forest_join_168: {
    forest_join_156: {
    forest_join_152: {
    forest_join_149: {
    forest_join_134: {
    forest_join_130: {
    forest_join_129: {
    if (!((life15_41 < p2))) {
        break forest_join_294;
    }
    life16_52 = (life12_29)[(life15_41 + (life14_36 * life10_15))];
    life17_62 = (life12_29)[((life15_41 + 2) + (life14_36 * life10_15))];
    life18_72 = (life12_29)[(life15_41 + ((life14_36 + 2) * life10_15))];
    life19_84 = (life12_29)[((life15_41 + 2) + ((life14_36 + 2) * life10_15))];
    life20_96 = (life12_29)[((life15_41 + 1) + ((life14_36 + 1) * life10_15))];
    ((moom.GE)(this)).a(((long)(((long) (life15_41 + p0)))), ((long)(((long) (life14_36 + p1)))));
    spill639_1 = life20_96;
    if (!((life7_21 != null))) {
        forestValue639_38_0 = spill639_1;
        continue forest_cycle_38;
    }
    if (!((life7_21 != null))) {
        forestValue639_130_0 = spill639_1;
        break forest_join_130;
    }
    if (!((spill639_1 == 0))) {
        break forest_join_129;
    }
    spill639_2 = life16_52;
    if (!((life7_21 != null))) {
        forestValue639_199_0 = spill639_2;
        break forest_join_199;
    }
    if (!((spill639_2 == 0))) {
        break forest_join_198;
    }
    spill639_3 = life17_62;
    if (!((life7_21 != null))) {
        forestValue639_199_0 = spill639_3;
        break forest_join_199;
    }
    if (!((spill639_3 == 0))) {
        break forest_join_198;
    }
    spill639_4 = life18_72;
    if (!((life7_21 != null))) {
        forestValue639_199_0 = spill639_4;
        break forest_join_199;
    }
    if (!((spill639_4 == 0))) {
        break forest_join_198;
    }
    spill639_5 = life19_84;
    if (!((life7_21 != null))) {
        forestValue639_199_0 = spill639_5;
        break forest_join_199;
    }
    if (!((spill639_5 == 0))) {
        break forest_join_198;
    }
    }
    forestValue639_130_0 = life20_96;
    }
    if (!((life7_21 != null))) {
        forestValue639_134_0 = forestValue639_130_0;
        break forest_join_134;
    }
    if (!((forestValue639_130_0 > 0))) {
        break forest_join_188;
    }
    forestValue639_134_0 = life16_52;
    }
    if (!((life7_21 != null))) {
        forestValue639_152_0 = forestValue639_134_0;
        break forest_join_152;
    }
    if (!((forestValue639_134_0 != 0))) {
        break forest_join_149;
    }
    spill639_6 = life17_62;
    if (!((life7_21 != null))) {
        forestValue639_152_0 = spill639_6;
        break forest_join_152;
    }
    if (!((spill639_6 != 0))) {
        break forest_join_149;
    }
    spill639_7 = life18_72;
    if (!((life7_21 != null))) {
        forestValue639_152_0 = spill639_7;
        break forest_join_152;
    }
    if (!((spill639_7 != 0))) {
        break forest_join_149;
    }
    spill639_8 = life19_84;
    if (!((life7_21 != null))) {
        forestValue639_152_0 = spill639_8;
        break forest_join_152;
    }
    if (!((spill639_8 == 0))) {
        break forest_join_188;
    }
    }
    forestValue639_152_0 = ((moom.GE)(this)).a(((int)(5)));
    }
    if (!((life7_21 != null))) {
        forestValue639_156_0 = forestValue639_152_0;
        break forest_join_156;
    }
    if (!((forestValue639_152_0 == 0))) {
        break forest_join_178;
    }
    forestValue639_156_0 = life20_96;
    }
    if (!((forestValue639_156_0 == 4))) {
        break forest_join_168;
    }
    (life13_34)[(life15_41 + (life14_36 * p2))] = 4;
    if (!((life7_21 == null))) {
        break forest_join_291;
    }
    }
    (life13_34)[(life15_41 + (life14_36 * p2))] = 0;
    if (!((life7_21 == null))) {
        break forest_join_291;
    }
    }
    (life13_34)[(life15_41 + (life14_36 * p2))] = life20_96;
    if (!((life7_21 == null))) {
        break forest_join_291;
    }
    }
    (life13_34)[(life15_41 + (life14_36 * p2))] = life20_96;
    if (!((life7_21 == null))) {
        break forest_join_291;
    }
    }
    forestValue639_199_0 = 1;
    }
    life21_223 = forestValue639_199_0;
    life22_225 = 1;
    spill639_9 = life16_52;
    if (!((life7_21 != null))) {
        forestValue639_216_0 = spill639_9;
        break forest_join_216;
    }
    if (!((spill639_9 != 0))) {
        break forest_join_215;
    }
    spill639_10 = ((moom.GE)(this)).a(((int)((life21_223++))));
    if (!((life7_21 != null))) {
        forestValue639_216_0 = spill639_10;
        break forest_join_216;
    }
    if (!((spill639_10 == 0))) {
        break forest_join_215;
    }
    life22_225 = life16_52;
    }
    forestValue639_216_0 = life17_62;
    }
    if (!((life7_21 != null))) {
        forestValue639_229_0 = forestValue639_216_0;
        break forest_join_229;
    }
    if (!((forestValue639_216_0 != 0))) {
        break forest_join_228;
    }
    spill639_11 = ((moom.GE)(this)).a(((int)((life21_223++))));
    if (!((life7_21 != null))) {
        forestValue639_229_0 = spill639_11;
        break forest_join_229;
    }
    if (!((spill639_11 == 0))) {
        break forest_join_228;
    }
    life22_225 = life17_62;
    }
    forestValue639_229_0 = life18_72;
    }
    if (!((life7_21 != null))) {
        forestValue639_242_0 = forestValue639_229_0;
        break forest_join_242;
    }
    if (!((forestValue639_229_0 != 0))) {
        break forest_join_241;
    }
    spill639_12 = ((moom.GE)(this)).a(((int)((life21_223++))));
    if (!((life7_21 != null))) {
        forestValue639_242_0 = spill639_12;
        break forest_join_242;
    }
    if (!((spill639_12 == 0))) {
        break forest_join_241;
    }
    life22_225 = life18_72;
    }
    forestValue639_242_0 = life19_84;
    }
    if (!((life7_21 != null))) {
        forestValue639_257_0 = forestValue639_242_0;
        break forest_join_257;
    }
    if (!((forestValue639_242_0 != 0))) {
        break forest_join_254;
    }
    spill639_13 = ((moom.GE)(this)).a(((int)((life21_223++))));
    if (!((life7_21 != null))) {
        forestValue639_257_0 = spill639_13;
        break forest_join_257;
    }
    if (!((spill639_13 == 0))) {
        break forest_join_254;
    }
    life22_225 = life19_84;
    }
    forestValue639_257_0 = ((moom.GE)(this)).a(((int)(3)));
    }
    if (!((life7_21 != null))) {
        forestValue639_271_0 = forestValue639_257_0;
        break forest_join_271;
    }
    if (!((forestValue639_257_0 == 0))) {
        break forest_join_270;
    }
    (life13_34)[(life15_41 + (life14_36 * p2))] = life22_225;
    if (!((life7_21 == null))) {
        break forest_join_291;
    }
    }
    forestValue639_271_0 = life22_225;
    }
    if (!((forestValue639_271_0 == 4))) {
        break forest_join_283;
    }
    (life13_34)[(life15_41 + (life14_36 * p2))] = 4;
    if (!((life7_21 == null))) {
        break forest_join_291;
    }
    }
    (life13_34)[(life15_41 + (life14_36 * p2))] = 0;
    }
    life15_41 += 1;
    if (!((life7_21 == null))) {
        continue forest_cycle_42;
    }
    break forest_cycle_42;
    }
    break forest_cycle_38;
    }
    }
    life14_36 += 1;
    if (!((life7_21 == null))) {
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
