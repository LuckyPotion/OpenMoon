package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public final class ak extends com.google.protobuf.GeneratedMessageV3.Builder<com.moon.ak> implements com.moon.oE {

private int a;

private java.util.List<com.moon.ad> b;

private com.google.protobuf.RepeatedFieldBuilderV3<com.moon.ad, com.moon.aF, com.moon.o2> c;

private static long d;

private static long[] e;

private static java.lang.Integer[] f;

private static java.util.Map g;

private ak() {
super();
    this.b = java.util.Collections.emptyList();
}


private ak(com.google.protobuf.GeneratedMessageV3.BuilderParent p0) {
super(p0);
    this.b = ((java.util.List)(java.util.Collections.emptyList()));
    return;
}


static {
d = ((long)(((moom._a)(moom._c.a(((long)(-6956983129332664732L)), ((long)(-6629444364702661491L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(240923248592451L)))));
    g = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.ak.d ^ 94262170318281L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill14_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill14_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill14_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill14_14 = new byte[8];
    (__sourceSpill14_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill14_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation14_16 = __sourceSpill14_14;
    ((javax.crypto.Cipher)(__sourceSpill14_11)).init(((int)(__sourceSpill14_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill14_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation14_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "0Ñû/ôÛy_;¶n¤Á[\030"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill14_25 = local6_life21;
        int __sourceSpill14_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill14_25)).substring(((int)(__sourceSpill14_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill14_30 = local8_life19;
        int __sourceSpill14_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill14_33 = new byte[8];
        (__sourceSpill14_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill14_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill14_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill14_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill14_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill14_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill14_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill14_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill14_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill14_34)).doFinal(((byte[])(__sourceSpill14_33)));
        (__sourceSpill14_30)[__sourceSpill14_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    e = ((long[])(local8_life19));
    f = ((java.lang.Integer[])(new java.lang.Integer[2]));
}

private static native <E extends Throwable> int __sourceHandlerCall_66cf956cc2bc07bbb3b5(com.moon.ak a0) throws E;
private static final class __SourceHandler_66cf956cc2bc07bbb3b5 {

public static int f320(com.moon.ak receiver) throws Throwable {
    com.google.protobuf.RepeatedFieldBuilderV3 forwardValue320_17_0;
    com.google.protobuf.RepeatedFieldBuilderV3 spill320_0;
    long life1_3;
    java.lang.String[] life3_5;
    forward_join_17: {
    forward_join_15: {
    life1_3 = (__fieldRead320_0() ^ 68437596835808L);
    life3_5 = __call320_1();
    spill320_0 = __fieldRead320_2(receiver);
    if (!((life3_5 == null))) {
        forwardValue320_17_0 = spill320_0;
        break forward_join_17;
    }
    if (!((spill320_0 == null))) {
        break forward_join_15;
    }
    return __call320_4(__fieldRead320_3(receiver));
    }
    forwardValue320_17_0 = __fieldRead320_5(receiver);
    }
    return __call320_6(forwardValue320_17_0);
}
public static void h320_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1032000_0(p0);
}
public static void h320_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call1032001_0(p0);
}
private static native long __fieldRead320_0() throws Throwable;
private static native java.lang.String[] __call320_1() throws Throwable;
private static native com.google.protobuf.RepeatedFieldBuilderV3 __fieldRead320_2(com.moon.ak a0) throws Throwable;
private static native java.util.List __fieldRead320_3(com.moon.ak a0) throws Throwable;
private static native int __call320_4(java.util.List a0) throws Throwable;
private static native com.google.protobuf.RepeatedFieldBuilderV3 __fieldRead320_5(com.moon.ak a0) throws Throwable;
private static native int __call320_6(com.google.protobuf.RepeatedFieldBuilderV3 a0) throws Throwable;
private static native java.lang.Exception __call1032000_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1032001_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.ak __sourceHandlerCall_41330489448060d8b7c2(com.moon.ak a0, int a1, com.moon.aF a2) throws E;
private static final class __SourceHandler_41330489448060d8b7c2 {

public static com.moon.ak f13(com.moon.ak receiver, int p0, com.moon.aF p1) throws Throwable {
    com.google.protobuf.RepeatedFieldBuilderV3 forwardValue13_30_0;
    com.google.protobuf.RepeatedFieldBuilderV3 spill13_0;
    long life3_3;
    java.lang.String[] life5_5;
    forward_join_31: {
    forward_join_30: {
    forward_join_24: {
    life3_3 = (__fieldRead13_0() ^ 13009993196282L);
    life5_5 = __call13_1();
    spill13_0 = __fieldRead13_2(receiver);
    if (!((life5_5 == null))) {
        forwardValue13_30_0 = spill13_0;
        break forward_join_30;
    }
    if (!((spill13_0 == null))) {
        break forward_join_24;
    }
    __call13_3(receiver);
    __call13_6(__fieldRead13_4(receiver), p0, __call13_5(p1));
    __call13_7(receiver);
    if (!((life5_5 != null))) {
        break forward_join_31;
    }
    }
    forwardValue13_30_0 = __call13_10(__fieldRead13_8(receiver), p0, __call13_9(p1));
    }
    __discardScalar13_11(forwardValue13_30_0);
    }
    return receiver;
}
public static void h13_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1001300_0(p0);
}
public static void h13_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call1001301_0(p0);
}
public static void h13_2(java.lang.NullPointerException p0) throws Throwable {
    throw __call1001302_0(p0);
}
private static native long __fieldRead13_0() throws Throwable;
private static native java.lang.String[] __call13_1() throws Throwable;
private static native com.google.protobuf.RepeatedFieldBuilderV3 __fieldRead13_2(com.moon.ak a0) throws Throwable;
private static native void __call13_3(com.moon.ak a0) throws Throwable;
private static native java.util.List __fieldRead13_4(com.moon.ak a0) throws Throwable;
private static native com.moon.ad __call13_5(com.moon.aF a0) throws Throwable;
private static native java.lang.Object __call13_6(java.util.List a0, int a1, com.moon.ad a2) throws Throwable;
private static native void __call13_7(com.moon.ak a0) throws Throwable;
private static native com.google.protobuf.RepeatedFieldBuilderV3 __fieldRead13_8(com.moon.ak a0) throws Throwable;
private static native com.moon.ad __call13_9(com.moon.aF a0) throws Throwable;
private static native com.google.protobuf.RepeatedFieldBuilderV3 __call13_10(com.google.protobuf.RepeatedFieldBuilderV3 a0, int a1, com.moon.ad a2) throws Throwable;
private static native void __discardScalar13_11(com.google.protobuf.RepeatedFieldBuilderV3 a0) throws Throwable;
private static native java.lang.Exception __call1001300_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1001301_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1001302_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.ak __sourceHandlerCall_05d57a420dcab9b824f7(com.moon.ak a0, int a1, com.moon.ad a2) throws E;
private static final class __SourceHandler_05d57a420dcab9b824f7 {

public static com.moon.ak f14(com.moon.ak receiver, int p0, com.moon.ad p1) throws Throwable {
    java.lang.Object forwardValue14_26_0;
    com.google.protobuf.RepeatedFieldBuilderV3 forwardValue14_36_0;
    com.google.protobuf.RepeatedFieldBuilderV3 spill14_0;
    com.moon.ad spill14_1;
    long life3_3;
    java.lang.String[] life5_5;
    forward_join_37: {
    forward_join_36: {
    forward_join_31: {
    forward_join_26: {
    forward_join_19: {
    life3_3 = (__fieldRead14_0() ^ 63722762006841L);
    life5_5 = __call14_1();
    spill14_0 = __fieldRead14_2(receiver);
    if (!((life5_5 == null))) {
        forwardValue14_36_0 = spill14_0;
        break forward_join_36;
    }
    if (!((spill14_0 == null))) {
        break forward_join_31;
    }
    spill14_1 = p1;
    if (!((life5_5 == null))) {
        forwardValue14_26_0 = spill14_1;
        break forward_join_26;
    }
    if (!((spill14_1 == null))) {
        break forward_join_19;
    }
    throw new java.lang.NullPointerException();
    }
    __call14_3(receiver);
    forwardValue14_26_0 = __call14_5(__fieldRead14_4(receiver), p0, p1);
    }
    __discardScalar14_6(forwardValue14_26_0);
    __call14_7(receiver);
    if (!((life5_5 != null))) {
        break forward_join_37;
    }
    }
    forwardValue14_36_0 = __call14_9(__fieldRead14_8(receiver), p0, p1);
    }
    __discardScalar14_10(forwardValue14_36_0);
    }
    return receiver;
}
public static void h14_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1001400_0(p0);
}
public static void h14_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call1001401_0(p0);
}
public static void h14_2(java.lang.NullPointerException p0) throws Throwable {
    throw __call1001402_0(p0);
}
public static void h14_3(java.lang.NullPointerException p0) throws Throwable {
    throw __call1001403_0(p0);
}
public static void h14_4(java.lang.NullPointerException p0) throws Throwable {
    throw __call1001404_0(p0);
}
private static native long __fieldRead14_0() throws Throwable;
private static native java.lang.String[] __call14_1() throws Throwable;
private static native com.google.protobuf.RepeatedFieldBuilderV3 __fieldRead14_2(com.moon.ak a0) throws Throwable;
private static native void __call14_3(com.moon.ak a0) throws Throwable;
private static native java.util.List __fieldRead14_4(com.moon.ak a0) throws Throwable;
private static native java.lang.Object __call14_5(java.util.List a0, int a1, com.moon.ad a2) throws Throwable;
private static native void __discardScalar14_6(java.lang.Object a0) throws Throwable;
private static native void __call14_7(com.moon.ak a0) throws Throwable;
private static native com.google.protobuf.RepeatedFieldBuilderV3 __fieldRead14_8(com.moon.ak a0) throws Throwable;
private static native com.google.protobuf.RepeatedFieldBuilderV3 __call14_9(com.google.protobuf.RepeatedFieldBuilderV3 a0, int a1, com.moon.ad a2) throws Throwable;
private static native void __discardScalar14_10(com.google.protobuf.RepeatedFieldBuilderV3 a0) throws Throwable;
private static native java.lang.Exception __call1001400_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1001401_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1001402_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1001403_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1001404_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.ak __sourceHandlerCall_42bda1ce31c4de2c0023(com.moon.ak a0, com.google.protobuf.CodedInputStream a1, com.google.protobuf.ExtensionRegistryLite a2) throws E;
private static final class __SourceHandler_42bda1ce31c4de2c0023 {

public static com.moon.ak f17(com.moon.ak receiver, com.google.protobuf.CodedInputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws Throwable {
    com.google.protobuf.RepeatedFieldBuilderV3 lexicalValue17_53_0;
    int lexicalValue17_61_0;
    int lexicalValue17_65_0;
    int spill17_0;
    com.google.protobuf.RepeatedFieldBuilderV3 spill17_1;
    long life3_3;
    java.lang.String[] life5_5;
    int life6_15;
    int life7_20;
    com.moon.ad life8_41;
    lexical_join_70: {
    lexical_join_68: {
    lexical_join_12: {
    life3_3 = (__fieldRead17_0() ^ 22487007281344L);
    life5_5 = __call17_1();
    if (!((p1 == null))) {
        break lexical_join_12;
    }
    throw new java.lang.NullPointerException();
    }
    life6_15 = 0;
    lexical_cycle_14: while (true) {
    lexical_join_66: {
    lexical_join_65: {
    lexical_join_61: {
    lexical_join_56: {
    lexical_join_53: {
    lexical_join_49: {
    lexical_join_29: {
    lexical_join_25: {
    if (!((life6_15 == 0))) {
        break lexical_join_68;
    }
    life7_20 = __call17_2(p0);
    if (!((life5_5 == null))) {
        break lexical_join_70;
    }
    spill17_0 = life7_20;
    if (!((life5_5 == null))) {
        lexicalValue17_61_0 = spill17_0;
        break lexical_join_61;
    }
    switch (spill17_0) {
case 0:
{
        break lexical_join_25;
    }
case 10:
{
        break lexical_join_29;
    }
default:
{
        break lexical_join_56;
    }
}
    }
    life6_15 = 1;
    if (!((life5_5 != null))) {
        break lexical_join_66;
    }
    }
    life8_41 = __cast17_5(__call17_4(p0, __call17_3(), p1));
    spill17_1 = __fieldRead17_6(receiver);
    if (!((life5_5 == null))) {
        lexicalValue17_53_0 = spill17_1;
        break lexical_join_53;
    }
    if (!((spill17_1 == null))) {
        break lexical_join_49;
    }
    __call17_7(receiver);
    __call17_9(__fieldRead17_8(receiver), life8_41);
    if (!((life5_5 != null))) {
        break lexical_join_66;
    }
    }
    lexicalValue17_53_0 = __call17_11(__fieldRead17_10(receiver), life8_41);
    }
    __discardScalar17_12(lexicalValue17_53_0);
    if (!((life5_5 != null))) {
        break lexical_join_66;
    }
    }
    lexicalValue17_61_0 = __integerCategory17_14(__call17_13(receiver, p0, p1, life7_20));
    }
    if (!((life5_5 == null))) {
        lexicalValue17_65_0 = lexicalValue17_61_0;
        break lexical_join_65;
    }
    if (!((lexicalValue17_61_0 == 0))) {
        break lexical_join_66;
    }
    lexicalValue17_65_0 = 1;
    }
    life6_15 = lexicalValue17_65_0;
    }
    if (!((life5_5 != null))) { continue lexical_cycle_14; }
    break lexical_cycle_14;
    }
    }
    __call17_15(receiver);
    }
    return receiver;
}
public static com.moon.ak h17_0(com.google.protobuf.InvalidProtocolBufferException p0) throws Throwable {
    throw __call3001700_0(p0);
}
public static com.moon.ak h17_1(com.google.protobuf.InvalidProtocolBufferException p0) throws Throwable {
    throw __call3001701_0(p0);
}
public static com.moon.ak h17_2(com.google.protobuf.InvalidProtocolBufferException p0) throws Throwable {
    throw __call3001702_0(p0);
}
public static com.moon.ak h17_3(com.google.protobuf.InvalidProtocolBufferException p0) throws Throwable {
    throw __call3001703_0(p0);
}
public static com.moon.ak h17_4(com.google.protobuf.InvalidProtocolBufferException p0) throws Throwable {
    throw __call3001704_0(p0);
}
public static com.moon.ak h17_5(com.google.protobuf.InvalidProtocolBufferException p0) throws Throwable {
    throw __call3001705_0(p0);
}
public static com.moon.ak h17_6(com.google.protobuf.InvalidProtocolBufferException p0) throws Throwable {
    throw __call3001706_0(p0);
}
public static com.moon.ak h17_7(com.google.protobuf.InvalidProtocolBufferException p0) throws Throwable {
    throw __call3001707_0(p0);
}
public static com.moon.ak h17_8(com.google.protobuf.InvalidProtocolBufferException p0, int p1) throws Throwable {
    com.google.protobuf.InvalidProtocolBufferException life1_2;
    life1_2 = p0;
    throw __call3001708_0(life1_2);
}
public static com.moon.ak h17_9(java.lang.Throwable p0, com.moon.ak p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __call3001709_0(p1);
    throw life2_2;
}
private static native long __fieldRead17_0() throws Throwable;
private static native java.lang.String[] __call17_1() throws Throwable;
private static native int __call17_2(com.google.protobuf.CodedInputStream a0) throws Throwable;
private static native com.google.protobuf.Parser __call17_3() throws Throwable;
private static native com.google.protobuf.MessageLite __call17_4(com.google.protobuf.CodedInputStream a0, com.google.protobuf.Parser a1, com.google.protobuf.ExtensionRegistryLite a2) throws Throwable;
private static native com.moon.ad __cast17_5(com.google.protobuf.MessageLite a0) throws Throwable;
private static native com.google.protobuf.RepeatedFieldBuilderV3 __fieldRead17_6(com.moon.ak a0) throws Throwable;
private static native void __call17_7(com.moon.ak a0) throws Throwable;
private static native java.util.List __fieldRead17_8(com.moon.ak a0) throws Throwable;
private static native boolean __call17_9(java.util.List a0, com.moon.ad a1) throws Throwable;
private static native com.google.protobuf.RepeatedFieldBuilderV3 __fieldRead17_10(com.moon.ak a0) throws Throwable;
private static native com.google.protobuf.RepeatedFieldBuilderV3 __call17_11(com.google.protobuf.RepeatedFieldBuilderV3 a0, com.moon.ad a1) throws Throwable;
private static native void __discardScalar17_12(com.google.protobuf.RepeatedFieldBuilderV3 a0) throws Throwable;
private static native boolean __call17_13(com.moon.ak a0, com.google.protobuf.CodedInputStream a1, com.google.protobuf.ExtensionRegistryLite a2, int a3) throws Throwable;
private static native int __integerCategory17_14(boolean value) throws Throwable;
private static native void __call17_15(com.moon.ak a0) throws Throwable;
private static native java.lang.Exception __call3001700_0(com.google.protobuf.InvalidProtocolBufferException a0) throws Throwable;
private static native java.lang.Exception __call3001701_0(com.google.protobuf.InvalidProtocolBufferException a0) throws Throwable;
private static native java.lang.Exception __call3001702_0(com.google.protobuf.InvalidProtocolBufferException a0) throws Throwable;
private static native java.lang.Exception __call3001703_0(com.google.protobuf.InvalidProtocolBufferException a0) throws Throwable;
private static native java.lang.Exception __call3001704_0(com.google.protobuf.InvalidProtocolBufferException a0) throws Throwable;
private static native java.lang.Exception __call3001705_0(com.google.protobuf.InvalidProtocolBufferException a0) throws Throwable;
private static native java.lang.Exception __call3001706_0(com.google.protobuf.InvalidProtocolBufferException a0) throws Throwable;
private static native java.lang.Exception __call3001707_0(com.google.protobuf.InvalidProtocolBufferException a0) throws Throwable;
private static native java.io.IOException __call3001708_0(com.google.protobuf.InvalidProtocolBufferException a0) throws Throwable;
private static native void __call3001709_0(com.moon.ak a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.ak __sourceHandlerCall_9c3e89684978956f4e61(com.moon.ak a0, com.google.protobuf.Message a1) throws E;
private static final class __SourceHandler_9c3e89684978956f4e61 {

public static com.moon.ak f408(com.moon.ak receiver, com.google.protobuf.Message p0) throws Throwable {
    long life2_3;
    java.lang.String[] life4_5;
    life2_3 = (__fieldRead408_0() ^ 91576646052479L);
    life4_5 = __call408_1();
    if ((life4_5 == null)) {
        if ((__instanceOf408_2(p0) != 0)) {
        return __call408_4(receiver, __cast408_3(p0));
    }
        __call408_5(receiver, p0);
    }
    return receiver;
}
public static void h408_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1040800_0(p0);
}
public static void h408_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call1040801_0(p0);
}
private static native long __fieldRead408_0() throws Throwable;
private static native java.lang.String[] __call408_1() throws Throwable;
private static native int __instanceOf408_2(com.google.protobuf.Message a0) throws Throwable;
private static native com.moon.I __cast408_3(com.google.protobuf.Message a0) throws Throwable;
private static native com.moon.ak __call408_4(com.moon.ak a0, com.moon.I a1) throws Throwable;
private static native com.google.protobuf.AbstractMessage.Builder __call408_5(com.moon.ak a0, com.google.protobuf.Message a1) throws Throwable;
private static native java.lang.Exception __call1040800_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1040801_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.ak __sourceHandlerCall_08e8fd819150da757df4(com.moon.ak a0, com.moon.I a1) throws E;
private static final class __SourceHandler_08e8fd819150da757df4 {

public static com.moon.ak f9(com.moon.ak receiver, com.moon.I p0) throws Throwable {
    int forestValue9_23_0;
    int forestValue9_49_0;
    int forestValue9_65_0;
    com.moon.ak forestValue9_92_0;
    com.moon.ak forestValue9_92_1;
    com.moon.ak forestValue9_94_0;
    com.moon.ak forestValue9_95_0;
    com.google.protobuf.RepeatedFieldBuilderV3 forestValue9_95_1;
    com.google.protobuf.RepeatedFieldBuilderV3 forestValue9_103_0;
    boolean spill9_0;
    boolean spill9_1;
    com.google.protobuf.RepeatedFieldBuilderV3 spill9_2;
    com.moon.ak spill9_3;
    com.moon.ak spill9_4;
    com.moon.ak spill9_5;
    long life2_3;
    java.lang.String[] life4_5;
    forest_join_104: {
    forest_join_103: {
    forest_join_98: {
    forest_join_95: {
    forest_join_94: {
    forest_join_92: {
    forest_join_65: {
    forest_join_54: {
    forest_join_50: {
    forest_join_49: {
    forest_join_42: {
    forest_join_23: {
    forest_join_11: {
    life2_3 = (__fieldRead9_0() ^ 35477097861360L);
    life4_5 = __call9_1();
    if (!((p0 == __call9_2()))) {
        break forest_join_11;
    }
    return receiver;
    }
    if (!((__fieldRead9_3(receiver) == null))) {
        break forest_join_54;
    }
    spill9_0 = __call9_5(__fieldRead9_4(p0));
    if (!((life4_5 == null))) {
        forestValue9_23_0 = __integerCategory9_6(spill9_0);
        break forest_join_23;
    }
    if (!((!spill9_0))) {
        break forest_join_104;
    }
    forestValue9_23_0 = __integerCategory9_9(__call9_8(__fieldRead9_7(receiver)));
    }
    if (!((life4_5 == null))) {
        forestValue9_49_0 = forestValue9_23_0;
        break forest_join_49;
    }
    if (!((forestValue9_23_0 != 0))) {
        break forest_join_42;
    }
    __fieldWrite9_11(receiver, __fieldRead9_10(p0));
    __fieldWrite9_14(receiver, (__fieldRead9_12(receiver) & __invokedynamic9_13(16975, (4718489845169821435L ^ life2_3))));
    if (!((life4_5 != null))) {
        break forest_join_50;
    }
    }
    __call9_15(receiver);
    forestValue9_49_0 = __integerCategory9_19(__call9_18(__fieldRead9_16(receiver), __fieldRead9_17(p0)));
    }
    __discardScalar9_20(forestValue9_49_0);
    }
    __call9_21(receiver);
    if (!((life4_5 != null))) {
        break forest_join_104;
    }
    }
    spill9_1 = __call9_23(__fieldRead9_22(p0));
    if (!((life4_5 == null))) {
        forestValue9_65_0 = __integerCategory9_24(spill9_1);
        break forest_join_65;
    }
    if (!((!spill9_1))) {
        break forest_join_104;
    }
    spill9_2 = __fieldRead9_25(receiver);
    if (!((life4_5 == null))) {
        forestValue9_103_0 = spill9_2;
        break forest_join_103;
    }
    forestValue9_65_0 = __integerCategory9_27(__call9_26(spill9_2));
    }
    if (!((forestValue9_65_0 != 0))) {
        break forest_join_98;
    }
    __call9_29(__fieldRead9_28(receiver));
    __fieldWrite9_30(receiver, null);
    __fieldWrite9_32(receiver, __fieldRead9_31(p0));
    spill9_3 = receiver;
    spill9_4 = receiver;
    if (!((life4_5 == null))) {
        forestValue9_92_0 = spill9_3;
        forestValue9_92_1 = spill9_4;
        break forest_join_92;
    }
    __fieldWrite9_35(spill9_3, (__fieldRead9_33(spill9_4) & __invokedynamic9_34(16975, (4718489845169821435L ^ life2_3))));
    spill9_5 = receiver;
    if (!(__call9_36())) {
        forestValue9_94_0 = spill9_5;
        break forest_join_94;
    }
    forestValue9_92_0 = spill9_5;
    forestValue9_92_1 = receiver;
    }
    forestValue9_95_0 = forestValue9_92_0;
    forestValue9_95_1 = __call9_37(forestValue9_92_1);
    break forest_join_95;
    }
    forestValue9_95_0 = forestValue9_94_0;
    forestValue9_95_1 = null;
    }
    __fieldWrite9_38(forestValue9_95_0, forestValue9_95_1);
    if (!((life4_5 != null))) {
        break forest_join_104;
    }
    }
    forestValue9_103_0 = __call9_41(__fieldRead9_39(receiver), __fieldRead9_40(p0));
    }
    __discardScalar9_42(forestValue9_103_0);
    }
    __call9_44(receiver, __call9_43(p0));
    __call9_45(receiver);
    return receiver;
}
public static com.moon.ak h9_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call3000900_0(p0);
}
public static com.moon.ak h9_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call3000901_0(p0);
}
public static com.moon.ak h9_2(java.lang.NullPointerException p0) throws Throwable {
    throw __call3000902_0(p0);
}
public static com.moon.ak h9_3(java.lang.NullPointerException p0) throws Throwable {
    throw __call3000903_0(p0);
}
public static com.moon.ak h9_4(java.lang.NullPointerException p0) throws Throwable {
    throw __call3000904_0(p0);
}
public static com.moon.ak h9_5(java.lang.NullPointerException p0) throws Throwable {
    throw __call3000905_0(p0);
}
public static com.moon.ak h9_6(java.lang.NullPointerException p0) throws Throwable {
    throw __call3000906_0(p0);
}
public static com.moon.ak h9_7(java.lang.NullPointerException p0) throws Throwable {
    throw __call3000907_0(p0);
}
public static com.moon.ak h9_8(java.lang.NullPointerException p0) throws Throwable {
    throw __call3000908_0(p0);
}
public static com.moon.ak h9_9(java.lang.NullPointerException p0) throws Throwable {
    throw __call3000909_0(p0);
}
public static com.moon.ak h9_10(java.lang.NullPointerException p0) throws Throwable {
    throw __call3000910_0(p0);
}
public static com.moon.ak h9_11(java.lang.NullPointerException p0) throws Throwable {
    throw __call3000911_0(p0);
}
public static com.moon.ak h9_12(java.lang.NullPointerException p0) throws Throwable {
    throw __call3000912_0(p0);
}
public static com.moon.ak h9_13(java.lang.NullPointerException p0) throws Throwable {
    throw __call3000913_0(p0);
}
public static com.moon.ak h9_14(java.lang.NullPointerException p0) throws Throwable {
    throw __call3000914_0(p0);
}
private static native long __fieldRead9_0() throws Throwable;
private static native java.lang.String[] __call9_1() throws Throwable;
private static native com.moon.I __call9_2() throws Throwable;
private static native com.google.protobuf.RepeatedFieldBuilderV3 __fieldRead9_3(com.moon.ak a0) throws Throwable;
private static native java.util.List __fieldRead9_4(com.moon.I a0) throws Throwable;
private static native boolean __call9_5(java.util.List a0) throws Throwable;
private static native int __integerCategory9_6(boolean value) throws Throwable;
private static native java.util.List __fieldRead9_7(com.moon.ak a0) throws Throwable;
private static native boolean __call9_8(java.util.List a0) throws Throwable;
private static native int __integerCategory9_9(boolean value) throws Throwable;
private static native java.util.List __fieldRead9_10(com.moon.I a0) throws Throwable;
private static native void __fieldWrite9_11(com.moon.ak a0, java.util.List a1) throws Throwable;
private static native int __fieldRead9_12(com.moon.ak a0) throws Throwable;
private static native int __invokedynamic9_13(int a0, long a1) throws Throwable;
private static native void __fieldWrite9_14(com.moon.ak a0, int a1) throws Throwable;
private static native void __call9_15(com.moon.ak a0) throws Throwable;
private static native java.util.List __fieldRead9_16(com.moon.ak a0) throws Throwable;
private static native java.util.List __fieldRead9_17(com.moon.I a0) throws Throwable;
private static native boolean __call9_18(java.util.List a0, java.util.List a1) throws Throwable;
private static native int __integerCategory9_19(boolean value) throws Throwable;
private static native void __discardScalar9_20(int a0) throws Throwable;
private static native void __call9_21(com.moon.ak a0) throws Throwable;
private static native java.util.List __fieldRead9_22(com.moon.I a0) throws Throwable;
private static native boolean __call9_23(java.util.List a0) throws Throwable;
private static native int __integerCategory9_24(boolean value) throws Throwable;
private static native com.google.protobuf.RepeatedFieldBuilderV3 __fieldRead9_25(com.moon.ak a0) throws Throwable;
private static native boolean __call9_26(com.google.protobuf.RepeatedFieldBuilderV3 a0) throws Throwable;
private static native int __integerCategory9_27(boolean value) throws Throwable;
private static native com.google.protobuf.RepeatedFieldBuilderV3 __fieldRead9_28(com.moon.ak a0) throws Throwable;
private static native void __call9_29(com.google.protobuf.RepeatedFieldBuilderV3 a0) throws Throwable;
private static native void __fieldWrite9_30(com.moon.ak a0, java.lang.Object a1) throws Throwable;
private static native java.util.List __fieldRead9_31(com.moon.I a0) throws Throwable;
private static native void __fieldWrite9_32(com.moon.ak a0, java.util.List a1) throws Throwable;
private static native int __fieldRead9_33(com.moon.ak a0) throws Throwable;
private static native int __invokedynamic9_34(int a0, long a1) throws Throwable;
private static native void __fieldWrite9_35(com.moon.ak a0, int a1) throws Throwable;
private static native boolean __call9_36() throws Throwable;
private static native com.google.protobuf.RepeatedFieldBuilderV3 __call9_37(com.moon.ak a0) throws Throwable;
private static native void __fieldWrite9_38(com.moon.ak a0, com.google.protobuf.RepeatedFieldBuilderV3 a1) throws Throwable;
private static native com.google.protobuf.RepeatedFieldBuilderV3 __fieldRead9_39(com.moon.ak a0) throws Throwable;
private static native java.util.List __fieldRead9_40(com.moon.I a0) throws Throwable;
private static native com.google.protobuf.RepeatedFieldBuilderV3 __call9_41(com.google.protobuf.RepeatedFieldBuilderV3 a0, java.util.List a1) throws Throwable;
private static native void __discardScalar9_42(com.google.protobuf.RepeatedFieldBuilderV3 a0) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call9_43(com.moon.I a0) throws Throwable;
private static native com.moon.ak __call9_44(com.moon.ak a0, com.google.protobuf.UnknownFieldSet a1) throws Throwable;
private static native void __call9_45(com.moon.ak a0) throws Throwable;
private static native java.lang.Exception __call3000900_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call3000901_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call3000902_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call3000903_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call3000904_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call3000905_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call3000906_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call3000907_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call3000908_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call3000909_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call3000910_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call3000911_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call3000912_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call3000913_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call3000914_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.ak __sourceHandlerCall_0327b7610c5e7d6d3042(com.moon.ak a0, com.moon.aF a1) throws E;
private static final class __SourceHandler_0327b7610c5e7d6d3042 {

public static com.moon.ak f16(com.moon.ak receiver, com.moon.aF p0) throws Throwable {
    com.google.protobuf.RepeatedFieldBuilderV3 forwardValue16_28_0;
    com.google.protobuf.RepeatedFieldBuilderV3 spill16_0;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_29: {
    forward_join_28: {
    forward_join_23: {
    life2_3 = (__fieldRead16_0() ^ 97572423592682L);
    life4_5 = __call16_1();
    spill16_0 = __fieldRead16_2(receiver);
    if (!((life4_5 == null))) {
        forwardValue16_28_0 = spill16_0;
        break forward_join_28;
    }
    if (!((spill16_0 == null))) {
        break forward_join_23;
    }
    __call16_3(receiver);
    __call16_6(__fieldRead16_4(receiver), __call16_5(p0));
    __call16_7(receiver);
    if (!((life4_5 != null))) {
        break forward_join_29;
    }
    }
    forwardValue16_28_0 = __call16_10(__fieldRead16_8(receiver), __call16_9(p0));
    }
    __discardScalar16_11(forwardValue16_28_0);
    }
    return receiver;
}
public static void h16_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1001600_0(p0);
}
public static void h16_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call1001601_0(p0);
}
public static void h16_2(java.lang.NullPointerException p0) throws Throwable {
    throw __call1001602_0(p0);
}
private static native long __fieldRead16_0() throws Throwable;
private static native java.lang.String[] __call16_1() throws Throwable;
private static native com.google.protobuf.RepeatedFieldBuilderV3 __fieldRead16_2(com.moon.ak a0) throws Throwable;
private static native void __call16_3(com.moon.ak a0) throws Throwable;
private static native java.util.List __fieldRead16_4(com.moon.ak a0) throws Throwable;
private static native com.moon.ad __call16_5(com.moon.aF a0) throws Throwable;
private static native boolean __call16_6(java.util.List a0, com.moon.ad a1) throws Throwable;
private static native void __call16_7(com.moon.ak a0) throws Throwable;
private static native com.google.protobuf.RepeatedFieldBuilderV3 __fieldRead16_8(com.moon.ak a0) throws Throwable;
private static native com.moon.ad __call16_9(com.moon.aF a0) throws Throwable;
private static native com.google.protobuf.RepeatedFieldBuilderV3 __call16_10(com.google.protobuf.RepeatedFieldBuilderV3 a0, com.moon.ad a1) throws Throwable;
private static native void __discardScalar16_11(com.google.protobuf.RepeatedFieldBuilderV3 a0) throws Throwable;
private static native java.lang.Exception __call1001600_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1001601_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1001602_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.ak __sourceHandlerCall_2f423fd88cb71a388596(com.moon.ak a0, com.moon.ad a1) throws E;
private static final class __SourceHandler_2f423fd88cb71a388596 {

public static com.moon.ak f17(com.moon.ak receiver, com.moon.ad p0) throws Throwable {
    com.google.protobuf.RepeatedFieldBuilderV3 forwardValue17_32_0;
    com.google.protobuf.RepeatedFieldBuilderV3 spill17_0;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_33: {
    forward_join_32: {
    forward_join_28: {
    forward_join_17: {
    life2_3 = (__fieldRead17_0() ^ 136215405060316L);
    life4_5 = __call17_1();
    spill17_0 = __fieldRead17_2(receiver);
    if (!((life4_5 == null))) {
        forwardValue17_32_0 = spill17_0;
        break forward_join_32;
    }
    if (!((spill17_0 == null))) {
        break forward_join_28;
    }
    if (!((p0 == null))) {
        break forward_join_17;
    }
    throw new java.lang.NullPointerException();
    }
    __call17_3(receiver);
    __call17_5(__fieldRead17_4(receiver), p0);
    __call17_6(receiver);
    if (!((life4_5 != null))) {
        break forward_join_33;
    }
    }
    forwardValue17_32_0 = __call17_8(__fieldRead17_7(receiver), p0);
    }
    __discardScalar17_9(forwardValue17_32_0);
    }
    return receiver;
}
public static void h17_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1001700_0(p0);
}
public static void h17_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call1001701_0(p0);
}
public static void h17_2(java.lang.NullPointerException p0) throws Throwable {
    throw __call1001702_0(p0);
}
public static void h17_3(java.lang.NullPointerException p0) throws Throwable {
    throw __call1001703_0(p0);
}
private static native long __fieldRead17_0() throws Throwable;
private static native java.lang.String[] __call17_1() throws Throwable;
private static native com.google.protobuf.RepeatedFieldBuilderV3 __fieldRead17_2(com.moon.ak a0) throws Throwable;
private static native void __call17_3(com.moon.ak a0) throws Throwable;
private static native java.util.List __fieldRead17_4(com.moon.ak a0) throws Throwable;
private static native boolean __call17_5(java.util.List a0, com.moon.ad a1) throws Throwable;
private static native void __call17_6(com.moon.ak a0) throws Throwable;
private static native com.google.protobuf.RepeatedFieldBuilderV3 __fieldRead17_7(com.moon.ak a0) throws Throwable;
private static native com.google.protobuf.RepeatedFieldBuilderV3 __call17_8(com.google.protobuf.RepeatedFieldBuilderV3 a0, com.moon.ad a1) throws Throwable;
private static native void __discardScalar17_9(com.google.protobuf.RepeatedFieldBuilderV3 a0) throws Throwable;
private static native java.lang.Exception __call1001700_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1001701_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1001702_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1001703_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.ak __sourceHandlerCall_eaacdb1d9b91a2a65764(com.moon.ak a0, java.lang.Iterable a1) throws E;
private static final class __SourceHandler_eaacdb1d9b91a2a65764 {

public static com.moon.ak f18(com.moon.ak receiver, java.lang.Iterable p0) throws Throwable {
    com.google.protobuf.RepeatedFieldBuilderV3 forwardValue18_25_0;
    com.google.protobuf.RepeatedFieldBuilderV3 spill18_0;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_26: {
    forward_join_25: {
    forward_join_21: {
    life2_3 = (__fieldRead18_0() ^ 39765389678577L);
    life4_5 = __call18_1();
    spill18_0 = __fieldRead18_2(receiver);
    if (!((life4_5 == null))) {
        forwardValue18_25_0 = spill18_0;
        break forward_join_25;
    }
    if (!((spill18_0 == null))) {
        break forward_join_21;
    }
    __call18_3(receiver);
    __call18_5(p0, __fieldRead18_4(receiver));
    __call18_6(receiver);
    if (!((life4_5 != null))) {
        break forward_join_26;
    }
    }
    forwardValue18_25_0 = __call18_8(__fieldRead18_7(receiver), p0);
    }
    __discardScalar18_9(forwardValue18_25_0);
    }
    return receiver;
}
public static void h18_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1001800_0(p0);
}
public static void h18_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call1001801_0(p0);
}
public static void h18_2(java.lang.NullPointerException p0) throws Throwable {
    throw __call1001802_0(p0);
}
private static native long __fieldRead18_0() throws Throwable;
private static native java.lang.String[] __call18_1() throws Throwable;
private static native com.google.protobuf.RepeatedFieldBuilderV3 __fieldRead18_2(com.moon.ak a0) throws Throwable;
private static native void __call18_3(com.moon.ak a0) throws Throwable;
private static native java.util.List __fieldRead18_4(com.moon.ak a0) throws Throwable;
private static native void __call18_5(java.lang.Iterable a0, java.util.List a1) throws Throwable;
private static native void __call18_6(com.moon.ak a0) throws Throwable;
private static native com.google.protobuf.RepeatedFieldBuilderV3 __fieldRead18_7(com.moon.ak a0) throws Throwable;
private static native com.google.protobuf.RepeatedFieldBuilderV3 __call18_8(com.google.protobuf.RepeatedFieldBuilderV3 a0, java.lang.Iterable a1) throws Throwable;
private static native void __discardScalar18_9(com.google.protobuf.RepeatedFieldBuilderV3 a0) throws Throwable;
private static native java.lang.Exception __call1001800_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1001801_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1001802_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> java.util.List __sourceHandlerCall_a61545c9077338cb7fb0(com.moon.ak a0) throws E;
private static final class __SourceHandler_a61545c9077338cb7fb0 {

public static java.util.List f327(com.moon.ak receiver) throws Throwable {
    com.google.protobuf.RepeatedFieldBuilderV3 forwardValue327_17_0;
    com.google.protobuf.RepeatedFieldBuilderV3 spill327_0;
    long life1_3;
    java.lang.String[] life3_5;
    forward_join_17: {
    forward_join_15: {
    life1_3 = (__fieldRead327_0() ^ 111095010138500L);
    life3_5 = __call327_1();
    spill327_0 = __fieldRead327_2(receiver);
    if (!((life3_5 == null))) {
        forwardValue327_17_0 = spill327_0;
        break forward_join_17;
    }
    if (!((spill327_0 == null))) {
        break forward_join_15;
    }
    return __call327_4(__fieldRead327_3(receiver));
    }
    forwardValue327_17_0 = __fieldRead327_5(receiver);
    }
    return __call327_6(forwardValue327_17_0);
}
public static void h327_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1032700_0(p0);
}
public static void h327_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call1032701_0(p0);
}
private static native long __fieldRead327_0() throws Throwable;
private static native java.lang.String[] __call327_1() throws Throwable;
private static native com.google.protobuf.RepeatedFieldBuilderV3 __fieldRead327_2(com.moon.ak a0) throws Throwable;
private static native java.util.List __fieldRead327_3(com.moon.ak a0) throws Throwable;
private static native java.util.List __call327_4(java.util.List a0) throws Throwable;
private static native com.google.protobuf.RepeatedFieldBuilderV3 __fieldRead327_5(com.moon.ak a0) throws Throwable;
private static native java.util.List __call327_6(com.google.protobuf.RepeatedFieldBuilderV3 a0) throws Throwable;
private static native java.lang.Exception __call1032700_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1032701_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> com.google.protobuf.RepeatedFieldBuilderV3 __sourceHandlerCall_5c264698b7d4276b81ae(com.moon.ak a0) throws E;
private static final class __SourceHandler_5c264698b7d4276b81ae {

public static com.google.protobuf.RepeatedFieldBuilderV3 f18(com.moon.ak receiver) throws Throwable {
    com.google.protobuf.RepeatedFieldBuilderV3 spill18_0;
    com.google.protobuf.RepeatedFieldBuilderV3 joinValue18_1_0;
    long life1_3;
    java.lang.String[] life3_5;
    life1_3 = (__fieldRead18_0() ^ 59867825495019L);
    life3_5 = __call18_1();
    spill18_0 = __fieldRead18_2(receiver);
    if ((life3_5 == null)) {
        if ((spill18_0 == null)) {
        __fieldWrite18_8(receiver, new com.google.protobuf.RepeatedFieldBuilderV3(__fieldRead18_3(receiver), __integerCategory18_7((((__fieldRead18_4(receiver) & 1) != 0) ? 1 : 0)), __call18_5(receiver), __call18_6(receiver)));
        __fieldWrite18_9(receiver, null);
    } else {
        
    }
        joinValue18_1_0 = __fieldRead18_10(receiver);
    } else {
        joinValue18_1_0 = spill18_0;
    }
    return joinValue18_1_0;
}
public static com.google.protobuf.RepeatedFieldBuilderV3 h18_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call3001800_0(p0);
}
public static com.google.protobuf.RepeatedFieldBuilderV3 h18_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call3001801_0(p0);
}
public static com.google.protobuf.RepeatedFieldBuilderV3 h18_2(java.lang.NullPointerException p0) throws Throwable {
    throw __call3001802_0(p0);
}
private static native long __fieldRead18_0() throws Throwable;
private static native java.lang.String[] __call18_1() throws Throwable;
private static native com.google.protobuf.RepeatedFieldBuilderV3 __fieldRead18_2(com.moon.ak a0) throws Throwable;
private static native java.util.List __fieldRead18_3(com.moon.ak a0) throws Throwable;
private static native int __fieldRead18_4(com.moon.ak a0) throws Throwable;
private static native com.google.protobuf.GeneratedMessageV3.BuilderParent __call18_5(com.moon.ak a0) throws Throwable;
private static native boolean __call18_6(com.moon.ak a0) throws Throwable;
private static native boolean __integerCategory18_7(int value) throws Throwable;
private static native void __fieldWrite18_8(com.moon.ak a0, com.google.protobuf.RepeatedFieldBuilderV3 a1) throws Throwable;
private static native void __fieldWrite18_9(com.moon.ak a0, java.lang.Object a1) throws Throwable;
private static native com.google.protobuf.RepeatedFieldBuilderV3 __fieldRead18_10(com.moon.ak a0) throws Throwable;
private static native java.lang.Exception __call3001800_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call3001801_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call3001802_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_e10548cfe169c2da98a9(com.moon.ak a0) throws E;
private static final class __SourceHandler_e10548cfe169c2da98a9 {

public static void f20(com.moon.ak receiver) throws Throwable {
    com.moon.ak forwardValue20_21_0;
    com.moon.ak spill20_0;
    long life1_3;
    java.lang.String[] life3_5;
    forward_join_26: {
    forward_join_21: {
    life1_3 = (__fieldRead20_0() ^ 59598049159295L);
    life3_5 = __call20_1();
    spill20_0 = receiver;
    if (!((life3_5 == null))) {
        forwardValue20_21_0 = spill20_0;
        break forward_join_21;
    }
    if (!(((__fieldRead20_2(spill20_0) & 1) == 0))) {
        break forward_join_26;
    }
    __fieldWrite20_4(receiver, new java.util.ArrayList(__fieldRead20_3(receiver)));
    forwardValue20_21_0 = receiver;
    }
    com.moon.ak __stackOp20_5_0 = forwardValue20_21_0;
    __fieldWrite20_7(__stackOp20_5_0, (__fieldRead20_6(__stackOp20_5_0) | 1));
    }
    return;
}
public static void h20_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1002000_0(p0);
}
public static void h20_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call1002001_0(p0);
}
private static native long __fieldRead20_0() throws Throwable;
private static native java.lang.String[] __call20_1() throws Throwable;
private static native int __fieldRead20_2(com.moon.ak a0) throws Throwable;
private static native java.util.List __fieldRead20_3(com.moon.ak a0) throws Throwable;
private static native void __fieldWrite20_4(com.moon.ak a0, java.util.ArrayList a1) throws Throwable;
private static native int __fieldRead20_6(com.moon.ak a0) throws Throwable;
private static native void __fieldWrite20_7(com.moon.ak a0, int a1) throws Throwable;
private static native java.lang.Exception __call1002000_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1002001_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.ad __sourceHandlerCall_16207d31e18304933b36(com.moon.ak a0, int a1) throws E;
private static final class __SourceHandler_16207d31e18304933b36 {

public static com.moon.ad f329(com.moon.ak receiver, int p0) throws Throwable {
    com.google.protobuf.RepeatedFieldBuilderV3 forwardValue329_19_0;
    com.google.protobuf.RepeatedFieldBuilderV3 spill329_0;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_19: {
    forward_join_17: {
    life2_3 = (__fieldRead329_0() ^ 85042156535349L);
    life4_5 = __call329_1();
    spill329_0 = __fieldRead329_2(receiver);
    if (!((life4_5 == null))) {
        forwardValue329_19_0 = spill329_0;
        break forward_join_19;
    }
    if (!((spill329_0 == null))) {
        break forward_join_17;
    }
    return __cast329_5(__call329_4(__fieldRead329_3(receiver), p0));
    }
    forwardValue329_19_0 = __fieldRead329_6(receiver);
    }
    return __cast329_8(__call329_7(forwardValue329_19_0, p0));
}
public static void h329_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1032900_0(p0);
}
public static void h329_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call1032901_0(p0);
}
private static native long __fieldRead329_0() throws Throwable;
private static native java.lang.String[] __call329_1() throws Throwable;
private static native com.google.protobuf.RepeatedFieldBuilderV3 __fieldRead329_2(com.moon.ak a0) throws Throwable;
private static native java.util.List __fieldRead329_3(com.moon.ak a0) throws Throwable;
private static native java.lang.Object __call329_4(java.util.List a0, int a1) throws Throwable;
private static native com.moon.ad __cast329_5(java.lang.Object a0) throws Throwable;
private static native com.google.protobuf.RepeatedFieldBuilderV3 __fieldRead329_6(com.moon.ak a0) throws Throwable;
private static native com.google.protobuf.AbstractMessage __call329_7(com.google.protobuf.RepeatedFieldBuilderV3 a0, int a1) throws Throwable;
private static native com.moon.ad __cast329_8(com.google.protobuf.AbstractMessage a0) throws Throwable;
private static native java.lang.Exception __call1032900_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1032901_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.ak __sourceHandlerCall_4ad9776491577d6f1f6b(com.moon.ak a0) throws E;
private static final class __SourceHandler_4ad9776491577d6f1f6b {

public static com.moon.ak f330(com.moon.ak receiver) throws Throwable {
    com.google.protobuf.RepeatedFieldBuilderV3 forwardValue330_24_0;
    java.lang.String[] spill330_0;
    com.google.protobuf.RepeatedFieldBuilderV3 spill330_1;
    long life1_3;
    java.lang.String[] life3_8;
    forward_join_25: {
    forward_join_24: {
    forward_join_19: {
    life1_3 = (__fieldRead330_0() ^ 43876236547658L);
    spill330_0 = __call330_1();
    __call330_2(receiver);
    life3_8 = spill330_0;
    spill330_1 = __fieldRead330_3(receiver);
    if (!((life3_8 == null))) {
        forwardValue330_24_0 = spill330_1;
        break forward_join_24;
    }
    if (!((spill330_1 == null))) {
        break forward_join_19;
    }
    __fieldWrite330_5(receiver, __call330_4());
    if (!((life3_8 != null))) {
        break forward_join_25;
    }
    }
    __fieldWrite330_6(receiver, null);
    forwardValue330_24_0 = __fieldRead330_7(receiver);
    }
    __call330_8(forwardValue330_24_0);
    }
    __fieldWrite330_11(receiver, (__fieldRead330_9(receiver) & __invokedynamic330_10(16975, (4718494915033305153L ^ life1_3))));
    return receiver;
}
public static void h330_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1033000_0(p0);
}
public static void h330_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call1033001_0(p0);
}
public static void h330_2(java.lang.NullPointerException p0) throws Throwable {
    throw __call1033002_0(p0);
}
private static native long __fieldRead330_0() throws Throwable;
private static native java.lang.String[] __call330_1() throws Throwable;
private static native com.google.protobuf.GeneratedMessageV3.Builder __call330_2(com.moon.ak a0) throws Throwable;
private static native com.google.protobuf.RepeatedFieldBuilderV3 __fieldRead330_3(com.moon.ak a0) throws Throwable;
private static native java.util.List __call330_4() throws Throwable;
private static native void __fieldWrite330_5(com.moon.ak a0, java.util.List a1) throws Throwable;
private static native void __fieldWrite330_6(com.moon.ak a0, java.lang.Object a1) throws Throwable;
private static native com.google.protobuf.RepeatedFieldBuilderV3 __fieldRead330_7(com.moon.ak a0) throws Throwable;
private static native void __call330_8(com.google.protobuf.RepeatedFieldBuilderV3 a0) throws Throwable;
private static native int __fieldRead330_9(com.moon.ak a0) throws Throwable;
private static native int __invokedynamic330_10(int a0, long a1) throws Throwable;
private static native void __fieldWrite330_11(com.moon.ak a0, int a1) throws Throwable;
private static native java.lang.Exception __call1033000_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1033001_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1033002_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.ak __sourceHandlerCall_1fb7b71f0e5586a283b2(com.moon.ak a0, int a1) throws E;
private static final class __SourceHandler_1fb7b71f0e5586a283b2 {

public static com.moon.ak f331(com.moon.ak receiver, int p0) throws Throwable {
    com.google.protobuf.RepeatedFieldBuilderV3 forwardValue331_24_0;
    com.google.protobuf.RepeatedFieldBuilderV3 spill331_0;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_26: {
    forward_join_24: {
    forward_join_22: {
    life2_3 = (__fieldRead331_0() ^ 78681949508070L);
    life4_5 = __call331_1();
    spill331_0 = __fieldRead331_2(receiver);
    if (!((life4_5 == null))) {
        forwardValue331_24_0 = spill331_0;
        break forward_join_24;
    }
    if (!((spill331_0 == null))) {
        break forward_join_22;
    }
    __call331_3(receiver);
    __call331_5(__fieldRead331_4(receiver), p0);
    __call331_6(receiver);
    if (!((life4_5 != null))) {
        break forward_join_26;
    }
    }
    forwardValue331_24_0 = __fieldRead331_7(receiver);
    }
    __call331_8(forwardValue331_24_0, p0);
    }
    return receiver;
}
public static void h331_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1033100_0(p0);
}
public static void h331_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call1033101_0(p0);
}
public static void h331_2(java.lang.NullPointerException p0) throws Throwable {
    throw __call1033102_0(p0);
}
private static native long __fieldRead331_0() throws Throwable;
private static native java.lang.String[] __call331_1() throws Throwable;
private static native com.google.protobuf.RepeatedFieldBuilderV3 __fieldRead331_2(com.moon.ak a0) throws Throwable;
private static native void __call331_3(com.moon.ak a0) throws Throwable;
private static native java.util.List __fieldRead331_4(com.moon.ak a0) throws Throwable;
private static native java.lang.Object __call331_5(java.util.List a0, int a1) throws Throwable;
private static native void __call331_6(com.moon.ak a0) throws Throwable;
private static native com.google.protobuf.RepeatedFieldBuilderV3 __fieldRead331_7(com.moon.ak a0) throws Throwable;
private static native void __call331_8(com.google.protobuf.RepeatedFieldBuilderV3 a0, int a1) throws Throwable;
private static native java.lang.Exception __call1033100_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1033101_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1033102_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.o2 __sourceHandlerCall_44a6248aa5cea8a68348(com.moon.ak a0, int a1) throws E;
private static final class __SourceHandler_44a6248aa5cea8a68348 {

public static com.moon.o2 f332(com.moon.ak receiver, int p0) throws Throwable {
    com.google.protobuf.RepeatedFieldBuilderV3 forwardValue332_19_0;
    com.google.protobuf.RepeatedFieldBuilderV3 spill332_0;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_19: {
    forward_join_17: {
    life2_3 = (__fieldRead332_0() ^ 52302879119689L);
    life4_5 = __call332_1();
    spill332_0 = __fieldRead332_2(receiver);
    if (!((life4_5 == null))) {
        forwardValue332_19_0 = spill332_0;
        break forward_join_19;
    }
    if (!((spill332_0 == null))) {
        break forward_join_17;
    }
    return __cast332_5(__call332_4(__fieldRead332_3(receiver), p0));
    }
    forwardValue332_19_0 = __fieldRead332_6(receiver);
    }
    return __cast332_8(__call332_7(forwardValue332_19_0, p0));
}
public static void h332_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1033200_0(p0);
}
public static void h332_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call1033201_0(p0);
}
private static native long __fieldRead332_0() throws Throwable;
private static native java.lang.String[] __call332_1() throws Throwable;
private static native com.google.protobuf.RepeatedFieldBuilderV3 __fieldRead332_2(com.moon.ak a0) throws Throwable;
private static native java.util.List __fieldRead332_3(com.moon.ak a0) throws Throwable;
private static native java.lang.Object __call332_4(java.util.List a0, int a1) throws Throwable;
private static native com.moon.o2 __cast332_5(java.lang.Object a0) throws Throwable;
private static native com.google.protobuf.RepeatedFieldBuilderV3 __fieldRead332_6(com.moon.ak a0) throws Throwable;
private static native com.google.protobuf.MessageOrBuilder __call332_7(com.google.protobuf.RepeatedFieldBuilderV3 a0, int a1) throws Throwable;
private static native com.moon.o2 __cast332_8(com.google.protobuf.MessageOrBuilder a0) throws Throwable;
private static native java.lang.Exception __call1033200_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1033201_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.I __sourceHandlerCall_9b8ed6e71bf0520e9806(com.moon.ak a0) throws E;
private static final class __SourceHandler_9b8ed6e71bf0520e9806 {

public static com.moon.I f333(com.moon.ak receiver) throws Throwable {
    com.moon.I forwardValue333_18_0;
    java.lang.String[] spill333_0;
    com.moon.I spill333_1;
    long life1_3;
    com.moon.I life4_7;
    java.lang.String[] life3_8;
    forward_join_18: {
    forward_join_17: {
    life1_3 = (__fieldRead333_0() ^ 117822066288748L);
    spill333_0 = __call333_1();
    life4_7 = __call333_2(receiver);
    life3_8 = spill333_0;
    spill333_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue333_18_0 = spill333_1;
        break forward_join_18;
    }
    if (!((!__call333_3(spill333_1)))) {
        break forward_join_17;
    }
    throw __call333_4(life4_7);
    }
    forwardValue333_18_0 = life4_7;
    }
    return forwardValue333_18_0;
}
public static void h333_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1033300_0(p0);
}
public static void h333_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call1033301_0(p0);
}
private static native long __fieldRead333_0() throws Throwable;
private static native java.lang.String[] __call333_1() throws Throwable;
private static native com.moon.I __call333_2(com.moon.ak a0) throws Throwable;
private static native boolean __call333_3(com.moon.I a0) throws Throwable;
private static native com.google.protobuf.UninitializedMessageException __call333_4(com.moon.I a0) throws Throwable;
private static native java.lang.Exception __call1033300_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1033301_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.ak __sourceHandlerCall_1568786a259072f30f36(com.moon.ak a0, int a1, com.moon.aF a2) throws E;
private static final class __SourceHandler_1568786a259072f30f36 {

public static com.moon.ak f21(com.moon.ak receiver, int p0, com.moon.aF p1) throws Throwable {
    com.google.protobuf.RepeatedFieldBuilderV3 forwardValue21_29_0;
    com.google.protobuf.RepeatedFieldBuilderV3 spill21_0;
    long life3_3;
    java.lang.String[] life5_5;
    forward_join_30: {
    forward_join_29: {
    forward_join_23: {
    life3_3 = (__fieldRead21_0() ^ 12326818510278L);
    life5_5 = __call21_1();
    spill21_0 = __fieldRead21_2(receiver);
    if (!((life5_5 == null))) {
        forwardValue21_29_0 = spill21_0;
        break forward_join_29;
    }
    if (!((spill21_0 == null))) {
        break forward_join_23;
    }
    __call21_3(receiver);
    __call21_6(__fieldRead21_4(receiver), p0, __call21_5(p1));
    __call21_7(receiver);
    if (!((life5_5 != null))) {
        break forward_join_30;
    }
    }
    forwardValue21_29_0 = __call21_10(__fieldRead21_8(receiver), p0, __call21_9(p1));
    }
    __discardScalar21_11(forwardValue21_29_0);
    }
    return receiver;
}
public static void h21_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1002100_0(p0);
}
public static void h21_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call1002101_0(p0);
}
public static void h21_2(java.lang.NullPointerException p0) throws Throwable {
    throw __call1002102_0(p0);
}
private static native long __fieldRead21_0() throws Throwable;
private static native java.lang.String[] __call21_1() throws Throwable;
private static native com.google.protobuf.RepeatedFieldBuilderV3 __fieldRead21_2(com.moon.ak a0) throws Throwable;
private static native void __call21_3(com.moon.ak a0) throws Throwable;
private static native java.util.List __fieldRead21_4(com.moon.ak a0) throws Throwable;
private static native com.moon.ad __call21_5(com.moon.aF a0) throws Throwable;
private static native void __call21_6(java.util.List a0, int a1, com.moon.ad a2) throws Throwable;
private static native void __call21_7(com.moon.ak a0) throws Throwable;
private static native com.google.protobuf.RepeatedFieldBuilderV3 __fieldRead21_8(com.moon.ak a0) throws Throwable;
private static native com.moon.ad __call21_9(com.moon.aF a0) throws Throwable;
private static native com.google.protobuf.RepeatedFieldBuilderV3 __call21_10(com.google.protobuf.RepeatedFieldBuilderV3 a0, int a1, com.moon.ad a2) throws Throwable;
private static native void __discardScalar21_11(com.google.protobuf.RepeatedFieldBuilderV3 a0) throws Throwable;
private static native java.lang.Exception __call1002100_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1002101_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1002102_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.ak __sourceHandlerCall_df05b9f50e2238b0ad30(com.moon.ak a0, int a1, com.moon.ad a2) throws E;
private static final class __SourceHandler_df05b9f50e2238b0ad30 {

public static com.moon.ak f22(com.moon.ak receiver, int p0, com.moon.ad p1) throws Throwable {
    com.google.protobuf.RepeatedFieldBuilderV3 forwardValue22_33_0;
    com.google.protobuf.RepeatedFieldBuilderV3 spill22_0;
    long life3_3;
    java.lang.String[] life5_5;
    forward_join_34: {
    forward_join_33: {
    forward_join_28: {
    forward_join_17: {
    life3_3 = (__fieldRead22_0() ^ 91831658038906L);
    life5_5 = __call22_1();
    spill22_0 = __fieldRead22_2(receiver);
    if (!((life5_5 == null))) {
        forwardValue22_33_0 = spill22_0;
        break forward_join_33;
    }
    if (!((spill22_0 == null))) {
        break forward_join_28;
    }
    if (!((p1 == null))) {
        break forward_join_17;
    }
    throw new java.lang.NullPointerException();
    }
    __call22_3(receiver);
    __call22_5(__fieldRead22_4(receiver), p0, p1);
    __call22_6(receiver);
    if (!((life5_5 != null))) {
        break forward_join_34;
    }
    }
    forwardValue22_33_0 = __call22_8(__fieldRead22_7(receiver), p0, p1);
    }
    __discardScalar22_9(forwardValue22_33_0);
    }
    return receiver;
}
public static void h22_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1002200_0(p0);
}
public static void h22_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call1002201_0(p0);
}
public static void h22_2(java.lang.NullPointerException p0) throws Throwable {
    throw __call1002202_0(p0);
}
public static void h22_3(java.lang.NullPointerException p0) throws Throwable {
    throw __call1002203_0(p0);
}
private static native long __fieldRead22_0() throws Throwable;
private static native java.lang.String[] __call22_1() throws Throwable;
private static native com.google.protobuf.RepeatedFieldBuilderV3 __fieldRead22_2(com.moon.ak a0) throws Throwable;
private static native void __call22_3(com.moon.ak a0) throws Throwable;
private static native java.util.List __fieldRead22_4(com.moon.ak a0) throws Throwable;
private static native void __call22_5(java.util.List a0, int a1, com.moon.ad a2) throws Throwable;
private static native void __call22_6(com.moon.ak a0) throws Throwable;
private static native com.google.protobuf.RepeatedFieldBuilderV3 __fieldRead22_7(com.moon.ak a0) throws Throwable;
private static native com.google.protobuf.RepeatedFieldBuilderV3 __call22_8(com.google.protobuf.RepeatedFieldBuilderV3 a0, int a1, com.moon.ad a2) throws Throwable;
private static native void __discardScalar22_9(com.google.protobuf.RepeatedFieldBuilderV3 a0) throws Throwable;
private static native java.lang.Exception __call1002200_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1002201_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1002202_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1002203_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> java.util.List __sourceHandlerCall_8d742b0cbedec9188e42(com.moon.ak a0) throws E;
private static final class __SourceHandler_8d742b0cbedec9188e42 {

public static java.util.List f336(com.moon.ak receiver) throws Throwable {
    com.moon.ak forwardValue336_16_0;
    com.moon.ak spill336_0;
    long life1_3;
    java.lang.String[] life3_5;
    forward_join_16: {
    forward_join_15: {
    life1_3 = (__fieldRead336_0() ^ 6949189892046L);
    life3_5 = __call336_1();
    spill336_0 = receiver;
    if (!((life3_5 == null))) {
        forwardValue336_16_0 = spill336_0;
        break forward_join_16;
    }
    if (!((__fieldRead336_2(spill336_0) != null))) {
        break forward_join_15;
    }
    return __call336_4(__fieldRead336_3(receiver));
    }
    forwardValue336_16_0 = receiver;
    }
    return __call336_6(__fieldRead336_5(forwardValue336_16_0));
}
public static void h336_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1033600_0(p0);
}
public static void h336_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call1033601_0(p0);
}
private static native long __fieldRead336_0() throws Throwable;
private static native java.lang.String[] __call336_1() throws Throwable;
private static native com.google.protobuf.RepeatedFieldBuilderV3 __fieldRead336_2(com.moon.ak a0) throws Throwable;
private static native com.google.protobuf.RepeatedFieldBuilderV3 __fieldRead336_3(com.moon.ak a0) throws Throwable;
private static native java.util.List __call336_4(com.google.protobuf.RepeatedFieldBuilderV3 a0) throws Throwable;
private static native java.util.List __fieldRead336_5(com.moon.ak a0) throws Throwable;
private static native java.util.List __call336_6(java.util.List a0) throws Throwable;
private static native java.lang.Exception __call1033600_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1033601_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.I __sourceHandlerCall_3949211ed42cbee31d85(com.moon.ak a0) throws E;
private static final class __SourceHandler_3949211ed42cbee31d85 {

public static com.moon.I f337(com.moon.ak receiver) throws Throwable {
    com.moon.ak forwardValue337_20_0;
    com.moon.ak forwardValue337_32_0;
    java.lang.String[] spill337_0;
    com.moon.ak spill337_1;
    long life1_3;
    com.moon.I life4_9;
    java.lang.String[] life3_10;
    int life5_13;
    forward_join_52: {
    forward_join_47: {
    forward_join_41: {
    forward_join_32: {
    forward_join_20: {
    life1_3 = (__fieldRead337_0() ^ 113565897106568L);
    spill337_0 = __call337_1();
    life4_9 = new com.moon.I(receiver);
    life3_10 = spill337_0;
    life5_13 = __fieldRead337_2(receiver);
    spill337_1 = receiver;
    if (!((life3_10 == null))) {
        forwardValue337_20_0 = spill337_1;
        break forward_join_20;
    }
    if (!((__fieldRead337_3(spill337_1) == null))) {
        break forward_join_47;
    }
    forwardValue337_20_0 = receiver;
    }
    if (!((life3_10 == null))) {
        forwardValue337_32_0 = forwardValue337_20_0;
        break forward_join_32;
    }
    if (!(((__fieldRead337_4(forwardValue337_20_0) & 1) != 0))) {
        break forward_join_41;
    }
    __fieldWrite337_7(receiver, __call337_6(__fieldRead337_5(receiver)));
    forwardValue337_32_0 = receiver;
    }
    __fieldWrite337_10(forwardValue337_32_0, (__fieldRead337_8(receiver) & __invokedynamic337_9(16975, (4718425018122822275L ^ life1_3))));
    }
    __fieldWrite337_12(life4_9, __fieldRead337_11(receiver));
    if (!((life3_10 != null))) {
        break forward_join_52;
    }
    }
    __fieldWrite337_15(life4_9, __call337_14(__fieldRead337_13(receiver)));
    }
    __call337_16(receiver);
    return life4_9;
}
public static void h337_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1033700_0(p0);
}
public static void h337_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call1033701_0(p0);
}
public static void h337_2(java.lang.NullPointerException p0) throws Throwable {
    throw __call1033702_0(p0);
}
public static void h337_3(java.lang.NullPointerException p0) throws Throwable {
    throw __call1033703_0(p0);
}
public static void h337_4(java.lang.NullPointerException p0) throws Throwable {
    throw __call1033704_0(p0);
}
private static native long __fieldRead337_0() throws Throwable;
private static native java.lang.String[] __call337_1() throws Throwable;
private static native int __fieldRead337_2(com.moon.ak a0) throws Throwable;
private static native com.google.protobuf.RepeatedFieldBuilderV3 __fieldRead337_3(com.moon.ak a0) throws Throwable;
private static native int __fieldRead337_4(com.moon.ak a0) throws Throwable;
private static native java.util.List __fieldRead337_5(com.moon.ak a0) throws Throwable;
private static native java.util.List __call337_6(java.util.List a0) throws Throwable;
private static native void __fieldWrite337_7(com.moon.ak a0, java.util.List a1) throws Throwable;
private static native int __fieldRead337_8(com.moon.ak a0) throws Throwable;
private static native int __invokedynamic337_9(int a0, long a1) throws Throwable;
private static native void __fieldWrite337_10(com.moon.ak a0, int a1) throws Throwable;
private static native java.util.List __fieldRead337_11(com.moon.ak a0) throws Throwable;
private static native void __fieldWrite337_12(com.moon.I a0, java.util.List a1) throws Throwable;
private static native com.google.protobuf.RepeatedFieldBuilderV3 __fieldRead337_13(com.moon.ak a0) throws Throwable;
private static native java.util.List __call337_14(com.google.protobuf.RepeatedFieldBuilderV3 a0) throws Throwable;
private static native void __fieldWrite337_15(com.moon.I a0, java.util.List a1) throws Throwable;
private static native void __call337_16(com.moon.ak a0) throws Throwable;
private static native java.lang.Exception __call1033700_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1033701_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1033702_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1033703_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1033704_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.ak __sourceHandlerCall_a0a8ad4aa5b5a73ca87d(com.moon.ak a0) throws E;
private static final class __SourceHandler_a0a8ad4aa5b5a73ca87d {

public static com.moon.ak f338(com.moon.ak receiver) throws Throwable {
    com.google.protobuf.RepeatedFieldBuilderV3 forwardValue338_30_0;
    com.google.protobuf.RepeatedFieldBuilderV3 spill338_0;
    long life1_3;
    java.lang.String[] life3_5;
    forward_join_31: {
    forward_join_30: {
    forward_join_28: {
    life1_3 = (__fieldRead338_0() ^ 49348920526272L);
    life3_5 = __call338_1();
    spill338_0 = __fieldRead338_2(receiver);
    if (!((life3_5 == null))) {
        forwardValue338_30_0 = spill338_0;
        break forward_join_30;
    }
    if (!((spill338_0 == null))) {
        break forward_join_28;
    }
    __fieldWrite338_4(receiver, __call338_3());
    __fieldWrite338_7(receiver, (__fieldRead338_5(receiver) & __invokedynamic338_6(26707, (8422962393755757014L ^ life1_3))));
    __call338_8(receiver);
    if (!((life3_5 != null))) {
        break forward_join_31;
    }
    }
    forwardValue338_30_0 = __fieldRead338_9(receiver);
    }
    __call338_10(forwardValue338_30_0);
    }
    return receiver;
}
public static void h338_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1033800_0(p0);
}
public static void h338_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call1033801_0(p0);
}
public static void h338_2(java.lang.NullPointerException p0) throws Throwable {
    throw __call1033802_0(p0);
}
private static native long __fieldRead338_0() throws Throwable;
private static native java.lang.String[] __call338_1() throws Throwable;
private static native com.google.protobuf.RepeatedFieldBuilderV3 __fieldRead338_2(com.moon.ak a0) throws Throwable;
private static native java.util.List __call338_3() throws Throwable;
private static native void __fieldWrite338_4(com.moon.ak a0, java.util.List a1) throws Throwable;
private static native int __fieldRead338_5(com.moon.ak a0) throws Throwable;
private static native int __invokedynamic338_6(int a0, long a1) throws Throwable;
private static native void __fieldWrite338_7(com.moon.ak a0, int a1) throws Throwable;
private static native void __call338_8(com.moon.ak a0) throws Throwable;
private static native com.google.protobuf.RepeatedFieldBuilderV3 __fieldRead338_9(com.moon.ak a0) throws Throwable;
private static native void __call338_10(com.google.protobuf.RepeatedFieldBuilderV3 a0) throws Throwable;
private static native java.lang.Exception __call1033800_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1033801_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1033802_0(java.lang.NullPointerException a0) throws Throwable;

}


public final com.moon.ak b(com.google.protobuf.UnknownFieldSet p0) {
return ((com.moon.ak)(super.mergeUnknownFields(((com.google.protobuf.UnknownFieldSet)(p0)))));
}


public java.util.List<? extends com.moon.o2> b__List() { return __sourceHandlerCall_8d742b0cbedec9188e42(this); }


public com.moon.ak b(int p0, com.moon.ad p1) { return __sourceHandlerCall_df05b9f50e2238b0ad30(this, p0, p1); }


public com.moon.ak b(int p0, com.moon.aF p1) { return __sourceHandlerCall_1568786a259072f30f36(this, p0, p1); }


public com.moon.aF b(int p0) {
return ((com.moon.aF)(((com.google.protobuf.RepeatedFieldBuilderV3)(((com.moon.ak)(this)).a__RepeatedFieldBuilderV3())).addBuilder(((int)(p0)), ((com.google.protobuf.AbstractMessage)(com.moon.ad.a__ad())))));
}


public com.moon.ak b__ak() {
return ((com.moon.ak)(super.clone()));
}


public com.moon.I b() { return __sourceHandlerCall_9b8ed6e71bf0520e9806(this); }


public com.moon.ak b(com.google.protobuf.Descriptors.FieldDescriptor p0, java.lang.Object p1) {
return ((com.moon.ak)(super.addRepeatedField(((com.google.protobuf.Descriptors.FieldDescriptor)(p0)), ((java.lang.Object)(p1)))));
}


public java.util.List<com.moon.aF> c__List() {
return ((com.google.protobuf.RepeatedFieldBuilderV3)(((com.moon.ak)(this)).a__RepeatedFieldBuilderV3())).getBuilderList();
}


public com.moon.I c() { return __sourceHandlerCall_3949211ed42cbee31d85(this); }


public com.moon.ak c__ak() { return __sourceHandlerCall_a0a8ad4aa5b5a73ca87d(this); }


public com.moon.aF a(int p0) {
return ((com.moon.aF)(((com.google.protobuf.RepeatedFieldBuilderV3)(((com.moon.ak)(this)).a__RepeatedFieldBuilderV3())).getBuilder(((int)(p0)))));
}


public com.moon.aF a__aF() {
return ((com.moon.aF)(((com.google.protobuf.RepeatedFieldBuilderV3)(((com.moon.ak)(this)).a__RepeatedFieldBuilderV3())).addBuilder(((com.google.protobuf.AbstractMessage)(com.moon.ad.a__ad())))));
}


public com.moon.o2 a__o2(int p0) { return __sourceHandlerCall_44a6248aa5cea8a68348(this, p0); }


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 25289;
      if (f[var3] == null) {
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
         long var5 = e[var3];
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
         Object[] var9 = (Object[])g.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               g.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/ak", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f[var3] = var15;
      }

      return f[var3];
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_4cdb6ef4b8cd30(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral477_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/ak"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public final com.moon.ak a(com.google.protobuf.UnknownFieldSet p0) {
return ((com.moon.ak)(super.setUnknownFields(((com.google.protobuf.UnknownFieldSet)(p0)))));
}


private com.google.protobuf.RepeatedFieldBuilderV3<com.moon.ad, com.moon.aF, com.moon.o2> a__RepeatedFieldBuilderV3() { return __sourceHandlerCall_5c264698b7d4276b81ae(this); }


private void a__Void() { __sourceHandlerCall_e10548cfe169c2da98a9(this); }


public com.moon.ak a(com.google.protobuf.Descriptors.FieldDescriptor p0, java.lang.Object p1) {
return ((com.moon.ak)(super.setField(((com.google.protobuf.Descriptors.FieldDescriptor)(p0)), ((java.lang.Object)(p1)))));
}


public com.moon.ak a(com.google.protobuf.Message p0) { return __sourceHandlerCall_9c3e89684978956f4e61(this, p0); }


public com.moon.I a__I() {
return com.moon.I.a__I();
}


public com.moon.ak a__ak() { return __sourceHandlerCall_4ad9776491577d6f1f6b(this); }


public com.moon.ak a(com.moon.I p0) { return __sourceHandlerCall_08e8fd819150da757df4(this, p0); }


public com.moon.ak a(com.google.protobuf.Descriptors.FieldDescriptor p0, int p1, java.lang.Object p2) {
return ((com.moon.ak)(super.setRepeatedField(((com.google.protobuf.Descriptors.FieldDescriptor)(p0)), ((int)(p1)), ((java.lang.Object)(p2)))));
}


public com.moon.ak a(com.google.protobuf.Descriptors.OneofDescriptor p0) {
return ((com.moon.ak)(super.clearOneof(((com.google.protobuf.Descriptors.OneofDescriptor)(p0)))));
}


public com.moon.ak a(com.google.protobuf.Descriptors.FieldDescriptor p0) {
return ((com.moon.ak)(super.clearField(((com.google.protobuf.Descriptors.FieldDescriptor)(p0)))));
}


public com.moon.ak a(com.google.protobuf.CodedInputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException { return __sourceHandlerCall_42bda1ce31c4de2c0023(this, p0, p1); }


public com.moon.ak a(int p0, com.moon.ad p1) { return __sourceHandlerCall_05d57a420dcab9b824f7(this, p0, p1); }


public com.moon.ak a(int p0, com.moon.aF p1) { return __sourceHandlerCall_41330489448060d8b7c2(this, p0, p1); }


public com.moon.ak a(com.moon.ad p0) { return __sourceHandlerCall_2f423fd88cb71a388596(this, p0); }


public com.moon.ak a(com.moon.aF p0) { return __sourceHandlerCall_0327b7610c5e7d6d3042(this, p0); }


public com.moon.ak a(java.lang.Iterable<? extends com.moon.ad> p0) { return __sourceHandlerCall_eaacdb1d9b91a2a65764(this, p0); }


public com.moon.ak a__ak(int p0) { return __sourceHandlerCall_1fb7b71f0e5586a283b2(this, p0); }


public static final com.google.protobuf.Descriptors.Descriptor a__DescriptorsInnerDescriptor() {
return com.moon.o1.e;
}


public java.util.List<com.moon.ad> a__List() { return __sourceHandlerCall_a61545c9077338cb7fb0(this); }


public int a() { return __sourceHandlerCall_66cf956cc2bc07bbb3b5(this); }


public com.moon.ad a__ad(int p0) { return __sourceHandlerCall_16207d31e18304933b36(this, p0); }


public final boolean isInitialized() {
return ((1) != 0);
}


protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
return ((com.google.protobuf.GeneratedMessageV3.FieldAccessorTable)(com.moon.o1.f)).ensureFieldAccessorsInitialized(((java.lang.Class)(com.moon.I.class)), ((java.lang.Class)(com.moon.ak.class)));
}


public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
return com.moon.o1.e;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral477_0() throws E;

private static native int __sourceExactCall_4cdb6ef4b8cd30(int p0, long p1);

public com.google.protobuf.Message.Builder clone__MessageInnerBuilder__sourceBridge_23266bf05e() {
return ((com.moon.ak)(this)).b__ak();
}

public java.lang.Object clone__Object__sourceBridge_0502b11602() throws java.lang.CloneNotSupportedException {
return ((com.moon.ak)(this)).b__ak();
}

public com.google.protobuf.MessageLite.Builder clone__MessageLiteInnerBuilder__sourceBridge_9503009a6c() {
return ((com.moon.ak)(this)).b__ak();
}

public com.google.protobuf.AbstractMessageLite.Builder clone__AbstractMessageLiteInnerBuilder__sourceBridge_4fc5aa391f() {
return ((com.moon.ak)(this)).b__ak();
}

public com.google.protobuf.AbstractMessage.Builder clone__sourceBridge_36d0769a6a() {
return ((com.moon.ak)(this)).b__ak();
}

public com.moon.ak clone() { return ((com.moon.ak)(this.clone__sourceBridge_36d0769a6a())); }
public com.google.protobuf.GeneratedMessageV3.Builder clone__GeneratedMessageV3InnerBuilder__sourceBridge_2dd0ad8dc0() {
return ((com.moon.ak)(this)).b__ak();
}

public com.google.protobuf.GeneratedMessageV3.Builder clear__GeneratedMessageV3InnerBuilder__sourceBridge_2dd0ad8dc0() {
return ((com.moon.ak)(this)).a__ak();
}

public com.google.protobuf.AbstractMessage.Builder clear__sourceBridge_36d0769a6a() {
return ((com.moon.ak)(this)).a__ak();
}

public com.moon.ak clear() { return ((com.moon.ak)(this.clear__sourceBridge_36d0769a6a())); }
public com.google.protobuf.Message.Builder clear__MessageInnerBuilder__sourceBridge_23266bf05e() {
return ((com.moon.ak)(this)).a__ak();
}

public com.google.protobuf.MessageLite.Builder clear__MessageLiteInnerBuilder__sourceBridge_9503009a6c() {
return ((com.moon.ak)(this)).a__ak();
}

public com.google.protobuf.Message build__sourceBridge_561eee1e9a() {
return ((com.moon.ak)(this)).b();
}

public com.google.protobuf.Message build() { return ((com.google.protobuf.Message)(this.build__sourceBridge_561eee1e9a())); }
public com.google.protobuf.MessageLite build__MessageLite__sourceBridge_99b74750a2() {
return ((com.moon.ak)(this)).b();
}

public com.google.protobuf.Message.Builder clearField__MessageInnerBuilder__sourceBridge_23e4b7b587(com.google.protobuf.Descriptors.FieldDescriptor p0) {
return ((com.moon.ak)(this)).a(((com.google.protobuf.Descriptors.FieldDescriptor)(p0)));
}

public com.google.protobuf.GeneratedMessageV3.Builder clearField__sourceBridge_e3938d6ecd(com.google.protobuf.Descriptors.FieldDescriptor p0) {
return ((com.moon.ak)(this)).a(((com.google.protobuf.Descriptors.FieldDescriptor)(p0)));
}

public com.moon.ak clearField(com.google.protobuf.Descriptors.FieldDescriptor __bridgeParam0) { return ((com.moon.ak)(this.clearField__sourceBridge_e3938d6ecd(((com.google.protobuf.Descriptors.FieldDescriptor)(__bridgeParam0))))); }
public com.google.protobuf.GeneratedMessageV3.Builder setRepeatedField__sourceBridge_6dda4cebb2(com.google.protobuf.Descriptors.FieldDescriptor p0, int p1, java.lang.Object p2) {
return ((com.moon.ak)(this)).a(((com.google.protobuf.Descriptors.FieldDescriptor)(p0)), ((int)(p1)), ((java.lang.Object)(p2)));
}

public com.moon.ak setRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor __bridgeParam0, int __bridgeParam1, java.lang.Object __bridgeParam2) { return ((com.moon.ak)(this.setRepeatedField__sourceBridge_6dda4cebb2(((com.google.protobuf.Descriptors.FieldDescriptor)(__bridgeParam0)), ((int)(__bridgeParam1)), ((java.lang.Object)(__bridgeParam2))))); }
public com.google.protobuf.Message.Builder setRepeatedField__MessageInnerBuilder__sourceBridge_9e9db7eb5f(com.google.protobuf.Descriptors.FieldDescriptor p0, int p1, java.lang.Object p2) {
return ((com.moon.ak)(this)).a(((com.google.protobuf.Descriptors.FieldDescriptor)(p0)), ((int)(p1)), ((java.lang.Object)(p2)));
}

public com.google.protobuf.Message.Builder setUnknownFields__MessageInnerBuilder__sourceBridge_0115284766(com.google.protobuf.UnknownFieldSet p0) {
return ((com.moon.ak)(this)).a(((com.google.protobuf.UnknownFieldSet)(p0)));
}

public com.google.protobuf.GeneratedMessageV3.Builder setUnknownFields__sourceBridge_c1a02174d9(com.google.protobuf.UnknownFieldSet p0) {
return ((com.moon.ak)(this)).a(((com.google.protobuf.UnknownFieldSet)(p0)));
}

public com.moon.ak setUnknownFields(com.google.protobuf.UnknownFieldSet __bridgeParam0) { return ((com.moon.ak)(this.setUnknownFields__sourceBridge_c1a02174d9(((com.google.protobuf.UnknownFieldSet)(__bridgeParam0))))); }
public com.google.protobuf.GeneratedMessageV3.Builder mergeUnknownFields__GeneratedMessageV3InnerBuilder__sourceBridge_c1a02174d9(com.google.protobuf.UnknownFieldSet p0) {
return ((com.moon.ak)(this)).b(((com.google.protobuf.UnknownFieldSet)(p0)));
}

public com.google.protobuf.AbstractMessage.Builder mergeUnknownFields__sourceBridge_1d37e78876(com.google.protobuf.UnknownFieldSet p0) {
return ((com.moon.ak)(this)).b(((com.google.protobuf.UnknownFieldSet)(p0)));
}

public com.moon.ak mergeUnknownFields(com.google.protobuf.UnknownFieldSet __bridgeParam0) { return ((com.moon.ak)(this.mergeUnknownFields__sourceBridge_1d37e78876(((com.google.protobuf.UnknownFieldSet)(__bridgeParam0))))); }
public com.google.protobuf.Message.Builder mergeUnknownFields__MessageInnerBuilder__sourceBridge_0115284766(com.google.protobuf.UnknownFieldSet p0) {
return ((com.moon.ak)(this)).b(((com.google.protobuf.UnknownFieldSet)(p0)));
}

public com.google.protobuf.MessageLite buildPartial__MessageLite__sourceBridge_99b74750a2() {
return ((com.moon.ak)(this)).c();
}

public com.google.protobuf.Message buildPartial__sourceBridge_561eee1e9a() {
return ((com.moon.ak)(this)).c();
}

public com.google.protobuf.Message buildPartial() { return ((com.google.protobuf.Message)(this.buildPartial__sourceBridge_561eee1e9a())); }
public com.google.protobuf.GeneratedMessageV3.Builder clearOneof__GeneratedMessageV3InnerBuilder__sourceBridge_cca806b01c(com.google.protobuf.Descriptors.OneofDescriptor p0) {
return ((com.moon.ak)(this)).a(((com.google.protobuf.Descriptors.OneofDescriptor)(p0)));
}

public com.google.protobuf.Message.Builder clearOneof__MessageInnerBuilder__sourceBridge_ea7c504747(com.google.protobuf.Descriptors.OneofDescriptor p0) {
return ((com.moon.ak)(this)).a(((com.google.protobuf.Descriptors.OneofDescriptor)(p0)));
}

public com.google.protobuf.AbstractMessage.Builder clearOneof__sourceBridge_5f25fbcda8(com.google.protobuf.Descriptors.OneofDescriptor p0) {
return ((com.moon.ak)(this)).a(((com.google.protobuf.Descriptors.OneofDescriptor)(p0)));
}

public com.moon.ak clearOneof(com.google.protobuf.Descriptors.OneofDescriptor __bridgeParam0) { return ((com.moon.ak)(this.clearOneof__sourceBridge_5f25fbcda8(((com.google.protobuf.Descriptors.OneofDescriptor)(__bridgeParam0))))); }
public com.google.protobuf.Message.Builder setField__MessageInnerBuilder__sourceBridge_d5d25498d5(com.google.protobuf.Descriptors.FieldDescriptor p0, java.lang.Object p1) {
return ((com.moon.ak)(this)).a(((com.google.protobuf.Descriptors.FieldDescriptor)(p0)), ((java.lang.Object)(p1)));
}

public com.google.protobuf.GeneratedMessageV3.Builder setField__sourceBridge_0269b32b8b(com.google.protobuf.Descriptors.FieldDescriptor p0, java.lang.Object p1) {
return ((com.moon.ak)(this)).a(((com.google.protobuf.Descriptors.FieldDescriptor)(p0)), ((java.lang.Object)(p1)));
}

public com.moon.ak setField(com.google.protobuf.Descriptors.FieldDescriptor __bridgeParam0, java.lang.Object __bridgeParam1) { return ((com.moon.ak)(this.setField__sourceBridge_0269b32b8b(((com.google.protobuf.Descriptors.FieldDescriptor)(__bridgeParam0)), ((java.lang.Object)(__bridgeParam1))))); }
public com.google.protobuf.GeneratedMessageV3.Builder addRepeatedField__sourceBridge_0269b32b8b(com.google.protobuf.Descriptors.FieldDescriptor p0, java.lang.Object p1) {
return ((com.moon.ak)(this)).b(((com.google.protobuf.Descriptors.FieldDescriptor)(p0)), ((java.lang.Object)(p1)));
}

public com.moon.ak addRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor __bridgeParam0, java.lang.Object __bridgeParam1) { return ((com.moon.ak)(this.addRepeatedField__sourceBridge_0269b32b8b(((com.google.protobuf.Descriptors.FieldDescriptor)(__bridgeParam0)), ((java.lang.Object)(__bridgeParam1))))); }
public com.google.protobuf.Message.Builder addRepeatedField__MessageInnerBuilder__sourceBridge_d5d25498d5(com.google.protobuf.Descriptors.FieldDescriptor p0, java.lang.Object p1) {
return ((com.moon.ak)(this)).b(((com.google.protobuf.Descriptors.FieldDescriptor)(p0)), ((java.lang.Object)(p1)));
}

public com.google.protobuf.MessageLite.Builder mergeFrom__MessageLiteInnerBuilder__sourceBridge_1f3030ddff(com.google.protobuf.CodedInputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.ak)(this)).a(((com.google.protobuf.CodedInputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)));
}

public com.google.protobuf.Message.Builder mergeFrom__MessageInnerBuilder__sourceBridge_21f2600f58(com.google.protobuf.Message p0) {
return ((com.moon.ak)(this)).a(((com.google.protobuf.Message)(p0)));
}

public com.google.protobuf.Message.Builder mergeFrom__MessageInnerBuilder__sourceBridge_d24d40278a(com.google.protobuf.CodedInputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.ak)(this)).a(((com.google.protobuf.CodedInputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)));
}

public com.google.protobuf.AbstractMessage.Builder mergeFrom__sourceBridge_811039b404(com.google.protobuf.CodedInputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.ak)(this)).a(((com.google.protobuf.CodedInputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)));
}

public com.moon.ak mergeFrom(com.google.protobuf.CodedInputStream __bridgeParam0, com.google.protobuf.ExtensionRegistryLite __bridgeParam1) throws java.io.IOException { return ((com.moon.ak)(this.mergeFrom__sourceBridge_811039b404(((com.google.protobuf.CodedInputStream)(__bridgeParam0)), ((com.google.protobuf.ExtensionRegistryLite)(__bridgeParam1))))); }
public com.google.protobuf.AbstractMessage.Builder mergeFrom__sourceBridge_0e6f230f8a(com.google.protobuf.Message p0) {
return ((com.moon.ak)(this)).a(((com.google.protobuf.Message)(p0)));
}

public com.moon.ak mergeFrom(com.google.protobuf.Message __bridgeParam0) { return ((com.moon.ak)(this.mergeFrom__sourceBridge_0e6f230f8a(((com.google.protobuf.Message)(__bridgeParam0))))); }
public com.google.protobuf.AbstractMessageLite.Builder mergeFrom__AbstractMessageLiteInnerBuilder__sourceBridge_b3429bd776(com.google.protobuf.CodedInputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.ak)(this)).a(((com.google.protobuf.CodedInputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)));
}

public com.google.protobuf.Message getDefaultInstanceForType__sourceBridge_561eee1e9a() {
return ((com.moon.ak)(this)).a__I();
}

public com.google.protobuf.Message getDefaultInstanceForType() { return ((com.google.protobuf.Message)(this.getDefaultInstanceForType__sourceBridge_561eee1e9a())); }
public com.google.protobuf.MessageLite getDefaultInstanceForType__MessageLite__sourceBridge_99b74750a2() {
return ((com.moon.ak)(this)).a__I();
}

}
