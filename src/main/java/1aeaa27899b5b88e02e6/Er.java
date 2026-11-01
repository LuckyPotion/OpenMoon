package moom;


public class Er implements java.lang.Comparable<moom.Er> {

private static long a;

private final net.minecraft.block.Block b;

public final moom.DT c;

public long d;

public int e;

private final long f;

private static final long g;

public Er(moom.DT p0, net.minecraft.block.Block p1) {
super();
    moom.Er __sourceSpill482_2 = this;
    long __stackOp482_3_0 = moom.Er.a;
    long __sourceSpill482_5 = __stackOp482_3_0;
    a = ((long)((__stackOp482_3_0 + 1L)));
    ((moom.Er)(__sourceSpill482_2)).f = ((long)(__sourceSpill482_5));
    this.c = ((moom.DT)(p0));
    this.b = ((net.minecraft.block.Block)(p1));
    return;
}


static {
moom.Er.g = (moom._c.a(-7578758075899218836L, -7460323934014483111L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(164077722733808L);
}


public boolean equals(java.lang.Object p0) {
int forwardValue1844_17_0;
    int forwardValue1844_31_0;
    int forwardValue1844_35_0;
    int forwardValue1844_37_0;
    int spill1844_0;
    boolean spill1844_1;
    long life2_3;
    java.lang.String life4_5;
    moom.Er life5_16;
    forward_join_37: {
    forward_join_36: {
    forward_join_35: {
    forward_join_31: {
    forward_join_18: {
    forward_join_17: {
    forward_join_16: {
    life2_3 = (moom.Er.g ^ 111770171683899L);
    life4_5 = net.minecraft.world.World.c__String();
    spill1844_0 = ((p0 instanceof moom.Er) ? 1 : 0);
    if (!((life4_5 == null))) {
        forwardValue1844_17_0 = spill1844_0;
        break forward_join_17;
    }
    if (!((spill1844_0 != 0))) {
        break forward_join_16;
    }
    life5_16 = ((moom.Er)(p0));
    if (!((life4_5 != null))) {
        break forward_join_18;
    }
    }
    forwardValue1844_17_0 = 0;
    }
    return ((forwardValue1844_17_0) != 0);
    }
    spill1844_1 = ((moom.DT)(this.c)).equals(((java.lang.Object)(((moom.Er)(life5_16)).c)));
    if (!((life4_5 == null))) {
        forwardValue1844_31_0 = ((spill1844_1) ? 1 : 0);
        break forward_join_31;
    }
    if (!(spill1844_1)) {
        break forward_join_36;
    }
    forwardValue1844_31_0 = ((net.minecraft.block.Block.a(((net.minecraft.block.Block)(this.b)), ((net.minecraft.block.Block)(((moom.Er)(life5_16)).b)))) ? 1 : 0);
    }
    if (!((life4_5 == null))) {
        forwardValue1844_35_0 = forwardValue1844_31_0;
        break forward_join_35;
    }
    if (!((forwardValue1844_31_0 != 0))) {
        break forward_join_36;
    }
    forwardValue1844_35_0 = 1;
    }
    forwardValue1844_37_0 = forwardValue1844_35_0;
    break forward_join_37;
    }
    forwardValue1844_37_0 = 0;
    }
    return ((forwardValue1844_37_0) != 0);
}


public java.lang.String toString() {
return __sourceIntrinsic_a86c261fcdee_originalDynamicSite1144_6(net.minecraft.block.Block.a(((net.minecraft.block.Block)(this.b))), this.c, this.d, this.e, this.f);
}


public int hashCode() {
return ((moom.DT)(this.c)).hashCode();
}


public int compareTo__sourceBridge_e47da4afb6(java.lang.Object p0) {
return ((moom.Er)(this)).a(((moom.Er)(((moom.Er)(p0)))));
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public net.minecraft.block.Block a() {
return this.b;
}


public int a(moom.Er p0) {
int forwardValue1843_21_0;
    int forwardValue1843_30_0;
    moom.Er forwardValue1843_40_0;
    int forwardValue1843_44_0;
    int spill1843_0;
    moom.Er spill1843_1;
    long life2_3;
    java.lang.String life4_5;
    forward_join_44: {
    forward_join_40: {
    forward_join_39: {
    forward_join_30: {
    forward_join_26: {
    forward_join_21: {
    forward_join_16: {
    life2_3 = (moom.Er.g ^ 57152971227594L);
    life4_5 = net.minecraft.world.World.c__String();
    spill1843_0 = recovery.source.CarrierOps.lcmp(((long)(this.d)), ((long)(((moom.Er)(p0)).d)));
    if (!((life4_5 == null))) {
        forwardValue1843_21_0 = spill1843_0;
        break forward_join_21;
    }
    if (!((spill1843_0 < 0))) {
        break forward_join_16;
    }
    forwardValue1843_44_0 = -1;
    break forward_join_44;
    }
    forwardValue1843_21_0 = recovery.source.CarrierOps.lcmp(((long)(this.d)), ((long)(((moom.Er)(p0)).d)));
    }
    if (!((life4_5 == null))) {
        forwardValue1843_30_0 = forwardValue1843_21_0;
        break forward_join_30;
    }
    if (!((forwardValue1843_21_0 > 0))) {
        break forward_join_26;
    }
    forwardValue1843_44_0 = 1;
    break forward_join_44;
    }
    spill1843_1 = this;
    if (!((life4_5 == null))) {
        forwardValue1843_40_0 = spill1843_1;
        break forward_join_40;
    }
    forwardValue1843_30_0 = ((moom.Er)(spill1843_1)).e;
    }
    if (!((forwardValue1843_30_0 != ((moom.Er)(p0)).e))) {
        break forward_join_39;
    }
    forwardValue1843_44_0 = (this.e - ((moom.Er)(p0)).e);
    break forward_join_44;
    }
    forwardValue1843_40_0 = this;
    }
    forwardValue1843_44_0 = java.lang.Long.compare(((long)(((moom.Er)(forwardValue1843_40_0)).f)), ((long)(((moom.Er)(p0)).f)));
    }
    return forwardValue1843_44_0;
}


public void a(int p0) {
this.e = ((int)(p0));
    return;
}


public moom.Er a(long p0) {
this.d = ((long)(p0));
    return this;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite1144_6(int a0, moom.DT a1, long a2, int a3, long a4) throws E;

public int compareTo(moom.Er __bridgeParam0) { return this.compareTo__sourceBridge_e47da4afb6(((java.lang.Object)(__bridgeParam0))); }
}
