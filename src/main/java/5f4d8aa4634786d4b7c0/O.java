package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public final class O extends com.google.protobuf.GeneratedMessageV3 implements com.moon.oM {

private static long serialVersionUID = 0L;

private volatile java.lang.Object a;

private byte b;

private static com.moon.O c;

private static com.google.protobuf.Parser<com.moon.O> d;

private static long e;

private static long[] f;

private static java.lang.Integer[] g;

private static java.util.Map h;

private O(com.google.protobuf.GeneratedMessageV3.Builder<?> p0) {
super(p0);
    this.b = -1;
}


private O() {
super();
    this.b = -1;
    this.a = "";
}


static {
e = ((long)(((moom._a)(moom._c.a(((long)(-612244490433683487L)), ((long)(606806915106837180L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(36582549555532L)))));
    h = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.O.e ^ 109169299164268L);
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
    long[] local8_life19 = new long[5];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "\016´¯oª`(È*;óèÀY7\002ß+Û\fa"))).length();
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
    local7_life23 = ((java.lang.String)((local6_life21 = "<÷ª².Õ\013Qa&Ü\020û\006^"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill12_38 = local6_life21;
        int __sourceSpill12_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill12_38)).substring(((int)(__sourceSpill12_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill12_43 = local8_life19;
        int __sourceSpill12_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill12_46 = new byte[8];
        (__sourceSpill12_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill12_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill12_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill12_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill12_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill12_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill12_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill12_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill12_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill12_47)).doFinal(((byte[])(__sourceSpill12_46)));
        (__sourceSpill12_43)[__sourceSpill12_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    f = ((long[])(local8_life19));
    g = ((java.lang.Integer[])(new java.lang.Integer[5]));
    c = ((com.moon.O)(new com.moon.O()));
    d = ((com.google.protobuf.Parser)(new com.moon.m()));
}

private static native <E extends Throwable> com.google.protobuf.ByteString __sourceHandlerCall_9d9085827db0c01f2b67(com.moon.O a0) throws E;
private static final class __SourceHandler_9d9085827db0c01f2b67 {

public static com.google.protobuf.ByteString f99(com.moon.O receiver) throws Throwable {
    java.lang.Object forwardValue99_24_0;
    java.lang.String[] spill99_0;
    java.lang.Object spill99_1;
    long life1_3;
    java.lang.Object life4_7;
    java.lang.String[] life3_8;
    com.google.protobuf.ByteString life5_20;
    forward_join_24: {
    forward_join_23: {
    life1_3 = (__fieldRead99_0() ^ 59321767961497L);
    spill99_0 = __call99_1();
    life4_7 = __fieldRead99_2(receiver);
    life3_8 = spill99_0;
    spill99_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue99_24_0 = spill99_1;
        break forward_join_24;
    }
    if (!((__instanceOf99_3(spill99_1) != 0))) {
        break forward_join_23;
    }
    life5_20 = __call99_5(__cast99_4(life4_7));
    __fieldWrite99_6(receiver, life5_20);
    return life5_20;
    }
    forwardValue99_24_0 = life4_7;
    }
    return __cast99_7(forwardValue99_24_0);
}
public static void h99_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1009900_0(p0);
}
private static native long __fieldRead99_0() throws Throwable;
private static native java.lang.String[] __call99_1() throws Throwable;
private static native java.lang.Object __fieldRead99_2(com.moon.O a0) throws Throwable;
private static native int __instanceOf99_3(java.lang.Object a0) throws Throwable;
private static native java.lang.String __cast99_4(java.lang.Object a0) throws Throwable;
private static native com.google.protobuf.ByteString __call99_5(java.lang.String a0) throws Throwable;
private static native void __fieldWrite99_6(com.moon.O a0, com.google.protobuf.ByteString a1) throws Throwable;
private static native com.google.protobuf.ByteString __cast99_7(java.lang.Object a0) throws Throwable;
private static native java.lang.Exception __call1009900_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_64db7542d304e6982a2b(com.moon.O a0) throws E;
private static final class __SourceHandler_64db7542d304e6982a2b {

public static java.lang.String f100(com.moon.O receiver) throws Throwable {
    java.lang.Object forwardValue100_18_0;
    java.lang.String[] spill100_0;
    java.lang.Object spill100_1;
    long life1_3;
    java.lang.Object life4_7;
    java.lang.String[] life3_8;
    com.google.protobuf.ByteString life5_24;
    java.lang.String life6_27;
    forward_join_18: {
    forward_join_17: {
    life1_3 = (__fieldRead100_0() ^ 62837020101684L);
    spill100_0 = __call100_1();
    life4_7 = __fieldRead100_2(receiver);
    life3_8 = spill100_0;
    spill100_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue100_18_0 = spill100_1;
        break forward_join_18;
    }
    if (!((__instanceOf100_3(spill100_1) != 0))) {
        break forward_join_17;
    }
    return __cast100_4(life4_7);
    }
    forwardValue100_18_0 = life4_7;
    }
    life5_24 = __cast100_5(forwardValue100_18_0);
    life6_27 = __call100_6(life5_24);
    __fieldWrite100_7(receiver, life6_27);
    return life6_27;
}
public static void h100_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1010000_0(p0);
}
public static void h100_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1010001_0(p0);
}
private static native long __fieldRead100_0() throws Throwable;
private static native java.lang.String[] __call100_1() throws Throwable;
private static native java.lang.Object __fieldRead100_2(com.moon.O a0) throws Throwable;
private static native int __instanceOf100_3(java.lang.Object a0) throws Throwable;
private static native java.lang.String __cast100_4(java.lang.Object a0) throws Throwable;
private static native com.google.protobuf.ByteString __cast100_5(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call100_6(com.google.protobuf.ByteString a0) throws Throwable;
private static native void __fieldWrite100_7(com.moon.O a0, java.lang.String a1) throws Throwable;
private static native java.lang.Exception __call1010000_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1010001_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.aq __sourceHandlerCall_29326f7172df2b00dafe(com.moon.O a0) throws E;
private static final class __SourceHandler_29326f7172df2b00dafe {

public static com.moon.aq f118(com.moon.O receiver) throws Throwable {
    long life1_3;
    life1_3 = (__fieldRead118_0() ^ 111681975378256L);
    return ((receiver == __fieldRead118_1()) ? new com.moon.aq() : __call118_2(new com.moon.aq(), receiver));
}
public static void h118_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1011800_0(p0);
}
private static native long __fieldRead118_0() throws Throwable;
private static native com.moon.O __fieldRead118_1() throws Throwable;
private static native com.moon.aq __call118_2(com.moon.aq a0, com.moon.O a1) throws Throwable;
private static native java.lang.Exception __call1011800_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_f8c0775a15dc80d4d3e7(com.moon.O a0, java.lang.Object a1) throws E;
private static final class __SourceHandler_f8c0775a15dc80d4d3e7 {

public static boolean f101(com.moon.O receiver, java.lang.Object p0) throws Throwable {
    java.lang.Object forwardValue101_14_0;
    java.lang.Object forwardValue101_23_0;
    int forwardValue101_40_0;
    int forwardValue101_46_0;
    java.lang.Object spill101_0;
    boolean spill101_1;
    long life2_3;
    java.lang.String[] life4_5;
    com.moon.O life5_34;
    forward_join_46: {
    forward_join_45: {
    forward_join_40: {
    forward_join_35: {
    forward_join_23: {
    forward_join_22: {
    forward_join_14: {
    forward_join_13: {
    life2_3 = (__fieldRead101_0() ^ 11729759087278L);
    life4_5 = __call101_1();
    spill101_0 = p0;
    if (!((life4_5 == null))) {
        forwardValue101_14_0 = spill101_0;
        break forward_join_14;
    }
    if (!((spill101_0 == receiver))) {
        break forward_join_13;
    }
    return __integerCategory101_2(1);
    }
    forwardValue101_14_0 = p0;
    }
    if (!((life4_5 == null))) {
        forwardValue101_23_0 = forwardValue101_14_0;
        break forward_join_23;
    }
    if (!((__instanceOf101_3(forwardValue101_14_0) == 0))) {
        break forward_join_22;
    }
    return __call101_4(receiver, p0);
    }
    forwardValue101_23_0 = p0;
    }
    life5_34 = __cast101_5(forwardValue101_23_0);
    spill101_1 = __call101_8(__call101_6(receiver), __call101_7(life5_34));
    if (!((life4_5 == null))) {
        forwardValue101_40_0 = __integerCategory101_9(spill101_1);
        break forward_join_40;
    }
    if (!((!spill101_1))) {
        break forward_join_35;
    }
    return __integerCategory101_10(0);
    }
    forwardValue101_40_0 = __integerCategory101_14(__call101_13(__call101_11(receiver), __call101_12(life5_34)));
    }
    if (!((life4_5 == null))) {
        forwardValue101_46_0 = forwardValue101_40_0;
        break forward_join_46;
    }
    if (!((forwardValue101_40_0 == 0))) {
        break forward_join_45;
    }
    return __integerCategory101_15(0);
    }
    forwardValue101_46_0 = 1;
    }
    return __integerCategory101_16(forwardValue101_46_0);
}
public static void h101_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1010100_0(p0);
}
public static void h101_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1010101_0(p0);
}
public static void h101_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1010102_0(p0);
}
public static void h101_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1010103_0(p0);
}
public static void h101_4(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1010104_0(p0);
}
public static void h101_5(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1010105_0(p0);
}
public static void h101_6(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1010106_0(p0);
}
public static void h101_7(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1010107_0(p0);
}
private static native long __fieldRead101_0() throws Throwable;
private static native java.lang.String[] __call101_1() throws Throwable;
private static native boolean __integerCategory101_2(int value) throws Throwable;
private static native int __instanceOf101_3(java.lang.Object a0) throws Throwable;
private static native boolean __call101_4(com.moon.O a0, java.lang.Object a1) throws Throwable;
private static native com.moon.O __cast101_5(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call101_6(com.moon.O a0) throws Throwable;
private static native java.lang.String __call101_7(com.moon.O a0) throws Throwable;
private static native boolean __call101_8(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory101_9(boolean value) throws Throwable;
private static native boolean __integerCategory101_10(int value) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call101_11(com.moon.O a0) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call101_12(com.moon.O a0) throws Throwable;
private static native boolean __call101_13(com.google.protobuf.UnknownFieldSet a0, com.google.protobuf.UnknownFieldSet a1) throws Throwable;
private static native int __integerCategory101_14(boolean value) throws Throwable;
private static native boolean __integerCategory101_15(int value) throws Throwable;
private static native boolean __integerCategory101_16(int value) throws Throwable;
private static native java.lang.Exception __call1010100_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1010101_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1010102_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1010103_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1010104_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1010105_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1010106_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1010107_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_ce419ab6c882f971e10c(com.moon.O a0) throws E;
private static final class __SourceHandler_ce419ab6c882f971e10c {

public static int f102(com.moon.O receiver) throws Throwable {
    int forwardValue102_21_0;
    int forwardValue102_41_0;
    java.lang.String[] spill102_0;
    int spill102_1;
    long life1_3;
    int life4_7;
    java.lang.String[] life3_8;
    int life4_44;
    forward_join_41: {
    forward_join_31: {
    forward_join_21: {
    forward_join_16: {
    life1_3 = (__fieldRead102_0() ^ 59548969174727L);
    spill102_0 = __call102_1();
    life4_7 = __fieldRead102_2(receiver);
    life3_8 = spill102_0;
    spill102_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue102_21_0 = spill102_1;
        break forward_join_21;
    }
    if (!((spill102_1 != -1))) {
        break forward_join_16;
    }
    return life4_7;
    }
    life4_7 = 0;
    forwardValue102_21_0 = __integerCategory102_5(__call102_4(__fieldRead102_3(receiver)));
    }
    if (!((life3_8 == null))) {
        forwardValue102_41_0 = forwardValue102_21_0;
        break forward_join_41;
    }
    if (!((forwardValue102_21_0 == 0))) {
        break forward_join_31;
    }
    life4_7 = (life4_7 + __call102_7(1, __fieldRead102_6(receiver)));
    }
    life4_44 = (life4_7 + __call102_9(__call102_8(receiver)));
    __fieldWrite102_10(receiver, life4_44);
    forwardValue102_41_0 = life4_44;
    }
    return forwardValue102_41_0;
}
public static void h102_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1010200_0(p0);
}
public static void h102_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1010201_0(p0);
}
public static void h102_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1010202_0(p0);
}
private static native long __fieldRead102_0() throws Throwable;
private static native java.lang.String[] __call102_1() throws Throwable;
private static native int __fieldRead102_2(com.moon.O a0) throws Throwable;
private static native java.lang.Object __fieldRead102_3(com.moon.O a0) throws Throwable;
private static native boolean __call102_4(java.lang.Object a0) throws Throwable;
private static native int __integerCategory102_5(boolean value) throws Throwable;
private static native java.lang.Object __fieldRead102_6(com.moon.O a0) throws Throwable;
private static native int __call102_7(int a0, java.lang.Object a1) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call102_8(com.moon.O a0) throws Throwable;
private static native int __call102_9(com.google.protobuf.UnknownFieldSet a0) throws Throwable;
private static native void __fieldWrite102_10(com.moon.O a0, int a1) throws Throwable;
private static native java.lang.Exception __call1010200_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1010201_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1010202_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_76af7a4722e91e364256(com.moon.O a0) throws E;
private static final class __SourceHandler_76af7a4722e91e364256 {

public static int f103(com.moon.O receiver) throws Throwable {
    int forwardValue103_19_0;
    int spill103_0;
    long life1_3;
    java.lang.String[] life3_5;
    int life4_24;
    int life4_35;
    int life4_45;
    int life4_57;
    int life4_69;
    forward_join_19: {
    forward_join_14: {
    life1_3 = (__fieldRead103_0() ^ 73098932066940L);
    life3_5 = __call103_1();
    spill103_0 = __fieldRead103_2(receiver);
    if (!((life3_5 == null))) {
        forwardValue103_19_0 = spill103_0;
        break forward_join_19;
    }
    if (!((spill103_0 != 0))) {
        break forward_join_14;
    }
    return __fieldRead103_3(receiver);
    }
    forwardValue103_19_0 = __invokedynamic103_4(7142, (5762874003937263882L ^ life1_3));
    }
    life4_24 = forwardValue103_19_0;
    life4_35 = ((__invokedynamic103_5(22242, (562159513654086665L ^ life1_3)) * life4_24) + __call103_7(__call103_6()));
    life4_45 = ((__invokedynamic103_8(15, (6862004427413068512L ^ life1_3)) * life4_35) + 1);
    life4_57 = ((__invokedynamic103_9(5998, (1451496794108497280L ^ life1_3)) * life4_45) + __call103_11(__call103_10(receiver)));
    life4_69 = ((__invokedynamic103_12(15797, (8336852028608718680L ^ life1_3)) * life4_57) + __call103_14(__call103_13(receiver)));
    __fieldWrite103_15(receiver, life4_69);
    return life4_69;
}
public static void h103_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1010300_0(p0);
}
public static void h103_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1010301_0(p0);
}
private static native long __fieldRead103_0() throws Throwable;
private static native java.lang.String[] __call103_1() throws Throwable;
private static native int __fieldRead103_2(com.moon.O a0) throws Throwable;
private static native int __fieldRead103_3(com.moon.O a0) throws Throwable;
private static native int __invokedynamic103_4(int a0, long a1) throws Throwable;
private static native int __invokedynamic103_5(int a0, long a1) throws Throwable;
private static native com.google.protobuf.Descriptors.Descriptor __call103_6() throws Throwable;
private static native int __call103_7(com.google.protobuf.Descriptors.Descriptor a0) throws Throwable;
private static native int __invokedynamic103_8(int a0, long a1) throws Throwable;
private static native int __invokedynamic103_9(int a0, long a1) throws Throwable;
private static native java.lang.String __call103_10(com.moon.O a0) throws Throwable;
private static native int __call103_11(java.lang.String a0) throws Throwable;
private static native int __invokedynamic103_12(int a0, long a1) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call103_13(com.moon.O a0) throws Throwable;
private static native int __call103_14(com.google.protobuf.UnknownFieldSet a0) throws Throwable;
private static native void __fieldWrite103_15(com.moon.O a0, int a1) throws Throwable;
private static native java.lang.Exception __call1010300_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1010301_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_886c762a78ccad67fe55(com.moon.O a0) throws E;
private static final class __SourceHandler_886c762a78ccad67fe55 {

public static boolean f104(com.moon.O receiver) throws Throwable {
    int forwardValue104_17_0;
    int forwardValue104_26_0;
    java.lang.String[] spill104_0;
    int spill104_1;
    long life1_3;
    int life4_7;
    java.lang.String[] life3_8;
    forward_join_26: {
    forward_join_22: {
    forward_join_17: {
    forward_join_16: {
    life1_3 = (__fieldRead104_0() ^ 81654843177643L);
    spill104_0 = __call104_1();
    life4_7 = __fieldRead104_2(receiver);
    life3_8 = spill104_0;
    spill104_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue104_17_0 = spill104_1;
        break forward_join_17;
    }
    if (!((spill104_1 == 1))) {
        break forward_join_16;
    }
    return __integerCategory104_3(1);
    }
    forwardValue104_17_0 = life4_7;
    }
    if (!((life3_8 == null))) {
        forwardValue104_26_0 = forwardValue104_17_0;
        break forward_join_26;
    }
    if (!((forwardValue104_17_0 == 0))) {
        break forward_join_22;
    }
    return __integerCategory104_4(0);
    }
    __fieldWrite104_5(receiver, 1);
    forwardValue104_26_0 = 1;
    }
    return __integerCategory104_6(forwardValue104_26_0);
}
public static void h104_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1010400_0(p0);
}
public static void h104_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1010401_0(p0);
}
public static void h104_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1010402_0(p0);
}
public static void h104_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1010403_0(p0);
}
private static native long __fieldRead104_0() throws Throwable;
private static native java.lang.String[] __call104_1() throws Throwable;
private static native byte __fieldRead104_2(com.moon.O a0) throws Throwable;
private static native boolean __integerCategory104_3(int value) throws Throwable;
private static native boolean __integerCategory104_4(int value) throws Throwable;
private static native void __fieldWrite104_5(com.moon.O a0, int a1) throws Throwable;
private static native boolean __integerCategory104_6(int value) throws Throwable;
private static native java.lang.Exception __call1010400_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1010401_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1010402_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1010403_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_5ac7b933019574c6c3ad(com.moon.O a0, com.google.protobuf.CodedOutputStream a1) throws E;
private static final class __SourceHandler_5ac7b933019574c6c3ad {

public static void f105(com.moon.O receiver, com.google.protobuf.CodedOutputStream p0) throws Throwable {
    com.moon.O forwardValue105_18_0;
    com.moon.O spill105_0;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_18: {
    forward_join_17: {
    life2_3 = (__fieldRead105_0() ^ 104374232664584L);
    life4_5 = __call105_1();
    spill105_0 = receiver;
    if (!((life4_5 == null))) {
        forwardValue105_18_0 = spill105_0;
        break forward_join_18;
    }
    if (!((!__call105_3(__fieldRead105_2(spill105_0))))) {
        break forward_join_17;
    }
    __call105_5(p0, 1, __fieldRead105_4(receiver));
    }
    forwardValue105_18_0 = receiver;
    }
    __call105_7(__call105_6(forwardValue105_18_0), p0);
    return;
}
public static void h105_0(java.io.IOException p0) throws Throwable {
    throw __call1010500_0(p0);
}
public static void h105_1(java.io.IOException p0) throws Throwable {
    throw __call1010501_0(p0);
}
private static native long __fieldRead105_0() throws Throwable;
private static native java.lang.String[] __call105_1() throws Throwable;
private static native java.lang.Object __fieldRead105_2(com.moon.O a0) throws Throwable;
private static native boolean __call105_3(java.lang.Object a0) throws Throwable;
private static native java.lang.Object __fieldRead105_4(com.moon.O a0) throws Throwable;
private static native void __call105_5(com.google.protobuf.CodedOutputStream a0, int a1, java.lang.Object a2) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call105_6(com.moon.O a0) throws Throwable;
private static native void __call105_7(com.google.protobuf.UnknownFieldSet a0, com.google.protobuf.CodedOutputStream a1) throws Throwable;
private static native java.lang.Exception __call1010500_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1010501_0(java.io.IOException a0) throws Throwable;

}


public boolean equals(java.lang.Object p0) { return __sourceHandlerCall_f8c0775a15dc80d4d3e7(this, p0); }


public int hashCode() { return __sourceHandlerCall_76af7a4722e91e364256(this); }


public com.moon.O b() {
return com.moon.O.c;
}


public static com.moon.aq b__aq() {
return ((com.moon.O)(com.moon.O.c)).c();
}


public static com.moon.O b(java.io.InputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.O)(com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(((com.google.protobuf.Parser)(com.moon.O.d)), ((java.io.InputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public static com.moon.O b(java.io.InputStream p0) throws java.io.IOException {
return ((com.moon.O)(com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(((com.google.protobuf.Parser)(com.moon.O.d)), ((java.io.InputStream)(p0)))));
}


public com.moon.aq c() { return __sourceHandlerCall_29326f7172df2b00dafe(this); }


public static com.moon.O a(com.google.protobuf.CodedInputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.O)(com.google.protobuf.GeneratedMessageV3.parseWithIOException(((com.google.protobuf.Parser)(com.moon.O.d)), ((com.google.protobuf.CodedInputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public static com.moon.aq a(com.moon.O p0) {
return ((com.moon.aq)(((com.moon.O)(com.moon.O.c)).c())).a(((com.moon.O)(p0)));
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 9749;
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
            throw new RuntimeException("com/moon/O", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         g[var3] = var15;
      }

      return g[var3];
}


public static com.moon.O a(com.google.protobuf.CodedInputStream p0) throws java.io.IOException {
return ((com.moon.O)(com.google.protobuf.GeneratedMessageV3.parseWithIOException(((com.google.protobuf.Parser)(com.moon.O.d)), ((com.google.protobuf.CodedInputStream)(p0)))));
}


public com.moon.aq a__aq() {
return com.moon.O.b__aq();
}


public static com.google.protobuf.Parser<com.moon.O> a__Parser() {
return com.moon.O.d;
}


static void a__Void(com.google.protobuf.ByteString p0) throws java.lang.IllegalArgumentException {
com.moon.O.checkByteStringIsUtf8(((com.google.protobuf.ByteString)(p0)));
    return;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.O.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public static com.moon.O a__O() {
return com.moon.O.c;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral133_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/O"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


protected com.moon.aq a(com.google.protobuf.GeneratedMessageV3.BuilderParent p0) {
com.moon.aq local2 = new com.moon.aq(p0);
    return local2;
}


public static com.moon.O a(com.google.protobuf.ByteString p0) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.O)(((com.google.protobuf.Parser)(com.moon.O.d)).parseFrom(((com.google.protobuf.ByteString)(p0)))));
}


public static com.moon.O a(java.nio.ByteBuffer p0, com.google.protobuf.ExtensionRegistryLite p1) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.O)(((com.google.protobuf.Parser)(com.moon.O.d)).parseFrom(((java.nio.ByteBuffer)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public static com.moon.O a(java.nio.ByteBuffer p0) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.O)(((com.google.protobuf.Parser)(com.moon.O.d)).parseFrom(((java.nio.ByteBuffer)(p0)))));
}


public static final com.google.protobuf.Descriptors.Descriptor a__DescriptorsInnerDescriptor() {
return com.moon.oF.k;
}


public java.lang.String a__String() { return __sourceHandlerCall_64db7542d304e6982a2b(this); }


public com.google.protobuf.ByteString a() { return __sourceHandlerCall_9d9085827db0c01f2b67(this); }


public static com.moon.O a(java.io.InputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.O)(com.google.protobuf.GeneratedMessageV3.parseWithIOException(((com.google.protobuf.Parser)(com.moon.O.d)), ((java.io.InputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public static com.moon.O a(java.io.InputStream p0) throws java.io.IOException {
return ((com.moon.O)(com.google.protobuf.GeneratedMessageV3.parseWithIOException(((com.google.protobuf.Parser)(com.moon.O.d)), ((java.io.InputStream)(p0)))));
}


public static com.moon.O a(byte[] p0, com.google.protobuf.ExtensionRegistryLite p1) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.O)(((com.google.protobuf.Parser)(com.moon.O.d)).parseFrom(((byte[])(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public static com.moon.O a(byte[] p0) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.O)(((com.google.protobuf.Parser)(com.moon.O.d)).parseFrom(((byte[])(p0)))));
}


public static com.moon.O a(com.google.protobuf.ByteString p0, com.google.protobuf.ExtensionRegistryLite p1) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.O)(((com.google.protobuf.Parser)(com.moon.O.d)).parseFrom(((com.google.protobuf.ByteString)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


protected java.lang.Object newInstance(com.google.protobuf.GeneratedMessageV3.UnusedPrivateParameter p0) {
return new com.moon.O();
}


public void writeTo(com.google.protobuf.CodedOutputStream p0) throws java.io.IOException { __sourceHandlerCall_5ac7b933019574c6c3ad(this, p0); }


public final boolean isInitialized() { return __sourceHandlerCall_886c762a78ccad67fe55(this); }


protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
return ((com.google.protobuf.GeneratedMessageV3.FieldAccessorTable)(com.moon.oF.l)).ensureFieldAccessorsInitialized(((java.lang.Class)(com.moon.O.class)), ((java.lang.Class)(com.moon.aq.class)));
}


public com.google.protobuf.MessageLite.Builder toBuilder__MessageLiteInnerBuilder() {
return ((com.moon.O)(this)).c();
}


public com.google.protobuf.Message.Builder toBuilder() {
return ((com.moon.O)(this)).c();
}


public com.google.protobuf.Message getDefaultInstanceForType() {
return ((com.moon.O)(this)).b();
}


public com.google.protobuf.MessageLite getDefaultInstanceForType__MessageLite() {
return ((com.moon.O)(this)).b();
}


public com.google.protobuf.Parser<com.moon.O> getParserForType() {
return com.moon.O.d;
}


public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
return this.unknownFields;
}


public int getSerializedSize() { return __sourceHandlerCall_ce419ab6c882f971e10c(this); }


protected com.google.protobuf.Message.Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent p0) {
return ((com.moon.O)(this)).a(((com.google.protobuf.GeneratedMessageV3.BuilderParent)(p0)));
}


public com.google.protobuf.Message.Builder newBuilderForType() {
return ((com.moon.O)(this)).a__aq();
}


public com.google.protobuf.MessageLite.Builder newBuilderForType__MessageLiteInnerBuilder() {
return ((com.moon.O)(this)).a__aq();
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral133_0() throws E;
}
