package moom;


public class DC<K, V> extends moom.DB<K, V> {

private final K e;

private V f;

private static final long g;

public DC(K p0) {
super();
    this.e = p0;
}


static {
moom.DC.g = (moom._c.a(4822222755886903885L, -7401490325146606999L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(10917304628946L);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public V a(int p0) {
java.lang.Object forwardValue1688_16_0;
    java.lang.Object forwardValue1688_18_0;
    boolean spill1688_0;
    java.lang.Object spill1688_1;
    long life2_3;
    java.lang.Object life5_8;
    int life4_9;
    forward_join_18: {
    forward_join_17: {
    forward_join_16: {
    life2_3 = (moom.DC.g ^ 85586322793210L);
    spill1688_0 = moom.DS.b__Boolean();
    life5_8 = super.a(((int)(p0)));
    life4_9 = ((spill1688_0) ? 1 : 0);
    spill1688_1 = life5_8;
    if (!((life4_9 == 0))) {
        forwardValue1688_16_0 = spill1688_1;
        break forward_join_16;
    }
    if (!((spill1688_1 == null))) {
        break forward_join_17;
    }
    forwardValue1688_16_0 = this.f;
    }
    forwardValue1688_18_0 = forwardValue1688_16_0;
    break forward_join_18;
    }
    forwardValue1688_18_0 = life5_8;
    }
    return ((V)(forwardValue1688_18_0));
}


public V a__Object(K p0) {
long local2 = (moom.DC.g ^ 92387554094807L);
    java.lang.Object local4 = super.a__Object((((K)((java.lang.Object)(p0)))));
    return ((local4 == null) ? this.f : ((V)(local4)));
}


public void a__sourceReturn_da8c82d5d4() {
org.apache.commons.lang3.Validate.notNull(((java.lang.Object)(this.e)));
    return;
}


public void a(int p0, K p1, V p2) {
moom.DC forwardValue1689_17_0;
    moom.DC spill1689_0;
    long life4_3;
    int life6_5;
    forward_join_17: {
    forward_join_16: {
    life4_3 = (moom.DC.g ^ 95737564118792L);
    life6_5 = ((moom.DS.b__Boolean()) ? 1 : 0);
    spill1689_0 = this;
    if (!((life6_5 == 0))) {
        forwardValue1689_17_0 = spill1689_0;
        break forward_join_17;
    }
    if (!(((java.lang.Object)(((moom.DC)(spill1689_0)).e)).equals(((java.lang.Object)(p1))))) {
        break forward_join_16;
    }
    this.f = (((V)((java.lang.Object)(p2))));
    }
    forwardValue1689_17_0 = this;
    }
    __sourceIntrinsic_10b87d475012_call1689_6(forwardValue1689_17_0, p0, p1, p2);
    return;
}


private static native <E extends Throwable> void __sourceIntrinsic_10b87d475012_call1689_6(moom.DC a0, int a1, java.lang.Object a2, java.lang.Object a3) throws E;
}
