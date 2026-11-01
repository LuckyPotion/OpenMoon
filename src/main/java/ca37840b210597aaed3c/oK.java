package moom;


public class oK implements net.minecraft.client.resources.IResourcePack {

public static java.util.Set<java.lang.String> a;

private java.util.Map<java.lang.String, java.io.File> b;

private static long c;

public oK(java.util.Map<java.lang.String, java.io.File> p0) {
super();
    this.b = p0;
}


static {
moom.oK.c = (moom._c.a(2135153392191287032L, 3313836597624949717L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(117165031889172L);
    moom.oK.a = com.google.common.collect.ImmutableSet.of("minecraft", "realms");
}

private static native <E extends Throwable> java.io.InputStream __sourceHandlerCall_a5f6755db8f7b575dd6c(moom.oK a0, moom.DD a1) throws E;
private static final class __SourceHandler_a5f6755db8f7b575dd6c {

public static java.io.InputStream f1085(moom.oK receiver, moom.DD p0) throws Throwable {
    java.io.InputStream forwardValue1085_19_0;
    java.io.InputStream forwardValue1085_25_0;
    java.lang.String[] spill1085_0;
    java.io.InputStream spill1085_1;
    java.io.InputStream spill1085_2;
    long life2_3;
    java.io.InputStream life5_8;
    java.lang.String[] life4_9;
    java.io.InputStream life6_24;
    forward_join_26: {
    forward_join_25: {
    forward_join_19: {
    forward_join_16: {
    life2_3 = (__fieldRead1085_0() ^ 38695879267977L);
    spill1085_0 = __call1085_1();
    life5_8 = __call1085_2(receiver, p0);
    life4_9 = spill1085_0;
    spill1085_1 = life5_8;
    if (!((life4_9 != null))) {
        forwardValue1085_19_0 = spill1085_1;
        break forward_join_19;
    }
    if (!((spill1085_1 != null))) {
        break forward_join_16;
    }
    return life5_8;
    }
    forwardValue1085_19_0 = __call1085_3(receiver, p0);
    }
    life6_24 = forwardValue1085_19_0;
    spill1085_2 = life6_24;
    if (!((life4_9 != null))) {
        forwardValue1085_25_0 = spill1085_2;
        break forward_join_25;
    }
    if (!((spill1085_2 != null))) {
        break forward_join_26;
    }
    forwardValue1085_25_0 = life6_24;
    }
    return forwardValue1085_25_0;
    }
    throw new java.io.FileNotFoundException(__call1085_4(p0));
}
public static void h1085_0(java.io.IOException p0) throws Throwable {
    throw __call1108500_0(p0);
}
public static void h1085_1(java.io.IOException p0) throws Throwable {
    throw __call1108501_0(p0);
}
public static void h1085_2(java.io.IOException p0) throws Throwable {
    throw __call1108502_0(p0);
}
private static native long __fieldRead1085_0() throws Throwable;
private static native java.lang.String[] __call1085_1() throws Throwable;
private static native java.io.InputStream __call1085_2(moom.oK a0, moom.DD a1) throws Throwable;
private static native java.io.InputStream __call1085_3(moom.oK a0, moom.DD a1) throws Throwable;
private static native java.lang.String __call1085_4(moom.DD a0) throws Throwable;
private static native java.lang.Exception __call1108500_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1108501_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1108502_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.client.resources.data.IMetadataSection __sourceHandlerCall_281d13758bbab77fb54a(moom.oK a0, net.minecraft.client.resources.data.IMetadataSerializer a1, java.lang.String a2) throws E;
private static final class __SourceHandler_281d13758bbab77fb54a {

public static net.minecraft.client.resources.data.IMetadataSection f191(moom.oK receiver, net.minecraft.client.resources.data.IMetadataSerializer p0, java.lang.String p1) throws Throwable {
    java.io.FileInputStream life3_8;
    life3_8 = new java.io.FileInputStream(__cast191_2(__call191_1(__fieldRead191_0(receiver), "pack.mcmeta")));
    return __call191_3(p0, life3_8, p1);
}
public static net.minecraft.client.resources.data.IMetadataSection h191_0(java.lang.Exception p0) throws Throwable {
    java.lang.Exception local1 = p0;
    return null;
}
private static native java.util.Map __fieldRead191_0(moom.oK a0) throws Throwable;
private static native java.lang.Object __call191_1(java.util.Map a0, java.lang.String a1) throws Throwable;
private static native java.io.File __cast191_2(java.lang.Object a0) throws Throwable;
private static native net.minecraft.client.resources.data.IMetadataSection __call191_3(net.minecraft.client.resources.data.IMetadataSerializer a0, java.io.FileInputStream a1, java.lang.String a2) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_0301bf548f186429b104(moom.oK a0, moom.DD a1) throws E;
private static final class __SourceHandler_0301bf548f186429b104 {

public static boolean f1086(moom.oK receiver, moom.DD p0) throws Throwable {
    moom.oK forwardValue1086_13_0;
    int forwardValue1086_21_0;
    int forwardValue1086_23_0;
    moom.oK spill1086_0;
    boolean spill1086_1;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_23: {
    forward_join_22: {
    forward_join_21: {
    forward_join_20: {
    forward_join_13: {
    life2_3 = (__fieldRead1086_0() ^ 45068351888309L);
    life4_5 = __call1086_1();
    spill1086_0 = receiver;
    if (!((life4_5 != null))) {
        forwardValue1086_13_0 = spill1086_0;
        break forward_join_13;
    }
    if (!((__call1086_2(spill1086_0, p0) == null))) {
        break forward_join_20;
    }
    forwardValue1086_13_0 = receiver;
    }
    spill1086_1 = __call1086_5(__fieldRead1086_3(forwardValue1086_13_0), __call1086_4(p0));
    if (!((life4_5 != null))) {
        forwardValue1086_21_0 = __integerCategory1086_6(spill1086_1);
        break forward_join_21;
    }
    if (!(spill1086_1)) {
        break forward_join_22;
    }
    }
    forwardValue1086_21_0 = 1;
    }
    forwardValue1086_23_0 = forwardValue1086_21_0;
    break forward_join_23;
    }
    forwardValue1086_23_0 = 0;
    }
    return __integerCategory1086_7(forwardValue1086_23_0);
}
public static void h1086_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call1108600_0(p0);
}
public static void h1086_1(java.lang.RuntimeException p0) throws Throwable {
    throw __call1108601_0(p0);
}
public static void h1086_2(java.lang.RuntimeException p0) throws Throwable {
    throw __call1108602_0(p0);
}
private static native long __fieldRead1086_0() throws Throwable;
private static native java.lang.String[] __call1086_1() throws Throwable;
private static native java.io.InputStream __call1086_2(moom.oK a0, moom.DD a1) throws Throwable;
private static native java.util.Map __fieldRead1086_3(moom.oK a0) throws Throwable;
private static native java.lang.String __call1086_4(moom.DD a0) throws Throwable;
private static native boolean __call1086_5(java.util.Map a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1086_6(boolean value) throws Throwable;
private static native boolean __integerCategory1086_7(int value) throws Throwable;
private static native java.lang.Exception __call1108600_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1108601_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1108602_0(java.lang.RuntimeException a0) throws Throwable;

}

private static native <E extends Throwable> java.io.InputStream __sourceHandlerCall_d54df3e147f4440ebaa7(moom.oK a0, moom.DD a1) throws E;
private static final class __SourceHandler_d54df3e147f4440ebaa7 {

public static java.io.InputStream f1087(moom.oK receiver, moom.DD p0) throws Throwable {
    java.io.File forwardValue1087_18_0;
    java.io.FileInputStream forwardValue1087_26_0;
    java.lang.String[] spill1087_0;
    java.io.File spill1087_1;
    long life2_3;
    java.io.File life5_11;
    java.lang.String[] life4_12;
    forward_join_26: {
    forward_join_25: {
    forward_join_18: {
    life2_3 = (__fieldRead1087_0() ^ 67347468906178L);
    spill1087_0 = __call1087_1();
    life5_11 = __cast1087_5(__call1087_4(__fieldRead1087_2(receiver), __call1087_3(p0)));
    life4_12 = spill1087_0;
    spill1087_1 = life5_11;
    if (!((life4_12 != null))) {
        forwardValue1087_18_0 = spill1087_1;
        break forward_join_18;
    }
    if (!((spill1087_1 != null))) {
        break forward_join_25;
    }
    forwardValue1087_18_0 = life5_11;
    }
    if (!(__call1087_6(forwardValue1087_18_0))) {
        break forward_join_25;
    }
    forwardValue1087_26_0 = new java.io.FileInputStream(life5_11);
    break forward_join_26;
    }
    forwardValue1087_26_0 = null;
    }
    return forwardValue1087_26_0;
}
public static void h1087_0(java.io.IOException p0) throws Throwable {
    throw __call1108700_0(p0);
}
public static void h1087_1(java.io.IOException p0) throws Throwable {
    throw __call1108701_0(p0);
}
private static native long __fieldRead1087_0() throws Throwable;
private static native java.lang.String[] __call1087_1() throws Throwable;
private static native java.util.Map __fieldRead1087_2(moom.oK a0) throws Throwable;
private static native java.lang.String __call1087_3(moom.DD a0) throws Throwable;
private static native java.lang.Object __call1087_4(java.util.Map a0, java.lang.String a1) throws Throwable;
private static native java.io.File __cast1087_5(java.lang.Object a0) throws Throwable;
private static native boolean __call1087_6(java.io.File a0) throws Throwable;
private static native java.lang.Exception __call1108700_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1108701_0(java.io.IOException a0) throws Throwable;

}


public java.io.InputStream b(moom.DD p0) throws java.io.IOException { return __sourceHandlerCall_d54df3e147f4440ebaa7(this, p0); }


private java.io.InputStream c(moom.DD p0) {
java.lang.String local2 = __sourceIntrinsic_492fa3fa96e3_originalDynamicSite1577_2(((moom.DD)(p0)).b(), ((moom.DD)(p0)).a());
    return ((java.lang.Class)(moom.oK.class)).getResourceAsStream(((java.lang.String)(local2)));
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public java.lang.String a__String() {
return "Default";
}


public java.awt.image.BufferedImage a() throws java.io.IOException {
return moom.ol.a(((java.io.InputStream)(((java.lang.Class)(moom.oK.class)).getResourceAsStream(((java.lang.String)(__sourceIntrinsic_19271942b8a6_originalDynamicSite1578_2(((moom.DD)(new moom.DD("pack.png"))).a())))))));
}


public java.io.InputStream a(moom.DD p0) throws java.io.IOException { return __sourceHandlerCall_a5f6755db8f7b575dd6c(this, p0); }


public boolean a__Boolean(moom.DD p0) { return __sourceHandlerCall_0301bf548f186429b104(this, p0); }


public java.util.Set<java.lang.String> a__Set() {
return moom.oK.a;
}


public <T extends net.minecraft.client.resources.data.IMetadataSection> T a(net.minecraft.client.resources.data.IMetadataSerializer p0, java.lang.String p1) throws java.io.IOException { return ((T)(__sourceHandlerCall_281d13758bbab77fb54a(this, p0, p1))); }


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_19271942b8a6_originalDynamicSite1578_2(java.lang.String a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_492fa3fa96e3_originalDynamicSite1577_2(java.lang.String a0, java.lang.String a1) throws E;
}
