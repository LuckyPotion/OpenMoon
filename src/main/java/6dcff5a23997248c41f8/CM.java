package moom;


public class CM extends moom.CJ {

private final java.lang.String d;

private static java.lang.String e;

private static final long f;

public CM(java.lang.String p0) {
super();
    this.d = p0;
}


static {
f = ((long)(((moom._a)(moom._c.a(((long)(7399003367185804630L)), ((long)(2749104253254941601L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(201927428834122L)))));
    if ((moom.CM.e() != null)) {
        moom.CM.b(((java.lang.String)("ycGZJ")));
    }
}


public boolean equals(java.lang.Object p0) {
java.lang.Object forwardValue1593_14_0;
    int forwardValue1593_24_0;
    int forwardValue1593_36_0;
    int forwardValue1593_40_0;
    int forwardValue1593_42_0;
    moom.CM spill1593_0;
    int spill1593_1;
    boolean spill1593_2;
    long life2_3;
    int life4_5;
    moom.CM life5_28;
    forward_join_42: {
    forward_join_41: {
    forward_join_40: {
    forward_join_36: {
    forward_join_25: {
    forward_join_24: {
    forward_join_23: {
    forward_join_14: {
    forward_join_13: {
    life2_3 = (moom.CM.f ^ 109787928104262L);
    life4_5 = ((moom.DS.b__Boolean()) ? 1 : 0);
    spill1593_0 = this;
    if (!((life4_5 == 0))) {
        forwardValue1593_14_0 = spill1593_0;
        break forward_join_14;
    }
    if (!((spill1593_0 == p0))) {
        break forward_join_13;
    }
    return ((1) != 0);
    }
    forwardValue1593_14_0 = p0;
    }
    spill1593_1 = ((forwardValue1593_14_0 instanceof moom.CM) ? 1 : 0);
    if (!((life4_5 == 0))) {
        forwardValue1593_24_0 = spill1593_1;
        break forward_join_24;
    }
    if (!((spill1593_1 != 0))) {
        break forward_join_23;
    }
    life5_28 = ((moom.CM)(p0));
    if (!((life4_5 != 0))) {
        break forward_join_25;
    }
    }
    forwardValue1593_24_0 = 0;
    }
    return ((forwardValue1593_24_0) != 0);
    }
    spill1593_2 = ((java.lang.String)(this.d)).equals(((java.lang.Object)(((moom.CM)(life5_28)).d())));
    if (!((life4_5 == 0))) {
        forwardValue1593_36_0 = ((spill1593_2) ? 1 : 0);
        break forward_join_36;
    }
    if (!(spill1593_2)) {
        break forward_join_41;
    }
    forwardValue1593_36_0 = ((super.equals(((java.lang.Object)(p0)))) ? 1 : 0);
    }
    if (!((life4_5 == 0))) {
        forwardValue1593_40_0 = forwardValue1593_36_0;
        break forward_join_40;
    }
    if (!((forwardValue1593_36_0 != 0))) {
        break forward_join_41;
    }
    forwardValue1593_40_0 = 1;
    }
    forwardValue1593_42_0 = forwardValue1593_40_0;
    break forward_join_42;
    }
    forwardValue1593_42_0 = 0;
    }
    return ((forwardValue1593_42_0) != 0);
}


public java.lang.String toString() {
return __sourceIntrinsic_a86c261fcdee_originalDynamicSite1077_3(this.d, ((moom.CM)(this)).a, ((moom.CM)(this)).a__CO());
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public static void b(java.lang.String p0) {
moom.CM.e = ((java.lang.String)(p0));
    return;
}


public static java.lang.String e() {
return moom.CM.e;
}


public java.lang.String d() {
return this.d;
}


public moom.CM a__CM() {
moom.CM lexicalValue530_39_0;
    boolean spill530_0;
    moom.CM spill530_1;
    long life1_3;
    moom.CM life4_9;
    java.util.Iterator life5_20;
    int life3_21;
    net.minecraft.util.IChatComponent life6_28;
    lexical_join_39: {
    lexical_join_38: {
    life1_3 = (moom.CM.f ^ 105129931026009L);
    life4_9 = new moom.CM(this.d);
    spill530_0 = moom.DS.b__Boolean();
    ((moom.CM)(life4_9)).a(((moom.CO)(((moom.CO)(((moom.CM)(this)).a__CO())).b__CO())));
    life5_20 = ((java.util.List)(((moom.CM)(this)).a__List())).iterator();
    life3_21 = ((spill530_0) ? 1 : 0);
    lexical_cycle_22: while (true) {
    if (!(((java.util.Iterator)(life5_20)).hasNext())) {
        break lexical_join_38;
    }
    life6_28 = ((net.minecraft.util.IChatComponent)(((java.util.Iterator)(life5_20)).next()));
    spill530_1 = life4_9;
    if (!((life3_21 == 0))) {
        lexicalValue530_39_0 = spill530_1;
        break lexical_join_39;
    }
    ((moom.CM)(spill530_1)).a(((net.minecraft.util.IChatComponent)(((net.minecraft.util.IChatComponent)(life6_28)).a__C5())));
    if (!((life3_21 != 0))) { continue lexical_cycle_22; }
    break lexical_cycle_22;
    }
    }
    lexicalValue530_39_0 = life4_9;
    }
    return lexicalValue530_39_0;
}


public java.lang.String a() {
return this.d;
}


public net.minecraft.util.IChatComponent a__C5() {
return ((moom.CM)(this)).a__CM();
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite1077_3(java.lang.String a0, java.util.List a1, moom.CO a2) throws E;
}
