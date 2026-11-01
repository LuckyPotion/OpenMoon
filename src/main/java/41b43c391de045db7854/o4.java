package moom;


public class o4 implements moom.oP {

private static org.apache.logging.log4j.Logger a;

private static com.google.common.base.Joiner b;

private java.util.Map<java.lang.String, moom.oL> c;

private java.util.List<net.minecraft.client.resources.IResourceManagerReloadListener> d;

private java.util.Set<java.lang.String> e;

private net.minecraft.client.resources.data.IMetadataSerializer f;

private static long g;

public o4(net.minecraft.client.resources.data.IMetadataSerializer p0) {
super();
    this.c = com.google.common.collect.Maps.newHashMap();
    this.d = com.google.common.collect.Lists.newArrayList();
    this.e = com.google.common.collect.Sets.newLinkedHashSet();
    this.f = p0;
}


static {
moom.o4.g = (moom._c.a(-9059146445500304724L, 8043398707669369573L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(120390395078412L);
    moom.o4.a = org.apache.logging.log4j.LogManager.getLogger();
    moom.o4.b = com.google.common.base.Joiner.on(", ");
}

private static native <E extends Throwable> void __sourceHandlerCall_0c8d975f774d3f4db905(moom.o4 a0, java.util.List a1) throws E;
private static final class __SourceHandler_0c8d975f774d3f4db905 {

public static void f1081(moom.o4 receiver, java.util.List p0) throws Throwable {
    java.lang.String[] spill1081_0;
    long life2_3;
    java.lang.String[] life4_15;
    java.util.Iterator life5_18;
    net.minecraft.client.resources.IResourcePack life6_25;
    lexical_join_35: {
    lexical_join_33: {
    life2_3 = (__fieldRead1081_0() ^ 38151526028934L);
    spill1081_0 = __call1081_1();
    __call1081_2(receiver);
    __call1081_9(__fieldRead1081_3(), __invokedynamic1081_8(__call1081_7(__fieldRead1081_4(), __call1081_6(p0, __invokedynamic1081_5()))));
    life4_15 = spill1081_0;
    life5_18 = __call1081_10(p0);
    lexical_cycle_19: while (true) {
    if (!(__call1081_11(life5_18))) {
        break lexical_join_33;
    }
    life6_25 = __cast1081_13(__call1081_12(life5_18));
    __call1081_14(receiver, life6_25);
    if (!((life4_15 != null))) {
        break lexical_join_35;
    }
    if (!((life4_15 == null))) { continue lexical_cycle_19; }
    break lexical_cycle_19;
    }
    }
    __call1081_15(receiver);
    }
    return;
}
public static void h1081_0(moom.Oo p0) throws Throwable {
    throw __call1108100_0(p0);
}
private static native long __fieldRead1081_0() throws Throwable;
private static native java.lang.String[] __call1081_1() throws Throwable;
private static native void __call1081_2(moom.o4 a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead1081_3() throws Throwable;
private static native com.google.common.base.Joiner __fieldRead1081_4() throws Throwable;
private static native com.google.common.base.Function __invokedynamic1081_5() throws Throwable;
private static native java.lang.Iterable __call1081_6(java.util.List a0, com.google.common.base.Function a1) throws Throwable;
private static native java.lang.String __call1081_7(com.google.common.base.Joiner a0, java.lang.Iterable a1) throws Throwable;
private static native java.lang.String __invokedynamic1081_8(java.lang.String a0) throws Throwable;
private static native void __call1081_9(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native java.util.Iterator __call1081_10(java.util.List a0) throws Throwable;
private static native boolean __call1081_11(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1081_12(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.client.resources.IResourcePack __cast1081_13(java.lang.Object a0) throws Throwable;
private static native void __call1081_14(moom.o4 a0, net.minecraft.client.resources.IResourcePack a1) throws Throwable;
private static native void __call1081_15(moom.o4 a0) throws Throwable;
private static native java.lang.Exception __call1108100_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> java.util.List __sourceHandlerCall_31aca42a5dc963dd8e29(moom.o4 a0, moom.DD a1) throws E;
private static final class __SourceHandler_31aca42a5dc963dd8e29 {

public static java.util.List f1082(moom.o4 receiver, moom.DD p0) throws Throwable {
    moom.oR forwardValue1082_18_0;
    java.lang.String[] spill1082_0;
    moom.oR spill1082_1;
    long life2_3;
    moom.oR life5_11;
    java.lang.String[] life4_12;
    forward_join_21: {
    forward_join_18: {
    life2_3 = (__fieldRead1082_0() ^ 80198806509690L);
    spill1082_0 = __call1082_1();
    life5_11 = __cast1082_5(__call1082_4(__fieldRead1082_2(receiver), __call1082_3(p0)));
    life4_12 = spill1082_0;
    spill1082_1 = life5_11;
    if (!((life4_12 != null))) {
        forwardValue1082_18_0 = spill1082_1;
        break forward_join_18;
    }
    if (!((spill1082_1 != null))) {
        break forward_join_21;
    }
    forwardValue1082_18_0 = life5_11;
    }
    return __call1082_6(forwardValue1082_18_0, p0);
    }
    throw new java.io.FileNotFoundException(__call1082_7(p0));
}
public static void h1082_0(java.io.IOException p0) throws Throwable {
    throw __call1108200_0(p0);
}
private static native long __fieldRead1082_0() throws Throwable;
private static native java.lang.String[] __call1082_1() throws Throwable;
private static native java.util.Map __fieldRead1082_2(moom.o4 a0) throws Throwable;
private static native java.lang.String __call1082_3(moom.DD a0) throws Throwable;
private static native java.lang.Object __call1082_4(java.util.Map a0, java.lang.String a1) throws Throwable;
private static native moom.oR __cast1082_5(java.lang.Object a0) throws Throwable;
private static native java.util.List __call1082_6(moom.oR a0, moom.DD a1) throws Throwable;
private static native java.lang.String __call1082_7(moom.DD a0) throws Throwable;
private static native java.lang.Exception __call1108200_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_e904c10c2eb64a42fd4b(moom.o4 a0, net.minecraft.client.resources.IResourcePack a1) throws E;
private static final class __SourceHandler_e904c10c2eb64a42fd4b {

public static void f1083(moom.o4 receiver, net.minecraft.client.resources.IResourcePack p0) throws Throwable {
    moom.oL lexicalValue1083_45_0;
    java.lang.String[] spill1083_0;
    moom.oL spill1083_1;
    long life2_3;
    java.util.Iterator life5_8;
    java.lang.String[] life4_9;
    java.lang.String life6_16;
    moom.oL life7_27;
    lexical_join_49: {
    life2_3 = (__fieldRead1083_0() ^ 112626160762685L);
    spill1083_0 = __call1083_1();
    life5_8 = __call1083_3(__call1083_2(p0));
    life4_9 = spill1083_0;
    lexical_cycle_10: while (true) {
    lexical_join_45: {
    lexical_join_44: {
    if (!(__call1083_4(life5_8))) {
        break lexical_join_49;
    }
    life6_16 = __cast1083_6(__call1083_5(life5_8));
    __call1083_8(__fieldRead1083_7(receiver), life6_16);
    life7_27 = __cast1083_11(__call1083_10(__fieldRead1083_9(receiver), life6_16));
    spill1083_1 = life7_27;
    if (!((life4_9 != null))) {
        lexicalValue1083_45_0 = spill1083_1;
        break lexical_join_45;
    }
    if (!((spill1083_1 == null))) {
        break lexical_join_44;
    }
    life7_27 = new moom.oL(__fieldRead1083_12(receiver));
    __call1083_14(__fieldRead1083_13(receiver), life6_16, life7_27);
    }
    lexicalValue1083_45_0 = life7_27;
    }
    __call1083_15(lexicalValue1083_45_0, p0);
    if (!((life4_9 == null))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    return;
}
public static void h1083_0(moom.Oo p0) throws Throwable {
    throw __call1108300_0(p0);
}
private static native long __fieldRead1083_0() throws Throwable;
private static native java.lang.String[] __call1083_1() throws Throwable;
private static native java.util.Set __call1083_2(net.minecraft.client.resources.IResourcePack a0) throws Throwable;
private static native java.util.Iterator __call1083_3(java.util.Set a0) throws Throwable;
private static native boolean __call1083_4(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1083_5(java.util.Iterator a0) throws Throwable;
private static native java.lang.String __cast1083_6(java.lang.Object a0) throws Throwable;
private static native java.util.Set __fieldRead1083_7(moom.o4 a0) throws Throwable;
private static native boolean __call1083_8(java.util.Set a0, java.lang.String a1) throws Throwable;
private static native java.util.Map __fieldRead1083_9(moom.o4 a0) throws Throwable;
private static native java.lang.Object __call1083_10(java.util.Map a0, java.lang.String a1) throws Throwable;
private static native moom.oL __cast1083_11(java.lang.Object a0) throws Throwable;
private static native net.minecraft.client.resources.data.IMetadataSerializer __fieldRead1083_12(moom.o4 a0) throws Throwable;
private static native java.util.Map __fieldRead1083_13(moom.o4 a0) throws Throwable;
private static native java.lang.Object __call1083_14(java.util.Map a0, java.lang.String a1, moom.oL a2) throws Throwable;
private static native void __call1083_15(moom.oL a0, net.minecraft.client.resources.IResourcePack a1) throws Throwable;
private static native java.lang.Exception __call1108300_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.client.resources.IResource __sourceHandlerCall_bf92de283eb6c0326fbe(moom.o4 a0, moom.DD a1) throws E;
private static final class __SourceHandler_bf92de283eb6c0326fbe {

public static net.minecraft.client.resources.IResource f1084(moom.o4 receiver, moom.DD p0) throws Throwable {
    moom.oR forwardValue1084_18_0;
    java.lang.String[] spill1084_0;
    moom.oR spill1084_1;
    long life2_3;
    moom.oR life5_11;
    java.lang.String[] life4_12;
    forward_join_21: {
    forward_join_18: {
    life2_3 = (__fieldRead1084_0() ^ 1725719270339L);
    spill1084_0 = __call1084_1();
    life5_11 = __cast1084_5(__call1084_4(__fieldRead1084_2(receiver), __call1084_3(p0)));
    life4_12 = spill1084_0;
    spill1084_1 = life5_11;
    if (!((life4_12 != null))) {
        forwardValue1084_18_0 = spill1084_1;
        break forward_join_18;
    }
    if (!((spill1084_1 != null))) {
        break forward_join_21;
    }
    forwardValue1084_18_0 = life5_11;
    }
    return __call1084_6(forwardValue1084_18_0, p0);
    }
    throw new java.io.FileNotFoundException(__call1084_7(p0));
}
public static void h1084_0(java.io.IOException p0) throws Throwable {
    throw __call1108400_0(p0);
}
private static native long __fieldRead1084_0() throws Throwable;
private static native java.lang.String[] __call1084_1() throws Throwable;
private static native java.util.Map __fieldRead1084_2(moom.o4 a0) throws Throwable;
private static native java.lang.String __call1084_3(moom.DD a0) throws Throwable;
private static native java.lang.Object __call1084_4(java.util.Map a0, java.lang.String a1) throws Throwable;
private static native moom.oR __cast1084_5(java.lang.Object a0) throws Throwable;
private static native net.minecraft.client.resources.IResource __call1084_6(moom.oR a0, moom.DD a1) throws Throwable;
private static native java.lang.String __call1084_7(moom.DD a0) throws Throwable;
private static native java.lang.Exception __call1108400_0(java.io.IOException a0) throws Throwable;

}


private void b() {
java.lang.String[] spill1254_0;
    long life1_3;
    java.util.Iterator life4_8;
    java.lang.String[] life3_9;
    net.minecraft.client.resources.IResourceManagerReloadListener life5_16;
    lexical_join_22: {
    life1_3 = (moom.o4.g ^ 1814952110908L);
    spill1254_0 = moom.oO.b();
    life4_8 = ((java.util.List)(this.d)).iterator();
    life3_9 = spill1254_0;
    lexical_cycle_10: while (true) {
    if (!(((java.util.Iterator)(life4_8)).hasNext())) {
        break lexical_join_22;
    }
    life5_16 = ((net.minecraft.client.resources.IResourceManagerReloadListener)(((java.util.Iterator)(life4_8)).next()));
    ((net.minecraft.client.resources.IResourceManagerReloadListener)(life5_16)).b(((moom.oR)(this)));
    if (!((life3_9 == null))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    return;
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public void a(net.minecraft.client.resources.IResourceManagerReloadListener p0) {
((java.util.List)(this.d)).add(((java.lang.Object)(p0)));
    ((net.minecraft.client.resources.IResourceManagerReloadListener)(p0)).b(((moom.oR)(this)));
    return;
}


public void a(java.util.List<net.minecraft.client.resources.IResourcePack> p0) { __sourceHandlerCall_0c8d975f774d3f4db905(this, p0); }


public void a(net.minecraft.client.resources.IResourcePack p0) { __sourceHandlerCall_e904c10c2eb64a42fd4b(this, p0); }


public java.util.Set<java.lang.String> a() {
return this.e;
}


public net.minecraft.client.resources.IResource a__oQ(moom.DD p0) throws java.io.IOException { return __sourceHandlerCall_bf92de283eb6c0326fbe(this, p0); }


public java.util.List<net.minecraft.client.resources.IResource> a(moom.DD p0) throws java.io.IOException { return __sourceHandlerCall_31aca42a5dc963dd8e29(this, p0); }


private void a__Void() {
((java.util.Map)(this.c)).clear();
    ((java.util.Set)(this.e)).clear();
    return;
}

}
