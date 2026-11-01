package moom;


public class GO extends moom.GD {

private static final long f;

public GO(long p0, moom.GD p1) {
super(p0);
    this.b = p1;
}


static {
f = (moom._c.a(-3880165820260267844L, -4737810199924973579L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(67706214465003L);
}


public int[] a__ArrayInt(int p0, int p1, int p2, int p3) {
int forestValue649_38_0;
    int forestValue649_150_0;
    int forestValue649_154_0;
    int forestValue649_158_0;
    int forestValue649_164_0;
    net.minecraft.entity.Entity[] spill649_0;
    int spill649_1;
    int spill649_2;
    long life5_3;
    int life8_7;
    int life9_11;
    int life10_15;
    int life11_19;
    int[] life12_28;
    int[] life13_33;
    int life14_35;
    net.minecraft.entity.Entity[] life7_36;
    int life15_41;
    int life16_60;
    int life17_76;
    int life18_92;
    int life19_108;
    int life20_120;
    forest_join_179: {
    life5_3 = (moom.GO.f ^ 96787107086432L);
    life8_7 = (p0 - 1);
    life9_11 = (p1 - 1);
    life10_15 = (p2 + 2);
    life11_19 = (p3 + 2);
    spill649_0 = moom.GD.b();
    life12_28 = ((moom.GD)(((moom.GO)(this)).b)).a__ArrayInt(((int)(life8_7)), ((int)(life9_11)), ((int)(life10_15)), ((int)(life11_19)));
    life13_33 = moom.GY.a(((int)((p2 * p3))));
    life14_35 = 0;
    life7_36 = spill649_0;
    forest_cycle_37: while (true) {
    forest_join_176: {
    forestValue649_38_0 = life14_35;
    forest_cycle_38: while (true) {
    if (!((forestValue649_38_0 < p3))) {
        break forest_join_179;
    }
    life15_41 = 0;
    forest_cycle_42: while (true) {
    forest_join_174: {
    forest_join_173: {
    forest_join_164: {
    forest_join_158: {
    forest_join_154: {
    forest_join_150: {
    if (!((life15_41 < p2))) {
        break forest_join_176;
    }
    life16_60 = (life12_28)[((life15_41 + 1) + (((life14_35 + 1) - 1) * (p2 + 2)))];
    life17_76 = (life12_28)[(((life15_41 + 1) + 1) + ((life14_35 + 1) * (p2 + 2)))];
    life18_92 = (life12_28)[(((life15_41 + 1) - 1) + ((life14_35 + 1) * (p2 + 2)))];
    life19_108 = (life12_28)[((life15_41 + 1) + (((life14_35 + 1) + 1) * (p2 + 2)))];
    life20_120 = (life12_28)[((life15_41 + 1) + ((life14_35 + 1) * life10_15))];
    (life13_33)[(life15_41 + (life14_35 * p2))] = life20_120;
    ((moom.GO)(this)).a(((long)(((long) (life15_41 + p0)))), ((long)(((long) (life14_35 + p1)))));
    if (!((life7_36 != null))) {
        break forest_join_174;
    }
    spill649_1 = life20_120;
    if (!((life7_36 != null))) {
        forestValue649_38_0 = spill649_1;
        continue forest_cycle_38;
    }
    if (!((spill649_1 == 0))) {
        break forest_join_173;
    }
    spill649_2 = life16_60;
    if (!((life7_36 != null))) {
        forestValue649_150_0 = spill649_2;
        break forest_join_150;
    }
    if (!((spill649_2 == 0))) {
        break forest_join_173;
    }
    forestValue649_150_0 = life17_76;
    }
    if (!((life7_36 != null))) {
        forestValue649_154_0 = forestValue649_150_0;
        break forest_join_154;
    }
    if (!((forestValue649_150_0 == 0))) {
        break forest_join_173;
    }
    forestValue649_154_0 = life18_92;
    }
    if (!((life7_36 != null))) {
        forestValue649_158_0 = forestValue649_154_0;
        break forest_join_158;
    }
    if (!((forestValue649_154_0 == 0))) {
        break forest_join_173;
    }
    forestValue649_158_0 = life19_108;
    }
    if (!((life7_36 != null))) {
        forestValue649_164_0 = forestValue649_158_0;
        break forest_join_164;
    }
    if (!((forestValue649_158_0 == 0))) {
        break forest_join_173;
    }
    forestValue649_164_0 = ((moom.GO)(this)).a(((int)(2)));
    }
    if (!((forestValue649_164_0 == 0))) {
        break forest_join_173;
    }
    (life13_33)[(life15_41 + (life14_35 * p2))] = 1;
    }
    life15_41 += 1;
    }
    if (!((life7_36 == null))) {
        continue forest_cycle_42;
    }
    break forest_cycle_42;
    }
    break forest_cycle_38;
    }
    }
    life14_35 += 1;
    if (!((life7_36 == null))) {
        continue forest_cycle_37;
    }
    break forest_cycle_37;
    }
    }
    return life13_33;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}

}
