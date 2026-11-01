package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public final class ae extends com.google.protobuf.GeneratedMessageV3.Builder<com.moon.ae> implements com.moon.oy {

private int a;

private boolean b;

private java.lang.Object c;

private java.lang.Object d;

private java.lang.Object e;

private static long f;

private static long[] g;

private static java.lang.Integer[] h;

private static java.util.Map i;

private ae() {
super();
    this.c = "";
    this.d = "";
    this.e = "";
}


private ae(com.google.protobuf.GeneratedMessageV3.BuilderParent p0) {
super(p0);
    this.c = ((java.lang.Object)(""));
    this.d = ((java.lang.Object)(""));
    this.e = ((java.lang.Object)(""));
    return;
}


static {
f = ((long)(((moom._a)(moom._c.a(((long)(2983042023109527385L)), ((long)(8905939594129061729L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(24403418514967L)))));
    i = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.ae.f ^ 2881685626367L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill12_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill12_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill12_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill12_14 = new byte[8];
    (__sourceSpill12_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill12_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation12_16 = __sourceSpill12_14;
    ((javax.crypto.Cipher)(__sourceSpill12_11)).init(((int)(__sourceSpill12_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill12_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation12_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "Vm[Å>ÑÛ+lm"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill12_25 = local6_life21;
        int __sourceSpill12_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill12_25)).substring(((int)(__sourceSpill12_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill12_30 = local8_life19;
        int __sourceSpill12_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill12_33 = new byte[8];
        (__sourceSpill12_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill12_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill12_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill12_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill12_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill12_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill12_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill12_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill12_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill12_34)).doFinal(((byte[])(__sourceSpill12_33)));
        (__sourceSpill12_30)[__sourceSpill12_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    g = ((long[])(local8_life19));
    h = ((java.lang.Integer[])(new java.lang.Integer[2]));
}

private static native <E extends Throwable> com.google.protobuf.ByteString __sourceHandlerCall_e7b3cf56a87c3ec299cb(com.moon.ae a0) throws E;
private static final class __SourceHandler_e7b3cf56a87c3ec299cb {

public static com.google.protobuf.ByteString f256(com.moon.ae receiver) throws Throwable {
    java.lang.Object forwardValue256_24_0;
    java.lang.String[] spill256_0;
    java.lang.Object spill256_1;
    long life1_3;
    java.lang.Object life4_7;
    java.lang.String[] life3_8;
    com.google.protobuf.ByteString life5_20;
    forward_join_24: {
    forward_join_23: {
    life1_3 = (__fieldRead256_0() ^ 37389699387480L);
    spill256_0 = __call256_1();
    life4_7 = __fieldRead256_2(receiver);
    life3_8 = spill256_0;
    spill256_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue256_24_0 = spill256_1;
        break forward_join_24;
    }
    if (!((__instanceOf256_3(spill256_1) != 0))) {
        break forward_join_23;
    }
    life5_20 = __call256_5(__cast256_4(life4_7));
    __fieldWrite256_6(receiver, life5_20);
    return life5_20;
    }
    forwardValue256_24_0 = life4_7;
    }
    return __cast256_7(forwardValue256_24_0);
}
public static void h256_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1025600_0(p0);
}
private static native long __fieldRead256_0() throws Throwable;
private static native java.lang.String[] __call256_1() throws Throwable;
private static native java.lang.Object __fieldRead256_2(com.moon.ae a0) throws Throwable;
private static native int __instanceOf256_3(java.lang.Object a0) throws Throwable;
private static native java.lang.String __cast256_4(java.lang.Object a0) throws Throwable;
private static native com.google.protobuf.ByteString __call256_5(java.lang.String a0) throws Throwable;
private static native void __fieldWrite256_6(com.moon.ae a0, com.google.protobuf.ByteString a1) throws Throwable;
private static native com.google.protobuf.ByteString __cast256_7(java.lang.Object a0) throws Throwable;
private static native java.lang.Exception __call1025600_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.ae __sourceHandlerCall_06ae2c8897f3682d35fc(com.moon.ae a0, com.google.protobuf.ByteString a1) throws E;
private static final class __SourceHandler_06ae2c8897f3682d35fc {

public static com.moon.ae f257(com.moon.ae receiver, com.google.protobuf.ByteString p0) throws Throwable {
    com.google.protobuf.ByteString forwardValue257_15_0;
    com.google.protobuf.ByteString spill257_0;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_15: {
    forward_join_14: {
    life2_3 = (__fieldRead257_0() ^ 57647367029381L);
    life4_5 = __call257_1();
    spill257_0 = p0;
    if (!((life4_5 == null))) {
        forwardValue257_15_0 = spill257_0;
        break forward_join_15;
    }
    if (!((spill257_0 == null))) {
        break forward_join_14;
    }
    throw new java.lang.NullPointerException();
    }
    forwardValue257_15_0 = p0;
    }
    __call257_2(forwardValue257_15_0);
    __fieldWrite257_3(receiver, p0);
    __call257_4(receiver);
    return receiver;
}
public static void h257_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1025700_0(p0);
}
public static void h257_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call1025701_0(p0);
}
private static native long __fieldRead257_0() throws Throwable;
private static native java.lang.String[] __call257_1() throws Throwable;
private static native void __call257_2(com.google.protobuf.ByteString a0) throws Throwable;
private static native void __fieldWrite257_3(com.moon.ae a0, com.google.protobuf.ByteString a1) throws Throwable;
private static native void __call257_4(com.moon.ae a0) throws Throwable;
private static native java.lang.Exception __call1025700_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1025701_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.ae __sourceHandlerCall_c4c8f7d445ef15a7d461(com.moon.ae a0, com.google.protobuf.CodedInputStream a1, com.google.protobuf.ExtensionRegistryLite a2) throws E;
private static final class __SourceHandler_c4c8f7d445ef15a7d461 {

public static com.moon.ae f10(com.moon.ae receiver, com.google.protobuf.CodedInputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws Throwable {
    int lexicalValue10_64_0;
    int lexicalValue10_68_0;
    int spill10_0;
    long life3_3;
    java.lang.String[] life5_5;
    int life6_15;
    int life7_20;
    lexical_join_73: {
    lexical_join_71: {
    lexical_join_12: {
    life3_3 = (__fieldRead10_0() ^ 25349407326194L);
    life5_5 = __call10_1();
    if (!((p1 == null))) {
        break lexical_join_12;
    }
    throw new java.lang.NullPointerException();
    }
    life6_15 = 0;
    lexical_cycle_14: while (true) {
    lexical_join_69: {
    lexical_join_68: {
    lexical_join_64: {
    lexical_join_59: {
    lexical_join_47: {
    lexical_join_41: {
    lexical_join_35: {
    lexical_join_29: {
    lexical_join_25: {
    if (!((life6_15 == 0))) {
        break lexical_join_71;
    }
    life7_20 = __call10_2(p0);
    if (!((life5_5 == null))) {
        break lexical_join_73;
    }
    spill10_0 = life7_20;
    if (!((life5_5 == null))) {
        lexicalValue10_64_0 = spill10_0;
        break lexical_join_64;
    }
    switch (spill10_0) {
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
        break lexical_join_59;
    }
}
    }
    life6_15 = 1;
    if (!((life5_5 != null))) {
        break lexical_join_69;
    }
    }
    __fieldWrite10_4(receiver, __call10_3(p0));
    if (!((life5_5 != null))) {
        break lexical_join_69;
    }
    }
    __fieldWrite10_6(receiver, __call10_5(p0));
    if (!((life5_5 != null))) {
        break lexical_join_69;
    }
    }
    __fieldWrite10_8(receiver, __call10_7(p0));
    if (!((life5_5 != null))) {
        break lexical_join_69;
    }
    }
    __fieldWrite10_10(receiver, __call10_9(p0));
    com.moon.ae __stackOp10_11_0 = receiver;
    __fieldWrite10_13(__stackOp10_11_0, (__fieldRead10_12(__stackOp10_11_0) | 1));
    if (!((life5_5 != null))) {
        break lexical_join_69;
    }
    }
    lexicalValue10_64_0 = __integerCategory10_15(__call10_14(receiver, p0, p1, life7_20));
    }
    if (!((life5_5 == null))) {
        lexicalValue10_68_0 = lexicalValue10_64_0;
        break lexical_join_68;
    }
    if (!((lexicalValue10_64_0 == 0))) {
        break lexical_join_69;
    }
    lexicalValue10_68_0 = 1;
    }
    life6_15 = lexicalValue10_68_0;
    }
    if (!((life5_5 != null))) { continue lexical_cycle_14; }
    break lexical_cycle_14;
    }
    }
    __call10_16(receiver);
    }
    return receiver;
}
public static com.moon.ae h10_0(com.google.protobuf.InvalidProtocolBufferException p0) throws Throwable {
    throw __call3001000_0(p0);
}
public static com.moon.ae h10_1(com.google.protobuf.InvalidProtocolBufferException p0) throws Throwable {
    throw __call3001001_0(p0);
}
public static com.moon.ae h10_2(com.google.protobuf.InvalidProtocolBufferException p0) throws Throwable {
    throw __call3001002_0(p0);
}
public static com.moon.ae h10_3(com.google.protobuf.InvalidProtocolBufferException p0) throws Throwable {
    throw __call3001003_0(p0);
}
public static com.moon.ae h10_4(com.google.protobuf.InvalidProtocolBufferException p0) throws Throwable {
    throw __call3001004_0(p0);
}
public static com.moon.ae h10_5(com.google.protobuf.InvalidProtocolBufferException p0) throws Throwable {
    throw __call3001005_0(p0);
}
public static com.moon.ae h10_6(com.google.protobuf.InvalidProtocolBufferException p0) throws Throwable {
    throw __call3001006_0(p0);
}
public static com.moon.ae h10_7(com.google.protobuf.InvalidProtocolBufferException p0) throws Throwable {
    throw __call3001007_0(p0);
}
public static com.moon.ae h10_8(com.google.protobuf.InvalidProtocolBufferException p0) throws Throwable {
    throw __call3001008_0(p0);
}
public static com.moon.ae h10_9(com.google.protobuf.InvalidProtocolBufferException p0, int p1) throws Throwable {
    com.google.protobuf.InvalidProtocolBufferException life1_2;
    life1_2 = p0;
    throw __call3001009_0(life1_2);
}
public static com.moon.ae h10_10(java.lang.Throwable p0, com.moon.ae p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __call3001010_0(p1);
    throw life2_2;
}
private static native long __fieldRead10_0() throws Throwable;
private static native java.lang.String[] __call10_1() throws Throwable;
private static native int __call10_2(com.google.protobuf.CodedInputStream a0) throws Throwable;
private static native boolean __call10_3(com.google.protobuf.CodedInputStream a0) throws Throwable;
private static native void __fieldWrite10_4(com.moon.ae a0, boolean a1) throws Throwable;
private static native java.lang.String __call10_5(com.google.protobuf.CodedInputStream a0) throws Throwable;
private static native void __fieldWrite10_6(com.moon.ae a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call10_7(com.google.protobuf.CodedInputStream a0) throws Throwable;
private static native void __fieldWrite10_8(com.moon.ae a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call10_9(com.google.protobuf.CodedInputStream a0) throws Throwable;
private static native void __fieldWrite10_10(com.moon.ae a0, java.lang.String a1) throws Throwable;
private static native int __fieldRead10_12(com.moon.ae a0) throws Throwable;
private static native void __fieldWrite10_13(com.moon.ae a0, int a1) throws Throwable;
private static native boolean __call10_14(com.moon.ae a0, com.google.protobuf.CodedInputStream a1, com.google.protobuf.ExtensionRegistryLite a2, int a3) throws Throwable;
private static native int __integerCategory10_15(boolean value) throws Throwable;
private static native void __call10_16(com.moon.ae a0) throws Throwable;
private static native java.lang.Exception __call3001000_0(com.google.protobuf.InvalidProtocolBufferException a0) throws Throwable;
private static native java.lang.Exception __call3001001_0(com.google.protobuf.InvalidProtocolBufferException a0) throws Throwable;
private static native java.lang.Exception __call3001002_0(com.google.protobuf.InvalidProtocolBufferException a0) throws Throwable;
private static native java.lang.Exception __call3001003_0(com.google.protobuf.InvalidProtocolBufferException a0) throws Throwable;
private static native java.lang.Exception __call3001004_0(com.google.protobuf.InvalidProtocolBufferException a0) throws Throwable;
private static native java.lang.Exception __call3001005_0(com.google.protobuf.InvalidProtocolBufferException a0) throws Throwable;
private static native java.lang.Exception __call3001006_0(com.google.protobuf.InvalidProtocolBufferException a0) throws Throwable;
private static native java.lang.Exception __call3001007_0(com.google.protobuf.InvalidProtocolBufferException a0) throws Throwable;
private static native java.lang.Exception __call3001008_0(com.google.protobuf.InvalidProtocolBufferException a0) throws Throwable;
private static native java.io.IOException __call3001009_0(com.google.protobuf.InvalidProtocolBufferException a0) throws Throwable;
private static native void __call3001010_0(com.moon.ae a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.ae __sourceHandlerCall_c417edf625e01c511518(com.moon.ae a0, com.google.protobuf.Message a1) throws E;
private static final class __SourceHandler_c417edf625e01c511518 {

public static com.moon.ae f317(com.moon.ae receiver, com.google.protobuf.Message p0) throws Throwable {
    long life2_3;
    java.lang.String[] life4_5;
    life2_3 = (__fieldRead317_0() ^ 118405874063712L);
    life4_5 = __call317_1();
    if ((life4_5 == null)) {
        if ((__instanceOf317_2(p0) != 0)) {
        return __call317_4(receiver, __cast317_3(p0));
    }
        __call317_5(receiver, p0);
    }
    return receiver;
}
public static void h317_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1031700_0(p0);
}
public static void h317_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call1031701_0(p0);
}
private static native long __fieldRead317_0() throws Throwable;
private static native java.lang.String[] __call317_1() throws Throwable;
private static native int __instanceOf317_2(com.google.protobuf.Message a0) throws Throwable;
private static native com.moon.C __cast317_3(com.google.protobuf.Message a0) throws Throwable;
private static native com.moon.ae __call317_4(com.moon.ae a0, com.moon.C a1) throws Throwable;
private static native com.google.protobuf.AbstractMessage.Builder __call317_5(com.moon.ae a0, com.google.protobuf.Message a1) throws Throwable;
private static native java.lang.Exception __call1031700_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1031701_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.ae __sourceHandlerCall_cf00d22981a9dc5d2582(com.moon.ae a0, com.moon.C a1) throws E;
private static final class __SourceHandler_cf00d22981a9dc5d2582 {

public static com.moon.ae f0(com.moon.ae receiver, com.moon.C p0) throws Throwable {
    com.moon.C forwardValue0_14_0;
    int forwardValue0_26_0;
    int forwardValue0_38_0;
    int forwardValue0_49_0;
    com.moon.C spill0_0;
    boolean spill0_1;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_62: {
    forward_join_49: {
    forward_join_47: {
    forward_join_38: {
    forward_join_35: {
    forward_join_26: {
    forward_join_23: {
    forward_join_14: {
    forward_join_13: {
    life2_3 = (__fieldRead0_0() ^ 12460843066935L);
    life4_5 = __call0_1();
    spill0_0 = p0;
    if (!((life4_5 == null))) {
        forwardValue0_14_0 = spill0_0;
        break forward_join_14;
    }
    if (!((spill0_0 == __call0_2()))) {
        break forward_join_13;
    }
    return receiver;
    }
    forwardValue0_14_0 = p0;
    }
    spill0_1 = __call0_3(forwardValue0_14_0);
    if (!((life4_5 == null))) {
        forwardValue0_26_0 = __integerCategory0_4(spill0_1);
        break forward_join_26;
    }
    if (!(spill0_1)) {
        break forward_join_23;
    }
    __call0_6(receiver, __call0_5(p0));
    }
    forwardValue0_26_0 = __integerCategory0_9(__call0_8(__call0_7(p0)));
    }
    if (!((life4_5 == null))) {
        forwardValue0_38_0 = forwardValue0_26_0;
        break forward_join_38;
    }
    if (!((forwardValue0_26_0 == 0))) {
        break forward_join_35;
    }
    __fieldWrite0_11(receiver, __fieldRead0_10(p0));
    __call0_12(receiver);
    }
    forwardValue0_38_0 = __integerCategory0_15(__call0_14(__call0_13(p0)));
    }
    if (!((life4_5 == null))) {
        forwardValue0_49_0 = forwardValue0_38_0;
        break forward_join_49;
    }
    if (!((forwardValue0_38_0 == 0))) {
        break forward_join_47;
    }
    __fieldWrite0_17(receiver, __fieldRead0_16(p0));
    __call0_18(receiver);
    }
    forwardValue0_49_0 = __integerCategory0_20(__call0_19(p0));
    }
    if (!((forwardValue0_49_0 != 0))) {
        break forward_join_62;
    }
    com.moon.ae __stackOp0_21_0 = receiver;
    __fieldWrite0_23(__stackOp0_21_0, (__fieldRead0_22(__stackOp0_21_0) | 1));
    __fieldWrite0_25(receiver, __fieldRead0_24(p0));
    __call0_26(receiver);
    }
    __call0_28(receiver, __call0_27(p0));
    __call0_29(receiver);
    return receiver;
}
public static void h0_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1000000_0(p0);
}
public static void h0_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call1000001_0(p0);
}
public static void h0_2(java.lang.NullPointerException p0) throws Throwable {
    throw __call1000002_0(p0);
}
public static void h0_3(java.lang.NullPointerException p0) throws Throwable {
    throw __call1000003_0(p0);
}
public static void h0_4(java.lang.NullPointerException p0) throws Throwable {
    throw __call1000004_0(p0);
}
public static void h0_5(java.lang.NullPointerException p0) throws Throwable {
    throw __call1000005_0(p0);
}
public static void h0_6(java.lang.NullPointerException p0) throws Throwable {
    throw __call1000006_0(p0);
}
public static void h0_7(java.lang.NullPointerException p0) throws Throwable {
    throw __call1000007_0(p0);
}
public static void h0_8(java.lang.NullPointerException p0) throws Throwable {
    throw __call1000008_0(p0);
}
private static native long __fieldRead0_0() throws Throwable;
private static native java.lang.String[] __call0_1() throws Throwable;
private static native com.moon.C __call0_2() throws Throwable;
private static native boolean __call0_3(com.moon.C a0) throws Throwable;
private static native int __integerCategory0_4(boolean value) throws Throwable;
private static native boolean __call0_5(com.moon.C a0) throws Throwable;
private static native com.moon.ae __call0_6(com.moon.ae a0, boolean a1) throws Throwable;
private static native java.lang.String __call0_7(com.moon.C a0) throws Throwable;
private static native boolean __call0_8(java.lang.String a0) throws Throwable;
private static native int __integerCategory0_9(boolean value) throws Throwable;
private static native java.lang.Object __fieldRead0_10(com.moon.C a0) throws Throwable;
private static native void __fieldWrite0_11(com.moon.ae a0, java.lang.Object a1) throws Throwable;
private static native void __call0_12(com.moon.ae a0) throws Throwable;
private static native java.lang.String __call0_13(com.moon.C a0) throws Throwable;
private static native boolean __call0_14(java.lang.String a0) throws Throwable;
private static native int __integerCategory0_15(boolean value) throws Throwable;
private static native java.lang.Object __fieldRead0_16(com.moon.C a0) throws Throwable;
private static native void __fieldWrite0_17(com.moon.ae a0, java.lang.Object a1) throws Throwable;
private static native void __call0_18(com.moon.ae a0) throws Throwable;
private static native boolean __call0_19(com.moon.C a0) throws Throwable;
private static native int __integerCategory0_20(boolean value) throws Throwable;
private static native int __fieldRead0_22(com.moon.ae a0) throws Throwable;
private static native void __fieldWrite0_23(com.moon.ae a0, int a1) throws Throwable;
private static native java.lang.Object __fieldRead0_24(com.moon.C a0) throws Throwable;
private static native void __fieldWrite0_25(com.moon.ae a0, java.lang.Object a1) throws Throwable;
private static native void __call0_26(com.moon.ae a0) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call0_27(com.moon.C a0) throws Throwable;
private static native com.moon.ae __call0_28(com.moon.ae a0, com.google.protobuf.UnknownFieldSet a1) throws Throwable;
private static native void __call0_29(com.moon.ae a0) throws Throwable;
private static native java.lang.Exception __call1000000_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1000001_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1000002_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1000003_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1000004_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1000005_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1000006_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1000007_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1000008_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.ae __sourceHandlerCall_842f5b19b5a8202c41ae(com.moon.ae a0, java.lang.String a1) throws E;
private static final class __SourceHandler_842f5b19b5a8202c41ae {

public static com.moon.ae f319(com.moon.ae receiver, java.lang.String p0) throws Throwable {
    long life2_3;
    java.lang.String[] life4_5;
    life2_3 = (__fieldRead319_0() ^ 67878035652643L);
    life4_5 = __call319_1();
    if ((life4_5 == null)) {
        if ((p0 == null)) {
        throw new java.lang.NullPointerException();
    }
        __fieldWrite319_2(receiver, p0);
        __call319_3(receiver);
    }
    return receiver;
}
public static void h319_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1031900_0(p0);
}
public static void h319_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call1031901_0(p0);
}
private static native long __fieldRead319_0() throws Throwable;
private static native java.lang.String[] __call319_1() throws Throwable;
private static native void __fieldWrite319_2(com.moon.ae a0, java.lang.String a1) throws Throwable;
private static native void __call319_3(com.moon.ae a0) throws Throwable;
private static native java.lang.Exception __call1031900_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1031901_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_3d2d0aaaff295f64a45e(com.moon.ae a0) throws E;
private static final class __SourceHandler_3d2d0aaaff295f64a45e {

public static java.lang.String f259(com.moon.ae receiver) throws Throwable {
    java.lang.Object forwardValue259_26_0;
    java.lang.String[] spill259_0;
    java.lang.Object spill259_1;
    long life1_3;
    java.lang.Object life4_7;
    java.lang.String[] life3_8;
    com.google.protobuf.ByteString life5_19;
    java.lang.String life6_22;
    forward_join_26: {
    forward_join_25: {
    life1_3 = (__fieldRead259_0() ^ 63967267975118L);
    spill259_0 = __call259_1();
    life4_7 = __fieldRead259_2(receiver);
    life3_8 = spill259_0;
    spill259_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue259_26_0 = spill259_1;
        break forward_join_26;
    }
    if (!((__instanceOf259_3(spill259_1) == 0))) {
        break forward_join_25;
    }
    life5_19 = __cast259_4(life4_7);
    life6_22 = __call259_5(life5_19);
    __fieldWrite259_6(receiver, life6_22);
    return life6_22;
    }
    forwardValue259_26_0 = life4_7;
    }
    return __cast259_7(forwardValue259_26_0);
}
public static void h259_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1025900_0(p0);
}
private static native long __fieldRead259_0() throws Throwable;
private static native java.lang.String[] __call259_1() throws Throwable;
private static native java.lang.Object __fieldRead259_2(com.moon.ae a0) throws Throwable;
private static native int __instanceOf259_3(java.lang.Object a0) throws Throwable;
private static native com.google.protobuf.ByteString __cast259_4(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call259_5(com.google.protobuf.ByteString a0) throws Throwable;
private static native void __fieldWrite259_6(com.moon.ae a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __cast259_7(java.lang.Object a0) throws Throwable;
private static native java.lang.Exception __call1025900_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> com.google.protobuf.ByteString __sourceHandlerCall_4ac9be3a5846c77d6e72(com.moon.ae a0) throws E;
private static final class __SourceHandler_4ac9be3a5846c77d6e72 {

public static com.google.protobuf.ByteString f260(com.moon.ae receiver) throws Throwable {
    java.lang.Object forwardValue260_24_0;
    java.lang.String[] spill260_0;
    java.lang.Object spill260_1;
    long life1_3;
    java.lang.Object life4_7;
    java.lang.String[] life3_8;
    com.google.protobuf.ByteString life5_20;
    forward_join_24: {
    forward_join_23: {
    life1_3 = (__fieldRead260_0() ^ 5869758891534L);
    spill260_0 = __call260_1();
    life4_7 = __fieldRead260_2(receiver);
    life3_8 = spill260_0;
    spill260_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue260_24_0 = spill260_1;
        break forward_join_24;
    }
    if (!((__instanceOf260_3(spill260_1) != 0))) {
        break forward_join_23;
    }
    life5_20 = __call260_5(__cast260_4(life4_7));
    __fieldWrite260_6(receiver, life5_20);
    return life5_20;
    }
    forwardValue260_24_0 = life4_7;
    }
    return __cast260_7(forwardValue260_24_0);
}
public static void h260_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1026000_0(p0);
}
private static native long __fieldRead260_0() throws Throwable;
private static native java.lang.String[] __call260_1() throws Throwable;
private static native java.lang.Object __fieldRead260_2(com.moon.ae a0) throws Throwable;
private static native int __instanceOf260_3(java.lang.Object a0) throws Throwable;
private static native java.lang.String __cast260_4(java.lang.Object a0) throws Throwable;
private static native com.google.protobuf.ByteString __call260_5(java.lang.String a0) throws Throwable;
private static native void __fieldWrite260_6(com.moon.ae a0, com.google.protobuf.ByteString a1) throws Throwable;
private static native com.google.protobuf.ByteString __cast260_7(java.lang.Object a0) throws Throwable;
private static native java.lang.Exception __call1026000_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.ae __sourceHandlerCall_554a161a23d8a4984ca8(com.moon.ae a0, com.google.protobuf.ByteString a1) throws E;
private static final class __SourceHandler_554a161a23d8a4984ca8 {

public static com.moon.ae f261(com.moon.ae receiver, com.google.protobuf.ByteString p0) throws Throwable {
    com.google.protobuf.ByteString forwardValue261_15_0;
    com.google.protobuf.ByteString spill261_0;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_15: {
    forward_join_14: {
    life2_3 = (__fieldRead261_0() ^ 94282294387457L);
    life4_5 = __call261_1();
    spill261_0 = p0;
    if (!((life4_5 == null))) {
        forwardValue261_15_0 = spill261_0;
        break forward_join_15;
    }
    if (!((spill261_0 == null))) {
        break forward_join_14;
    }
    throw new java.lang.NullPointerException();
    }
    forwardValue261_15_0 = p0;
    }
    __call261_2(forwardValue261_15_0);
    __fieldWrite261_3(receiver, p0);
    __call261_4(receiver);
    return receiver;
}
public static void h261_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1026100_0(p0);
}
public static void h261_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call1026101_0(p0);
}
private static native long __fieldRead261_0() throws Throwable;
private static native java.lang.String[] __call261_1() throws Throwable;
private static native void __call261_2(com.google.protobuf.ByteString a0) throws Throwable;
private static native void __fieldWrite261_3(com.moon.ae a0, com.google.protobuf.ByteString a1) throws Throwable;
private static native void __call261_4(com.moon.ae a0) throws Throwable;
private static native java.lang.Exception __call1026100_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1026101_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.ae __sourceHandlerCall_f13d461f0056b263acf5(com.moon.ae a0, java.lang.String a1) throws E;
private static final class __SourceHandler_f13d461f0056b263acf5 {

public static com.moon.ae f323(com.moon.ae receiver, java.lang.String p0) throws Throwable {
    long life2_3;
    java.lang.String[] life4_5;
    life2_3 = (__fieldRead323_0() ^ 477062690501L);
    life4_5 = __call323_1();
    if ((life4_5 == null)) {
        if ((p0 == null)) {
        throw new java.lang.NullPointerException();
    }
        __fieldWrite323_2(receiver, p0);
        __call323_3(receiver);
    }
    return receiver;
}
public static void h323_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1032300_0(p0);
}
public static void h323_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call1032301_0(p0);
}
private static native long __fieldRead323_0() throws Throwable;
private static native java.lang.String[] __call323_1() throws Throwable;
private static native void __fieldWrite323_2(com.moon.ae a0, java.lang.String a1) throws Throwable;
private static native void __call323_3(com.moon.ae a0) throws Throwable;
private static native java.lang.Exception __call1032300_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1032301_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_7427a382df15b8133bde(com.moon.ae a0) throws E;
private static final class __SourceHandler_7427a382df15b8133bde {

public static boolean f262(com.moon.ae receiver) throws Throwable {
    int forwardValue262_14_0;
    int forwardValue262_16_0;
    int spill262_0;
    long life1_3;
    java.lang.String[] life3_5;
    forward_join_16: {
    forward_join_15: {
    forward_join_14: {
    life1_3 = (__fieldRead262_0() ^ 65308385418592L);
    life3_5 = __call262_1();
    spill262_0 = (__fieldRead262_2(receiver) & 1);
    if (!((life3_5 == null))) {
        forwardValue262_14_0 = spill262_0;
        break forward_join_14;
    }
    if (!((spill262_0 != 0))) {
        break forward_join_15;
    }
    forwardValue262_14_0 = 1;
    }
    forwardValue262_16_0 = forwardValue262_14_0;
    break forward_join_16;
    }
    forwardValue262_16_0 = 0;
    }
    return __integerCategory262_3(forwardValue262_16_0);
}
public static void h262_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1026200_0(p0);
}
private static native long __fieldRead262_0() throws Throwable;
private static native java.lang.String[] __call262_1() throws Throwable;
private static native int __fieldRead262_2(com.moon.ae a0) throws Throwable;
private static native boolean __integerCategory262_3(int value) throws Throwable;
private static native java.lang.Exception __call1026200_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.C __sourceHandlerCall_9b2f45561348eb776ff0(com.moon.ae a0) throws E;
private static final class __SourceHandler_9b2f45561348eb776ff0 {

public static com.moon.C f263(com.moon.ae receiver) throws Throwable {
    com.moon.C forwardValue263_18_0;
    java.lang.String[] spill263_0;
    com.moon.C spill263_1;
    long life1_3;
    com.moon.C life4_7;
    java.lang.String[] life3_8;
    forward_join_18: {
    forward_join_17: {
    life1_3 = (__fieldRead263_0() ^ 119380283699866L);
    spill263_0 = __call263_1();
    life4_7 = __call263_2(receiver);
    life3_8 = spill263_0;
    spill263_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue263_18_0 = spill263_1;
        break forward_join_18;
    }
    if (!((!__call263_3(spill263_1)))) {
        break forward_join_17;
    }
    throw __call263_4(life4_7);
    }
    forwardValue263_18_0 = life4_7;
    }
    return forwardValue263_18_0;
}
public static void h263_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1026300_0(p0);
}
public static void h263_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call1026301_0(p0);
}
private static native long __fieldRead263_0() throws Throwable;
private static native java.lang.String[] __call263_1() throws Throwable;
private static native com.moon.C __call263_2(com.moon.ae a0) throws Throwable;
private static native boolean __call263_3(com.moon.C a0) throws Throwable;
private static native com.google.protobuf.UninitializedMessageException __call263_4(com.moon.C a0) throws Throwable;
private static native java.lang.Exception __call1026300_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1026301_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_cbdd978ccc63197336bc(com.moon.ae a0) throws E;
private static final class __SourceHandler_cbdd978ccc63197336bc {

public static java.lang.String f264(com.moon.ae receiver) throws Throwable {
    java.lang.Object forwardValue264_26_0;
    java.lang.String[] spill264_0;
    java.lang.Object spill264_1;
    long life1_3;
    java.lang.Object life4_7;
    java.lang.String[] life3_8;
    com.google.protobuf.ByteString life5_19;
    java.lang.String life6_22;
    forward_join_26: {
    forward_join_25: {
    life1_3 = (__fieldRead264_0() ^ 124448427227573L);
    spill264_0 = __call264_1();
    life4_7 = __fieldRead264_2(receiver);
    life3_8 = spill264_0;
    spill264_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue264_26_0 = spill264_1;
        break forward_join_26;
    }
    if (!((__instanceOf264_3(spill264_1) == 0))) {
        break forward_join_25;
    }
    life5_19 = __cast264_4(life4_7);
    life6_22 = __call264_5(life5_19);
    __fieldWrite264_6(receiver, life6_22);
    return life6_22;
    }
    forwardValue264_26_0 = life4_7;
    }
    return __cast264_7(forwardValue264_26_0);
}
public static void h264_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1026400_0(p0);
}
private static native long __fieldRead264_0() throws Throwable;
private static native java.lang.String[] __call264_1() throws Throwable;
private static native java.lang.Object __fieldRead264_2(com.moon.ae a0) throws Throwable;
private static native int __instanceOf264_3(java.lang.Object a0) throws Throwable;
private static native com.google.protobuf.ByteString __cast264_4(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call264_5(com.google.protobuf.ByteString a0) throws Throwable;
private static native void __fieldWrite264_6(com.moon.ae a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __cast264_7(java.lang.Object a0) throws Throwable;
private static native java.lang.Exception __call1026400_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> com.google.protobuf.ByteString __sourceHandlerCall_1219a82d305bb7c492cd(com.moon.ae a0) throws E;
private static final class __SourceHandler_1219a82d305bb7c492cd {

public static com.google.protobuf.ByteString f265(com.moon.ae receiver) throws Throwable {
    java.lang.Object forwardValue265_24_0;
    java.lang.String[] spill265_0;
    java.lang.Object spill265_1;
    long life1_3;
    java.lang.Object life4_7;
    java.lang.String[] life3_8;
    com.google.protobuf.ByteString life5_20;
    forward_join_24: {
    forward_join_23: {
    life1_3 = (__fieldRead265_0() ^ 90944789485103L);
    spill265_0 = __call265_1();
    life4_7 = __fieldRead265_2(receiver);
    life3_8 = spill265_0;
    spill265_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue265_24_0 = spill265_1;
        break forward_join_24;
    }
    if (!((__instanceOf265_3(spill265_1) != 0))) {
        break forward_join_23;
    }
    life5_20 = __call265_5(__cast265_4(life4_7));
    __fieldWrite265_6(receiver, life5_20);
    return life5_20;
    }
    forwardValue265_24_0 = life4_7;
    }
    return __cast265_7(forwardValue265_24_0);
}
public static void h265_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1026500_0(p0);
}
private static native long __fieldRead265_0() throws Throwable;
private static native java.lang.String[] __call265_1() throws Throwable;
private static native java.lang.Object __fieldRead265_2(com.moon.ae a0) throws Throwable;
private static native int __instanceOf265_3(java.lang.Object a0) throws Throwable;
private static native java.lang.String __cast265_4(java.lang.Object a0) throws Throwable;
private static native com.google.protobuf.ByteString __call265_5(java.lang.String a0) throws Throwable;
private static native void __fieldWrite265_6(com.moon.ae a0, com.google.protobuf.ByteString a1) throws Throwable;
private static native com.google.protobuf.ByteString __cast265_7(java.lang.Object a0) throws Throwable;
private static native java.lang.Exception __call1026500_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.ae __sourceHandlerCall_9dc8be848d9afc8c55c0(com.moon.ae a0, com.google.protobuf.ByteString a1) throws E;
private static final class __SourceHandler_9dc8be848d9afc8c55c0 {

public static com.moon.ae f1(com.moon.ae receiver, com.google.protobuf.ByteString p0) throws Throwable {
    com.google.protobuf.ByteString forwardValue1_15_0;
    com.google.protobuf.ByteString spill1_0;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_15: {
    forward_join_14: {
    life2_3 = (__fieldRead1_0() ^ 130748516841853L);
    life4_5 = __call1_1();
    spill1_0 = p0;
    if (!((life4_5 == null))) {
        forwardValue1_15_0 = spill1_0;
        break forward_join_15;
    }
    if (!((spill1_0 == null))) {
        break forward_join_14;
    }
    throw new java.lang.NullPointerException();
    }
    forwardValue1_15_0 = p0;
    }
    __call1_2(forwardValue1_15_0);
    com.moon.ae __stackOp1_3_0 = receiver;
    __fieldWrite1_5(__stackOp1_3_0, (__fieldRead1_4(__stackOp1_3_0) | 1));
    __fieldWrite1_6(receiver, p0);
    __call1_7(receiver);
    return receiver;
}
public static void h1_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1000100_0(p0);
}
public static void h1_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call1000101_0(p0);
}
private static native long __fieldRead1_0() throws Throwable;
private static native java.lang.String[] __call1_1() throws Throwable;
private static native void __call1_2(com.google.protobuf.ByteString a0) throws Throwable;
private static native int __fieldRead1_4(com.moon.ae a0) throws Throwable;
private static native void __fieldWrite1_5(com.moon.ae a0, int a1) throws Throwable;
private static native void __fieldWrite1_6(com.moon.ae a0, com.google.protobuf.ByteString a1) throws Throwable;
private static native void __call1_7(com.moon.ae a0) throws Throwable;
private static native java.lang.Exception __call1000100_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1000101_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.ae __sourceHandlerCall_a8f82136ed9744e24870(com.moon.ae a0, java.lang.String a1) throws E;
private static final class __SourceHandler_a8f82136ed9744e24870 {

public static com.moon.ae f2(com.moon.ae receiver, java.lang.String p0) throws Throwable {
    long life2_3;
    java.lang.String[] life4_5;
    life2_3 = (__fieldRead2_0() ^ 7422062097050L);
    life4_5 = __call2_1();
    if ((life4_5 == null)) {
        if ((p0 == null)) {
        throw new java.lang.NullPointerException();
    }
        com.moon.ae __stackOp2_2_0 = receiver;
        __fieldWrite2_4(__stackOp2_2_0, (__fieldRead2_3(__stackOp2_2_0) | 1));
        __fieldWrite2_5(receiver, p0);
        __call2_6(receiver);
    }
    return receiver;
}
public static void h2_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1000200_0(p0);
}
public static void h2_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call1000201_0(p0);
}
private static native long __fieldRead2_0() throws Throwable;
private static native java.lang.String[] __call2_1() throws Throwable;
private static native int __fieldRead2_3(com.moon.ae a0) throws Throwable;
private static native void __fieldWrite2_4(com.moon.ae a0, int a1) throws Throwable;
private static native void __fieldWrite2_5(com.moon.ae a0, java.lang.String a1) throws Throwable;
private static native void __call2_6(com.moon.ae a0) throws Throwable;
private static native java.lang.Exception __call1000200_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1000201_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.C __sourceHandlerCall_a736b1db9bb913b197b2(com.moon.ae a0) throws E;
private static final class __SourceHandler_a736b1db9bb913b197b2 {

public static com.moon.C f330(com.moon.ae receiver) throws Throwable {
    long life1_3;
    com.moon.C life4_9;
    java.lang.String[] life3_10;
    int life5_13;
    int life6_15;
    life1_3 = (__fieldRead330_0() ^ 7581465456711L);
    java.lang.String[] spill330_0 = __call330_1();
    life4_9 = new com.moon.C(receiver);
    life3_10 = spill330_0;
    life5_13 = __fieldRead330_2(receiver);
    life6_15 = 0;
    __fieldWrite330_4(life4_9, __fieldRead330_3(receiver));
    __fieldWrite330_6(life4_9, __fieldRead330_5(receiver));
    __fieldWrite330_8(life4_9, __fieldRead330_7(receiver));
    if ((life3_10 == null)) {
        if (((life5_13 & 1) != 0)) {
        life6_15 = (life6_15 | 1);
    }
        __fieldWrite330_10(life4_9, __fieldRead330_9(receiver));
        __fieldWrite330_11(life4_9, life6_15);
        __call330_12(receiver);
    }
    return life4_9;
}
public static void h330_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1033000_0(p0);
}
private static native long __fieldRead330_0() throws Throwable;
private static native java.lang.String[] __call330_1() throws Throwable;
private static native int __fieldRead330_2(com.moon.ae a0) throws Throwable;
private static native boolean __fieldRead330_3(com.moon.ae a0) throws Throwable;
private static native void __fieldWrite330_4(com.moon.C a0, boolean a1) throws Throwable;
private static native java.lang.Object __fieldRead330_5(com.moon.ae a0) throws Throwable;
private static native void __fieldWrite330_6(com.moon.C a0, java.lang.Object a1) throws Throwable;
private static native java.lang.Object __fieldRead330_7(com.moon.ae a0) throws Throwable;
private static native void __fieldWrite330_8(com.moon.C a0, java.lang.Object a1) throws Throwable;
private static native java.lang.Object __fieldRead330_9(com.moon.ae a0) throws Throwable;
private static native void __fieldWrite330_10(com.moon.C a0, java.lang.Object a1) throws Throwable;
private static native void __fieldWrite330_11(com.moon.C a0, int a1) throws Throwable;
private static native void __call330_12(com.moon.ae a0) throws Throwable;
private static native java.lang.Exception __call1033000_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_44291debf06526c718a4(com.moon.ae a0) throws E;
private static final class __SourceHandler_44291debf06526c718a4 {

public static java.lang.String f267(com.moon.ae receiver) throws Throwable {
    java.lang.Object forwardValue267_26_0;
    java.lang.String[] spill267_0;
    java.lang.Object spill267_1;
    long life1_3;
    java.lang.Object life4_7;
    java.lang.String[] life3_8;
    com.google.protobuf.ByteString life5_19;
    java.lang.String life6_22;
    forward_join_26: {
    forward_join_25: {
    life1_3 = (__fieldRead267_0() ^ 50423980826929L);
    spill267_0 = __call267_1();
    life4_7 = __fieldRead267_2(receiver);
    life3_8 = spill267_0;
    spill267_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue267_26_0 = spill267_1;
        break forward_join_26;
    }
    if (!((__instanceOf267_3(spill267_1) == 0))) {
        break forward_join_25;
    }
    life5_19 = __cast267_4(life4_7);
    life6_22 = __call267_5(life5_19);
    __fieldWrite267_6(receiver, life6_22);
    return life6_22;
    }
    forwardValue267_26_0 = life4_7;
    }
    return __cast267_7(forwardValue267_26_0);
}
public static void h267_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1026700_0(p0);
}
private static native long __fieldRead267_0() throws Throwable;
private static native java.lang.String[] __call267_1() throws Throwable;
private static native java.lang.Object __fieldRead267_2(com.moon.ae a0) throws Throwable;
private static native int __instanceOf267_3(java.lang.Object a0) throws Throwable;
private static native com.google.protobuf.ByteString __cast267_4(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call267_5(com.google.protobuf.ByteString a0) throws Throwable;
private static native void __fieldWrite267_6(com.moon.ae a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __cast267_7(java.lang.Object a0) throws Throwable;
private static native java.lang.Exception __call1026700_0(java.lang.NullPointerException a0) throws Throwable;

}


public java.lang.String b__String() { return __sourceHandlerCall_cbdd978ccc63197336bc(this); }


public com.moon.ae b(com.google.protobuf.ByteString p0) { return __sourceHandlerCall_554a161a23d8a4984ca8(this, p0); }


public final com.moon.ae b(com.google.protobuf.UnknownFieldSet p0) {
return ((com.moon.ae)(super.mergeUnknownFields(((com.google.protobuf.UnknownFieldSet)(p0)))));
}


public com.moon.ae b(java.lang.String p0) { return __sourceHandlerCall_f13d461f0056b263acf5(this, p0); }


public com.google.protobuf.ByteString b() { return __sourceHandlerCall_4ac9be3a5846c77d6e72(this); }


public boolean b__Boolean() { return __sourceHandlerCall_7427a382df15b8133bde(this); }


public com.moon.ae b__ae() {
return ((com.moon.ae)(super.clone()));
}


public com.moon.ae b(com.google.protobuf.Descriptors.FieldDescriptor p0, java.lang.Object p1) {
return ((com.moon.ae)(super.addRepeatedField(((com.google.protobuf.Descriptors.FieldDescriptor)(p0)), ((java.lang.Object)(p1)))));
}


public com.moon.C b__C() { return __sourceHandlerCall_9b2f45561348eb776ff0(this); }


public com.moon.ae e() {
this.d = ((java.lang.Object)(((com.moon.C)(com.moon.C.a__C())).b__String()));
    ((com.moon.ae)(this)).onChanged();
    return this;
}


public java.lang.String c__String() { return __sourceHandlerCall_44291debf06526c718a4(this); }


public com.google.protobuf.ByteString c() { return __sourceHandlerCall_1219a82d305bb7c492cd(this); }


public com.moon.ae c(java.lang.String p0) { return __sourceHandlerCall_a8f82136ed9744e24870(this, p0); }


public com.moon.C c__C() { return __sourceHandlerCall_a736b1db9bb913b197b2(this); }


public com.moon.ae c(com.google.protobuf.ByteString p0) { return __sourceHandlerCall_9dc8be848d9afc8c55c0(this, p0); }


public com.moon.ae c__ae() {
this.b = ((boolean)(false));
    ((com.moon.ae)(this)).onChanged();
    return this;
}


public com.moon.ae f() {
long local1 = (com.moon.ae.f ^ 139231978560999L);
    this.a = ((int)((this.a & __sourceIntrinsic_82a3d2fa9a18_originalDynamicSite61_2(2500, (5799844192648573041L ^ local1)))));
    this.e = ((java.lang.Object)(((com.moon.C)(com.moon.C.a__C())).c__String()));
    ((com.moon.ae)(this)).onChanged();
    return this;
}


public com.moon.ae d() {
this.c = ((java.lang.Object)(((com.moon.C)(com.moon.C.a__C())).a__String()));
    ((com.moon.ae)(this)).onChanged();
    return this;
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_130a0f21fd6844(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 29566;
      if (h[var3] == null) {
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
         long var5 = g[var3];
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
         Object[] var9 = (Object[])i.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               i.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/ae", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         h[var3] = var15;
      }

      return h[var3];
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral389_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/ae"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public final com.moon.ae a(com.google.protobuf.UnknownFieldSet p0) {
return ((com.moon.ae)(super.setUnknownFields(((com.google.protobuf.UnknownFieldSet)(p0)))));
}


public com.moon.ae a(com.google.protobuf.Descriptors.FieldDescriptor p0) {
return ((com.moon.ae)(super.clearField(((com.google.protobuf.Descriptors.FieldDescriptor)(p0)))));
}


public com.moon.ae a(com.google.protobuf.CodedInputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException { return __sourceHandlerCall_c4c8f7d445ef15a7d461(this, p0, p1); }


public boolean a__Boolean() {
return ((((this.b) ? 1 : 0)) != 0);
}


public com.moon.ae a(com.google.protobuf.Descriptors.FieldDescriptor p0, java.lang.Object p1) {
return ((com.moon.ae)(super.setField(((com.google.protobuf.Descriptors.FieldDescriptor)(p0)), ((java.lang.Object)(p1)))));
}


public com.moon.C a__C() {
return com.moon.C.a__C();
}


public com.moon.ae a(com.google.protobuf.Message p0) { return __sourceHandlerCall_c417edf625e01c511518(this, p0); }


public com.moon.ae a(com.moon.C p0) { return __sourceHandlerCall_cf00d22981a9dc5d2582(this, p0); }


public com.moon.ae a(com.google.protobuf.Descriptors.FieldDescriptor p0, int p1, java.lang.Object p2) {
return ((com.moon.ae)(super.setRepeatedField(((com.google.protobuf.Descriptors.FieldDescriptor)(p0)), ((int)(p1)), ((java.lang.Object)(p2)))));
}


public com.moon.ae a(com.google.protobuf.Descriptors.OneofDescriptor p0) {
return ((com.moon.ae)(super.clearOneof(((com.google.protobuf.Descriptors.OneofDescriptor)(p0)))));
}


public com.moon.ae a(boolean p0) {
this.b = ((boolean)(p0));
    ((com.moon.ae)(this)).onChanged();
    return this;
}


public static final com.google.protobuf.Descriptors.Descriptor a__DescriptorsInnerDescriptor() {
return com.moon.ow.c;
}


public com.moon.ae a(com.google.protobuf.ByteString p0) { return __sourceHandlerCall_06ae2c8897f3682d35fc(this, p0); }


public java.lang.String a__String() { return __sourceHandlerCall_3d2d0aaaff295f64a45e(this); }


public com.moon.ae a__ae() {
long local1 = (com.moon.ae.f ^ 139984682994081L);
    super.clear();
    this.b = ((boolean)(false));
    this.c = ((java.lang.Object)(""));
    this.d = ((java.lang.Object)(""));
    this.e = ((java.lang.Object)(""));
    this.a = ((int)((this.a & __sourceIntrinsic_88026dfe4d6a_originalDynamicSite62_7(23752, (665722724145443130L ^ local1)))));
    return this;
}


public com.google.protobuf.ByteString a() { return __sourceHandlerCall_e7b3cf56a87c3ec299cb(this); }


public com.moon.ae a(java.lang.String p0) { return __sourceHandlerCall_842f5b19b5a8202c41ae(this, p0); }


public final boolean isInitialized() {
return ((1) != 0);
}


protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
return ((com.google.protobuf.GeneratedMessageV3.FieldAccessorTable)(com.moon.ow.d)).ensureFieldAccessorsInitialized(((java.lang.Class)(com.moon.C.class)), ((java.lang.Class)(com.moon.ae.class)));
}


public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
return com.moon.ow.c;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral389_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_88026dfe4d6a_originalDynamicSite62_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_82a3d2fa9a18_originalDynamicSite61_2(int a0, long a1) throws E;

private static native int __sourceExactCall_130a0f21fd6844(int p0, long p1);

public com.google.protobuf.MessageLite.Builder clone__MessageLiteInnerBuilder__sourceBridge_9503009a6c() {
return ((com.moon.ae)(this)).b__ae();
}

public com.google.protobuf.AbstractMessageLite.Builder clone__AbstractMessageLiteInnerBuilder__sourceBridge_4fc5aa391f() {
return ((com.moon.ae)(this)).b__ae();
}

public com.google.protobuf.AbstractMessage.Builder clone__sourceBridge_36d0769a6a() {
return ((com.moon.ae)(this)).b__ae();
}

public com.moon.ae clone() { return ((com.moon.ae)(this.clone__sourceBridge_36d0769a6a())); }
public com.google.protobuf.Message.Builder clone__MessageInnerBuilder__sourceBridge_23266bf05e() {
return ((com.moon.ae)(this)).b__ae();
}

public com.google.protobuf.GeneratedMessageV3.Builder clone__GeneratedMessageV3InnerBuilder__sourceBridge_2dd0ad8dc0() {
return ((com.moon.ae)(this)).b__ae();
}

public java.lang.Object clone__Object__sourceBridge_0502b11602() throws java.lang.CloneNotSupportedException {
return ((com.moon.ae)(this)).b__ae();
}

public com.google.protobuf.AbstractMessage.Builder clear__sourceBridge_36d0769a6a() {
return ((com.moon.ae)(this)).a__ae();
}

public com.moon.ae clear() { return ((com.moon.ae)(this.clear__sourceBridge_36d0769a6a())); }
public com.google.protobuf.Message.Builder clear__MessageInnerBuilder__sourceBridge_23266bf05e() {
return ((com.moon.ae)(this)).a__ae();
}

public com.google.protobuf.GeneratedMessageV3.Builder clear__GeneratedMessageV3InnerBuilder__sourceBridge_2dd0ad8dc0() {
return ((com.moon.ae)(this)).a__ae();
}

public com.google.protobuf.MessageLite.Builder clear__MessageLiteInnerBuilder__sourceBridge_9503009a6c() {
return ((com.moon.ae)(this)).a__ae();
}

public com.google.protobuf.MessageLite build__MessageLite__sourceBridge_99b74750a2() {
return ((com.moon.ae)(this)).b__C();
}

public com.google.protobuf.Message build__sourceBridge_561eee1e9a() {
return ((com.moon.ae)(this)).b__C();
}

public com.google.protobuf.Message build() { return ((com.google.protobuf.Message)(this.build__sourceBridge_561eee1e9a())); }
public com.google.protobuf.Message.Builder clearField__MessageInnerBuilder__sourceBridge_23e4b7b587(com.google.protobuf.Descriptors.FieldDescriptor p0) {
return ((com.moon.ae)(this)).a(((com.google.protobuf.Descriptors.FieldDescriptor)(p0)));
}

public com.google.protobuf.GeneratedMessageV3.Builder clearField__sourceBridge_e3938d6ecd(com.google.protobuf.Descriptors.FieldDescriptor p0) {
return ((com.moon.ae)(this)).a(((com.google.protobuf.Descriptors.FieldDescriptor)(p0)));
}

public com.moon.ae clearField(com.google.protobuf.Descriptors.FieldDescriptor __bridgeParam0) { return ((com.moon.ae)(this.clearField__sourceBridge_e3938d6ecd(((com.google.protobuf.Descriptors.FieldDescriptor)(__bridgeParam0))))); }
public com.google.protobuf.Message.Builder setRepeatedField__MessageInnerBuilder__sourceBridge_9e9db7eb5f(com.google.protobuf.Descriptors.FieldDescriptor p0, int p1, java.lang.Object p2) {
return ((com.moon.ae)(this)).a(((com.google.protobuf.Descriptors.FieldDescriptor)(p0)), ((int)(p1)), ((java.lang.Object)(p2)));
}

public com.google.protobuf.GeneratedMessageV3.Builder setRepeatedField__sourceBridge_6dda4cebb2(com.google.protobuf.Descriptors.FieldDescriptor p0, int p1, java.lang.Object p2) {
return ((com.moon.ae)(this)).a(((com.google.protobuf.Descriptors.FieldDescriptor)(p0)), ((int)(p1)), ((java.lang.Object)(p2)));
}

public com.moon.ae setRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor __bridgeParam0, int __bridgeParam1, java.lang.Object __bridgeParam2) { return ((com.moon.ae)(this.setRepeatedField__sourceBridge_6dda4cebb2(((com.google.protobuf.Descriptors.FieldDescriptor)(__bridgeParam0)), ((int)(__bridgeParam1)), ((java.lang.Object)(__bridgeParam2))))); }
public com.google.protobuf.GeneratedMessageV3.Builder setUnknownFields__sourceBridge_c1a02174d9(com.google.protobuf.UnknownFieldSet p0) {
return ((com.moon.ae)(this)).a(((com.google.protobuf.UnknownFieldSet)(p0)));
}

public com.moon.ae setUnknownFields(com.google.protobuf.UnknownFieldSet __bridgeParam0) { return ((com.moon.ae)(this.setUnknownFields__sourceBridge_c1a02174d9(((com.google.protobuf.UnknownFieldSet)(__bridgeParam0))))); }
public com.google.protobuf.Message.Builder setUnknownFields__MessageInnerBuilder__sourceBridge_0115284766(com.google.protobuf.UnknownFieldSet p0) {
return ((com.moon.ae)(this)).a(((com.google.protobuf.UnknownFieldSet)(p0)));
}

public com.google.protobuf.GeneratedMessageV3.Builder mergeUnknownFields__GeneratedMessageV3InnerBuilder__sourceBridge_c1a02174d9(com.google.protobuf.UnknownFieldSet p0) {
return ((com.moon.ae)(this)).b(((com.google.protobuf.UnknownFieldSet)(p0)));
}

public com.google.protobuf.Message.Builder mergeUnknownFields__MessageInnerBuilder__sourceBridge_0115284766(com.google.protobuf.UnknownFieldSet p0) {
return ((com.moon.ae)(this)).b(((com.google.protobuf.UnknownFieldSet)(p0)));
}

public com.google.protobuf.AbstractMessage.Builder mergeUnknownFields__sourceBridge_1d37e78876(com.google.protobuf.UnknownFieldSet p0) {
return ((com.moon.ae)(this)).b(((com.google.protobuf.UnknownFieldSet)(p0)));
}

public com.moon.ae mergeUnknownFields(com.google.protobuf.UnknownFieldSet __bridgeParam0) { return ((com.moon.ae)(this.mergeUnknownFields__sourceBridge_1d37e78876(((com.google.protobuf.UnknownFieldSet)(__bridgeParam0))))); }
public com.google.protobuf.Message buildPartial__sourceBridge_561eee1e9a() {
return ((com.moon.ae)(this)).c__C();
}

public com.google.protobuf.Message buildPartial() { return ((com.google.protobuf.Message)(this.buildPartial__sourceBridge_561eee1e9a())); }
public com.google.protobuf.MessageLite buildPartial__MessageLite__sourceBridge_99b74750a2() {
return ((com.moon.ae)(this)).c__C();
}

public com.google.protobuf.GeneratedMessageV3.Builder clearOneof__GeneratedMessageV3InnerBuilder__sourceBridge_cca806b01c(com.google.protobuf.Descriptors.OneofDescriptor p0) {
return ((com.moon.ae)(this)).a(((com.google.protobuf.Descriptors.OneofDescriptor)(p0)));
}

public com.google.protobuf.AbstractMessage.Builder clearOneof__sourceBridge_5f25fbcda8(com.google.protobuf.Descriptors.OneofDescriptor p0) {
return ((com.moon.ae)(this)).a(((com.google.protobuf.Descriptors.OneofDescriptor)(p0)));
}

public com.moon.ae clearOneof(com.google.protobuf.Descriptors.OneofDescriptor __bridgeParam0) { return ((com.moon.ae)(this.clearOneof__sourceBridge_5f25fbcda8(((com.google.protobuf.Descriptors.OneofDescriptor)(__bridgeParam0))))); }
public com.google.protobuf.Message.Builder clearOneof__MessageInnerBuilder__sourceBridge_ea7c504747(com.google.protobuf.Descriptors.OneofDescriptor p0) {
return ((com.moon.ae)(this)).a(((com.google.protobuf.Descriptors.OneofDescriptor)(p0)));
}

public com.google.protobuf.Message.Builder setField__MessageInnerBuilder__sourceBridge_d5d25498d5(com.google.protobuf.Descriptors.FieldDescriptor p0, java.lang.Object p1) {
return ((com.moon.ae)(this)).a(((com.google.protobuf.Descriptors.FieldDescriptor)(p0)), ((java.lang.Object)(p1)));
}

public com.google.protobuf.GeneratedMessageV3.Builder setField__sourceBridge_0269b32b8b(com.google.protobuf.Descriptors.FieldDescriptor p0, java.lang.Object p1) {
return ((com.moon.ae)(this)).a(((com.google.protobuf.Descriptors.FieldDescriptor)(p0)), ((java.lang.Object)(p1)));
}

public com.moon.ae setField(com.google.protobuf.Descriptors.FieldDescriptor __bridgeParam0, java.lang.Object __bridgeParam1) { return ((com.moon.ae)(this.setField__sourceBridge_0269b32b8b(((com.google.protobuf.Descriptors.FieldDescriptor)(__bridgeParam0)), ((java.lang.Object)(__bridgeParam1))))); }
public com.google.protobuf.GeneratedMessageV3.Builder addRepeatedField__sourceBridge_0269b32b8b(com.google.protobuf.Descriptors.FieldDescriptor p0, java.lang.Object p1) {
return ((com.moon.ae)(this)).b(((com.google.protobuf.Descriptors.FieldDescriptor)(p0)), ((java.lang.Object)(p1)));
}

public com.moon.ae addRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor __bridgeParam0, java.lang.Object __bridgeParam1) { return ((com.moon.ae)(this.addRepeatedField__sourceBridge_0269b32b8b(((com.google.protobuf.Descriptors.FieldDescriptor)(__bridgeParam0)), ((java.lang.Object)(__bridgeParam1))))); }
public com.google.protobuf.Message.Builder addRepeatedField__MessageInnerBuilder__sourceBridge_d5d25498d5(com.google.protobuf.Descriptors.FieldDescriptor p0, java.lang.Object p1) {
return ((com.moon.ae)(this)).b(((com.google.protobuf.Descriptors.FieldDescriptor)(p0)), ((java.lang.Object)(p1)));
}

public com.google.protobuf.MessageLite.Builder mergeFrom__MessageLiteInnerBuilder__sourceBridge_1f3030ddff(com.google.protobuf.CodedInputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.ae)(this)).a(((com.google.protobuf.CodedInputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)));
}

public com.google.protobuf.Message.Builder mergeFrom__MessageInnerBuilder__sourceBridge_21f2600f58(com.google.protobuf.Message p0) {
return ((com.moon.ae)(this)).a(((com.google.protobuf.Message)(p0)));
}

public com.google.protobuf.Message.Builder mergeFrom__MessageInnerBuilder__sourceBridge_d24d40278a(com.google.protobuf.CodedInputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.ae)(this)).a(((com.google.protobuf.CodedInputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)));
}

public com.google.protobuf.AbstractMessage.Builder mergeFrom__sourceBridge_811039b404(com.google.protobuf.CodedInputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.ae)(this)).a(((com.google.protobuf.CodedInputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)));
}

public com.moon.ae mergeFrom(com.google.protobuf.CodedInputStream __bridgeParam0, com.google.protobuf.ExtensionRegistryLite __bridgeParam1) throws java.io.IOException { return ((com.moon.ae)(this.mergeFrom__sourceBridge_811039b404(((com.google.protobuf.CodedInputStream)(__bridgeParam0)), ((com.google.protobuf.ExtensionRegistryLite)(__bridgeParam1))))); }
public com.google.protobuf.AbstractMessage.Builder mergeFrom__sourceBridge_0e6f230f8a(com.google.protobuf.Message p0) {
return ((com.moon.ae)(this)).a(((com.google.protobuf.Message)(p0)));
}

public com.moon.ae mergeFrom(com.google.protobuf.Message __bridgeParam0) { return ((com.moon.ae)(this.mergeFrom__sourceBridge_0e6f230f8a(((com.google.protobuf.Message)(__bridgeParam0))))); }
public com.google.protobuf.AbstractMessageLite.Builder mergeFrom__AbstractMessageLiteInnerBuilder__sourceBridge_b3429bd776(com.google.protobuf.CodedInputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.ae)(this)).a(((com.google.protobuf.CodedInputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)));
}

public com.google.protobuf.Message getDefaultInstanceForType__sourceBridge_561eee1e9a() {
return ((com.moon.ae)(this)).a__C();
}

public com.google.protobuf.Message getDefaultInstanceForType() { return ((com.google.protobuf.Message)(this.getDefaultInstanceForType__sourceBridge_561eee1e9a())); }
public com.google.protobuf.MessageLite getDefaultInstanceForType__MessageLite__sourceBridge_99b74750a2() {
return ((com.moon.ae)(this)).a__C();
}

}
