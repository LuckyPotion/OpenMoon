package moom;


public class eS {

private final moom.DT a;

private final net.minecraft.block.Block b;

private final int c;

private final int d;

private static final long e;

public eS(moom.DT p0, net.minecraft.block.Block p1, int p2, int p3) {
super();
    this.a = p0;
    this.c = p2;
    this.d = p3;
    this.b = p1;
}


static {
e = (moom._c.a(7248083004164252644L, -7264506311422501623L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(87153224274064L);
}


public boolean equals(java.lang.Object p0) {
int forwardValue3448_17_0;
    int forwardValue3448_28_0;
    int forwardValue3448_39_0;
    int forwardValue3448_39_1;
    moom.eS forwardValue3448_41_0;
    int forwardValue3448_48_0;
    int spill3448_0;
    boolean spill3448_1;
    int spill3448_2;
    moom.eS spill3448_3;
    long life2_3;
    int[] life4_5;
    moom.eS life5_16;
    forward_join_48: {
    forward_join_47: {
    forward_join_41: {
    forward_join_39: {
    forward_join_28: {
    forward_join_18: {
    forward_join_17: {
    forward_join_16: {
    life2_3 = (moom.eS.e ^ 117451651408157L);
    life4_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3448_0 = ((p0 instanceof moom.eS) ? 1 : 0);
    if (!((life4_5 != null))) {
        forwardValue3448_17_0 = spill3448_0;
        break forward_join_17;
    }
    if (!((spill3448_0 != 0))) {
        break forward_join_16;
    }
    life5_16 = ((moom.eS)(p0));
    if (!((life4_5 == null))) {
        break forward_join_18;
    }
    }
    forwardValue3448_17_0 = 0;
    }
    return ((forwardValue3448_17_0) != 0);
    }
    spill3448_1 = ((moom.DT)(this.a)).equals(((java.lang.Object)(((moom.eS)(life5_16)).a)));
    if (!((life4_5 != null))) {
        forwardValue3448_28_0 = ((spill3448_1) ? 1 : 0);
        break forward_join_28;
    }
    if (!(spill3448_1)) {
        break forward_join_47;
    }
    forwardValue3448_28_0 = this.c;
    }
    spill3448_2 = ((moom.eS)(life5_16)).c;
    if (!((life4_5 != null))) {
        forwardValue3448_39_0 = forwardValue3448_28_0;
        forwardValue3448_39_1 = spill3448_2;
        break forward_join_39;
    }
    if (!((forwardValue3448_28_0 == spill3448_2))) {
        break forward_join_47;
    }
    spill3448_3 = this;
    if (!((life4_5 != null))) {
        forwardValue3448_41_0 = spill3448_3;
        break forward_join_41;
    }
    forwardValue3448_39_0 = ((moom.eS)(spill3448_3)).d;
    forwardValue3448_39_1 = ((moom.eS)(life5_16)).d;
    }
    if (!((forwardValue3448_39_0 == forwardValue3448_39_1))) {
        break forward_join_47;
    }
    forwardValue3448_41_0 = this;
    }
    if (!((((moom.eS)(forwardValue3448_41_0)).b == ((moom.eS)(life5_16)).b))) {
        break forward_join_47;
    }
    forwardValue3448_48_0 = 1;
    break forward_join_48;
    }
    forwardValue3448_48_0 = 0;
    }
    return ((forwardValue3448_48_0) != 0);
}


public java.lang.String toString() {
return __sourceIntrinsic_a86c261fcdee_originalDynamicSite1421_4(this.a, this.c, this.d, this.b);
}


public int b() {
return this.d;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public net.minecraft.block.Block a__ch() {
return this.b;
}


public int a() {
return this.c;
}


public moom.DT a__DT() {
return this.a;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite1421_4(moom.DT a0, int a1, int a2, net.minecraft.block.Block a3) throws E;
}
