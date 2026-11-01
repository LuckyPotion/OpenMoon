package moom;


public class fG {

private com.google.common.base.Predicate<moom.fD>[][][] a;

private int b;

private int c;

private int d;

private static int[] e;

private static long f;

public fG(com.google.common.base.Predicate<moom.fD>[][][] p0) { super(); }


private static void __sourceConstructorBody_89f8256281763287(moom.fG receiver, com.google.common.base.Predicate[][][] p0) throws Throwable {

moom.fG __initValue648_50_0;

    moom.fG __initValue648_42_0;

    long local2_life2;

    int[] local4_life8;

    init_join_52: {

    init_join_50: {

    init_join_46: {

    init_join_42: {

    init_join_41: {

    local2_life2 = (moom.fG.f ^ 104146794896219L);

    moom.fG.__sourceConstructorInit_89f8256281763287_0(((moom.fG)(receiver)));

    ((moom.fG)(receiver)).a = ((com.google.common.base.Predicate[][][])(p0));

    int[] __sourceSpill648_7 = moom.fG.b__ArrayInt();

    ((moom.fG)(receiver)).b = ((int)((p0).length));

    local4_life8 = __sourceSpill648_7;

    moom.fG __sourceSpill648_9 = receiver;

    if (!((local4_life8 == null))) {

        __initValue648_50_0 = __sourceSpill648_9;

        break init_join_50;

    }

    if (!((((moom.fG)(__sourceSpill648_9)).b > 0))) {

        break init_join_46;

    }

    ((moom.fG)(receiver)).c = ((int)(((p0)[0]).length));

    moom.fG __sourceSpill648_12 = receiver;

    if (!((local4_life8 == null))) {

        __initValue648_42_0 = __sourceSpill648_12;

        break init_join_42;

    }

    if (!((((moom.fG)(__sourceSpill648_12)).c > 0))) {

        break init_join_41;

    }

    ((moom.fG)(receiver)).d = ((int)((((p0)[0])[0]).length));

    if (!((local4_life8 != null))) {

        break init_join_52;

    }

    }

    __initValue648_42_0 = receiver;

    }

    ((moom.fG)(__initValue648_42_0)).d = ((int)(0));

    if (!((local4_life8 != null))) {

        break init_join_52;

    }

    }

    ((moom.fG)(receiver)).c = ((int)(0));

    __initValue648_50_0 = receiver;

    }

    ((moom.fG)(__initValue648_50_0)).d = ((int)(0));

    }

    return;

}



static {
f = ((long)(((moom._a)(moom._c.a(((long)(-8490883523720673132L)), ((long)(-200720705690982548L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(92498408745102L)))));
    if ((moom.fG.b__ArrayInt() != null)) {
        moom.fG.b(((int[])(new int[1])));
    }
}

private static native <E extends Throwable> void __sourceConstructorInit_89f8256281763287_0(moom.fG a0) throws E;

public static void b(int[] p0) {
e = ((int[])(p0));
    return;
}


public static int[] b__ArrayInt() {
return moom.fG.e;
}


public int b() {
return this.d;
}


private static java.lang.IllegalArgumentException a(java.lang.IllegalArgumentException p0) {
return p0;
}


protected static moom.DT a(moom.DT p0, moom.bs p1, moom.bs p2, int p3, int p4, int p5) {
moom.bs forwardValue3531_14_0;
    moom.bs forwardValue3531_14_1;
    moom.DT forwardValue3531_91_0;
    moom.bs spill3531_0;
    moom.bs spill3531_1;
    moom.DT spill3531_2;
    long life6_3;
    int[] life8_5;
    moom.DS life9_30;
    moom.DS life10_40;
    moom.DS life11_44;
    forward_join_92: {
    forward_join_91: {
    forward_join_14: {
    life6_3 = (moom.fG.f ^ 64770760268488L);
    life8_5 = moom.fG.b__ArrayInt();
    spill3531_0 = p1;
    spill3531_1 = p2;
    if (!((life8_5 == null))) {
        forwardValue3531_14_0 = spill3531_0;
        forwardValue3531_14_1 = spill3531_1;
        break forward_join_14;
    }
    if (!((spill3531_0 != spill3531_1))) {
        break forward_join_92;
    }
    forwardValue3531_14_0 = p1;
    forwardValue3531_14_1 = ((moom.bs)(p2)).a__bs();
    }
    if (!((forwardValue3531_14_0 != forwardValue3531_14_1))) {
        break forward_join_92;
    }
    life9_30 = new moom.DS(((moom.bs)(p1)).c(), ((moom.bs)(p1)).d(), ((moom.bs)(p1)).e());
    life10_40 = new moom.DS(((moom.bs)(p2)).c(), ((moom.bs)(p2)).d(), ((moom.bs)(p2)).e());
    life11_44 = ((moom.DS)(life9_30)).a__DS(((moom.DS)(life10_40)));
    spill3531_2 = ((moom.DT)(p0)).a(((int)((((((moom.DS)(life10_40)).a() * (-p4)) + (((moom.DS)(life11_44)).a() * p3)) + (((moom.DS)(life9_30)).a() * p5)))), ((int)((((((moom.DS)(life10_40)).b() * (-p4)) + (((moom.DS)(life11_44)).b() * p3)) + (((moom.DS)(life9_30)).b() * p5)))), ((int)((((((moom.DS)(life10_40)).c() * (-p4)) + (((moom.DS)(life11_44)).c() * p3)) + (((moom.DS)(life9_30)).c() * p5)))));
    if (!((life8_5 != null))) {
        forwardValue3531_91_0 = spill3531_2;
        break forward_join_91;
    }
    net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[4])));
    forwardValue3531_91_0 = spill3531_2;
    }
    return forwardValue3531_91_0;
    }
    throw new java.lang.IllegalArgumentException("Invalid forwards & up combination");
}


public int a() {
return this.c;
}


private moom.fH a(moom.DT p0, moom.bs p1, moom.bs p2, com.google.common.cache.LoadingCache<moom.DT, moom.fD> p3) {
int forestValue836_9_0;
    int forestValue836_15_0;
    int[] spill836_0;
    int spill836_1;
    boolean spill836_2;
    long life5_3;
    int life8_6;
    int[] life7_7;
    int life9_13;
    int life10_21;
    forest_join_61: {
    forest_join_59: {
    life5_3 = (moom.fG.f ^ 127187075539406L);
    spill836_0 = moom.fG.b__ArrayInt();
    life8_6 = 0;
    life7_7 = spill836_0;
    forest_cycle_8: while (true) {
    forest_join_55: {
    forestValue836_9_0 = life8_6;
    forest_cycle_9: while (true) {
    if (!((forestValue836_9_0 < this.d))) {
        break forest_join_61;
    }
    life9_13 = 0;
    forest_cycle_14: while (true) {
    forest_join_52: {
    forestValue836_15_0 = life9_13;
    forest_cycle_15: while (true) {
    if (!((forestValue836_15_0 < this.c))) {
        break forest_join_55;
    }
    spill836_1 = 0;
    if (!((life7_7 == null))) {
        forestValue836_9_0 = spill836_1;
        continue forest_cycle_9;
    }
    life10_21 = spill836_1;
    forest_cycle_22: while (true) {
    forest_join_49: {
    if (!((life10_21 < this.b))) {
        break forest_join_52;
    }
    spill836_2 = ((com.google.common.base.Predicate)((((this.a)[life10_21])[life9_13])[life8_6])).apply(((java.lang.Object)(((moom.fD)(((com.google.common.cache.LoadingCache)(p3)).getUnchecked(((java.lang.Object)(moom.fG.a(((moom.DT)(p0)), ((moom.bs)(p1)), ((moom.bs)(p2)), ((int)(life8_6)), ((int)(life9_13)), ((int)(life10_21)))))))))));
    if (!((life7_7 == null))) {
        forestValue836_15_0 = ((spill836_2) ? 1 : 0);
        continue forest_cycle_15;
    }
    if (!((!spill836_2))) {
        break forest_join_49;
    }
    break forest_join_59;
    }
    life10_21 += 1;
    if (!((life7_7 != null))) {
        continue forest_cycle_22;
    }
    break forest_cycle_22;
    }
    break forest_cycle_15;
    }
    }
    life9_13 += 1;
    if (!((life7_7 != null))) {
        continue forest_cycle_14;
    }
    break forest_cycle_14;
    }
    break forest_cycle_9;
    }
    }
    life8_6 += 1;
    if (!((life7_7 != null))) {
        continue forest_cycle_8;
    }
    break forest_cycle_8;
    }
    break forest_join_61;
    }
    return null;
    }
    return new moom.fH(p0, p1, p2, p3, this.d, this.c, this.b);
}


public moom.fH a(net.minecraft.world.World p0, moom.DT p1) {
int forestValue837_36_0;
    java.lang.Object forestValue837_39_0;
    int[] spill837_0;
    int spill837_1;
    moom.bs spill837_2;
    long life3_3;
    com.google.common.cache.LoadingCache life6_8;
    int[] life5_9;
    int life7_18;
    java.util.Iterator life8_33;
    moom.DT life9_40;
    moom.bs[] life10_42;
    int life11_45;
    int life12_47;
    moom.bs life13_54;
    moom.bs[] life14_56;
    int life15_59;
    int life16_63;
    moom.bs life17_70;
    moom.fH life18_90;
    forest_join_105: {
    forest_join_103: {
    life3_3 = (moom.fG.f ^ 136459466578266L);
    spill837_0 = moom.fG.b__ArrayInt();
    life6_8 = moom.fG.a(((net.minecraft.world.World)(p0)), ((boolean)(false)));
    life5_9 = spill837_0;
    life7_18 = java.lang.Math.max(((int)(java.lang.Math.max(((int)(this.d)), ((int)(this.c))))), ((int)(this.b)));
    life8_33 = ((java.lang.Iterable)(moom.DT.a(((moom.DT)(p1)), ((moom.DT)(((moom.DT)(p1)).a(((int)((life7_18 - 1))), ((int)((life7_18 - 1))), ((int)((life7_18 - 1))))))))).iterator();
    forest_cycle_34: while (true) {
    forest_join_100: {
    forestValue837_36_0 = ((((java.util.Iterator)(life8_33)).hasNext()) ? 1 : 0);
    forest_cycle_36: while (true) {
    if (!((forestValue837_36_0 != 0))) {
        break forest_join_105;
    }
    forestValue837_39_0 = ((java.util.Iterator)(life8_33)).next();
    forest_cycle_39: while (true) {
    life9_40 = ((moom.DT)(forestValue837_39_0));
    life10_42 = moom.bs.values();
    life11_45 = (life10_42).length;
    life12_47 = 0;
    forest_cycle_48: while (true) {
    forest_join_97: {
    if (!((life12_47 < life11_45))) {
        break forest_join_100;
    }
    life13_54 = (life10_42)[life12_47];
    life14_56 = moom.bs.values();
    life15_59 = (life14_56).length;
    spill837_1 = 0;
    if (!((life5_9 == null))) {
        forestValue837_36_0 = spill837_1;
        continue forest_cycle_36;
    }
    life16_63 = spill837_1;
    forest_cycle_64: while (true) {
    forest_join_95: {
    forest_join_94: {
    if (!((life16_63 < life15_59))) {
        break forest_join_97;
    }
    life17_70 = (life14_56)[life16_63];
    if (!((life5_9 == null))) {
        break forest_join_95;
    }
    spill837_2 = life17_70;
    if (!((life5_9 == null))) {
        forestValue837_39_0 = spill837_2;
        continue forest_cycle_39;
    }
    if (!((spill837_2 != life13_54))) {
        break forest_join_94;
    }
    if (!((life17_70 != ((moom.bs)(life13_54)).a__bs()))) {
        break forest_join_94;
    }
    life18_90 = ((moom.fG)(this)).a(((moom.DT)(life9_40)), ((moom.bs)(life13_54)), ((moom.bs)(life17_70)), ((com.google.common.cache.LoadingCache)(life6_8)));
    if (!((life5_9 == null))) {
        break forest_join_95;
    }
    if (!((life18_90 != null))) {
        break forest_join_94;
    }
    break forest_join_103;
    }
    life16_63 += 1;
    }
    if (!((life5_9 != null))) {
        continue forest_cycle_64;
    }
    break forest_cycle_64;
    }
    }
    life12_47 += 1;
    if (!((life5_9 != null))) {
        continue forest_cycle_48;
    }
    break forest_cycle_48;
    }
    break forest_cycle_39;
    }
    break forest_cycle_36;
    }
    }
    if (!((life5_9 != null))) {
        continue forest_cycle_34;
    }
    break forest_cycle_34;
    }
    break forest_join_105;
    }
    return life18_90;
    }
    return null;
}


public static com.google.common.cache.LoadingCache<moom.DT, moom.fD> a(net.minecraft.world.World p0, boolean p1) {
return ((com.google.common.cache.CacheBuilder)(com.google.common.cache.CacheBuilder.newBuilder())).build(((com.google.common.cache.CacheLoader)(new net.minecraft.block.state.pattern.BlockPattern$CacheLoader(p0, p1))));
}

}
