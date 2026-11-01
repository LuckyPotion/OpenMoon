package moom;


public class BY {

public final java.lang.String a;

private final net.minecraft.util.IChatComponent b;

public boolean c;

private final moom.BX d;

private final net.minecraft.scoreboard.IScoreObjectiveCriteria e;

private java.lang.Class<? extends net.minecraft.util.IJsonSerializable> f;

private static final java.text.NumberFormat g;

public static moom.BX h;

private static final java.text.DecimalFormat i;

public static moom.BX j;

public static moom.BX k;

public static moom.BX l;

private static boolean m;

private static final long v;

public BY(java.lang.String p0, net.minecraft.util.IChatComponent p1, moom.BX p2) {
super();
    this.a = p0;
    this.b = p1;
    this.d = p2;
    this.e = new net.minecraft.stats.ObjectiveStat(this);
    (net.minecraft.scoreboard.IScoreObjectiveCriteria.a).put((this.e).a(), this.e);
}


public BY(java.lang.String p0, net.minecraft.util.IChatComponent p1) {
this(p0, p1, moom.BY.h);
}


static {
v = ((long)(((moom._a)(moom._c.a(((long)(6834744035776316228L)), ((long)(-5245925859165077291L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(131113070891125L)))));
    g = ((java.text.NumberFormat)(java.text.NumberFormat.getIntegerInstance(((java.util.Locale)(java.util.Locale.US)))));
    java.text.NumberFormat __sourceEffectfulDup9_12 = moom.BY.g;
    java.text.NumberFormat __sourceSpill9_14 = __sourceEffectfulDup9_12;
    java.util.Objects.requireNonNull(((java.lang.Object)(__sourceEffectfulDup9_12)));
    h = ((moom.BX)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite9_15(__sourceSpill9_14)));
    int __sourceSpill9_18 = 0;
    i = ((java.text.DecimalFormat)(new java.text.DecimalFormat("########0.00")));
    moom.BY.b(((boolean)__sourceIntrinsic_integerToBoolean((__sourceSpill9_18))));
    j = ((moom.BX)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite9_20()));
    k = ((moom.BX)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite9_22()));
    l = ((moom.BX)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite9_24()));
}


public boolean equals(java.lang.Object p0) {
java.lang.Object forwardValue1503_14_0;
    java.lang.Object forwardValue1503_23_0;
    moom.BY spill1503_0;
    java.lang.Class spill1503_1;
    long life2_3;
    int life4_5;
    moom.BY life5_38;
    forward_join_31: {
    forward_join_23: {
    forward_join_14: {
    forward_join_13: {
    life2_3 = (moom.BY.v ^ 118868987383513L);
    life4_5 = ((moom.BY.c()) ? 1 : 0);
    spill1503_0 = this;
    if (!((life4_5 != 0))) {
        forwardValue1503_14_0 = spill1503_0;
        break forward_join_14;
    }
    if (!((spill1503_0 == p0))) {
        break forward_join_13;
    }
    return ((1) != 0);
    }
    forwardValue1503_14_0 = p0;
    }
    if (!((forwardValue1503_14_0 != null))) {
        break forward_join_31;
    }
    spill1503_1 = ((java.lang.Object)(this)).getClass();
    if (!((life4_5 != 0))) {
        forwardValue1503_23_0 = spill1503_1;
        break forward_join_23;
    }
    if (!((spill1503_1 == ((java.lang.Object)(p0)).getClass()))) {
        break forward_join_31;
    }
    forwardValue1503_23_0 = p0;
    }
    life5_38 = ((moom.BY)(forwardValue1503_23_0));
    return ((java.lang.String)(this.a)).equals(((java.lang.Object)(((moom.BY)(life5_38)).a)));
    }
    return ((0) != 0);
}


public java.lang.String toString() {
return __sourceIntrinsic_a86c261fcdee_originalDynamicSite1062_5(this.a, this.b, this.c, this.d, this.e);
}


public int hashCode() {
return ((java.lang.String)(this.a)).hashCode();
}


public net.minecraft.util.IChatComponent b__C5() {
net.minecraft.util.IChatComponent local1 = ((moom.BY)(this)).a__C5();
    net.minecraft.util.IChatComponent local2 = ((net.minecraft.util.IChatComponent)(((moom.CM)(new moom.CM("["))).a(((net.minecraft.util.IChatComponent)(local1))))).a(((java.lang.String)("]")));
    ((net.minecraft.util.IChatComponent)(local2)).a(((moom.CO)(((net.minecraft.util.IChatComponent)(local1)).a__CO())));
    return local2;
}


public moom.BY b() {
long local1 = (moom.BY.v ^ 5745926041870L);
    if (((java.util.Map)(net.minecraft.stats.StatList.a)).containsKey(((java.lang.Object)(this.a)))) {
        throw new java.lang.RuntimeException(__sourceIntrinsic_d95beebdde0f_invokedynamic3897_11(((moom.BY)(((moom.BY)(((java.util.Map)(net.minecraft.stats.StatList.a)).get(((java.lang.Object)(this.a))))))).b, this.b, this.a));
    }
    ((java.util.List)(net.minecraft.stats.StatList.b)).add(((java.lang.Object)(this)));
    ((java.util.Map)(net.minecraft.stats.StatList.a)).put(((java.lang.Object)(this.a)), ((java.lang.Object)(this)));
    return this;
}


public static boolean b__Boolean() {
return ((((moom.BY.m) ? 1 : 0)) != 0);
}


public static void b(boolean p0) {
moom.BY.m = ((boolean)(p0));
    return;
}


public static boolean c() {
int local0 = __sourceIntrinsic_booleanToInteger(moom.BY.b__Boolean());
    if ((local0 == 0)) {
        return ((1) != 0);
    }
    return ((0) != 0);
}


public moom.BY a(java.lang.Class<? extends net.minecraft.util.IJsonSerializable> p0) {
this.f = ((java.lang.Class)(p0));
    return this;
}


private static java.lang.RuntimeException a(java.lang.RuntimeException p0) {
return p0;
}


public net.minecraft.scoreboard.IScoreObjectiveCriteria a__Bb() {
return this.e;
}


public net.minecraft.util.IChatComponent a__C5() {
long life1_3;
    net.minecraft.util.IChatComponent life4_8;
    int life3_9;
    life1_3 = (moom.BY.v ^ 90389531261730L);
    boolean spill3263_0 = moom.BY.c();
    life4_8 = ((net.minecraft.util.IChatComponent)(this.b)).a__C5();
    life3_9 = ((spill3263_0) ? 1 : 0);
    ((moom.CO)(((net.minecraft.util.IChatComponent)(life4_8)).a__CO())).a(((net.minecraft.util.EnumChatFormatting)(net.minecraft.util.EnumChatFormatting.GRAY)));
    ((moom.CO)(((net.minecraft.util.IChatComponent)(life4_8)).a__CO())).a(((moom.v3)(new moom.v3(net.minecraft.event.HoverEvent$Action.SHOW_ACHIEVEMENT, new moom.CM(this.a)))));
    net.minecraft.util.IChatComponent spill3263_1 = life4_8;
    if ((net.minecraft.entity.Entity.b__ArrayString() != null)) {
        moom.BY.b(((boolean)__sourceIntrinsic_integerToBoolean((((life3_9 != 0) ? 0 : 1)))));
    }
    return spill3263_1;
}


public java.lang.String a(int p0) {
return ((moom.BX)(this.d)).a(((int)(p0)));
}


public boolean a__Boolean() {
return ((0) != 0);
}


public moom.BY a__BY() {
this.c = ((boolean)(true));
    return this;
}


public java.lang.Class<? extends net.minecraft.util.IJsonSerializable> a() {
return this.f;
}


private static java.lang.String lambda$static$1(int p0) {
int forwardValue1505_29_0;
    int forwardValue1505_38_0;
    java.lang.String forwardValue1505_39_0;
    boolean spill1505_0;
    int spill1505_1;
    long life1_3;
    double life4_9;
    int life3_10;
    double life6_14;
    forward_join_39: {
    forward_join_38: {
    forward_join_37: {
    forward_join_29: {
    forward_join_26: {
    life1_3 = (moom.BY.v ^ 94124224020453L);
    spill1505_0 = moom.BY.c();
    life4_9 = (((double) p0) / 0x1.9p6d);
    life3_10 = ((spill1505_0) ? 1 : 0);
    life6_14 = (life4_9 / 0x1.f4p9d);
    spill1505_1 = recovery.source.CarrierOps.dcmpl(((double)(life6_14)), ((double)(0x1.0p-1d)));
    if (!((life3_10 != 0))) {
        forwardValue1505_29_0 = spill1505_1;
        break forward_join_29;
    }
    if (!((spill1505_1 > 0))) {
        break forward_join_26;
    }
    forwardValue1505_39_0 = __sourceIntrinsic_0458dc3a73f2_invokedynamic1505_6(((java.text.DecimalFormat)(moom.BY.i)).format(((double)(life6_14))));
    break forward_join_39;
    }
    forwardValue1505_29_0 = recovery.source.CarrierOps.dcmpl(((double)(life4_9)), ((double)(0x1.0p-1d)));
    }
    if (!((life3_10 != 0))) {
        forwardValue1505_38_0 = forwardValue1505_29_0;
        break forward_join_38;
    }
    if (!((forwardValue1505_29_0 > 0))) {
        break forward_join_37;
    }
    forwardValue1505_39_0 = __sourceIntrinsic_0458dc3a73f2_invokedynamic1505_10(((java.text.DecimalFormat)(moom.BY.i)).format(((double)(life4_9))));
    break forward_join_39;
    }
    forwardValue1505_38_0 = p0;
    }
    forwardValue1505_39_0 = __sourceIntrinsic_0458dc3a73f2_invokedynamic1505_11(forwardValue1505_38_0);
    }
    return forwardValue1505_39_0;
}


private static java.lang.String lambda$static$0(int p0) {
int forwardValue1504_41_0;
    int forwardValue1504_52_0;
    int forwardValue1504_65_0;
    double forwardValue1504_72_0;
    java.lang.String forwardValue1504_73_0;
    boolean spill1504_0;
    int spill1504_1;
    double spill1504_2;
    long life1_3;
    double life4_9;
    int life3_10;
    double life6_14;
    double life8_18;
    double life10_22;
    double life12_26;
    forward_join_73: {
    forward_join_72: {
    forward_join_71: {
    forward_join_65: {
    forward_join_60: {
    forward_join_52: {
    forward_join_49: {
    forward_join_41: {
    forward_join_38: {
    life1_3 = (moom.BY.v ^ 88107032369682L);
    spill1504_0 = moom.BY.c();
    life4_9 = (((double) p0) / 0x1.4p4d);
    life3_10 = ((spill1504_0) ? 1 : 0);
    life6_14 = (life4_9 / 0x1.ep5d);
    life8_18 = (life6_14 / 0x1.ep5d);
    life10_22 = (life8_18 / 0x1.8p4d);
    life12_26 = (life10_22 / 0x1.6dp8d);
    spill1504_1 = recovery.source.CarrierOps.dcmpl(((double)(life12_26)), ((double)(0x1.0p-1d)));
    if (!((life3_10 != 0))) {
        forwardValue1504_41_0 = spill1504_1;
        break forward_join_41;
    }
    if (!((spill1504_1 > 0))) {
        break forward_join_38;
    }
    forwardValue1504_73_0 = __sourceIntrinsic_ad052b301cbb_invokedynamic1504_6(((java.text.DecimalFormat)(moom.BY.i)).format(((double)(life12_26))));
    break forward_join_73;
    }
    forwardValue1504_41_0 = recovery.source.CarrierOps.dcmpl(((double)(life10_22)), ((double)(0x1.0p-1d)));
    }
    if (!((life3_10 != 0))) {
        forwardValue1504_52_0 = forwardValue1504_41_0;
        break forward_join_52;
    }
    if (!((forwardValue1504_41_0 > 0))) {
        break forward_join_49;
    }
    forwardValue1504_73_0 = __sourceIntrinsic_ad052b301cbb_invokedynamic1504_10(((java.text.DecimalFormat)(moom.BY.i)).format(((double)(life10_22))));
    break forward_join_73;
    }
    forwardValue1504_52_0 = recovery.source.CarrierOps.dcmpl(((double)(life8_18)), ((double)(0x1.0p-1d)));
    }
    if (!((life3_10 != 0))) {
        forwardValue1504_65_0 = forwardValue1504_52_0;
        break forward_join_65;
    }
    if (!((forwardValue1504_52_0 > 0))) {
        break forward_join_60;
    }
    forwardValue1504_73_0 = __sourceIntrinsic_ad052b301cbb_invokedynamic1504_14(((java.text.DecimalFormat)(moom.BY.i)).format(((double)(life8_18))));
    break forward_join_73;
    }
    spill1504_2 = life6_14;
    if (!((life3_10 != 0))) {
        forwardValue1504_72_0 = spill1504_2;
        break forward_join_72;
    }
    forwardValue1504_65_0 = recovery.source.CarrierOps.dcmpl(((double)(spill1504_2)), ((double)(0x1.0p-1d)));
    }
    if (!((forwardValue1504_65_0 > 0))) {
        break forward_join_71;
    }
    forwardValue1504_73_0 = __sourceIntrinsic_ad052b301cbb_invokedynamic1504_18(((java.text.DecimalFormat)(moom.BY.i)).format(((double)(life6_14))));
    break forward_join_73;
    }
    forwardValue1504_72_0 = life4_9;
    }
    forwardValue1504_73_0 = __sourceIntrinsic_ad052b301cbb_invokedynamic1504_19(forwardValue1504_72_0);
    }
    return forwardValue1504_73_0;
}


private static java.lang.String lambda$static$2(int p0) {
return ((java.text.DecimalFormat)(moom.BY.i)).format(((double)((((double) p0) * 0x1.999999999999ap-4d))));
}


private static native <E extends Throwable> moom.BX __sourceIntrinsic_eb8803ad1f63_originalDynamicSite9_15(java.text.NumberFormat a0) throws E;

private static native <E extends Throwable> moom.BX __sourceIntrinsic_eb8803ad1f63_originalDynamicSite9_20() throws E;

private static native <E extends Throwable> moom.BX __sourceIntrinsic_eb8803ad1f63_originalDynamicSite9_22() throws E;

private static native <E extends Throwable> moom.BX __sourceIntrinsic_eb8803ad1f63_originalDynamicSite9_24() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite1062_5(java.lang.String a0, net.minecraft.util.IChatComponent a1, boolean a2, moom.BX a3, net.minecraft.scoreboard.IScoreObjectiveCriteria a4) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_d95beebdde0f_invokedynamic3897_11(net.minecraft.util.IChatComponent a0, net.minecraft.util.IChatComponent a1, java.lang.String a2) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_0458dc3a73f2_invokedynamic1505_6(java.lang.String a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_0458dc3a73f2_invokedynamic1505_10(java.lang.String a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_0458dc3a73f2_invokedynamic1505_11(int a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ad052b301cbb_invokedynamic1504_6(java.lang.String a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ad052b301cbb_invokedynamic1504_10(java.lang.String a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ad052b301cbb_invokedynamic1504_14(java.lang.String a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ad052b301cbb_invokedynamic1504_18(java.lang.String a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ad052b301cbb_invokedynamic1504_19(double a0) throws E;

private static native int __sourceIntrinsic_booleanToInteger(boolean value);
private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
