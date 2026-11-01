package moom;


class De<V> {

final int a;

V b;

moom.De<V> c;

final int d;

private static final long e;

De(int p0, int p1, V p2, moom.De<V> p3) {
super();
    this.b = p2;
    this.c = p3;
    this.a = p1;
    this.d = p0;
}


static {
e = (moom._c.a(-1872156021770523564L, 1448233452389122272L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(13955423945754L);
}


public final boolean equals(java.lang.Object p0) {
int forwardValue1711_39_0;
    int spill1711_0;
    boolean spill1711_1;
    long life2_3;
    int life4_5;
    moom.De life5_16;
    java.lang.Integer life6_20;
    java.lang.Integer life7_24;
    java.lang.Object life8_36;
    java.lang.Object life9_39;
    forward_join_39: {
    forward_join_38: {
    life2_3 = (moom.De.e ^ 57183966639603L);
    life4_5 = ((moom.DS.b__Boolean()) ? 1 : 0);
    spill1711_0 = ((p0 instanceof moom.De) ? 1 : 0);
    if (!((life4_5 == 0))) {
        forwardValue1711_39_0 = spill1711_0;
        break forward_join_39;
    }
    if (!((spill1711_0 != 0))) {
        break forward_join_38;
    }
    life5_16 = ((moom.De)(p0));
    life6_20 = java.lang.Integer.valueOf(((int)(this.a())));
    life7_24 = java.lang.Integer.valueOf(((int)(((moom.De)(life5_16)).a())));
    spill1711_1 = java.util.Objects.equals(((java.lang.Object)(life6_20)), ((java.lang.Object)(life7_24)));
    if (!((life4_5 == 0))) {
        forwardValue1711_39_0 = ((spill1711_1) ? 1 : 0);
        break forward_join_39;
    }
    if (!(spill1711_1)) {
        break forward_join_38;
    }
    life8_36 = ((moom.De)(this)).a__Object();
    life9_39 = ((moom.De)(life5_16)).a__Object();
    return java.util.Objects.equals(((java.lang.Object)(life8_36)), ((java.lang.Object)(life9_39)));
    }
    forwardValue1711_39_0 = 0;
    }
    return ((forwardValue1711_39_0) != 0);
}


public final java.lang.String toString() {
return __sourceIntrinsic_a86c261fcdee_originalDynamicSite1109_2(this.a(), ((moom.De)(this)).a__Object());
}


public final int hashCode() {
return __sourceExactCall_265f4047ca3d4f(((int)(this.a)));
}


public final V a__Object() {
return this.b;
}


public final int a() {
return this.a;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite1109_2(int a0, java.lang.Object a1) throws E;

private static native int __sourceExactCall_265f4047ca3d4f(int p0);
}
