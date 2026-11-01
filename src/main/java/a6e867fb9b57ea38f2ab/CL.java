package moom;


public class CL extends moom.CJ {

private final java.lang.String d;

private static final long e;

public CL(java.lang.String p0) {
super();
    this.d = p0;
}


static {
e = (moom._c.a(2479312947311291612L, 6847128040736619061L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(110939893613067L);
}


public boolean equals(java.lang.Object p0) {
java.lang.Object forwardValue1591_14_0;
    int forwardValue1591_24_0;
    int forwardValue1591_36_0;
    int forwardValue1591_40_0;
    int forwardValue1591_42_0;
    moom.CL spill1591_0;
    int spill1591_1;
    boolean spill1591_2;
    long life2_3;
    int life4_5;
    moom.CL life5_28;
    forward_join_42: {
    forward_join_41: {
    forward_join_40: {
    forward_join_36: {
    forward_join_25: {
    forward_join_24: {
    forward_join_23: {
    forward_join_14: {
    forward_join_13: {
    life2_3 = (moom.CL.e ^ 78290905955715L);
    life4_5 = ((moom.DS.b__Boolean()) ? 1 : 0);
    spill1591_0 = this;
    if (!((life4_5 == 0))) {
        forwardValue1591_14_0 = spill1591_0;
        break forward_join_14;
    }
    if (!((spill1591_0 == p0))) {
        break forward_join_13;
    }
    return ((1) != 0);
    }
    forwardValue1591_14_0 = p0;
    }
    spill1591_1 = ((forwardValue1591_14_0 instanceof moom.CL) ? 1 : 0);
    if (!((life4_5 == 0))) {
        forwardValue1591_24_0 = spill1591_1;
        break forward_join_24;
    }
    if (!((spill1591_1 != 0))) {
        break forward_join_23;
    }
    life5_28 = ((moom.CL)(p0));
    if (!((life4_5 != 0))) {
        break forward_join_25;
    }
    }
    forwardValue1591_24_0 = 0;
    }
    return ((forwardValue1591_24_0) != 0);
    }
    spill1591_2 = ((java.lang.String)(this.d)).equals(((java.lang.Object)(((moom.CL)(life5_28)).d)));
    if (!((life4_5 == 0))) {
        forwardValue1591_36_0 = ((spill1591_2) ? 1 : 0);
        break forward_join_36;
    }
    if (!(spill1591_2)) {
        break forward_join_41;
    }
    forwardValue1591_36_0 = ((super.equals(((java.lang.Object)(p0)))) ? 1 : 0);
    }
    if (!((life4_5 == 0))) {
        forwardValue1591_40_0 = forwardValue1591_36_0;
        break forward_join_40;
    }
    if (!((forwardValue1591_36_0 != 0))) {
        break forward_join_41;
    }
    forwardValue1591_40_0 = 1;
    }
    forwardValue1591_42_0 = forwardValue1591_40_0;
    break forward_join_42;
    }
    forwardValue1591_42_0 = 0;
    }
    return ((forwardValue1591_42_0) != 0);
}


public java.lang.String toString() {
return __sourceIntrinsic_a86c261fcdee_originalDynamicSite1076_3(this.d, ((moom.CL)(this)).a, ((moom.CL)(this)).a__CO());
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public java.lang.String d() {
return this.d;
}


public moom.CL a__CL() {
moom.CL lexicalValue529_39_0;
    boolean spill529_0;
    moom.CL spill529_1;
    long life1_3;
    moom.CL life4_10;
    java.util.Iterator life5_20;
    int life3_21;
    net.minecraft.util.IChatComponent life6_28;
    lexical_join_39: {
    lexical_join_38: {
    life1_3 = (moom.CL.e ^ 123285367609141L);
    spill529_0 = moom.DS.c__Boolean();
    life4_10 = new moom.CL(this.d);
    ((moom.CL)(life4_10)).a(((moom.CO)(((moom.CO)(((moom.CL)(this)).a__CO())).b__CO())));
    life5_20 = ((java.util.List)(((moom.CL)(this)).a__List())).iterator();
    life3_21 = ((spill529_0) ? 1 : 0);
    lexical_cycle_22: while (true) {
    if (!(((java.util.Iterator)(life5_20)).hasNext())) {
        break lexical_join_38;
    }
    life6_28 = ((net.minecraft.util.IChatComponent)(((java.util.Iterator)(life5_20)).next()));
    spill529_1 = life4_10;
    if (!((life3_21 != 0))) {
        lexicalValue529_39_0 = spill529_1;
        break lexical_join_39;
    }
    ((moom.CL)(spill529_1)).a(((net.minecraft.util.IChatComponent)(((net.minecraft.util.IChatComponent)(life6_28)).a__C5())));
    if (!((life3_21 == 0))) { continue lexical_cycle_22; }
    break lexical_cycle_22;
    }
    }
    lexicalValue529_39_0 = life4_10;
    }
    return lexicalValue529_39_0;
}


public net.minecraft.util.IChatComponent a__C5() {
return ((moom.CL)(this)).a__CL();
}


public java.lang.String a() {
return this.d;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite1076_3(java.lang.String a0, java.util.List a1, moom.CO a2) throws E;
}
