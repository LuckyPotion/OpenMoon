package moom;


public class Kf {

private final int a;

private int[] b;

private static final long c;

public Kf(int p0, int[] p1) {
super();
    this.a = p0;
    this.b = p1;
}


public Kf(int p0, int p1) {
this(p0, new int[] {p1});
    return;
}


public Kf(int p0) {
this(p0, null);
}


static {
moom.Kf.c = (moom._c.a(8869119921718893664L, -4710402472493344720L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(168614219983929L);
}


public java.lang.String toString() {
moom.Kf forwardValue2507_16_0;
    java.lang.String forwardValue2507_21_0;
    moom.Kf spill2507_0;
    long life1_3;
    int life3_5;
    forward_join_21: {
    forward_join_16: {
    forward_join_15: {
    life1_3 = (moom.Kf.c ^ 72112019015475L);
    life3_5 = moom.J_.b();
    spill2507_0 = this;
    if (!((life3_5 == 0))) {
        forwardValue2507_16_0 = spill2507_0;
        break forward_join_16;
    }
    if (!((((moom.Kf)(spill2507_0)).b == null))) {
        break forward_join_15;
    }
    forwardValue2507_21_0 = __sourceIntrinsic_a86c261fcdee_invokedynamic2507_4(this.a);
    break forward_join_21;
    }
    forwardValue2507_16_0 = this;
    }
    forwardValue2507_21_0 = __sourceIntrinsic_a86c261fcdee_invokedynamic2507_8(((moom.Kf)(forwardValue2507_16_0)).a, moom.BU.a(((int[])(this.b))));
    }
    return forwardValue2507_21_0;
}


public boolean b(int p0) {
moom.Kf forwardValue2506_22_0;
    int forwardValue2506_36_0;
    moom.Kf spill2506_0;
    boolean spill2506_1;
    long life2_3;
    int life4_5;
    forward_join_36: {
    forward_join_29: {
    forward_join_22: {
    forward_join_21: {
    life2_3 = (moom.Kf.c ^ 107708535153622L);
    life4_5 = moom.J_.b();
    spill2506_0 = this;
    if (!((life4_5 == 0))) {
        forwardValue2506_22_0 = spill2506_0;
        break forward_join_22;
    }
    if (!((((moom.Kf)(spill2506_0)).b == null))) {
        break forward_join_21;
    }
    this.b = ((int[])(new int[] {p0}));
    return ((1) != 0);
    }
    forwardValue2506_22_0 = this;
    }
    spill2506_1 = ((moom.Kf)(forwardValue2506_22_0)).a(((int)(p0)));
    if (!((life4_5 == 0))) {
        forwardValue2506_36_0 = ((spill2506_1) ? 1 : 0);
        break forward_join_36;
    }
    if (!(spill2506_1)) {
        break forward_join_29;
    }
    return ((0) != 0);
    }
    this.b = ((int[])(moom.BU.a(((int[])(this.b)), ((int)(p0)))));
    forwardValue2506_36_0 = 1;
    }
    return ((forwardValue2506_36_0) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public boolean a(int p0, int p1) {
moom.Kf forwardValue2505_13_0;
    int forwardValue2505_23_0;
    int forwardValue2505_25_0;
    moom.Kf spill2505_0;
    boolean spill2505_1;
    long life3_3;
    int life5_5;
    forward_join_25: {
    forward_join_24: {
    forward_join_23: {
    forward_join_22: {
    forward_join_13: {
    life3_3 = (moom.Kf.c ^ 78065956360816L);
    life5_5 = moom.J_.c();
    spill2505_0 = this;
    if (!((life5_5 != 0))) {
        forwardValue2505_13_0 = spill2505_0;
        break forward_join_13;
    }
    if (!((((moom.Kf)(spill2505_0)).a == p0))) {
        break forward_join_24;
    }
    forwardValue2505_13_0 = this;
    }
    if (!((((moom.Kf)(forwardValue2505_13_0)).b != null))) {
        break forward_join_22;
    }
    spill2505_1 = moom.BU.a(((int)(p1)), ((int[])(this.b)));
    if (!((life5_5 != 0))) {
        forwardValue2505_23_0 = ((spill2505_1) ? 1 : 0);
        break forward_join_23;
    }
    if (!(spill2505_1)) {
        break forward_join_24;
    }
    }
    forwardValue2505_23_0 = 1;
    }
    forwardValue2505_25_0 = forwardValue2505_23_0;
    break forward_join_25;
    }
    forwardValue2505_25_0 = 0;
    }
    return ((forwardValue2505_25_0) != 0);
}


private boolean a(int p0) {
int forwardValue2504_17_0;
    int forwardValue2504_19_0;
    boolean spill2504_0;
    long life2_3;
    int life4_5;
    forward_join_19: {
    forward_join_18: {
    forward_join_17: {
    life2_3 = (moom.Kf.c ^ 16826564754121L);
    life4_5 = moom.J_.c();
    if (!((this.b != null))) {
        break forward_join_18;
    }
    spill2504_0 = moom.BU.a(((int)(p0)), ((int[])(this.b)));
    if (!((life4_5 != 0))) {
        forwardValue2504_17_0 = ((spill2504_0) ? 1 : 0);
        break forward_join_17;
    }
    if (!(spill2504_0)) {
        break forward_join_18;
    }
    forwardValue2504_17_0 = 1;
    }
    forwardValue2504_19_0 = forwardValue2504_17_0;
    break forward_join_19;
    }
    forwardValue2504_19_0 = 0;
    }
    return ((forwardValue2504_19_0) != 0);
}


public int[] a__ArrayInt() {
return this.b;
}


public int a() {
return this.a;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_invokedynamic2507_4(int a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_invokedynamic2507_8(int a0, java.lang.String a1) throws E;
}
