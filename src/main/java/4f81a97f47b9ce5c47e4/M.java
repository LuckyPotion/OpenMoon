package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public final class M extends com.google.protobuf.GeneratedMessageV3 implements com.moon.oK {

private static long serialVersionUID = 0L;

private volatile java.lang.Object a;

private byte b;

private static com.moon.M c;

private static com.google.protobuf.Parser<com.moon.M> d;

private static long e;

private static long[] f;

private static java.lang.Integer[] g;

private static java.util.Map h;

private M(com.google.protobuf.GeneratedMessageV3.Builder<?> p0) {
super(p0);
    this.b = -1;
}


private M() {
super();
    this.b = -1;
    this.a = "";
}


static {
e = ((long)(((moom._a)(moom._c.a(((long)(-8477796389685851035L)), ((long)(5143745210535738672L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(125775818582691L)))));
    h = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.M.e ^ 12136047259644L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill10_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill10_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill10_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill10_14 = new byte[8];
    (__sourceSpill10_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill10_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation10_16 = __sourceSpill10_14;
    ((javax.crypto.Cipher)(__sourceSpill10_11)).init(((int)(__sourceSpill10_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill10_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation10_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[5];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "AVæe{j2K8q\0057Xrñî\026"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill10_25 = local6_life21;
        int __sourceSpill10_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill10_25)).substring(((int)(__sourceSpill10_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill10_30 = local8_life19;
        int __sourceSpill10_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill10_33 = new byte[8];
        (__sourceSpill10_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill10_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill10_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill10_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill10_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill10_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill10_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill10_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill10_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill10_34)).doFinal(((byte[])(__sourceSpill10_33)));
        (__sourceSpill10_30)[__sourceSpill10_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "{©íAÜ\034T¬ôä-·]R"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill10_38 = local6_life21;
        int __sourceSpill10_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill10_38)).substring(((int)(__sourceSpill10_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill10_43 = local8_life19;
        int __sourceSpill10_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill10_46 = new byte[8];
        (__sourceSpill10_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill10_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill10_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill10_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill10_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill10_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill10_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill10_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill10_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill10_47)).doFinal(((byte[])(__sourceSpill10_46)));
        (__sourceSpill10_43)[__sourceSpill10_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    f = ((long[])(local8_life19));
    g = ((java.lang.Integer[])(new java.lang.Integer[5]));
    c = ((com.moon.M)(new com.moon.M()));
    d = ((com.google.protobuf.Parser)(new com.moon.k()));
}

private static native <E extends Throwable> com.google.protobuf.ByteString __sourceHandlerCall_125a7b5ade658a60f97d(com.moon.M a0) throws E;
private static final class __SourceHandler_125a7b5ade658a60f97d {

public static com.google.protobuf.ByteString f85(com.moon.M receiver) throws Throwable {
    java.lang.Object forwardValue85_24_0;
    java.lang.String[] spill85_0;
    java.lang.Object spill85_1;
    long life1_3;
    java.lang.Object life4_7;
    java.lang.String[] life3_8;
    com.google.protobuf.ByteString life5_20;
    forward_join_24: {
    forward_join_23: {
    life1_3 = (__fieldRead85_0() ^ 69229404760508L);
    spill85_0 = __call85_1();
    life4_7 = __fieldRead85_2(receiver);
    life3_8 = spill85_0;
    spill85_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue85_24_0 = spill85_1;
        break forward_join_24;
    }
    if (!((__instanceOf85_3(spill85_1) != 0))) {
        break forward_join_23;
    }
    life5_20 = __call85_5(__cast85_4(life4_7));
    __fieldWrite85_6(receiver, life5_20);
    return life5_20;
    }
    forwardValue85_24_0 = life4_7;
    }
    return __cast85_7(forwardValue85_24_0);
}
public static void h85_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1008500_0(p0);
}
private static native long __fieldRead85_0() throws Throwable;
private static native java.lang.String[] __call85_1() throws Throwable;
private static native java.lang.Object __fieldRead85_2(com.moon.M a0) throws Throwable;
private static native int __instanceOf85_3(java.lang.Object a0) throws Throwable;
private static native java.lang.String __cast85_4(java.lang.Object a0) throws Throwable;
private static native com.google.protobuf.ByteString __call85_5(java.lang.String a0) throws Throwable;
private static native void __fieldWrite85_6(com.moon.M a0, com.google.protobuf.ByteString a1) throws Throwable;
private static native com.google.protobuf.ByteString __cast85_7(java.lang.Object a0) throws Throwable;
private static native java.lang.Exception __call1008500_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_164ecea5dc1decc988ff(com.moon.M a0) throws E;
private static final class __SourceHandler_164ecea5dc1decc988ff {

public static java.lang.String f86(com.moon.M receiver) throws Throwable {
    java.lang.Object forwardValue86_18_0;
    java.lang.String[] spill86_0;
    java.lang.Object spill86_1;
    long life1_3;
    java.lang.Object life4_7;
    java.lang.String[] life3_8;
    com.google.protobuf.ByteString life5_24;
    java.lang.String life6_27;
    forward_join_18: {
    forward_join_17: {
    life1_3 = (__fieldRead86_0() ^ 32140073082575L);
    spill86_0 = __call86_1();
    life4_7 = __fieldRead86_2(receiver);
    life3_8 = spill86_0;
    spill86_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue86_18_0 = spill86_1;
        break forward_join_18;
    }
    if (!((__instanceOf86_3(spill86_1) != 0))) {
        break forward_join_17;
    }
    return __cast86_4(life4_7);
    }
    forwardValue86_18_0 = life4_7;
    }
    life5_24 = __cast86_5(forwardValue86_18_0);
    life6_27 = __call86_6(life5_24);
    __fieldWrite86_7(receiver, life6_27);
    return life6_27;
}
public static void h86_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1008600_0(p0);
}
public static void h86_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1008601_0(p0);
}
private static native long __fieldRead86_0() throws Throwable;
private static native java.lang.String[] __call86_1() throws Throwable;
private static native java.lang.Object __fieldRead86_2(com.moon.M a0) throws Throwable;
private static native int __instanceOf86_3(java.lang.Object a0) throws Throwable;
private static native java.lang.String __cast86_4(java.lang.Object a0) throws Throwable;
private static native com.google.protobuf.ByteString __cast86_5(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call86_6(com.google.protobuf.ByteString a0) throws Throwable;
private static native void __fieldWrite86_7(com.moon.M a0, java.lang.String a1) throws Throwable;
private static native java.lang.Exception __call1008600_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1008601_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.ao __sourceHandlerCall_4a5da6ea90e533d15f73(com.moon.M a0) throws E;
private static final class __SourceHandler_4a5da6ea90e533d15f73 {

public static com.moon.ao f102(com.moon.M receiver) throws Throwable {
    long life1_3;
    life1_3 = (__fieldRead102_0() ^ 16039952282453L);
    return ((receiver == __fieldRead102_1()) ? new com.moon.ao() : __call102_2(new com.moon.ao(), receiver));
}
public static void h102_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1010200_0(p0);
}
private static native long __fieldRead102_0() throws Throwable;
private static native com.moon.M __fieldRead102_1() throws Throwable;
private static native com.moon.ao __call102_2(com.moon.ao a0, com.moon.M a1) throws Throwable;
private static native java.lang.Exception __call1010200_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_ecad2d70a5c3a42c38a5(com.moon.M a0, java.lang.Object a1) throws E;
private static final class __SourceHandler_ecad2d70a5c3a42c38a5 {

public static boolean f87(com.moon.M receiver, java.lang.Object p0) throws Throwable {
    java.lang.Object forwardValue87_14_0;
    java.lang.Object forwardValue87_23_0;
    int forwardValue87_40_0;
    int forwardValue87_46_0;
    java.lang.Object spill87_0;
    boolean spill87_1;
    long life2_3;
    java.lang.String[] life4_5;
    com.moon.M life5_34;
    forward_join_46: {
    forward_join_45: {
    forward_join_40: {
    forward_join_35: {
    forward_join_23: {
    forward_join_22: {
    forward_join_14: {
    forward_join_13: {
    life2_3 = (__fieldRead87_0() ^ 92861870997923L);
    life4_5 = __call87_1();
    spill87_0 = p0;
    if (!((life4_5 == null))) {
        forwardValue87_14_0 = spill87_0;
        break forward_join_14;
    }
    if (!((spill87_0 == receiver))) {
        break forward_join_13;
    }
    return __integerCategory87_2(1);
    }
    forwardValue87_14_0 = p0;
    }
    if (!((life4_5 == null))) {
        forwardValue87_23_0 = forwardValue87_14_0;
        break forward_join_23;
    }
    if (!((__instanceOf87_3(forwardValue87_14_0) == 0))) {
        break forward_join_22;
    }
    return __call87_4(receiver, p0);
    }
    forwardValue87_23_0 = p0;
    }
    life5_34 = __cast87_5(forwardValue87_23_0);
    spill87_1 = __call87_8(__call87_6(receiver), __call87_7(life5_34));
    if (!((life4_5 == null))) {
        forwardValue87_40_0 = __integerCategory87_9(spill87_1);
        break forward_join_40;
    }
    if (!((!spill87_1))) {
        break forward_join_35;
    }
    return __integerCategory87_10(0);
    }
    forwardValue87_40_0 = __integerCategory87_14(__call87_13(__call87_11(receiver), __call87_12(life5_34)));
    }
    if (!((life4_5 == null))) {
        forwardValue87_46_0 = forwardValue87_40_0;
        break forward_join_46;
    }
    if (!((forwardValue87_40_0 == 0))) {
        break forward_join_45;
    }
    return __integerCategory87_15(0);
    }
    forwardValue87_46_0 = 1;
    }
    return __integerCategory87_16(forwardValue87_46_0);
}
public static void h87_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1008700_0(p0);
}
public static void h87_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1008701_0(p0);
}
public static void h87_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1008702_0(p0);
}
public static void h87_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1008703_0(p0);
}
public static void h87_4(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1008704_0(p0);
}
public static void h87_5(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1008705_0(p0);
}
public static void h87_6(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1008706_0(p0);
}
public static void h87_7(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1008707_0(p0);
}
private static native long __fieldRead87_0() throws Throwable;
private static native java.lang.String[] __call87_1() throws Throwable;
private static native boolean __integerCategory87_2(int value) throws Throwable;
private static native int __instanceOf87_3(java.lang.Object a0) throws Throwable;
private static native boolean __call87_4(com.moon.M a0, java.lang.Object a1) throws Throwable;
private static native com.moon.M __cast87_5(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call87_6(com.moon.M a0) throws Throwable;
private static native java.lang.String __call87_7(com.moon.M a0) throws Throwable;
private static native boolean __call87_8(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory87_9(boolean value) throws Throwable;
private static native boolean __integerCategory87_10(int value) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call87_11(com.moon.M a0) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call87_12(com.moon.M a0) throws Throwable;
private static native boolean __call87_13(com.google.protobuf.UnknownFieldSet a0, com.google.protobuf.UnknownFieldSet a1) throws Throwable;
private static native int __integerCategory87_14(boolean value) throws Throwable;
private static native boolean __integerCategory87_15(int value) throws Throwable;
private static native boolean __integerCategory87_16(int value) throws Throwable;
private static native java.lang.Exception __call1008700_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1008701_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1008702_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1008703_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1008704_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1008705_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1008706_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1008707_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_03d943b517a962401259(com.moon.M a0) throws E;
private static final class __SourceHandler_03d943b517a962401259 {

public static int f88(com.moon.M receiver) throws Throwable {
    int forwardValue88_21_0;
    int forwardValue88_41_0;
    java.lang.String[] spill88_0;
    int spill88_1;
    long life1_3;
    int life4_7;
    java.lang.String[] life3_8;
    int life4_44;
    forward_join_41: {
    forward_join_31: {
    forward_join_21: {
    forward_join_16: {
    life1_3 = (__fieldRead88_0() ^ 101678974357674L);
    spill88_0 = __call88_1();
    life4_7 = __fieldRead88_2(receiver);
    life3_8 = spill88_0;
    spill88_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue88_21_0 = spill88_1;
        break forward_join_21;
    }
    if (!((spill88_1 != -1))) {
        break forward_join_16;
    }
    return life4_7;
    }
    life4_7 = 0;
    forwardValue88_21_0 = __integerCategory88_5(__call88_4(__fieldRead88_3(receiver)));
    }
    if (!((life3_8 == null))) {
        forwardValue88_41_0 = forwardValue88_21_0;
        break forward_join_41;
    }
    if (!((forwardValue88_21_0 == 0))) {
        break forward_join_31;
    }
    life4_7 = (life4_7 + __call88_7(1, __fieldRead88_6(receiver)));
    }
    life4_44 = (life4_7 + __call88_9(__call88_8(receiver)));
    __fieldWrite88_10(receiver, life4_44);
    forwardValue88_41_0 = life4_44;
    }
    return forwardValue88_41_0;
}
public static void h88_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1008800_0(p0);
}
public static void h88_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1008801_0(p0);
}
public static void h88_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1008802_0(p0);
}
private static native long __fieldRead88_0() throws Throwable;
private static native java.lang.String[] __call88_1() throws Throwable;
private static native int __fieldRead88_2(com.moon.M a0) throws Throwable;
private static native java.lang.Object __fieldRead88_3(com.moon.M a0) throws Throwable;
private static native boolean __call88_4(java.lang.Object a0) throws Throwable;
private static native int __integerCategory88_5(boolean value) throws Throwable;
private static native java.lang.Object __fieldRead88_6(com.moon.M a0) throws Throwable;
private static native int __call88_7(int a0, java.lang.Object a1) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call88_8(com.moon.M a0) throws Throwable;
private static native int __call88_9(com.google.protobuf.UnknownFieldSet a0) throws Throwable;
private static native void __fieldWrite88_10(com.moon.M a0, int a1) throws Throwable;
private static native java.lang.Exception __call1008800_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1008801_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1008802_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_3e61d9bacf92ad72c999(com.moon.M a0) throws E;
private static final class __SourceHandler_3e61d9bacf92ad72c999 {

public static int f89(com.moon.M receiver) throws Throwable {
    int forwardValue89_19_0;
    int spill89_0;
    long life1_3;
    java.lang.String[] life3_5;
    int life4_24;
    int life4_35;
    int life4_45;
    int life4_57;
    int life4_69;
    forward_join_19: {
    forward_join_14: {
    life1_3 = (__fieldRead89_0() ^ 87093100041579L);
    life3_5 = __call89_1();
    spill89_0 = __fieldRead89_2(receiver);
    if (!((life3_5 == null))) {
        forwardValue89_19_0 = spill89_0;
        break forward_join_19;
    }
    if (!((spill89_0 != 0))) {
        break forward_join_14;
    }
    return __fieldRead89_3(receiver);
    }
    forwardValue89_19_0 = __invokedynamic89_4(9016, (1333795083183676682L ^ life1_3));
    }
    life4_24 = forwardValue89_19_0;
    life4_35 = ((__invokedynamic89_5(14508, (6112692757269366426L ^ life1_3)) * life4_24) + __call89_7(__call89_6()));
    life4_45 = ((__invokedynamic89_8(19141, (3770647242944525552L ^ life1_3)) * life4_35) + 1);
    life4_57 = ((__invokedynamic89_9(8272, (8934416003176029799L ^ life1_3)) * life4_45) + __call89_11(__call89_10(receiver)));
    life4_69 = ((__invokedynamic89_12(30710, (1356367473274653122L ^ life1_3)) * life4_57) + __call89_14(__call89_13(receiver)));
    __fieldWrite89_15(receiver, life4_69);
    return life4_69;
}
public static void h89_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1008900_0(p0);
}
public static void h89_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1008901_0(p0);
}
private static native long __fieldRead89_0() throws Throwable;
private static native java.lang.String[] __call89_1() throws Throwable;
private static native int __fieldRead89_2(com.moon.M a0) throws Throwable;
private static native int __fieldRead89_3(com.moon.M a0) throws Throwable;
private static native int __invokedynamic89_4(int a0, long a1) throws Throwable;
private static native int __invokedynamic89_5(int a0, long a1) throws Throwable;
private static native com.google.protobuf.Descriptors.Descriptor __call89_6() throws Throwable;
private static native int __call89_7(com.google.protobuf.Descriptors.Descriptor a0) throws Throwable;
private static native int __invokedynamic89_8(int a0, long a1) throws Throwable;
private static native int __invokedynamic89_9(int a0, long a1) throws Throwable;
private static native java.lang.String __call89_10(com.moon.M a0) throws Throwable;
private static native int __call89_11(java.lang.String a0) throws Throwable;
private static native int __invokedynamic89_12(int a0, long a1) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call89_13(com.moon.M a0) throws Throwable;
private static native int __call89_14(com.google.protobuf.UnknownFieldSet a0) throws Throwable;
private static native void __fieldWrite89_15(com.moon.M a0, int a1) throws Throwable;
private static native java.lang.Exception __call1008900_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1008901_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_df97585851d76bbe00d4(com.moon.M a0) throws E;
private static final class __SourceHandler_df97585851d76bbe00d4 {

public static boolean f90(com.moon.M receiver) throws Throwable {
    int forwardValue90_17_0;
    int forwardValue90_26_0;
    java.lang.String[] spill90_0;
    int spill90_1;
    long life1_3;
    int life4_7;
    java.lang.String[] life3_8;
    forward_join_26: {
    forward_join_22: {
    forward_join_17: {
    forward_join_16: {
    life1_3 = (__fieldRead90_0() ^ 44307070628312L);
    spill90_0 = __call90_1();
    life4_7 = __fieldRead90_2(receiver);
    life3_8 = spill90_0;
    spill90_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue90_17_0 = spill90_1;
        break forward_join_17;
    }
    if (!((spill90_1 == 1))) {
        break forward_join_16;
    }
    return __integerCategory90_3(1);
    }
    forwardValue90_17_0 = life4_7;
    }
    if (!((life3_8 == null))) {
        forwardValue90_26_0 = forwardValue90_17_0;
        break forward_join_26;
    }
    if (!((forwardValue90_17_0 == 0))) {
        break forward_join_22;
    }
    return __integerCategory90_4(0);
    }
    __fieldWrite90_5(receiver, 1);
    forwardValue90_26_0 = 1;
    }
    return __integerCategory90_6(forwardValue90_26_0);
}
public static void h90_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1009000_0(p0);
}
public static void h90_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1009001_0(p0);
}
public static void h90_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1009002_0(p0);
}
public static void h90_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1009003_0(p0);
}
private static native long __fieldRead90_0() throws Throwable;
private static native java.lang.String[] __call90_1() throws Throwable;
private static native byte __fieldRead90_2(com.moon.M a0) throws Throwable;
private static native boolean __integerCategory90_3(int value) throws Throwable;
private static native boolean __integerCategory90_4(int value) throws Throwable;
private static native void __fieldWrite90_5(com.moon.M a0, int a1) throws Throwable;
private static native boolean __integerCategory90_6(int value) throws Throwable;
private static native java.lang.Exception __call1009000_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1009001_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1009002_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1009003_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_09a9ce99bcef15d07d57(com.moon.M a0, com.google.protobuf.CodedOutputStream a1) throws E;
private static final class __SourceHandler_09a9ce99bcef15d07d57 {

public static void f91(com.moon.M receiver, com.google.protobuf.CodedOutputStream p0) throws Throwable {
    com.moon.M forwardValue91_18_0;
    com.moon.M spill91_0;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_18: {
    forward_join_17: {
    life2_3 = (__fieldRead91_0() ^ 27979676933819L);
    life4_5 = __call91_1();
    spill91_0 = receiver;
    if (!((life4_5 == null))) {
        forwardValue91_18_0 = spill91_0;
        break forward_join_18;
    }
    if (!((!__call91_3(__fieldRead91_2(spill91_0))))) {
        break forward_join_17;
    }
    __call91_5(p0, 1, __fieldRead91_4(receiver));
    }
    forwardValue91_18_0 = receiver;
    }
    __call91_7(__call91_6(forwardValue91_18_0), p0);
    return;
}
public static void h91_0(java.io.IOException p0) throws Throwable {
    throw __call1009100_0(p0);
}
public static void h91_1(java.io.IOException p0) throws Throwable {
    throw __call1009101_0(p0);
}
private static native long __fieldRead91_0() throws Throwable;
private static native java.lang.String[] __call91_1() throws Throwable;
private static native java.lang.Object __fieldRead91_2(com.moon.M a0) throws Throwable;
private static native boolean __call91_3(java.lang.Object a0) throws Throwable;
private static native java.lang.Object __fieldRead91_4(com.moon.M a0) throws Throwable;
private static native void __call91_5(com.google.protobuf.CodedOutputStream a0, int a1, java.lang.Object a2) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call91_6(com.moon.M a0) throws Throwable;
private static native void __call91_7(com.google.protobuf.UnknownFieldSet a0, com.google.protobuf.CodedOutputStream a1) throws Throwable;
private static native java.lang.Exception __call1009100_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1009101_0(java.io.IOException a0) throws Throwable;

}


public boolean equals(java.lang.Object p0) { return __sourceHandlerCall_ecad2d70a5c3a42c38a5(this, p0); }


public int hashCode() { return __sourceHandlerCall_3e61d9bacf92ad72c999(this); }


public com.moon.M b() {
return com.moon.M.c;
}


public static com.moon.ao b__ao() {
return ((com.moon.M)(com.moon.M.c)).c();
}


public static com.moon.M b(java.io.InputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.M)(com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(((com.google.protobuf.Parser)(com.moon.M.d)), ((java.io.InputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public static com.moon.M b(java.io.InputStream p0) throws java.io.IOException {
return ((com.moon.M)(com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(((com.google.protobuf.Parser)(com.moon.M.d)), ((java.io.InputStream)(p0)))));
}


public com.moon.ao c() { return __sourceHandlerCall_4a5da6ea90e533d15f73(this); }


public static com.moon.M a(com.google.protobuf.CodedInputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.M)(com.google.protobuf.GeneratedMessageV3.parseWithIOException(((com.google.protobuf.Parser)(com.moon.M.d)), ((com.google.protobuf.CodedInputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public static com.moon.ao a(com.moon.M p0) {
return ((com.moon.ao)(((com.moon.M)(com.moon.M.c)).c())).a(((com.moon.M)(p0)));
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 7137;
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
            throw new RuntimeException("com/moon/M", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         g[var3] = var15;
      }

      return g[var3];
}


public static com.moon.M a(com.google.protobuf.CodedInputStream p0) throws java.io.IOException {
return ((com.moon.M)(com.google.protobuf.GeneratedMessageV3.parseWithIOException(((com.google.protobuf.Parser)(com.moon.M.d)), ((com.google.protobuf.CodedInputStream)(p0)))));
}


public com.moon.ao a__ao() {
return com.moon.M.b__ao();
}


public static com.google.protobuf.Parser<com.moon.M> a__Parser() {
return com.moon.M.d;
}


static void a__Void(com.google.protobuf.ByteString p0) throws java.lang.IllegalArgumentException {
com.moon.M.checkByteStringIsUtf8(((com.google.protobuf.ByteString)(p0)));
    return;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.M.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public static com.moon.M a__M() {
return com.moon.M.c;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral115_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/M"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


protected com.moon.ao a(com.google.protobuf.GeneratedMessageV3.BuilderParent p0) {
com.moon.ao local2 = new com.moon.ao(p0);
    return local2;
}


public static com.moon.M a(com.google.protobuf.ByteString p0) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.M)(((com.google.protobuf.Parser)(com.moon.M.d)).parseFrom(((com.google.protobuf.ByteString)(p0)))));
}


public static com.moon.M a(java.nio.ByteBuffer p0, com.google.protobuf.ExtensionRegistryLite p1) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.M)(((com.google.protobuf.Parser)(com.moon.M.d)).parseFrom(((java.nio.ByteBuffer)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public static com.moon.M a(java.nio.ByteBuffer p0) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.M)(((com.google.protobuf.Parser)(com.moon.M.d)).parseFrom(((java.nio.ByteBuffer)(p0)))));
}


public static final com.google.protobuf.Descriptors.Descriptor a__DescriptorsInnerDescriptor() {
return com.moon.ow.a;
}


public java.lang.String a__String() { return __sourceHandlerCall_164ecea5dc1decc988ff(this); }


public com.google.protobuf.ByteString a() { return __sourceHandlerCall_125a7b5ade658a60f97d(this); }


public static com.moon.M a(java.io.InputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.M)(com.google.protobuf.GeneratedMessageV3.parseWithIOException(((com.google.protobuf.Parser)(com.moon.M.d)), ((java.io.InputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public static com.moon.M a(java.io.InputStream p0) throws java.io.IOException {
return ((com.moon.M)(com.google.protobuf.GeneratedMessageV3.parseWithIOException(((com.google.protobuf.Parser)(com.moon.M.d)), ((java.io.InputStream)(p0)))));
}


public static com.moon.M a(byte[] p0, com.google.protobuf.ExtensionRegistryLite p1) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.M)(((com.google.protobuf.Parser)(com.moon.M.d)).parseFrom(((byte[])(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public static com.moon.M a(byte[] p0) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.M)(((com.google.protobuf.Parser)(com.moon.M.d)).parseFrom(((byte[])(p0)))));
}


public static com.moon.M a(com.google.protobuf.ByteString p0, com.google.protobuf.ExtensionRegistryLite p1) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.M)(((com.google.protobuf.Parser)(com.moon.M.d)).parseFrom(((com.google.protobuf.ByteString)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


protected java.lang.Object newInstance(com.google.protobuf.GeneratedMessageV3.UnusedPrivateParameter p0) {
return new com.moon.M();
}


public void writeTo(com.google.protobuf.CodedOutputStream p0) throws java.io.IOException { __sourceHandlerCall_09a9ce99bcef15d07d57(this, p0); }


public final boolean isInitialized() { return __sourceHandlerCall_df97585851d76bbe00d4(this); }


protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
return ((com.google.protobuf.GeneratedMessageV3.FieldAccessorTable)(com.moon.ow.b)).ensureFieldAccessorsInitialized(((java.lang.Class)(com.moon.M.class)), ((java.lang.Class)(com.moon.ao.class)));
}


public com.google.protobuf.MessageLite.Builder toBuilder__MessageLiteInnerBuilder() {
return ((com.moon.M)(this)).c();
}


public com.google.protobuf.Message.Builder toBuilder() {
return ((com.moon.M)(this)).c();
}


public com.google.protobuf.Message getDefaultInstanceForType() {
return ((com.moon.M)(this)).b();
}


public com.google.protobuf.MessageLite getDefaultInstanceForType__MessageLite() {
return ((com.moon.M)(this)).b();
}


public com.google.protobuf.Parser<com.moon.M> getParserForType() {
return com.moon.M.d;
}


public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
return this.unknownFields;
}


public int getSerializedSize() { return __sourceHandlerCall_03d943b517a962401259(this); }


protected com.google.protobuf.Message.Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent p0) {
return ((com.moon.M)(this)).a(((com.google.protobuf.GeneratedMessageV3.BuilderParent)(p0)));
}


public com.google.protobuf.Message.Builder newBuilderForType() {
return ((com.moon.M)(this)).a__ao();
}


public com.google.protobuf.MessageLite.Builder newBuilderForType__MessageLiteInnerBuilder() {
return ((com.moon.M)(this)).a__ao();
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral115_0() throws E;
}
