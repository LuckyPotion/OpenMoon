package moom;


public class GT extends moom.GD {

private static final long f;

public GT(long p0, moom.GD p1) {
super(p0);
    ((moom.GD)(this)).b = ((moom.GD)(p1));
    return;
}


static {
f = (moom._c.a(-5986371116835905603L, 3087587555199995141L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(134864496032944L);
}


public int[] a__ArrayInt(int p0, int p1, int p2, int p3) {
int forestValue652_39_0;
    int forestValue652_39_1;
    int forestValue652_134_0;
    int forestValue652_139_0;
    int forestValue652_139_1;
    int forestValue652_148_0;
    int forestValue652_148_1;
    int forestValue652_150_0;
    net.minecraft.entity.Entity[] spill652_0;
    int spill652_1;
    int spill652_2;
    int spill652_3;
    int spill652_4;
    int spill652_5;
    int spill652_6;
    long life5_3;
    int life8_8;
    net.minecraft.entity.Entity[] life7_9;
    int life9_13;
    int life10_17;
    int life11_21;
    int[] life12_29;
    int[] life13_34;
    int life14_36;
    int life15_41;
    int life16_54;
    int life17_66;
    int life18_76;
    int life19_88;
    int life20_100;
    forest_join_165: {
    life5_3 = (moom.GT.f ^ 107275561909596L);
    spill652_0 = moom.GD.b();
    life8_8 = (p0 - 1);
    life7_9 = spill652_0;
    life9_13 = (p1 - 1);
    life10_17 = (p2 + 2);
    life11_21 = (p3 + 2);
    life12_29 = ((moom.GD)(((moom.GT)(this)).b)).a__ArrayInt(((int)(life8_8)), ((int)(life9_13)), ((int)(life10_17)), ((int)(life11_21)));
    life13_34 = moom.GY.a(((int)((p2 * p3))));
    life14_36 = 0;
    forest_cycle_37: while (true) {
    forest_join_162: {
    forestValue652_39_0 = life14_36;
    forestValue652_39_1 = p3;
    forest_cycle_39: while (true) {
    if (!((forestValue652_39_0 < forestValue652_39_1))) {
        break forest_join_165;
    }
    life15_41 = 0;
    forest_cycle_42: while (true) {
    forest_join_151: {
    forest_join_150: {
    forest_join_148: {
    forest_join_144: {
    forest_join_139: {
    forest_join_137: {
    forest_join_134: {
    forest_join_133: {
    if (!((life15_41 < p2))) {
        break forest_join_162;
    }
    life16_54 = (life12_29)[(life15_41 + ((life14_36 + 1) * life10_17))];
    life17_66 = (life12_29)[((life15_41 + 2) + ((life14_36 + 1) * life10_17))];
    life18_76 = (life12_29)[((life15_41 + 1) + (life14_36 * life10_17))];
    life19_88 = (life12_29)[((life15_41 + 1) + ((life14_36 + 2) * life10_17))];
    life20_100 = (life12_29)[((life15_41 + 1) + ((life14_36 + 1) * life10_17))];
    spill652_1 = life16_54;
    spill652_2 = life17_66;
    if (!((life7_9 != null))) {
        forestValue652_39_0 = spill652_1;
        forestValue652_39_1 = spill652_2;
        continue forest_cycle_39;
    }
    if (!((life7_9 != null))) {
        forestValue652_139_0 = spill652_1;
        forestValue652_139_1 = spill652_2;
        break forest_join_139;
    }
    if (!((spill652_1 == spill652_2))) {
        break forest_join_137;
    }
    spill652_3 = life18_76;
    spill652_4 = life19_88;
    if (!((life7_9 != null))) {
        forestValue652_139_0 = spill652_3;
        forestValue652_139_1 = spill652_4;
        break forest_join_139;
    }
    if (!((spill652_3 == spill652_4))) {
        break forest_join_137;
    }
    ((moom.GT)(this)).a(((long)(((long) (life15_41 + p0)))), ((long)(((long) (life14_36 + p1)))));
    spill652_5 = ((moom.GT)(this)).a(((int)(2)));
    if (!((life7_9 != null))) {
        forestValue652_134_0 = spill652_5;
        break forest_join_134;
    }
    if (!((spill652_5 == 0))) {
        break forest_join_133;
    }
    life20_100 = life16_54;
    if (!((life7_9 == null))) {
        break forest_join_151;
    }
    }
    forestValue652_134_0 = life18_76;
    }
    life20_100 = forestValue652_134_0;
    if (!((life7_9 == null))) {
        break forest_join_151;
    }
    }
    forestValue652_139_0 = life16_54;
    forestValue652_139_1 = life17_66;
    }
    if (!((life7_9 != null))) {
        forestValue652_148_0 = forestValue652_139_0;
        forestValue652_148_1 = forestValue652_139_1;
        break forest_join_148;
    }
    if (!((forestValue652_139_0 == forestValue652_139_1))) {
        break forest_join_144;
    }
    life20_100 = life16_54;
    }
    spill652_6 = life18_76;
    if (!((life7_9 != null))) {
        forestValue652_150_0 = spill652_6;
        break forest_join_150;
    }
    forestValue652_148_0 = spill652_6;
    forestValue652_148_1 = life19_88;
    }
    if (!((forestValue652_148_0 == forestValue652_148_1))) {
        break forest_join_151;
    }
    forestValue652_150_0 = life18_76;
    }
    life20_100 = forestValue652_150_0;
    }
    (life13_34)[(life15_41 + (life14_36 * p2))] = life20_100;
    life15_41 += 1;
    if (!((life7_9 == null))) {
        continue forest_cycle_42;
    }
    break forest_cycle_42;
    }
    break forest_cycle_39;
    }
    }
    life14_36 += 1;
    if (!((life7_9 == null))) {
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
