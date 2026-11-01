package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public final class G extends com.google.protobuf.GeneratedMessageV3 implements com.moon.oC {

private static long serialVersionUID = 0L;

private int a;

private java.util.List<com.moon.J> b;

private byte c;

private static com.moon.G d;

private static com.google.protobuf.Parser<com.moon.G> e;

private static long f;

private static long[] g;

private static java.lang.Integer[] h;

private static java.util.Map i;

private G(com.google.protobuf.GeneratedMessageV3.Builder<?> p0) {
super(p0);
    this.c = -1;
}


private G() {
super();
    this.c = -1;
    this.a = 0;
    this.b = java.util.Collections.emptyList();
}


static {
f = ((long)(((moom._a)(moom._c.a(((long)(-519778977697667940L)), ((long)(3851396243998194085L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(265366040382176L)))));
    i = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.G.f ^ 17566454595708L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill4_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill4_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill4_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill4_14 = new byte[8];
    (__sourceSpill4_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill4_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation4_16 = __sourceSpill4_14;
    ((javax.crypto.Cipher)(__sourceSpill4_11)).init(((int)(__sourceSpill4_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill4_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation4_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[7];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "ÅsJ_sRÞ|Vü!£ô1CÙ\000uëÑ\033Ë!ôÞ\004Ç\001ùÎùÃ$áH"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill4_25 = local6_life21;
        int __sourceSpill4_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill4_25)).substring(((int)(__sourceSpill4_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill4_30 = local8_life19;
        int __sourceSpill4_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill4_33 = new byte[8];
        (__sourceSpill4_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill4_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill4_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill4_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill4_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill4_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill4_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill4_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill4_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill4_34)).doFinal(((byte[])(__sourceSpill4_33)));
        (__sourceSpill4_30)[__sourceSpill4_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "+\by´¬8¹+kkw\035\003e\007"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill4_38 = local6_life21;
        int __sourceSpill4_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill4_38)).substring(((int)(__sourceSpill4_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill4_43 = local8_life19;
        int __sourceSpill4_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill4_46 = new byte[8];
        (__sourceSpill4_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill4_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill4_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill4_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill4_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill4_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill4_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill4_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill4_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill4_47)).doFinal(((byte[])(__sourceSpill4_46)));
        (__sourceSpill4_43)[__sourceSpill4_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    g = ((long[])(local8_life19));
    h = ((java.lang.Integer[])(new java.lang.Integer[7]));
    d = ((com.moon.G)(new com.moon.G()));
    e = ((com.google.protobuf.Parser)(new com.moon.e()));
}

private static native <E extends Throwable> com.moon.ck __sourceHandlerCall_e2aa06e365a41cd14280(com.moon.G a0) throws E;
private static final class __SourceHandler_e2aa06e365a41cd14280 {

public static com.moon.ck f37(com.moon.G receiver) throws Throwable {
    com.moon.ck forwardValue37_15_0;
    com.moon.ck forwardValue37_17_0;
    java.lang.String[] spill37_0;
    com.moon.ck spill37_1;
    long life1_3;
    com.moon.ck life4_8;
    java.lang.String[] life3_9;
    forward_join_17: {
    forward_join_16: {
    forward_join_15: {
    life1_3 = (__fieldRead37_0() ^ 53920026735813L);
    spill37_0 = __call37_1();
    life4_8 = __call37_3(__fieldRead37_2(receiver));
    life3_9 = spill37_0;
    spill37_1 = life4_8;
    if (!((life3_9 == null))) {
        forwardValue37_15_0 = spill37_1;
        break forward_join_15;
    }
    if (!((spill37_1 == null))) {
        break forward_join_16;
    }
    forwardValue37_15_0 = __fieldRead37_4();
    }
    forwardValue37_17_0 = forwardValue37_15_0;
    break forward_join_17;
    }
    forwardValue37_17_0 = life4_8;
    }
    return forwardValue37_17_0;
}
public static void h37_0(moom.Oo p0) throws Throwable {
    throw __call1003700_0(p0);
}
private static native long __fieldRead37_0() throws Throwable;
private static native java.lang.String[] __call37_1() throws Throwable;
private static native int __fieldRead37_2(com.moon.G a0) throws Throwable;
private static native com.moon.ck __call37_3(int a0) throws Throwable;
private static native com.moon.ck __fieldRead37_4() throws Throwable;
private static native java.lang.Exception __call1003700_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.ai __sourceHandlerCall_96d3f1b32f7ef1ba33a9(com.moon.G a0) throws E;
private static final class __SourceHandler_96d3f1b32f7ef1ba33a9 {

public static com.moon.ai f44(com.moon.G receiver) throws Throwable {
    long life1_3;
    life1_3 = (__fieldRead44_0() ^ 4381185813192L);
    return ((receiver == __fieldRead44_1()) ? new com.moon.ai() : __call44_2(new com.moon.ai(), receiver));
}
public static void h44_0(moom.Oo p0) throws Throwable {
    throw __call1004400_0(p0);
}
private static native long __fieldRead44_0() throws Throwable;
private static native com.moon.G __fieldRead44_1() throws Throwable;
private static native com.moon.ai __call44_2(com.moon.ai a0, com.moon.G a1) throws Throwable;
private static native java.lang.Exception __call1004400_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_f6279f4ce65748799c26(com.moon.G a0, java.lang.Object a1) throws E;
private static final class __SourceHandler_f6279f4ce65748799c26 {

public static boolean f38(com.moon.G receiver, java.lang.Object p0) throws Throwable {
    java.lang.Object forwardValue38_14_0;
    java.lang.Object forwardValue38_23_0;
    int forwardValue38_39_0;
    int forwardValue38_49_0;
    int forwardValue38_55_0;
    java.lang.Object spill38_0;
    int spill38_1;
    long life2_3;
    java.lang.String[] life4_5;
    com.moon.G life5_34;
    forward_join_55: {
    forward_join_54: {
    forward_join_49: {
    forward_join_44: {
    forward_join_39: {
    forward_join_34: {
    forward_join_23: {
    forward_join_22: {
    forward_join_14: {
    forward_join_13: {
    life2_3 = (__fieldRead38_0() ^ 84891748068747L);
    life4_5 = __call38_1();
    spill38_0 = p0;
    if (!((life4_5 == null))) {
        forwardValue38_14_0 = spill38_0;
        break forward_join_14;
    }
    if (!((spill38_0 == receiver))) {
        break forward_join_13;
    }
    return __integerCategory38_2(1);
    }
    forwardValue38_14_0 = p0;
    }
    if (!((life4_5 == null))) {
        forwardValue38_23_0 = forwardValue38_14_0;
        break forward_join_23;
    }
    if (!((__instanceOf38_3(forwardValue38_14_0) == 0))) {
        break forward_join_22;
    }
    return __call38_4(receiver, p0);
    }
    forwardValue38_23_0 = p0;
    }
    life5_34 = __cast38_5(forwardValue38_23_0);
    spill38_1 = __fieldRead38_6(receiver);
    if (!((life4_5 == null))) {
        forwardValue38_39_0 = spill38_1;
        break forward_join_39;
    }
    if (!((spill38_1 != __fieldRead38_7(life5_34)))) {
        break forward_join_34;
    }
    return __integerCategory38_8(0);
    }
    forwardValue38_39_0 = __integerCategory38_12(__call38_11(__call38_9(receiver), __call38_10(life5_34)));
    }
    if (!((life4_5 == null))) {
        forwardValue38_49_0 = forwardValue38_39_0;
        break forward_join_49;
    }
    if (!((forwardValue38_39_0 == 0))) {
        break forward_join_44;
    }
    return __integerCategory38_13(0);
    }
    forwardValue38_49_0 = __integerCategory38_17(__call38_16(__call38_14(receiver), __call38_15(life5_34)));
    }
    if (!((life4_5 == null))) {
        forwardValue38_55_0 = forwardValue38_49_0;
        break forward_join_55;
    }
    if (!((forwardValue38_49_0 == 0))) {
        break forward_join_54;
    }
    return __integerCategory38_18(0);
    }
    forwardValue38_55_0 = 1;
    }
    return __integerCategory38_19(forwardValue38_55_0);
}
public static void h38_0(moom.Oo p0) throws Throwable {
    throw __call1003800_0(p0);
}
public static void h38_1(moom.Oo p0) throws Throwable {
    throw __call1003801_0(p0);
}
public static void h38_2(moom.Oo p0) throws Throwable {
    throw __call1003802_0(p0);
}
public static void h38_3(moom.Oo p0) throws Throwable {
    throw __call1003803_0(p0);
}
public static void h38_4(moom.Oo p0) throws Throwable {
    throw __call1003804_0(p0);
}
public static void h38_5(moom.Oo p0) throws Throwable {
    throw __call1003805_0(p0);
}
public static void h38_6(moom.Oo p0) throws Throwable {
    throw __call1003806_0(p0);
}
public static void h38_7(moom.Oo p0) throws Throwable {
    throw __call1003807_0(p0);
}
public static void h38_8(moom.Oo p0) throws Throwable {
    throw __call1003808_0(p0);
}
public static void h38_9(moom.Oo p0) throws Throwable {
    throw __call1003809_0(p0);
}
private static native long __fieldRead38_0() throws Throwable;
private static native java.lang.String[] __call38_1() throws Throwable;
private static native boolean __integerCategory38_2(int value) throws Throwable;
private static native int __instanceOf38_3(java.lang.Object a0) throws Throwable;
private static native boolean __call38_4(com.moon.G a0, java.lang.Object a1) throws Throwable;
private static native com.moon.G __cast38_5(java.lang.Object a0) throws Throwable;
private static native int __fieldRead38_6(com.moon.G a0) throws Throwable;
private static native int __fieldRead38_7(com.moon.G a0) throws Throwable;
private static native boolean __integerCategory38_8(int value) throws Throwable;
private static native java.util.List __call38_9(com.moon.G a0) throws Throwable;
private static native java.util.List __call38_10(com.moon.G a0) throws Throwable;
private static native boolean __call38_11(java.util.List a0, java.util.List a1) throws Throwable;
private static native int __integerCategory38_12(boolean value) throws Throwable;
private static native boolean __integerCategory38_13(int value) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call38_14(com.moon.G a0) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call38_15(com.moon.G a0) throws Throwable;
private static native boolean __call38_16(com.google.protobuf.UnknownFieldSet a0, com.google.protobuf.UnknownFieldSet a1) throws Throwable;
private static native int __integerCategory38_17(boolean value) throws Throwable;
private static native boolean __integerCategory38_18(int value) throws Throwable;
private static native boolean __integerCategory38_19(int value) throws Throwable;
private static native java.lang.Exception __call1003800_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1003801_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1003802_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1003803_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1003804_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1003805_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1003806_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1003807_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1003808_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1003809_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_8942f088efa3874aacac(com.moon.G a0) throws E;
private static final class __SourceHandler_8942f088efa3874aacac {

public static int f39(com.moon.G receiver) throws Throwable {
    int lexicalValue39_24_0;
    int lexicalValue39_24_1;
    int lexicalValue39_33_0;
    java.lang.String[] spill39_0;
    int spill39_1;
    int spill39_2;
    int spill39_3;
    long life1_3;
    int life4_7;
    java.lang.String[] life3_8;
    int life5_41;
    lexical_join_63: {
    lexical_join_54: {
    lexical_join_33: {
    lexical_join_32: {
    lexical_join_24: {
    lexical_join_16: {
    life1_3 = (__fieldRead39_0() ^ 53248444308816L);
    spill39_0 = __call39_1();
    life4_7 = __fieldRead39_2(receiver);
    life3_8 = spill39_0;
    spill39_1 = life4_7;
    spill39_2 = -1;
    if (!((life3_8 == null))) {
        lexicalValue39_24_0 = spill39_1;
        lexicalValue39_24_1 = spill39_2;
        break lexical_join_24;
    }
    if (!((spill39_1 != spill39_2))) {
        break lexical_join_16;
    }
    return life4_7;
    }
    life4_7 = 0;
    spill39_3 = __fieldRead39_3(receiver);
    if (!((life3_8 == null))) {
        lexicalValue39_33_0 = spill39_3;
        break lexical_join_33;
    }
    lexicalValue39_24_0 = spill39_3;
    lexicalValue39_24_1 = __call39_5(__fieldRead39_4());
    }
    if (!((lexicalValue39_24_0 != lexicalValue39_24_1))) {
        break lexical_join_32;
    }
    life4_7 = (life4_7 + __call39_7(1, __fieldRead39_6(receiver)));
    }
    lexicalValue39_33_0 = 0;
    }
    life5_41 = lexicalValue39_33_0;
    lexical_cycle_34: while (true) {
    if (!((life5_41 < __call39_9(__fieldRead39_8(receiver))))) {
        break lexical_join_54;
    }
    life4_7 = (life4_7 + __call39_13(2, __cast39_12(__call39_11(__fieldRead39_10(receiver), life5_41))));
    life5_41 += 1;
    if (!((life3_8 == null))) {
        break lexical_join_63;
    }
    if (!((life3_8 != null))) { continue lexical_cycle_34; }
    break lexical_cycle_34;
    }
    }
    life4_7 = (life4_7 + __call39_15(__call39_14(receiver)));
    __fieldWrite39_16(receiver, life4_7);
    }
    return life4_7;
}
public static void h39_0(moom.Oo p0) throws Throwable {
    throw __call1003900_0(p0);
}
public static void h39_1(moom.Oo p0) throws Throwable {
    throw __call1003901_0(p0);
}
public static void h39_2(moom.Oo p0) throws Throwable {
    throw __call1003902_0(p0);
}
public static void h39_3(moom.Oo p0) throws Throwable {
    throw __call1003903_0(p0);
}
private static native long __fieldRead39_0() throws Throwable;
private static native java.lang.String[] __call39_1() throws Throwable;
private static native int __fieldRead39_2(com.moon.G a0) throws Throwable;
private static native int __fieldRead39_3(com.moon.G a0) throws Throwable;
private static native com.moon.ck __fieldRead39_4() throws Throwable;
private static native int __call39_5(com.moon.ck a0) throws Throwable;
private static native int __fieldRead39_6(com.moon.G a0) throws Throwable;
private static native int __call39_7(int a0, int a1) throws Throwable;
private static native java.util.List __fieldRead39_8(com.moon.G a0) throws Throwable;
private static native int __call39_9(java.util.List a0) throws Throwable;
private static native java.util.List __fieldRead39_10(com.moon.G a0) throws Throwable;
private static native java.lang.Object __call39_11(java.util.List a0, int a1) throws Throwable;
private static native com.google.protobuf.MessageLite __cast39_12(java.lang.Object a0) throws Throwable;
private static native int __call39_13(int a0, com.google.protobuf.MessageLite a1) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call39_14(com.moon.G a0) throws Throwable;
private static native int __call39_15(com.google.protobuf.UnknownFieldSet a0) throws Throwable;
private static native void __fieldWrite39_16(com.moon.G a0, int a1) throws Throwable;
private static native java.lang.Exception __call1003900_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1003901_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1003902_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1003903_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_cea069b9ced08bce36a3(com.moon.G a0) throws E;
private static final class __SourceHandler_cea069b9ced08bce36a3 {

public static int f40(com.moon.G receiver) throws Throwable {
    int forwardValue40_19_0;
    int forwardValue40_95_0;
    int spill40_0;
    int spill40_1;
    long life1_3;
    java.lang.String[] life3_5;
    int life4_24;
    int life4_35;
    int life4_45;
    int life4_56;
    int life4_74;
    int life4_98;
    forward_join_95: {
    forward_join_79: {
    forward_join_19: {
    forward_join_14: {
    life1_3 = (__fieldRead40_0() ^ 7797025646952L);
    life3_5 = __call40_1();
    spill40_0 = __fieldRead40_2(receiver);
    if (!((life3_5 == null))) {
        forwardValue40_19_0 = spill40_0;
        break forward_join_19;
    }
    if (!((spill40_0 != 0))) {
        break forward_join_14;
    }
    return __fieldRead40_3(receiver);
    }
    forwardValue40_19_0 = __invokedynamic40_4(14010, (7189177826302901693L ^ life1_3));
    }
    life4_24 = forwardValue40_19_0;
    life4_35 = ((__invokedynamic40_5(27723, (8766758688477538126L ^ life1_3)) * life4_24) + __call40_7(__call40_6()));
    life4_45 = ((__invokedynamic40_8(5418, (2018314741862571562L ^ life1_3)) * life4_35) + 1);
    life4_56 = ((__invokedynamic40_9(7525, (5340601831081449062L ^ life1_3)) * life4_45) + __fieldRead40_10(receiver));
    spill40_1 = __call40_11(receiver);
    if (!((life3_5 == null))) {
        forwardValue40_95_0 = spill40_1;
        break forward_join_95;
    }
    if (!((spill40_1 > 0))) {
        break forward_join_79;
    }
    life4_74 = ((__invokedynamic40_12(26918, (5021115798028182050L ^ life1_3)) * life4_56) + 2);
    life4_56 = ((__invokedynamic40_13(18567, (7122707291132380033L ^ life1_3)) * life4_74) + __call40_15(__call40_14(receiver)));
    }
    life4_98 = ((__invokedynamic40_16(32227, (6606126077861983969L ^ life1_3)) * life4_56) + __call40_18(__call40_17(receiver)));
    __fieldWrite40_19(receiver, life4_98);
    forwardValue40_95_0 = life4_98;
    }
    return forwardValue40_95_0;
}
public static void h40_0(moom.Oo p0) throws Throwable {
    throw __call1004000_0(p0);
}
public static void h40_1(moom.Oo p0) throws Throwable {
    throw __call1004001_0(p0);
}
public static void h40_2(moom.Oo p0) throws Throwable {
    throw __call1004002_0(p0);
}
private static native long __fieldRead40_0() throws Throwable;
private static native java.lang.String[] __call40_1() throws Throwable;
private static native int __fieldRead40_2(com.moon.G a0) throws Throwable;
private static native int __fieldRead40_3(com.moon.G a0) throws Throwable;
private static native int __invokedynamic40_4(int a0, long a1) throws Throwable;
private static native int __invokedynamic40_5(int a0, long a1) throws Throwable;
private static native com.google.protobuf.Descriptors.Descriptor __call40_6() throws Throwable;
private static native int __call40_7(com.google.protobuf.Descriptors.Descriptor a0) throws Throwable;
private static native int __invokedynamic40_8(int a0, long a1) throws Throwable;
private static native int __invokedynamic40_9(int a0, long a1) throws Throwable;
private static native int __fieldRead40_10(com.moon.G a0) throws Throwable;
private static native int __call40_11(com.moon.G a0) throws Throwable;
private static native int __invokedynamic40_12(int a0, long a1) throws Throwable;
private static native int __invokedynamic40_13(int a0, long a1) throws Throwable;
private static native java.util.List __call40_14(com.moon.G a0) throws Throwable;
private static native int __call40_15(java.util.List a0) throws Throwable;
private static native int __invokedynamic40_16(int a0, long a1) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call40_17(com.moon.G a0) throws Throwable;
private static native int __call40_18(com.google.protobuf.UnknownFieldSet a0) throws Throwable;
private static native void __fieldWrite40_19(com.moon.G a0, int a1) throws Throwable;
private static native java.lang.Exception __call1004000_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1004001_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1004002_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_fed08d42c2cefc253802(com.moon.G a0) throws E;
private static final class __SourceHandler_fed08d42c2cefc253802 {

public static boolean f41(com.moon.G receiver) throws Throwable {
    int forwardValue41_17_0;
    int forwardValue41_26_0;
    java.lang.String[] spill41_0;
    int spill41_1;
    long life1_3;
    int life4_7;
    java.lang.String[] life3_8;
    forward_join_26: {
    forward_join_22: {
    forward_join_17: {
    forward_join_16: {
    life1_3 = (__fieldRead41_0() ^ 134499444782114L);
    spill41_0 = __call41_1();
    life4_7 = __fieldRead41_2(receiver);
    life3_8 = spill41_0;
    spill41_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue41_17_0 = spill41_1;
        break forward_join_17;
    }
    if (!((spill41_1 == 1))) {
        break forward_join_16;
    }
    return __integerCategory41_3(1);
    }
    forwardValue41_17_0 = life4_7;
    }
    if (!((life3_8 == null))) {
        forwardValue41_26_0 = forwardValue41_17_0;
        break forward_join_26;
    }
    if (!((forwardValue41_17_0 == 0))) {
        break forward_join_22;
    }
    return __integerCategory41_4(0);
    }
    __fieldWrite41_5(receiver, 1);
    forwardValue41_26_0 = 1;
    }
    return __integerCategory41_6(forwardValue41_26_0);
}
public static void h41_0(moom.Oo p0) throws Throwable {
    throw __call1004100_0(p0);
}
public static void h41_1(moom.Oo p0) throws Throwable {
    throw __call1004101_0(p0);
}
public static void h41_2(moom.Oo p0) throws Throwable {
    throw __call1004102_0(p0);
}
public static void h41_3(moom.Oo p0) throws Throwable {
    throw __call1004103_0(p0);
}
private static native long __fieldRead41_0() throws Throwable;
private static native java.lang.String[] __call41_1() throws Throwable;
private static native byte __fieldRead41_2(com.moon.G a0) throws Throwable;
private static native boolean __integerCategory41_3(int value) throws Throwable;
private static native boolean __integerCategory41_4(int value) throws Throwable;
private static native void __fieldWrite41_5(com.moon.G a0, int a1) throws Throwable;
private static native boolean __integerCategory41_6(int value) throws Throwable;
private static native java.lang.Exception __call1004100_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1004101_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1004102_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1004103_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_47ec6b845153c8e12f4d(com.moon.G a0, com.google.protobuf.CodedOutputStream a1) throws E;
private static final class __SourceHandler_47ec6b845153c8e12f4d {

public static void f42(com.moon.G receiver, com.google.protobuf.CodedOutputStream p0) throws Throwable {
    int lexicalValue42_19_0;
    int spill42_0;
    long life2_3;
    java.lang.String[] life4_5;
    int life5_25;
    lexical_join_42: {
    lexical_join_38: {
    lexical_join_19: {
    lexical_join_18: {
    life2_3 = (__fieldRead42_0() ^ 113818343123407L);
    life4_5 = __call42_1();
    spill42_0 = __fieldRead42_2(receiver);
    if (!((life4_5 == null))) {
        lexicalValue42_19_0 = spill42_0;
        break lexical_join_19;
    }
    if (!((spill42_0 != __call42_4(__fieldRead42_3())))) {
        break lexical_join_18;
    }
    __call42_6(p0, 1, __fieldRead42_5(receiver));
    }
    lexicalValue42_19_0 = 0;
    }
    life5_25 = lexicalValue42_19_0;
    lexical_cycle_20: while (true) {
    if (!((life5_25 < __call42_8(__fieldRead42_7(receiver))))) {
        break lexical_join_38;
    }
    __call42_12(p0, 2, __cast42_11(__call42_10(__fieldRead42_9(receiver), life5_25)));
    life5_25 += 1;
    if (!((life4_5 == null))) {
        break lexical_join_42;
    }
    if (!((life4_5 != null))) { continue lexical_cycle_20; }
    break lexical_cycle_20;
    }
    }
    __call42_14(__call42_13(receiver), p0);
    }
    return;
}
public static void h42_0(java.io.IOException p0) throws Throwable {
    throw __call1004200_0(p0);
}
public static void h42_1(java.io.IOException p0) throws Throwable {
    throw __call1004201_0(p0);
}
public static void h42_2(java.io.IOException p0) throws Throwable {
    throw __call1004202_0(p0);
}
private static native long __fieldRead42_0() throws Throwable;
private static native java.lang.String[] __call42_1() throws Throwable;
private static native int __fieldRead42_2(com.moon.G a0) throws Throwable;
private static native com.moon.ck __fieldRead42_3() throws Throwable;
private static native int __call42_4(com.moon.ck a0) throws Throwable;
private static native int __fieldRead42_5(com.moon.G a0) throws Throwable;
private static native void __call42_6(com.google.protobuf.CodedOutputStream a0, int a1, int a2) throws Throwable;
private static native java.util.List __fieldRead42_7(com.moon.G a0) throws Throwable;
private static native int __call42_8(java.util.List a0) throws Throwable;
private static native java.util.List __fieldRead42_9(com.moon.G a0) throws Throwable;
private static native java.lang.Object __call42_10(java.util.List a0, int a1) throws Throwable;
private static native com.google.protobuf.MessageLite __cast42_11(java.lang.Object a0) throws Throwable;
private static native void __call42_12(com.google.protobuf.CodedOutputStream a0, int a1, com.google.protobuf.MessageLite a2) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call42_13(com.moon.G a0) throws Throwable;
private static native void __call42_14(com.google.protobuf.UnknownFieldSet a0, com.google.protobuf.CodedOutputStream a1) throws Throwable;
private static native java.lang.Exception __call1004200_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1004201_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1004202_0(java.io.IOException a0) throws Throwable;

}


public boolean equals(java.lang.Object p0) { return __sourceHandlerCall_f6279f4ce65748799c26(this, p0); }


public int hashCode() { return __sourceHandlerCall_cea069b9ced08bce36a3(this); }


public static com.moon.G b(java.io.InputStream p0) throws java.io.IOException {
return ((com.moon.G)(com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(((com.google.protobuf.Parser)(com.moon.G.e)), ((java.io.InputStream)(p0)))));
}


public int b() {
return ((java.util.List)(this.b)).size();
}


public static com.moon.G b(java.io.InputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.G)(com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(((com.google.protobuf.Parser)(com.moon.G.e)), ((java.io.InputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public static com.moon.ai b__ai() {
return ((com.moon.G)(com.moon.G.d)).c();
}


public com.moon.G b__G() {
return com.moon.G.d;
}


public java.util.List<? extends com.moon.oG> b__List() {
return this.b;
}


public com.moon.ai c() { return __sourceHandlerCall_96d3f1b32f7ef1ba33a9(this); }


protected com.moon.ai a(com.google.protobuf.GeneratedMessageV3.BuilderParent p0) {
com.moon.ai local2 = new com.moon.ai(p0);
    return local2;
}


public static com.moon.ai a(com.moon.G p0) {
return ((com.moon.ai)(((com.moon.G)(com.moon.G.d)).c())).a(((com.moon.G)(p0)));
}


public static final com.google.protobuf.Descriptors.Descriptor a__DescriptorsInnerDescriptor() {
return com.moon.oF.y;
}


public int a() {
return this.a;
}


public static com.moon.G a(com.google.protobuf.CodedInputStream p0) throws java.io.IOException {
return ((com.moon.G)(com.google.protobuf.GeneratedMessageV3.parseWithIOException(((com.google.protobuf.Parser)(com.moon.G.e)), ((com.google.protobuf.CodedInputStream)(p0)))));
}


public static com.moon.G a(com.google.protobuf.CodedInputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.G)(com.google.protobuf.GeneratedMessageV3.parseWithIOException(((com.google.protobuf.Parser)(com.moon.G.e)), ((com.google.protobuf.CodedInputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public com.moon.ai a__ai() {
return com.moon.G.b__ai();
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 1284;
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
            throw new RuntimeException("com/moon/G", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         h[var3] = var15;
      }

      return h[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.G.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral52_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/G"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


static boolean a__Boolean() {
return ((((com.moon.G.alwaysUseFieldBuilders) ? 1 : 0)) != 0);
}


public static com.google.protobuf.Parser<com.moon.G> a__Parser() {
return com.moon.G.e;
}


public static com.moon.G a__G() {
return com.moon.G.d;
}


public com.moon.ck a__ck() { return __sourceHandlerCall_e2aa06e365a41cd14280(this); }


public static com.moon.G a(java.nio.ByteBuffer p0) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.G)(((com.google.protobuf.Parser)(com.moon.G.e)).parseFrom(((java.nio.ByteBuffer)(p0)))));
}


public static com.moon.G a(java.nio.ByteBuffer p0, com.google.protobuf.ExtensionRegistryLite p1) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.G)(((com.google.protobuf.Parser)(com.moon.G.e)).parseFrom(((java.nio.ByteBuffer)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public static com.moon.G a(com.google.protobuf.ByteString p0) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.G)(((com.google.protobuf.Parser)(com.moon.G.e)).parseFrom(((com.google.protobuf.ByteString)(p0)))));
}


public java.util.List<com.moon.J> a__List() {
return this.b;
}


public com.moon.J a(int p0) {
return ((com.moon.J)(((java.util.List)(this.b)).get(((int)(p0)))));
}


public com.moon.oG a__oG(int p0) {
return ((com.moon.oG)(((java.util.List)(this.b)).get(((int)(p0)))));
}


public static com.moon.G a(java.io.InputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.G)(com.google.protobuf.GeneratedMessageV3.parseWithIOException(((com.google.protobuf.Parser)(com.moon.G.e)), ((java.io.InputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public static com.moon.G a(java.io.InputStream p0) throws java.io.IOException {
return ((com.moon.G)(com.google.protobuf.GeneratedMessageV3.parseWithIOException(((com.google.protobuf.Parser)(com.moon.G.e)), ((java.io.InputStream)(p0)))));
}


public static com.moon.G a(byte[] p0, com.google.protobuf.ExtensionRegistryLite p1) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.G)(((com.google.protobuf.Parser)(com.moon.G.e)).parseFrom(((byte[])(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public static com.moon.G a(byte[] p0) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.G)(((com.google.protobuf.Parser)(com.moon.G.e)).parseFrom(((byte[])(p0)))));
}


public static com.moon.G a(com.google.protobuf.ByteString p0, com.google.protobuf.ExtensionRegistryLite p1) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.G)(((com.google.protobuf.Parser)(com.moon.G.e)).parseFrom(((com.google.protobuf.ByteString)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


protected java.lang.Object newInstance(com.google.protobuf.GeneratedMessageV3.UnusedPrivateParameter p0) {
return new com.moon.G();
}


public void writeTo(com.google.protobuf.CodedOutputStream p0) throws java.io.IOException { __sourceHandlerCall_47ec6b845153c8e12f4d(this, p0); }


public com.google.protobuf.MessageLite.Builder toBuilder__MessageLiteInnerBuilder() {
return ((com.moon.G)(this)).c();
}


public com.google.protobuf.Message.Builder toBuilder() {
return ((com.moon.G)(this)).c();
}


public final boolean isInitialized() { return __sourceHandlerCall_fed08d42c2cefc253802(this); }


protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
return ((com.google.protobuf.GeneratedMessageV3.FieldAccessorTable)(com.moon.oF.z)).ensureFieldAccessorsInitialized(((java.lang.Class)(com.moon.G.class)), ((java.lang.Class)(com.moon.ai.class)));
}


public com.google.protobuf.Message getDefaultInstanceForType() {
return ((com.moon.G)(this)).b__G();
}


public com.google.protobuf.MessageLite getDefaultInstanceForType__MessageLite() {
return ((com.moon.G)(this)).b__G();
}


public com.google.protobuf.Parser<com.moon.G> getParserForType() {
return com.moon.G.e;
}


public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
return this.unknownFields;
}


public int getSerializedSize() { return __sourceHandlerCall_8942f088efa3874aacac(this); }


protected com.google.protobuf.Message.Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent p0) {
return ((com.moon.G)(this)).a(((com.google.protobuf.GeneratedMessageV3.BuilderParent)(p0)));
}


public com.google.protobuf.Message.Builder newBuilderForType() {
return ((com.moon.G)(this)).a__ai();
}


public com.google.protobuf.MessageLite.Builder newBuilderForType__MessageLiteInnerBuilder() {
return ((com.moon.G)(this)).a__ai();
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral52_0() throws E;
}
