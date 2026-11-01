package com.moon;


public final class aw extends com.google.protobuf.GeneratedMessageV3.Builder<com.moon.aw> implements com.moon.oS {

private int a;

private java.lang.Object b;

private java.lang.Object c;

private static long d;

private aw(com.google.protobuf.GeneratedMessageV3.BuilderParent p0) {
super(p0);
    this.a = ((int)(0));
    this.b = ((java.lang.Object)(""));
    this.c = ((java.lang.Object)(""));
    return;
}


private aw() {
super();
    this.a = 0;
    this.b = "";
    this.c = "";
}


static {
com.moon.aw.d = (moom._c.a(-1683646692027482496L, -3021324020747332384L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(30988536705034L);
}

private static native <E extends Throwable> com.moon.aw __sourceHandlerCall_9afdabb6df9a8a65ed03(com.moon.aw a0, com.google.protobuf.ByteString a1) throws E;
private static final class __SourceHandler_9afdabb6df9a8a65ed03 {

public static com.moon.aw f420(com.moon.aw receiver, com.google.protobuf.ByteString p0) throws Throwable {
    com.google.protobuf.ByteString forwardValue420_15_0;
    com.google.protobuf.ByteString spill420_0;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_15: {
    forward_join_14: {
    life2_3 = (__fieldRead420_0() ^ 130276331150302L);
    life4_5 = __call420_1();
    spill420_0 = p0;
    if (!((life4_5 == null))) {
        forwardValue420_15_0 = spill420_0;
        break forward_join_15;
    }
    if (!((spill420_0 == null))) {
        break forward_join_14;
    }
    throw new java.lang.NullPointerException();
    }
    forwardValue420_15_0 = p0;
    }
    __call420_2(forwardValue420_15_0);
    __fieldWrite420_3(receiver, p0);
    __call420_4(receiver);
    return receiver;
}
public static void h420_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1042000_0(p0);
}
public static void h420_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call1042001_0(p0);
}
private static native long __fieldRead420_0() throws Throwable;
private static native java.lang.String[] __call420_1() throws Throwable;
private static native void __call420_2(com.google.protobuf.ByteString a0) throws Throwable;
private static native void __fieldWrite420_3(com.moon.aw a0, com.google.protobuf.ByteString a1) throws Throwable;
private static native void __call420_4(com.moon.aw a0) throws Throwable;
private static native java.lang.Exception __call1042000_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1042001_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.aw __sourceHandlerCall_384211b1a2a5bd9e16d1(com.moon.aw a0, com.google.protobuf.CodedInputStream a1, com.google.protobuf.ExtensionRegistryLite a2) throws E;
private static final class __SourceHandler_384211b1a2a5bd9e16d1 {

public static com.moon.aw f30(com.moon.aw receiver, com.google.protobuf.CodedInputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws Throwable {
    int lexicalValue30_52_0;
    int lexicalValue30_56_0;
    int spill30_0;
    long life3_3;
    java.lang.String[] life5_5;
    int life6_15;
    int life7_20;
    lexical_join_61: {
    lexical_join_59: {
    lexical_join_12: {
    life3_3 = (__fieldRead30_0() ^ 83922655548199L);
    life5_5 = __call30_1();
    if (!((p1 == null))) {
        break lexical_join_12;
    }
    throw new java.lang.NullPointerException();
    }
    life6_15 = 0;
    lexical_cycle_14: while (true) {
    lexical_join_57: {
    lexical_join_56: {
    lexical_join_52: {
    lexical_join_47: {
    lexical_join_41: {
    lexical_join_35: {
    lexical_join_29: {
    lexical_join_25: {
    if (!((life6_15 == 0))) {
        break lexical_join_59;
    }
    life7_20 = __call30_2(p0);
    if (!((life5_5 == null))) {
        break lexical_join_61;
    }
    spill30_0 = life7_20;
    if (!((life5_5 == null))) {
        lexicalValue30_52_0 = spill30_0;
        break lexical_join_52;
    }
    switch (spill30_0) {
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
default:
{
        break lexical_join_47;
    }
}
    }
    life6_15 = 1;
    if (!((life5_5 != null))) {
        break lexical_join_57;
    }
    }
    __fieldWrite30_4(receiver, __call30_3(p0));
    if (!((life5_5 != null))) {
        break lexical_join_57;
    }
    }
    __fieldWrite30_6(receiver, __call30_5(p0));
    if (!((life5_5 != null))) {
        break lexical_join_57;
    }
    }
    __fieldWrite30_8(receiver, __call30_7(p0));
    if (!((life5_5 != null))) {
        break lexical_join_57;
    }
    }
    lexicalValue30_52_0 = __integerCategory30_10(__call30_9(receiver, p0, p1, life7_20));
    }
    if (!((life5_5 == null))) {
        lexicalValue30_56_0 = lexicalValue30_52_0;
        break lexical_join_56;
    }
    if (!((lexicalValue30_52_0 == 0))) {
        break lexical_join_57;
    }
    lexicalValue30_56_0 = 1;
    }
    life6_15 = lexicalValue30_56_0;
    }
    if (!((life5_5 != null))) { continue lexical_cycle_14; }
    break lexical_cycle_14;
    }
    }
    __call30_11(receiver);
    }
    return receiver;
}
public static com.moon.aw h30_0(com.google.protobuf.InvalidProtocolBufferException p0) throws Throwable {
    throw __call3003000_0(p0);
}
public static com.moon.aw h30_1(com.google.protobuf.InvalidProtocolBufferException p0) throws Throwable {
    throw __call3003001_0(p0);
}
public static com.moon.aw h30_2(com.google.protobuf.InvalidProtocolBufferException p0) throws Throwable {
    throw __call3003002_0(p0);
}
public static com.moon.aw h30_3(com.google.protobuf.InvalidProtocolBufferException p0) throws Throwable {
    throw __call3003003_0(p0);
}
public static com.moon.aw h30_4(com.google.protobuf.InvalidProtocolBufferException p0) throws Throwable {
    throw __call3003004_0(p0);
}
public static com.moon.aw h30_5(com.google.protobuf.InvalidProtocolBufferException p0) throws Throwable {
    throw __call3003005_0(p0);
}
public static com.moon.aw h30_6(com.google.protobuf.InvalidProtocolBufferException p0) throws Throwable {
    throw __call3003006_0(p0);
}
public static com.moon.aw h30_7(com.google.protobuf.InvalidProtocolBufferException p0) throws Throwable {
    throw __call3003007_0(p0);
}
public static com.moon.aw h30_8(com.google.protobuf.InvalidProtocolBufferException p0, int p1) throws Throwable {
    com.google.protobuf.InvalidProtocolBufferException life1_2;
    life1_2 = p0;
    throw __call3003008_0(life1_2);
}
public static com.moon.aw h30_9(java.lang.Throwable p0, com.moon.aw p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __call3003009_0(p1);
    throw life2_2;
}
private static native long __fieldRead30_0() throws Throwable;
private static native java.lang.String[] __call30_1() throws Throwable;
private static native int __call30_2(com.google.protobuf.CodedInputStream a0) throws Throwable;
private static native int __call30_3(com.google.protobuf.CodedInputStream a0) throws Throwable;
private static native void __fieldWrite30_4(com.moon.aw a0, int a1) throws Throwable;
private static native java.lang.String __call30_5(com.google.protobuf.CodedInputStream a0) throws Throwable;
private static native void __fieldWrite30_6(com.moon.aw a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call30_7(com.google.protobuf.CodedInputStream a0) throws Throwable;
private static native void __fieldWrite30_8(com.moon.aw a0, java.lang.String a1) throws Throwable;
private static native boolean __call30_9(com.moon.aw a0, com.google.protobuf.CodedInputStream a1, com.google.protobuf.ExtensionRegistryLite a2, int a3) throws Throwable;
private static native int __integerCategory30_10(boolean value) throws Throwable;
private static native void __call30_11(com.moon.aw a0) throws Throwable;
private static native java.lang.Exception __call3003000_0(com.google.protobuf.InvalidProtocolBufferException a0) throws Throwable;
private static native java.lang.Exception __call3003001_0(com.google.protobuf.InvalidProtocolBufferException a0) throws Throwable;
private static native java.lang.Exception __call3003002_0(com.google.protobuf.InvalidProtocolBufferException a0) throws Throwable;
private static native java.lang.Exception __call3003003_0(com.google.protobuf.InvalidProtocolBufferException a0) throws Throwable;
private static native java.lang.Exception __call3003004_0(com.google.protobuf.InvalidProtocolBufferException a0) throws Throwable;
private static native java.lang.Exception __call3003005_0(com.google.protobuf.InvalidProtocolBufferException a0) throws Throwable;
private static native java.lang.Exception __call3003006_0(com.google.protobuf.InvalidProtocolBufferException a0) throws Throwable;
private static native java.lang.Exception __call3003007_0(com.google.protobuf.InvalidProtocolBufferException a0) throws Throwable;
private static native java.io.IOException __call3003008_0(com.google.protobuf.InvalidProtocolBufferException a0) throws Throwable;
private static native void __call3003009_0(com.moon.aw a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.aw __sourceHandlerCall_7bd19c121c072901bc59(com.moon.aw a0, com.google.protobuf.Message a1) throws E;
private static final class __SourceHandler_7bd19c121c072901bc59 {

public static com.moon.aw f548(com.moon.aw receiver, com.google.protobuf.Message p0) throws Throwable {
    long life2_3;
    java.lang.String[] life4_5;
    life2_3 = (__fieldRead548_0() ^ 52904188502944L);
    life4_5 = __call548_1();
    if ((life4_5 == null)) {
        if ((__instanceOf548_2(p0) != 0)) {
        return __call548_4(receiver, __cast548_3(p0));
    }
        __call548_5(receiver, p0);
    }
    return receiver;
}
public static void h548_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1054800_0(p0);
}
public static void h548_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call1054801_0(p0);
}
private static native long __fieldRead548_0() throws Throwable;
private static native java.lang.String[] __call548_1() throws Throwable;
private static native int __instanceOf548_2(com.google.protobuf.Message a0) throws Throwable;
private static native com.moon.U __cast548_3(com.google.protobuf.Message a0) throws Throwable;
private static native com.moon.aw __call548_4(com.moon.aw a0, com.moon.U a1) throws Throwable;
private static native com.google.protobuf.AbstractMessage.Builder __call548_5(com.moon.aw a0, com.google.protobuf.Message a1) throws Throwable;
private static native java.lang.Exception __call1054800_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1054801_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.aw __sourceHandlerCall_d17c2cbb54829f1da242(com.moon.aw a0, com.moon.U a1) throws E;
private static final class __SourceHandler_d17c2cbb54829f1da242 {

public static com.moon.aw f421(com.moon.aw receiver, com.moon.U p0) throws Throwable {
    com.moon.U forwardValue421_14_0;
    int forwardValue421_26_0;
    int forwardValue421_38_0;
    com.moon.U spill421_0;
    int spill421_1;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_45: {
    forward_join_38: {
    forward_join_35: {
    forward_join_26: {
    forward_join_23: {
    forward_join_14: {
    forward_join_13: {
    life2_3 = (__fieldRead421_0() ^ 140020070907695L);
    life4_5 = __call421_1();
    spill421_0 = p0;
    if (!((life4_5 == null))) {
        forwardValue421_14_0 = spill421_0;
        break forward_join_14;
    }
    if (!((spill421_0 == __call421_2()))) {
        break forward_join_13;
    }
    return receiver;
    }
    forwardValue421_14_0 = p0;
    }
    spill421_1 = __fieldRead421_3(forwardValue421_14_0);
    if (!((life4_5 == null))) {
        forwardValue421_26_0 = spill421_1;
        break forward_join_26;
    }
    if (!((spill421_1 != 0))) {
        break forward_join_23;
    }
    __call421_5(receiver, __call421_4(p0));
    }
    forwardValue421_26_0 = __integerCategory421_8(__call421_7(__call421_6(p0)));
    }
    if (!((life4_5 == null))) {
        forwardValue421_38_0 = forwardValue421_26_0;
        break forward_join_38;
    }
    if (!((forwardValue421_26_0 == 0))) {
        break forward_join_35;
    }
    __fieldWrite421_10(receiver, __fieldRead421_9(p0));
    __call421_11(receiver);
    }
    forwardValue421_38_0 = __integerCategory421_14(__call421_13(__call421_12(p0)));
    }
    if (!((forwardValue421_38_0 == 0))) {
        break forward_join_45;
    }
    __fieldWrite421_16(receiver, __fieldRead421_15(p0));
    __call421_17(receiver);
    }
    __call421_19(receiver, __call421_18(p0));
    __call421_20(receiver);
    return receiver;
}
public static void h421_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1042100_0(p0);
}
public static void h421_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call1042101_0(p0);
}
public static void h421_2(java.lang.NullPointerException p0) throws Throwable {
    throw __call1042102_0(p0);
}
public static void h421_3(java.lang.NullPointerException p0) throws Throwable {
    throw __call1042103_0(p0);
}
public static void h421_4(java.lang.NullPointerException p0) throws Throwable {
    throw __call1042104_0(p0);
}
public static void h421_5(java.lang.NullPointerException p0) throws Throwable {
    throw __call1042105_0(p0);
}
public static void h421_6(java.lang.NullPointerException p0) throws Throwable {
    throw __call1042106_0(p0);
}
private static native long __fieldRead421_0() throws Throwable;
private static native java.lang.String[] __call421_1() throws Throwable;
private static native com.moon.U __call421_2() throws Throwable;
private static native int __fieldRead421_3(com.moon.U a0) throws Throwable;
private static native int __call421_4(com.moon.U a0) throws Throwable;
private static native com.moon.aw __call421_5(com.moon.aw a0, int a1) throws Throwable;
private static native java.lang.String __call421_6(com.moon.U a0) throws Throwable;
private static native boolean __call421_7(java.lang.String a0) throws Throwable;
private static native int __integerCategory421_8(boolean value) throws Throwable;
private static native java.lang.Object __fieldRead421_9(com.moon.U a0) throws Throwable;
private static native void __fieldWrite421_10(com.moon.aw a0, java.lang.Object a1) throws Throwable;
private static native void __call421_11(com.moon.aw a0) throws Throwable;
private static native java.lang.String __call421_12(com.moon.U a0) throws Throwable;
private static native boolean __call421_13(java.lang.String a0) throws Throwable;
private static native int __integerCategory421_14(boolean value) throws Throwable;
private static native java.lang.Object __fieldRead421_15(com.moon.U a0) throws Throwable;
private static native void __fieldWrite421_16(com.moon.aw a0, java.lang.Object a1) throws Throwable;
private static native void __call421_17(com.moon.aw a0) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call421_18(com.moon.U a0) throws Throwable;
private static native com.moon.aw __call421_19(com.moon.aw a0, com.google.protobuf.UnknownFieldSet a1) throws Throwable;
private static native void __call421_20(com.moon.aw a0) throws Throwable;
private static native java.lang.Exception __call1042100_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1042101_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1042102_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1042103_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1042104_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1042105_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1042106_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.aw __sourceHandlerCall_315d2608570967947f40(com.moon.aw a0, com.moon.ck a1) throws E;
private static final class __SourceHandler_315d2608570967947f40 {

public static com.moon.aw f550(com.moon.aw receiver, com.moon.ck p0) throws Throwable {
    long life2_3;
    java.lang.String[] life4_5;
    life2_3 = (__fieldRead550_0() ^ 115750675156936L);
    life4_5 = __call550_1();
    if ((life4_5 == null)) {
        if ((p0 == null)) {
        throw new java.lang.NullPointerException();
    }
        __fieldWrite550_3(receiver, __call550_2(p0));
        __call550_4(receiver);
    }
    return receiver;
}
public static void h550_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1055000_0(p0);
}
public static void h550_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call1055001_0(p0);
}
private static native long __fieldRead550_0() throws Throwable;
private static native java.lang.String[] __call550_1() throws Throwable;
private static native int __call550_2(com.moon.ck a0) throws Throwable;
private static native void __fieldWrite550_3(com.moon.aw a0, int a1) throws Throwable;
private static native void __call550_4(com.moon.aw a0) throws Throwable;
private static native java.lang.Exception __call1055000_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1055001_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.aw __sourceHandlerCall_50c2e9a5af4342f4103d(com.moon.aw a0, java.lang.String a1) throws E;
private static final class __SourceHandler_50c2e9a5af4342f4103d {

public static com.moon.aw f551(com.moon.aw receiver, java.lang.String p0) throws Throwable {
    long life2_3;
    java.lang.String[] life4_5;
    life2_3 = (__fieldRead551_0() ^ 107159803223401L);
    life4_5 = __call551_1();
    if ((life4_5 == null)) {
        if ((p0 == null)) {
        throw new java.lang.NullPointerException();
    }
        __fieldWrite551_2(receiver, p0);
        __call551_3(receiver);
    }
    return receiver;
}
public static void h551_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1055100_0(p0);
}
public static void h551_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call1055101_0(p0);
}
private static native long __fieldRead551_0() throws Throwable;
private static native java.lang.String[] __call551_1() throws Throwable;
private static native void __fieldWrite551_2(com.moon.aw a0, java.lang.String a1) throws Throwable;
private static native void __call551_3(com.moon.aw a0) throws Throwable;
private static native java.lang.Exception __call1055100_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1055101_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> com.google.protobuf.ByteString __sourceHandlerCall_fb61d6cfd2c11453a810(com.moon.aw a0) throws E;
private static final class __SourceHandler_fb61d6cfd2c11453a810 {

public static com.google.protobuf.ByteString f422(com.moon.aw receiver) throws Throwable {
    java.lang.Object forwardValue422_24_0;
    java.lang.String[] spill422_0;
    java.lang.Object spill422_1;
    long life1_3;
    java.lang.Object life4_7;
    java.lang.String[] life3_8;
    com.google.protobuf.ByteString life5_20;
    forward_join_24: {
    forward_join_23: {
    life1_3 = (__fieldRead422_0() ^ 8974410110595L);
    spill422_0 = __call422_1();
    life4_7 = __fieldRead422_2(receiver);
    life3_8 = spill422_0;
    spill422_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue422_24_0 = spill422_1;
        break forward_join_24;
    }
    if (!((__instanceOf422_3(spill422_1) != 0))) {
        break forward_join_23;
    }
    life5_20 = __call422_5(__cast422_4(life4_7));
    __fieldWrite422_6(receiver, life5_20);
    return life5_20;
    }
    forwardValue422_24_0 = life4_7;
    }
    return __cast422_7(forwardValue422_24_0);
}
public static void h422_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1042200_0(p0);
}
private static native long __fieldRead422_0() throws Throwable;
private static native java.lang.String[] __call422_1() throws Throwable;
private static native java.lang.Object __fieldRead422_2(com.moon.aw a0) throws Throwable;
private static native int __instanceOf422_3(java.lang.Object a0) throws Throwable;
private static native java.lang.String __cast422_4(java.lang.Object a0) throws Throwable;
private static native com.google.protobuf.ByteString __call422_5(java.lang.String a0) throws Throwable;
private static native void __fieldWrite422_6(com.moon.aw a0, com.google.protobuf.ByteString a1) throws Throwable;
private static native com.google.protobuf.ByteString __cast422_7(java.lang.Object a0) throws Throwable;
private static native java.lang.Exception __call1042200_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_b86be03fb0de2adc3b05(com.moon.aw a0) throws E;
private static final class __SourceHandler_b86be03fb0de2adc3b05 {

public static java.lang.String f423(com.moon.aw receiver) throws Throwable {
    java.lang.Object forwardValue423_26_0;
    java.lang.String[] spill423_0;
    java.lang.Object spill423_1;
    long life1_3;
    java.lang.Object life4_7;
    java.lang.String[] life3_8;
    com.google.protobuf.ByteString life5_19;
    java.lang.String life6_22;
    forward_join_26: {
    forward_join_25: {
    life1_3 = (__fieldRead423_0() ^ 81678106886274L);
    spill423_0 = __call423_1();
    life4_7 = __fieldRead423_2(receiver);
    life3_8 = spill423_0;
    spill423_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue423_26_0 = spill423_1;
        break forward_join_26;
    }
    if (!((__instanceOf423_3(spill423_1) == 0))) {
        break forward_join_25;
    }
    life5_19 = __cast423_4(life4_7);
    life6_22 = __call423_5(life5_19);
    __fieldWrite423_6(receiver, life6_22);
    return life6_22;
    }
    forwardValue423_26_0 = life4_7;
    }
    return __cast423_7(forwardValue423_26_0);
}
public static void h423_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1042300_0(p0);
}
private static native long __fieldRead423_0() throws Throwable;
private static native java.lang.String[] __call423_1() throws Throwable;
private static native java.lang.Object __fieldRead423_2(com.moon.aw a0) throws Throwable;
private static native int __instanceOf423_3(java.lang.Object a0) throws Throwable;
private static native com.google.protobuf.ByteString __cast423_4(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call423_5(com.google.protobuf.ByteString a0) throws Throwable;
private static native void __fieldWrite423_6(com.moon.aw a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __cast423_7(java.lang.Object a0) throws Throwable;
private static native java.lang.Exception __call1042300_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.ck __sourceHandlerCall_4dd090ed59ac06fc0d0d(com.moon.aw a0) throws E;
private static final class __SourceHandler_4dd090ed59ac06fc0d0d {

public static com.moon.ck f424(com.moon.aw receiver) throws Throwable {
    com.moon.ck forwardValue424_15_0;
    com.moon.ck forwardValue424_17_0;
    java.lang.String[] spill424_0;
    com.moon.ck spill424_1;
    long life1_3;
    com.moon.ck life4_8;
    java.lang.String[] life3_9;
    forward_join_17: {
    forward_join_16: {
    forward_join_15: {
    life1_3 = (__fieldRead424_0() ^ 15726000072678L);
    spill424_0 = __call424_1();
    life4_8 = __call424_3(__fieldRead424_2(receiver));
    life3_9 = spill424_0;
    spill424_1 = life4_8;
    if (!((life3_9 == null))) {
        forwardValue424_15_0 = spill424_1;
        break forward_join_15;
    }
    if (!((spill424_1 == null))) {
        break forward_join_16;
    }
    forwardValue424_15_0 = __fieldRead424_4();
    }
    forwardValue424_17_0 = forwardValue424_15_0;
    break forward_join_17;
    }
    forwardValue424_17_0 = life4_8;
    }
    return forwardValue424_17_0;
}
public static void h424_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1042400_0(p0);
}
private static native long __fieldRead424_0() throws Throwable;
private static native java.lang.String[] __call424_1() throws Throwable;
private static native int __fieldRead424_2(com.moon.aw a0) throws Throwable;
private static native com.moon.ck __call424_3(int a0) throws Throwable;
private static native com.moon.ck __fieldRead424_4() throws Throwable;
private static native java.lang.Exception __call1042400_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> com.google.protobuf.ByteString __sourceHandlerCall_7cda6ff2e06be85da5d0(com.moon.aw a0) throws E;
private static final class __SourceHandler_7cda6ff2e06be85da5d0 {

public static com.google.protobuf.ByteString f425(com.moon.aw receiver) throws Throwable {
    java.lang.Object forwardValue425_24_0;
    java.lang.String[] spill425_0;
    java.lang.Object spill425_1;
    long life1_3;
    java.lang.Object life4_7;
    java.lang.String[] life3_8;
    com.google.protobuf.ByteString life5_20;
    forward_join_24: {
    forward_join_23: {
    life1_3 = (__fieldRead425_0() ^ 20837613916550L);
    spill425_0 = __call425_1();
    life4_7 = __fieldRead425_2(receiver);
    life3_8 = spill425_0;
    spill425_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue425_24_0 = spill425_1;
        break forward_join_24;
    }
    if (!((__instanceOf425_3(spill425_1) != 0))) {
        break forward_join_23;
    }
    life5_20 = __call425_5(__cast425_4(life4_7));
    __fieldWrite425_6(receiver, life5_20);
    return life5_20;
    }
    forwardValue425_24_0 = life4_7;
    }
    return __cast425_7(forwardValue425_24_0);
}
public static void h425_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1042500_0(p0);
}
private static native long __fieldRead425_0() throws Throwable;
private static native java.lang.String[] __call425_1() throws Throwable;
private static native java.lang.Object __fieldRead425_2(com.moon.aw a0) throws Throwable;
private static native int __instanceOf425_3(java.lang.Object a0) throws Throwable;
private static native java.lang.String __cast425_4(java.lang.Object a0) throws Throwable;
private static native com.google.protobuf.ByteString __call425_5(java.lang.String a0) throws Throwable;
private static native void __fieldWrite425_6(com.moon.aw a0, com.google.protobuf.ByteString a1) throws Throwable;
private static native com.google.protobuf.ByteString __cast425_7(java.lang.Object a0) throws Throwable;
private static native java.lang.Exception __call1042500_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.aw __sourceHandlerCall_4ce42b935f499c9af6d1(com.moon.aw a0, com.google.protobuf.ByteString a1) throws E;
private static final class __SourceHandler_4ce42b935f499c9af6d1 {

public static com.moon.aw f426(com.moon.aw receiver, com.google.protobuf.ByteString p0) throws Throwable {
    com.google.protobuf.ByteString forwardValue426_15_0;
    com.google.protobuf.ByteString spill426_0;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_15: {
    forward_join_14: {
    life2_3 = (__fieldRead426_0() ^ 22235666404596L);
    life4_5 = __call426_1();
    spill426_0 = p0;
    if (!((life4_5 == null))) {
        forwardValue426_15_0 = spill426_0;
        break forward_join_15;
    }
    if (!((spill426_0 == null))) {
        break forward_join_14;
    }
    throw new java.lang.NullPointerException();
    }
    forwardValue426_15_0 = p0;
    }
    __call426_2(forwardValue426_15_0);
    __fieldWrite426_3(receiver, p0);
    __call426_4(receiver);
    return receiver;
}
public static void h426_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1042600_0(p0);
}
public static void h426_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call1042601_0(p0);
}
private static native long __fieldRead426_0() throws Throwable;
private static native java.lang.String[] __call426_1() throws Throwable;
private static native void __call426_2(com.google.protobuf.ByteString a0) throws Throwable;
private static native void __fieldWrite426_3(com.moon.aw a0, com.google.protobuf.ByteString a1) throws Throwable;
private static native void __call426_4(com.moon.aw a0) throws Throwable;
private static native java.lang.Exception __call1042600_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1042601_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.aw __sourceHandlerCall_cd120b8090ceed44c5c7(com.moon.aw a0, java.lang.String a1) throws E;
private static final class __SourceHandler_cd120b8090ceed44c5c7 {

public static com.moon.aw f557(com.moon.aw receiver, java.lang.String p0) throws Throwable {
    long life2_3;
    java.lang.String[] life4_5;
    life2_3 = (__fieldRead557_0() ^ 25246638429683L);
    life4_5 = __call557_1();
    if ((life4_5 == null)) {
        if ((p0 == null)) {
        throw new java.lang.NullPointerException();
    }
        __fieldWrite557_2(receiver, p0);
        __call557_3(receiver);
    }
    return receiver;
}
public static void h557_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1055700_0(p0);
}
public static void h557_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call1055701_0(p0);
}
private static native long __fieldRead557_0() throws Throwable;
private static native java.lang.String[] __call557_1() throws Throwable;
private static native void __fieldWrite557_2(com.moon.aw a0, java.lang.String a1) throws Throwable;
private static native void __call557_3(com.moon.aw a0) throws Throwable;
private static native java.lang.Exception __call1055700_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1055701_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_f3b49cd584f0483d4fee(com.moon.aw a0) throws E;
private static final class __SourceHandler_f3b49cd584f0483d4fee {

public static java.lang.String f427(com.moon.aw receiver) throws Throwable {
    java.lang.Object forwardValue427_26_0;
    java.lang.String[] spill427_0;
    java.lang.Object spill427_1;
    long life1_3;
    java.lang.Object life4_7;
    java.lang.String[] life3_8;
    com.google.protobuf.ByteString life5_19;
    java.lang.String life6_22;
    forward_join_26: {
    forward_join_25: {
    life1_3 = (__fieldRead427_0() ^ 82355259777622L);
    spill427_0 = __call427_1();
    life4_7 = __fieldRead427_2(receiver);
    life3_8 = spill427_0;
    spill427_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue427_26_0 = spill427_1;
        break forward_join_26;
    }
    if (!((__instanceOf427_3(spill427_1) == 0))) {
        break forward_join_25;
    }
    life5_19 = __cast427_4(life4_7);
    life6_22 = __call427_5(life5_19);
    __fieldWrite427_6(receiver, life6_22);
    return life6_22;
    }
    forwardValue427_26_0 = life4_7;
    }
    return __cast427_7(forwardValue427_26_0);
}
public static void h427_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1042700_0(p0);
}
private static native long __fieldRead427_0() throws Throwable;
private static native java.lang.String[] __call427_1() throws Throwable;
private static native java.lang.Object __fieldRead427_2(com.moon.aw a0) throws Throwable;
private static native int __instanceOf427_3(java.lang.Object a0) throws Throwable;
private static native com.google.protobuf.ByteString __cast427_4(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call427_5(com.google.protobuf.ByteString a0) throws Throwable;
private static native void __fieldWrite427_6(com.moon.aw a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __cast427_7(java.lang.Object a0) throws Throwable;
private static native java.lang.Exception __call1042700_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.U __sourceHandlerCall_5da810e96d4b8176f248(com.moon.aw a0) throws E;
private static final class __SourceHandler_5da810e96d4b8176f248 {

public static com.moon.U f428(com.moon.aw receiver) throws Throwable {
    com.moon.U forwardValue428_18_0;
    java.lang.String[] spill428_0;
    com.moon.U spill428_1;
    long life1_3;
    com.moon.U life4_7;
    java.lang.String[] life3_8;
    forward_join_18: {
    forward_join_17: {
    life1_3 = (__fieldRead428_0() ^ 108855392898385L);
    spill428_0 = __call428_1();
    life4_7 = __call428_2(receiver);
    life3_8 = spill428_0;
    spill428_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue428_18_0 = spill428_1;
        break forward_join_18;
    }
    if (!((!__call428_3(spill428_1)))) {
        break forward_join_17;
    }
    throw __call428_4(life4_7);
    }
    forwardValue428_18_0 = life4_7;
    }
    return forwardValue428_18_0;
}
public static void h428_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1042800_0(p0);
}
public static void h428_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call1042801_0(p0);
}
private static native long __fieldRead428_0() throws Throwable;
private static native java.lang.String[] __call428_1() throws Throwable;
private static native com.moon.U __call428_2(com.moon.aw a0) throws Throwable;
private static native boolean __call428_3(com.moon.U a0) throws Throwable;
private static native com.google.protobuf.UninitializedMessageException __call428_4(com.moon.U a0) throws Throwable;
private static native java.lang.Exception __call1042800_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1042801_0(java.lang.NullPointerException a0) throws Throwable;

}


public com.moon.aw b(com.google.protobuf.ByteString p0) { return __sourceHandlerCall_4ce42b935f499c9af6d1(this, p0); }


public final com.moon.aw b(com.google.protobuf.UnknownFieldSet p0) {
return ((com.moon.aw)(super.mergeUnknownFields(((com.google.protobuf.UnknownFieldSet)(p0)))));
}


public com.moon.aw b(java.lang.String p0) { return __sourceHandlerCall_cd120b8090ceed44c5c7(this, p0); }


public com.google.protobuf.ByteString b() { return __sourceHandlerCall_7cda6ff2e06be85da5d0(this); }


public java.lang.String b__String() { return __sourceHandlerCall_f3b49cd584f0483d4fee(this); }


public com.moon.aw b__aw() {
return ((com.moon.aw)(super.clone()));
}


public com.moon.U b__U() { return __sourceHandlerCall_5da810e96d4b8176f248(this); }


public com.moon.aw b(com.google.protobuf.Descriptors.FieldDescriptor p0, java.lang.Object p1) {
return ((com.moon.aw)(super.addRepeatedField(((com.google.protobuf.Descriptors.FieldDescriptor)(p0)), ((java.lang.Object)(p1)))));
}


public com.moon.aw e() {
this.c = ((java.lang.Object)(((com.moon.U)(com.moon.U.a__U())).b__String()));
    ((com.moon.aw)(this)).onChanged();
    return this;
}


public com.moon.U c() {
com.moon.U local1 = new com.moon.U(this);
    ((com.moon.U)(local1)).a = ((int)(this.a));
    ((com.moon.U)(local1)).b = ((java.lang.Object)(this.b));
    ((com.moon.U)(local1)).c = ((java.lang.Object)(this.c));
    ((com.moon.aw)(this)).onBuilt();
    return local1;
}


public com.moon.aw c__aw() {
this.a = ((int)(0));
    ((com.moon.aw)(this)).onChanged();
    return this;
}


public com.moon.aw d() {
this.b = ((java.lang.Object)(((com.moon.U)(com.moon.U.a__U())).a__String()));
    ((com.moon.aw)(this)).onChanged();
    return this;
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public com.moon.aw a(com.google.protobuf.ByteString p0) { return __sourceHandlerCall_9afdabb6df9a8a65ed03(this, p0); }


public final com.moon.aw a(com.google.protobuf.UnknownFieldSet p0) {
return ((com.moon.aw)(super.setUnknownFields(((com.google.protobuf.UnknownFieldSet)(p0)))));
}


public com.moon.aw a(com.google.protobuf.Descriptors.FieldDescriptor p0) {
return ((com.moon.aw)(super.clearField(((com.google.protobuf.Descriptors.FieldDescriptor)(p0)))));
}


public com.moon.aw a(com.google.protobuf.Descriptors.FieldDescriptor p0, int p1, java.lang.Object p2) {
return ((com.moon.aw)(super.setRepeatedField(((com.google.protobuf.Descriptors.FieldDescriptor)(p0)), ((int)(p1)), ((java.lang.Object)(p2)))));
}


public com.moon.aw a(com.google.protobuf.Descriptors.OneofDescriptor p0) {
return ((com.moon.aw)(super.clearOneof(((com.google.protobuf.Descriptors.OneofDescriptor)(p0)))));
}


public com.moon.aw a__aw() {
super.clear();
    this.a = ((int)(0));
    this.b = ((java.lang.Object)(""));
    this.c = ((java.lang.Object)(""));
    return this;
}


public static final com.google.protobuf.Descriptors.Descriptor a__DescriptorsInnerDescriptor() {
return com.moon.oF.e;
}


public com.moon.aw a(com.google.protobuf.Descriptors.FieldDescriptor p0, java.lang.Object p1) {
return ((com.moon.aw)(super.setField(((com.google.protobuf.Descriptors.FieldDescriptor)(p0)), ((java.lang.Object)(p1)))));
}


public com.moon.aw a(com.google.protobuf.Message p0) { return __sourceHandlerCall_7bd19c121c072901bc59(this, p0); }


public com.moon.aw a(com.moon.U p0) { return __sourceHandlerCall_d17c2cbb54829f1da242(this, p0); }


public com.moon.U a__U() {
return com.moon.U.a__U();
}


public com.moon.aw a(java.lang.String p0) { return __sourceHandlerCall_50c2e9a5af4342f4103d(this, p0); }


public com.moon.aw a(com.moon.ck p0) { return __sourceHandlerCall_315d2608570967947f40(this, p0); }


public java.lang.String a__String() { return __sourceHandlerCall_b86be03fb0de2adc3b05(this); }


public com.google.protobuf.ByteString a__ByteString() { return __sourceHandlerCall_fb61d6cfd2c11453a810(this); }


public com.moon.aw a(com.google.protobuf.CodedInputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException { return __sourceHandlerCall_384211b1a2a5bd9e16d1(this, p0, p1); }


public int a() {
return this.a;
}


public com.moon.aw a(int p0) {
this.a = ((int)(p0));
    ((com.moon.aw)(this)).onChanged();
    return this;
}


public com.moon.ck a__ck() { return __sourceHandlerCall_4dd090ed59ac06fc0d0d(this); }


public final boolean isInitialized() {
return ((1) != 0);
}


protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
return ((com.google.protobuf.GeneratedMessageV3.FieldAccessorTable)(com.moon.oF.f)).ensureFieldAccessorsInitialized(((java.lang.Class)(com.moon.U.class)), ((java.lang.Class)(com.moon.aw.class)));
}


public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
return com.moon.oF.e;
}


public com.google.protobuf.GeneratedMessageV3.Builder clone__GeneratedMessageV3InnerBuilder__sourceBridge_2dd0ad8dc0() {
return ((com.moon.aw)(this)).b__aw();
}

public com.google.protobuf.Message.Builder clone__MessageInnerBuilder__sourceBridge_23266bf05e() {
return ((com.moon.aw)(this)).b__aw();
}

public com.google.protobuf.MessageLite.Builder clone__MessageLiteInnerBuilder__sourceBridge_9503009a6c() {
return ((com.moon.aw)(this)).b__aw();
}

public java.lang.Object clone__Object__sourceBridge_0502b11602() throws java.lang.CloneNotSupportedException {
return ((com.moon.aw)(this)).b__aw();
}

public com.google.protobuf.AbstractMessageLite.Builder clone__AbstractMessageLiteInnerBuilder__sourceBridge_4fc5aa391f() {
return ((com.moon.aw)(this)).b__aw();
}

public com.google.protobuf.AbstractMessage.Builder clone__sourceBridge_36d0769a6a() {
return ((com.moon.aw)(this)).b__aw();
}

public com.moon.aw clone() { return ((com.moon.aw)(this.clone__sourceBridge_36d0769a6a())); }
public com.google.protobuf.Message.Builder clear__MessageInnerBuilder__sourceBridge_23266bf05e() {
return ((com.moon.aw)(this)).a__aw();
}

public com.google.protobuf.MessageLite.Builder clear__MessageLiteInnerBuilder__sourceBridge_9503009a6c() {
return ((com.moon.aw)(this)).a__aw();
}

public com.google.protobuf.AbstractMessage.Builder clear__sourceBridge_36d0769a6a() {
return ((com.moon.aw)(this)).a__aw();
}

public com.moon.aw clear() { return ((com.moon.aw)(this.clear__sourceBridge_36d0769a6a())); }
public com.google.protobuf.GeneratedMessageV3.Builder clear__GeneratedMessageV3InnerBuilder__sourceBridge_2dd0ad8dc0() {
return ((com.moon.aw)(this)).a__aw();
}

public com.google.protobuf.Message build__sourceBridge_561eee1e9a() {
return ((com.moon.aw)(this)).b__U();
}

public com.google.protobuf.Message build() { return ((com.google.protobuf.Message)(this.build__sourceBridge_561eee1e9a())); }
public com.google.protobuf.MessageLite build__MessageLite__sourceBridge_99b74750a2() {
return ((com.moon.aw)(this)).b__U();
}

public com.google.protobuf.Message.Builder clearField__MessageInnerBuilder__sourceBridge_23e4b7b587(com.google.protobuf.Descriptors.FieldDescriptor p0) {
return ((com.moon.aw)(this)).a(((com.google.protobuf.Descriptors.FieldDescriptor)(p0)));
}

public com.google.protobuf.GeneratedMessageV3.Builder clearField__sourceBridge_e3938d6ecd(com.google.protobuf.Descriptors.FieldDescriptor p0) {
return ((com.moon.aw)(this)).a(((com.google.protobuf.Descriptors.FieldDescriptor)(p0)));
}

public com.moon.aw clearField(com.google.protobuf.Descriptors.FieldDescriptor __bridgeParam0) { return ((com.moon.aw)(this.clearField__sourceBridge_e3938d6ecd(((com.google.protobuf.Descriptors.FieldDescriptor)(__bridgeParam0))))); }
public com.google.protobuf.Message.Builder setRepeatedField__MessageInnerBuilder__sourceBridge_9e9db7eb5f(com.google.protobuf.Descriptors.FieldDescriptor p0, int p1, java.lang.Object p2) {
return ((com.moon.aw)(this)).a(((com.google.protobuf.Descriptors.FieldDescriptor)(p0)), ((int)(p1)), ((java.lang.Object)(p2)));
}

public com.google.protobuf.GeneratedMessageV3.Builder setRepeatedField__sourceBridge_6dda4cebb2(com.google.protobuf.Descriptors.FieldDescriptor p0, int p1, java.lang.Object p2) {
return ((com.moon.aw)(this)).a(((com.google.protobuf.Descriptors.FieldDescriptor)(p0)), ((int)(p1)), ((java.lang.Object)(p2)));
}

public com.moon.aw setRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor __bridgeParam0, int __bridgeParam1, java.lang.Object __bridgeParam2) { return ((com.moon.aw)(this.setRepeatedField__sourceBridge_6dda4cebb2(((com.google.protobuf.Descriptors.FieldDescriptor)(__bridgeParam0)), ((int)(__bridgeParam1)), ((java.lang.Object)(__bridgeParam2))))); }
public com.google.protobuf.Message.Builder setUnknownFields__MessageInnerBuilder__sourceBridge_0115284766(com.google.protobuf.UnknownFieldSet p0) {
return ((com.moon.aw)(this)).a(((com.google.protobuf.UnknownFieldSet)(p0)));
}

public com.google.protobuf.GeneratedMessageV3.Builder setUnknownFields__sourceBridge_c1a02174d9(com.google.protobuf.UnknownFieldSet p0) {
return ((com.moon.aw)(this)).a(((com.google.protobuf.UnknownFieldSet)(p0)));
}

public com.moon.aw setUnknownFields(com.google.protobuf.UnknownFieldSet __bridgeParam0) { return ((com.moon.aw)(this.setUnknownFields__sourceBridge_c1a02174d9(((com.google.protobuf.UnknownFieldSet)(__bridgeParam0))))); }
public com.google.protobuf.AbstractMessage.Builder mergeUnknownFields__sourceBridge_1d37e78876(com.google.protobuf.UnknownFieldSet p0) {
return ((com.moon.aw)(this)).b(((com.google.protobuf.UnknownFieldSet)(p0)));
}

public com.moon.aw mergeUnknownFields(com.google.protobuf.UnknownFieldSet __bridgeParam0) { return ((com.moon.aw)(this.mergeUnknownFields__sourceBridge_1d37e78876(((com.google.protobuf.UnknownFieldSet)(__bridgeParam0))))); }
public com.google.protobuf.Message.Builder mergeUnknownFields__MessageInnerBuilder__sourceBridge_0115284766(com.google.protobuf.UnknownFieldSet p0) {
return ((com.moon.aw)(this)).b(((com.google.protobuf.UnknownFieldSet)(p0)));
}

public com.google.protobuf.GeneratedMessageV3.Builder mergeUnknownFields__GeneratedMessageV3InnerBuilder__sourceBridge_c1a02174d9(com.google.protobuf.UnknownFieldSet p0) {
return ((com.moon.aw)(this)).b(((com.google.protobuf.UnknownFieldSet)(p0)));
}

public com.google.protobuf.Message buildPartial__sourceBridge_561eee1e9a() {
return ((com.moon.aw)(this)).c();
}

public com.google.protobuf.Message buildPartial() { return ((com.google.protobuf.Message)(this.buildPartial__sourceBridge_561eee1e9a())); }
public com.google.protobuf.MessageLite buildPartial__MessageLite__sourceBridge_99b74750a2() {
return ((com.moon.aw)(this)).c();
}

public com.google.protobuf.GeneratedMessageV3.Builder clearOneof__GeneratedMessageV3InnerBuilder__sourceBridge_cca806b01c(com.google.protobuf.Descriptors.OneofDescriptor p0) {
return ((com.moon.aw)(this)).a(((com.google.protobuf.Descriptors.OneofDescriptor)(p0)));
}

public com.google.protobuf.Message.Builder clearOneof__MessageInnerBuilder__sourceBridge_ea7c504747(com.google.protobuf.Descriptors.OneofDescriptor p0) {
return ((com.moon.aw)(this)).a(((com.google.protobuf.Descriptors.OneofDescriptor)(p0)));
}

public com.google.protobuf.AbstractMessage.Builder clearOneof__sourceBridge_5f25fbcda8(com.google.protobuf.Descriptors.OneofDescriptor p0) {
return ((com.moon.aw)(this)).a(((com.google.protobuf.Descriptors.OneofDescriptor)(p0)));
}

public com.moon.aw clearOneof(com.google.protobuf.Descriptors.OneofDescriptor __bridgeParam0) { return ((com.moon.aw)(this.clearOneof__sourceBridge_5f25fbcda8(((com.google.protobuf.Descriptors.OneofDescriptor)(__bridgeParam0))))); }
public com.google.protobuf.GeneratedMessageV3.Builder setField__sourceBridge_0269b32b8b(com.google.protobuf.Descriptors.FieldDescriptor p0, java.lang.Object p1) {
return ((com.moon.aw)(this)).a(((com.google.protobuf.Descriptors.FieldDescriptor)(p0)), ((java.lang.Object)(p1)));
}

public com.moon.aw setField(com.google.protobuf.Descriptors.FieldDescriptor __bridgeParam0, java.lang.Object __bridgeParam1) { return ((com.moon.aw)(this.setField__sourceBridge_0269b32b8b(((com.google.protobuf.Descriptors.FieldDescriptor)(__bridgeParam0)), ((java.lang.Object)(__bridgeParam1))))); }
public com.google.protobuf.Message.Builder setField__MessageInnerBuilder__sourceBridge_d5d25498d5(com.google.protobuf.Descriptors.FieldDescriptor p0, java.lang.Object p1) {
return ((com.moon.aw)(this)).a(((com.google.protobuf.Descriptors.FieldDescriptor)(p0)), ((java.lang.Object)(p1)));
}

public com.google.protobuf.GeneratedMessageV3.Builder addRepeatedField__sourceBridge_0269b32b8b(com.google.protobuf.Descriptors.FieldDescriptor p0, java.lang.Object p1) {
return ((com.moon.aw)(this)).b(((com.google.protobuf.Descriptors.FieldDescriptor)(p0)), ((java.lang.Object)(p1)));
}

public com.moon.aw addRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor __bridgeParam0, java.lang.Object __bridgeParam1) { return ((com.moon.aw)(this.addRepeatedField__sourceBridge_0269b32b8b(((com.google.protobuf.Descriptors.FieldDescriptor)(__bridgeParam0)), ((java.lang.Object)(__bridgeParam1))))); }
public com.google.protobuf.Message.Builder addRepeatedField__MessageInnerBuilder__sourceBridge_d5d25498d5(com.google.protobuf.Descriptors.FieldDescriptor p0, java.lang.Object p1) {
return ((com.moon.aw)(this)).b(((com.google.protobuf.Descriptors.FieldDescriptor)(p0)), ((java.lang.Object)(p1)));
}

public com.google.protobuf.MessageLite.Builder mergeFrom__MessageLiteInnerBuilder__sourceBridge_1f3030ddff(com.google.protobuf.CodedInputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.aw)(this)).a(((com.google.protobuf.CodedInputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)));
}

public com.google.protobuf.AbstractMessageLite.Builder mergeFrom__AbstractMessageLiteInnerBuilder__sourceBridge_b3429bd776(com.google.protobuf.CodedInputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.aw)(this)).a(((com.google.protobuf.CodedInputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)));
}

public com.google.protobuf.Message.Builder mergeFrom__MessageInnerBuilder__sourceBridge_d24d40278a(com.google.protobuf.CodedInputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.aw)(this)).a(((com.google.protobuf.CodedInputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)));
}

public com.google.protobuf.Message.Builder mergeFrom__MessageInnerBuilder__sourceBridge_21f2600f58(com.google.protobuf.Message p0) {
return ((com.moon.aw)(this)).a(((com.google.protobuf.Message)(p0)));
}

public com.google.protobuf.AbstractMessage.Builder mergeFrom__sourceBridge_0e6f230f8a(com.google.protobuf.Message p0) {
return ((com.moon.aw)(this)).a(((com.google.protobuf.Message)(p0)));
}

public com.moon.aw mergeFrom(com.google.protobuf.Message __bridgeParam0) { return ((com.moon.aw)(this.mergeFrom__sourceBridge_0e6f230f8a(((com.google.protobuf.Message)(__bridgeParam0))))); }
public com.google.protobuf.AbstractMessage.Builder mergeFrom__sourceBridge_811039b404(com.google.protobuf.CodedInputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.aw)(this)).a(((com.google.protobuf.CodedInputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)));
}

public com.moon.aw mergeFrom(com.google.protobuf.CodedInputStream __bridgeParam0, com.google.protobuf.ExtensionRegistryLite __bridgeParam1) throws java.io.IOException { return ((com.moon.aw)(this.mergeFrom__sourceBridge_811039b404(((com.google.protobuf.CodedInputStream)(__bridgeParam0)), ((com.google.protobuf.ExtensionRegistryLite)(__bridgeParam1))))); }
public com.google.protobuf.Message getDefaultInstanceForType__sourceBridge_561eee1e9a() {
return ((com.moon.aw)(this)).a__U();
}

public com.google.protobuf.Message getDefaultInstanceForType() { return ((com.google.protobuf.Message)(this.getDefaultInstanceForType__sourceBridge_561eee1e9a())); }
public com.google.protobuf.MessageLite getDefaultInstanceForType__MessageLite__sourceBridge_99b74750a2() {
return ((com.moon.aw)(this)).a__U();
}

}
