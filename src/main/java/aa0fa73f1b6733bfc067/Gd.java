package moom;


public class Gd extends moom.FY {

private final net.minecraft.block.Block c;

private final int d;

private static final long e;

public Gd(net.minecraft.block.Block p0, int p1) {
super(false);
    this.c = p0;
    this.d = p1;
}


static {
e = (moom._c.a(3959521485313356305L, 8027070907197029289L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(257671104517205L);
}


public boolean a__Boolean(net.minecraft.world.World p0, java.util.Random p1, moom.DT p2) {
net.minecraft.world.World forestValue271_24_0;
    moom.DT forestValue271_24_1;
    net.minecraft.block.Block forestValue271_34_0;
    net.minecraft.block.Block forestValue271_34_1;
    net.minecraft.block.Block forestValue271_39_0;
    net.minecraft.block.Block forestValue271_39_1;
    int forestValue271_49_0;
    int forestValue271_57_0;
    int forestValue271_61_0;
    int forestValue271_141_0;
    int forestValue271_179_0;
    net.minecraft.world.World spill271_0;
    moom.DT spill271_1;
    boolean spill271_2;
    net.minecraft.block.Block spill271_3;
    moom.dC spill271_4;
    int spill271_5;
    int spill271_6;
    long life4_3;
    int[] life6_5;
    net.minecraft.block.Block life7_31;
    int life7_69;
    int life8_71;
    int life9_88;
    int life10_94;
    int life11_100;
    float life12_111;
    java.util.Iterator life13_127;
    moom.DT life14_134;
    forest_join_179: {
    forest_join_178: {
    forest_join_57: {
    forest_join_55: {
    forest_join_49: {
    forest_join_47: {
    life4_3 = (moom.Gd.e ^ 36457956931727L);
    life6_5 = moom.FY.b();
    forest_cycle_6: while (true) {
    forest_join_43: {
    forest_join_39: {
    forest_join_34: {
    forest_join_24: {
    forest_join_21: {
    if (!((((moom.DT)(p2)).b() > 3))) {
        break forest_join_47;
    }
    spill271_0 = p0;
    spill271_1 = ((moom.DT)(p2)).b__DT();
    if (!((life6_5 != null))) {
        forestValue271_24_0 = spill271_0;
        forestValue271_24_1 = spill271_1;
        break forest_join_24;
    }
    spill271_2 = ((net.minecraft.world.World)(spill271_0)).a__Boolean(((moom.DT)(spill271_1)));
    if (!((life6_5 != null))) {
        forestValue271_49_0 = ((spill271_2) ? 1 : 0);
        break forest_join_49;
    }
    if (!(spill271_2)) {
        break forest_join_21;
    }
    if (!((life6_5 == null))) {
        break forest_join_43;
    }
    }
    forestValue271_24_0 = p0;
    forestValue271_24_1 = ((moom.DT)(p2)).b__DT();
    }
    life7_31 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(forestValue271_24_0)).a__fE(((moom.DT)(forestValue271_24_1))))).a__ch();
    spill271_3 = life7_31;
    spill271_4 = net.minecraft.init.Blocks.c;
    if (!((life6_5 != null))) {
        forestValue271_34_0 = spill271_3;
        forestValue271_34_1 = spill271_4;
        break forest_join_34;
    }
    if (!((spill271_3 != spill271_4))) {
        break forest_join_47;
    }
    forestValue271_34_0 = life7_31;
    forestValue271_34_1 = net.minecraft.init.Blocks.d;
    }
    if (!((life6_5 != null))) {
        forestValue271_39_0 = forestValue271_34_0;
        forestValue271_39_1 = forestValue271_34_1;
        break forest_join_39;
    }
    if (!((forestValue271_34_0 != forestValue271_34_1))) {
        break forest_join_47;
    }
    forestValue271_39_0 = life7_31;
    forestValue271_39_1 = net.minecraft.init.Blocks.b;
    }
    if (!((forestValue271_39_0 != forestValue271_39_1))) {
        break forest_join_47;
    }
    if (!((life6_5 == null))) {
        break forest_join_43;
    }
    break forest_join_47;
    }
    p2 = ((moom.DT)(p2)).b__DT();
    continue forest_cycle_6;
    }
    }
    forestValue271_49_0 = ((moom.DT)(p2)).b();
    }
    if (!((life6_5 != null))) {
        forestValue271_57_0 = forestValue271_49_0;
        break forest_join_57;
    }
    if (!((forestValue271_49_0 <= 3))) {
        break forest_join_55;
    }
    return ((0) != 0);
    }
    forestValue271_57_0 = this.d;
    }
    life7_69 = forestValue271_57_0;
    life8_71 = 0;
    forest_cycle_60: while (true) {
    forest_join_144: {
    forestValue271_61_0 = life7_69;
    forest_cycle_61: while (true) {
    if (!((forestValue271_61_0 >= 0))) {
        break forest_join_178;
    }
    spill271_5 = life8_71;
    if (!((life6_5 != null))) {
        forestValue271_179_0 = spill271_5;
        break forest_join_179;
    }
    if (!((life6_5 != null))) {
        forestValue271_179_0 = spill271_5;
        break forest_join_179;
    }
    if (!((spill271_5 < 3))) {
        break forest_join_178;
    }
    life9_88 = (life7_69 + ((java.util.Random)(p1)).nextInt(((int)(2))));
    life10_94 = (life7_69 + ((java.util.Random)(p1)).nextInt(((int)(2))));
    life11_100 = (life7_69 + ((java.util.Random)(p1)).nextInt(((int)(2))));
    life12_111 = ((((float) ((life9_88 + life10_94) + life11_100)) * 0x1.54fdf4p-2f) + 0x1.0p-1f);
    life13_127 = ((java.lang.Iterable)(moom.DT.a(((moom.DT)(((moom.DT)(p2)).a(((int)((-life9_88))), ((int)((-life10_94))), ((int)((-life11_100)))))), ((moom.DT)(((moom.DT)(p2)).a(((int)(life9_88)), ((int)(life10_94)), ((int)(life11_100)))))))).iterator();
    forest_cycle_114: while (true) {
    forest_join_142: {
    forest_join_141: {
    if (!(((java.util.Iterator)(life13_127)).hasNext())) {
        break forest_join_144;
    }
    life14_134 = ((moom.DT)(((java.util.Iterator)(life13_127)).next()));
    spill271_6 = recovery.source.CarrierOps.dcmpg(((double)(((moom.DT)(life14_134)).a(((moom.DS)(p2))))), ((double)(((double) (life12_111 * life12_111)))));
    if (!((life6_5 != null))) {
        forestValue271_61_0 = spill271_6;
        continue forest_cycle_61;
    }
    if (!((life6_5 != null))) {
        forestValue271_141_0 = spill271_6;
        break forest_join_141;
    }
    if (!((spill271_6 <= 0))) {
        break forest_join_142;
    }
    forestValue271_141_0 = ((((net.minecraft.world.World)(p0)).a(((moom.DT)(life14_134)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(this.c)).a__fE())), ((int)(4)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forestValue271_141_0);
    }
    if (!((life6_5 == null))) {
        continue forest_cycle_114;
    }
    break forest_cycle_114;
    }
    break forest_cycle_61;
    }
    }
    p2 = ((moom.DT)(p2)).a(((int)(((-(life7_69 + 1)) + ((java.util.Random)(p1)).nextInt(((int)((2 + (life7_69 * 2)))))))), ((int)((-((java.util.Random)(p1)).nextInt(((int)(2)))))), ((int)(((-(life7_69 + 1)) + ((java.util.Random)(p1)).nextInt(((int)((2 + (life7_69 * 2)))))))));
    life8_71 += 1;
    if (!((life6_5 == null))) {
        continue forest_cycle_60;
    }
    break forest_cycle_60;
    }
    }
    forestValue271_179_0 = 1;
    }
    return ((forestValue271_179_0) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}

}
