package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public final class ai extends com.google.protobuf.GeneratedMessageV3.Builder<com.moon.ai> implements com.moon.oC {

private int a;

private int b;

private java.util.List<com.moon.J> c;

private com.google.protobuf.RepeatedFieldBuilderV3<com.moon.J, com.moon.al, com.moon.oG> d;

private static long e;

private static long[] f;

private static java.lang.Integer[] g;

private static java.util.Map h;

private ai(com.google.protobuf.GeneratedMessageV3.BuilderParent p0) {
super(p0);
    this.b = ((int)(0));
    this.c = ((java.util.List)(java.util.Collections.emptyList()));
    return;
}


private ai() {
super();
    this.b = 0;
    this.c = java.util.Collections.emptyList();
}


static {
e = ((long)(((moom._a)(moom._c.a(((long)(8444085460874326352L)), ((long)(3639460661649105232L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(137131843053442L)))));
    h = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.ai.e ^ 120552805467079L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill13_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill13_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill13_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill13_14 = new byte[8];
    (__sourceSpill13_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill13_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation13_16 = __sourceSpill13_14;
    ((javax.crypto.Cipher)(__sourceSpill13_11)).init(((int)(__sourceSpill13_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill13_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation13_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "Á\nÙÍNÆ|lK±\\¬XÉ\021"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill13_25 = local6_life21;
        int __sourceSpill13_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill13_25)).substring(((int)(__sourceSpill13_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill13_30 = local8_life19;
        int __sourceSpill13_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill13_33 = new byte[8];
        (__sourceSpill13_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill13_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill13_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill13_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill13_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill13_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill13_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill13_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill13_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill13_34)).doFinal(((byte[])(__sourceSpill13_33)));
        (__sourceSpill13_30)[__sourceSpill13_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    f = ((long[])(local8_life19));
    g = ((java.lang.Integer[])(new java.lang.Integer[2]));
}

private static native <E extends Throwable> com.moon.J __sourceHandlerCall_a9cf91d8ee378ba8ce68(com.moon.ai a0, int a1) throws E;
private static final class __SourceHandler_a9cf91d8ee378ba8ce68 {

public static com.moon.J f292(com.moon.ai receiver, int p0) throws Throwable {
    com.google.protobuf.RepeatedFieldBuilderV3 forwardValue292_19_0;
    com.google.protobuf.RepeatedFieldBuilderV3 spill292_0;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_19: {
    forward_join_17: {
    life2_3 = (__fieldRead292_0() ^ 97742570280824L);
    life4_5 = __call292_1();
    spill292_0 = __fieldRead292_2(receiver);
    if (!((life4_5 == null))) {
        forwardValue292_19_0 = spill292_0;
        break forward_join_19;
    }
    if (!((spill292_0 == null))) {
        break forward_join_17;
    }
    return __cast292_5(__call292_4(__fieldRead292_3(receiver), p0));
    }
    forwardValue292_19_0 = __fieldRead292_6(receiver);
    }
    return __cast292_8(__call292_7(forwardValue292_19_0, p0));
}
public static void h292_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1029200_0(p0);
}
public static void h292_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call1029201_0(p0);
}
private static native long __fieldRead292_0() throws Throwable;
private static native java.lang.String[] __call292_1() throws Throwable;
private static native com.google.protobuf.RepeatedFieldBuilderV3 __fieldRead292_2(com.moon.ai a0) throws Throwable;
private static native java.util.List __fieldRead292_3(com.moon.ai a0) throws Throwable;
private static native java.lang.Object __call292_4(java.util.List a0, int a1) throws Throwable;
private static native com.moon.J __cast292_5(java.lang.Object a0) throws Throwable;
private static native com.google.protobuf.RepeatedFieldBuilderV3 __fieldRead292_6(com.moon.ai a0) throws Throwable;
private static native com.google.protobuf.AbstractMessage __call292_7(com.google.protobuf.RepeatedFieldBuilderV3 a0, int a1) throws Throwable;
private static native com.moon.J __cast292_8(com.google.protobuf.AbstractMessage a0) throws Throwable;
private static native java.lang.Exception __call1029200_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1029201_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.ai __sourceHandlerCall_cd5f003f3d70870332f1(com.moon.ai a0, int a1, com.moon.J a2) throws E;
private static final class __SourceHandler_cd5f003f3d70870332f1 {

public static com.moon.ai f3(com.moon.ai receiver, int p0, com.moon.J p1) throws Throwable {
    java.lang.Object forwardValue3_26_0;
    com.google.protobuf.RepeatedFieldBuilderV3 forwardValue3_36_0;
    com.google.protobuf.RepeatedFieldBuilderV3 spill3_0;
    com.moon.J spill3_1;
    long life3_3;
    java.lang.String[] life5_5;
    forward_join_37: {
    forward_join_36: {
    forward_join_31: {
    forward_join_26: {
    forward_join_19: {
    life3_3 = (__fieldRead3_0() ^ 103500264185084L);
    life5_5 = __call3_1();
    spill3_0 = __fieldRead3_2(receiver);
    if (!((life5_5 == null))) {
        forwardValue3_36_0 = spill3_0;
        break forward_join_36;
    }
    if (!((spill3_0 == null))) {
        break forward_join_31;
    }
    spill3_1 = p1;
    if (!((life5_5 == null))) {
        forwardValue3_26_0 = spill3_1;
        break forward_join_26;
    }
    if (!((spill3_1 == null))) {
        break forward_join_19;
    }
    throw new java.lang.NullPointerException();
    }
    __call3_3(receiver);
    forwardValue3_26_0 = __call3_5(__fieldRead3_4(receiver), p0, p1);
    }
    __discardScalar3_6(forwardValue3_26_0);
    __call3_7(receiver);
    if (!((life5_5 != null))) {
        break forward_join_37;
    }
    }
    forwardValue3_36_0 = __call3_9(__fieldRead3_8(receiver), p0, p1);
    }
    __discardScalar3_10(forwardValue3_36_0);
    }
    return receiver;
}
public static void h3_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1000300_0(p0);
}
public static void h3_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call1000301_0(p0);
}
public static void h3_2(java.lang.NullPointerException p0) throws Throwable {
    throw __call1000302_0(p0);
}
public static void h3_3(java.lang.NullPointerException p0) throws Throwable {
    throw __call1000303_0(p0);
}
public static void h3_4(java.lang.NullPointerException p0) throws Throwable {
    throw __call1000304_0(p0);
}
private static native long __fieldRead3_0() throws Throwable;
private static native java.lang.String[] __call3_1() throws Throwable;
private static native com.google.protobuf.RepeatedFieldBuilderV3 __fieldRead3_2(com.moon.ai a0) throws Throwable;
private static native void __call3_3(com.moon.ai a0) throws Throwable;
private static native java.util.List __fieldRead3_4(com.moon.ai a0) throws Throwable;
private static native java.lang.Object __call3_5(java.util.List a0, int a1, com.moon.J a2) throws Throwable;
private static native void __discardScalar3_6(java.lang.Object a0) throws Throwable;
private static native void __call3_7(com.moon.ai a0) throws Throwable;
private static native com.google.protobuf.RepeatedFieldBuilderV3 __fieldRead3_8(com.moon.ai a0) throws Throwable;
private static native com.google.protobuf.RepeatedFieldBuilderV3 __call3_9(com.google.protobuf.RepeatedFieldBuilderV3 a0, int a1, com.moon.J a2) throws Throwable;
private static native void __discardScalar3_10(com.google.protobuf.RepeatedFieldBuilderV3 a0) throws Throwable;
private static native java.lang.Exception __call1000300_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1000301_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1000302_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1000303_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1000304_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.ai __sourceHandlerCall_021980968d9fc40f1dba(com.moon.ai a0, int a1, com.moon.al a2) throws E;
private static final class __SourceHandler_021980968d9fc40f1dba {

public static com.moon.ai f4(com.moon.ai receiver, int p0, com.moon.al p1) throws Throwable {
    com.google.protobuf.RepeatedFieldBuilderV3 forwardValue4_30_0;
    com.google.protobuf.RepeatedFieldBuilderV3 spill4_0;
    long life3_3;
    java.lang.String[] life5_5;
    forward_join_31: {
    forward_join_30: {
    forward_join_24: {
    life3_3 = (__fieldRead4_0() ^ 40453117721386L);
    life5_5 = __call4_1();
    spill4_0 = __fieldRead4_2(receiver);
    if (!((life5_5 == null))) {
        forwardValue4_30_0 = spill4_0;
        break forward_join_30;
    }
    if (!((spill4_0 == null))) {
        break forward_join_24;
    }
    __call4_3(receiver);
    __call4_6(__fieldRead4_4(receiver), p0, __call4_5(p1));
    __call4_7(receiver);
    if (!((life5_5 != null))) {
        break forward_join_31;
    }
    }
    forwardValue4_30_0 = __call4_10(__fieldRead4_8(receiver), p0, __call4_9(p1));
    }
    __discardScalar4_11(forwardValue4_30_0);
    }
    return receiver;
}
public static void h4_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1000400_0(p0);
}
public static void h4_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call1000401_0(p0);
}
public static void h4_2(java.lang.NullPointerException p0) throws Throwable {
    throw __call1000402_0(p0);
}
private static native long __fieldRead4_0() throws Throwable;
private static native java.lang.String[] __call4_1() throws Throwable;
private static native com.google.protobuf.RepeatedFieldBuilderV3 __fieldRead4_2(com.moon.ai a0) throws Throwable;
private static native void __call4_3(com.moon.ai a0) throws Throwable;
private static native java.util.List __fieldRead4_4(com.moon.ai a0) throws Throwable;
private static native com.moon.J __call4_5(com.moon.al a0) throws Throwable;
private static native java.lang.Object __call4_6(java.util.List a0, int a1, com.moon.J a2) throws Throwable;
private static native void __call4_7(com.moon.ai a0) throws Throwable;
private static native com.google.protobuf.RepeatedFieldBuilderV3 __fieldRead4_8(com.moon.ai a0) throws Throwable;
private static native com.moon.J __call4_9(com.moon.al a0) throws Throwable;
private static native com.google.protobuf.RepeatedFieldBuilderV3 __call4_10(com.google.protobuf.RepeatedFieldBuilderV3 a0, int a1, com.moon.J a2) throws Throwable;
private static native void __discardScalar4_11(com.google.protobuf.RepeatedFieldBuilderV3 a0) throws Throwable;
private static native java.lang.Exception __call1000400_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1000401_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1000402_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.ai __sourceHandlerCall_757c52e0c65c422805ed(com.moon.ai a0, com.google.protobuf.CodedInputStream a1, com.google.protobuf.ExtensionRegistryLite a2) throws E;
private static final class __SourceHandler_757c52e0c65c422805ed {

public static com.moon.ai f14(com.moon.ai receiver, com.google.protobuf.CodedInputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws Throwable {
    com.google.protobuf.RepeatedFieldBuilderV3 lexicalValue14_59_0;
    int lexicalValue14_67_0;
    int lexicalValue14_71_0;
    int spill14_0;
    com.google.protobuf.RepeatedFieldBuilderV3 spill14_1;
    long life3_3;
    java.lang.String[] life5_5;
    int life6_15;
    int life7_20;
    com.moon.J life8_50;
    lexical_join_76: {
    lexical_join_74: {
    lexical_join_12: {
    life3_3 = (__fieldRead14_0() ^ 662334419926L);
    life5_5 = __call14_1();
    if (!((p1 == null))) {
        break lexical_join_12;
    }
    throw new java.lang.NullPointerException();
    }
    life6_15 = 0;
    lexical_cycle_14: while (true) {
    lexical_join_72: {
    lexical_join_71: {
    lexical_join_67: {
    lexical_join_62: {
    lexical_join_59: {
    lexical_join_55: {
    lexical_join_35: {
    lexical_join_29: {
    lexical_join_25: {
    if (!((life6_15 == 0))) {
        break lexical_join_74;
    }
    life7_20 = __call14_2(p0);
    if (!((life5_5 == null))) {
        break lexical_join_76;
    }
    spill14_0 = life7_20;
    if (!((life5_5 == null))) {
        lexicalValue14_67_0 = spill14_0;
        break lexical_join_67;
    }
    switch (spill14_0) {
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
default:
{
        break lexical_join_62;
    }
}
    }
    life6_15 = 1;
    if (!((life5_5 != null))) {
        break lexical_join_72;
    }
    }
    __fieldWrite14_4(receiver, __call14_3(p0));
    if (!((life5_5 != null))) {
        break lexical_join_72;
    }
    }
    life8_50 = __cast14_7(__call14_6(p0, __call14_5(), p1));
    spill14_1 = __fieldRead14_8(receiver);
    if (!((life5_5 == null))) {
        lexicalValue14_59_0 = spill14_1;
        break lexical_join_59;
    }
    if (!((spill14_1 == null))) {
        break lexical_join_55;
    }
    __call14_9(receiver);
    __call14_11(__fieldRead14_10(receiver), life8_50);
    if (!((life5_5 != null))) {
        break lexical_join_72;
    }
    }
    lexicalValue14_59_0 = __call14_13(__fieldRead14_12(receiver), life8_50);
    }
    __discardScalar14_14(lexicalValue14_59_0);
    if (!((life5_5 != null))) {
        break lexical_join_72;
    }
    }
    lexicalValue14_67_0 = __integerCategory14_16(__call14_15(receiver, p0, p1, life7_20));
    }
    if (!((life5_5 == null))) {
        lexicalValue14_71_0 = lexicalValue14_67_0;
        break lexical_join_71;
    }
    if (!((lexicalValue14_67_0 == 0))) {
        break lexical_join_72;
    }
    lexicalValue14_71_0 = 1;
    }
    life6_15 = lexicalValue14_71_0;
    }
    if (!((life5_5 != null))) { continue lexical_cycle_14; }
    break lexical_cycle_14;
    }
    }
    __call14_17(receiver);
    }
    return receiver;
}
public static com.moon.ai h14_0(com.google.protobuf.InvalidProtocolBufferException p0) throws Throwable {
    throw __call3001400_0(p0);
}
public static com.moon.ai h14_1(com.google.protobuf.InvalidProtocolBufferException p0) throws Throwable {
    throw __call3001401_0(p0);
}
public static com.moon.ai h14_2(com.google.protobuf.InvalidProtocolBufferException p0) throws Throwable {
    throw __call3001402_0(p0);
}
public static com.moon.ai h14_3(com.google.protobuf.InvalidProtocolBufferException p0) throws Throwable {
    throw __call3001403_0(p0);
}
public static com.moon.ai h14_4(com.google.protobuf.InvalidProtocolBufferException p0) throws Throwable {
    throw __call3001404_0(p0);
}
public static com.moon.ai h14_5(com.google.protobuf.InvalidProtocolBufferException p0) throws Throwable {
    throw __call3001405_0(p0);
}
public static com.moon.ai h14_6(com.google.protobuf.InvalidProtocolBufferException p0) throws Throwable {
    throw __call3001406_0(p0);
}
public static com.moon.ai h14_7(com.google.protobuf.InvalidProtocolBufferException p0) throws Throwable {
    throw __call3001407_0(p0);
}
public static com.moon.ai h14_8(com.google.protobuf.InvalidProtocolBufferException p0) throws Throwable {
    throw __call3001408_0(p0);
}
public static com.moon.ai h14_9(com.google.protobuf.InvalidProtocolBufferException p0, int p1) throws Throwable {
    com.google.protobuf.InvalidProtocolBufferException life1_2;
    life1_2 = p0;
    throw __call3001409_0(life1_2);
}
public static com.moon.ai h14_10(java.lang.Throwable p0, com.moon.ai p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __call3001410_0(p1);
    throw life2_2;
}
private static native long __fieldRead14_0() throws Throwable;
private static native java.lang.String[] __call14_1() throws Throwable;
private static native int __call14_2(com.google.protobuf.CodedInputStream a0) throws Throwable;
private static native int __call14_3(com.google.protobuf.CodedInputStream a0) throws Throwable;
private static native void __fieldWrite14_4(com.moon.ai a0, int a1) throws Throwable;
private static native com.google.protobuf.Parser __call14_5() throws Throwable;
private static native com.google.protobuf.MessageLite __call14_6(com.google.protobuf.CodedInputStream a0, com.google.protobuf.Parser a1, com.google.protobuf.ExtensionRegistryLite a2) throws Throwable;
private static native com.moon.J __cast14_7(com.google.protobuf.MessageLite a0) throws Throwable;
private static native com.google.protobuf.RepeatedFieldBuilderV3 __fieldRead14_8(com.moon.ai a0) throws Throwable;
private static native void __call14_9(com.moon.ai a0) throws Throwable;
private static native java.util.List __fieldRead14_10(com.moon.ai a0) throws Throwable;
private static native boolean __call14_11(java.util.List a0, com.moon.J a1) throws Throwable;
private static native com.google.protobuf.RepeatedFieldBuilderV3 __fieldRead14_12(com.moon.ai a0) throws Throwable;
private static native com.google.protobuf.RepeatedFieldBuilderV3 __call14_13(com.google.protobuf.RepeatedFieldBuilderV3 a0, com.moon.J a1) throws Throwable;
private static native void __discardScalar14_14(com.google.protobuf.RepeatedFieldBuilderV3 a0) throws Throwable;
private static native boolean __call14_15(com.moon.ai a0, com.google.protobuf.CodedInputStream a1, com.google.protobuf.ExtensionRegistryLite a2, int a3) throws Throwable;
private static native int __integerCategory14_16(boolean value) throws Throwable;
private static native void __call14_17(com.moon.ai a0) throws Throwable;
private static native java.lang.Exception __call3001400_0(com.google.protobuf.InvalidProtocolBufferException a0) throws Throwable;
private static native java.lang.Exception __call3001401_0(com.google.protobuf.InvalidProtocolBufferException a0) throws Throwable;
private static native java.lang.Exception __call3001402_0(com.google.protobuf.InvalidProtocolBufferException a0) throws Throwable;
private static native java.lang.Exception __call3001403_0(com.google.protobuf.InvalidProtocolBufferException a0) throws Throwable;
private static native java.lang.Exception __call3001404_0(com.google.protobuf.InvalidProtocolBufferException a0) throws Throwable;
private static native java.lang.Exception __call3001405_0(com.google.protobuf.InvalidProtocolBufferException a0) throws Throwable;
private static native java.lang.Exception __call3001406_0(com.google.protobuf.InvalidProtocolBufferException a0) throws Throwable;
private static native java.lang.Exception __call3001407_0(com.google.protobuf.InvalidProtocolBufferException a0) throws Throwable;
private static native java.lang.Exception __call3001408_0(com.google.protobuf.InvalidProtocolBufferException a0) throws Throwable;
private static native java.io.IOException __call3001409_0(com.google.protobuf.InvalidProtocolBufferException a0) throws Throwable;
private static native void __call3001410_0(com.moon.ai a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.ai __sourceHandlerCall_ed8fdb85b02e5a2e75c0(com.moon.ai a0, com.google.protobuf.Message a1) throws E;
private static final class __SourceHandler_ed8fdb85b02e5a2e75c0 {

public static com.moon.ai f372(com.moon.ai receiver, com.google.protobuf.Message p0) throws Throwable {
    long life2_3;
    java.lang.String[] life4_5;
    life2_3 = (__fieldRead372_0() ^ 31997036365952L);
    life4_5 = __call372_1();
    if ((life4_5 == null)) {
        if ((__instanceOf372_2(p0) != 0)) {
        return __call372_4(receiver, __cast372_3(p0));
    }
        __call372_5(receiver, p0);
    }
    return receiver;
}
public static void h372_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1037200_0(p0);
}
public static void h372_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call1037201_0(p0);
}
private static native long __fieldRead372_0() throws Throwable;
private static native java.lang.String[] __call372_1() throws Throwable;
private static native int __instanceOf372_2(com.google.protobuf.Message a0) throws Throwable;
private static native com.moon.G __cast372_3(com.google.protobuf.Message a0) throws Throwable;
private static native com.moon.ai __call372_4(com.moon.ai a0, com.moon.G a1) throws Throwable;
private static native com.google.protobuf.AbstractMessage.Builder __call372_5(com.moon.ai a0, com.google.protobuf.Message a1) throws Throwable;
private static native java.lang.Exception __call1037200_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1037201_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.ai __sourceHandlerCall_00f34ec8c8b30a772b35(com.moon.ai a0, com.moon.G a1) throws E;
private static final class __SourceHandler_00f34ec8c8b30a772b35 {

public static com.moon.ai f8(com.moon.ai receiver, com.moon.G p0) throws Throwable {
    com.moon.G forestValue8_14_0;
    int forestValue8_33_0;
    int forestValue8_59_0;
    int forestValue8_75_0;
    com.moon.ai forestValue8_102_0;
    com.moon.ai forestValue8_102_1;
    com.moon.ai forestValue8_104_0;
    com.moon.ai forestValue8_105_0;
    com.google.protobuf.RepeatedFieldBuilderV3 forestValue8_105_1;
    com.google.protobuf.RepeatedFieldBuilderV3 forestValue8_113_0;
    com.moon.G spill8_0;
    boolean spill8_1;
    boolean spill8_2;
    com.google.protobuf.RepeatedFieldBuilderV3 spill8_3;
    com.moon.ai spill8_4;
    com.moon.ai spill8_5;
    com.moon.ai spill8_6;
    long life2_3;
    java.lang.String[] life4_5;
    forest_join_114: {
    forest_join_113: {
    forest_join_108: {
    forest_join_105: {
    forest_join_104: {
    forest_join_102: {
    forest_join_75: {
    forest_join_64: {
    forest_join_60: {
    forest_join_59: {
    forest_join_52: {
    forest_join_33: {
    forest_join_21: {
    forest_join_14: {
    forest_join_13: {
    life2_3 = (__fieldRead8_0() ^ 111436005457012L);
    life4_5 = __call8_1();
    spill8_0 = p0;
    if (!((life4_5 == null))) {
        forestValue8_14_0 = spill8_0;
        break forest_join_14;
    }
    if (!((spill8_0 == __call8_2()))) {
        break forest_join_13;
    }
    return receiver;
    }
    forestValue8_14_0 = p0;
    }
    if (!((__fieldRead8_3(forestValue8_14_0) != 0))) {
        break forest_join_21;
    }
    __call8_5(receiver, __call8_4(p0));
    }
    if (!((__fieldRead8_6(receiver) == null))) {
        break forest_join_64;
    }
    spill8_1 = __call8_8(__fieldRead8_7(p0));
    if (!((life4_5 == null))) {
        forestValue8_33_0 = __integerCategory8_9(spill8_1);
        break forest_join_33;
    }
    if (!((!spill8_1))) {
        break forest_join_114;
    }
    forestValue8_33_0 = __integerCategory8_12(__call8_11(__fieldRead8_10(receiver)));
    }
    if (!((life4_5 == null))) {
        forestValue8_59_0 = forestValue8_33_0;
        break forest_join_59;
    }
    if (!((forestValue8_33_0 != 0))) {
        break forest_join_52;
    }
    __fieldWrite8_14(receiver, __fieldRead8_13(p0));
    __fieldWrite8_17(receiver, (__fieldRead8_15(receiver) & __invokedynamic8_16(6477, (3578228966890185554L ^ life2_3))));
    if (!((life4_5 != null))) {
        break forest_join_60;
    }
    }
    __call8_18(receiver);
    forestValue8_59_0 = __integerCategory8_22(__call8_21(__fieldRead8_19(receiver), __fieldRead8_20(p0)));
    }
    __discardScalar8_23(forestValue8_59_0);
    }
    __call8_24(receiver);
    if (!((life4_5 != null))) {
        break forest_join_114;
    }
    }
    spill8_2 = __call8_26(__fieldRead8_25(p0));
    if (!((life4_5 == null))) {
        forestValue8_75_0 = __integerCategory8_27(spill8_2);
        break forest_join_75;
    }
    if (!((!spill8_2))) {
        break forest_join_114;
    }
    spill8_3 = __fieldRead8_28(receiver);
    if (!((life4_5 == null))) {
        forestValue8_113_0 = spill8_3;
        break forest_join_113;
    }
    forestValue8_75_0 = __integerCategory8_30(__call8_29(spill8_3));
    }
    if (!((forestValue8_75_0 != 0))) {
        break forest_join_108;
    }
    __call8_32(__fieldRead8_31(receiver));
    __fieldWrite8_33(receiver, null);
    __fieldWrite8_35(receiver, __fieldRead8_34(p0));
    spill8_4 = receiver;
    spill8_5 = receiver;
    if (!((life4_5 == null))) {
        forestValue8_102_0 = spill8_4;
        forestValue8_102_1 = spill8_5;
        break forest_join_102;
    }
    __fieldWrite8_38(spill8_4, (__fieldRead8_36(spill8_5) & __invokedynamic8_37(6477, (3578228966890185554L ^ life2_3))));
    spill8_6 = receiver;
    if (!(__call8_39())) {
        forestValue8_104_0 = spill8_6;
        break forest_join_104;
    }
    forestValue8_102_0 = spill8_6;
    forestValue8_102_1 = receiver;
    }
    forestValue8_105_0 = forestValue8_102_0;
    forestValue8_105_1 = __call8_40(forestValue8_102_1);
    break forest_join_105;
    }
    forestValue8_105_0 = forestValue8_104_0;
    forestValue8_105_1 = null;
    }
    __fieldWrite8_41(forestValue8_105_0, forestValue8_105_1);
    if (!((life4_5 != null))) {
        break forest_join_114;
    }
    }
    forestValue8_113_0 = __call8_44(__fieldRead8_42(receiver), __fieldRead8_43(p0));
    }
    __discardScalar8_45(forestValue8_113_0);
    }
    __call8_47(receiver, __call8_46(p0));
    __call8_48(receiver);
    return receiver;
}
public static com.moon.ai h8_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call3000800_0(p0);
}
public static com.moon.ai h8_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call3000801_0(p0);
}
public static com.moon.ai h8_2(java.lang.NullPointerException p0) throws Throwable {
    throw __call3000802_0(p0);
}
public static com.moon.ai h8_3(java.lang.NullPointerException p0) throws Throwable {
    throw __call3000803_0(p0);
}
public static com.moon.ai h8_4(java.lang.NullPointerException p0) throws Throwable {
    throw __call3000804_0(p0);
}
public static com.moon.ai h8_5(java.lang.NullPointerException p0) throws Throwable {
    throw __call3000805_0(p0);
}
public static com.moon.ai h8_6(java.lang.NullPointerException p0) throws Throwable {
    throw __call3000806_0(p0);
}
public static com.moon.ai h8_7(java.lang.NullPointerException p0) throws Throwable {
    throw __call3000807_0(p0);
}
public static com.moon.ai h8_8(java.lang.NullPointerException p0) throws Throwable {
    throw __call3000808_0(p0);
}
public static com.moon.ai h8_9(java.lang.NullPointerException p0) throws Throwable {
    throw __call3000809_0(p0);
}
public static com.moon.ai h8_10(java.lang.NullPointerException p0) throws Throwable {
    throw __call3000810_0(p0);
}
public static com.moon.ai h8_11(java.lang.NullPointerException p0) throws Throwable {
    throw __call3000811_0(p0);
}
public static com.moon.ai h8_12(java.lang.NullPointerException p0) throws Throwable {
    throw __call3000812_0(p0);
}
public static com.moon.ai h8_13(java.lang.NullPointerException p0) throws Throwable {
    throw __call3000813_0(p0);
}
public static com.moon.ai h8_14(java.lang.NullPointerException p0) throws Throwable {
    throw __call3000814_0(p0);
}
public static com.moon.ai h8_15(java.lang.NullPointerException p0) throws Throwable {
    throw __call3000815_0(p0);
}
public static com.moon.ai h8_16(java.lang.NullPointerException p0) throws Throwable {
    throw __call3000816_0(p0);
}
private static native long __fieldRead8_0() throws Throwable;
private static native java.lang.String[] __call8_1() throws Throwable;
private static native com.moon.G __call8_2() throws Throwable;
private static native int __fieldRead8_3(com.moon.G a0) throws Throwable;
private static native int __call8_4(com.moon.G a0) throws Throwable;
private static native com.moon.ai __call8_5(com.moon.ai a0, int a1) throws Throwable;
private static native com.google.protobuf.RepeatedFieldBuilderV3 __fieldRead8_6(com.moon.ai a0) throws Throwable;
private static native java.util.List __fieldRead8_7(com.moon.G a0) throws Throwable;
private static native boolean __call8_8(java.util.List a0) throws Throwable;
private static native int __integerCategory8_9(boolean value) throws Throwable;
private static native java.util.List __fieldRead8_10(com.moon.ai a0) throws Throwable;
private static native boolean __call8_11(java.util.List a0) throws Throwable;
private static native int __integerCategory8_12(boolean value) throws Throwable;
private static native java.util.List __fieldRead8_13(com.moon.G a0) throws Throwable;
private static native void __fieldWrite8_14(com.moon.ai a0, java.util.List a1) throws Throwable;
private static native int __fieldRead8_15(com.moon.ai a0) throws Throwable;
private static native int __invokedynamic8_16(int a0, long a1) throws Throwable;
private static native void __fieldWrite8_17(com.moon.ai a0, int a1) throws Throwable;
private static native void __call8_18(com.moon.ai a0) throws Throwable;
private static native java.util.List __fieldRead8_19(com.moon.ai a0) throws Throwable;
private static native java.util.List __fieldRead8_20(com.moon.G a0) throws Throwable;
private static native boolean __call8_21(java.util.List a0, java.util.List a1) throws Throwable;
private static native int __integerCategory8_22(boolean value) throws Throwable;
private static native void __discardScalar8_23(int a0) throws Throwable;
private static native void __call8_24(com.moon.ai a0) throws Throwable;
private static native java.util.List __fieldRead8_25(com.moon.G a0) throws Throwable;
private static native boolean __call8_26(java.util.List a0) throws Throwable;
private static native int __integerCategory8_27(boolean value) throws Throwable;
private static native com.google.protobuf.RepeatedFieldBuilderV3 __fieldRead8_28(com.moon.ai a0) throws Throwable;
private static native boolean __call8_29(com.google.protobuf.RepeatedFieldBuilderV3 a0) throws Throwable;
private static native int __integerCategory8_30(boolean value) throws Throwable;
private static native com.google.protobuf.RepeatedFieldBuilderV3 __fieldRead8_31(com.moon.ai a0) throws Throwable;
private static native void __call8_32(com.google.protobuf.RepeatedFieldBuilderV3 a0) throws Throwable;
private static native void __fieldWrite8_33(com.moon.ai a0, java.lang.Object a1) throws Throwable;
private static native java.util.List __fieldRead8_34(com.moon.G a0) throws Throwable;
private static native void __fieldWrite8_35(com.moon.ai a0, java.util.List a1) throws Throwable;
private static native int __fieldRead8_36(com.moon.ai a0) throws Throwable;
private static native int __invokedynamic8_37(int a0, long a1) throws Throwable;
private static native void __fieldWrite8_38(com.moon.ai a0, int a1) throws Throwable;
private static native boolean __call8_39() throws Throwable;
private static native com.google.protobuf.RepeatedFieldBuilderV3 __call8_40(com.moon.ai a0) throws Throwable;
private static native void __fieldWrite8_41(com.moon.ai a0, com.google.protobuf.RepeatedFieldBuilderV3 a1) throws Throwable;
private static native com.google.protobuf.RepeatedFieldBuilderV3 __fieldRead8_42(com.moon.ai a0) throws Throwable;
private static native java.util.List __fieldRead8_43(com.moon.G a0) throws Throwable;
private static native com.google.protobuf.RepeatedFieldBuilderV3 __call8_44(com.google.protobuf.RepeatedFieldBuilderV3 a0, java.util.List a1) throws Throwable;
private static native void __discardScalar8_45(com.google.protobuf.RepeatedFieldBuilderV3 a0) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call8_46(com.moon.G a0) throws Throwable;
private static native com.moon.ai __call8_47(com.moon.ai a0, com.google.protobuf.UnknownFieldSet a1) throws Throwable;
private static native void __call8_48(com.moon.ai a0) throws Throwable;
private static native java.lang.Exception __call3000800_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call3000801_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call3000802_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call3000803_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call3000804_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call3000805_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call3000806_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call3000807_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call3000808_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call3000809_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call3000810_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call3000811_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call3000812_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call3000813_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call3000814_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call3000815_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call3000816_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.ai __sourceHandlerCall_481617eab7afeea80c44(com.moon.ai a0, com.moon.J a1) throws E;
private static final class __SourceHandler_481617eab7afeea80c44 {

public static com.moon.ai f6(com.moon.ai receiver, com.moon.J p0) throws Throwable {
    com.google.protobuf.RepeatedFieldBuilderV3 forwardValue6_32_0;
    com.google.protobuf.RepeatedFieldBuilderV3 spill6_0;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_33: {
    forward_join_32: {
    forward_join_28: {
    forward_join_17: {
    life2_3 = (__fieldRead6_0() ^ 97513645082753L);
    life4_5 = __call6_1();
    spill6_0 = __fieldRead6_2(receiver);
    if (!((life4_5 == null))) {
        forwardValue6_32_0 = spill6_0;
        break forward_join_32;
    }
    if (!((spill6_0 == null))) {
        break forward_join_28;
    }
    if (!((p0 == null))) {
        break forward_join_17;
    }
    throw new java.lang.NullPointerException();
    }
    __call6_3(receiver);
    __call6_5(__fieldRead6_4(receiver), p0);
    __call6_6(receiver);
    if (!((life4_5 != null))) {
        break forward_join_33;
    }
    }
    forwardValue6_32_0 = __call6_8(__fieldRead6_7(receiver), p0);
    }
    __discardScalar6_9(forwardValue6_32_0);
    }
    return receiver;
}
public static void h6_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1000600_0(p0);
}
public static void h6_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call1000601_0(p0);
}
public static void h6_2(java.lang.NullPointerException p0) throws Throwable {
    throw __call1000602_0(p0);
}
public static void h6_3(java.lang.NullPointerException p0) throws Throwable {
    throw __call1000603_0(p0);
}
private static native long __fieldRead6_0() throws Throwable;
private static native java.lang.String[] __call6_1() throws Throwable;
private static native com.google.protobuf.RepeatedFieldBuilderV3 __fieldRead6_2(com.moon.ai a0) throws Throwable;
private static native void __call6_3(com.moon.ai a0) throws Throwable;
private static native java.util.List __fieldRead6_4(com.moon.ai a0) throws Throwable;
private static native boolean __call6_5(java.util.List a0, com.moon.J a1) throws Throwable;
private static native void __call6_6(com.moon.ai a0) throws Throwable;
private static native com.google.protobuf.RepeatedFieldBuilderV3 __fieldRead6_7(com.moon.ai a0) throws Throwable;
private static native com.google.protobuf.RepeatedFieldBuilderV3 __call6_8(com.google.protobuf.RepeatedFieldBuilderV3 a0, com.moon.J a1) throws Throwable;
private static native void __discardScalar6_9(com.google.protobuf.RepeatedFieldBuilderV3 a0) throws Throwable;
private static native java.lang.Exception __call1000600_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1000601_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1000602_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1000603_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.ai __sourceHandlerCall_0536ff9ea64406df7b49(com.moon.ai a0, com.moon.al a1) throws E;
private static final class __SourceHandler_0536ff9ea64406df7b49 {

public static com.moon.ai f7(com.moon.ai receiver, com.moon.al p0) throws Throwable {
    com.google.protobuf.RepeatedFieldBuilderV3 forwardValue7_28_0;
    com.google.protobuf.RepeatedFieldBuilderV3 spill7_0;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_29: {
    forward_join_28: {
    forward_join_23: {
    life2_3 = (__fieldRead7_0() ^ 38303457685659L);
    life4_5 = __call7_1();
    spill7_0 = __fieldRead7_2(receiver);
    if (!((life4_5 == null))) {
        forwardValue7_28_0 = spill7_0;
        break forward_join_28;
    }
    if (!((spill7_0 == null))) {
        break forward_join_23;
    }
    __call7_3(receiver);
    __call7_6(__fieldRead7_4(receiver), __call7_5(p0));
    __call7_7(receiver);
    if (!((life4_5 != null))) {
        break forward_join_29;
    }
    }
    forwardValue7_28_0 = __call7_10(__fieldRead7_8(receiver), __call7_9(p0));
    }
    __discardScalar7_11(forwardValue7_28_0);
    }
    return receiver;
}
public static void h7_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1000700_0(p0);
}
public static void h7_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call1000701_0(p0);
}
public static void h7_2(java.lang.NullPointerException p0) throws Throwable {
    throw __call1000702_0(p0);
}
private static native long __fieldRead7_0() throws Throwable;
private static native java.lang.String[] __call7_1() throws Throwable;
private static native com.google.protobuf.RepeatedFieldBuilderV3 __fieldRead7_2(com.moon.ai a0) throws Throwable;
private static native void __call7_3(com.moon.ai a0) throws Throwable;
private static native java.util.List __fieldRead7_4(com.moon.ai a0) throws Throwable;
private static native com.moon.J __call7_5(com.moon.al a0) throws Throwable;
private static native boolean __call7_6(java.util.List a0, com.moon.J a1) throws Throwable;
private static native void __call7_7(com.moon.ai a0) throws Throwable;
private static native com.google.protobuf.RepeatedFieldBuilderV3 __fieldRead7_8(com.moon.ai a0) throws Throwable;
private static native com.moon.J __call7_9(com.moon.al a0) throws Throwable;
private static native com.google.protobuf.RepeatedFieldBuilderV3 __call7_10(com.google.protobuf.RepeatedFieldBuilderV3 a0, com.moon.J a1) throws Throwable;
private static native void __discardScalar7_11(com.google.protobuf.RepeatedFieldBuilderV3 a0) throws Throwable;
private static native java.lang.Exception __call1000700_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1000701_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1000702_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.ai __sourceHandlerCall_9d17209ff6b1e6eb3610(com.moon.ai a0, com.moon.ck a1) throws E;
private static final class __SourceHandler_9d17209ff6b1e6eb3610 {

public static com.moon.ai f376(com.moon.ai receiver, com.moon.ck p0) throws Throwable {
    long life2_3;
    java.lang.String[] life4_5;
    life2_3 = (__fieldRead376_0() ^ 26736224125497L);
    life4_5 = __call376_1();
    if ((life4_5 == null)) {
        if ((p0 == null)) {
        throw new java.lang.NullPointerException();
    }
        __fieldWrite376_3(receiver, __call376_2(p0));
        __call376_4(receiver);
    }
    return receiver;
}
public static void h376_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1037600_0(p0);
}
public static void h376_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call1037601_0(p0);
}
private static native long __fieldRead376_0() throws Throwable;
private static native java.lang.String[] __call376_1() throws Throwable;
private static native int __call376_2(com.moon.ck a0) throws Throwable;
private static native void __fieldWrite376_3(com.moon.ai a0, int a1) throws Throwable;
private static native void __call376_4(com.moon.ai a0) throws Throwable;
private static native java.lang.Exception __call1037600_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1037601_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.ai __sourceHandlerCall_067c0dd4c5b78226eb0d(com.moon.ai a0, java.lang.Iterable a1) throws E;
private static final class __SourceHandler_067c0dd4c5b78226eb0d {

public static com.moon.ai f8(com.moon.ai receiver, java.lang.Iterable p0) throws Throwable {
    com.google.protobuf.RepeatedFieldBuilderV3 forwardValue8_25_0;
    com.google.protobuf.RepeatedFieldBuilderV3 spill8_0;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_26: {
    forward_join_25: {
    forward_join_21: {
    life2_3 = (__fieldRead8_0() ^ 25905541492166L);
    life4_5 = __call8_1();
    spill8_0 = __fieldRead8_2(receiver);
    if (!((life4_5 == null))) {
        forwardValue8_25_0 = spill8_0;
        break forward_join_25;
    }
    if (!((spill8_0 == null))) {
        break forward_join_21;
    }
    __call8_3(receiver);
    __call8_5(p0, __fieldRead8_4(receiver));
    __call8_6(receiver);
    if (!((life4_5 != null))) {
        break forward_join_26;
    }
    }
    forwardValue8_25_0 = __call8_8(__fieldRead8_7(receiver), p0);
    }
    __discardScalar8_9(forwardValue8_25_0);
    }
    return receiver;
}
public static void h8_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1000800_0(p0);
}
public static void h8_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call1000801_0(p0);
}
public static void h8_2(java.lang.NullPointerException p0) throws Throwable {
    throw __call1000802_0(p0);
}
private static native long __fieldRead8_0() throws Throwable;
private static native java.lang.String[] __call8_1() throws Throwable;
private static native com.google.protobuf.RepeatedFieldBuilderV3 __fieldRead8_2(com.moon.ai a0) throws Throwable;
private static native void __call8_3(com.moon.ai a0) throws Throwable;
private static native java.util.List __fieldRead8_4(com.moon.ai a0) throws Throwable;
private static native void __call8_5(java.lang.Iterable a0, java.util.List a1) throws Throwable;
private static native void __call8_6(com.moon.ai a0) throws Throwable;
private static native com.google.protobuf.RepeatedFieldBuilderV3 __fieldRead8_7(com.moon.ai a0) throws Throwable;
private static native com.google.protobuf.RepeatedFieldBuilderV3 __call8_8(com.google.protobuf.RepeatedFieldBuilderV3 a0, java.lang.Iterable a1) throws Throwable;
private static native void __discardScalar8_9(com.google.protobuf.RepeatedFieldBuilderV3 a0) throws Throwable;
private static native java.lang.Exception __call1000800_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1000801_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1000802_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> java.util.List __sourceHandlerCall_de1f34ec852d9e5566f0(com.moon.ai a0) throws E;
private static final class __SourceHandler_de1f34ec852d9e5566f0 {

public static java.util.List f299(com.moon.ai receiver) throws Throwable {
    com.google.protobuf.RepeatedFieldBuilderV3 forwardValue299_17_0;
    com.google.protobuf.RepeatedFieldBuilderV3 spill299_0;
    long life1_3;
    java.lang.String[] life3_5;
    forward_join_17: {
    forward_join_15: {
    life1_3 = (__fieldRead299_0() ^ 73058930740966L);
    life3_5 = __call299_1();
    spill299_0 = __fieldRead299_2(receiver);
    if (!((life3_5 == null))) {
        forwardValue299_17_0 = spill299_0;
        break forward_join_17;
    }
    if (!((spill299_0 == null))) {
        break forward_join_15;
    }
    return __call299_4(__fieldRead299_3(receiver));
    }
    forwardValue299_17_0 = __fieldRead299_5(receiver);
    }
    return __call299_6(forwardValue299_17_0);
}
public static void h299_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1029900_0(p0);
}
public static void h299_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call1029901_0(p0);
}
private static native long __fieldRead299_0() throws Throwable;
private static native java.lang.String[] __call299_1() throws Throwable;
private static native com.google.protobuf.RepeatedFieldBuilderV3 __fieldRead299_2(com.moon.ai a0) throws Throwable;
private static native java.util.List __fieldRead299_3(com.moon.ai a0) throws Throwable;
private static native java.util.List __call299_4(java.util.List a0) throws Throwable;
private static native com.google.protobuf.RepeatedFieldBuilderV3 __fieldRead299_5(com.moon.ai a0) throws Throwable;
private static native java.util.List __call299_6(com.google.protobuf.RepeatedFieldBuilderV3 a0) throws Throwable;
private static native java.lang.Exception __call1029900_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1029901_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> com.google.protobuf.RepeatedFieldBuilderV3 __sourceHandlerCall_46ae55dd1b08f74aa315(com.moon.ai a0) throws E;
private static final class __SourceHandler_46ae55dd1b08f74aa315 {

public static com.google.protobuf.RepeatedFieldBuilderV3 f15(com.moon.ai receiver) throws Throwable {
    com.google.protobuf.RepeatedFieldBuilderV3 spill15_0;
    com.google.protobuf.RepeatedFieldBuilderV3 joinValue15_1_0;
    long life1_3;
    java.lang.String[] life3_5;
    life1_3 = (__fieldRead15_0() ^ 133420359150046L);
    life3_5 = __call15_1();
    spill15_0 = __fieldRead15_2(receiver);
    if ((life3_5 == null)) {
        if ((spill15_0 == null)) {
        __fieldWrite15_8(receiver, new com.google.protobuf.RepeatedFieldBuilderV3(__fieldRead15_3(receiver), __integerCategory15_7((((__fieldRead15_4(receiver) & 1) != 0) ? 1 : 0)), __call15_5(receiver), __call15_6(receiver)));
        __fieldWrite15_9(receiver, null);
    } else {
        
    }
        joinValue15_1_0 = __fieldRead15_10(receiver);
    } else {
        joinValue15_1_0 = spill15_0;
    }
    return joinValue15_1_0;
}
public static com.google.protobuf.RepeatedFieldBuilderV3 h15_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call3001500_0(p0);
}
public static com.google.protobuf.RepeatedFieldBuilderV3 h15_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call3001501_0(p0);
}
public static com.google.protobuf.RepeatedFieldBuilderV3 h15_2(java.lang.NullPointerException p0) throws Throwable {
    throw __call3001502_0(p0);
}
private static native long __fieldRead15_0() throws Throwable;
private static native java.lang.String[] __call15_1() throws Throwable;
private static native com.google.protobuf.RepeatedFieldBuilderV3 __fieldRead15_2(com.moon.ai a0) throws Throwable;
private static native java.util.List __fieldRead15_3(com.moon.ai a0) throws Throwable;
private static native int __fieldRead15_4(com.moon.ai a0) throws Throwable;
private static native com.google.protobuf.GeneratedMessageV3.BuilderParent __call15_5(com.moon.ai a0) throws Throwable;
private static native boolean __call15_6(com.moon.ai a0) throws Throwable;
private static native boolean __integerCategory15_7(int value) throws Throwable;
private static native void __fieldWrite15_8(com.moon.ai a0, com.google.protobuf.RepeatedFieldBuilderV3 a1) throws Throwable;
private static native void __fieldWrite15_9(com.moon.ai a0, java.lang.Object a1) throws Throwable;
private static native com.google.protobuf.RepeatedFieldBuilderV3 __fieldRead15_10(com.moon.ai a0) throws Throwable;
private static native java.lang.Exception __call3001500_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call3001501_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call3001502_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_ab6387ab9a72a35b137f(com.moon.ai a0) throws E;
private static final class __SourceHandler_ab6387ab9a72a35b137f {

public static void f10(com.moon.ai receiver) throws Throwable {
    com.moon.ai forwardValue10_21_0;
    com.moon.ai spill10_0;
    long life1_3;
    java.lang.String[] life3_5;
    forward_join_26: {
    forward_join_21: {
    life1_3 = (__fieldRead10_0() ^ 131177564418052L);
    life3_5 = __call10_1();
    spill10_0 = receiver;
    if (!((life3_5 == null))) {
        forwardValue10_21_0 = spill10_0;
        break forward_join_21;
    }
    if (!(((__fieldRead10_2(spill10_0) & 1) == 0))) {
        break forward_join_26;
    }
    __fieldWrite10_4(receiver, new java.util.ArrayList(__fieldRead10_3(receiver)));
    forwardValue10_21_0 = receiver;
    }
    com.moon.ai __stackOp10_5_0 = forwardValue10_21_0;
    __fieldWrite10_7(__stackOp10_5_0, (__fieldRead10_6(__stackOp10_5_0) | 1));
    }
    return;
}
public static void h10_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1001000_0(p0);
}
public static void h10_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call1001001_0(p0);
}
private static native long __fieldRead10_0() throws Throwable;
private static native java.lang.String[] __call10_1() throws Throwable;
private static native int __fieldRead10_2(com.moon.ai a0) throws Throwable;
private static native java.util.List __fieldRead10_3(com.moon.ai a0) throws Throwable;
private static native void __fieldWrite10_4(com.moon.ai a0, java.util.ArrayList a1) throws Throwable;
private static native int __fieldRead10_6(com.moon.ai a0) throws Throwable;
private static native void __fieldWrite10_7(com.moon.ai a0, int a1) throws Throwable;
private static native java.lang.Exception __call1001000_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1001001_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.ai __sourceHandlerCall_9590087b4e4220aae45c(com.moon.ai a0) throws E;
private static final class __SourceHandler_9590087b4e4220aae45c {

public static com.moon.ai f301(com.moon.ai receiver) throws Throwable {
    com.google.protobuf.RepeatedFieldBuilderV3 forwardValue301_27_0;
    java.lang.String[] spill301_0;
    com.google.protobuf.RepeatedFieldBuilderV3 spill301_1;
    long life1_3;
    java.lang.String[] life3_11;
    forward_join_28: {
    forward_join_27: {
    forward_join_22: {
    life1_3 = (__fieldRead301_0() ^ 127612029733914L);
    __call301_1(receiver);
    spill301_0 = __call301_2();
    __fieldWrite301_3(receiver, 0);
    life3_11 = spill301_0;
    spill301_1 = __fieldRead301_4(receiver);
    if (!((life3_11 == null))) {
        forwardValue301_27_0 = spill301_1;
        break forward_join_27;
    }
    if (!((spill301_1 == null))) {
        break forward_join_22;
    }
    __fieldWrite301_6(receiver, __call301_5());
    if (!((life3_11 != null))) {
        break forward_join_28;
    }
    }
    __fieldWrite301_7(receiver, null);
    forwardValue301_27_0 = __fieldRead301_8(receiver);
    }
    __call301_9(forwardValue301_27_0);
    }
    __fieldWrite301_12(receiver, (__fieldRead301_10(receiver) & __invokedynamic301_11(6477, (3578247479444247356L ^ life1_3))));
    return receiver;
}
public static void h301_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1030100_0(p0);
}
public static void h301_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call1030101_0(p0);
}
public static void h301_2(java.lang.NullPointerException p0) throws Throwable {
    throw __call1030102_0(p0);
}
private static native long __fieldRead301_0() throws Throwable;
private static native com.google.protobuf.GeneratedMessageV3.Builder __call301_1(com.moon.ai a0) throws Throwable;
private static native java.lang.String[] __call301_2() throws Throwable;
private static native void __fieldWrite301_3(com.moon.ai a0, int a1) throws Throwable;
private static native com.google.protobuf.RepeatedFieldBuilderV3 __fieldRead301_4(com.moon.ai a0) throws Throwable;
private static native java.util.List __call301_5() throws Throwable;
private static native void __fieldWrite301_6(com.moon.ai a0, java.util.List a1) throws Throwable;
private static native void __fieldWrite301_7(com.moon.ai a0, java.lang.Object a1) throws Throwable;
private static native com.google.protobuf.RepeatedFieldBuilderV3 __fieldRead301_8(com.moon.ai a0) throws Throwable;
private static native void __call301_9(com.google.protobuf.RepeatedFieldBuilderV3 a0) throws Throwable;
private static native int __fieldRead301_10(com.moon.ai a0) throws Throwable;
private static native int __invokedynamic301_11(int a0, long a1) throws Throwable;
private static native void __fieldWrite301_12(com.moon.ai a0, int a1) throws Throwable;
private static native java.lang.Exception __call1030100_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1030101_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1030102_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.ck __sourceHandlerCall_2bcdc96e4572534ad812(com.moon.ai a0) throws E;
private static final class __SourceHandler_2bcdc96e4572534ad812 {

public static com.moon.ck f302(com.moon.ai receiver) throws Throwable {
    com.moon.ck forwardValue302_15_0;
    com.moon.ck forwardValue302_17_0;
    java.lang.String[] spill302_0;
    com.moon.ck spill302_1;
    long life1_3;
    com.moon.ck life4_8;
    java.lang.String[] life3_9;
    forward_join_17: {
    forward_join_16: {
    forward_join_15: {
    life1_3 = (__fieldRead302_0() ^ 34642601153073L);
    spill302_0 = __call302_1();
    life4_8 = __call302_3(__fieldRead302_2(receiver));
    life3_9 = spill302_0;
    spill302_1 = life4_8;
    if (!((life3_9 == null))) {
        forwardValue302_15_0 = spill302_1;
        break forward_join_15;
    }
    if (!((spill302_1 == null))) {
        break forward_join_16;
    }
    forwardValue302_15_0 = __fieldRead302_4();
    }
    forwardValue302_17_0 = forwardValue302_15_0;
    break forward_join_17;
    }
    forwardValue302_17_0 = life4_8;
    }
    return forwardValue302_17_0;
}
public static void h302_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1030200_0(p0);
}
private static native long __fieldRead302_0() throws Throwable;
private static native java.lang.String[] __call302_1() throws Throwable;
private static native int __fieldRead302_2(com.moon.ai a0) throws Throwable;
private static native com.moon.ck __call302_3(int a0) throws Throwable;
private static native com.moon.ck __fieldRead302_4() throws Throwable;
private static native java.lang.Exception __call1030200_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.oG __sourceHandlerCall_6d2d57772d14ad52b383(com.moon.ai a0, int a1) throws E;
private static final class __SourceHandler_6d2d57772d14ad52b383 {

public static com.moon.oG f303(com.moon.ai receiver, int p0) throws Throwable {
    com.google.protobuf.RepeatedFieldBuilderV3 forwardValue303_19_0;
    com.google.protobuf.RepeatedFieldBuilderV3 spill303_0;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_19: {
    forward_join_17: {
    life2_3 = (__fieldRead303_0() ^ 139138981000153L);
    life4_5 = __call303_1();
    spill303_0 = __fieldRead303_2(receiver);
    if (!((life4_5 == null))) {
        forwardValue303_19_0 = spill303_0;
        break forward_join_19;
    }
    if (!((spill303_0 == null))) {
        break forward_join_17;
    }
    return __cast303_5(__call303_4(__fieldRead303_3(receiver), p0));
    }
    forwardValue303_19_0 = __fieldRead303_6(receiver);
    }
    return __cast303_8(__call303_7(forwardValue303_19_0, p0));
}
public static void h303_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1030300_0(p0);
}
public static void h303_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call1030301_0(p0);
}
private static native long __fieldRead303_0() throws Throwable;
private static native java.lang.String[] __call303_1() throws Throwable;
private static native com.google.protobuf.RepeatedFieldBuilderV3 __fieldRead303_2(com.moon.ai a0) throws Throwable;
private static native java.util.List __fieldRead303_3(com.moon.ai a0) throws Throwable;
private static native java.lang.Object __call303_4(java.util.List a0, int a1) throws Throwable;
private static native com.moon.oG __cast303_5(java.lang.Object a0) throws Throwable;
private static native com.google.protobuf.RepeatedFieldBuilderV3 __fieldRead303_6(com.moon.ai a0) throws Throwable;
private static native com.google.protobuf.MessageOrBuilder __call303_7(com.google.protobuf.RepeatedFieldBuilderV3 a0, int a1) throws Throwable;
private static native com.moon.oG __cast303_8(com.google.protobuf.MessageOrBuilder a0) throws Throwable;
private static native java.lang.Exception __call1030300_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1030301_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_98607db904e37f88d021(com.moon.ai a0) throws E;
private static final class __SourceHandler_98607db904e37f88d021 {

public static int f304(com.moon.ai receiver) throws Throwable {
    com.google.protobuf.RepeatedFieldBuilderV3 forwardValue304_17_0;
    com.google.protobuf.RepeatedFieldBuilderV3 spill304_0;
    long life1_3;
    java.lang.String[] life3_5;
    forward_join_17: {
    forward_join_15: {
    life1_3 = (__fieldRead304_0() ^ 125181086257918L);
    life3_5 = __call304_1();
    spill304_0 = __fieldRead304_2(receiver);
    if (!((life3_5 == null))) {
        forwardValue304_17_0 = spill304_0;
        break forward_join_17;
    }
    if (!((spill304_0 == null))) {
        break forward_join_15;
    }
    return __call304_4(__fieldRead304_3(receiver));
    }
    forwardValue304_17_0 = __fieldRead304_5(receiver);
    }
    return __call304_6(forwardValue304_17_0);
}
public static void h304_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1030400_0(p0);
}
public static void h304_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call1030401_0(p0);
}
private static native long __fieldRead304_0() throws Throwable;
private static native java.lang.String[] __call304_1() throws Throwable;
private static native com.google.protobuf.RepeatedFieldBuilderV3 __fieldRead304_2(com.moon.ai a0) throws Throwable;
private static native java.util.List __fieldRead304_3(com.moon.ai a0) throws Throwable;
private static native int __call304_4(java.util.List a0) throws Throwable;
private static native com.google.protobuf.RepeatedFieldBuilderV3 __fieldRead304_5(com.moon.ai a0) throws Throwable;
private static native int __call304_6(com.google.protobuf.RepeatedFieldBuilderV3 a0) throws Throwable;
private static native java.lang.Exception __call1030400_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1030401_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.ai __sourceHandlerCall_5540df1c8552d99bf097(com.moon.ai a0, int a1) throws E;
private static final class __SourceHandler_5540df1c8552d99bf097 {

public static com.moon.ai f305(com.moon.ai receiver, int p0) throws Throwable {
    com.google.protobuf.RepeatedFieldBuilderV3 forwardValue305_24_0;
    com.google.protobuf.RepeatedFieldBuilderV3 spill305_0;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_26: {
    forward_join_24: {
    forward_join_22: {
    life2_3 = (__fieldRead305_0() ^ 58938472589298L);
    life4_5 = __call305_1();
    spill305_0 = __fieldRead305_2(receiver);
    if (!((life4_5 == null))) {
        forwardValue305_24_0 = spill305_0;
        break forward_join_24;
    }
    if (!((spill305_0 == null))) {
        break forward_join_22;
    }
    __call305_3(receiver);
    __call305_5(__fieldRead305_4(receiver), p0);
    __call305_6(receiver);
    if (!((life4_5 != null))) {
        break forward_join_26;
    }
    }
    forwardValue305_24_0 = __fieldRead305_7(receiver);
    }
    __call305_8(forwardValue305_24_0, p0);
    }
    return receiver;
}
public static void h305_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1030500_0(p0);
}
public static void h305_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call1030501_0(p0);
}
public static void h305_2(java.lang.NullPointerException p0) throws Throwable {
    throw __call1030502_0(p0);
}
private static native long __fieldRead305_0() throws Throwable;
private static native java.lang.String[] __call305_1() throws Throwable;
private static native com.google.protobuf.RepeatedFieldBuilderV3 __fieldRead305_2(com.moon.ai a0) throws Throwable;
private static native void __call305_3(com.moon.ai a0) throws Throwable;
private static native java.util.List __fieldRead305_4(com.moon.ai a0) throws Throwable;
private static native java.lang.Object __call305_5(java.util.List a0, int a1) throws Throwable;
private static native void __call305_6(com.moon.ai a0) throws Throwable;
private static native com.google.protobuf.RepeatedFieldBuilderV3 __fieldRead305_7(com.moon.ai a0) throws Throwable;
private static native void __call305_8(com.google.protobuf.RepeatedFieldBuilderV3 a0, int a1) throws Throwable;
private static native java.lang.Exception __call1030500_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1030501_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1030502_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.ai __sourceHandlerCall_ebc9dc9de6857419bc72(com.moon.ai a0, int a1, com.moon.J a2) throws E;
private static final class __SourceHandler_ebc9dc9de6857419bc72 {

public static com.moon.ai f11(com.moon.ai receiver, int p0, com.moon.J p1) throws Throwable {
    com.google.protobuf.RepeatedFieldBuilderV3 forwardValue11_33_0;
    com.google.protobuf.RepeatedFieldBuilderV3 spill11_0;
    long life3_3;
    java.lang.String[] life5_5;
    forward_join_34: {
    forward_join_33: {
    forward_join_28: {
    forward_join_17: {
    life3_3 = (__fieldRead11_0() ^ 14908877709670L);
    life5_5 = __call11_1();
    spill11_0 = __fieldRead11_2(receiver);
    if (!((life5_5 == null))) {
        forwardValue11_33_0 = spill11_0;
        break forward_join_33;
    }
    if (!((spill11_0 == null))) {
        break forward_join_28;
    }
    if (!((p1 == null))) {
        break forward_join_17;
    }
    throw new java.lang.NullPointerException();
    }
    __call11_3(receiver);
    __call11_5(__fieldRead11_4(receiver), p0, p1);
    __call11_6(receiver);
    if (!((life5_5 != null))) {
        break forward_join_34;
    }
    }
    forwardValue11_33_0 = __call11_8(__fieldRead11_7(receiver), p0, p1);
    }
    __discardScalar11_9(forwardValue11_33_0);
    }
    return receiver;
}
public static void h11_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1001100_0(p0);
}
public static void h11_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call1001101_0(p0);
}
public static void h11_2(java.lang.NullPointerException p0) throws Throwable {
    throw __call1001102_0(p0);
}
public static void h11_3(java.lang.NullPointerException p0) throws Throwable {
    throw __call1001103_0(p0);
}
private static native long __fieldRead11_0() throws Throwable;
private static native java.lang.String[] __call11_1() throws Throwable;
private static native com.google.protobuf.RepeatedFieldBuilderV3 __fieldRead11_2(com.moon.ai a0) throws Throwable;
private static native void __call11_3(com.moon.ai a0) throws Throwable;
private static native java.util.List __fieldRead11_4(com.moon.ai a0) throws Throwable;
private static native void __call11_5(java.util.List a0, int a1, com.moon.J a2) throws Throwable;
private static native void __call11_6(com.moon.ai a0) throws Throwable;
private static native com.google.protobuf.RepeatedFieldBuilderV3 __fieldRead11_7(com.moon.ai a0) throws Throwable;
private static native com.google.protobuf.RepeatedFieldBuilderV3 __call11_8(com.google.protobuf.RepeatedFieldBuilderV3 a0, int a1, com.moon.J a2) throws Throwable;
private static native void __discardScalar11_9(com.google.protobuf.RepeatedFieldBuilderV3 a0) throws Throwable;
private static native java.lang.Exception __call1001100_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1001101_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1001102_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1001103_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.ai __sourceHandlerCall_acc402391e29f697dc22(com.moon.ai a0, int a1, com.moon.al a2) throws E;
private static final class __SourceHandler_acc402391e29f697dc22 {

public static com.moon.ai f12(com.moon.ai receiver, int p0, com.moon.al p1) throws Throwable {
    com.google.protobuf.RepeatedFieldBuilderV3 forwardValue12_29_0;
    com.google.protobuf.RepeatedFieldBuilderV3 spill12_0;
    long life3_3;
    java.lang.String[] life5_5;
    forward_join_30: {
    forward_join_29: {
    forward_join_23: {
    life3_3 = (__fieldRead12_0() ^ 846012433972L);
    life5_5 = __call12_1();
    spill12_0 = __fieldRead12_2(receiver);
    if (!((life5_5 == null))) {
        forwardValue12_29_0 = spill12_0;
        break forward_join_29;
    }
    if (!((spill12_0 == null))) {
        break forward_join_23;
    }
    __call12_3(receiver);
    __call12_6(__fieldRead12_4(receiver), p0, __call12_5(p1));
    __call12_7(receiver);
    if (!((life5_5 != null))) {
        break forward_join_30;
    }
    }
    forwardValue12_29_0 = __call12_10(__fieldRead12_8(receiver), p0, __call12_9(p1));
    }
    __discardScalar12_11(forwardValue12_29_0);
    }
    return receiver;
}
public static void h12_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1001200_0(p0);
}
public static void h12_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call1001201_0(p0);
}
public static void h12_2(java.lang.NullPointerException p0) throws Throwable {
    throw __call1001202_0(p0);
}
private static native long __fieldRead12_0() throws Throwable;
private static native java.lang.String[] __call12_1() throws Throwable;
private static native com.google.protobuf.RepeatedFieldBuilderV3 __fieldRead12_2(com.moon.ai a0) throws Throwable;
private static native void __call12_3(com.moon.ai a0) throws Throwable;
private static native java.util.List __fieldRead12_4(com.moon.ai a0) throws Throwable;
private static native com.moon.J __call12_5(com.moon.al a0) throws Throwable;
private static native void __call12_6(java.util.List a0, int a1, com.moon.J a2) throws Throwable;
private static native void __call12_7(com.moon.ai a0) throws Throwable;
private static native com.google.protobuf.RepeatedFieldBuilderV3 __fieldRead12_8(com.moon.ai a0) throws Throwable;
private static native com.moon.J __call12_9(com.moon.al a0) throws Throwable;
private static native com.google.protobuf.RepeatedFieldBuilderV3 __call12_10(com.google.protobuf.RepeatedFieldBuilderV3 a0, int a1, com.moon.J a2) throws Throwable;
private static native void __discardScalar12_11(com.google.protobuf.RepeatedFieldBuilderV3 a0) throws Throwable;
private static native java.lang.Exception __call1001200_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1001201_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1001202_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.G __sourceHandlerCall_91dc1dd3ae0ef040c8c0(com.moon.ai a0) throws E;
private static final class __SourceHandler_91dc1dd3ae0ef040c8c0 {

public static com.moon.G f308(com.moon.ai receiver) throws Throwable {
    com.moon.G forwardValue308_18_0;
    java.lang.String[] spill308_0;
    com.moon.G spill308_1;
    long life1_3;
    com.moon.G life4_7;
    java.lang.String[] life3_8;
    forward_join_18: {
    forward_join_17: {
    life1_3 = (__fieldRead308_0() ^ 80863718320642L);
    spill308_0 = __call308_1();
    life4_7 = __call308_2(receiver);
    life3_8 = spill308_0;
    spill308_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue308_18_0 = spill308_1;
        break forward_join_18;
    }
    if (!((!__call308_3(spill308_1)))) {
        break forward_join_17;
    }
    throw __call308_4(life4_7);
    }
    forwardValue308_18_0 = life4_7;
    }
    return forwardValue308_18_0;
}
public static void h308_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1030800_0(p0);
}
public static void h308_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call1030801_0(p0);
}
private static native long __fieldRead308_0() throws Throwable;
private static native java.lang.String[] __call308_1() throws Throwable;
private static native com.moon.G __call308_2(com.moon.ai a0) throws Throwable;
private static native boolean __call308_3(com.moon.G a0) throws Throwable;
private static native com.google.protobuf.UninitializedMessageException __call308_4(com.moon.G a0) throws Throwable;
private static native java.lang.Exception __call1030800_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1030801_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> java.util.List __sourceHandlerCall_aaad812751f96ab292ac(com.moon.ai a0) throws E;
private static final class __SourceHandler_aaad812751f96ab292ac {

public static java.util.List f309(com.moon.ai receiver) throws Throwable {
    com.moon.ai forwardValue309_16_0;
    com.moon.ai spill309_0;
    long life1_3;
    java.lang.String[] life3_5;
    forward_join_16: {
    forward_join_15: {
    life1_3 = (__fieldRead309_0() ^ 17635442462035L);
    life3_5 = __call309_1();
    spill309_0 = receiver;
    if (!((life3_5 == null))) {
        forwardValue309_16_0 = spill309_0;
        break forward_join_16;
    }
    if (!((__fieldRead309_2(spill309_0) != null))) {
        break forward_join_15;
    }
    return __call309_4(__fieldRead309_3(receiver));
    }
    forwardValue309_16_0 = receiver;
    }
    return __call309_6(__fieldRead309_5(forwardValue309_16_0));
}
public static void h309_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1030900_0(p0);
}
public static void h309_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call1030901_0(p0);
}
private static native long __fieldRead309_0() throws Throwable;
private static native java.lang.String[] __call309_1() throws Throwable;
private static native com.google.protobuf.RepeatedFieldBuilderV3 __fieldRead309_2(com.moon.ai a0) throws Throwable;
private static native com.google.protobuf.RepeatedFieldBuilderV3 __fieldRead309_3(com.moon.ai a0) throws Throwable;
private static native java.util.List __call309_4(com.google.protobuf.RepeatedFieldBuilderV3 a0) throws Throwable;
private static native java.util.List __fieldRead309_5(com.moon.ai a0) throws Throwable;
private static native java.util.List __call309_6(java.util.List a0) throws Throwable;
private static native java.lang.Exception __call1030900_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1030901_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.G __sourceHandlerCall_94565693519084fdad2a(com.moon.ai a0) throws E;
private static final class __SourceHandler_94565693519084fdad2a {

public static com.moon.G f310(com.moon.ai receiver) throws Throwable {
    com.moon.ai forwardValue310_36_0;
    com.moon.G forwardValue310_53_0;
    com.moon.ai forwardValue310_53_1;
    java.lang.String[] spill310_0;
    com.moon.G spill310_1;
    com.moon.ai spill310_2;
    com.moon.ai spill310_3;
    long life1_3;
    com.moon.G life4_9;
    java.lang.String[] life3_10;
    int life5_13;
    forward_join_56: {
    forward_join_53: {
    forward_join_51: {
    forward_join_45: {
    forward_join_36: {
    life1_3 = (__fieldRead310_0() ^ 15373189180416L);
    spill310_0 = __call310_1();
    life4_9 = new com.moon.G(receiver);
    life3_10 = spill310_0;
    life5_13 = __fieldRead310_2(receiver);
    spill310_1 = life4_9;
    spill310_2 = receiver;
    if (!((life3_10 == null))) {
        forwardValue310_53_0 = spill310_1;
        forwardValue310_53_1 = spill310_2;
        break forward_join_53;
    }
    __fieldWrite310_4(spill310_1, __fieldRead310_3(spill310_2));
    if (!((__fieldRead310_5(receiver) == null))) {
        break forward_join_51;
    }
    spill310_3 = receiver;
    if (!((life3_10 == null))) {
        forwardValue310_36_0 = spill310_3;
        break forward_join_36;
    }
    if (!(((__fieldRead310_6(spill310_3) & 1) != 0))) {
        break forward_join_45;
    }
    __fieldWrite310_9(receiver, __call310_8(__fieldRead310_7(receiver)));
    forwardValue310_36_0 = receiver;
    }
    __fieldWrite310_12(forwardValue310_36_0, (__fieldRead310_10(receiver) & __invokedynamic310_11(6477, (3578115313163531046L ^ life1_3))));
    }
    __fieldWrite310_14(life4_9, __fieldRead310_13(receiver));
    if (!((life3_10 != null))) {
        break forward_join_56;
    }
    }
    forwardValue310_53_0 = life4_9;
    forwardValue310_53_1 = receiver;
    }
    __fieldWrite310_17(forwardValue310_53_0, __call310_16(__fieldRead310_15(forwardValue310_53_1)));
    }
    __call310_18(receiver);
    return life4_9;
}
public static void h310_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1031000_0(p0);
}
public static void h310_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call1031001_0(p0);
}
public static void h310_2(java.lang.NullPointerException p0) throws Throwable {
    throw __call1031002_0(p0);
}
public static void h310_3(java.lang.NullPointerException p0) throws Throwable {
    throw __call1031003_0(p0);
}
public static void h310_4(java.lang.NullPointerException p0) throws Throwable {
    throw __call1031004_0(p0);
}
private static native long __fieldRead310_0() throws Throwable;
private static native java.lang.String[] __call310_1() throws Throwable;
private static native int __fieldRead310_2(com.moon.ai a0) throws Throwable;
private static native int __fieldRead310_3(com.moon.ai a0) throws Throwable;
private static native void __fieldWrite310_4(com.moon.G a0, int a1) throws Throwable;
private static native com.google.protobuf.RepeatedFieldBuilderV3 __fieldRead310_5(com.moon.ai a0) throws Throwable;
private static native int __fieldRead310_6(com.moon.ai a0) throws Throwable;
private static native java.util.List __fieldRead310_7(com.moon.ai a0) throws Throwable;
private static native java.util.List __call310_8(java.util.List a0) throws Throwable;
private static native void __fieldWrite310_9(com.moon.ai a0, java.util.List a1) throws Throwable;
private static native int __fieldRead310_10(com.moon.ai a0) throws Throwable;
private static native int __invokedynamic310_11(int a0, long a1) throws Throwable;
private static native void __fieldWrite310_12(com.moon.ai a0, int a1) throws Throwable;
private static native java.util.List __fieldRead310_13(com.moon.ai a0) throws Throwable;
private static native void __fieldWrite310_14(com.moon.G a0, java.util.List a1) throws Throwable;
private static native com.google.protobuf.RepeatedFieldBuilderV3 __fieldRead310_15(com.moon.ai a0) throws Throwable;
private static native java.util.List __call310_16(com.google.protobuf.RepeatedFieldBuilderV3 a0) throws Throwable;
private static native void __fieldWrite310_17(com.moon.G a0, java.util.List a1) throws Throwable;
private static native void __call310_18(com.moon.ai a0) throws Throwable;
private static native java.lang.Exception __call1031000_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1031001_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1031002_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1031003_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1031004_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.ai __sourceHandlerCall_02c46f3b053d3b8edbe4(com.moon.ai a0) throws E;
private static final class __SourceHandler_02c46f3b053d3b8edbe4 {

public static com.moon.ai f311(com.moon.ai receiver) throws Throwable {
    com.google.protobuf.RepeatedFieldBuilderV3 forwardValue311_30_0;
    com.google.protobuf.RepeatedFieldBuilderV3 spill311_0;
    long life1_3;
    java.lang.String[] life3_5;
    forward_join_31: {
    forward_join_30: {
    forward_join_28: {
    life1_3 = (__fieldRead311_0() ^ 74237112312692L);
    life3_5 = __call311_1();
    spill311_0 = __fieldRead311_2(receiver);
    if (!((life3_5 == null))) {
        forwardValue311_30_0 = spill311_0;
        break forward_join_30;
    }
    if (!((spill311_0 == null))) {
        break forward_join_28;
    }
    __fieldWrite311_4(receiver, __call311_3());
    __fieldWrite311_7(receiver, (__fieldRead311_5(receiver) & __invokedynamic311_6(13106, (2682647021274551852L ^ life1_3))));
    __call311_8(receiver);
    if (!((life3_5 != null))) {
        break forward_join_31;
    }
    }
    forwardValue311_30_0 = __fieldRead311_9(receiver);
    }
    __call311_10(forwardValue311_30_0);
    }
    return receiver;
}
public static void h311_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1031100_0(p0);
}
public static void h311_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call1031101_0(p0);
}
public static void h311_2(java.lang.NullPointerException p0) throws Throwable {
    throw __call1031102_0(p0);
}
private static native long __fieldRead311_0() throws Throwable;
private static native java.lang.String[] __call311_1() throws Throwable;
private static native com.google.protobuf.RepeatedFieldBuilderV3 __fieldRead311_2(com.moon.ai a0) throws Throwable;
private static native java.util.List __call311_3() throws Throwable;
private static native void __fieldWrite311_4(com.moon.ai a0, java.util.List a1) throws Throwable;
private static native int __fieldRead311_5(com.moon.ai a0) throws Throwable;
private static native int __invokedynamic311_6(int a0, long a1) throws Throwable;
private static native void __fieldWrite311_7(com.moon.ai a0, int a1) throws Throwable;
private static native void __call311_8(com.moon.ai a0) throws Throwable;
private static native com.google.protobuf.RepeatedFieldBuilderV3 __fieldRead311_9(com.moon.ai a0) throws Throwable;
private static native void __call311_10(com.google.protobuf.RepeatedFieldBuilderV3 a0) throws Throwable;
private static native java.lang.Exception __call1031100_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1031101_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1031102_0(java.lang.NullPointerException a0) throws Throwable;

}


public java.util.List<? extends com.moon.oG> b__List() { return __sourceHandlerCall_aaad812751f96ab292ac(this); }


public com.moon.ai b(int p0, com.moon.al p1) { return __sourceHandlerCall_acc402391e29f697dc22(this, p0, p1); }


public com.moon.ai b(int p0) { return __sourceHandlerCall_5540df1c8552d99bf097(this, p0); }


public final com.moon.ai b(com.google.protobuf.UnknownFieldSet p0) {
return ((com.moon.ai)(super.mergeUnknownFields(((com.google.protobuf.UnknownFieldSet)(p0)))));
}


public com.moon.al b__al(int p0) {
return ((com.moon.al)(((com.google.protobuf.RepeatedFieldBuilderV3)(((com.moon.ai)(this)).a__RepeatedFieldBuilderV3())).addBuilder(((int)(p0)), ((com.google.protobuf.AbstractMessage)(com.moon.J.a__J())))));
}


public int b() { return __sourceHandlerCall_98607db904e37f88d021(this); }


public com.moon.ai b__ai() {
return ((com.moon.ai)(super.clone()));
}


public com.moon.ai b(com.google.protobuf.Descriptors.FieldDescriptor p0, java.lang.Object p1) {
return ((com.moon.ai)(super.addRepeatedField(((com.google.protobuf.Descriptors.FieldDescriptor)(p0)), ((java.lang.Object)(p1)))));
}


public com.moon.G b__G() { return __sourceHandlerCall_91dc1dd3ae0ef040c8c0(this); }


public com.moon.ai b(int p0, com.moon.J p1) { return __sourceHandlerCall_ebc9dc9de6857419bc72(this, p0, p1); }


public java.util.List<com.moon.al> c__List() {
return ((com.google.protobuf.RepeatedFieldBuilderV3)(((com.moon.ai)(this)).a__RepeatedFieldBuilderV3())).getBuilderList();
}


public com.moon.ai c__ai() {
this.b = ((int)(0));
    ((com.moon.ai)(this)).onChanged();
    return this;
}


public com.moon.G c() { return __sourceHandlerCall_94565693519084fdad2a(this); }


public com.moon.ai d() { return __sourceHandlerCall_02c46f3b053d3b8edbe4(this); }


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral441_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/ai"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public com.moon.al a__al(int p0) {
return ((com.moon.al)(((com.google.protobuf.RepeatedFieldBuilderV3)(((com.moon.ai)(this)).a__RepeatedFieldBuilderV3())).getBuilder(((int)(p0)))));
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 2036;
      if (g[var3] == null) {
         byte[] var4 = new byte[]{
            (byte)(p1 >>> 56),
            (byte)(p1 >>> 48),
            (byte)(p1 >>> 40),
            (byte)(p1 >>> 32),
            (byte)(p1 >>> 24),
            (byte)(p1 >>> 16),
            (byte)(p1 >>> 8),
            (byte)p1
         };
         long var5 = f[var3];
         byte[] var7 = new byte[]{
            (byte)(var5 >>> 56),
            (byte)(var5 >>> 48),
            (byte)(var5 >>> 40),
            (byte)(var5 >>> 32),
            (byte)(var5 >>> 24),
            (byte)(var5 >>> 16),
            (byte)(var5 >>> 8),
            (byte)var5
         };
         Long var8 = Thread.currentThread().getId();
         Object[] var9 = (Object[])h.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               h.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/ai", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         g[var3] = var15;
      }

      return g[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_1c9464641a4fc6(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private com.google.protobuf.RepeatedFieldBuilderV3<com.moon.J, com.moon.al, com.moon.oG> a__RepeatedFieldBuilderV3() { return __sourceHandlerCall_46ae55dd1b08f74aa315(this); }


public final com.moon.ai a(com.google.protobuf.UnknownFieldSet p0) {
return ((com.moon.ai)(super.setUnknownFields(((com.google.protobuf.UnknownFieldSet)(p0)))));
}


public com.moon.al a__al() {
return ((com.moon.al)(((com.google.protobuf.RepeatedFieldBuilderV3)(((com.moon.ai)(this)).a__RepeatedFieldBuilderV3())).addBuilder(((com.google.protobuf.AbstractMessage)(com.moon.J.a__J())))));
}


public com.moon.oG a__oG(int p0) { return __sourceHandlerCall_6d2d57772d14ad52b383(this, p0); }


public com.moon.ai a(com.google.protobuf.Message p0) { return __sourceHandlerCall_ed8fdb85b02e5a2e75c0(this, p0); }


public com.moon.ai a(com.moon.G p0) { return __sourceHandlerCall_00f34ec8c8b30a772b35(this, p0); }


public static final com.google.protobuf.Descriptors.Descriptor a__DescriptorsInnerDescriptor() {
return com.moon.oF.y;
}


public com.moon.ai a(com.google.protobuf.CodedInputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException { return __sourceHandlerCall_757c52e0c65c422805ed(this, p0, p1); }


public int a() {
return this.b;
}


public com.moon.ai a__ai(int p0) {
this.b = ((int)(p0));
    ((com.moon.ai)(this)).onChanged();
    return this;
}


public com.moon.ai a__ai() { return __sourceHandlerCall_9590087b4e4220aae45c(this); }


public com.moon.G a__G() {
return com.moon.G.a__G();
}


public com.moon.ai a(com.google.protobuf.Descriptors.FieldDescriptor p0, java.lang.Object p1) {
return ((com.moon.ai)(super.setField(((com.google.protobuf.Descriptors.FieldDescriptor)(p0)), ((java.lang.Object)(p1)))));
}


public com.moon.ai a(com.google.protobuf.Descriptors.FieldDescriptor p0) {
return ((com.moon.ai)(super.clearField(((com.google.protobuf.Descriptors.FieldDescriptor)(p0)))));
}


public com.moon.ai a(com.google.protobuf.Descriptors.OneofDescriptor p0) {
return ((com.moon.ai)(super.clearOneof(((com.google.protobuf.Descriptors.OneofDescriptor)(p0)))));
}


public com.moon.ai a(com.google.protobuf.Descriptors.FieldDescriptor p0, int p1, java.lang.Object p2) {
return ((com.moon.ai)(super.setRepeatedField(((com.google.protobuf.Descriptors.FieldDescriptor)(p0)), ((int)(p1)), ((java.lang.Object)(p2)))));
}


public com.moon.ai a(java.lang.Iterable<? extends com.moon.J> p0) { return __sourceHandlerCall_067c0dd4c5b78226eb0d(this, p0); }


public com.moon.ai a(int p0, com.moon.al p1) { return __sourceHandlerCall_021980968d9fc40f1dba(this, p0, p1); }


public com.moon.ai a(com.moon.al p0) { return __sourceHandlerCall_0536ff9ea64406df7b49(this, p0); }


public com.moon.ai a(com.moon.J p0) { return __sourceHandlerCall_481617eab7afeea80c44(this, p0); }


public com.moon.ck a__ck() { return __sourceHandlerCall_2bcdc96e4572534ad812(this); }


private void a__Void() { __sourceHandlerCall_ab6387ab9a72a35b137f(this); }


public com.moon.ai a(com.moon.ck p0) { return __sourceHandlerCall_9d17209ff6b1e6eb3610(this, p0); }


public java.util.List<com.moon.J> a__List() { return __sourceHandlerCall_de1f34ec852d9e5566f0(this); }


public com.moon.ai a(int p0, com.moon.J p1) { return __sourceHandlerCall_cd5f003f3d70870332f1(this, p0, p1); }


public com.moon.J a(int p0) { return __sourceHandlerCall_a9cf91d8ee378ba8ce68(this, p0); }


public final boolean isInitialized() {
return ((1) != 0);
}


public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
return com.moon.oF.y;
}


protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
return ((com.google.protobuf.GeneratedMessageV3.FieldAccessorTable)(com.moon.oF.z)).ensureFieldAccessorsInitialized(((java.lang.Class)(com.moon.G.class)), ((java.lang.Class)(com.moon.ai.class)));
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral441_0() throws E;

private static native int __sourceExactCall_1c9464641a4fc6(int p0, long p1);

public com.google.protobuf.MessageLite.Builder clone__MessageLiteInnerBuilder__sourceBridge_9503009a6c() {
return ((com.moon.ai)(this)).b__ai();
}

public com.google.protobuf.Message.Builder clone__MessageInnerBuilder__sourceBridge_23266bf05e() {
return ((com.moon.ai)(this)).b__ai();
}

public java.lang.Object clone__Object__sourceBridge_0502b11602() throws java.lang.CloneNotSupportedException {
return ((com.moon.ai)(this)).b__ai();
}

public com.google.protobuf.AbstractMessageLite.Builder clone__AbstractMessageLiteInnerBuilder__sourceBridge_4fc5aa391f() {
return ((com.moon.ai)(this)).b__ai();
}

public com.google.protobuf.GeneratedMessageV3.Builder clone__GeneratedMessageV3InnerBuilder__sourceBridge_2dd0ad8dc0() {
return ((com.moon.ai)(this)).b__ai();
}

public com.google.protobuf.AbstractMessage.Builder clone__sourceBridge_36d0769a6a() {
return ((com.moon.ai)(this)).b__ai();
}

public com.moon.ai clone() { return ((com.moon.ai)(this.clone__sourceBridge_36d0769a6a())); }
public com.google.protobuf.MessageLite.Builder clear__MessageLiteInnerBuilder__sourceBridge_9503009a6c() {
return ((com.moon.ai)(this)).a__ai();
}

public com.google.protobuf.GeneratedMessageV3.Builder clear__GeneratedMessageV3InnerBuilder__sourceBridge_2dd0ad8dc0() {
return ((com.moon.ai)(this)).a__ai();
}

public com.google.protobuf.Message.Builder clear__MessageInnerBuilder__sourceBridge_23266bf05e() {
return ((com.moon.ai)(this)).a__ai();
}

public com.google.protobuf.AbstractMessage.Builder clear__sourceBridge_36d0769a6a() {
return ((com.moon.ai)(this)).a__ai();
}

public com.moon.ai clear() { return ((com.moon.ai)(this.clear__sourceBridge_36d0769a6a())); }
public com.google.protobuf.Message build__sourceBridge_561eee1e9a() {
return ((com.moon.ai)(this)).b__G();
}

public com.google.protobuf.Message build() { return ((com.google.protobuf.Message)(this.build__sourceBridge_561eee1e9a())); }
public com.google.protobuf.MessageLite build__MessageLite__sourceBridge_99b74750a2() {
return ((com.moon.ai)(this)).b__G();
}

public com.google.protobuf.MessageLite buildPartial__MessageLite__sourceBridge_99b74750a2() {
return ((com.moon.ai)(this)).c();
}

public com.google.protobuf.Message buildPartial__sourceBridge_561eee1e9a() {
return ((com.moon.ai)(this)).c();
}

public com.google.protobuf.Message buildPartial() { return ((com.google.protobuf.Message)(this.buildPartial__sourceBridge_561eee1e9a())); }
public com.google.protobuf.Message.Builder setField__MessageInnerBuilder__sourceBridge_d5d25498d5(com.google.protobuf.Descriptors.FieldDescriptor p0, java.lang.Object p1) {
return ((com.moon.ai)(this)).a(((com.google.protobuf.Descriptors.FieldDescriptor)(p0)), ((java.lang.Object)(p1)));
}

public com.google.protobuf.GeneratedMessageV3.Builder setField__sourceBridge_0269b32b8b(com.google.protobuf.Descriptors.FieldDescriptor p0, java.lang.Object p1) {
return ((com.moon.ai)(this)).a(((com.google.protobuf.Descriptors.FieldDescriptor)(p0)), ((java.lang.Object)(p1)));
}

public com.moon.ai setField(com.google.protobuf.Descriptors.FieldDescriptor __bridgeParam0, java.lang.Object __bridgeParam1) { return ((com.moon.ai)(this.setField__sourceBridge_0269b32b8b(((com.google.protobuf.Descriptors.FieldDescriptor)(__bridgeParam0)), ((java.lang.Object)(__bridgeParam1))))); }
public com.google.protobuf.Message.Builder setRepeatedField__MessageInnerBuilder__sourceBridge_9e9db7eb5f(com.google.protobuf.Descriptors.FieldDescriptor p0, int p1, java.lang.Object p2) {
return ((com.moon.ai)(this)).a(((com.google.protobuf.Descriptors.FieldDescriptor)(p0)), ((int)(p1)), ((java.lang.Object)(p2)));
}

public com.google.protobuf.GeneratedMessageV3.Builder setRepeatedField__sourceBridge_6dda4cebb2(com.google.protobuf.Descriptors.FieldDescriptor p0, int p1, java.lang.Object p2) {
return ((com.moon.ai)(this)).a(((com.google.protobuf.Descriptors.FieldDescriptor)(p0)), ((int)(p1)), ((java.lang.Object)(p2)));
}

public com.moon.ai setRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor __bridgeParam0, int __bridgeParam1, java.lang.Object __bridgeParam2) { return ((com.moon.ai)(this.setRepeatedField__sourceBridge_6dda4cebb2(((com.google.protobuf.Descriptors.FieldDescriptor)(__bridgeParam0)), ((int)(__bridgeParam1)), ((java.lang.Object)(__bridgeParam2))))); }
public com.google.protobuf.Message.Builder clearField__MessageInnerBuilder__sourceBridge_23e4b7b587(com.google.protobuf.Descriptors.FieldDescriptor p0) {
return ((com.moon.ai)(this)).a(((com.google.protobuf.Descriptors.FieldDescriptor)(p0)));
}

public com.google.protobuf.GeneratedMessageV3.Builder clearField__sourceBridge_e3938d6ecd(com.google.protobuf.Descriptors.FieldDescriptor p0) {
return ((com.moon.ai)(this)).a(((com.google.protobuf.Descriptors.FieldDescriptor)(p0)));
}

public com.moon.ai clearField(com.google.protobuf.Descriptors.FieldDescriptor __bridgeParam0) { return ((com.moon.ai)(this.clearField__sourceBridge_e3938d6ecd(((com.google.protobuf.Descriptors.FieldDescriptor)(__bridgeParam0))))); }
public com.google.protobuf.GeneratedMessageV3.Builder addRepeatedField__sourceBridge_0269b32b8b(com.google.protobuf.Descriptors.FieldDescriptor p0, java.lang.Object p1) {
return ((com.moon.ai)(this)).b(((com.google.protobuf.Descriptors.FieldDescriptor)(p0)), ((java.lang.Object)(p1)));
}

public com.moon.ai addRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor __bridgeParam0, java.lang.Object __bridgeParam1) { return ((com.moon.ai)(this.addRepeatedField__sourceBridge_0269b32b8b(((com.google.protobuf.Descriptors.FieldDescriptor)(__bridgeParam0)), ((java.lang.Object)(__bridgeParam1))))); }
public com.google.protobuf.Message.Builder addRepeatedField__MessageInnerBuilder__sourceBridge_d5d25498d5(com.google.protobuf.Descriptors.FieldDescriptor p0, java.lang.Object p1) {
return ((com.moon.ai)(this)).b(((com.google.protobuf.Descriptors.FieldDescriptor)(p0)), ((java.lang.Object)(p1)));
}

public com.google.protobuf.GeneratedMessageV3.Builder clearOneof__GeneratedMessageV3InnerBuilder__sourceBridge_cca806b01c(com.google.protobuf.Descriptors.OneofDescriptor p0) {
return ((com.moon.ai)(this)).a(((com.google.protobuf.Descriptors.OneofDescriptor)(p0)));
}

public com.google.protobuf.Message.Builder clearOneof__MessageInnerBuilder__sourceBridge_ea7c504747(com.google.protobuf.Descriptors.OneofDescriptor p0) {
return ((com.moon.ai)(this)).a(((com.google.protobuf.Descriptors.OneofDescriptor)(p0)));
}

public com.google.protobuf.AbstractMessage.Builder clearOneof__sourceBridge_5f25fbcda8(com.google.protobuf.Descriptors.OneofDescriptor p0) {
return ((com.moon.ai)(this)).a(((com.google.protobuf.Descriptors.OneofDescriptor)(p0)));
}

public com.moon.ai clearOneof(com.google.protobuf.Descriptors.OneofDescriptor __bridgeParam0) { return ((com.moon.ai)(this.clearOneof__sourceBridge_5f25fbcda8(((com.google.protobuf.Descriptors.OneofDescriptor)(__bridgeParam0))))); }
public com.google.protobuf.AbstractMessage.Builder mergeUnknownFields__sourceBridge_1d37e78876(com.google.protobuf.UnknownFieldSet p0) {
return ((com.moon.ai)(this)).b(((com.google.protobuf.UnknownFieldSet)(p0)));
}

public com.moon.ai mergeUnknownFields(com.google.protobuf.UnknownFieldSet __bridgeParam0) { return ((com.moon.ai)(this.mergeUnknownFields__sourceBridge_1d37e78876(((com.google.protobuf.UnknownFieldSet)(__bridgeParam0))))); }
public com.google.protobuf.Message.Builder mergeUnknownFields__MessageInnerBuilder__sourceBridge_0115284766(com.google.protobuf.UnknownFieldSet p0) {
return ((com.moon.ai)(this)).b(((com.google.protobuf.UnknownFieldSet)(p0)));
}

public com.google.protobuf.GeneratedMessageV3.Builder mergeUnknownFields__GeneratedMessageV3InnerBuilder__sourceBridge_c1a02174d9(com.google.protobuf.UnknownFieldSet p0) {
return ((com.moon.ai)(this)).b(((com.google.protobuf.UnknownFieldSet)(p0)));
}

public com.google.protobuf.GeneratedMessageV3.Builder setUnknownFields__sourceBridge_c1a02174d9(com.google.protobuf.UnknownFieldSet p0) {
return ((com.moon.ai)(this)).a(((com.google.protobuf.UnknownFieldSet)(p0)));
}

public com.moon.ai setUnknownFields(com.google.protobuf.UnknownFieldSet __bridgeParam0) { return ((com.moon.ai)(this.setUnknownFields__sourceBridge_c1a02174d9(((com.google.protobuf.UnknownFieldSet)(__bridgeParam0))))); }
public com.google.protobuf.Message.Builder setUnknownFields__MessageInnerBuilder__sourceBridge_0115284766(com.google.protobuf.UnknownFieldSet p0) {
return ((com.moon.ai)(this)).a(((com.google.protobuf.UnknownFieldSet)(p0)));
}

public com.google.protobuf.Message getDefaultInstanceForType__sourceBridge_561eee1e9a() {
return ((com.moon.ai)(this)).a__G();
}

public com.google.protobuf.Message getDefaultInstanceForType() { return ((com.google.protobuf.Message)(this.getDefaultInstanceForType__sourceBridge_561eee1e9a())); }
public com.google.protobuf.MessageLite getDefaultInstanceForType__MessageLite__sourceBridge_99b74750a2() {
return ((com.moon.ai)(this)).a__G();
}

public com.google.protobuf.AbstractMessage.Builder mergeFrom__sourceBridge_811039b404(com.google.protobuf.CodedInputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.ai)(this)).a(((com.google.protobuf.CodedInputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)));
}

public com.moon.ai mergeFrom(com.google.protobuf.CodedInputStream __bridgeParam0, com.google.protobuf.ExtensionRegistryLite __bridgeParam1) throws java.io.IOException { return ((com.moon.ai)(this.mergeFrom__sourceBridge_811039b404(((com.google.protobuf.CodedInputStream)(__bridgeParam0)), ((com.google.protobuf.ExtensionRegistryLite)(__bridgeParam1))))); }
public com.google.protobuf.Message.Builder mergeFrom__MessageInnerBuilder__sourceBridge_d24d40278a(com.google.protobuf.CodedInputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.ai)(this)).a(((com.google.protobuf.CodedInputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)));
}

public com.google.protobuf.MessageLite.Builder mergeFrom__MessageLiteInnerBuilder__sourceBridge_1f3030ddff(com.google.protobuf.CodedInputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.ai)(this)).a(((com.google.protobuf.CodedInputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)));
}

public com.google.protobuf.Message.Builder mergeFrom__MessageInnerBuilder__sourceBridge_21f2600f58(com.google.protobuf.Message p0) {
return ((com.moon.ai)(this)).a(((com.google.protobuf.Message)(p0)));
}

public com.google.protobuf.AbstractMessageLite.Builder mergeFrom__AbstractMessageLiteInnerBuilder__sourceBridge_b3429bd776(com.google.protobuf.CodedInputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.ai)(this)).a(((com.google.protobuf.CodedInputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)));
}

public com.google.protobuf.AbstractMessage.Builder mergeFrom__sourceBridge_0e6f230f8a(com.google.protobuf.Message p0) {
return ((com.moon.ai)(this)).a(((com.google.protobuf.Message)(p0)));
}

public com.moon.ai mergeFrom(com.google.protobuf.Message __bridgeParam0) { return ((com.moon.ai)(this.mergeFrom__sourceBridge_0e6f230f8a(((com.google.protobuf.Message)(__bridgeParam0))))); }
}
