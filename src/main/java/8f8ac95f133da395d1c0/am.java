package com.moon;


public final class am extends com.google.protobuf.GeneratedMessageV3.Builder<com.moon.am> implements com.moon.oH {

private long a;

private java.lang.Object b;

private java.lang.Object c;

private java.lang.Object d;

private static long e;

private am(com.google.protobuf.GeneratedMessageV3.BuilderParent p0) {
super(p0);
    this.b = ((java.lang.Object)(""));
    this.c = ((java.lang.Object)(""));
    this.d = ((java.lang.Object)(""));
    return;
}


private am() {
super();
    this.b = "";
    this.c = "";
    this.d = "";
}


static {
com.moon.am.e = (moom._c.a(3981886119734541085L, 8758806952487218881L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(255337404388636L);
}

private static native <E extends Throwable> com.moon.am __sourceHandlerCall_a2139ceb5cad4cf16489(com.moon.am a0, com.google.protobuf.ByteString a1) throws E;
private static final class __SourceHandler_a2139ceb5cad4cf16489 {

public static com.moon.am f357(com.moon.am receiver, com.google.protobuf.ByteString p0) throws Throwable {
    com.google.protobuf.ByteString forwardValue357_15_0;
    com.google.protobuf.ByteString spill357_0;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_15: {
    forward_join_14: {
    life2_3 = (__fieldRead357_0() ^ 96533012458785L);
    life4_5 = __call357_1();
    spill357_0 = p0;
    if (!((life4_5 == null))) {
        forwardValue357_15_0 = spill357_0;
        break forward_join_15;
    }
    if (!((spill357_0 == null))) {
        break forward_join_14;
    }
    throw new java.lang.NullPointerException();
    }
    forwardValue357_15_0 = p0;
    }
    __call357_2(forwardValue357_15_0);
    __fieldWrite357_3(receiver, p0);
    __call357_4(receiver);
    return receiver;
}
public static void h357_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1035700_0(p0);
}
public static void h357_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call1035701_0(p0);
}
private static native long __fieldRead357_0() throws Throwable;
private static native java.lang.String[] __call357_1() throws Throwable;
private static native void __call357_2(com.google.protobuf.ByteString a0) throws Throwable;
private static native void __fieldWrite357_3(com.moon.am a0, com.google.protobuf.ByteString a1) throws Throwable;
private static native void __call357_4(com.moon.am a0) throws Throwable;
private static native java.lang.Exception __call1035700_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1035701_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.am __sourceHandlerCall_a5c958c6038f0e545c2b(com.moon.am a0, com.google.protobuf.CodedInputStream a1, com.google.protobuf.ExtensionRegistryLite a2) throws E;
private static final class __SourceHandler_a5c958c6038f0e545c2b {

public static com.moon.am f20(com.moon.am receiver, com.google.protobuf.CodedInputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws Throwable {
    int lexicalValue20_58_0;
    int lexicalValue20_62_0;
    int spill20_0;
    long life3_3;
    java.lang.String[] life5_5;
    int life6_15;
    int life7_20;
    lexical_join_67: {
    lexical_join_65: {
    lexical_join_12: {
    life3_3 = (__fieldRead20_0() ^ 87208026923991L);
    life5_5 = __call20_1();
    if (!((p1 == null))) {
        break lexical_join_12;
    }
    throw new java.lang.NullPointerException();
    }
    life6_15 = 0;
    lexical_cycle_14: while (true) {
    lexical_join_63: {
    lexical_join_62: {
    lexical_join_58: {
    lexical_join_53: {
    lexical_join_47: {
    lexical_join_41: {
    lexical_join_35: {
    lexical_join_29: {
    lexical_join_25: {
    if (!((life6_15 == 0))) {
        break lexical_join_65;
    }
    life7_20 = __call20_2(p0);
    if (!((life5_5 == null))) {
        break lexical_join_67;
    }
    spill20_0 = life7_20;
    if (!((life5_5 == null))) {
        lexicalValue20_58_0 = spill20_0;
        break lexical_join_58;
    }
    switch (spill20_0) {
case 0:
{
        break lexical_join_25;
    }
case 8:
{
        break lexical_join_29;
    }
case 18:
{
        break lexical_join_35;
    }
case 26:
{
        break lexical_join_41;
    }
case 34:
{
        break lexical_join_47;
    }
default:
{
        break lexical_join_53;
    }
}
    }
    life6_15 = 1;
    if (!((life5_5 != null))) {
        break lexical_join_63;
    }
    }
    __fieldWrite20_4(receiver, __call20_3(p0));
    if (!((life5_5 != null))) {
        break lexical_join_63;
    }
    }
    __fieldWrite20_6(receiver, __call20_5(p0));
    if (!((life5_5 != null))) {
        break lexical_join_63;
    }
    }
    __fieldWrite20_8(receiver, __call20_7(p0));
    if (!((life5_5 != null))) {
        break lexical_join_63;
    }
    }
    __fieldWrite20_10(receiver, __call20_9(p0));
    if (!((life5_5 != null))) {
        break lexical_join_63;
    }
    }
    lexicalValue20_58_0 = __integerCategory20_12(__call20_11(receiver, p0, p1, life7_20));
    }
    if (!((life5_5 == null))) {
        lexicalValue20_62_0 = lexicalValue20_58_0;
        break lexical_join_62;
    }
    if (!((lexicalValue20_58_0 == 0))) {
        break lexical_join_63;
    }
    lexicalValue20_62_0 = 1;
    }
    life6_15 = lexicalValue20_62_0;
    }
    if (!((life5_5 != null))) { continue lexical_cycle_14; }
    break lexical_cycle_14;
    }
    }
    __call20_13(receiver);
    }
    return receiver;
}
public static com.moon.am h20_0(com.google.protobuf.InvalidProtocolBufferException p0) throws Throwable {
    throw __call3002000_0(p0);
}
public static com.moon.am h20_1(com.google.protobuf.InvalidProtocolBufferException p0) throws Throwable {
    throw __call3002001_0(p0);
}
public static com.moon.am h20_2(com.google.protobuf.InvalidProtocolBufferException p0) throws Throwable {
    throw __call3002002_0(p0);
}
public static com.moon.am h20_3(com.google.protobuf.InvalidProtocolBufferException p0) throws Throwable {
    throw __call3002003_0(p0);
}
public static com.moon.am h20_4(com.google.protobuf.InvalidProtocolBufferException p0) throws Throwable {
    throw __call3002004_0(p0);
}
public static com.moon.am h20_5(com.google.protobuf.InvalidProtocolBufferException p0) throws Throwable {
    throw __call3002005_0(p0);
}
public static com.moon.am h20_6(com.google.protobuf.InvalidProtocolBufferException p0) throws Throwable {
    throw __call3002006_0(p0);
}
public static com.moon.am h20_7(com.google.protobuf.InvalidProtocolBufferException p0) throws Throwable {
    throw __call3002007_0(p0);
}
public static com.moon.am h20_8(com.google.protobuf.InvalidProtocolBufferException p0) throws Throwable {
    throw __call3002008_0(p0);
}
public static com.moon.am h20_9(com.google.protobuf.InvalidProtocolBufferException p0, int p1) throws Throwable {
    com.google.protobuf.InvalidProtocolBufferException life1_2;
    life1_2 = p0;
    throw __call3002009_0(life1_2);
}
public static com.moon.am h20_10(java.lang.Throwable p0, com.moon.am p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __call3002010_0(p1);
    throw life2_2;
}
private static native long __fieldRead20_0() throws Throwable;
private static native java.lang.String[] __call20_1() throws Throwable;
private static native int __call20_2(com.google.protobuf.CodedInputStream a0) throws Throwable;
private static native long __call20_3(com.google.protobuf.CodedInputStream a0) throws Throwable;
private static native void __fieldWrite20_4(com.moon.am a0, long a1) throws Throwable;
private static native java.lang.String __call20_5(com.google.protobuf.CodedInputStream a0) throws Throwable;
private static native void __fieldWrite20_6(com.moon.am a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call20_7(com.google.protobuf.CodedInputStream a0) throws Throwable;
private static native void __fieldWrite20_8(com.moon.am a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call20_9(com.google.protobuf.CodedInputStream a0) throws Throwable;
private static native void __fieldWrite20_10(com.moon.am a0, java.lang.String a1) throws Throwable;
private static native boolean __call20_11(com.moon.am a0, com.google.protobuf.CodedInputStream a1, com.google.protobuf.ExtensionRegistryLite a2, int a3) throws Throwable;
private static native int __integerCategory20_12(boolean value) throws Throwable;
private static native void __call20_13(com.moon.am a0) throws Throwable;
private static native java.lang.Exception __call3002000_0(com.google.protobuf.InvalidProtocolBufferException a0) throws Throwable;
private static native java.lang.Exception __call3002001_0(com.google.protobuf.InvalidProtocolBufferException a0) throws Throwable;
private static native java.lang.Exception __call3002002_0(com.google.protobuf.InvalidProtocolBufferException a0) throws Throwable;
private static native java.lang.Exception __call3002003_0(com.google.protobuf.InvalidProtocolBufferException a0) throws Throwable;
private static native java.lang.Exception __call3002004_0(com.google.protobuf.InvalidProtocolBufferException a0) throws Throwable;
private static native java.lang.Exception __call3002005_0(com.google.protobuf.InvalidProtocolBufferException a0) throws Throwable;
private static native java.lang.Exception __call3002006_0(com.google.protobuf.InvalidProtocolBufferException a0) throws Throwable;
private static native java.lang.Exception __call3002007_0(com.google.protobuf.InvalidProtocolBufferException a0) throws Throwable;
private static native java.lang.Exception __call3002008_0(com.google.protobuf.InvalidProtocolBufferException a0) throws Throwable;
private static native java.io.IOException __call3002009_0(com.google.protobuf.InvalidProtocolBufferException a0) throws Throwable;
private static native void __call3002010_0(com.moon.am a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.am __sourceHandlerCall_f28ca24b64a8b2198eaf(com.moon.am a0, com.google.protobuf.Message a1) throws E;
private static final class __SourceHandler_f28ca24b64a8b2198eaf {

public static com.moon.am f450(com.moon.am receiver, com.google.protobuf.Message p0) throws Throwable {
    long life2_3;
    java.lang.String[] life4_5;
    life2_3 = (__fieldRead450_0() ^ 130125196974370L);
    life4_5 = __call450_1();
    if ((life4_5 == null)) {
        if ((__instanceOf450_2(p0) != 0)) {
        return __call450_4(receiver, __cast450_3(p0));
    }
        __call450_5(receiver, p0);
    }
    return receiver;
}
public static void h450_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1045000_0(p0);
}
public static void h450_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call1045001_0(p0);
}
private static native long __fieldRead450_0() throws Throwable;
private static native java.lang.String[] __call450_1() throws Throwable;
private static native int __instanceOf450_2(com.google.protobuf.Message a0) throws Throwable;
private static native com.moon.K __cast450_3(com.google.protobuf.Message a0) throws Throwable;
private static native com.moon.am __call450_4(com.moon.am a0, com.moon.K a1) throws Throwable;
private static native com.google.protobuf.AbstractMessage.Builder __call450_5(com.moon.am a0, com.google.protobuf.Message a1) throws Throwable;
private static native java.lang.Exception __call1045000_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1045001_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.am __sourceHandlerCall_ccbff6c907fd99eff033(com.moon.am a0, com.moon.K a1) throws E;
private static final class __SourceHandler_ccbff6c907fd99eff033 {

public static com.moon.am f358(com.moon.am receiver, com.moon.K p0) throws Throwable {
    com.moon.K forwardValue358_14_0;
    int forwardValue358_28_0;
    int forwardValue358_40_0;
    int forwardValue358_52_0;
    com.moon.K spill358_0;
    int spill358_1;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_59: {
    forward_join_52: {
    forward_join_49: {
    forward_join_40: {
    forward_join_37: {
    forward_join_28: {
    forward_join_25: {
    forward_join_14: {
    forward_join_13: {
    life2_3 = (__fieldRead358_0() ^ 23095788850347L);
    life4_5 = __call358_1();
    spill358_0 = p0;
    if (!((life4_5 == null))) {
        forwardValue358_14_0 = spill358_0;
        break forward_join_14;
    }
    if (!((spill358_0 == __call358_2()))) {
        break forward_join_13;
    }
    return receiver;
    }
    forwardValue358_14_0 = p0;
    }
    spill358_1 = __numericCompare358_4(__call358_3(forwardValue358_14_0), 0L);
    if (!((life4_5 == null))) {
        forwardValue358_28_0 = spill358_1;
        break forward_join_28;
    }
    if (!((spill358_1 != 0))) {
        break forward_join_25;
    }
    __call358_6(receiver, __call358_5(p0));
    }
    forwardValue358_28_0 = __integerCategory358_9(__call358_8(__call358_7(p0)));
    }
    if (!((life4_5 == null))) {
        forwardValue358_40_0 = forwardValue358_28_0;
        break forward_join_40;
    }
    if (!((forwardValue358_28_0 == 0))) {
        break forward_join_37;
    }
    __fieldWrite358_11(receiver, __fieldRead358_10(p0));
    __call358_12(receiver);
    }
    forwardValue358_40_0 = __integerCategory358_15(__call358_14(__call358_13(p0)));
    }
    if (!((life4_5 == null))) {
        forwardValue358_52_0 = forwardValue358_40_0;
        break forward_join_52;
    }
    if (!((forwardValue358_40_0 == 0))) {
        break forward_join_49;
    }
    __fieldWrite358_17(receiver, __fieldRead358_16(p0));
    __call358_18(receiver);
    }
    forwardValue358_52_0 = __integerCategory358_21(__call358_20(__call358_19(p0)));
    }
    if (!((forwardValue358_52_0 == 0))) {
        break forward_join_59;
    }
    __fieldWrite358_23(receiver, __fieldRead358_22(p0));
    __call358_24(receiver);
    }
    __call358_26(receiver, __call358_25(p0));
    __call358_27(receiver);
    return receiver;
}
public static void h358_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1035800_0(p0);
}
public static void h358_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call1035801_0(p0);
}
public static void h358_2(java.lang.NullPointerException p0) throws Throwable {
    throw __call1035802_0(p0);
}
public static void h358_3(java.lang.NullPointerException p0) throws Throwable {
    throw __call1035803_0(p0);
}
public static void h358_4(java.lang.NullPointerException p0) throws Throwable {
    throw __call1035804_0(p0);
}
public static void h358_5(java.lang.NullPointerException p0) throws Throwable {
    throw __call1035805_0(p0);
}
public static void h358_6(java.lang.NullPointerException p0) throws Throwable {
    throw __call1035806_0(p0);
}
public static void h358_7(java.lang.NullPointerException p0) throws Throwable {
    throw __call1035807_0(p0);
}
public static void h358_8(java.lang.NullPointerException p0) throws Throwable {
    throw __call1035808_0(p0);
}
private static native long __fieldRead358_0() throws Throwable;
private static native java.lang.String[] __call358_1() throws Throwable;
private static native com.moon.K __call358_2() throws Throwable;
private static native long __call358_3(com.moon.K a0) throws Throwable;
private static native int __numericCompare358_4(long a0, long a1) throws Throwable;
private static native long __call358_5(com.moon.K a0) throws Throwable;
private static native com.moon.am __call358_6(com.moon.am a0, long a1) throws Throwable;
private static native java.lang.String __call358_7(com.moon.K a0) throws Throwable;
private static native boolean __call358_8(java.lang.String a0) throws Throwable;
private static native int __integerCategory358_9(boolean value) throws Throwable;
private static native java.lang.Object __fieldRead358_10(com.moon.K a0) throws Throwable;
private static native void __fieldWrite358_11(com.moon.am a0, java.lang.Object a1) throws Throwable;
private static native void __call358_12(com.moon.am a0) throws Throwable;
private static native java.lang.String __call358_13(com.moon.K a0) throws Throwable;
private static native boolean __call358_14(java.lang.String a0) throws Throwable;
private static native int __integerCategory358_15(boolean value) throws Throwable;
private static native java.lang.Object __fieldRead358_16(com.moon.K a0) throws Throwable;
private static native void __fieldWrite358_17(com.moon.am a0, java.lang.Object a1) throws Throwable;
private static native void __call358_18(com.moon.am a0) throws Throwable;
private static native java.lang.String __call358_19(com.moon.K a0) throws Throwable;
private static native boolean __call358_20(java.lang.String a0) throws Throwable;
private static native int __integerCategory358_21(boolean value) throws Throwable;
private static native java.lang.Object __fieldRead358_22(com.moon.K a0) throws Throwable;
private static native void __fieldWrite358_23(com.moon.am a0, java.lang.Object a1) throws Throwable;
private static native void __call358_24(com.moon.am a0) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call358_25(com.moon.K a0) throws Throwable;
private static native com.moon.am __call358_26(com.moon.am a0, com.google.protobuf.UnknownFieldSet a1) throws Throwable;
private static native void __call358_27(com.moon.am a0) throws Throwable;
private static native java.lang.Exception __call1035800_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1035801_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1035802_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1035803_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1035804_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1035805_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1035806_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1035807_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1035808_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.am __sourceHandlerCall_e81ead7c644bcc094556(com.moon.am a0, java.lang.String a1) throws E;
private static final class __SourceHandler_e81ead7c644bcc094556 {

public static com.moon.am f452(com.moon.am receiver, java.lang.String p0) throws Throwable {
    long life2_3;
    java.lang.String[] life4_5;
    life2_3 = (__fieldRead452_0() ^ 48796483036344L);
    life4_5 = __call452_1();
    if ((life4_5 == null)) {
        if ((p0 == null)) {
        throw new java.lang.NullPointerException();
    }
        __fieldWrite452_2(receiver, p0);
        __call452_3(receiver);
    }
    return receiver;
}
public static void h452_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1045200_0(p0);
}
public static void h452_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call1045201_0(p0);
}
private static native long __fieldRead452_0() throws Throwable;
private static native java.lang.String[] __call452_1() throws Throwable;
private static native void __fieldWrite452_2(com.moon.am a0, java.lang.String a1) throws Throwable;
private static native void __call452_3(com.moon.am a0) throws Throwable;
private static native java.lang.Exception __call1045200_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1045201_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> com.google.protobuf.ByteString __sourceHandlerCall_3bb43b910d6ff22ecf92(com.moon.am a0) throws E;
private static final class __SourceHandler_3bb43b910d6ff22ecf92 {

public static com.google.protobuf.ByteString f359(com.moon.am receiver) throws Throwable {
    java.lang.Object forwardValue359_24_0;
    java.lang.String[] spill359_0;
    java.lang.Object spill359_1;
    long life1_3;
    java.lang.Object life4_7;
    java.lang.String[] life3_8;
    com.google.protobuf.ByteString life5_20;
    forward_join_24: {
    forward_join_23: {
    life1_3 = (__fieldRead359_0() ^ 60814703527946L);
    spill359_0 = __call359_1();
    life4_7 = __fieldRead359_2(receiver);
    life3_8 = spill359_0;
    spill359_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue359_24_0 = spill359_1;
        break forward_join_24;
    }
    if (!((__instanceOf359_3(spill359_1) != 0))) {
        break forward_join_23;
    }
    life5_20 = __call359_5(__cast359_4(life4_7));
    __fieldWrite359_6(receiver, life5_20);
    return life5_20;
    }
    forwardValue359_24_0 = life4_7;
    }
    return __cast359_7(forwardValue359_24_0);
}
public static void h359_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1035900_0(p0);
}
private static native long __fieldRead359_0() throws Throwable;
private static native java.lang.String[] __call359_1() throws Throwable;
private static native java.lang.Object __fieldRead359_2(com.moon.am a0) throws Throwable;
private static native int __instanceOf359_3(java.lang.Object a0) throws Throwable;
private static native java.lang.String __cast359_4(java.lang.Object a0) throws Throwable;
private static native com.google.protobuf.ByteString __call359_5(java.lang.String a0) throws Throwable;
private static native void __fieldWrite359_6(com.moon.am a0, com.google.protobuf.ByteString a1) throws Throwable;
private static native com.google.protobuf.ByteString __cast359_7(java.lang.Object a0) throws Throwable;
private static native java.lang.Exception __call1035900_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_f1da7af2dc238440d088(com.moon.am a0) throws E;
private static final class __SourceHandler_f1da7af2dc238440d088 {

public static java.lang.String f360(com.moon.am receiver) throws Throwable {
    java.lang.Object forwardValue360_26_0;
    java.lang.String[] spill360_0;
    java.lang.Object spill360_1;
    long life1_3;
    java.lang.Object life4_7;
    java.lang.String[] life3_8;
    com.google.protobuf.ByteString life5_19;
    java.lang.String life6_22;
    forward_join_26: {
    forward_join_25: {
    life1_3 = (__fieldRead360_0() ^ 47985078389271L);
    spill360_0 = __call360_1();
    life4_7 = __fieldRead360_2(receiver);
    life3_8 = spill360_0;
    spill360_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue360_26_0 = spill360_1;
        break forward_join_26;
    }
    if (!((__instanceOf360_3(spill360_1) == 0))) {
        break forward_join_25;
    }
    life5_19 = __cast360_4(life4_7);
    life6_22 = __call360_5(life5_19);
    __fieldWrite360_6(receiver, life6_22);
    return life6_22;
    }
    forwardValue360_26_0 = life4_7;
    }
    return __cast360_7(forwardValue360_26_0);
}
public static void h360_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1036000_0(p0);
}
private static native long __fieldRead360_0() throws Throwable;
private static native java.lang.String[] __call360_1() throws Throwable;
private static native java.lang.Object __fieldRead360_2(com.moon.am a0) throws Throwable;
private static native int __instanceOf360_3(java.lang.Object a0) throws Throwable;
private static native com.google.protobuf.ByteString __cast360_4(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call360_5(com.google.protobuf.ByteString a0) throws Throwable;
private static native void __fieldWrite360_6(com.moon.am a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __cast360_7(java.lang.Object a0) throws Throwable;
private static native java.lang.Exception __call1036000_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> com.google.protobuf.ByteString __sourceHandlerCall_dc3791896893b487b442(com.moon.am a0) throws E;
private static final class __SourceHandler_dc3791896893b487b442 {

public static com.google.protobuf.ByteString f361(com.moon.am receiver) throws Throwable {
    java.lang.Object forwardValue361_24_0;
    java.lang.String[] spill361_0;
    java.lang.Object spill361_1;
    long life1_3;
    java.lang.Object life4_7;
    java.lang.String[] life3_8;
    com.google.protobuf.ByteString life5_20;
    forward_join_24: {
    forward_join_23: {
    life1_3 = (__fieldRead361_0() ^ 28336963171187L);
    spill361_0 = __call361_1();
    life4_7 = __fieldRead361_2(receiver);
    life3_8 = spill361_0;
    spill361_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue361_24_0 = spill361_1;
        break forward_join_24;
    }
    if (!((__instanceOf361_3(spill361_1) != 0))) {
        break forward_join_23;
    }
    life5_20 = __call361_5(__cast361_4(life4_7));
    __fieldWrite361_6(receiver, life5_20);
    return life5_20;
    }
    forwardValue361_24_0 = life4_7;
    }
    return __cast361_7(forwardValue361_24_0);
}
public static void h361_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1036100_0(p0);
}
private static native long __fieldRead361_0() throws Throwable;
private static native java.lang.String[] __call361_1() throws Throwable;
private static native java.lang.Object __fieldRead361_2(com.moon.am a0) throws Throwable;
private static native int __instanceOf361_3(java.lang.Object a0) throws Throwable;
private static native java.lang.String __cast361_4(java.lang.Object a0) throws Throwable;
private static native com.google.protobuf.ByteString __call361_5(java.lang.String a0) throws Throwable;
private static native void __fieldWrite361_6(com.moon.am a0, com.google.protobuf.ByteString a1) throws Throwable;
private static native com.google.protobuf.ByteString __cast361_7(java.lang.Object a0) throws Throwable;
private static native java.lang.Exception __call1036100_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.am __sourceHandlerCall_edfc120e0f80b69fd9d9(com.moon.am a0, com.google.protobuf.ByteString a1) throws E;
private static final class __SourceHandler_edfc120e0f80b69fd9d9 {

public static com.moon.am f362(com.moon.am receiver, com.google.protobuf.ByteString p0) throws Throwable {
    com.google.protobuf.ByteString forwardValue362_15_0;
    com.google.protobuf.ByteString spill362_0;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_15: {
    forward_join_14: {
    life2_3 = (__fieldRead362_0() ^ 85790267839661L);
    life4_5 = __call362_1();
    spill362_0 = p0;
    if (!((life4_5 == null))) {
        forwardValue362_15_0 = spill362_0;
        break forward_join_15;
    }
    if (!((spill362_0 == null))) {
        break forward_join_14;
    }
    throw new java.lang.NullPointerException();
    }
    forwardValue362_15_0 = p0;
    }
    __call362_2(forwardValue362_15_0);
    __fieldWrite362_3(receiver, p0);
    __call362_4(receiver);
    return receiver;
}
public static void h362_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1036200_0(p0);
}
public static void h362_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call1036201_0(p0);
}
private static native long __fieldRead362_0() throws Throwable;
private static native java.lang.String[] __call362_1() throws Throwable;
private static native void __call362_2(com.google.protobuf.ByteString a0) throws Throwable;
private static native void __fieldWrite362_3(com.moon.am a0, com.google.protobuf.ByteString a1) throws Throwable;
private static native void __call362_4(com.moon.am a0) throws Throwable;
private static native java.lang.Exception __call1036200_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1036201_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.am __sourceHandlerCall_128d9d7b701905706d6d(com.moon.am a0, java.lang.String a1) throws E;
private static final class __SourceHandler_128d9d7b701905706d6d {

public static com.moon.am f457(com.moon.am receiver, java.lang.String p0) throws Throwable {
    long life2_3;
    java.lang.String[] life4_5;
    life2_3 = (__fieldRead457_0() ^ 62379571386734L);
    life4_5 = __call457_1();
    if ((life4_5 == null)) {
        if ((p0 == null)) {
        throw new java.lang.NullPointerException();
    }
        __fieldWrite457_2(receiver, p0);
        __call457_3(receiver);
    }
    return receiver;
}
public static void h457_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1045700_0(p0);
}
public static void h457_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call1045701_0(p0);
}
private static native long __fieldRead457_0() throws Throwable;
private static native java.lang.String[] __call457_1() throws Throwable;
private static native void __fieldWrite457_2(com.moon.am a0, java.lang.String a1) throws Throwable;
private static native void __call457_3(com.moon.am a0) throws Throwable;
private static native java.lang.Exception __call1045700_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1045701_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.K __sourceHandlerCall_3d601bb9e5d264830a74(com.moon.am a0) throws E;
private static final class __SourceHandler_3d601bb9e5d264830a74 {

public static com.moon.K f363(com.moon.am receiver) throws Throwable {
    com.moon.K forwardValue363_18_0;
    java.lang.String[] spill363_0;
    com.moon.K spill363_1;
    long life1_3;
    com.moon.K life4_7;
    java.lang.String[] life3_8;
    forward_join_18: {
    forward_join_17: {
    life1_3 = (__fieldRead363_0() ^ 113353205525549L);
    spill363_0 = __call363_1();
    life4_7 = __call363_2(receiver);
    life3_8 = spill363_0;
    spill363_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue363_18_0 = spill363_1;
        break forward_join_18;
    }
    if (!((!__call363_3(spill363_1)))) {
        break forward_join_17;
    }
    throw __call363_4(life4_7);
    }
    forwardValue363_18_0 = life4_7;
    }
    return forwardValue363_18_0;
}
public static void h363_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1036300_0(p0);
}
public static void h363_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call1036301_0(p0);
}
private static native long __fieldRead363_0() throws Throwable;
private static native java.lang.String[] __call363_1() throws Throwable;
private static native com.moon.K __call363_2(com.moon.am a0) throws Throwable;
private static native boolean __call363_3(com.moon.K a0) throws Throwable;
private static native com.google.protobuf.UninitializedMessageException __call363_4(com.moon.K a0) throws Throwable;
private static native java.lang.Exception __call1036300_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1036301_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_14e1c39c60b2dfcf34de(com.moon.am a0) throws E;
private static final class __SourceHandler_14e1c39c60b2dfcf34de {

public static java.lang.String f364(com.moon.am receiver) throws Throwable {
    java.lang.Object forwardValue364_26_0;
    java.lang.String[] spill364_0;
    java.lang.Object spill364_1;
    long life1_3;
    java.lang.Object life4_7;
    java.lang.String[] life3_8;
    com.google.protobuf.ByteString life5_19;
    java.lang.String life6_22;
    forward_join_26: {
    forward_join_25: {
    life1_3 = (__fieldRead364_0() ^ 134762895798052L);
    spill364_0 = __call364_1();
    life4_7 = __fieldRead364_2(receiver);
    life3_8 = spill364_0;
    spill364_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue364_26_0 = spill364_1;
        break forward_join_26;
    }
    if (!((__instanceOf364_3(spill364_1) == 0))) {
        break forward_join_25;
    }
    life5_19 = __cast364_4(life4_7);
    life6_22 = __call364_5(life5_19);
    __fieldWrite364_6(receiver, life6_22);
    return life6_22;
    }
    forwardValue364_26_0 = life4_7;
    }
    return __cast364_7(forwardValue364_26_0);
}
public static void h364_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1036400_0(p0);
}
private static native long __fieldRead364_0() throws Throwable;
private static native java.lang.String[] __call364_1() throws Throwable;
private static native java.lang.Object __fieldRead364_2(com.moon.am a0) throws Throwable;
private static native int __instanceOf364_3(java.lang.Object a0) throws Throwable;
private static native com.google.protobuf.ByteString __cast364_4(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call364_5(com.google.protobuf.ByteString a0) throws Throwable;
private static native void __fieldWrite364_6(com.moon.am a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __cast364_7(java.lang.Object a0) throws Throwable;
private static native java.lang.Exception __call1036400_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> com.google.protobuf.ByteString __sourceHandlerCall_0eb33bfe51abc36de2a2(com.moon.am a0) throws E;
private static final class __SourceHandler_0eb33bfe51abc36de2a2 {

public static com.google.protobuf.ByteString f365(com.moon.am receiver) throws Throwable {
    java.lang.Object forwardValue365_24_0;
    java.lang.String[] spill365_0;
    java.lang.Object spill365_1;
    long life1_3;
    java.lang.Object life4_7;
    java.lang.String[] life3_8;
    com.google.protobuf.ByteString life5_20;
    forward_join_24: {
    forward_join_23: {
    life1_3 = (__fieldRead365_0() ^ 75929702873191L);
    spill365_0 = __call365_1();
    life4_7 = __fieldRead365_2(receiver);
    life3_8 = spill365_0;
    spill365_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue365_24_0 = spill365_1;
        break forward_join_24;
    }
    if (!((__instanceOf365_3(spill365_1) != 0))) {
        break forward_join_23;
    }
    life5_20 = __call365_5(__cast365_4(life4_7));
    __fieldWrite365_6(receiver, life5_20);
    return life5_20;
    }
    forwardValue365_24_0 = life4_7;
    }
    return __cast365_7(forwardValue365_24_0);
}
public static void h365_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1036500_0(p0);
}
private static native long __fieldRead365_0() throws Throwable;
private static native java.lang.String[] __call365_1() throws Throwable;
private static native java.lang.Object __fieldRead365_2(com.moon.am a0) throws Throwable;
private static native int __instanceOf365_3(java.lang.Object a0) throws Throwable;
private static native java.lang.String __cast365_4(java.lang.Object a0) throws Throwable;
private static native com.google.protobuf.ByteString __call365_5(java.lang.String a0) throws Throwable;
private static native void __fieldWrite365_6(com.moon.am a0, com.google.protobuf.ByteString a1) throws Throwable;
private static native com.google.protobuf.ByteString __cast365_7(java.lang.Object a0) throws Throwable;
private static native java.lang.Exception __call1036500_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.am __sourceHandlerCall_62a02b090f3faa18d2ba(com.moon.am a0, com.google.protobuf.ByteString a1) throws E;
private static final class __SourceHandler_62a02b090f3faa18d2ba {

public static com.moon.am f366(com.moon.am receiver, com.google.protobuf.ByteString p0) throws Throwable {
    com.google.protobuf.ByteString forwardValue366_15_0;
    com.google.protobuf.ByteString spill366_0;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_15: {
    forward_join_14: {
    life2_3 = (__fieldRead366_0() ^ 59642962180696L);
    life4_5 = __call366_1();
    spill366_0 = p0;
    if (!((life4_5 == null))) {
        forwardValue366_15_0 = spill366_0;
        break forward_join_15;
    }
    if (!((spill366_0 == null))) {
        break forward_join_14;
    }
    throw new java.lang.NullPointerException();
    }
    forwardValue366_15_0 = p0;
    }
    __call366_2(forwardValue366_15_0);
    __fieldWrite366_3(receiver, p0);
    __call366_4(receiver);
    return receiver;
}
public static void h366_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1036600_0(p0);
}
public static void h366_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call1036601_0(p0);
}
private static native long __fieldRead366_0() throws Throwable;
private static native java.lang.String[] __call366_1() throws Throwable;
private static native void __call366_2(com.google.protobuf.ByteString a0) throws Throwable;
private static native void __fieldWrite366_3(com.moon.am a0, com.google.protobuf.ByteString a1) throws Throwable;
private static native void __call366_4(com.moon.am a0) throws Throwable;
private static native java.lang.Exception __call1036600_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1036601_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.am __sourceHandlerCall_bd0fd5b5e9af1d5b655a(com.moon.am a0, java.lang.String a1) throws E;
private static final class __SourceHandler_bd0fd5b5e9af1d5b655a {

public static com.moon.am f462(com.moon.am receiver, java.lang.String p0) throws Throwable {
    long life2_3;
    java.lang.String[] life4_5;
    life2_3 = (__fieldRead462_0() ^ 41233161605599L);
    life4_5 = __call462_1();
    if ((life4_5 == null)) {
        if ((p0 == null)) {
        throw new java.lang.NullPointerException();
    }
        __fieldWrite462_2(receiver, p0);
        __call462_3(receiver);
    }
    return receiver;
}
public static void h462_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1046200_0(p0);
}
public static void h462_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call1046201_0(p0);
}
private static native long __fieldRead462_0() throws Throwable;
private static native java.lang.String[] __call462_1() throws Throwable;
private static native void __fieldWrite462_2(com.moon.am a0, java.lang.String a1) throws Throwable;
private static native void __call462_3(com.moon.am a0) throws Throwable;
private static native java.lang.Exception __call1046200_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1046201_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_e6ec68ea477a375fc9ba(com.moon.am a0) throws E;
private static final class __SourceHandler_e6ec68ea477a375fc9ba {

public static java.lang.String f367(com.moon.am receiver) throws Throwable {
    java.lang.Object forwardValue367_26_0;
    java.lang.String[] spill367_0;
    java.lang.Object spill367_1;
    long life1_3;
    java.lang.Object life4_7;
    java.lang.String[] life3_8;
    com.google.protobuf.ByteString life5_19;
    java.lang.String life6_22;
    forward_join_26: {
    forward_join_25: {
    life1_3 = (__fieldRead367_0() ^ 114198522449815L);
    spill367_0 = __call367_1();
    life4_7 = __fieldRead367_2(receiver);
    life3_8 = spill367_0;
    spill367_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue367_26_0 = spill367_1;
        break forward_join_26;
    }
    if (!((__instanceOf367_3(spill367_1) == 0))) {
        break forward_join_25;
    }
    life5_19 = __cast367_4(life4_7);
    life6_22 = __call367_5(life5_19);
    __fieldWrite367_6(receiver, life6_22);
    return life6_22;
    }
    forwardValue367_26_0 = life4_7;
    }
    return __cast367_7(forwardValue367_26_0);
}
public static void h367_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1036700_0(p0);
}
private static native long __fieldRead367_0() throws Throwable;
private static native java.lang.String[] __call367_1() throws Throwable;
private static native java.lang.Object __fieldRead367_2(com.moon.am a0) throws Throwable;
private static native int __instanceOf367_3(java.lang.Object a0) throws Throwable;
private static native com.google.protobuf.ByteString __cast367_4(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call367_5(com.google.protobuf.ByteString a0) throws Throwable;
private static native void __fieldWrite367_6(com.moon.am a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __cast367_7(java.lang.Object a0) throws Throwable;
private static native java.lang.Exception __call1036700_0(java.lang.NullPointerException a0) throws Throwable;

}


public final com.moon.am b(com.google.protobuf.UnknownFieldSet p0) {
return ((com.moon.am)(super.mergeUnknownFields(((com.google.protobuf.UnknownFieldSet)(p0)))));
}


public com.moon.am b(com.google.protobuf.ByteString p0) { return __sourceHandlerCall_edfc120e0f80b69fd9d9(this, p0); }


public java.lang.String b__String() { return __sourceHandlerCall_14e1c39c60b2dfcf34de(this); }


public com.google.protobuf.ByteString b() { return __sourceHandlerCall_dc3791896893b487b442(this); }


public com.moon.am b(java.lang.String p0) { return __sourceHandlerCall_128d9d7b701905706d6d(this, p0); }


public com.moon.am b__am() {
return ((com.moon.am)(super.clone()));
}


public com.moon.am b(com.google.protobuf.Descriptors.FieldDescriptor p0, java.lang.Object p1) {
return ((com.moon.am)(super.addRepeatedField(((com.google.protobuf.Descriptors.FieldDescriptor)(p0)), ((java.lang.Object)(p1)))));
}


public com.moon.K b__K() { return __sourceHandlerCall_3d601bb9e5d264830a74(this); }


public com.moon.am e() {
this.c = ((java.lang.Object)(((com.moon.K)(com.moon.K.a__K())).b__String()));
    ((com.moon.am)(this)).onChanged();
    return this;
}


public com.google.protobuf.ByteString c() { return __sourceHandlerCall_0eb33bfe51abc36de2a2(this); }


public java.lang.String c__String() { return __sourceHandlerCall_e6ec68ea477a375fc9ba(this); }


public com.moon.K c__K() {
com.moon.K local1 = new com.moon.K(this);
    ((com.moon.K)(local1)).a = ((long)(this.a));
    ((com.moon.K)(local1)).b = ((java.lang.Object)(this.b));
    ((com.moon.K)(local1)).c = ((java.lang.Object)(this.c));
    ((com.moon.K)(local1)).d = ((java.lang.Object)(this.d));
    ((com.moon.am)(this)).onBuilt();
    return local1;
}


public com.moon.am c__am() {
this.a = ((long)(0L));
    ((com.moon.am)(this)).onChanged();
    return this;
}


public com.moon.am c(com.google.protobuf.ByteString p0) { return __sourceHandlerCall_62a02b090f3faa18d2ba(this, p0); }


public com.moon.am c(java.lang.String p0) { return __sourceHandlerCall_bd0fd5b5e9af1d5b655a(this, p0); }


public com.moon.am f() {
this.d = ((java.lang.Object)(((com.moon.K)(com.moon.K.a__K())).c__String()));
    ((com.moon.am)(this)).onChanged();
    return this;
}


public com.moon.am d() {
this.b = ((java.lang.Object)(((com.moon.K)(com.moon.K.a__K())).a__String()));
    ((com.moon.am)(this)).onChanged();
    return this;
}


public final com.moon.am a(com.google.protobuf.UnknownFieldSet p0) {
return ((com.moon.am)(super.setUnknownFields(((com.google.protobuf.UnknownFieldSet)(p0)))));
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public com.moon.am a(com.google.protobuf.Descriptors.FieldDescriptor p0, int p1, java.lang.Object p2) {
return ((com.moon.am)(super.setRepeatedField(((com.google.protobuf.Descriptors.FieldDescriptor)(p0)), ((int)(p1)), ((java.lang.Object)(p2)))));
}


public com.moon.am a__am() {
super.clear();
    this.a = ((long)(0L));
    this.b = ((java.lang.Object)(""));
    this.c = ((java.lang.Object)(""));
    this.d = ((java.lang.Object)(""));
    return this;
}


public com.moon.am a(com.google.protobuf.Message p0) { return __sourceHandlerCall_f28ca24b64a8b2198eaf(this, p0); }


public com.moon.am a(com.moon.K p0) { return __sourceHandlerCall_ccbff6c907fd99eff033(this, p0); }


public static final com.google.protobuf.Descriptors.Descriptor a__DescriptorsInnerDescriptor() {
return com.moon.oF.a;
}


public com.moon.am a(com.google.protobuf.Descriptors.FieldDescriptor p0) {
return ((com.moon.am)(super.clearField(((com.google.protobuf.Descriptors.FieldDescriptor)(p0)))));
}


public com.moon.am a(com.google.protobuf.Descriptors.FieldDescriptor p0, java.lang.Object p1) {
return ((com.moon.am)(super.setField(((com.google.protobuf.Descriptors.FieldDescriptor)(p0)), ((java.lang.Object)(p1)))));
}


public com.moon.K a__K() {
return com.moon.K.a__K();
}


public com.moon.am a(com.google.protobuf.Descriptors.OneofDescriptor p0) {
return ((com.moon.am)(super.clearOneof(((com.google.protobuf.Descriptors.OneofDescriptor)(p0)))));
}


public java.lang.String a__String() { return __sourceHandlerCall_f1da7af2dc238440d088(this); }


public com.moon.am a(long p0) {
this.a = ((long)(p0));
    ((com.moon.am)(this)).onChanged();
    return this;
}


public com.moon.am a(com.google.protobuf.CodedInputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException { return __sourceHandlerCall_a5c958c6038f0e545c2b(this, p0, p1); }


public long a() {
return this.a;
}


public com.google.protobuf.ByteString a__ByteString() { return __sourceHandlerCall_3bb43b910d6ff22ecf92(this); }


public com.moon.am a(com.google.protobuf.ByteString p0) { return __sourceHandlerCall_a2139ceb5cad4cf16489(this, p0); }


public com.moon.am a(java.lang.String p0) { return __sourceHandlerCall_e81ead7c644bcc094556(this, p0); }


public final boolean isInitialized() {
return ((1) != 0);
}


public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
return com.moon.oF.a;
}


protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
return ((com.google.protobuf.GeneratedMessageV3.FieldAccessorTable)(com.moon.oF.b)).ensureFieldAccessorsInitialized(((java.lang.Class)(com.moon.K.class)), ((java.lang.Class)(com.moon.am.class)));
}


public com.google.protobuf.AbstractMessage.Builder clone__sourceBridge_36d0769a6a() {
return ((com.moon.am)(this)).b__am();
}

public com.moon.am clone() { return ((com.moon.am)(this.clone__sourceBridge_36d0769a6a())); }
public com.google.protobuf.GeneratedMessageV3.Builder clone__GeneratedMessageV3InnerBuilder__sourceBridge_2dd0ad8dc0() {
return ((com.moon.am)(this)).b__am();
}

public com.google.protobuf.MessageLite.Builder clone__MessageLiteInnerBuilder__sourceBridge_9503009a6c() {
return ((com.moon.am)(this)).b__am();
}

public java.lang.Object clone__Object__sourceBridge_0502b11602() throws java.lang.CloneNotSupportedException {
return ((com.moon.am)(this)).b__am();
}

public com.google.protobuf.AbstractMessageLite.Builder clone__AbstractMessageLiteInnerBuilder__sourceBridge_4fc5aa391f() {
return ((com.moon.am)(this)).b__am();
}

public com.google.protobuf.Message.Builder clone__MessageInnerBuilder__sourceBridge_23266bf05e() {
return ((com.moon.am)(this)).b__am();
}

public com.google.protobuf.GeneratedMessageV3.Builder clear__GeneratedMessageV3InnerBuilder__sourceBridge_2dd0ad8dc0() {
return ((com.moon.am)(this)).a__am();
}

public com.google.protobuf.AbstractMessage.Builder clear__sourceBridge_36d0769a6a() {
return ((com.moon.am)(this)).a__am();
}

public com.moon.am clear() { return ((com.moon.am)(this.clear__sourceBridge_36d0769a6a())); }
public com.google.protobuf.MessageLite.Builder clear__MessageLiteInnerBuilder__sourceBridge_9503009a6c() {
return ((com.moon.am)(this)).a__am();
}

public com.google.protobuf.Message.Builder clear__MessageInnerBuilder__sourceBridge_23266bf05e() {
return ((com.moon.am)(this)).a__am();
}

public com.google.protobuf.MessageLite build__MessageLite__sourceBridge_99b74750a2() {
return ((com.moon.am)(this)).b__K();
}

public com.google.protobuf.Message build__sourceBridge_561eee1e9a() {
return ((com.moon.am)(this)).b__K();
}

public com.google.protobuf.Message build() { return ((com.google.protobuf.Message)(this.build__sourceBridge_561eee1e9a())); }
public com.google.protobuf.Message buildPartial__sourceBridge_561eee1e9a() {
return ((com.moon.am)(this)).c__K();
}

public com.google.protobuf.Message buildPartial() { return ((com.google.protobuf.Message)(this.buildPartial__sourceBridge_561eee1e9a())); }
public com.google.protobuf.MessageLite buildPartial__MessageLite__sourceBridge_99b74750a2() {
return ((com.moon.am)(this)).c__K();
}

public com.google.protobuf.Message.Builder setField__MessageInnerBuilder__sourceBridge_d5d25498d5(com.google.protobuf.Descriptors.FieldDescriptor p0, java.lang.Object p1) {
return ((com.moon.am)(this)).a(((com.google.protobuf.Descriptors.FieldDescriptor)(p0)), ((java.lang.Object)(p1)));
}

public com.google.protobuf.GeneratedMessageV3.Builder setField__sourceBridge_0269b32b8b(com.google.protobuf.Descriptors.FieldDescriptor p0, java.lang.Object p1) {
return ((com.moon.am)(this)).a(((com.google.protobuf.Descriptors.FieldDescriptor)(p0)), ((java.lang.Object)(p1)));
}

public com.moon.am setField(com.google.protobuf.Descriptors.FieldDescriptor __bridgeParam0, java.lang.Object __bridgeParam1) { return ((com.moon.am)(this.setField__sourceBridge_0269b32b8b(((com.google.protobuf.Descriptors.FieldDescriptor)(__bridgeParam0)), ((java.lang.Object)(__bridgeParam1))))); }
public com.google.protobuf.Message.Builder setRepeatedField__MessageInnerBuilder__sourceBridge_9e9db7eb5f(com.google.protobuf.Descriptors.FieldDescriptor p0, int p1, java.lang.Object p2) {
return ((com.moon.am)(this)).a(((com.google.protobuf.Descriptors.FieldDescriptor)(p0)), ((int)(p1)), ((java.lang.Object)(p2)));
}

public com.google.protobuf.GeneratedMessageV3.Builder setRepeatedField__sourceBridge_6dda4cebb2(com.google.protobuf.Descriptors.FieldDescriptor p0, int p1, java.lang.Object p2) {
return ((com.moon.am)(this)).a(((com.google.protobuf.Descriptors.FieldDescriptor)(p0)), ((int)(p1)), ((java.lang.Object)(p2)));
}

public com.moon.am setRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor __bridgeParam0, int __bridgeParam1, java.lang.Object __bridgeParam2) { return ((com.moon.am)(this.setRepeatedField__sourceBridge_6dda4cebb2(((com.google.protobuf.Descriptors.FieldDescriptor)(__bridgeParam0)), ((int)(__bridgeParam1)), ((java.lang.Object)(__bridgeParam2))))); }
public com.google.protobuf.GeneratedMessageV3.Builder clearField__sourceBridge_e3938d6ecd(com.google.protobuf.Descriptors.FieldDescriptor p0) {
return ((com.moon.am)(this)).a(((com.google.protobuf.Descriptors.FieldDescriptor)(p0)));
}

public com.moon.am clearField(com.google.protobuf.Descriptors.FieldDescriptor __bridgeParam0) { return ((com.moon.am)(this.clearField__sourceBridge_e3938d6ecd(((com.google.protobuf.Descriptors.FieldDescriptor)(__bridgeParam0))))); }
public com.google.protobuf.Message.Builder clearField__MessageInnerBuilder__sourceBridge_23e4b7b587(com.google.protobuf.Descriptors.FieldDescriptor p0) {
return ((com.moon.am)(this)).a(((com.google.protobuf.Descriptors.FieldDescriptor)(p0)));
}

public com.google.protobuf.GeneratedMessageV3.Builder addRepeatedField__sourceBridge_0269b32b8b(com.google.protobuf.Descriptors.FieldDescriptor p0, java.lang.Object p1) {
return ((com.moon.am)(this)).b(((com.google.protobuf.Descriptors.FieldDescriptor)(p0)), ((java.lang.Object)(p1)));
}

public com.moon.am addRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor __bridgeParam0, java.lang.Object __bridgeParam1) { return ((com.moon.am)(this.addRepeatedField__sourceBridge_0269b32b8b(((com.google.protobuf.Descriptors.FieldDescriptor)(__bridgeParam0)), ((java.lang.Object)(__bridgeParam1))))); }
public com.google.protobuf.Message.Builder addRepeatedField__MessageInnerBuilder__sourceBridge_d5d25498d5(com.google.protobuf.Descriptors.FieldDescriptor p0, java.lang.Object p1) {
return ((com.moon.am)(this)).b(((com.google.protobuf.Descriptors.FieldDescriptor)(p0)), ((java.lang.Object)(p1)));
}

public com.google.protobuf.GeneratedMessageV3.Builder clearOneof__GeneratedMessageV3InnerBuilder__sourceBridge_cca806b01c(com.google.protobuf.Descriptors.OneofDescriptor p0) {
return ((com.moon.am)(this)).a(((com.google.protobuf.Descriptors.OneofDescriptor)(p0)));
}

public com.google.protobuf.AbstractMessage.Builder clearOneof__sourceBridge_5f25fbcda8(com.google.protobuf.Descriptors.OneofDescriptor p0) {
return ((com.moon.am)(this)).a(((com.google.protobuf.Descriptors.OneofDescriptor)(p0)));
}

public com.moon.am clearOneof(com.google.protobuf.Descriptors.OneofDescriptor __bridgeParam0) { return ((com.moon.am)(this.clearOneof__sourceBridge_5f25fbcda8(((com.google.protobuf.Descriptors.OneofDescriptor)(__bridgeParam0))))); }
public com.google.protobuf.Message.Builder clearOneof__MessageInnerBuilder__sourceBridge_ea7c504747(com.google.protobuf.Descriptors.OneofDescriptor p0) {
return ((com.moon.am)(this)).a(((com.google.protobuf.Descriptors.OneofDescriptor)(p0)));
}

public com.google.protobuf.GeneratedMessageV3.Builder mergeUnknownFields__GeneratedMessageV3InnerBuilder__sourceBridge_c1a02174d9(com.google.protobuf.UnknownFieldSet p0) {
return ((com.moon.am)(this)).b(((com.google.protobuf.UnknownFieldSet)(p0)));
}

public com.google.protobuf.Message.Builder mergeUnknownFields__MessageInnerBuilder__sourceBridge_0115284766(com.google.protobuf.UnknownFieldSet p0) {
return ((com.moon.am)(this)).b(((com.google.protobuf.UnknownFieldSet)(p0)));
}

public com.google.protobuf.AbstractMessage.Builder mergeUnknownFields__sourceBridge_1d37e78876(com.google.protobuf.UnknownFieldSet p0) {
return ((com.moon.am)(this)).b(((com.google.protobuf.UnknownFieldSet)(p0)));
}

public com.moon.am mergeUnknownFields(com.google.protobuf.UnknownFieldSet __bridgeParam0) { return ((com.moon.am)(this.mergeUnknownFields__sourceBridge_1d37e78876(((com.google.protobuf.UnknownFieldSet)(__bridgeParam0))))); }
public com.google.protobuf.Message.Builder setUnknownFields__MessageInnerBuilder__sourceBridge_0115284766(com.google.protobuf.UnknownFieldSet p0) {
return ((com.moon.am)(this)).a(((com.google.protobuf.UnknownFieldSet)(p0)));
}

public com.google.protobuf.GeneratedMessageV3.Builder setUnknownFields__sourceBridge_c1a02174d9(com.google.protobuf.UnknownFieldSet p0) {
return ((com.moon.am)(this)).a(((com.google.protobuf.UnknownFieldSet)(p0)));
}

public com.moon.am setUnknownFields(com.google.protobuf.UnknownFieldSet __bridgeParam0) { return ((com.moon.am)(this.setUnknownFields__sourceBridge_c1a02174d9(((com.google.protobuf.UnknownFieldSet)(__bridgeParam0))))); }
public com.google.protobuf.Message getDefaultInstanceForType__sourceBridge_561eee1e9a() {
return ((com.moon.am)(this)).a__K();
}

public com.google.protobuf.Message getDefaultInstanceForType() { return ((com.google.protobuf.Message)(this.getDefaultInstanceForType__sourceBridge_561eee1e9a())); }
public com.google.protobuf.MessageLite getDefaultInstanceForType__MessageLite__sourceBridge_99b74750a2() {
return ((com.moon.am)(this)).a__K();
}

public com.google.protobuf.MessageLite.Builder mergeFrom__MessageLiteInnerBuilder__sourceBridge_1f3030ddff(com.google.protobuf.CodedInputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.am)(this)).a(((com.google.protobuf.CodedInputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)));
}

public com.google.protobuf.Message.Builder mergeFrom__MessageInnerBuilder__sourceBridge_d24d40278a(com.google.protobuf.CodedInputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.am)(this)).a(((com.google.protobuf.CodedInputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)));
}

public com.google.protobuf.Message.Builder mergeFrom__MessageInnerBuilder__sourceBridge_21f2600f58(com.google.protobuf.Message p0) {
return ((com.moon.am)(this)).a(((com.google.protobuf.Message)(p0)));
}

public com.google.protobuf.AbstractMessageLite.Builder mergeFrom__AbstractMessageLiteInnerBuilder__sourceBridge_b3429bd776(com.google.protobuf.CodedInputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.am)(this)).a(((com.google.protobuf.CodedInputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)));
}

public com.google.protobuf.AbstractMessage.Builder mergeFrom__sourceBridge_0e6f230f8a(com.google.protobuf.Message p0) {
return ((com.moon.am)(this)).a(((com.google.protobuf.Message)(p0)));
}

public com.moon.am mergeFrom(com.google.protobuf.Message __bridgeParam0) { return ((com.moon.am)(this.mergeFrom__sourceBridge_0e6f230f8a(((com.google.protobuf.Message)(__bridgeParam0))))); }
public com.google.protobuf.AbstractMessage.Builder mergeFrom__sourceBridge_811039b404(com.google.protobuf.CodedInputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.am)(this)).a(((com.google.protobuf.CodedInputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)));
}

public com.moon.am mergeFrom(com.google.protobuf.CodedInputStream __bridgeParam0, com.google.protobuf.ExtensionRegistryLite __bridgeParam1) throws java.io.IOException { return ((com.moon.am)(this.mergeFrom__sourceBridge_811039b404(((com.google.protobuf.CodedInputStream)(__bridgeParam0)), ((com.google.protobuf.ExtensionRegistryLite)(__bridgeParam1))))); }
}
