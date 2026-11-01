package moom;


class c extends com.google.common.collect.AbstractIterator<moom.DT> {

private moom.DT a;

moom.CC b;

private static long c;

c(moom.CC p0) { super(); }


private static void __sourceConstructorBody_10889a50d15270c3(moom.c receiver, moom.CC p0) throws Throwable {

((moom.c)(receiver)).b = ((moom.CC)(p0));

    moom.c.__sourceConstructorInit_10889a50d15270c3_0(((moom.c)(receiver)));

    ((moom.c)(receiver)).a = ((moom.DT)(null));

    return;

}



static {
moom.c.c = (moom._c.a(8140783258444546028L, -6528260967883871107L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(102732124768088L);
}

private static native <E extends Throwable> void __sourceConstructorInit_10889a50d15270c3_0(moom.c a0) throws E;

private static moom.Oo a(moom.Oo p0) {
return p0;
}


protected moom.DT a() {
moom.DT forwardValue2995_21_0;
    int forwardValue2995_35_0;
    int forwardValue2995_60_0;
    int forwardValue2995_60_1;
    int forwardValue2995_78_0;
    int forwardValue2995_78_1;
    int forwardValue2995_88_0;
    moom.DT spill2995_0;
    boolean spill2995_1;
    int spill2995_2;
    int spill2995_3;
    int spill2995_4;
    long life1_3;
    int life3_5;
    int life4_45;
    int life5_49;
    int life6_53;
    forward_join_90: {
    forward_join_88: {
    forward_join_78: {
    forward_join_71: {
    forward_join_60: {
    forward_join_55: {
    forward_join_35: {
    forward_join_32: {
    forward_join_21: {
    forward_join_19: {
    life1_3 = (moom.c.c ^ 3335420643344L);
    life3_5 = ((moom.DS.c__Boolean()) ? 1 : 0);
    spill2995_0 = this.a;
    if (!((life3_5 != 0))) {
        forwardValue2995_21_0 = spill2995_0;
        break forward_join_21;
    }
    if (!((spill2995_0 == null))) {
        break forward_join_19;
    }
    this.a = ((moom.DT)(((moom.CC)(this.b)).a));
    return this.a;
    }
    forwardValue2995_21_0 = this.a;
    }
    spill2995_1 = ((moom.DT)(forwardValue2995_21_0)).equals(((java.lang.Object)(((moom.CC)(this.b)).b)));
    if (!((life3_5 != 0))) {
        forwardValue2995_35_0 = ((spill2995_1) ? 1 : 0);
        break forward_join_35;
    }
    if (!(spill2995_1)) {
        break forward_join_32;
    }
    return ((moom.DT)(((moom.c)(this)).endOfData()));
    }
    forwardValue2995_35_0 = ((moom.DT)(this.a)).a();
    }
    life4_45 = forwardValue2995_35_0;
    life5_49 = ((moom.DT)(this.a)).b();
    life6_53 = ((moom.DT)(this.a)).c();
    spill2995_2 = life4_45;
    spill2995_3 = ((moom.DT)(((moom.CC)(this.b)).b)).a();
    if (!((life3_5 != 0))) {
        forwardValue2995_60_0 = spill2995_2;
        forwardValue2995_60_1 = spill2995_3;
        break forward_join_60;
    }
    if (!((spill2995_2 < spill2995_3))) {
        break forward_join_55;
    }
    life4_45 += 1;
    if (!((life3_5 == 0))) {
        break forward_join_90;
    }
    }
    forwardValue2995_60_0 = life5_49;
    forwardValue2995_60_1 = ((moom.DT)(((moom.CC)(this.b)).b)).b();
    }
    if (!((life3_5 != 0))) {
        forwardValue2995_78_0 = forwardValue2995_60_0;
        forwardValue2995_78_1 = forwardValue2995_60_1;
        break forward_join_78;
    }
    if (!((forwardValue2995_60_0 < forwardValue2995_60_1))) {
        break forward_join_71;
    }
    life4_45 = ((moom.DT)(((moom.CC)(this.b)).a)).a();
    life5_49 += 1;
    if (!((life3_5 == 0))) {
        break forward_join_90;
    }
    }
    spill2995_4 = life6_53;
    if (!((life3_5 != 0))) {
        forwardValue2995_88_0 = spill2995_4;
        break forward_join_88;
    }
    forwardValue2995_78_0 = spill2995_4;
    forwardValue2995_78_1 = ((moom.DT)(((moom.CC)(this.b)).b)).c();
    }
    if (!((forwardValue2995_78_0 < forwardValue2995_78_1))) {
        break forward_join_90;
    }
    life4_45 = ((moom.DT)(((moom.CC)(this.b)).a)).a();
    forwardValue2995_88_0 = ((moom.DT)(((moom.CC)(this.b)).a)).b();
    }
    life5_49 = forwardValue2995_88_0;
    life6_53 += 1;
    }
    this.a = ((moom.DT)(new moom.DT(life4_45, life5_49, life6_53)));
    return this.a;
}


protected java.lang.Object computeNext__sourceBridge_0502b11602() {
return ((moom.c)(this)).a();
}

public moom.DT computeNext() { return ((moom.DT)(this.computeNext__sourceBridge_0502b11602())); }
}
