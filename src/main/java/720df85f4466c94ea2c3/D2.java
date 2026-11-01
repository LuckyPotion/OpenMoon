package moom;


class D2 extends moom.D1 implements java.lang.Comparable<moom.D2> {

protected final net.minecraft.client.resources.model.IBakedModel c;

private static final long d;

public D2(net.minecraft.client.resources.model.IBakedModel p0, int p1) {
super(p1);
    this.c = p0;
}


static {
moom.D2.d = (moom._c.a(7713954827630704333L, -4548608312192279487L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(86150031261439L);
}


public java.lang.String toString() {
return __sourceIntrinsic_a86c261fcdee_originalDynamicSite1100_2(this.a, this.c);
}


public int compareTo__sourceBridge_e47da4afb6(java.lang.Object p0) {
return ((moom.D2)(this)).a(((moom.D2)(((moom.D2)(p0)))));
}


public int a(moom.D2 p0) {
return ((com.google.common.collect.ComparisonChain)(((com.google.common.collect.ComparisonChain)(((com.google.common.collect.ComparisonChain)(com.google.common.collect.ComparisonChain.start())).compare(((int)(((moom.D2)(p0)).a)), ((int)(this.a))))).compare(((int)(((moom.D2)(this)).a())), ((int)(((moom.D2)(p0)).a()))))).result();
}


protected int a() {
int lexicalValue551_39_0;
    int spill551_0;
    int spill551_1;
    long life1_3;
    int life4_8;
    moom.bs[] life5_10;
    int life6_14;
    int life7_16;
    int life3_17;
    moom.bs life8_24;
    lexical_join_39: {
    lexical_join_38: {
    life1_3 = (moom.D2.d ^ 113344376480816L);
    life4_8 = ((java.util.List)(((net.minecraft.client.resources.model.IBakedModel)(this.c)).a())).size();
    life5_10 = moom.bs.values();
    spill551_0 = __sourceExactCall_5c5d6a17b3677f();
    life6_14 = (life5_10).length;
    life7_16 = 0;
    life3_17 = spill551_0;
    lexical_cycle_18: while (true) {
    if (!((life7_16 < life6_14))) {
        break lexical_join_38;
    }
    life8_24 = (life5_10)[life7_16];
    spill551_1 = (life4_8 + ((java.util.List)(((net.minecraft.client.resources.model.IBakedModel)(this.c)).a(((moom.bs)(life8_24))))).size());
    if (!((life3_17 == 0))) {
        lexicalValue551_39_0 = spill551_1;
        break lexical_join_39;
    }
    life4_8 = spill551_1;
    life7_16 += 1;
    if (!((life3_17 != 0))) { continue lexical_cycle_18; }
    break lexical_cycle_18;
    }
    }
    lexicalValue551_39_0 = life4_8;
    }
    return lexicalValue551_39_0;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite1100_2(int a0, net.minecraft.client.resources.model.IBakedModel a1) throws E;

public int compareTo(moom.D2 __bridgeParam0) { return this.compareTo__sourceBridge_e47da4afb6(((java.lang.Object)(__bridgeParam0))); }

private static native int __sourceExactCall_5c5d6a17b3677f();
}
