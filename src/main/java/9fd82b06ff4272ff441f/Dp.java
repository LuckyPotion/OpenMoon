package moom;


class Dp<V> {

final long a;

V b;

moom.Dp<V> c;

final int d;

private static final long e;

Dp(int p0, long p1, V p2, moom.Dp<V> p3) {
super();
    this.b = p2;
    this.c = p3;
    this.a = p1;
    this.d = p0;
}


static {
e = (moom._c.a(-6755851588809516087L, 7436718402877576224L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(105204351902435L);
}


public final boolean equals(java.lang.Object p0) {
int forwardValue1748_39_0;
    int spill1748_0;
    boolean spill1748_1;
    long life2_3;
    int life4_5;
    moom.Dp life5_16;
    java.lang.Long life6_20;
    java.lang.Long life7_24;
    java.lang.Object life8_36;
    java.lang.Object life9_39;
    forward_join_39: {
    forward_join_38: {
    life2_3 = (moom.Dp.e ^ 27044189601303L);
    life4_5 = ((moom.DS.c__Boolean()) ? 1 : 0);
    spill1748_0 = ((p0 instanceof moom.Dp) ? 1 : 0);
    if (!((life4_5 != 0))) {
        forwardValue1748_39_0 = spill1748_0;
        break forward_join_39;
    }
    if (!((spill1748_0 != 0))) {
        break forward_join_38;
    }
    life5_16 = ((moom.Dp)(p0));
    life6_20 = java.lang.Long.valueOf(((long)(this.a())));
    life7_24 = java.lang.Long.valueOf(((long)(((moom.Dp)(life5_16)).a())));
    spill1748_1 = java.util.Objects.equals(((java.lang.Object)(life6_20)), ((java.lang.Object)(life7_24)));
    if (!((life4_5 != 0))) {
        forwardValue1748_39_0 = ((spill1748_1) ? 1 : 0);
        break forward_join_39;
    }
    if (!(spill1748_1)) {
        break forward_join_38;
    }
    life8_36 = ((moom.Dp)(this)).a__Object();
    life9_39 = ((moom.Dp)(life5_16)).a__Object();
    return java.util.Objects.equals(((java.lang.Object)(life8_36)), ((java.lang.Object)(life9_39)));
    }
    forwardValue1748_39_0 = 0;
    }
    return ((forwardValue1748_39_0) != 0);
}


public final java.lang.String toString() {
return __sourceIntrinsic_a86c261fcdee_originalDynamicSite1112_2(this.a(), ((moom.Dp)(this)).a__Object());
}


public final int hashCode() {
return __sourceExactCall_c00653f984226d(((long)(this.a)));
}


public final V a__Object() {
return this.b;
}


public final long a() {
return this.a;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite1112_2(long a0, java.lang.Object a1) throws E;

private static native int __sourceExactCall_c00653f984226d(long p0);
}
