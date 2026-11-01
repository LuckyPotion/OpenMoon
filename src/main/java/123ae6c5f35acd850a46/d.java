package moom;


class d extends com.google.common.collect.AbstractIterator<moom.DU> {

private moom.DU a;

moom.CD b;

private static long c;

d(moom.CD p0) { super(); }


private static void __sourceConstructorBody_6eeb2b644fba2efe(moom.d receiver, moom.CD p0) throws Throwable {

((moom.d)(receiver)).b = ((moom.CD)(p0));

    moom.d.__sourceConstructorInit_6eeb2b644fba2efe_0(((moom.d)(receiver)));

    ((moom.d)(receiver)).a = ((moom.DU)(null));

    return;

}



static {
moom.d.c = (moom._c.a(8796963911856163057L, 5286948846429309989L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(83302309929451L);
}

private static native <E extends Throwable> void __sourceConstructorInit_6eeb2b644fba2efe_0(moom.d a0) throws E;

private static moom.Oo a(moom.Oo p0) {
return p0;
}


protected moom.DU a() {
moom.DU forwardValue3177_33_0;
    int forwardValue3177_47_0;
    int forwardValue3177_72_0;
    int forwardValue3177_72_1;
    int forwardValue3177_90_0;
    int forwardValue3177_90_1;
    int forwardValue3177_100_0;
    moom.DU spill3177_0;
    boolean spill3177_1;
    int spill3177_2;
    int spill3177_3;
    int spill3177_4;
    long life1_3;
    int life3_5;
    int life4_57;
    int life5_61;
    int life6_65;
    forward_join_102: {
    forward_join_100: {
    forward_join_90: {
    forward_join_83: {
    forward_join_72: {
    forward_join_67: {
    forward_join_47: {
    forward_join_44: {
    forward_join_33: {
    forward_join_31: {
    life1_3 = (moom.d.c ^ 118841612784280L);
    life3_5 = ((moom.DS.b__Boolean()) ? 1 : 0);
    spill3177_0 = this.a;
    if (!((life3_5 == 0))) {
        forwardValue3177_33_0 = spill3177_0;
        break forward_join_33;
    }
    if (!((spill3177_0 == null))) {
        break forward_join_31;
    }
    this.a = ((moom.DU)(new moom.DU(__sourceExactCall_6ff3573bd2c314(((moom.DT)(((moom.CD)(this.b)).a))), __sourceExactCall_83272ff1cb0754(((moom.DT)(((moom.CD)(this.b)).a))), __sourceExactCall_afc91ab87d51f9(((moom.DT)(((moom.CD)(this.b)).a))))));
    return this.a;
    }
    forwardValue3177_33_0 = this.a;
    }
    spill3177_1 = ((moom.DU)(forwardValue3177_33_0)).equals(((java.lang.Object)(((moom.CD)(this.b)).b)));
    if (!((life3_5 == 0))) {
        forwardValue3177_47_0 = ((spill3177_1) ? 1 : 0);
        break forward_join_47;
    }
    if (!(spill3177_1)) {
        break forward_join_44;
    }
    return ((moom.DU)(((moom.d)(this)).endOfData()));
    }
    forwardValue3177_47_0 = __sourceExactCall_d89e3014d8adbb(((moom.DU)(this.a)));
    }
    life4_57 = forwardValue3177_47_0;
    life5_61 = __sourceExactCall_092a04e8233d04(((moom.DU)(this.a)));
    life6_65 = __sourceExactCall_55280847ec2b03(((moom.DU)(this.a)));
    spill3177_2 = life4_57;
    spill3177_3 = __sourceExactCall_6ff3573bd2c314(((moom.DT)(((moom.CD)(this.b)).b)));
    if (!((life3_5 == 0))) {
        forwardValue3177_72_0 = spill3177_2;
        forwardValue3177_72_1 = spill3177_3;
        break forward_join_72;
    }
    if (!((spill3177_2 < spill3177_3))) {
        break forward_join_67;
    }
    life4_57 += 1;
    if (!((life3_5 != 0))) {
        break forward_join_102;
    }
    }
    forwardValue3177_72_0 = life5_61;
    forwardValue3177_72_1 = __sourceExactCall_83272ff1cb0754(((moom.DT)(((moom.CD)(this.b)).b)));
    }
    if (!((life3_5 == 0))) {
        forwardValue3177_90_0 = forwardValue3177_72_0;
        forwardValue3177_90_1 = forwardValue3177_72_1;
        break forward_join_90;
    }
    if (!((forwardValue3177_72_0 < forwardValue3177_72_1))) {
        break forward_join_83;
    }
    life4_57 = __sourceExactCall_6ff3573bd2c314(((moom.DT)(((moom.CD)(this.b)).a)));
    life5_61 += 1;
    if (!((life3_5 != 0))) {
        break forward_join_102;
    }
    }
    spill3177_4 = life6_65;
    if (!((life3_5 == 0))) {
        forwardValue3177_100_0 = spill3177_4;
        break forward_join_100;
    }
    forwardValue3177_90_0 = spill3177_4;
    forwardValue3177_90_1 = __sourceExactCall_afc91ab87d51f9(((moom.DT)(((moom.CD)(this.b)).b)));
    }
    if (!((forwardValue3177_90_0 < forwardValue3177_90_1))) {
        break forward_join_102;
    }
    life4_57 = __sourceExactCall_6ff3573bd2c314(((moom.DT)(((moom.CD)(this.b)).a)));
    forwardValue3177_100_0 = __sourceExactCall_83272ff1cb0754(((moom.DT)(((moom.CD)(this.b)).a)));
    }
    life5_61 = forwardValue3177_100_0;
    life6_65 += 1;
    }
    ((moom.DU)(this.a)).p = ((int)(life4_57));
    ((moom.DU)(this.a)).q = ((int)(life5_61));
    ((moom.DU)(this.a)).r = ((int)(life6_65));
    return this.a;
}


protected java.lang.Object computeNext__sourceBridge_0502b11602() {
return ((moom.d)(this)).a();
}

public moom.DU computeNext() { return ((moom.DU)(this.computeNext__sourceBridge_0502b11602())); }

private static native int __sourceExactCall_6ff3573bd2c314(moom.DT p0);
private static native int __sourceExactCall_83272ff1cb0754(moom.DT p0);
private static native int __sourceExactCall_afc91ab87d51f9(moom.DT p0);
private static native int __sourceExactCall_d89e3014d8adbb(moom.DU p0);
private static native int __sourceExactCall_092a04e8233d04(moom.DU p0);
private static native int __sourceExactCall_55280847ec2b03(moom.DU p0);
}
