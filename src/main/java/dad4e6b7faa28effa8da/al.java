package com.moon;


public final class al extends com.google.protobuf.GeneratedMessageV3.Builder<com.moon.al> implements com.moon.oG {

private java.lang.Object a;

private java.lang.Object b;

private int c;

private int d;

private com.moon.K e;

private com.google.protobuf.SingleFieldBuilderV3<com.moon.K, com.moon.am, com.moon.oH> f;

private long g;

private boolean h;

private boolean i;

private boolean j;

private static long k;

private al() {
super();
    this.a = "";
    this.b = "";
}


private al(com.google.protobuf.GeneratedMessageV3.BuilderParent p0) {
super(p0);
    this.a = ((java.lang.Object)(""));
    this.b = ((java.lang.Object)(""));
    return;
}


static {
com.moon.al.k = (moom._c.a(1330995228062636317L, 3194191619427620984L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(116382339442476L);
}

private static native <E extends Throwable> com.moon.al __sourceHandlerCall_d1d599903fa7e0065557(com.moon.al a0, com.google.protobuf.ByteString a1) throws E;
private static final class __SourceHandler_d1d599903fa7e0065557 {

public static com.moon.al f339(com.moon.al receiver, com.google.protobuf.ByteString p0) throws Throwable {
    com.google.protobuf.ByteString forwardValue339_15_0;
    com.google.protobuf.ByteString spill339_0;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_15: {
    forward_join_14: {
    life2_3 = (__fieldRead339_0() ^ 18960646261912L);
    life4_5 = __call339_1();
    spill339_0 = p0;
    if (!((life4_5 == null))) {
        forwardValue339_15_0 = spill339_0;
        break forward_join_15;
    }
    if (!((spill339_0 == null))) {
        break forward_join_14;
    }
    throw new java.lang.NullPointerException();
    }
    forwardValue339_15_0 = p0;
    }
    __call339_2(forwardValue339_15_0);
    __fieldWrite339_3(receiver, p0);
    __call339_4(receiver);
    return receiver;
}
public static void h339_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1033900_0(p0);
}
public static void h339_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call1033901_0(p0);
}
private static native long __fieldRead339_0() throws Throwable;
private static native java.lang.String[] __call339_1() throws Throwable;
private static native void __call339_2(com.google.protobuf.ByteString a0) throws Throwable;
private static native void __fieldWrite339_3(com.moon.al a0, com.google.protobuf.ByteString a1) throws Throwable;
private static native void __call339_4(com.moon.al a0) throws Throwable;
private static native java.lang.Exception __call1033900_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1033901_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.al __sourceHandlerCall_d47632d8cd04fccc0ec7(com.moon.al a0, com.google.protobuf.CodedInputStream a1, com.google.protobuf.ExtensionRegistryLite a2) throws E;
private static final class __SourceHandler_d47632d8cd04fccc0ec7 {

public static com.moon.al f19(com.moon.al receiver, com.google.protobuf.CodedInputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws Throwable {
    int lexicalValue19_90_0;
    int lexicalValue19_94_0;
    int spill19_0;
    long life3_3;
    java.lang.String[] life5_5;
    int life6_15;
    int life7_20;
    lexical_join_99: {
    lexical_join_97: {
    lexical_join_12: {
    life3_3 = (__fieldRead19_0() ^ 66386863615762L);
    life5_5 = __call19_1();
    if (!((p1 == null))) {
        break lexical_join_12;
    }
    throw new java.lang.NullPointerException();
    }
    life6_15 = 0;
    lexical_cycle_14: while (true) {
    lexical_join_95: {
    lexical_join_94: {
    lexical_join_90: {
    lexical_join_85: {
    lexical_join_79: {
    lexical_join_73: {
    lexical_join_67: {
    lexical_join_61: {
    lexical_join_53: {
    lexical_join_47: {
    lexical_join_41: {
    lexical_join_35: {
    lexical_join_29: {
    lexical_join_25: {
    if (!((life6_15 == 0))) {
        break lexical_join_97;
    }
    life7_20 = __call19_2(p0);
    if (!((life5_5 == null))) {
        break lexical_join_99;
    }
    spill19_0 = life7_20;
    if (!((life5_5 == null))) {
        lexicalValue19_90_0 = spill19_0;
        break lexical_join_90;
    }
    switch (spill19_0) {
case 0:
{
        break lexical_join_25;
    }
case 10:
{
        break lexical_join_29;
    }
case 18:
{
        break lexical_join_35;
    }
case 24:
{
        break lexical_join_41;
    }
case 32:
{
        break lexical_join_47;
    }
case 42:
{
        break lexical_join_53;
    }
case 48:
{
        break lexical_join_61;
    }
case 56:
{
        break lexical_join_67;
    }
case 64:
{
        break lexical_join_73;
    }
case 72:
{
        break lexical_join_79;
    }
default:
{
        break lexical_join_85;
    }
}
    }
    life6_15 = 1;
    if (!((life5_5 != null))) {
        break lexical_join_95;
    }
    }
    __fieldWrite19_4(receiver, __call19_3(p0));
    if (!((life5_5 != null))) {
        break lexical_join_95;
    }
    }
    __fieldWrite19_6(receiver, __call19_5(p0));
    if (!((life5_5 != null))) {
        break lexical_join_95;
    }
    }
    __fieldWrite19_8(receiver, __call19_7(p0));
    if (!((life5_5 != null))) {
        break lexical_join_95;
    }
    }
    __fieldWrite19_10(receiver, __call19_9(p0));
    if (!((life5_5 != null))) {
        break lexical_join_95;
    }
    }
    __call19_13(p0, __call19_12(__call19_11(receiver)), p1);
    if (!((life5_5 != null))) {
        break lexical_join_95;
    }
    }
    __fieldWrite19_15(receiver, __call19_14(p0));
    if (!((life5_5 != null))) {
        break lexical_join_95;
    }
    }
    __fieldWrite19_17(receiver, __call19_16(p0));
    if (!((life5_5 != null))) {
        break lexical_join_95;
    }
    }
    __fieldWrite19_19(receiver, __call19_18(p0));
    if (!((life5_5 != null))) {
        break lexical_join_95;
    }
    }
    __fieldWrite19_21(receiver, __call19_20(p0));
    if (!((life5_5 != null))) {
        break lexical_join_95;
    }
    }
    lexicalValue19_90_0 = __integerCategory19_23(__call19_22(receiver, p0, p1, life7_20));
    }
    if (!((life5_5 == null))) {
        lexicalValue19_94_0 = lexicalValue19_90_0;
        break lexical_join_94;
    }
    if (!((lexicalValue19_90_0 == 0))) {
        break lexical_join_95;
    }
    lexicalValue19_94_0 = 1;
    }
    life6_15 = lexicalValue19_94_0;
    }
    if (!((life5_5 != null))) { continue lexical_cycle_14; }
    break lexical_cycle_14;
    }
    }
    __call19_24(receiver);
    }
    return receiver;
}
public static com.moon.al h19_0(com.google.protobuf.InvalidProtocolBufferException p0) throws Throwable {
    throw __call3001900_0(p0);
}
public static com.moon.al h19_1(com.google.protobuf.InvalidProtocolBufferException p0) throws Throwable {
    throw __call3001901_0(p0);
}
public static com.moon.al h19_2(com.google.protobuf.InvalidProtocolBufferException p0) throws Throwable {
    throw __call3001902_0(p0);
}
public static com.moon.al h19_3(com.google.protobuf.InvalidProtocolBufferException p0) throws Throwable {
    throw __call3001903_0(p0);
}
public static com.moon.al h19_4(com.google.protobuf.InvalidProtocolBufferException p0) throws Throwable {
    throw __call3001904_0(p0);
}
public static com.moon.al h19_5(com.google.protobuf.InvalidProtocolBufferException p0) throws Throwable {
    throw __call3001905_0(p0);
}
public static com.moon.al h19_6(com.google.protobuf.InvalidProtocolBufferException p0) throws Throwable {
    throw __call3001906_0(p0);
}
public static com.moon.al h19_7(com.google.protobuf.InvalidProtocolBufferException p0) throws Throwable {
    throw __call3001907_0(p0);
}
public static com.moon.al h19_8(com.google.protobuf.InvalidProtocolBufferException p0) throws Throwable {
    throw __call3001908_0(p0);
}
public static com.moon.al h19_9(com.google.protobuf.InvalidProtocolBufferException p0) throws Throwable {
    throw __call3001909_0(p0);
}
public static com.moon.al h19_10(com.google.protobuf.InvalidProtocolBufferException p0) throws Throwable {
    throw __call3001910_0(p0);
}
public static com.moon.al h19_11(com.google.protobuf.InvalidProtocolBufferException p0) throws Throwable {
    throw __call3001911_0(p0);
}
public static com.moon.al h19_12(com.google.protobuf.InvalidProtocolBufferException p0) throws Throwable {
    throw __call3001912_0(p0);
}
public static com.moon.al h19_13(com.google.protobuf.InvalidProtocolBufferException p0) throws Throwable {
    throw __call3001913_0(p0);
}
public static com.moon.al h19_14(com.google.protobuf.InvalidProtocolBufferException p0, int p1) throws Throwable {
    com.google.protobuf.InvalidProtocolBufferException life1_2;
    life1_2 = p0;
    throw __call3001914_0(life1_2);
}
public static com.moon.al h19_15(java.lang.Throwable p0, com.moon.al p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __call3001915_0(p1);
    throw life2_2;
}
private static native long __fieldRead19_0() throws Throwable;
private static native java.lang.String[] __call19_1() throws Throwable;
private static native int __call19_2(com.google.protobuf.CodedInputStream a0) throws Throwable;
private static native java.lang.String __call19_3(com.google.protobuf.CodedInputStream a0) throws Throwable;
private static native void __fieldWrite19_4(com.moon.al a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call19_5(com.google.protobuf.CodedInputStream a0) throws Throwable;
private static native void __fieldWrite19_6(com.moon.al a0, java.lang.String a1) throws Throwable;
private static native int __call19_7(com.google.protobuf.CodedInputStream a0) throws Throwable;
private static native void __fieldWrite19_8(com.moon.al a0, int a1) throws Throwable;
private static native int __call19_9(com.google.protobuf.CodedInputStream a0) throws Throwable;
private static native void __fieldWrite19_10(com.moon.al a0, int a1) throws Throwable;
private static native com.google.protobuf.SingleFieldBuilderV3 __call19_11(com.moon.al a0) throws Throwable;
private static native com.google.protobuf.AbstractMessage.Builder __call19_12(com.google.protobuf.SingleFieldBuilderV3 a0) throws Throwable;
private static native void __call19_13(com.google.protobuf.CodedInputStream a0, com.google.protobuf.AbstractMessage.Builder a1, com.google.protobuf.ExtensionRegistryLite a2) throws Throwable;
private static native long __call19_14(com.google.protobuf.CodedInputStream a0) throws Throwable;
private static native void __fieldWrite19_15(com.moon.al a0, long a1) throws Throwable;
private static native boolean __call19_16(com.google.protobuf.CodedInputStream a0) throws Throwable;
private static native void __fieldWrite19_17(com.moon.al a0, boolean a1) throws Throwable;
private static native boolean __call19_18(com.google.protobuf.CodedInputStream a0) throws Throwable;
private static native void __fieldWrite19_19(com.moon.al a0, boolean a1) throws Throwable;
private static native boolean __call19_20(com.google.protobuf.CodedInputStream a0) throws Throwable;
private static native void __fieldWrite19_21(com.moon.al a0, boolean a1) throws Throwable;
private static native boolean __call19_22(com.moon.al a0, com.google.protobuf.CodedInputStream a1, com.google.protobuf.ExtensionRegistryLite a2, int a3) throws Throwable;
private static native int __integerCategory19_23(boolean value) throws Throwable;
private static native void __call19_24(com.moon.al a0) throws Throwable;
private static native java.lang.Exception __call3001900_0(com.google.protobuf.InvalidProtocolBufferException a0) throws Throwable;
private static native java.lang.Exception __call3001901_0(com.google.protobuf.InvalidProtocolBufferException a0) throws Throwable;
private static native java.lang.Exception __call3001902_0(com.google.protobuf.InvalidProtocolBufferException a0) throws Throwable;
private static native java.lang.Exception __call3001903_0(com.google.protobuf.InvalidProtocolBufferException a0) throws Throwable;
private static native java.lang.Exception __call3001904_0(com.google.protobuf.InvalidProtocolBufferException a0) throws Throwable;
private static native java.lang.Exception __call3001905_0(com.google.protobuf.InvalidProtocolBufferException a0) throws Throwable;
private static native java.lang.Exception __call3001906_0(com.google.protobuf.InvalidProtocolBufferException a0) throws Throwable;
private static native java.lang.Exception __call3001907_0(com.google.protobuf.InvalidProtocolBufferException a0) throws Throwable;
private static native java.lang.Exception __call3001908_0(com.google.protobuf.InvalidProtocolBufferException a0) throws Throwable;
private static native java.lang.Exception __call3001909_0(com.google.protobuf.InvalidProtocolBufferException a0) throws Throwable;
private static native java.lang.Exception __call3001910_0(com.google.protobuf.InvalidProtocolBufferException a0) throws Throwable;
private static native java.lang.Exception __call3001911_0(com.google.protobuf.InvalidProtocolBufferException a0) throws Throwable;
private static native java.lang.Exception __call3001912_0(com.google.protobuf.InvalidProtocolBufferException a0) throws Throwable;
private static native java.lang.Exception __call3001913_0(com.google.protobuf.InvalidProtocolBufferException a0) throws Throwable;
private static native java.io.IOException __call3001914_0(com.google.protobuf.InvalidProtocolBufferException a0) throws Throwable;
private static native void __call3001915_0(com.moon.al a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.al __sourceHandlerCall_ddacbd9bdd0d29e6de51(com.moon.al a0, com.google.protobuf.Message a1) throws E;
private static final class __SourceHandler_ddacbd9bdd0d29e6de51 {

public static com.moon.al f428(com.moon.al receiver, com.google.protobuf.Message p0) throws Throwable {
    long life2_3;
    java.lang.String[] life4_5;
    life2_3 = (__fieldRead428_0() ^ 72703929952613L);
    life4_5 = __call428_1();
    if ((life4_5 == null)) {
        if ((__instanceOf428_2(p0) != 0)) {
        return __call428_4(receiver, __cast428_3(p0));
    }
        __call428_5(receiver, p0);
    }
    return receiver;
}
public static void h428_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1042800_0(p0);
}
public static void h428_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call1042801_0(p0);
}
private static native long __fieldRead428_0() throws Throwable;
private static native java.lang.String[] __call428_1() throws Throwable;
private static native int __instanceOf428_2(com.google.protobuf.Message a0) throws Throwable;
private static native com.moon.J __cast428_3(com.google.protobuf.Message a0) throws Throwable;
private static native com.moon.al __call428_4(com.moon.al a0, com.moon.J a1) throws Throwable;
private static native com.google.protobuf.AbstractMessage.Builder __call428_5(com.moon.al a0, com.google.protobuf.Message a1) throws Throwable;
private static native java.lang.Exception __call1042800_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1042801_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.al __sourceHandlerCall_c4cc4b7f27e88a36362f(com.moon.al a0, com.moon.J a1) throws E;
private static final class __SourceHandler_c4cc4b7f27e88a36362f {

public static com.moon.al f340(com.moon.al receiver, com.moon.J p0) throws Throwable {
    com.moon.J forwardValue340_14_0;
    int forwardValue340_28_0;
    int forwardValue340_39_0;
    int forwardValue340_49_0;
    int forwardValue340_59_0;
    int forwardValue340_71_0;
    int forwardValue340_81_0;
    int forwardValue340_91_0;
    int forwardValue340_101_0;
    com.moon.J spill340_0;
    boolean spill340_1;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_107: {
    forward_join_101: {
    forward_join_99: {
    forward_join_91: {
    forward_join_89: {
    forward_join_81: {
    forward_join_79: {
    forward_join_71: {
    forward_join_67: {
    forward_join_59: {
    forward_join_57: {
    forward_join_49: {
    forward_join_47: {
    forward_join_39: {
    forward_join_37: {
    forward_join_28: {
    forward_join_25: {
    forward_join_14: {
    forward_join_13: {
    life2_3 = (__fieldRead340_0() ^ 127630634146320L);
    life4_5 = __call340_1();
    spill340_0 = p0;
    if (!((life4_5 == null))) {
        forwardValue340_14_0 = spill340_0;
        break forward_join_14;
    }
    if (!((spill340_0 == __call340_2()))) {
        break forward_join_13;
    }
    return receiver;
    }
    forwardValue340_14_0 = p0;
    }
    spill340_1 = __call340_4(__call340_3(forwardValue340_14_0));
    if (!((life4_5 == null))) {
        forwardValue340_28_0 = __integerCategory340_5(spill340_1);
        break forward_join_28;
    }
    if (!((!spill340_1))) {
        break forward_join_25;
    }
    __fieldWrite340_7(receiver, __fieldRead340_6(p0));
    __call340_8(receiver);
    }
    forwardValue340_28_0 = __integerCategory340_11(__call340_10(__call340_9(p0)));
    }
    if (!((life4_5 == null))) {
        forwardValue340_39_0 = forwardValue340_28_0;
        break forward_join_39;
    }
    if (!((forwardValue340_28_0 == 0))) {
        break forward_join_37;
    }
    __fieldWrite340_13(receiver, __fieldRead340_12(p0));
    __call340_14(receiver);
    }
    forwardValue340_39_0 = __call340_15(p0);
    }
    if (!((life4_5 == null))) {
        forwardValue340_49_0 = forwardValue340_39_0;
        break forward_join_49;
    }
    if (!((forwardValue340_39_0 != 0))) {
        break forward_join_47;
    }
    __call340_17(receiver, __call340_16(p0));
    }
    forwardValue340_49_0 = __call340_18(p0);
    }
    if (!((life4_5 == null))) {
        forwardValue340_59_0 = forwardValue340_49_0;
        break forward_join_59;
    }
    if (!((forwardValue340_49_0 != 0))) {
        break forward_join_57;
    }
    __call340_20(receiver, __call340_19(p0));
    }
    forwardValue340_59_0 = __integerCategory340_22(__call340_21(p0));
    }
    if (!((life4_5 == null))) {
        forwardValue340_71_0 = forwardValue340_59_0;
        break forward_join_71;
    }
    if (!((forwardValue340_59_0 != 0))) {
        break forward_join_67;
    }
    __call340_24(receiver, __call340_23(p0));
    }
    forwardValue340_71_0 = __numericCompare340_26(__call340_25(p0), 0L);
    }
    if (!((life4_5 == null))) {
        forwardValue340_81_0 = forwardValue340_71_0;
        break forward_join_81;
    }
    if (!((forwardValue340_71_0 != 0))) {
        break forward_join_79;
    }
    __call340_28(receiver, __call340_27(p0));
    }
    forwardValue340_81_0 = __integerCategory340_30(__call340_29(p0));
    }
    if (!((life4_5 == null))) {
        forwardValue340_91_0 = forwardValue340_81_0;
        break forward_join_91;
    }
    if (!((forwardValue340_81_0 != 0))) {
        break forward_join_89;
    }
    __call340_32(receiver, __call340_31(p0));
    }
    forwardValue340_91_0 = __integerCategory340_34(__call340_33(p0));
    }
    if (!((life4_5 == null))) {
        forwardValue340_101_0 = forwardValue340_91_0;
        break forward_join_101;
    }
    if (!((forwardValue340_91_0 != 0))) {
        break forward_join_99;
    }
    __call340_36(receiver, __call340_35(p0));
    }
    forwardValue340_101_0 = __integerCategory340_38(__call340_37(p0));
    }
    if (!((forwardValue340_101_0 != 0))) {
        break forward_join_107;
    }
    __call340_40(receiver, __call340_39(p0));
    }
    __call340_42(receiver, __call340_41(p0));
    __call340_43(receiver);
    return receiver;
}
public static void h340_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1034000_0(p0);
}
public static void h340_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call1034001_0(p0);
}
public static void h340_2(java.lang.NullPointerException p0) throws Throwable {
    throw __call1034002_0(p0);
}
public static void h340_3(java.lang.NullPointerException p0) throws Throwable {
    throw __call1034003_0(p0);
}
public static void h340_4(java.lang.NullPointerException p0) throws Throwable {
    throw __call1034004_0(p0);
}
public static void h340_5(java.lang.NullPointerException p0) throws Throwable {
    throw __call1034005_0(p0);
}
public static void h340_6(java.lang.NullPointerException p0) throws Throwable {
    throw __call1034006_0(p0);
}
public static void h340_7(java.lang.NullPointerException p0) throws Throwable {
    throw __call1034007_0(p0);
}
public static void h340_8(java.lang.NullPointerException p0) throws Throwable {
    throw __call1034008_0(p0);
}
public static void h340_9(java.lang.NullPointerException p0) throws Throwable {
    throw __call1034009_0(p0);
}
public static void h340_10(java.lang.NullPointerException p0) throws Throwable {
    throw __call1034010_0(p0);
}
public static void h340_11(java.lang.NullPointerException p0) throws Throwable {
    throw __call1034011_0(p0);
}
public static void h340_12(java.lang.NullPointerException p0) throws Throwable {
    throw __call1034012_0(p0);
}
public static void h340_13(java.lang.NullPointerException p0) throws Throwable {
    throw __call1034013_0(p0);
}
public static void h340_14(java.lang.NullPointerException p0) throws Throwable {
    throw __call1034014_0(p0);
}
public static void h340_15(java.lang.NullPointerException p0) throws Throwable {
    throw __call1034015_0(p0);
}
public static void h340_16(java.lang.NullPointerException p0) throws Throwable {
    throw __call1034016_0(p0);
}
public static void h340_17(java.lang.NullPointerException p0) throws Throwable {
    throw __call1034017_0(p0);
}
public static void h340_18(java.lang.NullPointerException p0) throws Throwable {
    throw __call1034018_0(p0);
}
private static native long __fieldRead340_0() throws Throwable;
private static native java.lang.String[] __call340_1() throws Throwable;
private static native com.moon.J __call340_2() throws Throwable;
private static native java.lang.String __call340_3(com.moon.J a0) throws Throwable;
private static native boolean __call340_4(java.lang.String a0) throws Throwable;
private static native int __integerCategory340_5(boolean value) throws Throwable;
private static native java.lang.Object __fieldRead340_6(com.moon.J a0) throws Throwable;
private static native void __fieldWrite340_7(com.moon.al a0, java.lang.Object a1) throws Throwable;
private static native void __call340_8(com.moon.al a0) throws Throwable;
private static native java.lang.String __call340_9(com.moon.J a0) throws Throwable;
private static native boolean __call340_10(java.lang.String a0) throws Throwable;
private static native int __integerCategory340_11(boolean value) throws Throwable;
private static native java.lang.Object __fieldRead340_12(com.moon.J a0) throws Throwable;
private static native void __fieldWrite340_13(com.moon.al a0, java.lang.Object a1) throws Throwable;
private static native void __call340_14(com.moon.al a0) throws Throwable;
private static native int __call340_15(com.moon.J a0) throws Throwable;
private static native int __call340_16(com.moon.J a0) throws Throwable;
private static native com.moon.al __call340_17(com.moon.al a0, int a1) throws Throwable;
private static native int __call340_18(com.moon.J a0) throws Throwable;
private static native int __call340_19(com.moon.J a0) throws Throwable;
private static native com.moon.al __call340_20(com.moon.al a0, int a1) throws Throwable;
private static native boolean __call340_21(com.moon.J a0) throws Throwable;
private static native int __integerCategory340_22(boolean value) throws Throwable;
private static native com.moon.K __call340_23(com.moon.J a0) throws Throwable;
private static native com.moon.al __call340_24(com.moon.al a0, com.moon.K a1) throws Throwable;
private static native long __call340_25(com.moon.J a0) throws Throwable;
private static native int __numericCompare340_26(long a0, long a1) throws Throwable;
private static native long __call340_27(com.moon.J a0) throws Throwable;
private static native com.moon.al __call340_28(com.moon.al a0, long a1) throws Throwable;
private static native boolean __call340_29(com.moon.J a0) throws Throwable;
private static native int __integerCategory340_30(boolean value) throws Throwable;
private static native boolean __call340_31(com.moon.J a0) throws Throwable;
private static native com.moon.al __call340_32(com.moon.al a0, boolean a1) throws Throwable;
private static native boolean __call340_33(com.moon.J a0) throws Throwable;
private static native int __integerCategory340_34(boolean value) throws Throwable;
private static native boolean __call340_35(com.moon.J a0) throws Throwable;
private static native com.moon.al __call340_36(com.moon.al a0, boolean a1) throws Throwable;
private static native boolean __call340_37(com.moon.J a0) throws Throwable;
private static native int __integerCategory340_38(boolean value) throws Throwable;
private static native boolean __call340_39(com.moon.J a0) throws Throwable;
private static native com.moon.al __call340_40(com.moon.al a0, boolean a1) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call340_41(com.moon.J a0) throws Throwable;
private static native com.moon.al __call340_42(com.moon.al a0, com.google.protobuf.UnknownFieldSet a1) throws Throwable;
private static native void __call340_43(com.moon.al a0) throws Throwable;
private static native java.lang.Exception __call1034000_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1034001_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1034002_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1034003_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1034004_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1034005_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1034006_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1034007_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1034008_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1034009_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1034010_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1034011_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1034012_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1034013_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1034014_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1034015_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1034016_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1034017_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1034018_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.al __sourceHandlerCall_f4bd04a0ef737b625421(com.moon.al a0, com.moon.K a1) throws E;
private static final class __SourceHandler_f4bd04a0ef737b625421 {

public static com.moon.al f23(com.moon.al receiver, com.moon.K p0) throws Throwable {
    com.google.protobuf.SingleFieldBuilderV3 forwardValue23_28_0;
    com.google.protobuf.SingleFieldBuilderV3 spill23_0;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_29: {
    forward_join_28: {
    forward_join_24: {
    forward_join_17: {
    life2_3 = (__fieldRead23_0() ^ 118787575266035L);
    life4_5 = __call23_1();
    spill23_0 = __fieldRead23_2(receiver);
    if (!((life4_5 == null))) {
        forwardValue23_28_0 = spill23_0;
        break forward_join_28;
    }
    if (!((spill23_0 == null))) {
        break forward_join_24;
    }
    if (!((p0 == null))) {
        break forward_join_17;
    }
    throw new java.lang.NullPointerException();
    }
    __fieldWrite23_3(receiver, p0);
    __call23_4(receiver);
    if (!((life4_5 != null))) {
        break forward_join_29;
    }
    }
    forwardValue23_28_0 = __call23_6(__fieldRead23_5(receiver), p0);
    }
    __discardScalar23_7(forwardValue23_28_0);
    }
    return receiver;
}
public static void h23_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1002300_0(p0);
}
public static void h23_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call1002301_0(p0);
}
public static void h23_2(java.lang.NullPointerException p0) throws Throwable {
    throw __call1002302_0(p0);
}
public static void h23_3(java.lang.NullPointerException p0) throws Throwable {
    throw __call1002303_0(p0);
}
private static native long __fieldRead23_0() throws Throwable;
private static native java.lang.String[] __call23_1() throws Throwable;
private static native com.google.protobuf.SingleFieldBuilderV3 __fieldRead23_2(com.moon.al a0) throws Throwable;
private static native void __fieldWrite23_3(com.moon.al a0, com.moon.K a1) throws Throwable;
private static native void __call23_4(com.moon.al a0) throws Throwable;
private static native com.google.protobuf.SingleFieldBuilderV3 __fieldRead23_5(com.moon.al a0) throws Throwable;
private static native com.google.protobuf.SingleFieldBuilderV3 __call23_6(com.google.protobuf.SingleFieldBuilderV3 a0, com.moon.K a1) throws Throwable;
private static native void __discardScalar23_7(com.google.protobuf.SingleFieldBuilderV3 a0) throws Throwable;
private static native java.lang.Exception __call1002300_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1002301_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1002302_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1002303_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.al __sourceHandlerCall_25717dc6ce164b707a06(com.moon.al a0, com.moon.am a1) throws E;
private static final class __SourceHandler_25717dc6ce164b707a06 {

public static com.moon.al f24(com.moon.al receiver, com.moon.am p0) throws Throwable {
    com.google.protobuf.SingleFieldBuilderV3 forwardValue24_24_0;
    com.google.protobuf.SingleFieldBuilderV3 spill24_0;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_25: {
    forward_join_24: {
    forward_join_19: {
    life2_3 = (__fieldRead24_0() ^ 112673216859589L);
    life4_5 = __call24_1();
    spill24_0 = __fieldRead24_2(receiver);
    if (!((life4_5 == null))) {
        forwardValue24_24_0 = spill24_0;
        break forward_join_24;
    }
    if (!((spill24_0 == null))) {
        break forward_join_19;
    }
    __fieldWrite24_4(receiver, __call24_3(p0));
    __call24_5(receiver);
    if (!((life4_5 != null))) {
        break forward_join_25;
    }
    }
    forwardValue24_24_0 = __call24_8(__fieldRead24_6(receiver), __call24_7(p0));
    }
    __discardScalar24_9(forwardValue24_24_0);
    }
    return receiver;
}
public static void h24_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1002400_0(p0);
}
public static void h24_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call1002401_0(p0);
}
public static void h24_2(java.lang.NullPointerException p0) throws Throwable {
    throw __call1002402_0(p0);
}
private static native long __fieldRead24_0() throws Throwable;
private static native java.lang.String[] __call24_1() throws Throwable;
private static native com.google.protobuf.SingleFieldBuilderV3 __fieldRead24_2(com.moon.al a0) throws Throwable;
private static native com.moon.K __call24_3(com.moon.am a0) throws Throwable;
private static native void __fieldWrite24_4(com.moon.al a0, com.moon.K a1) throws Throwable;
private static native void __call24_5(com.moon.al a0) throws Throwable;
private static native com.google.protobuf.SingleFieldBuilderV3 __fieldRead24_6(com.moon.al a0) throws Throwable;
private static native com.moon.K __call24_7(com.moon.am a0) throws Throwable;
private static native com.google.protobuf.SingleFieldBuilderV3 __call24_8(com.google.protobuf.SingleFieldBuilderV3 a0, com.moon.K a1) throws Throwable;
private static native void __discardScalar24_9(com.google.protobuf.SingleFieldBuilderV3 a0) throws Throwable;
private static native java.lang.Exception __call1002400_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1002401_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1002402_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.al __sourceHandlerCall_8e04ef7e58db2225b8b2(com.moon.al a0, java.lang.String a1) throws E;
private static final class __SourceHandler_8e04ef7e58db2225b8b2 {

public static com.moon.al f432(com.moon.al receiver, java.lang.String p0) throws Throwable {
    long life2_3;
    java.lang.String[] life4_5;
    life2_3 = (__fieldRead432_0() ^ 72171514584525L);
    life4_5 = __call432_1();
    if ((life4_5 == null)) {
        if ((p0 == null)) {
        throw new java.lang.NullPointerException();
    }
        __fieldWrite432_2(receiver, p0);
        __call432_3(receiver);
    }
    return receiver;
}
public static void h432_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1043200_0(p0);
}
public static void h432_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call1043201_0(p0);
}
private static native long __fieldRead432_0() throws Throwable;
private static native java.lang.String[] __call432_1() throws Throwable;
private static native void __fieldWrite432_2(com.moon.al a0, java.lang.String a1) throws Throwable;
private static native void __call432_3(com.moon.al a0) throws Throwable;
private static native java.lang.Exception __call1043200_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1043201_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_055c5713806360520610(com.moon.al a0) throws E;
private static final class __SourceHandler_055c5713806360520610 {

public static boolean f343(com.moon.al receiver) throws Throwable {
    com.moon.al forwardValue343_12_0;
    int forwardValue343_17_0;
    com.moon.al spill343_0;
    long life1_3;
    java.lang.String[] life3_5;
    forward_join_17: {
    forward_join_16: {
    forward_join_14: {
    forward_join_12: {
    life1_3 = (__fieldRead343_0() ^ 73103226159039L);
    life3_5 = __call343_1();
    spill343_0 = receiver;
    if (!((life3_5 == null))) {
        forwardValue343_12_0 = spill343_0;
        break forward_join_12;
    }
    if (!((__fieldRead343_2(spill343_0) == null))) {
        break forward_join_14;
    }
    forwardValue343_12_0 = receiver;
    }
    if (!((__fieldRead343_3(forwardValue343_12_0) != null))) {
        break forward_join_16;
    }
    }
    forwardValue343_17_0 = 1;
    break forward_join_17;
    }
    forwardValue343_17_0 = 0;
    }
    return __integerCategory343_4(forwardValue343_17_0);
}
public static void h343_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1034300_0(p0);
}
public static void h343_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call1034301_0(p0);
}
public static void h343_2(java.lang.NullPointerException p0) throws Throwable {
    throw __call1034302_0(p0);
}
private static native long __fieldRead343_0() throws Throwable;
private static native java.lang.String[] __call343_1() throws Throwable;
private static native com.google.protobuf.SingleFieldBuilderV3 __fieldRead343_2(com.moon.al a0) throws Throwable;
private static native com.moon.K __fieldRead343_3(com.moon.al a0) throws Throwable;
private static native boolean __integerCategory343_4(int value) throws Throwable;
private static native java.lang.Exception __call1034300_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1034301_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1034302_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> com.google.protobuf.ByteString __sourceHandlerCall_857cd3d53e20b1bd19e2(com.moon.al a0) throws E;
private static final class __SourceHandler_857cd3d53e20b1bd19e2 {

public static com.google.protobuf.ByteString f344(com.moon.al receiver) throws Throwable {
    java.lang.Object forwardValue344_24_0;
    java.lang.String[] spill344_0;
    java.lang.Object spill344_1;
    long life1_3;
    java.lang.Object life4_7;
    java.lang.String[] life3_8;
    com.google.protobuf.ByteString life5_20;
    forward_join_24: {
    forward_join_23: {
    life1_3 = (__fieldRead344_0() ^ 121088497300829L);
    spill344_0 = __call344_1();
    life4_7 = __fieldRead344_2(receiver);
    life3_8 = spill344_0;
    spill344_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue344_24_0 = spill344_1;
        break forward_join_24;
    }
    if (!((__instanceOf344_3(spill344_1) != 0))) {
        break forward_join_23;
    }
    life5_20 = __call344_5(__cast344_4(life4_7));
    __fieldWrite344_6(receiver, life5_20);
    return life5_20;
    }
    forwardValue344_24_0 = life4_7;
    }
    return __cast344_7(forwardValue344_24_0);
}
public static void h344_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1034400_0(p0);
}
private static native long __fieldRead344_0() throws Throwable;
private static native java.lang.String[] __call344_1() throws Throwable;
private static native java.lang.Object __fieldRead344_2(com.moon.al a0) throws Throwable;
private static native int __instanceOf344_3(java.lang.Object a0) throws Throwable;
private static native java.lang.String __cast344_4(java.lang.Object a0) throws Throwable;
private static native com.google.protobuf.ByteString __call344_5(java.lang.String a0) throws Throwable;
private static native void __fieldWrite344_6(com.moon.al a0, com.google.protobuf.ByteString a1) throws Throwable;
private static native com.google.protobuf.ByteString __cast344_7(java.lang.Object a0) throws Throwable;
private static native java.lang.Exception __call1034400_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.K __sourceHandlerCall_7f8b96e941f2ddc0c715(com.moon.al a0) throws E;
private static final class __SourceHandler_7f8b96e941f2ddc0c715 {

public static com.moon.K f345(com.moon.al receiver) throws Throwable {
    com.moon.al forwardValue345_19_0;
    com.moon.K forwardValue345_20_0;
    com.google.protobuf.SingleFieldBuilderV3 forwardValue345_23_0;
    com.google.protobuf.SingleFieldBuilderV3 spill345_0;
    com.moon.al spill345_1;
    long life1_3;
    java.lang.String[] life3_5;
    forward_join_23: {
    forward_join_21: {
    forward_join_20: {
    forward_join_19: {
    forward_join_18: {
    life1_3 = (__fieldRead345_0() ^ 53275388735109L);
    life3_5 = __call345_1();
    spill345_0 = __fieldRead345_2(receiver);
    if (!((life3_5 == null))) {
        forwardValue345_23_0 = spill345_0;
        break forward_join_23;
    }
    if (!((spill345_0 == null))) {
        break forward_join_21;
    }
    spill345_1 = receiver;
    if (!((life3_5 == null))) {
        forwardValue345_19_0 = spill345_1;
        break forward_join_19;
    }
    if (!((__fieldRead345_3(spill345_1) == null))) {
        break forward_join_18;
    }
    forwardValue345_20_0 = __call345_4();
    break forward_join_20;
    }
    forwardValue345_19_0 = receiver;
    }
    forwardValue345_20_0 = __fieldRead345_5(forwardValue345_19_0);
    }
    return forwardValue345_20_0;
    }
    forwardValue345_23_0 = __fieldRead345_6(receiver);
    }
    return __cast345_8(__call345_7(forwardValue345_23_0));
}
public static void h345_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1034500_0(p0);
}
public static void h345_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call1034501_0(p0);
}
public static void h345_2(java.lang.NullPointerException p0) throws Throwable {
    throw __call1034502_0(p0);
}
public static void h345_3(java.lang.NullPointerException p0) throws Throwable {
    throw __call1034503_0(p0);
}
private static native long __fieldRead345_0() throws Throwable;
private static native java.lang.String[] __call345_1() throws Throwable;
private static native com.google.protobuf.SingleFieldBuilderV3 __fieldRead345_2(com.moon.al a0) throws Throwable;
private static native com.moon.K __fieldRead345_3(com.moon.al a0) throws Throwable;
private static native com.moon.K __call345_4() throws Throwable;
private static native com.moon.K __fieldRead345_5(com.moon.al a0) throws Throwable;
private static native com.google.protobuf.SingleFieldBuilderV3 __fieldRead345_6(com.moon.al a0) throws Throwable;
private static native com.google.protobuf.AbstractMessage __call345_7(com.google.protobuf.SingleFieldBuilderV3 a0) throws Throwable;
private static native com.moon.K __cast345_8(com.google.protobuf.AbstractMessage a0) throws Throwable;
private static native java.lang.Exception __call1034500_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1034501_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1034502_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1034503_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> com.google.protobuf.SingleFieldBuilderV3 __sourceHandlerCall_acfc2d20802bd6b02582(com.moon.al a0) throws E;
private static final class __SourceHandler_acfc2d20802bd6b02582 {

public static com.google.protobuf.SingleFieldBuilderV3 f346(com.moon.al receiver) throws Throwable {
    com.google.protobuf.SingleFieldBuilderV3 forwardValue346_27_0;
    com.google.protobuf.SingleFieldBuilderV3 spill346_0;
    long life1_3;
    java.lang.String[] life3_5;
    forward_join_27: {
    forward_join_25: {
    life1_3 = (__fieldRead346_0() ^ 32749209142622L);
    life3_5 = __call346_1();
    spill346_0 = __fieldRead346_2(receiver);
    if (!((life3_5 == null))) {
        forwardValue346_27_0 = spill346_0;
        break forward_join_27;
    }
    if (!((spill346_0 == null))) {
        break forward_join_25;
    }
    __fieldWrite346_6(receiver, new com.google.protobuf.SingleFieldBuilderV3(__call346_3(receiver), __call346_4(receiver), __call346_5(receiver)));
    __fieldWrite346_7(receiver, null);
    }
    forwardValue346_27_0 = __fieldRead346_8(receiver);
    }
    return forwardValue346_27_0;
}
public static void h346_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1034600_0(p0);
}
public static void h346_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call1034601_0(p0);
}
private static native long __fieldRead346_0() throws Throwable;
private static native java.lang.String[] __call346_1() throws Throwable;
private static native com.google.protobuf.SingleFieldBuilderV3 __fieldRead346_2(com.moon.al a0) throws Throwable;
private static native com.moon.K __call346_3(com.moon.al a0) throws Throwable;
private static native com.google.protobuf.GeneratedMessageV3.BuilderParent __call346_4(com.moon.al a0) throws Throwable;
private static native boolean __call346_5(com.moon.al a0) throws Throwable;
private static native void __fieldWrite346_6(com.moon.al a0, com.google.protobuf.SingleFieldBuilderV3 a1) throws Throwable;
private static native void __fieldWrite346_7(com.moon.al a0, java.lang.Object a1) throws Throwable;
private static native com.google.protobuf.SingleFieldBuilderV3 __fieldRead346_8(com.moon.al a0) throws Throwable;
private static native java.lang.Exception __call1034600_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1034601_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_db7d25873d54bc4b0209(com.moon.al a0) throws E;
private static final class __SourceHandler_db7d25873d54bc4b0209 {

public static java.lang.String f347(com.moon.al receiver) throws Throwable {
    java.lang.Object forwardValue347_26_0;
    java.lang.String[] spill347_0;
    java.lang.Object spill347_1;
    long life1_3;
    java.lang.Object life4_7;
    java.lang.String[] life3_8;
    com.google.protobuf.ByteString life5_19;
    java.lang.String life6_22;
    forward_join_26: {
    forward_join_25: {
    life1_3 = (__fieldRead347_0() ^ 18579422753232L);
    spill347_0 = __call347_1();
    life4_7 = __fieldRead347_2(receiver);
    life3_8 = spill347_0;
    spill347_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue347_26_0 = spill347_1;
        break forward_join_26;
    }
    if (!((__instanceOf347_3(spill347_1) == 0))) {
        break forward_join_25;
    }
    life5_19 = __cast347_4(life4_7);
    life6_22 = __call347_5(life5_19);
    __fieldWrite347_6(receiver, life6_22);
    return life6_22;
    }
    forwardValue347_26_0 = life4_7;
    }
    return __cast347_7(forwardValue347_26_0);
}
public static void h347_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1034700_0(p0);
}
private static native long __fieldRead347_0() throws Throwable;
private static native java.lang.String[] __call347_1() throws Throwable;
private static native java.lang.Object __fieldRead347_2(com.moon.al a0) throws Throwable;
private static native int __instanceOf347_3(java.lang.Object a0) throws Throwable;
private static native com.google.protobuf.ByteString __cast347_4(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call347_5(com.google.protobuf.ByteString a0) throws Throwable;
private static native void __fieldWrite347_6(com.moon.al a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __cast347_7(java.lang.Object a0) throws Throwable;
private static native java.lang.Exception __call1034700_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.al __sourceHandlerCall_92912801a0acf105fc0e(com.moon.al a0) throws E;
private static final class __SourceHandler_92912801a0acf105fc0e {

public static com.moon.al f348(com.moon.al receiver) throws Throwable {
    com.moon.al forwardValue348_35_0;
    com.moon.al forwardValue348_55_0;
    java.lang.String[] spill348_0;
    com.moon.al spill348_1;
    com.moon.al spill348_2;
    long life1_3;
    java.lang.String[] life3_20;
    forward_join_55: {
    forward_join_37: {
    forward_join_35: {
    forward_join_31: {
    life1_3 = (__fieldRead348_0() ^ 85340624538040L);
    __call348_1(receiver);
    __fieldWrite348_2(receiver, "");
    __fieldWrite348_3(receiver, "");
    __fieldWrite348_4(receiver, 0);
    spill348_0 = __call348_5();
    __fieldWrite348_6(receiver, 0);
    life3_20 = spill348_0;
    spill348_1 = receiver;
    if (!((life3_20 == null))) {
        forwardValue348_35_0 = spill348_1;
        break forward_join_35;
    }
    if (!((__fieldRead348_7(spill348_1) == null))) {
        break forward_join_31;
    }
    __fieldWrite348_8(receiver, null);
    if (!((life3_20 != null))) {
        break forward_join_37;
    }
    }
    __fieldWrite348_9(receiver, null);
    forwardValue348_35_0 = receiver;
    }
    __fieldWrite348_10(forwardValue348_35_0, null);
    }
    __fieldWrite348_11(receiver, 0L);
    __fieldWrite348_12(receiver, 0);
    __fieldWrite348_13(receiver, 0);
    __fieldWrite348_14(receiver, 0);
    spill348_2 = receiver;
    if (!((__call348_15() != null))) {
        forwardValue348_55_0 = spill348_2;
        break forward_join_55;
    }
    __call348_16(new java.lang.String[5]);
    forwardValue348_55_0 = spill348_2;
    }
    return forwardValue348_55_0;
}
public static void h348_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1034800_0(p0);
}
public static void h348_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call1034801_0(p0);
}
public static void h348_2(java.lang.NullPointerException p0) throws Throwable {
    throw __call1034802_0(p0);
}
public static void h348_3(java.lang.NullPointerException p0) throws Throwable {
    throw __call1034803_0(p0);
}
private static native long __fieldRead348_0() throws Throwable;
private static native com.google.protobuf.GeneratedMessageV3.Builder __call348_1(com.moon.al a0) throws Throwable;
private static native void __fieldWrite348_2(com.moon.al a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite348_3(com.moon.al a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite348_4(com.moon.al a0, int a1) throws Throwable;
private static native java.lang.String[] __call348_5() throws Throwable;
private static native void __fieldWrite348_6(com.moon.al a0, int a1) throws Throwable;
private static native com.google.protobuf.SingleFieldBuilderV3 __fieldRead348_7(com.moon.al a0) throws Throwable;
private static native void __fieldWrite348_8(com.moon.al a0, java.lang.Object a1) throws Throwable;
private static native void __fieldWrite348_9(com.moon.al a0, java.lang.Object a1) throws Throwable;
private static native void __fieldWrite348_10(com.moon.al a0, java.lang.Object a1) throws Throwable;
private static native void __fieldWrite348_11(com.moon.al a0, long a1) throws Throwable;
private static native void __fieldWrite348_12(com.moon.al a0, int a1) throws Throwable;
private static native void __fieldWrite348_13(com.moon.al a0, int a1) throws Throwable;
private static native void __fieldWrite348_14(com.moon.al a0, int a1) throws Throwable;
private static native java.lang.String[] __call348_15() throws Throwable;
private static native void __call348_16(java.lang.String[] a0) throws Throwable;
private static native java.lang.Exception __call1034800_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1034801_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1034802_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1034803_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.oH __sourceHandlerCall_8125fe211cf3243e729e(com.moon.al a0) throws E;
private static final class __SourceHandler_8125fe211cf3243e729e {

public static com.moon.oH f349(com.moon.al receiver) throws Throwable {
    com.moon.al forwardValue349_17_0;
    com.moon.al forwardValue349_24_0;
    com.moon.K forwardValue349_25_0;
    com.moon.al spill349_0;
    long life1_3;
    java.lang.String[] life3_5;
    forward_join_25: {
    forward_join_24: {
    forward_join_23: {
    forward_join_17: {
    forward_join_16: {
    life1_3 = (__fieldRead349_0() ^ 49428936189634L);
    life3_5 = __call349_1();
    spill349_0 = receiver;
    if (!((life3_5 == null))) {
        forwardValue349_17_0 = spill349_0;
        break forward_join_17;
    }
    if (!((__fieldRead349_2(spill349_0) != null))) {
        break forward_join_16;
    }
    return __cast349_5(__call349_4(__fieldRead349_3(receiver)));
    }
    forwardValue349_17_0 = receiver;
    }
    if (!((life3_5 == null))) {
        forwardValue349_24_0 = forwardValue349_17_0;
        break forward_join_24;
    }
    if (!((__fieldRead349_6(forwardValue349_17_0) == null))) {
        break forward_join_23;
    }
    forwardValue349_25_0 = __call349_7();
    break forward_join_25;
    }
    forwardValue349_24_0 = receiver;
    }
    forwardValue349_25_0 = __fieldRead349_8(forwardValue349_24_0);
    }
    return forwardValue349_25_0;
}
public static void h349_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1034900_0(p0);
}
public static void h349_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call1034901_0(p0);
}
public static void h349_2(java.lang.NullPointerException p0) throws Throwable {
    throw __call1034902_0(p0);
}
public static void h349_3(java.lang.NullPointerException p0) throws Throwable {
    throw __call1034903_0(p0);
}
private static native long __fieldRead349_0() throws Throwable;
private static native java.lang.String[] __call349_1() throws Throwable;
private static native com.google.protobuf.SingleFieldBuilderV3 __fieldRead349_2(com.moon.al a0) throws Throwable;
private static native com.google.protobuf.SingleFieldBuilderV3 __fieldRead349_3(com.moon.al a0) throws Throwable;
private static native com.google.protobuf.MessageOrBuilder __call349_4(com.google.protobuf.SingleFieldBuilderV3 a0) throws Throwable;
private static native com.moon.oH __cast349_5(com.google.protobuf.MessageOrBuilder a0) throws Throwable;
private static native com.moon.K __fieldRead349_6(com.moon.al a0) throws Throwable;
private static native com.moon.K __call349_7() throws Throwable;
private static native com.moon.K __fieldRead349_8(com.moon.al a0) throws Throwable;
private static native java.lang.Exception __call1034900_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1034901_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1034902_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1034903_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.al __sourceHandlerCall_5160cb8d743c1f6e85b1(com.moon.al a0, com.google.protobuf.ByteString a1) throws E;
private static final class __SourceHandler_5160cb8d743c1f6e85b1 {

public static com.moon.al f350(com.moon.al receiver, com.google.protobuf.ByteString p0) throws Throwable {
    com.google.protobuf.ByteString forwardValue350_15_0;
    com.google.protobuf.ByteString spill350_0;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_15: {
    forward_join_14: {
    life2_3 = (__fieldRead350_0() ^ 89744708201239L);
    life4_5 = __call350_1();
    spill350_0 = p0;
    if (!((life4_5 == null))) {
        forwardValue350_15_0 = spill350_0;
        break forward_join_15;
    }
    if (!((spill350_0 == null))) {
        break forward_join_14;
    }
    throw new java.lang.NullPointerException();
    }
    forwardValue350_15_0 = p0;
    }
    __call350_2(forwardValue350_15_0);
    __fieldWrite350_3(receiver, p0);
    __call350_4(receiver);
    return receiver;
}
public static void h350_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1035000_0(p0);
}
public static void h350_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call1035001_0(p0);
}
private static native long __fieldRead350_0() throws Throwable;
private static native java.lang.String[] __call350_1() throws Throwable;
private static native void __call350_2(com.google.protobuf.ByteString a0) throws Throwable;
private static native void __fieldWrite350_3(com.moon.al a0, com.google.protobuf.ByteString a1) throws Throwable;
private static native void __call350_4(com.moon.al a0) throws Throwable;
private static native java.lang.Exception __call1035000_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1035001_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.al __sourceHandlerCall_65e2d921b1822d9f6e19(com.moon.al a0, com.moon.K a1) throws E;
private static final class __SourceHandler_65e2d921b1822d9f6e19 {

public static com.moon.al f25(com.moon.al receiver, com.moon.K p0) throws Throwable {
    com.moon.al forwardValue25_27_0;
    com.google.protobuf.SingleFieldBuilderV3 forwardValue25_37_0;
    com.google.protobuf.SingleFieldBuilderV3 spill25_0;
    com.moon.al spill25_1;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_38: {
    forward_join_37: {
    forward_join_33: {
    forward_join_29: {
    forward_join_27: {
    forward_join_26: {
    life2_3 = (__fieldRead25_0() ^ 77279192239871L);
    life4_5 = __call25_1();
    spill25_0 = __fieldRead25_2(receiver);
    if (!((life4_5 == null))) {
        forwardValue25_37_0 = spill25_0;
        break forward_join_37;
    }
    if (!((spill25_0 == null))) {
        break forward_join_33;
    }
    spill25_1 = receiver;
    if (!((life4_5 == null))) {
        forwardValue25_27_0 = spill25_1;
        break forward_join_27;
    }
    if (!((__fieldRead25_3(spill25_1) != null))) {
        break forward_join_26;
    }
    __fieldWrite25_8(receiver, __call25_7(__call25_6(__call25_5(__fieldRead25_4(receiver)), p0)));
    if (!((life4_5 != null))) {
        break forward_join_29;
    }
    }
    forwardValue25_27_0 = receiver;
    }
    __fieldWrite25_9(forwardValue25_27_0, p0);
    }
    __call25_10(receiver);
    if (!((life4_5 != null))) {
        break forward_join_38;
    }
    }
    forwardValue25_37_0 = __call25_12(__fieldRead25_11(receiver), p0);
    }
    __discardScalar25_13(forwardValue25_37_0);
    }
    return receiver;
}
public static void h25_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1002500_0(p0);
}
public static void h25_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call1002501_0(p0);
}
public static void h25_2(java.lang.NullPointerException p0) throws Throwable {
    throw __call1002502_0(p0);
}
public static void h25_3(java.lang.NullPointerException p0) throws Throwable {
    throw __call1002503_0(p0);
}
public static void h25_4(java.lang.NullPointerException p0) throws Throwable {
    throw __call1002504_0(p0);
}
public static void h25_5(java.lang.NullPointerException p0) throws Throwable {
    throw __call1002505_0(p0);
}
private static native long __fieldRead25_0() throws Throwable;
private static native java.lang.String[] __call25_1() throws Throwable;
private static native com.google.protobuf.SingleFieldBuilderV3 __fieldRead25_2(com.moon.al a0) throws Throwable;
private static native com.moon.K __fieldRead25_3(com.moon.al a0) throws Throwable;
private static native com.moon.K __fieldRead25_4(com.moon.al a0) throws Throwable;
private static native com.moon.am __call25_5(com.moon.K a0) throws Throwable;
private static native com.moon.am __call25_6(com.moon.am a0, com.moon.K a1) throws Throwable;
private static native com.moon.K __call25_7(com.moon.am a0) throws Throwable;
private static native void __fieldWrite25_8(com.moon.al a0, com.moon.K a1) throws Throwable;
private static native void __fieldWrite25_9(com.moon.al a0, com.moon.K a1) throws Throwable;
private static native void __call25_10(com.moon.al a0) throws Throwable;
private static native com.google.protobuf.SingleFieldBuilderV3 __fieldRead25_11(com.moon.al a0) throws Throwable;
private static native com.google.protobuf.SingleFieldBuilderV3 __call25_12(com.google.protobuf.SingleFieldBuilderV3 a0, com.moon.K a1) throws Throwable;
private static native void __discardScalar25_13(com.google.protobuf.SingleFieldBuilderV3 a0) throws Throwable;
private static native java.lang.Exception __call1002500_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1002501_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1002502_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1002503_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1002504_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1002505_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.al __sourceHandlerCall_1241ad6bc35beec3940b(com.moon.al a0, java.lang.String a1) throws E;
private static final class __SourceHandler_1241ad6bc35beec3940b {

public static com.moon.al f442(com.moon.al receiver, java.lang.String p0) throws Throwable {
    long life2_3;
    java.lang.String[] life4_5;
    life2_3 = (__fieldRead442_0() ^ 51508115579737L);
    life4_5 = __call442_1();
    if ((life4_5 == null)) {
        if ((p0 == null)) {
        throw new java.lang.NullPointerException();
    }
        __fieldWrite442_2(receiver, p0);
        __call442_3(receiver);
    }
    return receiver;
}
public static void h442_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1044200_0(p0);
}
public static void h442_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call1044201_0(p0);
}
private static native long __fieldRead442_0() throws Throwable;
private static native java.lang.String[] __call442_1() throws Throwable;
private static native void __fieldWrite442_2(com.moon.al a0, java.lang.String a1) throws Throwable;
private static native void __call442_3(com.moon.al a0) throws Throwable;
private static native java.lang.Exception __call1044200_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1044201_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> com.google.protobuf.ByteString __sourceHandlerCall_83203aff5304003b7ad7(com.moon.al a0) throws E;
private static final class __SourceHandler_83203aff5304003b7ad7 {

public static com.google.protobuf.ByteString f352(com.moon.al receiver) throws Throwable {
    java.lang.Object forwardValue352_24_0;
    java.lang.String[] spill352_0;
    java.lang.Object spill352_1;
    long life1_3;
    java.lang.Object life4_7;
    java.lang.String[] life3_8;
    com.google.protobuf.ByteString life5_20;
    forward_join_24: {
    forward_join_23: {
    life1_3 = (__fieldRead352_0() ^ 116922514122287L);
    spill352_0 = __call352_1();
    life4_7 = __fieldRead352_2(receiver);
    life3_8 = spill352_0;
    spill352_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue352_24_0 = spill352_1;
        break forward_join_24;
    }
    if (!((__instanceOf352_3(spill352_1) != 0))) {
        break forward_join_23;
    }
    life5_20 = __call352_5(__cast352_4(life4_7));
    __fieldWrite352_6(receiver, life5_20);
    return life5_20;
    }
    forwardValue352_24_0 = life4_7;
    }
    return __cast352_7(forwardValue352_24_0);
}
public static void h352_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1035200_0(p0);
}
private static native long __fieldRead352_0() throws Throwable;
private static native java.lang.String[] __call352_1() throws Throwable;
private static native java.lang.Object __fieldRead352_2(com.moon.al a0) throws Throwable;
private static native int __instanceOf352_3(java.lang.Object a0) throws Throwable;
private static native java.lang.String __cast352_4(java.lang.Object a0) throws Throwable;
private static native com.google.protobuf.ByteString __call352_5(java.lang.String a0) throws Throwable;
private static native void __fieldWrite352_6(com.moon.al a0, com.google.protobuf.ByteString a1) throws Throwable;
private static native com.google.protobuf.ByteString __cast352_7(java.lang.Object a0) throws Throwable;
private static native java.lang.Exception __call1035200_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.J __sourceHandlerCall_437df2a76c08f3e8521d(com.moon.al a0) throws E;
private static final class __SourceHandler_437df2a76c08f3e8521d {

public static com.moon.J f353(com.moon.al receiver) throws Throwable {
    com.moon.J forwardValue353_18_0;
    java.lang.String[] spill353_0;
    com.moon.J spill353_1;
    long life1_3;
    com.moon.J life4_7;
    java.lang.String[] life3_8;
    forward_join_18: {
    forward_join_17: {
    life1_3 = (__fieldRead353_0() ^ 82645497179892L);
    spill353_0 = __call353_1();
    life4_7 = __call353_2(receiver);
    life3_8 = spill353_0;
    spill353_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue353_18_0 = spill353_1;
        break forward_join_18;
    }
    if (!((!__call353_3(spill353_1)))) {
        break forward_join_17;
    }
    throw __call353_4(life4_7);
    }
    forwardValue353_18_0 = life4_7;
    }
    return forwardValue353_18_0;
}
public static void h353_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1035300_0(p0);
}
public static void h353_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call1035301_0(p0);
}
private static native long __fieldRead353_0() throws Throwable;
private static native java.lang.String[] __call353_1() throws Throwable;
private static native com.moon.J __call353_2(com.moon.al a0) throws Throwable;
private static native boolean __call353_3(com.moon.J a0) throws Throwable;
private static native com.google.protobuf.UninitializedMessageException __call353_4(com.moon.J a0) throws Throwable;
private static native java.lang.Exception __call1035300_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1035301_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_928599292a32fb05ddcf(com.moon.al a0) throws E;
private static final class __SourceHandler_928599292a32fb05ddcf {

public static java.lang.String f354(com.moon.al receiver) throws Throwable {
    java.lang.Object forwardValue354_26_0;
    java.lang.String[] spill354_0;
    java.lang.Object spill354_1;
    long life1_3;
    java.lang.Object life4_7;
    java.lang.String[] life3_8;
    com.google.protobuf.ByteString life5_19;
    java.lang.String life6_22;
    forward_join_26: {
    forward_join_25: {
    life1_3 = (__fieldRead354_0() ^ 104016326079707L);
    spill354_0 = __call354_1();
    life4_7 = __fieldRead354_2(receiver);
    life3_8 = spill354_0;
    spill354_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue354_26_0 = spill354_1;
        break forward_join_26;
    }
    if (!((__instanceOf354_3(spill354_1) == 0))) {
        break forward_join_25;
    }
    life5_19 = __cast354_4(life4_7);
    life6_22 = __call354_5(life5_19);
    __fieldWrite354_6(receiver, life6_22);
    return life6_22;
    }
    forwardValue354_26_0 = life4_7;
    }
    return __cast354_7(forwardValue354_26_0);
}
public static void h354_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1035400_0(p0);
}
private static native long __fieldRead354_0() throws Throwable;
private static native java.lang.String[] __call354_1() throws Throwable;
private static native java.lang.Object __fieldRead354_2(com.moon.al a0) throws Throwable;
private static native int __instanceOf354_3(java.lang.Object a0) throws Throwable;
private static native com.google.protobuf.ByteString __cast354_4(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call354_5(com.google.protobuf.ByteString a0) throws Throwable;
private static native void __fieldWrite354_6(com.moon.al a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __cast354_7(java.lang.Object a0) throws Throwable;
private static native java.lang.Exception __call1035400_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.J __sourceHandlerCall_fee83b5bd8e4ed6fde40(com.moon.al a0) throws E;
private static final class __SourceHandler_fee83b5bd8e4ed6fde40 {

public static com.moon.J f355(com.moon.al receiver) throws Throwable {
    com.moon.J forwardValue355_43_0;
    com.moon.al forwardValue355_43_1;
    java.lang.String[] spill355_0;
    com.moon.J spill355_1;
    com.moon.al spill355_2;
    long life1_3;
    com.moon.J life4_9;
    java.lang.String[] life3_10;
    forward_join_47: {
    forward_join_43: {
    forward_join_41: {
    life1_3 = (__fieldRead355_0() ^ 132973120082713L);
    spill355_0 = __call355_1();
    life4_9 = new com.moon.J(receiver);
    life3_10 = spill355_0;
    __fieldWrite355_3(life4_9, __fieldRead355_2(receiver));
    __fieldWrite355_5(life4_9, __fieldRead355_4(receiver));
    __fieldWrite355_7(life4_9, __fieldRead355_6(receiver));
    spill355_1 = life4_9;
    spill355_2 = receiver;
    if (!((life3_10 == null))) {
        forwardValue355_43_0 = spill355_1;
        forwardValue355_43_1 = spill355_2;
        break forward_join_43;
    }
    __fieldWrite355_9(spill355_1, __fieldRead355_8(spill355_2));
    if (!((__fieldRead355_10(receiver) == null))) {
        break forward_join_41;
    }
    __fieldWrite355_12(life4_9, __fieldRead355_11(receiver));
    if (!((life3_10 != null))) {
        break forward_join_47;
    }
    __call355_13(new java.lang.String[5]);
    }
    forwardValue355_43_0 = life4_9;
    forwardValue355_43_1 = receiver;
    }
    __fieldWrite355_17(forwardValue355_43_0, __cast355_16(__call355_15(__fieldRead355_14(forwardValue355_43_1))));
    }
    __fieldWrite355_19(life4_9, __fieldRead355_18(receiver));
    __fieldWrite355_21(life4_9, __fieldRead355_20(receiver));
    __fieldWrite355_23(life4_9, __fieldRead355_22(receiver));
    __fieldWrite355_25(life4_9, __fieldRead355_24(receiver));
    __call355_26(receiver);
    return life4_9;
}
public static void h355_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1035500_0(p0);
}
public static void h355_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call1035501_0(p0);
}
public static void h355_2(java.lang.NullPointerException p0) throws Throwable {
    throw __call1035502_0(p0);
}
private static native long __fieldRead355_0() throws Throwable;
private static native java.lang.String[] __call355_1() throws Throwable;
private static native java.lang.Object __fieldRead355_2(com.moon.al a0) throws Throwable;
private static native void __fieldWrite355_3(com.moon.J a0, java.lang.Object a1) throws Throwable;
private static native java.lang.Object __fieldRead355_4(com.moon.al a0) throws Throwable;
private static native void __fieldWrite355_5(com.moon.J a0, java.lang.Object a1) throws Throwable;
private static native int __fieldRead355_6(com.moon.al a0) throws Throwable;
private static native void __fieldWrite355_7(com.moon.J a0, int a1) throws Throwable;
private static native int __fieldRead355_8(com.moon.al a0) throws Throwable;
private static native void __fieldWrite355_9(com.moon.J a0, int a1) throws Throwable;
private static native com.google.protobuf.SingleFieldBuilderV3 __fieldRead355_10(com.moon.al a0) throws Throwable;
private static native com.moon.K __fieldRead355_11(com.moon.al a0) throws Throwable;
private static native void __fieldWrite355_12(com.moon.J a0, com.moon.K a1) throws Throwable;
private static native void __call355_13(java.lang.String[] a0) throws Throwable;
private static native com.google.protobuf.SingleFieldBuilderV3 __fieldRead355_14(com.moon.al a0) throws Throwable;
private static native com.google.protobuf.AbstractMessage __call355_15(com.google.protobuf.SingleFieldBuilderV3 a0) throws Throwable;
private static native com.moon.K __cast355_16(com.google.protobuf.AbstractMessage a0) throws Throwable;
private static native void __fieldWrite355_17(com.moon.J a0, com.moon.K a1) throws Throwable;
private static native long __fieldRead355_18(com.moon.al a0) throws Throwable;
private static native void __fieldWrite355_19(com.moon.J a0, long a1) throws Throwable;
private static native boolean __fieldRead355_20(com.moon.al a0) throws Throwable;
private static native void __fieldWrite355_21(com.moon.J a0, boolean a1) throws Throwable;
private static native boolean __fieldRead355_22(com.moon.al a0) throws Throwable;
private static native void __fieldWrite355_23(com.moon.J a0, boolean a1) throws Throwable;
private static native boolean __fieldRead355_24(com.moon.al a0) throws Throwable;
private static native void __fieldWrite355_25(com.moon.J a0, boolean a1) throws Throwable;
private static native void __call355_26(com.moon.al a0) throws Throwable;
private static native java.lang.Exception __call1035500_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1035501_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1035502_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.al __sourceHandlerCall_4d209443cce2dadd4c83(com.moon.al a0) throws E;
private static final class __SourceHandler_4d209443cce2dadd4c83 {

public static com.moon.al f356(com.moon.al receiver) throws Throwable {
    com.moon.al forwardValue356_22_0;
    com.moon.al spill356_0;
    long life1_3;
    java.lang.String[] life3_5;
    forward_join_24: {
    forward_join_22: {
    forward_join_18: {
    life1_3 = (__fieldRead356_0() ^ 46065963811759L);
    life3_5 = __call356_1();
    spill356_0 = receiver;
    if (!((life3_5 == null))) {
        forwardValue356_22_0 = spill356_0;
        break forward_join_22;
    }
    if (!((__fieldRead356_2(spill356_0) == null))) {
        break forward_join_18;
    }
    __fieldWrite356_3(receiver, null);
    __call356_4(receiver);
    if (!((life3_5 != null))) {
        break forward_join_24;
    }
    }
    __fieldWrite356_5(receiver, null);
    forwardValue356_22_0 = receiver;
    }
    __fieldWrite356_6(forwardValue356_22_0, null);
    }
    return receiver;
}
public static void h356_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1035600_0(p0);
}
public static void h356_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call1035601_0(p0);
}
public static void h356_2(java.lang.NullPointerException p0) throws Throwable {
    throw __call1035602_0(p0);
}
private static native long __fieldRead356_0() throws Throwable;
private static native java.lang.String[] __call356_1() throws Throwable;
private static native com.google.protobuf.SingleFieldBuilderV3 __fieldRead356_2(com.moon.al a0) throws Throwable;
private static native void __fieldWrite356_3(com.moon.al a0, java.lang.Object a1) throws Throwable;
private static native void __call356_4(com.moon.al a0) throws Throwable;
private static native void __fieldWrite356_5(com.moon.al a0, java.lang.Object a1) throws Throwable;
private static native void __fieldWrite356_6(com.moon.al a0, java.lang.Object a1) throws Throwable;
private static native java.lang.Exception __call1035600_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1035601_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1035602_0(java.lang.NullPointerException a0) throws Throwable;

}


public com.moon.al i() {
this.h = ((boolean)(false));
    ((com.moon.al)(this)).onChanged();
    return this;
}


public com.moon.al b(boolean p0) {
this.i = ((boolean)(p0));
    ((com.moon.al)(this)).onChanged();
    return this;
}


public com.moon.al b(com.google.protobuf.ByteString p0) { return __sourceHandlerCall_5160cb8d743c1f6e85b1(this, p0); }


public int b() {
return this.d;
}


public com.moon.al b(int p0) {
this.d = ((int)(p0));
    ((com.moon.al)(this)).onChanged();
    return this;
}


public com.moon.al b(java.lang.String p0) { return __sourceHandlerCall_1241ad6bc35beec3940b(this, p0); }


public com.google.protobuf.ByteString b__ByteString() { return __sourceHandlerCall_83203aff5304003b7ad7(this); }


public java.lang.String b__String() { return __sourceHandlerCall_928599292a32fb05ddcf(this); }


public com.moon.al b__al() {
return ((com.moon.al)(super.clone()));
}


public boolean b__Boolean() {
return ((((this.h) ? 1 : 0)) != 0);
}


public com.moon.J b__J() { return __sourceHandlerCall_437df2a76c08f3e8521d(this); }


public com.moon.al b(com.moon.K p0) { return __sourceHandlerCall_65e2d921b1822d9f6e19(this, p0); }


public final com.moon.al b(com.google.protobuf.UnknownFieldSet p0) {
return ((com.moon.al)(super.mergeUnknownFields(((com.google.protobuf.UnknownFieldSet)(p0)))));
}


public com.moon.al b(com.google.protobuf.Descriptors.FieldDescriptor p0, java.lang.Object p1) {
return ((com.moon.al)(super.addRepeatedField(((com.google.protobuf.Descriptors.FieldDescriptor)(p0)), ((java.lang.Object)(p1)))));
}


public com.moon.al e() {
this.c = ((int)(0));
    ((com.moon.al)(this)).onChanged();
    return this;
}


public boolean c__Boolean() {
return ((((this.i) ? 1 : 0)) != 0);
}


public com.moon.J c() { return __sourceHandlerCall_fee83b5bd8e4ed6fde40(this); }


public com.moon.al c__al() {
this.a = ((java.lang.Object)(((com.moon.J)(com.moon.J.a__J())).a__String()));
    ((com.moon.al)(this)).onChanged();
    return this;
}


public com.moon.al c(boolean p0) {
this.j = ((boolean)(p0));
    ((com.moon.al)(this)).onChanged();
    return this;
}


public com.moon.al h() {
this.g = ((long)(0L));
    ((com.moon.al)(this)).onChanged();
    return this;
}


public com.moon.al f() {
this.d = ((int)(0));
    ((com.moon.al)(this)).onChanged();
    return this;
}


public com.moon.al d() {
this.b = ((java.lang.Object)(((com.moon.J)(com.moon.J.a__J())).b__String()));
    ((com.moon.al)(this)).onChanged();
    return this;
}


public boolean d__Boolean() {
return ((((this.j) ? 1 : 0)) != 0);
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


private com.google.protobuf.SingleFieldBuilderV3<com.moon.K, com.moon.am, com.moon.oH> a__SingleFieldBuilderV3() { return __sourceHandlerCall_acfc2d20802bd6b02582(this); }


public com.moon.al a(long p0) {
this.g = ((long)(p0));
    ((com.moon.al)(this)).onChanged();
    return this;
}


public long a__Long() {
return this.g;
}


public com.moon.al a(boolean p0) {
this.h = ((boolean)(p0));
    ((com.moon.al)(this)).onChanged();
    return this;
}


public static final com.google.protobuf.Descriptors.Descriptor a__DescriptorsInnerDescriptor() {
return com.moon.oF.c;
}


public final com.moon.al a(com.google.protobuf.UnknownFieldSet p0) {
return ((com.moon.al)(super.setUnknownFields(((com.google.protobuf.UnknownFieldSet)(p0)))));
}


public com.moon.al a(com.google.protobuf.Message p0) { return __sourceHandlerCall_ddacbd9bdd0d29e6de51(this, p0); }


public com.moon.al a(com.moon.J p0) { return __sourceHandlerCall_c4cc4b7f27e88a36362f(this, p0); }


public com.moon.al a(com.google.protobuf.CodedInputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException { return __sourceHandlerCall_d47632d8cd04fccc0ec7(this, p0, p1); }


public java.lang.String a__String() { return __sourceHandlerCall_db7d25873d54bc4b0209(this); }


public com.google.protobuf.ByteString a__ByteString() { return __sourceHandlerCall_857cd3d53e20b1bd19e2(this); }


public com.moon.al a(java.lang.String p0) { return __sourceHandlerCall_8e04ef7e58db2225b8b2(this, p0); }


public com.moon.al a__al() { return __sourceHandlerCall_92912801a0acf105fc0e(this); }


public com.moon.J a__J() {
return com.moon.J.a__J();
}


public com.moon.al a(com.google.protobuf.Descriptors.FieldDescriptor p0, java.lang.Object p1) {
return ((com.moon.al)(super.setField(((com.google.protobuf.Descriptors.FieldDescriptor)(p0)), ((java.lang.Object)(p1)))));
}


public com.moon.al a(com.google.protobuf.Descriptors.FieldDescriptor p0) {
return ((com.moon.al)(super.clearField(((com.google.protobuf.Descriptors.FieldDescriptor)(p0)))));
}


public com.moon.al a(com.google.protobuf.Descriptors.OneofDescriptor p0) {
return ((com.moon.al)(super.clearOneof(((com.google.protobuf.Descriptors.OneofDescriptor)(p0)))));
}


public com.moon.al a(com.google.protobuf.Descriptors.FieldDescriptor p0, int p1, java.lang.Object p2) {
return ((com.moon.al)(super.setRepeatedField(((com.google.protobuf.Descriptors.FieldDescriptor)(p0)), ((int)(p1)), ((java.lang.Object)(p2)))));
}


public com.moon.am a__am() {
((com.moon.al)(this)).onChanged();
    return ((com.moon.am)(((com.google.protobuf.SingleFieldBuilderV3)(((com.moon.al)(this)).a__SingleFieldBuilderV3())).getBuilder()));
}


public com.moon.K a__K() { return __sourceHandlerCall_7f8b96e941f2ddc0c715(this); }


public com.moon.al a(int p0) {
this.c = ((int)(p0));
    ((com.moon.al)(this)).onChanged();
    return this;
}


public com.moon.al a(com.moon.K p0) { return __sourceHandlerCall_f4bd04a0ef737b625421(this, p0); }


public com.moon.al a(com.moon.am p0) { return __sourceHandlerCall_25717dc6ce164b707a06(this, p0); }


public int a() {
return this.c;
}


public com.moon.al a(com.google.protobuf.ByteString p0) { return __sourceHandlerCall_d1d599903fa7e0065557(this, p0); }


public boolean a__Boolean() { return __sourceHandlerCall_055c5713806360520610(this); }


public com.moon.oH a__oH() { return __sourceHandlerCall_8125fe211cf3243e729e(this); }


public com.moon.al k() {
this.j = ((boolean)(false));
    ((com.moon.al)(this)).onChanged();
    return this;
}


public com.moon.al g() { return __sourceHandlerCall_4d209443cce2dadd4c83(this); }


public com.moon.al j() {
this.i = ((boolean)(false));
    ((com.moon.al)(this)).onChanged();
    return this;
}


public final boolean isInitialized() {
return ((1) != 0);
}


public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
return com.moon.oF.c;
}


protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
return ((com.google.protobuf.GeneratedMessageV3.FieldAccessorTable)(com.moon.oF.d)).ensureFieldAccessorsInitialized(((java.lang.Class)(com.moon.J.class)), ((java.lang.Class)(com.moon.al.class)));
}


public com.google.protobuf.MessageLite.Builder clone__MessageLiteInnerBuilder__sourceBridge_9503009a6c() {
return ((com.moon.al)(this)).b__al();
}

public com.google.protobuf.GeneratedMessageV3.Builder clone__GeneratedMessageV3InnerBuilder__sourceBridge_2dd0ad8dc0() {
return ((com.moon.al)(this)).b__al();
}

public com.google.protobuf.AbstractMessage.Builder clone__sourceBridge_36d0769a6a() {
return ((com.moon.al)(this)).b__al();
}

public com.moon.al clone() { return ((com.moon.al)(this.clone__sourceBridge_36d0769a6a())); }
public com.google.protobuf.Message.Builder clone__MessageInnerBuilder__sourceBridge_23266bf05e() {
return ((com.moon.al)(this)).b__al();
}

public java.lang.Object clone__Object__sourceBridge_0502b11602() throws java.lang.CloneNotSupportedException {
return ((com.moon.al)(this)).b__al();
}

public com.google.protobuf.AbstractMessageLite.Builder clone__AbstractMessageLiteInnerBuilder__sourceBridge_4fc5aa391f() {
return ((com.moon.al)(this)).b__al();
}

public com.google.protobuf.Message.Builder clear__MessageInnerBuilder__sourceBridge_23266bf05e() {
return ((com.moon.al)(this)).a__al();
}

public com.google.protobuf.AbstractMessage.Builder clear__sourceBridge_36d0769a6a() {
return ((com.moon.al)(this)).a__al();
}

public com.moon.al clear() { return ((com.moon.al)(this.clear__sourceBridge_36d0769a6a())); }
public com.google.protobuf.MessageLite.Builder clear__MessageLiteInnerBuilder__sourceBridge_9503009a6c() {
return ((com.moon.al)(this)).a__al();
}

public com.google.protobuf.GeneratedMessageV3.Builder clear__GeneratedMessageV3InnerBuilder__sourceBridge_2dd0ad8dc0() {
return ((com.moon.al)(this)).a__al();
}

public com.google.protobuf.Message build__sourceBridge_561eee1e9a() {
return ((com.moon.al)(this)).b__J();
}

public com.google.protobuf.Message build() { return ((com.google.protobuf.Message)(this.build__sourceBridge_561eee1e9a())); }
public com.google.protobuf.MessageLite build__MessageLite__sourceBridge_99b74750a2() {
return ((com.moon.al)(this)).b__J();
}

public com.google.protobuf.Message buildPartial__sourceBridge_561eee1e9a() {
return ((com.moon.al)(this)).c();
}

public com.google.protobuf.Message buildPartial() { return ((com.google.protobuf.Message)(this.buildPartial__sourceBridge_561eee1e9a())); }
public com.google.protobuf.MessageLite buildPartial__MessageLite__sourceBridge_99b74750a2() {
return ((com.moon.al)(this)).c();
}

public com.google.protobuf.Message.Builder setField__MessageInnerBuilder__sourceBridge_d5d25498d5(com.google.protobuf.Descriptors.FieldDescriptor p0, java.lang.Object p1) {
return ((com.moon.al)(this)).a(((com.google.protobuf.Descriptors.FieldDescriptor)(p0)), ((java.lang.Object)(p1)));
}

public com.google.protobuf.GeneratedMessageV3.Builder setField__sourceBridge_0269b32b8b(com.google.protobuf.Descriptors.FieldDescriptor p0, java.lang.Object p1) {
return ((com.moon.al)(this)).a(((com.google.protobuf.Descriptors.FieldDescriptor)(p0)), ((java.lang.Object)(p1)));
}

public com.moon.al setField(com.google.protobuf.Descriptors.FieldDescriptor __bridgeParam0, java.lang.Object __bridgeParam1) { return ((com.moon.al)(this.setField__sourceBridge_0269b32b8b(((com.google.protobuf.Descriptors.FieldDescriptor)(__bridgeParam0)), ((java.lang.Object)(__bridgeParam1))))); }
public com.google.protobuf.Message.Builder setRepeatedField__MessageInnerBuilder__sourceBridge_9e9db7eb5f(com.google.protobuf.Descriptors.FieldDescriptor p0, int p1, java.lang.Object p2) {
return ((com.moon.al)(this)).a(((com.google.protobuf.Descriptors.FieldDescriptor)(p0)), ((int)(p1)), ((java.lang.Object)(p2)));
}

public com.google.protobuf.GeneratedMessageV3.Builder setRepeatedField__sourceBridge_6dda4cebb2(com.google.protobuf.Descriptors.FieldDescriptor p0, int p1, java.lang.Object p2) {
return ((com.moon.al)(this)).a(((com.google.protobuf.Descriptors.FieldDescriptor)(p0)), ((int)(p1)), ((java.lang.Object)(p2)));
}

public com.moon.al setRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor __bridgeParam0, int __bridgeParam1, java.lang.Object __bridgeParam2) { return ((com.moon.al)(this.setRepeatedField__sourceBridge_6dda4cebb2(((com.google.protobuf.Descriptors.FieldDescriptor)(__bridgeParam0)), ((int)(__bridgeParam1)), ((java.lang.Object)(__bridgeParam2))))); }
public com.google.protobuf.Message.Builder clearField__MessageInnerBuilder__sourceBridge_23e4b7b587(com.google.protobuf.Descriptors.FieldDescriptor p0) {
return ((com.moon.al)(this)).a(((com.google.protobuf.Descriptors.FieldDescriptor)(p0)));
}

public com.google.protobuf.GeneratedMessageV3.Builder clearField__sourceBridge_e3938d6ecd(com.google.protobuf.Descriptors.FieldDescriptor p0) {
return ((com.moon.al)(this)).a(((com.google.protobuf.Descriptors.FieldDescriptor)(p0)));
}

public com.moon.al clearField(com.google.protobuf.Descriptors.FieldDescriptor __bridgeParam0) { return ((com.moon.al)(this.clearField__sourceBridge_e3938d6ecd(((com.google.protobuf.Descriptors.FieldDescriptor)(__bridgeParam0))))); }
public com.google.protobuf.GeneratedMessageV3.Builder addRepeatedField__sourceBridge_0269b32b8b(com.google.protobuf.Descriptors.FieldDescriptor p0, java.lang.Object p1) {
return ((com.moon.al)(this)).b(((com.google.protobuf.Descriptors.FieldDescriptor)(p0)), ((java.lang.Object)(p1)));
}

public com.moon.al addRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor __bridgeParam0, java.lang.Object __bridgeParam1) { return ((com.moon.al)(this.addRepeatedField__sourceBridge_0269b32b8b(((com.google.protobuf.Descriptors.FieldDescriptor)(__bridgeParam0)), ((java.lang.Object)(__bridgeParam1))))); }
public com.google.protobuf.Message.Builder addRepeatedField__MessageInnerBuilder__sourceBridge_d5d25498d5(com.google.protobuf.Descriptors.FieldDescriptor p0, java.lang.Object p1) {
return ((com.moon.al)(this)).b(((com.google.protobuf.Descriptors.FieldDescriptor)(p0)), ((java.lang.Object)(p1)));
}

public com.google.protobuf.GeneratedMessageV3.Builder clearOneof__GeneratedMessageV3InnerBuilder__sourceBridge_cca806b01c(com.google.protobuf.Descriptors.OneofDescriptor p0) {
return ((com.moon.al)(this)).a(((com.google.protobuf.Descriptors.OneofDescriptor)(p0)));
}

public com.google.protobuf.AbstractMessage.Builder clearOneof__sourceBridge_5f25fbcda8(com.google.protobuf.Descriptors.OneofDescriptor p0) {
return ((com.moon.al)(this)).a(((com.google.protobuf.Descriptors.OneofDescriptor)(p0)));
}

public com.moon.al clearOneof(com.google.protobuf.Descriptors.OneofDescriptor __bridgeParam0) { return ((com.moon.al)(this.clearOneof__sourceBridge_5f25fbcda8(((com.google.protobuf.Descriptors.OneofDescriptor)(__bridgeParam0))))); }
public com.google.protobuf.Message.Builder clearOneof__MessageInnerBuilder__sourceBridge_ea7c504747(com.google.protobuf.Descriptors.OneofDescriptor p0) {
return ((com.moon.al)(this)).a(((com.google.protobuf.Descriptors.OneofDescriptor)(p0)));
}

public com.google.protobuf.AbstractMessage.Builder mergeUnknownFields__sourceBridge_1d37e78876(com.google.protobuf.UnknownFieldSet p0) {
return ((com.moon.al)(this)).b(((com.google.protobuf.UnknownFieldSet)(p0)));
}

public com.moon.al mergeUnknownFields(com.google.protobuf.UnknownFieldSet __bridgeParam0) { return ((com.moon.al)(this.mergeUnknownFields__sourceBridge_1d37e78876(((com.google.protobuf.UnknownFieldSet)(__bridgeParam0))))); }
public com.google.protobuf.Message.Builder mergeUnknownFields__MessageInnerBuilder__sourceBridge_0115284766(com.google.protobuf.UnknownFieldSet p0) {
return ((com.moon.al)(this)).b(((com.google.protobuf.UnknownFieldSet)(p0)));
}

public com.google.protobuf.GeneratedMessageV3.Builder mergeUnknownFields__GeneratedMessageV3InnerBuilder__sourceBridge_c1a02174d9(com.google.protobuf.UnknownFieldSet p0) {
return ((com.moon.al)(this)).b(((com.google.protobuf.UnknownFieldSet)(p0)));
}

public com.google.protobuf.Message.Builder setUnknownFields__MessageInnerBuilder__sourceBridge_0115284766(com.google.protobuf.UnknownFieldSet p0) {
return ((com.moon.al)(this)).a(((com.google.protobuf.UnknownFieldSet)(p0)));
}

public com.google.protobuf.GeneratedMessageV3.Builder setUnknownFields__sourceBridge_c1a02174d9(com.google.protobuf.UnknownFieldSet p0) {
return ((com.moon.al)(this)).a(((com.google.protobuf.UnknownFieldSet)(p0)));
}

public com.moon.al setUnknownFields(com.google.protobuf.UnknownFieldSet __bridgeParam0) { return ((com.moon.al)(this.setUnknownFields__sourceBridge_c1a02174d9(((com.google.protobuf.UnknownFieldSet)(__bridgeParam0))))); }
public com.google.protobuf.Message getDefaultInstanceForType__sourceBridge_561eee1e9a() {
return ((com.moon.al)(this)).a__J();
}

public com.google.protobuf.Message getDefaultInstanceForType() { return ((com.google.protobuf.Message)(this.getDefaultInstanceForType__sourceBridge_561eee1e9a())); }
public com.google.protobuf.MessageLite getDefaultInstanceForType__MessageLite__sourceBridge_99b74750a2() {
return ((com.moon.al)(this)).a__J();
}

public com.google.protobuf.MessageLite.Builder mergeFrom__MessageLiteInnerBuilder__sourceBridge_1f3030ddff(com.google.protobuf.CodedInputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.al)(this)).a(((com.google.protobuf.CodedInputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)));
}

public com.google.protobuf.Message.Builder mergeFrom__MessageInnerBuilder__sourceBridge_d24d40278a(com.google.protobuf.CodedInputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.al)(this)).a(((com.google.protobuf.CodedInputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)));
}

public com.google.protobuf.AbstractMessage.Builder mergeFrom__sourceBridge_0e6f230f8a(com.google.protobuf.Message p0) {
return ((com.moon.al)(this)).a(((com.google.protobuf.Message)(p0)));
}

public com.moon.al mergeFrom(com.google.protobuf.Message __bridgeParam0) { return ((com.moon.al)(this.mergeFrom__sourceBridge_0e6f230f8a(((com.google.protobuf.Message)(__bridgeParam0))))); }
public com.google.protobuf.AbstractMessage.Builder mergeFrom__sourceBridge_811039b404(com.google.protobuf.CodedInputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.al)(this)).a(((com.google.protobuf.CodedInputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)));
}

public com.moon.al mergeFrom(com.google.protobuf.CodedInputStream __bridgeParam0, com.google.protobuf.ExtensionRegistryLite __bridgeParam1) throws java.io.IOException { return ((com.moon.al)(this.mergeFrom__sourceBridge_811039b404(((com.google.protobuf.CodedInputStream)(__bridgeParam0)), ((com.google.protobuf.ExtensionRegistryLite)(__bridgeParam1))))); }
public com.google.protobuf.AbstractMessageLite.Builder mergeFrom__AbstractMessageLiteInnerBuilder__sourceBridge_b3429bd776(com.google.protobuf.CodedInputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.al)(this)).a(((com.google.protobuf.CodedInputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)));
}

public com.google.protobuf.Message.Builder mergeFrom__MessageInnerBuilder__sourceBridge_21f2600f58(com.google.protobuf.Message p0) {
return ((com.moon.al)(this)).a(((com.google.protobuf.Message)(p0)));
}

}
