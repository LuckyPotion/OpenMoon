package moom;


public class IQ implements java.lang.Comparable<moom.IQ> {

private final java.lang.String a;

private final java.lang.String b;

private final long c;

private final long d;

private final boolean e;

private final net.minecraft.world.WorldSettings$GameType f;

private final boolean g;

private final boolean h;

private static final long i;

public IQ(java.lang.String p0, java.lang.String p1, long p2, long p3, net.minecraft.world.WorldSettings$GameType p4, boolean p5, boolean p6, boolean p7) {
super();
    this.a = p0;
    this.b = p1;
    this.c = p2;
    this.d = p3;
    this.f = p4;
    this.e = p5;
    this.g = p6;
    this.h = p7;
}


static {
moom.IQ.i = (moom._c.a(637670469176322869L, -2308006917955552807L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(236422121511334L);
}


public int compareTo__sourceBridge_e47da4afb6(java.lang.Object p0) {
return ((moom.IQ)(this)).a(((moom.IQ)(((moom.IQ)(p0)))));
}


public boolean b__Boolean() {
return ((((this.g) ? 1 : 0)) != 0);
}


public long b() {
return this.c;
}


public java.lang.String b__String() {
return this.b;
}


public boolean c() {
return ((((this.h) ? 1 : 0)) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public java.lang.String a__String() {
return this.a;
}


public long a() {
return this.d;
}


public boolean a__Boolean() {
return ((((this.e) ? 1 : 0)) != 0);
}


public int a(moom.IQ p0) {
int forwardValue2197_23_0;
    moom.IQ forwardValue2197_27_0;
    int forwardValue2197_31_0;
    int spill2197_0;
    moom.IQ spill2197_1;
    long life2_3;
    java.lang.String life4_5;
    forward_join_31: {
    forward_join_27: {
    forward_join_26: {
    forward_join_23: {
    forward_join_16: {
    life2_3 = (moom.IQ.i ^ 104376071941700L);
    life4_5 = net.minecraft.world.storage.WorldInfo.c__String();
    spill2197_0 = recovery.source.CarrierOps.lcmp(((long)(this.c)), ((long)(((moom.IQ)(p0)).c)));
    if (!((life4_5 != null))) {
        forwardValue2197_23_0 = spill2197_0;
        break forward_join_23;
    }
    if (!((spill2197_0 < 0))) {
        break forward_join_16;
    }
    forwardValue2197_31_0 = 1;
    break forward_join_31;
    }
    spill2197_1 = this;
    if (!((life4_5 != null))) {
        forwardValue2197_27_0 = spill2197_1;
        break forward_join_27;
    }
    forwardValue2197_23_0 = recovery.source.CarrierOps.lcmp(((long)(((moom.IQ)(spill2197_1)).c)), ((long)(((moom.IQ)(p0)).c)));
    }
    if (!((forwardValue2197_23_0 > 0))) {
        break forward_join_26;
    }
    forwardValue2197_31_0 = -1;
    break forward_join_31;
    }
    forwardValue2197_27_0 = this;
    }
    forwardValue2197_31_0 = ((java.lang.String)(((moom.IQ)(forwardValue2197_27_0)).a)).compareTo(((java.lang.String)(((moom.IQ)(p0)).a)));
    }
    return forwardValue2197_31_0;
}


public net.minecraft.world.WorldSettings$GameType a__bE() {
return this.f;
}


public int compareTo(moom.IQ __bridgeParam0) { return this.compareTo__sourceBridge_e47da4afb6(((java.lang.Object)(__bridgeParam0))); }
}
