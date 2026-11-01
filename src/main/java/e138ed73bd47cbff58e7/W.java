package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public final class W extends com.google.protobuf.GeneratedMessageV3 implements com.moon.oU {

private static long serialVersionUID = 0L;

private volatile java.lang.Object a;

private byte b;

private static com.moon.W c;

private static com.google.protobuf.Parser<com.moon.W> d;

private static long e;

private static long[] f;

private static java.lang.Integer[] g;

private static java.util.Map h;

private W(com.google.protobuf.GeneratedMessageV3.Builder<?> p0) {
super(p0);
    this.b = -1;
}


private W() {
super();
    this.b = -1;
    this.a = "";
}


static {
e = ((long)(((moom._a)(moom._c.a(((long)(5365987422089747289L)), ((long)(-206497048427082924L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(114309491115022L)))));
    h = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.W.e ^ 99475867903002L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill20_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill20_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill20_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill20_14 = new byte[8];
    (__sourceSpill20_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill20_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation20_16 = __sourceSpill20_14;
    ((javax.crypto.Cipher)(__sourceSpill20_11)).init(((int)(__sourceSpill20_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill20_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation20_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[5];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "%nd* s=2IùÂ\025så\034©E³_\002î\006Ç"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill20_25 = local6_life21;
        int __sourceSpill20_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill20_25)).substring(((int)(__sourceSpill20_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill20_30 = local8_life19;
        int __sourceSpill20_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill20_33 = new byte[8];
        (__sourceSpill20_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill20_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill20_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill20_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill20_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill20_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill20_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill20_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill20_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill20_34)).doFinal(((byte[])(__sourceSpill20_33)));
        (__sourceSpill20_30)[__sourceSpill20_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "\"8ºµ/8\tðH¥Nw¿º"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill20_38 = local6_life21;
        int __sourceSpill20_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill20_38)).substring(((int)(__sourceSpill20_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill20_43 = local8_life19;
        int __sourceSpill20_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill20_46 = new byte[8];
        (__sourceSpill20_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill20_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill20_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill20_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill20_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill20_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill20_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill20_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill20_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill20_47)).doFinal(((byte[])(__sourceSpill20_46)));
        (__sourceSpill20_43)[__sourceSpill20_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    f = ((long[])(local8_life19));
    g = ((java.lang.Integer[])(new java.lang.Integer[5]));
    c = ((com.moon.W)(new com.moon.W()));
    d = ((com.google.protobuf.Parser)(new com.moon.u()));
}

private static native <E extends Throwable> com.google.protobuf.ByteString __sourceHandlerCall_3536e3f11e525365848d(com.moon.W a0) throws E;
private static final class __SourceHandler_3536e3f11e525365848d {

public static com.google.protobuf.ByteString f161(com.moon.W receiver) throws Throwable {
    java.lang.Object forwardValue161_24_0;
    java.lang.String[] spill161_0;
    java.lang.Object spill161_1;
    long life1_3;
    java.lang.Object life4_7;
    java.lang.String[] life3_8;
    com.google.protobuf.ByteString life5_20;
    forward_join_24: {
    forward_join_23: {
    life1_3 = (__fieldRead161_0() ^ 33212147839217L);
    spill161_0 = __call161_1();
    life4_7 = __fieldRead161_2(receiver);
    life3_8 = spill161_0;
    spill161_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue161_24_0 = spill161_1;
        break forward_join_24;
    }
    if (!((__instanceOf161_3(spill161_1) != 0))) {
        break forward_join_23;
    }
    life5_20 = __call161_5(__cast161_4(life4_7));
    __fieldWrite161_6(receiver, life5_20);
    return life5_20;
    }
    forwardValue161_24_0 = life4_7;
    }
    return __cast161_7(forwardValue161_24_0);
}
public static void h161_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1016100_0(p0);
}
private static native long __fieldRead161_0() throws Throwable;
private static native java.lang.String[] __call161_1() throws Throwable;
private static native java.lang.Object __fieldRead161_2(com.moon.W a0) throws Throwable;
private static native int __instanceOf161_3(java.lang.Object a0) throws Throwable;
private static native java.lang.String __cast161_4(java.lang.Object a0) throws Throwable;
private static native com.google.protobuf.ByteString __call161_5(java.lang.String a0) throws Throwable;
private static native void __fieldWrite161_6(com.moon.W a0, com.google.protobuf.ByteString a1) throws Throwable;
private static native com.google.protobuf.ByteString __cast161_7(java.lang.Object a0) throws Throwable;
private static native java.lang.Exception __call1016100_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_35bd77ba33cf92b11181(com.moon.W a0) throws E;
private static final class __SourceHandler_35bd77ba33cf92b11181 {

public static java.lang.String f162(com.moon.W receiver) throws Throwable {
    java.lang.Object forwardValue162_18_0;
    java.lang.String[] spill162_0;
    java.lang.Object spill162_1;
    long life1_3;
    java.lang.Object life4_7;
    java.lang.String[] life3_8;
    com.google.protobuf.ByteString life5_24;
    java.lang.String life6_27;
    forward_join_18: {
    forward_join_17: {
    life1_3 = (__fieldRead162_0() ^ 55743718177783L);
    spill162_0 = __call162_1();
    life4_7 = __fieldRead162_2(receiver);
    life3_8 = spill162_0;
    spill162_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue162_18_0 = spill162_1;
        break forward_join_18;
    }
    if (!((__instanceOf162_3(spill162_1) != 0))) {
        break forward_join_17;
    }
    return __cast162_4(life4_7);
    }
    forwardValue162_18_0 = life4_7;
    }
    life5_24 = __cast162_5(forwardValue162_18_0);
    life6_27 = __call162_6(life5_24);
    __fieldWrite162_7(receiver, life6_27);
    return life6_27;
}
public static void h162_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1016200_0(p0);
}
public static void h162_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1016201_0(p0);
}
private static native long __fieldRead162_0() throws Throwable;
private static native java.lang.String[] __call162_1() throws Throwable;
private static native java.lang.Object __fieldRead162_2(com.moon.W a0) throws Throwable;
private static native int __instanceOf162_3(java.lang.Object a0) throws Throwable;
private static native java.lang.String __cast162_4(java.lang.Object a0) throws Throwable;
private static native com.google.protobuf.ByteString __cast162_5(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call162_6(com.google.protobuf.ByteString a0) throws Throwable;
private static native void __fieldWrite162_7(com.moon.W a0, java.lang.String a1) throws Throwable;
private static native java.lang.Exception __call1016200_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1016201_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.ay __sourceHandlerCall_f72ae7c5f8f7f67bc08b(com.moon.W a0) throws E;
private static final class __SourceHandler_f72ae7c5f8f7f67bc08b {

public static com.moon.ay f188(com.moon.W receiver) throws Throwable {
    long life1_3;
    life1_3 = (__fieldRead188_0() ^ 76346113025751L);
    return ((receiver == __fieldRead188_1()) ? new com.moon.ay() : __call188_2(new com.moon.ay(), receiver));
}
public static void h188_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1018800_0(p0);
}
private static native long __fieldRead188_0() throws Throwable;
private static native com.moon.W __fieldRead188_1() throws Throwable;
private static native com.moon.ay __call188_2(com.moon.ay a0, com.moon.W a1) throws Throwable;
private static native java.lang.Exception __call1018800_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_2ae5c54256c0a3cbdb7a(com.moon.W a0, java.lang.Object a1) throws E;
private static final class __SourceHandler_2ae5c54256c0a3cbdb7a {

public static boolean f163(com.moon.W receiver, java.lang.Object p0) throws Throwable {
    java.lang.Object forwardValue163_14_0;
    java.lang.Object forwardValue163_23_0;
    int forwardValue163_40_0;
    int forwardValue163_46_0;
    java.lang.Object spill163_0;
    boolean spill163_1;
    long life2_3;
    java.lang.String[] life4_5;
    com.moon.W life5_34;
    forward_join_46: {
    forward_join_45: {
    forward_join_40: {
    forward_join_35: {
    forward_join_23: {
    forward_join_22: {
    forward_join_14: {
    forward_join_13: {
    life2_3 = (__fieldRead163_0() ^ 109679964083048L);
    life4_5 = __call163_1();
    spill163_0 = p0;
    if (!((life4_5 == null))) {
        forwardValue163_14_0 = spill163_0;
        break forward_join_14;
    }
    if (!((spill163_0 == receiver))) {
        break forward_join_13;
    }
    return __integerCategory163_2(1);
    }
    forwardValue163_14_0 = p0;
    }
    if (!((life4_5 == null))) {
        forwardValue163_23_0 = forwardValue163_14_0;
        break forward_join_23;
    }
    if (!((__instanceOf163_3(forwardValue163_14_0) == 0))) {
        break forward_join_22;
    }
    return __call163_4(receiver, p0);
    }
    forwardValue163_23_0 = p0;
    }
    life5_34 = __cast163_5(forwardValue163_23_0);
    spill163_1 = __call163_8(__call163_6(receiver), __call163_7(life5_34));
    if (!((life4_5 == null))) {
        forwardValue163_40_0 = __integerCategory163_9(spill163_1);
        break forward_join_40;
    }
    if (!((!spill163_1))) {
        break forward_join_35;
    }
    return __integerCategory163_10(0);
    }
    forwardValue163_40_0 = __integerCategory163_14(__call163_13(__call163_11(receiver), __call163_12(life5_34)));
    }
    if (!((life4_5 == null))) {
        forwardValue163_46_0 = forwardValue163_40_0;
        break forward_join_46;
    }
    if (!((forwardValue163_40_0 == 0))) {
        break forward_join_45;
    }
    return __integerCategory163_15(0);
    }
    forwardValue163_46_0 = 1;
    }
    return __integerCategory163_16(forwardValue163_46_0);
}
public static void h163_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1016300_0(p0);
}
public static void h163_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1016301_0(p0);
}
public static void h163_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1016302_0(p0);
}
public static void h163_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1016303_0(p0);
}
public static void h163_4(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1016304_0(p0);
}
public static void h163_5(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1016305_0(p0);
}
public static void h163_6(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1016306_0(p0);
}
public static void h163_7(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1016307_0(p0);
}
private static native long __fieldRead163_0() throws Throwable;
private static native java.lang.String[] __call163_1() throws Throwable;
private static native boolean __integerCategory163_2(int value) throws Throwable;
private static native int __instanceOf163_3(java.lang.Object a0) throws Throwable;
private static native boolean __call163_4(com.moon.W a0, java.lang.Object a1) throws Throwable;
private static native com.moon.W __cast163_5(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call163_6(com.moon.W a0) throws Throwable;
private static native java.lang.String __call163_7(com.moon.W a0) throws Throwable;
private static native boolean __call163_8(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory163_9(boolean value) throws Throwable;
private static native boolean __integerCategory163_10(int value) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call163_11(com.moon.W a0) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call163_12(com.moon.W a0) throws Throwable;
private static native boolean __call163_13(com.google.protobuf.UnknownFieldSet a0, com.google.protobuf.UnknownFieldSet a1) throws Throwable;
private static native int __integerCategory163_14(boolean value) throws Throwable;
private static native boolean __integerCategory163_15(int value) throws Throwable;
private static native boolean __integerCategory163_16(int value) throws Throwable;
private static native java.lang.Exception __call1016300_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1016301_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1016302_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1016303_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1016304_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1016305_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1016306_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1016307_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_6b22ae22a2db7251b630(com.moon.W a0) throws E;
private static final class __SourceHandler_6b22ae22a2db7251b630 {

public static int f164(com.moon.W receiver) throws Throwable {
    int forwardValue164_21_0;
    int forwardValue164_41_0;
    java.lang.String[] spill164_0;
    int spill164_1;
    long life1_3;
    int life4_7;
    java.lang.String[] life3_8;
    int life4_44;
    forward_join_41: {
    forward_join_31: {
    forward_join_21: {
    forward_join_16: {
    life1_3 = (__fieldRead164_0() ^ 98228838962043L);
    spill164_0 = __call164_1();
    life4_7 = __fieldRead164_2(receiver);
    life3_8 = spill164_0;
    spill164_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue164_21_0 = spill164_1;
        break forward_join_21;
    }
    if (!((spill164_1 != -1))) {
        break forward_join_16;
    }
    return life4_7;
    }
    life4_7 = 0;
    forwardValue164_21_0 = __integerCategory164_5(__call164_4(__fieldRead164_3(receiver)));
    }
    if (!((life3_8 == null))) {
        forwardValue164_41_0 = forwardValue164_21_0;
        break forward_join_41;
    }
    if (!((forwardValue164_21_0 == 0))) {
        break forward_join_31;
    }
    life4_7 = (life4_7 + __call164_7(1, __fieldRead164_6(receiver)));
    }
    life4_44 = (life4_7 + __call164_9(__call164_8(receiver)));
    __fieldWrite164_10(receiver, life4_44);
    forwardValue164_41_0 = life4_44;
    }
    return forwardValue164_41_0;
}
public static void h164_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1016400_0(p0);
}
public static void h164_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1016401_0(p0);
}
public static void h164_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1016402_0(p0);
}
private static native long __fieldRead164_0() throws Throwable;
private static native java.lang.String[] __call164_1() throws Throwable;
private static native int __fieldRead164_2(com.moon.W a0) throws Throwable;
private static native java.lang.Object __fieldRead164_3(com.moon.W a0) throws Throwable;
private static native boolean __call164_4(java.lang.Object a0) throws Throwable;
private static native int __integerCategory164_5(boolean value) throws Throwable;
private static native java.lang.Object __fieldRead164_6(com.moon.W a0) throws Throwable;
private static native int __call164_7(int a0, java.lang.Object a1) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call164_8(com.moon.W a0) throws Throwable;
private static native int __call164_9(com.google.protobuf.UnknownFieldSet a0) throws Throwable;
private static native void __fieldWrite164_10(com.moon.W a0, int a1) throws Throwable;
private static native java.lang.Exception __call1016400_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1016401_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1016402_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_79e03e68048bb0719e7b(com.moon.W a0) throws E;
private static final class __SourceHandler_79e03e68048bb0719e7b {

public static int f165(com.moon.W receiver) throws Throwable {
    int forwardValue165_19_0;
    int spill165_0;
    long life1_3;
    java.lang.String[] life3_5;
    int life4_24;
    int life4_35;
    int life4_45;
    int life4_57;
    int life4_69;
    forward_join_19: {
    forward_join_14: {
    life1_3 = (__fieldRead165_0() ^ 69451518366885L);
    life3_5 = __call165_1();
    spill165_0 = __fieldRead165_2(receiver);
    if (!((life3_5 == null))) {
        forwardValue165_19_0 = spill165_0;
        break forward_join_19;
    }
    if (!((spill165_0 != 0))) {
        break forward_join_14;
    }
    return __fieldRead165_3(receiver);
    }
    forwardValue165_19_0 = __invokedynamic165_4(8564, (7869899938479967706L ^ life1_3));
    }
    life4_24 = forwardValue165_19_0;
    life4_35 = ((__invokedynamic165_5(6873, (4058396628618983027L ^ life1_3)) * life4_24) + __call165_7(__call165_6()));
    life4_45 = ((__invokedynamic165_8(3717, (1404868301342450220L ^ life1_3)) * life4_35) + 1);
    life4_57 = ((__invokedynamic165_9(20703, (2972603898367704183L ^ life1_3)) * life4_45) + __call165_11(__call165_10(receiver)));
    life4_69 = ((__invokedynamic165_12(29484, (1655705263653740423L ^ life1_3)) * life4_57) + __call165_14(__call165_13(receiver)));
    __fieldWrite165_15(receiver, life4_69);
    return life4_69;
}
public static void h165_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1016500_0(p0);
}
public static void h165_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1016501_0(p0);
}
private static native long __fieldRead165_0() throws Throwable;
private static native java.lang.String[] __call165_1() throws Throwable;
private static native int __fieldRead165_2(com.moon.W a0) throws Throwable;
private static native int __fieldRead165_3(com.moon.W a0) throws Throwable;
private static native int __invokedynamic165_4(int a0, long a1) throws Throwable;
private static native int __invokedynamic165_5(int a0, long a1) throws Throwable;
private static native com.google.protobuf.Descriptors.Descriptor __call165_6() throws Throwable;
private static native int __call165_7(com.google.protobuf.Descriptors.Descriptor a0) throws Throwable;
private static native int __invokedynamic165_8(int a0, long a1) throws Throwable;
private static native int __invokedynamic165_9(int a0, long a1) throws Throwable;
private static native java.lang.String __call165_10(com.moon.W a0) throws Throwable;
private static native int __call165_11(java.lang.String a0) throws Throwable;
private static native int __invokedynamic165_12(int a0, long a1) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call165_13(com.moon.W a0) throws Throwable;
private static native int __call165_14(com.google.protobuf.UnknownFieldSet a0) throws Throwable;
private static native void __fieldWrite165_15(com.moon.W a0, int a1) throws Throwable;
private static native java.lang.Exception __call1016500_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1016501_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_9c72bd272c693279ec2e(com.moon.W a0) throws E;
private static final class __SourceHandler_9c72bd272c693279ec2e {

public static boolean f166(com.moon.W receiver) throws Throwable {
    int forwardValue166_17_0;
    int forwardValue166_26_0;
    java.lang.String[] spill166_0;
    int spill166_1;
    long life1_3;
    int life4_7;
    java.lang.String[] life3_8;
    forward_join_26: {
    forward_join_22: {
    forward_join_17: {
    forward_join_16: {
    life1_3 = (__fieldRead166_0() ^ 3839551258192L);
    spill166_0 = __call166_1();
    life4_7 = __fieldRead166_2(receiver);
    life3_8 = spill166_0;
    spill166_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue166_17_0 = spill166_1;
        break forward_join_17;
    }
    if (!((spill166_1 == 1))) {
        break forward_join_16;
    }
    return __integerCategory166_3(1);
    }
    forwardValue166_17_0 = life4_7;
    }
    if (!((life3_8 == null))) {
        forwardValue166_26_0 = forwardValue166_17_0;
        break forward_join_26;
    }
    if (!((forwardValue166_17_0 == 0))) {
        break forward_join_22;
    }
    return __integerCategory166_4(0);
    }
    __fieldWrite166_5(receiver, 1);
    forwardValue166_26_0 = 1;
    }
    return __integerCategory166_6(forwardValue166_26_0);
}
public static void h166_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1016600_0(p0);
}
public static void h166_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1016601_0(p0);
}
public static void h166_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1016602_0(p0);
}
public static void h166_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1016603_0(p0);
}
private static native long __fieldRead166_0() throws Throwable;
private static native java.lang.String[] __call166_1() throws Throwable;
private static native byte __fieldRead166_2(com.moon.W a0) throws Throwable;
private static native boolean __integerCategory166_3(int value) throws Throwable;
private static native boolean __integerCategory166_4(int value) throws Throwable;
private static native void __fieldWrite166_5(com.moon.W a0, int a1) throws Throwable;
private static native boolean __integerCategory166_6(int value) throws Throwable;
private static native java.lang.Exception __call1016600_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1016601_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1016602_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1016603_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_3a165736738d95001f6c(com.moon.W a0, com.google.protobuf.CodedOutputStream a1) throws E;
private static final class __SourceHandler_3a165736738d95001f6c {

public static void f167(com.moon.W receiver, com.google.protobuf.CodedOutputStream p0) throws Throwable {
    com.moon.W forwardValue167_18_0;
    com.moon.W spill167_0;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_18: {
    forward_join_17: {
    life2_3 = (__fieldRead167_0() ^ 135987076024352L);
    life4_5 = __call167_1();
    spill167_0 = receiver;
    if (!((life4_5 == null))) {
        forwardValue167_18_0 = spill167_0;
        break forward_join_18;
    }
    if (!((!__call167_3(__fieldRead167_2(spill167_0))))) {
        break forward_join_17;
    }
    __call167_5(p0, 1, __fieldRead167_4(receiver));
    }
    forwardValue167_18_0 = receiver;
    }
    __call167_7(__call167_6(forwardValue167_18_0), p0);
    return;
}
public static void h167_0(java.io.IOException p0) throws Throwable {
    throw __call1016700_0(p0);
}
public static void h167_1(java.io.IOException p0) throws Throwable {
    throw __call1016701_0(p0);
}
private static native long __fieldRead167_0() throws Throwable;
private static native java.lang.String[] __call167_1() throws Throwable;
private static native java.lang.Object __fieldRead167_2(com.moon.W a0) throws Throwable;
private static native boolean __call167_3(java.lang.Object a0) throws Throwable;
private static native java.lang.Object __fieldRead167_4(com.moon.W a0) throws Throwable;
private static native void __call167_5(com.google.protobuf.CodedOutputStream a0, int a1, java.lang.Object a2) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call167_6(com.moon.W a0) throws Throwable;
private static native void __call167_7(com.google.protobuf.UnknownFieldSet a0, com.google.protobuf.CodedOutputStream a1) throws Throwable;
private static native java.lang.Exception __call1016700_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1016701_0(java.io.IOException a0) throws Throwable;

}


public boolean equals(java.lang.Object p0) { return __sourceHandlerCall_2ae5c54256c0a3cbdb7a(this, p0); }


public int hashCode() { return __sourceHandlerCall_79e03e68048bb0719e7b(this); }


public com.moon.W b() {
return com.moon.W.c;
}


public static com.moon.ay b__ay() {
return ((com.moon.W)(com.moon.W.c)).c();
}


public static com.moon.W b(java.io.InputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.W)(com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(((com.google.protobuf.Parser)(com.moon.W.d)), ((java.io.InputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public static com.moon.W b(java.io.InputStream p0) throws java.io.IOException {
return ((com.moon.W)(com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(((com.google.protobuf.Parser)(com.moon.W.d)), ((java.io.InputStream)(p0)))));
}


public com.moon.ay c() { return __sourceHandlerCall_f72ae7c5f8f7f67bc08b(this); }


public static com.moon.W a(com.google.protobuf.CodedInputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.W)(com.google.protobuf.GeneratedMessageV3.parseWithIOException(((com.google.protobuf.Parser)(com.moon.W.d)), ((com.google.protobuf.CodedInputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public static com.moon.ay a(com.moon.W p0) {
return ((com.moon.ay)(((com.moon.W)(com.moon.W.c)).c())).a(((com.moon.W)(p0)));
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 3655;
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
            throw new RuntimeException("com/moon/W", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         g[var3] = var15;
      }

      return g[var3];
}


public static com.moon.W a(com.google.protobuf.CodedInputStream p0) throws java.io.IOException {
return ((com.moon.W)(com.google.protobuf.GeneratedMessageV3.parseWithIOException(((com.google.protobuf.Parser)(com.moon.W.d)), ((com.google.protobuf.CodedInputStream)(p0)))));
}


public com.moon.ay a__ay() {
return com.moon.W.b__ay();
}


public static com.google.protobuf.Parser<com.moon.W> a__Parser() {
return com.moon.W.d;
}


static void a__Void(com.google.protobuf.ByteString p0) throws java.lang.IllegalArgumentException {
com.moon.W.checkByteStringIsUtf8(((com.google.protobuf.ByteString)(p0)));
    return;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.W.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public static com.moon.W a__W() {
return com.moon.W.c;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral211_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/W"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


protected com.moon.ay a(com.google.protobuf.GeneratedMessageV3.BuilderParent p0) {
com.moon.ay local2 = new com.moon.ay(p0);
    return local2;
}


public static com.moon.W a(com.google.protobuf.ByteString p0) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.W)(((com.google.protobuf.Parser)(com.moon.W.d)).parseFrom(((com.google.protobuf.ByteString)(p0)))));
}


public static com.moon.W a(java.nio.ByteBuffer p0, com.google.protobuf.ExtensionRegistryLite p1) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.W)(((com.google.protobuf.Parser)(com.moon.W.d)).parseFrom(((java.nio.ByteBuffer)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public static com.moon.W a(java.nio.ByteBuffer p0) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.W)(((com.google.protobuf.Parser)(com.moon.W.d)).parseFrom(((java.nio.ByteBuffer)(p0)))));
}


public static final com.google.protobuf.Descriptors.Descriptor a__DescriptorsInnerDescriptor() {
return com.moon.o3.k;
}


public java.lang.String a__String() { return __sourceHandlerCall_35bd77ba33cf92b11181(this); }


public com.google.protobuf.ByteString a() { return __sourceHandlerCall_3536e3f11e525365848d(this); }


public static com.moon.W a(java.io.InputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.W)(com.google.protobuf.GeneratedMessageV3.parseWithIOException(((com.google.protobuf.Parser)(com.moon.W.d)), ((java.io.InputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public static com.moon.W a(java.io.InputStream p0) throws java.io.IOException {
return ((com.moon.W)(com.google.protobuf.GeneratedMessageV3.parseWithIOException(((com.google.protobuf.Parser)(com.moon.W.d)), ((java.io.InputStream)(p0)))));
}


public static com.moon.W a(byte[] p0, com.google.protobuf.ExtensionRegistryLite p1) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.W)(((com.google.protobuf.Parser)(com.moon.W.d)).parseFrom(((byte[])(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public static com.moon.W a(byte[] p0) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.W)(((com.google.protobuf.Parser)(com.moon.W.d)).parseFrom(((byte[])(p0)))));
}


public static com.moon.W a(com.google.protobuf.ByteString p0, com.google.protobuf.ExtensionRegistryLite p1) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.W)(((com.google.protobuf.Parser)(com.moon.W.d)).parseFrom(((com.google.protobuf.ByteString)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


protected java.lang.Object newInstance(com.google.protobuf.GeneratedMessageV3.UnusedPrivateParameter p0) {
return new com.moon.W();
}


public void writeTo(com.google.protobuf.CodedOutputStream p0) throws java.io.IOException { __sourceHandlerCall_3a165736738d95001f6c(this, p0); }


public final boolean isInitialized() { return __sourceHandlerCall_9c72bd272c693279ec2e(this); }


protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
return ((com.google.protobuf.GeneratedMessageV3.FieldAccessorTable)(com.moon.o3.l)).ensureFieldAccessorsInitialized(((java.lang.Class)(com.moon.W.class)), ((java.lang.Class)(com.moon.ay.class)));
}


public com.google.protobuf.MessageLite.Builder toBuilder__MessageLiteInnerBuilder() {
return ((com.moon.W)(this)).c();
}


public com.google.protobuf.Message.Builder toBuilder() {
return ((com.moon.W)(this)).c();
}


public com.google.protobuf.Message getDefaultInstanceForType() {
return ((com.moon.W)(this)).b();
}


public com.google.protobuf.MessageLite getDefaultInstanceForType__MessageLite() {
return ((com.moon.W)(this)).b();
}


public com.google.protobuf.Parser<com.moon.W> getParserForType() {
return com.moon.W.d;
}


public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
return this.unknownFields;
}


public int getSerializedSize() { return __sourceHandlerCall_6b22ae22a2db7251b630(this); }


protected com.google.protobuf.Message.Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent p0) {
return ((com.moon.W)(this)).a(((com.google.protobuf.GeneratedMessageV3.BuilderParent)(p0)));
}


public com.google.protobuf.Message.Builder newBuilderForType() {
return ((com.moon.W)(this)).a__ay();
}


public com.google.protobuf.MessageLite.Builder newBuilderForType__MessageLiteInnerBuilder() {
return ((com.moon.W)(this)).a__ay();
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral211_0() throws E;
}
