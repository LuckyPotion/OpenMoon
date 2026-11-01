package net.minecraft.client.resources;


public class LanguageManager implements net.minecraft.client.resources.IResourceManagerReloadListener {

private static org.apache.logging.log4j.Logger a;

private net.minecraft.client.resources.data.IMetadataSerializer b;

private java.lang.String c;

protected static moom.oW d;

private java.util.Map<java.lang.String, moom.oU> e;

private static long f;

public LanguageManager(net.minecraft.client.resources.data.IMetadataSerializer p0, java.lang.String p1) {
super();
    this.e = com.google.common.collect.Maps.newHashMap();
    this.b = p0;
    this.c = p1;
    moom.oO.a(net.minecraft.client.resources.LanguageManager.d);
}


static {
net.minecraft.client.resources.LanguageManager.f = (moom._c.a(-5413117177597795152L, 2265742605360809008L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(20128928183892L);
    net.minecraft.client.resources.LanguageManager.a = org.apache.logging.log4j.LogManager.getLogger();
    net.minecraft.client.resources.LanguageManager.d = new moom.oW();
}

private static native <E extends Throwable> void __sourceHandlerCall_ab47aa4a78940c945c98(net.minecraft.client.resources.LanguageManager a0, java.util.List a1) throws E;
private static final class __SourceHandler_ab47aa4a78940c945c98 {

public static void f622(net.minecraft.client.resources.LanguageManager receiver, java.util.List p0) throws Throwable {
    int forestValue622_14_0;
    net.minecraft.client.resources.data.LanguageMetadataSection forestValue622_31_0;
    java.util.Map forestValue622_55_0;
    java.lang.String forestValue622_55_1;
    java.lang.String[] spill622_0;
    net.minecraft.client.resources.data.LanguageMetadataSection spill622_1;
    java.util.Map spill622_2;
    java.lang.String spill622_3;
    boolean spill622_4;
    long life2_3;
    java.lang.String[] life4_8;
    java.util.Iterator life5_11;
    net.minecraft.client.resources.IResourcePack life6_18;
    net.minecraft.client.resources.data.LanguageMetadataSection life7_25;
    java.util.Iterator life8_34;
    moom.oU life9_41;
    forest_join_62: {
    life2_3 = (__fieldRead622_0() ^ 4065262216294L);
    spill622_0 = __call622_1();
    __call622_3(__fieldRead622_2(receiver));
    life4_8 = spill622_0;
    life5_11 = __call622_4(p0);
    forest_cycle_12: while (true) {
    forest_join_60: {
    forestValue622_14_0 = __integerCategory622_6(__call622_5(life5_11));
    forest_cycle_14: while (true) {
    forest_join_31: {
    if (!((forestValue622_14_0 != 0))) {
        break forest_join_62;
    }
    life6_18 = __cast622_8(__call622_7(life5_11));
    life7_25 = __cast622_11(__call622_10(life6_18, __fieldRead622_9(receiver), "language"));
    spill622_1 = life7_25;
    if (!((life4_8 != null))) {
        forestValue622_31_0 = spill622_1;
        break forest_join_31;
    }
    if (!((spill622_1 != null))) {
        break forest_join_60;
    }
    forestValue622_31_0 = life7_25;
    }
    life8_34 = __call622_13(__call622_12(forestValue622_31_0));
    forest_cycle_34: while (true) {
    forest_join_58: {
    forest_join_55: {
    if (!(__call622_14(life8_34))) {
        break forest_join_60;
    }
    life9_41 = __cast622_16(__call622_15(life8_34));
    spill622_2 = __fieldRead622_17(receiver);
    spill622_3 = __call622_18(life9_41);
    if (!((life4_8 != null))) {
        forestValue622_55_0 = spill622_2;
        forestValue622_55_1 = spill622_3;
        break forest_join_55;
    }
    spill622_4 = __call622_19(spill622_2, spill622_3);
    if (!((life4_8 != null))) {
        forestValue622_14_0 = __integerCategory622_20(spill622_4);
        continue forest_cycle_14;
    }
    if (!((!spill622_4))) {
        break forest_join_58;
    }
    forestValue622_55_0 = __fieldRead622_21(receiver);
    forestValue622_55_1 = __call622_22(life9_41);
    }
    __call622_23(forestValue622_55_0, forestValue622_55_1, life9_41);
    }
    if (!((life4_8 == null))) {
        continue forest_cycle_34;
    }
    break forest_cycle_34;
    }
    break forest_cycle_14;
    }
    }
    if (!((life4_8 == null))) {
        continue forest_cycle_12;
    }
    break forest_cycle_12;
    }
    }
    return;
}
public static void h622_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call3062200_0(p0);
}
public static void h622_1(java.lang.RuntimeException p0) throws Throwable {
    throw __call3062201_0(p0);
}
public static void h622_2(java.lang.RuntimeException p0) throws Throwable {
    throw __call3062202_0(p0);
}
public static void h622_3(java.lang.Exception p0, net.minecraft.client.resources.LanguageManager p1, java.lang.String[] p2, java.util.Iterator p3, net.minecraft.client.resources.IResourcePack p4, net.minecraft.client.resources.data.LanguageMetadataSection p5, java.util.Iterator p6, moom.oU p7) throws Throwable {
    int forestValue3062203_13_0;
    net.minecraft.client.resources.data.LanguageMetadataSection forestValue3062203_30_0;
    java.util.Map forestValue3062203_54_0;
    java.lang.String forestValue3062203_54_1;
    net.minecraft.client.resources.data.LanguageMetadataSection spill3062203_0;
    java.util.Map spill3062203_1;
    java.lang.String spill3062203_2;
    boolean spill3062203_3;
    java.lang.Exception life5_2;
    net.minecraft.client.resources.IResourcePack life4_18;
    net.minecraft.client.resources.data.LanguageMetadataSection life5_25;
    java.util.Iterator life6_34;
    moom.oU life7_41;
    forest_join_60: {
    life5_2 = p0;
    __call3062203_3(__fieldRead3062203_0(), __invokedynamic3062203_2(__call3062203_1(p4)), life5_2);
    forest_cycle_8: while (true) {
    forest_join_59: {
    forest_join_11: {
    if (!((p2 == null))) {
        break forest_join_11;
    }
    break forest_join_60;
    }
    forestValue3062203_13_0 = __integerCategory3062203_5(__call3062203_4(p3));
    forest_cycle_13: while (true) {
    forest_join_30: {
    if (!((forestValue3062203_13_0 != 0))) {
        break forest_join_60;
    }
    life4_18 = __cast3062203_7(__call3062203_6(p3));
    life5_25 = __cast3062203_10(__call3062203_9(life4_18, __fieldRead3062203_8(p1), "language"));
    spill3062203_0 = life5_25;
    if (!((p2 != null))) {
        forestValue3062203_30_0 = spill3062203_0;
        break forest_join_30;
    }
    if (!((spill3062203_0 != null))) {
        break forest_join_59;
    }
    forestValue3062203_30_0 = life5_25;
    }
    life6_34 = __call3062203_12(__call3062203_11(forestValue3062203_30_0));
    forest_cycle_33: while (true) {
    forest_join_57: {
    forest_join_54: {
    if (!(__call3062203_13(life6_34))) {
        break forest_join_59;
    }
    life7_41 = __cast3062203_15(__call3062203_14(life6_34));
    spill3062203_1 = __fieldRead3062203_16(p1);
    spill3062203_2 = __call3062203_17(life7_41);
    if (!((p2 != null))) {
        forestValue3062203_54_0 = spill3062203_1;
        forestValue3062203_54_1 = spill3062203_2;
        break forest_join_54;
    }
    spill3062203_3 = __call3062203_18(spill3062203_1, spill3062203_2);
    if (!((p2 != null))) {
        forestValue3062203_13_0 = __integerCategory3062203_19(spill3062203_3);
        continue forest_cycle_13;
    }
    if (!((!spill3062203_3))) {
        break forest_join_57;
    }
    forestValue3062203_54_0 = __fieldRead3062203_20(p1);
    forestValue3062203_54_1 = __call3062203_21(life7_41);
    }
    __call3062203_22(forestValue3062203_54_0, forestValue3062203_54_1, life7_41);
    }
    if (!((p2 == null))) {
        continue forest_cycle_33;
    }
    break forest_cycle_33;
    }
    break forest_cycle_13;
    }
    }
    continue forest_cycle_8;
    }
    }
    return;
}
private static native long __fieldRead622_0() throws Throwable;
private static native java.lang.String[] __call622_1() throws Throwable;
private static native java.util.Map __fieldRead622_2(net.minecraft.client.resources.LanguageManager a0) throws Throwable;
private static native void __call622_3(java.util.Map a0) throws Throwable;
private static native java.util.Iterator __call622_4(java.util.List a0) throws Throwable;
private static native boolean __call622_5(java.util.Iterator a0) throws Throwable;
private static native int __integerCategory622_6(boolean value) throws Throwable;
private static native java.lang.Object __call622_7(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.client.resources.IResourcePack __cast622_8(java.lang.Object a0) throws Throwable;
private static native net.minecraft.client.resources.data.IMetadataSerializer __fieldRead622_9(net.minecraft.client.resources.LanguageManager a0) throws Throwable;
private static native net.minecraft.client.resources.data.IMetadataSection __call622_10(net.minecraft.client.resources.IResourcePack a0, net.minecraft.client.resources.data.IMetadataSerializer a1, java.lang.String a2) throws Throwable;
private static native net.minecraft.client.resources.data.LanguageMetadataSection __cast622_11(net.minecraft.client.resources.data.IMetadataSection a0) throws Throwable;
private static native java.util.Collection __call622_12(net.minecraft.client.resources.data.LanguageMetadataSection a0) throws Throwable;
private static native java.util.Iterator __call622_13(java.util.Collection a0) throws Throwable;
private static native boolean __call622_14(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call622_15(java.util.Iterator a0) throws Throwable;
private static native moom.oU __cast622_16(java.lang.Object a0) throws Throwable;
private static native java.util.Map __fieldRead622_17(net.minecraft.client.resources.LanguageManager a0) throws Throwable;
private static native java.lang.String __call622_18(moom.oU a0) throws Throwable;
private static native boolean __call622_19(java.util.Map a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory622_20(boolean value) throws Throwable;
private static native java.util.Map __fieldRead622_21(net.minecraft.client.resources.LanguageManager a0) throws Throwable;
private static native java.lang.String __call622_22(moom.oU a0) throws Throwable;
private static native java.lang.Object __call622_23(java.util.Map a0, java.lang.String a1, moom.oU a2) throws Throwable;
private static native java.lang.RuntimeException __call3062200_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.RuntimeException __call3062201_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.RuntimeException __call3062202_0(java.lang.RuntimeException a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead3062203_0() throws Throwable;
private static native java.lang.String __call3062203_1(net.minecraft.client.resources.IResourcePack a0) throws Throwable;
private static native java.lang.String __invokedynamic3062203_2(java.lang.String a0) throws Throwable;
private static native void __call3062203_3(org.apache.logging.log4j.Logger a0, java.lang.String a1, java.lang.Exception a2) throws Throwable;
private static native boolean __call3062203_4(java.util.Iterator a0) throws Throwable;
private static native int __integerCategory3062203_5(boolean value) throws Throwable;
private static native java.lang.Object __call3062203_6(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.client.resources.IResourcePack __cast3062203_7(java.lang.Object a0) throws Throwable;
private static native net.minecraft.client.resources.data.IMetadataSerializer __fieldRead3062203_8(net.minecraft.client.resources.LanguageManager a0) throws Throwable;
private static native net.minecraft.client.resources.data.IMetadataSection __call3062203_9(net.minecraft.client.resources.IResourcePack a0, net.minecraft.client.resources.data.IMetadataSerializer a1, java.lang.String a2) throws Throwable;
private static native net.minecraft.client.resources.data.LanguageMetadataSection __cast3062203_10(net.minecraft.client.resources.data.IMetadataSection a0) throws Throwable;
private static native java.util.Collection __call3062203_11(net.minecraft.client.resources.data.LanguageMetadataSection a0) throws Throwable;
private static native java.util.Iterator __call3062203_12(java.util.Collection a0) throws Throwable;
private static native boolean __call3062203_13(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call3062203_14(java.util.Iterator a0) throws Throwable;
private static native moom.oU __cast3062203_15(java.lang.Object a0) throws Throwable;
private static native java.util.Map __fieldRead3062203_16(net.minecraft.client.resources.LanguageManager a0) throws Throwable;
private static native java.lang.String __call3062203_17(moom.oU a0) throws Throwable;
private static native boolean __call3062203_18(java.util.Map a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory3062203_19(boolean value) throws Throwable;
private static native java.util.Map __fieldRead3062203_20(net.minecraft.client.resources.LanguageManager a0) throws Throwable;
private static native java.lang.String __call3062203_21(moom.oU a0) throws Throwable;
private static native java.lang.Object __call3062203_22(java.util.Map a0, java.lang.String a1, moom.oU a2) throws Throwable;

}


public boolean b() {
moom.oU forwardValue4844_13_0;
    int forwardValue4844_18_0;
    int forwardValue4844_20_0;
    moom.oU spill4844_0;
    boolean spill4844_1;
    long life1_3;
    java.lang.String[] life3_5;
    forward_join_20: {
    forward_join_19: {
    forward_join_18: {
    forward_join_13: {
    life1_3 = (net.minecraft.client.resources.LanguageManager.f ^ 99834760309974L);
    life3_5 = moom.oO.b();
    spill4844_0 = ((net.minecraft.client.resources.LanguageManager)(this)).a__oU();
    if (!((life3_5 != null))) {
        forwardValue4844_13_0 = spill4844_0;
        break forward_join_13;
    }
    if (!((spill4844_0 != null))) {
        break forward_join_19;
    }
    forwardValue4844_13_0 = ((net.minecraft.client.resources.LanguageManager)(this)).a__oU();
    }
    spill4844_1 = ((moom.oU)(forwardValue4844_13_0)).a__Boolean();
    if (!((life3_5 != null))) {
        forwardValue4844_18_0 = ((spill4844_1) ? 1 : 0);
        break forward_join_18;
    }
    if (!(spill4844_1)) {
        break forward_join_19;
    }
    forwardValue4844_18_0 = 1;
    }
    forwardValue4844_20_0 = forwardValue4844_18_0;
    break forward_join_20;
    }
    forwardValue4844_20_0 = 0;
    }
    return ((forwardValue4844_20_0) != 0);
}


public void b(moom.oR p0) {
long life2_3;
    java.util.ArrayList life5_12;
    java.lang.String[] life4_13;
    life2_3 = (net.minecraft.client.resources.LanguageManager.f ^ 56314904471143L);
    java.lang.String[] spill8881_0 = moom.oO.b();
    life5_12 = com.google.common.collect.Lists.newArrayList(((java.lang.Object[])(new java.lang.String[] {"en_US"})));
    life4_13 = spill8881_0;
    if ((life4_13 != null)) {
        if ((!((java.lang.String)("en_US")).equals(((java.lang.Object)(this.c))))) {
        ((java.util.List)(life5_12)).add(((java.lang.Object)(this.c)));
    }
        ((moom.oW)(net.minecraft.client.resources.LanguageManager.d)).a(((moom.oR)(p0)), ((java.util.List)(life5_12)));
        moom.DJ.a(((java.util.Map)(((moom.oW)(net.minecraft.client.resources.LanguageManager.d)).c)));
    }
    return;
}


public moom.oU a__oU() {
java.util.Map forwardValue4843_24_0;
    java.lang.String forwardValue4843_24_1;
    moom.oU forwardValue4843_26_0;
    java.util.Map spill4843_0;
    java.lang.String spill4843_1;
    long life1_3;
    java.lang.String[] life3_5;
    forward_join_26: {
    forward_join_24: {
    forward_join_21: {
    life1_3 = (net.minecraft.client.resources.LanguageManager.f ^ 41231443484418L);
    life3_5 = moom.oO.b();
    spill4843_0 = this.e;
    spill4843_1 = this.c;
    if (!((life3_5 != null))) {
        forwardValue4843_24_0 = spill4843_0;
        forwardValue4843_24_1 = spill4843_1;
        break forward_join_24;
    }
    if (!(((java.util.Map)(spill4843_0)).containsKey(((java.lang.Object)(spill4843_1))))) {
        break forward_join_21;
    }
    forwardValue4843_26_0 = ((moom.oU)(((java.util.Map)(this.e)).get(((java.lang.Object)(this.c)))));
    break forward_join_26;
    }
    forwardValue4843_24_0 = this.e;
    forwardValue4843_24_1 = "en_US";
    }
    forwardValue4843_26_0 = ((moom.oU)(((java.util.Map)(forwardValue4843_24_0)).get(((java.lang.Object)(forwardValue4843_24_1)))));
    }
    return forwardValue4843_26_0;
}


public java.util.SortedSet<moom.oU> a() {
return com.google.common.collect.Sets.newTreeSet(((java.lang.Iterable)(((java.util.Map)(this.e)).values())));
}


private static java.lang.RuntimeException a(java.lang.RuntimeException p0) {
return p0;
}


public void a(moom.oU p0) {
this.c = ((java.lang.String)(((moom.oU)(p0)).a()));
    return;
}


public boolean a__Boolean() {
return (__sourceIntrinsic_booleanComparison((((moom.oW)(net.minecraft.client.resources.LanguageManager.d)).a__Boolean())) != 0);
}


public void a(java.util.List<net.minecraft.client.resources.IResourcePack> p0) { __sourceHandlerCall_ab47aa4a78940c945c98(this, p0); }


private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
