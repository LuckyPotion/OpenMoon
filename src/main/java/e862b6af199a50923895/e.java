package moom;


class e extends com.google.common.collect.AbstractIterator {

private moom.DX a;

moom.I_ b;

private static long c;

e(moom.I_ p0) { super(); }


private static void __sourceConstructorBody_49d6627b6255ea97(moom.e receiver, moom.I_ p0) throws Throwable {

((moom.e)(receiver)).b = ((moom.I_)(p0));

    moom.e.__sourceConstructorInit_49d6627b6255ea97_0(((moom.e)(receiver)));

    ((moom.e)(receiver)).a = ((moom.DX)(null));

    return;

}



static {
moom.e.c = (moom._c.a(785782592980307629L, 3620928467940200093L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(19016810897952L);
}

private static native <E extends Throwable> void __sourceConstructorInit_49d6627b6255ea97_0(moom.e a0) throws E;

private static moom.Oo a(moom.Oo p0) {
return p0;
}


private moom.DX a() {
moom.DX forwardValue3366_34_0;
    int forwardValue3366_48_0;
    int forwardValue3366_73_0;
    int forwardValue3366_73_1;
    int forwardValue3366_91_0;
    int forwardValue3366_91_1;
    int forwardValue3366_101_0;
    moom.DX spill3366_0;
    boolean spill3366_1;
    int spill3366_2;
    int spill3366_3;
    int spill3366_4;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    int life4_58;
    int life5_62;
    int life6_66;
    forward_join_103: {
    forward_join_101: {
    forward_join_91: {
    forward_join_84: {
    forward_join_73: {
    forward_join_68: {
    forward_join_48: {
    forward_join_45: {
    forward_join_34: {
    forward_join_32: {
    life1_3 = (moom.e.c ^ 103297226973605L);
    life3_5 = moom.JM.b__Arrayr3();
    spill3366_0 = this.a;
    if (!((life3_5 != null))) {
        forwardValue3366_34_0 = spill3366_0;
        break forward_join_34;
    }
    if (!((spill3366_0 == null))) {
        break forward_join_32;
    }
    this.a = ((moom.DX)(new moom.DX(((moom.DT)(((moom.I_)(this.b)).a)).a(), ((moom.DT)(((moom.I_)(this.b)).a)).b(), ((moom.DT)(((moom.I_)(this.b)).a)).c(), 3)));
    return this.a;
    }
    forwardValue3366_34_0 = this.a;
    }
    spill3366_1 = ((moom.DX)(forwardValue3366_34_0)).equals(((java.lang.Object)(((moom.I_)(this.b)).b)));
    if (!((life3_5 != null))) {
        forwardValue3366_48_0 = ((spill3366_1) ? 1 : 0);
        break forward_join_48;
    }
    if (!(spill3366_1)) {
        break forward_join_45;
    }
    return ((moom.DX)(((moom.e)(this)).endOfData()));
    }
    forwardValue3366_48_0 = ((moom.DX)(this.a)).a();
    }
    life4_58 = forwardValue3366_48_0;
    life5_62 = ((moom.DX)(this.a)).b();
    life6_66 = ((moom.DX)(this.a)).c();
    spill3366_2 = life4_58;
    spill3366_3 = ((moom.DT)(((moom.I_)(this.b)).b)).a();
    if (!((life3_5 != null))) {
        forwardValue3366_73_0 = spill3366_2;
        forwardValue3366_73_1 = spill3366_3;
        break forward_join_73;
    }
    if (!((spill3366_2 < spill3366_3))) {
        break forward_join_68;
    }
    life4_58 += 1;
    if (!((life3_5 == null))) {
        break forward_join_103;
    }
    }
    forwardValue3366_73_0 = life5_62;
    forwardValue3366_73_1 = ((moom.DT)(((moom.I_)(this.b)).b)).b();
    }
    if (!((life3_5 != null))) {
        forwardValue3366_91_0 = forwardValue3366_73_0;
        forwardValue3366_91_1 = forwardValue3366_73_1;
        break forward_join_91;
    }
    if (!((forwardValue3366_73_0 < forwardValue3366_73_1))) {
        break forward_join_84;
    }
    life4_58 = ((moom.DT)(((moom.I_)(this.b)).a)).a();
    life5_62 += 1;
    if (!((life3_5 == null))) {
        break forward_join_103;
    }
    }
    spill3366_4 = life6_66;
    if (!((life3_5 != null))) {
        forwardValue3366_101_0 = spill3366_4;
        break forward_join_101;
    }
    forwardValue3366_91_0 = spill3366_4;
    forwardValue3366_91_1 = ((moom.DT)(((moom.I_)(this.b)).b)).c();
    }
    if (!((forwardValue3366_91_0 < forwardValue3366_91_1))) {
        break forward_join_103;
    }
    life4_58 = ((moom.DT)(((moom.I_)(this.b)).a)).a();
    forwardValue3366_101_0 = ((moom.DT)(((moom.I_)(this.b)).a)).b();
    }
    life5_62 = forwardValue3366_101_0;
    life6_66 += 1;
    }
    ((moom.DX)(this.a)).a__Void(((int)(life4_58)), ((int)(life5_62)), ((int)(life6_66)));
    return this.a;
}


protected java.lang.Object computeNext() {
return ((moom.e)(this)).a();
}

}
