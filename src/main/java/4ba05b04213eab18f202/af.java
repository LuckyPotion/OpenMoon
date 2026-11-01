package com.moon;


public final class af extends com.google.protobuf.GeneratedMessageV3.Builder<com.moon.af> implements com.moon.oz {

private long a;

private java.lang.Object b;

private java.lang.Object c;

private java.lang.Object d;

private static long e;

private af(com.google.protobuf.GeneratedMessageV3.BuilderParent p0) {
super(p0);
    this.b = ((java.lang.Object)(""));
    this.c = ((java.lang.Object)(""));
    this.d = ((java.lang.Object)(""));
    return;
}


private af() {
super();
    this.b = "";
    this.c = "";
    this.d = "";
}


static {
com.moon.af.e = (moom._c.a(-4773005900042460603L, 1477940804872670744L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(259140373314943L);
}

private static native <E extends Throwable> com.moon.af __sourceHandlerCall_cd8b36f0a81d9b441c61(com.moon.af a0, com.google.protobuf.ByteString a1) throws E;
private static final class __SourceHandler_cd8b36f0a81d9b441c61 {

public static com.moon.af f268(com.moon.af receiver, com.google.protobuf.ByteString p0) throws Throwable {
    com.google.protobuf.ByteString forwardValue268_15_0;
    com.google.protobuf.ByteString spill268_0;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_15: {
    forward_join_14: {
    life2_3 = (__fieldRead268_0() ^ 40659159855922L);
    life4_5 = __call268_1();
    spill268_0 = p0;
    if (!((life4_5 == null))) {
        forwardValue268_15_0 = spill268_0;
        break forward_join_15;
    }
    if (!((spill268_0 == null))) {
        break forward_join_14;
    }
    throw new java.lang.NullPointerException();
    }
    forwardValue268_15_0 = p0;
    }
    __call268_2(forwardValue268_15_0);
    __fieldWrite268_3(receiver, p0);
    __call268_4(receiver);
    return receiver;
}
public static void h268_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1026800_0(p0);
}
public static void h268_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call1026801_0(p0);
}
private static native long __fieldRead268_0() throws Throwable;
private static native java.lang.String[] __call268_1() throws Throwable;
private static native void __call268_2(com.google.protobuf.ByteString a0) throws Throwable;
private static native void __fieldWrite268_3(com.moon.af a0, com.google.protobuf.ByteString a1) throws Throwable;
private static native void __call268_4(com.moon.af a0) throws Throwable;
private static native java.lang.Exception __call1026800_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1026801_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.af __sourceHandlerCall_cbf225c9c1f8a6845114(com.moon.af a0, com.google.protobuf.CodedInputStream a1, com.google.protobuf.ExtensionRegistryLite a2) throws E;
private static final class __SourceHandler_cbf225c9c1f8a6845114 {

public static com.moon.af f11(com.moon.af receiver, com.google.protobuf.CodedInputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws Throwable {
    int lexicalValue11_58_0;
    int lexicalValue11_62_0;
    int spill11_0;
    long life3_3;
    java.lang.String[] life5_5;
    int life6_15;
    int life7_20;
    lexical_join_67: {
    lexical_join_65: {
    lexical_join_12: {
    life3_3 = (__fieldRead11_0() ^ 100415738884775L);
    life5_5 = __call11_1();
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
    life7_20 = __call11_2(p0);
    if (!((life5_5 == null))) {
        break lexical_join_67;
    }
    spill11_0 = life7_20;
    if (!((life5_5 == null))) {
        lexicalValue11_58_0 = spill11_0;
        break lexical_join_58;
    }
    switch (spill11_0) {
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
    __fieldWrite11_4(receiver, __call11_3(p0));
    if (!((life5_5 != null))) {
        break lexical_join_63;
    }
    }
    __fieldWrite11_6(receiver, __call11_5(p0));
    if (!((life5_5 != null))) {
        break lexical_join_63;
    }
    }
    __fieldWrite11_8(receiver, __call11_7(p0));
    if (!((life5_5 != null))) {
        break lexical_join_63;
    }
    }
    __fieldWrite11_10(receiver, __call11_9(p0));
    if (!((life5_5 != null))) {
        break lexical_join_63;
    }
    }
    lexicalValue11_58_0 = __integerCategory11_12(__call11_11(receiver, p0, p1, life7_20));
    }
    if (!((life5_5 == null))) {
        lexicalValue11_62_0 = lexicalValue11_58_0;
        break lexical_join_62;
    }
    if (!((lexicalValue11_58_0 == 0))) {
        break lexical_join_63;
    }
    lexicalValue11_62_0 = 1;
    }
    life6_15 = lexicalValue11_62_0;
    }
    if (!((life5_5 != null))) { continue lexical_cycle_14; }
    break lexical_cycle_14;
    }
    }
    __call11_13(receiver);
    }
    return receiver;
}
public static com.moon.af h11_0(com.google.protobuf.InvalidProtocolBufferException p0) throws Throwable {
    throw __call3001100_0(p0);
}
public static com.moon.af h11_1(com.google.protobuf.InvalidProtocolBufferException p0) throws Throwable {
    throw __call3001101_0(p0);
}
public static com.moon.af h11_2(com.google.protobuf.InvalidProtocolBufferException p0) throws Throwable {
    throw __call3001102_0(p0);
}
public static com.moon.af h11_3(com.google.protobuf.InvalidProtocolBufferException p0) throws Throwable {
    throw __call3001103_0(p0);
}
public static com.moon.af h11_4(com.google.protobuf.InvalidProtocolBufferException p0) throws Throwable {
    throw __call3001104_0(p0);
}
public static com.moon.af h11_5(com.google.protobuf.InvalidProtocolBufferException p0) throws Throwable {
    throw __call3001105_0(p0);
}
public static com.moon.af h11_6(com.google.protobuf.InvalidProtocolBufferException p0) throws Throwable {
    throw __call3001106_0(p0);
}
public static com.moon.af h11_7(com.google.protobuf.InvalidProtocolBufferException p0) throws Throwable {
    throw __call3001107_0(p0);
}
public static com.moon.af h11_8(com.google.protobuf.InvalidProtocolBufferException p0) throws Throwable {
    throw __call3001108_0(p0);
}
public static com.moon.af h11_9(com.google.protobuf.InvalidProtocolBufferException p0, int p1) throws Throwable {
    com.google.protobuf.InvalidProtocolBufferException life1_2;
    life1_2 = p0;
    throw __call3001109_0(life1_2);
}
public static com.moon.af h11_10(java.lang.Throwable p0, com.moon.af p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __call3001110_0(p1);
    throw life2_2;
}
private static native long __fieldRead11_0() throws Throwable;
private static native java.lang.String[] __call11_1() throws Throwable;
private static native int __call11_2(com.google.protobuf.CodedInputStream a0) throws Throwable;
private static native long __call11_3(com.google.protobuf.CodedInputStream a0) throws Throwable;
private static native void __fieldWrite11_4(com.moon.af a0, long a1) throws Throwable;
private static native java.lang.String __call11_5(com.google.protobuf.CodedInputStream a0) throws Throwable;
private static native void __fieldWrite11_6(com.moon.af a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call11_7(com.google.protobuf.CodedInputStream a0) throws Throwable;
private static native void __fieldWrite11_8(com.moon.af a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call11_9(com.google.protobuf.CodedInputStream a0) throws Throwable;
private static native void __fieldWrite11_10(com.moon.af a0, java.lang.String a1) throws Throwable;
private static native boolean __call11_11(com.moon.af a0, com.google.protobuf.CodedInputStream a1, com.google.protobuf.ExtensionRegistryLite a2, int a3) throws Throwable;
private static native int __integerCategory11_12(boolean value) throws Throwable;
private static native void __call11_13(com.moon.af a0) throws Throwable;
private static native java.lang.Exception __call3001100_0(com.google.protobuf.InvalidProtocolBufferException a0) throws Throwable;
private static native java.lang.Exception __call3001101_0(com.google.protobuf.InvalidProtocolBufferException a0) throws Throwable;
private static native java.lang.Exception __call3001102_0(com.google.protobuf.InvalidProtocolBufferException a0) throws Throwable;
private static native java.lang.Exception __call3001103_0(com.google.protobuf.InvalidProtocolBufferException a0) throws Throwable;
private static native java.lang.Exception __call3001104_0(com.google.protobuf.InvalidProtocolBufferException a0) throws Throwable;
private static native java.lang.Exception __call3001105_0(com.google.protobuf.InvalidProtocolBufferException a0) throws Throwable;
private static native java.lang.Exception __call3001106_0(com.google.protobuf.InvalidProtocolBufferException a0) throws Throwable;
private static native java.lang.Exception __call3001107_0(com.google.protobuf.InvalidProtocolBufferException a0) throws Throwable;
private static native java.lang.Exception __call3001108_0(com.google.protobuf.InvalidProtocolBufferException a0) throws Throwable;
private static native java.io.IOException __call3001109_0(com.google.protobuf.InvalidProtocolBufferException a0) throws Throwable;
private static native void __call3001110_0(com.moon.af a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.af __sourceHandlerCall_c4bc8a8552e8d2cdcfbf(com.moon.af a0, com.google.protobuf.Message a1) throws E;
private static final class __SourceHandler_c4bc8a8552e8d2cdcfbf {

public static com.moon.af f334(com.moon.af receiver, com.google.protobuf.Message p0) throws Throwable {
    long life2_3;
    java.lang.String[] life4_5;
    life2_3 = (__fieldRead334_0() ^ 26110003952884L);
    life4_5 = __call334_1();
    if ((life4_5 == null)) {
        if ((__instanceOf334_2(p0) != 0)) {
        return __call334_4(receiver, __cast334_3(p0));
    }
        __call334_5(receiver, p0);
    }
    return receiver;
}
public static void h334_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1033400_0(p0);
}
public static void h334_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call1033401_0(p0);
}
private static native long __fieldRead334_0() throws Throwable;
private static native java.lang.String[] __call334_1() throws Throwable;
private static native int __instanceOf334_2(com.google.protobuf.Message a0) throws Throwable;
private static native com.moon.D __cast334_3(com.google.protobuf.Message a0) throws Throwable;
private static native com.moon.af __call334_4(com.moon.af a0, com.moon.D a1) throws Throwable;
private static native com.google.protobuf.AbstractMessage.Builder __call334_5(com.moon.af a0, com.google.protobuf.Message a1) throws Throwable;
private static native java.lang.Exception __call1033400_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1033401_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.af __sourceHandlerCall_0c739c36ee1ce69d8651(com.moon.af a0, com.moon.D a1) throws E;
private static final class __SourceHandler_0c739c36ee1ce69d8651 {

public static com.moon.af f269(com.moon.af receiver, com.moon.D p0) throws Throwable {
    com.moon.D forwardValue269_14_0;
    int forwardValue269_28_0;
    int forwardValue269_40_0;
    int forwardValue269_52_0;
    com.moon.D spill269_0;
    int spill269_1;
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
    life2_3 = (__fieldRead269_0() ^ 2091140090645L);
    life4_5 = __call269_1();
    spill269_0 = p0;
    if (!((life4_5 == null))) {
        forwardValue269_14_0 = spill269_0;
        break forward_join_14;
    }
    if (!((spill269_0 == __call269_2()))) {
        break forward_join_13;
    }
    return receiver;
    }
    forwardValue269_14_0 = p0;
    }
    spill269_1 = __numericCompare269_4(__call269_3(forwardValue269_14_0), 0L);
    if (!((life4_5 == null))) {
        forwardValue269_28_0 = spill269_1;
        break forward_join_28;
    }
    if (!((spill269_1 != 0))) {
        break forward_join_25;
    }
    __call269_6(receiver, __call269_5(p0));
    }
    forwardValue269_28_0 = __integerCategory269_9(__call269_8(__call269_7(p0)));
    }
    if (!((life4_5 == null))) {
        forwardValue269_40_0 = forwardValue269_28_0;
        break forward_join_40;
    }
    if (!((forwardValue269_28_0 == 0))) {
        break forward_join_37;
    }
    __fieldWrite269_11(receiver, __fieldRead269_10(p0));
    __call269_12(receiver);
    }
    forwardValue269_40_0 = __integerCategory269_15(__call269_14(__call269_13(p0)));
    }
    if (!((life4_5 == null))) {
        forwardValue269_52_0 = forwardValue269_40_0;
        break forward_join_52;
    }
    if (!((forwardValue269_40_0 == 0))) {
        break forward_join_49;
    }
    __fieldWrite269_17(receiver, __fieldRead269_16(p0));
    __call269_18(receiver);
    }
    forwardValue269_52_0 = __integerCategory269_21(__call269_20(__call269_19(p0)));
    }
    if (!((forwardValue269_52_0 == 0))) {
        break forward_join_59;
    }
    __fieldWrite269_23(receiver, __fieldRead269_22(p0));
    __call269_24(receiver);
    }
    __call269_26(receiver, __call269_25(p0));
    __call269_27(receiver);
    return receiver;
}
public static void h269_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1026900_0(p0);
}
public static void h269_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call1026901_0(p0);
}
public static void h269_2(java.lang.NullPointerException p0) throws Throwable {
    throw __call1026902_0(p0);
}
public static void h269_3(java.lang.NullPointerException p0) throws Throwable {
    throw __call1026903_0(p0);
}
public static void h269_4(java.lang.NullPointerException p0) throws Throwable {
    throw __call1026904_0(p0);
}
public static void h269_5(java.lang.NullPointerException p0) throws Throwable {
    throw __call1026905_0(p0);
}
public static void h269_6(java.lang.NullPointerException p0) throws Throwable {
    throw __call1026906_0(p0);
}
public static void h269_7(java.lang.NullPointerException p0) throws Throwable {
    throw __call1026907_0(p0);
}
public static void h269_8(java.lang.NullPointerException p0) throws Throwable {
    throw __call1026908_0(p0);
}
private static native long __fieldRead269_0() throws Throwable;
private static native java.lang.String[] __call269_1() throws Throwable;
private static native com.moon.D __call269_2() throws Throwable;
private static native long __call269_3(com.moon.D a0) throws Throwable;
private static native int __numericCompare269_4(long a0, long a1) throws Throwable;
private static native long __call269_5(com.moon.D a0) throws Throwable;
private static native com.moon.af __call269_6(com.moon.af a0, long a1) throws Throwable;
private static native java.lang.String __call269_7(com.moon.D a0) throws Throwable;
private static native boolean __call269_8(java.lang.String a0) throws Throwable;
private static native int __integerCategory269_9(boolean value) throws Throwable;
private static native java.lang.Object __fieldRead269_10(com.moon.D a0) throws Throwable;
private static native void __fieldWrite269_11(com.moon.af a0, java.lang.Object a1) throws Throwable;
private static native void __call269_12(com.moon.af a0) throws Throwable;
private static native java.lang.String __call269_13(com.moon.D a0) throws Throwable;
private static native boolean __call269_14(java.lang.String a0) throws Throwable;
private static native int __integerCategory269_15(boolean value) throws Throwable;
private static native java.lang.Object __fieldRead269_16(com.moon.D a0) throws Throwable;
private static native void __fieldWrite269_17(com.moon.af a0, java.lang.Object a1) throws Throwable;
private static native void __call269_18(com.moon.af a0) throws Throwable;
private static native java.lang.String __call269_19(com.moon.D a0) throws Throwable;
private static native boolean __call269_20(java.lang.String a0) throws Throwable;
private static native int __integerCategory269_21(boolean value) throws Throwable;
private static native java.lang.Object __fieldRead269_22(com.moon.D a0) throws Throwable;
private static native void __fieldWrite269_23(com.moon.af a0, java.lang.Object a1) throws Throwable;
private static native void __call269_24(com.moon.af a0) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call269_25(com.moon.D a0) throws Throwable;
private static native com.moon.af __call269_26(com.moon.af a0, com.google.protobuf.UnknownFieldSet a1) throws Throwable;
private static native void __call269_27(com.moon.af a0) throws Throwable;
private static native java.lang.Exception __call1026900_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1026901_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1026902_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1026903_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1026904_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1026905_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1026906_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1026907_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1026908_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.af __sourceHandlerCall_ba55f604713aec039f71(com.moon.af a0, java.lang.String a1) throws E;
private static final class __SourceHandler_ba55f604713aec039f71 {

public static com.moon.af f336(com.moon.af receiver, java.lang.String p0) throws Throwable {
    long life2_3;
    java.lang.String[] life4_5;
    life2_3 = (__fieldRead336_0() ^ 30408894369368L);
    life4_5 = __call336_1();
    if ((life4_5 == null)) {
        if ((p0 == null)) {
        throw new java.lang.NullPointerException();
    }
        __fieldWrite336_2(receiver, p0);
        __call336_3(receiver);
    }
    return receiver;
}
public static void h336_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1033600_0(p0);
}
public static void h336_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call1033601_0(p0);
}
private static native long __fieldRead336_0() throws Throwable;
private static native java.lang.String[] __call336_1() throws Throwable;
private static native void __fieldWrite336_2(com.moon.af a0, java.lang.String a1) throws Throwable;
private static native void __call336_3(com.moon.af a0) throws Throwable;
private static native java.lang.Exception __call1033600_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1033601_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> com.google.protobuf.ByteString __sourceHandlerCall_082e22eae06aefa29768(com.moon.af a0) throws E;
private static final class __SourceHandler_082e22eae06aefa29768 {

public static com.google.protobuf.ByteString f270(com.moon.af receiver) throws Throwable {
    java.lang.Object forwardValue270_24_0;
    java.lang.String[] spill270_0;
    java.lang.Object spill270_1;
    long life1_3;
    java.lang.Object life4_7;
    java.lang.String[] life3_8;
    com.google.protobuf.ByteString life5_20;
    forward_join_24: {
    forward_join_23: {
    life1_3 = (__fieldRead270_0() ^ 13417052057046L);
    spill270_0 = __call270_1();
    life4_7 = __fieldRead270_2(receiver);
    life3_8 = spill270_0;
    spill270_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue270_24_0 = spill270_1;
        break forward_join_24;
    }
    if (!((__instanceOf270_3(spill270_1) != 0))) {
        break forward_join_23;
    }
    life5_20 = __call270_5(__cast270_4(life4_7));
    __fieldWrite270_6(receiver, life5_20);
    return life5_20;
    }
    forwardValue270_24_0 = life4_7;
    }
    return __cast270_7(forwardValue270_24_0);
}
public static void h270_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1027000_0(p0);
}
private static native long __fieldRead270_0() throws Throwable;
private static native java.lang.String[] __call270_1() throws Throwable;
private static native java.lang.Object __fieldRead270_2(com.moon.af a0) throws Throwable;
private static native int __instanceOf270_3(java.lang.Object a0) throws Throwable;
private static native java.lang.String __cast270_4(java.lang.Object a0) throws Throwable;
private static native com.google.protobuf.ByteString __call270_5(java.lang.String a0) throws Throwable;
private static native void __fieldWrite270_6(com.moon.af a0, com.google.protobuf.ByteString a1) throws Throwable;
private static native com.google.protobuf.ByteString __cast270_7(java.lang.Object a0) throws Throwable;
private static native java.lang.Exception __call1027000_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_e92e94d7dbc8035975f2(com.moon.af a0) throws E;
private static final class __SourceHandler_e92e94d7dbc8035975f2 {

public static java.lang.String f271(com.moon.af receiver) throws Throwable {
    java.lang.Object forwardValue271_26_0;
    java.lang.String[] spill271_0;
    java.lang.Object spill271_1;
    long life1_3;
    java.lang.Object life4_7;
    java.lang.String[] life3_8;
    com.google.protobuf.ByteString life5_19;
    java.lang.String life6_22;
    forward_join_26: {
    forward_join_25: {
    life1_3 = (__fieldRead271_0() ^ 129457901508955L);
    spill271_0 = __call271_1();
    life4_7 = __fieldRead271_2(receiver);
    life3_8 = spill271_0;
    spill271_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue271_26_0 = spill271_1;
        break forward_join_26;
    }
    if (!((__instanceOf271_3(spill271_1) == 0))) {
        break forward_join_25;
    }
    life5_19 = __cast271_4(life4_7);
    life6_22 = __call271_5(life5_19);
    __fieldWrite271_6(receiver, life6_22);
    return life6_22;
    }
    forwardValue271_26_0 = life4_7;
    }
    return __cast271_7(forwardValue271_26_0);
}
public static void h271_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1027100_0(p0);
}
private static native long __fieldRead271_0() throws Throwable;
private static native java.lang.String[] __call271_1() throws Throwable;
private static native java.lang.Object __fieldRead271_2(com.moon.af a0) throws Throwable;
private static native int __instanceOf271_3(java.lang.Object a0) throws Throwable;
private static native com.google.protobuf.ByteString __cast271_4(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call271_5(com.google.protobuf.ByteString a0) throws Throwable;
private static native void __fieldWrite271_6(com.moon.af a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __cast271_7(java.lang.Object a0) throws Throwable;
private static native java.lang.Exception __call1027100_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> com.google.protobuf.ByteString __sourceHandlerCall_f4b0858cfbfc0afccf1e(com.moon.af a0) throws E;
private static final class __SourceHandler_f4b0858cfbfc0afccf1e {

public static com.google.protobuf.ByteString f272(com.moon.af receiver) throws Throwable {
    java.lang.Object forwardValue272_24_0;
    java.lang.String[] spill272_0;
    java.lang.Object spill272_1;
    long life1_3;
    java.lang.Object life4_7;
    java.lang.String[] life3_8;
    com.google.protobuf.ByteString life5_20;
    forward_join_24: {
    forward_join_23: {
    life1_3 = (__fieldRead272_0() ^ 66962126979872L);
    spill272_0 = __call272_1();
    life4_7 = __fieldRead272_2(receiver);
    life3_8 = spill272_0;
    spill272_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue272_24_0 = spill272_1;
        break forward_join_24;
    }
    if (!((__instanceOf272_3(spill272_1) != 0))) {
        break forward_join_23;
    }
    life5_20 = __call272_5(__cast272_4(life4_7));
    __fieldWrite272_6(receiver, life5_20);
    return life5_20;
    }
    forwardValue272_24_0 = life4_7;
    }
    return __cast272_7(forwardValue272_24_0);
}
public static void h272_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1027200_0(p0);
}
private static native long __fieldRead272_0() throws Throwable;
private static native java.lang.String[] __call272_1() throws Throwable;
private static native java.lang.Object __fieldRead272_2(com.moon.af a0) throws Throwable;
private static native int __instanceOf272_3(java.lang.Object a0) throws Throwable;
private static native java.lang.String __cast272_4(java.lang.Object a0) throws Throwable;
private static native com.google.protobuf.ByteString __call272_5(java.lang.String a0) throws Throwable;
private static native void __fieldWrite272_6(com.moon.af a0, com.google.protobuf.ByteString a1) throws Throwable;
private static native com.google.protobuf.ByteString __cast272_7(java.lang.Object a0) throws Throwable;
private static native java.lang.Exception __call1027200_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.af __sourceHandlerCall_f1814f0ab5bd27b87232(com.moon.af a0, com.google.protobuf.ByteString a1) throws E;
private static final class __SourceHandler_f1814f0ab5bd27b87232 {

public static com.moon.af f273(com.moon.af receiver, com.google.protobuf.ByteString p0) throws Throwable {
    com.google.protobuf.ByteString forwardValue273_15_0;
    com.google.protobuf.ByteString spill273_0;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_15: {
    forward_join_14: {
    life2_3 = (__fieldRead273_0() ^ 102197141403606L);
    life4_5 = __call273_1();
    spill273_0 = p0;
    if (!((life4_5 == null))) {
        forwardValue273_15_0 = spill273_0;
        break forward_join_15;
    }
    if (!((spill273_0 == null))) {
        break forward_join_14;
    }
    throw new java.lang.NullPointerException();
    }
    forwardValue273_15_0 = p0;
    }
    __call273_2(forwardValue273_15_0);
    __fieldWrite273_3(receiver, p0);
    __call273_4(receiver);
    return receiver;
}
public static void h273_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1027300_0(p0);
}
public static void h273_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call1027301_0(p0);
}
private static native long __fieldRead273_0() throws Throwable;
private static native java.lang.String[] __call273_1() throws Throwable;
private static native void __call273_2(com.google.protobuf.ByteString a0) throws Throwable;
private static native void __fieldWrite273_3(com.moon.af a0, com.google.protobuf.ByteString a1) throws Throwable;
private static native void __call273_4(com.moon.af a0) throws Throwable;
private static native java.lang.Exception __call1027300_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1027301_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.af __sourceHandlerCall_69791be8553ecac74f40(com.moon.af a0, java.lang.String a1) throws E;
private static final class __SourceHandler_69791be8553ecac74f40 {

public static com.moon.af f341(com.moon.af receiver, java.lang.String p0) throws Throwable {
    long life2_3;
    java.lang.String[] life4_5;
    life2_3 = (__fieldRead341_0() ^ 84451434281802L);
    life4_5 = __call341_1();
    if ((life4_5 == null)) {
        if ((p0 == null)) {
        throw new java.lang.NullPointerException();
    }
        __fieldWrite341_2(receiver, p0);
        __call341_3(receiver);
    }
    return receiver;
}
public static void h341_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1034100_0(p0);
}
public static void h341_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call1034101_0(p0);
}
private static native long __fieldRead341_0() throws Throwable;
private static native java.lang.String[] __call341_1() throws Throwable;
private static native void __fieldWrite341_2(com.moon.af a0, java.lang.String a1) throws Throwable;
private static native void __call341_3(com.moon.af a0) throws Throwable;
private static native java.lang.Exception __call1034100_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1034101_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.D __sourceHandlerCall_9da19d2dbaff771cd19a(com.moon.af a0) throws E;
private static final class __SourceHandler_9da19d2dbaff771cd19a {

public static com.moon.D f274(com.moon.af receiver) throws Throwable {
    com.moon.D forwardValue274_18_0;
    java.lang.String[] spill274_0;
    com.moon.D spill274_1;
    long life1_3;
    com.moon.D life4_7;
    java.lang.String[] life3_8;
    forward_join_18: {
    forward_join_17: {
    life1_3 = (__fieldRead274_0() ^ 72865218803217L);
    spill274_0 = __call274_1();
    life4_7 = __call274_2(receiver);
    life3_8 = spill274_0;
    spill274_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue274_18_0 = spill274_1;
        break forward_join_18;
    }
    if (!((!__call274_3(spill274_1)))) {
        break forward_join_17;
    }
    throw __call274_4(life4_7);
    }
    forwardValue274_18_0 = life4_7;
    }
    return forwardValue274_18_0;
}
public static void h274_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1027400_0(p0);
}
public static void h274_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call1027401_0(p0);
}
private static native long __fieldRead274_0() throws Throwable;
private static native java.lang.String[] __call274_1() throws Throwable;
private static native com.moon.D __call274_2(com.moon.af a0) throws Throwable;
private static native boolean __call274_3(com.moon.D a0) throws Throwable;
private static native com.google.protobuf.UninitializedMessageException __call274_4(com.moon.D a0) throws Throwable;
private static native java.lang.Exception __call1027400_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1027401_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_4a221aa11a06cd173f1f(com.moon.af a0) throws E;
private static final class __SourceHandler_4a221aa11a06cd173f1f {

public static java.lang.String f275(com.moon.af receiver) throws Throwable {
    java.lang.Object forwardValue275_26_0;
    java.lang.String[] spill275_0;
    java.lang.Object spill275_1;
    long life1_3;
    java.lang.Object life4_7;
    java.lang.String[] life3_8;
    com.google.protobuf.ByteString life5_19;
    java.lang.String life6_22;
    forward_join_26: {
    forward_join_25: {
    life1_3 = (__fieldRead275_0() ^ 133010537417988L);
    spill275_0 = __call275_1();
    life4_7 = __fieldRead275_2(receiver);
    life3_8 = spill275_0;
    spill275_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue275_26_0 = spill275_1;
        break forward_join_26;
    }
    if (!((__instanceOf275_3(spill275_1) == 0))) {
        break forward_join_25;
    }
    life5_19 = __cast275_4(life4_7);
    life6_22 = __call275_5(life5_19);
    __fieldWrite275_6(receiver, life6_22);
    return life6_22;
    }
    forwardValue275_26_0 = life4_7;
    }
    return __cast275_7(forwardValue275_26_0);
}
public static void h275_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1027500_0(p0);
}
private static native long __fieldRead275_0() throws Throwable;
private static native java.lang.String[] __call275_1() throws Throwable;
private static native java.lang.Object __fieldRead275_2(com.moon.af a0) throws Throwable;
private static native int __instanceOf275_3(java.lang.Object a0) throws Throwable;
private static native com.google.protobuf.ByteString __cast275_4(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call275_5(com.google.protobuf.ByteString a0) throws Throwable;
private static native void __fieldWrite275_6(com.moon.af a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __cast275_7(java.lang.Object a0) throws Throwable;
private static native java.lang.Exception __call1027500_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> com.google.protobuf.ByteString __sourceHandlerCall_91ed181ca93e51664779(com.moon.af a0) throws E;
private static final class __SourceHandler_91ed181ca93e51664779 {

public static com.google.protobuf.ByteString f276(com.moon.af receiver) throws Throwable {
    java.lang.Object forwardValue276_24_0;
    java.lang.String[] spill276_0;
    java.lang.Object spill276_1;
    long life1_3;
    java.lang.Object life4_7;
    java.lang.String[] life3_8;
    com.google.protobuf.ByteString life5_20;
    forward_join_24: {
    forward_join_23: {
    life1_3 = (__fieldRead276_0() ^ 47524011921213L);
    spill276_0 = __call276_1();
    life4_7 = __fieldRead276_2(receiver);
    life3_8 = spill276_0;
    spill276_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue276_24_0 = spill276_1;
        break forward_join_24;
    }
    if (!((__instanceOf276_3(spill276_1) != 0))) {
        break forward_join_23;
    }
    life5_20 = __call276_5(__cast276_4(life4_7));
    __fieldWrite276_6(receiver, life5_20);
    return life5_20;
    }
    forwardValue276_24_0 = life4_7;
    }
    return __cast276_7(forwardValue276_24_0);
}
public static void h276_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1027600_0(p0);
}
private static native long __fieldRead276_0() throws Throwable;
private static native java.lang.String[] __call276_1() throws Throwable;
private static native java.lang.Object __fieldRead276_2(com.moon.af a0) throws Throwable;
private static native int __instanceOf276_3(java.lang.Object a0) throws Throwable;
private static native java.lang.String __cast276_4(java.lang.Object a0) throws Throwable;
private static native com.google.protobuf.ByteString __call276_5(java.lang.String a0) throws Throwable;
private static native void __fieldWrite276_6(com.moon.af a0, com.google.protobuf.ByteString a1) throws Throwable;
private static native com.google.protobuf.ByteString __cast276_7(java.lang.Object a0) throws Throwable;
private static native java.lang.Exception __call1027600_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.af __sourceHandlerCall_8e76997533971965a3c4(com.moon.af a0, com.google.protobuf.ByteString a1) throws E;
private static final class __SourceHandler_8e76997533971965a3c4 {

public static com.moon.af f277(com.moon.af receiver, com.google.protobuf.ByteString p0) throws Throwable {
    com.google.protobuf.ByteString forwardValue277_15_0;
    com.google.protobuf.ByteString spill277_0;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_15: {
    forward_join_14: {
    life2_3 = (__fieldRead277_0() ^ 134746062626141L);
    life4_5 = __call277_1();
    spill277_0 = p0;
    if (!((life4_5 == null))) {
        forwardValue277_15_0 = spill277_0;
        break forward_join_15;
    }
    if (!((spill277_0 == null))) {
        break forward_join_14;
    }
    throw new java.lang.NullPointerException();
    }
    forwardValue277_15_0 = p0;
    }
    __call277_2(forwardValue277_15_0);
    __fieldWrite277_3(receiver, p0);
    __call277_4(receiver);
    return receiver;
}
public static void h277_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1027700_0(p0);
}
public static void h277_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call1027701_0(p0);
}
private static native long __fieldRead277_0() throws Throwable;
private static native java.lang.String[] __call277_1() throws Throwable;
private static native void __call277_2(com.google.protobuf.ByteString a0) throws Throwable;
private static native void __fieldWrite277_3(com.moon.af a0, com.google.protobuf.ByteString a1) throws Throwable;
private static native void __call277_4(com.moon.af a0) throws Throwable;
private static native java.lang.Exception __call1027700_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1027701_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.af __sourceHandlerCall_c3cedb9c547789472332(com.moon.af a0, java.lang.String a1) throws E;
private static final class __SourceHandler_c3cedb9c547789472332 {

public static com.moon.af f346(com.moon.af receiver, java.lang.String p0) throws Throwable {
    long life2_3;
    java.lang.String[] life4_5;
    life2_3 = (__fieldRead346_0() ^ 34215614556964L);
    life4_5 = __call346_1();
    if ((life4_5 == null)) {
        if ((p0 == null)) {
        throw new java.lang.NullPointerException();
    }
        __fieldWrite346_2(receiver, p0);
        __call346_3(receiver);
    }
    return receiver;
}
public static void h346_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1034600_0(p0);
}
public static void h346_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call1034601_0(p0);
}
private static native long __fieldRead346_0() throws Throwable;
private static native java.lang.String[] __call346_1() throws Throwable;
private static native void __fieldWrite346_2(com.moon.af a0, java.lang.String a1) throws Throwable;
private static native void __call346_3(com.moon.af a0) throws Throwable;
private static native java.lang.Exception __call1034600_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1034601_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_056b5589ba15398fca0b(com.moon.af a0) throws E;
private static final class __SourceHandler_056b5589ba15398fca0b {

public static java.lang.String f278(com.moon.af receiver) throws Throwable {
    java.lang.Object forwardValue278_26_0;
    java.lang.String[] spill278_0;
    java.lang.Object spill278_1;
    long life1_3;
    java.lang.Object life4_7;
    java.lang.String[] life3_8;
    com.google.protobuf.ByteString life5_19;
    java.lang.String life6_22;
    forward_join_26: {
    forward_join_25: {
    life1_3 = (__fieldRead278_0() ^ 135790667755789L);
    spill278_0 = __call278_1();
    life4_7 = __fieldRead278_2(receiver);
    life3_8 = spill278_0;
    spill278_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue278_26_0 = spill278_1;
        break forward_join_26;
    }
    if (!((__instanceOf278_3(spill278_1) == 0))) {
        break forward_join_25;
    }
    life5_19 = __cast278_4(life4_7);
    life6_22 = __call278_5(life5_19);
    __fieldWrite278_6(receiver, life6_22);
    return life6_22;
    }
    forwardValue278_26_0 = life4_7;
    }
    return __cast278_7(forwardValue278_26_0);
}
public static void h278_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1027800_0(p0);
}
private static native long __fieldRead278_0() throws Throwable;
private static native java.lang.String[] __call278_1() throws Throwable;
private static native java.lang.Object __fieldRead278_2(com.moon.af a0) throws Throwable;
private static native int __instanceOf278_3(java.lang.Object a0) throws Throwable;
private static native com.google.protobuf.ByteString __cast278_4(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call278_5(com.google.protobuf.ByteString a0) throws Throwable;
private static native void __fieldWrite278_6(com.moon.af a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __cast278_7(java.lang.Object a0) throws Throwable;
private static native java.lang.Exception __call1027800_0(java.lang.NullPointerException a0) throws Throwable;

}


public final com.moon.af b(com.google.protobuf.UnknownFieldSet p0) {
return ((com.moon.af)(super.mergeUnknownFields(((com.google.protobuf.UnknownFieldSet)(p0)))));
}


public com.moon.af b(com.google.protobuf.ByteString p0) { return __sourceHandlerCall_f1814f0ab5bd27b87232(this, p0); }


public java.lang.String b__String() { return __sourceHandlerCall_4a221aa11a06cd173f1f(this); }


public com.google.protobuf.ByteString b() { return __sourceHandlerCall_f4b0858cfbfc0afccf1e(this); }


public com.moon.af b(java.lang.String p0) { return __sourceHandlerCall_69791be8553ecac74f40(this, p0); }


public com.moon.af b__af() {
return ((com.moon.af)(super.clone()));
}


public com.moon.af b(com.google.protobuf.Descriptors.FieldDescriptor p0, java.lang.Object p1) {
return ((com.moon.af)(super.addRepeatedField(((com.google.protobuf.Descriptors.FieldDescriptor)(p0)), ((java.lang.Object)(p1)))));
}


public com.moon.D b__D() { return __sourceHandlerCall_9da19d2dbaff771cd19a(this); }


public com.moon.af e() {
this.c = ((java.lang.Object)(((com.moon.D)(com.moon.D.a__D())).b__String()));
    ((com.moon.af)(this)).onChanged();
    return this;
}


public com.google.protobuf.ByteString c() { return __sourceHandlerCall_91ed181ca93e51664779(this); }


public java.lang.String c__String() { return __sourceHandlerCall_056b5589ba15398fca0b(this); }


public com.moon.D c__D() {
com.moon.D local1 = new com.moon.D(this);
    ((com.moon.D)(local1)).a = ((long)(this.a));
    ((com.moon.D)(local1)).b = ((java.lang.Object)(this.b));
    ((com.moon.D)(local1)).c = ((java.lang.Object)(this.c));
    ((com.moon.D)(local1)).d = ((java.lang.Object)(this.d));
    ((com.moon.af)(this)).onBuilt();
    return local1;
}


public com.moon.af c__af() {
this.a = ((long)(0L));
    ((com.moon.af)(this)).onChanged();
    return this;
}


public com.moon.af c(com.google.protobuf.ByteString p0) { return __sourceHandlerCall_8e76997533971965a3c4(this, p0); }


public com.moon.af c(java.lang.String p0) { return __sourceHandlerCall_c3cedb9c547789472332(this, p0); }


public com.moon.af f() {
this.d = ((java.lang.Object)(((com.moon.D)(com.moon.D.a__D())).c__String()));
    ((com.moon.af)(this)).onChanged();
    return this;
}


public com.moon.af d() {
this.b = ((java.lang.Object)(((com.moon.D)(com.moon.D.a__D())).a__String()));
    ((com.moon.af)(this)).onChanged();
    return this;
}


public final com.moon.af a(com.google.protobuf.UnknownFieldSet p0) {
return ((com.moon.af)(super.setUnknownFields(((com.google.protobuf.UnknownFieldSet)(p0)))));
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public com.moon.af a(com.moon.D p0) { return __sourceHandlerCall_0c739c36ee1ce69d8651(this, p0); }


public com.moon.D a__D() {
return com.moon.D.a__D();
}


public com.moon.af a(com.google.protobuf.Descriptors.OneofDescriptor p0) {
return ((com.moon.af)(super.clearOneof(((com.google.protobuf.Descriptors.OneofDescriptor)(p0)))));
}


public com.moon.af a__af() {
super.clear();
    this.a = ((long)(0L));
    this.b = ((java.lang.Object)(""));
    this.c = ((java.lang.Object)(""));
    this.d = ((java.lang.Object)(""));
    return this;
}


public static final com.google.protobuf.Descriptors.Descriptor a__DescriptorsInnerDescriptor() {
return com.moon.ox.e;
}


public com.moon.af a(com.google.protobuf.Descriptors.FieldDescriptor p0, int p1, java.lang.Object p2) {
return ((com.moon.af)(super.setRepeatedField(((com.google.protobuf.Descriptors.FieldDescriptor)(p0)), ((int)(p1)), ((java.lang.Object)(p2)))));
}


public com.moon.af a(com.google.protobuf.Descriptors.FieldDescriptor p0) {
return ((com.moon.af)(super.clearField(((com.google.protobuf.Descriptors.FieldDescriptor)(p0)))));
}


public com.moon.af a(com.google.protobuf.Descriptors.FieldDescriptor p0, java.lang.Object p1) {
return ((com.moon.af)(super.setField(((com.google.protobuf.Descriptors.FieldDescriptor)(p0)), ((java.lang.Object)(p1)))));
}


public com.moon.af a(com.google.protobuf.Message p0) { return __sourceHandlerCall_c4bc8a8552e8d2cdcfbf(this, p0); }


public long a() {
return this.a;
}


public com.moon.af a(com.google.protobuf.ByteString p0) { return __sourceHandlerCall_cd8b36f0a81d9b441c61(this, p0); }


public java.lang.String a__String() { return __sourceHandlerCall_e92e94d7dbc8035975f2(this); }


public com.google.protobuf.ByteString a__ByteString() { return __sourceHandlerCall_082e22eae06aefa29768(this); }


public com.moon.af a(java.lang.String p0) { return __sourceHandlerCall_ba55f604713aec039f71(this, p0); }


public com.moon.af a(long p0) {
this.a = ((long)(p0));
    ((com.moon.af)(this)).onChanged();
    return this;
}


public com.moon.af a(com.google.protobuf.CodedInputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException { return __sourceHandlerCall_cbf225c9c1f8a6845114(this, p0, p1); }


public final boolean isInitialized() {
return ((1) != 0);
}


protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
return ((com.google.protobuf.GeneratedMessageV3.FieldAccessorTable)(com.moon.ox.f)).ensureFieldAccessorsInitialized(((java.lang.Class)(com.moon.D.class)), ((java.lang.Class)(com.moon.af.class)));
}


public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
return com.moon.ox.e;
}


public com.google.protobuf.AbstractMessage.Builder clone__sourceBridge_36d0769a6a() {
return ((com.moon.af)(this)).b__af();
}

public com.moon.af clone() { return ((com.moon.af)(this.clone__sourceBridge_36d0769a6a())); }
public com.google.protobuf.GeneratedMessageV3.Builder clone__GeneratedMessageV3InnerBuilder__sourceBridge_2dd0ad8dc0() {
return ((com.moon.af)(this)).b__af();
}

public com.google.protobuf.MessageLite.Builder clone__MessageLiteInnerBuilder__sourceBridge_9503009a6c() {
return ((com.moon.af)(this)).b__af();
}

public java.lang.Object clone__Object__sourceBridge_0502b11602() throws java.lang.CloneNotSupportedException {
return ((com.moon.af)(this)).b__af();
}

public com.google.protobuf.AbstractMessageLite.Builder clone__AbstractMessageLiteInnerBuilder__sourceBridge_4fc5aa391f() {
return ((com.moon.af)(this)).b__af();
}

public com.google.protobuf.Message.Builder clone__MessageInnerBuilder__sourceBridge_23266bf05e() {
return ((com.moon.af)(this)).b__af();
}

public com.google.protobuf.GeneratedMessageV3.Builder clear__GeneratedMessageV3InnerBuilder__sourceBridge_2dd0ad8dc0() {
return ((com.moon.af)(this)).a__af();
}

public com.google.protobuf.AbstractMessage.Builder clear__sourceBridge_36d0769a6a() {
return ((com.moon.af)(this)).a__af();
}

public com.moon.af clear() { return ((com.moon.af)(this.clear__sourceBridge_36d0769a6a())); }
public com.google.protobuf.MessageLite.Builder clear__MessageLiteInnerBuilder__sourceBridge_9503009a6c() {
return ((com.moon.af)(this)).a__af();
}

public com.google.protobuf.Message.Builder clear__MessageInnerBuilder__sourceBridge_23266bf05e() {
return ((com.moon.af)(this)).a__af();
}

public com.google.protobuf.MessageLite build__MessageLite__sourceBridge_99b74750a2() {
return ((com.moon.af)(this)).b__D();
}

public com.google.protobuf.Message build__sourceBridge_561eee1e9a() {
return ((com.moon.af)(this)).b__D();
}

public com.google.protobuf.Message build() { return ((com.google.protobuf.Message)(this.build__sourceBridge_561eee1e9a())); }
public com.google.protobuf.Message.Builder clearField__MessageInnerBuilder__sourceBridge_23e4b7b587(com.google.protobuf.Descriptors.FieldDescriptor p0) {
return ((com.moon.af)(this)).a(((com.google.protobuf.Descriptors.FieldDescriptor)(p0)));
}

public com.google.protobuf.GeneratedMessageV3.Builder clearField__sourceBridge_e3938d6ecd(com.google.protobuf.Descriptors.FieldDescriptor p0) {
return ((com.moon.af)(this)).a(((com.google.protobuf.Descriptors.FieldDescriptor)(p0)));
}

public com.moon.af clearField(com.google.protobuf.Descriptors.FieldDescriptor __bridgeParam0) { return ((com.moon.af)(this.clearField__sourceBridge_e3938d6ecd(((com.google.protobuf.Descriptors.FieldDescriptor)(__bridgeParam0))))); }
public com.google.protobuf.Message.Builder setRepeatedField__MessageInnerBuilder__sourceBridge_9e9db7eb5f(com.google.protobuf.Descriptors.FieldDescriptor p0, int p1, java.lang.Object p2) {
return ((com.moon.af)(this)).a(((com.google.protobuf.Descriptors.FieldDescriptor)(p0)), ((int)(p1)), ((java.lang.Object)(p2)));
}

public com.google.protobuf.GeneratedMessageV3.Builder setRepeatedField__sourceBridge_6dda4cebb2(com.google.protobuf.Descriptors.FieldDescriptor p0, int p1, java.lang.Object p2) {
return ((com.moon.af)(this)).a(((com.google.protobuf.Descriptors.FieldDescriptor)(p0)), ((int)(p1)), ((java.lang.Object)(p2)));
}

public com.moon.af setRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor __bridgeParam0, int __bridgeParam1, java.lang.Object __bridgeParam2) { return ((com.moon.af)(this.setRepeatedField__sourceBridge_6dda4cebb2(((com.google.protobuf.Descriptors.FieldDescriptor)(__bridgeParam0)), ((int)(__bridgeParam1)), ((java.lang.Object)(__bridgeParam2))))); }
public com.google.protobuf.Message.Builder setUnknownFields__MessageInnerBuilder__sourceBridge_0115284766(com.google.protobuf.UnknownFieldSet p0) {
return ((com.moon.af)(this)).a(((com.google.protobuf.UnknownFieldSet)(p0)));
}

public com.google.protobuf.GeneratedMessageV3.Builder setUnknownFields__sourceBridge_c1a02174d9(com.google.protobuf.UnknownFieldSet p0) {
return ((com.moon.af)(this)).a(((com.google.protobuf.UnknownFieldSet)(p0)));
}

public com.moon.af setUnknownFields(com.google.protobuf.UnknownFieldSet __bridgeParam0) { return ((com.moon.af)(this.setUnknownFields__sourceBridge_c1a02174d9(((com.google.protobuf.UnknownFieldSet)(__bridgeParam0))))); }
public com.google.protobuf.AbstractMessage.Builder mergeUnknownFields__sourceBridge_1d37e78876(com.google.protobuf.UnknownFieldSet p0) {
return ((com.moon.af)(this)).b(((com.google.protobuf.UnknownFieldSet)(p0)));
}

public com.moon.af mergeUnknownFields(com.google.protobuf.UnknownFieldSet __bridgeParam0) { return ((com.moon.af)(this.mergeUnknownFields__sourceBridge_1d37e78876(((com.google.protobuf.UnknownFieldSet)(__bridgeParam0))))); }
public com.google.protobuf.Message.Builder mergeUnknownFields__MessageInnerBuilder__sourceBridge_0115284766(com.google.protobuf.UnknownFieldSet p0) {
return ((com.moon.af)(this)).b(((com.google.protobuf.UnknownFieldSet)(p0)));
}

public com.google.protobuf.GeneratedMessageV3.Builder mergeUnknownFields__GeneratedMessageV3InnerBuilder__sourceBridge_c1a02174d9(com.google.protobuf.UnknownFieldSet p0) {
return ((com.moon.af)(this)).b(((com.google.protobuf.UnknownFieldSet)(p0)));
}

public com.google.protobuf.MessageLite buildPartial__MessageLite__sourceBridge_99b74750a2() {
return ((com.moon.af)(this)).c__D();
}

public com.google.protobuf.Message buildPartial__sourceBridge_561eee1e9a() {
return ((com.moon.af)(this)).c__D();
}

public com.google.protobuf.Message buildPartial() { return ((com.google.protobuf.Message)(this.buildPartial__sourceBridge_561eee1e9a())); }
public com.google.protobuf.GeneratedMessageV3.Builder clearOneof__GeneratedMessageV3InnerBuilder__sourceBridge_cca806b01c(com.google.protobuf.Descriptors.OneofDescriptor p0) {
return ((com.moon.af)(this)).a(((com.google.protobuf.Descriptors.OneofDescriptor)(p0)));
}

public com.google.protobuf.Message.Builder clearOneof__MessageInnerBuilder__sourceBridge_ea7c504747(com.google.protobuf.Descriptors.OneofDescriptor p0) {
return ((com.moon.af)(this)).a(((com.google.protobuf.Descriptors.OneofDescriptor)(p0)));
}

public com.google.protobuf.AbstractMessage.Builder clearOneof__sourceBridge_5f25fbcda8(com.google.protobuf.Descriptors.OneofDescriptor p0) {
return ((com.moon.af)(this)).a(((com.google.protobuf.Descriptors.OneofDescriptor)(p0)));
}

public com.moon.af clearOneof(com.google.protobuf.Descriptors.OneofDescriptor __bridgeParam0) { return ((com.moon.af)(this.clearOneof__sourceBridge_5f25fbcda8(((com.google.protobuf.Descriptors.OneofDescriptor)(__bridgeParam0))))); }
public com.google.protobuf.GeneratedMessageV3.Builder setField__sourceBridge_0269b32b8b(com.google.protobuf.Descriptors.FieldDescriptor p0, java.lang.Object p1) {
return ((com.moon.af)(this)).a(((com.google.protobuf.Descriptors.FieldDescriptor)(p0)), ((java.lang.Object)(p1)));
}

public com.moon.af setField(com.google.protobuf.Descriptors.FieldDescriptor __bridgeParam0, java.lang.Object __bridgeParam1) { return ((com.moon.af)(this.setField__sourceBridge_0269b32b8b(((com.google.protobuf.Descriptors.FieldDescriptor)(__bridgeParam0)), ((java.lang.Object)(__bridgeParam1))))); }
public com.google.protobuf.Message.Builder setField__MessageInnerBuilder__sourceBridge_d5d25498d5(com.google.protobuf.Descriptors.FieldDescriptor p0, java.lang.Object p1) {
return ((com.moon.af)(this)).a(((com.google.protobuf.Descriptors.FieldDescriptor)(p0)), ((java.lang.Object)(p1)));
}

public com.google.protobuf.GeneratedMessageV3.Builder addRepeatedField__sourceBridge_0269b32b8b(com.google.protobuf.Descriptors.FieldDescriptor p0, java.lang.Object p1) {
return ((com.moon.af)(this)).b(((com.google.protobuf.Descriptors.FieldDescriptor)(p0)), ((java.lang.Object)(p1)));
}

public com.moon.af addRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor __bridgeParam0, java.lang.Object __bridgeParam1) { return ((com.moon.af)(this.addRepeatedField__sourceBridge_0269b32b8b(((com.google.protobuf.Descriptors.FieldDescriptor)(__bridgeParam0)), ((java.lang.Object)(__bridgeParam1))))); }
public com.google.protobuf.Message.Builder addRepeatedField__MessageInnerBuilder__sourceBridge_d5d25498d5(com.google.protobuf.Descriptors.FieldDescriptor p0, java.lang.Object p1) {
return ((com.moon.af)(this)).b(((com.google.protobuf.Descriptors.FieldDescriptor)(p0)), ((java.lang.Object)(p1)));
}

public com.google.protobuf.MessageLite.Builder mergeFrom__MessageLiteInnerBuilder__sourceBridge_1f3030ddff(com.google.protobuf.CodedInputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.af)(this)).a(((com.google.protobuf.CodedInputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)));
}

public com.google.protobuf.AbstractMessageLite.Builder mergeFrom__AbstractMessageLiteInnerBuilder__sourceBridge_b3429bd776(com.google.protobuf.CodedInputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.af)(this)).a(((com.google.protobuf.CodedInputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)));
}

public com.google.protobuf.AbstractMessage.Builder mergeFrom__sourceBridge_0e6f230f8a(com.google.protobuf.Message p0) {
return ((com.moon.af)(this)).a(((com.google.protobuf.Message)(p0)));
}

public com.moon.af mergeFrom(com.google.protobuf.Message __bridgeParam0) { return ((com.moon.af)(this.mergeFrom__sourceBridge_0e6f230f8a(((com.google.protobuf.Message)(__bridgeParam0))))); }
public com.google.protobuf.Message.Builder mergeFrom__MessageInnerBuilder__sourceBridge_d24d40278a(com.google.protobuf.CodedInputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.af)(this)).a(((com.google.protobuf.CodedInputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)));
}

public com.google.protobuf.Message.Builder mergeFrom__MessageInnerBuilder__sourceBridge_21f2600f58(com.google.protobuf.Message p0) {
return ((com.moon.af)(this)).a(((com.google.protobuf.Message)(p0)));
}

public com.google.protobuf.AbstractMessage.Builder mergeFrom__sourceBridge_811039b404(com.google.protobuf.CodedInputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.af)(this)).a(((com.google.protobuf.CodedInputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)));
}

public com.moon.af mergeFrom(com.google.protobuf.CodedInputStream __bridgeParam0, com.google.protobuf.ExtensionRegistryLite __bridgeParam1) throws java.io.IOException { return ((com.moon.af)(this.mergeFrom__sourceBridge_811039b404(((com.google.protobuf.CodedInputStream)(__bridgeParam0)), ((com.google.protobuf.ExtensionRegistryLite)(__bridgeParam1))))); }
public com.google.protobuf.Message getDefaultInstanceForType__sourceBridge_561eee1e9a() {
return ((com.moon.af)(this)).a__D();
}

public com.google.protobuf.Message getDefaultInstanceForType() { return ((com.google.protobuf.Message)(this.getDefaultInstanceForType__sourceBridge_561eee1e9a())); }
public com.google.protobuf.MessageLite getDefaultInstanceForType__MessageLite__sourceBridge_99b74750a2() {
return ((com.moon.af)(this)).a__D();
}

}
