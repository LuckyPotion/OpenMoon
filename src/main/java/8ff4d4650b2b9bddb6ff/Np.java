package moom;


public class Np implements moom.Lx {

private final moom.bY a;

private final int b;

private final int c;

private static final long d;

public Np(moom.bY p0, int p1, int p2) {
super();
    this.a = p0;
    this.b = p1;
    this.c = p2;
}


public Np(moom.bY p0, int p1) {
this(p0, p1, 0);
}


public Np(moom.bY p0) {
this(p0, 0, 0);
}


static {
d = (moom._c.a(7713522313047143880L, 6571649367335872309L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(269502423145998L);
}


public java.lang.String toString() {
java.lang.String[] forwardValue2864_21_0;
    moom.bY forwardValue2864_34_0;
    java.lang.String forwardValue2864_47_0;
    java.lang.String[] spill2864_0;
    moom.bY spill2864_1;
    long life1_3;
    java.lang.String life3_5;
    forward_join_47: {
    forward_join_34: {
    forward_join_32: {
    forward_join_21: {
    forward_join_16: {
    life1_3 = (moom.Np.d ^ 91005692978785L);
    life3_5 = moom.Nq.b__String();
    spill2864_0 = ((moom.bY)(this.a)).a__ArrayString();
    if (!((life3_5 != null))) {
        forwardValue2864_21_0 = spill2864_0;
        break forward_join_21;
    }
    if (!((spill2864_0 == null))) {
        break forward_join_16;
    }
    forwardValue2864_47_0 = __sourceIntrinsic_a86c261fcdee_invokedynamic2864_5(this.a);
    break forward_join_47;
    }
    spill2864_1 = this.a;
    if (!((life3_5 != null))) {
        forwardValue2864_34_0 = spill2864_1;
        break forward_join_34;
    }
    forwardValue2864_21_0 = ((moom.bY)(spill2864_1)).b();
    }
    if (!((forwardValue2864_21_0 == null))) {
        break forward_join_32;
    }
    forwardValue2864_47_0 = __sourceIntrinsic_a86c261fcdee_invokedynamic2864_12(this.a, (((moom.bY)(this.a)).a__ArrayString())[this.b]);
    break forward_join_47;
    }
    forwardValue2864_34_0 = this.a;
    }
    forwardValue2864_47_0 = __sourceIntrinsic_a86c261fcdee_invokedynamic2864_20(forwardValue2864_34_0, (((moom.bY)(this.a)).a__ArrayString())[this.b], (((moom.bY)(this.a)).b())[this.c]);
    }
    return forwardValue2864_47_0;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public moom.bS a__bS() {
return moom.bS.FLOAT;
}


public float a() {
return ((moom.bY)(this.a)).a(((int)(this.b)), ((int)(this.c)));
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_invokedynamic2864_5(moom.bY a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_invokedynamic2864_12(moom.bY a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_invokedynamic2864_20(moom.bY a0, java.lang.String a1, java.lang.String a2) throws E;
}
